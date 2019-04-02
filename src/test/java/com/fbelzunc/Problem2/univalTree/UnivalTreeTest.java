package com.fbelzunc.Problem2.univalTree;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class UnivalTreeTest {

    @Test
    public void testNumberOfUnivalSubtree1() {
        UnivalTree univalTree = new UnivalTree();

        Node node5 = new Node('1', null, null);
        Node node6 = new Node('1', null, null);
        Node node3 = new Node('1', node5, node6);
        Node node4 = new Node('0', null, null);
        Node node2 = new Node('0', node3, node4);
        Node node1 = new Node('1', null, null);
        Node node0 = new Node('0', node1, node2);

        List<Node> nodes= new ArrayList<>(7);
        nodes.add(node0);
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);
        nodes.add(node6);

        Assert.assertEquals(5, univalTree.getNumberOfUnivalSubtrees(nodes));
    }

    @Test
    public void testNumberOfUnivalSubtree2() {
        UnivalTree univalTree = new UnivalTree();

        Node node5 = new Node('a', null, null);
        Node node4 = new Node('a', null, null);
        Node node3 = new Node('a', node4, node5);
        Node node2 = new Node('a', null, null);
        Node node1 = new Node('a', node2, node3);
        Node node0 = new Node('a', null, node1);

        List<Node> nodes= new ArrayList<>(7);
        nodes.add(node0);
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);

        Assert.assertEquals(5, univalTree.getNumberOfUnivalSubtrees(nodes));
    }
}
