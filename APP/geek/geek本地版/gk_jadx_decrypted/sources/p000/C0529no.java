package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: no */
/* JADX INFO: loaded from: classes.dex */
public final class C0529no extends qb0 {
    @Override // p000.InterfaceC0297hg
    /* JADX INFO: renamed from: a */
    public final void mo1357a(InterfaceC0297hg interfaceC0297hg) {
        C0177e7 c0177e7 = (C0177e7) this.f4053b;
        int i = c0177e7.f1742f0;
        C0373jg c0373jg = this.f4059h;
        ArrayList arrayList = c0373jg.f2632l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((C0373jg) obj).f2627g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            c0373jg.mo1597d(i3 + c0177e7.f1744h0);
        } else {
            c0373jg.mo1597d(i2 + c0177e7.f1744h0);
        }
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: d */
    public final void mo1363d() {
        C0592pc c0592pc = this.f4053b;
        if (c0592pc instanceof C0177e7) {
            C0373jg c0373jg = this.f4059h;
            c0373jg.f2622b = true;
            ArrayList arrayList = c0373jg.f2632l;
            C0177e7 c0177e7 = (C0177e7) c0592pc;
            int i = c0177e7.f1742f0;
            boolean z = c0177e7.f1743g0;
            int i2 = 0;
            if (i == 0) {
                c0373jg.f2625e = 4;
                while (i2 < c0177e7.f3572e0) {
                    C0592pc c0592pc2 = c0177e7.f3571d0[i2];
                    if (z || c0592pc2.f3845V != 8) {
                        C0373jg c0373jg2 = c0592pc2.f3856d.f4059h;
                        c0373jg2.f2631k.add(c0373jg);
                        arrayList.add(c0373jg2);
                    }
                    i2++;
                }
                m1947m(this.f4053b.f3856d.f4059h);
                m1947m(this.f4053b.f3856d.f4060i);
                return;
            }
            if (i == 1) {
                c0373jg.f2625e = 5;
                while (i2 < c0177e7.f3572e0) {
                    C0592pc c0592pc3 = c0177e7.f3571d0[i2];
                    if (z || c0592pc3.f3845V != 8) {
                        C0373jg c0373jg3 = c0592pc3.f3856d.f4060i;
                        c0373jg3.f2631k.add(c0373jg);
                        arrayList.add(c0373jg3);
                    }
                    i2++;
                }
                m1947m(this.f4053b.f3856d.f4059h);
                m1947m(this.f4053b.f3856d.f4060i);
                return;
            }
            if (i == 2) {
                c0373jg.f2625e = 6;
                while (i2 < c0177e7.f3572e0) {
                    C0592pc c0592pc4 = c0177e7.f3571d0[i2];
                    if (z || c0592pc4.f3845V != 8) {
                        C0373jg c0373jg4 = c0592pc4.f3857e.f4059h;
                        c0373jg4.f2631k.add(c0373jg);
                        arrayList.add(c0373jg4);
                    }
                    i2++;
                }
                m1947m(this.f4053b.f3857e.f4059h);
                m1947m(this.f4053b.f3857e.f4060i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0373jg.f2625e = 7;
            while (i2 < c0177e7.f3572e0) {
                C0592pc c0592pc5 = c0177e7.f3571d0[i2];
                if (z || c0592pc5.f3845V != 8) {
                    C0373jg c0373jg5 = c0592pc5.f3857e.f4060i;
                    c0373jg5.f2631k.add(c0373jg);
                    arrayList.add(c0373jg5);
                }
                i2++;
            }
            m1947m(this.f4053b.f3857e.f4059h);
            m1947m(this.f4053b.f3857e.f4060i);
        }
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: e */
    public final void mo1364e() {
        C0592pc c0592pc = this.f4053b;
        if (c0592pc instanceof C0177e7) {
            int i = ((C0177e7) c0592pc).f1742f0;
            C0373jg c0373jg = this.f4059h;
            if (i == 0 || i == 1) {
                c0592pc.f3837N = c0373jg.f2627g;
            } else {
                c0592pc.f3838O = c0373jg.f2627g;
            }
        }
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: f */
    public final void mo1365f() {
        this.f4054c = null;
        this.f4059h.m1596c();
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: k */
    public final boolean mo1366k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m1947m(C0373jg c0373jg) {
        C0373jg c0373jg2 = this.f4059h;
        c0373jg2.f2631k.add(c0373jg);
        c0373jg.f2632l.add(c0373jg2);
    }
}
