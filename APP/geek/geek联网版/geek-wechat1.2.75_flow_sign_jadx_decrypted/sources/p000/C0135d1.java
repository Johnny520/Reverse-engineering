package p000;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0135d1 extends AbstractViewOnTouchListenerC0452ll {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1282j = 0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ View f1283k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135d1(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f1283k = actionMenuItemView;
    }

    @Override // p000.AbstractViewOnTouchListenerC0452ll
    /* JADX INFO: renamed from: b */
    public final y30 mo814b() {
        C0208f1 c0208f1;
        switch (this.f1282j) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0171e1 abstractC0171e1 = ((ActionMenuItemView) this.f1283k).f162m;
                if (abstractC0171e1 == null || (c0208f1 = ((C0245g1) abstractC0171e1).f1853a.f2642t) == null) {
                    return null;
                }
                return c0208f1.m1028a();
            default:
                C0208f1 c0208f12 = ((C0319i1) this.f1283k).f2314d.f2641s;
                if (c0208f12 == null) {
                    return null;
                }
                return c0208f12.m1028a();
        }
    }

    @Override // p000.AbstractViewOnTouchListenerC0452ll
    /* JADX INFO: renamed from: c */
    public final boolean mo815c() {
        y30 y30VarMo814b;
        switch (this.f1282j) {
            case Base64.DEFAULT /* 0 */:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f1283k;
                InterfaceC0609pu interfaceC0609pu = actionMenuItemView.f160k;
                return interfaceC0609pu != null && interfaceC0609pu.mo122a(actionMenuItemView.f157h) && (y30VarMo814b = mo814b()) != null && y30VarMo814b.mo973b();
            default:
                ((C0319i1) this.f1283k).f2314d.m1562l();
                return true;
        }
    }

    @Override // p000.AbstractViewOnTouchListenerC0452ll
    /* JADX INFO: renamed from: d */
    public boolean mo816d() {
        switch (this.f1282j) {
            case Base64.NO_PADDING /* 1 */:
                C0358j1 c0358j1 = ((C0319i1) this.f1283k).f2314d;
                if (c0358j1.f2643u != null) {
                    return false;
                }
                c0358j1.m1560f();
                return true;
            default:
                return super.mo816d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135d1(C0319i1 c0319i1, C0319i1 c0319i12) {
        super(c0319i12);
        this.f1283k = c0319i1;
    }
}
