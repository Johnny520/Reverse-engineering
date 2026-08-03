package p202o0;

import bsh.C0353j;

/* JADX INFO: renamed from: o0.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3032d extends AbstractC3029a {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f9837i = 1;

    /* JADX INFO: renamed from: j */
    public final Object f9838j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3032d(Object[] objArr, int i9, int i10) {
        super(i9, i10);
        this.f9838j = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f9837i) {
            case 0:
                if (!hasNext()) {
                    C0353j.m1307e();
                } else {
                    Object[] objArr = (Object[]) this.f9838j;
                    int i9 = this.f9833g;
                    this.f9833g = i9 + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    C0353j.m1307e();
                } else {
                    this.f9833g++;
                }
                break;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f9837i) {
            case 0:
                if (!hasPrevious()) {
                    C0353j.m1307e();
                } else {
                    Object[] objArr = (Object[]) this.f9838j;
                    int i9 = this.f9833g - 1;
                    this.f9833g = i9;
                }
                break;
            default:
                if (!hasPrevious()) {
                    C0353j.m1307e();
                } else {
                    this.f9833g--;
                }
                break;
        }
        return null;
    }

    public C3032d(Object obj, int i9) {
        super(i9, 1);
        this.f9838j = obj;
    }
}
