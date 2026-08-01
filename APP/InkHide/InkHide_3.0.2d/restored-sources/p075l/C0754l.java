package p075l;

/* JADX INFO: renamed from: l.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0754l implements Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Object f2557d = new Object();

    /* JADX INFO: renamed from: a */
    public int[] f2558a;

    /* JADX INFO: renamed from: b */
    public Object[] f2559b;

    /* JADX INFO: renamed from: c */
    public int f2560c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0754l() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f2558a = new int[i5];
        this.f2559b = new Object[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1421a(int i2, Object obj) {
        int i3 = this.f2560c;
        if (i3 == 0 || i2 > this.f2558a[i3 - 1]) {
            if (i3 >= this.f2558a.length) {
                int i4 = (i3 + 1) * 4;
                int i5 = 4;
                while (true) {
                    if (i5 >= 32) {
                        break;
                    }
                    int i6 = (1 << i5) - 12;
                    if (i4 <= i6) {
                        i4 = i6;
                        break;
                    }
                    i5++;
                }
                int i7 = i4 / 4;
                int[] iArr = new int[i7];
                Object[] objArr = new Object[i7];
                int[] iArr2 = this.f2558a;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f2559b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2558a = iArr;
                this.f2559b = objArr;
            }
            this.f2558a[i3] = i2;
            this.f2559b[i3] = obj;
            this.f2560c = i3 + 1;
            return;
        }
        int iM1406a = AbstractC0746d.m1406a(this.f2560c, i2, this.f2558a);
        if (iM1406a >= 0) {
            this.f2559b[iM1406a] = obj;
            return;
        }
        int i8 = ~iM1406a;
        int i9 = this.f2560c;
        if (i8 < i9) {
            Object[] objArr3 = this.f2559b;
            if (objArr3[i8] == f2557d) {
                this.f2558a[i8] = i2;
                objArr3[i8] = obj;
                return;
            }
        }
        if (i9 >= this.f2558a.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] iArr3 = new int[i13];
            Object[] objArr4 = new Object[i13];
            int[] iArr4 = this.f2558a;
            System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            Object[] objArr5 = this.f2559b;
            System.arraycopy(objArr5, 0, objArr4, 0, objArr5.length);
            this.f2558a = iArr3;
            this.f2559b = objArr4;
        }
        int i14 = this.f2560c - i8;
        if (i14 != 0) {
            int[] iArr5 = this.f2558a;
            int i15 = i8 + 1;
            System.arraycopy(iArr5, i8, iArr5, i15, i14);
            Object[] objArr6 = this.f2559b;
            System.arraycopy(objArr6, i8, objArr6, i15, this.f2560c - i8);
        }
        this.f2558a[i8] = i2;
        this.f2559b[i8] = obj;
        this.f2560c++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        try {
            C0754l c0754l = (C0754l) super.clone();
            c0754l.f2558a = (int[]) this.f2558a.clone();
            c0754l.f2559b = (Object[]) this.f2559b.clone();
            return c0754l;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i2 = this.f2560c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f2560c; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f2558a[i3]);
            sb.append('=');
            Object obj = this.f2559b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
