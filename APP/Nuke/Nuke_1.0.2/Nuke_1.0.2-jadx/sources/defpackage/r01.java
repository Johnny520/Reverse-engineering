package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r01 implements w41 {
    public static final r01 a = new r01();
    public static final g32 b = new g32("kotlin.time.Instant", f32.o);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x047d  */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y40 y40Var) {
        int i;
        q01 q01VarF;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        char cCharAt2;
        n01 n01Var = n01.j;
        String strW = y40Var.w();
        strW.getClass();
        if (strW.length() == 0) {
            q01VarF = new sz0(21, "An empty string is not a valid Instant", strW);
        } else {
            char cCharAt3 = strW.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i5 = i;
            while (i5 < strW.length() && '0' <= (cCharAt2 = strW.charAt(i5)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strW.charAt(i5) - '0');
                i5++;
            }
            int i6 = i5 - i;
            if (i6 > 10) {
                q01VarF = qp0.G(strW, "Expected at most 10 digits for the year number, got " + i6 + " digits");
            } else if (i6 == 10 && strW.charAt(i) >= '2') {
                q01VarF = qp0.G(strW, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
            } else if (i6 < 4) {
                q01VarF = qp0.G(strW, "The year number must be padded to 4 digits, got " + i6 + " digits");
            } else if (cCharAt3 == '+' && i6 == 4) {
                q01VarF = qp0.G(strW, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i6 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i7 = i5 + 16;
                if (strW.length() < i7) {
                    q01VarF = qp0.G(strW, "The input string is too short");
                } else {
                    sz0 sz0VarF = qp0.F(strW, "'-'", i5, new nx0(3));
                    if (sz0VarF != null) {
                        q01VarF = sz0VarF;
                    } else {
                        q01VarF = qp0.F(strW, "'-'", i5 + 3, new nx0(4));
                        if (q01VarF == null && (q01VarF = qp0.F(strW, "'T' or 't'", i5 + 6, new nx0(5))) == null && (q01VarF = qp0.F(strW, "':'", i5 + 9, new nx0(6))) == null && (q01VarF = qp0.F(strW, "':'", i5 + 12, new nx0(7))) == null) {
                            int[] iArr = qp0.l;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= 10) {
                                    int iH = qp0.H(strW, i5 + 1);
                                    int iH2 = qp0.H(strW, i5 + 4);
                                    int iH3 = qp0.H(strW, i5 + 7);
                                    int iH4 = qp0.H(strW, i5 + 10);
                                    int iH5 = qp0.H(strW, i5 + 13);
                                    int i9 = i5 + 15;
                                    if (strW.charAt(i9) == '.') {
                                        i9 = i7;
                                        int iCharAt2 = 0;
                                        while (i9 < strW.length() && '0' <= (cCharAt = strW.charAt(i9)) && cCharAt < ':') {
                                            iCharAt2 = (iCharAt2 * 10) + (strW.charAt(i9) - '0');
                                            i9++;
                                        }
                                        int i10 = i9 - i7;
                                        if (1 > i10 || i10 >= 10) {
                                            q01VarF = qp0.G(strW, "1..9 digits are supported for the fraction of the second, got " + i10 + " digits");
                                        } else {
                                            i2 = iCharAt2 * qp0.k[9 - i10];
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    if (i9 >= strW.length()) {
                                        q01VarF = qp0.G(strW, "The UTC offset at the end of the string is missing");
                                    } else {
                                        char cCharAt4 = strW.charAt(i9);
                                        if (cCharAt4 == '+' || cCharAt4 == '-') {
                                            int length = strW.length() - i9;
                                            if (length > 9) {
                                                q01VarF = qp0.G(strW, "The UTC offset string \"" + qp0.W(strW.subSequence(i9, strW.length()).toString(), 16) + "\" is too long");
                                            } else if (length % 3 != 0) {
                                                q01VarF = qp0.G(strW, "Invalid UTC offset string \"" + strW.subSequence(i9, strW.length()).toString() + '\"');
                                            } else {
                                                int[] iArr2 = qp0.m;
                                                int i11 = 0;
                                                for (int i12 = 2; i11 < i12; i12 = 2) {
                                                    int i13 = i9 + iArr2[i11];
                                                    if (i13 >= strW.length()) {
                                                        break;
                                                    }
                                                    if (strW.charAt(i13) != ':') {
                                                        StringBuilder sbN = vi0.n(i13, "Expected ':' at index ", ", got '");
                                                        sbN.append(strW.charAt(i13));
                                                        sbN.append('\'');
                                                        q01VarF = qp0.G(strW, sbN.toString());
                                                        break;
                                                    }
                                                    i11++;
                                                }
                                                int[] iArr3 = qp0.n;
                                                int i14 = 0;
                                                while (i14 < 6 && (i4 = iArr3[i14] + i9) < strW.length()) {
                                                    char cCharAt5 = strW.charAt(i4);
                                                    int[] iArr4 = iArr3;
                                                    if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                        StringBuilder sbN2 = vi0.n(i4, "Expected an ASCII digit at index ", ", got '");
                                                        sbN2.append(strW.charAt(i4));
                                                        sbN2.append('\'');
                                                        q01VarF = qp0.G(strW, sbN2.toString());
                                                        break;
                                                    }
                                                    i14++;
                                                    iArr3 = iArr4;
                                                }
                                                int iH6 = qp0.H(strW, i9 + 1);
                                                int iH7 = length > 3 ? qp0.H(strW, i9 + 4) : 0;
                                                int iH8 = length > 6 ? qp0.H(strW, i9 + 7) : 0;
                                                if (iH7 > 59) {
                                                    q01VarF = qp0.G(strW, "Expected offset-minute-of-hour in 0..59, got " + iH7);
                                                } else if (iH8 > 59) {
                                                    q01VarF = qp0.G(strW, "Expected offset-second-of-minute in 0..59, got " + iH8);
                                                } else if (iH6 <= 17 || (iH6 == 18 && iH7 == 0 && iH8 == 0)) {
                                                    i3 = ((iH7 * 60) + (iH6 * 3600) + iH8) * (cCharAt4 == '-' ? -1 : 1);
                                                    if (1 <= iH || iH >= 13) {
                                                        q01VarF = qp0.G(strW, "Expected a month number in 1..12, got " + iH);
                                                    } else if (1 > iH2) {
                                                        StringBuilder sbK = hk1.k("Expected a valid day-of-month for month ", iH, iCharAt, " of year ", ", got ");
                                                        sbK.append(iH2);
                                                        q01VarF = qp0.G(strW, sbK.toString());
                                                    } else {
                                                        int i15 = iCharAt & 3;
                                                        if (iH2 <= (iH != 2 ? (iH == 4 || iH == 6 || iH == 9 || iH == 11) ? 30 : 31 : i15 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                            if (iH3 > 23) {
                                                                q01VarF = qp0.G(strW, "Expected hour in 0..23, got " + iH3);
                                                            } else if (iH4 > 59) {
                                                                q01VarF = qp0.G(strW, "Expected minute-of-hour in 0..59, got " + iH4);
                                                            } else if (iH5 > 59) {
                                                                q01VarF = qp0.G(strW, "Expected second-of-minute in 0..59, got " + iH5);
                                                            } else {
                                                                long j = iCharAt;
                                                                long j2 = 365 * j;
                                                                long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iH * 367) - 362) / 12)) + ((long) (iH2 - 1));
                                                                if (iH > 2) {
                                                                    j3 = (i15 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                                }
                                                                q01VarF = new p01((((j3 - 719528) * 86400) + ((long) (((iH4 * 60) + (iH3 * 3600)) + iH5))) - ((long) i3), i2);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    q01VarF = qp0.G(strW, "Expected an offset in -18:00..+18:00, got " + strW.subSequence(i9, strW.length()).toString());
                                                }
                                            }
                                        } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                            int i16 = i9 + 1;
                                            if (strW.length() == i16) {
                                                i3 = 0;
                                                if (1 <= iH) {
                                                    q01VarF = qp0.G(strW, "Expected a month number in 1..12, got " + iH);
                                                }
                                            } else {
                                                q01VarF = qp0.G(strW, "Extra text after the instant at position " + i16);
                                            }
                                        } else {
                                            q01VarF = qp0.G(strW, "Expected the UTC offset at position " + i9 + ", got '" + cCharAt4 + '\'');
                                        }
                                    }
                                } else {
                                    sz0 sz0VarF2 = qp0.F(strW, "an ASCII digit", iArr[i8] + i5, new nx0(8));
                                    if (sz0VarF2 != null) {
                                        q01VarF = sz0VarF2;
                                        break;
                                    }
                                    i8++;
                                }
                            }
                        }
                    }
                }
            } else {
                q01VarF = qp0.G(strW, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return q01VarF.toInstant();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        n01 n01Var = (n01) obj;
        n01Var.getClass();
        ve0Var.p(n01Var.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return b;
    }
}
