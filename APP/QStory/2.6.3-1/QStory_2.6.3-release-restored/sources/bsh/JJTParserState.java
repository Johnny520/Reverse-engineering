package bsh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class JJTParserState implements Serializable {
    private boolean node_created;
    private List<InterfaceC3452> nodes = new ArrayList();
    private List<Integer> marks = new ArrayList();

    /* JADX INFO: renamed from: sp */
    private int f19sp = 0;

    /* JADX INFO: renamed from: mk */
    private int f18mk = 0;

    public void clearNodeScope(InterfaceC3452 interfaceC3452) {
        while (this.f19sp > this.f18mk) {
            popNode();
        }
        this.f18mk = this.marks.remove(r2.size() - 1).intValue();
    }

    public void closeNodeScope(InterfaceC3452 interfaceC3452, boolean z) {
        if (!z) {
            List<Integer> list = this.marks;
            this.f18mk = list.remove(list.size() - 1).intValue();
            this.node_created = false;
            return;
        }
        int iNodeArity = nodeArity();
        List<Integer> list2 = this.marks;
        this.f18mk = list2.remove(list2.size() - 1).intValue();
        while (true) {
            int i = iNodeArity - 1;
            if (iNodeArity <= 0) {
                interfaceC3452.jjtClose();
                pushNode(interfaceC3452);
                this.node_created = true;
                return;
            } else {
                InterfaceC3452 interfaceC3452PopNode = popNode();
                interfaceC3452PopNode.jjtSetParent(interfaceC3452);
                interfaceC3452.jjtAddChild(interfaceC3452PopNode, i);
                iNodeArity = i;
            }
        }
    }

    public int nodeArity() {
        return this.f19sp - this.f18mk;
    }

    public boolean nodeCreated() {
        return this.node_created;
    }

    public void openNodeScope(InterfaceC3452 interfaceC3452) {
        this.marks.add(Integer.valueOf(this.f18mk));
        this.f18mk = this.f19sp;
        interfaceC3452.jjtOpen();
    }

    public InterfaceC3452 peekNode() {
        return this.nodes.get(r1.size() - 1);
    }

    public InterfaceC3452 popNode() {
        int i = this.f19sp - 1;
        this.f19sp = i;
        if (i < this.f18mk) {
            this.f18mk = this.marks.remove(r0.size() - 1).intValue();
        }
        return this.nodes.remove(r2.size() - 1);
    }

    public void pushNode(InterfaceC3452 interfaceC3452) {
        this.nodes.add(interfaceC3452);
        this.f19sp++;
    }

    public void reset() {
        this.nodes.clear();
        this.marks.clear();
        this.f19sp = 0;
        this.f18mk = 0;
    }

    public InterfaceC3452 rootNode() {
        return this.nodes.get(0);
    }

    public void closeNodeScope(InterfaceC3452 interfaceC3452, int i) {
        List<Integer> list = this.marks;
        this.f18mk = list.remove(list.size() - 1).intValue();
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                InterfaceC3452 interfaceC3452PopNode = popNode();
                interfaceC3452PopNode.jjtSetParent(interfaceC3452);
                interfaceC3452.jjtAddChild(interfaceC3452PopNode, i2);
                i = i2;
            } else {
                interfaceC3452.jjtClose();
                pushNode(interfaceC3452);
                this.node_created = true;
                return;
            }
        }
    }
}
