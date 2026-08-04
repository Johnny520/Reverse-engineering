package yyds;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛸᛵᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1778 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f8923;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f8924;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f8925;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8926;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f8927;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f8928;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f8929;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1911 f8930;

    static {
        Unsafe unsafe = AbstractC2112.f10448;
        f8924 = unsafe.objectFieldOffset(C1778.class.getDeclaredField("head$volatile"));
        f8925 = AtomicLongFieldUpdater.newUpdater(C1778.class, "deqIdx$volatile");
        f8927 = unsafe.objectFieldOffset(C1778.class.getDeclaredField("tail$volatile"));
        f8928 = AtomicLongFieldUpdater.newUpdater(C1778.class, "enqIdx$volatile");
        f8926 = AtomicIntegerFieldUpdater.newUpdater(C1778.class, "_availablePermits$volatile");
        f8923 = unsafe.objectFieldOffset(C1778.class.getDeclaredField("_availablePermits$volatile"));
    }

    public C1778(int i) {
        this.f8929 = i;
        if (i <= 0) {
            C0188.m806(AbstractC0897.m1989(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            C0188.m806(AbstractC0897.m1989(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        C1056 c1056 = new C1056(0L, null, 2);
        this.head$volatile = c1056;
        this.tail$volatile = c1056;
        this._availablePermits$volatile = i;
        this.f8930 = new C1911(2, this);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean m3538(InterfaceC1927 interfaceC1927) {
        Object objM2787;
        Unsafe unsafe;
        C1778 c1778 = this;
        Unsafe unsafe2 = AbstractC2112.f10448;
        long j = f8927;
        C1056 c1056 = (C1056) unsafe2.getObjectVolatile(c1778, j);
        long andIncrement = f8928.getAndIncrement(c1778);
        C0509 c0509 = C0509.f2458;
        long j2 = andIncrement / ((long) AbstractC0891.f4080);
        loop0: while (true) {
            objM2787 = AbstractC1367.m2787(c1056, j2, c0509);
            if (objM2787 == AbstractC1367.f6359) {
                break;
            }
            AbstractC0381 abstractC0381M4199 = AbstractC2217.m4199(objM2787);
            while (true) {
                AbstractC0381 abstractC0381 = (AbstractC0381) AbstractC2112.f10448.getObjectVolatile(c1778, j);
                if (abstractC0381.f1959 >= abstractC0381M4199.f1959) {
                    c1778 = this;
                    break loop0;
                }
                if (!abstractC0381M4199.m1085()) {
                    break;
                }
                do {
                    unsafe = AbstractC2112.f10448;
                    c1778 = this;
                    if (unsafe.compareAndSwapObject(c1778, f8927, abstractC0381, abstractC0381M4199)) {
                        if (abstractC0381.m1087()) {
                            abstractC0381.m2538();
                        }
                    }
                } while (unsafe.getObjectVolatile(c1778, j) == abstractC0381);
                if (abstractC0381M4199.m1087()) {
                    abstractC0381M4199.m2538();
                }
            }
            c1778 = this;
        }
        C1056 c10562 = (C1056) AbstractC2217.m4199(objM2787);
        AtomicReferenceArray atomicReferenceArray = c10562.f4825;
        int i = (int) (andIncrement % ((long) AbstractC0891.f4080));
        while (!atomicReferenceArray.compareAndSet(i, null, interfaceC1927)) {
            if (atomicReferenceArray.get(i) != null) {
                C0415 c0415 = AbstractC0891.f4078;
                C0415 c04152 = AbstractC0891.f4079;
                while (!atomicReferenceArray.compareAndSet(i, c0415, c04152)) {
                    if (atomicReferenceArray.get(i) != c0415) {
                        return false;
                    }
                }
                ((InterfaceC1617) interfaceC1927).mo3311(c1778.f8930);
                return true;
            }
        }
        interfaceC1927.mo3447(c10562, i);
        return true;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3539() {
        Object objM2787;
        boolean z;
        Unsafe unsafe;
        C1778 c1778 = this;
        do {
            int andIncrement = f8926.getAndIncrement(c1778);
            int i = c1778.f8929;
            if (andIncrement >= i) {
                while (true) {
                    Unsafe unsafe2 = AbstractC2112.f10448;
                    long j = f8923;
                    int intVolatile = unsafe2.getIntVolatile(c1778, j);
                    int i2 = c1778.f8929;
                    if (intVolatile <= i2 || unsafe2.compareAndSwapInt(c1778, j, intVolatile, i2)) {
                        break;
                    } else {
                        c1778 = this;
                    }
                }
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = AbstractC2112.f10448;
            long j2 = f8924;
            C1056 c1056 = (C1056) unsafe3.getObjectVolatile(c1778, j2);
            long andIncrement2 = f8925.getAndIncrement(c1778);
            long j3 = andIncrement2 / ((long) AbstractC0891.f4080);
            C1497 c1497 = C1497.f7064;
            while (true) {
                objM2787 = AbstractC1367.m2787(c1056, j3, c1497);
                if (objM2787 == AbstractC1367.f6359) {
                    break;
                }
                AbstractC0381 abstractC0381M4199 = AbstractC2217.m4199(objM2787);
                while (true) {
                    AbstractC0381 abstractC0381 = (AbstractC0381) AbstractC2112.f10448.getObjectVolatile(c1778, j2);
                    if (abstractC0381.f1959 >= abstractC0381M4199.f1959) {
                        c1778 = this;
                        break;
                    }
                    if (!abstractC0381M4199.m1085()) {
                        break;
                    }
                    do {
                        unsafe = AbstractC2112.f10448;
                        c1778 = this;
                        if (unsafe.compareAndSwapObject(c1778, f8924, abstractC0381, abstractC0381M4199)) {
                            if (abstractC0381.m1087()) {
                                abstractC0381.m2538();
                            }
                        }
                    } while (unsafe.getObjectVolatile(c1778, j2) == abstractC0381);
                    if (abstractC0381M4199.m1087()) {
                        abstractC0381M4199.m2538();
                    }
                }
                c1778 = this;
            }
            C1056 c10562 = (C1056) AbstractC2217.m4199(objM2787);
            AtomicReferenceArray atomicReferenceArray = c10562.f4825;
            AbstractC2112.f10448.putObjectVolatile(c10562, AbstractC1262.f5820, (Object) null);
            z = false;
            if (c10562.f1959 <= j3) {
                int i3 = (int) (andIncrement2 % ((long) AbstractC0891.f4080));
                Object andSet = atomicReferenceArray.getAndSet(i3, AbstractC0891.f4078);
                if (andSet == null) {
                    int i4 = AbstractC0891.f4077;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == AbstractC0891.f4079) {
                            z = true;
                            break;
                        }
                    }
                    C0415 c0415 = AbstractC0891.f4078;
                    C0415 c04152 = AbstractC0891.f4081;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, c0415, c04152)) {
                            if (atomicReferenceArray.get(i3) != c0415) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != AbstractC0891.f4076) {
                    if (!(andSet instanceof InterfaceC1617)) {
                        C0188.m791(andSet, "unexpected: ");
                        return;
                    }
                    InterfaceC1617 interfaceC1617 = (InterfaceC1617) andSet;
                    C0415 c0415Mo3312 = interfaceC1617.mo3312(c1778.f8930);
                    if (c0415Mo3312 != null) {
                        interfaceC1617.mo3313(c0415Mo3312);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
