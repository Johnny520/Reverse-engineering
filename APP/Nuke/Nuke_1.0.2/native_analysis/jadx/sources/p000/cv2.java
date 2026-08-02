package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cv2 extends rp0 implements y40, InterfaceC0826vx {

    /* JADX INFO: renamed from: r */
    public final u21 f1747r;

    /* JADX INFO: renamed from: s */
    public final fg3 f1748s;

    /* JADX INFO: renamed from: t */
    public final qb2 f1749t;

    /* JADX INFO: renamed from: u */
    public int f1750u;

    /* JADX INFO: renamed from: v */
    public final m31 f1751v;

    public cv2(u21 u21Var, fg3 fg3Var, qb2 qb2Var, yo2 yo2Var) {
        yo2Var.getClass();
        this.f1747r = u21Var;
        this.f1748s = fg3Var;
        this.f1749t = qb2Var;
        this.f1750u = -1;
        this.f1751v = u21Var.f11072a.f2756c ? null : new m31(yo2Var);
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: A */
    public final int mo892A(yo2 yo2Var) {
        yo2Var.getClass();
        qb2 qb2Var = this.f1749t;
        return sp0.m4908D(yo2Var, this.f1747r, qb2Var.m4123j(), " at path ".concat(((C0611q9) qb2Var.f8876d).m4089e()));
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: B */
    public final double mo893B() {
        qb2 qb2Var = this.f1749t;
        String strM4124k = qb2Var.m4124k();
        try {
            double d = Double.parseDouble(strM4124k);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            qb2.m4114m(qb2Var, AbstractC0570p7.m3750F(Double.valueOf(d), null), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m4114m(qb2Var, "Failed to parse type 'double' for input '" + strM4124k + '\'', 0, 6);
            throw null;
        }
    }

    @Override // p000.rp0, p000.InterfaceC0826vx
    /* JADX INFO: renamed from: a */
    public final void mo894a(yo2 yo2Var) {
        yo2Var.getClass();
        if (yo2Var.mo252d() == 0 && sp0.m4911G(this.f1747r, yo2Var)) {
            while (mo901j(yo2Var) != -1) {
            }
        }
        qb2 qb2Var = this.f1749t;
        if (qb2Var.m4131s()) {
            AbstractC0570p7.m3788x(qb2Var, "");
            throw null;
        }
        qb2Var.m4121h(this.f1748s.f2997i);
        C0611q9 c0611q9 = (C0611q9) qb2Var.f8876d;
        int i = c0611q9.f8829b;
        int[] iArr = (int[]) c0611q9.f8832e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c0611q9.f8829b = i - 1;
        }
        int i2 = c0611q9.f8829b;
        if (i2 != -1) {
            c0611q9.f8829b = i2 - 1;
        }
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: b */
    public final InterfaceC0826vx mo895b(yo2 yo2Var) {
        yo2Var.getClass();
        u21 u21Var = this.f1747r;
        fg3 fg3VarM1915f = gg3.m1915f(u21Var, yo2Var);
        qb2 qb2Var = this.f1749t;
        C0611q9 c0611q9 = (C0611q9) qb2Var.f8876d;
        c0611q9.getClass();
        int i = c0611q9.f8829b + 1;
        c0611q9.f8829b = i;
        if (i == ((Object[]) c0611q9.f8831d).length) {
            c0611q9.m4092h();
        }
        ((Object[]) c0611q9.f8831d)[i] = yo2Var;
        qb2Var.m4121h(fg3VarM1915f.f2996h);
        if (qb2Var.m4128p() != 4) {
            int iOrdinal = fg3VarM1915f.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new cv2(u21Var, fg3VarM1915f, qb2Var, yo2Var) : (this.f1748s == fg3VarM1915f && u21Var.f11072a.f2756c) ? this : new cv2(u21Var, fg3VarM1915f, qb2Var, yo2Var);
        }
        qb2.m4114m(qb2Var, "Unexpected leading comma", 0, 6);
        throw null;
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: c */
    public final Object mo896c(w41 w41Var) {
        w41Var.getClass();
        try {
            if (!(w41Var instanceof AbstractC0152e3)) {
                return w41Var.mo165a(this);
            }
            vi0.m5701t(w41Var);
            throw null;
        } catch (dh1 e) {
            String message = e.getMessage();
            message.getClass();
            if (pv2.m3995h0(message, "at path", false)) {
                throw e;
            }
            throw new dh1(e.getMessage() + " at path: " + ((C0611q9) this.f1749t.f8876d).m4089e(), e, e.f2053h, e.f2054i);
        }
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: d */
    public final long mo897d() {
        return this.f1749t.m4122i();
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: f */
    public final boolean mo898f() {
        boolean z;
        boolean z2;
        qb2 qb2Var = this.f1749t;
        int iM4130r = qb2Var.m4130r();
        String str = (String) qb2Var.f8879g;
        if (iM4130r == str.length()) {
            qb2.m4114m(qb2Var, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iM4130r) == '\"') {
            iM4130r++;
            z = true;
        } else {
            z = false;
        }
        int iM4129q = qb2Var.m4129q(iM4130r);
        if (iM4129q >= str.length() || iM4129q == -1) {
            qb2.m4114m(qb2Var, "EOF", 0, 6);
            throw null;
        }
        int i = iM4129q + 1;
        int iCharAt = str.charAt(iM4129q) | ' ';
        if (iCharAt == 102) {
            qb2Var.m4117d("alse", i);
            z2 = false;
        } else {
            if (iCharAt != 116) {
                qb2.m4114m(qb2Var, "Expected valid boolean literal prefix, but had '" + qb2Var.m4124k() + '\'', 0, 6);
                throw null;
            }
            qb2Var.m4117d("rue", i);
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (qb2Var.f8874b == str.length()) {
            qb2.m4114m(qb2Var, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(qb2Var.f8874b) == '\"') {
            qb2Var.f8874b++;
            return z2;
        }
        qb2.m4114m(qb2Var, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo899g() {
        boolean z;
        m31 m31Var = this.f1751v;
        if (!(m31Var != null ? m31Var.f6458b : false)) {
            qb2 qb2Var = this.f1749t;
            int iM4129q = qb2Var.m4129q(qb2Var.m4130r());
            String str = (String) qb2Var.f8879g;
            int length = str.length() - iM4129q;
            if (length < 4 || iM4129q == -1) {
                z = false;
                if (z) {
                    return true;
                }
            } else {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(iM4129q + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || AbstractC0179eu.m1420A(str.charAt(iM4129q + 4)) != 0) {
                        qb2Var.f8874b = iM4129q + 4;
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

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: h */
    public final char mo900h() {
        qb2 qb2Var = this.f1749t;
        String strM4124k = qb2Var.m4124k();
        if (strM4124k.length() == 1) {
            return strM4124k.charAt(0);
        }
        qb2.m4114m(qb2Var, "Expected single char, but got '" + strM4124k + '\'', 0, 6);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: j */
    public final int mo901j(yo2 yo2Var) throws Throwable {
        qb2 qb2Var = this.f1749t;
        C0611q9 c0611q9 = (C0611q9) qb2Var.f8876d;
        yo2Var.getClass();
        fg3 fg3Var = this.f1748s;
        int iOrdinal = fg3Var.ordinal();
        Throwable th = null;
        char c = ':';
        int i = 0;
        zM4131s = false;
        boolean zM4131s = false;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zM4131s2 = qb2Var.m4131s();
            while (true) {
                boolean zM4116c = qb2Var.m4116c();
                Throwable th2 = th;
                m31 m31Var = this.f1751v;
                if (zM4116c) {
                    String strM4118e = qb2Var.m4118e();
                    qb2Var.m4121h(c);
                    u21 u21Var = this.f1747r;
                    int iM4907C = sp0.m4907C(yo2Var, u21Var, strM4118e);
                    if (iM4907C != -3) {
                        if (m31Var != null) {
                            ud0 ud0Var = m31Var.f6457a;
                            if (iM4907C < 64) {
                                ud0Var.f11238a |= 1 << iM4907C;
                            } else {
                                int i3 = (iM4907C >>> 6) - 1;
                                long[] jArr = (long[]) ud0Var.f11241d;
                                jArr[i3] = jArr[i3] | (1 << (iM4907C & 63));
                            }
                        }
                        i2 = iM4907C;
                    } else {
                        if (!sp0.m4911G(u21Var, yo2Var)) {
                            int i4 = c0611q9.f8829b;
                            int[] iArr = (int[]) c0611q9.f8832e;
                            if (iArr[i4] == -2) {
                                iArr[i4] = -1;
                                c0611q9.f8829b = i4 - 1;
                            }
                            int i5 = c0611q9.f8829b;
                            if (i5 != -1) {
                                c0611q9.f8829b = i5 - 1;
                            }
                            qb2Var.m4125l(pv2.m4007t0(6, ((String) qb2Var.f8879g).subSequence(0, qb2Var.f8874b).toString(), strM4118e), "Encountered an unknown key '" + strM4118e + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                            throw th2;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bM4128p = qb2Var.m4128p();
                        if (bM4128p == 8 || bM4128p == 6) {
                            while (true) {
                                byte bM4128p2 = qb2Var.m4128p();
                                if (bM4128p2 == 1) {
                                    qb2Var.m4118e();
                                } else {
                                    if (bM4128p2 == 8 || bM4128p2 == 6) {
                                        arrayList.add(Byte.valueOf(bM4128p2));
                                    } else if (bM4128p2 == 9) {
                                        if (((Number) AbstractC0142du.m1166v0(arrayList)).byteValue() != 8) {
                                            qb2.m4114m(qb2Var, "found ] instead of }", 0, 6);
                                            throw th2;
                                        }
                                        if (arrayList.isEmpty()) {
                                            um2.m5519i("List is empty.");
                                            return 0;
                                        }
                                        arrayList.remove(arrayList.size() - 1);
                                    } else if (bM4128p2 == 7) {
                                        if (((Number) AbstractC0142du.m1166v0(arrayList)).byteValue() != 6) {
                                            qb2.m4114m(qb2Var, "found } instead of ]", 0, 6);
                                            throw th2;
                                        }
                                        if (arrayList.isEmpty()) {
                                            um2.m5519i("List is empty.");
                                            return 0;
                                        }
                                        arrayList.remove(arrayList.size() - 1);
                                    } else if (bM4128p2 == 10) {
                                        qb2.m4114m(qb2Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                        throw th2;
                                    }
                                    qb2Var.m4119f();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            qb2Var.m4124k();
                        }
                        zM4131s2 = qb2Var.m4131s();
                        th = th2;
                        c = ':';
                    }
                } else {
                    if (zM4131s2) {
                        AbstractC0570p7.m3788x(qb2Var, "object");
                        throw th2;
                    }
                    if (m31Var != null) {
                        ud0 ud0Var2 = m31Var.f6457a;
                        ml0 ml0Var = (ml0) ud0Var2.f11240c;
                        yo2 yo2Var2 = (yo2) ud0Var2.f11239b;
                        int iMo252d = yo2Var2.mo252d();
                        while (true) {
                            long j = ud0Var2.f11238a;
                            long j2 = -1;
                            if (j != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                ud0Var2.f11238a |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) ml0Var.mo12g(yo2Var2, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i2 = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iMo252d > 64) {
                                long[] jArr2 = (long[]) ud0Var2.f11241d;
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
                                        if (((Boolean) ml0Var.mo12g(yo2Var2, Integer.valueOf(i8))).booleanValue()) {
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
            boolean zM4131s3 = qb2Var.m4131s();
            if (qb2Var.m4116c()) {
                int i9 = this.f1750u;
                if (i9 != -1 && !zM4131s3) {
                    qb2.m4114m(qb2Var, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i2 = i9 + 1;
                this.f1750u = i2;
            } else if (zM4131s3) {
                AbstractC0570p7.m3788x(qb2Var, "array");
                throw null;
            }
        } else {
            int i10 = this.f1750u;
            Object[] objArr = i10 % 2 != 0;
            if (objArr != true) {
                qb2Var.m4121h(':');
            } else if (i10 != -1) {
                zM4131s = qb2Var.m4131s();
            }
            if (qb2Var.m4116c()) {
                if (objArr != false) {
                    int i11 = this.f1750u;
                    int i12 = qb2Var.f8874b;
                    if (i11 == -1) {
                        if (zM4131s) {
                            qb2.m4114m(qb2Var, "Unexpected leading comma", i12, 4);
                            throw null;
                        }
                    } else if (!zM4131s) {
                        qb2.m4114m(qb2Var, "Expected comma after the key-value pair", i12, 4);
                        throw null;
                    }
                }
                i2 = this.f1750u + 1;
                this.f1750u = i2;
            } else if (zM4131s) {
                AbstractC0570p7.m3788x(qb2Var, "object");
                throw null;
            }
        }
        if (fg3Var != fg3.f2992l) {
            ((int[]) c0611q9.f8832e)[c0611q9.f8829b] = i2;
        }
        return i2;
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: o */
    public final int mo902o() {
        qb2 qb2Var = this.f1749t;
        long jM4122i = qb2Var.m4122i();
        int i = (int) jM4122i;
        if (jM4122i == i) {
            return i;
        }
        qb2.m4114m(qb2Var, "Failed to parse int for input '" + jM4122i + '\'', 0, 6);
        throw null;
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: r */
    public final byte mo903r() {
        qb2 qb2Var = this.f1749t;
        long jM4122i = qb2Var.m4122i();
        byte b = (byte) jM4122i;
        if (jM4122i == b) {
            return b;
        }
        qb2.m4114m(qb2Var, "Failed to parse byte for input '" + jM4122i + '\'', 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: r0 */
    public final j31 m904r0() {
        return new C0133dk(this.f1747r.f11072a, this.f1749t).m1039m();
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: s */
    public final y40 mo905s(yo2 yo2Var) {
        yo2Var.getClass();
        return ev2.m1479a(yo2Var) ? new g31(this.f1749t, this.f1747r) : this;
    }

    /* JADX INFO: renamed from: s0 */
    public final u21 m906s0() {
        return this.f1747r;
    }

    @Override // p000.rp0, p000.InterfaceC0826vx
    /* JADX INFO: renamed from: t */
    public final Object mo907t(yo2 yo2Var, int i, w41 w41Var, Object obj) {
        C0611q9 c0611q9 = (C0611q9) this.f1749t.f8876d;
        yo2Var.getClass();
        w41Var.getClass();
        boolean z = this.f1748s == fg3.f2992l && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) c0611q9.f8832e;
            int i2 = c0611q9.f8829b;
            if (iArr[i2] == -2) {
                ((Object[]) c0611q9.f8831d)[i2] = C0700sn.f10208L;
            }
        }
        Object objMo896c = mo896c(w41Var);
        if (z) {
            int[] iArr2 = (int[]) c0611q9.f8832e;
            int i3 = c0611q9.f8829b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c0611q9.f8829b = i4;
                if (i4 == ((Object[]) c0611q9.f8831d).length) {
                    c0611q9.m4092h();
                }
            }
            Object[] objArr = (Object[]) c0611q9.f8831d;
            int i5 = c0611q9.f8829b;
            objArr[i5] = ((f31) c0611q9.f8830c).f2761h ? objMo896c : gd3.f3448z;
            ((int[]) c0611q9.f8832e)[i5] = -2;
        }
        return objMo896c;
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: v */
    public final short mo908v() {
        qb2 qb2Var = this.f1749t;
        long jM4122i = qb2Var.m4122i();
        short s = (short) jM4122i;
        if (jM4122i == s) {
            return s;
        }
        qb2.m4114m(qb2Var, "Failed to parse short for input '" + jM4122i + '\'', 0, 6);
        throw null;
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: w */
    public final String mo909w() {
        return this.f1749t.m4123j();
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: y */
    public final float mo910y() {
        qb2 qb2Var = this.f1749t;
        String strM4124k = qb2Var.m4124k();
        try {
            float f = Float.parseFloat(strM4124k);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            qb2.m4114m(qb2Var, AbstractC0570p7.m3750F(Float.valueOf(f), null), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m4114m(qb2Var, "Failed to parse type 'float' for input '" + strM4124k + '\'', 0, 6);
            throw null;
        }
    }
}
