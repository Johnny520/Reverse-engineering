package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j43 extends i43 {
    public final /* synthetic */ int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                int i = this.j;
                this.j = i + 2;
                Object[] objArr = this.h;
                return new se1(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.j;
                this.j = i2 + 2;
                return this.h[i2];
            default:
                int i3 = this.j;
                this.j = i3 + 2;
                return this.h[i3 + 1];
        }
    }
}
