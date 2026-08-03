package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ia */
/* JADX INFO: loaded from: classes.dex */
public final class C1539ia extends AbstractC2140ka {

    /* JADX INFO: renamed from: c */
    public final byte[] f5428c;

    /* JADX INFO: renamed from: d */
    public int f5429d;

    /* JADX INFO: renamed from: e */
    public int f5430e;

    /* JADX INFO: renamed from: f */
    public int f5431f;

    /* JADX INFO: renamed from: g */
    public final int f5432g;

    /* JADX INFO: renamed from: h */
    public int f5433h;

    /* JADX INFO: renamed from: i */
    public int f5434i = Integer.MAX_VALUE;

    public C1539ia(byte[] bArr, int i, int i2, boolean z) {
        this.f5428c = bArr;
        this.f5429d = i2 + i;
        this.f5431f = i;
        this.f5432g = i;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: A */
    public final String mo2926A() throws C0673Pl {
        int iM2932G = m2932G();
        if (iM2932G > 0) {
            int i = this.f5429d;
            int i2 = this.f5431f;
            if (iM2932G <= i - i2) {
                String strMo1360i = AbstractC2536tD.f8842a.mo1360i(this.f5428c, i2, iM2932G);
                this.f5431f += iM2932G;
                return strMo1360i;
            }
        }
        if (iM2932G == 0) {
            return "";
        }
        if (iM2932G <= 0) {
            throw C0673Pl.m1368e();
        }
        throw C0673Pl.m1370g();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: B */
    public final int mo2927B() throws C0673Pl {
        if (mo2938g()) {
            this.f5433h = 0;
            return 0;
        }
        int iM2932G = m2932G();
        this.f5433h = iM2932G;
        if ((iM2932G >>> 3) != 0) {
            return iM2932G;
        }
        throw C0673Pl.m1364a();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: C */
    public final int mo2928C() {
        return m2932G();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: D */
    public final long mo2929D() {
        return m2933H();
    }

    /* JADX INFO: renamed from: E */
    public final int m2930E() throws C0673Pl {
        int i = this.f5431f;
        if (this.f5429d - i < 4) {
            throw C0673Pl.m1370g();
        }
        this.f5431f = i + 4;
        byte[] bArr = this.f5428c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: F */
    public final long m2931F() throws C0673Pl {
        int i = this.f5431f;
        if (this.f5429d - i < 8) {
            throw C0673Pl.m1370g();
        }
        this.f5431f = i + 8;
        byte[] bArr = this.f5428c;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: G */
    public final int m2932G() {
        int i;
        int i2 = this.f5431f;
        int i3 = this.f5429d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f5428c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f5431f = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f5431f = i5;
                return i;
            }
        }
        return (int) m2934I();
    }

    /* JADX INFO: renamed from: H */
    public final long m2933H() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f5431f;
        int i2 = this.f5429d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f5428c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f5431f = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f5431f = i4;
                return j;
            }
        }
        return m2934I();
    }

    /* JADX INFO: renamed from: I */
    public final long m2934I() throws C0673Pl {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f5431f;
            if (i2 == this.f5429d) {
                throw C0673Pl.m1370g();
            }
            this.f5431f = i2 + 1;
            byte b = this.f5428c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw C0673Pl.m1367d();
    }

    /* JADX INFO: renamed from: J */
    public final void m2935J() {
        int i = this.f5429d + this.f5430e;
        this.f5429d = i;
        int i2 = i - this.f5432g;
        int i3 = this.f5434i;
        if (i2 <= i3) {
            this.f5430e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f5430e = i4;
        this.f5429d = i - i4;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: b */
    public final void mo2936b(int i) throws C0673Pl {
        if (this.f5433h != i) {
            throw new C0673Pl("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: f */
    public final int mo2937f() {
        return this.f5431f - this.f5432g;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: g */
    public final boolean mo2938g() {
        return this.f5431f == this.f5429d;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: j */
    public final void mo2939j(int i) {
        this.f5434i = i;
        m2935J();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: l */
    public final int mo2940l(int i) throws C0673Pl {
        if (i < 0) {
            throw C0673Pl.m1368e();
        }
        int iMo2937f = mo2937f() + i;
        if (iMo2937f < 0) {
            throw C0673Pl.m1369f();
        }
        int i2 = this.f5434i;
        if (iMo2937f > i2) {
            throw C0673Pl.m1370g();
        }
        this.f5434i = iMo2937f;
        m2935J();
        return i2;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: m */
    public final boolean mo2941m() {
        return m2933H() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2701x6 mo2942n() throws C0673Pl {
        byte[] bArrCopyOfRange;
        int iM2932G = m2932G();
        byte[] bArr = this.f5428c;
        if (iM2932G > 0) {
            int i = this.f5429d;
            int i2 = this.f5431f;
            if (iM2932G <= i - i2) {
                C2701x6 c2701x6M5328c = AbstractC2744y6.m5328c(bArr, i2, iM2932G);
                this.f5431f += iM2932G;
                return c2701x6M5328c;
            }
        }
        if (iM2932G == 0) {
            return AbstractC2744y6.f9369b;
        }
        if (iM2932G > 0) {
            int i3 = this.f5429d;
            int i4 = this.f5431f;
            if (iM2932G <= i3 - i4) {
                int i5 = iM2932G + i4;
                this.f5431f = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM2932G > 0) {
                    throw C0673Pl.m1370g();
                }
                if (iM2932G != 0) {
                    throw C0673Pl.m1368e();
                }
                bArrCopyOfRange = AbstractC0501Ll.f1638b;
            }
        }
        C2701x6 c2701x6 = AbstractC2744y6.f9369b;
        return new C2701x6(bArrCopyOfRange);
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: o */
    public final double mo2943o() {
        return Double.longBitsToDouble(m2931F());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: p */
    public final int mo2944p() {
        return m2932G();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: q */
    public final int mo2945q() {
        return m2930E();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: r */
    public final long mo2946r() {
        return m2931F();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: s */
    public final float mo2947s() {
        return Float.intBitsToFloat(m2930E());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: t */
    public final int mo2948t() {
        return m2932G();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: u */
    public final long mo2949u() {
        return m2933H();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: v */
    public final int mo2950v() {
        return m2930E();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: w */
    public final long mo2951w() {
        return m2931F();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: x */
    public final int mo2952x() {
        return AbstractC2140ka.m4321d(m2932G());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: y */
    public final long mo2953y() {
        return AbstractC2140ka.m4322e(m2933H());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: z */
    public final String mo2954z() throws C0673Pl {
        int iM2932G = m2932G();
        if (iM2932G > 0) {
            int i = this.f5429d;
            int i2 = this.f5431f;
            if (iM2932G <= i - i2) {
                String str = new String(this.f5428c, i2, iM2932G, AbstractC0501Ll.f1637a);
                this.f5431f += iM2932G;
                return str;
            }
        }
        if (iM2932G == 0) {
            return "";
        }
        if (iM2932G < 0) {
            throw C0673Pl.m1368e();
        }
        throw C0673Pl.m1370g();
    }
}
