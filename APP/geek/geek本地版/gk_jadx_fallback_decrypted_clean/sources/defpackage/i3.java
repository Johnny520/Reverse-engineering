package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class i3 {
    public static void a(android.content.res.Configuration r1, android.content.res.Configuration r2, android.content.res.Configuration r3) {
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

    public static defpackage.sr b(android.content.res.Configuration r0) {
            android.os.LocaleList r0 = r0.getLocales()
            java.lang.String r0 = r0.toLanguageTags()
            sr r0 = defpackage.sr.a(r0)
            return r0
    }

    public static void c(defpackage.sr r0) {
            tr r0 = r0.a
            android.os.LocaleList r0 = r0.a
            java.lang.String r0 = r0.toLanguageTags()
            android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
            android.os.LocaleList.setDefault(r0)
            return
    }

    public static void d(android.content.res.Configuration r0, defpackage.sr r1) {
            tr r1 = r1.a
            android.os.LocaleList r1 = r1.a
            java.lang.String r1 = r1.toLanguageTags()
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r1)
            r0.setLocales(r1)
            return
    }
}
