package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p206.C8611;
import p206.ViewOnKeyListenerC8605;
import p206.ViewOnKeyListenerC8610;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0968 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f893;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f894;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0968(Object obj, int i) {
        this.f894 = i;
        this.f893 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f894;
        Object obj = this.f893;
        switch (i) {
            case 0:
                C1074 c1074 = (C1074) obj;
                if (!c1074.getInternalPopup().mo1081()) {
                    c1074.f1200.mo1076(c1074.getTextDirection(), c1074.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c1074.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                C0962 c0962 = (C0962) obj;
                C1074 c10742 = c0962.f879;
                if (c10742.isAttachedToWindow() && c10742.getGlobalVisibleRect(c0962.f881)) {
                    c0962.m1075();
                    c0962.show();
                } else {
                    c0962.dismiss();
                }
                break;
            case 2:
                ViewOnKeyListenerC8610 viewOnKeyListenerC8610 = (ViewOnKeyListenerC8610) obj;
                ArrayList arrayList = viewOnKeyListenerC8610.f21505;
                if (viewOnKeyListenerC8610.mo1206() && arrayList.size() > 0 && !((C8611) arrayList.get(0)).f21512.f1057) {
                    View view = viewOnKeyListenerC8610.f21501;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C8611) it.next()).f21512.show();
                        }
                    } else {
                        viewOnKeyListenerC8610.dismiss();
                    }
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC8605 viewOnKeyListenerC8605 = (ViewOnKeyListenerC8605) obj;
                C1015 c1015 = viewOnKeyListenerC8605.f21470;
                if (viewOnKeyListenerC8605.mo1206() && !c1015.f1057) {
                    View view2 = viewOnKeyListenerC8605.f21456;
                    if (view2 != null && view2.isShown()) {
                        c1015.show();
                    } else {
                        viewOnKeyListenerC8605.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
