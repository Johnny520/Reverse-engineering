package p055f;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: f.c */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0772c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0781l f2744b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0772c(AbstractC0781l abstractC0781l, int i2) {
        this.f2743a = i2;
        this.f2744b = abstractC0781l;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2743a) {
            case 0:
                ViewOnKeyListenerC0775f viewOnKeyListenerC0775f = (ViewOnKeyListenerC0775f) this.f2744b;
                if (viewOnKeyListenerC0775f.mo1978d()) {
                    ArrayList arrayList = viewOnKeyListenerC0775f.f2760i;
                    if (arrayList.size() > 0 && !((C0774e) arrayList.get(0)).f2749a.f3271u) {
                        View view = viewOnKeyListenerC0775f.f2767p;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0774e) it.next()).f2749a.mo1980f();
                            }
                        } else {
                            viewOnKeyListenerC0775f.dismiss();
                        }
                        break;
                    }
                }
                break;
            default:
                ViewOnKeyListenerC0788s viewOnKeyListenerC0788s = (ViewOnKeyListenerC0788s) this.f2744b;
                if (viewOnKeyListenerC0788s.mo1978d() && !viewOnKeyListenerC0788s.f2854i.f3271u) {
                    View view2 = viewOnKeyListenerC0788s.f2859n;
                    if (view2 != null && view2.isShown()) {
                        viewOnKeyListenerC0788s.f2854i.mo1980f();
                    } else {
                        viewOnKeyListenerC0788s.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
