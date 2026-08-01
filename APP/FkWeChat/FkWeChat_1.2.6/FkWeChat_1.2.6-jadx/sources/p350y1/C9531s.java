package p350y1;

import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7105l3;
import p265s1.AbstractC7110m3;
import p265s1.AbstractC7154v2;

/* JADX INFO: renamed from: y1.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9531s extends AbstractC9528p {

    /* JADX INFO: renamed from: A */
    public final float f32509A;

    /* JADX INFO: renamed from: B */
    public final float f32510B;

    /* JADX INFO: renamed from: C */
    public final float f32511C;

    /* JADX INFO: renamed from: D */
    public final float f32512D;

    /* JADX INFO: renamed from: q */
    public final String f32513q;

    /* JADX INFO: renamed from: r */
    public final List f32514r;

    /* JADX INFO: renamed from: s */
    public final int f32515s;

    /* JADX INFO: renamed from: t */
    public final AbstractC7078g1 f32516t;

    /* JADX INFO: renamed from: u */
    public final float f32517u;

    /* JADX INFO: renamed from: v */
    public final AbstractC7078g1 f32518v;

    /* JADX INFO: renamed from: w */
    public final float f32519w;

    /* JADX INFO: renamed from: x */
    public final float f32520x;

    /* JADX INFO: renamed from: y */
    public final int f32521y;

    /* JADX INFO: renamed from: z */
    public final int f32522z;

    public C9531s(String str, List list, int i10, AbstractC7078g1 abstractC7078g1, float f10, AbstractC7078g1 abstractC7078g12, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        super(null);
        this.f32513q = str;
        this.f32514r = list;
        this.f32515s = i10;
        this.f32516t = abstractC7078g1;
        this.f32517u = f10;
        this.f32518v = abstractC7078g12;
        this.f32519w = f11;
        this.f32520x = f12;
        this.f32521y = i11;
        this.f32522z = i12;
        this.f32509A = f13;
        this.f32510B = f14;
        this.f32511C = f15;
        this.f32512D = f16;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC7078g1 m37304a() {
        return this.f32516t;
    }

    /* JADX INFO: renamed from: c */
    public final float m37305c() {
        return this.f32517u;
    }

    /* JADX INFO: renamed from: e */
    public final String m37306e() {
        return this.f32513q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9531s.class == obj.getClass()) {
            C9531s c9531s = (C9531s) obj;
            return AbstractC1061t.m3842c(this.f32513q, c9531s.f32513q) && AbstractC1061t.m3842c(this.f32516t, c9531s.f32516t) && this.f32517u == c9531s.f32517u && AbstractC1061t.m3842c(this.f32518v, c9531s.f32518v) && this.f32519w == c9531s.f32519w && this.f32520x == c9531s.f32520x && AbstractC7105l3.m27993e(this.f32521y, c9531s.f32521y) && AbstractC7110m3.m28006e(this.f32522z, c9531s.f32522z) && this.f32509A == c9531s.f32509A && this.f32510B == c9531s.f32510B && this.f32511C == c9531s.f32511C && this.f32512D == c9531s.f32512D && AbstractC7154v2.m28240d(this.f32515s, c9531s.f32515s) && AbstractC1061t.m3842c(this.f32514r, c9531s.f32514r);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((this.f32513q.hashCode() * 31) + this.f32514r.hashCode()) * 31;
        AbstractC7078g1 abstractC7078g1 = this.f32516t;
        int iHashCode2 = (((iHashCode + (abstractC7078g1 != null ? abstractC7078g1.hashCode() : 0)) * 31) + Float.hashCode(this.f32517u)) * 31;
        AbstractC7078g1 abstractC7078g12 = this.f32518v;
        return ((((((((((((((((((iHashCode2 + (abstractC7078g12 != null ? abstractC7078g12.hashCode() : 0)) * 31) + Float.hashCode(this.f32519w)) * 31) + Float.hashCode(this.f32520x)) * 31) + AbstractC7105l3.m27994f(this.f32521y)) * 31) + AbstractC7110m3.m28007f(this.f32522z)) * 31) + Float.hashCode(this.f32509A)) * 31) + Float.hashCode(this.f32510B)) * 31) + Float.hashCode(this.f32511C)) * 31) + Float.hashCode(this.f32512D)) * 31) + AbstractC7154v2.m28241e(this.f32515s);
    }

    /* JADX INFO: renamed from: l */
    public final List m37307l() {
        return this.f32514r;
    }

    /* JADX INFO: renamed from: o */
    public final int m37308o() {
        return this.f32515s;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC7078g1 m37309p() {
        return this.f32518v;
    }

    /* JADX INFO: renamed from: q */
    public final float m37310q() {
        return this.f32519w;
    }

    /* JADX INFO: renamed from: r */
    public final int m37311r() {
        return this.f32521y;
    }

    /* JADX INFO: renamed from: s */
    public final int m37312s() {
        return this.f32522z;
    }

    /* JADX INFO: renamed from: t */
    public final float m37313t() {
        return this.f32509A;
    }

    /* JADX INFO: renamed from: u */
    public final float m37314u() {
        return this.f32520x;
    }

    /* JADX INFO: renamed from: v */
    public final float m37315v() {
        return this.f32511C;
    }

    /* JADX INFO: renamed from: w */
    public final float m37316w() {
        return this.f32512D;
    }

    /* JADX INFO: renamed from: x */
    public final float m37317x() {
        return this.f32510B;
    }

    public /* synthetic */ C9531s(String str, List list, int i10, AbstractC7078g1 abstractC7078g1, float f10, AbstractC7078g1 abstractC7078g12, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, AbstractC1043k abstractC1043k) {
        this(str, list, i10, abstractC7078g1, f10, abstractC7078g12, f11, f12, i11, i12, f13, f14, f15, f16);
    }
}
