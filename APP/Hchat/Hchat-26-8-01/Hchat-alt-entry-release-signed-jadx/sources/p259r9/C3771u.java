package p259r9;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: r9.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3771u {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f12336a;

    /* JADX INFO: renamed from: b */
    public final View f12337b;

    /* JADX INFO: renamed from: c */
    public final View f12338c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3771u(ViewGroup viewGroup, View view, View view2) {
        this.f12336a = viewGroup;
        this.f12337b = view;
        this.f12338c = view2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3771u)) {
            return false;
        }
        C3771u c3771u = (C3771u) obj;
        return this.f12336a.equals(c3771u.f12336a) && this.f12337b.equals(c3771u.f12337b) && this.f12338c.equals(c3771u.f12338c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12338c.hashCode() + ((this.f12337b.hashCode() + (this.f12336a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BottomDetailsAnchor(parent=" + this.f12336a + ", layoutView=" + this.f12337b + ", alignmentView=" + this.f12338c + ")";
    }
}
