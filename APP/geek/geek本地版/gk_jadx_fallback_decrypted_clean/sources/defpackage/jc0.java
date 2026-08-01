package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class jc0 {
    public static /* bridge */ /* synthetic */ android.graphics.Insets a(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getTappableElementInsets()
            return r0
    }

    public static /* synthetic */ android.view.WindowInsets.Builder b() {
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>()
            return r0
    }

    public static /* synthetic */ android.view.WindowInsets.Builder c(android.view.WindowInsets r1) {
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets d(android.view.WindowInsets r0, int r1, int r2, int r3, int r4) {
            android.view.WindowInsets r0 = r0.inset(r1, r2, r3, r4)
            return r0
    }

    public static /* bridge */ /* synthetic */ void e(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setMandatorySystemGestureInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets f(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
            return r0
    }

    public static /* bridge */ /* synthetic */ void g(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setTappableElementInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets h(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getSystemGestureInsets()
            return r0
    }
}
