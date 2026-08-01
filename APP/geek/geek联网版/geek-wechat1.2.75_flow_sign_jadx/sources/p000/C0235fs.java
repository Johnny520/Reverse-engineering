package p000;

/* JADX INFO: renamed from: fs */
/* JADX INFO: loaded from: classes.dex */
public final class C0235fs implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f1823e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f1824a = false;

    /* JADX INFO: renamed from: b */
    public long[] f1825b;

    /* JADX INFO: renamed from: c */
    public Object[] f1826c;

    /* JADX INFO: renamed from: d */
    public int f1827d;

    public C0235fs() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f1825b = new long[i4];
        this.f1826c = new Object[i4];
    }

    /* JADX INFO: renamed from: a */
    public final void m1107a() {
        int i = this.f1827d;
        Object[] objArr = this.f1826c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1827d = 0;
        this.f1824a = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m1108b() {
        int i = this.f1827d;
        long[] jArr = this.f1825b;
        Object[] objArr = this.f1826c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1823e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1824a = false;
        this.f1827d = i2;
    }

    /* JADX INFO: renamed from: c */
    public final Object m1109c(long j, Long l) {
        Object obj;
        int iM1254l = AbstractC0259gf.m1254l(this.f1825b, this.f1827d, j);
        return (iM1254l < 0 || (obj = this.f1826c[iM1254l]) == f1823e) ? l : obj;
    }

    public final Object clone() {
        try {
            C0235fs c0235fs = (C0235fs) super.clone();
            c0235fs.f1825b = (long[]) this.f1825b.clone();
            c0235fs.f1826c = (Object[]) this.f1826c.clone();
            return c0235fs;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1110d(long j, Object obj) {
        int iM1254l = AbstractC0259gf.m1254l(this.f1825b, this.f1827d, j);
        if (iM1254l >= 0) {
            this.f1826c[iM1254l] = obj;
            return;
        }
        int i = ~iM1254l;
        int i2 = this.f1827d;
        if (i < i2) {
            Object[] objArr = this.f1826c;
            if (objArr[i] == f1823e) {
                this.f1825b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f1824a && i2 >= this.f1825b.length) {
            m1108b();
            i = ~AbstractC0259gf.m1254l(this.f1825b, this.f1827d, j);
        }
        int i3 = this.f1827d;
        if (i3 >= this.f1825b.length) {
            int i4 = (i3 + 1) * 8;
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
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f1825b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1826c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1825b = jArr;
            this.f1826c = objArr2;
        }
        int i8 = this.f1827d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f1825b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f1826c;
            System.arraycopy(objArr4, i, objArr4, i9, this.f1827d - i);
        }
        this.f1825b[i] = j;
        this.f1826c[i] = obj;
        this.f1827d++;
    }

    /* JADX INFO: renamed from: e */
    public final int m1111e() {
        if (this.f1824a) {
            m1108b();
        }
        return this.f1827d;
    }

    /* JADX INFO: renamed from: f */
    public final Object m1112f(int i) {
        if (this.f1824a) {
            m1108b();
        }
        return this.f1826c[i];
    }

    public final String toString() {
        if (m1111e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1827d * 28);
        sb.append('{');
        for (int i = 0; i < this.f1827d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f1824a) {
                m1108b();
            }
            sb.append(this.f1825b[i]);
            sb.append('=');
            Object objM1112f = m1112f(i);
            if (objM1112f != this) {
                sb.append(objM1112f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
