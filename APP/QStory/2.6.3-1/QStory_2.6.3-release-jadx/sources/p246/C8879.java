package p246;

import java.util.ArrayDeque;
import p301.C9217;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8879 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayDeque f22566;

    public C8879(int i) {
        switch (i) {
            case 1:
                this.f22566 = new ArrayDeque(0);
                break;
            default:
                this.f22566 = new ArrayDeque();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public synchronized void m14099(C9217 c9217) {
        c9217.f23590 = null;
        c9217.f23589 = null;
        this.f22566.offer(c9217);
    }
}
