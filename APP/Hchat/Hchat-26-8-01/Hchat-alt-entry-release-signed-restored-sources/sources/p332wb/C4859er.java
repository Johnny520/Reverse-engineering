package p332wb;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: wb.er */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4859er {

    /* JADX INFO: renamed from: a */
    public final boolean f16972a;

    /* JADX INFO: renamed from: b */
    public final boolean f16973b;

    /* JADX INFO: renamed from: c */
    public final float f16974c;

    /* JADX INFO: renamed from: d */
    public final float f16975d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4859er(boolean z9, boolean z10, float f3, float f10) {
        this.f16972a = z9;
        this.f16973b = z10;
        this.f16974c = f3;
        this.f16975d = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4859er)) {
            return false;
        }
        C4859er c4859er = (C4859er) obj;
        return this.f16972a == c4859er.f16972a && this.f16973b == c4859er.f16973b && Float.compare(this.f16974c, c4859er.f16974c) == 0 && Float.compare(this.f16975d, c4859er.f16975d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f16975d) + AbstractC0921a.m2241d(this.f16974c, AbstractC0921a.m2245h(Boolean.hashCode(this.f16972a) * 31, 31, this.f16973b), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Options(glass=" + this.f16972a + ", clearBackground=" + this.f16973b + ", horizontalMarginDp=" + this.f16974c + ", bottomMarginDp=" + this.f16975d + ")";
    }
}
