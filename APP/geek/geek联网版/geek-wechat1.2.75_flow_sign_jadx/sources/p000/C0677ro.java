package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ro */
/* JADX INFO: loaded from: classes.dex */
public final class C0677ro extends vb0 {
    @Override // p000.InterfaceC0333ig
    /* JADX INFO: renamed from: a */
    public final void mo1212a(InterfaceC0333ig interfaceC0333ig) {
        C0549o7 c0549o7 = (C0549o7) this.f4927b;
        int i = c0549o7.f3408f0;
        C0410kg c0410kg = this.f4933h;
        ArrayList arrayList = c0410kg.f2838l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((C0410kg) obj).f2833g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            c0410kg.mo1684d(i3 + c0549o7.f3410h0);
        } else {
            c0410kg.mo1684d(i2 + c0549o7.f3410h0);
        }
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: d */
    public final void mo1213d() {
        C0925yc c0925yc = this.f4927b;
        if (c0925yc instanceof C0549o7) {
            C0410kg c0410kg = this.f4933h;
            c0410kg.f2828b = true;
            ArrayList arrayList = c0410kg.f2838l;
            C0549o7 c0549o7 = (C0549o7) c0925yc;
            int i = c0549o7.f3408f0;
            boolean z = c0549o7.f3409g0;
            int i2 = 0;
            if (i == 0) {
                c0410kg.f2831e = 4;
                while (i2 < c0549o7.f4357e0) {
                    C0925yc c0925yc2 = c0549o7.f4356d0[i2];
                    if (z || c0925yc2.f5392V != 8) {
                        C0410kg c0410kg2 = c0925yc2.f5403d.f4933h;
                        c0410kg2.f2837k.add(c0410kg);
                        arrayList.add(c0410kg2);
                    }
                    i2++;
                }
                m2299m(this.f4927b.f5403d.f4933h);
                m2299m(this.f4927b.f5403d.f4934i);
                return;
            }
            if (i == 1) {
                c0410kg.f2831e = 5;
                while (i2 < c0549o7.f4357e0) {
                    C0925yc c0925yc3 = c0549o7.f4356d0[i2];
                    if (z || c0925yc3.f5392V != 8) {
                        C0410kg c0410kg3 = c0925yc3.f5403d.f4934i;
                        c0410kg3.f2837k.add(c0410kg);
                        arrayList.add(c0410kg3);
                    }
                    i2++;
                }
                m2299m(this.f4927b.f5403d.f4933h);
                m2299m(this.f4927b.f5403d.f4934i);
                return;
            }
            if (i == 2) {
                c0410kg.f2831e = 6;
                while (i2 < c0549o7.f4357e0) {
                    C0925yc c0925yc4 = c0549o7.f4356d0[i2];
                    if (z || c0925yc4.f5392V != 8) {
                        C0410kg c0410kg4 = c0925yc4.f5404e.f4933h;
                        c0410kg4.f2837k.add(c0410kg);
                        arrayList.add(c0410kg4);
                    }
                    i2++;
                }
                m2299m(this.f4927b.f5404e.f4933h);
                m2299m(this.f4927b.f5404e.f4934i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0410kg.f2831e = 7;
            while (i2 < c0549o7.f4357e0) {
                C0925yc c0925yc5 = c0549o7.f4356d0[i2];
                if (z || c0925yc5.f5392V != 8) {
                    C0410kg c0410kg5 = c0925yc5.f5404e.f4934i;
                    c0410kg5.f2837k.add(c0410kg);
                    arrayList.add(c0410kg5);
                }
                i2++;
            }
            m2299m(this.f4927b.f5404e.f4933h);
            m2299m(this.f4927b.f5404e.f4934i);
        }
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: e */
    public final void mo1214e() {
        C0925yc c0925yc = this.f4927b;
        if (c0925yc instanceof C0549o7) {
            int i = ((C0549o7) c0925yc).f3408f0;
            C0410kg c0410kg = this.f4933h;
            if (i == 0 || i == 1) {
                c0925yc.f5384N = c0410kg.f2833g;
            } else {
                c0925yc.f5385O = c0410kg.f2833g;
            }
        }
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: f */
    public final void mo1215f() {
        this.f4928c = null;
        this.f4933h.m1683c();
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: k */
    public final boolean mo1217k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m2299m(C0410kg c0410kg) {
        C0410kg c0410kg2 = this.f4933h;
        c0410kg2.f2837k.add(c0410kg);
        c0410kg.f2838l.add(c0410kg2);
    }
}
