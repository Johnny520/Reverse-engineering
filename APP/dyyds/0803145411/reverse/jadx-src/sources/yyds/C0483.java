package yyds;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛲᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0483 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f2400 = AbstractC2112.f10448.objectFieldOffset(C0483.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new C0071(8, false);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m1337(Runnable runnable) {
        C0483 c0483;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f2400;
            C0071 c0071 = (C0071) unsafe.getObjectVolatile(this, j);
            int iM445 = c0071.m445(runnable);
            if (iM445 == 0) {
                return true;
            }
            if (iM445 == 1) {
                C0071 c0071M447 = c0071.m447();
                while (true) {
                    Unsafe unsafe2 = AbstractC2112.f10448;
                    c0483 = this;
                    if (!unsafe2.compareAndSwapObject(c0483, f2400, c0071, c0071M447) && unsafe2.getObjectVolatile(c0483, j) == c0071) {
                        this = c0483;
                    }
                }
            } else {
                if (iM445 == 2) {
                    return false;
                }
                c0483 = this;
            }
            this = c0483;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1338() {
        C0483 c0483;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f2400;
            C0071 c0071 = (C0071) unsafe.getObjectVolatile(this, j);
            if (c0071.m446()) {
                return;
            }
            C0071 c0071M447 = c0071.m447();
            while (true) {
                c0483 = this;
                if (!AbstractC2112.f10448.compareAndSwapObject(c0483, f2400, c0071, c0071M447) && AbstractC2112.f10448.getObjectVolatile(c0483, j) == c0071) {
                    this = c0483;
                }
            }
            this = c0483;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int m1339() {
        C0071 c0071 = (C0071) AbstractC2112.f10448.getObjectVolatile(this, f2400);
        c0071.getClass();
        long longVolatile = AbstractC2112.f10448.getLongVolatile(c0071, C0071.f623);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object m1340() {
        C0483 c0483;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f2400;
            C0071 c0071 = (C0071) unsafe.getObjectVolatile(this, j);
            Object objM448 = c0071.m448();
            if (objM448 != C0071.f622) {
                return objM448;
            }
            C0071 c0071M447 = c0071.m447();
            while (true) {
                c0483 = this;
                if (!AbstractC2112.f10448.compareAndSwapObject(c0483, f2400, c0071, c0071M447) && AbstractC2112.f10448.getObjectVolatile(c0483, j) == c0071) {
                    this = c0483;
                }
            }
            this = c0483;
        }
    }
}
