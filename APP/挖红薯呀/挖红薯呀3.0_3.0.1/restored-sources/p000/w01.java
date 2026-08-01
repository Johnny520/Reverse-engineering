package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class w01 extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final int f6888a;

    /* JADX INFO: renamed from: b */
    public final float f6889b;

    /* JADX INFO: renamed from: c */
    public final float f6890c;

    /* JADX INFO: renamed from: d */
    public final float f6891d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w01(int i, float f, float f2, float f3) {
        this.f6888a = i;
        this.f6889b = f;
        this.f6890c = f2;
        this.f6891d = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f6891d, this.f6889b, this.f6890c, this.f6888a);
    }
}
