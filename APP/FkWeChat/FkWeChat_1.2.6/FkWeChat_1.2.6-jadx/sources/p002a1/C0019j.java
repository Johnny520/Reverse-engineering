package p002a1;

import java.util.ListIterator;
import p036c9.InterfaceC1400a;
import p080f9.AbstractC2368o;
import p117i.C3039b;

/* JADX INFO: renamed from: a1.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0019j extends AbstractC0010a implements ListIterator, InterfaceC1400a {

    /* JADX INFO: renamed from: s */
    public final C0017h f29s;

    /* JADX INFO: renamed from: t */
    public int f30t;

    /* JADX INFO: renamed from: u */
    public C0022m f31u;

    /* JADX INFO: renamed from: v */
    public int f32v;

    public C0019j(C0017h c0017h, int i10) {
        super(i10, c0017h.size());
        this.f29s = c0017h;
        this.f30t = c0017h.m75p();
        this.f32v = -1;
        m87C();
    }

    /* JADX INFO: renamed from: B */
    private final void m85B() {
        m26y(this.f29s.size());
        this.f30t = this.f29s.m75p();
        this.f32v = -1;
        m87C();
    }

    /* JADX INFO: renamed from: A */
    public final void m86A() {
        if (this.f32v == -1) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m87C() {
        Object[] objArrM76q = this.f29s.m76q();
        if (objArrM76q == null) {
            this.f31u = null;
            return;
        }
        int iM99d = AbstractC0023n.m99d(this.f29s.size());
        int iM8582i = AbstractC2368o.m8582i(m23o(), iM99d);
        int iM77r = (this.f29s.m77r() / 5) + 1;
        C0022m c0022m = this.f31u;
        if (c0022m == null) {
            this.f31u = new C0022m(objArrM76q, iM8582i, iM99d, iM77r);
        } else {
            c0022m.getClass();
            c0022m.m94C(objArrM76q, iM8582i, iM99d, iM77r);
        }
    }

    @Override // p002a1.AbstractC0010a, java.util.ListIterator
    public void add(Object obj) {
        m88z();
        this.f29s.add(m23o(), obj);
        m25x(m23o() + 1);
        m85B();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        m88z();
        m21g();
        this.f32v = m23o();
        C0022m c0022m = this.f31u;
        if (c0022m == null) {
            Object[] objArrM78s = this.f29s.m78s();
            int iM23o = m23o();
            m25x(iM23o + 1);
            return objArrM78s[iM23o];
        }
        if (c0022m.hasNext()) {
            m25x(m23o() + 1);
            return c0022m.next();
        }
        Object[] objArrM78s2 = this.f29s.m78s();
        int iM23o2 = m23o();
        m25x(iM23o2 + 1);
        return objArrM78s2[iM23o2 - c0022m.m24v()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        m88z();
        m22l();
        this.f32v = m23o() - 1;
        C0022m c0022m = this.f31u;
        if (c0022m == null) {
            Object[] objArrM78s = this.f29s.m78s();
            m25x(m23o() - 1);
            return objArrM78s[m23o()];
        }
        if (m23o() <= c0022m.m24v()) {
            m25x(m23o() - 1);
            return c0022m.previous();
        }
        Object[] objArrM78s2 = this.f29s.m78s();
        m25x(m23o() - 1);
        return objArrM78s2[m23o() - c0022m.m24v()];
    }

    @Override // p002a1.AbstractC0010a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        m88z();
        m86A();
        this.f29s.remove(this.f32v);
        if (this.f32v < m23o()) {
            m25x(this.f32v);
        }
        m85B();
    }

    @Override // p002a1.AbstractC0010a, java.util.ListIterator
    public void set(Object obj) {
        m88z();
        m86A();
        this.f29s.set(this.f32v, obj);
        this.f30t = this.f29s.m75p();
        m87C();
    }

    /* JADX INFO: renamed from: z */
    public final void m88z() {
        if (this.f30t == this.f29s.m75p()) {
            return;
        }
        C3039b.m11232a();
    }
}
