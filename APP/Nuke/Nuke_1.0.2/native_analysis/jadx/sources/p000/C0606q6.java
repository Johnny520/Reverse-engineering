package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: q6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0606q6 extends AbstractC0720t3 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0045b7 f8744k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ r61 f8745l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0045b7 f8746m;

    public C0606q6(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, r61 r61Var, ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b72) {
        this.f8744k = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        this.f8745l = r61Var;
        this.f8746m = viewTreeObserverOnGlobalLayoutListenerC0045b72;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // p000.AbstractC0720t3
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4056b(View view, C0411l4 c0411l4) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0411l4.f5914a;
        this.f10507h.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f8744k;
        ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7 = viewTreeObserverOnGlobalLayoutListenerC0045b7.f638G;
        if (viewOnAttachStateChangeListenerC0267h7.m2108o()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        r61 r61Var = this.f8745l;
        r61 r61VarM4389u = r61Var.m4389u();
        while (true) {
            if (r61VarM4389u == null) {
                r61VarM4389u = null;
                break;
            } else if (r61VarM4389u.f9372M.m5731m(8)) {
                break;
            } else {
                r61VarM4389u = r61VarM4389u.m4389u();
            }
        }
        Integer numValueOf = r61VarM4389u != null ? Integer.valueOf(r61VarM4389u.f9385i) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == viewTreeObserverOnGlobalLayoutListenerC0045b7.getSemanticsOwner().m5334a().f9052f) {
                numValueOf = -1;
            }
        }
        int iIntValue = numValueOf.intValue();
        c0411l4.f5915b = iIntValue;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b72 = this.f8746m;
        accessibilityNodeInfo.setParent(viewTreeObserverOnGlobalLayoutListenerC0045b72, iIntValue);
        int i = r61Var.f9385i;
        int iM6155d = viewOnAttachStateChangeListenerC0267h7.f3852I.m6155d(i);
        if (iM6155d != -1) {
            AbstractC0309ic abstractC0309icM1441V = AbstractC0179eu.m1441V(viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui(), iM6155d);
            if (abstractC0309icM1441V != null) {
                accessibilityNodeInfo.setTraversalBefore(abstractC0309icM1441V);
            } else {
                accessibilityNodeInfo.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0045b72, iM6155d);
            }
            ViewTreeObserverOnGlobalLayoutListenerC0045b7.m445d(viewTreeObserverOnGlobalLayoutListenerC0045b7, i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC0267h7.f3854K);
        }
        int iM6155d2 = viewOnAttachStateChangeListenerC0267h7.f3853J.m6155d(i);
        if (iM6155d2 != -1) {
            AbstractC0309ic abstractC0309icM1441V2 = AbstractC0179eu.m1441V(viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui(), iM6155d2);
            if (abstractC0309icM1441V2 != null) {
                accessibilityNodeInfo.setTraversalAfter(abstractC0309icM1441V2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(viewTreeObserverOnGlobalLayoutListenerC0045b72, iM6155d2);
            }
            ViewTreeObserverOnGlobalLayoutListenerC0045b7.m445d(viewTreeObserverOnGlobalLayoutListenerC0045b7, i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC0267h7.f3855L);
        }
    }
}
