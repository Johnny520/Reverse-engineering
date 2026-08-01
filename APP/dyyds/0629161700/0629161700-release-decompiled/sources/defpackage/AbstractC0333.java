package defpackage;

/* JADX INFO: renamed from: ᛲᛸᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0333 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.util.List f1718 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.String[] f1719 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final javax.xml.parsers.DocumentBuilderFactory f1720 = null;

    static {
            java.lang.String r5 = "EEEEEE, dd-MMM-yy HH:mm:ss zzz"
            java.lang.String r6 = "EEE MMMM d HH:mm:ss yyyy"
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss'Z'"
            java.lang.String r1 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ssZ"
            java.lang.String r4 = "EEE MMM dd HH:mm:ss zzz yyyy"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            defpackage.AbstractC0333.f1719 = r0
            javax.xml.parsers.DocumentBuilderFactory r1 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            defpackage.AbstractC0333.f1720 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0.length
            r1.<init>(r0)
            r0 = 0
        L21:
            java.lang.String[] r2 = defpackage.AbstractC0333.f1719
            int r2 = r2.length
            if (r0 >= r2) goto L31
            java.lang.ThreadLocal r2 = new java.lang.ThreadLocal
            r2.<init>()
            r1.add(r2)
            int r0 = r0 + 1
            goto L21
        L31:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            defpackage.AbstractC0333.f1718 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C1081 m1002(org.w3c.dom.Element r3) {
            java.lang.String r0 = r3.getNamespaceURI()
            if (r0 != 0) goto L14
            ᛶᛵᲁᲇ r0 = new ᛶᛵᲁᲇ
            java.lang.String r3 = r3.getLocalName()
            java.lang.String r1 = "D"
            java.lang.String r2 = "DAV:"
            r0.<init>(r2, r3, r1)
            return r0
        L14:
            java.lang.String r0 = r3.getPrefix()
            if (r0 != 0) goto L2a
            ᛶᛵᲁᲇ r0 = new ᛶᛵᲁᲇ
            java.lang.String r1 = r3.getNamespaceURI()
            java.lang.String r3 = r3.getLocalName()
            java.lang.String r2 = ""
            r0.<init>(r1, r3, r2)
            return r0
        L2a:
            ᛶᛵᲁᲇ r0 = new ᛶᛵᲁᲇ
            java.lang.String r1 = r3.getNamespaceURI()
            java.lang.String r2 = r3.getLocalName()
            java.lang.String r3 = r3.getPrefix()
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static org.simpleframework.xml.core.Persister m1003() {
            org.simpleframework.xml.stream.Format r0 = new org.simpleframework.xml.stream.Format
            java.lang.String r1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
            r0.<init>(r1)
            org.simpleframework.xml.convert.Registry r1 = new org.simpleframework.xml.convert.Registry
            r1.<init>()
            org.simpleframework.xml.convert.RegistryStrategy r2 = new org.simpleframework.xml.convert.RegistryStrategy
            r2.<init>(r1)
            org.simpleframework.xml.core.Persister r3 = new org.simpleframework.xml.core.Persister
            r3.<init>(r2, r0)
            ᛳᛲᛲᲀ r0 = new ᛳᛲᛲᲀ
            java.lang.Class<com.thegrizzlylabs.sardineandroid.model.Prop> r2 = com.thegrizzlylabs.sardineandroid.model.Prop.class
            r0.<init>(r3, r2)
            r1.bind(r2, r0)
            ᛳᛲᛲᲀ r0 = new ᛳᛲᛲᲀ
            java.lang.Class<com.thegrizzlylabs.sardineandroid.model.Resourcetype> r2 = com.thegrizzlylabs.sardineandroid.model.Resourcetype.class
            r0.<init>(r3, r2)
            r1.bind(r2, r0)
            java.lang.Class<com.thegrizzlylabs.sardineandroid.model.Property> r0 = com.thegrizzlylabs.sardineandroid.model.Property.class
            java.lang.Class<com.thegrizzlylabs.sardineandroid.model.Property$PropertyConverter> r2 = com.thegrizzlylabs.sardineandroid.model.Property.PropertyConverter.class
            r1.bind(r0, r2)
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.util.Date m1004(java.lang.String r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 0
        L5:
            java.util.List r2 = defpackage.AbstractC0333.f1718
            int r3 = r2.size()
            if (r1 >= r3) goto L3a
            java.lang.Object r2 = r2.get(r1)
            java.lang.ThreadLocal r2 = (java.lang.ThreadLocal) r2
            java.lang.Object r3 = r2.get()
            java.text.SimpleDateFormat r3 = (java.text.SimpleDateFormat) r3
            if (r3 != 0) goto L32
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String[] r4 = defpackage.AbstractC0333.f1719
            r4 = r4[r1]
            java.util.Locale r5 = java.util.Locale.US
            r3.<init>(r4, r5)
            java.lang.String r4 = "UTC"
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r4)
            r3.setTimeZone(r4)
            r2.set(r3)
        L32:
            java.util.Date r0 = r3.parse(r6)     // Catch: java.text.ParseException -> L37
            goto L3a
        L37:
            int r1 = r1 + 1
            goto L5
        L3a:
            return r0
    }
}
