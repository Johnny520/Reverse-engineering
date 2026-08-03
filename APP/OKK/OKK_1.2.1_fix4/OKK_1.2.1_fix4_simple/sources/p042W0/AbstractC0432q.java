package p042W0;

import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: W0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0432q extends AbstractC0431p {
    /* JADX INFO: renamed from: A0 */
    public static Integer m1026A0(String r11) {
        AbstractC0307g.m703e(r11, "<this>");
        AbstractC0358S.m890i(10);
        int r1 = r11.length();
        if (r1 == 0) goto L47;
        int r3 = 0;
        char r4 = r11.charAt(0);
        int r5 = 1;
        if (r4 >= '0') goto L8;
        byte r6 = -1;
    L11:
        int r7 = -2147483647;
        if (r6 >= 0) goto L21;
        if (r1 != 1) goto L16;
        return null;
    L16:
        if (r4 != '-') goto L19;
        r7 = Integer.MIN_VALUE;
        boolean r42 = true;
    L22:
        int r8 = -59652323;
    L23:
        if (r5 >= r1) goto L36;
        int r9 = Character.digit(r11.charAt(r5), 10);
        if (r9 < 0) goto L50;
        if (r3 >= r8) goto L32;
        if (r8 != (-59652323)) goto L51;
        r8 = r7 / 10;
        if (r3 >= r8) goto L32;
        return null;
    L51:
        return null;
    L32:
        int r32 = r3 * 10;
        if (r32 < (r7 + r9)) goto L49;
        r3 = r32 - r9;
        r5 = r5 + 1;
        goto L23
    L49:
        return null;
    L50:
        return null;
    L36:
        if (r42 == false) goto L39;
        Integer r112 = Integer.valueOf(r3);
    L46:
        return r112;
    L39:
        r112 = Integer.valueOf(-r3);
        goto L46
    L19:
        if (r4 != '+') goto L40;
        r42 = false;
        goto L22
    L40:
        return null;
    L21:
        r42 = false;
        r5 = 0;
        goto L22
    L8:
        if (r4 != '0') goto L10;
        r6 = 0;
        goto L11
    L10:
        r6 = 1;
        goto L11
    L47:
        return null;
    }

    /* JADX INFO: renamed from: B0 */
    public static Long m1027B0(String r19) {
        AbstractC0358S.m890i(10);
        int r2 = r19.length();
        if (r2 == 0) goto L49;
        int r4 = 0;
        char r5 = r19.charAt(0);
        boolean r6 = true;
        if (r5 >= '0') goto L8;
        byte r7 = -1;
    L11:
        long r8 = -9223372036854775807L;
        if (r7 >= 0) goto L21;
        if (r2 != 1) goto L16;
        return null;
    L16:
        if (r5 != '-') goto L19;
        r8 = Long.MIN_VALUE;
        r4 = 1;
    L22:
        long r10 = -256204778801521550L;
        long r12 = 0;
        long r14 = -256204778801521550L;
    L23:
        if (r4 >= r2) goto L38;
        int r52 = Character.digit(r19.charAt(r4), 10);
        if (r52 < 0) goto L53;
        if (r12 < r14) goto L30;
    L34:
        long r122 = r12 * ((long) 10);
        long r102 = r52;
        if (r122 < (r8 + r102)) goto L52;
        r12 = r122 - r102;
        r4 = r4 + 1;
        r10 = -256204778801521550L;
        goto L23
    L52:
        return null;
    L30:
        if (r14 != r10) goto L54;
        r14 = r8 / ((long) 10);
        if (r12 >= r14) goto L34;
        return null;
    L54:
        return null;
    L53:
        return null;
    L38:
        if (r6 == false) goto L41;
        Long r02 = Long.valueOf(r12);
    L48:
        return r02;
    L41:
        r02 = Long.valueOf(-r12);
        goto L48
    L19:
        if (r5 != '+') goto L42;
        r6 = false;
        r4 = 1;
        goto L22
    L42:
        return null;
    L21:
        r6 = false;
        goto L22
    L8:
        if (r5 != '0') goto L10;
        r7 = 0;
        goto L11
    L10:
        r7 = 1;
        goto L11
    L49:
        return null;
    }
}
