package p332wb;

import gg.AbstractC1416l;
import p136j8.C2098i;

/* JADX INFO: renamed from: wb.z2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5523z2 {

    /* JADX INFO: renamed from: a */
    public final C2098i f22314a;

    /* JADX INFO: renamed from: b */
    public final String f22315b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5523z2(C2098i c2098i, String str) {
        c2098i.getClass();
        str.getClass();
        this.f22314a = c2098i;
        this.f22315b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5523z2)) {
            return false;
        }
        C5523z2 c5523z2 = (C5523z2) obj;
        return AbstractC1416l.m3825a(this.f22314a, c5523z2.f22314a) && AbstractC1416l.m3825a(this.f22315b, c5523z2.f22315b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f22315b.hashCode() + (this.f22314a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FavoriteMediaPreview(item=" + this.f22314a + ", path=" + this.f22315b + ")";
    }
}
