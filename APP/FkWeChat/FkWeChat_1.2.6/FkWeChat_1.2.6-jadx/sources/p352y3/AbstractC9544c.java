package p352y3;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: y3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9544c {

    /* JADX INFO: renamed from: y3.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m37350a(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m37349a(AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.m37350a(accessibilityManager);
        }
        return true;
    }
}
