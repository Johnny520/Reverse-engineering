package p049d9;

import gg.AbstractC1416l;
import p036c9.C0414a;

/* JADX INFO: renamed from: d9.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0749j {

    /* JADX INFO: renamed from: a */
    public final long f2231a;

    /* JADX INFO: renamed from: b */
    public final C0414a f2232b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0749j(long j3, C0414a c0414a) {
        this.f2231a = j3;
        this.f2232b = c0414a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0749j)) {
            return false;
        }
        C0749j c0749j = (C0749j) obj;
        return this.f2231a == c0749j.f2231a && AbstractC1416l.m3825a(this.f2232b, c0749j.f2232b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f2231a) * 31;
        C0414a c0414a = this.f2232b;
        return iHashCode + (c0414a == null ? 0 : c0414a.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedGroupAvatar(loadedAt=" + this.f2231a + ", group=" + this.f2232b + ")";
    }
}
