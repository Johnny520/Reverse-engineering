package p000a;

/* JADX INFO: renamed from: a.U9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0371U9<E> implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f1386e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f1387a = false;

    /* JADX INFO: renamed from: b */
    public long[] f1388b;

    /* JADX INFO: renamed from: c */
    public Object[] f1389c;

    /* JADX INFO: renamed from: d */
    public int f1390d;

    public C0371U9() {
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
        this.f1388b = new long[i4];
        this.f1389c = new Object[i4];
    }

    /* JADX INFO: renamed from: a */
    public final void m988a() {
        int i = this.f1390d;
        Object[] objArr = this.f1389c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1390d = 0;
        this.f1387a = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m989b() {
        int i = this.f1390d;
        long[] jArr = this.f1388b;
        Object[] objArr = this.f1389c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1386e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1387a = false;
        this.f1390d = i2;
    }

    /* JADX INFO: renamed from: c */
    public final Object m990c(long j, Long l) {
        Object obj;
        int iM2142b = C0889w1.m2142b(this.f1388b, this.f1390d, j);
        return (iM2142b < 0 || (obj = this.f1389c[iM2142b]) == f1386e) ? l : obj;
    }

    public final Object clone() {
        try {
            C0371U9 c0371u9 = (C0371U9) super.clone();
            c0371u9.f1388b = (long[]) this.f1388b.clone();
            c0371u9.f1389c = (Object[]) this.f1389c.clone();
            return c0371u9;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m991d(long j, E e) {
        int iM2142b = C0889w1.m2142b(this.f1388b, this.f1390d, j);
        if (iM2142b >= 0) {
            this.f1389c[iM2142b] = e;
            return;
        }
        int i = ~iM2142b;
        int i2 = this.f1390d;
        if (i < i2) {
            Object[] objArr = this.f1389c;
            if (objArr[i] == f1386e) {
                this.f1388b[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f1387a && i2 >= this.f1388b.length) {
            m989b();
            i = ~C0889w1.m2142b(this.f1388b, this.f1390d, j);
        }
        int i3 = this.f1390d;
        if (i3 >= this.f1388b.length) {
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
            long[] jArr2 = this.f1388b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1389c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1388b = jArr;
            this.f1389c = objArr2;
        }
        int i8 = this.f1390d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f1388b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f1389c;
            System.arraycopy(objArr4, i, objArr4, i9, this.f1390d - i);
        }
        this.f1388b[i] = j;
        this.f1389c[i] = e;
        this.f1390d++;
    }

    /* JADX INFO: renamed from: e */
    public final int m992e() {
        if (this.f1387a) {
            m989b();
        }
        return this.f1390d;
    }

    /* JADX INFO: renamed from: f */
    public final E m993f(int i) {
        if (this.f1387a) {
            m989b();
        }
        return (E) this.f1389c[i];
    }

    public final String toString() {
        if (m992e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1390d * 28);
        sb.append('{');
        for (int i = 0; i < this.f1390d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f1387a) {
                m989b();
            }
            sb.append(this.f1388b[i]);
            sb.append('=');
            E eM993f = m993f(i);
            if (eM993f != this) {
                sb.append(eM993f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
