package p332wb;

import android.app.Activity;

/* JADX INFO: renamed from: wb.dp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4824dp {

    /* JADX INFO: renamed from: a */
    public final Activity f16691a;

    /* JADX INFO: renamed from: b */
    public final C5053kp f16692b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4824dp(Activity activity, C5053kp c5053kp) {
        this.f16691a = activity;
        this.f16692b = c5053kp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4824dp)) {
            return false;
        }
        C4824dp c4824dp = (C4824dp) obj;
        return this.f16691a.equals(c4824dp.f16691a) && this.f16692b.equals(c4824dp.f16692b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16692b.hashCode() + (this.f16691a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PendingResult(activity=" + this.f16691a + ", callback=" + this.f16692b + ")";
    }
}
