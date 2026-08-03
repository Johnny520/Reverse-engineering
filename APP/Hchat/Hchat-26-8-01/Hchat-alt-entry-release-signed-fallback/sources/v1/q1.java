package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f.w f14021a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1.o1[] f14022b = null;

    static {
            f.w r0 = new f.w
            r1 = 8
            r0.<init>(r1)
            v1.n1 r2 = v1.o1.f14008a
            r2.getClass()
            v1.p1 r2 = v1.n1.f14004g
            r3 = 1
            r0.h(r3, r2)
            v1.p1 r4 = v1.n1.f14003f
            r5 = 2
            r0.h(r5, r4)
            v1.p1 r6 = v1.n1.f13999b
            r7 = 4
            r0.h(r7, r6)
            v1.p1 r8 = v1.n1.f14001d
            r0.h(r1, r8)
            v1.p1 r9 = v1.n1.f14005h
            r10 = 16
            r0.h(r10, r9)
            v1.p1 r10 = v1.n1.f14002e
            r11 = 32
            r0.h(r11, r10)
            v1.p1 r11 = v1.n1.f14006i
            r12 = 64
            r0.h(r12, r11)
            v1.p1 r12 = v1.n1.f14000c
            r13 = 128(0x80, float:1.8E-43)
            r0.h(r13, r12)
            v1.q1.f14021a = r0
            r0 = 9
            v1.o1[] r0 = new v1.o1[r0]
            r13 = 0
            r0[r13] = r2
            r0[r3] = r4
            r0[r5] = r6
            r2 = 3
            r0[r2] = r11
            r0[r7] = r9
            r2 = 5
            r0[r2] = r10
            r2 = 6
            r0[r2] = r8
            v1.p1 r2 = v1.n1.f14007j
            r3 = 7
            r0[r3] = r2
            r0[r1] = r12
            v1.q1.f14022b = r0
            return
    }

    public static final void a(x1.k0 r6, v1.m r7, long r8, int r10, int r11) {
            r0 = -1
            boolean r0 = v1.w.g(r8, r0)
            if (r0 != 0) goto L41
            r0 = 48
            long r0 = r8 >>> r0
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = (float) r0
            r1 = 32
            long r4 = r8 >>> r1
            long r4 = r4 & r2
            int r1 = (int) r4
            float r1 = (float) r1
            r4 = 16
            long r4 = r8 >>> r4
            long r4 = r4 & r2
            int r4 = (int) r4
            int r10 = r10 - r4
            float r10 = (float) r10
            long r8 = r8 & r2
            int r8 = (int) r8
            int r11 = r11 - r8
            float r8 = (float) r11
            v1.l r9 = r7.b()
            r6.e(r9, r0)
            v1.l r9 = r7.d()
            r6.e(r9, r1)
            v1.l r9 = r7.c()
            r6.e(r9, r10)
            v1.l r7 = r7.a()
            r6.e(r7, r8)
        L41:
            return
    }
}
