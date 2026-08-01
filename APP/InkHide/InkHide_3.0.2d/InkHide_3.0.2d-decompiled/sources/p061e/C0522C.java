package p061e;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import p014H.C0142a;
import p052b1.AbstractC0503h;
import p099y.AbstractC1048L;
import p099y.AbstractC1094z;

/* JADX INFO: renamed from: e.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0522C extends AbstractC0503h {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f1674p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0524E f1675q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0522C(C0524E c0524e, int i2) {
        this.f1674p = i2;
        this.f1675q = c0524e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1055T
    /* JADX INFO: renamed from: a */
    public final void mo1047a() {
        View view;
        C0524E c0524e = this.f1675q;
        switch (this.f1674p) {
            case 0:
                if (c0524e.f1686D && (view = c0524e.f1703v) != null) {
                    view.setTranslationY(0.0f);
                    c0524e.f1700s.setTranslationY(0.0f);
                }
                c0524e.f1700s.setVisibility(8);
                c0524e.f1700s.setTransitioning(false);
                c0524e.f1691I = null;
                C0142a c0142a = c0524e.f1707z;
                if (c0142a != null) {
                    c0142a.m332r(c0524e.f1706y);
                    c0524e.f1706y = null;
                    c0524e.f1707z = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0524e.f1699r;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                    AbstractC1094z.m2366c(actionBarOverlayLayout);
                }
                break;
            default:
                c0524e.f1691I = null;
                c0524e.f1700s.requestLayout();
                break;
        }
    }
}
