package vg;

import com.alibaba.fastjson2.codec.FieldInfo;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p136j8.C2104o;
import p162l3.C2463q;

/* JADX INFO: renamed from: vg.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4563l {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15042e = AtomicReferenceFieldUpdater.newUpdater(C4563l.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f15043f = AtomicLongFieldUpdater.newUpdater(C4563l.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final C2463q f15044g = new C2463q("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f15045a;

    /* JADX INFO: renamed from: b */
    public final boolean f15046b;

    /* JADX INFO: renamed from: c */
    public final int f15047c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f15048d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4563l(int i9, boolean z9) {
        this.f15045a = i9;
        this.f15046b = z9;
        int i10 = i9 - 1;
        this.f15047c = i10;
        this.f15048d = new AtomicReferenceArray(i9);
        if (i10 > 1073741823) {
            C2104o.m5276A("Check failed.");
            throw null;
        }
        if ((i9 & i10) == 0) {
            return;
        }
        C2104o.m5276A("Check failed.");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m9007a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15043f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j3) != 0) {
                return (FieldInfo.BACKR_EFERENCE & j3) != 0 ? 2 : 1;
            }
            int i9 = (int) (1073741823 & j3);
            int i10 = (int) ((1152921503533105152L & j3) >> 30);
            int i11 = this.f15047c;
            if (((i10 + 2) & i11) == (i9 & i11)) {
                return 1;
            }
            boolean z9 = this.f15046b;
            AtomicReferenceArray atomicReferenceArray = this.f15048d;
            if (z9 || atomicReferenceArray.get(i10 & i11) == null) {
                if (f15043f.compareAndSet(this, j3, ((-1152921503533105153L) & j3) | (((long) ((i10 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i10 & i11, obj);
                    C4563l c4563lM9009c = this;
                    while ((atomicLongFieldUpdater.get(c4563lM9009c) & 1152921504606846976L) != 0) {
                        c4563lM9009c = c4563lM9009c.m9009c();
                        AtomicReferenceArray atomicReferenceArray2 = c4563lM9009c.f15048d;
                        int i12 = c4563lM9009c.f15047c & i10;
                        Object obj2 = atomicReferenceArray2.get(i12);
                        if ((obj2 instanceof C4562k) && ((C4562k) obj2).f15041a == i10) {
                            atomicReferenceArray2.set(i12, obj);
                        } else {
                            c4563lM9009c = null;
                        }
                        if (c4563lM9009c == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i13 = this.f15045a;
                if (i13 < 1024 || ((i10 - i9) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m9008b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        do {
            atomicLongFieldUpdater = f15043f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & FieldInfo.BACKR_EFERENCE) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, FieldInfo.BACKR_EFERENCE | j3));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C4563l m9009c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        C4563l c4563l;
        while (true) {
            atomicLongFieldUpdater = f15043f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                c4563l = this;
                break;
            }
            long j4 = 1152921504606846976L | j3;
            c4563l = this;
            if (atomicLongFieldUpdater.compareAndSet(c4563l, j3, j4)) {
                j3 = j4;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15042e;
            C4563l c4563l2 = (C4563l) atomicReferenceFieldUpdater.get(this);
            if (c4563l2 != null) {
                return c4563l2;
            }
            C4563l c4563l3 = new C4563l(c4563l.f15045a * 2, c4563l.f15046b);
            int i9 = (int) (1073741823 & j3);
            int i10 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i11 = c4563l.f15047c;
                int i12 = i9 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object c4562k = c4563l.f15048d.get(i12);
                if (c4562k == null) {
                    c4562k = new C4562k(i9);
                }
                c4563l3.f15048d.set(c4563l3.f15047c & i9, c4562k);
                i9++;
            }
            atomicLongFieldUpdater.set(c4563l3, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c4563l3) && atomicReferenceFieldUpdater.get(this) == null) {
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
    public final Object m9010d() {
        C4563l c4563lM9009c = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15043f;
            long j3 = atomicLongFieldUpdater.get(c4563lM9009c);
            if ((j3 & 1152921504606846976L) != 0) {
                return f15044g;
            }
            int i9 = (int) (j3 & 1073741823);
            int i10 = c4563lM9009c.f15047c;
            int i11 = i9 & i10;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i10) == i11) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = c4563lM9009c.f15048d;
            Object obj = atomicReferenceArray.get(i11);
            boolean z9 = c4563lM9009c.f15046b;
            if (obj == null) {
                if (z9) {
                    break;
                }
            } else {
                if (obj instanceof C4562k) {
                    break;
                }
                long j4 = (i9 + 1) & 1073741823;
                if (f15043f.compareAndSet(c4563lM9009c, j3, (j3 & (-1073741824)) | j4)) {
                    atomicReferenceArray.set(i11, null);
                    return obj;
                }
                c4563lM9009c = this;
                if (z9) {
                    while (true) {
                        long j5 = atomicLongFieldUpdater.get(c4563lM9009c);
                        int i12 = (int) (j5 & 1073741823);
                        if ((j5 & 1152921504606846976L) != 0) {
                            c4563lM9009c = c4563lM9009c.m9009c();
                        } else {
                            C4563l c4563l = c4563lM9009c;
                            if (f15043f.compareAndSet(c4563l, j5, (j5 & (-1073741824)) | j4)) {
                                c4563l.f15048d.set(i12 & c4563l.f15047c, null);
                                c4563lM9009c = null;
                            } else {
                                c4563lM9009c = c4563l;
                            }
                        }
                        if (c4563lM9009c == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
