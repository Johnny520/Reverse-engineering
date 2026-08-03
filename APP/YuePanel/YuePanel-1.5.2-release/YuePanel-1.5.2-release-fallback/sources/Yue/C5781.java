package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class C5781 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f21264 = "ShortcutXmlParser";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f21265 = "android.app.shortcuts";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f21266 = "shortcut";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f21267 = "shortcutId";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile java.util.ArrayList<java.lang.String> f21268;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.Object f21269 = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C5781.f21269 = r0
            return
    }

    public C5781() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m21612(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = r1.getAttributeValue(r0, r2)
            if (r0 != 0) goto Ld
            r0 = 0
            java.lang.String r0 = r1.getAttributeValue(r0, r2)
        Ld:
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC7131
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m21613(@Yue.InterfaceC4410 android.content.Context r2) {
            java.util.ArrayList<java.lang.String> r0 = Yue.C5781.f21268
            if (r0 != 0) goto L22
            java.lang.Object r0 = Yue.C5781.f21269
            monitor-enter(r0)
            java.util.ArrayList<java.lang.String> r1 = Yue.C5781.f21268     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            Yue.C5781.f21268 = r1     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayList<java.lang.String> r1 = Yue.C5781.f21268     // Catch: java.lang.Throwable -> L1c
            java.util.Set r2 = m21616(r2)     // Catch: java.lang.Throwable -> L1c
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r2 = move-exception
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            goto L22
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r2
        L22:
            java.util.ArrayList<java.lang.String> r2 = Yue.C5781.f21268
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.content.res.XmlResourceParser m21614(android.content.Context r2, android.content.pm.ActivityInfo r3) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "android.app.shortcuts"
            android.content.res.XmlResourceParser r2 = r3.loadXmlMetaData(r2, r0)
            if (r2 == 0) goto Ld
            return r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to open android.app.shortcuts meta-data resource of "
            r0.append(r1)
            java.lang.String r3 = r3.name
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m21615(@Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
        L6:
            int r2 = r6.next()
            if (r2 == r1) goto L37
            r3 = 3
            if (r2 != r3) goto L15
            int r3 = r6.getDepth()
            if (r3 <= 0) goto L37
        L15:
            int r3 = r6.getDepth()
            java.lang.String r4 = r6.getName()
            r5 = 2
            if (r2 != r5) goto L6
            if (r3 != r5) goto L6
            java.lang.String r2 = "shortcut"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            java.lang.String r2 = "shortcutId"
            java.lang.String r2 = m21612(r6, r2)
            if (r2 != 0) goto L33
            goto L6
        L33:
            r0.add(r2)
            goto L6
        L37:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.util.Set<java.lang.String> m21616(@Yue.InterfaceC4410 android.content.Context r5) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.MAIN"
            r1.<init>(r2)
            java.lang.String r2 = "android.intent.category.LAUNCHER"
            r1.addCategory(r2)
            java.lang.String r2 = r5.getPackageName()
            r1.setPackage(r2)
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r3 = 128(0x80, float:1.8E-43)
            java.util.List r1 = r2.queryIntentActivities(r1, r3)
            if (r1 == 0) goto L6f
            int r2 = r1.size()
            if (r2 != 0) goto L2b
            goto L6f
        L2b:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L5a
        L2f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L5a
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L5a
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2     // Catch: java.lang.Exception -> L5a
            android.content.pm.ActivityInfo r2 = r2.activityInfo     // Catch: java.lang.Exception -> L5a
            android.os.Bundle r3 = r2.metaData     // Catch: java.lang.Exception -> L5a
            if (r3 == 0) goto L2f
            java.lang.String r4 = "android.app.shortcuts"
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Exception -> L5a
            if (r3 == 0) goto L2f
            android.content.res.XmlResourceParser r2 = m21614(r5, r2)     // Catch: java.lang.Exception -> L5a
            java.util.List r3 = m21615(r2)     // Catch: java.lang.Throwable -> L5c
            r0.addAll(r3)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L2f
            r2.close()     // Catch: java.lang.Exception -> L5a
            goto L2f
        L5a:
            r5 = move-exception
            goto L68
        L5c:
            r5 = move-exception
            if (r2 == 0) goto L67
            r2.close()     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch: java.lang.Exception -> L5a
        L67:
            throw r5     // Catch: java.lang.Exception -> L5a
        L68:
            java.lang.String r1 = "ShortcutXmlParser"
            java.lang.String r2 = "Failed to parse the Xml resource: "
            android.util.Log.e(r1, r2, r5)
        L6f:
            return r0
    }
}
