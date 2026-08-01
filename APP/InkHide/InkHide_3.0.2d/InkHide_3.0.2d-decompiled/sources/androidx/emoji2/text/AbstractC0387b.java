package androidx.emoji2.text;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: renamed from: androidx.emoji2.text.b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0387b {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 android.text.TextPaint) A[MD:(android.text.TextPaint):void (c)] (LINE:1) call: android.text.PrecomputedText.Params.Builder.<init>(android.text.TextPaint):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ PrecomputedText.Params.Builder m743g(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: INSTANCE_OF (r0v0 java.lang.CharSequence) (LINE:1) android.text.PrecomputedText */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ boolean m754r(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
