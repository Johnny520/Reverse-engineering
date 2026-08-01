package p203n;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n.K */
/* JADX INFO: loaded from: classes.dex */
public final class C2628K implements InterfaceC2656g0 {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2656g0 f8344d;

    /* JADX INFO: renamed from: e */
    public final long f8345e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2628K(InterfaceC2656g0 interfaceC2656g0, long j5) {
        this.f8344d = interfaceC2656g0;
        this.f8345e = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: a */
    public final boolean mo3116a() {
        return this.f8344d.mo3116a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: b */
    public final long mo247b(AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        return this.f8344d.mo247b(abstractC2670o, abstractC2670o2, abstractC2670o3) + this.f8345e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2628K)) {
            return false;
        }
        C2628K c2628k = (C2628K) obj;
        return c2628k.f8345e == this.f8345e && AbstractC1665j.m2981a(c2628k.f8344d, this.f8344d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f8345e) + (this.f8344d.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: o */
    public final AbstractC2670o mo258o(long j5, AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        long j6 = this.f8345e;
        return j5 < j6 ? abstractC2670o3 : this.f8344d.mo258o(j5 - j6, abstractC2670o, abstractC2670o2, abstractC2670o3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: r */
    public final AbstractC2670o mo259r(long j5, AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        long j6 = this.f8345e;
        return j5 < j6 ? abstractC2670o : this.f8344d.mo259r(j5 - j6, abstractC2670o, abstractC2670o2, abstractC2670o3);
    }
}
