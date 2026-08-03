package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f8537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f8545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m1.d f8546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8547k;

    public e(java.lang.String r12, float r13, float r14, float r15, float r16, long r17, int r19, boolean r20, int r21) {
            r11 = this;
            r0 = r21
            r1 = r0 & 1
            if (r1 == 0) goto L8
            java.lang.String r12 = ""
        L8:
            r1 = r0 & 32
            if (r1 == 0) goto Lf
            long r1 = f1.w.f3131g
            goto L11
        Lf:
            r1 = r17
        L11:
            r3 = r0 & 64
            if (r3 == 0) goto L17
            r3 = 5
            goto L19
        L17:
            r3 = r19
        L19:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L1f
            r0 = 0
            goto L21
        L1f:
            r0 = r20
        L21:
            r11.<init>()
            r11.f8537a = r12
            r11.f8538b = r13
            r11.f8539c = r14
            r11.f8540d = r15
            r12 = r16
            r11.f8541e = r12
            r11.f8542f = r1
            r11.f8543g = r3
            r11.f8544h = r0
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.f8545i = r12
            m1.d r0 = new m1.d
            r9 = 0
            r10 = 1023(0x3ff, float:1.434E-42)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f8546j = r0
            r12.add(r0)
            return
    }

    public static void a(m1.e r19, java.util.List r20, f1.t0 r21, int r22) {
            r0 = r19
            r1 = r22
            r2 = r1 & 2
            r3 = 1
            if (r2 == 0) goto Le
            int r2 = m1.h0.f8607a
            r2 = 0
            r7 = r2
            goto Lf
        Le:
            r7 = r3
        Lf:
            r2 = r1 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L15
            int r2 = m1.h0.f8607a
        L15:
            r1 = r1 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L1b
            int r1 = m1.h0.f8607a
        L1b:
            boolean r1 = r0.f8547k
            if (r1 == 0) goto L24
            java.lang.String r1 = "ImageVector.Builder is single use, create a new instance to create a new ImageVector"
            u1.a.b(r1)
        L24:
            java.util.ArrayList r0 = r0.f8545i
            int r1 = r0.size()
            int r1 = r1 - r3
            java.lang.Object r0 = r0.get(r1)
            m1.d r0 = (m1.d) r0
            java.util.ArrayList r0 = r0.f8534j
            m1.k0 r4 = new m1.k0
            java.lang.String r5 = ""
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 1082130432(0x40800000, float:4.0)
            r16 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r6 = r20
            r8 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.add(r4)
            return
    }

    public final m1.f b() {
            r17 = this;
            r0 = r17
            boolean r1 = r0.f8547k
            java.lang.String r2 = "ImageVector.Builder is single use, create a new instance to create a new ImageVector"
            if (r1 == 0) goto Lb
            u1.a.b(r2)
        Lb:
            java.util.ArrayList r1 = r0.f8545i
            int r3 = r1.size()
            r4 = 1
            if (r3 <= r4) goto L50
            boolean r3 = r0.f8547k
            if (r3 == 0) goto L1b
            u1.a.b(r2)
        L1b:
            int r3 = r1.size()
            int r3 = r3 - r4
            java.lang.Object r3 = r1.remove(r3)
            m1.d r3 = (m1.d) r3
            int r5 = r1.size()
            int r5 = r5 - r4
            java.lang.Object r1 = r1.get(r5)
            m1.d r1 = (m1.d) r1
            java.util.ArrayList r1 = r1.f8534j
            m1.g0 r4 = new m1.g0
            java.lang.String r5 = r3.f8525a
            float r6 = r3.f8526b
            float r7 = r3.f8527c
            float r8 = r3.f8528d
            float r9 = r3.f8529e
            float r10 = r3.f8530f
            float r11 = r3.f8531g
            float r12 = r3.f8532h
            java.util.List r13 = r3.f8533i
            java.util.ArrayList r14 = r3.f8534j
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.add(r4)
            goto Lb
        L50:
            m1.f r5 = new m1.f
            m1.g0 r6 = new m1.g0
            m1.d r1 = r0.f8546j
            java.lang.String r7 = r1.f8525a
            float r8 = r1.f8526b
            float r9 = r1.f8527c
            float r10 = r1.f8528d
            float r11 = r1.f8529e
            float r12 = r1.f8530f
            float r13 = r1.f8531g
            float r14 = r1.f8532h
            java.util.List r15 = r1.f8533i
            java.util.ArrayList r1 = r1.f8534j
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            int r14 = r0.f8543g
            boolean r15 = r0.f8544h
            r11 = r6
            java.lang.String r6 = r0.f8537a
            float r7 = r0.f8538b
            float r8 = r0.f8539c
            float r9 = r0.f8540d
            float r10 = r0.f8541e
            long r12 = r0.f8542f
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14, r15)
            r0.f8547k = r4
            return r5
    }
}
