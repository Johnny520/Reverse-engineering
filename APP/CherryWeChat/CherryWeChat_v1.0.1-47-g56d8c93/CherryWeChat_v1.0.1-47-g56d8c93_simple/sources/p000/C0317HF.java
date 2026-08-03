package p000;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: HF */
/* JADX INFO: loaded from: classes.dex */
public class C0317HF {

    /* JADX INFO: renamed from: b */
    public static final C0489LF f1043b = null;

    /* JADX INFO: renamed from: a */
    public final C0489LF f1044a;

    static {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 34) goto L6;
        AbstractC2796zF r02 = new C2753yF();
    L15:
        f1043b = r02.mo5084b().f1602a.mo149a().f1602a.mo91b().f1602a.mo92c();
        return;
    L6:
        if (r0 < 31) goto L9;
        r02 = new C2710xF();
        goto L15
    L9:
        if (r0 < 30) goto L12;
        r02 = new C2667wF();
        goto L15
    L12:
        if (r0 < 29) goto L14;
        r02 = new C2624vF();
        goto L15
    L14:
        r02 = new C2581uF();
        goto L15
    }

    public C0317HF(C0489LF r1) {
        this.f1044a = r1;
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
    public void mo12d(View r1) {
    }

    /* JADX INFO: renamed from: e */
    public void mo13e(C0489LF r1) {
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0317HF) == true) goto L8;
        return false;
    L8:
        C0317HF r52 = (C0317HF) r5;
        if (mo17o() == r52.mo17o()) goto L11;
    L19:
        return false;
    L11:
        if (mo94n() != r52.mo94n()) goto L19;
        if (Objects.equals(mo15k(), r52.mo15k()) == false) goto L19;
        if (Objects.equals(mo93i(), r52.mo93i()) == false) goto L19;
        if (Objects.equals(mo150f(), r52.mo150f()) == false) goto L19;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public C1543ie mo150f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public C2765yl mo14g(int r1) {
        return C2765yl.f9404e;
    }

    /* JADX INFO: renamed from: h */
    public C2765yl mo260h() {
        return mo15k();
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(mo17o()), Boolean.valueOf(mo94n()), mo15k(), mo93i(), mo150f()});
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
    public C0489LF mo16m(int r1, int r2, int r3, int r4) {
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
    public void mo18p(C2765yl[] r1) {
    }

    /* JADX INFO: renamed from: q */
    public void mo19q(C2765yl r1) {
    }

    /* JADX INFO: renamed from: r */
    public void mo20r(C0489LF r1) {
    }

    /* JADX INFO: renamed from: s */
    public void mo95s(C2765yl r1) {
    }

    /* JADX INFO: renamed from: t */
    public void mo21t(int r1) {
    }
}
