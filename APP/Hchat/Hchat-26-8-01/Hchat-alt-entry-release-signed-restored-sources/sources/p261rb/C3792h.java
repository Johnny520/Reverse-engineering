package p261rb;

import gg.AbstractC1416l;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: rb.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3792h {

    /* JADX INFO: renamed from: a */
    public final C3794j f12434a;

    /* JADX INFO: renamed from: b */
    public final Object f12435b;

    /* JADX INFO: renamed from: c */
    public ScheduledFuture f12436c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3792h(C3794j c3794j, Object obj) {
        this.f12434a = c3794j;
        this.f12435b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3792h)) {
            return false;
        }
        C3792h c3792h = (C3792h) obj;
        return this.f12434a.equals(c3792h.f12434a) && this.f12435b.equals(c3792h.f12435b) && AbstractC1416l.m3825a(this.f12436c, c3792h.f12436c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f12435b.hashCode() + (this.f12434a.hashCode() * 31)) * 31;
        ScheduledFuture scheduledFuture = this.f12436c;
        return iHashCode + (scheduledFuture == null ? 0 : scheduledFuture.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ActiveProbe(item=" + this.f12434a + ", scene=" + this.f12435b + ", timeout=" + this.f12436c + ")";
    }
}
