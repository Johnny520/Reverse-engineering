package a;

/* JADX INFO: loaded from: classes.dex */
public final class H6 extends a.Yg {
    public float A0;
    public float B0;
    public float C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public final java.util.ArrayList<a.H6.a> K0;
    public a.N3[] L0;
    public a.N3[] M0;
    public int[] N0;
    public a.N3[] O0;
    public int P0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public float x0;
    public float y0;
    public float z0;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112a;
        public a.N3 b;
        public int c;
        public a.M3 d;
        public a.M3 e;
        public a.M3 f;
        public a.M3 g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public final /* synthetic */ a.H6 r;

        public a(a.H6 r2, int r3, a.M3 r4, a.M3 r5, a.M3 r6, a.M3 r7, int r8) {
                r1 = this;
                r1.<init>()
                r1.r = r2
                r0 = 0
                r1.b = r0
                r0 = 0
                r1.c = r0
                r1.h = r0
                r1.i = r0
                r1.j = r0
                r1.k = r0
                r1.l = r0
                r1.m = r0
                r1.n = r0
                r1.o = r0
                r1.p = r0
                r1.q = r0
                r1.f112a = r3
                r1.d = r4
                r1.e = r5
                r1.f = r6
                r1.g = r7
                int r3 = r2.k0
                r1.h = r3
                int r3 = r2.g0
                r1.i = r3
                int r3 = r2.l0
                r1.j = r3
                int r2 = r2.h0
                r1.k = r2
                r1.q = r8
                return
        }

        public final void a(a.N3 r9) {
                r8 = this;
                int r0 = r8.f112a
                r1 = 8
                a.N3$a r2 = a.N3.a.c
                r3 = 1
                r4 = 0
                a.H6 r5 = r8.r
                if (r0 != 0) goto L41
                int r0 = r8.q
                int r0 = r5.F(r9, r0)
                a.N3$a[] r6 = r9.J
                r6 = r6[r4]
                if (r6 != r2) goto L1e
                int r0 = r8.p
                int r0 = r0 + r3
                r8.p = r0
                r0 = r4
            L1e:
                int r2 = r5.D0
                int r6 = r9.X
                if (r6 != r1) goto L25
                goto L26
            L25:
                r4 = r2
            L26:
                int r1 = r8.l
                int r0 = r0 + r4
                int r0 = r0 + r1
                r8.l = r0
                int r0 = r8.q
                int r0 = r5.E(r9, r0)
                a.N3 r1 = r8.b
                if (r1 == 0) goto L3a
                int r1 = r8.c
                if (r1 >= r0) goto L75
            L3a:
                r8.b = r9
                r8.c = r0
                r8.m = r0
                goto L75
            L41:
                int r0 = r8.q
                int r0 = r5.F(r9, r0)
                int r6 = r8.q
                int r6 = r5.E(r9, r6)
                a.N3$a[] r7 = r9.J
                r7 = r7[r3]
                if (r7 != r2) goto L59
                int r2 = r8.p
                int r2 = r2 + r3
                r8.p = r2
                r6 = r4
            L59:
                int r2 = r5.E0
                int r5 = r9.X
                if (r5 != r1) goto L60
                goto L61
            L60:
                r4 = r2
            L61:
                int r1 = r8.m
                int r6 = r6 + r4
                int r6 = r6 + r1
                r8.m = r6
                a.N3 r1 = r8.b
                if (r1 == 0) goto L6f
                int r1 = r8.c
                if (r1 >= r0) goto L75
            L6f:
                r8.b = r9
                r8.c = r0
                r8.l = r0
            L75:
                int r9 = r8.o
                int r9 = r9 + r3
                r8.o = r9
                return
        }

