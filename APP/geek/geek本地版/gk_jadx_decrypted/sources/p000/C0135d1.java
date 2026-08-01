package p000;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0135d1 extends AbstractViewOnTouchListenerC0378jl {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1347j = 0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ View f1348k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135d1(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f1348k = actionMenuItemView;
    }

    @Override // p000.AbstractViewOnTouchListenerC0378jl
    /* JADX INFO: renamed from: b */
    public final r30 mo863b() {
        C0208f1 c0208f1;
        switch (this.f1347j) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0171e1 abstractC0171e1 = ((ActionMenuItemView) this.f1348k).f199m;
                if (abstractC0171e1 == null || (c0208f1 = ((C0245g1) abstractC0171e1).f2001a.f2535t) == null) {
                    return null;
                }
                return c0208f1.m2599a();
            default:
                C0208f1 c0208f12 = ((C0319i1) this.f1348k).f2327d.f2534s;
                if (c0208f12 == null) {
                    return null;
                }
                return c0208f12.m2599a();
        }
    }

    @Override // p000.AbstractViewOnTouchListenerC0378jl
    /* JADX INFO: renamed from: c */
    public final boolean mo864c() {
        r30 r30VarMo863b;
        switch (this.f1347j) {
            case Base64.DEFAULT /* 0 */:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f1348k;
                InterfaceC0387ju interfaceC0387ju = actionMenuItemView.f197k;
                return interfaceC0387ju != null && interfaceC0387ju.mo137a(actionMenuItemView.f194h) && (r30VarMo863b = mo863b()) != null && r30VarMo863b.mo1705b();
            default:
                ((C0319i1) this.f1348k).f2327d.m1542l();
                return true;
        }
    }

    @Override // p000.AbstractViewOnTouchListenerC0378jl
    /* JADX INFO: renamed from: d */
    public boolean mo865d() {
        switch (this.f1347j) {
            case Base64.NO_PADDING /* 1 */:
                C0358j1 c0358j1 = ((C0319i1) this.f1348k).f2327d;
                if (c0358j1.f2536u != null) {
                    return false;
                }
                c0358j1.m1540f();
                return true;
            default:
                return super.mo865d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135d1(C0319i1 c0319i1, C0319i1 c0319i12) {
        super(c0319i12);
        this.f1348k = c0319i1;
    }
}
