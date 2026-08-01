package p335x2;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import p366z2.C9837e;
import p366z2.C9838f;

/* JADX INFO: renamed from: x2.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9339k0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f31946a = true;

    /* JADX INFO: renamed from: d */
    public static final boolean m36425d(float f10, CharSequence charSequence, TextPaint textPaint) {
        if (f10 == 0.0f) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (AbstractC9348o0.m36446a(spanned, C9838f.class) || AbstractC9348o0.m36446a(spanned, C9837e.class)) {
                return true;
            }
        }
        return textPaint.getLetterSpacing() != 0.0f;
    }

    /* JADX INFO: renamed from: e */
    public static final CharSequence m36426e(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (AbstractC9348o0.m36446a(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        return spannableString;
                    }
                }
            }
        }
        return charSequence;
    }
}
