package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: m4 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0448m4 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final C0485n4 f6467a;

    public C0448m4(C0485n4 c0485n4) {
        this.f6467a = c0485n4;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f6467a.mo654i(i, new C0411l4(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C0411l4 c0411l4Mo655l = this.f6467a.mo655l(i);
        if (c0411l4Mo655l == null) {
            return null;
        }
        return c0411l4Mo655l.f5914a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f6467a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C0411l4 c0411l4Mo656s = this.f6467a.mo656s(i);
        if (c0411l4Mo656s == null) {
            return null;
        }
        return c0411l4Mo656s.f5914a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f6467a.mo657w(i, i2, bundle);
    }
}
