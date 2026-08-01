package p228;

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
import androidx.activity.AbstractC0887;
import androidx.compose.p001ui.text.input.C2853;
import androidx.compose.runtime.internal.C2080;
import kotlin.collections.AbstractC5179;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p211.AbstractC8663;
import p212.C8669;
import p212.C8670;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8780 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Layout f22346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C2853 f22347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f22348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f22349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextUtils.TruncateAt f22350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextPaint f22351;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int f22352;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Paint.FontMetricsInt f22353;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C2080 f22354;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C8670[] f22355;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Rect f22356 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f22357;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f22358;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f22359;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f22360;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f22361;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float f22362;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019f A[PHI: r14
  0x019f: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:96:0x01b1, B:89:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8780(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, C8770 c8770) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutM13994;
        C8670[] c8670Arr;
        int i10;
        int i11;
        int i12;
        char c;
        long j;
        int i13;
        int i14;
        long jM13996;
        ?? IsFallbackLineSpacingEnabled;
        long jM139962;
        int i15;
        Paint.FontMetricsInt fontMetricsInt;
        C8670 c8670;
        C8670 c86702;
        int i16;
        this.f22351 = textPaint;
        this.f22350 = truncateAt;
        this.f22349 = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM13995 = AbstractC8778.m13995(i2);
        Layout.Alignment alignment = AbstractC8776.f22341;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : AbstractC8776.f22340 : AbstractC8776.f22341 : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C8669.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsM13987 = c8770.m13987();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsM13987 == null || c8770.m13985() > f || z2) {
                this.f22360 = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicM13995;
                layoutM13994 = AbstractC8777.m13994(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.f22360 = true;
                if (iCeil < 0) {
                    AbstractC8663.m13757("negative width");
                }
                if (iCeil < 0) {
                    AbstractC8663.m13757("negative ellipsized width");
                }
                layoutM13994 = Build.VERSION.SDK_INT >= 33 ? AbstractC0887.m636(charSequence, textPaint, iCeil, alignment2, metricsM13987, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsM13987, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicM13995;
            }
            this.f22346 = layoutM13994;
            Trace.endSection();
            int iMin = Math.min(layoutM13994.getLineCount(), i9);
            this.f22358 = iMin;
            int i17 = iMin - 1;
            this.f22348 = iMin >= i9 && (layoutM13994.getEllipsisCount(i17) > 0 || layoutM13994.getLineEnd(i17) != charSequence.length());
            if (layoutM13994.getText() instanceof Spanned) {
                CharSequence text = layoutM13994.getText();
                text.getClass();
                if (AbstractC8777.m13989((Spanned) text, C8670.class) || layoutM13994.getText().length() <= 0) {
                    CharSequence text2 = layoutM13994.getText();
                    text2.getClass();
                    i10 = 0;
                    c8670Arr = (C8670[]) ((Spanned) text2).getSpans(0, layoutM13994.getText().length(), C8670.class);
                }
            } else {
                c8670Arr = null;
                i10 = 0;
            }
            this.f22355 = c8670Arr;
            if (c8670Arr == null || (c86702 = (C8670) AbstractC5179.m9387(c8670Arr)) == null) {
                i11 = 2;
                i12 = i10;
            } else {
                if (c86702.f21738) {
                    i11 = 2;
                    i16 = c86702.f21735 == 2 ? 1 : i16;
                    i12 = i16;
                } else {
                    i11 = 2;
                }
                i16 = i10;
                i12 = i16;
            }
            int i18 = (c8670Arr == null || (c8670 = (C8670) AbstractC5179.m9387(c8670Arr)) == null || !c8670.f21732 || c8670.f21735 != i11) ? i10 : 1;
            if (i12 == 0 || i18 == 0) {
                long jM139963 = AbstractC8778.f22343;
                if (z) {
                    c = ' ';
                    j = 4294967295L;
                    i13 = 1;
                    i14 = 33;
                } else if (this.f22360) {
                    i14 = 33;
                    IsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= 33 ? ((BoringLayout) layoutM13994).isFallbackLineSpacingEnabled() : i10;
                    if (IsFallbackLineSpacingEnabled == 0) {
                        c = ' ';
                        j = 4294967295L;
                        i13 = 1;
                    } else {
                        TextPaint paint = layoutM13994.getPaint();
                        CharSequence text3 = layoutM13994.getText();
                        c = ' ';
                        Rect rectM13993 = AbstractC8777.m13993(paint, text3, layoutM13994.getLineStart(i10), layoutM13994.getLineEnd(i10));
                        int lineAscent = layoutM13994.getLineAscent(i10);
                        j = 4294967295L;
                        int i19 = rectM13993.top;
                        int topPadding = i19 < lineAscent ? lineAscent - i19 : layoutM13994.getTopPadding();
                        i13 = 1;
                        rectM13993 = iMin != 1 ? AbstractC8777.m13993(paint, text3, layoutM13994.getLineStart(i17), layoutM13994.getLineEnd(i17)) : rectM13993;
                        int lineDescent = layoutM13994.getLineDescent(i17);
                        int i20 = rectM13993.bottom;
                        int bottomPadding = i20 > lineDescent ? i20 - lineDescent : layoutM13994.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jM139963 = AbstractC8778.m13996(topPadding, bottomPadding);
                        }
                    }
                } else {
                    i14 = 33;
                    StaticLayout staticLayout = (StaticLayout) layoutM13994;
                    int i21 = Build.VERSION.SDK_INT;
                    if (i21 >= 33) {
                        IsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                    } else if (i21 >= 28) {
                        IsFallbackLineSpacingEnabled = 1;
                    }
                    if (IsFallbackLineSpacingEnabled == 0) {
                    }
                }
                jM13996 = AbstractC8778.m13996(i12 != 0 ? i10 : (int) (jM139963 >> c), i18 != 0 ? i10 : (int) (jM139963 & j));
            } else {
                jM13996 = AbstractC8778.f22343;
                c = ' ';
                j = 4294967295L;
                i13 = 1;
                i14 = 33;
            }
            if (c8670Arr != null) {
                int length2 = c8670Arr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i22 = iMax2; i22 < length2; i22++) {
                    C8670 c86703 = c8670Arr[i22];
                    int i23 = c86703.f21729;
                    iMax = i23 < 0 ? Math.max(iMax, Math.abs(i23)) : iMax;
                    int i24 = c86703.f21728;
                    if (i24 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i24));
                    }
                }
                jM139962 = (iMax == 0 && iMax2 == 0) ? AbstractC8778.f22343 : AbstractC8778.m13996(iMax, iMax2);
            } else {
                jM139962 = AbstractC8778.f22343;
            }
            this.f22357 = Math.max((int) (jM13996 >> c), (int) (jM139962 >> c));
            this.f22361 = Math.max((int) (jM13996 & j), (int) (jM139962 & j));
            TextPaint textPaint2 = this.f22351;
            C8670[] c8670Arr2 = this.f22355;
            int i25 = this.f22358 - i13;
            Layout layout = this.f22346;
            if (layout.getLineStart(i25) != layout.getLineEnd(i25) || c8670Arr2 == null || c8670Arr2.length == 0) {
                i15 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                C8670 c86704 = (C8670) AbstractC5179.m9384(c8670Arr2);
                spannableString.setSpan(new C8670(c86704.f21739, spannableString.length(), (i25 == 0 || !c86704.f21732) ? c86704.f21732 : i10, c86704.f21732, c86704.f21731, c86704.f21735), i10, spannableString.length(), i14);
                i15 = i10;
                StaticLayout staticLayoutM13994 = AbstractC8777.m13994(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, AbstractC8772.f22332, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f22349, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutM13994.getLineAscent(i15);
                fontMetricsInt.descent = staticLayoutM13994.getLineDescent(i15);
                fontMetricsInt.top = staticLayoutM13994.getLineTop(i15);
                fontMetricsInt.bottom = staticLayoutM13994.getLineBottom(i15);
            }
            this.f22352 = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (m13999(i17) - m14005(i17))) : i15;
            this.f22353 = fontMetricsInt;
            Layout layout2 = this.f22346;
            this.f22362 = AbstractC5754.m10445(layout2, i17, layout2.getPaint());
            Layout layout3 = this.f22346;
            this.f22359 = AbstractC5754.m10446(layout3, i17, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m13998(int i) {
        ThreadLocal threadLocal = AbstractC8778.f22344;
        Layout layout = this.f22346;
        return (layout.getEllipsisCount(i) <= 0 || this.f22350 != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float m13999(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f22358;
        int i3 = i2 - 1;
        Layout layout = this.f22346;
        if (i != i3 || (fontMetricsInt = this.f22353) == null) {
            return this.f22357 + layout.getLineBottom(i) + (i == i2 + (-1) ? this.f22361 : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float m14000(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f22357 + ((i != this.f22358 + (-1) || (fontMetricsInt = this.f22353) == null) ? this.f22346.getLineBaseline(i) : m14005(i) - fontMetricsInt.ascent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2080 m14001() {
        C2080 c2080 = this.f22354;
        if (c2080 != null) {
            return c2080;
        }
        C2080 c20802 = new C2080(this.f22346);
        this.f22354 = c20802;
        return c20802;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m14002(int i) {
        if (i == this.f22358 - 1) {
            return this.f22362 + this.f22359;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m14003() {
        boolean z = this.f22348;
        Layout layout = this.f22346;
        return (z ? layout.getLineBottom(this.f22358 - 1) : layout.getHeight()) + this.f22357 + this.f22361 + this.f22352;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m14004(int i, boolean z) {
        return m14002(this.f22346.getLineForOffset(i)) + m14001().m2725(i, true, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float m14005(int i) {
        return this.f22346.getLineTop(i) + (i == 0 ? 0 : this.f22357);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float m14006(int i, boolean z) {
        return m14002(this.f22346.getLineForOffset(i)) + m14001().m2725(i, false, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C2853 m14007() {
        C2853 c2853 = this.f22347;
        if (c2853 != null) {
            return c2853;
        }
        Layout layout = this.f22346;
        C2853 c28532 = new C2853(layout.getText(), layout.getText().length(), this.f22351.getTextLocale());
        this.f22347 = c28532;
        return c28532;
    }
}
