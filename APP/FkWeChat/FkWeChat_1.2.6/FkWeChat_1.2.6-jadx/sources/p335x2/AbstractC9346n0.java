package p335x2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: x2.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9346n0 {
    /* JADX INFO: renamed from: a */
    public static final void m36441a(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    /* JADX INFO: renamed from: b */
    public static final void m36442b(Paint paint, CharSequence charSequence, int i10, int i11, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            C9344m0.m36435a(paint, charSequence, i10, i11, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i10, i11, rect);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Rect m36443c(TextPaint textPaint, CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (AbstractC9348o0.m36447b(spanned, MetricAffectingSpan.class, i10, i11)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i10 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i10, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i10, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    m36442b(textPaint2, charSequence, i10, iNextSpanTransition, rect2);
                    m36441a(rect, rect2);
                    i10 = iNextSpanTransition;
                }
                return rect;
            }
        }
        return m36444d(textPaint, charSequence, i10, i11);
    }

    /* JADX INFO: renamed from: d */
    public static final Rect m36444d(Paint paint, CharSequence charSequence, int i10, int i11) {
        Rect rect = new Rect();
        m36442b(paint, charSequence, i10, i11, rect);
        return rect;
    }
}
