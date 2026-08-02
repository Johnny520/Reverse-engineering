package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gn extends x2 {
    public final /* synthetic */ int j = 1;
    public final Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gn(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.k = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.j;
        Object obj = this.k;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    um2.b();
                } else {
                    int i2 = this.h;
                    this.h = i2 + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    um2.b();
                } else {
                    this.h++;
                }
                break;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.j;
        Object obj = this.k;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    um2.b();
                } else {
                    int i2 = this.h - 1;
                    this.h = i2;
                }
                break;
            default:
                if (!hasPrevious()) {
                    um2.b();
                } else {
                    this.h--;
                }
                break;
        }
        return null;
    }

    public gn(int i, Object obj) {
        super(i, 1);
        this.k = obj;
    }
}
