package p161l2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: l2.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2445j extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final int f8045a;

    /* JADX INFO: renamed from: b */
    public final float f8046b;

    /* JADX INFO: renamed from: c */
    public final float f8047c;

    /* JADX INFO: renamed from: d */
    public final float f8048d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2445j(int i9, float f3, float f10, float f11) {
        this.f8045a = i9;
        this.f8046b = f3;
        this.f8047c = f10;
        this.f8048d = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f8048d, this.f8046b, this.f8047c, this.f8045a);
    }
}
