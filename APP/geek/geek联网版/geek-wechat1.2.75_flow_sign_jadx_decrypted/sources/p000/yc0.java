package p000;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class yc0 {

    /* JADX INFO: renamed from: b */
    public static final bd0 f5426b;

    /* JADX INFO: renamed from: a */
    public final bd0 f5427a;

    static {
        int i = Build.VERSION.SDK_INT;
        f5426b = (i >= 30 ? new qc0() : i >= 29 ? new pc0() : new nc0()).mo1944b().f724a.mo2562a().f724a.mo2408b().f724a.mo2409c();
    }

    public yc0(bd0 bd0Var) {
        this.f5427a = bd0Var;
    }

    /* JADX INFO: renamed from: a */
    public bd0 mo2562a() {
        return this.f5427a;
    }

    /* JADX INFO: renamed from: b */
    public bd0 mo2408b() {
        return this.f5427a;
    }

    /* JADX INFO: renamed from: c */
    public bd0 mo2409c() {
        return this.f5427a;
    }

    /* JADX INFO: renamed from: e */
    public C0018ah mo2563e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc0)) {
            return false;
        }
        yc0 yc0Var = (yc0) obj;
        return mo2371n() == yc0Var.mo2371n() && mo2411m() == yc0Var.mo2411m() && AbstractC0908xw.m2709a(mo2369j(), yc0Var.mo2369j()) && AbstractC0908xw.m2709a(mo2410h(), yc0Var.mo2410h()) && AbstractC0908xw.m2709a(mo2563e(), yc0Var.mo2563e());
    }

    /* JADX INFO: renamed from: f */
    public C0346ip mo2368f(int i) {
        return C0346ip.f2570e;
    }

    /* JADX INFO: renamed from: g */
    public C0346ip mo2607g() {
        return mo2369j();
    }

    /* JADX INFO: renamed from: h */
    public C0346ip mo2410h() {
        return C0346ip.f2570e;
    }

    public int hashCode() {
        return AbstractC0908xw.m2710b(Boolean.valueOf(mo2371n()), Boolean.valueOf(mo2411m()), mo2369j(), mo2410h(), mo2563e());
    }

    /* JADX INFO: renamed from: i */
    public C0346ip mo2608i() {
        return mo2369j();
    }

    /* JADX INFO: renamed from: j */
    public C0346ip mo2369j() {
        return C0346ip.f2570e;
    }

    /* JADX INFO: renamed from: k */
    public C0346ip mo2609k() {
        return mo2369j();
    }

    /* JADX INFO: renamed from: l */
    public bd0 mo2370l(int i, int i2, int i3, int i4) {
        return f5426b;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo2411m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo2371n() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo2367d(View view) {
    }

    /* JADX INFO: renamed from: o */
    public void mo2372o(C0346ip[] c0346ipArr) {
    }

    /* JADX INFO: renamed from: p */
    public void mo2373p(bd0 bd0Var) {
    }

    /* JADX INFO: renamed from: q */
    public void mo2412q(C0346ip c0346ip) {
    }
}
