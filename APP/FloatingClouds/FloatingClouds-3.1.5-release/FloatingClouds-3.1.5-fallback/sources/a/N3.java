package a;

/* JADX INFO: loaded from: classes.dex */
public class N3 {
    public final a.M3 A;
    public final a.M3 B;
    public final a.M3 C;
    public final a.M3 D;
    public final a.M3 E;
    public final a.M3 F;
    public final a.M3[] G;
    public final java.util.ArrayList<a.M3> H;
    public final boolean[] I;
    public final a.N3.a[] J;
    public a.N3 K;
    public int L;
    public int M;
    public float N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public android.view.View W;
    public int X;
    public java.lang.String Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f180a;
    public int a0;
    public a.U2 b;
    public final float[] b0;
    public a.U2 c;
    public final a.N3[] c0;
    public final a.K8 d;
    public final a.N3[] d0;
    public final a.C0307og e;
    public final boolean[] f;
    public final int[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final int[] l;
    public int m;
    public int n;
    public float o;
    public int p;
    public int q;
    public float r;
    public int s;
    public float t;
    public final int[] u;
    public float v;
    public boolean w;
    public boolean x;
    public final a.M3 y;
    public final a.M3 z;

    public enum a extends java.lang.Enum<a.N3.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.N3.a f181a = null;
        public static final a.N3.a b = null;
        public static final a.N3.a c = null;
        public static final a.N3.a d = null;
        public static final /* synthetic */ a.N3.a[] e = null;

        static {
                a.N3$a r0 = new a.N3$a
                java.lang.String r1 = "FIXED"
                r2 = 0
                r0.<init>(r1, r2)
                a.N3.a.f181a = r0
                a.N3$a r1 = new a.N3$a
                java.lang.String r2 = "WRAP_CONTENT"
                r3 = 1
                r1.<init>(r2, r3)
                a.N3.a.b = r1
                a.N3$a r2 = new a.N3$a
                java.lang.String r3 = "MATCH_CONSTRAINT"
                r4 = 2
                r2.<init>(r3, r4)
                a.N3.a.c = r2
                a.N3$a r3 = new a.N3$a
                java.lang.String r4 = "MATCH_PARENT"
                r5 = 3
                r3.<init>(r4, r5)
                a.N3.a.d = r3
                a.N3$a[] r0 = new a.N3.a[]{r0, r1, r2, r3}
                a.N3.a.e = r0
                return
        }

        a() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static a.N3.a valueOf(java.lang.String r1) {
                java.lang.Class<a.N3$a> r0 = a.N3.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.N3$a r1 = (a.N3.a) r1
                return r1
        }

        public static a.N3.a[] values() {
                a.N3$a[] r0 = a.N3.a.e
                java.lang.Object r0 = r0.clone()
                a.N3$a[] r0 = (a.N3.a[]) r0
                return r0
        }
    }

    public N3() {
            r15 = this;
            r0 = 2
            r15.<init>()
            r1 = 0
            r15.f180a = r1
            a.K8 r2 = new a.K8
            r2.<init>(r15)
            a.V4 r3 = r2.h
            a.V4$a r4 = a.V4.a.d
            r3.e = r4
            a.V4 r3 = r2.i
            a.V4$a r4 = a.V4.a.e
            r3.e = r4
            r2.f = r1
            r15.d = r2
            a.og r2 = new a.og
            r2.<init>(r15)
            a.V4 r3 = new a.V4
            r3.<init>(r2)
            r2.k = r3
            r4 = 0
            r2.l = r4
            a.V4 r5 = r2.h
            a.V4$a r6 = a.V4.a.f
            r5.e = r6
            a.V4 r5 = r2.i
            a.V4$a r6 = a.V4.a.g
            r5.e = r6
            a.V4$a r5 = a.V4.a.h
            r3.e = r5
            r3 = 1
            r2.f = r3
            r15.e = r2
            boolean[] r2 = new boolean[r0]
            r2 = {x0126: FILL_ARRAY_DATA , data: [1, 1} // fill-array
            r15.f = r2
            int[] r2 = new int[]{r1, r1, r1, r1}
            r15.g = r2
            r2 = -1
            r15.h = r2
            r15.i = r2
            r15.j = r1
            r15.k = r1
            int[] r3 = new int[r0]
            r15.l = r3
            r15.m = r1
            r15.n = r1
            r3 = 1065353216(0x3f800000, float:1.0)
            r15.o = r3
            r15.p = r1
            r15.q = r1
            r15.r = r3
            r15.s = r2
            r15.t = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            int[] r3 = new int[]{r3, r3}
            r15.u = r3
            r3 = 0
            r15.v = r3
            r15.w = r1
            a.M3 r5 = new a.M3
            a.M3$a r6 = a.M3.a.f172a
            r5.<init>(r15, r6)
            r15.y = r5
            a.M3 r7 = new a.M3
            a.M3$a r6 = a.M3.a.b
            r7.<init>(r15, r6)
            r15.z = r7
            a.M3 r6 = new a.M3
            a.M3$a r8 = a.M3.a.c
            r6.<init>(r15, r8)
            r15.A = r6
            a.M3 r8 = new a.M3
            a.M3$a r9 = a.M3.a.d
            r8.<init>(r15, r9)
            r15.B = r8
            a.M3 r9 = new a.M3
            a.M3$a r10 = a.M3.a.e
            r9.<init>(r15, r10)
            r15.C = r9
            a.M3 r11 = new a.M3
            a.M3$a r10 = a.M3.a.g
            r11.<init>(r15, r10)
            r15.D = r11
            a.M3 r12 = new a.M3
            a.M3$a r10 = a.M3.a.h
            r12.<init>(r15, r10)
            r15.E = r12
            a.M3 r10 = new a.M3
            a.M3$a r13 = a.M3.a.f
            r10.<init>(r15, r13)
            r15.F = r10
            a.M3[] r13 = new a.M3[]{r5, r6, r7, r8, r9, r10}
            r15.G = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r15.H = r13
            boolean[] r14 = new boolean[r0]
            r15.I = r14
            a.N3$a r14 = a.N3.a.f181a
            a.N3$a[] r14 = new a.N3.a[]{r14, r14}
            r15.J = r14
            r15.K = r4
            r15.L = r1
            r15.M = r1
            r15.N = r3
            r15.O = r2
            r15.P = r1
            r15.Q = r1
            r15.R = r1
            r2 = 1056964608(0x3f000000, float:0.5)
            r15.U = r2
            r15.V = r2
            r15.X = r1
            r15.Y = r4
            r15.Z = r1
            r15.a0 = r1
            float[] r0 = new float[r0]
            r0 = {x012c: FILL_ARRAY_DATA , data: [-1082130432, -1082130432} // fill-array
            r15.b0 = r0
            a.N3[] r0 = new a.N3[]{r4, r4}
            r15.c0 = r0
            a.N3[] r0 = new a.N3[]{r4, r4}
            r15.d0 = r0
            r13.add(r5)
            r13.add(r7)
            r13.add(r6)
            r13.add(r8)
            r13.add(r11)
            r13.add(r12)
            r13.add(r10)
            r13.add(r9)
            return
    }

    public void A(a.B9 r7) {
            r6 = this;
            a.M3 r0 = r6.y
            r7.getClass()
            int r7 = a.B9.m(r0)
            a.M3 r0 = r6.z
            int r0 = a.B9.m(r0)
            a.M3 r1 = r6.A
            int r1 = a.B9.m(r1)
            a.M3 r2 = r6.B
            int r2 = a.B9.m(r2)
            a.K8 r3 = r6.d
            a.V4 r4 = r3.h
            boolean r5 = r4.j
            if (r5 == 0) goto L2d
            a.V4 r3 = r3.i
            boolean r5 = r3.j
            if (r5 == 0) goto L2d
            int r7 = r4.g
            int r1 = r3.g
        L2d:
            a.og r3 = r6.e
            a.V4 r4 = r3.h
            boolean r5 = r4.j
            if (r5 == 0) goto L3f
            a.V4 r3 = r3.i
            boolean r5 = r3.j
            if (r5 == 0) goto L3f
            int r0 = r4.g
            int r2 = r3.g
        L3f:
            int r3 = r1 - r7
            int r4 = r2 - r0
            r5 = 0
            if (r3 < 0) goto L5d
            if (r4 < 0) goto L5d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r3) goto L5d
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r4) goto L5d
            if (r0 == r3) goto L5d
            if (r0 == r4) goto L5d
            if (r1 == r3) goto L5d
            if (r1 == r4) goto L5d
            if (r2 == r3) goto L5d
            if (r2 != r4) goto L61
        L5d:
            r7 = r5
            r0 = r7
            r1 = r0
            r2 = r1
        L61:
            int r1 = r1 - r7
            int r2 = r2 - r0
            r6.P = r7
            r6.Q = r0
            int r7 = r6.X
            r0 = 8
            if (r7 != r0) goto L72
            r6.L = r5
            r6.M = r5
            return
        L72:
            a.N3$a[] r7 = r6.J
            r0 = r7[r5]
            a.N3$a r3 = a.N3.a.f181a
            if (r0 != r3) goto L7f
            int r0 = r6.L
            if (r1 >= r0) goto L7f
            r1 = r0
        L7f:
            r0 = 1
            r7 = r7[r0]
            if (r7 != r3) goto L89
            int r7 = r6.M
            if (r2 >= r7) goto L89
            r2 = r7
        L89:
            r6.L = r1
            r6.M = r2
            int r7 = r6.T
            if (r2 >= r7) goto L93
            r6.M = r7
        L93:
            int r7 = r6.S
            if (r1 >= r7) goto L99
            r6.L = r7
        L99:
            return
    }

