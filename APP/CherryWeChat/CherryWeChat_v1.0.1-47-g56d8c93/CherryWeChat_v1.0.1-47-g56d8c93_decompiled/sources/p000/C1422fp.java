package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: fp */
/* JADX INFO: loaded from: classes.dex */
public final class C1422fp {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5015e = AtomicReferenceFieldUpdater.newUpdater(C1422fp.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f5016f = AtomicLongFieldUpdater.newUpdater(C1422fp.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final C2610v1 f5017g = new C2610v1("REMOVE_FROZEN", 10);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f5018a;

    /* JADX INFO: renamed from: b */
    public final boolean f5019b;

    /* JADX INFO: renamed from: c */
    public final int f5020c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f5021d;

    public C1422fp(int i, boolean z) {
        this.f5018a = i;
        this.f5019b = z;
        int i2 = i - 1;
        this.f5020c = i2;
        this.f5021d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m2732a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5016f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f5020c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f5019b;
            AtomicReferenceArray atomicReferenceArray = this.f5021d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f5016f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C1422fp c1422fpM2734c = this;
                    while ((atomicLongFieldUpdater.get(c1422fpM2734c) & 1152921504606846976L) != 0) {
                        c1422fpM2734c = c1422fpM2734c.m2734c();
                        AtomicReferenceArray atomicReferenceArray2 = c1422fpM2734c.f5021d;
                        int i4 = c1422fpM2734c.f5020c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C1378ep) && ((C1378ep) obj2).f4917a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c1422fpM2734c = null;
                        }
                        if (c1422fpM2734c == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.f5018a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2733b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f5016f;
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
    public final C1422fp m2734c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        C1422fp c1422fp;
        while (true) {
            atomicLongFieldUpdater = f5016f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                c1422fp = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            c1422fp = this;
            if (atomicLongFieldUpdater.compareAndSet(c1422fp, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5015e;
            C1422fp c1422fp2 = (C1422fp) atomicReferenceFieldUpdater.get(this);
            if (c1422fp2 != null) {
                return c1422fp2;
            }
            C1422fp c1422fp3 = new C1422fp(c1422fp.f5018a * 2, c1422fp.f5019b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c1422fp.f5020c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c1378ep = c1422fp.f5021d.get(i4);
                if (c1378ep == null) {
                    c1378ep = new C1378ep(i);
                }
                c1422fp3.f5021d.set(c1422fp3.f5020c & i, c1378ep);
                i++;
            }
            atomicLongFieldUpdater.set(c1422fp3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1422fp3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2735d() {
        C1422fp c1422fpM2734c = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5016f;
            long j = atomicLongFieldUpdater.get(c1422fpM2734c);
            if ((j & 1152921504606846976L) != 0) {
                return f5017g;
            }
            int i = (int) (j & 1073741823);
            int i2 = c1422fpM2734c.f5020c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = c1422fpM2734c.f5021d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = c1422fpM2734c.f5019b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof C1378ep) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f5016f.compareAndSet(c1422fpM2734c, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                c1422fpM2734c = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(c1422fpM2734c);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c1422fpM2734c = c1422fpM2734c.m2734c();
                        } else {
                            C1422fp c1422fp = c1422fpM2734c;
                            if (f5016f.compareAndSet(c1422fp, j3, (j3 & (-1073741824)) | j2)) {
                                c1422fp.f5021d.set(i4 & c1422fp.f5020c, null);
                                c1422fpM2734c = null;
                            } else {
                                c1422fpM2734c = c1422fp;
                            }
                        }
                        if (c1422fpM2734c == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
