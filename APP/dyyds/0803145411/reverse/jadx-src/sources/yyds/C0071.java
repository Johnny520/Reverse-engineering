package yyds;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛱᛲᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0071 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0415 f622;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f623;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final /* synthetic */ long f624;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f625;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f626;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f627;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f628;

    static {
        Unsafe unsafe = AbstractC2112.f10448;
        f624 = unsafe.objectFieldOffset(C0071.class.getDeclaredField("_next$volatile"));
        f623 = unsafe.objectFieldOffset(C0071.class.getDeclaredField("_state$volatile"));
        f622 = new C0415("REMOVE_FROZEN", 1);
    }

    public C0071(int i, boolean z) {
        this.f625 = i;
        this.f626 = z;
        int i2 = i - 1;
        this.f627 = i2;
        this.f628 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            C0188.m800("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        C0188.m800("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m445(Object obj) {
        C0071 c0071 = this;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f623;
            long longVolatile = unsafe.getLongVolatile(c0071, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = c0071.f627;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = c0071.f626;
            AtomicReferenceArray atomicReferenceArray = c0071.f628;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(c0071, f623, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C0071 c0071M447 = this;
                    while ((AbstractC2112.f10448.getLongVolatile(c0071M447, j) & 1152921504606846976L) != 0) {
                        c0071M447 = c0071M447.m447();
                        AtomicReferenceArray atomicReferenceArray2 = c0071M447.f628;
                        int i4 = c0071M447.f627 & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C2254) && ((C2254) obj2).f11103 == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c0071M447 = null;
                        }
                        if (c0071M447 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                c0071 = this;
            } else {
                int i5 = c0071.f625;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean m446() {
        while (true) {
            long longVolatile = AbstractC2112.f10448.getLongVolatile(this, f623);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            C0071 c0071 = this;
            if (AbstractC2112.f10448.compareAndSwapLong(c0071, f623, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = c0071;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0071 m447() {
        long j;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = AbstractC2112.f10448;
            long j2 = f623;
            long longVolatile = unsafe2.getLongVolatile(this, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j = longVolatile;
                break;
            }
            j = 1152921504606846976L | longVolatile;
            if (unsafe2.compareAndSwapLong(this, j2, longVolatile, j)) {
                break;
            }
        }
        while (true) {
            Unsafe unsafe3 = AbstractC2112.f10448;
            long j3 = f624;
            C0071 c0071 = (C0071) unsafe3.getObjectVolatile(this, j3);
            if (c0071 != null) {
                return c0071;
            }
            C0071 c00712 = new C0071(this.f625 * 2, this.f626);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f627;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c2254 = this.f628.get(i4);
                if (c2254 == null) {
                    c2254 = new C2254(i);
                }
                c00712.f628.set(c00712.f627 & i, c2254);
                i++;
            }
            AbstractC2112.f10448.putLongVolatile(c00712, f623, j & (-1152921504606846977L));
            do {
                unsafe = AbstractC2112.f10448;
                if (unsafe.compareAndSwapObject(this, f624, (Object) null, c00712)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m448() {
        C0071 c0071M447 = this;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f623;
            long longVolatile = unsafe.getLongVolatile(c0071M447, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return f622;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = c0071M447.f627;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = c0071M447.f628;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = c0071M447.f626;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof C2254) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (unsafe.compareAndSwapLong(c0071M447, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                c0071M447 = this;
                if (z) {
                    while (true) {
                        Unsafe unsafe2 = AbstractC2112.f10448;
                        long j3 = f623;
                        long longVolatile2 = unsafe2.getLongVolatile(c0071M447, j3);
                        int i5 = (int) (longVolatile2 & 1073741823);
                        if ((longVolatile2 & 1152921504606846976L) != 0) {
                            c0071M447 = c0071M447.m447();
                        } else {
                            if (unsafe2.compareAndSwapLong(c0071M447, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                c0071M447.f628.set(c0071M447.f627 & i5, null);
                                c0071M447 = null;
                            } else {
                                continue;
                            }
                        }
                        if (c0071M447 == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
