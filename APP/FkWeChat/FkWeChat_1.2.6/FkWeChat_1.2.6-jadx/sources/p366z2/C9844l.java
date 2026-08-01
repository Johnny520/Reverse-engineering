package p366z2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: z2.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9844l extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final int f33259a;

    /* JADX INFO: renamed from: b */
    public final float f33260b;

    /* JADX INFO: renamed from: c */
    public final float f33261c;

    /* JADX INFO: renamed from: d */
    public final float f33262d;

    public C9844l(int i10, float f10, float f11, float f12) {
        this.f33259a = i10;
        this.f33260b = f10;
        this.f33261c = f11;
        this.f33262d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f33262d, this.f33260b, this.f33261c, this.f33259a);
    }
}
