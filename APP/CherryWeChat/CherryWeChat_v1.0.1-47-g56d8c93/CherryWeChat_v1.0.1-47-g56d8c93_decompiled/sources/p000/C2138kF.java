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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2138kF(C2229mF c2229mF, int i) {
        super(21);
        this.f7482g = i;
        this.f7483h = c2229mF;
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: c */
    public final void mo796c() {
        View view;
        int i = this.f7482g;
        C2229mF c2229mF = this.f7483h;
        switch (i) {
            case 0:
                if (c2229mF.f7786o && (view = c2229mF.f7778g) != null) {
                    view.setTranslationY(0.0f);
                    c2229mF.f7775d.setTranslationY(0.0f);
                }
                c2229mF.f7775d.setVisibility(8);
                c2229mF.f7775d.setTransitioning(false);
                c2229mF.f7791t = null;
                C0649P3 c0649p3 = c2229mF.f7782k;
                if (c0649p3 != null) {
                    c0649p3.mo645h(c2229mF.f7781j);
                    c2229mF.f7781j = null;
                    c2229mF.f7782k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c2229mF.f7774c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                    AbstractC1255cE.m2370c(actionBarOverlayLayout);
                }
                break;
            default:
                c2229mF.f7791t = null;
                c2229mF.f7775d.requestLayout();
                break;
        }
    }
}
