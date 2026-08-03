package a;

/* JADX INFO: loaded from: classes.dex */
public class K1 implements a.B9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.C0251le f147a;
    public float b;
    public final java.util.ArrayList<a.C0251le> c;
    public a.K1.a d;
    public boolean e;

    public interface a {
        float a(int r1);

        float b(a.K1 r1, boolean r2);

        void c(a.C0251le r1, float r2);

        void clear();

        boolean d(a.C0251le r1);

        void e(a.C0251le r1, float r2, boolean r3);

        a.C0251le f(int r1);

        void g(float r1);

        float h(a.C0251le r1, boolean r2);

        float i(a.C0251le r1);

        void j();

        int k();
    }

    public K1() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f147a = r0
            r0 = 0
            r1.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            r0 = 0
            r1.e = r0
            return
    }

    public K1(a.A2 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f147a = r0
            r0 = 0
            r1.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            r0 = 0
            r1.e = r0
            a.H1 r0 = new a.H1
            r0.<init>(r1, r2)
            r1.d = r0
            return
    }

    @Override // a.B9.a
    public a.C0251le a(boolean[] r2) {
            r1 = this;
            r0 = 0
            a.le r2 = r1.e(r2, r0)
            return r2
    }

    public final void b(a.B9 r4, int r5) {
            r3 = this;
            a.K1$a r0 = r3.d
            a.le r1 = r4.i(r5)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.c(r1, r2)
            a.K1$a r0 = r3.d
            a.le r4 = r4.i(r5)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.c(r4, r5)
            return
    }

    public final void c(a.C0251le r3, a.C0251le r4, a.C0251le r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.b = r6
        Lb:
            r6 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L21
            a.K1$a r0 = r2.d
            r0.c(r3, r1)
            a.K1$a r3 = r2.d
            r3.c(r4, r6)
            a.K1$a r3 = r2.d
            r3.c(r5, r6)
            return
        L21:
            a.K1$a r0 = r2.d
            r0.c(r3, r6)
            a.K1$a r3 = r2.d
            r3.c(r4, r1)
            a.K1$a r3 = r2.d
            r3.c(r5, r1)
            return
    }

    public final void d(a.C0251le r3, a.C0251le r4, a.C0251le r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.b = r6
        Lb:
            r6 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L21
            a.K1$a r0 = r2.d
            r0.c(r3, r1)
            a.K1$a r3 = r2.d
            r3.c(r4, r6)
            a.K1$a r3 = r2.d
            r3.c(r5, r1)
            return
        L21:
            a.K1$a r0 = r2.d
            r0.c(r3, r6)
            a.K1$a r3 = r2.d
            r3.c(r4, r1)
            a.K1$a r3 = r2.d
            r3.c(r5, r6)
            return
    }

    public final a.C0251le e(boolean[] r10, a.C0251le r11) {
            r9 = this;
            a.K1$a r0 = r9.d
            int r0 = r0.k()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
        La:
            if (r3 >= r0) goto L39
            a.K1$a r5 = r9.d
            float r5 = r5.a(r3)
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 >= 0) goto L36
            a.K1$a r6 = r9.d
            a.le r6 = r6.f(r3)
            if (r10 == 0) goto L24
            int r7 = r6.b
            boolean r7 = r10[r7]
            if (r7 != 0) goto L36
        L24:
            if (r6 == r11) goto L36
            a.le$a r7 = r6.i
            a.le$a r8 = a.C0251le.a.b
            if (r7 == r8) goto L30
            a.le$a r8 = a.C0251le.a.c
            if (r7 != r8) goto L36
        L30:
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 >= 0) goto L36
            r4 = r5
            r2 = r6
        L36:
            int r3 = r3 + 1
            goto La
        L39:
            return r2
    }

    public final void f(a.C0251le r4) {
            r3 = this;
            a.le r0 = r3.f147a
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto Le
            a.K1$a r2 = r3.d
            r2.c(r0, r1)
            r0 = 0
            r3.f147a = r0
        Le:
            a.K1$a r0 = r3.d
            r2 = 1
            float r0 = r0.h(r4, r2)
            float r0 = r0 * r1
            r3.f147a = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L1f
            return
        L1f:
            float r4 = r3.b
            float r4 = r4 / r0
            r3.b = r4
            a.K1$a r4 = r3.d
            r4.g(r0)
            return
    }

    public final void g(a.C0251le r4, boolean r5) {
            r3 = this;
            boolean r0 = r4.f
            if (r0 != 0) goto L5
            goto L1d
        L5:
            a.K1$a r0 = r3.d
            float r0 = r0.i(r4)
            float r1 = r3.b
            float r2 = r4.e
            float r2 = r2 * r0
            float r2 = r2 + r1
            r3.b = r2
            a.K1$a r0 = r3.d
            r0.h(r4, r5)
            if (r5 == 0) goto L1d
            r4.b(r3)
        L1d:
            return
    }

    public void h(a.K1 r4, boolean r5) {
            r3 = this;
            a.K1$a r0 = r3.d
            float r0 = r0.b(r4, r5)
            float r1 = r3.b
            float r2 = r4.b
            float r2 = r2 * r0
            float r2 = r2 + r1
            r3.b = r2
            if (r5 == 0) goto L15
            a.le r4 = r4.f147a
            r4.b(r3)
        L15:
            return
    }

    public java.lang.String toString() {
            r10 = this;
            a.le r0 = r10.f147a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            a.le r1 = r10.f147a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = a.C0487z.f(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            a.K1$a r5 = r10.d
            int r5 = r5.k()
        L40:
            if (r4 >= r5) goto La0
            a.K1$a r6 = r10.d
            a.le r6 = r6.f(r4)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            a.K1$a r7 = r10.d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = a.C0487z.f(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = a.C0487z.f(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = a.C0487z.f(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = a.C0487z.f(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r3
        L9d:
            int r4 = r4 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = a.C0487z.f(r0, r1)
        La8:
            return r0
    }
}
