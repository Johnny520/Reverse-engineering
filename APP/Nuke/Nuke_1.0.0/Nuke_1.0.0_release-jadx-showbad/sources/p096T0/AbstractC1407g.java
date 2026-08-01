package p096T0;

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
import java.text.Bidi;
import p000A.C0002B;
import p014C1.C0240b;
import p030F1.AbstractC0448m;
import p072O0.C1036g;
import p101U0.InterfaceC1469d;
import p120Y0.AbstractC1732a;
import p132a3.C1802b;
import p132a3.C1804d;

/* JADX INFO: renamed from: T0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1407g {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final float m2700c(int i5, int i6, float[] fArr) {
        return fArr[((i5 - i6) * 2) + 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0265 A[EDGE_INSN: B:203:0x0265->B:144:0x0265 BREAK  A[LOOP:5: B:154:0x0281->B:206:0x0281], EDGE_INSN: B:204:0x0265->B:144:0x0265 BREAK  A[LOOP:5: B:154:0x0281->B:206:0x0281]] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m2702e(C1410j c1410j, Layout layout, C0240b c0240b, int i5, RectF rectF, InterfaceC1469d interfaceC1469d, C0002B c0002b, boolean z5) {
        C1404d[] c1404dArr;
        int i6;
        C1404d[] c1404dArr2;
        int i7;
        int iMo41j;
        int i8;
        int i9;
        int iMo40i;
        Bidi bidiCreateLineBidi;
        boolean z6;
        float fM2111a;
        float fM2111a2;
        float fM2111a3;
        int lineTop = layout.getLineTop(i5);
        int lineBottom = layout.getLineBottom(i5);
        int lineStart = layout.getLineStart(i5);
        int lineEnd = layout.getLineEnd(i5);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i10 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i10];
        Layout layout2 = c1410j.f5044f;
        int lineStart2 = layout2.getLineStart(i5);
        int iM2710f = c1410j.m2710f(i5);
        if (i10 < (iM2710f - lineStart2) * 2) {
            AbstractC1732a.m3085a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        C1036g c1036g = new C1036g(c1410j);
        boolean z7 = false;
        boolean z8 = layout2.getParagraphDirection(i5) == 1;
        int i11 = 0;
        while (lineStart2 < iM2710f) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z8 && !zIsRtlCharAt) {
                fM2111a = c1036g.m2111a(lineStart2, z7, z7, true);
                fM2111a3 = c1036g.m2111a(lineStart2 + 1, true, true, true);
                z6 = z8;
            } else if (z8 && zIsRtlCharAt) {
                z6 = z8;
                fM2111a3 = c1036g.m2111a(lineStart2, false, false, false);
                fM2111a = c1036g.m2111a(lineStart2 + 1, true, true, false);
            } else {
                z6 = z8;
                if (zIsRtlCharAt) {
                    fM2111a2 = c1036g.m2111a(lineStart2, false, false, true);
                    fM2111a = c1036g.m2111a(lineStart2 + 1, true, true, true);
                } else {
                    fM2111a = c1036g.m2111a(lineStart2, false, false, false);
                    fM2111a2 = c1036g.m2111a(lineStart2 + 1, true, true, false);
                }
                fM2111a3 = fM2111a2;
            }
            fArr[i11] = fM2111a;
            fArr[i11 + 1] = fM2111a3;
            i11 += 2;
            lineStart2++;
            z8 = z6;
            z7 = false;
        }
        Layout layout3 = (Layout) c0240b.f808a;
        int lineStart3 = layout3.getLineStart(i5);
        int lineEnd2 = layout3.getLineEnd(i5);
        int iM434k = c0240b.m434k(lineStart3, false);
        int iM435l = c0240b.m435l(iM434k);
        int i12 = lineStart3 - iM435l;
        int i13 = lineEnd2 - iM435l;
        Bidi bidiM428e = c0240b.m428e(iM434k);
        if (bidiM428e == null || (bidiCreateLineBidi = bidiM428e.createLineBidi(i12, i13)) == null) {
            c1404dArr = new C1404d[]{new C1404d(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            c1404dArr = new C1404d[runCount];
            int i14 = 0;
            while (i14 < runCount) {
                int i15 = runCount;
                c1404dArr[i14] = new C1404d(bidiCreateLineBidi.getRunStart(i14) + lineStart3, bidiCreateLineBidi.getRunLimit(i14) + lineStart3, bidiCreateLineBidi.getRunLevel(i14) % 2 == 1);
                i14++;
                runCount = i15;
            }
        }
        C1802b c1804d = z5 ? new C1804d(0, c1404dArr.length - 1, 1) : new C1802b(c1404dArr.length - 1, 0, -1);
        int i16 = c1804d.f6140d;
        int i17 = c1804d.f6141e;
        int i18 = c1804d.f6142f;
        if ((i18 <= 0 || i16 > i17) && (i18 >= 0 || i17 > i16)) {
            return -1;
        }
        while (true) {
            C1404d c1404d = c1404dArr[i16];
            boolean z9 = c1404d.f5027c;
            int iMo46o = c1404d.f5025a;
            int iMo49r = c1404d.f5026b;
            float f2 = z9 ? fArr[((iMo49r - 1) - lineStart) * 2] : fArr[(iMo46o - lineStart) * 2];
            float fM2700c = z9 ? m2700c(iMo46o, lineStart, fArr) : m2700c(iMo49r - 1, lineStart, fArr);
            if (z5) {
                float f5 = rectF.left;
                if (fM2700c >= f5) {
                    i6 = i18;
                    float f6 = rectF.right;
                    if (f2 <= f6) {
                        if ((z9 || f5 > f2) && (!z9 || f6 < fM2700c)) {
                            int i19 = iMo49r;
                            int i20 = iMo46o;
                            while (true) {
                                i8 = i19;
                                if (i19 - i20 <= 1) {
                                    break;
                                }
                                int i21 = (i8 + i20) / 2;
                                float f7 = fArr[(i21 - lineStart) * 2];
                                if ((z9 || f7 <= rectF.left) && (!z9 || f7 >= rectF.right)) {
                                    i19 = i8;
                                    i20 = i21;
                                } else {
                                    i19 = i21;
                                }
                            }
                            i9 = z9 ? i8 : i20;
                        } else {
                            i9 = iMo46o;
                        }
                        int iMo41j2 = interfaceC1469d.mo41j(i9);
                        if (iMo41j2 != -1 && (iMo40i = interfaceC1469d.mo40i(iMo41j2)) < iMo49r) {
                            if (iMo40i >= iMo46o) {
                                iMo46o = iMo40i;
                            }
                            if (iMo41j2 > iMo49r) {
                                iMo41j2 = iMo49r;
                            }
                            c1404dArr2 = c1404dArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iMo41j3 = iMo41j2;
                            while (true) {
                                rectF2.left = z9 ? fArr[((iMo41j3 - 1) - lineStart) * 2] : fArr[(iMo46o - lineStart) * 2];
                                rectF2.right = z9 ? m2700c(iMo46o, lineStart, fArr) : m2700c(iMo41j3 - 1, lineStart, fArr);
                                if (((Boolean) c0002b.mo0g(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iMo46o = interfaceC1469d.mo46o(iMo46o);
                                if (iMo46o == -1 || iMo46o >= iMo49r) {
                                    break;
                                }
                                iMo41j3 = interfaceC1469d.mo41j(iMo46o);
                                if (iMo41j3 > iMo49r) {
                                    iMo41j3 = iMo49r;
                                }
                            }
                        }
                        iMo46o = -1;
                    }
                } else {
                    i6 = i18;
                }
                c1404dArr2 = c1404dArr;
                iMo46o = -1;
            } else {
                i6 = i18;
                c1404dArr2 = c1404dArr;
                float f8 = rectF.left;
                if (fM2700c >= f8) {
                    float f9 = rectF.right;
                    if (f2 > f9) {
                        iMo49r = -1;
                        iMo46o = iMo49r;
                    } else {
                        if ((z9 || f9 < fM2700c) && (!z9 || f8 > f2)) {
                            int i22 = iMo49r;
                            int i23 = iMo46o;
                            while (i22 - i23 > 1) {
                                int i24 = (i22 + i23) / 2;
                                float f10 = fArr[(i24 - lineStart) * 2];
                                int i25 = i22;
                                if ((z9 || f10 <= rectF.right) && (!z9 || f10 >= rectF.left)) {
                                    i22 = i25;
                                    i23 = i24;
                                } else {
                                    i22 = i24;
                                }
                            }
                            i7 = z9 ? i22 : i23;
                        } else {
                            i7 = iMo49r - 1;
                        }
                        int iMo40i2 = interfaceC1469d.mo40i(i7 + 1);
                        if (iMo40i2 != -1 && (iMo41j = interfaceC1469d.mo41j(iMo40i2)) > iMo46o) {
                            if (iMo40i2 < iMo46o) {
                                iMo40i2 = iMo46o;
                            }
                            if (iMo41j <= iMo49r) {
                                iMo49r = iMo41j;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iMo40i3 = iMo40i2;
                            while (true) {
                                rectF3.left = z9 ? fArr[((iMo49r - 1) - lineStart) * 2] : fArr[(iMo40i3 - lineStart) * 2];
                                rectF3.right = z9 ? m2700c(iMo40i3, lineStart, fArr) : m2700c(iMo49r - 1, lineStart, fArr);
                                if (((Boolean) c0002b.mo0g(rectF3, rectF)).booleanValue()) {
                                    break;
                                }
                                iMo49r = interfaceC1469d.mo49r(iMo49r);
                                if (iMo49r == -1 || iMo49r <= iMo46o) {
                                    break;
                                }
                                iMo40i3 = interfaceC1469d.mo40i(iMo49r);
                                if (iMo40i3 < iMo46o) {
                                    iMo40i3 = iMo46o;
                                }
                            }
                            iMo49r = -1;
                            iMo46o = iMo49r;
                        }
                    }
                }
            }
            if (iMo46o >= 0) {
                return iMo46o;
            }
            if (i16 == i17) {
                return -1;
            }
            i16 += i6;
            i18 = i6;
            c1404dArr = c1404dArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m2703f(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
