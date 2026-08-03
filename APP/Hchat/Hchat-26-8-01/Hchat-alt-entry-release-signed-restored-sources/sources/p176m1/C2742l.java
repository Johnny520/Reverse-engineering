package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2742l extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8944c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2742l(float f3) {
        super(3);
        this.f8944c = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2742l) && Float.compare(this.f8944c, ((C2742l) obj).f8944c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8944c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2252o(new StringBuilder("HorizontalTo(x="), this.f8944c, ')');
    }
}
