package p000;

/* JADX INFO: renamed from: bs */
/* JADX INFO: loaded from: classes.dex */
public final class C0079bs implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f823e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f824a = false;

    /* JADX INFO: renamed from: b */
    public long[] f825b;

    /* JADX INFO: renamed from: c */
    public Object[] f826c;

    /* JADX INFO: renamed from: d */
    public int f827d;

    public C0079bs() {
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
        this.f825b = new long[i4];
        this.f826c = new Object[i4];
    }

    /* JADX INFO: renamed from: a */
    public final void m564a() {
        int i = this.f827d;
        Object[] objArr = this.f826c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f827d = 0;
        this.f824a = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m565b() {
        int i = this.f827d;
        long[] jArr = this.f825b;
        Object[] objArr = this.f826c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f823e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f824a = false;
        this.f827d = i2;
    }

    /* JADX INFO: renamed from: c */
    public final Object m566c(long j, Long l) {
        Object obj;
        int iM1185d = AbstractC0222ff.m1185d(this.f825b, this.f827d, j);
        return (iM1185d < 0 || (obj = this.f826c[iM1185d]) == f823e) ? l : obj;
    }

    public final Object clone() {
        try {
            C0079bs c0079bs = (C0079bs) super.clone();
            c0079bs.f825b = (long[]) this.f825b.clone();
            c0079bs.f826c = (Object[]) this.f826c.clone();
            return c0079bs;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m567d(long j, Object obj) {
        int iM1185d = AbstractC0222ff.m1185d(this.f825b, this.f827d, j);
        if (iM1185d >= 0) {
            this.f826c[iM1185d] = obj;
            return;
        }
        int i = ~iM1185d;
        int i2 = this.f827d;
        if (i < i2) {
            Object[] objArr = this.f826c;
            if (objArr[i] == f823e) {
                this.f825b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f824a && i2 >= this.f825b.length) {
            m565b();
            i = ~AbstractC0222ff.m1185d(this.f825b, this.f827d, j);
        }
        int i3 = this.f827d;
        if (i3 >= this.f825b.length) {
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
            long[] jArr2 = this.f825b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f826c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f825b = jArr;
            this.f826c = objArr2;
        }
        int i8 = this.f827d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f825b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f826c;
            System.arraycopy(objArr4, i, objArr4, i9, this.f827d - i);
        }
        this.f825b[i] = j;
        this.f826c[i] = obj;
        this.f827d++;
    }

    /* JADX INFO: renamed from: e */
    public final int m568e() {
        if (this.f824a) {
            m565b();
        }
        return this.f827d;
    }

    /* JADX INFO: renamed from: f */
    public final Object m569f(int i) {
        if (this.f824a) {
            m565b();
        }
        return this.f826c[i];
    }

    public final String toString() {
        if (m568e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f827d * 28);
        sb.append('{');
        for (int i = 0; i < this.f827d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f824a) {
                m565b();
            }
            sb.append(this.f825b[i]);
            sb.append('=');
            Object objM569f = m569f(i);
            if (objM569f != this) {
                sb.append(objM569f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
