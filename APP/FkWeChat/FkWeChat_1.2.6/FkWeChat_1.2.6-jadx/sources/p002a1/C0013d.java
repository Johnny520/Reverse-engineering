package p002a1;

import bsh.C1189h4;

/* JADX INFO: renamed from: a1.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0013d extends AbstractC0010a {

    /* JADX INFO: renamed from: s */
    public final Object[] f12s;

    public C0013d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f12s = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            C1189h4.m4429a();
            return null;
        }
        Object[] objArr = this.f12s;
        int iM23o = m23o();
        m25x(iM23o + 1);
        return objArr[iM23o];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            C1189h4.m4429a();
            return null;
        }
        Object[] objArr = this.f12s;
        m25x(m23o() - 1);
        return objArr[m23o()];
    }
}
