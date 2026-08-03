package bsh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JJTParserState implements Serializable {
    private boolean node_created;
    private List<Node> nodes = new ArrayList();
    private List<Integer> marks = new ArrayList();

    /* JADX INFO: renamed from: sp */
    private int f979sp = 0;

    /* JADX INFO: renamed from: mk */
    private int f978mk = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void clearNodeScope(Node node) {
        while (this.f979sp > this.f978mk) {
            popNode();
        }
        this.f978mk = this.marks.remove(r2.size() - 1).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void closeNodeScope(Node node, boolean z9) {
        if (!z9) {
            List<Integer> list = this.marks;
            this.f978mk = list.remove(list.size() - 1).intValue();
            this.node_created = false;
            return;
        }
        int iNodeArity = nodeArity();
        List<Integer> list2 = this.marks;
        this.f978mk = list2.remove(list2.size() - 1).intValue();
        while (true) {
            int i9 = iNodeArity - 1;
            if (iNodeArity <= 0) {
                node.jjtClose();
                pushNode(node);
                this.node_created = true;
                return;
            } else {
                Node nodePopNode = popNode();
                nodePopNode.jjtSetParent(node);
                node.jjtAddChild(nodePopNode, i9);
                iNodeArity = i9;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int nodeArity() {
        return this.f979sp - this.f978mk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nodeCreated() {
        return this.node_created;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void openNodeScope(Node node) {
        this.marks.add(Integer.valueOf(this.f978mk));
        this.f978mk = this.f979sp;
        node.jjtOpen();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Node peekNode() {
        return this.nodes.get(r0.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Node popNode() {
        int i9 = this.f979sp - 1;
        this.f979sp = i9;
        if (i9 < this.f978mk) {
            this.f978mk = this.marks.remove(r0.size() - 1).intValue();
        }
        return this.nodes.remove(r0.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void pushNode(Node node) {
        this.nodes.add(node);
        this.f979sp++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void reset() {
        this.nodes.clear();
        this.marks.clear();
        this.f979sp = 0;
        this.f978mk = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Node rootNode() {
        return this.nodes.get(0);
    }

    public void closeNodeScope(Node node, int i9) {
        List<Integer> list = this.marks;
        this.f978mk = list.remove(list.size() - 1).intValue();
        while (true) {
            int i10 = i9 - 1;
            if (i9 > 0) {
                Node nodePopNode = popNode();
                nodePopNode.jjtSetParent(node);
                node.jjtAddChild(nodePopNode, i10);
                i9 = i10;
            } else {
                node.jjtClose();
                pushNode(node);
                this.node_created = true;
                return;
            }
        }
    }
}
