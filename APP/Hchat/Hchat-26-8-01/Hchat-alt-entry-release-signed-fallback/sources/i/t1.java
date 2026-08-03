package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements i.p1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.v f5796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.w f5797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i.v f5798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f5799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f5800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i.q f5801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i.q f5802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i.q f5803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i.q f5804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float[] f5805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float[] f5806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.x f5807r;

    public t1(f.v r1, f.w r2, i.v r3) {
            r0 = this;
            r0.<init>()
            r0.f5796g = r1
            r0.f5797h = r2
            r0.f5798i = r3
            int[] r1 = i.o1.f5739a
            r0.f5799j = r1
            float[] r1 = i.o1.f5740b
            r0.f5800k = r1
            r0.f5805p = r1
            r0.f5806q = r1
            androidx.lifecycle.x r1 = i.o1.f5741c
            r0.f5807r = r1
            return
    }

    public final int c(int r6) {
            r5 = this;
            f.v r0 = r5.f5796g
            int r1 = r0.f2916b
            if (r1 <= 0) goto L28
            int r1 = r1 + (-1)
            r2 = 0
        L9:
            if (r2 > r1) goto L1d
            int r3 = r2 + r1
            int r3 = r3 >>> 1
            int[] r4 = r0.f2915a
            r4 = r4[r3]
            if (r4 >= r6) goto L18
            int r2 = r3 + 1
            goto L9
        L18:
            if (r4 <= r6) goto L20
            int r1 = r3 + (-1)
            goto L9
        L1d:
            int r2 = r2 + 1
            int r3 = -r2
        L20:
            r6 = -1
            if (r3 >= r6) goto L27
            int r3 = r3 + 2
            int r6 = -r3
            return r6
        L27:
            return r3
        L28:
            java.lang.String r6 = ""
            okio.a.i(r6)
            r6 = 0
            return r6
    }

    public final float d(int r5, int r6, boolean r7) {
            r4 = this;
            f.v r0 = r4.f5796g
            int r1 = r0.f2916b
            int r1 = r1 + (-1)
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r5 < r1) goto Le
            float r5 = (float) r6
        Lb:
            float r6 = (float) r2
            float r5 = r5 / r6
            return r5
        Le:
            int r1 = r0.c(r5)
            int r5 = r5 + 1
            int r5 = r0.c(r5)
            if (r6 != r1) goto L1c
            float r5 = (float) r1
            goto Lb
        L1c:
            int r5 = r5 - r1
            f.w r0 = r4.f5797h
            java.lang.Object r0 = r0.b(r1)
            i.s1 r0 = (i.s1) r0
            if (r0 == 0) goto L2b
            i.v r0 = r0.f5785b
            if (r0 != 0) goto L2d
        L2b:
            i.v r0 = r4.f5798i
        L2d:
            int r6 = r6 - r1
            float r6 = (float) r6
            float r5 = (float) r5
            float r6 = r6 / r5
            float r6 = r0.b(r6)
            if (r7 == 0) goto L38
            return r6
        L38:
            float r5 = r5 * r6
            float r6 = (float) r1
            float r5 = r5 + r6
            goto Lb
    }

    public final void e(i.q r11, i.q r12, i.q r13) {
            r10 = this;
            androidx.lifecycle.x r0 = r10.f5807r
            androidx.lifecycle.x r1 = i.o1.f5741c
            r2 = 0
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = r2
        La:
            i.q r1 = r10.f5801l
            f.w r3 = r10.f5797h
            f.v r4 = r10.f5796g
            if (r1 != 0) goto L4d
            i.q r1 = r11.c()
            r10.f5801l = r1
            i.q r13 = r13.c()
            r10.f5802m = r13
            int r13 = r4.f2916b
            float[] r1 = new float[r13]
            r5 = r2
        L23:
            if (r5 >= r13) goto L33
            int r6 = r4.c(r5)
            float r6 = (float) r6
            r7 = 1000(0x3e8, double:4.94E-321)
            float r7 = (float) r7
            float r6 = r6 / r7
            r1[r5] = r6
            int r5 = r5 + 1
            goto L23
        L33:
            r10.f5800k = r1
            int r13 = r4.f2916b
            int[] r1 = new int[r13]
            r5 = r2
        L3a:
            if (r5 >= r13) goto L4b
            int r6 = r4.c(r5)
            java.lang.Object r6 = r3.b(r6)
            i.s1 r6 = (i.s1) r6
            r1[r5] = r2
            int r5 = r5 + 1
            goto L3a
        L4b:
            r10.f5799j = r1
        L4d:
            if (r0 != 0) goto L50
            goto L67
        L50:
            androidx.lifecycle.x r13 = r10.f5807r
            androidx.lifecycle.x r0 = i.o1.f5741c
            if (r13 == r0) goto L68
            i.q r13 = r10.f5803n
            boolean r13 = gg.l.a(r13, r11)
            if (r13 == 0) goto L68
            i.q r13 = r10.f5804o
            boolean r13 = gg.l.a(r13, r12)
            if (r13 != 0) goto L67
            goto L68
        L67:
            return
        L68:
            r10.f5803n = r11
            r10.f5804o = r12
            int r13 = r11.b()
            int r13 = r13 % 2
            int r0 = r11.b()
            int r0 = r0 + r13
            float[] r13 = new float[r0]
            r10.f5805p = r13
            float[] r13 = new float[r0]
            r10.f5806q = r13
            int r13 = r4.f2916b
            float[][] r1 = new float[r13][]
            r5 = r2
        L84:
            if (r5 >= r13) goto Lcf
            int r6 = r4.c(r5)
            java.lang.Object r7 = r3.b(r6)
            i.s1 r7 = (i.s1) r7
            if (r6 != 0) goto La2
            if (r7 != 0) goto La2
            float[] r6 = new float[r0]
            r7 = r2
        L97:
            if (r7 >= r0) goto Lca
            float r8 = r11.a(r7)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L97
        La2:
            r8 = 300(0x12c, float:4.2E-43)
            if (r6 != r8) goto Lb6
            if (r7 != 0) goto Lb6
            float[] r6 = new float[r0]
            r7 = r2
        Lab:
            if (r7 >= r0) goto Lca
            float r8 = r12.a(r7)
            r6[r7] = r8
            int r7 = r7 + 1
            goto Lab
        Lb6:
            r7.getClass()
            i.q r6 = r7.f5784a
            float[] r7 = new float[r0]
            r8 = r2
        Lbe:
            if (r8 >= r0) goto Lc9
            float r9 = r6.a(r8)
            r7[r8] = r9
            int r8 = r8 + 1
            goto Lbe
        Lc9:
            r6 = r7
        Lca:
            r1[r5] = r6
            int r5 = r5 + 1
            goto L84
        Lcf:
            androidx.lifecycle.x r11 = new androidx.lifecycle.x
            int[] r12 = r10.f5799j
            float[] r13 = r10.f5800k
            r11.<init>(r12, r13, r1)
            r10.f5807r = r11
            return
    }

    @Override // i.n1
    public final i.q n(long r15, i.q r17, i.q r18, i.q r19) {
            r14 = this;
            r5 = r19
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r15 / r6
            int[] r2 = i.o1.f5739a
            r8 = 0
            long r2 = (long) r8
            long r0 = r0 - r2
            r2 = 300(0x12c, float:4.2E-43)
            long r2 = (long) r2
            r9 = 0
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 >= 0) goto L16
            r0 = r9
        L16:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            r11 = r2
            goto L1d
        L1c:
            r11 = r0
        L1d:
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 >= 0) goto L22
            return r5
        L22:
            r3 = r17
            r4 = r18
            r14.e(r3, r4, r5)
            i.q r9 = r14.f5802m
            r9.getClass()
            androidx.lifecycle.x r0 = r14.f5807r
            androidx.lifecycle.x r1 = i.o1.f5741c
            if (r0 == r1) goto Lac
            int r0 = (int) r11
            int r1 = r14.c(r0)
            float r0 = r14.d(r1, r0, r8)
            float[] r1 = r14.f5806q
            androidx.lifecycle.x r2 = r14.f5807r
            java.lang.Object r2 = r2.f310h
            i.r[][] r2 = (i.r[][]) r2
            r3 = r2[r8]
            r3 = r3[r8]
            float r3 = r3.f5751a
            int r4 = r2.length
            r5 = 1
            int r4 = r4 - r5
            r4 = r2[r4]
            r4 = r4[r8]
            float r4 = r4.f5752b
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 >= 0) goto L59
            r0 = r3
        L59:
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L5e
            goto L5f
        L5e:
            r4 = r0
        L5f:
            int r0 = r1.length
            int r3 = r2.length
            r6 = r8
            r7 = r6
        L63:
            if (r6 >= r3) goto La1
            r10 = r8
            r11 = r10
        L67:
            int r12 = r0 + (-1)
            if (r10 >= r12) goto L9b
            r12 = r2[r6]
            r12 = r12[r11]
            float r13 = r12.f5752b
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 > 0) goto L96
            boolean r7 = r12.f5766p
            if (r7 == 0) goto L84
            float r7 = r12.f5767q
            r1[r10] = r7
            int r7 = r10 + 1
            float r12 = r12.f5768r
            r1[r7] = r12
            goto L95
        L84:
            r12.c(r4)
            float r7 = r12.a()
            r1[r10] = r7
            int r7 = r10 + 1
            float r12 = r12.b()
            r1[r7] = r12
        L95:
            r7 = r5
        L96:
            int r10 = r10 + 2
            int r11 = r11 + 1
            goto L67
        L9b:
            if (r7 == 0) goto L9e
            goto La1
        L9e:
            int r6 = r6 + 1
            goto L63
        La1:
            int r0 = r1.length
        La2:
            if (r8 >= r0) goto Ldb
            r2 = r1[r8]
            r9.e(r8, r2)
            int r8 = r8 + 1
            goto La2
        Lac:
            r0 = 1
            long r0 = r11 - r0
            long r1 = r0 * r6
            r0 = r14
            i.q r10 = r0.w(r1, r3, r4, r5)
            long r1 = r11 * r6
            r3 = r17
            r4 = r18
            r5 = r19
            i.q r1 = r0.w(r1, r3, r4, r5)
            int r0 = r10.b()
        Lc7:
            if (r8 >= r0) goto Ldb
            float r2 = r10.a(r8)
            float r3 = r1.a(r8)
            float r2 = r2 - r3
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r3
            r9.e(r8, r2)
            int r8 = r8 + 1
            goto Lc7
        Ldb:
            return r9
    }

    @Override // i.p1
    public final int s() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // i.p1
    public final int v() {
            r1 = this;
            r0 = 300(0x12c, float:4.2E-43)
            return r0
    }

    @Override // i.n1
    public final i.q w(long r17, i.q r19, i.q r20, i.q r21) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r17 / r3
            int[] r5 = i.o1.f5739a
            r5 = 0
            long r6 = (long) r5
            long r3 = r3 - r6
            r6 = 300(0x12c, float:4.2E-43)
            long r7 = (long) r6
            r9 = 0
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 >= 0) goto L1a
            r3 = r9
        L1a:
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L1f
            goto L20
        L1f:
            r7 = r3
        L20:
            int r3 = (int) r7
            f.w r4 = r0.f5797h
            java.lang.Object r7 = r4.b(r3)
            i.s1 r7 = (i.s1) r7
            if (r7 == 0) goto L2e
            i.q r1 = r7.f5784a
            return r1
        L2e:
            if (r3 < r6) goto L31
            return r2
        L31:
            if (r3 > 0) goto L34
            return r1
        L34:
            r6 = r21
            r0.e(r1, r2, r6)
            i.q r6 = r0.f5801l
            r6.getClass()
            androidx.lifecycle.x r7 = r0.f5807r
            androidx.lifecycle.x r8 = i.o1.f5741c
            r9 = 1
            if (r7 == r8) goto L15b
            int r1 = r0.c(r3)
            float r1 = r0.d(r1, r3, r5)
            float[] r2 = r0.f5805p
            androidx.lifecycle.x r3 = r0.f5807r
            java.lang.Object r3 = r3.f310h
            i.r[][] r3 = (i.r[][]) r3
            int r4 = r3.length
            int r4 = r4 - r9
            r7 = r3[r5]
            r7 = r7[r5]
            float r7 = r7.f5751a
            r8 = r3[r4]
            r8 = r8[r5]
            float r8 = r8.f5752b
            int r10 = r2.length
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 < 0) goto L6c
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 <= 0) goto L70
        L6c:
            r18 = r9
            goto Lde
        L70:
            int r4 = r3.length
            r7 = r5
            r8 = r7
        L73:
            if (r7 >= r4) goto L14f
            r11 = r5
            r12 = r11
        L77:
            int r13 = r10 + (-1)
            if (r11 >= r13) goto Ld2
            r13 = r3[r7]
            r13 = r13[r12]
            float r14 = r13.f5752b
            int r14 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r14 > 0) goto Lc8
            boolean r8 = r13.f5766p
            if (r8 == 0) goto Laa
            float r8 = r13.f5751a
            float r14 = r1 - r8
            float r15 = r13.f5761k
            float r14 = r14 * r15
            float r5 = r13.f5753c
            r18 = r9
            float r9 = r13.f5755e
            float r9 = r9 - r5
            float r9 = r9 * r14
            float r9 = r9 + r5
            r2[r11] = r9
            int r5 = r11 + 1
            float r8 = r1 - r8
            float r8 = r8 * r15
            float r9 = r13.f5754d
            float r13 = r13.f5756f
            float r13 = r13 - r9
            float r13 = r13 * r8
            float r13 = r13 + r9
            r2[r5] = r13
            goto Lc5
        Laa:
            r18 = r9
            r13.c(r1)
            float r5 = r13.f5767q
            float r8 = r13.f5764n
            float r9 = r13.f5758h
            float r8 = r8 * r9
            float r8 = r8 + r5
            r2[r11] = r8
            int r5 = r11 + 1
            float r8 = r13.f5768r
            float r9 = r13.f5765o
            float r13 = r13.f5759i
            float r9 = r9 * r13
            float r9 = r9 + r8
            r2[r5] = r9
        Lc5:
            r8 = r18
            goto Lca
        Lc8:
            r18 = r9
        Lca:
            int r11 = r11 + 2
            int r12 = r12 + 1
            r9 = r18
            r5 = 0
            goto L77
        Ld2:
            r18 = r9
            if (r8 == 0) goto Ld8
            goto L14f
        Ld8:
            int r7 = r7 + 1
            r9 = r18
            r5 = 0
            goto L73
        Lde:
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 <= 0) goto Le4
            r7 = r8
            goto Le5
        Le4:
            r4 = 0
        Le5:
            float r1 = r1 - r7
            r5 = 0
            r8 = 0
        Le8:
            int r9 = r10 + (-1)
            if (r5 >= r9) goto L14f
            r9 = r3[r4]
            r9 = r9[r8]
            boolean r11 = r9.f5766p
            float r12 = r9.f5768r
            float r13 = r9.f5767q
            if (r11 == 0) goto L123
            float r11 = r9.f5751a
            float r14 = r7 - r11
            float r15 = r9.f5761k
            float r14 = r14 * r15
            r19 = r1
            float r1 = r9.f5753c
            r20 = r1
            float r1 = r9.f5755e
            float r1 = r1 - r20
            float r1 = r1 * r14
            float r1 = r1 + r20
            float r13 = r13 * r19
            float r13 = r13 + r1
            r2[r5] = r13
            int r1 = r5 + 1
            float r11 = r7 - r11
            float r11 = r11 * r15
            float r13 = r9.f5754d
            float r9 = r9.f5756f
            float r9 = r9 - r13
            float r9 = r9 * r11
            float r9 = r9 + r13
            float r11 = r19 * r12
            float r11 = r11 + r9
            r2[r1] = r11
            goto L148
        L123:
            r19 = r1
            r9.c(r7)
            float r1 = r9.f5764n
            float r11 = r9.f5758h
            float r1 = r1 * r11
            float r1 = r1 + r13
            float r11 = r9.a()
            float r11 = r11 * r19
            float r11 = r11 + r1
            r2[r5] = r11
            int r1 = r5 + 1
            float r11 = r9.f5765o
            float r13 = r9.f5759i
            float r11 = r11 * r13
            float r11 = r11 + r12
            float r9 = r9.b()
            float r9 = r9 * r19
            float r9 = r9 + r11
            r2[r1] = r9
        L148:
            int r5 = r5 + 2
            int r8 = r8 + 1
            r1 = r19
            goto Le8
        L14f:
            int r1 = r2.length
            r5 = 0
        L151:
            if (r5 >= r1) goto L1aa
            r3 = r2[r5]
            r6.e(r5, r3)
            int r5 = r5 + 1
            goto L151
        L15b:
            r18 = r9
            int r5 = r0.c(r3)
            r7 = r18
            float r3 = r0.d(r5, r3, r7)
            f.v r7 = r0.f5796g
            int r8 = r7.c(r5)
            java.lang.Object r8 = r4.b(r8)
            i.s1 r8 = (i.s1) r8
            if (r8 == 0) goto L17b
            i.q r8 = r8.f5784a
            if (r8 != 0) goto L17a
            goto L17b
        L17a:
            r1 = r8
        L17b:
            r8 = 1
            int r5 = r5 + r8
            int r5 = r7.c(r5)
            java.lang.Object r4 = r4.b(r5)
            i.s1 r4 = (i.s1) r4
            if (r4 == 0) goto L18f
            i.q r4 = r4.f5784a
            if (r4 != 0) goto L18e
            goto L18f
        L18e:
            r2 = r4
        L18f:
            int r4 = r6.b()
            r5 = 0
        L194:
            if (r5 >= r4) goto L1aa
            float r7 = r1.a(r5)
            float r8 = r2.a(r5)
            r9 = 1
            float r10 = (float) r9
            float r10 = r10 - r3
            float r10 = r10 * r7
            float r8 = r8 * r3
            float r8 = r8 + r10
            r6.e(r5, r8)
            int r5 = r5 + 1
            goto L194
        L1aa:
            return r6
    }
}
