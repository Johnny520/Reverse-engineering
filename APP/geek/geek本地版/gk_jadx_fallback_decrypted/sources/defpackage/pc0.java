package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class pc0 {
    public static /* bridge */ /* synthetic */ android.view.DisplayCutout a(android.view.WindowInsets r0) {
            android.view.DisplayCutout r0 = r0.getDisplayCutout()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets b(android.view.WindowInsets r0) {
            android.view.WindowInsets r0 = r0.consumeDisplayCutout()
            return r0
    }
}
