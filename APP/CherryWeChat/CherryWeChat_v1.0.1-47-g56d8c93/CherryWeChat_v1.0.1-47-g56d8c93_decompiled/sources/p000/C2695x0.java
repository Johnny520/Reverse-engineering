package p000;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2695x0 extends AbstractViewOnTouchListenerC1266ci {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9270j = 1;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ View f9271k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2695x0(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f9271k = actionMenuItemView;
    }

    @Override // p000.AbstractViewOnTouchListenerC1266ci
    /* JADX INFO: renamed from: b */
    public final InterfaceC2168ky mo1753b() {
        C2781z0 c2781z0;
        switch (this.f9270j) {
            case 0:
                AbstractC2738y0 abstractC2738y0 = ((ActionMenuItemView) this.f9271k).f3691l;
                if (abstractC2738y0 == null || (c2781z0 = ((C0001A0) abstractC2738y0).f0a.f321t) == null) {
                    return null;
                }
                return c2781z0.m5290a();
            default:
                C2781z0 c2781z02 = ((C0087C0) this.f9271k).f194d.f320s;
                if (c2781z02 == null) {
                    return null;
                }
                return c2781z02.m5290a();
        }
    }

    @Override // p000.AbstractViewOnTouchListenerC1266ci
    /* JADX INFO: renamed from: c */
    public final boolean mo1754c() {
        InterfaceC2168ky interfaceC2168kyMo1753b;
        switch (this.f9270j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f9271k;
                InterfaceC2161kr interfaceC2161kr = actionMenuItemView.f3689j;
                return interfaceC2161kr != null && interfaceC2161kr.mo2074a(actionMenuItemView.f3686g) && (interfaceC2168kyMo1753b = mo1753b()) != null && interfaceC2168kyMo1753b.mo575a();
            default:
                ((C0087C0) this.f9271k).f194d.m223l();
                return true;
        }
    }

    @Override // p000.AbstractViewOnTouchListenerC1266ci
    /* JADX INFO: renamed from: d */
    public boolean mo2408d() {
        switch (this.f9270j) {
            case 1:
                C0130D0 c0130d0 = ((C0087C0) this.f9271k).f194d;
                if (c0130d0.f322u != null) {
                    return false;
                }
                c0130d0.m214c();
                return true;
            default:
                return super.mo2408d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2695x0(C0087C0 c0087c0, C0087C0 c0087c02) {
        super(c0087c02);
        this.f9271k = c0087c0;
    }
}
