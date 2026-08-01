package p000;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0949z {
    /* JADX INFO: renamed from: a */
    public static boolean m2782a(AccessibilityManager accessibilityManager, InterfaceC0001a0 interfaceC0001a0) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0051b0(interfaceC0001a0));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2783b(AccessibilityManager accessibilityManager, InterfaceC0001a0 interfaceC0001a0) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0051b0(interfaceC0001a0));
    }
}
