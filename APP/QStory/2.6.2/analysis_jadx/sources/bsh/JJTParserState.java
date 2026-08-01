package bsh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class JJTParserState implements Serializable {
    private boolean node_created;
    private List<InterfaceC2618> nodes = new ArrayList();
    private List<Integer> marks = new ArrayList();
    private int sp = 0;
    private int mk = 0;

    public void clearNodeScope(InterfaceC2618 interfaceC2618) {
        while (this.sp > this.mk) {
            popNode();
        }
        this.mk = this.marks.remove(r2.size() - 1).intValue();
    }

    public void closeNodeScope(InterfaceC2618 interfaceC2618, boolean z) {
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
                interfaceC2618.jjtClose();
                pushNode(interfaceC2618);
                this.node_created = true;
                return;
            } else {
                InterfaceC2618 interfaceC2618PopNode = popNode();
                interfaceC2618PopNode.jjtSetParent(interfaceC2618);
                interfaceC2618.jjtAddChild(interfaceC2618PopNode, i);
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

    public void openNodeScope(InterfaceC2618 interfaceC2618) {
        this.marks.add(Integer.valueOf(this.mk));
        this.mk = this.sp;
        interfaceC2618.jjtOpen();
    }

    public InterfaceC2618 peekNode() {
        return this.nodes.get(r1.size() - 1);
    }

    public InterfaceC2618 popNode() {
        int i = this.sp - 1;
        this.sp = i;
        if (i < this.mk) {
            this.mk = this.marks.remove(r0.size() - 1).intValue();
        }
        return this.nodes.remove(r2.size() - 1);
    }

    public void pushNode(InterfaceC2618 interfaceC2618) {
        this.nodes.add(interfaceC2618);
        this.sp++;
    }

    public void reset() {
        this.nodes.clear();
        this.marks.clear();
        this.sp = 0;
        this.mk = 0;
    }

    public InterfaceC2618 rootNode() {
        return this.nodes.get(0);
    }

    public void closeNodeScope(InterfaceC2618 interfaceC2618, int i) {
        List<Integer> list = this.marks;
        this.mk = list.remove(list.size() - 1).intValue();
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                InterfaceC2618 interfaceC2618PopNode = popNode();
                interfaceC2618PopNode.jjtSetParent(interfaceC2618);
                interfaceC2618.jjtAddChild(interfaceC2618PopNode, i2);
                i = i2;
            } else {
                interfaceC2618.jjtClose();
                pushNode(interfaceC2618);
                this.node_created = true;
                return;
            }
        }
    }
}
