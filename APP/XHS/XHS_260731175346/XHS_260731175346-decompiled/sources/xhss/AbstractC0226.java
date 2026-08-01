package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲈᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0226 extends xhss.AbstractC0264 {
    /* JADX INFO: renamed from: ᛱᛱᛴᲀ, reason: contains not printable characters */
    public static boolean m492(java.lang.String r6, java.lang.String r7, boolean r8) {
            if (r8 != 0) goto L7
            boolean r6 = r6.startsWith(r7)
            return r6
        L7:
            int r5 = r7.length()
            r2 = 0
            r4 = 0
            if (r8 != 0) goto L14
            boolean r6 = r6.regionMatches(r2, r7, r4, r5)
            return r6
        L14:
            r0 = r6
            r3 = r7
            r1 = r8
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ᛴᲀᛸᛵ, reason: contains not printable characters */
    public static java.lang.String m493(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r0 = 0
            int r1 = xhss.AbstractC0120.m343(r7, r8, r0, r0)
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
            int r1 = xhss.AbstractC0120.m343(r7, r8, r1, r0)
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

    /* JADX INFO: renamed from: ᲁᛷᲇᲇ, reason: contains not printable characters */
    public static java.lang.String m494(java.lang.String r3, int r4) {
            if (r4 < 0) goto L44
            if (r4 == 0) goto L41
            r0 = 1
            if (r4 == r0) goto L3c
            int r1 = r3.length()
            if (r1 == 0) goto L41
            if (r1 == r0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r3.length()
            int r2 = r2 * r4
            r1.<init>(r2)
            if (r0 > r4) goto L23
        L1b:
            r1.append(r3)
            if (r0 == r4) goto L23
            int r0 = r0 + 1
            goto L1b
        L23:
            java.lang.String r3 = r1.toString()
            return r3
        L28:
            r0 = 0
            char r3 = r3.charAt(r0)
            char[] r1 = new char[r4]
        L2f:
            if (r0 >= r4) goto L36
            r1[r0] = r3
            int r0 = r0 + 1
            goto L2f
        L36:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            return r3
        L3c:
            java.lang.String r3 = r3.toString()
            return r3
        L41:
            java.lang.String r3 = ""
            return r3
        L44:
            java.lang.String r3 = "Count 'n' must be non-negative, but was "
            r0 = 46
            xhss.C0532.m954(r3, r4, r0)
            r3 = 0
            return r3
    }
}
