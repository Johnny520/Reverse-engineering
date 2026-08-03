package p172lg;

import bsh.C0353j;
import java.util.Iterator;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: lg.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2565e implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final long f8320g;

    /* JADX INFO: renamed from: h */
    public final long f8321h;

    /* JADX INFO: renamed from: i */
    public boolean f8322i;

    /* JADX INFO: renamed from: j */
    public long f8323j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2565e(long j3, long j4, long j5) {
        this.f8320g = j5;
        this.f8321h = j4;
        boolean z9 = false;
        if (j5 <= 0 ? j3 >= j4 : j3 <= j4) {
            z9 = true;
        }
        this.f8322i = z9;
        this.f8323j = z9 ? j3 : j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8322i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        long j3 = this.f8323j;
        if (j3 != this.f8321h) {
            this.f8323j = this.f8320g + j3;
        } else {
            if (!this.f8322i) {
                C0353j.m1307e();
                return null;
            }
            this.f8322i = false;
        }
        return Long.valueOf(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
