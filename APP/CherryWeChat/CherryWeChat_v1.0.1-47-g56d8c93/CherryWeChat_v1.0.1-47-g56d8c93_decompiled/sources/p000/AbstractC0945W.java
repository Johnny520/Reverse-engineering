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
    public static void m1800a(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m1801b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static void m1802c(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    /* JADX INFO: renamed from: d */
    public static void m1803d(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    /* JADX INFO: renamed from: e */
    public static void m1804e(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    /* JADX INFO: renamed from: f */
    public static void m1805f(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
