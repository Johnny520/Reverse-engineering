package p234s1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import p121Y1.C1753n;

/* JADX INFO: renamed from: s1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3176h extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final C1753n f9934a;

    public C3176h(C1753n c1753n) {
        this.f9934a = c1753n;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i5, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f9934a.mo1323y(i5, new C3175g(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i5) {
        C3175g c3175gMo1324z = this.f9934a.mo1324z(i5);
        if (c3175gMo1324z == null) {
            return null;
        }
        return c3175gMo1324z.f9931a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i5) {
        this.f9934a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i5) {
        C3175g c3175gMo1321A = this.f9934a.mo1321A(i5);
        if (c3175gMo1321A == null) {
            return null;
        }
        return c3175gMo1321A.f9931a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i5, int i6, Bundle bundle) {
        return this.f9934a.mo1322H(i5, i6, bundle);
    }
}
