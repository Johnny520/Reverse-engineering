package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: W3 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0949W3 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2973a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2974b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0949W3(int i, Object obj) {
        this.f2973a = i;
        this.f2974b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2973a) {
            case 0:
                C1394f4 c1394f4 = (C1394f4) this.f2974b;
                if (!c1394f4.getInternalPopup().mo1971a()) {
                    c1394f4.f4954f.mo1979m(c1394f4.getTextDirection(), c1394f4.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c1394f4.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                C1245c4 c1245c4 = (C1245c4) this.f2974b;
                C1394f4 c1394f42 = c1245c4.f4236G;
                c1245c4.getClass();
                if (c1394f42.isAttachedToWindow() && c1394f42.getGlobalVisibleRect(c1245c4.f4234E)) {
                    c1245c4.m2367s();
                    c1245c4.mo577c();
                } else {
                    c1245c4.dismiss();
                }
                break;
            case 2:
                ViewOnKeyListenerC1125a7 viewOnKeyListenerC1125a7 = (ViewOnKeyListenerC1125a7) this.f2974b;
                ArrayList arrayList = viewOnKeyListenerC1125a7.f3548h;
                if (viewOnKeyListenerC1125a7.mo575a() && arrayList.size() > 0 && !((C1081Z6) arrayList.get(0)).f3447a.f961y) {
                    View view = viewOnKeyListenerC1125a7.f3555o;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C1081Z6) it.next()).f3447a.mo577c();
                        }
                    } else {
                        viewOnKeyListenerC1125a7.dismiss();
                    }
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC1029Xy viewOnKeyListenerC1029Xy = (ViewOnKeyListenerC1029Xy) this.f2974b;
                C0077Br c0077Br = viewOnKeyListenerC1029Xy.f3281h;
                if (viewOnKeyListenerC1029Xy.mo575a() && !c0077Br.f961y) {
                    View view2 = viewOnKeyListenerC1029Xy.f3286m;
                    if (view2 != null && view2.isShown()) {
                        c0077Br.mo577c();
                    } else {
                        viewOnKeyListenerC1029Xy.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
