package p000;

/* JADX INFO: renamed from: pC */
/* JADX INFO: loaded from: classes.dex */
public final class C2355pC implements Comparable {

    /* JADX INFO: renamed from: a */
    public final short f8240a;

    public /* synthetic */ C2355pC(short s) {
        this.f8240a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC0585Nj.m1139g(this.f8240a & 65535, ((C2355pC) obj).f8240a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2355pC) {
            return this.f8240a == ((C2355pC) obj).f8240a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f8240a);
    }

    public final String toString() {
        return String.valueOf(this.f8240a & 65535);
    }
}
