package p049d9;

import android.app.Activity;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: d9.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0744e {

    /* JADX INFO: renamed from: a */
    public final Activity f2212a;

    /* JADX INFO: renamed from: b */
    public final String f2213b;

    /* JADX INFO: renamed from: c */
    public final boolean f2214c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1231l f2215d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0744e(Activity activity, InterfaceC1231l interfaceC1231l, String str, boolean z9) {
        activity.getClass();
        str.getClass();
        this.f2212a = activity;
        this.f2213b = str;
        this.f2214c = z9;
        this.f2215d = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0744e)) {
            return false;
        }
        C0744e c0744e = (C0744e) obj;
        return AbstractC1416l.m3825a(this.f2212a, c0744e.f2212a) && AbstractC1416l.m3825a(this.f2213b, c0744e.f2213b) && this.f2214c == c0744e.f2214c && this.f2215d.equals(c0744e.f2215d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2215d.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f2212a.hashCode() * 31, 31, this.f2213b), 31, this.f2214c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Pending(activity=" + this.f2212a + ", wxid=" + this.f2213b + ", trackConfiguredFriend=" + this.f2214c + ", callback=" + this.f2215d + ")";
    }
}
