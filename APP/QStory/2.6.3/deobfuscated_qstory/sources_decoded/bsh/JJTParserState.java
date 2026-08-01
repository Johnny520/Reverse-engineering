package bsh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class JJTParserState implements Serializable {
    private boolean node_created;
    private List<InterfaceC2619> nodes = new ArrayList();
    private List<Integer> marks = new ArrayList();
    private int sp = 0;
    private int mk = 0;

    public void clearNodeScope(InterfaceC2619 interfaceC2619) {
        while (this.sp > this.mk) {
            popNode();
        }
        this.mk = this.marks.remove(r2.size() - 1).intValue();
    }

    public void closeNodeScope(InterfaceC2619 interfaceC2619, boolean z) {
        if (!z) {
            List<Integer> list = this.marks;
            this.mk = list.remove(list.size() - 1).intValue();
            this.node_created = false;
            return;
        }
        int iNodeArity = nodeArity();
        List<Integer> list2 = this.marks;
        this.mk = list2.remove(list2.size() - 1).intValue();
        while (true) {
            int i = iNodeArity - 1;
            if (iNodeArity <= 0) {
                interfaceC2619.jjtClose();
                pushNode(interfaceC2619);
                this.node_created = true;
                return;
            } else {
                InterfaceC2619 interfaceC2619PopNode = popNode();
                interfaceC2619PopNode.jjtSetParent(interfaceC2619);
                interfaceC2619.jjtAddChild(interfaceC2619PopNode, i);
                iNodeArity = i;
            }
        }
    }

    public int nodeArity() {
        return this.sp - this.mk;
    }

    public boolean nodeCreated() {
        return this.node_created;
    }

    public void openNodeScope(InterfaceC2619 interfaceC2619) {
        this.marks.add(Integer.valueOf(this.mk));
        this.mk = this.sp;
        interfaceC2619.jjtOpen();
    }

    public InterfaceC2619 peekNode() {
        return this.nodes.get(r1.size() - 1);
    }

    public InterfaceC2619 popNode() {
        int i = this.sp - 1;
        this.sp = i;
        if (i < this.mk) {
            this.mk = this.marks.remove(r0.size() - 1).intValue();
        }
        return this.nodes.remove(r2.size() - 1);
    }

    public void pushNode(InterfaceC2619 interfaceC2619) {
        this.nodes.add(interfaceC2619);
        this.sp++;
    }

    public void reset() {
        this.nodes.clear();
        this.marks.clear();
        this.sp = 0;
        this.mk = 0;
    }

    public InterfaceC2619 rootNode() {
        return this.nodes.get(0);
    }

    public void closeNodeScope(InterfaceC2619 interfaceC2619, int i) {
        List<Integer> list = this.marks;
        this.mk = list.remove(list.size() - 1).intValue();
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                InterfaceC2619 interfaceC2619PopNode = popNode();
                interfaceC2619PopNode.jjtSetParent(interfaceC2619);
                interfaceC2619.jjtAddChild(interfaceC2619PopNode, i2);
                i = i2;
            } else {
                interfaceC2619.jjtClose();
                pushNode(interfaceC2619);
                this.node_created = true;
                return;
            }
        }
    }
}
