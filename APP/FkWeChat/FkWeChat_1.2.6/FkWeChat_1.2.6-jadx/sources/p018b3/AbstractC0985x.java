package p018b3;

import android.view.inputmethod.ExtractedText;
import p299ub.AbstractC8621f0;
import p319w2.C9137t3;

/* JADX INFO: renamed from: b3.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0985x {
    /* JADX INFO: renamed from: a */
    public static final ExtractedText m3611a(C0978t0 c0978t0) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = c0978t0.m3586k();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = c0978t0.m3586k().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = C9137t3.m35521l(c0978t0.m3585j());
        extractedText.selectionEnd = C9137t3.m35520k(c0978t0.m3585j());
        extractedText.flags = !AbstractC8621f0.m33124Z(c0978t0.m3586k(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
