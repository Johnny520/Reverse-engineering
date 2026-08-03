package p161l2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: l2.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2446k extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final boolean f8049a;

    /* JADX INFO: renamed from: b */
    public final boolean f8050b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2446k(boolean z9, boolean z10) {
        this.f8049a = z9;
        this.f8050b = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f8049a);
        textPaint.setStrikeThruText(this.f8050b);
    }
}
