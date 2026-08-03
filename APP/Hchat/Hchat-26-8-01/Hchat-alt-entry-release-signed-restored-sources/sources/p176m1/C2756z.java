package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2756z extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8987c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2756z(float f3) {
        super(3);
        this.f8987c = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2756z) && Float.compare(this.f8987c, ((C2756z) obj).f8987c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8987c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2252o(new StringBuilder("RelativeVerticalTo(dy="), this.f8987c, ')');
    }
}
