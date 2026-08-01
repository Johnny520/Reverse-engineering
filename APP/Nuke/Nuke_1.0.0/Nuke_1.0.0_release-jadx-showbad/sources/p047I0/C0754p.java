package p047I0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import p041H0.C0564I;
import p170h1.AbstractC2218i;
import p229r1.AbstractC3067b;
import p234s1.C3175g;

/* JADX INFO: renamed from: I0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0754p extends AbstractC3067b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0772y f2341g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0564I f2342h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0772y f2343i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0754p(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, C0564I c0564i, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2) {
        this.f2341g = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f2342h = c0564i;
        this.f2343i = viewTreeObserverOnGlobalLayoutListenerC0772y2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // p229r1.AbstractC3067b
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1270b(View view, C3175g c3175g) {
        AccessibilityNodeInfo accessibilityNodeInfo = c3175g.f9931a;
        this.f9779d.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2341g;
        ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E = viewTreeObserverOnGlobalLayoutListenerC0772y.f2428B;
        if (viewOnAttachStateChangeListenerC0667E.m1156o()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        C0564I c0564i = this.f2342h;
        C0564I c0564iM839u = c0564i.m839u();
        while (true) {
            if (c0564iM839u == null) {
                c0564iM839u = null;
                break;
            } else if (c0564iM839u.f1699J.m962d(8)) {
                break;
            } else {
                c0564iM839u = c0564iM839u.m839u();
            }
        }
        Integer numValueOf = c0564iM839u != null ? Integer.valueOf(c0564iM839u.f1712e) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == viewTreeObserverOnGlobalLayoutListenerC0772y.getSemanticsOwner().m2180a().f3714g) {
                numValueOf = -1;
            }
        }
        int iIntValue = numValueOf.intValue();
        c3175g.f9932b = iIntValue;
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2 = this.f2343i;
        accessibilityNodeInfo.setParent(viewTreeObserverOnGlobalLayoutListenerC0772y2, iIntValue);
        int i5 = c0564i.f1712e;
        int iM4331d = viewOnAttachStateChangeListenerC0667E.f2116F.m4331d(i5);
        if (iM4331d != -1) {
            AbstractC2218i abstractC2218iM1194p = AbstractC0681L.m1194p(viewTreeObserverOnGlobalLayoutListenerC0772y.getAndroidViewsHandler$ui(), iM4331d);
            if (abstractC2218iM1194p != null) {
                accessibilityNodeInfo.setTraversalBefore(abstractC2218iM1194p);
            } else {
                accessibilityNodeInfo.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0772y2, iM4331d);
            }
            ViewTreeObserverOnGlobalLayoutListenerC0772y.m1285e(viewTreeObserverOnGlobalLayoutListenerC0772y, i5, accessibilityNodeInfo, viewOnAttachStateChangeListenerC0667E.f2118H);
        }
        int iM4331d2 = viewOnAttachStateChangeListenerC0667E.f2117G.m4331d(i5);
        if (iM4331d2 != -1) {
            AbstractC2218i abstractC2218iM1194p2 = AbstractC0681L.m1194p(viewTreeObserverOnGlobalLayoutListenerC0772y.getAndroidViewsHandler$ui(), iM4331d2);
            if (abstractC2218iM1194p2 != null) {
                accessibilityNodeInfo.setTraversalAfter(abstractC2218iM1194p2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(viewTreeObserverOnGlobalLayoutListenerC0772y2, iM4331d2);
            }
            ViewTreeObserverOnGlobalLayoutListenerC0772y.m1285e(viewTreeObserverOnGlobalLayoutListenerC0772y, i5, accessibilityNodeInfo, viewOnAttachStateChangeListenerC0667E.f2119I);
        }
    }
}
