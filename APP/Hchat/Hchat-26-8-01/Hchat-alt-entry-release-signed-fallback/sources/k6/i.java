package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class i implements h6.o {
    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // h6.o
    public final h6.n a(h6.f r2, n6.a r3) {
            r1 = this;
            java.lang.Class r2 = r3.f9028a
            java.lang.Class<java.lang.Enum> r3 = java.lang.Enum.class
            boolean r0 = r3.isAssignableFrom(r2)
            if (r0 == 0) goto L1d
            if (r2 != r3) goto Ld
            goto L1d
        Ld:
            boolean r3 = r2.isEnum()
            if (r3 != 0) goto L17
            java.lang.Class r2 = r2.getSuperclass()
        L17:
            k6.j r3 = new k6.j
            r3.<init>(r2)
            return r3
        L1d:
            r2 = 0
            return r2
    }
}
