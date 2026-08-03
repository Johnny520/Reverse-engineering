package p000;

import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: renamed from: W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0945W {
    /* JADX INFO: renamed from: a */
    public static void m1800a(int r0) {
        SdkExtensions.getExtensionVersion(r0);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m1801b(AccessibilityNodeInfo r0) {
        return r0.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static void m1802c(Window r2, boolean r3) {
        View r0 = r2.getDecorView();
        int r1 = r0.getSystemUiVisibility();
        if (r3 == false) goto L5;
        int r12 = r1 & (-257);
    L6:
        r0.setSystemUiVisibility(r12);
        r2.setDecorFitsSystemWindows(r3);
        return;
    L5:
        r12 = r1 | 256;
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public static void m1803d(Window r0, boolean r1) {
        r0.setDecorFitsSystemWindows(r1);
    }

    /* JADX INFO: renamed from: e */
    public static void m1804e(EditorInfo r1, CharSequence r2) {
        r1.setInitialSurroundingSubText(r2, 0);
    }

    /* JADX INFO: renamed from: f */
    public static void m1805f(AccessibilityNodeInfo r0, CharSequence r1) {
        r0.setStateDescription(r1);
    }
}
