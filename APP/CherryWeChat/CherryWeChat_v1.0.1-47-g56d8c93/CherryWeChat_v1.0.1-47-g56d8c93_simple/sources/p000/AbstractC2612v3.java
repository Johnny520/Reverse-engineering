package p000;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: v3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2612v3 {
    /* JADX INFO: renamed from: a */
    public static void m5122a(Configuration r1, Configuration r2, Configuration r3) {
        LocaleList r12 = r1.getLocales();
        LocaleList r0 = r2.getLocales();
        if (r12.equals(r0) == true) goto L6;
        r3.setLocales(r0);
        r3.locale = r2.locale;
        return;
    }

    /* JADX INFO: renamed from: b */
    public static C1105Zo m5123b(Configuration r0) {
        return C1105Zo.m2029a(r0.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: c */
    public static void m5124c(C1105Zo r0) {
        LocaleList.setDefault(LocaleList.forLanguageTags(r0.f3499a.f4071a.toLanguageTags()));
    }

    /* JADX INFO: renamed from: d */
    public static void m5125d(Configuration r0, C1105Zo r1) {
        r0.setLocales(LocaleList.forLanguageTags(r1.f3499a.f4071a.toLanguageTags()));
    }
}
