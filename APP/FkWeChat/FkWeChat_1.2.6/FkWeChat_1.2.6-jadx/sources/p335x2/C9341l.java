package p335x2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: x2.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9341l {

    /* JADX INFO: renamed from: a */
    public static final C9341l f31947a = new C9341l();

    /* JADX INFO: renamed from: a */
    public static final BoringLayout m36430a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, float f11, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, truncateAt, i11);
    }

    /* JADX INFO: renamed from: b */
    public static final BoringLayout.Metrics m36431b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
