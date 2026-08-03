package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2747q extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8957c;

    /* JADX INFO: renamed from: d */
    public final float f8958d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2747q(float f3, float f10) {
        super(1);
        this.f8957c = f3;
        this.f8958d = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2747q)) {
            return false;
        }
        C2747q c2747q = (C2747q) obj;
        return Float.compare(this.f8957c, c2747q.f8957c) == 0 && Float.compare(this.f8958d, c2747q.f8958d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8958d) + (Float.hashCode(this.f8957c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f8957c);
        sb2.append(", y=");
        return AbstractC0921a.m2252o(sb2, this.f8958d, ')');
    }
}
