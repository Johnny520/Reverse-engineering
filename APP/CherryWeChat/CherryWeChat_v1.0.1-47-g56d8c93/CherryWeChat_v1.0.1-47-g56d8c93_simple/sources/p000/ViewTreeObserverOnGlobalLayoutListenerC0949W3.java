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

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0949W3(int r1, Object r2) {
        this.f2973a = r1;
        this.f2974b = r2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch(this.f2973a) {
            case 0: goto L40;
            case 1: goto L33;
            case 2: goto L16;
            default: goto L4;
        };
    L4:
        ViewOnKeyListenerC1029Xy r0 = (ViewOnKeyListenerC1029Xy) this.f2974b;
        C0077Br r1 = r0.f3281h;
        if (r0.mo575a() == true) goto L7;
        return;
    L7:
        if (r1.f961y == true) goto L49;
        View r2 = r0.f3286m;
        if (r2 != null) goto L11;
    L14:
        r0.dismiss();
        return;
    L11:
        if (r2.isShown() == false) goto L14;
        r1.mo577c();
        return;
    L49:
        return;
    L16:
        ViewOnKeyListenerC1125a7 r02 = (ViewOnKeyListenerC1125a7) this.f2974b;
        ArrayList r12 = r02.f3548h;
        if (r02.mo575a() == true) goto L19;
        return;
    L19:
        if (r12.size() > 0) goto L21;
        return;
    L21:
        if (((C1081Z6) r12.get(0)).f3447a.f961y == true) goto L53;
        View r22 = r02.f3555o;
        if (r22 != null) goto L25;
    L31:
        r02.dismiss();
        return;
    L25:
        if (r22.isShown() == false) goto L31;
        Iterator r03 = r12.iterator();
    L29:
        if (r03.hasNext() == false) goto L54;
        ((C1081Z6) r03.next()).f3447a.mo577c();
        goto L29
    L54:
        return;
    L53:
        return;
    L33:
        C1245c4 r04 = (C1245c4) this.f2974b;
        C1394f4 r13 = r04.f4236G;
        r04.getClass();
        if (r13.isAttachedToWindow() == true) goto L36;
    L38:
        r04.dismiss();
        return;
    L36:
        if (r13.getGlobalVisibleRect(r04.f4234E) == false) goto L38;
        r04.m2367s();
        r04.mo577c();
        return;
    L40:
        C1394f4 r05 = (C1394f4) this.f2974b;
        if (r05.getInternalPopup().mo1971a() == true) goto L43;
        r05.f4954f.mo1979m(r05.getTextDirection(), r05.getTextAlignment());
    L43:
        ViewTreeObserver r06 = r05.getViewTreeObserver();
        if (r06 == null) goto L56;
        r06.removeOnGlobalLayoutListener(this);
        return;
    }
}
