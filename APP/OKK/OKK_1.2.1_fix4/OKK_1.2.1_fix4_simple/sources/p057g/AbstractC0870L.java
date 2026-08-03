package p057g;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* JADX INFO: renamed from: g.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0870L {
    /* JADX INFO: renamed from: a */
    public static StaticLayout m2193a(CharSequence r2, Layout.Alignment r3, int r4, int r5, TextView r6, TextPaint r7, AbstractC0876O r8) {
        StaticLayout.Builder r22 = StaticLayout.Builder.obtain(r2, 0, r2.length(), r7, r4);
        StaticLayout.Builder r32 = r22.setAlignment(r3).setLineSpacing(r6.getLineSpacingExtra(), r6.getLineSpacingMultiplier()).setIncludePad(r6.getIncludeFontPadding()).setBreakStrategy(r6.getBreakStrategy()).setHyphenationFrequency(r6.getHyphenationFrequency());
        if (r5 != (-1)) goto L5;
        r5 = Integer.MAX_VALUE;
    L5:
        r32.setMaxLines(r5);
        r8.mo2194a(r22, r6);     // Catch: ClassCastException -> L9
    L8:
        return r22.build();
    }
}
