package p000;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: i4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1526i4 {
    /* JADX INFO: renamed from: a */
    public static LocaleList m2901a(String r0) {
        return LocaleList.forLanguageTags(r0);
    }

    /* JADX INFO: renamed from: b */
    public static void m2902b(TextView r0, LocaleList r1) {
        r0.setTextLocales(r1);
    }
}
