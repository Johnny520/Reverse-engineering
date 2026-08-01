package p335x2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import okhttp3.internal.http2.Http2;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p030c3.AbstractC1314a;
import p104h3.C2855h;
import p185m8.AbstractC5106t;
import p351y2.C9540i;
import p366z2.AbstractC9836d;
import p366z2.C9833a;
import p366z2.C9840h;

/* JADX INFO: renamed from: x2.h1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9331h1 {

    /* JADX INFO: renamed from: a */
    public final TextPaint f31915a;

    /* JADX INFO: renamed from: b */
    public final TextUtils.TruncateAt f31916b;

    /* JADX INFO: renamed from: c */
    public final boolean f31917c;

    /* JADX INFO: renamed from: d */
    public final boolean f31918d;

    /* JADX INFO: renamed from: e */
    public final C9336j0 f31919e;

    /* JADX INFO: renamed from: f */
    public final boolean f31920f;

    /* JADX INFO: renamed from: g */
    public C9540i f31921g;

    /* JADX INFO: renamed from: h */
    public final Layout f31922h;

    /* JADX INFO: renamed from: i */
    public final int f31923i;

    /* JADX INFO: renamed from: j */
    public final int f31924j;

    /* JADX INFO: renamed from: k */
    public final int f31925k;

    /* JADX INFO: renamed from: l */
    public final float f31926l;

    /* JADX INFO: renamed from: m */
    public final float f31927m;

    /* JADX INFO: renamed from: n */
    public final boolean f31928n;

    /* JADX INFO: renamed from: o */
    public final Paint.FontMetricsInt f31929o;

    /* JADX INFO: renamed from: p */
    public final int f31930p;

    /* JADX INFO: renamed from: q */
    public final C9840h[] f31931q;

    /* JADX INFO: renamed from: r */
    public final Rect f31932r;

    /* JADX INFO: renamed from: s */
    public C9330h0 f31933s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    public C9331h1(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, C9336j0 c9336j0) {
        boolean z12;
        int i18;
        boolean z13;
        TextDirectionHeuristic textDirectionHeuristic;
        TextPaint textPaint2;
        Layout layoutM36293a;
        boolean z14;
        long jM36406a;
        C9840h c9840h;
        C9840h c9840h2;
        this.f31915a = textPaint;
        this.f31916b = truncateAt;
        this.f31917c = z10;
        this.f31918d = z11;
        this.f31919e = c9336j0;
        this.f31932r = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM36416k = AbstractC9337j1.m36416k(i11);
        Layout.Alignment alignmentM36328a = C9325f1.f31902a.m36328a(i10);
        boolean z15 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C9833a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsM36401d = c9336j0.m36401d();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsM36401d == null || c9336j0.m36404h() > f10 || z15) {
                z12 = true;
                this.f31928n = false;
                i18 = i12;
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristicM36416k;
                textPaint2 = textPaint;
                layoutM36293a = C9316c1.f31865a.m36293a(charSequence, textPaint2, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignmentM36328a, i18, truncateAt, (int) Math.ceil(d10), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                z12 = true;
                this.f31928n = true;
                layoutM36293a = C9338k.f31945a.m36419a(charSequence, textPaint, iCeil, metricsM36401d, alignmentM36328a, z10, z11, truncateAt, iCeil);
                textPaint2 = textPaint;
                i18 = i12;
                textDirectionHeuristic = textDirectionHeuristicM36416k;
                z13 = false;
            }
            this.f31922h = layoutM36293a;
            Trace.endSection();
            int iMin = Math.min(layoutM36293a.getLineCount(), i18);
            this.f31923i = iMin;
            int i19 = iMin - 1;
            this.f31920f = (iMin >= i18 && (layoutM36293a.getEllipsisCount(i19) > 0 || layoutM36293a.getLineEnd(i19) != charSequence.length())) ? z12 : z13;
            C9840h[] c9840hArrM36414i = AbstractC9337j1.m36414i(this);
            this.f31931q = c9840hArrM36414i;
            if (c9840hArrM36414i == null || (c9840h2 = (C9840h) AbstractC5106t.m20720Z(c9840hArrM36414i)) == null) {
                z14 = z13;
            } else {
                z14 = (c9840h2.m38243f() && C2855h.c.m10190g(c9840h2.m38242e(), C2855h.c.f7456b.m10196c())) ? z12 : z13;
            }
            boolean z16 = (c9840hArrM36414i == null || (c9840h = (C9840h) AbstractC5106t.m20720Z(c9840hArrM36414i)) == null || !c9840h.m38244g() || !C2855h.c.m10190g(c9840h.m38242e(), C2855h.c.f7456b.m10196c())) ? z13 : z12;
            if (z14 && z16) {
                jM36406a = AbstractC9337j1.f31944b;
            } else {
                long jM36417l = AbstractC9337j1.m36417l(this);
                jM36406a = AbstractC9337j1.m36406a(z14 ? z13 : AbstractC9340k1.m36429c(jM36417l), z16 ? z13 : AbstractC9340k1.m36428b(jM36417l));
            }
            long jM36413h = c9840hArrM36414i != null ? AbstractC9337j1.m36413h(c9840hArrM36414i) : AbstractC9337j1.f31944b;
            this.f31924j = Math.max(AbstractC9340k1.m36429c(jM36406a), AbstractC9340k1.m36429c(jM36413h));
            this.f31925k = Math.max(AbstractC9340k1.m36428b(jM36406a), AbstractC9340k1.m36428b(jM36413h));
            Paint.FontMetricsInt fontMetricsIntM36412g = AbstractC9337j1.m36412g(this, textPaint2, textDirectionHeuristic, c9840hArrM36414i);
            this.f31930p = fontMetricsIntM36412g != null ? fontMetricsIntM36412g.bottom - ((int) m36378s(i19)) : z13;
            this.f31929o = fontMetricsIntM36412g;
            this.f31926l = AbstractC9836d.m38234b(layoutM36293a, i19, null, 2, null);
            this.f31927m = AbstractC9836d.m38236d(layoutM36293a, i19, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ float m36348B(C9331h1 c9331h1, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return c9331h1.m36350A(i10, z10);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ float m36349E(C9331h1 c9331h1, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return c9331h1.m36352D(i10, z10);
    }

    /* JADX INFO: renamed from: A */
    public final float m36350A(int i10, boolean z10) {
        return m36369j().m36337c(i10, true, z10) + m36366g(m36376q(i10));
    }

    /* JADX INFO: renamed from: C */
    public final int[] m36351C(RectF rectF, int i10, InterfaceC0188p interfaceC0188p) {
        return Build.VERSION.SDK_INT >= 34 ? C9323f.f31897a.m36325b(this, rectF, i10, interfaceC0188p) : AbstractC9334i1.m36390d(this, this.f31922h, m36369j(), rectF, i10, interfaceC0188p);
    }

    /* JADX INFO: renamed from: D */
    public final float m36352D(int i10, boolean z10) {
        return m36369j().m36337c(i10, false, z10) + m36366g(m36376q(i10));
    }

    /* JADX INFO: renamed from: F */
    public final void m36353F(int i10, int i11, Path path) {
        this.f31922h.getSelectionPath(i10, i11, path);
        if (this.f31924j == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.f31924j);
    }

    /* JADX INFO: renamed from: G */
    public final CharSequence m36354G() {
        return this.f31922h.getText();
    }

    /* JADX INFO: renamed from: H */
    public final TextPaint m36355H() {
        return this.f31915a;
    }

    /* JADX INFO: renamed from: I */
    public final C9540i m36356I() {
        C9540i c9540i = this.f31921g;
        if (c9540i != null) {
            return c9540i;
        }
        C9540i c9540i2 = new C9540i(this.f31922h.getText(), 0, this.f31922h.getText().length(), this.f31915a.getTextLocale());
        this.f31921g = c9540i2;
        return c9540i2;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m36357J() {
        if (this.f31928n) {
            C9338k c9338k = C9338k.f31945a;
            Layout layout = this.f31922h;
            layout.getClass();
            return c9338k.m36420b((BoringLayout) layout);
        }
        C9316c1 c9316c1 = C9316c1.f31865a;
        Layout layout2 = this.f31922h;
        layout2.getClass();
        return c9316c1.m36294c((StaticLayout) layout2, this.f31918d);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m36358K(int i10) {
        return this.f31922h.isRtlCharAt(i10);
    }

    /* JADX INFO: renamed from: L */
    public final void m36359L(Canvas canvas) {
        if (canvas.getClipBounds(this.f31932r)) {
            int i10 = this.f31924j;
            if (i10 != 0) {
                canvas.translate(0.0f, i10);
            }
            ThreadLocal threadLocalM36415j = AbstractC9337j1.m36415j();
            Object c9328g1 = threadLocalM36415j.get();
            if (c9328g1 == null) {
                c9328g1 = new C9328g1();
                threadLocalM36415j.set(c9328g1);
            }
            C9328g1 c9328g12 = (C9328g1) c9328g1;
            c9328g12.m36332b(canvas);
            try {
                this.f31922h.draw(c9328g12);
                c9328g12.m36332b(null);
                int i11 = this.f31924j;
                if (i11 != 0) {
                    canvas.translate(0.0f, (-1) * i11);
                }
            } catch (Throwable th) {
                c9328g12.m36332b(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m36360a(int i10, int i11, float[] fArr, int i12) {
        float fM36301d;
        float fM36302e;
        int length = m36354G().length();
        if (!(i10 >= 0)) {
            AbstractC1314a.m5291a("startOffset must be > 0");
        }
        if (!(i10 < length)) {
            AbstractC1314a.m5291a("startOffset must be less than text length");
        }
        if (!(i11 > i10)) {
            AbstractC1314a.m5291a("endOffset must be greater than startOffset");
        }
        if (!(i11 <= length)) {
            AbstractC1314a.m5291a("endOffset must be smaller or equal to text length");
        }
        if (!(fArr.length - i12 >= (i11 - i10) * 4)) {
            AbstractC1314a.m5291a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iM36376q = m36376q(i10);
        int iM36376q2 = m36376q(i11 - 1);
        C9321e0 c9321e0 = new C9321e0(this);
        if (iM36376q > iM36376q2) {
            return;
        }
        int i13 = iM36376q;
        int i14 = i12;
        while (true) {
            int iM36381v = m36381v(i13);
            int iM36375p = m36375p(i13);
            int iMin = Math.min(i11, iM36375p);
            float fM36382w = m36382w(i13);
            float fM36371l = m36371l(i13);
            boolean z10 = m36385z(i13) == 1;
            for (int iMax = Math.max(i10, iM36381v); iMax < iMin; iMax++) {
                boolean zM36358K = m36358K(iMax);
                if (z10 && !zM36358K) {
                    fM36301d = c9321e0.m36299b(iMax);
                    fM36302e = c9321e0.m36300c(iMax + 1);
                } else if (z10 && zM36358K) {
                    fM36302e = c9321e0.m36301d(iMax);
                    fM36301d = c9321e0.m36302e(iMax + 1);
                } else if (z10 || !zM36358K) {
                    fM36301d = c9321e0.m36301d(iMax);
                    fM36302e = c9321e0.m36302e(iMax + 1);
                } else {
                    fM36302e = c9321e0.m36299b(iMax);
                    fM36301d = c9321e0.m36300c(iMax + 1);
                }
                fArr[i14] = fM36301d;
                fArr[i14 + 1] = fM36382w;
                fArr[i14 + 2] = fM36302e;
                fArr[i14 + 3] = fM36371l;
                i14 += 4;
            }
            if (i13 == iM36376q2) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m36361b(int i10, float[] fArr) {
        float fM36301d;
        float fM36302e;
        int iM36381v = m36381v(i10);
        int iM36375p = m36375p(i10);
        int i11 = 0;
        if (!(fArr.length >= (iM36375p - iM36381v) * 2)) {
            AbstractC1314a.m5291a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        C9321e0 c9321e0 = new C9321e0(this);
        boolean z10 = m36385z(i10) == 1;
        while (iM36381v < iM36375p) {
            boolean zM36358K = m36358K(iM36381v);
            if (z10 && !zM36358K) {
                fM36301d = c9321e0.m36299b(iM36381v);
                fM36302e = c9321e0.m36300c(iM36381v + 1);
            } else if (z10 && zM36358K) {
                fM36302e = c9321e0.m36301d(iM36381v);
                fM36301d = c9321e0.m36302e(iM36381v + 1);
            } else if (zM36358K) {
                fM36302e = c9321e0.m36299b(iM36381v);
                fM36301d = c9321e0.m36300c(iM36381v + 1);
            } else {
                fM36301d = c9321e0.m36301d(iM36381v);
                fM36302e = c9321e0.m36302e(iM36381v + 1);
            }
            fArr[i11] = fM36301d;
            fArr[i11 + 1] = fM36302e;
            i11 += 2;
            iM36381v++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final RectF m36362c(int i10) {
        float fM36352D;
        float fM36352D2;
        float fM36350A;
        float fM36350A2;
        int iM36376q = m36376q(i10);
        float fM36382w = m36382w(iM36376q);
        float fM36371l = m36371l(iM36376q);
        boolean z10 = m36385z(iM36376q) == 1;
        boolean zIsRtlCharAt = this.f31922h.isRtlCharAt(i10);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fM36350A = m36352D(i10, false);
                fM36350A2 = m36352D(i10 + 1, true);
            } else if (zIsRtlCharAt) {
                fM36350A = m36350A(i10, false);
                fM36350A2 = m36350A(i10 + 1, true);
            } else {
                fM36352D = m36352D(i10, false);
                fM36352D2 = m36352D(i10 + 1, true);
            }
            float f10 = fM36350A;
            fM36352D = fM36350A2;
            fM36352D2 = f10;
        } else {
            fM36352D = m36350A(i10, false);
            fM36352D2 = m36350A(i10 + 1, true);
        }
        return new RectF(fM36352D, fM36382w, fM36352D2, fM36371l);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m36363d() {
        return this.f31920f;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m36364e() {
        return this.f31918d;
    }

    /* JADX INFO: renamed from: f */
    public final int m36365f() {
        boolean z10 = this.f31920f;
        Layout layout = this.f31922h;
        return (z10 ? layout.getLineBottom(this.f31923i - 1) : layout.getHeight()) + this.f31924j + this.f31925k + this.f31930p;
    }

    /* JADX INFO: renamed from: g */
    public final float m36366g(int i10) {
        if (i10 == this.f31923i - 1) {
            return this.f31926l + this.f31927m;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m36367h() {
        return this.f31917c;
    }

    /* JADX INFO: renamed from: i */
    public final Layout m36368i() {
        return this.f31922h;
    }

    /* JADX INFO: renamed from: j */
    public final C9330h0 m36369j() {
        C9330h0 c9330h0 = this.f31933s;
        if (c9330h0 != null) {
            c9330h0.getClass();
            return c9330h0;
        }
        C9330h0 c9330h02 = new C9330h0(this.f31922h);
        this.f31933s = c9330h02;
        return c9330h02;
    }

    /* JADX INFO: renamed from: k */
    public final float m36370k(int i10) {
        return this.f31924j + ((i10 != this.f31923i + (-1) || this.f31929o == null) ? this.f31922h.getLineBaseline(i10) : m36382w(i10) - this.f31929o.ascent);
    }

    /* JADX INFO: renamed from: l */
    public final float m36371l(int i10) {
        if (i10 != this.f31923i - 1 || this.f31929o == null) {
            return this.f31924j + this.f31922h.getLineBottom(i10) + (i10 == this.f31923i + (-1) ? this.f31925k : 0);
        }
        return this.f31922h.getLineBottom(i10 - 1) + this.f31929o.bottom;
    }

    /* JADX INFO: renamed from: m */
    public final int m36372m() {
        return this.f31923i;
    }

    /* JADX INFO: renamed from: n */
    public final int m36373n(int i10) {
        return this.f31922h.getEllipsisCount(i10);
    }

    /* JADX INFO: renamed from: o */
    public final int m36374o(int i10) {
        return this.f31922h.getEllipsisStart(i10);
    }

    /* JADX INFO: renamed from: p */
    public final int m36375p(int i10) {
        return (AbstractC9337j1.m36418m(this.f31922h, i10) && this.f31916b == TextUtils.TruncateAt.END) ? this.f31922h.getText().length() : this.f31922h.getLineEnd(i10);
    }

    /* JADX INFO: renamed from: q */
    public final int m36376q(int i10) {
        return this.f31922h.getLineForOffset(i10);
    }

    /* JADX INFO: renamed from: r */
    public final int m36377r(int i10) {
        return this.f31922h.getLineForVertical(i10 - this.f31924j);
    }

    /* JADX INFO: renamed from: s */
    public final float m36378s(int i10) {
        return m36371l(i10) - m36382w(i10);
    }

    /* JADX INFO: renamed from: t */
    public final float m36379t(int i10) {
        return this.f31922h.getLineLeft(i10) + (i10 == this.f31923i + (-1) ? this.f31926l : 0.0f);
    }

    /* JADX INFO: renamed from: u */
    public final float m36380u(int i10) {
        return this.f31922h.getLineRight(i10) + (i10 == this.f31923i + (-1) ? this.f31927m : 0.0f);
    }

    /* JADX INFO: renamed from: v */
    public final int m36381v(int i10) {
        return this.f31922h.getLineStart(i10);
    }

    /* JADX INFO: renamed from: w */
    public final float m36382w(int i10) {
        return this.f31922h.getLineTop(i10) + (i10 == 0 ? 0 : this.f31924j);
    }

    /* JADX INFO: renamed from: x */
    public final int m36383x(int i10) {
        return (AbstractC9337j1.m36418m(this.f31922h, i10) && this.f31916b == TextUtils.TruncateAt.END) ? this.f31922h.getLineStart(i10) + this.f31922h.getEllipsisStart(i10) : m36369j().m36339e(i10);
    }

    /* JADX INFO: renamed from: y */
    public final int m36384y(int i10, float f10) {
        return this.f31922h.getOffsetForHorizontal(i10, f10 + ((-1) * m36366g(i10)));
    }

    /* JADX INFO: renamed from: z */
    public final int m36385z(int i10) {
        return this.f31922h.getParagraphDirection(i10);
    }

    public /* synthetic */ C9331h1(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, C9336j0 c9336j0, int i18, AbstractC1043k abstractC1043k) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        C9336j0 c9336j02;
        int i19 = (i18 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i18 & 16) != 0 ? null : truncateAt;
        int i20 = (i18 & 32) != 0 ? 2 : i11;
        float f13 = (i18 & 64) != 0 ? 1.0f : f11;
        float f14 = (i18 & 128) != 0 ? 0.0f : f12;
        boolean z12 = (i18 & 256) != 0 ? false : z10;
        boolean z13 = (i18 & 512) != 0 ? true : z11;
        int i21 = (i18 & 1024) != 0 ? Integer.MAX_VALUE : i12;
        int i22 = (i18 & 2048) != 0 ? 0 : i13;
        int i23 = (i18 & 4096) != 0 ? 0 : i14;
        int i24 = (i18 & 8192) != 0 ? 0 : i15;
        int i25 = (i18 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i16;
        int i26 = (32768 & i18) != 0 ? 0 : i17;
        int[] iArr3 = (65536 & i18) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i18) != 0 ? null : iArr2;
        if ((i18 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            c9336j02 = new C9336j0(charSequence2, textPaint2, i20);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            c9336j02 = c9336j0;
        }
        this(charSequence2, f10, textPaint2, i19, truncateAt2, i20, f13, f14, z12, z13, i21, i22, i23, i24, i25, i26, iArr3, iArr4, c9336j02);
    }
}
