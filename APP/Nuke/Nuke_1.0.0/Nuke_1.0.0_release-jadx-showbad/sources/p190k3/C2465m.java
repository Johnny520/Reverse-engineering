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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4401d() {
        C2465m c2465mM4400c = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7948f;
            long j5 = atomicLongFieldUpdater.get(c2465mM4400c);
            if ((j5 & 1152921504606846976L) != 0) {
                return f7949g;
            }
            int i5 = (int) (j5 & 1073741823);
            int i6 = c2465mM4400c.f7952c;
            int i7 = i5 & i6;
            if ((((int) ((1152921503533105152L & j5) >> 30)) & i6) == i7) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = c2465mM4400c.f7953d;
            Object obj = atomicReferenceArray.get(i7);
            boolean z5 = c2465mM4400c.f7951b;
            if (obj == null) {
                if (z5) {
                    break;
                }
            } else {
                if (obj instanceof C2464l) {
                    break;
                }
                long j6 = (i5 + 1) & 1073741823;
                if (f7948f.compareAndSet(c2465mM4400c, j5, (j5 & (-1073741824)) | j6)) {
                    atomicReferenceArray.set(i7, null);
                    return obj;
                }
                c2465mM4400c = this;
                if (z5) {
                    while (true) {
                        long j7 = atomicLongFieldUpdater.get(c2465mM4400c);
                        int i8 = (int) (j7 & 1073741823);
                        if ((j7 & 1152921504606846976L) != 0) {
                            c2465mM4400c = c2465mM4400c.m4400c();
                        } else {
                            C2465m c2465m = c2465mM4400c;
                            if (f7948f.compareAndSet(c2465m, j7, (j7 & (-1073741824)) | j6)) {
                                c2465m.f7953d.set(i8 & c2465m.f7952c, null);
                                c2465mM4400c = null;
                            } else {
                                c2465mM4400c = c2465m;
                            }
                        }
                        if (c2465mM4400c == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