    public void a(a.B9 r59) {
            r58 = this;
            r0 = r58
            r1 = r59
            a.M3 r2 = r0.y
            a.le r3 = r1.j(r2)
            a.M3 r4 = r0.A
            a.le r5 = r1.j(r4)
            a.M3 r6 = r0.z
            a.le r7 = r1.j(r6)
            a.M3 r8 = r0.B
            a.le r9 = r1.j(r8)
            a.M3 r10 = r0.C
            a.le r11 = r1.j(r10)
            a.K8 r12 = r0.d
            a.V4 r13 = r12.h
            boolean r14 = r13.j
            a.N3$a r15 = a.N3.a.b
            r16 = r10
            boolean[] r10 = r0.f
            r17 = r10
            a.og r10 = r0.e
            r18 = r14
            r20 = 1
            if (r18 == 0) goto Lbb
            r18 = 0
            a.V4 r14 = r12.i
            boolean r14 = r14.j
            if (r14 == 0) goto Lbb
            a.V4 r14 = r10.h
            boolean r14 = r14.j
            if (r14 == 0) goto Lbb
            a.V4 r14 = r10.i
            boolean r14 = r14.j
            if (r14 == 0) goto Lbb
            int r2 = r13.g
            r1.d(r3, r2)
            a.V4 r2 = r12.i
            int r2 = r2.g
            r1.d(r5, r2)
            a.V4 r2 = r10.h
            int r2 = r2.g
            r1.d(r7, r2)
            a.V4 r2 = r10.i
            int r2 = r2.g
            r1.d(r9, r2)
            a.V4 r2 = r10.k
            int r2 = r2.g
            r1.d(r11, r2)
            a.N3 r2 = r0.K
            if (r2 == 0) goto L635
            a.N3$a[] r2 = r2.J
            r3 = r2[r18]
            if (r3 != r15) goto L7a
            r3 = r20
            goto L7c
        L7a:
            r3 = r18
        L7c:
            r2 = r2[r20]
            if (r2 != r15) goto L83
            r2 = r20
            goto L85
        L83:
            r2 = r18
        L85:
            if (r3 == 0) goto La0
            boolean r3 = r17[r18]
            if (r3 == 0) goto La0
            boolean r3 = r0.q()
            if (r3 != 0) goto La0
            a.N3 r3 = r0.K
            a.M3 r3 = r3.A
            a.le r3 = r1.j(r3)
            r6 = r18
            r4 = 8
            r1.f(r3, r5, r6, r4)
        La0:
            if (r2 == 0) goto L635
            boolean r2 = r17[r20]
            if (r2 == 0) goto L635
            boolean r2 = r0.r()
            if (r2 != 0) goto L635
            a.N3 r2 = r0.K
            a.M3 r2 = r2.B
            a.le r2 = r1.j(r2)
            r4 = 8
            r6 = 0
            r1.f(r2, r9, r6, r4)
            return
        Lbb:
            a.N3 r13 = r0.K
            if (r13 == 0) goto L159
            a.N3$a[] r13 = r13.J
            r18 = 0
            r14 = r13[r18]
            if (r14 != r15) goto Lca
            r14 = r20
            goto Lcc
        Lca:
            r14 = r18
        Lcc:
            r13 = r13[r20]
            r21 = r7
            r7 = r18
            if (r13 != r15) goto Ld7
            r13 = r20
            goto Ld8
        Ld7:
            r13 = r7
        Ld8:
            boolean r18 = r0.p(r7)
            if (r18 == 0) goto Leb
            r22 = r10
            a.N3 r10 = r0.K
            a.O3 r10 = (a.O3) r10
            r10.C(r0, r7)
            r7 = r20
            r10 = r7
            goto Lf3
        Leb:
            r22 = r10
            boolean r7 = r0.q()
            r10 = r20
        Lf3:
            boolean r20 = r0.p(r10)
            if (r20 == 0) goto L104
            r23 = r7
            a.N3 r7 = r0.K
            a.O3 r7 = (a.O3) r7
            r7.C(r0, r10)
            r7 = 1
            goto L10a
        L104:
            r23 = r7
            boolean r7 = r0.r()
        L10a:
            if (r23 != 0) goto L131
            if (r14 == 0) goto L131
            int r10 = r0.X
            r24 = r7
            r7 = 8
            if (r10 == r7) goto L12e
            a.M3 r7 = r2.d
            if (r7 != 0) goto L12e
            a.M3 r7 = r4.d
            if (r7 != 0) goto L12e
            a.N3 r7 = r0.K
            a.M3 r7 = r7.A
            a.le r7 = r1.j(r7)
            r25 = r2
            r2 = 0
            r10 = 1
            r1.f(r7, r5, r2, r10)
            goto L135
        L12e:
            r25 = r2
            goto L135
        L131:
            r25 = r2
            r24 = r7
        L135:
            if (r24 != 0) goto L156
            if (r13 == 0) goto L156
            int r2 = r0.X
            r7 = 8
            if (r2 == r7) goto L156
            a.M3 r2 = r6.d
            if (r2 != 0) goto L156
            a.M3 r2 = r8.d
            if (r2 != 0) goto L156
            if (r16 != 0) goto L156
            a.N3 r2 = r0.K
            a.M3 r2 = r2.B
            a.le r2 = r1.j(r2)
            r7 = 0
            r10 = 1
            r1.f(r2, r9, r7, r10)
        L156:
            r2 = r4
            r4 = r13
            goto L166
        L159:
            r25 = r2
            r21 = r7
            r22 = r10
            r2 = r4
            r4 = 0
            r14 = 0
            r23 = 0
            r24 = 0
        L166:
            int r7 = r0.L
            int r10 = r0.S
            if (r7 >= r10) goto L16d
            goto L16e
        L16d:
            r10 = r7
        L16e:
            int r13 = r0.M
            r26 = r2
            int r2 = r0.T
            if (r13 >= r2) goto L179
            r27 = r2
            goto L17b
        L179:
            r27 = r13
        L17b:
            a.N3$a[] r2 = r0.J
            r28 = r2
            r18 = 0
            r2 = r28[r18]
            r29 = r4
            a.N3$a r4 = a.N3.a.c
            if (r2 == r4) goto L190
            r30 = 1
        L18b:
            r31 = r6
            r20 = 1
            goto L193
        L190:
            r30 = 0
            goto L18b
        L193:
            r6 = r28[r20]
            if (r6 == r4) goto L19c
            r32 = 1
        L199:
            r33 = r8
            goto L19f
        L19c:
            r32 = 0
            goto L199
        L19f:
            int r8 = r0.O
            r0.s = r8
            r34 = r9
            float r9 = r0.N
            r0.t = r9
            r35 = r9
            int r9 = r0.j
            r36 = r9
            int r9 = r0.k
            r37 = 0
            int r37 = (r35 > r37 ? 1 : (r35 == r37 ? 0 : -1))
            r38 = r9
            r39 = 1065353216(0x3f800000, float:1.0)
            if (r37 <= 0) goto L2cb
            int r9 = r0.X
            r40 = r10
            r10 = 8
            if (r9 == r10) goto L2c8
            r9 = 3
            if (r2 != r4) goto L1ca
            if (r36 != 0) goto L1ca
            r10 = r9
            goto L1cc
        L1ca:
            r10 = r36
        L1cc:
            if (r6 != r4) goto L1d3
            if (r38 != 0) goto L1d3
            r41 = r9
            goto L1d5
        L1d3:
            r41 = r38
        L1d5:
            if (r2 != r4) goto L286
            if (r6 != r4) goto L286
            if (r10 != r9) goto L286
            r42 = r11
            r11 = r41
            if (r11 != r9) goto L28a
            r9 = -1
            if (r8 != r9) goto L1f9
            if (r30 == 0) goto L1ec
            if (r32 != 0) goto L1ec
            r6 = 0
            r0.s = r6
            goto L1f9
        L1ec:
            if (r30 != 0) goto L1f9
            if (r32 == 0) goto L1f9
            r2 = 1
            r0.s = r2
            if (r8 != r9) goto L1f9
            float r9 = r39 / r35
            r0.t = r9
        L1f9:
            int r2 = r0.s
            if (r2 != 0) goto L20b
            boolean r2 = r31.f()
            if (r2 == 0) goto L209
            boolean r2 = r33.f()
            if (r2 != 0) goto L20b
        L209:
            r2 = 1
            goto L20d
        L20b:
            r2 = 1
            goto L210
        L20d:
            r0.s = r2
            goto L223
        L210:
            int r4 = r0.s
            if (r4 != r2) goto L223
            boolean r2 = r25.f()
            if (r2 == 0) goto L220
            boolean r2 = r26.f()
            if (r2 != 0) goto L223
        L220:
            r6 = 0
            r0.s = r6
        L223:
            int r2 = r0.s
            r9 = -1
            if (r2 != r9) goto L265
            boolean r2 = r31.f()
            if (r2 == 0) goto L240
            boolean r2 = r33.f()
            if (r2 == 0) goto L240
            boolean r2 = r25.f()
            if (r2 == 0) goto L240
            boolean r2 = r26.f()
            if (r2 != 0) goto L265
        L240:
            boolean r2 = r31.f()
            if (r2 == 0) goto L250
            boolean r2 = r33.f()
            if (r2 == 0) goto L250
            r6 = 0
            r0.s = r6
            goto L265
        L250:
            boolean r2 = r25.f()
            if (r2 == 0) goto L265
            boolean r2 = r26.f()
            if (r2 == 0) goto L265
            float r2 = r0.t
            float r9 = r39 / r2
            r0.t = r9
            r2 = 1
            r0.s = r2
        L265:
            int r2 = r0.s
            r9 = -1
            if (r2 != r9) goto L2a2
            int r2 = r0.m
            if (r2 <= 0) goto L276
            int r4 = r0.p
            if (r4 != 0) goto L276
            r6 = 0
            r0.s = r6
            goto L2a2
        L276:
            if (r2 != 0) goto L2a2
            int r2 = r0.p
            if (r2 <= 0) goto L2a2
            float r2 = r0.t
            float r9 = r39 / r2
            r0.t = r9
            r2 = 1
            r0.s = r2
            goto L2a2
        L286:
            r42 = r11
            r11 = r41
        L28a:
            if (r2 != r4) goto L2a8
            r9 = 3
            if (r10 != r9) goto L2a8
            r9 = 0
            r0.s = r9
            float r2 = (float) r13
            float r9 = r35 * r2
            int r2 = (int) r9
            r40 = r2
            if (r6 == r4) goto L2a2
            r2 = r22
            r9 = 4
            r30 = 0
        L29f:
            r22 = r11
            goto L2d5
        L2a2:
            r9 = r10
        L2a3:
            r2 = r22
            r30 = 1
            goto L29f
        L2a8:
            if (r6 != r4) goto L2a2
            r9 = 3
            if (r11 != r9) goto L2a2
            r6 = 1
            r0.s = r6
            r9 = -1
            if (r8 != r9) goto L2b7
            float r9 = r39 / r35
            r0.t = r9
        L2b7:
            float r6 = r0.t
            float r7 = (float) r7
            float r6 = r6 * r7
            int r6 = (int) r6
            r27 = r6
            r9 = r10
            if (r2 == r4) goto L2a3
            r2 = r22
            r22 = 4
        L2c5:
            r30 = 0
            goto L2d5
        L2c8:
            r42 = r11
            goto L2ce
        L2cb:
            r40 = r10
            goto L2c8
        L2ce:
            r2 = r22
            r9 = r36
            r22 = r38
            goto L2c5
        L2d5:
            int[] r4 = r0.l
            r18 = 0
            r4[r18] = r9
            r20 = 1
            r4[r20] = r22
            if (r30 == 0) goto L2ec
            int r4 = r0.s
            r6 = -1
            if (r4 == 0) goto L2e8
            if (r4 != r6) goto L2ed
        L2e8:
            r4 = 1
        L2e9:
            r18 = 0
            goto L2ef
        L2ec:
            r6 = -1
        L2ed:
            r4 = 0
            goto L2e9
        L2ef:
            r7 = r28[r18]
            if (r7 != r15) goto L2fd
            boolean r7 = r0 instanceof a.O3
            if (r7 == 0) goto L2fd
            r7 = r21
            r21 = r9
            r9 = 1
            goto L302
        L2fd:
            r7 = r21
            r21 = r9
            r9 = 0
        L302:
            if (r9 == 0) goto L306
            r13 = 0
            goto L308
        L306:
            r13 = r40
        L308:
            a.M3 r8 = r0.F
            boolean r10 = r8.f()
            r20 = 1
            r26 = r10 ^ 1
            boolean[] r10 = r0.I
            r11 = r20
            r18 = 0
            boolean r20 = r10[r18]
            boolean r31 = r10[r11]
            int r10 = r0.h
            r25 = r2
            int[] r2 = r0.u
            r32 = r2
            r2 = 2
            r35 = 0
            if (r10 == r2) goto L3fc
            a.V4 r10 = r12.h
            boolean r2 = r10.j
            if (r2 == 0) goto L335
            a.V4 r2 = r12.i
            boolean r2 = r2.j
            if (r2 != 0) goto L338
        L335:
            r10 = 8
            goto L383
        L338:
            int r2 = r10.g
            r1.d(r3, r2)
            a.V4 r2 = r12.i
            int r2 = r2.g
            r1.d(r5, r2)
            a.N3 r2 = r0.K
            if (r2 == 0) goto L362
            if (r14 == 0) goto L362
            r2 = 0
            boolean r4 = r17[r2]
            if (r4 == 0) goto L362
            boolean r4 = r0.q()
            if (r4 != 0) goto L362
            a.N3 r4 = r0.K
            a.M3 r4 = r4.A
            a.le r4 = r1.j(r4)
            r10 = 8
            r1.f(r4, r5, r2, r10)
        L362:
            r47 = r3
            r48 = r5
            r49 = r7
            r37 = r8
            r3 = r14
            r54 = r15
            r52 = r16
            r18 = r23
            r19 = r24
            r2 = r25
            r4 = r29
            r50 = r33
            r51 = r34
            r53 = r42
            r29 = r28
            r28 = r17
            goto L41b
        L383:
            a.N3 r2 = r0.K
            if (r2 == 0) goto L38e
            a.M3 r2 = r2.A
            a.le r2 = r1.j(r2)
            goto L390
        L38e:
            r2 = r35
        L390:
            a.N3 r12 = r0.K
            if (r12 == 0) goto L39f
            a.M3 r12 = r12.y
            a.le r12 = r1.j(r12)
        L39a:
            r19 = r5
            r18 = 0
            goto L3a2
        L39f:
            r12 = r35
            goto L39a
        L3a2:
            boolean r5 = r17[r18]
            r37 = r8
            r8 = r28[r18]
            r38 = r6
            r6 = r12
            int r12 = r0.P
            r40 = r3
            r3 = r14
            int r14 = r0.S
            r41 = r15
            r15 = r32[r18]
            float r10 = r0.U
            int r11 = r0.m
            int r1 = r0.n
            r43 = r1
            float r1 = r0.o
            r44 = r16
            r16 = r10
            a.M3 r10 = r0.y
            r45 = r18
            r18 = r23
            r23 = r11
            a.M3 r11 = r0.A
            r46 = r7
            r7 = r2
            r2 = 1
            r47 = r17
            r17 = r4
            r4 = r29
            r29 = r28
            r28 = r47
            r48 = r19
            r19 = r24
            r55 = r25
            r50 = r33
            r51 = r34
            r47 = r40
            r54 = r41
            r53 = r42
            r24 = r43
            r52 = r44
            r49 = r46
            r25 = r1
            r1 = r59
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = r55
            goto L41b
        L3fc:
            r47 = r3
            r48 = r5
            r49 = r7
            r37 = r8
            r3 = r14
            r54 = r15
            r52 = r16
            r18 = r23
            r19 = r24
            r4 = r29
            r50 = r33
            r51 = r34
            r53 = r42
            r29 = r28
            r28 = r17
            r2 = r25
        L41b:
            a.V4 r5 = r2.h
            boolean r6 = r5.j
            if (r6 == 0) goto L462
            a.V4 r6 = r2.i
            boolean r6 = r6.j
            if (r6 == 0) goto L462
            int r5 = r5.g
            r6 = r49
            r1.d(r6, r5)
            a.V4 r5 = r2.i
            int r5 = r5.g
            r7 = r51
            r1.d(r7, r5)
            a.V4 r2 = r2.k
            int r2 = r2.g
            r5 = r53
            r1.d(r5, r2)
            a.N3 r2 = r0.K
            if (r2 == 0) goto L45e
            if (r19 != 0) goto L45e
            if (r4 == 0) goto L45e
            r8 = 1
            boolean r9 = r28[r8]
            if (r9 == 0) goto L45a
            a.M3 r2 = r2.B
            a.le r2 = r1.j(r2)
            r9 = 0
            r10 = 8
            r1.f(r2, r7, r9, r10)
            goto L460
        L45a:
            r9 = 0
            r10 = 8
            goto L460
        L45e:
            r8 = 1
            goto L45a
        L460:
            r14 = r9
            goto L46d
        L462:
            r6 = r49
            r7 = r51
            r5 = r53
            r8 = 1
            r9 = 0
            r10 = 8
            r14 = r8
        L46d:
            int r2 = r0.i
            r11 = 2
            if (r2 != r11) goto L473
            r14 = r9
        L473:
            if (r14 == 0) goto L520
            r2 = r29[r8]
            r11 = r54
            if (r2 != r11) goto L481
            boolean r2 = r0 instanceof a.O3
            if (r2 == 0) goto L481
            r14 = r8
            goto L482
        L481:
            r14 = r9
        L482:
            if (r14 == 0) goto L486
            r13 = r9
            goto L488
        L486:
            r13 = r27
        L488:
            if (r30 == 0) goto L494
            int r2 = r0.s
            if (r2 == r8) goto L491
            r11 = -1
            if (r2 != r11) goto L494
        L491:
            r17 = r8
            goto L496
        L494:
            r17 = r9
        L496:
            a.N3 r2 = r0.K
            if (r2 == 0) goto L4a1
            a.M3 r2 = r2.B
            a.le r2 = r1.j(r2)
            goto L4a3
        L4a1:
            r2 = r35
        L4a3:
            a.N3 r11 = r0.K
            if (r11 == 0) goto L4ad
            a.M3 r11 = r11.z
            a.le r35 = r1.j(r11)
        L4ad:
            int r11 = r0.R
            if (r11 > 0) goto L4b5
            int r12 = r0.X
            if (r12 != r10) goto L4db
        L4b5:
            r1.e(r5, r6, r11, r10)
            r11 = r52
            a.M3 r11 = r11.d
            if (r11 == 0) goto L4d4
            a.le r11 = r1.j(r11)
            r1.e(r5, r11, r9, r10)
            if (r4 == 0) goto L4d1
            r5 = r50
            a.le r5 = r1.j(r5)
            r10 = 5
            r1.f(r2, r5, r9, r10)
        L4d1:
            r26 = r9
            goto L4db
        L4d4:
            int r11 = r0.X
            if (r11 != r10) goto L4db
            r1.e(r5, r6, r9, r10)
        L4db:
            boolean r5 = r28[r8]
            r9 = r29[r8]
            int r12 = r0.Q
            r20 = r8
            r8 = r9
            r9 = r14
            int r14 = r0.T
            r15 = r32[r20]
            float r10 = r0.V
            int r11 = r0.p
            int r1 = r0.q
            r24 = r1
            float r1 = r0.r
            r16 = r10
            a.M3 r10 = r0.z
            r23 = r11
            a.M3 r11 = r0.B
            r34 = r7
            r7 = r2
            r2 = 0
            r20 = r4
            r4 = r3
            r3 = r20
            r20 = r19
            r19 = r18
            r18 = r20
            r20 = r22
            r22 = r21
            r21 = r20
            r25 = r1
            r56 = r6
            r20 = r31
            r57 = r34
            r6 = r35
            r1 = r59
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L524
        L520:
            r56 = r6
            r57 = r7
        L524:
            if (r30 == 0) goto L57e
            int r2 = r0.s
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = 1
            if (r2 != r10) goto L556
            float r2 = r0.t
            a.K1 r4 = r1.k()
            a.K1$a r5 = r4.d
            r7 = r57
            r5.c(r7, r3)
            a.K1$a r3 = r4.d
            r6 = r56
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.c(r6, r5)
            a.K1$a r3 = r4.d
            r8 = r48
            r3.c(r8, r2)
            a.K1$a r3 = r4.d
            float r2 = -r2
            r9 = r47
            r3.c(r9, r2)
            r1.c(r4)
            goto L57e
        L556:
            r9 = r47
            r8 = r48
            r6 = r56
            r7 = r57
            r5 = 1065353216(0x3f800000, float:1.0)
            float r2 = r0.t
            a.K1 r4 = r1.k()
            a.K1$a r10 = r4.d
            r10.c(r8, r3)
            a.K1$a r3 = r4.d
            r3.c(r9, r5)
            a.K1$a r3 = r4.d
            r3.c(r7, r2)
            a.K1$a r3 = r4.d
            float r2 = -r2
            r3.c(r6, r2)
            r1.c(r4)
        L57e:
            boolean r2 = r37.f()
            if (r2 == 0) goto L635
            r2 = r37
            a.M3 r3 = r2.d
            a.N3 r3 = r3.b
            float r4 = r0.v
            r5 = 1119092736(0x42b40000, float:90.0)
            float r4 = r4 + r5
            double r4 = (double) r4
            double r4 = java.lang.Math.toRadians(r4)
            float r4 = (float) r4
            int r2 = r2.c()
            a.M3$a r5 = a.M3.a.f172a
            a.M3 r6 = r0.g(r5)
            a.le r6 = r1.j(r6)
            a.M3$a r7 = a.M3.a.b
            a.M3 r8 = r0.g(r7)
            a.le r8 = r1.j(r8)
            a.M3$a r9 = a.M3.a.c
            a.M3 r10 = r0.g(r9)
            a.le r10 = r1.j(r10)
            a.M3$a r11 = a.M3.a.d
            a.M3 r12 = r0.g(r11)
            a.le r12 = r1.j(r12)
            a.M3 r5 = r3.g(r5)
            a.le r5 = r1.j(r5)
            a.M3 r7 = r3.g(r7)
            a.le r7 = r1.j(r7)
            a.M3 r9 = r3.g(r9)
            a.le r9 = r1.j(r9)
            a.M3 r3 = r3.g(r11)
            a.le r3 = r1.j(r3)
            a.K1 r11 = r1.k()
            double r13 = (double) r4
            double r15 = java.lang.Math.sin(r13)
            r17 = r13
            double r13 = (double) r2
            r19 = r13
            double r13 = r15 * r19
            float r2 = (float) r13
            a.K1$a r4 = r11.d
            r13 = 1056964608(0x3f000000, float:0.5)
            r4.c(r7, r13)
            a.K1$a r4 = r11.d
            r4.c(r3, r13)
            a.K1$a r3 = r11.d
            r4 = -1090519040(0xffffffffbf000000, float:-0.5)
            r3.c(r8, r4)
            a.K1$a r3 = r11.d
            r3.c(r12, r4)
            float r2 = -r2
            r11.b = r2
            r1.c(r11)
            a.K1 r2 = r1.k()
            double r7 = java.lang.Math.cos(r17)
            double r7 = r7 * r19
            float r3 = (float) r7
            a.K1$a r7 = r2.d
            r7.c(r5, r13)
            a.K1$a r5 = r2.d
            r5.c(r9, r13)
            a.K1$a r5 = r2.d
            r5.c(r6, r4)
            a.K1$a r5 = r2.d
            r5.c(r10, r4)
            float r3 = -r3
            r2.b = r3
            r1.c(r2)
        L635:
            return
    }

