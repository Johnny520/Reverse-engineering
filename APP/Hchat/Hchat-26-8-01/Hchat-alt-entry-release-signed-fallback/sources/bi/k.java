package bi;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0.m2 f905a = null;

    static {
            bi.c r0 = new bi.c
            r1 = 2
            r0.<init>(r1)
            i0.m2 r1 = new i0.m2
            r1.<init>(r0)
            bi.k.f905a = r1
            return
    }

    public static final f1.r0 a(i0.h0 r3) {
            i0.m2 r0 = bi.k.f905a
            java.lang.Object r0 = r3.j(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r1 = r3.g(r0)
            java.lang.Object r2 = r3.P()
            if (r1 != 0) goto L1a
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L29
        L1a:
            if (r0 == 0) goto L23
            z6.a r0 = new z6.a
            r0.<init>()
        L21:
            r2 = r0
            goto L26
        L23:
            v.d r0 = v.e.f13864a
            goto L21
        L26:
            r3.k0(r2)
        L29:
            f1.r0 r2 = (f1.r0) r2
            return r2
    }

    public static final f1.r0 b(float r3, i0.h0 r4, int r5) {
            i0.m2 r0 = bi.k.f905a
            java.lang.Object r0 = r4.j(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r5 & 14
            r1 = r1 ^ 6
            r2 = 4
            if (r1 <= r2) goto L19
            boolean r1 = r4.c(r3)
            if (r1 != 0) goto L1d
        L19:
            r5 = r5 & 6
            if (r5 != r2) goto L1f
        L1d:
            r5 = 1
            goto L20
        L1f:
            r5 = 0
        L20:
            boolean r1 = r4.g(r0)
            r5 = r5 | r1
            java.lang.Object r1 = r4.P()
            if (r5 != 0) goto L2f
            i0.e r5 = i0.l.f5952a
            if (r1 != r5) goto L40
        L2f:
            if (r0 == 0) goto L38
            z6.d r5 = new z6.d
            r5.<init>(r3)
            r1 = r5
            goto L3d
        L38:
            v.d r3 = v.e.a(r3)
            r1 = r3
        L3d:
            r4.k0(r1)
        L40:
            f1.r0 r1 = (f1.r0) r1
            return r1
    }
}
