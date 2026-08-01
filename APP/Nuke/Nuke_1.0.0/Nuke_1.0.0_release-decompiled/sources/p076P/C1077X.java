package p076P;

import p117X2.AbstractC1665j;
import p272z.C3506d;

/* JADX INFO: renamed from: P.X */
/* JADX INFO: loaded from: classes.dex */
public final class C1077X {

    /* JADX INFO: renamed from: a */
    public final C3506d f3355a;

    /* JADX INFO: renamed from: b */
    public final C3506d f3356b;

    /* JADX INFO: renamed from: c */
    public final C3506d f3357c;

    /* JADX INFO: renamed from: d */
    public final C3506d f3358d;

    /* JADX INFO: renamed from: e */
    public final C3506d f3359e;

    /* JADX INFO: renamed from: f */
    public final C3506d f3360f;

    /* JADX INFO: renamed from: g */
    public final C3506d f3361g;

    /* JADX INFO: renamed from: h */
    public final C3506d f3362h;

    public C1077X() {
        C3506d c3506d = AbstractC1076W.f3346a;
        C3506d c3506d2 = AbstractC1076W.f3347b;
        C3506d c3506d3 = AbstractC1076W.f3348c;
        C3506d c3506d4 = AbstractC1076W.f3349d;
        C3506d c3506d5 = AbstractC1076W.f3351f;
        C3506d c3506d6 = AbstractC1076W.f3350e;
        C3506d c3506d7 = AbstractC1076W.f3352g;
        C3506d c3506d8 = AbstractC1076W.f3353h;
        this.f3355a = c3506d;
        this.f3356b = c3506d2;
        this.f3357c = c3506d3;
        this.f3358d = c3506d4;
        this.f3359e = c3506d5;
        this.f3360f = c3506d6;
        this.f3361g = c3506d7;
        this.f3362h = c3506d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1077X)) {
            return false;
        }
        C1077X c1077x = (C1077X) obj;
        return AbstractC1665j.m2981a(this.f3355a, c1077x.f3355a) && AbstractC1665j.m2981a(this.f3356b, c1077x.f3356b) && AbstractC1665j.m2981a(this.f3357c, c1077x.f3357c) && AbstractC1665j.m2981a(this.f3358d, c1077x.f3358d) && AbstractC1665j.m2981a(this.f3359e, c1077x.f3359e) && AbstractC1665j.m2981a(this.f3360f, c1077x.f3360f) && AbstractC1665j.m2981a(this.f3361g, c1077x.f3361g) && AbstractC1665j.m2981a(this.f3362h, c1077x.f3362h);
    }

    public final int hashCode() {
        return this.f3362h.hashCode() + ((this.f3361g.hashCode() + ((this.f3360f.hashCode() + ((this.f3359e.hashCode() + ((this.f3358d.hashCode() + ((this.f3357c.hashCode() + ((this.f3356b.hashCode() + (this.f3355a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f3355a + ", small=" + this.f3356b + ", medium=" + this.f3357c + ", large=" + this.f3358d + ", largeIncreased=" + this.f3360f + ", extraLarge=" + this.f3359e + ", extralargeIncreased=" + this.f3361g + ", extraExtraLarge=" + this.f3362h + ')';
    }
}
