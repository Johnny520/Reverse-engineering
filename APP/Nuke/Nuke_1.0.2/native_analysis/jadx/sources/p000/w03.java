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
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w03 {

    /* JADX INFO: renamed from: a */
    public final TextPaint f12241a;

    /* JADX INFO: renamed from: b */
    public final TextUtils.TruncateAt f12242b;

    /* JADX INFO: renamed from: c */
    public final boolean f12243c;

    /* JADX INFO: renamed from: d */
    public final boolean f12244d;

    /* JADX INFO: renamed from: e */
    public sx1 f12245e;

    /* JADX INFO: renamed from: f */
    public final Layout f12246f;

    /* JADX INFO: renamed from: g */
    public final int f12247g;

    /* JADX INFO: renamed from: h */
    public final int f12248h;

    /* JADX INFO: renamed from: i */
    public final int f12249i;

    /* JADX INFO: renamed from: j */
    public final float f12250j;

    /* JADX INFO: renamed from: k */
    public final float f12251k;

    /* JADX INFO: renamed from: l */
    public final boolean f12252l;

    /* JADX INFO: renamed from: m */
    public final Paint.FontMetricsInt f12253m;

    /* JADX INFO: renamed from: n */
    public final int f12254n;

    /* JADX INFO: renamed from: o */
    public final za1[] f12255o;

    /* JADX INFO: renamed from: p */
    public final Rect f12256p = new Rect();

    /* JADX INFO: renamed from: q */
    public C0093cj f12257q;

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
        Layout layoutM4660E;
        za1[] za1VarArr;
        int i10;
        int i11;
        int i12;
        Throwable th;
        char c;
        long j;
        int i13;
        int i14;
        long jM10a;
        ?? IsFallbackLineSpacingEnabled;
        long jM10a2;
        int i15;
        ?? r6;
        za1 za1Var;
        za1 za1Var2;
        int i16;
        this.f12241a = textPaint;
        this.f12242b = truncateAt;
        this.f12243c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM11b = a13.m11b(i2);
        Layout.Alignment alignment = ly2.f6404a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : ly2.f6405b : ly2.f6404a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C0925yj.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsM1807a = g61Var.m1807a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsM1807a == null || g61Var.m1809c() > f || z2) {
                this.f12252l = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicM11b;
                layoutM4660E = s11.m4660E(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.f12252l = true;
                if (iCeil < 0) {
                    lz0.m2988a("negative width");
                }
                if (iCeil < 0) {
                    lz0.m2988a("negative ellipsized width");
                }
                layoutM4660E = Build.VERSION.SDK_INT >= 33 ? AbstractC0117d4.m943e(charSequence, textPaint, iCeil, alignment2, metricsM1807a, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsM1807a, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicM11b;
            }
            this.f12246f = layoutM4660E;
            Trace.endSection();
            int iMin = Math.min(layoutM4660E.getLineCount(), i9);
            this.f12247g = iMin;
            int i17 = iMin - 1;
            this.f12244d = iMin >= i9 && (layoutM4660E.getEllipsisCount(i17) > 0 || layoutM4660E.getLineEnd(i17) != charSequence.length());
            if (layoutM4660E.getText() instanceof Spanned) {
                CharSequence text = layoutM4660E.getText();
                text.getClass();
                if (sp0.m4909E((Spanned) text, za1.class) || layoutM4660E.getText().length() <= 0) {
                    CharSequence text2 = layoutM4660E.getText();
                    text2.getClass();
                    i10 = 0;
                    za1VarArr = (za1[]) ((Spanned) text2).getSpans(0, layoutM4660E.getText().length(), za1.class);
                }
            } else {
                za1VarArr = null;
                i10 = 0;
            }
            this.f12255o = za1VarArr;
            if (za1VarArr == null || (za1Var2 = (za1) AbstractC0460mg.m3097l0(za1VarArr)) == null) {
                i11 = 2;
                i12 = i10;
            } else {
                if (za1Var2.f13801j) {
                    i11 = 2;
                    i16 = za1Var2.f13804m == 2 ? 1 : i16;
                    i12 = i16;
                } else {
                    i11 = 2;
                }
                i16 = i10;
                i12 = i16;
            }
            int i18 = (za1VarArr == null || (za1Var = (za1) AbstractC0460mg.m3097l0(za1VarArr)) == null || !za1Var.f13802k || za1Var.f13804m != i11) ? i10 : 1;
            if (i12 == 0 || i18 == 0) {
                long jM10a3 = a13.f31b;
                if (z) {
                    th = null;
                    c = ' ';
                    j = 4294967295L;
                    i13 = 1;
                    i14 = 33;
                } else if (this.f12252l) {
                    i14 = 33;
                    IsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= 33 ? ((BoringLayout) layoutM4660E).isFallbackLineSpacingEnabled() : i10;
                    if (IsFallbackLineSpacingEnabled == 0) {
                        th = null;
                        c = ' ';
                        j = 4294967295L;
                        i13 = 1;
                    } else {
                        TextPaint paint = layoutM4660E.getPaint();
                        CharSequence text3 = layoutM4660E.getText();
                        th = null;
                        c = ' ';
                        Rect rectM3739w = p40.m3739w(paint, text3, layoutM4660E.getLineStart(i10), layoutM4660E.getLineEnd(i10));
                        int lineAscent = layoutM4660E.getLineAscent(i10);
                        j = 4294967295L;
                        int i19 = rectM3739w.top;
                        int topPadding = i19 < lineAscent ? lineAscent - i19 : layoutM4660E.getTopPadding();
                        i13 = 1;
                        rectM3739w = iMin != 1 ? p40.m3739w(paint, text3, layoutM4660E.getLineStart(i17), layoutM4660E.getLineEnd(i17)) : rectM3739w;
                        int lineDescent = layoutM4660E.getLineDescent(i17);
                        int i20 = rectM3739w.bottom;
                        int bottomPadding = i20 > lineDescent ? i20 - lineDescent : layoutM4660E.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jM10a3 = a13.m10a(topPadding, bottomPadding);
                        }
                    }
                } else {
                    i14 = 33;
                    StaticLayout staticLayout = (StaticLayout) layoutM4660E;
                    int i21 = Build.VERSION.SDK_INT;
                    if (i21 >= 33) {
                        IsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                    } else if (i21 >= 28) {
                        IsFallbackLineSpacingEnabled = 1;
                    }
                    if (IsFallbackLineSpacingEnabled == 0) {
                    }
                }
                jM10a = a13.m10a(i12 != 0 ? i10 : (int) (jM10a3 >> c), i18 != 0 ? i10 : (int) (jM10a3 & j));
            } else {
                jM10a = a13.f31b;
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
                    int i23 = za1Var3.f13809r;
                    iMax = i23 < 0 ? Math.max(iMax, Math.abs(i23)) : iMax;
                    int i24 = za1Var3.f13810s;
                    if (i24 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i24));
                    }
                }
                jM10a2 = (iMax == 0 && iMax2 == 0) ? a13.f31b : a13.m10a(iMax, iMax2);
            } else {
                jM10a2 = a13.f31b;
            }
            this.f12248h = Math.max((int) (jM10a >> c), (int) (jM10a2 >> c));
            this.f12249i = Math.max((int) (jM10a & j), (int) (jM10a2 & j));
            TextPaint textPaint2 = this.f12241a;
            za1[] za1VarArr2 = this.f12255o;
            int i25 = this.f12247g - i13;
            Layout layout = this.f12246f;
            if (layout.getLineStart(i25) != layout.getLineEnd(i25) || za1VarArr2 == null || za1VarArr2.length == 0) {
                i15 = i10;
                r6 = th;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                if (za1VarArr2.length == 0) {
                    um2.m5519i("Array is empty.");
                    throw th;
                }
                za1 za1Var4 = za1VarArr2[i10];
                spannableString.setSpan(new za1(za1Var4.f13799h, spannableString.length(), (i25 == 0 || !za1Var4.f13802k) ? za1Var4.f13802k : i10, za1Var4.f13802k, za1Var4.f13803l, za1Var4.f13804m), i10, spannableString.length(), i14);
                i15 = i10;
                StaticLayout staticLayoutM4660E = s11.m4660E(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, b61.f612a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f12243c, 0, 0, 0, 0);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutM4660E.getLineAscent(i15);
                fontMetricsInt.descent = staticLayoutM4660E.getLineDescent(i15);
                fontMetricsInt.top = staticLayoutM4660E.getLineTop(i15);
                fontMetricsInt.bottom = staticLayoutM4660E.getLineBottom(i15);
                r6 = fontMetricsInt;
            }
            this.f12254n = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (m5818e(i17) - m5821h(i17))) : i15;
            this.f12253m = r6;
            Layout layout2 = this.f12246f;
            this.f12250j = AbstractC0738tl.m5276C(layout2, i17, layout2.getPaint());
            Layout layout3 = this.f12246f;
            this.f12251k = AbstractC0738tl.m5277D(layout3, i17, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m5814a() {
        boolean z = this.f12244d;
        Layout layout = this.f12246f;
        return (z ? layout.getLineBottom(this.f12247g - 1) : layout.getHeight()) + this.f12248h + this.f12249i + this.f12254n;
    }

    /* JADX INFO: renamed from: b */
    public final float m5815b(int i) {
        if (i == this.f12247g - 1) {
            return this.f12250j + this.f12251k;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final C0093cj m5816c() {
        C0093cj c0093cj = this.f12257q;
        if (c0093cj != null) {
            return c0093cj;
        }
        C0093cj c0093cj2 = new C0093cj();
        c0093cj2.f1579a = this.f12246f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM4003p0 = pv2.m4003p0(((Layout) c0093cj2.f1579a).getText(), '\n', length, 4);
            length = iM4003p0 < 0 ? ((Layout) c0093cj2.f1579a).getText().length() : iM4003p0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) c0093cj2.f1579a).getText().length());
        c0093cj2.f1580b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        c0093cj2.f1581c = arrayList2;
        c0093cj2.f1582d = new boolean[((ArrayList) c0093cj2.f1580b).size()];
        ((ArrayList) c0093cj2.f1580b).size();
        this.f12257q = c0093cj2;
        return c0093cj2;
    }

    /* JADX INFO: renamed from: d */
    public final float m5817d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f12248h + ((i != this.f12247g + (-1) || (fontMetricsInt = this.f12253m) == null) ? this.f12246f.getLineBaseline(i) : m5821h(i) - fontMetricsInt.ascent);
    }

    /* JADX INFO: renamed from: e */
    public final float m5818e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f12247g;
        int i3 = i2 - 1;
        Layout layout = this.f12246f;
        if (i != i3 || (fontMetricsInt = this.f12253m) == null) {
            return this.f12248h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.f12249i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX INFO: renamed from: f */
    public final int m5819f(int i) {
        ThreadLocal threadLocal = a13.f30a;
        Layout layout = this.f12246f;
        return (layout.getEllipsisCount(i) <= 0 || this.f12242b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    /* JADX INFO: renamed from: g */
    public final int m5820g(int i) {
        int i2 = this.f12247g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f12246f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    /* JADX INFO: renamed from: h */
    public final float m5821h(int i) {
        return this.f12246f.getLineTop(i) + (i == 0 ? 0 : this.f12248h);
    }

    /* JADX INFO: renamed from: i */
    public final float m5822i(int i, boolean z) {
        return m5815b(m5820g(i)) + m5816c().m834i(i, true, z);
    }

    /* JADX INFO: renamed from: j */
    public final float m5823j(int i, boolean z) {
        return m5815b(m5820g(i)) + m5816c().m834i(i, false, z);
    }

    /* JADX INFO: renamed from: k */
    public final sx1 m5824k() {
        sx1 sx1Var = this.f12245e;
        if (sx1Var != null) {
            return sx1Var;
        }
        Layout layout = this.f12246f;
        sx1 sx1Var2 = new sx1(layout.getText(), layout.getText().length(), this.f12241a.getTextLocale());
        this.f12245e = sx1Var2;
        return sx1Var2;
    }
}