    public boolean b() {
            r2 = this;
            int r0 = r2.X
            r1 = 8
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final void c(a.B9 r28, boolean r29, boolean r30, boolean r31, boolean r32, a.C0251le r33, a.C0251le r34, a.N3.a r35, boolean r36, a.M3 r37, a.M3 r38, int r39, int r40, int r41, int r42, float r43, boolean r44, boolean r45, boolean r46, boolean r47, int r48, int r49, int r50, int r51, float r52, boolean r53) {
            r27 = this;
            r0 = r27
            r1 = r28
            r12 = r37
            r13 = r38
            r14 = r41
            r2 = r42
            r4 = r50
            r5 = r51
            r6 = r52
            a.le r7 = r1.j(r12)
            a.le r8 = r1.j(r13)
            a.M3 r9 = r12.d
            a.le r9 = r1.j(r9)
            a.M3 r15 = r13.d
            a.le r15 = r1.j(r15)
            boolean r16 = r12.f()
            boolean r17 = r13.f()
            a.M3 r11 = r0.F
            boolean r11 = r11.f()
            if (r17 == 0) goto L39
            int r18 = r16 + 1
            goto L3b
        L39:
            r18 = r16
        L3b:
            if (r11 == 0) goto L3f
            int r18 = r18 + 1
        L3f:
            r19 = r11
            r11 = r18
            if (r44 == 0) goto L47
            r3 = 3
            goto L49
        L47:
            r3 = r48
        L49:
            int r13 = r35.ordinal()
            if (r13 == 0) goto L55
            r10 = 1
            if (r13 == r10) goto L55
            r10 = 2
            if (r13 == r10) goto L57
        L55:
            r13 = 0
            goto L5c
        L57:
            r10 = 4
            if (r3 != r10) goto L5b
            goto L55
        L5b:
            r13 = 1
        L5c:
            int r10 = r0.X
            r21 = r13
            r13 = 8
            if (r10 != r13) goto L68
            r10 = 0
            r21 = 0
            goto L6a
        L68:
            r10 = r40
        L6a:
            if (r53 == 0) goto L8c
            if (r16 != 0) goto L7c
            if (r17 != 0) goto L7c
            if (r19 != 0) goto L7c
            r13 = r39
            r1.d(r7, r13)
        L77:
            r23 = r15
            r15 = 8
            goto L8f
        L7c:
            if (r16 == 0) goto L77
            if (r17 != 0) goto L77
            int r13 = r12.c()
            r23 = r15
            r15 = 8
            r1.e(r7, r9, r13, r15)
            goto L8f
        L8c:
            r23 = r15
            r15 = r13
        L8f:
            if (r21 != 0) goto Lae
            if (r36 == 0) goto La6
            r6 = 3
            r13 = 0
            r1.e(r8, r7, r13, r6)
            if (r14 <= 0) goto L9d
            r1.f(r8, r7, r14, r15)
        L9d:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r6) goto La9
            r1.g(r8, r7, r2, r15)
            goto La9
        La6:
            r1.e(r8, r7, r10, r15)
        La9:
            r10 = r32
            r13 = r4
            goto L177
        Lae:
            r2 = 2
            if (r11 == r2) goto Lce
            if (r44 != 0) goto Lce
            r2 = 1
            if (r3 == r2) goto Lb8
            if (r3 != 0) goto Lce
        Lb8:
            int r2 = java.lang.Math.max(r4, r10)
            if (r5 <= 0) goto Lc2
            int r2 = java.lang.Math.min(r5, r2)
        Lc2:
            r15 = 8
            r1.e(r8, r7, r2, r15)
            r10 = r32
            r13 = r4
        Lca:
            r21 = 0
            goto L177
        Lce:
            r2 = -2
            if (r4 != r2) goto Ld2
            r4 = r10
        Ld2:
            if (r5 != r2) goto Ld5
            r5 = r10
        Ld5:
            if (r10 <= 0) goto Ldb
            r2 = 1
            if (r3 == r2) goto Ldb
            r10 = 0
        Ldb:
            r15 = 8
            if (r4 <= 0) goto Le6
            r1.f(r8, r7, r4, r15)
            int r10 = java.lang.Math.max(r10, r4)
        Le6:
            r2 = 1
            if (r5 <= 0) goto Lf5
            if (r30 == 0) goto Lee
            if (r3 != r2) goto Lee
            goto Lf1
        Lee:
            r1.g(r8, r7, r5, r15)
        Lf1:
            int r10 = java.lang.Math.min(r10, r5)
        Lf5:
            if (r3 != r2) goto L10f
            if (r30 == 0) goto Lfd
            r1.e(r8, r7, r10, r15)
            goto La9
        Lfd:
            if (r45 == 0) goto L107
            r2 = 5
            r1.e(r8, r7, r10, r2)
            r1.g(r8, r7, r10, r15)
            goto La9
        L107:
            r2 = 5
            r1.e(r8, r7, r10, r2)
            r1.g(r8, r7, r10, r15)
            goto La9
        L10f:
            r10 = 2
            if (r3 != r10) goto L172
            a.M3$a r2 = a.M3.a.b
            a.M3$a r10 = a.M3.a.d
            a.M3$a r13 = r12.c
            if (r13 == r2) goto L136
            if (r13 != r10) goto L11d
            goto L136
        L11d:
            a.N3 r2 = r0.K
            a.M3$a r10 = a.M3.a.f172a
            a.M3 r2 = r2.g(r10)
            a.le r2 = r1.j(r2)
            a.N3 r10 = r0.K
            a.M3$a r13 = a.M3.a.c
            a.M3 r10 = r10.g(r13)
            a.le r10 = r1.j(r10)
            goto L14a
        L136:
            a.N3 r13 = r0.K
            a.M3 r2 = r13.g(r2)
            a.le r2 = r1.j(r2)
            a.N3 r13 = r0.K
            a.M3 r10 = r13.g(r10)
            a.le r10 = r1.j(r10)
        L14a:
            a.K1 r13 = r1.k()
            a.K1$a r15 = r13.d
            r36 = r4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r15.c(r8, r4)
            a.K1$a r4 = r13.d
            r15 = 1065353216(0x3f800000, float:1.0)
            r4.c(r7, r15)
            a.K1$a r4 = r13.d
            r4.c(r10, r6)
            a.K1$a r4 = r13.d
            float r6 = -r6
            r4.c(r2, r6)
            r1.c(r13)
            r10 = r32
            r13 = r36
            goto Lca
        L172:
            r36 = r4
            r13 = r36
            r10 = 1
        L177:
            if (r53 == 0) goto L17b
            if (r45 == 0) goto L186
        L17b:
            r15 = r33
            r3 = r34
            r2 = r7
            r7 = r8
            r32 = r10
            r10 = 2
            goto L3a6
        L186:
            if (r16 != 0) goto L195
            if (r17 != 0) goto L195
            if (r19 != 0) goto L195
        L18c:
            r12 = r38
            r7 = r8
            r32 = r10
            r6 = r23
            goto L38e
        L195:
            if (r16 == 0) goto L19a
            if (r17 != 0) goto L19a
            goto L18c
        L19a:
            if (r16 != 0) goto L1ba
            if (r17 == 0) goto L1ba
            int r2 = r38.c()
            int r2 = -r2
            r6 = r23
            r15 = 8
            r1.e(r8, r6, r2, r15)
            if (r30 == 0) goto L1b3
            r15 = r33
            r2 = 5
            r13 = 0
            r1.f(r7, r15, r13, r2)
        L1b3:
            r12 = r38
            r7 = r8
            r32 = r10
            goto L38e
        L1ba:
            r15 = r33
            r6 = r23
            if (r16 == 0) goto L1b3
            if (r17 == 0) goto L1b3
            a.M3 r2 = r12.d
            a.N3 r11 = r2.b
            r2 = r38
            a.M3 r4 = r2.d
            a.N3 r4 = r4.b
            r32 = r10
            a.N3 r10 = r0.K
            r16 = 6
            if (r21 == 0) goto L27f
            if (r3 != 0) goto L1fe
            if (r5 != 0) goto L1e2
            if (r13 != 0) goto L1e2
            r5 = 0
            r17 = 1
            r19 = 8
            r23 = 8
            goto L1e9
        L1e2:
            r5 = 1
            r17 = 0
            r19 = 5
            r23 = 5
        L1e9:
            boolean r1 = r11 instanceof a.V1
            if (r1 != 0) goto L1f7
            boolean r1 = r4 instanceof a.V1
            if (r1 == 0) goto L1f2
            goto L1f7
        L1f2:
            r2 = r16
            r1 = 0
            goto L284
        L1f7:
            r2 = r16
            r1 = 0
        L1fa:
            r23 = 4
            goto L284
        L1fe:
            r1 = 1
            if (r3 != r1) goto L20a
            r2 = r16
            r1 = 1
            r5 = 1
            r17 = 0
            r19 = 8
            goto L1fa
        L20a:
            r1 = 3
            if (r3 != r1) goto L278
            int r1 = r0.s
            r2 = -1
            if (r1 != r2) goto L227
            if (r46 == 0) goto L223
            r1 = 1
            if (r30 == 0) goto L221
            r2 = 5
        L218:
            r5 = 1
            r17 = 1
            r19 = 8
        L21d:
            r23 = 5
            goto L284
        L221:
            r2 = 4
            goto L218
        L223:
            r1 = 1
            r2 = 8
            goto L218
        L227:
            if (r44 == 0) goto L243
            r1 = r49
            r2 = 2
            if (r1 == r2) goto L236
            r2 = 1
            if (r1 != r2) goto L232
            goto L236
        L232:
            r1 = 8
            r2 = 5
            goto L238
        L236:
            r1 = 5
            r2 = 4
        L238:
            r19 = r1
            r23 = r2
            r2 = r16
            r1 = 1
            r5 = 1
            r17 = 1
            goto L284
        L243:
            if (r5 <= 0) goto L24e
            r2 = r16
            r1 = 1
            r5 = 1
            r17 = 1
            r19 = 5
            goto L21d
        L24e:
            if (r5 != 0) goto L26f
            if (r13 != 0) goto L26f
            if (r46 != 0) goto L25f
            r2 = r16
            r1 = 1
            r5 = 1
            r17 = 1
            r19 = 5
            r23 = 8
            goto L284
        L25f:
            if (r11 == r10) goto L265
            if (r4 == r10) goto L265
            r1 = 4
            goto L266
        L265:
            r1 = 5
        L266:
            r19 = r1
            r2 = r16
            r1 = 1
            r5 = 1
            r17 = 1
            goto L1fa
        L26f:
            r2 = r16
            r1 = 1
            r5 = 1
            r17 = 1
        L275:
            r19 = 5
            goto L1fa
        L278:
            r2 = r16
            r1 = 0
            r5 = 0
        L27c:
            r17 = 0
            goto L275
        L27f:
            r2 = r16
            r1 = 1
            r5 = 1
            goto L27c
        L284:
            if (r1 == 0) goto L28f
            if (r9 != r6) goto L28f
            if (r11 == r10) goto L28f
            r24 = 0
            r25 = 0
            goto L293
        L28f:
            r24 = r1
            r25 = 1
        L293:
            if (r5 == 0) goto L2bc
            int r1 = r0.X
            r5 = 8
            if (r1 != r5) goto L29c
            r2 = 4
        L29c:
            r1 = r4
            int r4 = r12.c()
            r22 = r3
            r3 = r9
            r9 = r2
            r2 = r7
            r7 = r8
            int r8 = r38.c()
            r12 = r38
            r26 = r1
            r36 = r13
            r14 = r22
            r1 = r28
            r13 = r5
            r5 = r43
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L2ca
        L2bc:
            r1 = r28
            r12 = r38
            r14 = r3
            r26 = r4
            r2 = r7
            r7 = r8
            r3 = r9
            r36 = r13
            r13 = 8
        L2ca:
            int r4 = r0.X
            if (r4 != r13) goto L2d0
            goto L3e6
        L2d0:
            if (r24 == 0) goto L2fe
            if (r30 == 0) goto L2e8
            if (r3 == r6) goto L2e8
            if (r21 != 0) goto L2e8
            boolean r4 = r11 instanceof a.V1
            if (r4 != 0) goto L2e3
            r4 = r26
            boolean r5 = r4 instanceof a.V1
            if (r5 == 0) goto L2ea
            goto L2e5
        L2e3:
            r4 = r26
        L2e5:
            r5 = r16
            goto L2ec
        L2e8:
            r4 = r26
        L2ea:
            r5 = r19
        L2ec:
            int r8 = r37.c()
            r1.f(r2, r3, r8, r5)
            int r8 = r12.c()
            int r8 = -r8
            r1.g(r7, r6, r8, r5)
            r19 = r5
            goto L300
        L2fe:
            r4 = r26
        L300:
            if (r30 == 0) goto L312
            if (r47 == 0) goto L312
            boolean r5 = r11 instanceof a.V1
            if (r5 != 0) goto L312
            boolean r5 = r4 instanceof a.V1
            if (r5 != 0) goto L312
            r5 = r16
            r8 = r5
            r25 = 1
            goto L316
        L312:
            r5 = r19
            r8 = r23
        L316:
            if (r25 == 0) goto L365
            if (r17 == 0) goto L343
            if (r46 == 0) goto L31e
            if (r31 == 0) goto L343
        L31e:
            if (r11 == r10) goto L325
            if (r4 != r10) goto L323
            goto L325
        L323:
            r16 = r8
        L325:
            boolean r9 = r11 instanceof a.C0046a8
            if (r9 != 0) goto L32d
            boolean r9 = r4 instanceof a.C0046a8
            if (r9 == 0) goto L32f
        L32d:
            r16 = 5
        L32f:
            boolean r9 = r11 instanceof a.V1
            if (r9 != 0) goto L337
            boolean r9 = r4 instanceof a.V1
            if (r9 == 0) goto L339
        L337:
            r16 = 5
        L339:
            if (r46 == 0) goto L33d
            r9 = 5
            goto L33f
        L33d:
            r9 = r16
        L33f:
            int r8 = java.lang.Math.max(r9, r8)
        L343:
            if (r30 == 0) goto L355
            int r5 = java.lang.Math.min(r5, r8)
            if (r44 == 0) goto L353
            if (r46 != 0) goto L353
            if (r11 == r10) goto L351
            if (r4 != r10) goto L353
        L351:
            r10 = 4
            goto L356
        L353:
            r10 = r5
            goto L356
        L355:
            r10 = r8
        L356:
            int r4 = r37.c()
            r1.e(r2, r3, r4, r10)
            int r4 = r12.c()
            int r4 = -r4
            r1.e(r7, r6, r4, r10)
        L365:
            if (r30 == 0) goto L375
            if (r15 != r3) goto L36e
            int r4 = r37.c()
            goto L36f
        L36e:
            r4 = 0
        L36f:
            if (r3 == r15) goto L375
            r3 = 5
            r1.f(r2, r15, r4, r3)
        L375:
            if (r30 == 0) goto L38e
            if (r21 == 0) goto L38e
            if (r41 != 0) goto L38e
            if (r36 != 0) goto L38e
            if (r21 == 0) goto L389
            r3 = 3
            if (r14 != r3) goto L389
            r13 = 0
            r15 = 8
            r1.f(r7, r2, r13, r15)
            goto L38e
        L389:
            r13 = 0
            r3 = 5
            r1.f(r7, r2, r13, r3)
        L38e:
            if (r30 == 0) goto L3e6
            if (r32 == 0) goto L3e6
            a.M3 r2 = r12.d
            if (r2 == 0) goto L39d
            int r10 = r12.c()
        L39a:
            r3 = r34
            goto L39f
        L39d:
            r10 = 0
            goto L39a
        L39f:
            if (r6 == r3) goto L3e6
            r2 = 5
            r1.f(r3, r7, r10, r2)
            return
        L3a6:
            if (r11 >= r10) goto L3e6
            if (r30 == 0) goto L3e6
            if (r32 == 0) goto L3e6
            r5 = 8
            r13 = 0
            r1.f(r2, r15, r13, r5)
            a.M3 r2 = r0.C
            if (r29 != 0) goto L3bd
            a.M3 r4 = r2.d
            if (r4 != 0) goto L3bb
            goto L3bd
        L3bb:
            r10 = 0
            goto L3be
        L3bd:
            r10 = 1
        L3be:
            if (r29 != 0) goto L3de
            a.M3 r2 = r2.d
            if (r2 == 0) goto L3de
            a.N3 r2 = r2.b
            float r4 = r2.N
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L3dd
            a.N3$a[] r2 = r2.J
            r20 = 0
            r4 = r2[r20]
            a.N3$a r5 = a.N3.a.c
            if (r4 != r5) goto L3dd
            r10 = 1
            r2 = r2[r10]
            if (r2 != r5) goto L3dd
            goto L3de
        L3dd:
            r10 = 0
        L3de:
            if (r10 == 0) goto L3e6
            r13 = 0
            r15 = 8
            r1.f(r3, r7, r13, r15)
        L3e6:
            return
    }

