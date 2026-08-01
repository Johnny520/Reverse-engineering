package p196;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p212.AbstractC7949;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7838 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = AbstractC7949.f21999;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fM9887 = AbstractC4922.m9887(layout, lineForOffset, paint) + AbstractC4922.m9886(layout, lineForOffset, paint);
            if (fM9887 == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(fM9887, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
