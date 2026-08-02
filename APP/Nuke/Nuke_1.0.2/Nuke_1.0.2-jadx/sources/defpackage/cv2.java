package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cv2 extends rp0 implements y40, vx {
    public final u21 r;
    public final fg3 s;
    public final qb2 t;
    public int u;
    public final m31 v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cv2(u21 u21Var, fg3 fg3Var, qb2 qb2Var, yo2 yo2Var) {
        yo2Var.getClass();
        this.r = u21Var;
        this.s = fg3Var;
        this.t = qb2Var;
        this.u = -1;
        this.v = u21Var.a.c ? null : new m31(yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final int A(yo2 yo2Var) {
        yo2Var.getClass();
        qb2 qb2Var = this.t;
        return sp0.D(yo2Var, this.r, qb2Var.j(), " at path ".concat(((q9) qb2Var.d).e()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final double B() {
        qb2 qb2Var = this.t;
        String strK = qb2Var.k();
        try {
            double d = Double.parseDouble(strK);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            qb2.m(qb2Var, p7.F(Double.valueOf(d), null), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m(qb2Var, "Failed to parse type 'double' for input '" + strK + '\'', 0, 6);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.vx
    public final void a(yo2 yo2Var) {
        yo2Var.getClass();
        if (yo2Var.d() == 0 && sp0.G(this.r, yo2Var)) {
            while (j(yo2Var) != -1) {
            }
        }
        qb2 qb2Var = this.t;
        if (qb2Var.s()) {
            p7.x(qb2Var, "");
            throw null;
        }
        qb2Var.h(this.s.i);
        q9 q9Var = (q9) qb2Var.d;
        int i = q9Var.b;
        int[] iArr = (int[]) q9Var.e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            q9Var.b = i - 1;
        }
        int i2 = q9Var.b;
        if (i2 != -1) {
            q9Var.b = i2 - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final vx b(yo2 yo2Var) {
        yo2Var.getClass();
        u21 u21Var = this.r;
        fg3 fg3VarF = gg3.f(u21Var, yo2Var);
        qb2 qb2Var = this.t;
        q9 q9Var = (q9) qb2Var.d;
        q9Var.getClass();
        int i = q9Var.b + 1;
        q9Var.b = i;
        if (i == ((Object[]) q9Var.d).length) {
            q9Var.h();
        }
        ((Object[]) q9Var.d)[i] = yo2Var;
        qb2Var.h(fg3VarF.h);
        if (qb2Var.p() != 4) {
            int iOrdinal = fg3VarF.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new cv2(u21Var, fg3VarF, qb2Var, yo2Var) : (this.s == fg3VarF && u21Var.a.c) ? this : new cv2(u21Var, fg3VarF, qb2Var, yo2Var);
        }
        qb2.m(qb2Var, "Unexpected leading comma", 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y40
    public final Object c(w41 w41Var) {
        w41Var.getClass();
        try {
            if (!(w41Var instanceof e3)) {
                return w41Var.a(this);
            }
            vi0.t(w41Var);
            throw null;
        } catch (dh1 e) {
            String message = e.getMessage();
            message.getClass();
            if (pv2.h0(message, "at path", false)) {
                throw e;
            }
            throw new dh1(e.getMessage() + " at path: " + ((q9) this.t.d).e(), e, e.h, e.i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final long d() {
        return this.t.i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final boolean f() {
        boolean z;
        boolean z2;
        qb2 qb2Var = this.t;
        int iR = qb2Var.r();
        String str = (String) qb2Var.g;
        if (iR == str.length()) {
            qb2.m(qb2Var, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iR) == '\"') {
            iR++;
            z = true;
        } else {
            z = false;
        }
        int iQ = qb2Var.q(iR);
        if (iQ >= str.length() || iQ == -1) {
            qb2.m(qb2Var, "EOF", 0, 6);
            throw null;
        }
        int i = iQ + 1;
        int iCharAt = str.charAt(iQ) | ' ';
        if (iCharAt == 102) {
            qb2Var.d("alse", i);
            z2 = false;
        } else {
            if (iCharAt != 116) {
                qb2.m(qb2Var, "Expected valid boolean literal prefix, but had '" + qb2Var.k() + '\'', 0, 6);
                throw null;
            }
            qb2Var.d("rue", i);
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (qb2Var.b == str.length()) {
            qb2.m(qb2Var, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(qb2Var.b) == '\"') {
            qb2Var.b++;
            return z2;
        }
        qb2.m(qb2Var, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
    @Override // defpackage.rp0, defpackage.y40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        boolean z;
        m31 m31Var = this.v;
        if (!(m31Var != null ? m31Var.b : false)) {
            qb2 qb2Var = this.t;
            int iQ = qb2Var.q(qb2Var.r());
            String str = (String) qb2Var.g;
            int length = str.length() - iQ;
            if (length < 4 || iQ == -1) {
                z = false;
                if (z) {
                    return true;
                }
            } else {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(iQ + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || eu.A(str.charAt(iQ + 4)) != 0) {
                        qb2Var.b = iQ + 4;
                        z = true;
                    }
                }
                z = false;
                if (z) {
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final char h() {
        qb2 qb2Var = this.t;
        String strK = qb2Var.k();
        if (strK.length() == 1) {
            return strK.charAt(0);
        }
        qb2.m(qb2Var, "Expected single char, but got '" + strK + '\'', 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.io.Serializable */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.io.Serializable */
    /* JADX DEBUG: Multi-variable search result rejected for r5v27, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r5v28, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r5v30, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vx
    public final int j(yo2 yo2Var) throws Throwable {
        qb2 qb2Var = this.t;
        q9 q9Var = (q9) qb2Var.d;
        yo2Var.getClass();
        fg3 fg3Var = this.s;
        int iOrdinal = fg3Var.ordinal();
        Throwable th = null;
        char c = ':';
        int i = 0;
        zS = false;
        boolean zS = false;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zS2 = qb2Var.s();
            while (true) {
                boolean zC = qb2Var.c();
                Throwable th2 = th;
                m31 m31Var = this.v;
                if (zC) {
                    String strE = qb2Var.e();
                    qb2Var.h(c);
                    u21 u21Var = this.r;
                    int iC = sp0.C(yo2Var, u21Var, strE);
                    if (iC != -3) {
                        if (m31Var != null) {
                            ud0 ud0Var = m31Var.a;
                            if (iC < 64) {
                                ud0Var.a |= 1 << iC;
                            } else {
                                int i3 = (iC >>> 6) - 1;
                                long[] jArr = (long[]) ud0Var.d;
                                jArr[i3] = jArr[i3] | (1 << (iC & 63));
                            }
                        }
                        i2 = iC;
                    } else {
                        if (!sp0.G(u21Var, yo2Var)) {
                            int i4 = q9Var.b;
                            int[] iArr = (int[]) q9Var.e;
                            if (iArr[i4] == -2) {
                                iArr[i4] = -1;
                                q9Var.b = i4 - 1;
                            }
                            int i5 = q9Var.b;
                            if (i5 != -1) {
                                q9Var.b = i5 - 1;
                            }
                            qb2Var.l(pv2.t0(6, ((String) qb2Var.g).subSequence(0, qb2Var.b).toString(), strE), "Encountered an unknown key '" + strE + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                            throw th2;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bP = qb2Var.p();
                        if (bP == 8 || bP == 6) {
                            while (true) {
                                byte bP2 = qb2Var.p();
                                if (bP2 == 1) {
                                    qb2Var.e();
                                } else {
                                    if (bP2 == 8 || bP2 == 6) {
                                        arrayList.add(Byte.valueOf(bP2));
                                    } else if (bP2 == 9) {
                                        if (((Number) du.v0(arrayList)).byteValue() != 8) {
                                            qb2.m(qb2Var, "found ] instead of }", 0, 6);
                                            throw th2;
                                        }
                                        if (arrayList.isEmpty()) {
                                            um2.i("List is empty.");
                                            return 0;
                                        }
                                        arrayList.remove(arrayList.size() - 1);
                                    } else if (bP2 == 7) {
                                        if (((Number) du.v0(arrayList)).byteValue() != 6) {
                                            qb2.m(qb2Var, "found } instead of ]", 0, 6);
                                            throw th2;
                                        }
                                        if (arrayList.isEmpty()) {
                                            um2.i("List is empty.");
                                            return 0;
                                        }
                                        arrayList.remove(arrayList.size() - 1);
                                    } else if (bP2 == 10) {
                                        qb2.m(qb2Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                        throw th2;
                                    }
                                    qb2Var.f();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            qb2Var.k();
                        }
                        zS2 = qb2Var.s();
                        th = th2;
                        c = ':';
                    }
                } else {
                    if (zS2) {
                        p7.x(qb2Var, "object");
                        throw th2;
                    }
                    if (m31Var != null) {
                        ud0 ud0Var2 = m31Var.a;
                        ml0 ml0Var = (ml0) ud0Var2.c;
                        yo2 yo2Var2 = (yo2) ud0Var2.b;
                        int iD = yo2Var2.d();
                        while (true) {
                            long j = ud0Var2.a;
                            long j2 = -1;
                            if (j != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                ud0Var2.a |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) ml0Var.g(yo2Var2, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i2 = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iD > 64) {
                                long[] jArr2 = (long[]) ud0Var2.d;
                                int length = jArr2.length;
                                loop3: while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    int i6 = i + 1;
                                    int i7 = i6 * 64;
                                    long j3 = jArr2[i];
                                    while (j3 != j2) {
                                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << iNumberOfTrailingZeros2;
                                        int i8 = iNumberOfTrailingZeros2 + i7;
                                        if (((Boolean) ml0Var.g(yo2Var2, Integer.valueOf(i8))).booleanValue()) {
                                            jArr2[i] = j3;
                                            i2 = i8;
                                            break loop3;
                                        }
                                        j2 = -1;
                                    }
                                    jArr2[i] = j3;
                                    i = i6;
                                    j2 = -1;
                                }
                            }
                        }
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zS3 = qb2Var.s();
            if (qb2Var.c()) {
                int i9 = this.u;
                if (i9 != -1 && !zS3) {
                    qb2.m(qb2Var, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i2 = i9 + 1;
                this.u = i2;
            } else if (zS3) {
                p7.x(qb2Var, "array");
                throw null;
            }
        } else {
            int i10 = this.u;
            Object[] objArr = i10 % 2 != 0;
            if (objArr != true) {
                qb2Var.h(':');
            } else if (i10 != -1) {
                zS = qb2Var.s();
            }
            if (qb2Var.c()) {
                if (objArr != false) {
                    int i11 = this.u;
                    int i12 = qb2Var.b;
                    if (i11 == -1) {
                        if (zS) {
                            qb2.m(qb2Var, "Unexpected leading comma", i12, 4);
                            throw null;
                        }
                    } else if (!zS) {
                        qb2.m(qb2Var, "Expected comma after the key-value pair", i12, 4);
                        throw null;
                    }
                }
                i2 = this.u + 1;
                this.u = i2;
            } else if (zS) {
                p7.x(qb2Var, "object");
                throw null;
            }
        }
        if (fg3Var != fg3.l) {
            ((int[]) q9Var.e)[q9Var.b] = i2;
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final int o() {
        qb2 qb2Var = this.t;
        long jI = qb2Var.i();
        int i = (int) jI;
        if (jI == i) {
            return i;
        }
        qb2.m(qb2Var, "Failed to parse int for input '" + jI + '\'', 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final byte r() {
        qb2 qb2Var = this.t;
        long jI = qb2Var.i();
        byte b = (byte) jI;
        if (jI == b) {
            return b;
        }
        qb2.m(qb2Var, "Failed to parse byte for input '" + jI + '\'', 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final j31 r0() {
        return new dk(this.r.a, this.t).m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final y40 s(yo2 yo2Var) {
        yo2Var.getClass();
        return ev2.a(yo2Var) ? new g31(this.t, this.r) : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final u21 s0() {
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.vx
    public final Object t(yo2 yo2Var, int i, w41 w41Var, Object obj) {
        q9 q9Var = (q9) this.t.d;
        yo2Var.getClass();
        w41Var.getClass();
        boolean z = this.s == fg3.l && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) q9Var.e;
            int i2 = q9Var.b;
            if (iArr[i2] == -2) {
                ((Object[]) q9Var.d)[i2] = sn.L;
            }
        }
        Object objC = c(w41Var);
        if (z) {
            int[] iArr2 = (int[]) q9Var.e;
            int i3 = q9Var.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                q9Var.b = i4;
                if (i4 == ((Object[]) q9Var.d).length) {
                    q9Var.h();
                }
            }
            Object[] objArr = (Object[]) q9Var.d;
            int i5 = q9Var.b;
            objArr[i5] = ((f31) q9Var.c).h ? objC : gd3.z;
            ((int[]) q9Var.e)[i5] = -2;
        }
        return objC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final short v() {
        qb2 qb2Var = this.t;
        long jI = qb2Var.i();
        short s = (short) jI;
        if (jI == s) {
            return s;
        }
        qb2.m(qb2Var, "Failed to parse short for input '" + jI + '\'', 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final String w() {
        return this.t.j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final float y() {
        qb2 qb2Var = this.t;
        String strK = qb2Var.k();
        try {
            float f = Float.parseFloat(strK);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            qb2.m(qb2Var, p7.F(Float.valueOf(f), null), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m(qb2Var, "Failed to parse type 'float' for input '" + strK + '\'', 0, 6);
            throw null;
        }
    }
}