    public final void d(a.M3.a r11, a.N3 r12, a.M3.a r13, int r14) {
            r10 = this;
            a.M3$a r0 = a.M3.a.f
            a.M3$a r1 = a.M3.a.h
            a.M3$a r2 = a.M3.a.g
            a.M3$a r3 = a.M3.a.f172a
            a.M3$a r4 = a.M3.a.b
            a.M3$a r5 = a.M3.a.c
            a.M3$a r6 = a.M3.a.d
            r7 = 0
            if (r11 != r0) goto Lae
            if (r13 != r0) goto L81
            a.M3 r11 = r10.g(r3)
            a.M3 r13 = r10.g(r5)
            a.M3 r14 = r10.g(r4)
            a.M3 r8 = r10.g(r6)
            r9 = 1
            if (r11 == 0) goto L2c
            boolean r11 = r11.f()
            if (r11 != 0) goto L34
        L2c:
            if (r13 == 0) goto L36
            boolean r11 = r13.f()
            if (r11 == 0) goto L36
        L34:
            r11 = r7
            goto L3d
        L36:
            r10.d(r3, r12, r3, r7)
            r10.d(r5, r12, r5, r7)
            r11 = r9
        L3d:
            if (r14 == 0) goto L45
            boolean r13 = r14.f()
            if (r13 != 0) goto L4d
        L45:
            if (r8 == 0) goto L4f
            boolean r13 = r8.f()
            if (r13 == 0) goto L4f
        L4d:
            r9 = r7
            goto L55
        L4f:
            r10.d(r4, r12, r4, r7)
            r10.d(r6, r12, r6, r7)
        L55:
            if (r11 == 0) goto L65
            if (r9 == 0) goto L65
            a.M3 r11 = r10.g(r0)
            a.M3 r12 = r12.g(r0)
            r11.a(r12, r7)
            return
        L65:
            if (r11 == 0) goto L73
            a.M3 r11 = r10.g(r2)
            a.M3 r12 = r12.g(r2)
            r11.a(r12, r7)
            return
        L73:
            if (r9 == 0) goto L1bc
            a.M3 r11 = r10.g(r1)
            a.M3 r12 = r12.g(r1)
            r11.a(r12, r7)
            return
        L81:
            if (r13 == r3) goto L9c
            if (r13 != r5) goto L86
            goto L9c
        L86:
            if (r13 == r4) goto L8a
            if (r13 != r6) goto L1bc
        L8a:
            r10.d(r4, r12, r13, r7)
            r10.d(r6, r12, r13, r7)
            a.M3 r11 = r10.g(r0)
            a.M3 r12 = r12.g(r13)
            r11.a(r12, r7)
            return
        L9c:
            r10.d(r3, r12, r13, r7)
            r10.d(r5, r12, r13, r7)
            a.M3 r11 = r10.g(r0)
            a.M3 r12 = r12.g(r13)
            r11.a(r12, r7)
            return
        Lae:
            if (r11 != r2) goto Lce
            if (r13 == r3) goto Lb4
            if (r13 != r5) goto Lce
        Lb4:
            a.M3 r11 = r10.g(r3)
            a.M3 r12 = r12.g(r13)
            a.M3 r13 = r10.g(r5)
            r11.a(r12, r7)
            r13.a(r12, r7)
            a.M3 r11 = r10.g(r2)
            r11.a(r12, r7)
            return
        Lce:
            if (r11 != r1) goto Lee
            if (r13 == r4) goto Ld4
            if (r13 != r6) goto Lee
        Ld4:
            a.M3 r11 = r12.g(r13)
            a.M3 r12 = r10.g(r4)
            r12.a(r11, r7)
            a.M3 r12 = r10.g(r6)
            r12.a(r11, r7)
            a.M3 r12 = r10.g(r1)
            r12.a(r11, r7)
            return
        Lee:
            if (r11 != r2) goto L114
            if (r13 != r2) goto L114
            a.M3 r11 = r10.g(r3)
            a.M3 r14 = r12.g(r3)
            r11.a(r14, r7)
            a.M3 r11 = r10.g(r5)
            a.M3 r14 = r12.g(r5)
            r11.a(r14, r7)
            a.M3 r11 = r10.g(r2)
            a.M3 r12 = r12.g(r13)
            r11.a(r12, r7)
            return
        L114:
            if (r11 != r1) goto L13a
            if (r13 != r1) goto L13a
            a.M3 r11 = r10.g(r4)
            a.M3 r14 = r12.g(r4)
            r11.a(r14, r7)
            a.M3 r11 = r10.g(r6)
            a.M3 r14 = r12.g(r6)
            r11.a(r14, r7)
            a.M3 r11 = r10.g(r1)
            a.M3 r12 = r12.g(r13)
            r11.a(r12, r7)
            return
        L13a:
            a.M3 r8 = r10.g(r11)
            a.M3 r12 = r12.g(r13)
            boolean r13 = r8.g(r12)
            if (r13 == 0) goto L1bc
            a.M3$a r13 = a.M3.a.e
            if (r11 != r13) goto L160
            a.M3 r11 = r10.g(r4)
            a.M3 r13 = r10.g(r6)
            if (r11 == 0) goto L159
            r11.h()
        L159:
            if (r13 == 0) goto L15e
            r13.h()
        L15e:
            r14 = r7
            goto L1b9
        L160:
            if (r11 == r4) goto L18d
            if (r11 != r6) goto L165
            goto L18d
        L165:
            if (r11 == r3) goto L169
            if (r11 != r5) goto L1b9
        L169:
            a.M3 r13 = r10.g(r0)
            a.M3 r0 = r13.d
            if (r0 == r12) goto L174
            r13.h()
        L174:
            a.M3 r11 = r10.g(r11)
            a.M3 r11 = r11.d()
            a.M3 r13 = r10.g(r2)
            boolean r0 = r13.f()
            if (r0 == 0) goto L1b9
            r11.h()
            r13.h()
            goto L1b9
        L18d:
            a.M3 r13 = r10.g(r13)
            if (r13 == 0) goto L196
            r13.h()
        L196:
            a.M3 r13 = r10.g(r0)
            a.M3 r0 = r13.d
            if (r0 == r12) goto L1a1
            r13.h()
        L1a1:
            a.M3 r11 = r10.g(r11)
            a.M3 r11 = r11.d()
            a.M3 r13 = r10.g(r1)
            boolean r0 = r13.f()
            if (r0 == 0) goto L1b9
            r11.h()
            r13.h()
        L1b9:
            r8.a(r12, r14)
        L1bc:
            return
    }

