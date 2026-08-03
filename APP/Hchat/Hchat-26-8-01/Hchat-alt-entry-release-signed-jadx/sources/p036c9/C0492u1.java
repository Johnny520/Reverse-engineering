package p036c9;

import android.app.Activity;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: c9.u1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0492u1 {

    /* JADX INFO: renamed from: a */
    public final Activity f1491a;

    /* JADX INFO: renamed from: b */
    public final String f1492b;

    /* JADX INFO: renamed from: c */
    public final String f1493c;

    /* JADX INFO: renamed from: d */
    public final Object f1494d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0492u1(Activity activity, String str, String str2, Object obj) {
        str2.getClass();
        this.f1491a = activity;
        this.f1492b = str;
        this.f1493c = str2;
        this.f1494d = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0492u1)) {
            return false;
        }
        C0492u1 c0492u1 = (C0492u1) obj;
        return this.f1491a.equals(c0492u1.f1491a) && this.f1492b.equals(c0492u1.f1492b) && AbstractC1416l.m3825a(this.f1493c, c0492u1.f1493c) && this.f1494d.equals(c0492u1.f1494d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1494d.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f1491a.hashCode() * 31, 31, this.f1492b), 31, this.f1493c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NativeGroupLongClickTarget(activity=" + this.f1491a + ", talker=" + this.f1492b + ", groupId=" + this.f1493c + ", fragment=" + this.f1494d + ")";
    }
}
