package p008E;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: E.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0157k extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final C0158l f360a;

    public C0157k(C0158l r1) {
        this.f360a = r1;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int r1, AccessibilityNodeInfo r2, String r3, Bundle r4) {
        this.f360a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
        C0156j r22 = this.f360a.mo512a(r2);
        if (r22 != null) goto L7;
        return null;
    L7:
        return r22.f357a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String r1, int r2) {
        this.f360a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int r2) {
        C0156j r22 = this.f360a.mo513b(r2);
        if (r22 != null) goto L7;
        return null;
    L7:
        return r22.f357a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r2, int r3, Bundle r4) {
        return this.f360a.mo514c(r2, r3, r4);
    }
}
