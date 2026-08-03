package v0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p4.t f13886a = null;

    static {
            i2.y r0 = new i2.y
            r1 = 27
            r0.<init>(r1)
            r9.p r1 = new r9.p
            r2 = 11
            r1.<init>(r2)
            p4.t r2 = new p4.t
            r3 = 12
            r2.<init>(r0, r3, r1)
            v0.k.f13886a = r2
            return
    }

    public static final java.lang.String a(java.lang.Object r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable()."
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static final p4.t b(fg.p r2, fg.l r3) {
            sh.i0 r0 = new sh.i0
            r1 = 5
            r0.<init>(r1, r2)
            r2 = 1
            gg.x.c(r2, r3)
            p4.t r2 = new p4.t
            r1 = 12
            r2.<init>(r0, r1, r3)
            return r2
    }

    public static final java.lang.Object c(java.lang.Object[] r1, fg.a r2, i0.h0 r3, int r4) {
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            int r4 = r4 << 6
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | 384(0x180, float:5.38E-43)
            p4.t r0 = v0.k.f13886a
            java.lang.Object r1 = d(r1, r0, r2, r3, r4)
            return r1
    }

    public static final java.lang.Object d(java.lang.Object[] r11, v0.j r12, fg.a r13, i0.h0 r14, int r15) {
            long r0 = r14.T
            r2 = 36
            a.a.w(r2)
            java.lang.String r6 = java.lang.Long.toString(r0, r2)
            r6.getClass()
            r12.getClass()
            i0.m2 r0 = v0.h.f13882a
            java.lang.Object r0 = r14.j(r0)
            r5 = r0
            v0.f r5 = (v0.f) r5
            java.lang.Object r0 = r14.P()
            r1 = 0
            i0.e r2 = i0.l.f5952a
            if (r0 != r2) goto L44
            if (r5 == 0) goto L30
            java.lang.Object r0 = r5.d(r6)
            if (r0 == 0) goto L30
            java.lang.Object r0 = r12.e(r0)
            goto L31
        L30:
            r0 = r1
        L31:
            if (r0 != 0) goto L37
            java.lang.Object r0 = r13.invoke()
        L37:
            r7 = r0
            v0.b r3 = new v0.b
            r8 = r11
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r14.k0(r3)
            r0 = r3
            goto L46
        L44:
            r8 = r11
            r4 = r12
        L46:
            v0.b r0 = (v0.b) r0
            java.lang.Object[] r11 = r0.f13871k
            boolean r11 = java.util.Arrays.equals(r8, r11)
            if (r11 == 0) goto L52
            java.lang.Object r1 = r0.f13870j
        L52:
            if (r1 != 0) goto L58
            java.lang.Object r1 = r13.invoke()
        L58:
            boolean r11 = r14.h(r0)
            r12 = r15 & 112(0x70, float:1.57E-43)
            r12 = r12 ^ 48
            r13 = 32
            if (r12 <= r13) goto L6a
            boolean r12 = r14.h(r4)
            if (r12 != 0) goto L6e
        L6a:
            r12 = r15 & 48
            if (r12 != r13) goto L70
        L6e:
            r12 = 1
            goto L71
        L70:
            r12 = 0
        L71:
            r11 = r11 | r12
            boolean r12 = r14.h(r5)
            r11 = r11 | r12
            boolean r12 = r14.f(r6)
            r11 = r11 | r12
            boolean r12 = r14.h(r1)
            r11 = r11 | r12
            boolean r12 = r14.h(r8)
            r11 = r11 | r12
            java.lang.Object r12 = r14.P()
            if (r11 != 0) goto L91
            if (r12 != r2) goto L8f
            goto L91
        L8f:
            r8 = r1
            goto La1
        L91:
            c9.p0 r3 = new c9.p0
            r10 = 2
            r7 = r6
            r9 = r8
            r8 = r1
            r6 = r5
            r5 = r4
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r14.k0(r3)
            r12 = r3
        La1:
            fg.a r12 = (fg.a) r12
            i0.r.j(r12, r14)
            return r8
    }

    public static final java.lang.Object e(java.lang.Object[] r1, v0.j r2, fg.a r3, i0.h0 r4, int r5) {
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            int r5 = r5 << 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r0 = 384(0x180, float:5.38E-43)
            r5 = r5 | r0
            java.lang.Object r1 = d(r1, r2, r3, r4, r5)
            return r1
    }
}
