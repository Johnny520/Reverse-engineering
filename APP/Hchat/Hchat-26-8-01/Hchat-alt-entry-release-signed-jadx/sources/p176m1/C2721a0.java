package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2721a0 extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8803c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2721a0(float f3) {
        super(3);
        this.f8803c = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2721a0) && Float.compare(this.f8803c, ((C2721a0) obj).f8803c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8803c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2252o(new StringBuilder("VerticalTo(y="), this.f8803c, ')');
    }
}
