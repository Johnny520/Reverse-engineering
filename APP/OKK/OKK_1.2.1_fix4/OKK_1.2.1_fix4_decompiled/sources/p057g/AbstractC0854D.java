package p057g;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: g.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0854D {
    /* JADX INFO: renamed from: a */
    public static LocaleList m2166a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m2167b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
