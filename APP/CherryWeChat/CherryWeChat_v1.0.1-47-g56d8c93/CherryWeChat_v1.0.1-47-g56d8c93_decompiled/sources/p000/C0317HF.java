package p000;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: HF */
/* JADX INFO: loaded from: classes.dex */
public class C0317HF {

    /* JADX INFO: renamed from: b */
    public static final C0489LF f1043b;

    /* JADX INFO: renamed from: a */
    public final C0489LF f1044a;

    static {
        int i = Build.VERSION.SDK_INT;
        f1043b = (i >= 34 ? new C2753yF() : i >= 31 ? new C2710xF() : i >= 30 ? new C2667wF() : i >= 29 ? new C2624vF() : new C2581uF()).mo5084b().f1602a.mo149a().f1602a.mo91b().f1602a.mo92c();
    }

    public C0317HF(C0489LF c0489lf) {
        this.f1044a = c0489lf;
    }

    /* JADX INFO: renamed from: a */
    public C0489LF mo149a() {
        return this.f1044a;
    }

    /* JADX INFO: renamed from: b */
    public C0489LF mo91b() {
        return this.f1044a;
    }

    /* JADX INFO: renamed from: c */
    public C0489LF mo92c() {
        return this.f1044a;
    }

    /* JADX INFO: renamed from: d */
    public void mo12d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public void mo13e(C0489LF c0489lf) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0317HF)) {
            return false;
        }
        C0317HF c0317hf = (C0317HF) obj;
        return mo17o() == c0317hf.mo17o() && mo94n() == c0317hf.mo94n() && Objects.equals(mo15k(), c0317hf.mo15k()) && Objects.equals(mo93i(), c0317hf.mo93i()) && Objects.equals(mo150f(), c0317hf.mo150f());
    }

    /* JADX INFO: renamed from: f */
    public C1543ie mo150f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public C2765yl mo14g(int i) {
        return C2765yl.f9404e;
    }

    /* JADX INFO: renamed from: h */
    public C2765yl mo260h() {
        return mo15k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo17o()), Boolean.valueOf(mo94n()), mo15k(), mo93i(), mo150f());
    }

    /* JADX INFO: renamed from: i */
    public C2765yl mo93i() {
        return C2765yl.f9404e;
    }

    /* JADX INFO: renamed from: j */
    public C2765yl mo261j() {
        return mo15k();
    }

    /* JADX INFO: renamed from: k */
    public C2765yl mo15k() {
        return C2765yl.f9404e;
    }

    /* JADX INFO: renamed from: l */
    public C2765yl mo262l() {
        return mo15k();
    }

    /* JADX INFO: renamed from: m */
    public C0489LF mo16m(int i, int i2, int i3, int i4) {
        return f1043b;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo94n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo17o() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void mo18p(C2765yl[] c2765ylArr) {
    }

    /* JADX INFO: renamed from: q */
    public void mo19q(C2765yl c2765yl) {
    }

    /* JADX INFO: renamed from: r */
    public void mo20r(C0489LF c0489lf) {
    }

    /* JADX INFO: renamed from: s */
    public void mo95s(C2765yl c2765yl) {
    }

    /* JADX INFO: renamed from: t */
    public void mo21t(int i) {
    }
}
