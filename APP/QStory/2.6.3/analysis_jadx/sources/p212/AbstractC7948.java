package p212;

import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.activity.AbstractC0040;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.layout.C0707;
import p195.AbstractC7834;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7948 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0707 f21997 = new C0707(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m13430(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x025e A[EDGE_INSN: B:203:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a], EDGE_INSN: B:204:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m13431(p212.C7951 r19, android.text.Layout r20, androidx.compose.runtime.internal.C1245 r21, int r22, android.graphics.RectF r23, p197.InterfaceC7846 r24, androidx.compose.foundation.layout.C0640 r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p212.AbstractC7948.m13431(飘花落叶言子苏楪兰哲世.飘花落叶言子楪苏哲兰世, android.text.Layout, androidx.compose.runtime.internal.飘花落叶言子楪世苏兰哲, int, android.graphics.RectF, 飘花落叶言子苏世楪哲兰.飘花落叶言子楪世哲兰苏, androidx.compose.foundation.layout.飘花落叶言子楪哲世苏兰, boolean):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m13432(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float m13433(float[] fArr, int i, int i2) {
        return fArr[AbstractC0053.m143(i, i2, 2, 1)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Rect m13434(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static StaticLayout m13435(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            AbstractC7834.m13198("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            AbstractC7834.m13198("invalid end value");
        }
        if (i3 < 0) {
            AbstractC7834.m13198("invalid maxLines value");
        }
        if (i < 0) {
            AbstractC7834.m13198("invalid width value");
        }
        if (i4 < 0) {
            AbstractC7834.m13198("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            builderObtain.setLineBreakConfig(AbstractC0040.m80().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }
}
