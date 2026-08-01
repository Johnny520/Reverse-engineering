package defpackage;

/* JADX INFO: renamed from: ᛴᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0725 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.util.TreeMap f3442 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.util.HashSet f3443 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.TreeMap f3444 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.TreeMap f3445 = null;

    static {
            java.util.TreeMap r0 = new java.util.TreeMap
            ᲇᛵᲀᲇ r1 = new ᲇᛵᲀᲇ
            r2 = 8
            r1.<init>(r2)
            r0.<init>(r1)
            defpackage.AbstractC0725.f3444 = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            ᲇᛵᲀᲇ r1 = new ᲇᛵᲀᲇ
            r1.<init>(r2)
            r0.<init>(r1)
            defpackage.AbstractC0725.f3445 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            defpackage.AbstractC0725.f3443 = r0
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            defpackage.AbstractC0725.f3442 = r1
            java.lang.String r1 = "à"
            r0.add(r1)
            java.lang.String r1 = "at"
            r0.add(r1)
            java.lang.String r1 = "MEZ"
            r0.add(r1)
            java.lang.String r1 = "Uhr"
            r0.add(r1)
            java.lang.String r1 = "h"
            r0.add(r1)
            java.lang.String r1 = "pm"
            r0.add(r1)
            java.lang.String r1 = "PM"
            r0.add(r1)
            java.lang.String r1 = "am"
            r0.add(r1)
            java.lang.String r1 = "AM"
            r0.add(r1)
            java.lang.String r1 = "min"
            r0.add(r1)
            java.lang.String r1 = "um"
            r0.add(r1)
            java.lang.String r1 = "o'clock"
            r0.add(r1)
            java.lang.String[] r0 = java.util.TimeZone.getAvailableIDs()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L6b:
            if (r3 >= r1) goto L7b
            r4 = r0[r3]
            java.util.TreeMap r5 = defpackage.AbstractC0725.f3442
            java.util.TimeZone r6 = java.util.TimeZone.getTimeZone(r4)
            r5.put(r4, r6)
            int r3 = r3 + 1
            goto L6b
        L7b:
            java.util.Locale[] r0 = java.text.DateFormatSymbols.getAvailableLocales()
            int r1 = r0.length
            r3 = r2
        L81:
            if (r3 >= r1) goto L167
            r4 = r0[r3]
            java.lang.String r5 = "ja"
            java.lang.String r6 = r4.getLanguage()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L93
            goto L163
        L93:
            java.lang.String r5 = "ko"
            java.lang.String r6 = r4.getLanguage()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto La1
            goto L163
        La1:
            java.lang.String r5 = "zh"
            java.lang.String r6 = r4.getLanguage()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Laf
            goto L163
        Laf:
            java.text.DateFormatSymbols r4 = java.text.DateFormatSymbols.getInstance(r4)
            java.lang.String[] r5 = r4.getMonths()
            r6 = r2
        Lb8:
            int r7 = r5.length
            if (r6 >= r7) goto Ld2
            r7 = r5[r6]
            int r7 = r7.length()
            if (r7 != 0) goto Lc4
            goto Lcf
        Lc4:
            java.util.TreeMap r7 = defpackage.AbstractC0725.f3444
            r8 = r5[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            m1630(r7, r8, r9)
        Lcf:
            int r6 = r6 + 1
            goto Lb8
        Ld2:
            java.lang.String[] r5 = r4.getShortMonths()
            r6 = r2
        Ld7:
            int r7 = r5.length
            java.lang.String r8 = ""
            java.lang.String r9 = "."
            if (r6 >= r7) goto L113
            r7 = r5[r6]
            int r10 = r7.length()
            if (r10 != 0) goto Le7
            goto L110
        Le7:
            int r10 = r7.length()
            int r10 = r10 + (-1)
            char r7 = r7.charAt(r10)
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 == 0) goto Lf8
            goto L110
        Lf8:
            java.util.TreeMap r7 = defpackage.AbstractC0725.f3444
            r10 = r5[r6]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            m1630(r7, r10, r11)
            r10 = r5[r6]
            java.lang.String r8 = r10.replace(r9, r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            m1630(r7, r8, r9)
        L110:
            int r6 = r6 + 1
            goto Ld7
        L113:
            java.lang.String[] r5 = r4.getWeekdays()
            r6 = r2
        L118:
            int r7 = r5.length
            if (r6 >= r7) goto L13b
            r7 = r5[r6]
            int r10 = r7.length()
            if (r10 != 0) goto L124
            goto L138
        L124:
            java.util.TreeMap r10 = defpackage.AbstractC0725.f3445
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            m1630(r10, r7, r11)
            java.lang.String r7 = r7.replace(r9, r8)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            m1630(r10, r7, r11)
        L138:
            int r6 = r6 + 1
            goto L118
        L13b:
            java.lang.String[] r4 = r4.getShortWeekdays()
            r5 = r2
        L140:
            int r6 = r4.length
            if (r5 >= r6) goto L163
            r6 = r4[r5]
            int r7 = r6.length()
            if (r7 != 0) goto L14c
            goto L160
        L14c:
            java.util.TreeMap r7 = defpackage.AbstractC0725.f3445
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            m1630(r7, r6, r10)
            java.lang.String r6 = r6.replace(r9, r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            m1630(r7, r6, r10)
        L160:
            int r5 = r5 + 1
            goto L140
        L163:
            int r3 = r3 + 1
            goto L81
        L167:
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static java.util.GregorianCalendar m1628() {
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            r5 = 0
            r6 = 0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.TimeZone r1 = r0.getTimeZone()
            if (r1 != 0) goto L16
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
        L16:
            int r1 = r1.getRawOffset()
            int r1 = -r1
            long r1 = (long) r1
            r0.setTimeInMillis(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static int m1629(java.lang.String r1) {
            int r1 = java.lang.Integer.parseInt(r1)
            r0 = 100
            if (r1 >= r0) goto L11
            r0 = 30
            if (r1 <= r0) goto Lf
            int r1 = r1 + 2000
            return r1
        Lf:
            int r1 = r1 + 1900
        L11:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m1630(java.util.TreeMap r2, java.lang.String r3, java.lang.Integer r4) {
            r2.put(r3, r4)
            java.lang.String r0 = "é"
            java.lang.String r1 = "e"
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r0 = "û"
            java.lang.String r1 = "u"
            java.lang.String r3 = r3.replace(r0, r1)
            r2.put(r3, r4)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.util.Date m1631(java.util.StringTokenizer r1, java.util.GregorianCalendar r2) {
            boolean r0 = r1.hasMoreTokens()
            if (r0 != 0) goto Lb
            java.util.Date r1 = r2.getTime()
            return r1
        Lb:
            java.lang.String r0 = r1.nextToken()
            java.util.Date r1 = m1632(r0, r2, r1)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.util.Date m1632(java.lang.String r1, java.util.GregorianCalendar r2, java.util.StringTokenizer r3) {
            java.lang.String r1 = m1634(r1, r2, r3)
            r0 = 11
            int r1 = java.lang.Integer.parseInt(r1)
            r2.set(r0, r1)
            boolean r1 = r3.hasMoreTokens()
            if (r1 != 0) goto L18
            java.util.Date r1 = r2.getTime()
            return r1
        L18:
            java.lang.String r1 = r3.nextToken()
            java.lang.String r1 = m1634(r1, r2, r3)
            if (r1 != 0) goto L27
            java.util.Date r1 = r2.getTime()
            return r1
        L27:
            r0 = 12
            int r1 = java.lang.Integer.parseInt(r1)
            r2.set(r0, r1)
            boolean r1 = r3.hasMoreTokens()
            if (r1 != 0) goto L3b
            java.util.Date r1 = r2.getTime()
            return r1
        L3b:
            java.lang.String r1 = r3.nextToken()
            java.lang.String r1 = m1634(r1, r2, r3)
            if (r1 != 0) goto L4a
            java.util.Date r1 = r2.getTime()
            return r1
        L4a:
            r0 = 13
            int r1 = java.lang.Integer.parseInt(r1)
            r2.set(r0, r1)
            boolean r1 = r3.hasMoreTokens()
            if (r1 != 0) goto L5e
            java.util.Date r1 = r2.getTime()
            return r1
        L5e:
            java.lang.String r1 = r3.nextToken()
            java.lang.String r1 = m1634(r1, r2, r3)
            if (r1 != 0) goto L6d
            java.util.Date r1 = r2.getTime()
            return r1
        L6d:
            java.lang.String r1 = m1634(r1, r2, r3)
            int r3 = r1.length()
            r0 = 4
            if (r3 != r0) goto L8b
            r3 = 0
            char r3 = r1.charAt(r3)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 == 0) goto L8b
            r3 = 1
            int r1 = m1629(r1)
            r2.set(r3, r1)
        L8b:
            java.util.Date r1 = r2.getTime()
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static java.lang.Integer m1633(java.lang.String r2) {
            r0 = 0
            char r0 = r2.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L16
            int r2 = java.lang.Integer.parseInt(r2)
            int r2 = r2 + (-1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L16:
            java.util.TreeMap r0 = defpackage.AbstractC0725.f3444
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L21
            return r0
        L21:
            java.lang.String r0 = "can not parse "
            java.lang.String r1 = " as month"
            java.lang.String r2 = defpackage.AbstractC0225.m817(r0, r2, r1)
            defpackage.C2264.m3673(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static java.lang.String m1634(java.lang.String r2, java.util.GregorianCalendar r3, java.util.StringTokenizer r4) {
        L0:
            java.util.TreeMap r0 = defpackage.AbstractC0725.f3442
            java.lang.Object r0 = r0.get(r2)
            java.util.TimeZone r0 = (java.util.TimeZone) r0
            if (r0 == 0) goto L19
            r3.setTimeZone(r0)
            boolean r2 = r4.hasMoreTokens()
            if (r2 != 0) goto L14
            goto L41
        L14:
            java.lang.String r2 = r4.nextToken()
            goto L0
        L19:
            java.util.HashSet r0 = defpackage.AbstractC0725.f3443
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L48
            java.lang.String r0 = "pm"
            boolean r0 = r2.equalsIgnoreCase(r0)
            r1 = 9
            if (r0 == 0) goto L2f
            r0 = 1
            r3.add(r1, r0)
        L2f:
            java.lang.String r0 = "am"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L3b
            r2 = 0
            r3.add(r1, r2)
        L3b:
            boolean r2 = r4.hasMoreTokens()
            if (r2 != 0) goto L43
        L41:
            r2 = 0
            return r2
        L43:
            java.lang.String r2 = r4.nextToken()
            goto L0
        L48:
            return r2
    }
}
