package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final android.view.View.AccessibilityDelegate f4184i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.view.View.AccessibilityDelegate f4185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g3.a f4186h;

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            g3.b.f4184i = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            android.view.View$AccessibilityDelegate r0 = g3.b.f4184i
            r1.f4185g = r0
            g3.a r0 = new g3.a
            r0.<init>(r1)
            r1.f4186h = r0
            return
    }

    public androidx.lifecycle.x a(android.view.View r3) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.f4185g
            android.view.accessibility.AccessibilityNodeProvider r3 = r0.getAccessibilityNodeProvider(r3)
            if (r3 == 0) goto L10
            androidx.lifecycle.x r0 = new androidx.lifecycle.x
            r1 = 17
            r0.<init>(r3, r1)
            return r0
        L10:
            r3 = 0
            return r3
    }

    public void b(android.view.View r2, h3.g r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f4185g
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.f5066a
            r0.onInitializeAccessibilityNodeInfo(r2, r3)
            return
    }
}
