package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class pc0 {
    public static /* bridge */ /* synthetic */ DisplayCutout a(WindowInsets r0) {
        return r0.getDisplayCutout();
    }

    public static /* bridge */ /* synthetic */ WindowInsets b(WindowInsets r0) {
        return r0.consumeDisplayCutout();
    }
}
