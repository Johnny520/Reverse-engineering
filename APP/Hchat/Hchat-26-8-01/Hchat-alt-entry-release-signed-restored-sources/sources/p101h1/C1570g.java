package p101h1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: h1.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1570g extends AbstractC1566c {

    /* JADX INFO: renamed from: b */
    public final float f5226b;

    /* JADX INFO: renamed from: c */
    public final float f5227c;

    /* JADX INFO: renamed from: d */
    public final int f5228d;

    /* JADX INFO: renamed from: e */
    public final int f5229e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1570g(float f3, float f10, int i9, int i10, int i11) {
        f10 = (i11 & 2) != 0 ? 4.0f : f10;
        i9 = (i11 & 4) != 0 ? 0 : i9;
        i10 = (i11 & 8) != 0 ? 0 : i10;
        this.f5226b = f3;
        this.f5227c = f10;
        this.f5228d = i9;
        this.f5229e = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1570g)) {
            return false;
        }
        C1570g c1570g = (C1570g) obj;
        return this.f5226b == c1570g.f5226b && this.f5227c == c1570g.f5227c && this.f5228d == c1570g.f5228d && this.f5229e == c1570g.f5229e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0921a.m2242e(this.f5229e, AbstractC0921a.m2242e(this.f5228d, AbstractC0921a.m2241d(this.f5227c, Float.hashCode(this.f5226b) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f5226b);
        sb2.append(", miter=");
        sb2.append(this.f5227c);
        sb2.append(", cap=");
        String str = "Unknown";
        int i9 = this.f5228d;
        sb2.append((Object) (i9 == 0 ? "Butt" : i9 == 1 ? "Round" : i9 == 2 ? "Square" : "Unknown"));
        sb2.append(", join=");
        int i10 = this.f5229e;
        if (i10 == 0) {
            str = "Miter";
        } else if (i10 == 1) {
            str = "Round";
        } else if (i10 == 2) {
            str = "Bevel";
        }
        sb2.append((Object) str);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
