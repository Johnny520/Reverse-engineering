package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b50 extends a50 {
    public static boolean B(CharSequence r8, CharSequence r9, boolean r10) {
        ip.o("<this>", r8);
        ip.o("other", r9);
        if ((r9 instanceof String) == false) goto L8;
        if (G(r8, (String) r9, 0, r10, 2) >= 0) goto L12;
    L11:
        return false;
    L12:
        return true;
    L8:
        if (F(r8, r9, 0, r8.length(), r10, false) < 0) goto L11;
        return true;
    }

    public static boolean C(String r1, String r2) {
        ip.o("<this>", r1);
        ip.o("suffix", r2);
        return r1.endsWith(r2);
    }

    public static final int D(CharSequence r1) {
        ip.o("<this>", r1);
        return r1.length() - 1;
    }

    public static final int E(CharSequence r6, String r7, int r8, boolean r9) {
        ip.o("<this>", r6);
        ip.o("string", r7);
        if (r9 == true) goto L10;
        if ((r6 instanceof String) == false) goto L10;
        return ((String) r6).indexOf(r7, r8);
    L10:
        return F(r6, r7, r8, r6.length(), r9, false);
    }

    public static final int F(CharSequence r8, CharSequence r9, int r10, int r11, boolean r12, boolean r13) {
        if (r13 == false) goto L5;
        int r132 = D(r8);
        if (r10 <= r132) goto L14;
        r10 = r132;
    L14:
        if (r11 >= 0) goto L16;
        r11 = 0;
    L16:
        fp r133 = new fp(r10, r11, -1);
    L17:
        boolean r102 = r8 instanceof String;
        int r112 = r133.c;
        int r1 = r133.b;
        int r134 = r133.a;
        if (r102 == false) goto L32;
        if ((r9 instanceof String) == false) goto L32;
        if (r112 <= 0) goto L23;
        if (r134 > r1) goto L23;
    L25:
        int r3 = r134;
    L26:
        String r5 = (String) r9;
        boolean r7 = r12;
        if (J(0, r3, r5.length(), r5, (String) r8, r7) == true) goto L28;
        if (r3 == r1) goto L41;
        r3 = r3 + r112;
        r12 = r7;
    L41:
        return -1;
    L28:
        return r3;
    L23:
        if (r112 >= 0) goto L41;
        if (r1 > r134) goto L41;
    L32:
        if (r112 <= 0) goto L34;
        if (r134 > r1) goto L34;
    L37:
        if (K(r9, r8, r134, r9.length(), r12) == true) goto L38;
        if (r134 == r1) goto L41;
        r134 = r134 + r112;
        goto L37
    L38:
        return r134;
    L34:
        if (r112 >= 0) goto L41;
        if (r1 > r134) goto L41;
    L5:
        if (r10 >= 0) goto L7;
        r10 = 0;
    L7:
        int r14 = r8.length();
        if (r11 <= r14) goto L10;
        r11 = r14;
    L10:
        r133 = new hp(r10, r11, 1);
        goto L17
    }

    public static /* synthetic */ int G(CharSequence r2, String r3, int r4, boolean r5, int r6) {
        if ((r6 & 2) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r5 = false;
    L9:
        return E(r2, r3, r4, r5);
    }

    public static boolean H(CharSequence r4) {
        ip.o("<this>", r4);
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L12;
        char r2 = r4.charAt(r1);
        if (Character.isWhitespace(r2) == true) goto L11;
        if (Character.isSpaceChar(r2) == true) goto L11;
        return false;
    L11:
        r1 = r1 + 1;
        goto L4
    L12:
        return true;
    }

    public static int I(String r1, String r2, int r3) {
        if ((r3 & 2) == 0) goto L5;
        int r32 = D(r1);
    L6:
        ip.o("<this>", r1);
        ip.o("string", r2);
        return r1.lastIndexOf(r2, r32);
    L5:
        r32 = 0;
        goto L6
    }

    public static final boolean J(int r6, int r7, int r8, String r9, String r10, boolean r11) {
        ip.o("<this>", r9);
        ip.o("other", r10);
        if (r11 == true) goto L7;
        return r9.regionMatches(r6, r10, r7, r8);
    L7:
        return r9.regionMatches(r11, r6, r10, r7, r8);
    }

    public static final boolean K(CharSequence r4, CharSequence r5, int r6, int r7, boolean r8) {
        ip.o("<this>", r4);
        ip.o("other", r5);
        if (r6 >= 0) goto L5;
    L23:
        return false;
    L5:
        if ((r4.length() - r7) < 0) goto L23;
        if (r6 > (r5.length() - r7)) goto L23;
        int r1 = 0;
    L10:
        if (r1 >= r7) goto L21;
        char r2 = r4.charAt(r1);
        char r3 = r5.charAt(r6 + r1);
        if (r2 == r3) goto L20;
        if (r8 == false) goto L23;
        char r22 = Character.toUpperCase(r2);
        char r32 = Character.toUpperCase(r3);
        if (r22 == r32) goto L20;
        if (Character.toLowerCase(r22) != Character.toLowerCase(r32)) goto L23;
    L20:
        r1 = r1 + 1;
        goto L10
    L21:
        return true;
    }

    public static String L(String r7, String r8, String r9) {
        ip.o("<this>", r7);
        ip.o("oldValue", r8);
        ip.o("newValue", r9);
        int r1 = E(r7, r8, 0, false);
        if (r1 >= 0) goto L5;
        return r7;
    L5:
        int r2 = r8.length();
        int r3 = 1;
        if (r2 < 1) goto L9;
        r3 = r2;
    L9:
        int r5 = r9.length() + (r7.length() - r2);
        if (r5 < 0) goto L19;
        StringBuilder r4 = new StringBuilder(r5);
        int r52 = 0;
    L12:
        r4.append(r7, r52, r1);
        r4.append(r9);
        r52 = r1 + r2;
        if (r1 >= r7.length()) goto L16;
        r1 = E(r7, r8, r1 + r3, false);
        if (r1 > 0) goto L12;
    L16:
        r4.append(r7, r52, r7.length());
        String r72 = r4.toString();
        ip.n("toString(...)", r72);
        return r72;
    L19:
        throw new OutOfMemoryError();
    }

    public static List M(String r5, String[] r6) {
        ip.o("<this>", r5);
        if (r6.length != 1) goto L16;
        String r2 = r6[0];
        if (r2.length() == 0) goto L16;
        int r62 = E(r5, r2, 0, false);
        if (r62 == (-1)) goto L15;
        ArrayList r3 = new ArrayList(10);
        int r4 = 0;
    L10:
        r3.add(r5.subSequence(r4, r62).toString());
        r4 = r2.length() + r62;
        r62 = E(r5, r2, r4, false);
        if (r62 != (-1)) goto L10;
        r3.add(r5.subSequence(r4, r5.length()).toString());
        return r3;
    L15:
        return ip.C(r5.toString());
    L16:
        List r63 = Arrays.asList(r6);
        ip.n("asList(...)", r63);
        m20 r64 = new m20(new gg(r5, new oh(r63)));
        ArrayList r0 = new ArrayList(cb.h0(r64));
        Iterator r65 = r64.iterator();
    L17:
        fg r22 = (fg) r65;
        if (r22.hasNext() == false) goto L20;
        hp r23 = (hp) r22.next();
        ip.o("range", r23);
        r0.add(r5.subSequence(r23.a, r23.b + 1).toString());
        goto L17
    L20:
        return r0;
    }

    public static boolean N(String r6, String r7, boolean r8) {
        ip.o("<this>", r6);
        ip.o("prefix", r7);
        if (r8 == true) goto L7;
        return r6.startsWith(r7);
    L7:
        return J(0, 0, r7.length(), r6, r7, r8);
    }

    public static String O(String r2, String r3) {
        ip.o("<this>", r2);
        ip.o("delimiter", r3);
        ip.o("missingDelimiterValue", r2);
        int r0 = G(r2, r3, 0, false, 6);
        if (r0 != (-1)) goto L5;
        return r2;
    L5:
        String r22 = r2.substring(r3.length() + r0, r2.length());
        ip.n("substring(...)", r22);
        return r22;
    }

    public static String P(String r2) {
        int r0 = r2.lastIndexOf(46, D(r2));
        if (r0 != (-1)) goto L5;
        return r2;
    L5:
        String r22 = r2.substring(r0 + 1, r2.length());
        ip.n("substring(...)", r22);
        return r22;
    }

    public static String Q(String r2, String r3) {
        ip.o("delimiter", r3);
        int r32 = G(r2, r3, 0, false, 6);
        if (r32 != (-1)) goto L5;
        return r2;
    L5:
        String r22 = r2.substring(0, r32);
        ip.n("substring(...)", r22);
        return r22;
    }

    public static Integer R(String r10) {
        ip.o("<this>", r10);
        ff.h(10);
        int r1 = r10.length();
        if (r1 == 0) goto L30;
        int r2 = 0;
        char r3 = r10.charAt(0);
        int r5 = -2147483647;
        if (r3 >= '0') goto L17;
        int r4 = 1;
        if (r1 != 1) goto L11;
        return null;
    L11:
        if (r3 != '+') goto L13;
        boolean r32 = false;
    L18:
        int r7 = -59652323;
    L19:
        if (r4 >= r1) goto L33;
        int r8 = Character.digit(r10.charAt(r4), 10);
        if (r8 < 0) goto L45;
        if (r2 >= r7) goto L28;
        if (r7 != (-59652323)) goto L46;
        r7 = r5 / 10;
        if (r2 >= r7) goto L28;
        return null;
    L46:
        return null;
    L28:
        int r22 = r2 * 10;
        if (r22 < (r5 + r8)) goto L48;
        r2 = r22 - r8;
        r4 = r4 + 1;
        goto L19
    L48:
        return null;
    L45:
        return null;
    L33:
        if (r32 == false) goto L37;
        return Integer.valueOf(r2);
    L37:
        return Integer.valueOf(-r2);
    L13:
        if (r3 != '-') goto L44;
        r5 = Integer.MIN_VALUE;
        r32 = true;
        goto L18
    L44:
        return null;
    L17:
        r32 = false;
        r4 = 0;
        goto L18
    L30:
        return null;
    }

    public static Long S(String r19) {
        ff.h(10);
        int r2 = r19.length();
        if (r2 == 0) goto L32;
        int r3 = 0;
        char r4 = r19.charAt(0);
        long r6 = -9223372036854775807L;
        if (r4 >= '0') goto L17;
        boolean r5 = true;
        if (r2 != 1) goto L11;
        return null;
    L11:
        if (r4 != '+') goto L13;
        r5 = false;
        r3 = 1;
    L18:
        long r10 = 0;
        long r12 = -256204778801521550L;
    L19:
        if (r3 >= r2) goto L35;
        int r42 = Character.digit(r19.charAt(r3), 10);
        if (r42 < 0) goto L47;
        if (r10 < r12) goto L26;
    L30:
        long r102 = r10 * ((long) 10);
        long r14 = r42;
        if (r102 < (r6 + r14)) goto L50;
        r10 = r102 - r14;
        r3 = r3 + 1;
        goto L19
    L50:
        return null;
    L26:
        if (r12 != (-256204778801521550L)) goto L48;
        r12 = r6 / ((long) 10);
        if (r10 >= r12) goto L30;
        return null;
    L48:
        return null;
    L47:
        return null;
    L35:
        if (r5 == false) goto L39;
        return Long.valueOf(r10);
    L39:
        return Long.valueOf(-r10);
    L13:
        if (r4 != '-') goto L46;
        r6 = Long.MIN_VALUE;
        r3 = 1;
        goto L18
    L46:
        return null;
    L17:
        r5 = false;
        goto L18
    L32:
        return null;
    }

    public static CharSequence T(String r7) {
        ip.o("<this>", r7);
        int r0 = r7.length() - 1;
        int r3 = 0;
        boolean r4 = false;
    L3:
        if (r3 > r0) goto L22;
        if (r4 == true) goto L6;
        int r5 = r3;
    L7:
        char r52 = r7.charAt(r5);
        if (Character.isWhitespace(r52) == false) goto L10;
    L13:
        boolean r53 = true;
    L14:
        if (r4 == false) goto L15;
        if (r53 == false) goto L22;
        r0 = r0 - 1;
        goto L3
    L15:
        if (r53 == false) goto L16;
        r3 = r3 + 1;
        goto L3
    L16:
        r4 = true;
        goto L3
    L10:
        if (Character.isSpaceChar(r52) == true) goto L13;
        r53 = false;
        goto L14
    L6:
        r5 = r0;
    L22:
        return r7.subSequence(r3, r0 + 1);
    }
}
