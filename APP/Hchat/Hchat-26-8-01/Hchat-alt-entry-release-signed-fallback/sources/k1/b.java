package k1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1.h f7132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f1.n f7133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f7134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u2.m f7135d;

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f7134c = r0
            u2.m r0 = u2.m.f13354g
            r1.f7135d = r0
            return
    }

    public abstract void a(float r1);

    public abstract void b(f1.n r1);

    public final void c(x1.h0 r7, long r8, float r10, f1.n r11) {
            r6 = this;
            h1.b r0 = r7.f20932g
            float r1 = r6.f7134c
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 != 0) goto L9
            goto Le
        L9:
            r6.a(r10)
            r6.f7134c = r10
        Le:
            f1.n r1 = r6.f7133b
            boolean r1 = gg.l.a(r1, r11)
            if (r1 != 0) goto L1b
            r6.b(r11)
            r6.f7133b = r11
        L1b:
            u2.m r11 = r7.getLayoutDirection()
            u2.m r1 = r6.f7135d
            if (r1 == r11) goto L25
            r6.f7135d = r11
        L25:
            long r1 = r0.a()
            r11 = 32
            long r1 = r1 >> r11
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r8 >> r11
            int r11 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r11)
            float r1 = r1 - r2
            long r2 = r0.a()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r8 = r8 & r4
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            float r2 = r2 - r9
            b5.c r9 = r0.f5038h
            java.lang.Object r9 = r9.f469a
            androidx.lifecycle.x r9 = (androidx.lifecycle.x) r9
            r3 = 0
            r9.z(r3, r3, r1, r2)
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 <= 0) goto L80
            float r9 = java.lang.Float.intBitsToFloat(r11)     // Catch: java.lang.Throwable -> L73
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 <= 0) goto L80
            float r8 = java.lang.Float.intBitsToFloat(r8)     // Catch: java.lang.Throwable -> L73
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L80
            r6.e(r7)     // Catch: java.lang.Throwable -> L73
            goto L80
        L73:
            r7 = move-exception
            b5.c r8 = r0.f5038h
            java.lang.Object r8 = r8.f469a
            androidx.lifecycle.x r8 = (androidx.lifecycle.x) r8
            float r9 = -r1
            float r11 = -r2
            r8.z(r10, r10, r9, r11)
            throw r7
        L80:
            b5.c r7 = r0.f5038h
            java.lang.Object r7 = r7.f469a
            androidx.lifecycle.x r7 = (androidx.lifecycle.x) r7
            float r8 = -r1
            float r9 = -r2
            r7.z(r10, r10, r8, r9)
            return
    }

    public abstract long d();

    public abstract void e(x1.h0 r1);
}
