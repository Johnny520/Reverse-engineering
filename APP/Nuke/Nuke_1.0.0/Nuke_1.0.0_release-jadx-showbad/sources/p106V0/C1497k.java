package p106V0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: V0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1497k extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final boolean f5224a;

    /* JADX INFO: renamed from: b */
    public final boolean f5225b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1497k(boolean z5, boolean z6) {
        this.f5224a = z5;
        this.f5225b = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f5224a);
        textPaint.setStrikeThruText(this.f5225b);
    }
}
