package p332wb;

import android.app.Activity;
import java.io.File;

/* JADX INFO: renamed from: wb.gr */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4925gr {

    /* JADX INFO: renamed from: a */
    public final Activity f17488a;

    /* JADX INFO: renamed from: b */
    public final File f17489b;

    /* JADX INFO: renamed from: c */
    public final C5155ns f17490c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4925gr(Activity activity, File file, C5155ns c5155ns) {
        this.f17488a = activity;
        this.f17489b = file;
        this.f17490c = c5155ns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4925gr)) {
            return false;
        }
        C4925gr c4925gr = (C4925gr) obj;
        return this.f17488a.equals(c4925gr.f17488a) && this.f17489b.equals(c4925gr.f17489b) && this.f17490c.equals(c4925gr.f17490c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f17490c.hashCode() + ((this.f17489b.hashCode() + (this.f17488a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PendingResult(activity=" + this.f17488a + ", directory=" + this.f17489b + ", callback=" + this.f17490c + ")";
    }
}
