package p161l2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p133j2.AbstractC2062l;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: l2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2438c implements LeadingMarginSpan {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i9, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z9, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i14)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = AbstractC2062l.f6932a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fM10246B = AbstractC5700d.m10246B(layout, lineForOffset, paint) + AbstractC5700d.m10245A(layout, lineForOffset, paint);
            if (fM10246B == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(fM10246B, 0.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z9) {
        return 0;
    }
}