        public final void b(int r19, boolean r20, boolean r21) {
                r18 = this;
                r0 = r18
                int r1 = r0.o
                r2 = 0
                r3 = r2
            L6:
                a.H6 r4 = r0.r
                if (r3 >= r1) goto L1e
                int r5 = r0.n
                int r5 = r5 + r3
                int r6 = r4.P0
                if (r5 < r6) goto L12
                goto L1e
            L12:
                a.N3[] r4 = r4.O0
                r4 = r4[r5]
                if (r4 == 0) goto L1b
                r4.t()
            L1b:
                int r3 = r3 + 1
                goto L6
            L1e:
                if (r1 == 0) goto L2af
                a.N3 r3 = r0.b
                if (r3 != 0) goto L26
                goto L2af
            L26:
                if (r21 == 0) goto L2c
                if (r19 != 0) goto L2c
                r5 = 1
                goto L2d
            L2c:
                r5 = r2
            L2d:
                r6 = -1
                r7 = r2
                r8 = r6
                r9 = r8
            L31:
                if (r7 >= r1) goto L51
                if (r20 == 0) goto L39
                int r10 = r1 + (-1)
                int r10 = r10 - r7
                goto L3a
            L39:
                r10 = r7
            L3a:
                int r11 = r0.n
                int r11 = r11 + r10
                int r10 = r4.P0
                if (r11 < r10) goto L42
                goto L51
            L42:
                a.N3[] r10 = r4.O0
                r10 = r10[r11]
                int r10 = r10.X
                if (r10 != 0) goto L4e
                if (r8 != r6) goto L4d
                r8 = r7
            L4d:
                r9 = r7
            L4e:
                int r7 = r7 + 1
                goto L31
            L51:
                int r7 = r0.f112a
                if (r7 != 0) goto L187
                a.N3 r7 = r0.b
                int r11 = r4.s0
                r7.a0 = r11
                int r11 = r0.i
                if (r19 <= 0) goto L62
                int r12 = r4.E0
                int r11 = r11 + r12
            L62:
                a.M3 r12 = r0.e
                a.M3 r13 = r7.z
                r13.a(r12, r11)
                a.M3 r11 = r7.B
                if (r21 == 0) goto L74
                a.M3 r12 = r0.g
                int r14 = r0.k
                r11.a(r12, r14)
            L74:
                if (r19 <= 0) goto L7f
                a.M3 r12 = r0.e
                a.N3 r12 = r12.b
                a.M3 r12 = r12.B
                r12.a(r13, r2)
            L7f:
                int r12 = r4.G0
                r14 = 3
                if (r12 != r14) goto La6
                boolean r12 = r7.w
                if (r12 != 0) goto La6
                r12 = r2
            L89:
                if (r12 >= r1) goto La6
                if (r20 == 0) goto L91
                int r15 = r1 + (-1)
                int r15 = r15 - r12
                goto L92
            L91:
                r15 = r12
            L92:
                int r10 = r0.n
                int r10 = r10 + r15
                int r15 = r4.P0
                if (r10 < r15) goto L9a
                goto La6
            L9a:
                a.N3[] r15 = r4.O0
                r10 = r15[r10]
                boolean r15 = r10.w
                if (r15 == 0) goto La3
                goto La7
            La3:
                int r12 = r12 + 1
                goto L89
            La6:
                r10 = r7
            La7:
                r15 = r2
                r12 = 0
            La9:
                if (r15 >= r1) goto L2af
                if (r20 == 0) goto Lb4
                int r16 = r1 + (-1)
                int r16 = r16 - r15
            Lb1:
                r17 = 1
                goto Lb7
            Lb4:
                r16 = r15
                goto Lb1
            Lb7:
                int r3 = r0.n
                int r3 = r3 + r16
                int r14 = r4.P0
                if (r3 < r14) goto Lc1
                goto L2af
            Lc1:
                a.N3[] r14 = r4.O0
                r3 = r14[r3]
                if (r15 != 0) goto Ld0
                a.M3 r14 = r3.y
                a.M3 r2 = r0.d
                int r6 = r0.h
                r3.e(r14, r2, r6)
            Ld0:
                if (r16 != 0) goto Lf7
                int r2 = r4.r0
                float r6 = r4.x0
                int r14 = r0.n
                if (r14 != 0) goto Le5
                int r14 = r4.t0
                r16 = r2
                r2 = -1
                if (r14 == r2) goto Le8
                float r6 = r4.z0
            Le3:
                r2 = r14
                goto Lf3
            Le5:
                r16 = r2
                r2 = -1
            Le8:
                if (r21 == 0) goto Lf1
                int r14 = r4.v0
                if (r14 == r2) goto Lf1
                float r6 = r4.B0
                goto Le3
            Lf1:
                r2 = r16
            Lf3:
                r3.Z = r2
                r3.U = r6
            Lf7:
                int r2 = r1 + (-1)
                if (r15 != r2) goto L104
                a.M3 r2 = r3.A
                a.M3 r6 = r0.f
                int r14 = r0.j
                r3.e(r2, r6, r14)
            L104:
                if (r12 == 0) goto L12f
                a.M3 r2 = r3.y
                int r6 = r4.D0
                a.M3 r12 = r12.A
                r2.a(r12, r6)
                a.M3 r2 = r3.y
                if (r15 != r8) goto L11d
                int r6 = r0.h
                boolean r14 = r2.f()
                if (r14 == 0) goto L11d
                r2.f = r6
            L11d:
                r6 = 0
                r12.a(r2, r6)
                int r2 = r9 + 1
                if (r15 != r2) goto L12f
                int r2 = r0.j
                boolean r6 = r12.f()
                if (r6 == 0) goto L12f
                r12.f = r2
            L12f:
                if (r3 == r7) goto L17e
                int r2 = r4.G0
                r6 = 3
                if (r2 != r6) goto L149
                boolean r12 = r10.w
                if (r12 == 0) goto L149
                if (r3 == r10) goto L149
                boolean r12 = r3.w
                if (r12 == 0) goto L149
                a.M3 r2 = r3.C
                a.M3 r12 = r10.C
                r14 = 0
                r2.a(r12, r14)
                goto L17f
            L149:
                if (r2 == 0) goto L177
                r12 = r17
                if (r2 == r12) goto L170
                if (r5 == 0) goto L164
                a.M3 r2 = r3.z
                a.M3 r12 = r0.e
                int r14 = r0.i
                r2.a(r12, r14)
                a.M3 r2 = r0.g
                int r12 = r0.k
                a.M3 r14 = r3.B
                r14.a(r2, r12)
                goto L17f
            L164:
                a.M3 r2 = r3.z
                r14 = 0
                r2.a(r13, r14)
                a.M3 r2 = r3.B
                r2.a(r11, r14)
                goto L17f
            L170:
                r14 = 0
                a.M3 r2 = r3.B
                r2.a(r11, r14)
                goto L17f
            L177:
                r14 = 0
                a.M3 r2 = r3.z
                r2.a(r13, r14)
                goto L17f
            L17e:
                r6 = 3
            L17f:
                int r15 = r15 + 1
                r12 = r3
                r14 = r6
                r2 = 0
                r6 = -1
                goto La9
            L187:
                a.N3 r2 = r0.b
                int r3 = r4.r0
                r2.Z = r3
                int r3 = r0.h
                if (r19 <= 0) goto L194
                int r6 = r4.D0
                int r3 = r3 + r6
            L194:
                a.M3 r6 = r2.y
                a.M3 r7 = r2.A
                if (r20 == 0) goto L1b5
                a.M3 r10 = r0.f
                r7.a(r10, r3)
                if (r21 == 0) goto L1a8
                a.M3 r3 = r0.d
                int r10 = r0.j
                r6.a(r3, r10)
            L1a8:
                if (r19 <= 0) goto L1cf
                a.M3 r3 = r0.f
                a.N3 r3 = r3.b
                a.M3 r3 = r3.y
                r14 = 0
                r3.a(r7, r14)
                goto L1cf
            L1b5:
                a.M3 r10 = r0.d
                r6.a(r10, r3)
                if (r21 == 0) goto L1c3
                a.M3 r3 = r0.f
                int r10 = r0.j
                r7.a(r3, r10)
            L1c3:
                if (r19 <= 0) goto L1cf
                a.M3 r3 = r0.d
                a.N3 r3 = r3.b
                a.M3 r3 = r3.A
                r14 = 0
                r3.a(r6, r14)
            L1cf:
                r3 = 0
                r10 = 0
            L1d1:
                if (r3 >= r1) goto L2af
                int r11 = r0.n
                int r11 = r11 + r3
                int r12 = r4.P0
                if (r11 < r12) goto L1dc
                goto L2af
            L1dc:
                a.N3[] r12 = r4.O0
                r11 = r12[r11]
                if (r3 != 0) goto L20b
                a.M3 r12 = r11.z
                a.M3 r13 = r0.e
                int r14 = r0.i
                r11.e(r12, r13, r14)
                int r12 = r4.s0
                float r13 = r4.y0
                int r14 = r0.n
                if (r14 != 0) goto L1fc
                int r14 = r4.u0
                r15 = -1
                if (r14 == r15) goto L1fd
                float r13 = r4.A0
            L1fa:
                r12 = r14
                goto L206
            L1fc:
                r15 = -1
            L1fd:
                if (r21 == 0) goto L206
                int r14 = r4.w0
                if (r14 == r15) goto L206
                float r13 = r4.C0
                goto L1fa
            L206:
                r11.a0 = r12
                r11.V = r13
                goto L20c
            L20b:
                r15 = -1
            L20c:
                int r12 = r1 + (-1)
                if (r3 != r12) goto L219
                a.M3 r12 = r11.B
                a.M3 r13 = r0.g
                int r14 = r0.k
                r11.e(r12, r13, r14)
            L219:
                if (r10 == 0) goto L246
                a.M3 r12 = r11.z
                int r13 = r4.E0
                a.M3 r10 = r10.B
                r12.a(r10, r13)
                a.M3 r12 = r11.z
                if (r3 != r8) goto L232
                int r13 = r0.i
                boolean r14 = r12.f()
                if (r14 == 0) goto L232
                r12.f = r13
            L232:
                r14 = 0
                r10.a(r12, r14)
                r17 = 1
                int r12 = r9 + 1
                if (r3 != r12) goto L246
                int r12 = r0.k
                boolean r13 = r10.f()
                if (r13 == 0) goto L246
                r10.f = r12
            L246:
                if (r11 == r2) goto L26e
                r10 = 2
                if (r20 == 0) goto L271
                int r12 = r4.F0
                if (r12 == 0) goto L268
                r13 = 1
                if (r12 == r13) goto L261
                if (r12 == r10) goto L255
                goto L26e
            L255:
                a.M3 r10 = r11.y
                r14 = 0
                r10.a(r6, r14)
                a.M3 r10 = r11.A
                r10.a(r7, r14)
                goto L26e
            L261:
                r14 = 0
                a.M3 r10 = r11.y
                r10.a(r6, r14)
                goto L26e
            L268:
                r14 = 0
                a.M3 r10 = r11.A
                r10.a(r7, r14)
            L26e:
                r13 = 1
            L26f:
                r14 = 0
                goto L2aa
            L271:
                int r12 = r4.F0
                if (r12 == 0) goto L2a3
                r13 = 1
                if (r12 == r13) goto L29c
                if (r12 == r10) goto L27b
                goto L26f
            L27b:
                if (r5 == 0) goto L290
                a.M3 r10 = r11.y
                a.M3 r12 = r0.d
                int r14 = r0.h
                r10.a(r12, r14)
                a.M3 r10 = r0.f
                int r12 = r0.j
                a.M3 r14 = r11.A
                r14.a(r10, r12)
                goto L26f
            L290:
                a.M3 r10 = r11.y
                r14 = 0
                r10.a(r6, r14)
                a.M3 r10 = r11.A
                r10.a(r7, r14)
                goto L2aa
            L29c:
                r14 = 0
                a.M3 r10 = r11.A
                r10.a(r7, r14)
                goto L2aa
            L2a3:
                r13 = 1
                r14 = 0
                a.M3 r10 = r11.y
                r10.a(r6, r14)
            L2aa:
                int r3 = r3 + 1
                r10 = r11
                goto L1d1
            L2af:
                return
        }

