package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p.t f9983a = null;

    static {
            p.t r0 = new p.t
            p.e r1 = p.j.f9926c
            y0.e r2 = y0.b.f21804s
            r0.<init>(r1, r2)
            p.s.f9983a = r0
            return
    }

    public static final p.t a(p.i r5, y0.e r6, i0.h0 r7, int r8) {
            p.e r0 = p.j.f9926c
            boolean r0 = gg.l.a(r5, r0)
            r1 = 0
            if (r0 == 0) goto L1d
            y0.e r0 = y0.b.f21804s
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1d
            r5 = -1446604504(0xffffffffa9c69128, float:-8.818147E-14)
            r7.a0(r5)
            r7.p(r1)
            p.t r5 = p.s.f9983a
            return r5
        L1d:
            r0 = -1446550657(0xffffffffa9c7637f, float:-8.854635E-14)
            r7.a0(r0)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r2 = 1
            r3 = 4
            if (r0 <= r3) goto L31
            boolean r0 = r7.f(r5)
            if (r0 != 0) goto L35
        L31:
            r0 = r8 & 6
            if (r0 != r3) goto L37
        L35:
            r0 = r2
            goto L38
        L37:
            r0 = r1
        L38:
            r3 = r8 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L46
            boolean r3 = r7.f(r6)
            if (r3 != 0) goto L4c
        L46:
            r8 = r8 & 48
            if (r8 != r4) goto L4b
            goto L4c
        L4b:
            r2 = r1
        L4c:
            r8 = r0 | r2
            java.lang.Object r0 = r7.P()
            if (r8 != 0) goto L58
            i0.e r8 = i0.l.f5952a
            if (r0 != r8) goto L60
        L58:
            p.t r0 = new p.t
            r0.<init>(r5, r6)
            r7.k0(r0)
        L60:
            p.t r0 = (p.t) r0
            r7.p(r1)
            return r0
    }
}
