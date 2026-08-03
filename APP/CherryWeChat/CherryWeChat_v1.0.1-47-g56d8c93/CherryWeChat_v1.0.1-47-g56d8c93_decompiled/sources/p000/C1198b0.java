package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1198b0 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final C0132D2 f4109a;

    public C1198b0(C0132D2 c0132d2) {
        this.f4109a = c0132d2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f4109a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C1118a0 c1118a0Mo246u = this.f4109a.mo246u(i);
        if (c1118a0Mo246u == null) {
            return null;
        }
        return c1118a0Mo246u.f3530a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f4109a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C1118a0 c1118a0Mo247v = this.f4109a.mo247v(i);
        if (c1118a0Mo247v == null) {
            return null;
        }
        return c1118a0Mo247v.f3530a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f4109a.mo249x(i, i2, bundle);
    }
}
