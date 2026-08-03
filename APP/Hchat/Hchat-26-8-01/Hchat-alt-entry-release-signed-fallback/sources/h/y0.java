package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.r0 f4782a = null;

    static {
            r0 = 0
            r1 = 7
            r2 = 0
            i.r0 r0 = i.d.o(r2, r2, r0, r1)
            h.y0.f4782a = r0
            return
    }

    public static final i0.l2 a(long r8, i.y r10, i0.h0 r11, int r12, int r13) {
            r0 = r13 & 2
            if (r0 == 0) goto L6
            i.r0 r10 = h.y0.f4782a
        L6:
            r2 = r10
            r10 = r13 & 4
            if (r10 == 0) goto Lf
            java.lang.String r10 = "ColorAnimation"
        Ld:
            r4 = r10
            goto L12
        Lf:
            java.lang.String r10 = "PressFeedback"
            goto Ld
        L12:
            g1.c r10 = f1.w.f(r8)
            boolean r10 = r11.f(r10)
            java.lang.Object r13 = r11.P()
            if (r10 != 0) goto L24
            i0.e r10 = i0.l.f5952a
            if (r13 != r10) goto L3a
        L24:
            g1.c r10 = f1.w.f(r8)
            h.c r13 = h.c.f4622j
            b1.f r0 = new b1.f
            r1 = 12
            r0.<init>(r10, r1)
            i.m1 r10 = new i.m1
            r10.<init>(r13, r0)
            r11.k0(r10)
            r13 = r10
        L3a:
            r1 = r13
            i.m1 r1 = (i.m1) r1
            f1.w r0 = new f1.w
            r0.<init>(r8)
            r8 = r12 & 14
            int r9 = r12 << 3
            r9 = r9 & 896(0x380, float:1.256E-42)
            r8 = r8 | r9
            int r9 = r12 << 6
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r9
            r8 = r8 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r10
            r6 = r8 | r9
            r7 = 8
            r3 = 0
            r5 = r11
            i0.l2 r8 = i.f.b(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}
