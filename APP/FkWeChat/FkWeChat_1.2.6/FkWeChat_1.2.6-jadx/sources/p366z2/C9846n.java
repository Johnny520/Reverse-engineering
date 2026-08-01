package p366z2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: z2.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9846n extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final boolean f33264a;

    /* JADX INFO: renamed from: b */
    public final boolean f33265b;

    public C9846n(boolean z10, boolean z11) {
        this.f33264a = z10;
        this.f33265b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f33264a);
        textPaint.setStrikeThruText(this.f33265b);
    }
}