        public final int c() {
                r2 = this;
                int r0 = r2.f112a
                r1 = 1
                if (r0 != r1) goto Ld
                int r0 = r2.m
                a.H6 r1 = r2.r
                int r1 = r1.E0
                int r0 = r0 - r1
                return r0
            Ld:
                int r0 = r2.m
                return r0
        }

        public final int d() {
                r2 = this;
                int r0 = r2.f112a
                if (r0 != 0) goto Lc
                int r0 = r2.l
                a.H6 r1 = r2.r
                int r1 = r1.D0
                int r0 = r0 - r1
                return r0
            Lc:
                int r0 = r2.l
                return r0
        }

        public final void e(int r12) {
                r11 = this;
                int r0 = r11.p
                if (r0 != 0) goto L6
                goto Ld1
            L6:
                int r1 = r11.o
                int r5 = r12 / r0
                r12 = 0
                r0 = r12
            Lc:
                if (r0 >= r1) goto L5f
                int r2 = r11.n
                int r3 = r2 + r0
                r4 = r2
                a.H6 r2 = r11.r
                int r6 = r2.P0
                if (r3 < r6) goto L1a
                goto L5f
            L1a:
                a.N3[] r3 = r2.O0
                int r4 = r4 + r0
                r3 = r3[r4]
                int r4 = r11.f112a
                a.N3$a r6 = a.N3.a.f181a
                a.N3$a r7 = a.N3.a.c
                r8 = 1
                if (r4 != 0) goto L41
                if (r3 == 0) goto L5c
                a.N3$a[] r4 = r3.J
                r9 = r4[r12]
                if (r9 != r7) goto L5c
                int r7 = r3.j
                if (r7 != 0) goto L5c
                r4 = r4[r8]
                int r7 = r3.i()
                r10 = r6
                r6 = r4
                r4 = r10
                r2.D(r3, r4, r5, r6, r7)
                goto L5c
            L41:
                r4 = r6
                if (r3 == 0) goto L5c
                a.N3$a[] r6 = r3.J
                r8 = r6[r8]
                if (r8 != r7) goto L5c
                int r7 = r3.k
                if (r7 != 0) goto L5c
                r6 = r6[r12]
                r7 = r5
                int r5 = r3.l()
                r10 = r6
                r6 = r4
                r4 = r10
                r2.D(r3, r4, r5, r6, r7)
                r5 = r7
            L5c:
                int r0 = r0 + 1
                goto Lc
            L5f:
                r11.l = r12
                r11.m = r12
                r0 = 0
                r11.b = r0
                r11.c = r12
                int r0 = r11.o
                r1 = r12
            L6b:
                if (r1 >= r0) goto Ld1
                int r2 = r11.n
                int r2 = r2 + r1
                a.H6 r3 = r11.r
                int r4 = r3.P0
                if (r2 < r4) goto L77
                goto Ld1
            L77:
                a.N3[] r4 = r3.O0
                r2 = r4[r2]
                int r4 = r11.f112a
                r5 = 8
                if (r4 != 0) goto La7
                int r4 = r2.l()
                int r6 = r3.D0
                int r7 = r2.X
                if (r7 != r5) goto L8c
                r6 = r12
            L8c:
                int r5 = r11.l
                int r4 = r4 + r6
                int r4 = r4 + r5
                r11.l = r4
                int r4 = r11.q
                int r3 = r3.E(r2, r4)
                a.N3 r4 = r11.b
                if (r4 == 0) goto La0
                int r4 = r11.c
                if (r4 >= r3) goto Lce
            La0:
                r11.b = r2
                r11.c = r3
                r11.m = r3
                goto Lce
            La7:
                int r4 = r11.q
                int r4 = r3.F(r2, r4)
                int r6 = r11.q
                int r6 = r3.E(r2, r6)
                int r3 = r3.E0
                int r7 = r2.X
                if (r7 != r5) goto Lba
                r3 = r12
            Lba:
                int r5 = r11.m
                int r6 = r6 + r3
                int r6 = r6 + r5
                r11.m = r6
                a.N3 r3 = r11.b
                if (r3 == 0) goto Lc8
                int r3 = r11.c
                if (r3 >= r4) goto Lce
            Lc8:
                r11.b = r2
                r11.c = r4
                r11.l = r4
            Lce:
                int r1 = r1 + 1
                goto L6b
            Ld1:
                return
        }

