package androidx.appcompat.widget;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0230 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m732(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static LocaleList m733(String str) {
        return LocaleList.forLanguageTags(str);
    }
}
