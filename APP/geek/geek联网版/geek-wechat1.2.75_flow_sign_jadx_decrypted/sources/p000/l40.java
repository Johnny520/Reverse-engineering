package p000;

/* JADX INFO: loaded from: classes.dex */
public final class l40 implements Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Object f2916d = new Object();

    /* JADX INFO: renamed from: a */
    public int[] f2917a;

    /* JADX INFO: renamed from: b */
    public Object[] f2918b;

    /* JADX INFO: renamed from: c */
    public int f2919c;

    public l40() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f2917a = new int[i4];
        this.f2918b = new Object[i4];
    }

    /* JADX INFO: renamed from: a */
    public final void m1733a(int i, Object obj) {
        int i2 = this.f2919c;
        if (i2 != 0 && i <= this.f2917a[i2 - 1]) {
            m1735c(i, obj);
            return;
        }
        if (i2 >= this.f2917a.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            int[] iArr = new int[i6];
            Object[] objArr = new Object[i6];
            int[] iArr2 = this.f2917a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2918b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2917a = iArr;
            this.f2918b = objArr;
        }
        this.f2917a[i2] = i;
        this.f2918b[i2] = obj;
        this.f2919c = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1734b(int i, Integer num) {
        Object obj;
        int iM1253k = AbstractC0259gf.m1253k(this.f2919c, i, this.f2917a);
        return (iM1253k < 0 || (obj = this.f2918b[iM1253k]) == f2916d) ? num : obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m1735c(int i, Object obj) {
        int iM1253k = AbstractC0259gf.m1253k(this.f2919c, i, this.f2917a);
        if (iM1253k >= 0) {
            this.f2918b[iM1253k] = obj;
            return;
        }
        int i2 = ~iM1253k;
        int i3 = this.f2919c;
        if (i2 < i3) {
            Object[] objArr = this.f2918b;
            if (objArr[i2] == f2916d) {
                this.f2917a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f2917a.length) {
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
            Object[] objArr2 = new Object[i7];
            int[] iArr2 = this.f2917a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2918b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2917a = iArr;
            this.f2918b = objArr2;
        }
        int i8 = this.f2919c - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f2917a;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f2918b;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f2919c - i2);
        }
        this.f2917a[i2] = i;
        this.f2918b[i2] = obj;
        this.f2919c++;
    }

    public final Object clone() {
        try {
            l40 l40Var = (l40) super.clone();
            l40Var.f2917a = (int[]) this.f2917a.clone();
            l40Var.f2918b = (Object[]) this.f2918b.clone();
            return l40Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        int i = this.f2919c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2919c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f2917a[i2]);
            sb.append('=');
            Object obj = this.f2918b[i2];
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
