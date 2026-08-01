package p095T;

/* JADX INFO: renamed from: T.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1319J implements InterfaceC1345W0 {

    /* JADX INFO: renamed from: a */
    public final C1366i0 f4716a;

    public C1319J(C1366i0 c1366i0) {
        this.f4716a = c1366i0;
    }

    @Override // p095T.InterfaceC1345W0
    /* JADX INFO: renamed from: a */
    public final Object mo2404a(InterfaceC1378o0 interfaceC1378o0) {
        return this.f4716a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1319J) && this.f4716a.equals(((C1319J) obj).f4716a);
    }

    public final int hashCode() {
        return this.f4716a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f4716a + ')';
    }
}
