package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* JADX INFO: renamed from: h5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0286h5 {
    /* JADX INFO: renamed from: a */
    public static StaticLayout m1355a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    /* JADX INFO: renamed from: b */
    public static int m1356b(TextView textView) {
        return textView.getMaxLines();
    }
}
