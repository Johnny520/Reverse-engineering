package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t9 {
    public final x9 a;
    public final int b;
    public final long c;
    public final w03 d;
    public final CharSequence e;
    public final List f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t9(x9 x9Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        lt2 lt2Var;
        int i8;
        int i9;
        int i10;
        char c;
        lt2 lt2Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        w03 w03VarA;
        int i11;
        t9 t9Var;
        int i12;
        int i13;
        int i14;
        Layout layout;
        aq2[] aq2VarArr;
        CharSequence charSequence;
        List list;
        o62 o62Var;
        float fJ;
        int iC;
        float fI;
        int iC2;
        int i15;
        this.a = x9Var;
        this.b = i;
        this.c = j;
        if (fz.i(j) != 0 || fz.j(j) != 0) {
            lz0.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            lz0.a("maxLines should be greater than 0");
        }
        m13 m13Var = x9Var.b;
        CharSequence charSequence2 = x9Var.h;
        if (i2 == 2) {
            i3 = 0;
            if (!p13.a(m13Var.a.h, rg3.D(0)) && !p13.a(m13Var.a.h, p13.c) && (i15 = m13Var.b.a) != 0 && i15 != 5 && i15 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!sp0.E(spannableString, fy0.class)) {
                    spannableString.setSpan(new fy0(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        vw1 vw1Var = m13Var.b;
        lt2 lt2Var3 = m13Var.a;
        int i16 = vw1Var.a;
        int i17 = 3;
        int i18 = i16 == 1 ? 3 : i16 == 2 ? 4 : i16 == 3 ? 2 : (i16 != 5 && i16 == 6) ? 1 : i3;
        int i19 = i16 == 4 ? 1 : i3;
        int i20 = vw1Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i21 = vw1Var.g;
        int i22 = i21 & 255;
        if (i22 != 1) {
            if (i22 == 2) {
                i4 = i21;
                i5 = i19;
                i6 = 1;
            } else if (i22 == 3) {
                i4 = i21;
                i5 = i19;
                i6 = 2;
            } else {
                i4 = i21;
                i5 = i19;
                i6 = i3;
            }
        }
        int i23 = (i4 >> 8) & 255;
        if (i23 != 1) {
            if (i23 == 2) {
                i17 = 1;
            } else if (i23 == 3) {
                i17 = 2;
            } else if (i23 != 4) {
                i17 = i3;
            }
        }
        int i24 = (i4 >> 16) & 255;
        if (i24 != 1) {
            i7 = 2;
            if (i24 == 2) {
                lt2Var = lt2Var3;
                i8 = i18;
                i9 = 1;
            }
            if (i2 != i7) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else {
                if (i2 != 4) {
                    i10 = i20;
                    c = ' ';
                    lt2Var2 = lt2Var;
                    truncateAt = null;
                    w03VarA = a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
                    Layout layout2 = w03VarA.f;
                    i11 = i8;
                    if (Build.VERSION.SDK_INT >= 35 || x9Var.g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        t9Var = this;
                        i12 = i;
                        i13 = i11;
                        i14 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i14 = 2;
                        CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                        t9Var = this;
                        i12 = i;
                        i13 = i11;
                        w03VarA = t9Var.a(i13, i5, truncateAt, i12, i10, i6, i17, i9, TextUtils.concat(charSequenceArr));
                    }
                    int i25 = w03VarA.g;
                    if (i2 != i14 || w03VarA.a() <= fz.g(j) || i12 <= 1) {
                        t9Var.d = w03VarA;
                    } else {
                        int iG = fz.g(j);
                        int i26 = 0;
                        while (true) {
                            if (i26 >= i25) {
                                i26 = i25;
                                break;
                            } else if (w03VarA.e(i26) > iG) {
                                break;
                            } else {
                                i26++;
                            }
                        }
                        if (i26 >= 0 && i26 != t9Var.b) {
                            w03VarA = t9Var.a(i13, i5, truncateAt, i26 < 1 ? 1 : i26, i10, i6, i17, i9, t9Var.e);
                        }
                        t9Var.d = w03VarA;
                    }
                    t9Var.a.g.c(lt2Var2.a.k(), (((long) Float.floatToRawIntBits(t9Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(t9Var.d())) << c), lt2Var2.a.a());
                    layout = t9Var.d.f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        Spanned spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), aq2.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            aq2VarArr = (aq2[]) ((Spanned) text2).getSpans(0, layout.getText().length(), aq2.class);
                        }
                    } else {
                        aq2VarArr = null;
                    }
                    if (aq2VarArr != null) {
                        for (aq2 aq2Var : aq2VarArr) {
                            aq2Var.j.setValue(new gr2((((long) Float.floatToRawIntBits(t9Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(t9Var.d())) << c)));
                        }
                    }
                    charSequence = t9Var.e;
                    if (charSequence instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence;
                        Object[] spans = spanned2.getSpans(0, charSequence.length(), vz1.class);
                        ArrayList arrayList = new ArrayList(spans.length);
                        for (Object obj : spans) {
                            vz1 vz1Var = (vz1) obj;
                            int spanStart = spanned2.getSpanStart(vz1Var);
                            int spanEnd = spanned2.getSpanEnd(vz1Var);
                            int iG2 = t9Var.d.g(spanStart);
                            boolean z = iG2 >= t9Var.b;
                            boolean z2 = t9Var.d.f.getEllipsisCount(iG2) > 0 && spanEnd > t9Var.d.f.getEllipsisStart(iG2) + t9Var.d.f.getLineStart(iG2);
                            boolean z3 = spanEnd > t9Var.d.f(iG2);
                            if (z2 || z3 || z) {
                                o62Var = null;
                            } else {
                                boolean z4 = t9Var.d.f.getParagraphDirection(iG2) == 1;
                                boolean zIsRtlCharAt = t9Var.d.f.isRtlCharAt(spanStart);
                                if (!z4 || zIsRtlCharAt) {
                                    if (z4 && zIsRtlCharAt) {
                                        fI = t9Var.d.j(spanStart, false);
                                        iC2 = vz1Var.c();
                                    } else {
                                        w03 w03Var = t9Var.d;
                                        if (zIsRtlCharAt) {
                                            fI = w03Var.i(spanStart, false);
                                            iC2 = vz1Var.c();
                                        } else {
                                            fJ = w03Var.j(spanStart, false);
                                            iC = vz1Var.c();
                                        }
                                    }
                                    fJ = fI - iC2;
                                    w03 w03Var2 = t9Var.d;
                                    vz1Var.getClass();
                                    float fD = w03Var2.d(iG2) - vz1Var.b();
                                    o62Var = new o62(fJ, fD, fI, vz1Var.b() + fD);
                                } else {
                                    fJ = t9Var.d.i(spanStart, false);
                                    iC = vz1Var.c();
                                }
                                fI = iC + fJ;
                                w03 w03Var22 = t9Var.d;
                                vz1Var.getClass();
                                float fD2 = w03Var22.d(iG2) - vz1Var.b();
                                o62Var = new o62(fJ, fD2, fI, vz1Var.b() + fD2);
                            }
                            arrayList.add(o62Var);
                        }
                        list = arrayList;
                    } else {
                        list = be0.h;
                    }
                    t9Var.f = list;
                }
                truncateAt2 = TextUtils.TruncateAt.START;
            }
            i10 = i20;
            c = ' ';
            lt2Var2 = lt2Var;
            truncateAt = truncateAt2;
            w03VarA = a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
            Layout layout22 = w03VarA.f;
            i11 = i8;
            if (Build.VERSION.SDK_INT >= 35) {
                t9Var = this;
                i12 = i;
                i13 = i11;
                i14 = 2;
            }
            int i252 = w03VarA.g;
            if (i2 != i14) {
                t9Var.d = w03VarA;
            }
            t9Var.a.g.c(lt2Var2.a.k(), (((long) Float.floatToRawIntBits(t9Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(t9Var.d())) << c), lt2Var2.a.a());
            layout = t9Var.d.f;
            if (layout.getText() instanceof Spanned) {
            }
            if (aq2VarArr != null) {
            }
            charSequence = t9Var.e;
            if (charSequence instanceof Spanned) {
            }
            t9Var.f = list;
        }
        i7 = 2;
        lt2Var = lt2Var3;
        i8 = i18;
        i9 = i3;
        if (i2 != i7) {
        }
        i10 = i20;
        c = ' ';
        lt2Var2 = lt2Var;
        truncateAt = truncateAt2;
        w03VarA = a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
        Layout layout222 = w03VarA.f;
        i11 = i8;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        int i2522 = w03VarA.g;
        if (i2 != i14) {
        }
        t9Var.a.g.c(lt2Var2.a.k(), (((long) Float.floatToRawIntBits(t9Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(t9Var.d())) << c), lt2Var2.a.a());
        layout = t9Var.d.f;
        if (layout.getText() instanceof Spanned) {
        }
        if (aq2VarArr != null) {
        }
        charSequence = t9Var.e;
        if (charSequence instanceof Spanned) {
        }
        t9Var.f = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final w03 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        k02 k02Var;
        float fD = d();
        x9 x9Var = this.a;
        qb qbVar = x9Var.g;
        int i8 = x9Var.k;
        g61 g61Var = x9Var.i;
        m13 m13Var = x9Var.b;
        u9 u9Var = v9.a;
        w02 w02Var = m13Var.c;
        return new w03(charSequence, fD, qbVar, i, truncateAt, i8, (w02Var == null || (k02Var = w02Var.a) == null) ? false : k02Var.a, i3, i5, i6, i7, i4, i2, g61Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b() {
        return this.d.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Type inference failed for: r10v26, types: [g9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(o62 o62Var, int i, um2 um2Var) {
        om2 lq0Var;
        int i2;
        int[] rangeForRect;
        SegmentFinder segmentFinderG;
        RectF rectFO0 = rp0.o0(o62Var);
        int i3 = 0;
        boolean z = i != 0 && i == 1;
        final s9 s9Var = new s9(i3, um2Var);
        w03 w03Var = this.d;
        TextPaint textPaint = w03Var.a;
        Layout layout = w03Var.f;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 22;
        if (i4 >= 34) {
            if (z) {
                segmentFinderG = new qe(new dq1(i5, layout.getText(), w03Var.k()));
            } else {
                f9.i();
                segmentFinderG = f9.g(f9.f(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFO0, segmentFinderG, new Layout.TextInclusionStrategy() { // from class: g9
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) s9Var.g(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            cj cjVarC = w03Var.c();
            if (z) {
                lq0Var = new dq1(i5, layout.getText(), w03Var.k());
            } else {
                CharSequence text = layout.getText();
                lq0Var = i4 >= 29 ? new lq0(text, textPaint) : new mq0(text);
            }
            om2 om2Var = lq0Var;
            int lineForVertical = layout.getLineForVertical((int) rectFO0.top);
            if (rectFO0.top <= w03Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < w03Var.g) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFO0.bottom);
                if (lineForVertical2 != 0 || rectFO0.bottom >= w03Var.h(0)) {
                    int iY = gf1.y(w03Var, layout, cjVarC, i6, rectFO0, om2Var, s9Var, true);
                    while (true) {
                        i2 = i6;
                        if (iY != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i6 = i2 + 1;
                        iY = gf1.y(w03Var, layout, cjVarC, i6, rectFO0, om2Var, s9Var, true);
                    }
                    if (iY == -1) {
                        rangeForRect = null;
                    } else {
                        int i7 = lineForVertical2;
                        int iY2 = gf1.y(w03Var, layout, cjVarC, i7, rectFO0, om2Var, s9Var, false);
                        while (iY2 == -1 && i2 < i7) {
                            i7--;
                            iY2 = gf1.y(w03Var, layout, cjVarC, i7, rectFO0, om2Var, s9Var, false);
                        }
                        if (iY2 != -1) {
                            rangeForRect = new int[]{om2Var.b(iY + 1), om2Var.c(iY2 - 1)};
                        }
                    }
                }
            }
        }
        return rangeForRect == null ? f13.b : fg1.i(rangeForRect[0], rangeForRect[1]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d() {
        return fz.h(this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(qp qpVar) {
        Canvas canvasA = g6.a(qpVar);
        w03 w03Var = this.d;
        if (w03Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = w03Var.h;
        if (canvasA.getClipBounds(w03Var.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = a13.a;
            Object my2Var = threadLocal.get();
            if (my2Var == null) {
                my2Var = new my2();
                threadLocal.set(my2Var);
            }
            my2 my2Var2 = (my2) my2Var;
            my2Var2.a = canvasA;
            try {
                w03Var.f.draw(my2Var2);
                if (i != 0) {
                    canvasA.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                my2Var2.a = null;
            }
        }
        if (w03Var.d) {
            canvasA.restore();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(qp qpVar, long j, bq2 bq2Var, gz2 gz2Var, op0 op0Var) {
        qb qbVar = this.a.g;
        int i = qbVar.c;
        qbVar.d(j);
        qbVar.f(bq2Var);
        qbVar.g(gz2Var);
        qbVar.e(op0Var);
        qbVar.b(3);
        e(qpVar);
        qbVar.b(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(qp qpVar, an anVar, float f, bq2 bq2Var, gz2 gz2Var, op0 op0Var) {
        qb qbVar = this.a.g;
        int i = qbVar.c;
        float fD = d();
        qbVar.c(anVar, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f);
        qbVar.f(bq2Var);
        qbVar.g(gz2Var);
        qbVar.e(op0Var);
        qbVar.b(3);
        e(qpVar);
        qbVar.b(i);
    }
}
