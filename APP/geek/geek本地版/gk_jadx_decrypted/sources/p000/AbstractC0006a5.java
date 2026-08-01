package p000;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: a5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0006a5 {
    /* JADX INFO: renamed from: a */
    public static LocaleList m15a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m16b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
