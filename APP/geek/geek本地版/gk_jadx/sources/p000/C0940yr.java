package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: yr */
/* JADX INFO: loaded from: classes.dex */
public final class C0940yr {

    /* JADX INFO: renamed from: e */
    public static final AtomicReferenceFieldUpdater f5395e = AtomicReferenceFieldUpdater.newUpdater(C0940yr.class, Object.class, "_next");

    /* JADX INFO: renamed from: f */
    public static final AtomicLongFieldUpdater f5396f = AtomicLongFieldUpdater.newUpdater(C0940yr.class, "_state");

    /* JADX INFO: renamed from: g */
    public static final C0431l0 f5397g = new C0431l0(27, "REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* JADX INFO: renamed from: a */
    public final int f5398a;

    /* JADX INFO: renamed from: b */
    public final boolean f5399b;

    /* JADX INFO: renamed from: c */
    public final int f5400c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceArray f5401d;

    public C0940yr(int i, boolean z) {
        this.f5398a = i;
        this.f5399b = z;
        int i2 = i - 1;
        this.f5400c = i2;
        this.f5401d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m2738a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5396f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f5400c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f5399b;
            AtomicReferenceArray atomicReferenceArray = this.f5401d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f5396f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C0940yr c0940yrM2740c = this;
                    while ((atomicLongFieldUpdater.get(c0940yrM2740c) & 1152921504606846976L) != 0) {
                        c0940yrM2740c = c0940yrM2740c.m2740c();
                        AtomicReferenceArray atomicReferenceArray2 = c0940yrM2740c.f5401d;
                        int i4 = c0940yrM2740c.f5400c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C0903xr) && ((C0903xr) obj2).f5185a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c0940yrM2740c = null;
                        }
                        if (c0940yrM2740c == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.f5398a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2739b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f5396f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final C0940yr m2740c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        C0940yr c0940yr;
        while (true) {
            atomicLongFieldUpdater = f5396f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                c0940yr = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            c0940yr = this;
            if (atomicLongFieldUpdater.compareAndSet(c0940yr, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5395e;
            C0940yr c0940yr2 = (C0940yr) atomicReferenceFieldUpdater.get(this);
            if (c0940yr2 != null) {
                return c0940yr2;
            }
            C0940yr c0940yr3 = new C0940yr(c0940yr.f5398a * 2, c0940yr.f5399b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c0940yr.f5400c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c0903xr = c0940yr.f5401d.get(i4);
                if (c0903xr == null) {
                    c0903xr = new C0903xr(i);
                }
                c0940yr3.f5401d.set(c0940yr3.f5400c & i, c0903xr);
                i++;
            }
            atomicLongFieldUpdater.set(c0940yr3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0940yr3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2741d() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = p000.C0940yr.f5396f
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            l0 r0 = p000.C0940yr.f5397g
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.f5400c
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.f5401d
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.f5399b
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof p000.C0903xr
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.C0940yr.f5396f
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            yr r0 = r1.m2740c()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = p000.C0940yr.f5396f
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.f5401d
            int r2 = r2.f5400c
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0940yr.m2741d():java.lang.Object");
    }
}
