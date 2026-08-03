package ba;

import android.view.View;
import android.widget.TextView;
import gg.AbstractC1416l;

/* JADX INFO: renamed from: ba.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0232l {

    /* JADX INFO: renamed from: a */
    public final View f583a;

    /* JADX INFO: renamed from: b */
    public final TextView f584b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0232l(View view, TextView textView) {
        view.getClass();
        textView.getClass();
        this.f583a = view;
        this.f584b = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0232l)) {
            return false;
        }
        C0232l c0232l = (C0232l) obj;
        return AbstractC1416l.m3825a(this.f583a, c0232l.f583a) && AbstractC1416l.m3825a(this.f584b, c0232l.f584b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f584b.hashCode() + (this.f583a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextTarget(owner=" + this.f583a + ", textView=" + this.f584b + ")";
    }
}
