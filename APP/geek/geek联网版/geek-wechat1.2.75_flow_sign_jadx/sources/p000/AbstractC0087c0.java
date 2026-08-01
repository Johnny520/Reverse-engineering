package p000;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: renamed from: c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0087c0 {
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ PrecomputedText.Params.Builder m563i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m574t(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
