package sh;

import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: sh.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4007f0 {

    /* JADX INFO: renamed from: a */
    public final boolean f13120a;

    /* JADX INFO: renamed from: b */
    public final boolean f13121b;

    /* JADX INFO: renamed from: c */
    public final boolean f13122c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4007f0(boolean z9, boolean z10, boolean z11) {
        this.f13120a = z9;
        this.f13121b = z10;
        this.f13122c = z11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4007f0)) {
            return false;
        }
        C4007f0 c4007f0 = (C4007f0) obj;
        return this.f13120a == c4007f0.f13120a && this.f13121b == c4007f0.f13121b && this.f13122c == c4007f0.f13122c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f13122c) + AbstractC0921a.m2245h(Boolean.hashCode(this.f13120a) * 31, 31, this.f13121b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PopupLayoutPosition(showBelow=");
        sb2.append(this.f13120a);
        sb2.append(", showAbove=");
        sb2.append(this.f13121b);
        sb2.append(", isRightAligned=");
        return AbstractC3199a.m6840m(")", sb2, this.f13122c);
    }
}
