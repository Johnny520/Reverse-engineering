package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0260 extends xhss.AbstractC0561 {
    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public static java.lang.String m575(java.lang.String r13) {
            java.lang.String r0 = "|"
            boolean r1 = xhss.AbstractC0120.m342(r0)
            r2 = 0
            if (r1 != 0) goto Lc1
            xhss.ᛶᲈᛱᛶ r1 = new xhss.ᛶᲈᛱᛶ
            r1.<init>(r13)
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L17
            xhss.ᛵᛷᛶᛱ r1 = xhss.C0492.f1802
            goto L3d
        L17:
            java.lang.Object r3 = r1.next()
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L26
            java.util.List r1 = java.util.Collections.singletonList(r3)
            goto L3d
        L26:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r3)
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r1.next()
            r4.add(r3)
            goto L2e
        L3c:
            r1 = r4
        L3d:
            int r13 = r13.length()
            r1.size()
            int r3 = xhss.AbstractC0086.m243(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
            r5 = 0
            r6 = r5
        L53:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto Lac
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            if (r6 < 0) goto La8
            java.lang.String r7 = (java.lang.String) r7
            if (r6 == 0) goto L67
            if (r6 != r3) goto L6f
        L67:
            boolean r6 = xhss.AbstractC0120.m342(r7)
            if (r6 == 0) goto L6f
            r7 = r2
            goto La1
        L6f:
            int r6 = r7.length()
            r9 = r5
        L74:
            r10 = -1
            if (r9 >= r6) goto L8a
            char r11 = r7.charAt(r9)
            boolean r12 = java.lang.Character.isWhitespace(r11)
            if (r12 != 0) goto L87
            boolean r11 = java.lang.Character.isSpaceChar(r11)
            if (r11 == 0) goto L8b
        L87:
            int r9 = r9 + 1
            goto L74
        L8a:
            r9 = r10
        L8b:
            if (r9 != r10) goto L8f
        L8d:
            r6 = r2
            goto L9e
        L8f:
            boolean r6 = r7.startsWith(r0, r9)
            if (r6 == 0) goto L8d
            int r6 = r0.length()
            int r6 = r6 + r9
            java.lang.String r6 = r7.substring(r6)
        L9e:
            if (r6 == 0) goto La1
            r7 = r6
        La1:
            if (r7 == 0) goto La6
            r4.add(r7)
        La6:
            r6 = r8
            goto L53
        La8:
            xhss.AbstractC0086.m244()
            throw r2
        Lac:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r13)
            java.lang.String r7 = ""
            java.lang.String r9 = "..."
            java.lang.String r6 = "\n"
            r10 = 0
            r8 = r7
            xhss.AbstractC0713.m1247(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r13 = r5.toString()
            return r13
        Lc1:
            java.lang.String r13 = "marginPrefix must be non-blank string."
            xhss.C0532.m959(r13)
            return r2
    }
}
