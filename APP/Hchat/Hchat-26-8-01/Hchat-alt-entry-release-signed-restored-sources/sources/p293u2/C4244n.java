package p293u2;

import p068eh.AbstractC0921a;
import p309v2.InterfaceC4442a;

/* JADX INFO: renamed from: u2.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4244n implements InterfaceC4442a {

    /* JADX INFO: renamed from: a */
    public final float f13922a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4244n(float f3) {
        this.f13922a = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p309v2.InterfaceC4442a
    /* JADX INFO: renamed from: a */
    public final float mo8536a(float f3) {
        return f3 / this.f13922a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p309v2.InterfaceC4442a
    /* JADX INFO: renamed from: b */
    public final float mo8537b(float f3) {
        return f3 * this.f13922a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4244n) && Float.compare(this.f13922a, ((C4244n) obj).f13922a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f13922a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2252o(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f13922a, ')');
    }
}
