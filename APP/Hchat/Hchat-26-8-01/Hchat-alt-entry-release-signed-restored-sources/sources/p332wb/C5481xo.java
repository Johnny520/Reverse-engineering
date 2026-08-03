package p332wb;

import android.app.Activity;

/* JADX INFO: renamed from: wb.xo */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5481xo {

    /* JADX INFO: renamed from: a */
    public final Activity f22015a;

    /* JADX INFO: renamed from: b */
    public final C5304sc f22016b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5481xo(Activity activity, C5304sc c5304sc) {
        this.f22015a = activity;
        this.f22016b = c5304sc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5481xo)) {
            return false;
        }
        C5481xo c5481xo = (C5481xo) obj;
        return this.f22015a.equals(c5481xo.f22015a) && this.f22016b.equals(c5481xo.f22016b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f22016b.hashCode() + (this.f22015a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PendingResult(activity=" + this.f22015a + ", callback=" + this.f22016b + ")";
    }
}
