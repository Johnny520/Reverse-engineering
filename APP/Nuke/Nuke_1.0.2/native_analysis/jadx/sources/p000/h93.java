package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h93 implements w41 {

    /* JADX INFO: renamed from: a */
    public static final h93 f3927a = new h93();

    /* JADX INFO: renamed from: b */
    public static final g32 f3928b = new g32("kotlin.uuid.Uuid", f32.f2770o);

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        String strMo909w = y40Var.mo909w();
        strMo909w.getClass();
        int length = strMo909w.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strMo909w.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = rs0.f9743b[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                lg3.m2912d(i, strMo909w, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strMo909w.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = rs0.f9743b[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                lg3.m2912d(i2, strMo909w, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new g93(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strMo909w.length() <= 64 ? strMo909w : strMo909w.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strMo909w.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strMo909w.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = rs0.f9743b[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                lg3.m2912d(i, strMo909w, "a hexadecimal digit");
                throw null;
            }
            if (strMo909w.charAt(8) != '-') {
                lg3.m2912d(8, strMo909w, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strMo909w.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = rs0.f9743b[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                lg3.m2912d(i3, strMo909w, "a hexadecimal digit");
                throw null;
            }
            if (strMo909w.charAt(13) != '-') {
                lg3.m2912d(13, strMo909w, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strMo909w.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = rs0.f9743b[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                lg3.m2912d(i4, strMo909w, "a hexadecimal digit");
                throw null;
            }
            if (strMo909w.charAt(18) != '-') {
                lg3.m2912d(18, strMo909w, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strMo909w.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = rs0.f9743b[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                lg3.m2912d(i5, strMo909w, "a hexadecimal digit");
                throw null;
            }
            if (strMo909w.charAt(23) != '-') {
                lg3.m2912d(23, strMo909w, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strMo909w.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = rs0.f9743b[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                lg3.m2912d(i6, strMo909w, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new g93(j22, j23);
            }
        }
        return g93.f3368j;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        g93 g93Var = (g93) obj;
        g93Var.getClass();
        ve0Var.mo1191p(g93Var.toString());
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return f3928b;
    }
}
