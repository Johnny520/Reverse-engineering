package p092S0;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: S0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1258K {

    /* JADX INFO: renamed from: a */
    public final C1252E f4532a;

    /* JADX INFO: renamed from: b */
    public final C1252E f4533b;

    /* JADX INFO: renamed from: c */
    public final C1252E f4534c;

    /* JADX INFO: renamed from: d */
    public final C1252E f4535d;

    public C1258K(C1252E c1252e, C1252E c1252e2, C1252E c1252e3, C1252E c1252e4) {
        this.f4532a = c1252e;
        this.f4533b = c1252e2;
        this.f4534c = c1252e3;
        this.f4535d = c1252e4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1258K)) {
            return false;
        }
        C1258K c1258k = (C1258K) obj;
        return AbstractC1665j.m2981a(this.f4532a, c1258k.f4532a) && AbstractC1665j.m2981a(this.f4533b, c1258k.f4533b) && AbstractC1665j.m2981a(this.f4534c, c1258k.f4534c) && AbstractC1665j.m2981a(this.f4535d, c1258k.f4535d);
    }

    public final int hashCode() {
        C1252E c1252e = this.f4532a;
        int iHashCode = (c1252e != null ? c1252e.hashCode() : 0) * 31;
        C1252E c1252e2 = this.f4533b;
        int iHashCode2 = (iHashCode + (c1252e2 != null ? c1252e2.hashCode() : 0)) * 31;
        C1252E c1252e3 = this.f4534c;
        int iHashCode3 = (iHashCode2 + (c1252e3 != null ? c1252e3.hashCode() : 0)) * 31;
        C1252E c1252e4 = this.f4535d;
        return iHashCode3 + (c1252e4 != null ? c1252e4.hashCode() : 0);
    }
}
