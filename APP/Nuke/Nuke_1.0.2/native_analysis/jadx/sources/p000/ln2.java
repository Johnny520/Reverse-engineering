package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ln2 implements zn2, Iterable, q41 {

    /* JADX INFO: renamed from: h */
    public final rk1 f6221h;

    /* JADX INFO: renamed from: i */
    public ve1 f6222i;

    /* JADX INFO: renamed from: j */
    public boolean f6223j;

    /* JADX INFO: renamed from: k */
    public boolean f6224k;

    public ln2() {
        long[] jArr = ed2.f2401a;
        this.f6221h = new rk1();
    }

    @Override // p000.zn2
    /* JADX INFO: renamed from: a */
    public final void mo1533a(yn2 yn2Var, Object obj) {
        boolean z = obj instanceof C0603q3;
        rk1 rk1Var = this.f6221h;
        if (z && rk1Var.m4501c(yn2Var)) {
            Object objM4505g = rk1Var.m4505g(yn2Var);
            objM4505g.getClass();
            C0603q3 c0603q3 = (C0603q3) objM4505g;
            C0603q3 c0603q32 = (C0603q3) obj;
            String str = c0603q32.f8712a;
            if (str == null) {
                str = c0603q3.f8712a;
            }
            un0 un0Var = c0603q32.f8713b;
            if (un0Var == null) {
                un0Var = c0603q3.f8713b;
            }
            rk1Var.m4511m(yn2Var, new C0603q3(str, un0Var));
        } else {
            rk1Var.m4511m(yn2Var, obj);
        }
        yn2Var.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ln2 m2947b() {
        ln2 ln2Var = new ln2();
        ln2Var.f6223j = this.f6223j;
        ln2Var.f6224k = this.f6224k;
        rk1 rk1Var = ln2Var.f6221h;
        rk1Var.getClass();
        rk1 rk1Var2 = this.f6221h;
        rk1Var2.getClass();
        Object[] objArr = rk1Var2.f9619b;
        Object[] objArr2 = rk1Var2.f9620c;
        long[] jArr = rk1Var2.f9618a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            rk1Var.m4511m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return ln2Var;
    }

    /* JADX INFO: renamed from: c */
    public final Object m2948c(yn2 yn2Var) {
        Object objM4505g = this.f6221h.m4505g(yn2Var);
        if (objM4505g != null) {
            return objM4505g;
        }
        throw new IllegalStateException("Key not present: " + yn2Var + " - consider getOrElse or getOrNull");
    }

    /* JADX INFO: renamed from: d */
    public final void m2949d(ln2 ln2Var) {
        rk1 rk1Var = ln2Var.f6221h;
        Object[] objArr = rk1Var.f9619b;
        Object[] objArr2 = rk1Var.f9620c;
        long[] jArr = rk1Var.f9618a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        yn2 yn2Var = (yn2) obj;
                        rk1 rk1Var2 = this.f6221h;
                        Object objM4505g = rk1Var2.m4505g(yn2Var);
                        yn2Var.getClass();
                        Object objMo12g = yn2Var.f13534b.mo12g(objM4505g, obj2);
                        if (objMo12g != null) {
                            rk1Var2.m4511m(yn2Var, objMo12g);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln2)) {
            return false;
        }
        ln2 ln2Var = (ln2) obj;
        return t11.m5086l(this.f6221h, ln2Var.f6221h) && this.f6223j == ln2Var.f6223j && this.f6224k == ln2Var.f6224k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6224k) + hk1.m2205d(this.f6221h.hashCode() * 31, 31, this.f6223j);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ve1 ve1Var = this.f6222i;
        if (ve1Var == null) {
            rk1 rk1Var = this.f6221h;
            rk1Var.getClass();
            ve1 ve1Var2 = new ve1(rk1Var);
            this.f6222i = ve1Var2;
            ve1Var = ve1Var2;
        }
        return ((uf0) ve1Var.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f6223j) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f6224k) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        rk1 rk1Var = this.f6221h;
        Object[] objArr = rk1Var.f9619b;
        Object[] objArr2 = rk1Var.f9620c;
        long[] jArr = rk1Var.f9618a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((yn2) obj).f13533a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return AbstractC0738tl.m5293V(this) + "{ " + ((Object) sb) + " }";
    }
}