    public final void e(a.M3 r2, a.M3 r3, int r4) {
            r1 = this;
            a.N3 r0 = r2.b
            if (r0 != r1) goto Ld
            a.N3 r0 = r3.b
            a.M3$a r2 = r2.c
            a.M3$a r3 = r3.c
            r1.d(r2, r0, r3, r4)
        Ld:
            return
    }

    public final void f(a.B9 r2) {
            r1 = this;
            a.M3 r0 = r1.y
            r2.j(r0)
            a.M3 r0 = r1.z
            r2.j(r0)
            a.M3 r0 = r1.A
            r2.j(r0)
            a.M3 r0 = r1.B
            r2.j(r0)
            int r0 = r1.R
            if (r0 <= 0) goto L1d
            a.M3 r0 = r1.C
            r2.j(r0)
        L1d:
            return
    }

    public a.M3 g(a.M3.a r2) {
            r1 = this;
            int r0 = r2.ordinal()
            switch(r0) {
                case 0: goto L29;
                case 1: goto L26;
                case 2: goto L23;
                case 3: goto L20;
                case 4: goto L1d;
                case 5: goto L1a;
                case 6: goto L17;
                case 7: goto L14;
                case 8: goto L11;
                default: goto L7;
            }
        L7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r2 = r2.name()
            r0.<init>(r2)
            throw r0
        L11:
            a.M3 r2 = r1.E
            return r2
        L14:
            a.M3 r2 = r1.D
            return r2
        L17:
            a.M3 r2 = r1.F
            return r2
        L1a:
            a.M3 r2 = r1.C
            return r2
        L1d:
            a.M3 r2 = r1.B
            return r2
        L20:
            a.M3 r2 = r1.A
            return r2
        L23:
            a.M3 r2 = r1.z
            return r2
        L26:
            a.M3 r2 = r1.y
            return r2
        L29:
            r2 = 0
            return r2
    }

