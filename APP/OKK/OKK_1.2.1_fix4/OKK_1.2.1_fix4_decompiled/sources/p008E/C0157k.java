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

    public C0157k(C0158l c0158l) {
        this.f360a = c0158l;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f360a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        C0156j c0156jMo512a = this.f360a.mo512a(i2);
        if (c0156jMo512a == null) {
            return null;
        }
        return c0156jMo512a.f357a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        this.f360a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        C0156j c0156jMo513b = this.f360a.mo513b(i2);
        if (c0156jMo513b == null) {
            return null;
        }
        return c0156jMo513b.f357a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        return this.f360a.mo514c(i2, i3, bundle);
    }
}
