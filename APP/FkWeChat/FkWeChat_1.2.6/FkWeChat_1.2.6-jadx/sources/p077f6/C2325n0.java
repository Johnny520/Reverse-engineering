package p077f6;

import p024b9.AbstractC1043k;
import p250r1.C6461k;
import p319w2.AbstractC9059e0;

/* JADX INFO: renamed from: f6.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2325n0 {

    /* JADX INFO: renamed from: a */
    public final long f6370a;

    /* JADX INFO: renamed from: b */
    public final int f6371b;

    public /* synthetic */ C2325n0(long j10, int i10, int i11, AbstractC1043k abstractC1043k) {
        this(j10, (i11 & 2) != 0 ? AbstractC9059e0.f31078a.m35207b() : i10, null);
    }

    /* JADX INFO: renamed from: a */
    public final long m8487a() {
        return this.f6370a;
    }

    /* JADX INFO: renamed from: b */
    public final int m8488b() {
        return this.f6371b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2325n0)) {
            return false;
        }
        C2325n0 c2325n0 = (C2325n0) obj;
        return C6461k.m25618f(this.f6370a, c2325n0.f6370a) && AbstractC9059e0.m35203i(this.f6371b, c2325n0.f6371b);
    }

    public int hashCode() {
        return (C6461k.m25622j(this.f6370a) * 31) + AbstractC9059e0.m35204j(this.f6371b);
    }

    public String toString() {
        return "PlaceholderConfig(size=" + C6461k.m25624l(this.f6370a) + ", verticalAlign=" + AbstractC9059e0.m35205k(this.f6371b) + ")";
    }

    public C2325n0(long j10, int i10) {
        this.f6370a = j10;
        this.f6371b = i10;
    }

    public /* synthetic */ C2325n0(long j10, int i10, AbstractC1043k abstractC1043k) {
        this(j10, i10);
    }
}
