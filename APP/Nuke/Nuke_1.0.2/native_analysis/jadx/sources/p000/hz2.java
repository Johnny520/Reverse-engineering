package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hz2 extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final boolean f4196a;

    /* JADX INFO: renamed from: b */
    public final boolean f4197b;

    public hz2(boolean z, boolean z2) {
        this.f4196a = z;
        this.f4197b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f4196a);
        textPaint.setStrikeThruText(this.f4197b);
    }
}
