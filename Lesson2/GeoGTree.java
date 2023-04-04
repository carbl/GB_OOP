package Lesson2;
import java.util.ArrayList;

public class GeoGTree implements gTree {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {

        return tree;
    }
    public void appendPerentChild(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendVifeHusbent(Person vife, Person husbent) {
        tree.add(new Node(vife, Relationship.vife, husbent));
        tree.add(new Node(husbent, Relationship.husbent, vife));
    }
}
