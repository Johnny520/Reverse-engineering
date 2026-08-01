package androidx.appcompat.widget;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0230 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m731(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static LocaleList m732(String str) {
        return LocaleList.forLanguageTags(str);
    }
}
