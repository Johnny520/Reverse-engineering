package m6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class c implements h6.o {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // h6.o
    public final h6.n a(h6.f r2, n6.a r3) {
            r1 = this;
            java.lang.Class r3 = r3.f9028a
            java.lang.Class<java.sql.Timestamp> r0 = java.sql.Timestamp.class
            if (r3 != r0) goto L1a
            r2.getClass()
            n6.a r3 = new n6.a
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            r3.<init>(r0)
            h6.n r2 = r2.b(r3)
            m6.d r3 = new m6.d
            r3.<init>(r2)
            return r3
        L1a:
            r2 = 0
            return r2
    }
}
