package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends AccessibilityNodeProvider {
    public final l0 a;

    public k0(l0 r1) {
        this.a = r1;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int r1, AccessibilityNodeInfo r2, String r3, Bundle r4) {
        this.a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
        j0 r22 = this.a.t(r2);
        if (r22 != null) goto L7;
        return null;
    L7:
        return r22.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String r1, int r2) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int r2) {
        j0 r22 = this.a.u(r2);
        if (r22 != null) goto L7;
        return null;
    L7:
        return r22.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r2, int r3, Bundle r4) {
        return this.a.w(r2, r3, r4);
    }
}
