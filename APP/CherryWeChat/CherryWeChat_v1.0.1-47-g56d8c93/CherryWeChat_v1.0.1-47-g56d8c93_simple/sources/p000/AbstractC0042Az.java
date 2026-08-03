package p000;

/* JADX INFO: renamed from: Az */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0042Az extends AbstractC2822zz {
    /* JADX INFO: renamed from: G */
    public static final void m60G(String r3) {
        throw new NumberFormatException("Invalid number format: '" + r3 + '\'');
    }

    /* JADX INFO: renamed from: H */
    public static Integer m61H(String r9) {
        int r0 = r9.length();
        if (r0 == 0) goto L30;
        int r1 = 0;
        char r2 = r9.charAt(0);
        int r4 = -2147483647;
        if (AbstractC0585Nj.m1139g(r2, 48) >= 0) goto L17;
        int r3 = 1;
        if (r0 != 1) goto L11;
        return null;
    L11:
        if (r2 != '+') goto L13;
        boolean r22 = false;
    L18:
        int r6 = -59652323;
    L19:
        if (r3 >= r0) goto L33;
        int r7 = Character.digit(r9.charAt(r3), 10);
        if (r7 < 0) goto L45;
        if (r1 >= r6) goto L28;
        if (r6 != (-59652323)) goto L46;
        r6 = r4 / 10;
        if (r1 >= r6) goto L28;
        return null;
    L46:
        return null;
    L28:
        int r12 = r1 * 10;
        if (r12 < (r4 + r7)) goto L48;
        r1 = r12 - r7;
        r3 = r3 + 1;
        goto L19
    L48:
        return null;
    L45:
        return null;
    L33:
        if (r22 == false) goto L37;
        return Integer.valueOf(r1);
    L37:
        return Integer.valueOf(-r1);
    L13:
        if (r2 != '-') goto L44;
        r4 = Integer.MIN_VALUE;
        r22 = true;
        goto L18
    L44:
        return null;
    L17:
        r22 = false;
        r3 = 0;
        goto L18
    L30:
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static Long m62I(String r18) {
        int r1 = r18.length();
        if (r1 == 0) goto L32;
        int r2 = 0;
        char r3 = r18.charAt(0);
        long r5 = -9223372036854775807L;
        if (AbstractC0585Nj.m1139g(r3, 48) >= 0) goto L17;
        boolean r4 = true;
        if (r1 != 1) goto L11;
        return null;
    L11:
        if (r3 != '+') goto L13;
        r4 = false;
        r2 = 1;
    L18:
        long r9 = 0;
        long r11 = -256204778801521550L;
    L19:
        if (r2 >= r1) goto L35;
        int r32 = Character.digit(r18.charAt(r2), 10);
        if (r32 < 0) goto L47;
        if (r9 < r11) goto L26;
    L30:
        long r92 = r9 * ((long) 10);
        long r13 = r32;
        if (r92 < (r5 + r13)) goto L50;
        r9 = r92 - r13;
        r2 = r2 + 1;
        goto L19
    L50:
        return null;
    L26:
        if (r11 != (-256204778801521550L)) goto L48;
        r11 = r5 / ((long) 10);
        if (r9 >= r11) goto L30;
        return null;
    L48:
        return null;
    L47:
        return null;
    L35:
        if (r4 == false) goto L39;
        return Long.valueOf(r9);
    L39:
        return Long.valueOf(-r9);
    L13:
        if (r3 != '-') goto L46;
        r5 = Long.MIN_VALUE;
        r2 = 1;
        goto L18
    L46:
        return null;
    L17:
        r4 = false;
        goto L18
    L32:
        return null;
    }
}
