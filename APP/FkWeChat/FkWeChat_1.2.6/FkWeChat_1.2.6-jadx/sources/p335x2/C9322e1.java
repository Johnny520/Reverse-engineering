package p335x2;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p030c3.AbstractC1314a;

/* JADX INFO: renamed from: x2.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9322e1 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f31876a;

    /* JADX INFO: renamed from: b */
    public final int f31877b;

    /* JADX INFO: renamed from: c */
    public final int f31878c;

    /* JADX INFO: renamed from: d */
    public final TextPaint f31879d;

    /* JADX INFO: renamed from: e */
    public final int f31880e;

    /* JADX INFO: renamed from: f */
    public final TextDirectionHeuristic f31881f;

    /* JADX INFO: renamed from: g */
    public final Layout.Alignment f31882g;

    /* JADX INFO: renamed from: h */
    public final int f31883h;

    /* JADX INFO: renamed from: i */
    public final TextUtils.TruncateAt f31884i;

    /* JADX INFO: renamed from: j */
    public final int f31885j;

    /* JADX INFO: renamed from: k */
    public final float f31886k;

    /* JADX INFO: renamed from: l */
    public final float f31887l;

    /* JADX INFO: renamed from: m */
    public final int f31888m;

    /* JADX INFO: renamed from: n */
    public final boolean f31889n;

    /* JADX INFO: renamed from: o */
    public final boolean f31890o;

    /* JADX INFO: renamed from: p */
    public final int f31891p;

    /* JADX INFO: renamed from: q */
    public final int f31892q;

    /* JADX INFO: renamed from: r */
    public final int f31893r;

    /* JADX INFO: renamed from: s */
    public final int f31894s;

    /* JADX INFO: renamed from: t */
    public final int[] f31895t;

    /* JADX INFO: renamed from: u */
    public final int[] f31896u;

    public C9322e1(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        this.f31876a = charSequence;
        this.f31877b = i10;
        this.f31878c = i11;
        this.f31879d = textPaint;
        this.f31880e = i12;
        this.f31881f = textDirectionHeuristic;
        this.f31882g = alignment;
        this.f31883h = i13;
        this.f31884i = truncateAt;
        this.f31885j = i14;
        this.f31886k = f10;
        this.f31887l = f11;
        this.f31888m = i15;
        this.f31889n = z10;
        this.f31890o = z11;
        this.f31891p = i16;
        this.f31892q = i17;
        this.f31893r = i18;
        this.f31894s = i19;
        this.f31895t = iArr;
        this.f31896u = iArr2;
        if (!(i10 >= 0 && i10 <= i11)) {
            AbstractC1314a.m5291a("invalid start value");
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            AbstractC1314a.m5291a("invalid end value");
        }
        if (!(i13 >= 0)) {
            AbstractC1314a.m5291a("invalid maxLines value");
        }
        if (!(i12 >= 0)) {
            AbstractC1314a.m5291a("invalid width value");
        }
        if (!(i14 >= 0)) {
            AbstractC1314a.m5291a("invalid ellipsizedWidth value");
        }
        if (f10 >= 0.0f) {
            return;
        }
        AbstractC1314a.m5291a("invalid lineSpacingMultiplier value");
    }

    /* JADX INFO: renamed from: a */
    public final Layout.Alignment m36303a() {
        return this.f31882g;
    }

    /* JADX INFO: renamed from: b */
    public final int m36304b() {
        return this.f31891p;
    }

    /* JADX INFO: renamed from: c */
    public final TextUtils.TruncateAt m36305c() {
        return this.f31884i;
    }

    /* JADX INFO: renamed from: d */
    public final int m36306d() {
        return this.f31885j;
    }

    /* JADX INFO: renamed from: e */
    public final int m36307e() {
        return this.f31878c;
    }

    /* JADX INFO: renamed from: f */
    public final int m36308f() {
        return this.f31894s;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m36309g() {
        return this.f31889n;
    }

    /* JADX INFO: renamed from: h */
    public final int m36310h() {
        return this.f31888m;
    }

    /* JADX INFO: renamed from: i */
    public final int[] m36311i() {
        return this.f31895t;
    }

    /* JADX INFO: renamed from: j */
    public final int m36312j() {
        return this.f31892q;
    }

    /* JADX INFO: renamed from: k */
    public final int m36313k() {
        return this.f31893r;
    }

    /* JADX INFO: renamed from: l */
    public final float m36314l() {
        return this.f31887l;
    }

    /* JADX INFO: renamed from: m */
    public final float m36315m() {
        return this.f31886k;
    }

    /* JADX INFO: renamed from: n */
    public final int m36316n() {
        return this.f31883h;
    }

    /* JADX INFO: renamed from: o */
    public final TextPaint m36317o() {
        return this.f31879d;
    }

    /* JADX INFO: renamed from: p */
    public final int[] m36318p() {
        return this.f31896u;
    }

    /* JADX INFO: renamed from: q */
    public final int m36319q() {
        return this.f31877b;
    }

    /* JADX INFO: renamed from: r */
    public final CharSequence m36320r() {
        return this.f31876a;
    }

    /* JADX INFO: renamed from: s */
    public final TextDirectionHeuristic m36321s() {
        return this.f31881f;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m36322t() {
        return this.f31890o;
    }

    /* JADX INFO: renamed from: u */
    public final int m36323u() {
        return this.f31880e;
    }
}
