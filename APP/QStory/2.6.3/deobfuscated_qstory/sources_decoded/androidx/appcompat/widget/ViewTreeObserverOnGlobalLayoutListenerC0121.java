package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p190.C7782;
import p190.ViewOnKeyListenerC7776;
import p190.ViewOnKeyListenerC7781;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
                if (!c0227.getInternalPopup().mo521()) {
                    c0227.f855.mo516(c0227.getTextDirection(), c0227.getTextAlignment());
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
                    c0115.m515();
                    c0115.show();
                } else {
                    c0115.dismiss();
                }
                break;
            case 2:
                ViewOnKeyListenerC7781 viewOnKeyListenerC7781 = (ViewOnKeyListenerC7781) obj;
                ArrayList arrayList = viewOnKeyListenerC7781.f21160;
                if (viewOnKeyListenerC7781.mo646() && arrayList.size() > 0 && !((C7782) arrayList.get(0)).f21167.f712) {
                    View view = viewOnKeyListenerC7781.f21156;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C7782) it.next()).f21167.show();
                        }
                    } else {
                        viewOnKeyListenerC7781.dismiss();
                    }
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC7776 viewOnKeyListenerC7776 = (ViewOnKeyListenerC7776) obj;
                C0168 c0168 = viewOnKeyListenerC7776.f21125;
                if (viewOnKeyListenerC7776.mo646() && !c0168.f712) {
                    View view2 = viewOnKeyListenerC7776.f21111;
                    if (view2 != null && view2.isShown()) {
                        c0168.show();
                    } else {
                        viewOnKeyListenerC7776.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
