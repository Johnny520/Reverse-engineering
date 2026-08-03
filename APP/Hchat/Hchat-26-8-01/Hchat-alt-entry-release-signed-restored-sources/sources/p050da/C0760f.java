package p050da;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: da.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0760f {

    /* JADX INFO: renamed from: a */
    public final View f2270a;

    /* JADX INFO: renamed from: b */
    public final TextView f2271b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0760f(View view, TextView textView) {
        this.f2270a = view;
        this.f2271b = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0760f)) {
            return false;
        }
        C0760f c0760f = (C0760f) obj;
        return this.f2270a.equals(c0760f.f2270a) && this.f2271b.equals(c0760f.f2271b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2271b.hashCode() + (this.f2270a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextTarget(view=" + this.f2270a + ", textView=" + this.f2271b + ")";
    }
}
