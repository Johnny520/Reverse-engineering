package p357y1;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import p091g3.AbstractC1299b;
import p103h3.C1578g;
import p339x1.C5602f0;
import p340x2.AbstractC5673h;

/* JADX INFO: renamed from: y1.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5906m extends AbstractC1299b {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5934t f23974j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C5602f0 f23975k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5934t f23976l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5906m(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, C5602f0 c5602f0, ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t2) {
        this.f23974j = viewTreeObserverOnGlobalLayoutListenerC5934t;
        this.f23975k = c5602f0;
        this.f23976l = viewTreeObserverOnGlobalLayoutListenerC5934t2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // p091g3.AbstractC1299b
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3450b(View view, C1578g c1578g) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1578g.f5248a;
        this.f4353g.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f23974j;
        ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = viewTreeObserverOnGlobalLayoutListenerC5934t.f24072F;
        if (viewOnAttachStateChangeListenerC5958z.m10701o()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        C5602f0 c5602f0 = this.f23975k;
        C5602f0 c5602f0M10049u = c5602f0.m10049u();
        while (true) {
            if (c5602f0M10049u == null) {
                c5602f0M10049u = null;
                break;
            } else if (c5602f0M10049u.f22778L.m9982d(8)) {
                break;
            } else {
                c5602f0M10049u = c5602f0M10049u.m10049u();
            }
        }
        Integer numValueOf = c5602f0M10049u != null ? Integer.valueOf(c5602f0M10049u.f22791h) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == viewTreeObserverOnGlobalLayoutListenerC5934t.getSemanticsOwner().m2668a().f3352f) {
                numValueOf = -1;
            }
        }
        int iIntValue = numValueOf.intValue();
        c1578g.f5249b = iIntValue;
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t2 = this.f23976l;
        accessibilityNodeInfo.setParent(viewTreeObserverOnGlobalLayoutListenerC5934t2, iIntValue);
        int i9 = c5602f0.f22791h;
        int iM2366d = viewOnAttachStateChangeListenerC5958z.f24203H.m2366d(i9);
        if (iM2366d != -1) {
            AbstractC5673h abstractC5673hM10604t = AbstractC5883g0.m10604t(viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui(), iM2366d);
            if (abstractC5673hM10604t != null) {
                accessibilityNodeInfo.setTraversalBefore(abstractC5673hM10604t);
            } else {
                accessibilityNodeInfo.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC5934t2, iM2366d);
            }
            ViewTreeObserverOnGlobalLayoutListenerC5934t.m10632f(viewTreeObserverOnGlobalLayoutListenerC5934t, i9, accessibilityNodeInfo, viewOnAttachStateChangeListenerC5958z.f24205J);
        }
        int iM2366d2 = viewOnAttachStateChangeListenerC5958z.f24204I.m2366d(i9);
        if (iM2366d2 != -1) {
            AbstractC5673h abstractC5673hM10604t2 = AbstractC5883g0.m10604t(viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui(), iM2366d2);
            if (abstractC5673hM10604t2 != null) {
                accessibilityNodeInfo.setTraversalAfter(abstractC5673hM10604t2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(viewTreeObserverOnGlobalLayoutListenerC5934t2, iM2366d2);
            }
            ViewTreeObserverOnGlobalLayoutListenerC5934t.m10632f(viewTreeObserverOnGlobalLayoutListenerC5934t, i9, accessibilityNodeInfo, viewOnAttachStateChangeListenerC5958z.f24206K);
        }
    }
}
