package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qr {
    public static final java.util.Locale[] a = null;

    static {
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "en"
            java.lang.String r2 = "XA"
            r0.<init>(r1, r2)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "ar"
            java.lang.String r3 = "XB"
            r1.<init>(r2, r3)
            java.util.Locale[] r0 = new java.util.Locale[]{r0, r1}
            defpackage.qr.a = r0
            return
    }

    public static java.util.Locale a(java.lang.String r0) {
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            return r0
    }

    public static boolean b(java.util.Locale r5, java.util.Locale r6) {
            boolean r0 = r5.equals(r6)
            if (r0 == 0) goto L7
            goto L61
        L7:
            java.lang.String r0 = r5.getLanguage()
            java.lang.String r1 = r6.getLanguage()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L17
            goto L60
        L17:
            java.util.Locale[] r0 = defpackage.qr.a
            int r2 = r0.length
            r3 = r1
        L1b:
            if (r3 >= r2) goto L29
            r4 = r0[r3]
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L26
            goto L60
        L26:
            int r3 = r3 + 1
            goto L1b
        L29:
            int r2 = r0.length
            r3 = r1
        L2b:
            if (r3 >= r2) goto L39
            r4 = r0[r3]
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L36
            goto L60
        L36:
            int r3 = r3 + 1
            goto L2b
        L39:
            android.icu.util.ULocale r0 = defpackage.qo.b(r5)
            android.icu.util.ULocale r0 = defpackage.qo.a(r0)
            java.lang.String r0 = defpackage.qo.c(r0)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L63
            java.lang.String r5 = r5.getCountry()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L61
            java.lang.String r6 = r6.getCountry()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            goto L61
        L60:
            return r1
        L61:
            r5 = 1
            return r5
        L63:
            android.icu.util.ULocale r5 = defpackage.qo.b(r6)
            android.icu.util.ULocale r5 = defpackage.qo.a(r5)
            java.lang.String r5 = defpackage.qo.c(r5)
            boolean r5 = r0.equals(r5)
            return r5
    }
}
