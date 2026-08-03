package Yue;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3026 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ */
    @Deprecated
    public interface InterfaceC0032 {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ۟ */
    @Deprecated
    public static abstract class AbstractC0033 implements InterfaceC0032 {
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ۟۟, reason: contains not printable characters */
    public static class AccessibilityManagerAccessibilityStateChangeListenerC3027 implements AccessibilityManager.AccessibilityStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public InterfaceC0032 f4427;

        public AccessibilityManagerAccessibilityStateChangeListenerC3027(@InterfaceC6391 InterfaceC0032 interfaceC0032) {
            this.f4427 = interfaceC0032;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC3027) {
                return this.f4427.equals(((AccessibilityManagerAccessibilityStateChangeListenerC3027) obj).f4427);
            }
            return false;
        }

        public int hashCode() {
            return this.f4427.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            this.f4427.onAccessibilityStateChanged(z);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(34)
    public static class C3028 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m93(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC3029 {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class AccessibilityManagerTouchExplorationStateChangeListenerC3030 implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: ۥ */
        public final InterfaceC3029 f43;

        public AccessibilityManagerTouchExplorationStateChangeListenerC3030(@InterfaceC6391 InterfaceC3029 interfaceC3029) {
            this.f43 = interfaceC3029;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC3030) {
                return this.f43.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC3030) obj).f43);
            }
            return false;
        }

        public int hashCode() {
            return this.f43.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f43.onTouchExplorationStateChanged(z);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public static boolean m91(AccessibilityManager accessibilityManager, InterfaceC0032 interfaceC0032) {
        if (interfaceC0032 == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC3027(interfaceC0032));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m92(@InterfaceC6391 AccessibilityManager accessibilityManager, @InterfaceC6391 InterfaceC3029 interfaceC3029) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC3030(interfaceC3029));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static List<AccessibilityServiceInfo> m5938(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static List<AccessibilityServiceInfo> m5939(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m5940(@InterfaceC6391 AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C3028.m93(accessibilityManager);
        }
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m5941(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m5942(AccessibilityManager accessibilityManager, InterfaceC0032 interfaceC0032) {
        if (interfaceC0032 == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC3027(interfaceC0032));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m5943(@InterfaceC6391 AccessibilityManager accessibilityManager, @InterfaceC6391 InterfaceC3029 interfaceC3029) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC3030(interfaceC3029));
    }
}
