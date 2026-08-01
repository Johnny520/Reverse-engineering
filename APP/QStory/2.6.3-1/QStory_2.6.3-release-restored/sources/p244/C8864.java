package p244;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8864 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ArrayDeque f22529 = new ArrayDeque(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f22530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8864 m14078(Object obj) {
        C8864 c8864;
        ArrayDeque arrayDeque = f22529;
        synchronized (arrayDeque) {
            c8864 = (C8864) arrayDeque.poll();
        }
        if (c8864 == null) {
            c8864 = new C8864();
        }
        c8864.f22530 = obj;
        return c8864;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8864) && this.f22530.equals(((C8864) obj).f22530);
    }

    public final int hashCode() {
        return this.f22530.hashCode();
    }
}
