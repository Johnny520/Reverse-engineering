package p059L0;

import android.graphics.Insets;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: renamed from: L0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0956b {
    /* JADX INFO: renamed from: a */
    public static void m1963a(int i5) {
        SdkExtensions.getExtensionVersion(i5);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m1964b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static Insets m1965c(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    /* JADX INFO: renamed from: d */
    public static void m1966d(Window window, boolean z5) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z5);
    }

    /* JADX INFO: renamed from: e */
    public static void m1967e(Window window, boolean z5) {
        window.setDecorFitsSystemWindows(z5);
    }

    /* JADX INFO: renamed from: f */
    public static void m1968f(View view) {
        view.setImportantForContentCapture(1);
    }

    /* JADX INFO: renamed from: g */
    public static void m1969g(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    /* JADX INFO: renamed from: h */
    public static void m1970h(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
