package a;

/* JADX INFO: loaded from: classes.dex */
public final class J9 {
    public static final a.J9 b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.L9 f137a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final java.util.Locale[] f138a = null;

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
                a.J9.a.f138a = r0
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
                java.util.Locale[] r0 = a.J9.a.f138a
                int r2 = r0.length
                r3 = r1
            L1b:
                if (r3 >= r2) goto L29
                r4 = r0[r3]
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L26
                return r1
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
                return r1
            L36:
                int r3 = r3 + 1
                goto L2b
            L39:
                android.icu.util.ULocale r0 = a.L8.b(r5)
                android.icu.util.ULocale r0 = a.L8.a(r0)
                java.lang.String r0 = a.L8.c(r0)
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
                android.icu.util.ULocale r5 = a.L8.b(r6)
                android.icu.util.ULocale r5 = a.L8.a(r5)
                java.lang.String r5 = a.L8.c(r5)
                boolean r5 = r0.equals(r5)
                return r5
        }
    }

    public static class b {
        public static android.os.LocaleList a(java.util.Locale... r1) {
                android.os.LocaleList r0 = new android.os.LocaleList
                r0.<init>(r1)
                return r0
        }

        public static android.os.LocaleList b() {
                android.os.LocaleList r0 = android.os.LocaleList.getAdjustedDefault()
                return r0
        }

        public static android.os.LocaleList c() {
                android.os.LocaleList r0 = android.os.LocaleList.getDefault()
                return r0
        }
    }

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            android.os.LocaleList r0 = a.J9.b.a(r0)
            a.J9 r1 = new a.J9
            a.L9 r2 = new a.L9
            r2.<init>(r0)
            r1.<init>(r2)
            a.J9.b = r1
            return
    }

    public J9(a.L9 r1) {
            r0 = this;
            r0.<init>()
            r0.f137a = r1
            return
    }

    public static a.J9 a(java.lang.String r4) {
            if (r4 == 0) goto L30
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L30
        L9:
            java.lang.String r0 = ","
            r1 = -1
            java.lang.String[] r4 = r4.split(r0, r1)
            int r0 = r4.length
            java.util.Locale[] r1 = new java.util.Locale[r0]
            r2 = 0
        L14:
            if (r2 >= r0) goto L21
            r3 = r4[r2]
            java.util.Locale r3 = a.J9.a.a(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L14
        L21:
            android.os.LocaleList r4 = a.J9.b.a(r1)
            a.J9 r0 = new a.J9
            a.L9 r1 = new a.L9
            r1.<init>(r4)
            r0.<init>(r1)
            return r0
        L30:
            a.J9 r4 = a.J9.b
            return r4
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof a.J9
            if (r0 == 0) goto L12
            a.J9 r2 = (a.J9) r2
            a.L9 r2 = r2.f137a
            a.L9 r0 = r1.f137a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            a.L9 r0 = r1.f137a
            android.os.LocaleList r0 = r0.f163a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            a.L9 r0 = r1.f137a
            android.os.LocaleList r0 = r0.f163a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
