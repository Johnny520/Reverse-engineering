package p002a1;

import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: a1.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0018i extends AbstractC0010a {

    /* JADX INFO: renamed from: s */
    public final Object[] f27s;

    /* JADX INFO: renamed from: t */
    public final C0022m f28t;

    public C0018i(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        super(i10, i11);
        this.f27s = objArr2;
        int iM99d = AbstractC0023n.m99d(i11);
        this.f28t = new C0022m(objArr, AbstractC2368o.m8582i(i10, iM99d), iM99d, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        m21g();
        if (this.f28t.hasNext()) {
            m25x(m23o() + 1);
            return this.f28t.next();
        }
        Object[] objArr = this.f27s;
        int iM23o = m23o();
        m25x(iM23o + 1);
        return objArr[iM23o - this.f28t.m24v()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        m22l();
        if (m23o() <= this.f28t.m24v()) {
            m25x(m23o() - 1);
            return this.f28t.previous();
        }
        Object[] objArr = this.f27s;
        m25x(m23o() - 1);
        return objArr[m23o() - this.f28t.m24v()];
    }
}