    public final a.N3.a h(int r3) {
            r2 = this;
            a.N3$a[] r0 = r2.J
            if (r3 != 0) goto L8
            r3 = 0
            r3 = r0[r3]
            return r3
        L8:
            r1 = 1
            if (r3 != r1) goto Le
            r3 = r0[r1]
            return r3
        Le:
            r3 = 0
            return r3
    }

    public final int i() {
            r2 = this;
            int r0 = r2.X
            r1 = 8
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.M
            return r0
    }

    public final a.N3 j(int r3) {
            r2 = this;
            if (r3 != 0) goto Lf
            a.M3 r3 = r2.A
            a.M3 r0 = r3.d
            if (r0 == 0) goto L1f
            a.M3 r1 = r0.d
            if (r1 != r3) goto L1f
            a.N3 r3 = r0.b
            return r3
        Lf:
            r0 = 1
            if (r3 != r0) goto L1f
            a.M3 r3 = r2.B
            a.M3 r0 = r3.d
            if (r0 == 0) goto L1f
            a.M3 r1 = r0.d
            if (r1 != r3) goto L1f
            a.N3 r3 = r0.b
            return r3
        L1f:
            r3 = 0
            return r3
    }

    public final a.N3 k(int r3) {
            r2 = this;
            if (r3 != 0) goto Lf
            a.M3 r3 = r2.y
            a.M3 r0 = r3.d
            if (r0 == 0) goto L1f
            a.M3 r1 = r0.d
            if (r1 != r3) goto L1f
            a.N3 r3 = r0.b
            return r3
        Lf:
            r0 = 1
            if (r3 != r0) goto L1f
            a.M3 r3 = r2.z
            a.M3 r0 = r3.d
            if (r0 == 0) goto L1f
            a.M3 r1 = r0.d
            if (r1 != r3) goto L1f
            a.N3 r3 = r0.b
            return r3
        L1f:
            r3 = 0
            return r3
    }