        public final void f(int r1, a.M3 r2, a.M3 r3, a.M3 r4, a.M3 r5, int r6, int r7, int r8, int r9, int r10) {
                r0 = this;
                r0.f112a = r1
                r0.d = r2
                r0.e = r3
                r0.f = r4
                r0.g = r5
                r0.h = r6
                r0.i = r7
                r0.j = r8
                r0.k = r9
                r0.q = r10
                return
        }
    }

    public H6() {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.r0 = r0
            r3.s0 = r0
            r3.t0 = r0
            r3.u0 = r0
            r3.v0 = r0
            r3.w0 = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r3.x0 = r1
            r3.y0 = r1
            r3.z0 = r1
            r3.A0 = r1
            r3.B0 = r1
            r3.C0 = r1
            r1 = 0
            r3.D0 = r1
            r3.E0 = r1
            r2 = 2
            r3.F0 = r2
            r3.G0 = r2
            r3.H0 = r1
            r3.I0 = r0
            r3.J0 = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.K0 = r0
            r0 = 0
            r3.L0 = r0
            r3.M0 = r0
            r3.N0 = r0
            r3.P0 = r1
            return
    }

    @Override // a.Yg
    public final void C(int r37, int r38, int r39, int r40) {
            r36 = this;
            r1 = r36
            r8 = r37
            r9 = r38
            int r0 = r1.f0
            a.N3$a r12 = a.N3.a.b
            a.N3$a r13 = a.N3.a.c
            r14 = 0
            r15 = 1
            if (r0 <= 0) goto L7f
            a.N3 r0 = r1.K
            if (r0 == 0) goto L19
            a.O3 r0 = (a.O3) r0
            a.e2$b r0 = r0.h0
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 != 0) goto L23
            r1.n0 = r14
            r1.o0 = r14
            r1.m0 = r14
            return
        L23:
            r3 = r14
        L24:
            int r4 = r1.f0
            if (r3 >= r4) goto L7f
            a.N3[] r4 = r1.e0
            r4 = r4[r3]
            if (r4 != 0) goto L2f
            goto L7c
        L2f:
            boolean r5 = r4 instanceof a.C0046a8
            if (r5 == 0) goto L34
            goto L7c
        L34:
            a.N3$a r5 = r4.h(r14)
            a.N3$a r6 = r4.h(r15)
            if (r5 != r13) goto L49
            int r7 = r4.j
            if (r7 == r15) goto L49
            if (r6 != r13) goto L49
            int r7 = r4.k
            if (r7 == r15) goto L49
            goto L7c
        L49:
            if (r5 != r13) goto L4c
            r5 = r12
        L4c:
            if (r6 != r13) goto L4f
            r6 = r12
        L4f:
            a.e2$a r7 = r1.p0
            r7.f448a = r5
            r7.b = r6
            int r5 = r4.l()
            r7.c = r5
            int r5 = r4.i()
            r7.d = r5
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = (androidx.constraintlayout.widget.ConstraintLayout.b) r5
            r5.a(r4, r7)
            int r5 = r7.e
            r4.y(r5)
            int r5 = r7.f
            r4.v(r5)
            int r5 = r7.g
            r4.R = r5
            if (r5 <= 0) goto L79
            r5 = r15
            goto L7a
        L79:
            r5 = r14
        L7a:
            r4.w = r5
        L7c:
            int r3 = r3 + 1
            goto L24
        L7f:
            int r0 = r1.k0
            int r3 = r1.l0
            int r4 = r1.g0
            int r5 = r1.h0
            r6 = 2
            int[] r7 = new int[r6]
            int r16 = r9 - r0
            int r16 = r16 - r3
            int r2 = r1.J0
            if (r2 != r15) goto L96
            int r16 = r40 - r4
            int r16 = r16 - r5
        L96:
            r29 = r16
            r6 = -1
            if (r2 != 0) goto La8
            int r2 = r1.r0
            if (r2 != r6) goto La1
            r1.r0 = r14
        La1:
            int r2 = r1.s0
            if (r2 != r6) goto Lb4
            r1.s0 = r14
            goto Lb4
        La8:
            int r2 = r1.r0
            if (r2 != r6) goto Lae
            r1.r0 = r14
        Lae:
            int r2 = r1.s0
            if (r2 != r6) goto Lb4
            r1.s0 = r14
        Lb4:
            a.N3[] r2 = r1.e0
            r6 = r14
            r18 = r6
            r30 = r18
        Lbb:
            int r14 = r1.f0
            r15 = 8
            if (r6 >= r14) goto Lcf
            a.N3[] r14 = r1.e0
            r14 = r14[r6]
            int r14 = r14.X
            if (r14 != r15) goto Lcb
            int r18 = r18 + 1
        Lcb:
            int r6 = r6 + 1
            r15 = 1
            goto Lbb
        Lcf:
            if (r18 <= 0) goto Lfd
            int r14 = r14 - r18
            a.N3[] r2 = new a.N3[r14]
            r6 = r30
            r14 = r6
        Ld8:
            int r15 = r1.f0
            if (r6 >= r15) goto Lf5
            a.N3[] r15 = r1.e0
            r15 = r15[r6]
            r19 = r0
            int r0 = r15.X
            r20 = r2
            r2 = 8
            if (r0 == r2) goto Lee
            r20[r14] = r15
            int r14 = r14 + 1
        Lee:
            int r6 = r6 + 1
            r0 = r19
            r2 = r20
            goto Ld8
        Lf5:
            r20 = r2
            r15 = r14
            r14 = r20
        Lfa:
            r19 = r0
            goto L100
        Lfd:
            r15 = r14
            r14 = r2
            goto Lfa
        L100:
            r1.O0 = r14
            r1.P0 = r15
            int r0 = r1.H0
            java.util.ArrayList<a.H6$a> r2 = r1.K0
            if (r0 == 0) goto L49f
            r6 = 1
            if (r0 == r6) goto L2a2
            r6 = 2
            if (r0 == r6) goto L11e
            r29 = r3
            r32 = r4
            r33 = r5
            r34 = r7
        L118:
            r16 = r19
        L11a:
            r31 = 1
            goto L528
        L11e:
            int r0 = r1.J0
            if (r0 != 0) goto L15d
            int r2 = r1.I0
            if (r2 > 0) goto L156
            r2 = r30
            r6 = r2
            r12 = r6
        L12a:
            if (r2 >= r15) goto L14f
            if (r2 <= 0) goto L131
            int r13 = r1.D0
            int r6 = r6 + r13
        L131:
            r13 = r14[r2]
            if (r13 != 0) goto L13a
            r18 = r2
            r2 = r29
            goto L149
        L13a:
            r18 = r2
            r2 = r29
            int r13 = r1.F(r13, r2)
            int r13 = r13 + r6
            if (r13 <= r2) goto L146
            goto L151
        L146:
            int r12 = r12 + 1
            r6 = r13
        L149:
            int r13 = r18 + 1
            r29 = r2
            r2 = r13
            goto L12a
        L14f:
            r2 = r29
        L151:
            r18 = r3
        L153:
            r13 = r30
            goto L18c
        L156:
            r6 = r2
            r2 = r29
            r18 = r3
            r12 = r6
            goto L153
        L15d:
            r2 = r29
            int r6 = r1.I0
            if (r6 > 0) goto L188
            r6 = r30
            r12 = r6
            r13 = r12
        L167:
            r18 = r3
            if (r6 >= r15) goto L185
            if (r6 <= 0) goto L170
            int r3 = r1.E0
            int r12 = r12 + r3
        L170:
            r3 = r14[r6]
            if (r3 != 0) goto L175
            goto L180
        L175:
            int r3 = r1.E(r3, r2)
            int r3 = r3 + r12
            if (r3 <= r2) goto L17d
            goto L185
        L17d:
            int r13 = r13 + 1
            r12 = r3
        L180:
            int r6 = r6 + 1
            r3 = r18
            goto L167
        L185:
            r12 = r30
            goto L18c
        L188:
            r18 = r3
            r13 = r6
            goto L185
        L18c:
            int[] r3 = r1.N0
            if (r3 != 0) goto L195
            r6 = 2
            int[] r3 = new int[r6]
            r1.N0 = r3
        L195:
            if (r13 != 0) goto L19a
            r6 = 1
            if (r0 == r6) goto L19e
        L19a:
            if (r12 != 0) goto L1a0
            if (r0 != 0) goto L1a0
        L19e:
            r3 = 1
            goto L1a2
        L1a0:
            r3 = r30
        L1a2:
            if (r3 != 0) goto L28f
            if (r0 != 0) goto L1b4
            float r6 = (float) r15
            float r13 = (float) r12
            float r6 = r6 / r13
            r20 = r3
            r16 = r4
            double r3 = (double) r6
            double r3 = java.lang.Math.ceil(r3)
            int r13 = (int) r3
            goto L1c1
        L1b4:
            r20 = r3
            r16 = r4
            float r3 = (float) r15
            float r4 = (float) r13
            float r3 = r3 / r4
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r12 = (int) r3
        L1c1:
            a.N3[] r3 = r1.M0
            if (r3 == 0) goto L1c8
            int r4 = r3.length
            if (r4 >= r12) goto L1ca
        L1c8:
            r4 = 0
            goto L1cf
        L1ca:
            r4 = 0
            java.util.Arrays.fill(r3, r4)
            goto L1d3
        L1cf:
            a.N3[] r3 = new a.N3[r12]
            r1.M0 = r3
        L1d3:
            a.N3[] r3 = r1.L0
            if (r3 == 0) goto L1df
            int r6 = r3.length
            if (r6 >= r13) goto L1db
            goto L1df
        L1db:
            java.util.Arrays.fill(r3, r4)
            goto L1e3
        L1df:
            a.N3[] r3 = new a.N3[r13]
            r1.L0 = r3
        L1e3:
            r3 = r30
        L1e5:
            if (r3 >= r12) goto L23a
            r4 = r30
        L1e9:
            if (r4 >= r13) goto L233
            int r6 = r4 * r12
            int r6 = r6 + r3
            r21 = r3
            r3 = 1
            if (r0 != r3) goto L1f7
            int r3 = r21 * r13
            int r6 = r3 + r4
        L1f7:
            int r3 = r14.length
            if (r6 < r3) goto L1fd
        L1fa:
            r22 = r0
            goto L22c
        L1fd:
            r3 = r14[r6]
            if (r3 != 0) goto L202
            goto L1fa
        L202:
            int r6 = r1.F(r3, r2)
            r22 = r0
            a.N3[] r0 = r1.M0
            r0 = r0[r21]
            if (r0 == 0) goto L214
            int r0 = r0.l()
            if (r0 >= r6) goto L218
        L214:
            a.N3[] r0 = r1.M0
            r0[r21] = r3
        L218:
            int r0 = r1.E(r3, r2)
            a.N3[] r6 = r1.L0
            r6 = r6[r4]
            if (r6 == 0) goto L228
            int r6 = r6.i()
            if (r6 >= r0) goto L22c
        L228:
            a.N3[] r0 = r1.L0
            r0[r4] = r3
        L22c:
            int r4 = r4 + 1
            r3 = r21
            r0 = r22
            goto L1e9
        L233:
            r22 = r0
            r21 = r3
            int r3 = r21 + 1
            goto L1e5
        L23a:
            r22 = r0
            r0 = r30
            r3 = r0
        L23f:
            if (r0 >= r12) goto L255
            a.N3[] r4 = r1.M0
            r4 = r4[r0]
            if (r4 == 0) goto L252
            if (r0 <= 0) goto L24c
            int r6 = r1.D0
            int r3 = r3 + r6
        L24c:
            int r4 = r1.F(r4, r2)
            int r4 = r4 + r3
            r3 = r4
        L252:
            int r0 = r0 + 1
            goto L23f
        L255:
            r0 = r30
            r4 = r0
        L258:
            if (r0 >= r13) goto L270
            a.N3[] r6 = r1.L0
            r6 = r6[r0]
            r21 = r0
            if (r6 == 0) goto L26d
            if (r0 <= 0) goto L267
            int r0 = r1.E0
            int r4 = r4 + r0
        L267:
            int r0 = r1.E(r6, r2)
            int r0 = r0 + r4
            r4 = r0
        L26d:
            int r0 = r21 + 1
            goto L258
        L270:
            r7[r30] = r3
            r6 = 1
            r7[r6] = r4
            if (r22 != 0) goto L282
            if (r3 <= r2) goto L280
            if (r12 <= r6) goto L280
            int r12 = r12 + (-1)
        L27d:
            r3 = r20
            goto L289
        L280:
            r3 = r6
            goto L289
        L282:
            if (r4 <= r2) goto L280
            if (r13 <= r6) goto L280
            int r13 = r13 + (-1)
            goto L27d
        L289:
            r4 = r16
            r0 = r22
            goto L1a2
        L28f:
            r16 = r4
            r6 = 1
            int[] r0 = r1.N0
            r0[r30] = r12
            r0[r6] = r13
            r33 = r5
            r34 = r7
            r32 = r16
            r29 = r18
            goto L118
        L2a2:
            r0 = r2
            r18 = r3
            r16 = r4
            r28 = r29
            int r2 = r1.J0
            if (r15 != 0) goto L2b7
            r33 = r5
            r34 = r7
            r32 = r16
            r29 = r18
            goto L118
        L2b7:
            r0.clear()
            r3 = r0
            a.H6$a r0 = new a.H6$a
            r4 = r3
            a.M3 r3 = r1.y
            r6 = r4
            a.M3 r4 = r1.z
            r17 = r5
            a.M3 r5 = r1.A
            r20 = r6
            a.M3 r6 = r1.B
            r34 = r7
            r35 = r14
            r32 = r16
            r33 = r17
            r29 = r18
            r16 = r19
            r14 = r20
            r7 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.add(r0)
            if (r2 != 0) goto L34c
            r3 = r30
            r4 = r3
            r5 = r4
        L2e7:
            if (r3 >= r15) goto L3aa
            r6 = r35[r3]
            int r17 = r1.F(r6, r7)
            r19 = r2
            a.N3$a[] r2 = r6.J
            r2 = r2[r30]
            if (r2 != r13) goto L2f9
            int r4 = r4 + 1
        L2f9:
            r18 = r4
            if (r5 == r7) goto L304
            int r2 = r1.D0
            int r2 = r2 + r5
            int r2 = r2 + r17
            if (r2 <= r7) goto L30a
        L304:
            a.N3 r2 = r0.b
            if (r2 == 0) goto L30a
            r2 = 1
            goto L30c
        L30a:
            r2 = r30
        L30c:
            if (r2 != 0) goto L319
            if (r3 <= 0) goto L319
            int r4 = r1.I0
            if (r4 <= 0) goto L319
            int r4 = r3 % r4
            if (r4 != 0) goto L319
            r2 = 1
        L319:
            if (r2 == 0) goto L338
            a.H6$a r0 = new a.H6$a
            r2 = r3
            a.M3 r3 = r1.y
            a.M3 r4 = r1.z
            a.M3 r5 = r1.A
            r20 = r6
            a.M3 r6 = r1.B
            r11 = r2
            r2 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.n = r11
            r14.add(r0)
        L335:
            r5 = r17
            goto L344
        L338:
            r11 = r3
            r10 = r6
            r2 = r19
            if (r11 <= 0) goto L335
            int r3 = r1.D0
            int r3 = r3 + r17
            int r3 = r3 + r5
            r5 = r3
        L344:
            r0.a(r10)
            int r3 = r11 + 1
            r4 = r18
            goto L2e7
        L34c:
            r3 = r30
            r4 = r3
            r10 = r4
        L350:
            if (r10 >= r15) goto L3a9
            r11 = r35[r10]
            int r17 = r1.E(r11, r7)
            a.N3$a[] r5 = r11.J
            r31 = 1
            r5 = r5[r31]
            if (r5 != r13) goto L362
            int r3 = r3 + 1
        L362:
            r18 = r3
            if (r4 == r7) goto L36d
            int r3 = r1.E0
            int r3 = r3 + r4
            int r3 = r3 + r17
            if (r3 <= r7) goto L373
        L36d:
            a.N3 r3 = r0.b
            if (r3 == 0) goto L373
            r3 = 1
            goto L375
        L373:
            r3 = r30
        L375:
            if (r3 != 0) goto L382
            if (r10 <= 0) goto L382
            int r5 = r1.I0
            if (r5 <= 0) goto L382
            int r5 = r10 % r5
            if (r5 != 0) goto L382
            r3 = 1
        L382:
            if (r3 == 0) goto L399
            a.H6$a r0 = new a.H6$a
            a.M3 r3 = r1.y
            a.M3 r4 = r1.z
            a.M3 r5 = r1.A
            a.M3 r6 = r1.B
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.n = r10
            r14.add(r0)
        L396:
            r4 = r17
            goto L3a1
        L399:
            if (r10 <= 0) goto L396
            int r3 = r1.E0
            int r3 = r3 + r17
            int r3 = r3 + r4
            r4 = r3
        L3a1:
            r0.a(r11)
            int r10 = r10 + 1
            r3 = r18
            goto L350
        L3a9:
            r4 = r3
        L3aa:
            int r0 = r14.size()
            int r3 = r1.k0
            int r5 = r1.g0
            int r6 = r1.l0
            int r10 = r1.h0
            a.N3$a[] r11 = r1.J
            r13 = r11[r30]
            if (r13 == r12) goto L3c6
            r31 = 1
            r11 = r11[r31]
            if (r11 != r12) goto L3c3
            goto L3c6
        L3c3:
            r11 = r30
            goto L3c7
        L3c6:
            r11 = 1
        L3c7:
            if (r4 <= 0) goto L3ed
            if (r11 == 0) goto L3ed
            r4 = r30
        L3cd:
            if (r4 >= r0) goto L3ed
            java.lang.Object r11 = r14.get(r4)
            a.H6$a r11 = (a.H6.a) r11
            if (r2 != 0) goto L3e1
            int r12 = r11.d()
            int r12 = r7 - r12
            r11.e(r12)
            goto L3ea
        L3e1:
            int r12 = r11.c()
            int r12 = r7 - r12
            r11.e(r12)
        L3ea:
            int r4 = r4 + 1
            goto L3cd
        L3ed:
            a.M3 r4 = r1.B
            a.M3 r11 = r1.A
            a.M3 r12 = r1.y
            a.M3 r13 = r1.z
            r24 = r3
            r23 = r4
            r25 = r5
            r26 = r6
            r27 = r10
            r22 = r11
            r20 = r12
            r21 = r13
            r3 = r30
            r5 = r3
            r6 = r5
        L409:
            if (r3 >= r0) goto L497
            java.lang.Object r10 = r14.get(r3)
            a.H6$a r10 = (a.H6.a) r10
            if (r2 != 0) goto L453
            int r12 = r0 + (-1)
            if (r3 >= r12) goto L428
            int r12 = r3 + 1
            java.lang.Object r12 = r14.get(r12)
            a.H6$a r12 = (a.H6.a) r12
            a.N3 r12 = r12.b
            a.M3 r12 = r12.z
            r23 = r12
            r27 = r30
            goto L42e
        L428:
            int r12 = r1.h0
            r23 = r4
            r27 = r12
        L42e:
            a.N3 r12 = r10.b
            a.M3 r12 = r12.B
            r19 = r2
            r28 = r7
            r18 = r10
            r18.f(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            int r13 = r10.d()
            int r5 = java.lang.Math.max(r5, r13)
            int r10 = r10.c()
            int r10 = r10 + r6
            if (r3 <= 0) goto L44d
            int r6 = r1.E0
            int r10 = r10 + r6
        L44d:
            r6 = r10
            r21 = r12
            r25 = r30
            goto L493
        L453:
            int r12 = r0 + (-1)
            if (r3 >= r12) goto L468
            int r12 = r3 + 1
            java.lang.Object r12 = r14.get(r12)
            a.H6$a r12 = (a.H6.a) r12
            a.N3 r12 = r12.b
            a.M3 r12 = r12.y
            r22 = r12
            r26 = r30
            goto L46e
        L468:
            int r12 = r1.l0
            r22 = r11
            r26 = r12
        L46e:
            a.N3 r12 = r10.b
            a.M3 r12 = r12.A
            r19 = r2
            r28 = r7
            r18 = r10
            r18.f(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            int r10 = r18.d()
            int r10 = r10 + r5
            int r5 = r18.c()
            int r5 = java.lang.Math.max(r6, r5)
            if (r3 <= 0) goto L48d
            int r6 = r1.D0
            int r10 = r10 + r6
        L48d:
            r6 = r5
            r5 = r10
            r20 = r12
            r24 = r30
        L493:
            int r3 = r3 + 1
            goto L409
        L497:
            r34[r30] = r5
            r31 = 1
            r34[r31] = r6
            goto L11a
        L49f:
            r32 = r4
            r33 = r5
            r34 = r7
            r35 = r14
            r16 = r19
            r7 = r29
            r14 = r2
            r29 = r3
            int r2 = r1.J0
            if (r15 != 0) goto L4b4
            goto L11a
        L4b4:
            int r0 = r14.size()
            if (r0 != 0) goto L4cb
            a.H6$a r0 = new a.H6$a
            a.M3 r3 = r1.y
            a.M3 r4 = r1.z
            a.M3 r5 = r1.A
            a.M3 r6 = r1.B
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.add(r0)
            goto L50d
        L4cb:
            r0 = r30
            java.lang.Object r3 = r14.get(r0)
            a.H6$a r3 = (a.H6.a) r3
            r3.c = r0
            r4 = 0
            r3.b = r4
            r3.l = r0
            r3.m = r0
            r3.n = r0
            r3.o = r0
            r3.p = r0
            int r0 = r1.k0
            int r4 = r1.g0
            int r5 = r1.l0
            int r6 = r1.h0
            a.M3 r10 = r1.A
            a.M3 r11 = r1.B
            a.M3 r12 = r1.y
            a.M3 r13 = r1.z
            r24 = r0
            r19 = r2
            r18 = r3
            r25 = r4
            r26 = r5
            r27 = r6
            r28 = r7
            r22 = r10
            r23 = r11
            r20 = r12
            r21 = r13
            r18.f(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = r18
        L50d:
            r2 = 0
        L50e:
            if (r2 >= r15) goto L518
            r3 = r35[r2]
            r0.a(r3)
            int r2 = r2 + 1
            goto L50e
        L518:
            int r2 = r0.d()
            r30 = 0
            r34[r30] = r2
            int r0 = r0.c()
            r31 = 1
            r34[r31] = r0
        L528:
            r0 = r34[r30]
            int r0 = r0 + r16
            int r0 = r0 + r29
            r2 = r34[r31]
            int r2 = r2 + r32
            int r2 = r2 + r33
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r8 != r4) goto L53e
            r10 = r39
            r0 = r9
            goto L54e
        L53e:
            if (r8 != r3) goto L547
            int r0 = java.lang.Math.min(r0, r9)
            r10 = r39
            goto L54e
        L547:
            r10 = r39
            if (r8 != 0) goto L54c
            goto L54e
        L54c:
            r0 = r30
        L54e:
            if (r10 != r4) goto L553
            r2 = r40
            goto L561
        L553:
            if (r10 != r3) goto L55c
            r11 = r40
            int r2 = java.lang.Math.min(r2, r11)
            goto L561
        L55c:
            if (r10 != 0) goto L55f
            goto L561
        L55f:
            r2 = r30
        L561:
            r1.n0 = r0
            r1.o0 = r2
            r1.y(r0)
            r1.v(r2)
            int r0 = r1.f0
            if (r0 <= 0) goto L572
            r14 = r31
            goto L574
        L572:
            r14 = r30
        L574:
            r1.m0 = r14
            return
    }

    public final int E(a.N3 r10, int r11) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            a.N3$a[] r1 = r10.J
            r2 = 1
            r3 = r1[r2]
            a.N3$a r4 = a.N3.a.c
            if (r3 != r4) goto L46
            int r3 = r10.k
            if (r3 != 0) goto L12
            return r0
        L12:
            r4 = 2
            if (r3 != r4) goto L2e
            float r2 = r10.r
            float r11 = (float) r11
            float r2 = r2 * r11
            int r8 = (int) r2
            int r11 = r10.i()
            if (r8 == r11) goto L2d
            r5 = r1[r0]
            int r6 = r10.l()
            a.N3$a r7 = a.N3.a.f181a
            r3 = r9
            r4 = r10
            r3.D(r4, r5, r6, r7, r8)
        L2d:
            return r8
        L2e:
            r4 = r10
            if (r3 != r2) goto L36
            int r10 = r4.i()
            return r10
        L36:
            r10 = 3
            if (r3 != r10) goto L47
            int r10 = r4.l()
            float r10 = (float) r10
            float r11 = r4.N
            float r10 = r10 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r11
            int r10 = (int) r10
            return r10
        L46:
            r4 = r10
        L47:
            int r10 = r4.i()
            return r10
    }

    public final int F(a.N3 r11, int r12) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            a.N3$a[] r1 = r11.J
            r2 = r1[r0]
            a.N3$a r3 = a.N3.a.c
            if (r2 != r3) goto L46
            int r2 = r11.j
            if (r2 != 0) goto L11
            return r0
        L11:
            r0 = 2
            r3 = 1
            if (r2 != r0) goto L2e
            float r0 = r11.o
            float r12 = (float) r12
            float r0 = r0 * r12
            int r7 = (int) r0
            int r12 = r11.l()
            if (r7 == r12) goto L2d
            a.N3$a r6 = a.N3.a.f181a
            r8 = r1[r3]
            int r9 = r11.i()
            r4 = r10
            r5 = r11
            r4.D(r5, r6, r7, r8, r9)
        L2d:
            return r7
        L2e:
            r5 = r11
            if (r2 != r3) goto L36
            int r11 = r5.l()
            return r11
        L36:
            r11 = 3
            if (r2 != r11) goto L47
            int r11 = r5.i()
            float r11 = (float) r11
            float r12 = r5.N
            float r11 = r11 * r12
            r12 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r12
            int r11 = (int) r11
            return r11
        L46:
            r5 = r11
        L47:
            int r11 = r5.l()
            return r11
    }

    @Override // a.N3
    public final void a(a.B9 r12) {
            r11 = this;
            super.a(r12)
            a.N3 r12 = r11.K
            r0 = 0
            if (r12 == 0) goto Ld
            a.O3 r12 = (a.O3) r12
            boolean r12 = r12.i0
            goto Le
        Ld:
            r12 = r0
        Le:
            int r1 = r11.H0
            java.util.ArrayList<a.H6$a> r2 = r11.K0
            r3 = 1
            if (r1 == 0) goto L130
            if (r1 == r3) goto L116
            r2 = 2
            if (r1 == r2) goto L1c
            goto L13f
        L1c:
            int[] r1 = r11.N0
            if (r1 == 0) goto L13f
            a.N3[] r1 = r11.M0
            if (r1 == 0) goto L13f
            a.N3[] r1 = r11.L0
            if (r1 != 0) goto L2a
            goto L13f
        L2a:
            r1 = r0
        L2b:
            int r2 = r11.P0
            if (r1 >= r2) goto L39
            a.N3[] r2 = r11.O0
            r2 = r2[r1]
            r2.t()
            int r1 = r1 + 1
            goto L2b
        L39:
            int[] r1 = r11.N0
            r2 = r1[r0]
            r1 = r1[r3]
            r4 = 0
            r5 = r0
        L41:
            r6 = 8
            if (r5 >= r2) goto L89
            if (r12 == 0) goto L4b
            int r7 = r2 - r5
            int r7 = r7 - r3
            goto L4c
        L4b:
            r7 = r5
        L4c:
            a.N3[] r8 = r11.M0
            r7 = r8[r7]
            if (r7 == 0) goto L86
            int r8 = r7.X
            if (r8 != r6) goto L57
            goto L86
        L57:
            a.M3 r6 = r7.y
            if (r5 != 0) goto L6a
            int r8 = r11.k0
            a.M3 r9 = r11.y
            r7.e(r6, r9, r8)
            int r8 = r11.r0
            r7.Z = r8
            float r8 = r11.x0
            r7.U = r8
        L6a:
            int r8 = r2 + (-1)
            if (r5 != r8) goto L77
            int r8 = r11.l0
            a.M3 r9 = r7.A
            a.M3 r10 = r11.A
            r7.e(r9, r10, r8)
        L77:
            if (r5 <= 0) goto L85
            a.M3 r8 = r4.A
            int r9 = r11.D0
            r7.e(r6, r8, r9)
            a.M3 r8 = r4.A
            r4.e(r8, r6, r0)
        L85:
            r4 = r7
        L86:
            int r5 = r5 + 1
            goto L41
        L89:
            r12 = r0
        L8a:
            if (r12 >= r1) goto Lc9
            a.N3[] r5 = r11.L0
            r5 = r5[r12]
            if (r5 == 0) goto Lc6
            int r7 = r5.X
            if (r7 != r6) goto L97
            goto Lc6
        L97:
            a.M3 r7 = r5.z
            if (r12 != 0) goto Laa
            int r8 = r11.g0
            a.M3 r9 = r11.z
            r5.e(r7, r9, r8)
            int r8 = r11.s0
            r5.a0 = r8
            float r8 = r11.y0
            r5.V = r8
        Laa:
            int r8 = r1 + (-1)
            if (r12 != r8) goto Lb7
            int r8 = r11.h0
            a.M3 r9 = r5.B
            a.M3 r10 = r11.B
            r5.e(r9, r10, r8)
        Lb7:
            if (r12 <= 0) goto Lc5
            a.M3 r8 = r4.B
            int r9 = r11.E0
            r5.e(r7, r8, r9)
            a.M3 r8 = r4.B
            r4.e(r8, r7, r0)
        Lc5:
            r4 = r5
        Lc6:
            int r12 = r12 + 1
            goto L8a
        Lc9:
            r12 = r0
        Lca:
            if (r12 >= r2) goto L13f
            r4 = r0
        Lcd:
            if (r4 >= r1) goto L113
            int r5 = r4 * r2
            int r5 = r5 + r12
            int r7 = r11.J0
            if (r7 != r3) goto Ld9
            int r5 = r12 * r1
            int r5 = r5 + r4
        Ld9:
            a.N3[] r7 = r11.O0
            int r8 = r7.length
            if (r5 < r8) goto Ldf
            goto L110
        Ldf:
            r5 = r7[r5]
            if (r5 == 0) goto L110
            int r7 = r5.X
            if (r7 != r6) goto Le8
            goto L110
        Le8:
            a.N3[] r7 = r11.M0
            r7 = r7[r12]
            a.N3[] r8 = r11.L0
            r8 = r8[r4]
            if (r5 == r7) goto L100
            a.M3 r9 = r7.y
            a.M3 r10 = r5.y
            r5.e(r10, r9, r0)
            a.M3 r9 = r5.A
            a.M3 r7 = r7.A
            r5.e(r9, r7, r0)
        L100:
            if (r5 == r8) goto L110
            a.M3 r7 = r8.z
            a.M3 r9 = r5.z
            r5.e(r9, r7, r0)
            a.M3 r7 = r5.B
            a.M3 r8 = r8.B
            r5.e(r7, r8, r0)
        L110:
            int r4 = r4 + 1
            goto Lcd
        L113:
            int r12 = r12 + 1
            goto Lca
        L116:
            int r1 = r2.size()
            r4 = r0
        L11b:
            if (r4 >= r1) goto L13f
            java.lang.Object r5 = r2.get(r4)
            a.H6$a r5 = (a.H6.a) r5
            int r6 = r1 + (-1)
            if (r4 != r6) goto L129
            r6 = r3
            goto L12a
        L129:
            r6 = r0
        L12a:
            r5.b(r4, r12, r6)
            int r4 = r4 + 1
            goto L11b
        L130:
            int r1 = r2.size()
            if (r1 <= 0) goto L13f
            java.lang.Object r1 = r2.get(r0)
            a.H6$a r1 = (a.H6.a) r1
            r1.b(r0, r12, r3)
        L13f:
            r11.m0 = r0
            return
    }
}
