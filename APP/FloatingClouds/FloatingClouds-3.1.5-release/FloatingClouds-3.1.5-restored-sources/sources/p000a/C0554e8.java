package p000a;

import java.util.Iterator;
import p000a.C0384V4;

/* JADX INFO: renamed from: a.e8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0554e8 extends AbstractC0639ih {
    @Override // p000a.AbstractC0639ih, p000a.InterfaceC0348T4
    /* JADX INFO: renamed from: a */
    public final void mo521a(InterfaceC0348T4 interfaceC0348T4) {
        C0381V1 c0381v1 = (C0381V1) this.f2343b;
        int i = c0381v1.f1438g0;
        C0384V4 c0384v4 = this.f2349h;
        Iterator it = c0384v4.f1454l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0384V4) it.next()).f1449g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0384v4.mo1014d(i3 + c0381v1.f1440i0);
        } else {
            c0384v4.mo1014d(i2 + c0381v1.f1440i0);
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: d */
    public final void mo522d() {
        C0240N3 c0240n3 = this.f2343b;
        if (c0240n3 instanceof C0381V1) {
            C0384V4 c0384v4 = this.f2349h;
            c0384v4.f1444b = true;
            C0381V1 c0381v1 = (C0381V1) c0240n3;
            int i = c0381v1.f1438g0;
            boolean z = c0381v1.f1439h0;
            int i2 = 0;
            if (i == 0) {
                c0384v4.f1447e = C0384V4.a.f1458d;
                while (i2 < c0381v1.f2135f0) {
                    C0240N3 c0240n32 = c0381v1.f2134e0[i2];
                    if (z || c0240n32.f806X != 8) {
                        C0384V4 c0384v42 = c0240n32.f815d.f2349h;
                        c0384v42.f1453k.add(c0384v4);
                        c0384v4.f1454l.add(c0384v42);
                    }
                    i2++;
                }
                m1393m(this.f2343b.f815d.f2349h);
                m1393m(this.f2343b.f815d.f2350i);
                return;
            }
            if (i == 1) {
                c0384v4.f1447e = C0384V4.a.f1459e;
                while (i2 < c0381v1.f2135f0) {
                    C0240N3 c0240n33 = c0381v1.f2134e0[i2];
                    if (z || c0240n33.f806X != 8) {
                        C0384V4 c0384v43 = c0240n33.f815d.f2350i;
                        c0384v43.f1453k.add(c0384v4);
                        c0384v4.f1454l.add(c0384v43);
                    }
                    i2++;
                }
                m1393m(this.f2343b.f815d.f2349h);
                m1393m(this.f2343b.f815d.f2350i);
                return;
            }
            if (i == 2) {
                c0384v4.f1447e = C0384V4.a.f1460f;
                while (i2 < c0381v1.f2135f0) {
                    C0240N3 c0240n34 = c0381v1.f2134e0[i2];
                    if (z || c0240n34.f806X != 8) {
                        C0384V4 c0384v44 = c0240n34.f817e.f2349h;
                        c0384v44.f1453k.add(c0384v4);
                        c0384v4.f1454l.add(c0384v44);
                    }
                    i2++;
                }
                m1393m(this.f2343b.f817e.f2349h);
                m1393m(this.f2343b.f817e.f2350i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0384v4.f1447e = C0384V4.a.f1461g;
            while (i2 < c0381v1.f2135f0) {
                C0240N3 c0240n35 = c0381v1.f2134e0[i2];
                if (z || c0240n35.f806X != 8) {
                    C0384V4 c0384v45 = c0240n35.f817e.f2350i;
                    c0384v45.f1453k.add(c0384v4);
                    c0384v4.f1454l.add(c0384v45);
                }
                i2++;
            }
            m1393m(this.f2343b.f817e.f2349h);
            m1393m(this.f2343b.f817e.f2350i);
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: e */
    public final void mo523e() {
        C0240N3 c0240n3 = this.f2343b;
        if (c0240n3 instanceof C0381V1) {
            int i = ((C0381V1) c0240n3).f1438g0;
            C0384V4 c0384v4 = this.f2349h;
            if (i == 0 || i == 1) {
                c0240n3.f798P = c0384v4.f1449g;
            } else {
                c0240n3.f799Q = c0384v4.f1449g;
            }
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: f */
    public final void mo524f() {
        this.f2344c = null;
        this.f2349h.m1013c();
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: k */
    public final boolean mo525k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m1393m(C0384V4 c0384v4) {
        C0384V4 c0384v42 = this.f2349h;
        c0384v42.f1453k.add(c0384v4);
        c0384v4.f1454l.add(c0384v42);
    }
}
