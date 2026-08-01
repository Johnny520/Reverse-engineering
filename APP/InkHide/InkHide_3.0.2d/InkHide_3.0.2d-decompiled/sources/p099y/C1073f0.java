package p099y;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p085r.C0811c;

/* JADX INFO: renamed from: y.f0 */
/* JADX INFO: loaded from: classes.dex */
public class C1073f0 {

    /* JADX INFO: renamed from: b */
    public static final C1075g0 f3701b;

    /* JADX INFO: renamed from: a */
    public final C1075g0 f3702a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = Build.VERSION.SDK_INT;
        f3701b = (i2 >= 30 ? new C1059X() : i2 >= 29 ? new C1058W() : new C1057V()).mo2309b().f3705a.mo2327a().f3705a.mo2322b().f3705a.mo2323c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1073f0(C1075g0 c1075g0) {
        this.f3702a = c1075g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public C1075g0 mo2327a() {
        return this.f3702a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public C1075g0 mo2322b() {
        return this.f3702a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public C1075g0 mo2323c() {
        return this.f3702a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public C1077i mo2328e() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1073f0)) {
            return false;
        }
        C1073f0 c1073f0 = (C1073f0) obj;
        return mo2318j() == c1073f0.mo2318j() && mo2325i() == c1073f0.mo2325i() && Objects.equals(mo2316g(), c1073f0.mo2316g()) && Objects.equals(mo2324f(), c1073f0.mo2324f()) && Objects.equals(mo2328e(), c1073f0.mo2328e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public C0811c mo2324f() {
        return C0811c.f2711e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public C0811c mo2316g() {
        return C0811c.f2711e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public C1075g0 mo2317h(int i2, int i3, int i4, int i5) {
        return f3701b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo2318j()), Boolean.valueOf(mo2325i()), mo2316g(), mo2324f(), mo2328e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public boolean mo2325i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public boolean mo2318j() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo2315d(View view) {
    }

    /* JADX INFO: renamed from: k */
    public void mo2319k(C0811c[] c0811cArr) {
    }

    /* JADX INFO: renamed from: l */
    public void mo2320l(C1075g0 c1075g0) {
    }

    /* JADX INFO: renamed from: m */
    public void mo2326m(C0811c c0811c) {
    }
}
