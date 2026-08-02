package p000;

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

/* JADX INFO: renamed from: t9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0726t9 {

    /* JADX INFO: renamed from: a */
    public final C0878x9 f10613a;

    /* JADX INFO: renamed from: b */
    public final int f10614b;

    /* JADX INFO: renamed from: c */
    public final long f10615c;

    /* JADX INFO: renamed from: d */
    public final w03 f10616d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f10617e;

    /* JADX INFO: renamed from: f */
    public final List f10618f;

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
    public C0726t9(C0878x9 c0878x9, int i, int i2, long j) {
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
        w03 w03VarM5135a;
        int i11;
        C0726t9 c0726t9;
        int i12;
        int i13;
        int i14;
        Layout layout;
        aq2[] aq2VarArr;
        CharSequence charSequence;
        List list;
        o62 o62Var;
        float fM5823j;
        int iM5813c;
        float fM5822i;
        int iM5813c2;
        int i15;
        this.f10613a = c0878x9;
        this.f10614b = i;
        this.f10615c = j;
        if (C0221fz.m1764i(j) != 0 || C0221fz.m1765j(j) != 0) {
            lz0.m2988a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            lz0.m2988a("maxLines should be greater than 0");
        }
        m13 m13Var = c0878x9.f12901b;
        CharSequence charSequence2 = c0878x9.f12907h;
        if (i2 == 2) {
            i3 = 0;
            if (!p13.m3673a(m13Var.f6435a.f6308h, rg3.m4450D(0)) && !p13.m3673a(m13Var.f6435a.f6308h, p13.f7928c) && (i15 = m13Var.f6436b.f12198a) != 0 && i15 != 5 && i15 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!sp0.m4909E(spannableString, fy0.class)) {
                    spannableString.setSpan(new fy0(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.f10617e = charSequence3;
        vw1 vw1Var = m13Var.f6436b;
        lt2 lt2Var3 = m13Var.f6435a;
        int i16 = vw1Var.f12198a;
        int i17 = 3;
        int i18 = i16 == 1 ? 3 : i16 == 2 ? 4 : i16 == 3 ? 2 : (i16 != 5 && i16 == 6) ? 1 : i3;
        int i19 = i16 == 4 ? 1 : i3;
        int i20 = vw1Var.f12205h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i21 = vw1Var.f12204g;
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
                    w03VarM5135a = m5135a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
                    Layout layout2 = w03VarM5135a.f12246f;
                    i11 = i8;
                    if (Build.VERSION.SDK_INT >= 35 || c0878x9.f12906g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        c0726t9 = this;
                        i12 = i;
                        i13 = i11;
                        i14 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i14 = 2;
                        CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                        c0726t9 = this;
                        i12 = i;
                        i13 = i11;
                        w03VarM5135a = c0726t9.m5135a(i13, i5, truncateAt, i12, i10, i6, i17, i9, TextUtils.concat(charSequenceArr));
                    }
                    int i25 = w03VarM5135a.f12247g;
                    if (i2 != i14 || w03VarM5135a.m5814a() <= C0221fz.m1762g(j) || i12 <= 1) {
                        c0726t9.f10616d = w03VarM5135a;
                    } else {
                        int iM1762g = C0221fz.m1762g(j);
                        int i26 = 0;
                        while (true) {
                            if (i26 >= i25) {
                                i26 = i25;
                                break;
                            } else if (w03VarM5135a.m5818e(i26) > iM1762g) {
                                break;
                            } else {
                                i26++;
                            }
                        }
                        if (i26 >= 0 && i26 != c0726t9.f10614b) {
                            w03VarM5135a = c0726t9.m5135a(i13, i5, truncateAt, i26 < 1 ? 1 : i26, i10, i6, i17, i9, c0726t9.f10617e);
                        }
                        c0726t9.f10616d = w03VarM5135a;
                    }
                    c0726t9.f10613a.f12906g.m4108c(lt2Var2.f6301a.mo865k(), (((long) Float.floatToRawIntBits(c0726t9.m5136b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0726t9.m5138d())) << c), lt2Var2.f6301a.mo863a());
                    layout = c0726t9.f10616d.f12246f;
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
                            aq2Var.f338j.setValue(new gr2((((long) Float.floatToRawIntBits(c0726t9.m5136b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0726t9.m5138d())) << c)));
                        }
                    }
                    charSequence = c0726t9.f10617e;
                    if (charSequence instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence;
                        Object[] spans = spanned2.getSpans(0, charSequence.length(), vz1.class);
                        ArrayList arrayList = new ArrayList(spans.length);
                        for (Object obj : spans) {
                            vz1 vz1Var = (vz1) obj;
                            int spanStart = spanned2.getSpanStart(vz1Var);
                            int spanEnd = spanned2.getSpanEnd(vz1Var);
                            int iM5820g = c0726t9.f10616d.m5820g(spanStart);
                            boolean z = iM5820g >= c0726t9.f10614b;
                            boolean z2 = c0726t9.f10616d.f12246f.getEllipsisCount(iM5820g) > 0 && spanEnd > c0726t9.f10616d.f12246f.getEllipsisStart(iM5820g) + c0726t9.f10616d.f12246f.getLineStart(iM5820g);
                            boolean z3 = spanEnd > c0726t9.f10616d.m5819f(iM5820g);
                            if (z2 || z3 || z) {
                                o62Var = null;
                            } else {
                                boolean z4 = c0726t9.f10616d.f12246f.getParagraphDirection(iM5820g) == 1;
                                boolean zIsRtlCharAt = c0726t9.f10616d.f12246f.isRtlCharAt(spanStart);
                                if (!z4 || zIsRtlCharAt) {
                                    if (z4 && zIsRtlCharAt) {
                                        fM5822i = c0726t9.f10616d.m5823j(spanStart, false);
                                        iM5813c2 = vz1Var.m5813c();
                                    } else {
                                        w03 w03Var = c0726t9.f10616d;
                                        if (zIsRtlCharAt) {
                                            fM5822i = w03Var.m5822i(spanStart, false);
                                            iM5813c2 = vz1Var.m5813c();
                                        } else {
                                            fM5823j = w03Var.m5823j(spanStart, false);
                                            iM5813c = vz1Var.m5813c();
                                        }
                                    }
                                    fM5823j = fM5822i - iM5813c2;
                                    w03 w03Var2 = c0726t9.f10616d;
                                    vz1Var.getClass();
                                    float fM5817d = w03Var2.m5817d(iM5820g) - vz1Var.m5812b();
                                    o62Var = new o62(fM5823j, fM5817d, fM5822i, vz1Var.m5812b() + fM5817d);
                                } else {
                                    fM5823j = c0726t9.f10616d.m5822i(spanStart, false);
                                    iM5813c = vz1Var.m5813c();
                                }
                                fM5822i = iM5813c + fM5823j;
                                w03 w03Var22 = c0726t9.f10616d;
                                vz1Var.getClass();
                                float fM5817d2 = w03Var22.m5817d(iM5820g) - vz1Var.m5812b();
                                o62Var = new o62(fM5823j, fM5817d2, fM5822i, vz1Var.m5812b() + fM5817d2);
                            }
                            arrayList.add(o62Var);
                        }
                        list = arrayList;
                    } else {
                        list = be0.f819h;
                    }
                    c0726t9.f10618f = list;
                }
                truncateAt2 = TextUtils.TruncateAt.START;
            }
            i10 = i20;
            c = ' ';
            lt2Var2 = lt2Var;
            truncateAt = truncateAt2;
            w03VarM5135a = m5135a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
            Layout layout22 = w03VarM5135a.f12246f;
            i11 = i8;
            if (Build.VERSION.SDK_INT >= 35) {
                c0726t9 = this;
                i12 = i;
                i13 = i11;
                i14 = 2;
            }
            int i252 = w03VarM5135a.f12247g;
            if (i2 != i14) {
                c0726t9.f10616d = w03VarM5135a;
            }
            c0726t9.f10613a.f12906g.m4108c(lt2Var2.f6301a.mo865k(), (((long) Float.floatToRawIntBits(c0726t9.m5136b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0726t9.m5138d())) << c), lt2Var2.f6301a.mo863a());
            layout = c0726t9.f10616d.f12246f;
            if (layout.getText() instanceof Spanned) {
            }
            if (aq2VarArr != null) {
            }
            charSequence = c0726t9.f10617e;
            if (charSequence instanceof Spanned) {
            }
            c0726t9.f10618f = list;
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
        w03VarM5135a = m5135a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
        Layout layout222 = w03VarM5135a.f12246f;
        i11 = i8;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        int i2522 = w03VarM5135a.f12247g;
        if (i2 != i14) {
        }
        c0726t9.f10613a.f12906g.m4108c(lt2Var2.f6301a.mo865k(), (((long) Float.floatToRawIntBits(c0726t9.m5136b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0726t9.m5138d())) << c), lt2Var2.f6301a.mo863a());
        layout = c0726t9.f10616d.f12246f;
        if (layout.getText() instanceof Spanned) {
        }
        if (aq2VarArr != null) {
        }
        charSequence = c0726t9.f10617e;
        if (charSequence instanceof Spanned) {
        }
        c0726t9.f10618f = list;
    }

    /* JADX INFO: renamed from: a */
    public final w03 m5135a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        k02 k02Var;
        float fM5138d = m5138d();
        C0878x9 c0878x9 = this.f10613a;
        C0613qb c0613qb = c0878x9.f12906g;
        int i8 = c0878x9.f12910k;
        g61 g61Var = c0878x9.f12908i;
        m13 m13Var = c0878x9.f12901b;
        C0765u9 c0765u9 = AbstractC0802v9.f11845a;
        w02 w02Var = m13Var.f6437c;
        return new w03(charSequence, fM5138d, c0613qb, i, truncateAt, i8, (w02Var == null || (k02Var = w02Var.f12240a) == null) ? false : k02Var.f5294a, i3, i5, i6, i7, i4, i2, g61Var);
    }

    /* JADX INFO: renamed from: b */
    public final float m5136b() {
        return this.f10616d.m5814a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Type inference failed for: r10v26, types: [g9] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m5137c(o62 o62Var, int i, um2 um2Var) {
        om2 lq0Var;
        int i2;
        int[] rangeForRect;
        SegmentFinder segmentFinderM1567g;
        RectF rectFM4554o0 = rp0.m4554o0(o62Var);
        int i3 = 0;
        boolean z = i != 0 && i == 1;
        final C0686s9 c0686s9 = new C0686s9(i3, um2Var);
        w03 w03Var = this.f10616d;
        TextPaint textPaint = w03Var.f12241a;
        Layout layout = w03Var.f12246f;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 22;
        if (i4 >= 34) {
            if (z) {
                segmentFinderM1567g = new C0616qe(new dq1(i5, layout.getText(), w03Var.m5824k()));
            } else {
                AbstractC0195f9.m1569i();
                segmentFinderM1567g = AbstractC0195f9.m1567g(AbstractC0195f9.m1566f(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFM4554o0, segmentFinderM1567g, new Layout.TextInclusionStrategy() { // from class: g9
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) c0686s9.mo12g(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            C0093cj c0093cjM5816c = w03Var.m5816c();
            if (z) {
                lq0Var = new dq1(i5, layout.getText(), w03Var.m5824k());
            } else {
                CharSequence text = layout.getText();
                lq0Var = i4 >= 29 ? new lq0(text, textPaint) : new mq0(text);
            }
            om2 om2Var = lq0Var;
            int lineForVertical = layout.getLineForVertical((int) rectFM4554o0.top);
            if (rectFM4554o0.top <= w03Var.m5818e(lineForVertical) || (lineForVertical = lineForVertical + 1) < w03Var.f12247g) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFM4554o0.bottom);
                if (lineForVertical2 != 0 || rectFM4554o0.bottom >= w03Var.m5821h(0)) {
                    int iM1907y = gf1.m1907y(w03Var, layout, c0093cjM5816c, i6, rectFM4554o0, om2Var, c0686s9, true);
                    while (true) {
                        i2 = i6;
                        if (iM1907y != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i6 = i2 + 1;
                        iM1907y = gf1.m1907y(w03Var, layout, c0093cjM5816c, i6, rectFM4554o0, om2Var, c0686s9, true);
                    }
                    if (iM1907y == -1) {
                        rangeForRect = null;
                    } else {
                        int i7 = lineForVertical2;
                        int iM1907y2 = gf1.m1907y(w03Var, layout, c0093cjM5816c, i7, rectFM4554o0, om2Var, c0686s9, false);
                        while (iM1907y2 == -1 && i2 < i7) {
                            i7--;
                            iM1907y2 = gf1.m1907y(w03Var, layout, c0093cjM5816c, i7, rectFM4554o0, om2Var, c0686s9, false);
                        }
                        if (iM1907y2 != -1) {
                            rangeForRect = new int[]{om2Var.mo1102b(iM1907y + 1), om2Var.mo1103c(iM1907y2 - 1)};
                        }
                    }
                }
            }
        }
        return rangeForRect == null ? f13.f2737b : fg1.m1636i(rangeForRect[0], rangeForRect[1]);
    }

    /* JADX INFO: renamed from: d */
    public final float m5138d() {
        return C0221fz.m1763h(this.f10615c);
    }

    /* JADX INFO: renamed from: e */
    public final void m5139e(InterfaceC0627qp interfaceC0627qp) {
        Canvas canvasM1806a = AbstractC0229g6.m1806a(interfaceC0627qp);
        w03 w03Var = this.f10616d;
        if (w03Var.f12244d) {
            canvasM1806a.save();
            canvasM1806a.clipRect(0.0f, 0.0f, m5138d(), m5136b());
        }
        int i = w03Var.f12248h;
        if (canvasM1806a.getClipBounds(w03Var.f12256p)) {
            if (i != 0) {
                canvasM1806a.translate(0.0f, i);
            }
            ThreadLocal threadLocal = a13.f30a;
            Object my2Var = threadLocal.get();
            if (my2Var == null) {
                my2Var = new my2();
                threadLocal.set(my2Var);
            }
            my2 my2Var2 = (my2) my2Var;
            my2Var2.f6922a = canvasM1806a;
            try {
                w03Var.f12246f.draw(my2Var2);
                if (i != 0) {
                    canvasM1806a.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                my2Var2.f6922a = null;
            }
        }
        if (w03Var.f12244d) {
            canvasM1806a.restore();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5140f(InterfaceC0627qp interfaceC0627qp, long j, bq2 bq2Var, gz2 gz2Var, op0 op0Var) {
        C0613qb c0613qb = this.f10613a.f12906g;
        int i = c0613qb.f8865c;
        c0613qb.m4109d(j);
        c0613qb.m4111f(bq2Var);
        c0613qb.m4112g(gz2Var);
        c0613qb.m4110e(op0Var);
        c0613qb.m4107b(3);
        m5139e(interfaceC0627qp);
        c0613qb.m4107b(i);
    }

    /* JADX INFO: renamed from: g */
    public final void m5141g(InterfaceC0627qp interfaceC0627qp, AbstractC0024an abstractC0024an, float f, bq2 bq2Var, gz2 gz2Var, op0 op0Var) {
        C0613qb c0613qb = this.f10613a.f12906g;
        int i = c0613qb.f8865c;
        float fM5138d = m5138d();
        c0613qb.m4108c(abstractC0024an, (((long) Float.floatToRawIntBits(m5136b())) & 4294967295L) | (Float.floatToRawIntBits(fM5138d) << 32), f);
        c0613qb.m4111f(bq2Var);
        c0613qb.m4112g(gz2Var);
        c0613qb.m4110e(op0Var);
        c0613qb.m4107b(3);
        m5139e(interfaceC0627qp);
        c0613qb.m4107b(i);
    }
}
