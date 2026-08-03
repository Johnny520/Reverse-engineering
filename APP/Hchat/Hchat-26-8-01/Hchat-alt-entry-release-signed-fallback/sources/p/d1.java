package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p.e1 f9886a = null;

    static {
            p.e1 r0 = new p.e1
            p.c r1 = p.j.f9924a
            y0.f r2 = y0.b.f21801p
            r0.<init>(r1, r2)
            p.d1.f9886a = r0
            return
    }

    public static final p.e1 a(p.g r5, y0.f r6, i0.h0 r7, int r8) {
            p.c r0 = p.j.f9924a
            boolean r0 = gg.l.a(r5, r0)
            r1 = 0
            if (r0 == 0) goto L1d
            y0.f r0 = y0.b.f21801p
            boolean r0 = gg.l.a(r6, r0)
            if (r0 == 0) goto L1d
            r5 = -1073830487(0xffffffffbffea5a9, float:-1.9894305)
            r7.a0(r5)
            r7.p(r1)
            p.e1 r5 = p.d1.f9886a
            return r5
        L1d:
            r0 = -1073779616(0xffffffffbfff6c60, float:-1.9954948)
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
            p.e1 r0 = new p.e1
            r0.<init>(r5, r6)
            r7.k0(r0)
        L60:
            p.e1 r0 = (p.e1) r0
            r7.p(r1)
            return r0
    }
}
