package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2744n extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8947c;

    /* JADX INFO: renamed from: d */
    public final float f8948d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2744n(float f3, float f10) {
        super(3);
        this.f8947c = f3;
        this.f8948d = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2744n)) {
            return false;
        }
        C2744n c2744n = (C2744n) obj;
        return Float.compare(this.f8947c, c2744n.f8947c) == 0 && Float.compare(this.f8948d, c2744n.f8948d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8948d) + (Float.hashCode(this.f8947c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f8947c);
        sb2.append(", y=");
        return AbstractC0921a.m2252o(sb2, this.f8948d, ')');
    }
}
