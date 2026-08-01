package p069i;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;

/* JADX INFO: renamed from: i.g0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0678g0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static StaticLayout m1305a(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3, TextView textView, TextPaint textPaint, AbstractC0687j0 abstractC0687j0) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            abstractC0687j0.mo1306a(builderObtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }
}
