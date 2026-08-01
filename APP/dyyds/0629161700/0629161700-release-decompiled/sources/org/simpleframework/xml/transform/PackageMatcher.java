package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class PackageMatcher implements org.simpleframework.xml.transform.Matcher {
    public PackageMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    private org.simpleframework.xml.transform.Transform matchEnum(java.lang.Class r1) {
            r0 = this;
            java.lang.Class r0 = r1.getSuperclass()
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEnum()
            if (r0 == 0) goto L12
            org.simpleframework.xml.transform.EnumTransform r0 = new org.simpleframework.xml.transform.EnumTransform
            r0.<init>(r1)
            return r0
        L12:
            boolean r0 = r1.isEnum()
            if (r0 == 0) goto L1e
            org.simpleframework.xml.transform.EnumTransform r0 = new org.simpleframework.xml.transform.EnumTransform
            r0.<init>(r1)
            return r0
        L1e:
            r0 = 0
            return r0
    }

    private org.simpleframework.xml.transform.Transform matchFile(java.lang.Class r1) {
            r0 = this;
            java.lang.Class<java.io.File> r0 = java.io.File.class
            if (r1 != r0) goto La
            org.simpleframework.xml.transform.FileTransform r0 = new org.simpleframework.xml.transform.FileTransform
            r0.<init>()
            return r0
        La:
            r0 = 0
            return r0
    }

    private org.simpleframework.xml.transform.Transform matchLanguage(java.lang.Class r1) {
            r0 = this;
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto La
            org.simpleframework.xml.transform.BooleanTransform r0 = new org.simpleframework.xml.transform.BooleanTransform
            r0.<init>()
            return r0
        La:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L14
            org.simpleframework.xml.transform.IntegerTransform r0 = new org.simpleframework.xml.transform.IntegerTransform
            r0.<init>()
            return r0
        L14:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1e
            org.simpleframework.xml.transform.LongTransform r0 = new org.simpleframework.xml.transform.LongTransform
            r0.<init>()
            return r0
        L1e:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r1 != r0) goto L28
            org.simpleframework.xml.transform.DoubleTransform r0 = new org.simpleframework.xml.transform.DoubleTransform
            r0.<init>()
            return r0
        L28:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r1 != r0) goto L32
            org.simpleframework.xml.transform.FloatTransform r0 = new org.simpleframework.xml.transform.FloatTransform
            r0.<init>()
            return r0
        L32:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r1 != r0) goto L3c
            org.simpleframework.xml.transform.ShortTransform r0 = new org.simpleframework.xml.transform.ShortTransform
            r0.<init>()
            return r0
        L3c:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r1 != r0) goto L46
            org.simpleframework.xml.transform.ByteTransform r0 = new org.simpleframework.xml.transform.ByteTransform
            r0.<init>()
            return r0
        L46:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r1 != r0) goto L50
            org.simpleframework.xml.transform.CharacterTransform r0 = new org.simpleframework.xml.transform.CharacterTransform
            r0.<init>()
            return r0
        L50:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L5a
            org.simpleframework.xml.transform.StringTransform r0 = new org.simpleframework.xml.transform.StringTransform
            r0.<init>()
            return r0
        L5a:
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            if (r1 != r0) goto L64
            org.simpleframework.xml.transform.ClassTransform r0 = new org.simpleframework.xml.transform.ClassTransform
            r0.<init>()
            return r0
        L64:
            r0 = 0
            return r0
    }

    private org.simpleframework.xml.transform.Transform matchMath(java.lang.Class r1) {
            r0 = this;
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            if (r1 != r0) goto La
            org.simpleframework.xml.transform.BigDecimalTransform r0 = new org.simpleframework.xml.transform.BigDecimalTransform
            r0.<init>()
            return r0
        La:
            java.lang.Class<java.math.BigInteger> r0 = java.math.BigInteger.class
            if (r1 != r0) goto L14
            org.simpleframework.xml.transform.BigIntegerTransform r0 = new org.simpleframework.xml.transform.BigIntegerTransform
            r0.<init>()
            return r0
        L14:
            r0 = 0
            return r0
    }

    private org.simpleframework.xml.transform.Transform matchSQL(java.lang.Class r1) {
            r0 = this;
            java.lang.Class<java.sql.Time> r0 = java.sql.Time.class
            if (r1 != r0) goto La
            org.simpleframework.xml.transform.DateTransform r0 = new org.simpleframework.xml.transform.DateTransform
            r0.<init>(r1)
            return r0
        La:
            java.lang.Class<java.sql.Date> r0 = java.sql.Date.class
            if (r1 != r0) goto L14
            org.simpleframework.xml.transform.DateTransform r0 = new org.simpleframework.xml.transform.DateTransform
            r0.<init>(r1)
            return r0
        L14:
            java.lang.Class<java.sql.Timestamp> r0 = java.sql.Timestamp.class
            if (r1 != r0) goto L1e
            org.simpleframework.xml.transform.DateTransform r0 = new org.simpleframework.xml.transform.DateTransform
            r0.<init>(r1)
            return r0
        L1e:
            r0 = 0
            return r0
    }

    private org.simpleframework.xml.transform.Transform matchURL(java.lang.Class r1) {
            r0 = this;
            java.lang.Class<java.net.URL> r0 = java.net.URL.class
            if (r1 != r0) goto La
            org.simpleframework.xml.transform.URLTransform r0 = new org.simpleframework.xml.transform.URLTransform
            r0.<init>()
            return r0
        La:
            r0 = 0
            return r0
    }

    private org.simpleframework.xml.transform.Transform matchUtility(java.lang.Class r1) {
            r0 = this;
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r1 != r0) goto La
            org.simpleframework.xml.transform.DateTransform r0 = new org.simpleframework.xml.transform.DateTransform
            r0.<init>(r1)
            return r0
        La:
            java.lang.Class<java.util.Locale> r0 = java.util.Locale.class
            if (r1 != r0) goto L14
            org.simpleframework.xml.transform.LocaleTransform r0 = new org.simpleframework.xml.transform.LocaleTransform
            r0.<init>()
            return r0
        L14:
            java.lang.Class<java.util.Currency> r0 = java.util.Currency.class
            if (r1 != r0) goto L1e
            org.simpleframework.xml.transform.CurrencyTransform r0 = new org.simpleframework.xml.transform.CurrencyTransform
            r0.<init>()
            return r0
        L1e:
            java.lang.Class<java.util.GregorianCalendar> r0 = java.util.GregorianCalendar.class
            if (r1 != r0) goto L28
            org.simpleframework.xml.transform.GregorianCalendarTransform r0 = new org.simpleframework.xml.transform.GregorianCalendarTransform
            r0.<init>()
            return r0
        L28:
            java.lang.Class<java.util.TimeZone> r0 = java.util.TimeZone.class
            if (r1 != r0) goto L32
            org.simpleframework.xml.transform.TimeZoneTransform r0 = new org.simpleframework.xml.transform.TimeZoneTransform
            r0.<init>()
            return r0
        L32:
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r0 = java.util.concurrent.atomic.AtomicInteger.class
            if (r1 != r0) goto L3c
            org.simpleframework.xml.transform.AtomicIntegerTransform r0 = new org.simpleframework.xml.transform.AtomicIntegerTransform
            r0.<init>()
            return r0
        L3c:
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r0 = java.util.concurrent.atomic.AtomicLong.class
            if (r1 != r0) goto L46
            org.simpleframework.xml.transform.AtomicLongTransform r0 = new org.simpleframework.xml.transform.AtomicLongTransform
            r0.<init>()
            return r0
        L46:
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public org.simpleframework.xml.transform.Transform match(java.lang.Class r3) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "java.lang"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L11
            org.simpleframework.xml.transform.Transform r2 = r2.matchLanguage(r3)
            return r2
        L11:
            java.lang.String r1 = "java.util"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L1e
            org.simpleframework.xml.transform.Transform r2 = r2.matchUtility(r3)
            return r2
        L1e:
            java.lang.String r1 = "java.net"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L2b
            org.simpleframework.xml.transform.Transform r2 = r2.matchURL(r3)
            return r2
        L2b:
            java.lang.String r1 = "java.io"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L38
            org.simpleframework.xml.transform.Transform r2 = r2.matchFile(r3)
            return r2
        L38:
            java.lang.String r1 = "java.sql"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L45
            org.simpleframework.xml.transform.Transform r2 = r2.matchSQL(r3)
            return r2
        L45:
            java.lang.String r1 = "java.math"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L52
            org.simpleframework.xml.transform.Transform r2 = r2.matchMath(r3)
            return r2
        L52:
            org.simpleframework.xml.transform.Transform r2 = r2.matchEnum(r3)
            return r2
    }
}
