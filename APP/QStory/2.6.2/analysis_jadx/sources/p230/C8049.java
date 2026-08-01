package p230;

import java.util.ArrayDeque;
import p285.C8387;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8049 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayDeque f22223;

    public C8049(int i) {
        switch (i) {
            case 1:
                this.f22223 = new ArrayDeque(0);
                break;
            default:
                this.f22223 = new ArrayDeque();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public synchronized void m13511(C8387 c8387) {
        c8387.f23246 = null;
        c8387.f23245 = null;
        this.f22223.offer(c8387);
    }
}
