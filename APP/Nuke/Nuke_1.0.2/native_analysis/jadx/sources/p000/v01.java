package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v01 extends vj1 {

    /* JADX INFO: renamed from: l */
    public static final v01 f11586l;

    /* JADX INFO: renamed from: i */
    public int[] f11587i;

    /* JADX INFO: renamed from: j */
    public int f11588j;

    /* JADX INFO: renamed from: k */
    public boolean f11589k;

    static {
        v01 v01Var = new v01(0);
        f11586l = v01Var;
        v01Var.f11990h = false;
    }

    public v01(int i) {
        super(true);
        try {
            this.f11587i = new int[i];
            this.f11588j = 0;
            this.f11589k = true;
        } catch (NegativeArraySizeException unused) {
            C0676s.m4651j("size < 0");
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5597e(int i) {
        m5707d();
        int i2 = this.f11588j;
        int[] iArr = this.f11587i;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 10];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f11587i = iArr2;
        }
        int[] iArr3 = this.f11587i;
        int i3 = this.f11588j;
        int i4 = i3 + 1;
        this.f11588j = i4;
        iArr3[i3] = i;
        if (!this.f11589k || i4 <= 1) {
            return;
        }
        this.f11589k = i >= iArr3[i3 + (-1)];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v01)) {
            return false;
        }
        v01 v01Var = (v01) obj;
        if (this.f11589k != v01Var.f11589k || this.f11588j != v01Var.f11588j) {
            return false;
        }
        for (int i = 0; i < this.f11588j; i++) {
            if (this.f11587i[i] != v01Var.f11587i[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m5598f(int i) {
        if (i >= this.f11588j) {
            C0676s.m4646d("n >= size()");
            return 0;
        }
        try {
            return this.f11587i[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C0676s.m4646d("n < 0");
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5599g(int i, int i2) {
        m5707d();
        if (i >= this.f11588j) {
            C0676s.m4646d("n >= size()");
            return;
        }
        try {
            this.f11587i[i] = i2;
            this.f11589k = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i >= 0) {
                return;
            }
            C0676s.m4651j("n < 0");
        }
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f11588j; i2++) {
            i = (i * 31) + this.f11587i[i2];
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f11588j * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.f11588j; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.f11587i[i]);
        }
        sb.append('}');
        return sb.toString();
    }
}
