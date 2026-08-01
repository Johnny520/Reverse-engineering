package defpackage;

/* JADX INFO: renamed from: ᲁᛲᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1815 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1815 f7943 = null;

    static {
            r0 = -350684364316206(0xfffec10def0961d2, double:NaN)
            ᲁᛲᛷᛶ r0 = new ᲁᛲᛷᛶ
            r0.<init>()
            defpackage.C1815.f7943 = r0
            r0 = -350697249218094(0xfffec10aef0961d2, double:NaN)
            java.lang.String r0 = "10"
            java.lang.Integer.parseInt(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.String m3210(int r4) {
            int r4 = r4 / 1000
            int r0 = r4 / 60
            int r4 = r4 % 60
            r1 = -350495385755182(0xfffec139ef0961d2, double:NaN)
            java.lang.String r1 = "%02d:%02d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            r2 = -350538335428142(0xfffec12fef0961d2, double:NaN)
            r0 = 2
            java.lang.String r4 = defpackage.AbstractC0225.m830(r4, r0, r1, r2)
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m3211(java.lang.Number r5, java.lang.String r6) {
            r0 = -350362241769006(0xfffec158ef0961d2, double:NaN)
            if (r5 != 0) goto L14
            r5 = -350396601507374(0xfffec150ef0961d2, double:NaN)
            java.lang.String r5 = ""
            return r5
        L14:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r6)
            java.lang.String r6 = r5.toString()
            int r6 = r6.length()
            r1 = 13
            if (r6 != r1) goto L33
            java.util.Date r6 = new java.util.Date
            long r1 = r5.longValue()
            r6.<init>(r1)
            java.lang.String r5 = r0.format(r6)
            return r5
        L33:
            java.util.Date r6 = new java.util.Date
            long r1 = r5.longValue()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r6.<init>(r1)
            java.lang.String r5 = r0.format(r6)
            return r5
    }
}
