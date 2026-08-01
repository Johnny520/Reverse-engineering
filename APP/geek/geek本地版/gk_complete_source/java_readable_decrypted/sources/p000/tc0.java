package p000;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class tc0 {

    /* JADX INFO: renamed from: b */
    public static final wc0 f4561b;

    /* JADX INFO: renamed from: a */
    public final wc0 f4562a;

    static {
        int i = Build.VERSION.SDK_INT;
        f4561b = (i >= 30 ? new lc0() : i >= 29 ? new kc0() : new ic0()).mo1433b().f4955a.mo2169a().f4955a.mo2012b().f4955a.mo2013c();
    }

    public tc0(wc0 wc0Var) {
        this.f4562a = wc0Var;
    }

    /* JADX INFO: renamed from: a */
    public wc0 mo2169a() {
        return this.f4562a;
    }

    /* JADX INFO: renamed from: b */
    public wc0 mo2012b() {
        return this.f4562a;
    }

    /* JADX INFO: renamed from: c */
    public wc0 mo2013c() {
        return this.f4562a;
    }

    /* JADX INFO: renamed from: e */
    public C0929yg mo2170e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc0)) {
            return false;
        }
        tc0 tc0Var = (tc0) obj;
        return mo1935n() == tc0Var.mo1935n() && mo2015m() == tc0Var.mo2015m() && AbstractC0612pw.m2131a(mo1933j(), tc0Var.mo1933j()) && AbstractC0612pw.m2131a(mo2014h(), tc0Var.mo2014h()) && AbstractC0612pw.m2131a(mo2170e(), tc0Var.mo2170e());
    }

    /* JADX INFO: renamed from: f */
    public C0195ep mo1932f(int i) {
        return C0195ep.f1827e;
    }

    /* JADX INFO: renamed from: g */
    public C0195ep mo2289g() {
        return mo1933j();
    }

    /* JADX INFO: renamed from: h */
    public C0195ep mo2014h() {
        return C0195ep.f1827e;
    }

    public int hashCode() {
        return AbstractC0612pw.m2132b(Boolean.valueOf(mo1935n()), Boolean.valueOf(mo2015m()), mo1933j(), mo2014h(), mo2170e());
    }

    /* JADX INFO: renamed from: i */
    public C0195ep mo2290i() {
        return mo1933j();
    }

    /* JADX INFO: renamed from: j */
    public C0195ep mo1933j() {
        return C0195ep.f1827e;
    }

    /* JADX INFO: renamed from: k */
    public C0195ep mo2291k() {
        return mo1933j();
    }

    /* JADX INFO: renamed from: l */
    public wc0 mo1934l(int i, int i2, int i3, int i4) {
        return f4561b;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo2015m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo1935n() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo1931d(View view) {
    }

    /* JADX INFO: renamed from: o */
    public void mo1936o(C0195ep[] c0195epArr) {
    }

    /* JADX INFO: renamed from: p */
    public void mo1937p(wc0 wc0Var) {
    }

    /* JADX INFO: renamed from: q */
    public void mo2016q(C0195ep c0195ep) {
    }
}
