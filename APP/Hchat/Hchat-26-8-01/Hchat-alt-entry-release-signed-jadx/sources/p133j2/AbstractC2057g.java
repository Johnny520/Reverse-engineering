package p133j2;

import ai.AbstractC0088a;
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
import be.C0289k;
import java.text.Bidi;
import p015b0.C0154t;
import p023b8.C0205c;
import p058e2.C0817g;
import p147k2.InterfaceC2237d;
import p172lg.C2562b;
import p204o2.AbstractC3042a;
import p222p.AbstractC3199a;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: j2.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2057g {

    /* JADX INFO: renamed from: a */
    public static final C0205c f6911a = new C0205c(4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static StaticLayout m5101a(CharSequence charSequence, TextPaint textPaint, int i9, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, boolean z9, int i14, int i15, int i16, int i17) {
        if (i10 < 0) {
            AbstractC3042a.m6486a("invalid start value");
        }
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            AbstractC3042a.m6486a("invalid end value");
        }
        if (i11 < 0) {
            AbstractC3042a.m6486a("invalid maxLines value");
        }
        if (i9 < 0) {
            AbstractC3042a.m6486a("invalid width value");
        }
        if (i12 < 0) {
            AbstractC3042a.m6486a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i10, textPaint, i9);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i11);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i12);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z9);
        builderObtain.setBreakStrategy(i14);
        builderObtain.setHyphenationFrequency(i17);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i13);
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i18 >= 33) {
            builderObtain.setLineBreakConfig(AbstractC0088a.m480f().setLineBreakStyle(i15).setLineBreakWordStyle(i16).build());
        }
        if (i18 >= 35) {
            AbstractC2058h.m5107a(builderObtain);
        }
        return builderObtain.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final Rect m5102b(TextPaint textPaint, CharSequence charSequence, int i9, int i10) {
        int i11 = i9;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i11 - 1, i10, MetricAffectingSpan.class) != i10) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i11 < i10) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i11, i10, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i11, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i11, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i11, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i11 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i11, i10, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i11, i10, rect3);
        return rect3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final float m5103c(int i9, int i10, float[] fArr) {
        return fArr[AbstractC3199a.m6853z(i9, i10, 2, 1)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m5104d(Layout layout, int i9, boolean z9) {
        if (i9 <= 0) {
            return 0;
        }
        if (i9 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i9);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i9 || lineEnd == i9) {
            if (lineStart == i9) {
                if (z9) {
                    return lineForOffset - 1;
                }
            } else if (!z9) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025a A[EDGE_INSN: B:203:0x025a->B:144:0x025a BREAK  A[LOOP:5: B:154:0x0276->B:206:0x0276], EDGE_INSN: B:204:0x025a->B:144:0x025a BREAK  A[LOOP:5: B:154:0x0276->B:206:0x0276]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a2  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m5105e(C2061k c2061k, Layout layout, C0289k c0289k, int i9, RectF rectF, InterfaceC2237d interfaceC2237d, C0154t c0154t, boolean z9) {
        C2055e[] c2055eArr;
        C2055e[] c2055eArr2;
        int i10;
        int iMo630h;
        int i11;
        int i12;
        int iMo629g;
        Bidi bidiCreateLineBidi;
        boolean z10;
        float fM2064a;
        float fM2064a2;
        float fM2064a3;
        int lineTop = layout.getLineTop(i9);
        int lineBottom = layout.getLineBottom(i9);
        int lineStart = layout.getLineStart(i9);
        int lineEnd = layout.getLineEnd(i9);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i13 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i13];
        Layout layout2 = c2061k.f6920f;
        int lineStart2 = layout2.getLineStart(i9);
        int iM5114f = c2061k.m5114f(i9);
        if (i13 < (iM5114f - lineStart2) * 2) {
            AbstractC3042a.m6486a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        C0817g c0817g = new C0817g(c2061k);
        boolean z11 = false;
        boolean z12 = layout2.getParagraphDirection(i9) == 1;
        int i14 = 0;
        while (lineStart2 < iM5114f) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z12 && !zIsRtlCharAt) {
                fM2064a = c0817g.m2064a(lineStart2, z11, z11, true);
                fM2064a3 = c0817g.m2064a(lineStart2 + 1, true, true, true);
                z10 = z12;
            } else if (z12 && zIsRtlCharAt) {
                z10 = z12;
                fM2064a3 = c0817g.m2064a(lineStart2, false, false, false);
                fM2064a = c0817g.m2064a(lineStart2 + 1, true, true, false);
            } else {
                z10 = z12;
                if (zIsRtlCharAt) {
                    fM2064a2 = c0817g.m2064a(lineStart2, false, false, true);
                    fM2064a = c0817g.m2064a(lineStart2 + 1, true, true, true);
                } else {
                    fM2064a = c0817g.m2064a(lineStart2, false, false, false);
                    fM2064a2 = c0817g.m2064a(lineStart2 + 1, true, true, false);
                }
                fM2064a3 = fM2064a2;
            }
            fArr[i14] = fM2064a;
            fArr[i14 + 1] = fM2064a3;
            i14 += 2;
            lineStart2++;
            z12 = z10;
            z11 = false;
        }
        Layout layout3 = (Layout) c0289k.f839b;
        int lineStart3 = layout3.getLineStart(i9);
        int lineEnd2 = layout3.getLineEnd(i9);
        int iM1201j = c0289k.m1201j(lineStart3, false);
        int iM1202k = c0289k.m1202k(iM1201j);
        int i15 = lineStart3 - iM1202k;
        int i16 = lineEnd2 - iM1202k;
        Bidi bidiM1196e = c0289k.m1196e(iM1201j);
        if (bidiM1196e == null || (bidiCreateLineBidi = bidiM1196e.createLineBidi(i15, i16)) == null) {
            c2055eArr = new C2055e[]{new C2055e(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            c2055eArr = new C2055e[runCount];
            int i17 = 0;
            while (i17 < runCount) {
                int i18 = runCount;
                c2055eArr[i17] = new C2055e(bidiCreateLineBidi.getRunStart(i17) + lineStart3, bidiCreateLineBidi.getRunLimit(i17) + lineStart3, bidiCreateLineBidi.getRunLevel(i17) % 2 == 1);
                i17++;
                runCount = i18;
            }
        }
        C2562b c2562bM8364A0 = z9 ? AbstractC4165l.m8364A0(c2055eArr) : new C2562b(c2055eArr.length - 1, 0, -1);
        int i19 = c2562bM8364A0.f8312g;
        int i20 = c2562bM8364A0.f8313h;
        int i21 = c2562bM8364A0.f8314i;
        if ((i21 <= 0 || i19 > i20) && (i21 >= 0 || i20 > i19)) {
            return -1;
        }
        while (true) {
            C2055e c2055e = c2055eArr[i19];
            boolean z13 = c2055e.f6902c;
            int iMo625b = c2055e.f6900a;
            int iMo626c = c2055e.f6901b;
            float f3 = z13 ? fArr[((iMo626c - 1) - lineStart) * 2] : fArr[(iMo625b - lineStart) * 2];
            float fM5103c = z13 ? m5103c(iMo625b, lineStart, fArr) : m5103c(iMo626c - 1, lineStart, fArr);
            float f10 = rectF.left;
            int i22 = i21;
            if (!z9) {
                c2055eArr2 = c2055eArr;
                if (fM5103c >= f10) {
                    float f11 = rectF.right;
                    if (f3 > f11) {
                        iMo626c = -1;
                        iMo625b = iMo626c;
                    } else {
                        if ((z13 || f11 < fM5103c) && (!z13 || f10 > f3)) {
                            int i23 = iMo626c;
                            int i24 = iMo625b;
                            while (i23 - i24 > 1) {
                                int i25 = (i23 + i24) / 2;
                                float f12 = fArr[(i25 - lineStart) * 2];
                                int i26 = i23;
                                if ((z13 || f12 <= rectF.right) && (!z13 || f12 >= rectF.left)) {
                                    i23 = i26;
                                    i24 = i25;
                                } else {
                                    i23 = i25;
                                }
                            }
                            i10 = z13 ? i23 : i24;
                        } else {
                            i10 = iMo626c - 1;
                        }
                        int iMo629g2 = interfaceC2237d.mo629g(i10 + 1);
                        if (iMo629g2 != -1 && (iMo630h = interfaceC2237d.mo630h(iMo629g2)) > iMo625b) {
                            if (iMo629g2 < iMo625b) {
                                iMo629g2 = iMo625b;
                            }
                            if (iMo630h <= iMo626c) {
                                iMo626c = iMo630h;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iMo629g3 = iMo629g2;
                            while (true) {
                                rectF2.left = z13 ? fArr[((iMo626c - 1) - lineStart) * 2] : fArr[(iMo629g3 - lineStart) * 2];
                                rectF2.right = z13 ? m5103c(iMo629g3, lineStart, fArr) : m5103c(iMo626c - 1, lineStart, fArr);
                                if (((Boolean) c0154t.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iMo626c = interfaceC2237d.mo626c(iMo626c);
                                if (iMo626c == -1 || iMo626c <= iMo625b) {
                                    break;
                                }
                                iMo629g3 = interfaceC2237d.mo629g(iMo626c);
                                if (iMo629g3 < iMo625b) {
                                    iMo629g3 = iMo625b;
                                }
                            }
                            iMo626c = -1;
                            iMo625b = iMo626c;
                        }
                    }
                }
            } else if (fM5103c >= f10) {
                float f13 = rectF.right;
                if (f3 > f13) {
                    c2055eArr2 = c2055eArr;
                    iMo625b = -1;
                } else {
                    if ((z13 || f10 > f3) && (!z13 || f13 < fM5103c)) {
                        int i27 = iMo626c;
                        int i28 = iMo625b;
                        while (true) {
                            i11 = i27;
                            if (i27 - i28 <= 1) {
                                break;
                            }
                            int i29 = (i11 + i28) / 2;
                            float f14 = fArr[(i29 - lineStart) * 2];
                            if ((z13 || f14 <= rectF.left) && (!z13 || f14 >= rectF.right)) {
                                i27 = i11;
                                i28 = i29;
                            } else {
                                i27 = i29;
                            }
                        }
                        i12 = z13 ? i11 : i28;
                    } else {
                        i12 = iMo625b;
                    }
                    int iMo630h2 = interfaceC2237d.mo630h(i12);
                    if (iMo630h2 != -1 && (iMo629g = interfaceC2237d.mo629g(iMo630h2)) < iMo626c) {
                        if (iMo629g >= iMo625b) {
                            iMo625b = iMo629g;
                        }
                        if (iMo630h2 > iMo626c) {
                            iMo630h2 = iMo626c;
                        }
                        c2055eArr2 = c2055eArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iMo630h3 = iMo630h2;
                        while (true) {
                            rectF3.left = z13 ? fArr[((iMo630h3 - 1) - lineStart) * 2] : fArr[(iMo625b - lineStart) * 2];
                            rectF3.right = z13 ? m5103c(iMo625b, lineStart, fArr) : m5103c(iMo630h3 - 1, lineStart, fArr);
                            if (((Boolean) c0154t.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iMo625b = interfaceC2237d.mo625b(iMo625b);
                            if (iMo625b == -1 || iMo625b >= iMo626c) {
                                break;
                            }
                            iMo630h3 = interfaceC2237d.mo630h(iMo625b);
                            if (iMo630h3 > iMo626c) {
                                iMo630h3 = iMo626c;
                            }
                        }
                    }
                    iMo625b = -1;
                }
            }
            if (iMo625b >= 0) {
                return iMo625b;
            }
            if (i19 == i20) {
                return -1;
            }
            i19 += i22;
            i21 = i22;
            c2055eArr = c2055eArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m5106f(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
