package com.fbelzunc.Problem2.univalTree;

import java.util.List;

/**
 * This problem was asked by Google.
 *
 * A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
 *
 * Given the root to a binary tree, count the number of unival subtrees.
 *
 * For example, the following tree has 5 unival subtrees:
 *                  0
 *                 / \
 *                1   0
 *                   / \
 *                  1   0
 *                 / \
 *                1   1
 */

public class UnivalTree {
    /**
     * Get number of Unival Subtrees
     * @param nodes in the unival tree
     * @return the number of unival subtrees
     */
    public int getNumberOfUnivalSubtrees(List<Node> nodes) {
        char count = 0;
        int rightValue = 0;
        int leftValue = 0;

        for (Node node: nodes) {
            Node rightNode = node.getRight();
            Node leftNode = node.getLeft();

            if (rightNode != null) {
                rightValue = rightNode.getValue();
            }

            if (leftNode != null) {
                leftValue = leftNode.getValue();
            }

            if (leftNode != null && rightNode != null) {
                if ((node.getValue() == leftValue) && (leftValue == rightValue)) {
                    count++;
                }
            }

            if (leftNode == null && rightNode == null) {
                count++;
            }
        }
        return count;
    }
}
