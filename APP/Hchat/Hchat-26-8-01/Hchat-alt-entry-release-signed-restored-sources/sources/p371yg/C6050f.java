package p371yg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okio.C3193a;
import p012ah.C0086a;
import p070f0.C0976h;
import p162l3.C2463q;
import p198nb.C2924a;
import p249qg.C3564g;
import p249qg.InterfaceC3561f;
import p276sf.C3967n;
import vg.AbstractC4552a;
import vg.AbstractC4568q;

/* JADX INFO: renamed from: yg.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C6050f {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24504b = AtomicReferenceFieldUpdater.newUpdater(C6050f.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicLongFieldUpdater f24505c = AtomicLongFieldUpdater.newUpdater(C6050f.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24506d = AtomicReferenceFieldUpdater.newUpdater(C6050f.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f24507e = AtomicLongFieldUpdater.newUpdater(C6050f.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24508f = AtomicIntegerFieldUpdater.newUpdater(C6050f.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final C0976h f24509a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6050f() {
        C6052h c6052h = new C6052h(0L, null, 2);
        this.head$volatile = c6052h;
        this.tail$volatile = c6052h;
        this._availablePermits$volatile = 1;
        this.f24509a = new C0976h(this, 15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10809a(C6045a c6045a) {
        Object objM8983b;
        C6052h c6052h;
        C3564g c3564g = c6045a.f24498g;
        C6046b c6046b = c6045a.f24499h;
        while (true) {
            int andDecrement = f24508f.getAndDecrement(this);
            if (andDecrement <= 1) {
                C3967n c3967n = C3967n.f12976a;
                if (andDecrement > 0) {
                    C6046b.f24500g.set(c6046b, null);
                    c3564g.m7521z(c3967n, c3564g.f11551i, new C0976h(new C2924a(c6046b, 28, c6045a), 3));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24506d;
                C6052h c6052h2 = (C6052h) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f24507e.getAndIncrement(this);
                C6048d c6048d = C6048d.f24502n;
                long j3 = andIncrement / ((long) AbstractC6051g.f24515f);
                while (true) {
                    objM8983b = AbstractC4552a.m8983b(c6052h2, j3, c6048d);
                    if (!AbstractC4552a.m8986e(objM8983b)) {
                        AbstractC4568q abstractC4568qM8984c = AbstractC4552a.m8984c(objM8983b);
                        while (true) {
                            AbstractC4568q abstractC4568q = (AbstractC4568q) atomicReferenceFieldUpdater.get(this);
                            c6052h = c6052h2;
                            if (abstractC4568q.f15053c >= abstractC4568qM8984c.f15053c) {
                                break;
                            }
                            if (!abstractC4568qM8984c.m9016i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC4568q, abstractC4568qM8984c)) {
                                if (atomicReferenceFieldUpdater.get(this) != abstractC4568q) {
                                    if (abstractC4568qM8984c.m9014e()) {
                                        abstractC4568qM8984c.m8997d();
                                    }
                                    c6052h2 = c6052h;
                                }
                            }
                            if (abstractC4568q.m9014e()) {
                                abstractC4568q.m8997d();
                            }
                        }
                    } else {
                        break;
                    }
                    c6052h2 = c6052h;
                }
                C6052h c6052h3 = (C6052h) AbstractC4552a.m8984c(objM8983b);
                AtomicReferenceArray atomicReferenceArray = c6052h3.f24516e;
                int i9 = (int) (andIncrement % ((long) AbstractC6051g.f24515f));
                while (!atomicReferenceArray.compareAndSet(i9, null, c6045a)) {
                    if (atomicReferenceArray.get(i9) != null) {
                        C2463q c2463q = AbstractC6051g.f24511b;
                        C2463q c2463q2 = AbstractC6051g.f24512c;
                        while (!atomicReferenceArray.compareAndSet(i9, c2463q, c2463q2)) {
                            if (atomicReferenceArray.get(i9) != c2463q) {
                                break;
                            }
                        }
                        C6046b.f24500g.set(c6046b, null);
                        c3564g.m7521z(c3967n, c3564g.f11551i, new C0976h(new C2924a(c6046b, 28, c6045a), 3));
                        return;
                    }
                }
                c6045a.mo7505a(c6052h3, i9);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10810b() {
        boolean z9;
        int i9;
        Object objM8983b;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24508f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z9 = true;
            if (andIncrement >= 1) {
                do {
                    i9 = atomicIntegerFieldUpdater.get(this);
                    if (i9 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 1));
                C0086a.m449h("The number of released permits cannot be greater than 1");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24504b;
            C6052h c6052h = (C6052h) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f24505c.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) AbstractC6051g.f24515f);
            C6049e c6049e = C6049e.f24503n;
            while (true) {
                objM8983b = AbstractC4552a.m8983b(c6052h, j3, c6049e);
                if (!AbstractC4552a.m8986e(objM8983b)) {
                    AbstractC4568q abstractC4568qM8984c = AbstractC4552a.m8984c(objM8983b);
                    while (true) {
                        AbstractC4568q abstractC4568q = (AbstractC4568q) atomicReferenceFieldUpdater.get(this);
                        if (abstractC4568q.f15053c >= abstractC4568qM8984c.f15053c) {
                            break;
                        }
                        if (!abstractC4568qM8984c.m9016i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC4568q, abstractC4568qM8984c)) {
                            if (atomicReferenceFieldUpdater.get(this) != abstractC4568q) {
                                if (abstractC4568qM8984c.m9014e()) {
                                    abstractC4568qM8984c.m8997d();
                                }
                            }
                        }
                        if (abstractC4568q.m9014e()) {
                            abstractC4568q.m8997d();
                        }
                    }
                } else {
                    break;
                }
            }
            C6052h c6052h2 = (C6052h) AbstractC4552a.m8984c(objM8983b);
            AtomicReferenceArray atomicReferenceArray = c6052h2.f24516e;
            c6052h2.m8994a();
            boolean z10 = false;
            if (c6052h2.f15053c <= j3) {
                int i10 = (int) (andIncrement2 % ((long) AbstractC6051g.f24515f));
                Object andSet = atomicReferenceArray.getAndSet(i10, AbstractC6051g.f24511b);
                if (andSet == null) {
                    int i11 = AbstractC6051g.f24510a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            C2463q c2463q = AbstractC6051g.f24511b;
                            C2463q c2463q2 = AbstractC6051g.f24513d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i10, c2463q, c2463q2)) {
                                    z10 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i10) != c2463q) {
                                    break;
                                }
                            }
                            z9 = true ^ z10;
                        } else if (atomicReferenceArray.get(i10) == AbstractC6051g.f24512c) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                } else if (andSet != AbstractC6051g.f24514e) {
                    if (!(andSet instanceof InterfaceC3561f)) {
                        C3193a.m6826p(andSet, "unexpected: ");
                        return;
                    }
                    InterfaceC3561f interfaceC3561f = (InterfaceC3561f) andSet;
                    C2463q c2463qMo7499j = interfaceC3561f.mo7499j(C3967n.f12976a, this.f24509a);
                    if (c2463qMo7499j != null) {
                        interfaceC3561f.mo7498A(c2463qMo7499j);
                    } else {
                        z9 = false;
                    }
                }
            }
        } while (!z9);
    }
}
