package p036c9;

import android.app.Activity;

/* JADX INFO: renamed from: c9.r1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0483r1 {

    /* JADX INFO: renamed from: a */
    public final Activity f1433a;

    /* JADX INFO: renamed from: b */
    public final String f1434b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0483r1(Activity activity, String str) {
        this.f1433a = activity;
        this.f1434b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0483r1)) {
            return false;
        }
        C0483r1 c0483r1 = (C0483r1) obj;
        return this.f1433a.equals(c0483r1.f1433a) && this.f1434b.equals(c0483r1.f1434b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1434b.hashCode() + (this.f1433a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ConversationMenuTarget(activity=" + this.f1433a + ", talker=" + this.f1434b + ")";
    }
}
