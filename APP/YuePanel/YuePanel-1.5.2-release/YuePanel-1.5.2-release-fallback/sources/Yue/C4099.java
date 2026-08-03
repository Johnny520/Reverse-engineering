package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4099 {

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C4100 {
        public C4100() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.CharSequence m16036(android.content.Context r5, android.telephony.mbms.ServiceInfo r6) {
                java.util.Set r0 = r6.getNamedContentLocales()
                boolean r1 = r0.isEmpty()
                r2 = 0
                if (r1 == 0) goto Lc
                return r2
            Lc:
                int r0 = r0.size()
                java.lang.String[] r0 = new java.lang.String[r0]
                java.util.Set r1 = r6.getNamedContentLocales()
                java.util.Iterator r1 = r1.iterator()
                r3 = 0
            L1b:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L30
                java.lang.Object r4 = r1.next()
                java.util.Locale r4 = (java.util.Locale) r4
                java.lang.String r4 = r4.toLanguageTag()
                r0[r3] = r4
                int r3 = r3 + 1
                goto L1b
            L30:
                android.content.res.Resources r5 = r5.getResources()
                android.content.res.Configuration r5 = r5.getConfiguration()
                android.os.LocaleList r5 = r5.getLocales()
                java.util.Locale r5 = r5.getFirstMatch(r0)
                if (r5 != 0) goto L43
                goto L47
            L43:
                java.lang.CharSequence r2 = r6.getNameForLocale(r5)
            L47:
                return r2
        }
    }

    public C4099() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.CharSequence m16035(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.telephony.mbms.ServiceInfo r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.CharSequence r2 = Yue.C4099.C4100.m16036(r2, r3)
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
