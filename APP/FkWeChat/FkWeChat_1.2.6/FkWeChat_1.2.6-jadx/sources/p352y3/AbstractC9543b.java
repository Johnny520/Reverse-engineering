package p352y3;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: y3.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9543b {

    /* JADX INFO: renamed from: y3.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m37348a(AccessibilityEvent accessibilityEvent, boolean z10) {
            accessibilityEvent.setAccessibilityDataSensitive(z10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37347a(AccessibilityEvent accessibilityEvent, boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.m37348a(accessibilityEvent, z10);
        }
    }
}
