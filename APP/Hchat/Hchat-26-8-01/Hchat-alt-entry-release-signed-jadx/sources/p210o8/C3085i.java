package p210o8;

import android.app.PendingIntent;
import ca.RunnableC0531r;
import p051db.RunnableC0766d;

/* JADX INFO: renamed from: o8.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3085i {

    /* JADX INFO: renamed from: a */
    public final long f9961a;

    /* JADX INFO: renamed from: b */
    public final PendingIntent f9962b;

    /* JADX INFO: renamed from: c */
    public final RunnableC0531r f9963c;

    /* JADX INFO: renamed from: d */
    public final RunnableC0766d f9964d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3085i(long j3, PendingIntent pendingIntent, RunnableC0531r runnableC0531r, RunnableC0766d runnableC0766d) {
        this.f9961a = j3;
        this.f9962b = pendingIntent;
        this.f9963c = runnableC0531r;
        this.f9964d = runnableC0766d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3085i)) {
            return false;
        }
        C3085i c3085i = (C3085i) obj;
        return this.f9961a == c3085i.f9961a && this.f9962b.equals(c3085i.f9962b) && this.f9963c.equals(c3085i.f9963c) && this.f9964d.equals(c3085i.f9964d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9964d.hashCode() + ((this.f9963c.hashCode() + ((this.f9962b.hashCode() + (Long.hashCode(this.f9961a) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ExactTask(token=" + this.f9961a + ", pendingIntent=" + this.f9962b + ", fallback=" + this.f9963c + ", runnable=" + this.f9964d + ")";
    }
}
