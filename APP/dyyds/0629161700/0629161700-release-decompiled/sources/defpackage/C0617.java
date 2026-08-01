package defpackage;

/* JADX INFO: renamed from: ᛴᛱᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0617 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0617 f3025 = null;

    static {
            r0 = -397147320524334(0xfffe96cbef0961d2, double:NaN)
            r0 = -397207450066478(0xfffe96bdef0961d2, double:NaN)
            r0 = -397254694706734(0xfffe96b2ef0961d2, double:NaN)
            r0 = -397293349412398(0xfffe96a9ef0961d2, double:NaN)
            r0 = -397332004118062(0xfffe96a0ef0961d2, double:NaN)
            ᛴᛱᲁᛸ r0 = new ᛴᛱᲁᛸ
            r0.<init>()
            defpackage.C0617.f3025 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static boolean m1415(android.content.Context r2) {
            r0 = -396881032551982(0xfffe9709ef0961d2, double:NaN)
            android.content.SharedPreferences r2 = m1419(r2)
            r0 = -396915392290350(0xfffe9701ef0961d2, double:NaN)
            java.lang.String r0 = "auto_backup"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static java.lang.String m1416(android.content.Context r3) {
            r0 = -396717823794734(0xfffe972fef0961d2, double:NaN)
            android.content.SharedPreferences r3 = m1419(r3)
            r0 = -396752183533102(0xfffe9727ef0961d2, double:NaN)
            java.lang.String r0 = "username"
            r1 = -396790838238766(0xfffe971eef0961d2, double:NaN)
            java.lang.String r1 = ""
            java.lang.String r3 = r3.getString(r0, r1)
            if (r3 != 0) goto L2d
            r0 = -396795133206062(0xfffe971def0961d2, double:NaN)
            java.lang.String r3 = ""
        L2d:
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m1417(android.content.Context r3) {
            r0 = -396627629481518(0xfffe9744ef0961d2, double:NaN)
            android.content.SharedPreferences r3 = m1419(r3)
            r0 = -396661989219886(0xfffe973cef0961d2, double:NaN)
            java.lang.String r0 = "server_url"
            r1 = -396709233860142(0xfffe9731ef0961d2, double:NaN)
            java.lang.String r1 = ""
            java.lang.String r3 = r3.getString(r0, r1)
            if (r3 != 0) goto L2d
            r0 = -396713528827438(0xfffe9730ef0961d2, double:NaN)
            java.lang.String r3 = ""
        L2d:
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.String m1418(android.content.Context r3) {
            r0 = -396799428173358(0xfffe971cef0961d2, double:NaN)
            android.content.SharedPreferences r3 = m1419(r3)
            r0 = -396833787911726(0xfffe9714ef0961d2, double:NaN)
            java.lang.String r0 = "password"
            r1 = -396872442617390(0xfffe970bef0961d2, double:NaN)
            java.lang.String r1 = ""
            java.lang.String r3 = r3.getString(r0, r1)
            if (r3 != 0) goto L2d
            r0 = -396876737584686(0xfffe970aef0961d2, double:NaN)
            java.lang.String r3 = ""
        L2d:
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static android.content.SharedPreferences m1419(android.content.Context r2) {
            r0 = -396163773013550(0xfffe97b0ef0961d2, double:NaN)
            java.lang.String r0 = "webdav_config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static boolean m1420(android.content.Context r2) {
            r0 = -397112960785966(0xfffe96d3ef0961d2, double:NaN)
            java.lang.String r0 = m1417(r2)
            int r0 = r0.length()
            if (r0 <= 0) goto L28
            java.lang.String r0 = m1416(r2)
            int r0 = r0.length()
            if (r0 <= 0) goto L28
            java.lang.String r2 = m1418(r2)
            int r2 = r2.length()
            if (r2 <= 0) goto L28
            r2 = 1
            return r2
        L28:
            r2 = 0
            return r2
    }
}
