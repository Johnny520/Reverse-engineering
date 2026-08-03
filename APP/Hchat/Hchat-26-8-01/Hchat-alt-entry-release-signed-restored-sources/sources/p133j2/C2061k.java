package p133j2;

import ai.AbstractC0088a;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import be.C0289k;
import p035c8.C0412a;
import p136j8.C2104o;
import p161l2.C2436a;
import p161l2.C2443h;
import p204o2.AbstractC3042a;
import p343x6.AbstractC5700d;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: j2.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2061k {

    /* JADX INFO: renamed from: a */
    public final TextPaint f6915a;

    /* JADX INFO: renamed from: b */
    public final TextUtils.TruncateAt f6916b;

    /* JADX INFO: renamed from: c */
    public final boolean f6917c;

    /* JADX INFO: renamed from: d */
    public final boolean f6918d;

    /* JADX INFO: renamed from: e */
    public C0412a f6919e;

    /* JADX INFO: renamed from: f */
    public final Layout f6920f;

    /* JADX INFO: renamed from: g */
    public final int f6921g;

    /* JADX INFO: renamed from: h */
    public final int f6922h;

    /* JADX INFO: renamed from: i */
    public final int f6923i;

    /* JADX INFO: renamed from: j */
    public final float f6924j;

    /* JADX INFO: renamed from: k */
    public final float f6925k;

    /* JADX INFO: renamed from: l */
    public final boolean f6926l;

    /* JADX INFO: renamed from: m */
    public final Paint.FontMetricsInt f6927m;

    /* JADX INFO: renamed from: n */
    public final int f6928n;

    /* JADX INFO: renamed from: o */
    public final C2443h[] f6929o;

    /* JADX INFO: renamed from: p */
    public final Rect f6930p = new Rect();

    /* JADX INFO: renamed from: q */
    public C0289k f6931q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ac A[PHI: r7 r22
  0x01ac: PHI (r7v7 int) = (r7v6 int), (r7v9 int) binds: [B:99:0x01c0, B:92:0x01a5] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r22v5 java.lang.Throwable) = (r22v4 java.lang.Throwable), (r22v7 java.lang.Throwable) binds: [B:99:0x01c0, B:92:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2061k(CharSequence charSequence, float f3, TextPaint textPaint, int i9, TextUtils.TruncateAt truncateAt, int i10, boolean z9, int i11, int i12, int i13, int i14, int i15, int i16, C2056f c2056f) throws Throwable {
        int i17;
        int i18;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutM5101a;
        C2443h[] c2443hArr;
        int i19;
        int i20;
        Throwable th2;
        char c10;
        long j3;
        int i21;
        int i22;
        long jM5119a;
        ?? IsFallbackLineSpacingEnabled;
        long jM5119a2;
        ?? r72;
        C2443h c2443h;
        C2443h c2443h2;
        int i23;
        this.f6915a = textPaint;
        this.f6916b = truncateAt;
        this.f6917c = z9;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM5120b = AbstractC2062l.m5120b(i10);
        Layout.Alignment alignment = AbstractC2059i.f6912a;
        Layout.Alignment alignment2 = i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? Layout.Alignment.ALIGN_NORMAL : AbstractC2059i.f6913b : AbstractC2059i.f6912a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z10 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C2436a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsM5098a = c2056f.m5098a();
            double d10 = f3;
            int iCeil = (int) Math.ceil(d10);
            if (metricsM5098a == null || c2056f.m5100c() > f3 || z10) {
                i17 = 0;
                this.f6926l = false;
                i18 = i11;
                textDirectionHeuristic = textDirectionHeuristicM5120b;
                layoutM5101a = AbstractC2057g.m5101a(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i18, truncateAt, (int) Math.ceil(d10), i16, z9, i12, i13, i14, i15);
            } else {
                this.f6926l = true;
                if (iCeil < 0) {
                    AbstractC3042a.m6486a("negative width");
                }
                if (iCeil < 0) {
                    AbstractC3042a.m6486a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    layoutM5101a = AbstractC0088a.m484j(charSequence, textPaint, iCeil, alignment2, metricsM5098a, z9, truncateAt, iCeil);
                    i17 = 0;
                } else {
                    i17 = 0;
                    layoutM5101a = new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsM5098a, z9, truncateAt, iCeil);
                }
                i18 = i11;
                textDirectionHeuristic = textDirectionHeuristicM5120b;
            }
            this.f6920f = layoutM5101a;
            Trace.endSection();
            int iMin = Math.min(layoutM5101a.getLineCount(), i18);
            this.f6921g = iMin;
            int i24 = iMin - 1;
            this.f6918d = (iMin >= i18 && (layoutM5101a.getEllipsisCount(i24) > 0 || layoutM5101a.getLineEnd(i24) != charSequence.length())) ? 1 : i17;
            if (layoutM5101a.getText() instanceof Spanned) {
                CharSequence text = layoutM5101a.getText();
                text.getClass();
                if (AbstractC2057g.m5106f((Spanned) text, C2443h.class) || layoutM5101a.getText().length() <= 0) {
                    CharSequence text2 = layoutM5101a.getText();
                    text2.getClass();
                    c2443hArr = (C2443h[]) ((Spanned) text2).getSpans(i17, layoutM5101a.getText().length(), C2443h.class);
                }
            } else {
                c2443hArr = null;
            }
            this.f6929o = c2443hArr;
            if (c2443hArr == null || (c2443h2 = (C2443h) AbstractC4165l.m8391z0(c2443hArr)) == null) {
                i19 = 2;
                i20 = i17;
            } else {
                if (c2443h2.f8031i) {
                    i19 = 2;
                    i23 = c2443h2.f8034l == 2 ? 1 : i23;
                    i20 = i23;
                } else {
                    i19 = 2;
                }
                i23 = i17;
                i20 = i23;
            }
            int i25 = (c2443hArr == null || (c2443h = (C2443h) AbstractC4165l.m8391z0(c2443hArr)) == null || !c2443h.f8032j || c2443h.f8034l != i19) ? i17 : 1;
            if (i20 == 0 || i25 == 0) {
                long jM5119a3 = AbstractC2062l.f6933b;
                if (z9) {
                    th2 = null;
                    c10 = ' ';
                    j3 = 4294967295L;
                    i21 = 33;
                } else if (this.f6926l) {
                    th2 = null;
                    i21 = 33;
                    IsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= 33 ? ((BoringLayout) layoutM5101a).isFallbackLineSpacingEnabled() : i17;
                    if (IsFallbackLineSpacingEnabled == 0) {
                        c10 = ' ';
                        j3 = 4294967295L;
                    } else {
                        TextPaint paint = layoutM5101a.getPaint();
                        CharSequence text3 = layoutM5101a.getText();
                        c10 = ' ';
                        j3 = 4294967295L;
                        Rect rectM5102b = AbstractC2057g.m5102b(paint, text3, layoutM5101a.getLineStart(i17), layoutM5101a.getLineEnd(i17));
                        int lineAscent = layoutM5101a.getLineAscent(i17);
                        int i26 = rectM5102b.top;
                        int topPadding = i26 < lineAscent ? lineAscent - i26 : layoutM5101a.getTopPadding();
                        i22 = 1;
                        rectM5102b = iMin != 1 ? AbstractC2057g.m5102b(paint, text3, layoutM5101a.getLineStart(i24), layoutM5101a.getLineEnd(i24)) : rectM5102b;
                        int lineDescent = layoutM5101a.getLineDescent(i24);
                        int i27 = rectM5102b.bottom;
                        int bottomPadding = i27 > lineDescent ? i27 - lineDescent : layoutM5101a.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jM5119a3 = AbstractC2062l.m5119a(topPadding, bottomPadding);
                        }
                        jM5119a = AbstractC2062l.m5119a(i20 == 0 ? i17 : (int) (jM5119a3 >> c10), i25 == 0 ? i17 : (int) (jM5119a3 & j3));
                    }
                } else {
                    th2 = null;
                    i21 = 33;
                    StaticLayout staticLayout = (StaticLayout) layoutM5101a;
                    int i28 = Build.VERSION.SDK_INT;
                    if (i28 >= 33) {
                        IsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                    } else if (i28 >= 28) {
                        IsFallbackLineSpacingEnabled = 1;
                    }
                    if (IsFallbackLineSpacingEnabled == 0) {
                    }
                }
                i22 = 1;
                jM5119a = AbstractC2062l.m5119a(i20 == 0 ? i17 : (int) (jM5119a3 >> c10), i25 == 0 ? i17 : (int) (jM5119a3 & j3));
            } else {
                jM5119a = AbstractC2062l.f6933b;
                th2 = null;
                c10 = ' ';
                j3 = 4294967295L;
                i21 = 33;
                i22 = 1;
            }
            if (c2443hArr != null) {
                int length2 = c2443hArr.length;
                int iMax = i17;
                int i29 = iMax;
                int iMax2 = i29;
                while (i29 < length2) {
                    C2443h c2443h3 = c2443hArr[i29];
                    int i30 = c2443h3.f8039q;
                    iMax = i30 < 0 ? Math.max(iMax, Math.abs(i30)) : iMax;
                    int i31 = c2443h3.f8040r;
                    if (i31 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i31));
                    }
                    i29++;
                }
                jM5119a2 = (iMax == 0 && iMax2 == 0) ? AbstractC2062l.f6933b : AbstractC2062l.m5119a(iMax, iMax2);
            } else {
                jM5119a2 = AbstractC2062l.f6933b;
            }
            this.f6922h = Math.max((int) (jM5119a >> c10), (int) (jM5119a2 >> c10));
            this.f6923i = Math.max((int) (jM5119a & j3), (int) (jM5119a2 & j3));
            TextPaint textPaint2 = this.f6915a;
            C2443h[] c2443hArr2 = this.f6929o;
            int i32 = this.f6921g - i22;
            Layout layout = this.f6920f;
            if (layout.getLineStart(i32) != layout.getLineEnd(i32) || c2443hArr2 == null || c2443hArr2.length == 0) {
                r72 = th2;
            } else {
                TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                SpannableString spannableString = new SpannableString("\u200b");
                if (c2443hArr2.length == 0) {
                    C2104o.m5287l("Array is empty.");
                    throw th2;
                }
                C2443h c2443h4 = c2443hArr2[i17];
                spannableString.setSpan(new C2443h(c2443h4.f8029g, spannableString.length(), (i32 == 0 || !c2443h4.f8032j) ? c2443h4.f8032j : i17, c2443h4.f8032j, c2443h4.f8033k, c2443h4.f8034l), i17, spannableString.length(), i21);
                StaticLayout staticLayoutM5101a = AbstractC2057g.m5101a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, AbstractC2054d.f6899a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f6917c, 0, 0, 0, 0);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutM5101a.getLineAscent(i17);
                fontMetricsInt.descent = staticLayoutM5101a.getLineDescent(i17);
                fontMetricsInt.top = staticLayoutM5101a.getLineTop(i17);
                fontMetricsInt.bottom = staticLayoutM5101a.getLineBottom(i17);
                r72 = fontMetricsInt;
            }
            this.f6928n = r72 != 0 ? ((Paint.FontMetricsInt) r72).bottom - ((int) (m5113e(i24) - m5115g(i24))) : i17;
            this.f6927m = r72;
            Layout layout2 = this.f6920f;
            this.f6924j = AbstractC5700d.m10245A(layout2, i24, layout2.getPaint());
            Layout layout3 = this.f6920f;
            this.f6925k = AbstractC5700d.m10246B(layout3, i24, layout3.getPaint());
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m5109a() {
        boolean z9 = this.f6918d;
        Layout layout = this.f6920f;
        return (z9 ? layout.getLineBottom(this.f6921g - 1) : layout.getHeight()) + this.f6922h + this.f6923i + this.f6928n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m5110b(int i9) {
        if (i9 == this.f6921g - 1) {
            return this.f6924j + this.f6925k;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0289k m5111c() {
        C0289k c0289k = this.f6931q;
        if (c0289k != null) {
            return c0289k;
        }
        C0289k c0289k2 = new C0289k(this.f6920f);
        this.f6931q = c0289k2;
        return c0289k2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final float m5112d(int i9) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f6922h + ((i9 != this.f6921g + (-1) || (fontMetricsInt = this.f6927m) == null) ? this.f6920f.getLineBaseline(i9) : m5115g(i9) - fontMetricsInt.ascent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final float m5113e(int i9) {
        Paint.FontMetricsInt fontMetricsInt;
        int i10 = this.f6921g;
        int i11 = i10 - 1;
        Layout layout = this.f6920f;
        if (i9 != i11 || (fontMetricsInt = this.f6927m) == null) {
            return this.f6922h + layout.getLineBottom(i9) + (i9 == i10 + (-1) ? this.f6923i : 0);
        }
        return layout.getLineBottom(i9 - 1) + fontMetricsInt.bottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m5114f(int i9) {
        ThreadLocal threadLocal = AbstractC2062l.f6932a;
        Layout layout = this.f6920f;
        return (layout.getEllipsisCount(i9) <= 0 || this.f6916b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i9) : layout.getText().length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final float m5115g(int i9) {
        return this.f6920f.getLineTop(i9) + (i9 == 0 ? 0 : this.f6922h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final float m5116h(int i9, boolean z9) {
        return m5110b(this.f6920f.getLineForOffset(i9)) + m5111c().m1200i(i9, true, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final float m5117i(int i9, boolean z9) {
        return m5110b(this.f6920f.getLineForOffset(i9)) + m5111c().m1200i(i9, false, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C0412a m5118j() {
        C0412a c0412a = this.f6919e;
        if (c0412a != null) {
            return c0412a;
        }
        Layout layout = this.f6920f;
        C0412a c0412a2 = new C0412a(layout.getText(), layout.getText().length(), this.f6915a.getTextLocale());
        this.f6919e = c0412a2;
        return c0412a2;
    }
}
