package p063j;

/* JADX INFO: renamed from: j.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0967l implements Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Object f3433d = new Object();

    /* JADX INFO: renamed from: a */
    public int[] f3434a;

    /* JADX INFO: renamed from: b */
    public Object[] f3435b;

    /* JADX INFO: renamed from: c */
    public int f3436c;

    public C0967l() {
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
        this.f3434a = new int[i5];
        this.f3435b = new Object[i5];
    }

    /* JADX INFO: renamed from: a */
    public final void m2325a(int i2, Object obj) {
        int i3 = this.f3436c;
        if (i3 != 0 && i2 <= this.f3434a[i3 - 1]) {
            m2328d(i2, obj);
            return;
        }
        if (i3 >= this.f3434a.length) {
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
            int[] iArr2 = this.f3434a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f3435b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f3434a = iArr;
            this.f3435b = objArr;
        }
        this.f3434a[i3] = i2;
        this.f3435b[i3] = obj;
        this.f3436c = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0967l clone() {
        try {
            C0967l c0967l = (C0967l) super.clone();
            c0967l.f3434a = (int[]) this.f3434a.clone();
            c0967l.f3435b = (Object[]) this.f3435b.clone();
            return c0967l;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m2327c(int i2, Integer num) {
        Object obj;
        int iM2304a = AbstractC0959d.m2304a(this.f3436c, i2, this.f3434a);
        return (iM2304a < 0 || (obj = this.f3435b[iM2304a]) == f3433d) ? num : obj;
    }

    /* JADX INFO: renamed from: d */
    public final void m2328d(int i2, Object obj) {
        int iM2304a = AbstractC0959d.m2304a(this.f3436c, i2, this.f3434a);
        if (iM2304a >= 0) {
            this.f3435b[iM2304a] = obj;
            return;
        }
        int i3 = ~iM2304a;
        int i4 = this.f3436c;
        if (i3 < i4) {
            Object[] objArr = this.f3435b;
            if (objArr[i3] == f3433d) {
                this.f3434a[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.f3434a.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f3434a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3435b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3434a = iArr;
            this.f3435b = objArr2;
        }
        int i9 = this.f3436c - i3;
        if (i9 != 0) {
            int[] iArr3 = this.f3434a;
            int i10 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i10, i9);
            Object[] objArr4 = this.f3435b;
            System.arraycopy(objArr4, i3, objArr4, i10, this.f3436c - i3);
        }
        this.f3434a[i3] = i2;
        this.f3435b[i3] = obj;
        this.f3436c++;
    }

    public final String toString() {
        int i2 = this.f3436c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f3436c; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f3434a[i3]);
            sb.append('=');
            Object obj = this.f3435b[i3];
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
