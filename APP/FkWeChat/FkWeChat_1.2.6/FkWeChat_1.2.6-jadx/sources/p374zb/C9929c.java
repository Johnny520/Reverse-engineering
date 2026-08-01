package p374zb;

import bsh.C1189h4;

/* JADX INFO: renamed from: zb.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9929c extends AbstractC9927a {

    /* JADX INFO: renamed from: s */
    public final Object[] f33459s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9929c(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        objArr.getClass();
        this.f33459s = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            C1189h4.m4429a();
            return null;
        }
        Object[] objArr = this.f33459s;
        int iM38488o = m38488o();
        m38490x(iM38488o + 1);
        return objArr[iM38488o];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            C1189h4.m4429a();
            return null;
        }
        Object[] objArr = this.f33459s;
        m38490x(m38488o() - 1);
        return objArr[m38488o()];
    }
}
