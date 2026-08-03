package lb;

import android.view.View;

/* JADX INFO: renamed from: lb.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2540b {

    /* JADX INFO: renamed from: a */
    public final View f8222a;

    /* JADX INFO: renamed from: b */
    public final C2541c f8223b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2540b(View view, C2541c c2541c) {
        this.f8222a = view;
        this.f8223b = c2541c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2540b)) {
            return false;
        }
        C2540b c2540b = (C2540b) obj;
        return this.f8222a.equals(c2540b.f8222a) && this.f8223b.equals(c2540b.f8223b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8223b.hashCode() + (this.f8222a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "QuoteHit(row=" + this.f8222a + ", target=" + this.f8223b + ")";
    }
}
