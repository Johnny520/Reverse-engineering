package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ub0 implements Cloneable {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f6185d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ long[] f6186e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object[] f6187f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ int f6188g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ub0(int i) {
        if (i == 0) {
            this.f6186e = o30.f4433c;
            this.f6187f = o30.f4434d;
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
        this.f6186e = new long[i5];
        this.f6187f = new Object[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m4294a(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f6188g)) {
            C0921xc.m5131l(AbstractC0748t1.m4154l("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.f6185d) {
            long[] jArr = this.f6186e;
            Object[] objArr = this.f6187f;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != rd0.f5372k) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f6185d = false;
            this.f6188g = i3;
        }
        return this.f6186e[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4295b(long j, Object obj) {
        Object obj2 = rd0.f5372k;
        int iM2771k = o30.m2771k(this.f6186e, this.f6188g, j);
        if (iM2771k >= 0) {
            this.f6187f[iM2771k] = obj;
            return;
        }
        int i = ~iM2771k;
        int i2 = this.f6188g;
        if (i < i2) {
            Object[] objArr = this.f6187f;
            if (objArr[i] == obj2) {
                this.f6186e[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f6185d) {
            long[] jArr = this.f6186e;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f6187f;
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
                this.f6185d = false;
                this.f6188g = i3;
                i = ~o30.m2771k(this.f6186e, i3, j);
            }
        }
        int i5 = this.f6188g;
        if (i5 >= this.f6186e.length) {
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
            this.f6186e = Arrays.copyOf(this.f6186e, i9);
            this.f6187f = Arrays.copyOf(this.f6187f, i9);
        }
        int i10 = this.f6188g;
        if (i10 - i != 0) {
            long[] jArr2 = this.f6186e;
            int i11 = i + 1;
            AbstractC0201f9.m1056b0(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.f6187f;
            AbstractC0201f9.m1057c0(objArr3, objArr3, i11, i, this.f6188g);
        }
        this.f6186e[i] = j;
        this.f6187f[i] = obj;
        this.f6188g++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4296c(long j) {
        int iM2771k = o30.m2771k(this.f6186e, this.f6188g, j);
        if (iM2771k >= 0) {
            Object[] objArr = this.f6187f;
            Object obj = objArr[iM2771k];
            Object obj2 = rd0.f5372k;
            if (obj != obj2) {
                objArr[iM2771k] = obj2;
                this.f6185d = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        ub0 ub0Var = (ub0) objClone;
        ub0Var.f6186e = (long[]) this.f6186e.clone();
        ub0Var.f6187f = (Object[]) this.f6187f.clone();
        return ub0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m4297d() {
        if (this.f6185d) {
            int i = this.f6188g;
            long[] jArr = this.f6186e;
            Object[] objArr = this.f6187f;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != rd0.f5372k) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f6185d = false;
            this.f6188g = i2;
        }
        return this.f6188g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m4298e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f6188g)) {
            C0921xc.m5131l(AbstractC0748t1.m4154l("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.f6185d) {
            long[] jArr = this.f6186e;
            Object[] objArr = this.f6187f;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != rd0.f5372k) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f6185d = false;
            this.f6188g = i3;
        }
        return this.f6187f[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (m4297d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6188g * 28);
        sb.append('{');
        int i = this.f6188g;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m4294a(i2));
            sb.append('=');
            Object objM4298e = m4298e(i2);
            if (objM4298e != sb) {
                sb.append(objM4298e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (10 int) A[MD:(int):void (m)] (LINE:44) call: ub0.<init>(int):void type: THIS */
    public /* synthetic */ ub0() {
        this(10);
    }
}
