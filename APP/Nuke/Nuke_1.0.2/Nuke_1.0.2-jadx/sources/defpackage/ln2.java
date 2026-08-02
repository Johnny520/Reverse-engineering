package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ln2 implements zn2, Iterable, q41 {
    public final rk1 h;
    public ve1 i;
    public boolean j;
    public boolean k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ln2() {
        long[] jArr = ed2.a;
        this.h = new rk1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zn2
    public final void a(yn2 yn2Var, Object obj) {
        boolean z = obj instanceof q3;
        rk1 rk1Var = this.h;
        if (z && rk1Var.c(yn2Var)) {
            Object objG = rk1Var.g(yn2Var);
            objG.getClass();
            q3 q3Var = (q3) objG;
            q3 q3Var2 = (q3) obj;
            String str = q3Var2.a;
            if (str == null) {
                str = q3Var.a;
            }
            un0 un0Var = q3Var2.b;
            if (un0Var == null) {
                un0Var = q3Var.b;
            }
            rk1Var.m(yn2Var, new q3(str, un0Var));
        } else {
            rk1Var.m(yn2Var, obj);
        }
        yn2Var.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ln2 b() {
        ln2 ln2Var = new ln2();
        ln2Var.j = this.j;
        ln2Var.k = this.k;
        rk1 rk1Var = ln2Var.h;
        rk1Var.getClass();
        rk1 rk1Var2 = this.h;
        rk1Var2.getClass();
        Object[] objArr = rk1Var2.b;
        Object[] objArr2 = rk1Var2.c;
        long[] jArr = rk1Var2.a;
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
                            rk1Var.m(objArr[i4], objArr2[i4]);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c(yn2 yn2Var) {
        Object objG = this.h.g(yn2Var);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + yn2Var + " - consider getOrElse or getOrNull");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(ln2 ln2Var) {
        rk1 rk1Var = ln2Var.h;
        Object[] objArr = rk1Var.b;
        Object[] objArr2 = rk1Var.c;
        long[] jArr = rk1Var.a;
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
                        rk1 rk1Var2 = this.h;
                        Object objG = rk1Var2.g(yn2Var);
                        yn2Var.getClass();
                        Object objG2 = yn2Var.b.g(objG, obj2);
                        if (objG2 != null) {
                            rk1Var2.m(yn2Var, objG2);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln2)) {
            return false;
        }
        ln2 ln2Var = (ln2) obj;
        return t11.l(this.h, ln2Var.h) && this.j == ln2Var.j && this.k == ln2Var.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.k) + hk1.d(this.h.hashCode() * 31, 31, this.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ve1 ve1Var = this.i;
        if (ve1Var == null) {
            rk1 rk1Var = this.h;
            rk1Var.getClass();
            ve1 ve1Var2 = new ve1(rk1Var);
            this.i = ve1Var2;
            ve1Var = ve1Var2;
        }
        return ((uf0) ve1Var.entrySet()).iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.j) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.k) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        rk1 rk1Var = this.h;
        Object[] objArr = rk1Var.b;
        Object[] objArr2 = rk1Var.c;
        long[] jArr = rk1Var.a;
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
                            sb.append(((yn2) obj).a);
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
        return tl.V(this) + "{ " + ((Object) sb) + " }";
    }
}
