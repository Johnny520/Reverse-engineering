package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class v61 extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final boolean f6425a;

    /* JADX INFO: renamed from: b */
    public final boolean f6426b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v61(boolean z, boolean z2) {
        this.f6425a = z;
        this.f6426b = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f6425a);
        textPaint.setStrikeThruText(this.f6426b);
    }
}
