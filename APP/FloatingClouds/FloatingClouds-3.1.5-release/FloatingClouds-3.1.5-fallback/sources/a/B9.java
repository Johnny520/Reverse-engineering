package a;

/* JADX INFO: loaded from: classes.dex */
public final class B9 {
    public static int o = 1000;
    public static boolean p = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29a;
    public final a.Hc b;
    public int c;
    public int d;
    public a.K1[] e;
    public boolean f;
    public boolean[] g;
    public int h;
    public int i;
    public int j;
    public final a.A2 k;
    public a.C0251le[] l;
    public int m;
    public a.K1 n;

    public interface a {
        a.C0251le a(boolean[] r1);
    }

    public class b extends a.K1 {
        public b(a.A2 r2) {
                r1 = this;
                r1.<init>()
                a.me r0 = new a.me
                r0.<init>(r1, r2)
                r1.d = r0
                return
        }
    }

    public B9() {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f29a = r0
            r1 = 32
            r5.c = r1
            r5.d = r1
            r2 = 0
            r5.e = r2
            r5.f = r0
            boolean[] r2 = new boolean[r1]
            r5.g = r2
            r2 = 1
            r5.h = r2
            r5.i = r0
            r5.j = r1
            int r2 = a.B9.o
            a.le[] r2 = new a.C0251le[r2]
            r5.l = r2
            r5.m = r0
            a.K1[] r2 = new a.K1[r1]
            r5.e = r2
            r5.q()
            a.A2 r2 = new a.A2
            r2.<init>()
            a.Cc r3 = new a.Cc
            r3.<init>()
            r2.f7a = r3
            a.Cc r3 = new a.Cc
            r3.<init>()
            r2.b = r3
            a.Cc r3 = new a.Cc
            r3.<init>()
            r2.c = r3
            a.le[] r1 = new a.C0251le[r1]
            r2.d = r1
            r5.k = r2
            a.Hc r1 = new a.Hc
            r1.<init>(r2)
            r3 = 128(0x80, float:1.8E-43)
            a.le[] r4 = new a.C0251le[r3]
            r1.f = r4
            a.le[] r3 = new a.C0251le[r3]
            r1.g = r3
            r1.h = r0
            a.Hc$b r0 = new a.Hc$b
            r0.<init>(r1)
            r1.i = r0
            r5.b = r1
            boolean r0 = a.B9.p
            if (r0 == 0) goto L71
            a.B9$b r0 = new a.B9$b
            r0.<init>(r2)
            r5.n = r0
            return
        L71:
            a.K1 r0 = new a.K1
            r0.<init>(r2)
            r5.n = r0
            return
    }

