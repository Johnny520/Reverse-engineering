package p096T0;

import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p030F1.AbstractC0448m;
import p120Y0.AbstractC1732a;

/* JADX INFO: renamed from: T0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1407g {
    /* JADX INFO: renamed from: a */
    public static StaticLayout m2698a(CharSequence charSequence, TextPaint textPaint, int i5, int i6, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i7, TextUtils.TruncateAt truncateAt, int i8, int i9, boolean z5, int i10, int i11, int i12, int i13) {
        if (i6 < 0) {
            AbstractC1732a.m3085a("invalid start value");
        }
        int length = charSequence.length();
        if (i6 < 0 || i6 > length) {
            AbstractC1732a.m3085a("invalid end value");
        }
        if (i7 < 0) {
            AbstractC1732a.m3085a("invalid maxLines value");
        }
        if (i5 < 0) {
            AbstractC1732a.m3085a("invalid width value");
        }
        if (i8 < 0) {
            AbstractC1732a.m3085a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i6, textPaint, i5);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i7);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i8);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z5);
        builderObtain.setBreakStrategy(i10);
        builderObtain.setHyphenationFrequency(i13);
        builderObtain.setIndents(null, null);
        int i14 = Build.VERSION.SDK_INT;
        builderObtain.setJustificationMode(i9);
        if (i14 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i14 >= 33) {
            builderObtain.setLineBreakConfig(AbstractC0448m.m717a().setLineBreakStyle(i11).setLineBreakWordStyle(i12).build());
        }
        if (i14 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    /* JADX INFO: renamed from: b */
    public static final Rect m2699b(TextPaint textPaint, CharSequence charSequence, int i5, int i6) {
        int i7 = i5;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i7 - 1, i6, MetricAffectingSpan.class) != i6) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i7 < i6) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i7, i6, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i7, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i7, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i7, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i7 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i7, i6, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i7, i6, rect3);
        return rect3;
    }

    /* JADX INFO: renamed from: c */
    public static final float m2700c(int i5, int i6, float[] fArr) {
        return fArr[((i5 - i6) * 2) + 1];
    }

    /* JADX INFO: renamed from: d */
    public static final int m2701d(Layout layout, int i5, boolean z5) {
        if (i5 <= 0) {
            return 0;
        }
        if (i5 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i5);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i5 || lineEnd == i5) {
            if (lineStart == i5) {
                if (z5) {
                    return lineForOffset - 1;
                }
            } else if (!z5) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0265 A[EDGE_INSN: B:203:0x0265->B:144:0x0265 BREAK  A[LOOP:5: B:154:0x0281->B:206:0x0281], EDGE_INSN: B:204:0x0265->B:144:0x0265 BREAK  A[LOOP:5: B:154:0x0281->B:206:0x0281]] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m2702e(p096T0.C1410j r19, android.text.Layout r20, p014C1.C0240b r21, int r22, android.graphics.RectF r23, p101U0.InterfaceC1469d r24, p000A.C0002B r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p096T0.AbstractC1407g.m2702e(T0.j, android.text.Layout, C1.b, int, android.graphics.RectF, U0.d, A.B, boolean):int");
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m2703f(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
