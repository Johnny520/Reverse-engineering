package a;

/* JADX INFO: renamed from: a.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0502ze extends a.C0484ye {
    public static java.lang.Integer C(java.lang.String r9) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r9, r0)
            int r0 = r9.length()
            if (r0 != 0) goto Lc
            goto L58
        Lc:
            r1 = 0
            char r2 = r9.charAt(r1)
            r3 = 1
            r4 = 48
            if (r2 >= r4) goto L18
            r4 = -1
            goto L1d
        L18:
            if (r2 != r4) goto L1c
            r4 = r1
            goto L1d
        L1c:
            r4 = r3
        L1d:
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r4 >= 0) goto L34
            if (r0 != r3) goto L25
            goto L58
        L25:
            r4 = 43
            if (r2 == r4) goto L32
            r4 = 45
            if (r2 == r4) goto L2e
            goto L58
        L2e:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r3
            goto L36
        L32:
            r2 = r1
            goto L36
        L34:
            r2 = r1
            r3 = r2
        L36:
            r4 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r6 = r4
        L3a:
            if (r3 >= r0) goto L5e
            char r7 = r9.charAt(r3)
            r8 = 10
            int r7 = java.lang.Character.digit(r7, r8)
            if (r7 >= 0) goto L49
            goto L58
        L49:
            if (r1 >= r6) goto L52
            if (r6 != r4) goto L58
            int r6 = r5 / 10
            if (r1 >= r6) goto L52
            goto L58
        L52:
            int r1 = r1 * 10
            int r8 = r5 + r7
            if (r1 >= r8) goto L5a
        L58:
            r9 = 0
            return r9
        L5a:
            int r1 = r1 - r7
            int r3 = r3 + 1
            goto L3a
        L5e:
            if (r2 == 0) goto L65
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            return r9
        L65:
            int r9 = -r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            return r9
    }
}
