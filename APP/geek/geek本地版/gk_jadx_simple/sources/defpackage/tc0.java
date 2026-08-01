package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class tc0 {
    public static final wc0 b = null;
    public final wc0 a;

    static {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 30) goto L6;
        mc0 r02 = new lc0();
    L9:
        b = r02.b().a.a().a.b().a.c();
        return;
    L6:
        if (r0 < 29) goto L8;
        r02 = new kc0();
        goto L9
    L8:
        r02 = new ic0();
        goto L9
    }

    public tc0(wc0 r1) {
        this.a = r1;
    }

    public wc0 a() {
        return this.a;
    }

    public wc0 b() {
        return this.a;
    }

    public wc0 c() {
        return this.a;
    }

    public yg e() {
        return null;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof tc0) == true) goto L8;
        return false;
    L8:
        tc0 r52 = (tc0) r5;
        if (n() == r52.n()) goto L11;
    L19:
        return false;
    L11:
        if (m() != r52.m()) goto L19;
        if (pw.a(j(), r52.j()) == false) goto L19;
        if (pw.a(h(), r52.h()) == false) goto L19;
        if (pw.a(e(), r52.e()) == false) goto L19;
        return true;
    }

    public ep f(int r1) {
        return ep.e;
    }

    public ep g() {
        return j();
    }

    public ep h() {
        return ep.e;
    }

    public int hashCode() {
        return pw.b(new Object[]{Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e()});
    }

    public ep i() {
        return j();
    }

    public ep j() {
        return ep.e;
    }

    public ep k() {
        return j();
    }

    public wc0 l(int r1, int r2, int r3, int r4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View r1) {
    }

    public void o(ep[] r1) {
    }

    public void p(wc0 r1) {
    }

    public void q(ep r1) {
    }
}
