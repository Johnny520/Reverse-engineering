package p096T0;

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
import java.util.ArrayList;
import java.util.NoSuchElementException;
import p014C1.C0240b;
import p030F1.AbstractC0448m;
import p049I2.AbstractC0797o;
import p061L2.AbstractC0972l;
import p101U0.C1470e;
import p106V0.C1487a;
import p106V0.C1494h;
import p117X2.AbstractC1665j;
import p120Y0.AbstractC1732a;
import p149d3.AbstractC1976d;

/* JADX INFO: renamed from: T0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1410j {

    /* JADX INFO: renamed from: a */
    public final TextPaint f5039a;

    /* JADX INFO: renamed from: b */
    public final TextUtils.TruncateAt f5040b;

    /* JADX INFO: renamed from: c */
    public final boolean f5041c;

    /* JADX INFO: renamed from: d */
    public final boolean f5042d;

    /* JADX INFO: renamed from: e */
    public C1470e f5043e;

    /* JADX INFO: renamed from: f */
    public final Layout f5044f;

    /* JADX INFO: renamed from: g */
    public final int f5045g;

    /* JADX INFO: renamed from: h */
    public final int f5046h;

    /* JADX INFO: renamed from: i */
    public final int f5047i;

    /* JADX INFO: renamed from: j */
    public final float f5048j;

    /* JADX INFO: renamed from: k */
    public final float f5049k;

    /* JADX INFO: renamed from: l */
    public final boolean f5050l;

    /* JADX INFO: renamed from: m */
    public final Paint.FontMetricsInt f5051m;

    /* JADX INFO: renamed from: n */
    public final int f5052n;

    /* JADX INFO: renamed from: o */
    public final C1494h[] f5053o;

    /* JADX INFO: renamed from: p */
    public final Rect f5054p = new Rect();

    /* JADX INFO: renamed from: q */
    public C0240b f5055q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa A[PHI: r7
  0x01aa: PHI (r7v7 int) = (r7v6 int), (r7v9 int) binds: [B:99:0x01bc, B:92:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1410j(CharSequence charSequence, float f2, TextPaint textPaint, int i5, TextUtils.TruncateAt truncateAt, int i6, boolean z5, int i7, int i8, int i9, int i10, int i11, int i12, C1405e c1405e) {
        int i13;
        int i14;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutM2698a;
        C1494h[] c1494hArr;
        int i15;
        int i16;
        char c5;
        long j5;
        int i17;
        int i18;
        long jM2715a;
        ?? IsFallbackLineSpacingEnabled;
        long jM2715a2;
        Paint.FontMetricsInt fontMetricsInt;
        C1494h c1494h;
        C1494h c1494h2;
        int i19;
        this.f5039a = textPaint;
        this.f5040b = truncateAt;
        this.f5041c = z5;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM2716b = AbstractC1411k.m2716b(i6);
        Layout.Alignment alignment = AbstractC1408h.f5036a;
        Layout.Alignment alignment2 = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? Layout.Alignment.ALIGN_NORMAL : AbstractC1408h.f5037b : AbstractC1408h.f5036a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z6 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C1487a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsM2691a = c1405e.m2691a();
            double d5 = f2;
            int iCeil = (int) Math.ceil(d5);
            if (metricsM2691a == null || c1405e.m2693c() > f2 || z6) {
                i13 = 0;
                this.f5050l = false;
                i14 = i7;
                textDirectionHeuristic = textDirectionHeuristicM2716b;
                layoutM2698a = AbstractC1407g.m2698a(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i14, truncateAt, (int) Math.ceil(d5), i12, z5, i8, i9, i10, i11);
            } else {
                this.f5050l = true;
                if (iCeil < 0) {
                    AbstractC1732a.m3085a("negative width");
                }
                if (iCeil < 0) {
                    AbstractC1732a.m3085a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    layoutM2698a = AbstractC0448m.m721e(charSequence, textPaint, iCeil, alignment2, metricsM2691a, z5, truncateAt, iCeil);
                    i13 = 0;
                } else {
                    i13 = 0;
                    layoutM2698a = new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsM2691a, z5, truncateAt, iCeil);
                }
                i14 = i7;
                textDirectionHeuristic = textDirectionHeuristicM2716b;
            }
            this.f5044f = layoutM2698a;
            Trace.endSection();
            int iMin = Math.min(layoutM2698a.getLineCount(), i14);
            this.f5045g = iMin;
            int i20 = iMin - 1;
            this.f5042d = (iMin >= i14 && (layoutM2698a.getEllipsisCount(i20) > 0 || layoutM2698a.getLineEnd(i20) != charSequence.length())) ? 1 : i13;
            if (layoutM2698a.getText() instanceof Spanned) {
                CharSequence text = layoutM2698a.getText();
                AbstractC1665j.m2983c(text, "null cannot be cast to non-null type android.text.Spanned");
                if (AbstractC1407g.m2703f((Spanned) text, C1494h.class) || layoutM2698a.getText().length() <= 0) {
                    CharSequence text2 = layoutM2698a.getText();
                    AbstractC1665j.m2983c(text2, "null cannot be cast to non-null type android.text.Spanned");
                    c1494hArr = (C1494h[]) ((Spanned) text2).getSpans(i13, layoutM2698a.getText().length(), C1494h.class);
                }
            } else {
                c1494hArr = null;
            }
            this.f5053o = c1494hArr;
            if (c1494hArr == null || (c1494h2 = (C1494h) AbstractC0972l.m2001Y(c1494hArr)) == null) {
                i15 = 2;
                i16 = i13;
            } else {
                if (c1494h2.f5206f) {
                    i15 = 2;
                    i19 = c1494h2.f5209i == 2 ? 1 : i19;
                    i16 = i19;
                } else {
                    i15 = 2;
                }
                i19 = i13;
                i16 = i19;
            }
            int i21 = (c1494hArr == null || (c1494h = (C1494h) AbstractC0972l.m2001Y(c1494hArr)) == null || !c1494h.f5207g || c1494h.f5209i != i15) ? i13 : 1;
            if (i16 == 0 || i21 == 0) {
                long jM2715a3 = AbstractC1411k.f5057b;
                if (z5) {
                    c5 = ' ';
                    j5 = 4294967295L;
                    i17 = 33;
                } else if (this.f5050l) {
                    i17 = 33;
                    IsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= 33 ? ((BoringLayout) layoutM2698a).isFallbackLineSpacingEnabled() : i13;
                    if (IsFallbackLineSpacingEnabled == 0) {
                        c5 = ' ';
                        j5 = 4294967295L;
                    } else {
                        TextPaint paint = layoutM2698a.getPaint();
                        CharSequence text3 = layoutM2698a.getText();
                        c5 = ' ';
                        j5 = 4294967295L;
                        Rect rectM2699b = AbstractC1407g.m2699b(paint, text3, layoutM2698a.getLineStart(i13), layoutM2698a.getLineEnd(i13));
                        int lineAscent = layoutM2698a.getLineAscent(i13);
                        int i22 = rectM2699b.top;
                        int topPadding = i22 < lineAscent ? lineAscent - i22 : layoutM2698a.getTopPadding();
                        i18 = 1;
                        rectM2699b = iMin != 1 ? AbstractC1407g.m2699b(paint, text3, layoutM2698a.getLineStart(i20), layoutM2698a.getLineEnd(i20)) : rectM2699b;
                        int lineDescent = layoutM2698a.getLineDescent(i20);
                        int i23 = rectM2699b.bottom;
                        int bottomPadding = i23 > lineDescent ? i23 - lineDescent : layoutM2698a.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jM2715a3 = AbstractC1411k.m2715a(topPadding, bottomPadding);
                        }
                        jM2715a = AbstractC1411k.m2715a(i16 == 0 ? i13 : (int) (jM2715a3 >> c5), i21 == 0 ? i13 : (int) (jM2715a3 & j5));
                    }
                } else {
                    i17 = 33;
                    StaticLayout staticLayout = (StaticLayout) layoutM2698a;
                    int i24 = Build.VERSION.SDK_INT;
                    if (i24 >= 33) {
                        IsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                    } else if (i24 >= 28) {
                        IsFallbackLineSpacingEnabled = 1;
                    }
                    if (IsFallbackLineSpacingEnabled == 0) {
                    }
                }
                i18 = 1;
                jM2715a = AbstractC1411k.m2715a(i16 == 0 ? i13 : (int) (jM2715a3 >> c5), i21 == 0 ? i13 : (int) (jM2715a3 & j5));
            } else {
                jM2715a = AbstractC1411k.f5057b;
                c5 = ' ';
                j5 = 4294967295L;
                i17 = 33;
                i18 = 1;
            }
            if (c1494hArr != null) {
                int length2 = c1494hArr.length;
                int iMax = i13;
                int i25 = iMax;
                int iMax2 = i25;
                while (i25 < length2) {
                    C1494h c1494h3 = c1494hArr[i25];
                    int i26 = c1494h3.f5214n;
                    iMax = i26 < 0 ? Math.max(iMax, Math.abs(i26)) : iMax;
                    int i27 = c1494h3.f5215o;
                    if (i27 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i27));
                    }
                    i25++;
                }
                jM2715a2 = (iMax == 0 && iMax2 == 0) ? AbstractC1411k.f5057b : AbstractC1411k.m2715a(iMax, iMax2);
            } else {
                jM2715a2 = AbstractC1411k.f5057b;
            }
            this.f5046h = Math.max((int) (jM2715a >> c5), (int) (jM2715a2 >> c5));
            this.f5047i = Math.max((int) (jM2715a & j5), (int) (jM2715a2 & j5));
            TextPaint textPaint2 = this.f5039a;
            C1494h[] c1494hArr2 = this.f5053o;
            int i28 = this.f5045g - i18;
            Layout layout = this.f5044f;
            if (layout.getLineStart(i28) != layout.getLineEnd(i28) || c1494hArr2 == null || c1494hArr2.length == 0) {
                fontMetricsInt = null;
            } else {
                TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                SpannableString spannableString = new SpannableString("\u200b");
                if (c1494hArr2.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                C1494h c1494h4 = c1494hArr2[i13];
                spannableString.setSpan(new C1494h(c1494h4.f5204d, spannableString.length(), (i28 == 0 || !c1494h4.f5207g) ? c1494h4.f5207g : i13, c1494h4.f5207g, c1494h4.f5208h, c1494h4.f5209i), i13, spannableString.length(), i17);
                StaticLayout staticLayoutM2698a = AbstractC1407g.m2698a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, AbstractC1403c.f5024a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f5041c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutM2698a.getLineAscent(i13);
                fontMetricsInt.descent = staticLayoutM2698a.getLineDescent(i13);
                fontMetricsInt.top = staticLayoutM2698a.getLineTop(i13);
                fontMetricsInt.bottom = staticLayoutM2698a.getLineBottom(i13);
            }
            this.f5052n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (m2709e(i20) - m2711g(i20))) : i13;
            this.f5051m = fontMetricsInt;
            Layout layout2 = this.f5044f;
            this.f5048j = AbstractC0797o.m1391p(layout2, i20, layout2.getPaint());
            Layout layout3 = this.f5044f;
            this.f5049k = AbstractC0797o.m1392q(layout3, i20, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m2705a() {
        boolean z5 = this.f5042d;
        Layout layout = this.f5044f;
        return (z5 ? layout.getLineBottom(this.f5045g - 1) : layout.getHeight()) + this.f5046h + this.f5047i + this.f5052n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m2706b(int i5) {
        if (i5 == this.f5045g - 1) {
            return this.f5048j + this.f5049k;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0240b m2707c() {
        C0240b c0240b = this.f5055q;
        if (c0240b != null) {
            return c0240b;
        }
        C0240b c0240b2 = new C0240b();
        c0240b2.f808a = this.f5044f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM3634b0 = AbstractC1976d.m3634b0(((Layout) c0240b2.f808a).getText(), '\n', length, 4);
            length = iM3634b0 < 0 ? ((Layout) c0240b2.f808a).getText().length() : iM3634b0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) c0240b2.f808a).getText().length());
        c0240b2.f809b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(null);
        }
        c0240b2.f810c = arrayList2;
        c0240b2.f811d = new boolean[((ArrayList) c0240b2.f809b).size()];
        ((ArrayList) c0240b2.f809b).size();
        this.f5055q = c0240b2;
        return c0240b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final float m2708d(int i5) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f5046h + ((i5 != this.f5045g + (-1) || (fontMetricsInt = this.f5051m) == null) ? this.f5044f.getLineBaseline(i5) : m2711g(i5) - fontMetricsInt.ascent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final float m2709e(int i5) {
        Paint.FontMetricsInt fontMetricsInt;
        int i6 = this.f5045g;
        int i7 = i6 - 1;
        Layout layout = this.f5044f;
        if (i5 != i7 || (fontMetricsInt = this.f5051m) == null) {
            return this.f5046h + layout.getLineBottom(i5) + (i5 == i6 + (-1) ? this.f5047i : 0);
        }
        return layout.getLineBottom(i5 - 1) + fontMetricsInt.bottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m2710f(int i5) {
        ThreadLocal threadLocal = AbstractC1411k.f5056a;
        Layout layout = this.f5044f;
        return (layout.getEllipsisCount(i5) <= 0 || this.f5040b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i5) : layout.getText().length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final float m2711g(int i5) {
        return this.f5044f.getLineTop(i5) + (i5 == 0 ? 0 : this.f5046h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final float m2712h(int i5, boolean z5) {
        return m2706b(this.f5044f.getLineForOffset(i5)) + m2707c().m433j(i5, true, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final float m2713i(int i5, boolean z5) {
        return m2706b(this.f5044f.getLineForOffset(i5)) + m2707c().m433j(i5, false, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C1470e m2714j() {
        C1470e c1470e = this.f5043e;
        if (c1470e != null) {
            return c1470e;
        }
        Layout layout = this.f5044f;
        C1470e c1470e2 = new C1470e(layout.getText(), layout.getText().length(), this.f5039a.getTextLocale());
        this.f5043e = c1470e2;
        return c1470e2;
    }
}
