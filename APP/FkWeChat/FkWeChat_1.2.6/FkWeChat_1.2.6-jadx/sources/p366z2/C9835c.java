package p366z2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p335x2.AbstractC9337j1;

/* JADX INFO: renamed from: z2.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9835c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i15)) != layout.getLineCount() - 1 || !AbstractC9337j1.m36418m(layout, lineForOffset)) {
            return;
        }
        float fM38233a = AbstractC9836d.m38233a(layout, lineForOffset, paint) + AbstractC9836d.m38235c(layout, lineForOffset, paint);
        if (fM38233a == 0.0f) {
            return;
        }
        canvas.getClass();
        canvas.translate(fM38233a, 0.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}
