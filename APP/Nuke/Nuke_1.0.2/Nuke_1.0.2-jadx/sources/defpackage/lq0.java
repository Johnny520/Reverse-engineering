package defpackage;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lq0 extends fg1 {
    public final CharSequence m;
    public final TextPaint n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lq0(CharSequence charSequence, TextPaint textPaint) {
        this.m = charSequence;
        this.n = textPaint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fg1
    public final int B(int i) {
        CharSequence charSequence = this.m;
        return this.n.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fg1
    public final int J(int i) {
        CharSequence charSequence = this.m;
        return this.n.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
