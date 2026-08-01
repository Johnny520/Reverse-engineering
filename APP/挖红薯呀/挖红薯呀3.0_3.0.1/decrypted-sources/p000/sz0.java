package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class sz0 implements f01, Iterable, p40 {

    /* JADX INFO: renamed from: d */
    public final jh0 f5877d;

    /* JADX INFO: renamed from: e */
    public jd0 f5878e;

    /* JADX INFO: renamed from: f */
    public boolean f5879f;

    /* JADX INFO: renamed from: g */
    public boolean f5880g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sz0() {
        long[] jArr = dy0.f1212a;
        this.f5877d = new jh0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f01
    /* JADX INFO: renamed from: a */
    public final void mo17a(e01 e01Var, Object obj) {
        boolean z = obj instanceof C0533o0;
        jh0 jh0Var = this.f5877d;
        if (z && jh0Var.m1697c(e01Var)) {
            Object objM1701g = jh0Var.m1701g(e01Var);
            objM1701g.getClass();
            C0533o0 c0533o0 = (C0533o0) objM1701g;
            C0533o0 c0533o02 = (C0533o0) obj;
            String str = c0533o02.f4377a;
            if (str == null) {
                str = c0533o0.f4377a;
            }
            InterfaceC0188ex interfaceC0188ex = c0533o02.f4378b;
            if (interfaceC0188ex == null) {
                interfaceC0188ex = c0533o0.f4378b;
            }
            jh0Var.m1707m(e01Var, new C0533o0(str, interfaceC0188ex));
        } else {
            jh0Var.m1707m(e01Var, obj);
        }
        e01Var.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sz0 m4136b() {
        sz0 sz0Var = new sz0();
        sz0Var.f5879f = this.f5879f;
        sz0Var.f5880g = this.f5880g;
        jh0 jh0Var = sz0Var.f5877d;
        jh0Var.getClass();
        jh0 jh0Var2 = this.f5877d;
        jh0Var2.getClass();
        Object[] objArr = jh0Var2.f2879b;
        Object[] objArr2 = jh0Var2.f2880c;
        long[] jArr = jh0Var2.f2878a;
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
                            jh0Var.m1707m(objArr[i4], objArr2[i4]);
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
        return sz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m4137c(e01 e01Var) {
        Object objM1701g = this.f5877d.m1701g(e01Var);
        if (objM1701g != null) {
            return objM1701g;
        }
        throw new IllegalStateException("Key not present: " + e01Var + " - consider getOrElse or getOrNull");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4138d(sz0 sz0Var) {
        jh0 jh0Var = sz0Var.f5877d;
        Object[] objArr = jh0Var.f2879b;
        Object[] objArr2 = jh0Var.f2880c;
        long[] jArr = jh0Var.f2878a;
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
                        e01 e01Var = (e01) obj;
                        jh0 jh0Var2 = this.f5877d;
                        Object objM1701g = jh0Var2.m1701g(e01Var);
                        e01Var.getClass();
                        Object objInvoke = e01Var.f1254b.invoke(objM1701g, obj2);
                        if (objInvoke != null) {
                            jh0Var2.m1707m(e01Var, objInvoke);
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
        if (!(obj instanceof sz0)) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        return p30.m3002l(this.f5877d, sz0Var.f5877d) && this.f5879f == sz0Var.f5879f && this.f5880g == sz0Var.f5880g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f5880g) + AbstractC0748t1.m4145c(this.f5877d.hashCode() * 31, 31, this.f5879f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        jd0 jd0Var = this.f5878e;
        if (jd0Var == null) {
            jh0 jh0Var = this.f5877d;
            jh0Var.getClass();
            jd0 jd0Var2 = new jd0(jh0Var);
            this.f5878e = jd0Var2;
            jd0Var = jd0Var2;
        }
        return ((C0937xs) jd0Var.entrySet()).iterator();
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
        if (this.f5879f) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f5880g) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        jh0 jh0Var = this.f5877d;
        Object[] objArr = jh0Var.f2879b;
        Object[] objArr2 = jh0Var.f2880c;
        long[] jArr = jh0Var.f2878a;
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
                            sb.append(((e01) obj).f1253a);
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
        return AbstractC0307i4.m1520F(this) + "{ " + ((Object) sb) + " }";
    }
}
