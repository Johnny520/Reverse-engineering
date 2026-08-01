package p106V0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p049I2.AbstractC0797o;
import p096T0.AbstractC1411k;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: V0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1489c implements LeadingMarginSpan {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10, int i11, boolean z5, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i10)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = AbstractC1411k.f5056a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fM1392q = AbstractC0797o.m1392q(layout, lineForOffset, paint) + AbstractC0797o.m1391p(layout, lineForOffset, paint);
            if (fM1392q == 0.0f) {
                return;
            }
            AbstractC1665j.m2982b(canvas);
            canvas.translate(fM1392q, 0.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z5) {
        return 0;
    }
}
