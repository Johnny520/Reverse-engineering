package p335x2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import p185m8.AbstractC5106t;
import p366z2.C9840h;

/* JADX INFO: renamed from: x2.j1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9337j1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f31943a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final long f31944b = m36406a(0, 0);

    /* JADX INFO: renamed from: a */
    public static final long m36406a(int i10, int i11) {
        return AbstractC9340k1.m36427a((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    /* JADX INFO: renamed from: g */
    public static final Paint.FontMetricsInt m36412g(C9331h1 c9331h1, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, C9840h[] c9840hArr) {
        int iM36372m = c9331h1.m36372m() - 1;
        if (c9331h1.m36368i().getLineStart(iM36372m) != c9331h1.m36368i().getLineEnd(iM36372m) || c9840hArr == null || c9840hArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        C9840h c9840h = (C9840h) AbstractC5106t.m20716X(c9840hArr);
        spannableString.setSpan(c9840h.m38239b(0, spannableString.length(), (iM36372m == 0 || !c9840h.m38244g()) ? c9840h.m38244g() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutM36292b = C9316c1.m36292b(C9316c1.f31865a, spannableString, textPaint, Integer.MAX_VALUE, 0, spannableString.length(), textDirectionHeuristic, null, 0, null, 0, 0.0f, 0.0f, 0, c9331h1.m36367h(), c9331h1.m36364e(), 0, 0, 0, 0, null, null, 2072512, null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutM36292b.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutM36292b.getLineDescent(0);
        fontMetricsInt.top = staticLayoutM36292b.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutM36292b.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: renamed from: h */
    public static final long m36413h(C9840h[] c9840hArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (C9840h c9840h : c9840hArr) {
            if (c9840h.m38240c() < 0) {
                iMax = Math.max(iMax, Math.abs(c9840h.m38240c()));
            }
            if (c9840h.m38241d() < 0) {
                iMax2 = Math.max(iMax, Math.abs(c9840h.m38241d()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f31944b : m36406a(iMax, iMax2);
    }

    /* JADX INFO: renamed from: i */
    public static final C9840h[] m36414i(C9331h1 c9331h1) {
        if (!(c9331h1.m36354G() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceM36354G = c9331h1.m36354G();
        charSequenceM36354G.getClass();
        if (!AbstractC9348o0.m36446a((Spanned) charSequenceM36354G, C9840h.class) && c9331h1.m36354G().length() > 0) {
            return null;
        }
        CharSequence charSequenceM36354G2 = c9331h1.m36354G();
        charSequenceM36354G2.getClass();
        return (C9840h[]) ((Spanned) charSequenceM36354G2).getSpans(0, c9331h1.m36354G().length(), C9840h.class);
    }

    /* JADX INFO: renamed from: j */
    public static final ThreadLocal m36415j() {
        return f31943a;
    }

    /* JADX INFO: renamed from: k */
    public static final TextDirectionHeuristic m36416k(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: renamed from: l */
    public static final long m36417l(C9331h1 c9331h1) {
        if (c9331h1.m36367h() || c9331h1.m36357J()) {
            return f31944b;
        }
        TextPaint paint = c9331h1.m36368i().getPaint();
        CharSequence text = c9331h1.m36368i().getText();
        Rect rectM36443c = AbstractC9346n0.m36443c(paint, text, c9331h1.m36368i().getLineStart(0), c9331h1.m36368i().getLineEnd(0));
        int lineAscent = c9331h1.m36368i().getLineAscent(0);
        int i10 = rectM36443c.top;
        int topPadding = i10 < lineAscent ? lineAscent - i10 : c9331h1.m36368i().getTopPadding();
        if (c9331h1.m36372m() != 1) {
            int iM36372m = c9331h1.m36372m() - 1;
            rectM36443c = AbstractC9346n0.m36443c(paint, text, c9331h1.m36368i().getLineStart(iM36372m), c9331h1.m36368i().getLineEnd(iM36372m));
        }
        int lineDescent = c9331h1.m36368i().getLineDescent(c9331h1.m36372m() - 1);
        int i11 = rectM36443c.bottom;
        int bottomPadding = i11 > lineDescent ? i11 - lineDescent : c9331h1.m36368i().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f31944b : m36406a(topPadding, bottomPadding);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m36418m(Layout layout, int i10) {
        return layout.getEllipsisCount(i10) > 0;
    }
}
