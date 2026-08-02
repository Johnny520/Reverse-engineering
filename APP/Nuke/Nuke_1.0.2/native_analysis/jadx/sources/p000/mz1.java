package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mz1 extends AbstractC0869x2 {

    /* JADX INFO: renamed from: j */
    public final Object[] f6932j;

    /* JADX INFO: renamed from: k */
    public final g43 f6933k;

    public mz1(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.f6932j = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f6933k = new g43(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            um2.m5513b();
            return null;
        }
        g43 g43Var = this.f6933k;
        if (g43Var.hasNext()) {
            this.f12770h++;
            return g43Var.next();
        }
        int i = this.f12770h;
        this.f12770h = i + 1;
        return this.f6932j[i - g43Var.f12771i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            um2.m5513b();
            return null;
        }
        int i = this.f12770h;
        g43 g43Var = this.f6933k;
        int i2 = g43Var.f12771i;
        if (i <= i2) {
            this.f12770h = i - 1;
            return g43Var.previous();
        }
        int i3 = i - 1;
        this.f12770h = i3;
        return this.f6932j[i3 - i2];
    }
}