    public static int m(java.lang.Object r1) {
            a.M3 r1 = (a.M3) r1
            a.le r1 = r1.g
            if (r1 == 0) goto Ld
            float r1 = r1.e
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final a.C0251le a(a.C0251le.a r4) {
            r3 = this;
            a.A2 r0 = r3.k
            java.lang.Object r0 = r0.c
            a.Cc r0 = (a.Cc) r0
            java.lang.Object r0 = r0.a()
            a.le r0 = (a.C0251le) r0
            if (r0 != 0) goto L16
            a.le r0 = new a.le
            r0.<init>(r4)
            r0.i = r4
            goto L1b
        L16:
            r0.c()
            r0.i = r4
        L1b:
            int r4 = r3.m
            int r1 = a.B9.o
            if (r4 < r1) goto L2f
            int r1 = r1 * 2
            a.B9.o = r1
            a.le[] r4 = r3.l
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            a.le[] r4 = (a.C0251le[]) r4
            r3.l = r4
        L2f:
            a.le[] r4 = r3.l
            int r1 = r3.m
            int r2 = r1 + 1
            r3.m = r2
            r4[r1] = r0
            return r0
    }

    public final void b(a.C0251le r7, a.C0251le r8, int r9, float r10, a.C0251le r11, a.C0251le r12, int r13, int r14) {
            r6 = this;
            a.K1 r0 = r6.k()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r11) goto L1b
            a.K1$a r9 = r0.d
            r9.c(r7, r1)
            a.K1$a r7 = r0.d
            r7.c(r12, r1)
            a.K1$a r7 = r0.d
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r7.c(r8, r9)
            goto L8f
        L1b:
            r2 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 != 0) goto L41
            a.K1$a r10 = r0.d
            r10.c(r7, r1)
            a.K1$a r7 = r0.d
            r7.c(r8, r3)
            a.K1$a r7 = r0.d
            r7.c(r11, r3)
            a.K1$a r7 = r0.d
            r7.c(r12, r1)
            if (r9 > 0) goto L3b
            if (r13 <= 0) goto L8f
        L3b:
            int r7 = -r9
            int r7 = r7 + r13
            float r7 = (float) r7
            r0.b = r7
            goto L8f
        L41:
            r2 = 0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 > 0) goto L54
            a.K1$a r10 = r0.d
            r10.c(r7, r3)
            a.K1$a r7 = r0.d
            r7.c(r8, r1)
            float r7 = (float) r9
            r0.b = r7
            goto L8f
        L54:
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 < 0) goto L67
            a.K1$a r7 = r0.d
            r7.c(r12, r3)
            a.K1$a r7 = r0.d
            r7.c(r11, r1)
            int r7 = -r13
            float r7 = (float) r7
            r0.b = r7
            goto L8f
        L67:
            a.K1$a r2 = r0.d
            float r4 = r1 - r10
            float r5 = r4 * r1
            r2.c(r7, r5)
            a.K1$a r7 = r0.d
            float r2 = r4 * r3
            r7.c(r8, r2)
            a.K1$a r7 = r0.d
            float r3 = r3 * r10
            r7.c(r11, r3)
            a.K1$a r7 = r0.d
            float r1 = r1 * r10
            r7.c(r12, r1)
            if (r9 > 0) goto L87
            if (r13 <= 0) goto L8f
        L87:
            int r7 = -r9
            float r7 = (float) r7
            float r7 = r7 * r4
            float r8 = (float) r13
            float r8 = r8 * r10
            float r8 = r8 + r7
            r0.b = r8
        L8f:
            r7 = 8
            if (r14 == r7) goto L96
            r0.b(r6, r14)
        L96:
            r6.c(r0)
            return
    }

    public final void c(a.K1 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.i
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.j
            if (r2 >= r4) goto L13
            int r2 = r0.h
            int r2 = r2 + r3
            int r4 = r0.d
            if (r2 < r4) goto L16
        L13:
            r0.n()
        L16:
            boolean r2 = r1.e
            if (r2 != 0) goto L1a1
            a.K1[] r2 = r0.e
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L21
            goto L71
        L21:
            r2 = 0
        L22:
            if (r2 != 0) goto L71
            a.K1$a r6 = r1.d
            int r6 = r6.k()
            r7 = 0
        L2b:
            java.util.ArrayList<a.le> r8 = r1.c
            if (r7 >= r6) goto L43
            a.K1$a r9 = r1.d
            a.le r9 = r9.f(r7)
            int r10 = r9.c
            if (r10 != r5) goto L3d
            boolean r10 = r9.f
            if (r10 == 0) goto L40
        L3d:
            r8.add(r9)
        L40:
            int r7 = r7 + 1
            goto L2b
        L43:
            int r6 = r8.size()
            if (r6 <= 0) goto L6f
            java.util.Iterator r6 = r8.iterator()
        L4d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r6.next()
            a.le r7 = (a.C0251le) r7
            boolean r9 = r7.f
            if (r9 == 0) goto L61
            r1.g(r7, r3)
            goto L4d
        L61:
            a.K1[] r9 = r0.e
            int r7 = r7.c
            r7 = r9[r7]
            r1.h(r7, r3)
            goto L4d
        L6b:
            r8.clear()
            goto L22
        L6f:
            r2 = r3
            goto L22
        L71:
            a.le r2 = r1.f147a
            r6 = 0
            if (r2 != 0) goto L86
            float r2 = r1.b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L86
            a.K1$a r2 = r1.d
            int r2 = r2.k()
            if (r2 != 0) goto L86
            goto L1a7
        L86:
            float r2 = r1.b
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L96
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.b = r2
            a.K1$a r2 = r1.d
            r2.j()
        L96:
            a.K1$a r2 = r1.d
            int r2 = r2.k()
            r7 = 0
            r11 = r6
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        La4:
            a.le$a r15 = a.C0251le.a.f564a
            if (r8 >= r2) goto Lfe
            a.K1$a r4 = r1.d
            float r4 = r4.a(r8)
            r16 = r6
            a.K1$a r6 = r1.d
            a.le r6 = r6.f(r8)
            a.le$a r5 = r6.i
            if (r5 != r15) goto Ld6
            if (r9 != 0) goto Lc5
            int r5 = r6.l
            if (r5 > r3) goto Lc1
            goto Ld4
        Lc1:
            r12 = 0
        Lc2:
            r11 = r4
            r9 = r6
            goto Lf8
        Lc5:
            int r5 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r5 <= 0) goto Lce
            int r5 = r6.l
            if (r5 > r3) goto Lc1
            goto Ld4
        Lce:
            if (r12 != 0) goto Lf8
            int r5 = r6.l
            if (r5 > r3) goto Lf8
        Ld4:
            r12 = r3
            goto Lc2
        Ld6:
            if (r9 != 0) goto Lf8
            int r5 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r5 >= 0) goto Lf8
            if (r10 != 0) goto Le7
            int r5 = r6.l
            if (r5 > r3) goto Le3
            goto Lf6
        Le3:
            r14 = 0
        Le4:
            r13 = r4
            r10 = r6
            goto Lf8
        Le7:
            int r5 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r5 <= 0) goto Lf0
            int r5 = r6.l
            if (r5 > r3) goto Le3
            goto Lf6
        Lf0:
            if (r14 != 0) goto Lf8
            int r5 = r6.l
            if (r5 > r3) goto Lf8
        Lf6:
            r14 = r3
            goto Le4
        Lf8:
            int r8 = r8 + 1
            r6 = r16
            r5 = -1
            goto La4
        Lfe:
            r16 = r6
            if (r9 == 0) goto L103
            goto L104
        L103:
            r9 = r10
        L104:
            if (r9 != 0) goto L108
            r2 = r3
            goto L10c
        L108:
            r1.f(r9)
            r2 = 0
        L10c:
            a.K1$a r4 = r1.d
            int r4 = r4.k()
            if (r4 != 0) goto L116
            r1.e = r3
        L116:
            if (r2 == 0) goto L190
            int r2 = r0.h
            int r2 = r2 + r3
            int r4 = r0.d
            if (r2 < r4) goto L122
            r0.n()
        L122:
            a.le$a r2 = a.C0251le.a.b
            a.le r2 = r0.a(r2)
            int r4 = r0.f29a
            int r4 = r4 + r3
            r0.f29a = r4
            int r5 = r0.h
            int r5 = r5 + r3
            r0.h = r5
            r2.b = r4
            a.A2 r5 = r0.k
            java.lang.Object r5 = r5.d
            a.le[] r5 = (a.C0251le[]) r5
            r5[r4] = r2
            r1.f147a = r2
            r17.h(r18)
            a.K1 r4 = r0.n
            r4.getClass()
            r4.f147a = r7
            a.K1$a r5 = r4.d
            r5.clear()
            r5 = 0
        L14e:
            a.K1$a r6 = r1.d
            int r6 = r6.k()
            if (r5 >= r6) goto L16a
            a.K1$a r6 = r1.d
            a.le r6 = r6.f(r5)
            a.K1$a r8 = r1.d
            float r8 = r8.a(r5)
            a.K1$a r9 = r4.d
            r9.e(r6, r8, r3)
            int r5 = r5 + 1
            goto L14e
        L16a:
            a.K1 r4 = r0.n
            r0.p(r4)
            int r4 = r2.c
            r5 = -1
            if (r4 != r5) goto L191
            a.le r4 = r1.f147a
            if (r4 != r2) goto L181
            a.le r2 = r1.e(r7, r2)
            if (r2 == 0) goto L181
            r1.f(r2)
        L181:
            boolean r2 = r1.e
            if (r2 != 0) goto L18a
            a.le r2 = r1.f147a
            r2.d(r1)
        L18a:
            int r2 = r0.i
            int r2 = r2 - r3
            r0.i = r2
            goto L191
        L190:
            r3 = 0
        L191:
            a.le r2 = r1.f147a
            if (r2 == 0) goto L1a7
            a.le$a r2 = r2.i
            if (r2 == r15) goto L19f
            float r2 = r1.b
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 < 0) goto L1a7
        L19f:
            r4 = r3
            goto L1a2
        L1a1:
            r4 = 0
        L1a2:
            if (r4 != 0) goto L1a7
            r17.h(r18)
        L1a7:
            return
    }

    public final void d(a.C0251le r5, int r6) {
            r4 = this;
            int r0 = r5.c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L1e
            float r6 = (float) r6
            r5.e = r6
            r5.f = r1
            int r6 = r5.k
            r0 = 0
            r1 = r0
        Lf:
            if (r1 >= r6) goto L1b
            a.K1[] r2 = r5.j
            r2 = r2[r1]
            r2.g(r5, r0)
            int r1 = r1 + 1
            goto Lf
        L1b:
            r5.k = r0
            return
        L1e:
            if (r0 == r2) goto L5a
            a.K1[] r3 = r4.e
            r0 = r3[r0]
            boolean r3 = r0.e
            if (r3 == 0) goto L2c
            float r5 = (float) r6
            r0.b = r5
            return
        L2c:
            a.K1$a r3 = r0.d
            int r3 = r3.k()
            if (r3 != 0) goto L3a
            r0.e = r1
            float r5 = (float) r6
            r0.b = r5
            return
        L3a:
            a.K1 r0 = r4.k()
            if (r6 >= 0) goto L4c
            int r6 = r6 * r2
            float r6 = (float) r6
            r0.b = r6
            a.K1$a r6 = r0.d
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.c(r5, r1)
            goto L56
        L4c:
            float r6 = (float) r6
            r0.b = r6
            a.K1$a r6 = r0.d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.c(r5, r1)
        L56:
            r4.c(r0)
            return
        L5a:
            a.K1 r0 = r4.k()
            r0.f147a = r5
            float r6 = (float) r6
            r5.e = r6
            r0.b = r6
            r0.e = r1
            r4.c(r0)
            return
    }

    public final void e(a.C0251le r6, a.C0251le r7, int r8, int r9) {
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = 8
            if (r9 != r2) goto L29
            boolean r3 = r7.f
            if (r3 == 0) goto L29
            int r3 = r6.c
            r4 = -1
            if (r3 != r4) goto L29
            float r7 = r7.e
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.e = r7
            r6.f = r1
            int r7 = r6.k
            r8 = r0
        L1a:
            if (r8 >= r7) goto L26
            a.K1[] r9 = r6.j
            r9 = r9[r8]
            r9.g(r6, r0)
            int r8 = r8 + 1
            goto L1a
        L26:
            r6.k = r0
            return
        L29:
            a.K1 r3 = r5.k()
            if (r8 == 0) goto L37
            if (r8 >= 0) goto L34
            int r8 = r8 * (-1)
            r0 = r1
        L34:
            float r8 = (float) r8
            r3.b = r8
        L37:
            r8 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L48
            a.K1$a r0 = r3.d
            r0.c(r6, r1)
            a.K1$a r6 = r3.d
            r6.c(r7, r8)
            goto L52
        L48:
            a.K1$a r0 = r3.d
            r0.c(r6, r8)
            a.K1$a r6 = r3.d
            r6.c(r7, r1)
        L52:
            if (r9 == r2) goto L57
            r3.b(r5, r9)
        L57:
            r5.c(r3)
            return
    }

    public final void f(a.C0251le r4, a.C0251le r5, int r6, int r7) {
            r3 = this;
            a.K1 r0 = r3.k()
            a.le r1 = r3.l()
            r2 = 0
            r1.d = r2
            r0.c(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L26
            a.K1$a r4 = r0.d
            float r4 = r4.i(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            a.le r5 = r3.i(r7)
            a.K1$a r6 = r0.d
            float r4 = (float) r4
            r6.c(r5, r4)
        L26:
            r3.c(r0)
            return
    }

    public final void g(a.C0251le r4, a.C0251le r5, int r6, int r7) {
            r3 = this;
            a.K1 r0 = r3.k()
            a.le r1 = r3.l()
            r2 = 0
            r1.d = r2
            r0.d(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L26
            a.K1$a r4 = r0.d
            float r4 = r4.i(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            a.le r5 = r3.i(r7)
            a.K1$a r6 = r0.d
            float r4 = (float) r4
            r6.c(r5, r4)
        L26:
            r3.c(r0)
            return
    }

    public final void h(a.K1 r4) {
            r3 = this;
            boolean r0 = a.B9.p
            a.A2 r1 = r3.k
            if (r0 == 0) goto L16
            a.K1[] r0 = r3.e
            int r2 = r3.i
            r0 = r0[r2]
            if (r0 == 0) goto L25
            java.lang.Object r1 = r1.f7a
            a.Cc r1 = (a.Cc) r1
            r1.b(r0)
            goto L25
        L16:
            a.K1[] r0 = r3.e
            int r2 = r3.i
            r0 = r0[r2]
            if (r0 == 0) goto L25
            java.lang.Object r1 = r1.b
            a.Cc r1 = (a.Cc) r1
            r1.b(r0)
        L25:
            a.K1[] r0 = r3.e
            int r1 = r3.i
            r0[r1] = r4
            a.le r0 = r4.f147a
            r0.c = r1
            int r1 = r1 + 1
            r3.i = r1
            r0.d(r4)
            return
    }

    public final a.C0251le i(int r5) {
            r4 = this;
            int r0 = r4.h
            int r0 = r0 + 1
            int r1 = r4.d
            if (r0 < r1) goto Lb
            r4.n()
        Lb:
            a.le$a r0 = a.C0251le.a.c
            a.le r0 = r4.a(r0)
            int r1 = r4.f29a
            int r1 = r1 + 1
            r4.f29a = r1
            int r2 = r4.h
            int r2 = r2 + 1
            r4.h = r2
            r0.b = r1
            r0.d = r5
            a.A2 r5 = r4.k
            java.lang.Object r5 = r5.d
            a.le[] r5 = (a.C0251le[]) r5
            r5[r1] = r0
            a.Hc r5 = r4.b
            a.Hc$b r1 = r5.i
            r1.f114a = r0
            float[] r1 = r0.h
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            int r2 = r0.d
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r5.i(r0)
            return r0
    }

    public final a.C0251le j(java.lang.Object r5) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L50
        L3:
            int r0 = r4.h
            int r0 = r0 + 1
            int r1 = r4.d
            if (r0 < r1) goto Le
            r4.n()
        Le:
            boolean r0 = r5 instanceof a.M3
            if (r0 == 0) goto L50
            a.M3 r5 = (a.M3) r5
            a.le r0 = r5.g
            if (r0 != 0) goto L1d
            r5.i()
            a.le r0 = r5.g
        L1d:
            int r5 = r0.b
            a.A2 r1 = r4.k
            r2 = -1
            if (r5 == r2) goto L32
            int r3 = r4.f29a
            if (r5 > r3) goto L32
            java.lang.Object r3 = r1.d
            a.le[] r3 = (a.C0251le[]) r3
            r3 = r3[r5]
            if (r3 != 0) goto L31
            goto L32
        L31:
            return r0
        L32:
            if (r5 == r2) goto L37
            r0.c()
        L37:
            int r5 = r4.f29a
            int r5 = r5 + 1
            r4.f29a = r5
            int r2 = r4.h
            int r2 = r2 + 1
            r4.h = r2
            r0.b = r5
            a.le$a r2 = a.C0251le.a.f564a
            r0.i = r2
            java.lang.Object r1 = r1.d
            a.le[] r1 = (a.C0251le[]) r1
            r1[r5] = r0
            return r0
        L50:
            r5 = 0
            return r5
    }

    public final a.K1 k() {
            r5 = this;
            boolean r0 = a.B9.p
            r1 = 0
            r2 = 0
            r3 = 0
            a.A2 r4 = r5.k
            if (r0 == 0) goto L27
            java.lang.Object r0 = r4.f7a
            a.Cc r0 = (a.Cc) r0
            java.lang.Object r0 = r0.a()
            a.K1 r0 = (a.K1) r0
            if (r0 != 0) goto L1b
            a.B9$b r0 = new a.B9$b
            r0.<init>(r4)
            goto L44
        L1b:
            r0.f147a = r3
            a.K1$a r3 = r0.d
            r3.clear()
            r0.b = r2
            r0.e = r1
            goto L44
        L27:
            java.lang.Object r0 = r4.b
            a.Cc r0 = (a.Cc) r0
            java.lang.Object r0 = r0.a()
            a.K1 r0 = (a.K1) r0
            if (r0 != 0) goto L39
            a.K1 r0 = new a.K1
            r0.<init>(r4)
            goto L44
        L39:
            r0.f147a = r3
            a.K1$a r3 = r0.d
            r3.clear()
            r0.b = r2
            r0.e = r1
        L44:
            return r0
    }

    public final a.C0251le l() {
            r3 = this;
            int r0 = r3.h
            int r0 = r0 + 1
            int r1 = r3.d
            if (r0 < r1) goto Lb
            r3.n()
        Lb:
            a.le$a r0 = a.C0251le.a.b
            a.le r0 = r3.a(r0)
            int r1 = r3.f29a
            int r1 = r1 + 1
            r3.f29a = r1
            int r2 = r3.h
            int r2 = r2 + 1
            r3.h = r2
            r0.b = r1
            a.A2 r2 = r3.k
            java.lang.Object r2 = r2.d
            a.le[] r2 = (a.C0251le[]) r2
            r2[r1] = r0
            return r0
    }

    public final void n() {
            r3 = this;
            int r0 = r3.c
            int r0 = r0 * 2
            r3.c = r0
            a.K1[] r1 = r3.e
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            a.K1[] r0 = (a.K1[]) r0
            r3.e = r0
            a.A2 r0 = r3.k
            java.lang.Object r1 = r0.d
            a.le[] r1 = (a.C0251le[]) r1
            int r2 = r3.c
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            a.le[] r1 = (a.C0251le[]) r1
            r0.d = r1
            int r0 = r3.c
            boolean[] r1 = new boolean[r0]
            r3.g = r1
            r3.d = r0
            r3.j = r0
            return
    }

    public final void o(a.Hc r20) {
            r19 = this;
            r0 = r19
            r2 = 0
        L3:
            int r3 = r0.i
            if (r2 >= r3) goto Lb2
            a.K1[] r3 = r0.e
            r3 = r3[r2]
            a.le r4 = r3.f147a
            a.le$a r4 = r4.i
            a.le$a r5 = a.C0251le.a.f564a
            if (r4 != r5) goto L15
            goto Lae
        L15:
            float r3 = r3.b
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto Lae
            r2 = 0
            r3 = 0
        L1e:
            if (r2 != 0) goto Lb2
            r6 = 1
            int r3 = r3 + r6
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = 0
            r10 = -1
            r11 = -1
            r12 = 0
        L29:
            int r13 = r0.i
            a.A2 r14 = r0.k
            if (r9 >= r13) goto L84
            a.K1[] r13 = r0.e
            r13 = r13[r9]
            a.le r15 = r13.f147a
            a.le$a r15 = r15.i
            if (r15 != r5) goto L3a
            goto L7c
        L3a:
            boolean r15 = r13.e
            if (r15 == 0) goto L3f
            goto L7c
        L3f:
            float r15 = r13.b
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 >= 0) goto L7c
            r15 = r6
        L46:
            int r1 = r0.h
            if (r15 >= r1) goto L7c
            java.lang.Object r1 = r14.d
            a.le[] r1 = (a.C0251le[]) r1
            r1 = r1[r15]
            r16 = r4
            a.K1$a r4 = r13.d
            float r4 = r4.i(r1)
            int r17 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r17 > 0) goto L5d
            goto L76
        L5d:
            r6 = 0
        L5e:
            r7 = 9
            if (r6 >= r7) goto L76
            float[] r7 = r1.g
            r7 = r7[r6]
            float r7 = r7 / r4
            int r18 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r18 >= 0) goto L6d
            if (r6 == r12) goto L6f
        L6d:
            if (r6 <= r12) goto L73
        L6f:
            r12 = r6
            r8 = r7
            r10 = r9
            r11 = r15
        L73:
            int r6 = r6 + 1
            goto L5e
        L76:
            int r15 = r15 + 1
            r4 = r16
            r6 = 1
            goto L46
        L7c:
            r16 = r4
            int r9 = r9 + 1
            r4 = r16
            r6 = 1
            goto L29
        L84:
            r16 = r4
            r1 = -1
            if (r10 == r1) goto La2
            a.K1[] r4 = r0.e
            r4 = r4[r10]
            a.le r6 = r4.f147a
            r6.c = r1
            java.lang.Object r1 = r14.d
            a.le[] r1 = (a.C0251le[]) r1
            r1 = r1[r11]
            r4.f(r1)
            a.le r1 = r4.f147a
            r1.c = r10
            r1.d(r4)
            goto La3
        La2:
            r2 = 1
        La3:
            int r1 = r0.h
            int r1 = r1 / 2
            if (r3 <= r1) goto Laa
            r2 = 1
        Laa:
            r4 = r16
            goto L1e
        Lae:
            int r2 = r2 + 1
            goto L3
        Lb2:
            r19.p(r20)
            r1 = 0
        Lb6:
            int r2 = r0.i
            if (r1 >= r2) goto Lc7
            a.K1[] r2 = r0.e
            r2 = r2[r1]
            a.le r3 = r2.f147a
            float r2 = r2.b
            r3.e = r2
            int r1 = r1 + 1
            goto Lb6
        Lc7:
            return
    }

    public final void p(a.K1 r12) {
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.h
            if (r1 >= r2) goto Ld
            boolean[] r2 = r11.g
            r2[r1] = r0
            int r1 = r1 + 1
            goto L2
        Ld:
            r1 = r0
            r2 = r1
        Lf:
            if (r1 != 0) goto L8d
            r3 = 1
            int r2 = r2 + r3
            int r4 = r11.h
            int r4 = r4 * 2
            if (r2 < r4) goto L1b
            goto L8d
        L1b:
            a.le r4 = r12.f147a
            if (r4 == 0) goto L25
            boolean[] r5 = r11.g
            int r4 = r4.b
            r5[r4] = r3
        L25:
            boolean[] r4 = r11.g
            a.le r4 = r12.a(r4)
            if (r4 == 0) goto L38
            boolean[] r5 = r11.g
            int r6 = r4.b
            boolean r7 = r5[r6]
            if (r7 == 0) goto L36
            goto L8d
        L36:
            r5[r6] = r3
        L38:
            if (r4 == 0) goto L8b
            r3 = -1
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r6 = r0
            r7 = r3
        L40:
            int r8 = r11.i
            if (r6 >= r8) goto L76
            a.K1[] r8 = r11.e
            r8 = r8[r6]
            a.le r9 = r8.f147a
            a.le$a r9 = r9.i
            a.le$a r10 = a.C0251le.a.f564a
            if (r9 != r10) goto L51
            goto L73
        L51:
            boolean r9 = r8.e
            if (r9 == 0) goto L56
            goto L73
        L56:
            a.K1$a r9 = r8.d
            boolean r9 = r9.d(r4)
            if (r9 == 0) goto L73
            a.K1$a r9 = r8.d
            float r9 = r9.i(r4)
            r10 = 0
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 >= 0) goto L73
            float r8 = r8.b
            float r8 = -r8
            float r8 = r8 / r9
            int r9 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r9 >= 0) goto L73
            r7 = r6
            r5 = r8
        L73:
            int r6 = r6 + 1
            goto L40
        L76:
            if (r7 <= r3) goto Lf
            a.K1[] r5 = r11.e
            r5 = r5[r7]
            a.le r6 = r5.f147a
            r6.c = r3
            r5.f(r4)
            a.le r3 = r5.f147a
            r3.c = r7
            r3.d(r5)
            goto Lf
        L8b:
            r1 = r3
            goto Lf
        L8d:
            return
    }

    public final void q() {
            r5 = this;
            boolean r0 = a.B9.p
            r1 = 0
            a.A2 r2 = r5.k
            r3 = 0
            if (r0 == 0) goto L1f
        L8:
            a.K1[] r0 = r5.e
            int r4 = r0.length
            if (r3 >= r4) goto L36
            r0 = r0[r3]
            if (r0 == 0) goto L18
            java.lang.Object r4 = r2.f7a
            a.Cc r4 = (a.Cc) r4
            r4.b(r0)
        L18:
            a.K1[] r0 = r5.e
            r0[r3] = r1
            int r3 = r3 + 1
            goto L8
        L1f:
            a.K1[] r0 = r5.e
            int r4 = r0.length
            if (r3 >= r4) goto L36
            r0 = r0[r3]
            if (r0 == 0) goto L2f
            java.lang.Object r4 = r2.b
            a.Cc r4 = (a.Cc) r4
            r4.b(r0)
        L2f:
            a.K1[] r0 = r5.e
            r0[r3] = r1
            int r3 = r3 + 1
            goto L1f
        L36:
            return
    }

    public final void r() {
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            a.A2 r2 = r10.k
            java.lang.Object r3 = r2.d
            a.le[] r3 = (a.C0251le[]) r3
            int r4 = r3.length
            if (r1 >= r4) goto L15
            r2 = r3[r1]
            if (r2 == 0) goto L12
            r2.c()
        L12:
            int r1 = r1 + 1
            goto L2
        L15:
            java.lang.Object r1 = r2.c
            a.Cc r1 = (a.Cc) r1
            a.le[] r3 = r10.l
            int r4 = r10.m
            r1.getClass()
            int r5 = r3.length
            if (r4 <= r5) goto L24
            int r4 = r3.length
        L24:
            r5 = r0
        L25:
            if (r5 >= r4) goto L39
            r6 = r3[r5]
            int r7 = r1.c
            java.lang.Object[] r8 = r1.b
            int r9 = r8.length
            if (r7 >= r9) goto L36
            r8[r7] = r6
            int r7 = r7 + 1
            r1.c = r7
        L36:
            int r5 = r5 + 1
            goto L25
        L39:
            r10.m = r0
            java.lang.Object r1 = r2.d
            a.le[] r1 = (a.C0251le[]) r1
            r3 = 0
            java.util.Arrays.fill(r1, r3)
            r10.f29a = r0
            a.Hc r1 = r10.b
            r1.h = r0
            r3 = 0
            r1.b = r3
            r1 = 1
            r10.h = r1
            r1 = r0
        L50:
            int r3 = r10.i
            if (r1 >= r3) goto L5e
            a.K1[] r3 = r10.e
            r3 = r3[r1]
            r3.getClass()
            int r1 = r1 + 1
            goto L50
        L5e:
            r10.q()
            r10.i = r0
            boolean r0 = a.B9.p
            if (r0 == 0) goto L6f
            a.B9$b r0 = new a.B9$b
            r0.<init>(r2)
            r10.n = r0
            return
        L6f:
            a.K1 r0 = new a.K1
            r0.<init>(r2)
            r10.n = r0
            return
    }
}
