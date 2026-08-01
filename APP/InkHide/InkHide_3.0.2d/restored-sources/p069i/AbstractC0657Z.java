package p069i;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: i.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0657Z {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static LocaleList m1271a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1272b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