    public final int l() {
            r2 = this;
            int r0 = r2.X
            r1 = 8
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.L
            return r0
    }

    public final int m() {
            r2 = this;
            a.N3 r0 = r2.K
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof a.O3
            if (r1 == 0) goto L10
            a.O3 r0 = (a.O3) r0
            int r0 = r0.k0
            int r1 = r2.P
            int r0 = r0 + r1
            return r0
        L10:
            int r0 = r2.P
            return r0
    }

    public final int n() {
            r2 = this;
            a.N3 r0 = r2.K
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof a.O3
            if (r1 == 0) goto L10
            a.O3 r0 = (a.O3) r0
            int r0 = r0.l0
            int r1 = r2.Q
            int r0 = r0 + r1
            return r0
        L10:
            int r0 = r2.Q
            return r0
    }

    public final void o(a.M3.a r1, a.N3 r2, a.M3.a r3, int r4, int r5) {
            r0 = this;
            a.M3 r1 = r0.g(r1)
            a.M3 r2 = r2.g(r3)
            r3 = 1
            r1.b(r2, r4, r5, r3)
            return
    }

    public final boolean p(int r4) {
            r3 = this;
            int r4 = r4 * 2
            a.M3[] r0 = r3.G
            r1 = r0[r4]
            a.M3 r2 = r1.d
            if (r2 == 0) goto L1b
            a.M3 r2 = r2.d
            if (r2 == r1) goto L1b
            r1 = 1
            int r4 = r4 + r1
            r4 = r0[r4]
            a.M3 r0 = r4.d
            if (r0 == 0) goto L1b
            a.M3 r0 = r0.d
            if (r0 != r4) goto L1b
            return r1
        L1b:
            r4 = 0
            return r4
    }

