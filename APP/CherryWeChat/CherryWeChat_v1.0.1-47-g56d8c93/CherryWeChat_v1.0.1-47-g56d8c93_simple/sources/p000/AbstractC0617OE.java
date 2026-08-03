package p000;

import android.graphics.Insets;
import android.graphics.Matrix;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: OE */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0617OE {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m1193a(View r0) {
        return r0.getTransitionAlpha();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Insets m1194b(WindowInsets r0) {
        return r0.getTappableElementInsets();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ WindowInsets.Builder m1195c() {
        return new WindowInsets.Builder();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ WindowInsets.Builder m1196d(WindowInsets r1) {
        return new WindowInsets.Builder(r1);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ WindowInsets m1197e(WindowInsets.Builder r0) {
        return r0.build();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ WindowInsets m1198f(WindowInsets r0, int r1, int r2, int r3, int r4) {
        return r0.inset(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m1199g(View r0, int r1) {
        r0.setTransitionVisibility(r1);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m1200h(View r0, int r1, int r2, int r3, int r4) {
        r0.setLeftTopRightBottom(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ void m1201i(View r0, Matrix r1) {
        r0.setAnimationMatrix(r1);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ void m1202j(WindowInsets.Builder r0, Insets r1) {
        r0.setSystemWindowInsets(r1);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ Insets m1203k(WindowInsets r0) {
        return r0.getMandatorySystemGestureInsets();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m1204l(View r0, Matrix r1) {
        r0.transformMatrixToGlobal(r1);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m1205m(WindowInsets.Builder r0, Insets r1) {
        r0.setStableInsets(r1);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ Insets m1206n(WindowInsets r0) {
        return r0.getSystemGestureInsets();
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m1207o(View r0, Matrix r1) {
        r0.transformMatrixToLocal(r1);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m1208p(WindowInsets.Builder r0, Insets r1) {
        r0.setSystemGestureInsets(r1);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m1209q(WindowInsets.Builder r0, Insets r1) {
        r0.setMandatorySystemGestureInsets(r1);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m1210r(WindowInsets.Builder r0, Insets r1) {
        r0.setTappableElementInsets(r1);
    }
}
