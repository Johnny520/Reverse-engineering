package p366z2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p030c3.AbstractC1314a;
import p121i3.AbstractC3194x;
import p121i3.InterfaceC3175e;
import p215oc.C5706c;

/* JADX INFO: renamed from: z2.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9842j extends ReplacementSpan {

    /* JADX INFO: renamed from: B */
    public static final a f33246B = new a(null);

    /* JADX INFO: renamed from: C */
    public static final int f33247C = 8;

    /* JADX INFO: renamed from: A */
    public boolean f33248A;

    /* JADX INFO: renamed from: q */
    public final float f33249q;

    /* JADX INFO: renamed from: r */
    public final int f33250r;

    /* JADX INFO: renamed from: s */
    public final float f33251s;

    /* JADX INFO: renamed from: t */
    public final int f33252t;

    /* JADX INFO: renamed from: u */
    public final float f33253u;

    /* JADX INFO: renamed from: v */
    public final float f33254v;

    /* JADX INFO: renamed from: w */
    public final int f33255w;

    /* JADX INFO: renamed from: x */
    public Paint.FontMetricsInt f33256x;

    /* JADX INFO: renamed from: y */
    public int f33257y;

    /* JADX INFO: renamed from: z */
    public int f33258z;

    public C9842j(float f10, int i10, float f11, int i11, InterfaceC3175e interfaceC3175e, int i12) {
        this(f10, i10, f11, i11, i10 == 0 ? interfaceC3175e.mo1226O1(AbstractC3194x.m12113e(f10)) : 0.0f, i11 == 0 ? interfaceC3175e.mo1226O1(AbstractC3194x.m12113e(f11)) : 0.0f, i12);
    }

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt m38246a() {
        Paint.FontMetricsInt fontMetricsInt = this.f33256x;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC1061t.m3851l("fontMetrics");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m38247b() {
        if (!this.f33248A) {
            AbstractC1314a.m5293c("PlaceholderSpan is not laid out yet.");
        }
        return this.f33258z;
    }

    /* JADX INFO: renamed from: c */
    public final int m38248c() {
        return this.f33255w;
    }

    /* JADX INFO: renamed from: d */
    public final int m38249d() {
        if (!this.f33248A) {
            AbstractC1314a.m5293c("PlaceholderSpan is not laid out yet.");
        }
        return this.f33257y;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        float f11;
        this.f33248A = true;
        float textSize = paint.getTextSize();
        this.f33256x = paint.getFontMetricsInt();
        if (!(m38246a().descent > m38246a().ascent)) {
            AbstractC1314a.m5291a("Invalid fontMetrics: line height can not be negative.");
        }
        int i12 = this.f33250r;
        if (i12 == 0) {
            f10 = this.f33253u;
        } else {
            if (i12 != 1) {
                AbstractC1314a.m5292b("Unsupported unit.");
                C5706c.m23089a();
                return 0;
            }
            f10 = this.f33249q * textSize;
        }
        this.f33257y = AbstractC9843k.m38250a(f10);
        int i13 = this.f33252t;
        if (i13 == 0) {
            f11 = this.f33254v;
        } else {
            if (i13 != 1) {
                AbstractC1314a.m5292b("Unsupported unit.");
                C5706c.m23089a();
                return 0;
            }
            f11 = this.f33251s * textSize;
        }
        this.f33258z = AbstractC9843k.m38250a(f11);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m38246a().ascent;
            fontMetricsInt.descent = m38246a().descent;
            fontMetricsInt.leading = m38246a().leading;
            switch (this.f33255w) {
                case 0:
                    if (fontMetricsInt.ascent > (-m38247b())) {
                        fontMetricsInt.ascent = -m38247b();
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + m38247b() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + m38247b();
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - m38247b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - m38247b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < m38247b()) {
                        int iM38247b = fontMetricsInt.ascent - ((m38247b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iM38247b;
                        fontMetricsInt.descent = iM38247b + m38247b();
                    }
                    break;
                default:
                    AbstractC1314a.m5291a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(m38246a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m38246a().bottom, fontMetricsInt.descent);
        }
        return m38249d();
    }

    /* JADX INFO: renamed from: z2.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public C9842j(float f10, int i10, float f11, int i11, float f12, float f13, int i12) {
        this.f33249q = f10;
        this.f33250r = i10;
        this.f33251s = f11;
        this.f33252t = i11;
        this.f33253u = f12;
        this.f33254v = f13;
        this.f33255w = i12;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
