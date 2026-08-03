package p177m2;

import p222p.AbstractC3199a;

/* JADX INFO: renamed from: m2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2757a implements InterfaceC2771o {

    /* JADX INFO: renamed from: g */
    public final int f8988g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2757a(int i9) {
        this.f8988g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2757a) && this.f8988g == ((C2757a) obj).f8988g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f8988g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC3199a.m6841n(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f8988g, ')');
    }
}
