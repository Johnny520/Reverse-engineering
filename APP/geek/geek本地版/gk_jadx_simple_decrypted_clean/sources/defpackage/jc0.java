package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class jc0 {
    public static /* bridge */ /* synthetic */ Insets a(WindowInsets r0) {
        return r0.getTappableElementInsets();
    }

    public static /* synthetic */ WindowInsets.Builder b() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder c(WindowInsets r1) {
        return new WindowInsets.Builder(r1);
    }

    public static /* bridge */ /* synthetic */ WindowInsets d(WindowInsets r0, int r1, int r2, int r3, int r4) {
        return r0.inset(r1, r2, r3, r4);
    }

    public static /* bridge */ /* synthetic */ void e(WindowInsets.Builder r0, Insets r1) {
        r0.setMandatorySystemGestureInsets(r1);
    }

    public static /* bridge */ /* synthetic */ Insets f(WindowInsets r0) {
        return r0.getMandatorySystemGestureInsets();
    }

    public static /* bridge */ /* synthetic */ void g(WindowInsets.Builder r0, Insets r1) {
        r0.setTappableElementInsets(r1);
    }

    public static /* bridge */ /* synthetic */ Insets h(WindowInsets r0) {
        return r0.getSystemGestureInsets();
    }
}
