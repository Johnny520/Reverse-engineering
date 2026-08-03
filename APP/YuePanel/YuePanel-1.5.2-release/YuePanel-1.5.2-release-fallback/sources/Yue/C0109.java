package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0109 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ, reason: contains not printable characters */
    @java.lang.Deprecated
    public interface InterfaceC0110 {
        @java.lang.Deprecated
        void onAccessibilityStateChanged(boolean r1);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ۟, reason: contains not printable characters */
    @java.lang.Deprecated
    public static abstract class AbstractC0111 implements Yue.C0109.InterfaceC0110 {
        public AbstractC0111() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ۟۟, reason: contains not printable characters */
    public static class AccessibilityManagerAccessibilityStateChangeListenerC0112 implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Yue.C0109.InterfaceC0110 f232;

        public AccessibilityManagerAccessibilityStateChangeListenerC0112(@Yue.InterfaceC4410 Yue.C0109.InterfaceC0110 r1) {
                r0 = this;
                r0.<init>()
                r0.f232 = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof Yue.C0109.AccessibilityManagerAccessibilityStateChangeListenerC0112
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                Yue.ۥۣ۟۟ۤ$ۥ۟۟ r2 = (Yue.C0109.AccessibilityManagerAccessibilityStateChangeListenerC0112) r2
                Yue.ۥۣ۟۟ۤ$ۥ r0 = r1.f232
                Yue.ۥۣ۟۟ۤ$ۥ r2 = r2.f232
                boolean r2 = r0.equals(r2)
                return r2
        }

        public int hashCode() {
                r1 = this;
                Yue.ۥۣ۟۟ۤ$ۥ r0 = r1.f232
                int r0 = r0.hashCode()
                return r0
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean r2) {
                r1 = this;
                Yue.ۥۣ۟۟ۤ$ۥ r0 = r1.f232
                r0.onAccessibilityStateChanged(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C0113 {
        public C0113() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m593(android.view.accessibility.AccessibilityManager r0) {
                boolean r0 = r0.isRequestFromAccessibilityTool()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC0114 {
        void onTouchExplorationStateChanged(boolean r1);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class AccessibilityManagerTouchExplorationStateChangeListenerC0115 implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C0109.InterfaceC0114 f233;

        public AccessibilityManagerTouchExplorationStateChangeListenerC0115(@Yue.InterfaceC4410 Yue.C0109.InterfaceC0114 r1) {
                r0 = this;
                r0.<init>()
                r0.f233 = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof Yue.C0109.AccessibilityManagerTouchExplorationStateChangeListenerC0115
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۠ r2 = (Yue.C0109.AccessibilityManagerTouchExplorationStateChangeListenerC0115) r2
                Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۟ r0 = r1.f233
                Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۟ r2 = r2.f233
                boolean r2 = r0.equals(r2)
                return r2
        }

        public int hashCode() {
                r1 = this;
                Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۟ r0 = r1.f233
                int r0 = r0.hashCode()
                return r0
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean r2) {
                r1 = this;
                Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۟ r0 = r1.f233
                r0.onTouchExplorationStateChanged(r2)
                return
        }
    }

    public C0109() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m585(android.view.accessibility.AccessibilityManager r1, Yue.C0109.InterfaceC0110 r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            Yue.ۥۣ۟۟ۤ$ۥ۟۟ r0 = new Yue.ۥۣ۟۟ۤ$ۥ۟۟
            r0.<init>(r2)
            boolean r1 = r1.addAccessibilityStateChangeListener(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m586(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityManager r1, @Yue.InterfaceC4410 Yue.C0109.InterfaceC0114 r2) {
            Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۠ r0 = new Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۠
            r0.<init>(r2)
            boolean r1 = r1.addTouchExplorationStateChangeListener(r0)
            return r1
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.util.List<android.accessibilityservice.AccessibilityServiceInfo> m587(android.view.accessibility.AccessibilityManager r0, int r1) {
            java.util.List r0 = r0.getEnabledAccessibilityServiceList(r1)
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.util.List<android.accessibilityservice.AccessibilityServiceInfo> m588(android.view.accessibility.AccessibilityManager r0) {
            java.util.List r0 = r0.getInstalledAccessibilityServiceList()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m589(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r2 = Yue.C0109.C0113.m593(r2)
            return r2
        Lb:
            r2 = 1
            return r2
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m590(android.view.accessibility.AccessibilityManager r0) {
            boolean r0 = r0.isTouchExplorationEnabled()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m591(android.view.accessibility.AccessibilityManager r1, Yue.C0109.InterfaceC0110 r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            Yue.ۥۣ۟۟ۤ$ۥ۟۟ r0 = new Yue.ۥۣ۟۟ۤ$ۥ۟۟
            r0.<init>(r2)
            boolean r1 = r1.removeAccessibilityStateChangeListener(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m592(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityManager r1, @Yue.InterfaceC4410 Yue.C0109.InterfaceC0114 r2) {
            Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۠ r0 = new Yue.ۥۣ۟۟ۤ$ۥ۟۟۟۠
            r0.<init>(r2)
            boolean r1 = r1.removeTouchExplorationStateChangeListener(r0)
            return r1
    }
}
