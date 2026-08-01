package p366z2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import p024b9.AbstractC1043k;
import p030c3.AbstractC1314a;
import p104h3.C2855h;

/* JADX INFO: renamed from: z2.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9840h implements LineHeightSpan {

    /* JADX INFO: renamed from: A */
    public int f33233A;

    /* JADX INFO: renamed from: B */
    public int f33234B;

    /* JADX INFO: renamed from: C */
    public int f33235C;

    /* JADX INFO: renamed from: q */
    public final float f33236q;

    /* JADX INFO: renamed from: r */
    public final int f33237r;

    /* JADX INFO: renamed from: s */
    public final int f33238s;

    /* JADX INFO: renamed from: t */
    public final boolean f33239t;

    /* JADX INFO: renamed from: u */
    public final boolean f33240u;

    /* JADX INFO: renamed from: v */
    public final float f33241v;

    /* JADX INFO: renamed from: w */
    public final int f33242w;

    /* JADX INFO: renamed from: x */
    public int f33243x;

    /* JADX INFO: renamed from: y */
    public int f33244y;

    /* JADX INFO: renamed from: z */
    public int f33245z;

    public C9840h(float f10, int i10, int i11, boolean z10, boolean z11, float f11, int i12) {
        this.f33236q = f10;
        this.f33237r = i10;
        this.f33238s = i11;
        this.f33239t = z10;
        this.f33240u = z11;
        this.f33241v = f11;
        this.f33242w = i12;
        this.f33243x = Integer.MIN_VALUE;
        this.f33244y = Integer.MIN_VALUE;
        this.f33245z = Integer.MIN_VALUE;
        this.f33233A = Integer.MIN_VALUE;
        if ((0.0f <= f11 && f11 <= 1.0f) || f11 == -1.0f) {
            return;
        }
        AbstractC1314a.m5293c("topRatio should be in [0..1] range or -1");
    }

    /* JADX INFO: renamed from: a */
    public final void m38238a(Paint.FontMetricsInt fontMetricsInt) {
        int iCeil = (int) Math.ceil(this.f33236q);
        int iM38245a = iCeil - AbstractC9841i.m38245a(fontMetricsInt);
        int i10 = this.f33242w;
        C2855h.c.a aVar = C2855h.c.f7456b;
        if (C2855h.c.m10190g(i10, aVar.m10195b()) && iM38245a <= 0) {
            int i11 = fontMetricsInt.ascent;
            this.f33244y = i11;
            int i12 = fontMetricsInt.descent;
            this.f33245z = i12;
            this.f33243x = i11;
            this.f33233A = i12;
            this.f33234B = 0;
            this.f33235C = 0;
            return;
        }
        float fAbs = this.f33241v;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / AbstractC9841i.m38245a(fontMetricsInt);
        }
        int iCeil2 = fontMetricsInt.descent + ((int) (iM38245a <= 0 ? Math.ceil(iM38245a * fAbs) : Math.ceil(iM38245a * (1.0f - fAbs))));
        this.f33245z = iCeil2;
        this.f33244y = iCeil2 - iCeil;
        if (C2855h.c.m10190g(this.f33242w, aVar.m10194a()) || iM38245a >= 0) {
            int i13 = this.f33239t ? fontMetricsInt.ascent : this.f33244y;
            this.f33243x = i13;
            int i14 = this.f33240u ? fontMetricsInt.descent : this.f33245z;
            this.f33233A = i14;
            this.f33234B = fontMetricsInt.ascent - i13;
            this.f33235C = i14 - fontMetricsInt.descent;
            return;
        }
        if (C2855h.c.m10190g(this.f33242w, aVar.m10196c())) {
            boolean z10 = this.f33239t;
            int i15 = fontMetricsInt.ascent;
            this.f33243x = z10 ? Math.max(i15, this.f33244y) : Math.min(i15, this.f33244y);
            boolean z11 = this.f33240u;
            int i16 = fontMetricsInt.descent;
            this.f33233A = z11 ? Math.min(i16, this.f33245z) : Math.max(i16, this.f33245z);
            this.f33234B = 0;
            this.f33235C = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C9840h m38239b(int i10, int i11, boolean z10) {
        return new C9840h(this.f33236q, i10, i11, z10, this.f33240u, this.f33241v, this.f33242w, null);
    }

    /* JADX INFO: renamed from: c */
    public final int m38240c() {
        return this.f33234B;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        if (AbstractC9841i.m38245a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.f33237r;
        boolean z11 = i11 == this.f33238s;
        if (z10 && z11 && this.f33239t && this.f33240u && !C2855h.c.m10190g(this.f33242w, C2855h.c.f7456b.m10196c())) {
            return;
        }
        if (this.f33243x == Integer.MIN_VALUE) {
            m38238a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.f33243x : this.f33244y;
        fontMetricsInt.descent = z11 ? this.f33233A : this.f33245z;
    }

    /* JADX INFO: renamed from: d */
    public final int m38241d() {
        return this.f33235C;
    }

    /* JADX INFO: renamed from: e */
    public final int m38242e() {
        return this.f33242w;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m38243f() {
        return this.f33239t;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m38244g() {
        return this.f33240u;
    }

    public /* synthetic */ C9840h(float f10, int i10, int i11, boolean z10, boolean z11, float f11, int i12, AbstractC1043k abstractC1043k) {
        this(f10, i10, i11, z10, z11, f11, i12);
    }
}
