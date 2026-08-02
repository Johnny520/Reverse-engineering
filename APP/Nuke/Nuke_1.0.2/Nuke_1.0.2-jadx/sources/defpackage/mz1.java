package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mz1 extends x2 {
    public final Object[] j;
    public final g43 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mz1(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.j = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.k = new g43(objArr, i > i4 ? i4 : i, i4, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            um2.b();
            return null;
        }
        g43 g43Var = this.k;
        if (g43Var.hasNext()) {
            this.h++;
            return g43Var.next();
        }
        int i = this.h;
        this.h = i + 1;
        return this.j[i - g43Var.i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            um2.b();
            return null;
        }
        int i = this.h;
        g43 g43Var = this.k;
        int i2 = g43Var.i;
        if (i <= i2) {
            this.h = i - 1;
            return g43Var.previous();
        }
        int i3 = i - 1;
        this.h = i3;
        return this.j[i3 - i2];
    }
}
