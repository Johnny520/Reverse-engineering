package p000;

/* JADX INFO: renamed from: pC */
/* JADX INFO: loaded from: classes.dex */
public final class C2355pC implements Comparable {

    /* JADX INFO: renamed from: a */
    public final short f8240a;

    public /* synthetic */ C2355pC(short r1) {
        this.f8240a = r1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object r3) {
        short r32 = ((C2355pC) r3).f8240a;
        return AbstractC0585Nj.m1139g(this.f8240a & 65535, r32 & 65535);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2355pC) == false) goto L11;
        short r22 = ((C2355pC) r2).f8240a;
        if (this.f8240a == r22) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f8240a);
    }

    public final String toString() {
        return String.valueOf(this.f8240a & 65535);
    }
}
