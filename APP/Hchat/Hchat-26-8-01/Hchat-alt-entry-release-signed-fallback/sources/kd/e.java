package kd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mh.b f7587g = null;

    static {
            java.lang.Class<kd.e> r0 = kd.e.class
            mh.b r0 = mh.d.b(r0)
            kd.e.f7587g = r0
            return
    }

    @Override // be.a
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = "SaveDeobfMapping"
            return r0
    }

    @Override // be.a
    public final void f(ud.u r7) {
            r6 = this;
            bc.g r0 = r7.f13742a
            r0.getClass()
            int r0 = r0.U
            r1 = 2
            if (r0 != r1) goto Lb
            goto L4f
        Lb:
            bc.g r2 = r7.f13742a
            int r2 = r2.S
            if (r2 == 0) goto L55
            if (r2 == r1) goto L16
            r3 = 3
            if (r2 != r3) goto L4f
        L16:
            kd.b r3 = kd.b.a(r7)
            java.nio.file.Path r4 = r3.f7577a
            if (r2 != r1) goto L28
            r2 = 0
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r2]
            boolean r2 = java.nio.file.Files.exists(r4, r2)
            if (r2 == 0) goto L28
            goto L4f
        L28:
            java.util.HashMap r2 = r3.f7578b     // Catch: java.lang.Exception -> L43
            r2.clear()     // Catch: java.lang.Exception -> L43
            java.util.HashMap r2 = r3.f7579c     // Catch: java.lang.Exception -> L43
            r2.clear()     // Catch: java.lang.Exception -> L43
            java.util.HashMap r2 = r3.f7580d     // Catch: java.lang.Exception -> L43
            r2.clear()     // Catch: java.lang.Exception -> L43
            java.util.HashMap r2 = r3.f7581e     // Catch: java.lang.Exception -> L43
            r2.clear()     // Catch: java.lang.Exception -> L43
            r3.b(r7)     // Catch: java.lang.Exception -> L43
            r3.c()     // Catch: java.lang.Exception -> L43
            goto L4f
        L43:
            r2 = move-exception
            java.lang.String r3 = "Failed to save deobfuscation map file '{}'"
            java.nio.file.Path r4 = r4.toAbsolutePath()
            mh.b r5 = kd.e.f7587g
            r5.n(r4, r3, r2)
        L4f:
            if (r0 != r1) goto L54
            gd.c.a(r7)
        L54:
            return
        L55:
            r7 = 0
            throw r7
    }
}
