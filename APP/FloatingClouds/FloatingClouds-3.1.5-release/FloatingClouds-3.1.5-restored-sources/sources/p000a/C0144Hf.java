package p000a;

import java.io.Serializable;

/* JADX INFO: renamed from: a.Hf */
/* JADX INFO: loaded from: classes.dex */
public final class C0144Hf<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Serializable f500a;

    /* JADX INFO: renamed from: b */
    public final Serializable f501b;

    /* JADX INFO: renamed from: c */
    public final Serializable f502c;

    public C0144Hf(Serializable serializable, Serializable serializable2, Serializable serializable3) {
        this.f500a = serializable;
        this.f501b = serializable2;
        this.f502c = serializable3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0144Hf)) {
            return false;
        }
        C0144Hf c0144Hf = (C0144Hf) obj;
        return C0631i9.m1478a(this.f500a, c0144Hf.f500a) && C0631i9.m1478a(this.f501b, c0144Hf.f501b) && C0631i9.m1478a(this.f502c, c0144Hf.f502c);
    }

    public final int hashCode() {
        Serializable serializable = this.f500a;
        int iHashCode = (serializable == null ? 0 : serializable.hashCode()) * 31;
        Serializable serializable2 = this.f501b;
        int iHashCode2 = (iHashCode + (serializable2 == null ? 0 : serializable2.hashCode())) * 31;
        Serializable serializable3 = this.f502c;
        return iHashCode2 + (serializable3 != null ? serializable3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f500a + ", " + this.f501b + ", " + this.f502c + ')';
    }
}
