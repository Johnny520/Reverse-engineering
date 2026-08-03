package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: tk */
/* JADX INFO: loaded from: classes.dex */
public final class C2549tk extends AbstractC1449gF {
    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    public final void mo1546a(InterfaceC2542td interfaceC2542td) {
        C2399q5 c2399q5 = (C2399q5) this.f5058b;
        int i = c2399q5.f8407s0;
        C2628vd c2628vd = this.f5064h;
        Iterator it = c2628vd.f9121l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C2628vd) it.next()).f9116g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c2628vd.mo1539d(i3 + c2399q5.f8409u0);
        } else {
            c2628vd.mo1539d(i2 + c2399q5.f8409u0);
        }
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: d */
    public final void mo1547d() {
        C2454rb c2454rb = this.f5058b;
        if (c2454rb instanceof C2399q5) {
            C2628vd c2628vd = this.f5064h;
            c2628vd.f9111b = true;
            ArrayList arrayList = c2628vd.f9121l;
            C2399q5 c2399q5 = (C2399q5) c2454rb;
            int i = c2399q5.f8407s0;
            boolean z = c2399q5.f8408t0;
            int i2 = 0;
            if (i == 0) {
                c2628vd.f9114e = 4;
                while (i2 < c2399q5.f8966r0) {
                    C2454rb c2454rb2 = c2399q5.f8965q0[i2];
                    if (z || c2454rb2.f8619g0 != 8) {
                        C2628vd c2628vd2 = c2454rb2.f8612d.f5064h;
                        c2628vd2.f9120k.add(c2628vd);
                        arrayList.add(c2628vd2);
                    }
                    i2++;
                }
                m5039m(this.f5058b.f8612d.f5064h);
                m5039m(this.f5058b.f8612d.f5065i);
                return;
            }
            if (i == 1) {
                c2628vd.f9114e = 5;
                while (i2 < c2399q5.f8966r0) {
                    C2454rb c2454rb3 = c2399q5.f8965q0[i2];
                    if (z || c2454rb3.f8619g0 != 8) {
                        C2628vd c2628vd3 = c2454rb3.f8612d.f5065i;
                        c2628vd3.f9120k.add(c2628vd);
                        arrayList.add(c2628vd3);
                    }
                    i2++;
                }
                m5039m(this.f5058b.f8612d.f5064h);
                m5039m(this.f5058b.f8612d.f5065i);
                return;
            }
            if (i == 2) {
                c2628vd.f9114e = 6;
                while (i2 < c2399q5.f8966r0) {
                    C2454rb c2454rb4 = c2399q5.f8965q0[i2];
                    if (z || c2454rb4.f8619g0 != 8) {
                        C2628vd c2628vd4 = c2454rb4.f8614e.f5064h;
                        c2628vd4.f9120k.add(c2628vd);
                        arrayList.add(c2628vd4);
                    }
                    i2++;
                }
                m5039m(this.f5058b.f8614e.f5064h);
                m5039m(this.f5058b.f8614e.f5065i);
                return;
            }
            if (i != 3) {
                return;
            }
            c2628vd.f9114e = 7;
            while (i2 < c2399q5.f8966r0) {
                C2454rb c2454rb5 = c2399q5.f8965q0[i2];
                if (z || c2454rb5.f8619g0 != 8) {
                    C2628vd c2628vd5 = c2454rb5.f8614e.f5065i;
                    c2628vd5.f9120k.add(c2628vd);
                    arrayList.add(c2628vd5);
                }
                i2++;
            }
            m5039m(this.f5058b.f8614e.f5064h);
            m5039m(this.f5058b.f8614e.f5065i);
        }
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: e */
    public final void mo1548e() {
        C2454rb c2454rb = this.f5058b;
        if (c2454rb instanceof C2399q5) {
            int i = ((C2399q5) c2454rb).f8407s0;
            C2628vd c2628vd = this.f5064h;
            if (i == 0 || i == 1) {
                c2454rb.f8604Y = c2628vd.f9116g;
            } else {
                c2454rb.f8605Z = c2628vd.f9116g;
            }
        }
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: f */
    public final void mo1549f() {
        this.f5059c = null;
        this.f5064h.m5144c();
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: k */
    public final boolean mo1550k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m5039m(C2628vd c2628vd) {
        C2628vd c2628vd2 = this.f5064h;
        c2628vd2.f9120k.add(c2628vd);
        c2628vd.f9121l.add(c2628vd2);
    }
}
