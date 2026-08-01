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

    public C2699g() {
        C2701i c2701i = new C2701i(0L, null, 2);
        this.head$volatile = c2701i;
        this.tail$volatile = c2701i;
        this._availablePermits$volatile = 1;
        this.f8607a = new C0033Q0(9, this);
    }

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

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4695b() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p207n3.C2699g.m4695b():void");
    }
}
