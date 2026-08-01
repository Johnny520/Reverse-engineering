package defpackage;

/* JADX INFO: renamed from: ᛷᲇᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1381 {
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static void m2551(android.content.res.Configuration r0, defpackage.C1509 r1) {
            ᛳᲈᛲᛳ r1 = r1.f6670
            android.os.LocaleList r1 = r1.f2923
            java.lang.String r1 = r1.toLanguageTags()
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r1)
            r0.setLocales(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m2552(defpackage.C1509 r0) {
            ᛳᲈᛲᛳ r0 = r0.f6670
            android.os.LocaleList r0 = r0.f2923
            java.lang.String r0 = r0.toLanguageTags()
            android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
            android.os.LocaleList.setDefault(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m2553(android.content.res.Configuration r1, android.content.res.Configuration r2, android.content.res.Configuration r3) {
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

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C1509 m2554(android.content.res.Configuration r0) {
            android.os.LocaleList r0 = r0.getLocales()
            java.lang.String r0 = r0.toLanguageTags()
            ᛸᛶᛶᛸ r0 = defpackage.C1509.m2743(r0)
            return r0
    }
}
