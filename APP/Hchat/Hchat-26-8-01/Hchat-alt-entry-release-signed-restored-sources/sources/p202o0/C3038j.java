package p202o0;

import bsh.C0353j;
import p092g4.AbstractC1341a;

/* JADX INFO: renamed from: o0.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3038j extends AbstractC3029a {

    /* JADX INFO: renamed from: i */
    public int f9859i;

    /* JADX INFO: renamed from: j */
    public Object[] f9860j;

    /* JADX INFO: renamed from: k */
    public boolean f9861k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C3038j(Object[] objArr, int i9, int i10, int i11) {
        super(i9, i10);
        this.f9859i = i11;
        Object[] objArr2 = new Object[i11];
        this.f9860j = objArr2;
        ?? r5 = i9 == i10 ? 1 : 0;
        this.f9861k = r5;
        objArr2[0] = objArr;
        m6484c(i9 - r5, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m6483a() {
        int i9 = this.f9833g & 31;
        Object obj = this.f9860j[this.f9859i - 1];
        obj.getClass();
        return ((Object[]) obj)[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m6484c(int i9, int i10) {
        int i11 = (this.f9859i - i10) * 5;
        while (i10 < this.f9859i) {
            Object[] objArr = this.f9860j;
            Object obj = objArr[i10 - 1];
            obj.getClass();
            objArr[i10] = ((Object[]) obj)[AbstractC1341a.m3608x(i9, i11)];
            i11 -= 5;
            i10++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m6485d(int i9) {
        int i10 = 0;
        while (AbstractC1341a.m3608x(this.f9833g, i10) == i9) {
            i10 += 5;
        }
        if (i10 > 0) {
            m6484c(this.f9833g, ((this.f9859i - 1) - (i10 / 5)) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        Object objM6483a = m6483a();
        int i9 = this.f9833g + 1;
        this.f9833g = i9;
        if (i9 == this.f9834h) {
            this.f9861k = true;
            return objM6483a;
        }
        m6485d(0);
        return objM6483a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C0353j.m1307e();
            return null;
        }
        this.f9833g--;
        if (this.f9861k) {
            this.f9861k = false;
            return m6483a();
        }
        m6485d(31);
        return m6483a();
    }
}
