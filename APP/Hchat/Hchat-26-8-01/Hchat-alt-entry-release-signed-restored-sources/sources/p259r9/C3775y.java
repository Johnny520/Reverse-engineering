package p259r9;

import android.view.View;
import android.widget.TextView;
import gg.AbstractC1416l;

/* JADX INFO: renamed from: r9.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3775y {

    /* JADX INFO: renamed from: a */
    public final View f12347a;

    /* JADX INFO: renamed from: b */
    public final TextView f12348b;

    /* JADX INFO: renamed from: c */
    public final Object f12349c;

    /* JADX INFO: renamed from: d */
    public final Object f12350d;

    /* JADX INFO: renamed from: e */
    public final C3756f0 f12351e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3775y(View view, TextView textView, Object obj, Object obj2, C3756f0 c3756f0) {
        c3756f0.getClass();
        this.f12347a = view;
        this.f12348b = textView;
        this.f12349c = obj;
        this.f12350d = obj2;
        this.f12351e = c3756f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3775y)) {
            return false;
        }
        C3775y c3775y = (C3775y) obj;
        return this.f12347a.equals(c3775y.f12347a) && AbstractC1416l.m3825a(this.f12348b, c3775y.f12348b) && this.f12349c.equals(c3775y.f12349c) && this.f12350d.equals(c3775y.f12350d) && AbstractC1416l.m3825a(this.f12351e, c3775y.f12351e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f12347a.hashCode() * 31;
        TextView textView = this.f12348b;
        return this.f12351e.hashCode() + ((this.f12350d.hashCode() + ((this.f12349c.hashCode() + ((iHashCode + (textView == null ? 0 : textView.hashCode())) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MessageDetailsBinding(root=" + this.f12347a + ", nativeTimeLabel=" + this.f12348b + ", holder=" + this.f12349c + ", nativeMessage=" + this.f12350d + ", details=" + this.f12351e + ")";
    }
}
