package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Td extends a.S7 implements a.D7<a.Pd<java.lang.Object>, java.util.Iterator<java.lang.Object>> {
    public static final a.Td i = null;

    static {
            a.Td r0 = new a.Td
            a.E2$a r2 = a.E2.a.f67a
            java.lang.Class<a.Pd> r3 = a.Pd.class
            java.lang.String r4 = "iterator"
            r1 = 1
            java.lang.String r5 = "iterator()Ljava/util/Iterator;"
            r0.<init>(r1, r2, r3, r4, r5)
            a.Td.i = r0
            return
    }

    @Override // a.D7
    public final java.util.Iterator<java.lang.Object> f(a.Pd<java.lang.Object> r2) {
            r1 = this;
            a.Pd r2 = (a.Pd) r2
            java.lang.String r0 = "p0"
            a.C0193i9.e(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            return r2
    }
}
