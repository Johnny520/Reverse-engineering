package p000;

/* JADX INFO: renamed from: gn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0246gn extends AbstractC0869x2 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3583j = 1;

    /* JADX INFO: renamed from: k */
    public final Object f3584k;

    public C0246gn(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.f3584k = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f3583j;
        Object obj = this.f3584k;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    um2.m5513b();
                } else {
                    int i2 = this.f12770h;
                    this.f12770h = i2 + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    um2.m5513b();
                } else {
                    this.f12770h++;
                }
                break;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f3583j;
        Object obj = this.f3584k;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    um2.m5513b();
                } else {
                    int i2 = this.f12770h - 1;
                    this.f12770h = i2;
                }
                break;
            default:
                if (!hasPrevious()) {
                    um2.m5513b();
                } else {
                    this.f12770h--;
                }
                break;
        }
        return null;
    }

    public C0246gn(int i, Object obj) {
        super(i, 1);
        this.f3584k = obj;
    }
}
