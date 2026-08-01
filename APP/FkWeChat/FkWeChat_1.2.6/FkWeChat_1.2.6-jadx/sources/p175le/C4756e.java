package p175le;

import be.AbstractC1113a;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: le.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4756e {

    /* JADX INFO: renamed from: a */
    public final AbstractC1113a f14085a;

    /* JADX INFO: renamed from: b */
    public final int f14086b;

    /* JADX INFO: renamed from: c */
    public final int f14087c;

    /* JADX INFO: renamed from: d */
    public final int f14088d;

    /* JADX INFO: renamed from: e */
    public final int f14089e;

    public C4756e(AbstractC1113a abstractC1113a, int i10, int i11, int i12, int i13) {
        this.f14085a = abstractC1113a;
        this.f14086b = i10;
        this.f14087c = i11;
        this.f14088d = i12;
        this.f14089e = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m19023a() {
        return this.f14089e;
    }

    /* JADX INFO: renamed from: b */
    public final int m19024b() {
        return this.f14088d;
    }

    /* JADX INFO: renamed from: c */
    public final int m19025c() {
        return this.f14087c;
    }

    /* JADX INFO: renamed from: d */
    public final int m19026d() {
        return this.f14086b;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC1113a m19027e() {
        return this.f14085a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4756e)) {
            return false;
        }
        C4756e c4756e = (C4756e) obj;
        return AbstractC1061t.m3842c(this.f14085a, c4756e.f14085a) && this.f14086b == c4756e.f14086b && this.f14087c == c4756e.f14087c && this.f14088d == c4756e.f14088d && this.f14089e == c4756e.f14089e;
    }

    public int hashCode() {
        AbstractC1113a abstractC1113a = this.f14085a;
        return ((((((((abstractC1113a == null ? 0 : abstractC1113a.hashCode()) * 31) + Integer.hashCode(this.f14086b)) * 31) + Integer.hashCode(this.f14087c)) * 31) + Integer.hashCode(this.f14088d)) * 31) + Integer.hashCode(this.f14089e);
    }

    public String toString() {
        return "TokenInfo(type=" + this.f14085a + ", tokenStart=" + this.f14086b + ", tokenEnd=" + this.f14087c + ", rawIndex=" + this.f14088d + ", normIndex=" + this.f14089e + ')';
    }
}
