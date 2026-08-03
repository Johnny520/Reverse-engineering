package p000;

/* JADX INFO: loaded from: classes.dex */
public class ta extends p000.sa {
    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public static boolean m419(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r1)
            boolean r1 = r1.endsWith(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public static final boolean m420(java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r5)
            int r0 = r5.length()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L55
            ۟.g4 r0 = new ۟.g4
            int r3 = r5.length()
            int r3 = r3 + (-1)
            r0.<init>(r2, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L26
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L26
            goto L50
        L26:
            java.util.Iterator r0 = r0.iterator()
        L2a:
            r3 = r0
            ۟.f4 r3 = (p000.f4) r3
            boolean r3 = r3.f338
            if (r3 == 0) goto L50
            r3 = r0
            ۟.d4 r3 = (p000.d4) r3
            int r3 = r3.nextInt()
            char r3 = r5.charAt(r3)
            boolean r4 = java.lang.Character.isWhitespace(r3)
            if (r4 != 0) goto L4b
            boolean r3 = java.lang.Character.isSpaceChar(r3)
            if (r3 == 0) goto L49
            goto L4b
        L49:
            r3 = r2
            goto L4c
        L4b:
            r3 = r1
        L4c:
            if (r3 != 0) goto L2a
            r5 = r2
            goto L51
        L50:
            r5 = r1
        L51:
            if (r5 == 0) goto L54
            goto L55
        L54:
            r1 = r2
        L55:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public static final boolean m421(java.lang.String r6, int r7, java.lang.String r8, int r9, int r10, boolean r11) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r6)
            java.lang.String r0 = "other"
            p000.h4.m189(r0, r8)
            if (r11 != 0) goto L11
            boolean r6 = r6.regionMatches(r7, r8, r9, r10)
            goto L1b
        L11:
            r0 = r6
            r1 = r11
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
        L1b:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۠ۨ, reason: contains not printable characters */
    public static java.lang.String m422(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r7)
            java.lang.String r0 = "oldValue"
            p000.h4.m189(r0, r8)
            java.lang.String r0 = "newValue"
            p000.h4.m189(r0, r9)
            r0 = 0
            int r1 = p000.va.m440(r0, r7, r8, r0)
            if (r1 >= 0) goto L17
            goto L57
        L17:
            int r2 = r8.length()
            r3 = 1
            if (r2 >= r3) goto L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            int r4 = r7.length()
            int r4 = r4 - r2
            int r5 = r9.length()
            int r5 = r5 + r4
            if (r5 < 0) goto L58
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r5 = r0
        L32:
            r4.append(r7, r5, r1)
            r4.append(r9)
            int r5 = r1 + r2
            int r6 = r7.length()
            if (r1 >= r6) goto L47
            int r1 = r1 + r3
            int r1 = p000.va.m440(r1, r7, r8, r0)
            if (r1 > 0) goto L32
        L47:
            int r8 = r7.length()
            r4.append(r7, r5, r8)
            java.lang.String r7 = r4.toString()
            java.lang.String r8 = "toString(...)"
            p000.h4.m188(r8, r7)
        L57:
            return r7
        L58:
            java.lang.OutOfMemoryError r7 = new java.lang.OutOfMemoryError
            r7.<init>()
            throw r7
    }

    /* JADX INFO: renamed from: ۥۡ, reason: contains not printable characters */
    public static boolean m423(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r1)
            boolean r1 = r1.startsWith(r2)
            return r1
    }
}