    public final boolean q() {
            r2 = this;
            a.M3 r0 = r2.y
            a.M3 r1 = r0.d
            if (r1 == 0) goto La
            a.M3 r1 = r1.d
            if (r1 == r0) goto L14
        La:
            a.M3 r0 = r2.A
            a.M3 r1 = r0.d
            if (r1 == 0) goto L16
            a.M3 r1 = r1.d
            if (r1 != r0) goto L16
        L14:
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public final boolean r() {
            r2 = this;
            a.M3 r0 = r2.z
            a.M3 r1 = r0.d
            if (r1 == 0) goto La
            a.M3 r1 = r1.d
            if (r1 == r0) goto L14
        La:
            a.M3 r0 = r2.B
            a.M3 r1 = r0.d
            if (r1 == 0) goto L16
            a.M3 r1 = r1.d
            if (r1 != r0) goto L16
        L14:
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public void s() {
            r6 = this;
            a.M3 r0 = r6.y
            r0.h()
            a.M3 r0 = r6.z
            r0.h()
            a.M3 r0 = r6.A
            r0.h()
            a.M3 r0 = r6.B
            r0.h()
            a.M3 r0 = r6.C
            r0.h()
            a.M3 r0 = r6.D
            r0.h()
            a.M3 r0 = r6.E
            r0.h()
            a.M3 r0 = r6.F
            r0.h()
            r0 = 0
            r6.K = r0
            r1 = 0
            r6.v = r1
            r2 = 0
            r6.L = r2
            r6.M = r2
            r6.N = r1
            r1 = -1
            r6.O = r1
            r6.P = r2
            r6.Q = r2
            r6.R = r2
            r6.S = r2
            r6.T = r2
            r3 = 1056964608(0x3f000000, float:0.5)
            r6.U = r3
            r6.V = r3
            a.N3$a r3 = a.N3.a.f181a
            a.N3$a[] r4 = r6.J
            r4[r2] = r3
            r5 = 1
            r4[r5] = r3
            r6.W = r0
            r6.X = r2
            r6.Z = r2
            r6.a0 = r2
            float[] r0 = r6.b0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0[r2] = r3
            r0[r5] = r3
            r6.h = r1
            r6.i = r1
            int[] r0 = r6.u
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0[r2] = r3
            r0[r5] = r3
            r6.j = r2
            r6.k = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.o = r0
            r6.r = r0
            r6.n = r3
            r6.q = r3
            r6.m = r2
            r6.p = r2
            r6.s = r1
            r6.t = r0
            boolean[] r0 = r6.f
            r0[r2] = r5
            r0[r5] = r5
            boolean[] r0 = r6.I
            r0[r2] = r2
            r0[r5] = r2
            return
    }

    public final void t() {
            r4 = this;
            a.N3 r0 = r4.K
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof a.O3
            if (r1 == 0) goto Ld
            a.O3 r0 = (a.O3) r0
            r0.getClass()
        Ld:
            java.util.ArrayList<a.M3> r0 = r4.H
            int r1 = r0.size()
            r2 = 0
        L14:
            if (r2 >= r1) goto L22
            java.lang.Object r3 = r0.get(r2)
            a.M3 r3 = (a.M3) r3
            r3.h()
            int r2 = r2 + 1
            goto L14
        L22:
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r2 = r4.Y
            if (r2 == 0) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "id: "
            r1.<init>(r2)
            java.lang.String r2 = r4.Y
            java.lang.String r3 = " "
            java.lang.String r1 = a.C0487z.h(r1, r2, r3)
        L1d:
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            int r1 = r4.P
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r1 = r4.Q
            r0.append(r1)
            java.lang.String r1 = ") - ("
            r0.append(r1)
            int r1 = r4.L
            r0.append(r1)
            java.lang.String r1 = " x "
            r0.append(r1)
            int r1 = r4.M
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void u(a.A2 r1) {
            r0 = this;
            a.M3 r1 = r0.y
            r1.i()
            a.M3 r1 = r0.z
            r1.i()
            a.M3 r1 = r0.A
            r1.i()
            a.M3 r1 = r0.B
            r1.i()
            a.M3 r1 = r0.C
            r1.i()
            a.M3 r1 = r0.F
            r1.i()
            a.M3 r1 = r0.D
            r1.i()
            a.M3 r1 = r0.E
            r1.i()
            return
    }

    public final void v(int r2) {
            r1 = this;
            r1.M = r2
            int r0 = r1.T
            if (r2 >= r0) goto L8
            r1.M = r0
        L8:
            return
    }

    public final void w(a.N3.a r3) {
            r2 = this;
            a.N3$a[] r0 = r2.J
            r1 = 0
            r0[r1] = r3
            return
    }

    public final void x(a.N3.a r3) {
            r2 = this;
            a.N3$a[] r0 = r2.J
            r1 = 1
            r0[r1] = r3
            return
    }

    public final void y(int r2) {
            r1 = this;
            r1.L = r2
            int r0 = r1.S
            if (r2 >= r0) goto L8
            r1.L = r0
        L8:
            return
    }

    public void z(boolean r8, boolean r9) {
            r7 = this;
            a.K8 r0 = r7.d
            boolean r1 = r0.g
            r8 = r8 & r1
            a.og r1 = r7.e
            boolean r2 = r1.g
            r9 = r9 & r2
            a.V4 r2 = r0.h
            int r2 = r2.g
            a.V4 r3 = r1.h
            int r3 = r3.g
            a.V4 r0 = r0.i
            int r0 = r0.g
            a.V4 r1 = r1.i
            int r1 = r1.g
            int r4 = r0 - r2
            int r5 = r1 - r3
            r6 = 0
            if (r4 < 0) goto L38
            if (r5 < 0) goto L38
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r4) goto L38
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r5) goto L38
            if (r3 == r4) goto L38
            if (r3 == r5) goto L38
            if (r0 == r4) goto L38
            if (r0 == r5) goto L38
            if (r1 == r4) goto L38
            if (r1 != r5) goto L3c
        L38:
            r0 = r6
            r1 = r0
            r2 = r1
            r3 = r2
        L3c:
            int r0 = r0 - r2
            int r1 = r1 - r3
            if (r8 == 0) goto L42
            r7.P = r2
        L42:
            if (r9 == 0) goto L46
            r7.Q = r3
        L46:
            int r2 = r7.X
            r3 = 8
            if (r2 != r3) goto L51
            r7.L = r6
            r7.M = r6
            return
        L51:
            a.N3$a r2 = a.N3.a.f181a
            a.N3$a[] r3 = r7.J
            if (r8 == 0) goto L68
            r8 = r3[r6]
            if (r8 != r2) goto L60
            int r8 = r7.L
            if (r0 >= r8) goto L60
            r0 = r8
        L60:
            r7.L = r0
            int r8 = r7.S
            if (r0 >= r8) goto L68
            r7.L = r8
        L68:
            if (r9 == 0) goto L7c
            r8 = 1
            r8 = r3[r8]
            if (r8 != r2) goto L74
            int r8 = r7.M
            if (r1 >= r8) goto L74
            r1 = r8
        L74:
            r7.M = r1
            int r8 = r7.T
            if (r1 >= r8) goto L7c
            r7.M = r8
        L7c:
            return
    }
}
