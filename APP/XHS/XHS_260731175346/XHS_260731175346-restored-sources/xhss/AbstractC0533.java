package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛱᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0533 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final java.util.TreeMap f1946 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final java.util.HashSet f1947 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.util.TreeMap f1948 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final java.util.TreeMap f1949 = null;

    static {
            java.util.TreeMap r0 = new java.util.TreeMap
            xhss.ᛸᛲᲇᲁ r1 = new xhss.ᛸᛲᲇᲁ
            r2 = 1
            r1.<init>(r2)
            r0.<init>(r1)
            xhss.AbstractC0533.f1948 = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            xhss.ᛸᛲᲇᲁ r1 = new xhss.ᛸᛲᲇᲁ
            r1.<init>(r2)
            r0.<init>(r1)
            xhss.AbstractC0533.f1946 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            xhss.AbstractC0533.f1947 = r0
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            xhss.AbstractC0533.f1949 = r1
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
            r3 = 0
            r4 = r3
        L6a:
            if (r4 >= r1) goto L7a
            r5 = r0[r4]
            java.util.TreeMap r6 = xhss.AbstractC0533.f1949
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r5)
            r6.put(r5, r7)
            int r4 = r4 + 1
            goto L6a
        L7a:
            java.util.Locale[] r0 = java.text.DateFormatSymbols.getAvailableLocales()
            int r1 = r0.length
            r4 = r3
        L80:
            if (r4 >= r1) goto L165
            r5 = r0[r4]
            java.lang.String r6 = "ja"
            java.lang.String r7 = r5.getLanguage()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L92
            goto L161
        L92:
            java.lang.String r6 = "ko"
            java.lang.String r7 = r5.getLanguage()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto La0
            goto L161
        La0:
            java.lang.String r6 = "zh"
            java.lang.String r7 = r5.getLanguage()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lae
            goto L161
        Lae:
            java.text.DateFormatSymbols r5 = java.text.DateFormatSymbols.getInstance(r5)
            java.lang.String[] r6 = r5.getMonths()
            r7 = r3
        Lb7:
            int r8 = r6.length
            if (r7 >= r8) goto Ld1
            r8 = r6[r7]
            int r8 = r8.length()
            if (r8 != 0) goto Lc3
            goto Lce
        Lc3:
            java.util.TreeMap r8 = xhss.AbstractC0533.f1948
            r9 = r6[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            m967(r8, r9, r10)
        Lce:
            int r7 = r7 + 1
            goto Lb7
        Ld1:
            java.lang.String[] r6 = r5.getShortMonths()
            r7 = r3
        Ld6:
            int r8 = r6.length
            java.lang.String r9 = ""
            java.lang.String r10 = "."
            if (r7 >= r8) goto L111
            r8 = r6[r7]
            int r11 = r8.length()
            if (r11 != 0) goto Le6
            goto L10e
        Le6:
            int r11 = r8.length()
            int r11 = r11 - r2
            char r8 = r8.charAt(r11)
            boolean r8 = java.lang.Character.isDigit(r8)
            if (r8 == 0) goto Lf6
            goto L10e
        Lf6:
            java.util.TreeMap r8 = xhss.AbstractC0533.f1948
            r11 = r6[r7]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            m967(r8, r11, r12)
            r11 = r6[r7]
            java.lang.String r9 = r11.replace(r10, r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            m967(r8, r9, r10)
        L10e:
            int r7 = r7 + 1
            goto Ld6
        L111:
            java.lang.String[] r6 = r5.getWeekdays()
            r7 = r3
        L116:
            int r8 = r6.length
            if (r7 >= r8) goto L139
            r8 = r6[r7]
            int r11 = r8.length()
            if (r11 != 0) goto L122
            goto L136
        L122:
            java.util.TreeMap r11 = xhss.AbstractC0533.f1946
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            m967(r11, r8, r12)
            java.lang.String r8 = r8.replace(r10, r9)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            m967(r11, r8, r12)
        L136:
            int r7 = r7 + 1
            goto L116
        L139:
            java.lang.String[] r5 = r5.getShortWeekdays()
            r6 = r3
        L13e:
            int r7 = r5.length
            if (r6 >= r7) goto L161
            r7 = r5[r6]
            int r8 = r7.length()
            if (r8 != 0) goto L14a
            goto L15e
        L14a:
            java.util.TreeMap r8 = xhss.AbstractC0533.f1946
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            m967(r8, r7, r11)
            java.lang.String r7 = r7.replace(r10, r9)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            m967(r8, r7, r11)
        L15e:
            int r6 = r6 + 1
            goto L13e
        L161:
            int r4 = r4 + 1
            goto L80
        L165:
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.util.Date m966(java.lang.String r1, java.util.GregorianCalendar r2, java.util.StringTokenizer r3) {
            java.lang.String r1 = m970(r1, r2, r3)
            r0 = 11
            int r1 = java.lang.Integer.parseInt(r1)
            r2.set(r0, r1)
            boolean r1 = r3.hasMoreTokens()
            if (r1 != 0) goto L18
            java.util.Date r1 = r2.getTime()
            return r1
        L18:
            java.lang.String r1 = r3.nextToken()
            java.lang.String r1 = m970(r1, r2, r3)
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
            java.lang.String r1 = m970(r1, r2, r3)
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
            java.lang.String r1 = m970(r1, r2, r3)
            if (r1 != 0) goto L6d
            java.util.Date r1 = r2.getTime()
            return r1
        L6d:
            java.lang.String r1 = m970(r1, r2, r3)
            int r3 = r1.length()
            r0 = 4
            if (r3 != r0) goto L8b
            r3 = 0
            char r3 = r1.charAt(r3)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 == 0) goto L8b
            r3 = 1
            int r1 = m971(r1)
            r2.set(r3, r1)
        L8b:
            java.util.Date r1 = r2.getTime()
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static void m967(java.util.TreeMap r2, java.lang.String r3, java.lang.Integer r4) {
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

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static java.util.GregorianCalendar m968() {
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

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static java.util.Date m969(java.util.StringTokenizer r1, java.util.GregorianCalendar r2) {
            boolean r0 = r1.hasMoreTokens()
            if (r0 != 0) goto Lb
            java.util.Date r1 = r2.getTime()
            return r1
        Lb:
            java.lang.String r0 = r1.nextToken()
            java.util.Date r1 = m966(r0, r2, r1)
            return r1
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static java.lang.String m970(java.lang.String r2, java.util.GregorianCalendar r3, java.util.StringTokenizer r4) {
        L0:
            java.util.TreeMap r0 = xhss.AbstractC0533.f1949
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
            java.util.HashSet r0 = xhss.AbstractC0533.f1947
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

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static int m971(java.lang.String r1) {
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

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static java.lang.Integer m972(java.lang.String r2) {
            r0 = 0
            char r0 = r2.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L16
            int r2 = java.lang.Integer.parseInt(r2)
            int r2 = r2 + (-1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L16:
            java.util.TreeMap r0 = xhss.AbstractC0533.f1948
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L21
            return r0
        L21:
            java.lang.String r0 = "can not parse "
            java.lang.String r1 = " as month"
            java.lang.String r2 = xhss.AbstractC0390.m781(r0, r2, r1)
            xhss.C0532.m953(r2)
            r2 = 0
            return r2
    }
}
