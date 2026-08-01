package p374zb;

import bsh.C1189h4;

/* JADX INFO: renamed from: zb.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9933g extends AbstractC9927a {

    /* JADX INFO: renamed from: s */
    public int f33469s;

    /* JADX INFO: renamed from: t */
    public Object[] f33470t;

    /* JADX INFO: renamed from: u */
    public boolean f33471u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C9933g(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        objArr.getClass();
        this.f33469s = i12;
        Object[] objArr2 = new Object[i12];
        this.f33470t = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f33471u = r52;
        objArr2[0] = objArr;
        m38500z(i10 - r52, 1);
    }

    /* JADX INFO: renamed from: A */
    private final void m38498A(int i10) {
        int i11 = 0;
        while (AbstractC9934h.m38501a(m38488o(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            m38500z(m38488o(), ((this.f33469s - 1) - (i11 / 5)) + 1);
        }
    }

    /* JADX INFO: renamed from: y */
    private final Object m38499y() {
        int iM38488o = m38488o() & 31;
        Object obj = this.f33470t[this.f33469s - 1];
        obj.getClass();
        return ((Object[]) obj)[iM38488o];
    }

    /* JADX INFO: renamed from: z */
    private final void m38500z(int i10, int i11) {
        int i12 = (this.f33469s - i11) * 5;
        while (i11 < this.f33469s) {
            Object[] objArr = this.f33470t;
            Object obj = objArr[i11 - 1];
            obj.getClass();
            objArr[i11] = ((Object[]) obj)[AbstractC9934h.m38501a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            C1189h4.m4429a();
            return null;
        }
        Object objM38499y = m38499y();
        m38490x(m38488o() + 1);
        if (m38488o() == m38489v()) {
            this.f33471u = true;
            return objM38499y;
        }
        m38498A(0);
        return objM38499y;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            C1189h4.m4429a();
            return null;
        }
        m38490x(m38488o() - 1);
        if (this.f33471u) {
            this.f33471u = false;
            return m38499y();
        }
        m38498A(31);
        return m38499y();
    }
}
