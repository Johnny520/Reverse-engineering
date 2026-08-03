package p000;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: kF */
/* JADX INFO: loaded from: classes.dex */
public final class C2138kF extends AbstractC1406fG {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7482g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2229mF f7483h;

    public /* synthetic */ C2138kF(C2229mF r1, int r2) {
        this.f7482g = r2;
        super(21);
        this.f7483h = r1;
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: c */
    public final void mo796c() {
        int r0 = this.f7482g;
        C2229mF r2 = this.f7483h;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        r2.f7791t = null;
        r2.f7775d.requestLayout();
        return;
    L7:
        if (r2.f7786o == false) goto L11;
        View r02 = r2.f7778g;
        if (r02 == null) goto L11;
        r02.setTranslationY(0.0f);
        r2.f7775d.setTranslationY(0.0f);
    L11:
        r2.f7775d.setVisibility(8);
        r2.f7775d.setTransitioning(false);
        r2.f7791t = null;
        C0649P3 r03 = r2.f7782k;
        if (r03 == null) goto L14;
        r03.mo645h(r2.f7781j);
        r2.f7781j = null;
        r2.f7782k = null;
    L14:
        ActionBarOverlayLayout r04 = r2.f7774c;
        if (r04 == null) goto L18;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(r04);
        return;
    }
}
