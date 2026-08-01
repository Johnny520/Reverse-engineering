package p095T;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T.V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1343V0 implements InterfaceC1345W0 {

    /* JADX INFO: renamed from: a */
    public final Object f4782a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1343V0(Object obj) {
        this.f4782a = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1345W0
    /* JADX INFO: renamed from: a */
    public final Object mo2404a(InterfaceC1378o0 interfaceC1378o0) {
        return this.f4782a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1343V0) && AbstractC1665j.m2981a(this.f4782a, ((C1343V0) obj).f4782a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f4782a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StaticValueHolder(value=" + this.f4782a + ')';
    }
}
