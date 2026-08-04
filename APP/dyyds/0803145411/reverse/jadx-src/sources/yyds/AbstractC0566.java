package yyds;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛳᛴᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0566 {
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static LocaleList m1439(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m1440(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
