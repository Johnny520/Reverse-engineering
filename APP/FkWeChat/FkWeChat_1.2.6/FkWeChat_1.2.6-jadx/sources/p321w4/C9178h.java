package p321w4;

import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: w4.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9178h {

    /* JADX INFO: renamed from: a */
    public C9180j f31289a;

    /* JADX INFO: renamed from: b */
    public int[] f31290b;

    /* JADX INFO: renamed from: c */
    public int[] f31291c;

    /* JADX INFO: renamed from: d */
    public int[] f31292d;

    /* JADX INFO: renamed from: e */
    public int[] f31293e;

    /* JADX INFO: renamed from: f */
    public short f31294f;

    /* JADX INFO: renamed from: g */
    public short f31295g;

    /* JADX INFO: renamed from: h */
    public int f31296h;

    /* JADX INFO: renamed from: i */
    public int[] f31297i;

    public C9178h(C9180j c9180j) {
        this.f31289a = c9180j;
    }

    /* JADX INFO: renamed from: d */
    public static int m35640d(C9184n c9184n, String str, int i10) {
        char cCharAt = str.charAt(i10);
        int iM35724r = 16777218;
        if (cCharAt == 'F') {
            return 16777218;
        }
        if (cCharAt == 'L') {
            return c9184n.m35724r(str.substring(i10 + 1, str.length() - 1)) | 33554432;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 16777220;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i11 = i10 + 1;
                        while (str.charAt(i11) == '[') {
                            i11++;
                        }
                        char cCharAt2 = str.charAt(i11);
                        if (cCharAt2 != 'F') {
                            if (cCharAt2 == 'L') {
                                iM35724r = c9184n.m35724r(str.substring(i11 + 1, str.length() - 1)) | 33554432;
                            } else if (cCharAt2 == 'S') {
                                iM35724r = 16777228;
                            } else if (cCharAt2 == 'Z') {
                                iM35724r = 16777225;
                            } else if (cCharAt2 == 'I') {
                                iM35724r = 16777217;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iM35724r = 16777226;
                                        break;
                                    case 'C':
                                        iM35724r = 16777227;
                                        break;
                                    case 'D':
                                        iM35724r = 16777219;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                iM35724r = 16777220;
                            }
                        }
                        return ((i11 - i10) << 28) | iM35724r;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 16777219;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        return 16777217;
    }

    /* JADX INFO: renamed from: e */
    public static int m35641e(C9184n c9184n, String str) {
        return c9184n.m35724r(str) | 33554432;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m35642i(C9184n c9184n, int i10, int[] iArr, int i11) {
        int iMin;
        int iM35724r;
        int i12 = iArr[i11];
        if (i12 == i10) {
            return false;
        }
        if ((268435455 & i10) == 16777221) {
            if (i12 == 16777221) {
                return false;
            }
            i10 = 16777221;
        }
        if (i12 == 0) {
            iArr[i11] = i10;
            return true;
        }
        int i13 = i12 & (-268435456);
        int iM35723q = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        if (i13 != 0 || (i12 & 251658240) == 33554432) {
            if (i10 == 16777221) {
                return false;
            }
            if ((i10 & (-16777216)) != ((-16777216) & i12)) {
                int i14 = i10 & (-268435456);
                if (i14 != 0 || (i10 & 251658240) == 33554432) {
                    if (i14 != 0 && (i10 & 251658240) != 33554432) {
                        i14 -= 268435456;
                    }
                    if (i13 != 0 && (i12 & 251658240) != 33554432) {
                        i13 -= 268435456;
                    }
                    iMin = Math.min(i14, i13) | 33554432;
                    iM35724r = c9184n.m35724r(ASMUtils.TYPE_OBJECT);
                    iM35723q = iMin | iM35724r;
                }
            } else if ((i12 & 251658240) == 33554432) {
                iM35723q = (i10 & (-268435456)) | 33554432 | c9184n.m35723q(i10 & 1048575, 1048575 & i12);
            } else {
                iMin = ((i10 & (-268435456)) - 268435456) | 33554432;
                iM35724r = c9184n.m35724r(ASMUtils.TYPE_OBJECT);
                iM35723q = iMin | iM35724r;
            }
        } else if (i12 == 16777221) {
            if ((i10 & (-268435456)) == 0 && (i10 & 251658240) != 33554432) {
                i10 = 16777216;
            }
            iM35723q = i10;
        }
        if (iM35723q == i12) {
            return false;
        }
        iArr[i11] = iM35723q;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static void m35643p(C9184n c9184n, int i10, C9172b c9172b) {
        int i11 = ((-268435456) & i10) >> 28;
        if (i11 == 0) {
            int i12 = i10 & 1048575;
            int i13 = i10 & 251658240;
            if (i13 == 16777216) {
                c9172b.m35624f(i12);
                return;
            } else if (i13 == 33554432) {
                c9172b.m35624f(7).m35628j(c9184n.m35708b(c9184n.m35702A(i12).f31360e).f31356a);
                return;
            } else {
                if (i13 != 50331648) {
                    throw new AssertionError();
                }
                c9172b.m35624f(8).m35628j((int) c9184n.m35702A(i12).f31361f);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i14 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            sb2.append('[');
            i11 = i14;
        }
        if ((i10 & 251658240) == 33554432) {
            sb2.append('L');
            sb2.append(c9184n.m35702A(i10 & 1048575).f31360e);
            sb2.append(';');
        } else {
            int i15 = i10 & 1048575;
            if (i15 == 1) {
                sb2.append('I');
            } else if (i15 == 2) {
                sb2.append('F');
            } else if (i15 == 3) {
                sb2.append('D');
            } else if (i15 != 4) {
                switch (i15) {
                    case 9:
                        sb2.append('Z');
                        break;
                    case 10:
                        sb2.append('B');
                        break;
                    case Opcodes.FCONST_0 /* 11 */:
                        sb2.append('C');
                        break;
                    case Opcodes.FCONST_1 /* 12 */:
                        sb2.append('S');
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                sb2.append('J');
            }
        }
        c9172b.m35624f(7).m35628j(c9184n.m35708b(sb2.toString()).f31356a);
    }

    /* JADX INFO: renamed from: a */
    public final void m35644a(C9182l c9182l) {
        int[] iArr = this.f31290b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = 2;
            if (i11 >= iArr.length) {
                break;
            }
            int i15 = iArr[i11];
            if (i15 != 16777220 && i15 != 16777219) {
                i14 = 1;
            }
            i11 += i14;
            if (i15 == 16777216) {
                i13++;
            } else {
                i12 += i13 + 1;
                i13 = 0;
            }
        }
        int[] iArr2 = this.f31291c;
        int i16 = 0;
        int i17 = 0;
        while (i16 < iArr2.length) {
            int i18 = iArr2[i16];
            i16 += (i18 == 16777220 || i18 == 16777219) ? 2 : 1;
            i17++;
        }
        int iM35693y = c9182l.m35693y(this.f31289a.f31306b, i12, i17);
        int i19 = 0;
        while (true) {
            int i20 = i12 - 1;
            if (i12 <= 0) {
                break;
            }
            int i21 = iArr[i19];
            i19 += (i21 == 16777220 || i21 == 16777219) ? 2 : 1;
            c9182l.m35691w(iM35693y, i21);
            i12 = i20;
            iM35693y++;
        }
        while (true) {
            int i22 = i17 - 1;
            if (i17 <= 0) {
                c9182l.m35692x();
                return;
            }
            int i23 = iArr2[i10];
            i10 += (i23 == 16777220 || i23 == 16777219) ? 2 : 1;
            c9182l.m35691w(iM35693y, i23);
            iM35693y++;
            i17 = i22;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m35645b(int i10) {
        if (this.f31297i == null) {
            this.f31297i = new int[2];
        }
        int length = this.f31297i.length;
        int i11 = this.f31296h;
        if (i11 >= length) {
            int[] iArr = new int[Math.max(i11 + 1, length * 2)];
            System.arraycopy(this.f31297i, 0, iArr, 0, length);
            this.f31297i = iArr;
        }
        int[] iArr2 = this.f31297i;
        int i12 = this.f31296h;
        this.f31296h = i12 + 1;
        iArr2[i12] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0314  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m35646c(int r19, int r20, p321w4.AbstractC9183m r21, p321w4.C9184n r22) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p321w4.C9178h.m35646c(int, int, w4.m, w4.n):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[LOOP:0: B:7:0x000d->B:23:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m35647f(p321w4.C9184n r9, int r10) {
        /*
            r8 = this;
            r0 = 16777222(0x1000006, float:2.3509904E-38)
            if (r10 == r0) goto Lc
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r10
            r2 = 50331648(0x3000000, float:3.761582E-37)
            if (r1 != r2) goto L54
        Lc:
            r1 = 0
        Ld:
            int r2 = r8.f31296h
            if (r1 >= r2) goto L54
            int[] r2 = r8.f31297i
            r2 = r2[r1]
            r3 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r3 = r3 & r2
            r4 = 251658240(0xf000000, float:6.3108872E-30)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            if (r4 != r7) goto L2a
            int[] r2 = r8.f31290b
            r2 = r2[r6]
        L28:
            int r2 = r2 + r3
            goto L35
        L2a:
            r7 = 83886080(0x5000000, float:6.018531E-36)
            if (r4 != r7) goto L35
            int[] r2 = r8.f31291c
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L28
        L35:
            if (r10 != r2) goto L51
            r1 = 33554432(0x2000000, float:9.403955E-38)
            if (r10 != r0) goto L45
            java.lang.String r10 = r9.m35729w()
            int r9 = r9.m35724r(r10)
        L43:
            r9 = r9 | r1
            return r9
        L45:
            r10 = r10 & r5
            w4.m r10 = r9.m35702A(r10)
            java.lang.String r10 = r10.f31360e
            int r9 = r9.m35724r(r10)
            goto L43
        L51:
            int r1 = r1 + 1
            goto Ld
        L54:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p321w4.C9178h.m35647f(w4.n, int):int");
    }

    /* JADX INFO: renamed from: g */
    public final int m35648g() {
        return this.f31291c.length;
    }

    /* JADX INFO: renamed from: h */
    public final int m35649h(int i10) {
        int[] iArr = this.f31292d;
        if (iArr == null || i10 >= iArr.length) {
            return i10 | 67108864;
        }
        int i11 = iArr[i10];
        if (i11 != 0) {
            return i11;
        }
        int i12 = 67108864 | i10;
        iArr[i10] = i12;
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa A[PHI: r6
  0x00fa: PHI (r6v8 int) = (r6v7 int), (r6v7 int), (r6v11 int), (r6v11 int) binds: [B:69:0x0109, B:71:0x010d, B:62:0x00f1, B:64:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m35650j(p321w4.C9184n r21, p321w4.C9178h r22, int r23) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p321w4.C9178h.m35650j(w4.n, w4.h, int):boolean");
    }

    /* JADX INFO: renamed from: k */
    public final int m35651k() {
        short s10 = this.f31295g;
        if (s10 <= 0) {
            short s11 = (short) (this.f31294f - 1);
            this.f31294f = s11;
            return (-s11) | 83886080;
        }
        int[] iArr = this.f31293e;
        short s12 = (short) (s10 - 1);
        this.f31295g = s12;
        return iArr[s12];
    }

    /* JADX INFO: renamed from: l */
    public final void m35652l(int i10) {
        short s10 = this.f31295g;
        if (s10 >= i10) {
            this.f31295g = (short) (s10 - i10);
        } else {
            this.f31294f = (short) (this.f31294f - (i10 - s10));
            this.f31295g = (short) 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m35653m(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            m35652l((C9185o.m35734b(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            m35652l(2);
        } else {
            m35652l(1);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m35654n(int i10) {
        if (this.f31293e == null) {
            this.f31293e = new int[10];
        }
        int length = this.f31293e.length;
        short s10 = this.f31295g;
        if (s10 >= length) {
            int[] iArr = new int[Math.max(s10 + 1, length * 2)];
            System.arraycopy(this.f31293e, 0, iArr, 0, length);
            this.f31293e = iArr;
        }
        int[] iArr2 = this.f31293e;
        short s11 = this.f31295g;
        short s12 = (short) (s11 + 1);
        this.f31295g = s12;
        iArr2[s11] = i10;
        short s13 = (short) (this.f31294f + s12);
        C9180j c9180j = this.f31289a;
        if (s13 > c9180j.f31310f) {
            c9180j.f31310f = s13;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m35655o(C9184n c9184n, String str) {
        int iM35640d = m35640d(c9184n, str, str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0);
        if (iM35640d != 0) {
            m35654n(iM35640d);
            if (iM35640d == 16777220 || iM35640d == 16777219) {
                m35654n(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m35656q(C9184n c9184n, int i10, String str, int i11) {
        int i12;
        int[] iArr = new int[i11];
        this.f31290b = iArr;
        this.f31291c = new int[0];
        if ((i10 & 8) == 0) {
            i12 = 1;
            if ((i10 & 262144) == 0) {
                iArr[0] = c9184n.m35724r(c9184n.m35729w()) | 33554432;
            } else {
                iArr[0] = 16777222;
            }
        } else {
            i12 = 0;
        }
        for (C9185o c9185o : C9185o.m35733a(str)) {
            int iM35640d = m35640d(c9184n, c9185o.m35738c(), 0);
            int[] iArr2 = this.f31290b;
            int i13 = i12 + 1;
            iArr2[i12] = iM35640d;
            if (iM35640d == 16777220 || iM35640d == 16777219) {
                i12 += 2;
                iArr2[i13] = 16777216;
            } else {
                i12 = i13;
            }
        }
        while (i12 < i11) {
            this.f31290b[i12] = 16777216;
            i12++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m35657r(int i10, int i11) {
        if (this.f31292d == null) {
            this.f31292d = new int[10];
        }
        int length = this.f31292d.length;
        if (i10 >= length) {
            int[] iArr = new int[Math.max(i10 + 1, length * 2)];
            System.arraycopy(this.f31292d, 0, iArr, 0, length);
            this.f31292d = iArr;
        }
        this.f31292d[i10] = i11;
    }
}
