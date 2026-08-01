package p190k3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p121Y1.C1753n;

/* JADX INFO: renamed from: k3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2465m {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7947e = AtomicReferenceFieldUpdater.newUpdater(C2465m.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f7948f = AtomicLongFieldUpdater.newUpdater(C2465m.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final C1753n f7949g = new C1753n(10, "REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f7950a;

    /* JADX INFO: renamed from: b */
    public final boolean f7951b;

    /* JADX INFO: renamed from: c */
    public final int f7952c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f7953d;

    public C2465m(int i5, boolean z5) {
        this.f7950a = i5;
        this.f7951b = z5;
        int i6 = i5 - 1;
        this.f7952c = i6;
        this.f7953d = new AtomicReferenceArray(i5);
        if (i6 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i5 & i6) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4398a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7948f;
            long j5 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j5) != 0) {
                return (2305843009213693952L & j5) != 0 ? 2 : 1;
            }
            int i5 = (int) (1073741823 & j5);
            int i6 = (int) ((1152921503533105152L & j5) >> 30);
            int i7 = this.f7952c;
            if (((i6 + 2) & i7) == (i5 & i7)) {
                return 1;
            }
            boolean z5 = this.f7951b;
            AtomicReferenceArray atomicReferenceArray = this.f7953d;
            if (z5 || atomicReferenceArray.get(i6 & i7) == null) {
                if (f7948f.compareAndSet(this, j5, ((-1152921503533105153L) & j5) | (((long) ((i6 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i6 & i7, obj);
                    C2465m c2465mM4400c = this;
                    while ((atomicLongFieldUpdater.get(c2465mM4400c) & 1152921504606846976L) != 0) {
                        c2465mM4400c = c2465mM4400c.m4400c();
                        AtomicReferenceArray atomicReferenceArray2 = c2465mM4400c.f7953d;
                        int i8 = c2465mM4400c.f7952c & i6;
                        Object obj2 = atomicReferenceArray2.get(i8);
                        if ((obj2 instanceof C2464l) && ((C2464l) obj2).f7946a == i6) {
                            atomicReferenceArray2.set(i8, obj);
                        } else {
                            c2465mM4400c = null;
                        }
                        if (c2465mM4400c == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i9 = this.f7950a;
                if (i9 < 1024 || ((i6 - i5) & 1073741823) > (i9 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4399b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        do {
            atomicLongFieldUpdater = f7948f;
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j5) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, 2305843009213693952L | j5));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final C2465m m4400c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        C2465m c2465m;
        while (true) {
            atomicLongFieldUpdater = f7948f;
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 1152921504606846976L) != 0) {
                c2465m = this;
                break;
            }
            long j6 = 1152921504606846976L | j5;
            c2465m = this;
            if (atomicLongFieldUpdater.compareAndSet(c2465m, j5, j6)) {
                j5 = j6;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7947e;
            C2465m c2465m2 = (C2465m) atomicReferenceFieldUpdater.get(this);
            if (c2465m2 != null) {
                return c2465m2;
            }
            C2465m c2465m3 = new C2465m(c2465m.f7950a * 2, c2465m.f7951b);
            int i5 = (int) (1073741823 & j5);
            int i6 = (int) ((1152921503533105152L & j5) >> 30);
            while (true) {
                int i7 = c2465m.f7952c;
                int i8 = i5 & i7;
                if (i8 == (i7 & i6)) {
                    break;
                }
                Object c2464l = c2465m.f7953d.get(i8);
                if (c2464l == null) {
                    c2464l = new C2464l(i5);
                }
                c2465m3.f7953d.set(c2465m3.f7952c & i5, c2464l);
                i5++;
            }
            atomicLongFieldUpdater.set(c2465m3, (-1152921504606846977L) & j5);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2465m3) && atomicReferenceFieldUpdater.get(this) == null) {
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
    public final java.lang.Object m4401d() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = p190k3.C2465m.f7948f
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            Y1.n r0 = p190k3.C2465m.f7949g
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
            int r5 = r1.f7952c
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.f7953d
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.f7951b
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof p190k3.C2464l
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
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p190k3.C2465m.f7948f
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
            k3.m r0 = r1.m4400c()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = p190k3.C2465m.f7948f
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.f7953d
            int r2 = r2.f7952c
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
        throw new UnsupportedOperationException("Method not decompiled: p190k3.C2465m.m4401d():java.lang.Object");
    }
}
