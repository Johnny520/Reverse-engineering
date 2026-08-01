package p374zb;

import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: zb.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9931e extends AbstractC9927a {

    /* JADX INFO: renamed from: s */
    public final Object[] f33464s;

    /* JADX INFO: renamed from: t */
    public final C9933g f33465t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9931e(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        super(i10, i11);
        objArr.getClass();
        objArr2.getClass();
        this.f33464s = objArr2;
        int iM38504d = AbstractC9934h.m38504d(i11);
        this.f33465t = new C9933g(objArr, AbstractC2368o.m8582i(i10, iM38504d), iM38504d, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        m38486g();
        if (this.f33465t.hasNext()) {
            m38490x(m38488o() + 1);
            return this.f33465t.next();
        }
        Object[] objArr = this.f33464s;
        int iM38488o = m38488o();
        m38490x(iM38488o + 1);
        return objArr[iM38488o - this.f33465t.m38489v()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        m38487l();
        if (m38488o() <= this.f33465t.m38489v()) {
            m38490x(m38488o() - 1);
            return this.f33465t.previous();
        }
        Object[] objArr = this.f33464s;
        m38490x(m38488o() - 1);
        return objArr[m38488o() - this.f33465t.m38489v()];
    }
}
