package p255w;

import p000A.C0055d;
import p049I2.C0793k;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p260x.AbstractC3429l;
import p260x.C3424g;
import p260x.C3426i;

/* JADX INFO: renamed from: w.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3377h {

    /* JADX INFO: renamed from: a */
    public final C3385p f10495a;

    /* JADX INFO: renamed from: b */
    public final C3375f f10496b;

    /* JADX INFO: renamed from: c */
    public final C3372c f10497c;

    /* JADX INFO: renamed from: d */
    public final C0793k f10498d;

    public C3377h(C3385p c3385p, C3375f c3375f, C3372c c3372c, C0793k c0793k) {
        this.f10495a = c3385p;
        this.f10496b = c3375f;
        this.f10497c = c3372c;
        this.f10498d = c0793k;
    }

    /* JADX INFO: renamed from: a */
    public final void m5609a(int i5, Object obj, InterfaceC1373m interfaceC1373m, int i6) {
        int i7;
        Object obj2;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-462424778);
        int i8 = (c1383r.m2578d(i5) ? 4 : 2) | i6 | (c1383r.m2586h(obj) ? 32 : 16) | (c1383r.m2582f(this) ? 256 : 128);
        if (c1383r.m2560O(i8 & 1, (i8 & 147) != 146)) {
            i7 = i5;
            obj2 = obj;
            AbstractC3429l.m5689b(obj2, i7, this.f10495a.f10576r, AbstractC1848j.m3314c(-824725566, new C0055d(this, i5), c1383r), c1383r, ((i8 >> 3) & 14) | 3072 | ((i8 << 3) & 112));
        } else {
            i7 = i5;
            obj2 = obj;
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C3376g(this, i7, obj2, i6);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m5610b(int i5) {
        C3375f c3375f = this.f10496b;
        c3375f.getClass();
        C3426i c3426iM1341e = c3375f.f10490a.m1341e(i5);
        return ((InterfaceC1601c) c3426iM1341e.f10708c.f308f).mo1h(Integer.valueOf(i5 - c3426iM1341e.f10706a));
    }

    /* JADX INFO: renamed from: c */
    public final int m5611c() {
        C3375f c3375f = this.f10496b;
        c3375f.getClass();
        return c3375f.f10490a.f2537e;
    }

    /* JADX INFO: renamed from: d */
    public final Object m5612d(int i5) {
        Object objMo1h;
        C0793k c0793k = this.f10498d;
        Object[] objArr = (Object[]) c0793k.f2539g;
        int i6 = i5 - c0793k.f2537e;
        Object obj = (i6 < 0 || i6 >= objArr.length) ? null : objArr[i6];
        if (obj != null) {
            return obj;
        }
        C3375f c3375f = this.f10496b;
        c3375f.getClass();
        C3426i c3426iM1341e = c3375f.f10490a.m1341e(i5);
        int i7 = i5 - c3426iM1341e.f10706a;
        InterfaceC1601c interfaceC1601c = (InterfaceC1601c) c3426iM1341e.f10708c.f307e;
        return (interfaceC1601c == null || (objMo1h = interfaceC1601c.mo1h(Integer.valueOf(i7))) == null) ? new C3424g(i5) : objMo1h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3377h)) {
            return false;
        }
        return AbstractC1665j.m2981a(this.f10496b, ((C3377h) obj).f10496b);
    }

    public final int hashCode() {
        return this.f10496b.hashCode();
    }
}
