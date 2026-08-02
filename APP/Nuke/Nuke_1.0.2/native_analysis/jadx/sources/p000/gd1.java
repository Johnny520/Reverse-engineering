package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gd1 implements Cloneable {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ boolean f3409h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ long[] f3410i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object[] f3411j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ int f3412k;

    public gd1(int i) {
        if (i == 0) {
            this.f3410i = rg3.f9565g;
            this.f3411j = rg3.f9566h;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f3410i = new long[i5];
        this.f3411j = new Object[i5];
    }

    /* JADX INFO: renamed from: a */
    public final long m1830a(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f3412k)) {
            C0676s.m4651j(vi0.m5688g("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.f3409h) {
            long[] jArr = this.f3410i;
            Object[] objArr = this.f3411j;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC0731te.f10691c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f3409h = false;
            this.f3412k = i3;
        }
        return this.f3410i[i];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        gd1 gd1Var = (gd1) objClone;
        gd1Var.f3410i = (long[]) this.f3410i.clone();
        gd1Var.f3411j = (Object[]) this.f3411j.clone();
        return gd1Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m1831d(long j, Object obj) {
        Object obj2 = AbstractC0731te.f10691c;
        int iM4481q = rg3.m4481q(this.f3410i, this.f3412k, j);
        if (iM4481q >= 0) {
            this.f3411j[iM4481q] = obj;
            return;
        }
        int i = ~iM4481q;
        int i2 = this.f3412k;
        if (i < i2) {
            Object[] objArr = this.f3411j;
            if (objArr[i] == obj2) {
                this.f3410i[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f3409h) {
            long[] jArr = this.f3410i;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f3411j;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f3409h = false;
                this.f3412k = i3;
                i = ~rg3.m4481q(this.f3410i, i3, j);
            }
        }
        int i5 = this.f3412k;
        if (i5 >= this.f3410i.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.f3410i = Arrays.copyOf(this.f3410i, i9);
            this.f3411j = Arrays.copyOf(this.f3411j, i9);
        }
        int i10 = this.f3412k;
        if (i10 - i != 0) {
            long[] jArr2 = this.f3410i;
            int i11 = i + 1;
            AbstractC0460mg.m3087b0(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.f3411j;
            AbstractC0460mg.m3088c0(objArr3, objArr3, i11, i, this.f3412k);
        }
        this.f3410i[i] = j;
        this.f3411j[i] = obj;
        this.f3412k++;
    }

    /* JADX INFO: renamed from: f */
    public final void m1832f(long j) {
        int iM4481q = rg3.m4481q(this.f3410i, this.f3412k, j);
        if (iM4481q >= 0) {
            Object[] objArr = this.f3411j;
            Object obj = objArr[iM4481q];
            Object obj2 = AbstractC0731te.f10691c;
            if (obj != obj2) {
                objArr[iM4481q] = obj2;
                this.f3409h = true;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m1833g() {
        if (this.f3409h) {
            int i = this.f3412k;
            long[] jArr = this.f3410i;
            Object[] objArr = this.f3411j;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC0731te.f10691c) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f3409h = false;
            this.f3412k = i2;
        }
        return this.f3412k;
    }

    /* JADX INFO: renamed from: h */
    public final Object m1834h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f3412k)) {
            C0676s.m4651j(vi0.m5688g("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.f3409h) {
            long[] jArr = this.f3410i;
            Object[] objArr = this.f3411j;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC0731te.f10691c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f3409h = false;
            this.f3412k = i3;
        }
        return this.f3411j[i];
    }

    public final String toString() {
        if (m1833g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3412k * 28);
        sb.append('{');
        int i = this.f3412k;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m1830a(i2));
            sb.append('=');
            Object objM1834h = m1834h(i2);
            if (objM1834h != sb) {
                sb.append(objM1834h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ gd1() {
        this(10);
    }
}
