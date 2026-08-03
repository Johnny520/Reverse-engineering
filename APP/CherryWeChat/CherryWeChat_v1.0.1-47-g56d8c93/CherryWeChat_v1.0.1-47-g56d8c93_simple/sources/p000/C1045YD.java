package p000;

import android.view.View;

/* JADX INFO: renamed from: YD */
/* JADX INFO: loaded from: classes.dex */
public final class C1045YD {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1002XD f3335a;

    /* JADX INFO: renamed from: b */
    public final C0959WD f3336b;

    public C1045YD(InterfaceC1002XD r2) {
        this.f3335a = r2;
        C0959WD r22 = new C0959WD();
        r22.f2995a = 0;
        this.f3336b = r22;
    }

    /* JADX INFO: renamed from: a */
    public final View m1995a(int r10, int r11, int r12, int r13) {
        InterfaceC1002XD r0 = this.f3335a;
        int r1 = r0.mo1899d();
        int r2 = r0.mo1896a();
        if (r11 <= r10) goto L5;
        int r3 = 1;
    L6:
        View r4 = null;
    L7:
        if (r10 == r11) goto L18;
        View r5 = r0.mo1898c(r10);
        int r6 = r0.mo1897b(r5);
        int r7 = r0.mo1900e(r5);
        C0959WD r8 = this.f3336b;
        r8.f2996b = r1;
        r8.f2997c = r2;
        r8.f2998d = r6;
        r8.f2999e = r7;
        if (r12 == 0) goto L13;
        r8.f2995a = r12;
        if (r8.m1833a() == false) goto L13;
        return r5;
    L13:
        if (r13 == 0) goto L17;
        r8.f2995a = r13;
        if (r8.m1833a() == false) goto L17;
        r4 = r5;
    L17:
        r10 = r10 + r3;
        goto L7
    L18:
        return r4;
    L5:
        r3 = -1;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1996b(View r5) {
        InterfaceC1002XD r0 = this.f3335a;
        int r1 = r0.mo1899d();
        int r2 = r0.mo1896a();
        int r3 = r0.mo1897b(r5);
        int r52 = r0.mo1900e(r5);
        C0959WD r02 = this.f3336b;
        r02.f2996b = r1;
        r02.f2997c = r2;
        r02.f2998d = r3;
        r02.f2999e = r52;
        r02.f2995a = 24579;
        return r02.m1833a();
    }
}
