package p086r0;

import android.app.Activity;
import android.view.View;
import android.widget.ListAdapter;
import java.util.LinkedHashSet;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0864P0 {

    /* JADX INFO: renamed from: a */
    public final Activity f2972a;

    /* JADX INFO: renamed from: b */
    public final ListAdapter f2973b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f2974c;

    /* JADX INFO: renamed from: d */
    public final String f2975d;

    /* JADX INFO: renamed from: e */
    public final View f2976e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0864P0(Activity activity, ListAdapter listAdapter, LinkedHashSet linkedHashSet, String str, View view) {
        this.f2972a = activity;
        this.f2973b = listAdapter;
        this.f2974c = linkedHashSet;
        this.f2975d = str;
        this.f2976e = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0864P0)) {
            return false;
        }
        C0864P0 c0864p0 = (C0864P0) obj;
        return this.f2972a.equals(c0864p0.f2972a) && AbstractC0223g.m414a(this.f2973b, c0864p0.f2973b) && this.f2974c.equals(c0864p0.f2974c) && this.f2975d.equals(c0864p0.f2975d) && AbstractC0223g.m414a(this.f2976e, c0864p0.f2976e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f2972a.hashCode() * 31;
        ListAdapter listAdapter = this.f2973b;
        int iM347c = AbstractC0174d.m347c(this.f2975d, (this.f2974c.hashCode() + ((iHashCode + (listAdapter == null ? 0 : listAdapter.hashCode())) * 31)) * 31, 31);
        View view = this.f2976e;
        return iM347c + (view != null ? view.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SelfSnsDetailContext(activity=" + this.f2972a + ", adapter=" + this.f2973b + ", keys=" + this.f2974c + ", summary=" + this.f2975d + ", previewView=" + this.f2976e + ")";
    }
}
