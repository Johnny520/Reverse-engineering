package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p190.C7781;
import p190.ViewOnKeyListenerC7775;
import p190.ViewOnKeyListenerC7780;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0121 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f548;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f549;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0121(Object obj, int i) {
        this.f549 = i;
        this.f548 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f549;
        Object obj = this.f548;
        switch (i) {
            case 0:
                C0227 c0227 = (C0227) obj;
                if (!c0227.getInternalPopup().mo520()) {
                    c0227.f855.mo515(c0227.getTextDirection(), c0227.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0227.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                C0115 c0115 = (C0115) obj;
                C0227 c02272 = c0115.f534;
                if (c02272.isAttachedToWindow() && c02272.getGlobalVisibleRect(c0115.f536)) {
                    c0115.m514();
                    c0115.show();
                } else {
                    c0115.dismiss();
                }
                break;
            case 2:
                ViewOnKeyListenerC7780 viewOnKeyListenerC7780 = (ViewOnKeyListenerC7780) obj;
                ArrayList arrayList = viewOnKeyListenerC7780.f21163;
                if (viewOnKeyListenerC7780.mo645() && arrayList.size() > 0 && !((C7781) arrayList.get(0)).f21170.f712) {
                    View view = viewOnKeyListenerC7780.f21159;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C7781) it.next()).f21170.show();
                        }
                    } else {
                        viewOnKeyListenerC7780.dismiss();
                    }
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC7775 viewOnKeyListenerC7775 = (ViewOnKeyListenerC7775) obj;
                C0168 c0168 = viewOnKeyListenerC7775.f21128;
                if (viewOnKeyListenerC7775.mo645() && !c0168.f712) {
                    View view2 = viewOnKeyListenerC7775.f21114;
                    if (view2 != null && view2.isShown()) {
                        c0168.show();
                    } else {
                        viewOnKeyListenerC7775.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
