package p228;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ArrayDeque f22187 = new ArrayDeque(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f22188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8034 m13491(Object obj) {
        C8034 c8034;
        ArrayDeque arrayDeque = f22187;
        synchronized (arrayDeque) {
            c8034 = (C8034) arrayDeque.poll();
        }
        if (c8034 == null) {
            c8034 = new C8034();
        }
        c8034.f22188 = obj;
        return c8034;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8034) && this.f22188.equals(((C8034) obj).f22188);
    }

    public final int hashCode() {
        return this.f22188.hashCode();
    }
}
