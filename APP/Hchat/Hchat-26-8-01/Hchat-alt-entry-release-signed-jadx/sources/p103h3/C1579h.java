package p103h3;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.lifecycle.C0119x;
import java.util.List;

/* JADX INFO: renamed from: h3.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1579h extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final C0119x f5251a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1579h(C0119x c0119x) {
        this.f5251a = c0119x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i9, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f5251a.mo601f(i9, new C1578g(accessibilityNodeInfo), str, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i9) {
        C1578g c1578gMo605l = this.f5251a.mo605l(i9);
        if (c1578gMo605l == null) {
            return null;
        }
        return c1578gMo605l.f5248a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i9) {
        this.f5251a.getClass();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i9) {
        C1578g c1578gMo609r = this.f5251a.mo609r(i9);
        if (c1578gMo609r == null) {
            return null;
        }
        return c1578gMo609r.f5248a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i9, int i10, Bundle bundle) {
        return this.f5251a.mo577H(i9, i10, bundle);
    }
}
