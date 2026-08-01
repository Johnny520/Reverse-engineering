package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class tc0 {
    public static final defpackage.wc0 b = null;
    public final defpackage.wc0 a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lc
            lc0 r0 = new lc0
            r0.<init>()
            goto L1b
        Lc:
            r1 = 29
            if (r0 < r1) goto L16
            kc0 r0 = new kc0
            r0.<init>()
            goto L1b
        L16:
            ic0 r0 = new ic0
            r0.<init>()
        L1b:
            wc0 r0 = r0.b()
            tc0 r0 = r0.a
            wc0 r0 = r0.a()
            tc0 r0 = r0.a
            wc0 r0 = r0.b()
            tc0 r0 = r0.a
            wc0 r0 = r0.c()
            defpackage.tc0.b = r0
            return
    }

    public tc0(defpackage.wc0 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public defpackage.wc0 a() {
            r1 = this;
            wc0 r0 = r1.a
            return r0
    }

    public defpackage.wc0 b() {
            r1 = this;
            wc0 r0 = r1.a
            return r0
    }

    public defpackage.wc0 c() {
            r1 = this;
            wc0 r0 = r1.a
            return r0
    }

    public void d(android.view.View r1) {
            r0 = this;
            return
    }

    public defpackage.yg e() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.tc0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            tc0 r5 = (defpackage.tc0) r5
            boolean r1 = r4.n()
            boolean r3 = r5.n()
            if (r1 != r3) goto L4b
            boolean r1 = r4.m()
            boolean r3 = r5.m()
            if (r1 != r3) goto L4b
            ep r1 = r4.j()
            ep r3 = r5.j()
            boolean r1 = defpackage.pw.a(r1, r3)
            if (r1 == 0) goto L4b
            ep r1 = r4.h()
            ep r3 = r5.h()
            boolean r1 = defpackage.pw.a(r1, r3)
            if (r1 == 0) goto L4b
            yg r1 = r4.e()
            yg r5 = r5.e()
            boolean r5 = defpackage.pw.a(r1, r5)
            if (r5 == 0) goto L4b
            return r0
        L4b:
            return r2
    }

    public defpackage.ep f(int r1) {
            r0 = this;
            ep r1 = defpackage.ep.e
            return r1
    }

    public defpackage.ep g() {
            r1 = this;
            ep r0 = r1.j()
            return r0
    }

    public defpackage.ep h() {
            r1 = this;
            ep r0 = defpackage.ep.e
            return r0
    }

    public int hashCode() {
            r5 = this;
            boolean r0 = r5.n()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.m()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            ep r2 = r5.j()
            ep r3 = r5.h()
            yg r4 = r5.e()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4}
            int r0 = defpackage.pw.b(r0)
            return r0
    }

    public defpackage.ep i() {
            r1 = this;
            ep r0 = r1.j()
            return r0
    }

    public defpackage.ep j() {
            r1 = this;
            ep r0 = defpackage.ep.e
            return r0
    }

    public defpackage.ep k() {
            r1 = this;
            ep r0 = r1.j()
            return r0
    }

    public defpackage.wc0 l(int r1, int r2, int r3, int r4) {
            r0 = this;
            wc0 r1 = defpackage.tc0.b
            return r1
    }

    public boolean m() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean n() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void o(defpackage.ep[] r1) {
            r0 = this;
            return
    }

    public void p(defpackage.wc0 r1) {
            r0 = this;
            return
    }

    public void q(defpackage.ep r1) {
            r0 = this;
            return
    }
}
