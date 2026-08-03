package p000;

/* JADX INFO: loaded from: classes.dex */
public class va extends p000.ta {
    /* JADX INFO: renamed from: ۥۡ۟, reason: contains not printable characters */
    public static boolean m438(java.lang.CharSequence r3, java.lang.String r4) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r3)
            java.lang.String r0 = "other"
            p000.h4.m189(r0, r4)
            r0 = 1
            r1 = 2
            r2 = 0
            int r3 = m441(r3, r4, r2, r2, r1)
            if (r3 < 0) goto L14
            goto L15
        L14:
            r0 = r2
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public static final int m439(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r1)
            int r1 = r1.length()
            int r1 = r1 + (-1)
            return r1
    }

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public static final int m440(int r9, java.lang.CharSequence r10, java.lang.String r11, boolean r12) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r10)
            java.lang.String r0 = "string"
            p000.h4.m189(r0, r11)
            if (r12 != 0) goto L18
            boolean r0 = r10 instanceof java.lang.String
            if (r0 != 0) goto L11
            goto L18
        L11:
            java.lang.String r10 = (java.lang.String) r10
            int r9 = r10.indexOf(r11, r9)
            goto L6f
        L18:
            int r0 = r10.length()
            r1 = -1
            r2 = 0
            ۟.g4 r3 = new ۟.g4
            if (r9 >= 0) goto L23
            r9 = r2
        L23:
            int r2 = r10.length()
            if (r0 <= r2) goto L2a
            r0 = r2
        L2a:
            r3.<init>(r9, r0)
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L53
            int r0 = r3.f300
            int r2 = r3.f301
            if (r2 <= 0) goto L39
            if (r9 <= r0) goto L3d
        L39:
            if (r2 >= 0) goto L6e
            if (r0 > r9) goto L6e
        L3d:
            r4 = 0
            r5 = r10
            java.lang.String r5 = (java.lang.String) r5
            int r7 = r11.length()
            r3 = r11
            r6 = r9
            r8 = r12
            boolean r3 = p000.ta.m421(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L4f
            goto L6f
        L4f:
            if (r9 == r0) goto L6e
            int r9 = r9 + r2
            goto L3d
        L53:
            int r0 = r3.f300
            int r2 = r3.f301
            if (r2 <= 0) goto L5b
            if (r9 <= r0) goto L5f
        L5b:
            if (r2 >= 0) goto L6e
            if (r0 > r9) goto L6e
        L5f:
            int r3 = r11.length()
            boolean r3 = m442(r11, r10, r9, r3, r12)
            if (r3 == 0) goto L6a
            goto L6f
        L6a:
            if (r9 == r0) goto L6e
            int r9 = r9 + r2
            goto L5f
        L6e:
            r9 = r1
        L6f:
            return r9
    }

    /* JADX INFO: renamed from: ۥۡۢ, reason: contains not printable characters */
    public static /* synthetic */ int m441(java.lang.CharSequence r2, java.lang.String r3, int r4, boolean r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = r1
        Lb:
            int r2 = m440(r4, r2, r3, r5)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public static final boolean m442(java.lang.CharSequence r5, java.lang.CharSequence r6, int r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r5)
            java.lang.String r0 = "other"
            p000.h4.m189(r0, r6)
            r0 = 0
            if (r7 < 0) goto L4f
            int r1 = r5.length()
            int r1 = r1 - r8
            if (r1 < 0) goto L4f
            int r1 = r6.length()
            int r1 = r1 - r8
            if (r7 <= r1) goto L1c
            goto L4f
        L1c:
            r1 = r0
        L1d:
            r2 = 1
            if (r1 >= r8) goto L4e
            int r3 = r0 + r1
            char r3 = r5.charAt(r3)
            int r4 = r7 + r1
            char r4 = r6.charAt(r4)
            if (r3 != r4) goto L2f
            goto L48
        L2f:
            if (r9 != 0) goto L32
            goto L47
        L32:
            char r3 = java.lang.Character.toUpperCase(r3)
            char r4 = java.lang.Character.toUpperCase(r4)
            if (r3 == r4) goto L48
            char r3 = java.lang.Character.toLowerCase(r3)
            char r4 = java.lang.Character.toLowerCase(r4)
            if (r3 != r4) goto L47
            goto L48
        L47:
            r2 = r0
        L48:
            if (r2 != 0) goto L4b
            return r0
        L4b:
            int r1 = r1 + 1
            goto L1d
        L4e:
            return r2
        L4f:
            return r0
    }

    /* JADX INFO: renamed from: ۥۡۤ, reason: contains not printable characters */
    public static final void m443(int r2) {
            if (r2 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Limit must be non-negative, but was "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۡۥ, reason: contains not printable characters */
    public static java.util.List m444(java.lang.CharSequence r5, java.lang.String[] r6) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r5)
            int r0 = r6.length
            r1 = 1
            r2 = 10
            r3 = 0
            if (r0 != r1) goto L58
            r0 = r6[r3]
            int r4 = r0.length()
            if (r4 != 0) goto L16
            r4 = r1
            goto L17
        L16:
            r4 = r3
        L17:
            if (r4 != 0) goto L58
            m443(r3)
            int r6 = m440(r3, r5, r0, r3)
            r1 = -1
            if (r6 == r1) goto L4f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r2 = r3
        L29:
            java.lang.CharSequence r2 = r5.subSequence(r2, r6)
            java.lang.String r2 = r2.toString()
            r4.add(r2)
            int r2 = r0.length()
            int r2 = r2 + r6
            int r6 = m440(r2, r5, r0, r3)
            if (r6 != r1) goto L29
            int r6 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r2, r6)
            java.lang.String r5 = r5.toString()
            r4.add(r5)
            goto Lb9
        L4f:
            java.lang.String r5 = r5.toString()
            java.util.List r4 = p000.jb.m214(r5)
            goto Lb9
        L58:
            m443(r3)
            java.util.List r6 = java.util.Arrays.asList(r6)
            java.lang.String r0 = "asList(...)"
            p000.h4.m188(r0, r6)
            ۟.k1 r0 = new ۟.k1
            ۟.ua r4 = new ۟.ua
            r4.<init>(r6, r3)
            r0.<init>(r5, r3, r3, r4)
            ۟.aa r6 = new ۟.aa
            r6.<init>(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L80
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            int r2 = r0.size()
        L80:
            r4.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L87:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r0 = r6.next()
            ۟.g4 r0 = (p000.g4) r0
            java.lang.String r2 = "range"
            p000.h4.m189(r2, r0)
            int r2 = r0.f299
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r2.intValue()
            int r0 = r0.f300
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            int r0 = r0 + r1
            java.lang.CharSequence r0 = r5.subSequence(r2, r0)
            java.lang.String r0 = r0.toString()
            r4.add(r0)
            goto L87
        Lb9:
            return r4
    }

    /* JADX INFO: renamed from: ۥۡۦ, reason: contains not printable characters */
    public static final java.lang.CharSequence m445(java.lang.CharSequence r7) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r7)
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            if (r3 > r0) goto L38
            if (r4 != 0) goto L14
            r5 = r3
            goto L15
        L14:
            r5 = r0
        L15:
            char r5 = r7.charAt(r5)
            boolean r6 = java.lang.Character.isWhitespace(r5)
            if (r6 != 0) goto L28
            boolean r5 = java.lang.Character.isSpaceChar(r5)
            if (r5 == 0) goto L26
            goto L28
        L26:
            r5 = r2
            goto L29
        L28:
            r5 = r1
        L29:
            if (r4 != 0) goto L32
            if (r5 != 0) goto L2f
            r4 = r1
            goto Le
        L2f:
            int r3 = r3 + 1
            goto Le
        L32:
            if (r5 != 0) goto L35
            goto L38
        L35:
            int r0 = r0 + (-1)
            goto Le
        L38:
            int r0 = r0 + r1
            java.lang.CharSequence r7 = r7.subSequence(r3, r0)
            return r7
    }
}
