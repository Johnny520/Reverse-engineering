package p207n3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000A.C0033Q0;
import p000A.C0049a;
import p056K2.C0891q;
import p121Y1.C1753n;
import p160f3.C2135g;
import p160f3.InterfaceC2133f;
import p190k3.AbstractC2453a;
import p190k3.AbstractC2470r;

/* JADX INFO: renamed from: n3.g */
/* JADX INFO: loaded from: classes.dex */
public class C2699g {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8602b = AtomicReferenceFieldUpdater.newUpdater(C2699g.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicLongFieldUpdater f8603c = AtomicLongFieldUpdater.newUpdater(C2699g.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8604d = AtomicReferenceFieldUpdater.newUpdater(C2699g.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f8605e = AtomicLongFieldUpdater.newUpdater(C2699g.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8606f = AtomicIntegerFieldUpdater.newUpdater(C2699g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final C0033Q0 f8607a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2699g() {
        C2701i c2701i = new C2701i(0L, null, 2);
        this.head$volatile = c2701i;
        this.tail$volatile = c2701i;
        this._availablePermits$volatile = 1;
        this.f8607a = new C0033Q0(9, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4694a(C2694b c2694b) {
        Object objM4374b;
        C2701i c2701i;
        C2135g c2135g = c2694b.f8596d;
        C2695c c2695c = c2694b.f8597e;
        while (true) {
            int andDecrement = f8606f.getAndDecrement(this);
            if (andDecrement <= 1) {
                C0891q c0891q = C0891q.f2780a;
                if (andDecrement > 0) {
                    C2695c.f8598g.set(c2695c, null);
                    c2135g.m3959D(c0891q, c2135g.f7028f, new C0033Q0(7, new C0049a(22, c2695c, c2694b)));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8604d;
                C2701i c2701i2 = (C2701i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f8605e.getAndIncrement(this);
                C2697e c2697e = C2697e.f8600k;
                long j5 = andIncrement / ((long) AbstractC2700h.f8613f);
                while (true) {
                    objM4374b = AbstractC2453a.m4374b(c2701i2, j5, c2697e);
                    if (!AbstractC2453a.m4377e(objM4374b)) {
                        AbstractC2470r abstractC2470rM4375c = AbstractC2453a.m4375c(objM4374b);
                        while (true) {
                            AbstractC2470r abstractC2470r = (AbstractC2470r) atomicReferenceFieldUpdater.get(this);
                            c2701i = c2701i2;
                            if (abstractC2470r.f7958c >= abstractC2470rM4375c.f7958c) {
                                break;
                            }
                            if (!abstractC2470rM4375c.m4407i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2470r, abstractC2470rM4375c)) {
                                if (atomicReferenceFieldUpdater.get(this) != abstractC2470r) {
                                    if (abstractC2470rM4375c.m4405e()) {
                                        abstractC2470rM4375c.m4388d();
                                    }
                                    c2701i2 = c2701i;
                                }
                            }
                            if (abstractC2470r.m4405e()) {
                                abstractC2470r.m4388d();
                            }
                        }
                    } else {
                        break;
                    }
                    c2701i2 = c2701i;
                }
                C2701i c2701i3 = (C2701i) AbstractC2453a.m4375c(objM4374b);
                AtomicReferenceArray atomicReferenceArray = c2701i3.f8614e;
                int i5 = (int) (andIncrement % ((long) AbstractC2700h.f8613f));
                while (!atomicReferenceArray.compareAndSet(i5, null, c2694b)) {
                    if (atomicReferenceArray.get(i5) != null) {
                        C1753n c1753n = AbstractC2700h.f8609b;
                        C1753n c1753n2 = AbstractC2700h.f8610c;
                        while (!atomicReferenceArray.compareAndSet(i5, c1753n, c1753n2)) {
                            if (atomicReferenceArray.get(i5) != c1753n) {
                                break;
                            }
                        }
                        C2695c.f8598g.set(c2695c, null);
                        c2135g.m3959D(c0891q, c2135g.f7028f, new C0033Q0(7, new C0049a(22, c2695c, c2694b)));
                        return;
                    }
                }
                c2694b.mo3961a(c2701i3, i5);
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
    public final void m4695b() {
        boolean z5;
        int i5;
        Object objM4374b;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8606f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z5 = true;
            if (andIncrement >= 1) {
                do {
                    i5 = atomicIntegerFieldUpdater.get(this);
                    if (i5 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8602b;
            C2701i c2701i = (C2701i) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f8603c.getAndIncrement(this);
            long j5 = andIncrement2 / ((long) AbstractC2700h.f8613f);
            C2698f c2698f = C2698f.f8601k;
            while (true) {
                objM4374b = AbstractC2453a.m4374b(c2701i, j5, c2698f);
                if (!AbstractC2453a.m4377e(objM4374b)) {
                    AbstractC2470r abstractC2470rM4375c = AbstractC2453a.m4375c(objM4374b);
                    while (true) {
                        AbstractC2470r abstractC2470r = (AbstractC2470r) atomicReferenceFieldUpdater.get(this);
                        if (abstractC2470r.f7958c >= abstractC2470rM4375c.f7958c) {
                            break;
                        }
                        if (!abstractC2470rM4375c.m4407i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2470r, abstractC2470rM4375c)) {
                            if (atomicReferenceFieldUpdater.get(this) != abstractC2470r) {
                                if (abstractC2470rM4375c.m4405e()) {
                                    abstractC2470rM4375c.m4388d();
                                }
                            }
                        }
                        if (abstractC2470r.m4405e()) {
                            abstractC2470r.m4388d();
                        }
                    }
                } else {
                    break;
                }
            }
            C2701i c2701i2 = (C2701i) AbstractC2453a.m4375c(objM4374b);
            AtomicReferenceArray atomicReferenceArray = c2701i2.f8614e;
            c2701i2.m4385a();
            boolean z6 = false;
            if (c2701i2.f7958c <= j5) {
                int i6 = (int) (andIncrement2 % ((long) AbstractC2700h.f8613f));
                Object andSet = atomicReferenceArray.getAndSet(i6, AbstractC2700h.f8609b);
                if (andSet == null) {
                    int i7 = AbstractC2700h.f8608a;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            C1753n c1753n = AbstractC2700h.f8609b;
                            C1753n c1753n2 = AbstractC2700h.f8611d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i6, c1753n, c1753n2)) {
                                    z6 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i6) != c1753n) {
                                    break;
                                }
                            }
                            z5 = true ^ z6;
                        } else if (atomicReferenceArray.get(i6) == AbstractC2700h.f8610c) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                } else if (andSet != AbstractC2700h.f8612e) {
                    if (!(andSet instanceof InterfaceC2133f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC2133f interfaceC2133f = (InterfaceC2133f) andSet;
                    C1753n c1753nMo3953s = interfaceC2133f.mo3953s(C0891q.f2780a, this.f8607a);
                    if (c1753nMo3953s != null) {
                        interfaceC2133f.mo3954v(c1753nMo3953s);
                    } else {
                        z5 = false;
                    }
                }
            }
        } while (!z5);
    }
}
