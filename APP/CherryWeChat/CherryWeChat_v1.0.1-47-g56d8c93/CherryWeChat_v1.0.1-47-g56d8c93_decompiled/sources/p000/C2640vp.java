package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: vp */
/* JADX INFO: loaded from: classes.dex */
public final class C2640vp implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f9150a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long[] f9151b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f9152c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f9153d;

    public C2640vp() {
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
        this.f9151b = new long[i4];
        this.f9152c = new Object[i4];
    }

    /* JADX INFO: renamed from: a */
    public final void m5166a() {
        int i = this.f9153d;
        Object[] objArr = this.f9152c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f9153d = 0;
        this.f9150a = false;
    }

    /* JADX INFO: renamed from: b */
    public final Object m5167b(long j) {
        Object obj;
        int iM1483e = AbstractC0714Qj.m1483e(this.f9151b, this.f9153d, j);
        if (iM1483e < 0 || (obj = this.f9152c[iM1483e]) == AbstractC1406fG.f4985d) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final int m5168c(long j) {
        if (this.f9150a) {
            int i = this.f9153d;
            long[] jArr = this.f9151b;
            Object[] objArr = this.f9152c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC1406fG.f4985d) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f9150a = false;
            this.f9153d = i2;
        }
        return AbstractC0714Qj.m1483e(this.f9151b, this.f9153d, j);
    }

    public final Object clone() {
        C2640vp c2640vp = (C2640vp) super.clone();
        c2640vp.f9151b = (long[]) this.f9151b.clone();
        c2640vp.f9152c = (Object[]) this.f9152c.clone();
        return c2640vp;
    }

    /* JADX INFO: renamed from: d */
    public final long m5169d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f9153d)) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f9150a) {
            long[] jArr = this.f9151b;
            Object[] objArr = this.f9152c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC1406fG.f4985d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f9150a = false;
            this.f9153d = i3;
        }
        return this.f9151b[i];
    }

    /* JADX INFO: renamed from: e */
    public final void m5170e(long j, Object obj) {
        Object obj2 = AbstractC1406fG.f4985d;
        int iM1483e = AbstractC0714Qj.m1483e(this.f9151b, this.f9153d, j);
        if (iM1483e >= 0) {
            this.f9152c[iM1483e] = obj;
            return;
        }
        int i = ~iM1483e;
        int i2 = this.f9153d;
        if (i < i2) {
            Object[] objArr = this.f9152c;
            if (objArr[i] == obj2) {
                this.f9151b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f9150a) {
            long[] jArr = this.f9151b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f9152c;
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
                this.f9150a = false;
                this.f9153d = i3;
                i = ~AbstractC0714Qj.m1483e(this.f9151b, i3, j);
            }
        }
        int i5 = this.f9153d;
        if (i5 >= this.f9151b.length) {
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
            this.f9151b = Arrays.copyOf(this.f9151b, i9);
            this.f9152c = Arrays.copyOf(this.f9152c, i9);
        }
        int i10 = this.f9153d - i;
        if (i10 != 0) {
            long[] jArr2 = this.f9151b;
            int i11 = i + 1;
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.f9152c;
            AbstractC0650P4.m1310E(objArr3, objArr3, i11, i, this.f9153d);
        }
        this.f9151b[i] = j;
        this.f9152c[i] = obj;
        this.f9153d++;
    }

    /* JADX INFO: renamed from: f */
    public final void m5171f(long j) {
        int iM1483e = AbstractC0714Qj.m1483e(this.f9151b, this.f9153d, j);
        if (iM1483e >= 0) {
            Object[] objArr = this.f9152c;
            Object obj = objArr[iM1483e];
            Object obj2 = AbstractC1406fG.f4985d;
            if (obj != obj2) {
                objArr[iM1483e] = obj2;
                this.f9150a = true;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m5172g() {
        if (this.f9150a) {
            int i = this.f9153d;
            long[] jArr = this.f9151b;
            Object[] objArr = this.f9152c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC1406fG.f4985d) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f9150a = false;
            this.f9153d = i2;
        }
        return this.f9153d;
    }

    /* JADX INFO: renamed from: h */
    public final Object m5173h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f9153d)) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f9150a) {
            long[] jArr = this.f9151b;
            Object[] objArr = this.f9152c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC1406fG.f4985d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f9150a = false;
            this.f9153d = i3;
        }
        return this.f9152c[i];
    }

    public final String toString() {
        if (m5172g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9153d * 28);
        sb.append('{');
        int i = this.f9153d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m5169d(i2));
            sb.append('=');
            Object objM5173h = m5173h(i2);
            if (objM5173h != sb) {
                sb.append(objM5173h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
