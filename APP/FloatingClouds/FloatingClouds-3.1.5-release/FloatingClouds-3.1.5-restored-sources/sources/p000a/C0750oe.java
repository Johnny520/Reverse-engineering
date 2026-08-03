package p000a;

/* JADX INFO: renamed from: a.oe */
/* JADX INFO: loaded from: classes.dex */
public final class C0750oe<E> implements Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Object f2955d = new Object();

    /* JADX INFO: renamed from: a */
    public int[] f2956a;

    /* JADX INFO: renamed from: b */
    public Object[] f2957b;

    /* JADX INFO: renamed from: c */
    public int f2958c;

    public C0750oe() {
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
        this.f2956a = new int[i4];
        this.f2957b = new Object[i4];
    }

    /* JADX INFO: renamed from: a */
    public final void m1765a(int i, E e) {
        int i2 = this.f2958c;
        if (i2 != 0 && i <= this.f2956a[i2 - 1]) {
            m1767c(i, e);
            return;
        }
        if (i2 >= this.f2956a.length) {
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
            int[] iArr2 = this.f2956a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2957b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2956a = iArr;
            this.f2957b = objArr;
        }
        this.f2956a[i2] = i;
        this.f2957b[i2] = e;
        this.f2958c = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1766b(int i, Integer num) {
        Object obj;
        int iM2140a = C0889w1.m2140a(this.f2958c, i, this.f2956a);
        return (iM2140a < 0 || (obj = this.f2957b[iM2140a]) == f2955d) ? num : obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m1767c(int i, E e) {
        int iM2140a = C0889w1.m2140a(this.f2958c, i, this.f2956a);
        if (iM2140a >= 0) {
            this.f2957b[iM2140a] = e;
            return;
        }
        int i2 = ~iM2140a;
        int i3 = this.f2958c;
        if (i2 < i3) {
            Object[] objArr = this.f2957b;
            if (objArr[i2] == f2955d) {
                this.f2956a[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (i3 >= this.f2956a.length) {
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
            int[] iArr2 = this.f2956a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2957b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2956a = iArr;
            this.f2957b = objArr2;
        }
        int i8 = this.f2958c - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f2956a;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f2957b;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f2958c - i2);
        }
        this.f2956a[i2] = i;
        this.f2957b[i2] = e;
        this.f2958c++;
    }

    public final Object clone() {
        try {
            C0750oe c0750oe = (C0750oe) super.clone();
            c0750oe.f2956a = (int[]) this.f2956a.clone();
            c0750oe.f2957b = (Object[]) this.f2957b.clone();
            return c0750oe;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        int i = this.f2958c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2958c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f2956a[i2]);
            sb.append('=');
            Object obj = this.f2957b[i2];
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
