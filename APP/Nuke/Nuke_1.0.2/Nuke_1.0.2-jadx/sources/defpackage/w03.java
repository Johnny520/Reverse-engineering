package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w03 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public sx1 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final za1[] o;
    public final Rect p = new Rect();
    public cj q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a1 A[PHI: r14
  0x01a1: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:96:0x01b3, B:89:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b8  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w03(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, g61 g61Var) throws Throwable {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutE;
        za1[] za1VarArr;
        int i10;
        int i11;
        int i12;
        Throwable th;
        char c;
        long j;
        int i13;
        int i14;
        long jA;
        ?? IsFallbackLineSpacingEnabled;
        long jA2;
        int i15;
        ?? r6;
        za1 za1Var;
        za1 za1Var2;
        int i16;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = a13.b(i2);
        Layout.Alignment alignment = ly2.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : ly2.b : ly2.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, yj.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = g61Var.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || g61Var.c() > f || z2) {
                this.l = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutE = s11.E(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.l = true;
                if (iCeil < 0) {
                    lz0.a("negative width");
                }
                if (iCeil < 0) {
                    lz0.a("negative ellipsized width");
                }
                layoutE = Build.VERSION.SDK_INT >= 33 ? d4.e(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
            }
            this.f = layoutE;
            Trace.endSection();
            int iMin = Math.min(layoutE.getLineCount(), i9);
            this.g = iMin;
            int i17 = iMin - 1;
            this.d = iMin >= i9 && (layoutE.getEllipsisCount(i17) > 0 || layoutE.getLineEnd(i17) != charSequence.length());
            if (layoutE.getText() instanceof Spanned) {
                CharSequence text = layoutE.getText();
                text.getClass();
                if (sp0.E((Spanned) text, za1.class) || layoutE.getText().length() <= 0) {
                    CharSequence text2 = layoutE.getText();
                    text2.getClass();
                    i10 = 0;
                    za1VarArr = (za1[]) ((Spanned) text2).getSpans(0, layoutE.getText().length(), za1.class);
                }
            } else {
                za1VarArr = null;
                i10 = 0;
            }
            this.o = za1VarArr;
            if (za1VarArr == null || (za1Var2 = (za1) mg.l0(za1VarArr)) == null) {
                i11 = 2;
                i12 = i10;
            } else {
                if (za1Var2.j) {
                    i11 = 2;
                    i16 = za1Var2.m == 2 ? 1 : i16;
                    i12 = i16;
                } else {
                    i11 = 2;
                }
                i16 = i10;
                i12 = i16;
            }
            int i18 = (za1VarArr == null || (za1Var = (za1) mg.l0(za1VarArr)) == null || !za1Var.k || za1Var.m != i11) ? i10 : 1;
            if (i12 == 0 || i18 == 0) {
                long jA3 = a13.b;
                if (z) {
                    th = null;
                    c = ' ';
                    j = 4294967295L;
                    i13 = 1;
                    i14 = 33;
                } else if (this.l) {
                    i14 = 33;
                    IsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= 33 ? ((BoringLayout) layoutE).isFallbackLineSpacingEnabled() : i10;
                    if (IsFallbackLineSpacingEnabled == 0) {
                        th = null;
                        c = ' ';
                        j = 4294967295L;
                        i13 = 1;
                    } else {
                        TextPaint paint = layoutE.getPaint();
                        CharSequence text3 = layoutE.getText();
                        th = null;
                        c = ' ';
                        Rect rectW = p40.w(paint, text3, layoutE.getLineStart(i10), layoutE.getLineEnd(i10));
                        int lineAscent = layoutE.getLineAscent(i10);
                        j = 4294967295L;
                        int i19 = rectW.top;
                        int topPadding = i19 < lineAscent ? lineAscent - i19 : layoutE.getTopPadding();
                        i13 = 1;
                        rectW = iMin != 1 ? p40.w(paint, text3, layoutE.getLineStart(i17), layoutE.getLineEnd(i17)) : rectW;
                        int lineDescent = layoutE.getLineDescent(i17);
                        int i20 = rectW.bottom;
                        int bottomPadding = i20 > lineDescent ? i20 - lineDescent : layoutE.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jA3 = a13.a(topPadding, bottomPadding);
                        }
                    }
                } else {
                    i14 = 33;
                    StaticLayout staticLayout = (StaticLayout) layoutE;
                    int i21 = Build.VERSION.SDK_INT;
                    if (i21 >= 33) {
                        IsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                    } else if (i21 >= 28) {
                        IsFallbackLineSpacingEnabled = 1;
                    }
                    if (IsFallbackLineSpacingEnabled == 0) {
                    }
                }
                jA = a13.a(i12 != 0 ? i10 : (int) (jA3 >> c), i18 != 0 ? i10 : (int) (jA3 & j));
            } else {
                jA = a13.b;
                th = null;
                c = ' ';
                j = 4294967295L;
                i13 = 1;
                i14 = 33;
            }
            if (za1VarArr != null) {
                int length2 = za1VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i22 = iMax2; i22 < length2; i22++) {
                    za1 za1Var3 = za1VarArr[i22];
                    int i23 = za1Var3.r;
                    iMax = i23 < 0 ? Math.max(iMax, Math.abs(i23)) : iMax;
                    int i24 = za1Var3.s;
                    if (i24 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i24));
                    }
                }
                jA2 = (iMax == 0 && iMax2 == 0) ? a13.b : a13.a(iMax, iMax2);
            } else {
                jA2 = a13.b;
            }
            this.h = Math.max((int) (jA >> c), (int) (jA2 >> c));
            this.i = Math.max((int) (jA & j), (int) (jA2 & j));
            TextPaint textPaint2 = this.a;
            za1[] za1VarArr2 = this.o;
            int i25 = this.g - i13;
            Layout layout = this.f;
            if (layout.getLineStart(i25) != layout.getLineEnd(i25) || za1VarArr2 == null || za1VarArr2.length == 0) {
                i15 = i10;
                r6 = th;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                if (za1VarArr2.length == 0) {
                    um2.i("Array is empty.");
                    throw th;
                }
                za1 za1Var4 = za1VarArr2[i10];
                spannableString.setSpan(new za1(za1Var4.h, spannableString.length(), (i25 == 0 || !za1Var4.k) ? za1Var4.k : i10, za1Var4.k, za1Var4.l, za1Var4.m), i10, spannableString.length(), i14);
                i15 = i10;
                StaticLayout staticLayoutE = s11.E(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, b61.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutE.getLineAscent(i15);
                fontMetricsInt.descent = staticLayoutE.getLineDescent(i15);
                fontMetricsInt.top = staticLayoutE.getLineTop(i15);
                fontMetricsInt.bottom = staticLayoutE.getLineBottom(i15);
                r6 = fontMetricsInt;
            }
            this.n = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (e(i17) - h(i17))) : i15;
            this.m = r6;
            Layout layout2 = this.f;
            this.j = tl.C(layout2, i17, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = tl.D(layout3, i17, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final cj c() {
        cj cjVar = this.q;
        if (cjVar != null) {
            return cjVar;
        }
        cj cjVar2 = new cj();
        cjVar2.a = this.f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iP0 = pv2.p0(((Layout) cjVar2.a).getText(), '\n', length, 4);
            length = iP0 < 0 ? ((Layout) cjVar2.a).getText().length() : iP0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) cjVar2.a).getText().length());
        cjVar2.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        cjVar2.c = arrayList2;
        cjVar2.d = new boolean[((ArrayList) cjVar2.b).size()];
        ((ArrayList) cjVar2.b).size();
        this.q = cjVar2;
        return cjVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : h(i) - fontMetricsInt.ascent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f(int i) {
        ThreadLocal threadLocal = a13.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float h(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float i(int i, boolean z) {
        return b(g(i)) + c().i(i, true, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float j(int i, boolean z) {
        return b(g(i)) + c().i(i, false, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final sx1 k() {
        sx1 sx1Var = this.e;
        if (sx1Var != null) {
            return sx1Var;
        }
        Layout layout = this.f;
        sx1 sx1Var2 = new sx1(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = sx1Var2;
        return sx1Var2;
    }
}
