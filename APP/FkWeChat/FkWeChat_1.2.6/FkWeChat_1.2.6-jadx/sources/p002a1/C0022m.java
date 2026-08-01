package p002a1;

import bsh.C1189h4;

/* JADX INFO: renamed from: a1.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0022m extends AbstractC0010a {

    /* JADX INFO: renamed from: s */
    public int f38s;

    /* JADX INFO: renamed from: t */
    public Object[] f39t;

    /* JADX INFO: renamed from: u */
    public boolean f40u;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C0022m(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f38s = i12;
        Object[] objArr2 = new Object[i12];
        this.f39t = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f40u = r52;
        objArr2[0] = objArr;
        m92A(i10 - r52, 1);
    }

    /* JADX INFO: renamed from: A */
    public final void m92A(int i10, int i11) {
        int i12 = (this.f38s - i11) * 5;
        while (i11 < this.f38s) {
            Object[] objArr = this.f39t;
            Object obj = objArr[i11 - 1];
            obj.getClass();
            objArr[i11] = ((Object[]) obj)[AbstractC0023n.m96a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m93B(int i10) {
        int i11 = 0;
        while (AbstractC0023n.m96a(m23o(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            m92A(m23o(), ((this.f38s - 1) - (i11 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX INFO: renamed from: C */
    public final void m94C(Object[] objArr, int i10, int i11, int i12) {
        m25x(i10);
        m26y(i11);
        this.f38s = i12;
        if (this.f39t.length < i12) {
            this.f39t = new Object[i12];
        }
        this.f39t[0] = objArr;
        ?? r02 = i10 == i11 ? 1 : 0;
        this.f40u = r02;
        m92A(i10 - r02, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            C1189h4.m4429a();
            return null;
        }
        Object objM95z = m95z();
        m25x(m23o() + 1);
        if (m23o() == m24v()) {
            this.f40u = true;
            return objM95z;
        }
        m93B(0);
        return objM95z;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            C1189h4.m4429a();
            return null;
        }
        m25x(m23o() - 1);
        if (this.f40u) {
            this.f40u = false;
            return m95z();
        }
        m93B(31);
        return m95z();
    }

    /* JADX INFO: renamed from: z */
    public final Object m95z() {
        int iM23o = m23o() & 31;
        Object obj = this.f39t[this.f38s - 1];
        obj.getClass();
        return ((Object[]) obj)[iM23o];
    }
}
