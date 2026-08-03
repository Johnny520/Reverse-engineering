package p000;

import android.view.View;

/* JADX INFO: renamed from: YD */
/* JADX INFO: loaded from: classes.dex */
public final class C1045YD {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1002XD f3335a;

    /* JADX INFO: renamed from: b */
    public final C0959WD f3336b;

    public C1045YD(InterfaceC1002XD interfaceC1002XD) {
        this.f3335a = interfaceC1002XD;
        C0959WD c0959wd = new C0959WD();
        c0959wd.f2995a = 0;
        this.f3336b = c0959wd;
    }

    /* JADX INFO: renamed from: a */
    public final View m1995a(int i, int i2, int i3, int i4) {
        InterfaceC1002XD interfaceC1002XD = this.f3335a;
        int iMo1899d = interfaceC1002XD.mo1899d();
        int iMo1896a = interfaceC1002XD.mo1896a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo1898c = interfaceC1002XD.mo1898c(i);
            int iMo1897b = interfaceC1002XD.mo1897b(viewMo1898c);
            int iMo1900e = interfaceC1002XD.mo1900e(viewMo1898c);
            C0959WD c0959wd = this.f3336b;
            c0959wd.f2996b = iMo1899d;
            c0959wd.f2997c = iMo1896a;
            c0959wd.f2998d = iMo1897b;
            c0959wd.f2999e = iMo1900e;
            if (i3 != 0) {
                c0959wd.f2995a = i3;
                if (c0959wd.m1833a()) {
                    return viewMo1898c;
                }
            }
            if (i4 != 0) {
                c0959wd.f2995a = i4;
                if (c0959wd.m1833a()) {
                    view = viewMo1898c;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1996b(View view) {
        InterfaceC1002XD interfaceC1002XD = this.f3335a;
        int iMo1899d = interfaceC1002XD.mo1899d();
        int iMo1896a = interfaceC1002XD.mo1896a();
        int iMo1897b = interfaceC1002XD.mo1897b(view);
        int iMo1900e = interfaceC1002XD.mo1900e(view);
        C0959WD c0959wd = this.f3336b;
        c0959wd.f2996b = iMo1899d;
        c0959wd.f2997c = iMo1896a;
        c0959wd.f2998d = iMo1897b;
        c0959wd.f2999e = iMo1900e;
        c0959wd.f2995a = 24579;
        return c0959wd.m1833a();
    }
}
