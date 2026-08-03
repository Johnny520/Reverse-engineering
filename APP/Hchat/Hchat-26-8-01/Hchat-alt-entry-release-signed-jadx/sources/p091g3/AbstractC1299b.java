package p091g3;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.lifecycle.C0119x;
import p103h3.C1578g;

/* JADX INFO: renamed from: g3.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1299b {

    /* JADX INFO: renamed from: i */
    public static final View.AccessibilityDelegate f4352i = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: g */
    public final View.AccessibilityDelegate f4353g = f4352i;

    /* JADX INFO: renamed from: h */
    public final C1297a f4354h = new C1297a(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public C0119x mo3449a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f4353g.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0119x(accessibilityNodeProvider, 17);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo3450b(View view, C1578g c1578g) {
        this.f4353g.onInitializeAccessibilityNodeInfo(view, c1578g.f5248a);
    }
}
