package p000;

/* JADX INFO: renamed from: a5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0006a5 {
    /* JADX INFO: renamed from: α */
    public static void m33(android.content.res.Configuration r1, android.content.res.Configuration r2, android.content.res.Configuration r3) {
            android.os.LocaleList r1 = r1.getLocales()
            android.os.LocaleList r0 = r2.getLocales()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L15
            r3.setLocales(r0)
            java.util.Locale r1 = r2.locale
            r3.locale = r1
        L15:
            return
    }

    /* JADX INFO: renamed from: β */
    public static p000.cv0 m34(android.content.res.Configuration r0) {
            android.os.LocaleList r0 = r0.getLocales()
            java.lang.String r0 = r0.toLanguageTags()
            cv0 r0 = p000.cv0.m1616(r0)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m35(p000.cv0 r0) {
            dv0 r0 = r0.f2779
            android.os.LocaleList r0 = r0.f3300
            java.lang.String r0 = r0.toLanguageTags()
            android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
            android.os.LocaleList.setDefault(r0)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m36(android.content.res.Configuration r0, p000.cv0 r1) {
            dv0 r1 = r1.f2779
            android.os.LocaleList r1 = r1.f3300
            java.lang.String r1 = r1.toLanguageTags()
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r1)
            r0.setLocales(r1)
            return
    }
}
