import javax.xml.soap.Node;

public class Main {
    public static void main(String[] args) {
        public class BinarySearchTree {
            private Node root;

            // constructors, getters and setters

            public Node deleteNode(Node root, int value) {
                // tìm kiếm nút cần xoá
                if (root == null) {
                    return root;
                }

                if (value < root.getValue()) {
                    root.setLeft(deleteNode(root.getLeft(), value));
                } else if (value > root.getValue()) {
                    root.setRight(deleteNode(root.getRight(), value));
                } else { // đã tìm thấy nút cần xoá
                    // trường hợp nút cần xoá không có nút con hoặc chỉ có một nút con
                    if (root.getLeft() == null) {
                        return root.getRight();
                    } else if (root.getRight() == null) {
                        return root.getLeft();
                    }

                    // trường hợp nút cần xoá có hai nút con
                    Node successor = findSuccessor(root.getLeft());
                    root.setValue(successor.getValue());
                    root.setLeft(deleteNode(root.getLeft(), successor.getValue()));
                }

                return root;
            }

            private Node findSuccessor(Node node) {
                // tìm nút lớn nhất trong cây con bên trái
                while (node.getRight() != null) {
                    node = node.getRight();
                }
                return node;
            }

            // định nghĩa lớp Node, các thuộc tính và phương thức của nó

        }

    }
}