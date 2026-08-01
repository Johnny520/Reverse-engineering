package p000;

/* JADX INFO: loaded from: classes.dex */
public final class e40 implements Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Object f1709d = new Object();

    /* JADX INFO: renamed from: a */
    public int[] f1710a;

    /* JADX INFO: renamed from: b */
    public Object[] f1711b;

    /* JADX INFO: renamed from: c */
    public int f1712c;

    public e40() {
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
        this.f1710a = new int[i4];
        this.f1711b = new Object[i4];
    }

    /* JADX INFO: renamed from: a */
    public final void m983a(int i, Object obj) {
        int i2 = this.f1712c;
        if (i2 != 0 && i <= this.f1710a[i2 - 1]) {
            m985c(i, obj);
            return;
        }
        if (i2 >= this.f1710a.length) {
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
            int[] iArr2 = this.f1710a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1711b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1710a = iArr;
            this.f1711b = objArr;
        }
        this.f1710a[i2] = i;
        this.f1711b[i2] = obj;
        this.f1712c = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final Object m984b(int i, Integer num) {
        Object obj;
        int iM1184c = AbstractC0222ff.m1184c(this.f1712c, i, this.f1710a);
        return (iM1184c < 0 || (obj = this.f1711b[iM1184c]) == f1709d) ? num : obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m985c(int i, Object obj) {
        int iM1184c = AbstractC0222ff.m1184c(this.f1712c, i, this.f1710a);
        if (iM1184c >= 0) {
            this.f1711b[iM1184c] = obj;
            return;
        }
        int i2 = ~iM1184c;
        int i3 = this.f1712c;
        if (i2 < i3) {
            Object[] objArr = this.f1711b;
            if (objArr[i2] == f1709d) {
                this.f1710a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f1710a.length) {
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
            int[] iArr2 = this.f1710a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1711b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1710a = iArr;
            this.f1711b = objArr2;
        }
        int i8 = this.f1712c - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f1710a;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f1711b;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f1712c - i2);
        }
        this.f1710a[i2] = i;
        this.f1711b[i2] = obj;
        this.f1712c++;
    }

    public final Object clone() {
        try {
            e40 e40Var = (e40) super.clone();
            e40Var.f1710a = (int[]) this.f1710a.clone();
            e40Var.f1711b = (Object[]) this.f1711b.clone();
            return e40Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        int i = this.f1712c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1712c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f1710a[i2]);
            sb.append('=');
            Object obj = this.f1711b[i2];
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
