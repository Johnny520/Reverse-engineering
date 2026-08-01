package p075l;

/* JADX INFO: renamed from: l.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0747e implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f2528e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f2529a;

    /* JADX INFO: renamed from: b */
    public long[] f2530b;

    /* JADX INFO: renamed from: c */
    public Object[] f2531c;

    /* JADX INFO: renamed from: d */
    public int f2532d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1408a() {
        int i2 = this.f2532d;
        long[] jArr = this.f2530b;
        Object[] objArr = this.f2531c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2528e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2529a = false;
        this.f2532d = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1409b(long j2, Object obj) {
        int iM1407b = AbstractC0746d.m1407b(this.f2530b, this.f2532d, j2);
        if (iM1407b >= 0) {
            this.f2531c[iM1407b] = obj;
            return;
        }
        int i2 = ~iM1407b;
        int i3 = this.f2532d;
        if (i2 < i3) {
            Object[] objArr = this.f2531c;
            if (objArr[i2] == f2528e) {
                this.f2530b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f2529a && i3 >= this.f2530b.length) {
            m1408a();
            i2 = ~AbstractC0746d.m1407b(this.f2530b, this.f2532d, j2);
        }
        int i4 = this.f2532d;
        if (i4 >= this.f2530b.length) {
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
            long[] jArr2 = this.f2530b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2531c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2530b = jArr;
            this.f2531c = objArr2;
        }
        int i9 = this.f2532d - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f2530b;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.f2531c;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f2532d - i2);
        }
        this.f2530b[i2] = j2;
        this.f2531c[i2] = obj;
        this.f2532d++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        try {
            C0747e c0747e = (C0747e) super.clone();
            c0747e.f2530b = (long[]) this.f2530b.clone();
            c0747e.f2531c = (Object[]) this.f2531c.clone();
            return c0747e;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (this.f2529a) {
            m1408a();
        }
        int i2 = this.f2532d;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f2532d; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            if (this.f2529a) {
                m1408a();
            }
            sb.append(this.f2530b[i3]);
            sb.append('=');
            if (this.f2529a) {
                m1408a();
            }
            Object obj = this.f2531c[i3];
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
