package a;

/* JADX INFO: loaded from: classes.dex */
public class Ae extends a.C0502ze {
    public static boolean D(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            boolean r1 = r1.endsWith(r2)
            return r1
    }

    public static final boolean E(int r6, int r7, int r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r9, r0)
            java.lang.String r0 = "other"
            a.C0193i9.e(r10, r0)
            if (r11 != 0) goto L11
            boolean r6 = r9.regionMatches(r6, r10, r7, r8)
            return r6
        L11:
            r2 = r6
            r4 = r7
            r5 = r8
            r0 = r9
            r3 = r10
            r1 = r11
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String F(java.lang.String r1, char r2, char r3) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.String r2 = "replace(...)"
            a.C0193i9.d(r1, r2)
            return r1
    }

    public static java.lang.String G(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r7, r0)
            r0 = 0
            int r1 = a.Be.L(r7, r8, r0, r0)
            if (r1 >= 0) goto Ld
            return r7
        Ld:
            int r2 = r8.length()
            r3 = 1
            if (r2 >= r3) goto L15
            goto L16
        L15:
            r3 = r2
        L16:
            int r4 = r7.length()
            int r4 = r4 - r2
            int r5 = r9.length()
            int r5 = r5 + r4
            if (r5 < 0) goto L4e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r5 = r0
        L28:
            r4.append(r7, r5, r1)
            r4.append(r9)
            int r5 = r1 + r2
            int r6 = r7.length()
            if (r1 >= r6) goto L3d
            int r1 = r1 + r3
            int r1 = a.Be.L(r7, r8, r1, r0)
            if (r1 > 0) goto L28
        L3d:
            int r8 = r7.length()
            r4.append(r7, r5, r8)
            java.lang.String r7 = r4.toString()
            java.lang.String r8 = "toString(...)"
            a.C0193i9.d(r7, r8)
            return r7
        L4e:
            java.lang.OutOfMemoryError r7 = new java.lang.OutOfMemoryError
            r7.<init>()
            throw r7
    }

    public static boolean H(java.lang.String r6, java.lang.String r7, boolean r8) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r6, r0)
            java.lang.String r0 = "prefix"
            a.C0193i9.e(r7, r0)
            if (r8 != 0) goto L11
            boolean r6 = r6.startsWith(r7)
            return r6
        L11:
            int r2 = r7.length()
            r0 = 0
            r1 = 0
            r3 = r6
            r4 = r7
            r5 = r8
            boolean r6 = E(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
