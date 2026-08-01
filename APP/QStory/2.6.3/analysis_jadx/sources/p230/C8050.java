package p230;

import java.util.ArrayDeque;
import p285.C8388;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8050 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayDeque f22221;

    public C8050(int i) {
        switch (i) {
            case 1:
                this.f22221 = new ArrayDeque(0);
                break;
            default:
                this.f22221 = new ArrayDeque();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public synchronized void m13540(C8388 c8388) {
        c8388.f23245 = null;
        c8388.f23244 = null;
        this.f22221.offer(c8388);
    }
}
