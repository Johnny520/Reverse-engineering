package p228;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8035 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ArrayDeque f22184 = new ArrayDeque(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f22185;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8035 m13519(Object obj) {
        C8035 c8035;
        ArrayDeque arrayDeque = f22184;
        synchronized (arrayDeque) {
            c8035 = (C8035) arrayDeque.poll();
        }
        if (c8035 == null) {
            c8035 = new C8035();
        }
        c8035.f22185 = obj;
        return c8035;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8035) && this.f22185.equals(((C8035) obj).f22185);
    }

    public final int hashCode() {
        return this.f22185.hashCode();
    }
}
