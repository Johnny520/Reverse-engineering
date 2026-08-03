package p000;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2695x0 extends AbstractViewOnTouchListenerC1266ci {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9270j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ View f9271k;

    public C2695x0(ActionMenuItemView r2) {
        this.f9270j = 0;
        this.f9271k = r2;
        super(r2);
    }

    @Override // p000.AbstractViewOnTouchListenerC1266ci
    /* JADX INFO: renamed from: b */
    public final InterfaceC2168ky mo1753b() {
        switch(this.f9270j) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        C2781z0 r0 = ((C0087C0) this.f9271k).f194d.f320s;
        if (r0 != null) goto L8;
        return null;
    L8:
        return r0.m5290a();
    L9:
        AbstractC2738y0 r02 = ((ActionMenuItemView) this.f9271k).f3691l;
        if (r02 == null) goto L14;
        C2781z0 r03 = ((C0001A0) r02).f0a.f321t;
        if (r03 == null) goto L14;
        return r03.m5290a();
    L14:
        return null;
    }

    @Override // p000.AbstractViewOnTouchListenerC1266ci
    /* JADX INFO: renamed from: c */
    public final boolean mo1754c() {
        switch(this.f9270j) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C0087C0) this.f9271k).f194d.m223l();
        return true;
    L6:
        ActionMenuItemView r0 = (ActionMenuItemView) this.f9271k;
        InterfaceC2161kr r1 = r0.f3689j;
        if (r1 != null) goto L9;
    L15:
        return false;
    L9:
        if (r1.mo2074a(r0.f3686g) == false) goto L15;
        InterfaceC2168ky r02 = mo1753b();
        if (r02 == null) goto L15;
        if (r02.mo575a() == false) goto L15;
        return true;
    }

    @Override // p000.AbstractViewOnTouchListenerC1266ci
    /* JADX INFO: renamed from: d */
    public boolean mo2408d() {
        switch(this.f9270j) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        C0130D0 r0 = ((C0087C0) this.f9271k).f194d;
        if (r0.f322u == null) goto L9;
        return false;
    L9:
        r0.m214c();
        return true;
    L5:
        return super.mo2408d();
    }

    public C2695x0(C0087C0 r2, C0087C0 r3) {
        this.f9270j = 1;
        this.f9271k = r2;
        super(r3);
    }
}
