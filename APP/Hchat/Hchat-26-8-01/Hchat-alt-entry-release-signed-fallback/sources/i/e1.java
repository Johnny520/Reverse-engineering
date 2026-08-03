package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface e1 {
    default boolean a(h.f0 r2, h.f0 r3) {
            r1 = this;
            java.lang.Object r0 = r1.b()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L16
            java.lang.Object r2 = r1.c()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    java.lang.Object b();

    java.lang.Object c();
}
