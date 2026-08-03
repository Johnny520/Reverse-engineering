package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mh.b f732a = null;

    static {
            java.lang.Class<bc.h> r0 = bc.h.class
            mh.b r0 = mh.d.b(r0)
            bc.h.f732a = r0
            return
    }

    public static void a(java.io.File r2, java.lang.String r3) {
            if (r2 == 0) goto L1f
            boolean r0 = r2.exists()
            if (r0 == 0) goto L1f
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto Lf
            goto L1f
        Lf:
            af.d r0 = new af.d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = " directory exists as file "
            java.lang.String r2 = wb.en.h(r3, r1, r2)
            r0.<init>(r2)
            throw r0
        L1f:
            return
    }
}
