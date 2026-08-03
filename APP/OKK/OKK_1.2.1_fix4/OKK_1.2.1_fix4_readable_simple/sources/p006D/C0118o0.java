package p006D;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p085v.C1102c;

/* JADX INFO: renamed from: D.o0 */
/* JADX INFO: loaded from: classes.dex */
public class C0118o0 {

    /* JADX INFO: renamed from: b */
    public static final C0122q0 f304b = null;

    /* JADX INFO: renamed from: a */
    public final C0122q0 f305a;

    static {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 30) goto L6;
        AbstractC0106i0 r03 = new C0104h0();
    L9:
        f304b = r03.mo362b().f309a.mo407a().f309a.mo389b().f309a.mo390c();
        return;
    L6:
        if (r02 < 29) goto L8;
        r03 = new C0102g0();
        goto L9
    L8:
        r03 = new C0100f0();
        goto L9
    }

    public C0118o0(C0122q0 r1) {
        this.f305a = r1;
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
    public void mo380d(View r1) {
    }

    /* JADX INFO: renamed from: e */
    public C0109k mo408e() {
        return null;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0118o0) == true) goto L8;
        return false;
    L8:
        C0118o0 r52 = (C0118o0) r5;
        if (mo384n() != r52.mo384n()) goto L20;
        if (mo392m() != r52.mo392m()) goto L20;
        if (Objects.equals(mo382j(), r52.mo382j()) == false) goto L20;
        if (Objects.equals(mo391h(), r52.mo391h()) == false) goto L20;
        if (Objects.equals(mo408e(), r52.mo408e()) == false) goto L20;
        return true;
    L20:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C1102c mo381f(int r1) {
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
        return Objects.hash(new Object[]{Boolean.valueOf(mo384n()), Boolean.valueOf(mo392m()), mo382j(), mo391h(), mo408e()});
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
    public C0122q0 mo383l(int r1, int r2, int r3, int r4) {
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
    public void mo385o(C1102c[] r1) {
    }

    /* JADX INFO: renamed from: p */
    public void mo386p(C0122q0 r1) {
    }

    /* JADX INFO: renamed from: q */
    public void mo393q(C1102c r1) {
    }
}
