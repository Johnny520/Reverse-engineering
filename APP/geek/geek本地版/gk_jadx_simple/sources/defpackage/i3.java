package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class i3 {
    public static void a(Configuration r1, Configuration r2, Configuration r3) {
        LocaleList r12 = r1.getLocales();
        LocaleList r0 = r2.getLocales();
        if (r12.equals(r0) == true) goto L6;
        r3.setLocales(r0);
        r3.locale = r2.locale;
        return;
    }

    public static sr b(Configuration r0) {
        return sr.a(r0.getLocales().toLanguageTags());
    }

    public static void c(sr r0) {
        LocaleList.setDefault(LocaleList.forLanguageTags(r0.a.a.toLanguageTags()));
    }

    public static void d(Configuration r0, sr r1) {
        r0.setLocales(LocaleList.forLanguageTags(r1.a.a.toLanguageTags()));
    }
}
