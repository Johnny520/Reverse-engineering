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

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0772c(AbstractC0781l r1, int r2) {
        this.f2743a = r2;
        this.f2744b = r1;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch(this.f2743a) {
            case 0: goto L16;
            default: goto L4;
        };
    L4:
        ViewOnKeyListenerC0788s r02 = (ViewOnKeyListenerC0788s) this.f2744b;
        if (r02.mo1978d() == true) goto L7;
        return;
    L7:
        if (r02.f2854i.f3271u == true) goto L35;
        View r1 = r02.f2859n;
        if (r1 != null) goto L11;
    L14:
        r02.dismiss();
        return;
    L11:
        if (r1.isShown() == false) goto L14;
        r02.f2854i.mo1980f();
        return;
    L35:
        return;
    L16:
        ViewOnKeyListenerC0775f r03 = (ViewOnKeyListenerC0775f) this.f2744b;
        if (r03.mo1978d() == false) goto L37;
        ArrayList r12 = r03.f2760i;
        if (r12.size() > 0) goto L21;
        return;
    L21:
        if (((C0774e) r12.get(0)).f2749a.f3271u == true) goto L39;
        View r2 = r03.f2767p;
        if (r2 != null) goto L25;
    L31:
        r03.dismiss();
        return;
    L25:
        if (r2.isShown() == false) goto L31;
        Iterator r04 = r12.iterator();
    L29:
        if (r04.hasNext() == false) goto L40;
        ((C0774e) r04.next()).f2749a.mo1980f();
        goto L29
    L40:
        return;
    L39:
        return;
    }
}
