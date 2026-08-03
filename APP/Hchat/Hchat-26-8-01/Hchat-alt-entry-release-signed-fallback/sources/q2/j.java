package q2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q2.k f10633a = null;

    static {
            q2.k r0 = new q2.k
            r1 = 0
            r0.<init>(r1)
            q2.j.f10633a = r0
            return
    }

    public static final boolean a(i2.n0 r2) {
            i2.x r2 = r2.f6367c
            if (r2 == 0) goto L10
            i2.w r2 = r2.f6404a
            if (r2 == 0) goto L10
            int r2 = r2.f6403b
            i2.j r0 = new i2.j
            r0.<init>(r2)
            goto L11
        L10:
            r0 = 0
        L11:
            r2 = 0
            r1 = 1
            if (r0 != 0) goto L16
            goto L1b
        L16:
            int r0 = r0.f6333a
            if (r0 != r1) goto L1b
            r2 = r1
        L1b:
            r2 = r2 ^ r1
            return r2
    }

    public static final void b(i2.o r10, f1.u r11, f1.s r12, float r13, f1.q0 r14, t2.l r15, h1.c r16) {
            java.util.ArrayList r10 = r10.f6375h
            int r0 = r10.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L28
            java.lang.Object r2 = r10.get(r1)
            i2.r r2 = (i2.r) r2
            i2.a r3 = r2.f6381a
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r3.g(r4, r5, r6, r7, r8, r9)
            i2.a r2 = r2.f6381a
            float r2 = r2.b()
            r3 = 0
            r11.m(r3, r2)
            int r1 = r1 + 1
            goto L7
        L28:
            return
    }

    public static final void c(android.text.TextPaint r2, float r3) {
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L1e
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lc
            r3 = r0
        Lc:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L13
            r3 = r0
        L13:
            r0 = 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            r2.setAlpha(r3)
        L1e:
            return
    }
}
