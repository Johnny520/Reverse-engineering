package p006D;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p085v.C1102c;

/* JADX INFO: renamed from: D.o0 */
/* JADX INFO: loaded from: classes.dex */
public class C0118o0 {

    /* JADX INFO: renamed from: b */
    public static final C0122q0 f304b;

    /* JADX INFO: renamed from: a */
    public final C0122q0 f305a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f304b = (i2 >= 30 ? new C0104h0() : i2 >= 29 ? new C0102g0() : new C0100f0()).mo362b().f309a.mo407a().f309a.mo389b().f309a.mo390c();
    }

    public C0118o0(C0122q0 c0122q0) {
        this.f305a = c0122q0;
    }

    /* JADX INFO: renamed from: a */
    public C0122q0 mo407a() {
        return this.f305a;
    }

    /* JADX INFO: renamed from: b */
    public C0122q0 mo389b() {
        return this.f305a;
    }

    /* JADX INFO: renamed from: c */
    public C0122q0 mo390c() {
        return this.f305a;
    }

    /* JADX INFO: renamed from: d */
    public void mo380d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public C0109k mo408e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0118o0)) {
            return false;
        }
        C0118o0 c0118o0 = (C0118o0) obj;
        return mo384n() == c0118o0.mo384n() && mo392m() == c0118o0.mo392m() && Objects.equals(mo382j(), c0118o0.mo382j()) && Objects.equals(mo391h(), c0118o0.mo391h()) && Objects.equals(mo408e(), c0118o0.mo408e());
    }

    /* JADX INFO: renamed from: f */
    public C1102c mo381f(int i2) {
        return C1102c.f4248e;
    }

    /* JADX INFO: renamed from: g */
    public C1102c mo418g() {
        return mo382j();
    }

    /* JADX INFO: renamed from: h */
    public C1102c mo391h() {
        return C1102c.f4248e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo384n()), Boolean.valueOf(mo392m()), mo382j(), mo391h(), mo408e());
    }

    /* JADX INFO: renamed from: i */
    public C1102c mo419i() {
        return mo382j();
    }

    /* JADX INFO: renamed from: j */
    public C1102c mo382j() {
        return C1102c.f4248e;
    }

    /* JADX INFO: renamed from: k */
    public C1102c mo420k() {
        return mo382j();
    }

    /* JADX INFO: renamed from: l */
    public C0122q0 mo383l(int i2, int i3, int i4, int i5) {
        return f304b;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo392m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo384n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public void mo385o(C1102c[] c1102cArr) {
    }

    /* JADX INFO: renamed from: p */
    public void mo386p(C0122q0 c0122q0) {
    }

    /* JADX INFO: renamed from: q */
    public void mo393q(C1102c c1102c) {
    }
}
