package p069i;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* JADX INFO: renamed from: i.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0672e0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static StaticLayout m1301a(CharSequence charSequence, Layout.Alignment alignment, int i2, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i2, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m1302b(TextView textView) {
        return textView.getMaxLines();
    }
}
