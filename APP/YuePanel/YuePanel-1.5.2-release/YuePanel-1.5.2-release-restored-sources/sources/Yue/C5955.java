package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5955 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final String f1794;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final C5458 f1795;

    public C5955(@InterfaceC6399 String str, @InterfaceC6399 C5458 c5458) {
        C5499.m17103(str, "value");
        C5499.m17103(c5458, "range");
        this.f1794 = str;
        this.f1795 = c5458;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C5955 m18707(C5955 c5955, String str, C5458 c5458, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c5955.f1794;
        }
        if ((i & 2) != 0) {
            c5458 = c5955.f1795;
        }
        return c5955.m18708(str, c5458);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5955)) {
            return false;
        }
        C5955 c5955 = (C5955) obj;
        return C5499.m17094(this.f1794, c5955.f1794) && C5499.m17094(this.f1795, c5955.f1795);
    }

    public int hashCode() {
        return (this.f1794.hashCode() * 31) + this.f1795.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return "MatchGroup(value=" + this.f1794 + ", range=" + this.f1795 + ')';
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final String m2615() {
        return this.f1794;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final C5458 m2616() {
        return this.f1795;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C5955 m18708(@InterfaceC6399 String str, @InterfaceC6399 C5458 c5458) {
        C5499.m17103(str, "value");
        C5499.m17103(c5458, "range");
        return new C5955(str, c5458);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C5458 m18709() {
        return this.f1795;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final String m18710() {
        return this.f1794;
    }
}
