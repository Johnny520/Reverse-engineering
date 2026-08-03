package a;

/* JADX INFO: loaded from: classes.dex */
public class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityNodeProvider f129a;

    public static class a extends android.view.accessibility.AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.J f130a;

        public a(a.J r1) {
                r0 = this;
                r0.<init>()
                r0.f130a = r1
                return
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
                r1 = this;
                a.J r0 = r1.f130a
                a.I r2 = r0.a(r2)
                if (r2 != 0) goto La
                r2 = 0
                return r2
            La:
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.f118a
                return r2
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String r1, int r2) {
                r0 = this;
                a.J r1 = r0.f130a
                r1.getClass()
                r1 = 0
                return r1
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
                r1 = this;
                a.J r0 = r1.f130a
                a.I r2 = r0.b(r2)
                if (r2 != 0) goto La
                r2 = 0
                return r2
            La:
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.f118a
                return r2
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int r2, int r3, android.os.Bundle r4) {
                r1 = this;
                a.J r0 = r1.f130a
                boolean r2 = r0.c(r2, r3, r4)
                return r2
        }
    }

    public static class b extends a.J.a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int r1, android.view.accessibility.AccessibilityNodeInfo r2, java.lang.String r3, android.os.Bundle r4) {
                r0 = this;
                a.J r1 = r0.f130a
                r1.getClass()
                return
        }
    }

    public J() {
            r1 = this;
            r1.<init>()
            a.J$b r0 = new a.J$b
            r0.<init>(r1)
            r1.f129a = r0
            return
    }

    public J(android.view.accessibility.AccessibilityNodeProvider r1) {
            r0 = this;
            r0.<init>()
            r0.f129a = r1
            return
    }

    public a.I a(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public a.I b(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean c(int r1, int r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 0
            return r1
    }
}
