package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0394k0 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final C0431l0 f2760a;

    public C0394k0(C0431l0 c0431l0) {
        this.f2760a = c0431l0;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f2760a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C0357j0 c0357j0Mo1723t = this.f2760a.mo1723t(i);
        if (c0357j0Mo1723t == null) {
            return null;
        }
        return c0357j0Mo1723t.f2619a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f2760a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C0357j0 c0357j0Mo1724u = this.f2760a.mo1724u(i);
        if (c0357j0Mo1724u == null) {
            return null;
        }
        return c0357j0Mo1724u.f2619a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f2760a.mo1726w(i, i2, bundle);
    }
}
