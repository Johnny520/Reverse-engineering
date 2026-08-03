package p147k2;

import android.text.TextPaint;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: k2.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2235b extends AbstractC5700d {

    /* JADX INFO: renamed from: g */
    public final CharSequence f7405g;

    /* JADX INFO: renamed from: h */
    public final TextPaint f7406h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2235b(CharSequence charSequence, TextPaint textPaint) {
        this.f7405g = charSequence;
        this.f7406h = textPaint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: P */
    public final int mo5472P(int i9) {
        CharSequence charSequence = this.f7405g;
        return this.f7406h.getTextRunCursor(charSequence, 0, charSequence.length(), false, i9, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: V */
    public final int mo5473V(int i9) {
        CharSequence charSequence = this.f7405g;
        return this.f7406h.getTextRunCursor(charSequence, 0, charSequence.length(), false, i9, 2);
    }
}
