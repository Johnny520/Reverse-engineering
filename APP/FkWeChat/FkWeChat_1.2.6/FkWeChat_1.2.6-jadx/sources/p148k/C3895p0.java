package p148k;

import java.util.Map;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5109u0;

/* JADX INFO: renamed from: k.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3895p0 {

    /* JADX INFO: renamed from: a */
    public final C3905z f11270a;

    /* JADX INFO: renamed from: b */
    public final C3887l0 f11271b;

    /* JADX INFO: renamed from: c */
    public final C3888m f11272c;

    /* JADX INFO: renamed from: d */
    public final C3875f0 f11273d;

    /* JADX INFO: renamed from: e */
    public final boolean f11274e;

    /* JADX INFO: renamed from: f */
    public final Map f11275f;

    public /* synthetic */ C3895p0(C3905z c3905z, C3887l0 c3887l0, C3888m c3888m, C3875f0 c3875f0, boolean z10, Map map, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : c3905z, (i10 & 2) != 0 ? null : c3887l0, (i10 & 4) != 0 ? null : c3888m, (i10 & 8) != 0 ? null : c3875f0, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? AbstractC5109u0.m20768i() : map);
    }

    /* JADX INFO: renamed from: a */
    public final C3888m m15468a() {
        return this.f11272c;
    }

    /* JADX INFO: renamed from: b */
    public final Map m15469b() {
        return this.f11275f;
    }

    /* JADX INFO: renamed from: c */
    public final C3905z m15470c() {
        return this.f11270a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15471d() {
        return this.f11274e;
    }

    /* JADX INFO: renamed from: e */
    public final C3875f0 m15472e() {
        return this.f11273d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3895p0)) {
            return false;
        }
        C3895p0 c3895p0 = (C3895p0) obj;
        return AbstractC1061t.m3842c(this.f11270a, c3895p0.f11270a) && AbstractC1061t.m3842c(this.f11271b, c3895p0.f11271b) && AbstractC1061t.m3842c(this.f11272c, c3895p0.f11272c) && AbstractC1061t.m3842c(this.f11273d, c3895p0.f11273d) && this.f11274e == c3895p0.f11274e && AbstractC1061t.m3842c(this.f11275f, c3895p0.f11275f);
    }

    /* JADX INFO: renamed from: f */
    public final C3887l0 m15473f() {
        return this.f11271b;
    }

    public int hashCode() {
        C3905z c3905z = this.f11270a;
        int iHashCode = (c3905z == null ? 0 : c3905z.hashCode()) * 31;
        C3887l0 c3887l0 = this.f11271b;
        int iHashCode2 = (iHashCode + (c3887l0 == null ? 0 : c3887l0.hashCode())) * 31;
        C3888m c3888m = this.f11272c;
        int iHashCode3 = (iHashCode2 + (c3888m == null ? 0 : c3888m.hashCode())) * 31;
        C3875f0 c3875f0 = this.f11273d;
        return ((((iHashCode3 + (c3875f0 != null ? c3875f0.hashCode() : 0)) * 31) + Boolean.hashCode(this.f11274e)) * 31) + this.f11275f.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.f11270a + ", slide=" + this.f11271b + ", changeSize=" + this.f11272c + ", scale=" + this.f11273d + ", hold=" + this.f11274e + ", effectsMap=" + this.f11275f + ')';
    }

    public C3895p0(C3905z c3905z, C3887l0 c3887l0, C3888m c3888m, C3875f0 c3875f0, boolean z10, Map map) {
        this.f11270a = c3905z;
        this.f11271b = c3887l0;
        this.f11272c = c3888m;
        this.f11273d = c3875f0;
        this.f11274e = z10;
        this.f11275f = map;
    }
}
