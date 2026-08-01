package p228;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.activity.AbstractC0887;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.layout.C1481;
import androidx.compose.foundation.lazy.layout.C1548;
import androidx.compose.runtime.internal.C2080;
import java.text.Bidi;
import p064.C7341;
import p064.C7348;
import p211.AbstractC8663;
import p213.InterfaceC8675;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8777 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1548 f22342 = new C1548(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m13989(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x025e A[EDGE_INSN: B:203:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a], EDGE_INSN: B:204:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m13990(C8780 c8780, Layout layout, C2080 c2080, int i, RectF rectF, InterfaceC8675 interfaceC8675, C1481 c1481, boolean z) {
        C8771[] c8771Arr;
        C8771[] c8771Arr2;
        int i2;
        int iMo10320;
        int i3;
        int i4;
        int iMo10321;
        Bidi bidiCreateLineBidi;
        boolean z2;
        float fM13988;
        float fM139882;
        float fM139883;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = c8780.f22346;
        int lineStart2 = layout2.getLineStart(i);
        int iM13998 = c8780.m13998(i);
        if (i5 < (iM13998 - lineStart2) * 2) {
            AbstractC8663.m13757("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        C8773 c8773 = new C8773(c8780);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iM13998) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !zIsRtlCharAt) {
                fM13988 = c8773.m13988(lineStart2, z3, z3, true);
                fM139883 = c8773.m13988(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && zIsRtlCharAt) {
                z2 = z4;
                fM139883 = c8773.m13988(lineStart2, false, false, false);
                fM13988 = c8773.m13988(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (zIsRtlCharAt) {
                    fM139882 = c8773.m13988(lineStart2, false, false, true);
                    fM13988 = c8773.m13988(lineStart2 + 1, true, true, true);
                } else {
                    fM13988 = c8773.m13988(lineStart2, false, false, false);
                    fM139882 = c8773.m13988(lineStart2 + 1, true, true, false);
                }
                fM139883 = fM139882;
            }
            fArr[i6] = fM13988;
            fArr[i6 + 1] = fM139883;
            i6 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) c2080.f3965;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iM2722 = c2080.m2722(lineStart3, false);
        int iM2723 = c2080.m2723(iM2722);
        int i7 = lineStart3 - iM2723;
        int i8 = lineEnd2 - iM2723;
        Bidi bidiM2728 = c2080.m2728(iM2722);
        if (bidiM2728 == null || (bidiCreateLineBidi = bidiM2728.createLineBidi(i7, i8)) == null) {
            c8771Arr = new C8771[]{new C8771(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            c8771Arr = new C8771[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                c8771Arr[i9] = new C8771(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        C7341 c7348 = z ? new C7348(0, c8771Arr.length - 1, 1) : new C7341(c8771Arr.length - 1, 0, -1);
        int i11 = c7348.f18163;
        int i12 = c7348.f18161;
        int i13 = c7348.f18162;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            C8771 c8771 = c8771Arr[i11];
            boolean z5 = c8771.f22329;
            int iMo10302 = c8771.f22331;
            int iMo10303 = c8771.f22330;
            float f = z5 ? fArr[((iMo10303 - 1) - lineStart) * 2] : fArr[(iMo10302 - lineStart) * 2];
            float fM13992 = z5 ? m13992(fArr, iMo10302, lineStart) : m13992(fArr, iMo10303 - 1, lineStart);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                c8771Arr2 = c8771Arr;
                if (fM13992 >= f2) {
                    float f3 = rectF.right;
                    if (f > f3) {
                        iMo10303 = -1;
                        iMo10302 = iMo10303;
                    } else {
                        if ((z5 || f3 < fM13992) && (!z5 || f2 > f)) {
                            int i15 = iMo10303;
                            int i16 = iMo10302;
                            while (i15 - i16 > 1) {
                                int i17 = (i15 + i16) / 2;
                                float f4 = fArr[(i17 - lineStart) * 2];
                                int i18 = i15;
                                if ((z5 || f4 <= rectF.right) && (!z5 || f4 >= rectF.left)) {
                                    i15 = i18;
                                    i16 = i17;
                                } else {
                                    i15 = i17;
                                }
                            }
                            i2 = z5 ? i15 : i16;
                        } else {
                            i2 = iMo10303 - 1;
                        }
                        int iMo103212 = interfaceC8675.mo10321(i2 + 1);
                        if (iMo103212 != -1 && (iMo10320 = interfaceC8675.mo10320(iMo103212)) > iMo10302) {
                            if (iMo103212 < iMo10302) {
                                iMo103212 = iMo10302;
                            }
                            if (iMo10320 <= iMo10303) {
                                iMo10303 = iMo10320;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iMo103213 = iMo103212;
                            while (true) {
                                rectF2.left = z5 ? fArr[((iMo10303 - 1) - lineStart) * 2] : fArr[(iMo103213 - lineStart) * 2];
                                rectF2.right = z5 ? m13992(fArr, iMo103213, lineStart) : m13992(fArr, iMo10303 - 1, lineStart);
                                if (((Boolean) c1481.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iMo10303 = interfaceC8675.mo10303(iMo10303);
                                if (iMo10303 == -1 || iMo10303 <= iMo10302) {
                                    break;
                                }
                                iMo103213 = interfaceC8675.mo10321(iMo10303);
                                if (iMo103213 < iMo10302) {
                                    iMo103213 = iMo10302;
                                }
                            }
                            iMo10303 = -1;
                            iMo10302 = iMo10303;
                        }
                    }
                }
            } else if (fM13992 >= f2) {
                float f5 = rectF.right;
                if (f > f5) {
                    c8771Arr2 = c8771Arr;
                    iMo10302 = -1;
                } else {
                    if ((z5 || f2 > f) && (!z5 || f5 < fM13992)) {
                        int i19 = iMo10303;
                        int i20 = iMo10302;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z5 || f6 <= rectF.left) && (!z5 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z5 ? i3 : i20;
                    } else {
                        i4 = iMo10302;
                    }
                    int iMo103202 = interfaceC8675.mo10320(i4);
                    if (iMo103202 != -1 && (iMo10321 = interfaceC8675.mo10321(iMo103202)) < iMo10303) {
                        if (iMo10321 >= iMo10302) {
                            iMo10302 = iMo10321;
                        }
                        if (iMo103202 > iMo10303) {
                            iMo103202 = iMo10303;
                        }
                        c8771Arr2 = c8771Arr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iMo103203 = iMo103202;
                        while (true) {
                            rectF3.left = z5 ? fArr[((iMo103203 - 1) - lineStart) * 2] : fArr[(iMo10302 - lineStart) * 2];
                            rectF3.right = z5 ? m13992(fArr, iMo10302, lineStart) : m13992(fArr, iMo103203 - 1, lineStart);
                            if (((Boolean) c1481.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iMo10302 = interfaceC8675.mo10302(iMo10302);
                            if (iMo10302 == -1 || iMo10302 >= iMo10303) {
                                break;
                            }
                            iMo103203 = interfaceC8675.mo10320(iMo10302);
                            if (iMo103203 > iMo10303) {
                                iMo103203 = iMo10303;
                            }
                        }
                    }
                    iMo10302 = -1;
                }
            }
            if (iMo10302 >= 0) {
                return iMo10302;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            c8771Arr = c8771Arr2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m13991(Layout layout, int i, boolean z) {
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
    public static final float m13992(float[] fArr, int i, int i2) {
        return fArr[AbstractC0900.m703(i, i2, 2, 1)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Rect m13993(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
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
    public static StaticLayout m13994(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            AbstractC8663.m13757("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            AbstractC8663.m13757("invalid end value");
        }
        if (i3 < 0) {
            AbstractC8663.m13757("invalid maxLines value");
        }
        if (i < 0) {
            AbstractC8663.m13757("invalid width value");
        }
        if (i4 < 0) {
            AbstractC8663.m13757("invalid ellipsizedWidth value");
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
            builderObtain.setLineBreakConfig(AbstractC0887.m640().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }
}
