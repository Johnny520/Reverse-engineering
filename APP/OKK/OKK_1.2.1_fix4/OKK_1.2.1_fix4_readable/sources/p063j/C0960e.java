package p063j;

/* JADX INFO: renamed from: j.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0960e implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f3404e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f3405a = false;

    /* JADX INFO: renamed from: b */
    public long[] f3406b;

    /* JADX INFO: renamed from: c */
    public Object[] f3407c;

    /* JADX INFO: renamed from: d */
    public int f3408d;

    public C0960e() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f3406b = new long[i5];
        this.f3407c = new Object[i5];
    }

    /* JADX INFO: renamed from: a */
    public final void m2306a() {
        int i2 = this.f3408d;
        Object[] objArr = this.f3407c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f3408d = 0;
        this.f3405a = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0960e clone() {
        try {
            C0960e c0960e = (C0960e) super.clone();
            c0960e.f3406b = (long[]) this.f3406b.clone();
            c0960e.f3407c = (Object[]) this.f3407c.clone();
            return c0960e;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2308c() {
        int i2 = this.f3408d;
        long[] jArr = this.f3406b;
        Object[] objArr = this.f3407c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f3404e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f3405a = false;
        this.f3408d = i3;
    }

    /* JADX INFO: renamed from: d */
    public final Object m2309d(long j2, Long l2) {
        Object obj;
        int iM2305b = AbstractC0959d.m2305b(this.f3406b, this.f3408d, j2);
        return (iM2305b < 0 || (obj = this.f3407c[iM2305b]) == f3404e) ? l2 : obj;
    }

    /* JADX INFO: renamed from: e */
    public final void m2310e(long j2, Object obj) {
        int iM2305b = AbstractC0959d.m2305b(this.f3406b, this.f3408d, j2);
        if (iM2305b >= 0) {
            this.f3407c[iM2305b] = obj;
            return;
        }
        int i2 = ~iM2305b;
        int i3 = this.f3408d;
        if (i2 < i3) {
            Object[] objArr = this.f3407c;
            if (objArr[i2] == f3404e) {
                this.f3406b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f3405a && i3 >= this.f3406b.length) {
            m2308c();
            i2 = ~AbstractC0959d.m2305b(this.f3406b, this.f3408d, j2);
        }
        int i4 = this.f3408d;
        if (i4 >= this.f3406b.length) {
            int i5 = (i4 + 1) * 8;
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
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr2 = new Object[i8];
            long[] jArr2 = this.f3406b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3407c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3406b = jArr;
            this.f3407c = objArr2;
        }
        int i9 = this.f3408d - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f3406b;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.f3407c;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f3408d - i2);
        }
        this.f3406b[i2] = j2;
        this.f3407c[i2] = obj;
        this.f3408d++;
    }

    /* JADX INFO: renamed from: f */
    public final int m2311f() {
        if (this.f3405a) {
            m2308c();
        }
        return this.f3408d;
    }

    /* JADX INFO: renamed from: g */
    public final Object m2312g(int i2) {
        if (this.f3405a) {
            m2308c();
        }
        return this.f3407c[i2];
    }

    public final String toString() {
        if (m2311f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3408d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3408d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f3405a) {
                m2308c();
            }
            sb.append(this.f3406b[i2]);
            sb.append('=');
            Object objM2312g = m2312g(i2);
            if (objM2312g != this) {
                sb.append(objM2312g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
