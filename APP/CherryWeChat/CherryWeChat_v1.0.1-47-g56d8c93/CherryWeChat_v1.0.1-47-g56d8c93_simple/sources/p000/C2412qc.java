package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: qc */
/* JADX INFO: loaded from: classes.dex */
public final class C2412qc implements InterfaceC2627vc, InterfaceC2498sc {

    /* JADX INFO: renamed from: a */
    public final List f8457a;

    /* JADX INFO: renamed from: b */
    public final C0234Fc f8458b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2584uc f8459c;

    /* JADX INFO: renamed from: d */
    public int f8460d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0802Sm f8461e;

    /* JADX INFO: renamed from: f */
    public List f8462f;

    /* JADX INFO: renamed from: g */
    public int f8463g;

    /* JADX INFO: renamed from: h */
    public volatile C1108Zr f8464h;

    /* JADX INFO: renamed from: i */
    public File f8465i;

    public C2412qc(List r2, C0234Fc r3, InterfaceC2584uc r4) {
        this.f8460d = -1;
        this.f8457a = r2;
        this.f8458b = r3;
        this.f8459c = r4;
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: b */
    public final void mo635b(Exception r5) {
        this.f8459c.mo670a(this.f8461e, r5, this.f8464h.f3503c, 3);
    }

    @Override // p000.InterfaceC2627vc
    /* JADX INFO: renamed from: c */
    public final boolean mo727c() {
    L2:
        List r0 = this.f8462f;
        boolean r2 = false;
        if (r0 != null) goto L5;
    L16:
        int r02 = this.f8460d + 1;
        this.f8460d = r02;
        if (r02 >= this.f8457a.size()) goto L18;
        InterfaceC0802Sm r03 = (InterfaceC0802Sm) this.f8457a.get(this.f8460d);
        C0234Fc r3 = this.f8458b;
        File r1 = r3.f740h.m96a().mo1725b(new C2455rc(r03, r3.f746n));
        this.f8465i = r1;
        if (r1 == null) goto L2;
        this.f8461e = r03;
        this.f8462f = this.f8458b.f735c.m1544a().m1378f(r1);
        this.f8463g = 0;
        goto L2
    L18:
        return false;
    L5:
        if (this.f8463g >= r0.size()) goto L16;
        this.f8464h = null;
    L7:
        if (r2 == true) goto L15;
        if (this.f8463g >= this.f8462f.size()) goto L15;
        List r04 = this.f8462f;
        int r32 = this.f8463g;
        this.f8463g = r32 + 1;
        InterfaceC1189as r05 = (InterfaceC1189as) r04.get(r32);
        File r33 = this.f8465i;
        C0234Fc r4 = this.f8458b;
        this.f8464h = r05.mo995b(r33, r4.f737e, r4.f738f, r4.f741i);
        if (this.f8464h == null) goto L7;
        if (this.f8458b.m475c(this.f8464h.f3503c.mo912a()) == null) goto L7;
        this.f8464h.f3503c.mo915d(this.f8458b.f747o, this);
        r2 = true;
    L15:
        return r2;
    }

    @Override // p000.InterfaceC2627vc
    public final void cancel() {
        C1108Zr r0 = this.f8464h;
        if (r0 == null) goto L6;
        r0.f3503c.cancel();
        return;
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: e */
    public final void mo638e(Object r7) {
        this.f8459c.mo671b(this.f8461e, r7, this.f8464h.f3503c, 3, this.f8461e);
    }
}
