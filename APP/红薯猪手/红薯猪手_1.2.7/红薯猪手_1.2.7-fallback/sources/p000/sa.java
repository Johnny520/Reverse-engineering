package p000;

/* JADX INFO: loaded from: classes.dex */
public class sa extends p000.ra {
    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static final java.lang.Double m406(java.lang.String r3) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r3)
            r0 = 0
            ۟.t8 r1 = p000.u9.f1082     // Catch: java.lang.NumberFormatException -> L20
            r1.getClass()     // Catch: java.lang.NumberFormatException -> L20
            java.util.regex.Pattern r1 = r1.f1050     // Catch: java.lang.NumberFormatException -> L20
            java.util.regex.Matcher r1 = r1.matcher(r3)     // Catch: java.lang.NumberFormatException -> L20
            boolean r1 = r1.matches()     // Catch: java.lang.NumberFormatException -> L20
            if (r1 == 0) goto L20
            double r1 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.NumberFormatException -> L20
            java.lang.Double r3 = java.lang.Double.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L20
            r0 = r3
        L20:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public static final java.lang.Integer m407(java.lang.String r11) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r11)
            ۟.g4 r0 = new ۟.g4
            r1 = 2
            r2 = 36
            r0.<init>(r1, r2)
            r3 = 0
            int r0 = r0.f300
            r4 = 1
            r5 = 10
            if (r5 > r0) goto L17
            r0 = r4
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L7e
            int r0 = r11.length()
            r1 = 0
            if (r0 != 0) goto L23
            goto L7d
        L23:
            char r2 = r11.charAt(r3)
            r6 = 48
            if (r2 >= r6) goto L2d
            r6 = -1
            goto L32
        L2d:
            if (r2 != r6) goto L31
            r6 = r3
            goto L32
        L31:
            r6 = r4
        L32:
            r7 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r6 >= 0) goto L49
            if (r0 != r4) goto L3a
            goto L7d
        L3a:
            r6 = 45
            if (r2 != r6) goto L42
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4
            goto L4b
        L42:
            r6 = 43
            if (r2 != r6) goto L7d
            r2 = r4
            r4 = r3
            goto L4b
        L49:
            r2 = r3
            r4 = r2
        L4b:
            r6 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r8 = r6
        L4f:
            if (r2 >= r0) goto L70
            char r9 = r11.charAt(r2)
            int r9 = java.lang.Character.digit(r9, r5)
            if (r9 >= 0) goto L5c
            goto L7d
        L5c:
            if (r3 >= r8) goto L65
            if (r8 != r6) goto L7d
            int r8 = r7 / 10
            if (r3 >= r8) goto L65
            goto L7d
        L65:
            int r3 = r3 * 10
            int r10 = r7 + r9
            if (r3 >= r10) goto L6c
            goto L7d
        L6c:
            int r3 = r3 - r9
            int r2 = r2 + 1
            goto L4f
        L70:
            if (r4 == 0) goto L77
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            goto L7c
        L77:
            int r11 = -r3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
        L7c:
            r1 = r11
        L7d:
            return r1
        L7e:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "radix "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = " was not in valid range "
            r0.append(r3)
            ۟.g4 r3 = new ۟.g4
            r3.<init>(r1, r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
    }
}
