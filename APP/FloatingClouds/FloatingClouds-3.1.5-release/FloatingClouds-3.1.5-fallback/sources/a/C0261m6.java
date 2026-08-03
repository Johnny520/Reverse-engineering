package a;

/* JADX INFO: renamed from: a.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0261m6<K, V> extends a.Gd<K, V> {
    public final java.util.HashMap<K, a.Gd.c<K, V>> e;

    public C0261m6() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            return
    }

    @Override // a.Gd
    public final a.Gd.c<K, V> a(K r2) {
            r1 = this;
            java.util.HashMap<K, a.Gd$c<K, V>> r0 = r1.e
            java.lang.Object r2 = r0.get(r2)
            a.Gd$c r2 = (a.Gd.c) r2
            return r2
    }

    @Override // a.Gd
    public final V b(K r3) {
            r2 = this;
            java.lang.Object r0 = super.b(r3)
            java.util.HashMap<K, a.Gd$c<K, V>> r1 = r2.e
            r1.remove(r3)
            return r0
    }
}
