package p000;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lq0 extends fg1 {

    /* JADX INFO: renamed from: m */
    public final CharSequence f6247m;

    /* JADX INFO: renamed from: n */
    public final TextPaint f6248n;

    public lq0(CharSequence charSequence, TextPaint textPaint) {
        this.f6247m = charSequence;
        this.f6248n = textPaint;
    }

    @Override // p000.fg1
    /* JADX INFO: renamed from: B */
    public final int mo1652B(int i) {
        CharSequence charSequence = this.f6247m;
        return this.f6248n.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // p000.fg1
    /* JADX INFO: renamed from: J */
    public final int mo1653J(int i) {
        CharSequence charSequence = this.f6247m;
        return this.f6248n.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
