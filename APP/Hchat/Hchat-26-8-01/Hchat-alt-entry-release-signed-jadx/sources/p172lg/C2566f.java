package p172lg;

import java.util.Iterator;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: lg.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2566f implements Iterable, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final long f8324g;

    /* JADX INFO: renamed from: h */
    public final long f8325h;

    /* JADX INFO: renamed from: i */
    public final long f8326i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2566f(long j3, long j4) {
        this.f8324g = j3;
        if (j3 < j4) {
            long j5 = j4 % 1;
            long j10 = j3 % 1;
            long j11 = ((j5 < 0 ? j5 + 1 : j5) - (j10 < 0 ? j10 + 1 : j10)) % 1;
            j4 -= j11 < 0 ? j11 + 1 : j11;
        }
        this.f8325h = j4;
        this.f8326i = 1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2566f)) {
            return false;
        }
        if (isEmpty() && ((C2566f) obj).isEmpty()) {
            return true;
        }
        C2566f c2566f = (C2566f) obj;
        return this.f8324g == c2566f.f8324g && this.f8325h == c2566f.f8325h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.f8325h) + (Long.hashCode(this.f8324g) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEmpty() {
        return this.f8324g > this.f8325h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2565e(this.f8324g, this.f8325h, this.f8326i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f8324g + ".." + this.f8325h;
    }
}
