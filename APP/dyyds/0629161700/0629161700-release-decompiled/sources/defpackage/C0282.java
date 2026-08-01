package defpackage;

/* JADX INFO: renamed from: ᛲᛴᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0282 extends defpackage.AbstractC1952 {
    @Override // defpackage.AbstractC1725
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo545(java.lang.Object r9) {
            r8 = this;
            java.util.TreeMap r8 = defpackage.AbstractC0725.f3444
            r8 = 0
            if (r9 != 0) goto L7
            goto L19c
        L7:
            boolean r0 = r9 instanceof java.util.Date
            if (r0 == 0) goto Le
            java.util.Date r9 = (java.util.Date) r9
            return r9
        Le:
            boolean r0 = r9 instanceof java.lang.Number
            if (r0 == 0) goto L1e
            java.util.Date r8 = new java.util.Date
            java.lang.Number r9 = (java.lang.Number) r9
            long r0 = r9.longValue()
            r8.<init>(r0)
            return r8
        L1e:
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L19d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "p.m."
            java.lang.String r1 = "pm"
            java.lang.String r9 = r9.replace(r0, r1)
            java.lang.String r0 = "a.m."
            java.lang.String r1 = "am"
            java.lang.String r9 = r9.replace(r0, r1)
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = "  -/:,.+年月日曜時分秒"
            r0.<init>(r9, r1)
            boolean r9 = r0.hasMoreTokens()
            if (r9 != 0) goto L43
            goto L19c
        L43:
            java.lang.String r9 = r0.nextToken()
            int r1 = r9.length()
            r2 = 4
            r3 = 1
            r4 = 2
            r5 = 5
            r6 = 0
            if (r1 != r2) goto Lce
            char r1 = r9.charAt(r6)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 == 0) goto Lce
            java.util.GregorianCalendar r8 = defpackage.AbstractC0725.m1628()
            int r9 = java.lang.Integer.parseInt(r9)
            r8.set(r3, r9)
            boolean r9 = r0.hasMoreTokens()
            if (r9 != 0) goto L72
            java.util.Date r8 = r8.getTime()
            return r8
        L72:
            java.lang.String r9 = r0.nextToken()
            java.lang.Integer r9 = defpackage.AbstractC0725.m1633(r9)
            int r9 = r9.intValue()
            r8.set(r4, r9)
            boolean r9 = r0.hasMoreTokens()
            if (r9 != 0) goto L8c
            java.util.Date r8 = r8.getTime()
            return r8
        L8c:
            java.lang.String r9 = r0.nextToken()
            char r1 = r9.charAt(r6)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 == 0) goto Lc9
            int r1 = r9.length()
            if (r1 != r5) goto Lbd
            char r1 = r9.charAt(r4)
            r2 = 84
            if (r1 != r2) goto Lbd
            java.lang.String r1 = r9.substring(r6, r4)
            int r1 = java.lang.Integer.parseInt(r1)
            r8.set(r5, r1)
            r1 = 3
            java.lang.String r9 = r9.substring(r1)
            java.util.Date r8 = defpackage.AbstractC0725.m1632(r9, r8, r0)
            return r8
        Lbd:
            int r9 = java.lang.Integer.parseInt(r9)
            r8.set(r5, r9)
            java.util.Date r8 = defpackage.AbstractC0725.m1631(r0, r8)
            return r8
        Lc9:
            java.util.Date r8 = r8.getTime()
            return r8
        Lce:
            java.util.TreeMap r1 = defpackage.AbstractC0725.f3445
            boolean r1 = r1.containsKey(r9)
            if (r1 == 0) goto Le2
            boolean r9 = r0.hasMoreTokens()
            if (r9 != 0) goto Lde
            goto L19c
        Lde:
            java.lang.String r9 = r0.nextToken()
        Le2:
            java.util.TreeMap r1 = defpackage.AbstractC0725.f3444
            boolean r7 = r1.containsKey(r9)
            if (r7 == 0) goto L15b
            java.util.GregorianCalendar r7 = defpackage.AbstractC0725.m1628()
            java.lang.Object r1 = r1.get(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L14f
            int r9 = r1.intValue()
            r7.set(r4, r9)
            boolean r9 = r0.hasMoreTokens()
            if (r9 != 0) goto L105
            goto L19c
        L105:
            java.lang.String r9 = r0.nextToken()
            int r9 = java.lang.Integer.parseInt(r9)
            r7.set(r5, r9)
            boolean r9 = r0.hasMoreTokens()
            if (r9 != 0) goto L118
            goto L19c
        L118:
            java.lang.String r9 = r0.nextToken()
            char r1 = r9.charAt(r6)
            boolean r1 = java.lang.Character.isLetter(r1)
            if (r1 == 0) goto L131
            boolean r9 = r0.hasMoreTokens()
            if (r9 != 0) goto L12d
            goto L19c
        L12d:
            java.lang.String r9 = r0.nextToken()
        L131:
            int r8 = r9.length()
            if (r8 != r2) goto L13f
            int r8 = defpackage.AbstractC0725.m1629(r9)
            r7.set(r3, r8)
            goto L14a
        L13f:
            int r8 = r9.length()
            if (r8 != r4) goto L14a
            java.util.Date r8 = defpackage.AbstractC0725.m1632(r9, r7, r0)
            return r8
        L14a:
            java.util.Date r8 = defpackage.AbstractC0725.m1631(r0, r7)
            return r8
        L14f:
            java.lang.String r0 = "can not parse "
            java.lang.String r1 = " as month"
            java.lang.String r9 = defpackage.AbstractC0225.m817(r0, r9, r1)
            defpackage.C2264.m3673(r9)
            return r8
        L15b:
            char r1 = r9.charAt(r6)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 == 0) goto L19c
            java.util.GregorianCalendar r1 = defpackage.AbstractC0725.m1628()
            int r9 = java.lang.Integer.parseInt(r9)
            r1.set(r5, r9)
            boolean r9 = r0.hasMoreTokens()
            if (r9 != 0) goto L177
            goto L19c
        L177:
            java.lang.String r9 = r0.nextToken()
            java.lang.Integer r9 = defpackage.AbstractC0725.m1633(r9)
            int r9 = r9.intValue()
            r1.set(r4, r9)
            boolean r9 = r0.hasMoreTokens()
            if (r9 != 0) goto L18d
            goto L19c
        L18d:
            java.lang.String r8 = r0.nextToken()
            int r8 = defpackage.AbstractC0725.m1629(r8)
            r1.set(r3, r8)
            java.util.Date r8 = defpackage.AbstractC0725.m1631(r0, r1)
        L19c:
            return r8
        L19d:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Primitive: Can not convert "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = " to int"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
    }
}
