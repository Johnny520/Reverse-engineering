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
    public int f8460d = -1;

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

    public C2412qc(List list, C0234Fc c0234Fc, InterfaceC2584uc interfaceC2584uc) {
        this.f8457a = list;
        this.f8458b = c0234Fc;
        this.f8459c = interfaceC2584uc;
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: b */
    public final void mo635b(Exception exc) {
        this.f8459c.mo670a(this.f8461e, exc, this.f8464h.f3503c, 3);
    }

    @Override // p000.InterfaceC2627vc
    /* JADX INFO: renamed from: c */
    public final boolean mo727c() {
        while (true) {
            List list = this.f8462f;
            boolean z = false;
            if (list != null && this.f8463g < list.size()) {
                this.f8464h = null;
                while (!z && this.f8463g < this.f8462f.size()) {
                    List list2 = this.f8462f;
                    int i = this.f8463g;
                    this.f8463g = i + 1;
                    InterfaceC1189as interfaceC1189as = (InterfaceC1189as) list2.get(i);
                    File file = this.f8465i;
                    C0234Fc c0234Fc = this.f8458b;
                    this.f8464h = interfaceC1189as.mo995b(file, c0234Fc.f737e, c0234Fc.f738f, c0234Fc.f741i);
                    if (this.f8464h != null && this.f8458b.m475c(this.f8464h.f3503c.mo912a()) != null) {
                        this.f8464h.f3503c.mo915d(this.f8458b.f747o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f8460d + 1;
            this.f8460d = i2;
            if (i2 >= this.f8457a.size()) {
                return false;
            }
            InterfaceC0802Sm interfaceC0802Sm = (InterfaceC0802Sm) this.f8457a.get(this.f8460d);
            C0234Fc c0234Fc2 = this.f8458b;
            File fileMo1725b = c0234Fc2.f740h.m96a().mo1725b(new C2455rc(interfaceC0802Sm, c0234Fc2.f746n));
            this.f8465i = fileMo1725b;
            if (fileMo1725b != null) {
                this.f8461e = interfaceC0802Sm;
                this.f8462f = this.f8458b.f735c.m1544a().m1378f(fileMo1725b);
                this.f8463g = 0;
            }
        }
    }

    @Override // p000.InterfaceC2627vc
    public final void cancel() {
        C1108Zr c1108Zr = this.f8464h;
        if (c1108Zr != null) {
            c1108Zr.f3503c.cancel();
        }
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: e */
    public final void mo638e(Object obj) {
        this.f8459c.mo671b(this.f8461e, obj, this.f8464h.f3503c, 3, this.f8461e);
    }
}
