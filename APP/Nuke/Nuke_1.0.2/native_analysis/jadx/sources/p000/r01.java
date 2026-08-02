package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r01 implements w41 {

    /* JADX INFO: renamed from: a */
    public static final r01 f9307a = new r01();

    /* JADX INFO: renamed from: b */
    public static final g32 f9308b = new g32("kotlin.time.Instant", f32.f2770o);

    /* JADX WARN: Removed duplicated region for block: B:195:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x047d  */
    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo165a(y40 y40Var) {
        int i;
        q01 q01VarM4224F;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        char cCharAt2;
        n01 n01Var = n01.f6949j;
        String strMo909w = y40Var.mo909w();
        strMo909w.getClass();
        if (strMo909w.length() == 0) {
            q01VarM4224F = new sz0(21, "An empty string is not a valid Instant", strMo909w);
        } else {
            char cCharAt3 = strMo909w.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i5 = i;
            while (i5 < strMo909w.length() && '0' <= (cCharAt2 = strMo909w.charAt(i5)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strMo909w.charAt(i5) - '0');
                i5++;
            }
            int i6 = i5 - i;
            if (i6 > 10) {
                q01VarM4224F = qp0.m4225G(strMo909w, "Expected at most 10 digits for the year number, got " + i6 + " digits");
            } else if (i6 == 10 && strMo909w.charAt(i) >= '2') {
                q01VarM4224F = qp0.m4225G(strMo909w, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
            } else if (i6 < 4) {
                q01VarM4224F = qp0.m4225G(strMo909w, "The year number must be padded to 4 digits, got " + i6 + " digits");
            } else if (cCharAt3 == '+' && i6 == 4) {
                q01VarM4224F = qp0.m4225G(strMo909w, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i6 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i7 = i5 + 16;
                if (strMo909w.length() < i7) {
                    q01VarM4224F = qp0.m4225G(strMo909w, "The input string is too short");
                } else {
                    sz0 sz0VarM4224F = qp0.m4224F(strMo909w, "'-'", i5, new nx0(3));
                    if (sz0VarM4224F != null) {
                        q01VarM4224F = sz0VarM4224F;
                    } else {
                        q01VarM4224F = qp0.m4224F(strMo909w, "'-'", i5 + 3, new nx0(4));
                        if (q01VarM4224F == null && (q01VarM4224F = qp0.m4224F(strMo909w, "'T' or 't'", i5 + 6, new nx0(5))) == null && (q01VarM4224F = qp0.m4224F(strMo909w, "':'", i5 + 9, new nx0(6))) == null && (q01VarM4224F = qp0.m4224F(strMo909w, "':'", i5 + 12, new nx0(7))) == null) {
                            int[] iArr = qp0.f9070l;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= 10) {
                                    int iM4226H = qp0.m4226H(strMo909w, i5 + 1);
                                    int iM4226H2 = qp0.m4226H(strMo909w, i5 + 4);
                                    int iM4226H3 = qp0.m4226H(strMo909w, i5 + 7);
                                    int iM4226H4 = qp0.m4226H(strMo909w, i5 + 10);
                                    int iM4226H5 = qp0.m4226H(strMo909w, i5 + 13);
                                    int i9 = i5 + 15;
                                    if (strMo909w.charAt(i9) == '.') {
                                        i9 = i7;
                                        int iCharAt2 = 0;
                                        while (i9 < strMo909w.length() && '0' <= (cCharAt = strMo909w.charAt(i9)) && cCharAt < ':') {
                                            iCharAt2 = (iCharAt2 * 10) + (strMo909w.charAt(i9) - '0');
                                            i9++;
                                        }
                                        int i10 = i9 - i7;
                                        if (1 > i10 || i10 >= 10) {
                                            q01VarM4224F = qp0.m4225G(strMo909w, "1..9 digits are supported for the fraction of the second, got " + i10 + " digits");
                                        } else {
                                            i2 = iCharAt2 * qp0.f9069k[9 - i10];
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    if (i9 >= strMo909w.length()) {
                                        q01VarM4224F = qp0.m4225G(strMo909w, "The UTC offset at the end of the string is missing");
                                    } else {
                                        char cCharAt4 = strMo909w.charAt(i9);
                                        if (cCharAt4 == '+' || cCharAt4 == '-') {
                                            int length = strMo909w.length() - i9;
                                            if (length > 9) {
                                                q01VarM4224F = qp0.m4225G(strMo909w, "The UTC offset string \"" + qp0.m4241W(strMo909w.subSequence(i9, strMo909w.length()).toString(), 16) + "\" is too long");
                                            } else if (length % 3 != 0) {
                                                q01VarM4224F = qp0.m4225G(strMo909w, "Invalid UTC offset string \"" + strMo909w.subSequence(i9, strMo909w.length()).toString() + '\"');
                                            } else {
                                                int[] iArr2 = qp0.f9071m;
                                                int i11 = 0;
                                                for (int i12 = 2; i11 < i12; i12 = 2) {
                                                    int i13 = i9 + iArr2[i11];
                                                    if (i13 >= strMo909w.length()) {
                                                        break;
                                                    }
                                                    if (strMo909w.charAt(i13) != ':') {
                                                        StringBuilder sbM5695n = vi0.m5695n(i13, "Expected ':' at index ", ", got '");
                                                        sbM5695n.append(strMo909w.charAt(i13));
                                                        sbM5695n.append('\'');
                                                        q01VarM4224F = qp0.m4225G(strMo909w, sbM5695n.toString());
                                                        break;
                                                    }
                                                    i11++;
                                                }
                                                int[] iArr3 = qp0.f9072n;
                                                int i14 = 0;
                                                while (i14 < 6 && (i4 = iArr3[i14] + i9) < strMo909w.length()) {
                                                    char cCharAt5 = strMo909w.charAt(i4);
                                                    int[] iArr4 = iArr3;
                                                    if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                        StringBuilder sbM5695n2 = vi0.m5695n(i4, "Expected an ASCII digit at index ", ", got '");
                                                        sbM5695n2.append(strMo909w.charAt(i4));
                                                        sbM5695n2.append('\'');
                                                        q01VarM4224F = qp0.m4225G(strMo909w, sbM5695n2.toString());
                                                        break;
                                                    }
                                                    i14++;
                                                    iArr3 = iArr4;
                                                }
                                                int iM4226H6 = qp0.m4226H(strMo909w, i9 + 1);
                                                int iM4226H7 = length > 3 ? qp0.m4226H(strMo909w, i9 + 4) : 0;
                                                int iM4226H8 = length > 6 ? qp0.m4226H(strMo909w, i9 + 7) : 0;
                                                if (iM4226H7 > 59) {
                                                    q01VarM4224F = qp0.m4225G(strMo909w, "Expected offset-minute-of-hour in 0..59, got " + iM4226H7);
                                                } else if (iM4226H8 > 59) {
                                                    q01VarM4224F = qp0.m4225G(strMo909w, "Expected offset-second-of-minute in 0..59, got " + iM4226H8);
                                                } else if (iM4226H6 <= 17 || (iM4226H6 == 18 && iM4226H7 == 0 && iM4226H8 == 0)) {
                                                    i3 = ((iM4226H7 * 60) + (iM4226H6 * 3600) + iM4226H8) * (cCharAt4 == '-' ? -1 : 1);
                                                    if (1 <= iM4226H || iM4226H >= 13) {
                                                        q01VarM4224F = qp0.m4225G(strMo909w, "Expected a month number in 1..12, got " + iM4226H);
                                                    } else if (1 > iM4226H2) {
                                                        StringBuilder sbM2212k = hk1.m2212k("Expected a valid day-of-month for month ", iM4226H, iCharAt, " of year ", ", got ");
                                                        sbM2212k.append(iM4226H2);
                                                        q01VarM4224F = qp0.m4225G(strMo909w, sbM2212k.toString());
                                                    } else {
                                                        int i15 = iCharAt & 3;
                                                        if (iM4226H2 <= (iM4226H != 2 ? (iM4226H == 4 || iM4226H == 6 || iM4226H == 9 || iM4226H == 11) ? 30 : 31 : i15 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                            if (iM4226H3 > 23) {
                                                                q01VarM4224F = qp0.m4225G(strMo909w, "Expected hour in 0..23, got " + iM4226H3);
                                                            } else if (iM4226H4 > 59) {
                                                                q01VarM4224F = qp0.m4225G(strMo909w, "Expected minute-of-hour in 0..59, got " + iM4226H4);
                                                            } else if (iM4226H5 > 59) {
                                                                q01VarM4224F = qp0.m4225G(strMo909w, "Expected second-of-minute in 0..59, got " + iM4226H5);
                                                            } else {
                                                                long j = iCharAt;
                                                                long j2 = 365 * j;
                                                                long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iM4226H * 367) - 362) / 12)) + ((long) (iM4226H2 - 1));
                                                                if (iM4226H > 2) {
                                                                    j3 = (i15 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                                }
                                                                q01VarM4224F = new p01((((j3 - 719528) * 86400) + ((long) (((iM4226H4 * 60) + (iM4226H3 * 3600)) + iM4226H5))) - ((long) i3), i2);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    q01VarM4224F = qp0.m4225G(strMo909w, "Expected an offset in -18:00..+18:00, got " + strMo909w.subSequence(i9, strMo909w.length()).toString());
                                                }
                                            }
                                        } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                            int i16 = i9 + 1;
                                            if (strMo909w.length() == i16) {
                                                i3 = 0;
                                                if (1 <= iM4226H) {
                                                    q01VarM4224F = qp0.m4225G(strMo909w, "Expected a month number in 1..12, got " + iM4226H);
                                                }
                                            } else {
                                                q01VarM4224F = qp0.m4225G(strMo909w, "Extra text after the instant at position " + i16);
                                            }
                                        } else {
                                            q01VarM4224F = qp0.m4225G(strMo909w, "Expected the UTC offset at position " + i9 + ", got '" + cCharAt4 + '\'');
                                        }
                                    }
                                } else {
                                    sz0 sz0VarM4224F2 = qp0.m4224F(strMo909w, "an ASCII digit", iArr[i8] + i5, new nx0(8));
                                    if (sz0VarM4224F2 != null) {
                                        q01VarM4224F = sz0VarM4224F2;
                                        break;
                                    }
                                    i8++;
                                }
                            }
                        }
                    }
                }
            } else {
                q01VarM4224F = qp0.m4225G(strMo909w, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return q01VarM4224F.toInstant();
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        n01 n01Var = (n01) obj;
        n01Var.getClass();
        ve0Var.mo1191p(n01Var.toString());
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return f9308b;
    }
}
