package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class ye3 {

    /* JADX INFO: renamed from: b */
    public static final cf3 f13431b;

    /* JADX INFO: renamed from: a */
    public final cf3 f13432a;

    static {
        int i = Build.VERSION.SDK_INT;
        f13431b = (i >= 36 ? new oe3() : i >= 35 ? new ne3() : i >= 34 ? new me3() : i >= 31 ? new le3() : i >= 30 ? new ke3() : i >= 29 ? new je3() : new he3()).mo2150b().f1518a.mo4857a().f1518a.mo4439b().f1518a.mo4440c();
    }

    public ye3(cf3 cf3Var) {
        this.f13432a = cf3Var;
    }

    /* JADX INFO: renamed from: a */
    public cf3 mo4857a() {
        return this.f13432a;
    }

    /* JADX INFO: renamed from: b */
    public cf3 mo4439b() {
        return this.f13432a;
    }

    /* JADX INFO: renamed from: c */
    public cf3 mo4440c() {
        return this.f13432a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye3)) {
            return false;
        }
        ye3 ye3Var = (ye3) obj;
        return mo4171t() == ye3Var.mo4171t() && mo4442s() == ye3Var.mo4442s() && Objects.equals(mo4167n(), ye3Var.mo4167n()) && Objects.equals(mo4441l(), ye3Var.mo4441l()) && Objects.equals(mo4858h(), ye3Var.mo4858h());
    }

    /* JADX INFO: renamed from: f */
    public List<Rect> mo4163f(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: g */
    public List<Rect> mo4164g(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: h */
    public t90 mo4858h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo4171t()), Boolean.valueOf(mo4442s()), mo4167n(), mo4441l(), mo4858h());
    }

    /* JADX INFO: renamed from: i */
    public zz0 mo4165i(int i) {
        return zz0.f14156e;
    }

    /* JADX INFO: renamed from: j */
    public zz0 mo4166j(int i) {
        if ((i & 8) == 0) {
            return zz0.f14156e;
        }
        C0676s.m4651j("Unable to query the maximum insets for IME");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public zz0 mo5245k() {
        return mo4167n();
    }

    /* JADX INFO: renamed from: l */
    public zz0 mo4441l() {
        return zz0.f14156e;
    }

    /* JADX INFO: renamed from: m */
    public zz0 mo5246m() {
        return mo4167n();
    }

    /* JADX INFO: renamed from: n */
    public zz0 mo4167n() {
        return zz0.f14156e;
    }

    /* JADX INFO: renamed from: o */
    public zz0 mo5247o() {
        return mo4167n();
    }

    /* JADX INFO: renamed from: r */
    public cf3 mo4170r(int i, int i2, int i3, int i4) {
        return f13431b;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo4442s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean mo4171t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo4172u(int i) {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void mo4169q() {
    }

    /* JADX INFO: renamed from: A */
    public void mo4156A(int i) {
    }

    /* JADX INFO: renamed from: B */
    public void mo4157B(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: C */
    public void mo4158C(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: d */
    public void mo4161d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public void mo4162e(cf3 cf3Var) {
    }

    /* JADX INFO: renamed from: p */
    public void mo4168p(View view) {
    }

    /* JADX INFO: renamed from: v */
    public void mo4173v(y90 y90Var) {
    }

    /* JADX INFO: renamed from: w */
    public void mo4174w(zz0[] zz0VarArr) {
    }

    /* JADX INFO: renamed from: x */
    public void mo4175x(zz0 zz0Var) {
    }

    /* JADX INFO: renamed from: y */
    public void mo4176y(cf3 cf3Var) {
    }

    /* JADX INFO: renamed from: z */
    public void mo4443z(zz0 zz0Var) {
    }
}
