package p000;

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
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class e71 {

    /* JADX INFO: renamed from: a */
    public final TextPaint f1322a;

    /* JADX INFO: renamed from: b */
    public final TextUtils.TruncateAt f1323b;

    /* JADX INFO: renamed from: c */
    public final boolean f1324c;

    /* JADX INFO: renamed from: d */
    public final boolean f1325d;

    /* JADX INFO: renamed from: e */
    public final Layout f1326e;

    /* JADX INFO: renamed from: f */
    public final int f1327f;

    /* JADX INFO: renamed from: g */
    public final int f1328g;

    /* JADX INFO: renamed from: h */
    public final int f1329h;

    /* JADX INFO: renamed from: i */
    public final float f1330i;

    /* JADX INFO: renamed from: j */
    public final float f1331j;

    /* JADX INFO: renamed from: k */
    public final boolean f1332k;

    /* JADX INFO: renamed from: l */
    public final Paint.FontMetricsInt f1333l;

    /* JADX INFO: renamed from: m */
    public final int f1334m;

    /* JADX INFO: renamed from: n */
    public final ma0[] f1335n;

    /* JADX INFO: renamed from: o */
    public final Rect f1336o = new Rect();

    /* JADX INFO: renamed from: p */
    public C0681r9 f1337p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0178  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e71(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, p50 p50Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutM3407i;
        ma0[] ma0VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        long j;
        int i14;
        int i15;
        long jM1282a;
        ?? IsFallbackLineSpacingEnabled;
        long jM1282a2;
        int i16;
        Paint.FontMetricsInt fontMetricsInt;
        int i17;
        this.f1322a = textPaint;
        this.f1323b = truncateAt;
        this.f1324c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM1283b = h71.m1283b(i2);
        Layout.Alignment alignment = s61.f5660a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : s61.f5661b : s61.f5660a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C0011aa.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsM3017a = p50Var.m3017a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsM3017a == null || p50Var.m3019c() > f || z2) {
                this.f1332k = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicM1283b;
                layoutM3407i = r60.m3407i(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.f1332k = true;
                if (iCeil < 0) {
                    x10.m5082a("negative width");
                }
                if (iCeil < 0) {
                    x10.m5082a("negative ellipsized width");
                }
                layoutM3407i = Build.VERSION.SDK_INT >= 33 ? AbstractC0983z0.m5351e(charSequence, textPaint, iCeil, alignment2, metricsM3017a, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsM3017a, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicM1283b;
            }
            this.f1326e = layoutM3407i;
            Trace.endSection();
            int iMin = Math.min(layoutM3407i.getLineCount(), i9);
            this.f1327f = iMin;
            int i18 = iMin - 1;
            this.f1325d = iMin >= i9 && (layoutM3407i.getEllipsisCount(i18) > 0 || layoutM3407i.getLineEnd(i18) != charSequence.length());
            if (layoutM3407i.getText() instanceof Spanned) {
                CharSequence text = layoutM3407i.getText();
                text.getClass();
                if (g60.m1214m((Spanned) text, ma0.class) || layoutM3407i.getText().length() <= 0) {
                    CharSequence text2 = layoutM3407i.getText();
                    text2.getClass();
                    i10 = 0;
                    ma0VarArr = (ma0[]) ((Spanned) text2).getSpans(0, layoutM3407i.getText().length(), ma0.class);
                }
            } else {
                ma0VarArr = null;
                i10 = 0;
            }
            this.f1335n = ma0VarArr;
            if (ma0VarArr == null) {
                i11 = 2;
                i12 = i10;
            } else {
                ma0 ma0Var = ma0VarArr.length == 0 ? null : ma0VarArr[i10];
                if (ma0Var != null) {
                    if (ma0Var.f3896f) {
                        i11 = 2;
                        i17 = ma0Var.f3899i == 2 ? 1 : i17;
                        i12 = i17;
                    } else {
                        i11 = 2;
                    }
                    i17 = i10;
                    i12 = i17;
                }
            }
            if (ma0VarArr == null) {
                i13 = i10;
            } else {
                ma0 ma0Var2 = ma0VarArr.length == 0 ? null : ma0VarArr[i10];
                if (ma0Var2 != null && ma0Var2.f3897g && ma0Var2.f3899i == i11) {
                    i13 = 1;
                }
            }
            if (i12 == 0 || i13 == 0) {
                long jM1282a3 = h71.f2165b;
                if (z) {
                    c = ' ';
                    j = 4294967295L;
                    i14 = 1;
                    i15 = 33;
                } else {
                    if (this.f1332k) {
                        i15 = 33;
                        IsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= 33 ? ((BoringLayout) layoutM3407i).isFallbackLineSpacingEnabled() : i10;
                    } else {
                        i15 = 33;
                        IsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= 33 ? ((StaticLayout) layoutM3407i).isFallbackLineSpacingEnabled() : 1;
                    }
                    if (IsFallbackLineSpacingEnabled != 0) {
                        c = ' ';
                        j = 4294967295L;
                        i14 = 1;
                    } else {
                        TextPaint paint = layoutM3407i.getPaint();
                        CharSequence text3 = layoutM3407i.getText();
                        c = ' ';
                        Rect rectM4405k = v50.m4405k(paint, text3, layoutM3407i.getLineStart(i10), layoutM3407i.getLineEnd(i10));
                        int lineAscent = layoutM3407i.getLineAscent(i10);
                        j = 4294967295L;
                        int i19 = rectM4405k.top;
                        int topPadding = i19 < lineAscent ? lineAscent - i19 : layoutM3407i.getTopPadding();
                        i14 = 1;
                        rectM4405k = iMin != 1 ? v50.m4405k(paint, text3, layoutM3407i.getLineStart(i18), layoutM3407i.getLineEnd(i18)) : rectM4405k;
                        int lineDescent = layoutM3407i.getLineDescent(i18);
                        int i20 = rectM4405k.bottom;
                        int bottomPadding = i20 > lineDescent ? i20 - lineDescent : layoutM3407i.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jM1282a3 = h71.m1282a(topPadding, bottomPadding);
                        }
                    }
                }
                jM1282a = h71.m1282a(i12 != 0 ? i10 : (int) (jM1282a3 >> c), i13 != 0 ? i10 : (int) (jM1282a3 & j));
            } else {
                jM1282a = h71.f2165b;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                i15 = 33;
            }
            if (ma0VarArr != null) {
                int length2 = ma0VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i21 = iMax2; i21 < length2; i21++) {
                    ma0 ma0Var3 = ma0VarArr[i21];
                    int i22 = ma0Var3.f3904n;
                    iMax = i22 < 0 ? Math.max(iMax, Math.abs(i22)) : iMax;
                    int i23 = ma0Var3.f3905o;
                    if (i23 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i23));
                    }
                }
                jM1282a2 = (iMax == 0 && iMax2 == 0) ? h71.f2165b : h71.m1282a(iMax, iMax2);
            } else {
                jM1282a2 = h71.f2165b;
            }
            this.f1328g = Math.max((int) (jM1282a >> c), (int) (jM1282a2 >> c));
            this.f1329h = Math.max((int) (jM1282a & j), (int) (jM1282a2 & j));
            TextPaint textPaint2 = this.f1322a;
            ma0[] ma0VarArr2 = this.f1335n;
            int i24 = this.f1327f - i14;
            Layout layout = this.f1326e;
            if (layout.getLineStart(i24) != layout.getLineEnd(i24) || ma0VarArr2 == null || ma0VarArr2.length == 0) {
                i16 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                if (ma0VarArr2.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                ma0 ma0Var4 = ma0VarArr2[i10];
                spannableString.setSpan(new ma0(ma0Var4.f3894d, spannableString.length(), (i24 == 0 || !ma0Var4.f3897g) ? ma0Var4.f3897g : i10, ma0Var4.f3897g, ma0Var4.f3898h, ma0Var4.f3899i), i10, spannableString.length(), i15);
                i16 = i10;
                StaticLayout staticLayoutM3407i = r60.m3407i(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, h50.f2146a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f1324c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutM3407i.getLineAscent(i16);
                fontMetricsInt.descent = staticLayoutM3407i.getLineDescent(i16);
                fontMetricsInt.top = staticLayoutM3407i.getLineTop(i16);
                fontMetricsInt.bottom = staticLayoutM3407i.getLineBottom(i16);
            }
            this.f1334m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (m796d(i18) - m798f(i18))) : i16;
            this.f1333l = fontMetricsInt;
            Layout layout2 = this.f1326e;
            this.f1330i = p30.m2966B(layout2, i18, layout2.getPaint());
            Layout layout3 = this.f1326e;
            this.f1331j = p30.m2967C(layout3, i18, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m793a() {
        boolean z = this.f1325d;
        Layout layout = this.f1326e;
        return (z ? layout.getLineBottom(this.f1327f - 1) : layout.getHeight()) + this.f1328g + this.f1329h + this.f1334m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0681r9 m794b() {
        C0681r9 c0681r9 = this.f1337p;
        if (c0681r9 != null) {
            return c0681r9;
        }
        C0681r9 c0681r92 = new C0681r9(this.f1326e);
        this.f1337p = c0681r92;
        return c0681r92;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final float m795c(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f1328g + ((i != this.f1327f + (-1) || (fontMetricsInt = this.f1333l) == null) ? this.f1326e.getLineBaseline(i) : m798f(i) - fontMetricsInt.ascent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final float m796d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f1327f;
        int i3 = i2 - 1;
        Layout layout = this.f1326e;
        if (i != i3 || (fontMetricsInt = this.f1333l) == null) {
            return this.f1328g + layout.getLineBottom(i) + (i == i2 + (-1) ? this.f1329h : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m797e(int i) {
        ThreadLocal threadLocal = h71.f2164a;
        Layout layout = this.f1326e;
        return (layout.getEllipsisCount(i) <= 0 || this.f1323b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final float m798f(int i) {
        return this.f1326e.getLineTop(i) + (i == 0 ? 0 : this.f1328g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final float m799g(int i, boolean z) {
        return (this.f1326e.getLineForOffset(i) == this.f1327f - 1 ? this.f1330i + this.f1331j : 0.0f) + m794b().m3432g(i, true, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final float m800h(int i, boolean z) {
        return (this.f1326e.getLineForOffset(i) == this.f1327f + (-1) ? this.f1330i + this.f1331j : 0.0f) + m794b().m3432g(i, false, z);
    }
}
