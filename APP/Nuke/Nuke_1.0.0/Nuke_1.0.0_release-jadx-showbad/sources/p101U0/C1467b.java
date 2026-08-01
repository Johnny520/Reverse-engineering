package p101U0;

import android.text.TextPaint;
import com.bumptech.glide.AbstractC1922d;

/* JADX INFO: renamed from: U0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1467b extends AbstractC1922d {

    /* JADX INFO: renamed from: f */
    public final CharSequence f5145f;

    /* JADX INFO: renamed from: g */
    public final TextPaint f5146g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1467b(CharSequence charSequence, TextPaint textPaint) {
        this.f5145f = charSequence;
        this.f5146g = textPaint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1922d
    /* JADX INFO: renamed from: A */
    public final int mo2735A(int i5) {
        CharSequence charSequence = this.f5145f;
        return this.f5146g.getTextRunCursor(charSequence, 0, charSequence.length(), false, i5, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1922d
    /* JADX INFO: renamed from: x */
    public final int mo2736x(int i5) {
        CharSequence charSequence = this.f5145f;
        return this.f5146g.getTextRunCursor(charSequence, 0, charSequence.length(), false, i5, 0);
    }
}
