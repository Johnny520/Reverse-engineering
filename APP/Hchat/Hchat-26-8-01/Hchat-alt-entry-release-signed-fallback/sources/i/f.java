package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.r0 f5658a = null;

    static {
            r0 = 0
            r1 = 7
            r2 = 0
            i.r0 r0 = i.d.o(r2, r2, r0, r1)
            i.f.f5658a = r0
            java.lang.Object r0 = i.v1.f5821a
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float.floatToRawIntBits(r0)
            java.lang.Float.floatToRawIntBits(r0)
            java.lang.Float.floatToRawIntBits(r0)
            java.lang.Float.floatToRawIntBits(r0)
            return
    }

    public static final i0.l2 a(float r8, i.k r9, java.lang.String r10, i0.h0 r11, int r12, int r13) {
            r13 = r13 & 8
            if (r13 == 0) goto L6
            java.lang.String r10 = "FloatAnimation"
        L6:
            r4 = r10
            r10 = 3
            i.r0 r13 = i.f.f5658a
            r0 = 0
            if (r9 != r13) goto L38
            r9 = 1144115775(0x4431d23f, float:711.2851)
            r11.a0(r9)
            r9 = 1008981770(0x3c23d70a, float:0.01)
            boolean r13 = r11.c(r9)
            java.lang.Object r1 = r11.P()
            if (r13 != 0) goto L24
            i0.e r13 = i0.l.f5952a
            if (r1 != r13) goto L30
        L24:
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r13 = 0
            i.r0 r1 = i.d.o(r13, r13, r9, r10)
            r11.k0(r1)
        L30:
            r9 = r1
            i.r0 r9 = (i.r0) r9
            r11.p(r0)
        L36:
            r2 = r9
            goto L42
        L38:
            r13 = 1144225701(0x44337fa5, float:717.99445)
            r11.a0(r13)
            r11.p(r0)
            goto L36
        L42:
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            i.m1 r1 = i.d.f5628j
            r8 = 57344(0xe000, float:8.0356E-41)
            int r9 = r12 << 3
            r6 = r9 & r8
            r7 = 0
            r3 = 0
            r5 = r11
            i0.l2 r8 = b(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static final i0.l2 b(java.lang.Object r8, i.m1 r9, i.k r10, java.lang.Float r11, java.lang.String r12, i0.h0 r13, int r14, int r15) {
            r12 = r15 & 8
            r15 = 0
            if (r12 == 0) goto L6
            r11 = r15
        L6:
            java.lang.Object r12 = r13.P()
            i0.e r0 = i0.l.f5952a
            if (r12 != r0) goto L15
            i0.j1 r12 = i0.r.u(r15)
            r13.k0(r12)
        L15:
            i0.a1 r12 = (i0.a1) r12
            java.lang.Object r1 = r13.P()
            if (r1 != r0) goto L25
            i.c r1 = new i.c
            r1.<init>(r8, r9, r11)
            r13.k0(r1)
        L25:
            r4 = r1
            i.c r4 = (i.c) r4
            i0.a1 r6 = i0.r.y(r15, r13)
            if (r11 == 0) goto L47
            boolean r9 = r10 instanceof i.r0
            if (r9 == 0) goto L47
            r9 = r10
            i.r0 r9 = (i.r0) r9
            java.lang.Object r1 = r9.f5771c
            boolean r1 = gg.l.a(r1, r11)
            if (r1 != 0) goto L47
            float r10 = r9.f5769a
            float r9 = r9.f5770b
            i.r0 r1 = new i.r0
            r1.<init>(r10, r9, r11)
            r10 = r1
        L47:
            i0.a1 r5 = i0.r.y(r10, r13)
            java.lang.Object r9 = r13.P()
            r10 = 6
            if (r9 != r0) goto L5a
            r9 = -1
            sg.c r9 = sg.j.a(r9, r10, r15)
            r13.k0(r9)
        L5a:
            r3 = r9
            sg.g r3 = (sg.g) r3
            boolean r9 = r13.h(r3)
            r11 = r14 & 14
            r11 = r11 ^ r10
            r15 = 4
            if (r11 <= r15) goto L6d
            boolean r11 = r13.h(r8)
            if (r11 != 0) goto L70
        L6d:
            r10 = r10 & r14
            if (r10 != r15) goto L72
        L70:
            r10 = 1
            goto L73
        L72:
            r10 = 0
        L73:
            r9 = r9 | r10
            java.lang.Object r10 = r13.P()
            if (r9 != 0) goto L7c
            if (r10 != r0) goto L86
        L7c:
            aa.c r10 = new aa.c
            r9 = 15
            r10.<init>(r3, r9, r8)
            r13.k0(r10)
        L86:
            fg.a r10 = (fg.a) r10
            i0.r.j(r10, r13)
            boolean r8 = r13.h(r3)
            boolean r9 = r13.h(r4)
            r8 = r8 | r9
            boolean r9 = r13.f(r5)
            r8 = r8 | r9
            boolean r9 = r13.f(r6)
            r8 = r8 | r9
            java.lang.Object r9 = r13.P()
            if (r8 != 0) goto La6
            if (r9 != r0) goto Lb0
        La6:
            i.e r2 = new i.e
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r13.k0(r2)
            r9 = r2
        Lb0:
            fg.p r9 = (fg.p) r9
            i0.r.f(r9, r13, r3)
            java.lang.Object r8 = r12.getValue()
            i0.l2 r8 = (i0.l2) r8
            if (r8 != 0) goto Lbf
            i.l r8 = r4.f5604c
        Lbf:
            return r8
    }
}
