package Yue;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Yue.ۥۡۧۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7278 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C7278 f2781 = new C7278();

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f2782 = 65536;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C7275 f21957 = new C7275(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f21958;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final AtomicReference<C7275>[] f21959;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f21958 = iHighestOneBit;
        AtomicReference<C7275>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f21959 = atomicReferenceArr;
    }

    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m22744(@InterfaceC6399 C7275 c7275) {
        AtomicReference<C7275> atomicReferenceM3543;
        C7275 c72752;
        C7275 andSet;
        C5499.m17103(c7275, "segment");
        if (c7275.f21953 != null || c7275.f21954 != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c7275.f21951 || (andSet = (atomicReferenceM3543 = f2781.m3543()).getAndSet((c72752 = f21957))) == c72752) {
            return;
        }
        int i = andSet != null ? andSet.f21950 : 0;
        if (i >= f2782) {
            atomicReferenceM3543.set(andSet);
            return;
        }
        c7275.f21953 = andSet;
        c7275.f2779 = 0;
        c7275.f21950 = i + 8192;
        atomicReferenceM3543.set(c7275);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final C7275 m22745() {
        AtomicReference<C7275> atomicReferenceM3543 = f2781.m3543();
        C7275 c7275 = f21957;
        C7275 andSet = atomicReferenceM3543.getAndSet(c7275);
        if (andSet == c7275) {
            return new C7275();
        }
        if (andSet == null) {
            atomicReferenceM3543.set(null);
            return new C7275();
        }
        atomicReferenceM3543.set(andSet.f21953);
        andSet.f21953 = null;
        andSet.f21950 = 0;
        return andSet;
    }

    /* JADX INFO: renamed from: ۥ */
    public final AtomicReference<C7275> m3543() {
        return f21959[(int) (Thread.currentThread().getId() & (((long) f21958) - 1))];
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final int m3544() {
        C7275 c7275 = m3543().get();
        if (c7275 == null) {
            return 0;
        }
        return c7275.f21950;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m22746() {
        return f2782;
    }
}
