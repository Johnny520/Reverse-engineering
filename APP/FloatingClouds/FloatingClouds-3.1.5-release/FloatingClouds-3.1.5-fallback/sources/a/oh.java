package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh {
    public static /* bridge */ /* synthetic */ android.graphics.Insets a(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getTappableElementInsets()
            return r0
    }

    public static /* synthetic */ android.view.WindowInsets.Builder b(android.view.WindowInsets r1) {
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets c(android.view.WindowInsets r0, int r1, int r2, int r3, int r4) {
            android.view.WindowInsets r0 = r0.inset(r1, r2, r3, r4)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets d(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets e(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getSystemGestureInsets()
            return r0
    }
}
