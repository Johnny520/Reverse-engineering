package p264s0;

import p001a0.AbstractC0003a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: s0.s8 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6935s8 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0003a f22780a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0003a f22781b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0003a f22782c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0003a f22783d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0003a f22784e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0003a f22785f;

    /* JADX INFO: renamed from: g */
    public final AbstractC0003a f22786g;

    /* JADX INFO: renamed from: h */
    public final AbstractC0003a f22787h;

    public /* synthetic */ C6935s8(AbstractC0003a abstractC0003a, AbstractC0003a abstractC0003a2, AbstractC0003a abstractC0003a3, AbstractC0003a abstractC0003a4, AbstractC0003a abstractC0003a5, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? C6920r8.f22665a.m27476e() : abstractC0003a, (i10 & 2) != 0 ? C6920r8.f22665a.m27480i() : abstractC0003a2, (i10 & 4) != 0 ? C6920r8.f22665a.m27479h() : abstractC0003a3, (i10 & 8) != 0 ? C6920r8.f22665a.m27477f() : abstractC0003a4, (i10 & 16) != 0 ? C6920r8.f22665a.m27474c() : abstractC0003a5);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0003a m27506a() {
        return this.f22787h;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0003a m27507b() {
        return this.f22784e;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0003a m27508c() {
        return this.f22786g;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0003a m27509d() {
        return this.f22780a;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0003a m27510e() {
        return this.f22783d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6935s8)) {
            return false;
        }
        C6935s8 c6935s8 = (C6935s8) obj;
        return AbstractC1061t.m3842c(this.f22780a, c6935s8.f22780a) && AbstractC1061t.m3842c(this.f22781b, c6935s8.f22781b) && AbstractC1061t.m3842c(this.f22782c, c6935s8.f22782c) && AbstractC1061t.m3842c(this.f22783d, c6935s8.f22783d) && AbstractC1061t.m3842c(this.f22784e, c6935s8.f22784e) && AbstractC1061t.m3842c(this.f22785f, c6935s8.f22785f) && AbstractC1061t.m3842c(this.f22786g, c6935s8.f22786g) && AbstractC1061t.m3842c(this.f22787h, c6935s8.f22787h);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC0003a m27511f() {
        return this.f22785f;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0003a m27512g() {
        return this.f22782c;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC0003a m27513h() {
        return this.f22781b;
    }

    public int hashCode() {
        return (((((((((((((this.f22780a.hashCode() * 31) + this.f22781b.hashCode()) * 31) + this.f22782c.hashCode()) * 31) + this.f22783d.hashCode()) * 31) + this.f22784e.hashCode()) * 31) + this.f22785f.hashCode()) * 31) + this.f22786g.hashCode()) * 31) + this.f22787h.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.f22780a + ", small=" + this.f22781b + ", medium=" + this.f22782c + ", large=" + this.f22783d + ", largeIncreased=" + this.f22785f + ", extraLarge=" + this.f22784e + ", extralargeIncreased=" + this.f22786g + ", extraExtraLarge=" + this.f22787h + ')';
    }

    public C6935s8(AbstractC0003a abstractC0003a, AbstractC0003a abstractC0003a2, AbstractC0003a abstractC0003a3, AbstractC0003a abstractC0003a4, AbstractC0003a abstractC0003a5, AbstractC0003a abstractC0003a6, AbstractC0003a abstractC0003a7, AbstractC0003a abstractC0003a8) {
        this.f22780a = abstractC0003a;
        this.f22781b = abstractC0003a2;
        this.f22782c = abstractC0003a3;
        this.f22783d = abstractC0003a4;
        this.f22784e = abstractC0003a5;
        this.f22785f = abstractC0003a6;
        this.f22786g = abstractC0003a7;
        this.f22787h = abstractC0003a8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6935s8(AbstractC0003a abstractC0003a, AbstractC0003a abstractC0003a2, AbstractC0003a abstractC0003a3, AbstractC0003a abstractC0003a4, AbstractC0003a abstractC0003a5) {
        C6920r8 c6920r8 = C6920r8.f22665a;
        this(abstractC0003a, abstractC0003a2, abstractC0003a3, abstractC0003a4, abstractC0003a5, c6920r8.m27478g(), c6920r8.m27475d(), c6920r8.m27473b());
    }
}
