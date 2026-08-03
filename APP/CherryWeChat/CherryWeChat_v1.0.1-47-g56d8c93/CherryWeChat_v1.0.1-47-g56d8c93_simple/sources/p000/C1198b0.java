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

    public C1198b0(C0132D2 r1) {
        this.f4109a = r1;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int r1, AccessibilityNodeInfo r2, String r3, Bundle r4) {
        this.f4109a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
        C1118a0 r22 = this.f4109a.mo246u(r2);
        if (r22 != null) goto L7;
        return null;
    L7:
        return r22.f3530a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String r1, int r2) {
        this.f4109a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int r2) {
        C1118a0 r22 = this.f4109a.mo247v(r2);
        if (r22 != null) goto L7;
        return null;
    L7:
        return r22.f3530a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r2, int r3, Bundle r4) {
        return this.f4109a.mo249x(r2, r3, r4);
    }
}
