package p249qg;

import p136j8.C2104o;
import p162l3.C2463q;
import vg.C4572u;

/* JADX INFO: renamed from: qg.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC3574j0 implements Runnable, Comparable, InterfaceC3556d0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: g */
    public long f11580g;

    /* JADX INFO: renamed from: h */
    public int f11581h = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractRunnableC3574j0(long j3) {
        this.f11580g = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3556d0
    /* JADX INFO: renamed from: a */
    public final void mo7492a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C2463q c2463q = AbstractC3603v.f11620b;
                if (obj == c2463q) {
                    return;
                }
                C3577k0 c3577k0 = obj instanceof C3577k0 ? (C3577k0) obj : null;
                if (c3577k0 != null) {
                    synchronized (c3577k0) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C4572u ? (C4572u) obj2 : null) != null) {
                            c3577k0.m9018b(this.f11581h);
                        }
                    }
                }
                this._heap = c2463q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m7528b(long j3, C3577k0 c3577k0, AbstractC3580l0 abstractC3580l0) {
        synchronized (this) {
            if (this._heap == AbstractC3603v.f11620b) {
                return 2;
            }
            synchronized (c3577k0) {
                try {
                    AbstractRunnableC3574j0[] abstractRunnableC3574j0Arr = c3577k0.f15058a;
                    AbstractRunnableC3574j0 abstractRunnableC3574j0 = abstractRunnableC3574j0Arr != null ? abstractRunnableC3574j0Arr[0] : null;
                    if (AbstractC3580l0.f11590o.get(abstractC3580l0) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC3574j0 == null) {
                        c3577k0.f11584c = j3;
                    } else {
                        long j4 = abstractRunnableC3574j0.f11580g;
                        if (j4 - j3 < 0) {
                            j3 = j4;
                        }
                        if (j3 - c3577k0.f11584c > 0) {
                            c3577k0.f11584c = j3;
                        }
                    }
                    long j5 = this.f11580g;
                    long j10 = c3577k0.f11584c;
                    if (j5 - j10 < 0) {
                        this.f11580g = j10;
                    }
                    c3577k0.m9017a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = this.f11580g - ((AbstractRunnableC3574j0) obj).f11580g;
        if (j3 > 0) {
            return 1;
        }
        return j3 < 0 ? -1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m7529d(C3577k0 c3577k0) {
        if (this._heap != AbstractC3603v.f11620b) {
            this._heap = c3577k0;
        } else {
            C2104o.m5294t("Failed requirement.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "Delayed[nanos=" + this.f11580g + ']';
    }
}
