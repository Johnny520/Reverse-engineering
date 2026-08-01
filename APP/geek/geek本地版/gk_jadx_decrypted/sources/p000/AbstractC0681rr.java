package p000;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: rr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0681rr {
    /* JADX INFO: renamed from: a */
    public static LocaleList m2297a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* JADX INFO: renamed from: b */
    public static LocaleList m2298b() {
        return LocaleList.getAdjustedDefault();
    }

    /* JADX INFO: renamed from: c */
    public static LocaleList m2299c() {
        return LocaleList.getDefault();
    }
}
