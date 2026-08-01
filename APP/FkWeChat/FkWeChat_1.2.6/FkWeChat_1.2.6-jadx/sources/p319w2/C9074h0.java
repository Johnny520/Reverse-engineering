package p319w2;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: w2.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9074h0 {

    /* JADX INFO: renamed from: a */
    public final C9069g0 f31123a;

    /* JADX INFO: renamed from: b */
    public final C9064f0 f31124b;

    public C9074h0(boolean z10) {
        this(null, new C9064f0(z10));
    }

    /* JADX INFO: renamed from: a */
    public final C9064f0 m35273a() {
        return this.f31124b;
    }

    /* JADX INFO: renamed from: b */
    public final C9069g0 m35274b() {
        return this.f31123a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9074h0)) {
            return false;
        }
        C9074h0 c9074h0 = (C9074h0) obj;
        return AbstractC1061t.m3842c(this.f31124b, c9074h0.f31124b) && AbstractC1061t.m3842c(this.f31123a, c9074h0.f31123a);
    }

    public int hashCode() {
        C9069g0 c9069g0 = this.f31123a;
        int iHashCode = (c9069g0 != null ? c9069g0.hashCode() : 0) * 31;
        C9064f0 c9064f0 = this.f31124b;
        return iHashCode + (c9064f0 != null ? c9064f0.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f31123a + ", paragraphSyle=" + this.f31124b + ')';
    }

    public C9074h0(C9069g0 c9069g0, C9064f0 c9064f0) {
        this.f31123a = c9069g0;
        this.f31124b = c9064f0;
    }
}
