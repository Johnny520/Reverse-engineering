package p202o0;

import bsh.C0353j;

/* JADX INFO: renamed from: o0.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3035g extends AbstractC3029a {

    /* JADX INFO: renamed from: i */
    public final Object[] f9851i;

    /* JADX INFO: renamed from: j */
    public final C3038j f9852j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3035g(int i9, int i10, Object[] objArr, int i11, Object[] objArr2) {
        super(i9, i10);
        this.f9851i = objArr2;
        int i12 = (i10 - 1) & (-32);
        this.f9852j = new C3038j(objArr, i9 > i12 ? i12 : i9, i12, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        C3038j c3038j = this.f9852j;
        if (c3038j.hasNext()) {
            this.f9833g++;
            return c3038j.next();
        }
        int i9 = this.f9833g;
        this.f9833g = i9 + 1;
        return this.f9851i[i9 - c3038j.f9834h];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C0353j.m1307e();
            return null;
        }
        int i9 = this.f9833g;
        C3038j c3038j = this.f9852j;
        int i10 = c3038j.f9834h;
        if (i9 <= i10) {
            this.f9833g = i9 - 1;
            return c3038j.previous();
        }
        int i11 = i9 - 1;
        this.f9833g = i11;
        return this.f9851i[i11 - i10];
    }
}
