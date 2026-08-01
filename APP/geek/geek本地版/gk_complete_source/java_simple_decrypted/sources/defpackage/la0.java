package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class la0 {
    public static int a(ViewConfiguration r0) {
        return r0.getScaledHoverSlop();
    }

    public static boolean b(ViewConfiguration r0) {
        return r0.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
