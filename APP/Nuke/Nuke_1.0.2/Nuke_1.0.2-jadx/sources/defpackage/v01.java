package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v01 extends vj1 {
    public static final v01 l;
    public int[] i;
    public int j;
    public boolean k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        v01 v01Var = new v01(0);
        l = v01Var;
        v01Var.h = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v01(int i) {
        super(true);
        try {
            this.i = new int[i];
            this.j = 0;
            this.k = true;
        } catch (NegativeArraySizeException unused) {
            s.j("size < 0");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i) {
        d();
        int i2 = this.j;
        int[] iArr = this.i;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 10];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.i = iArr2;
        }
        int[] iArr3 = this.i;
        int i3 = this.j;
        int i4 = i3 + 1;
        this.j = i4;
        iArr3[i3] = i;
        if (!this.k || i4 <= 1) {
            return;
        }
        this.k = i >= iArr3[i3 + (-1)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v01)) {
            return false;
        }
        v01 v01Var = (v01) obj;
        if (this.k != v01Var.k || this.j != v01Var.j) {
            return false;
        }
        for (int i = 0; i < this.j; i++) {
            if (this.i[i] != v01Var.i[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f(int i) {
        if (i >= this.j) {
            s.d("n >= size()");
            return 0;
        }
        try {
            return this.i[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            s.d("n < 0");
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i, int i2) {
        d();
        if (i >= this.j) {
            s.d("n >= size()");
            return;
        }
        try {
            this.i[i] = i2;
            this.k = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i >= 0) {
                return;
            }
            s.j("n < 0");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            i = (i * 31) + this.i[i2];
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.j * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.j; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.i[i]);
        }
        sb.append('}');
        return sb.toString();
    }
}
