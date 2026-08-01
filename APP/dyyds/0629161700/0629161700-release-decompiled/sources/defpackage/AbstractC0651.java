package defpackage;

/* JADX INFO: renamed from: ᛴᛴᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0651 extends defpackage.AbstractC0056 {
    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public static boolean m1483(java.lang.String r7, java.lang.String r8, boolean r9) {
            if (r9 != 0) goto L7
            boolean r7 = r7.endsWith(r8)
            return r7
        L7:
            int r9 = r7.length()
            int r0 = r8.length()
            int r3 = r9 - r0
            int r6 = r8.length()
            r2 = 1
            r5 = 0
            r1 = r7
            r4 = r8
            boolean r7 = r1.regionMatches(r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public static java.lang.String m1484(int r3, java.lang.String r4) {
            if (r3 < 0) goto L44
            if (r3 == 0) goto L41
            r0 = 1
            if (r3 == r0) goto L3c
            int r1 = r4.length()
            if (r1 == 0) goto L41
            if (r1 == r0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r4.length()
            int r2 = r2 * r3
            r1.<init>(r2)
            if (r0 > r3) goto L23
        L1b:
            r1.append(r4)
            if (r0 == r3) goto L23
            int r0 = r0 + 1
            goto L1b
        L23:
            java.lang.String r3 = r1.toString()
            return r3
        L28:
            r0 = 0
            char r4 = r4.charAt(r0)
            char[] r1 = new char[r3]
        L2f:
            if (r0 >= r3) goto L36
            r1[r0] = r4
            int r0 = r0 + 1
            goto L2f
        L36:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            return r3
        L3c:
            java.lang.String r3 = r4.toString()
            return r3
        L41:
            java.lang.String r3 = ""
            return r3
        L44:
            java.lang.String r4 = "Count 'n' must be non-negative, but was "
            r0 = 46
            defpackage.C2264.m3686(r4, r3, r0)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public static java.lang.String m1485(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r0 = 0
            int r1 = defpackage.AbstractC1347.m2504(r7, r8, r0, r0)
            if (r1 >= 0) goto L8
            return r7
        L8:
            int r2 = r8.length()
            r3 = 1
            if (r2 >= r3) goto L10
            goto L11
        L10:
            r3 = r2
        L11:
            int r4 = r7.length()
            int r4 = r4 - r2
            int r5 = r9.length()
            int r5 = r5 + r4
            if (r5 < 0) goto L44
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r5 = r0
        L23:
            r4.append(r7, r5, r1)
            r4.append(r9)
            int r5 = r1 + r2
            int r6 = r7.length()
            if (r1 >= r6) goto L38
            int r1 = r1 + r3
            int r1 = defpackage.AbstractC1347.m2504(r7, r8, r1, r0)
            if (r1 > 0) goto L23
        L38:
            int r8 = r7.length()
            r4.append(r7, r5, r8)
            java.lang.String r7 = r4.toString()
            return r7
        L44:
            java.lang.OutOfMemoryError r7 = new java.lang.OutOfMemoryError
            r7.<init>()
            throw r7
    }
}
