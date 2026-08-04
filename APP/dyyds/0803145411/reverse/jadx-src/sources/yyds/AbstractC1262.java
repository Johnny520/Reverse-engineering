package yyds;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛶᛱᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1262 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f5819;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f5820;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = AbstractC2112.f10448;
        f5819 = unsafe.objectFieldOffset(AbstractC1262.class.getDeclaredField("_next$volatile"));
        f5820 = unsafe.objectFieldOffset(AbstractC1262.class.getDeclaredField("_prev$volatile"));
    }

    public AbstractC1262(C1056 c1056) {
        this._prev$volatile = c1056;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public abstract boolean mo1084();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2538() {
        AbstractC1262 abstractC1262;
        Unsafe unsafe;
        Unsafe unsafe2 = AbstractC2112.f10448;
        long j = f5819;
        Object objectVolatile = unsafe2.getObjectVolatile(this, j);
        C0415 c0415 = AbstractC1367.f6359;
        if ((objectVolatile == c0415 ? null : (AbstractC1262) objectVolatile) == null) {
            return;
        }
        while (true) {
            Unsafe unsafe3 = AbstractC2112.f10448;
            long j2 = f5820;
            AbstractC1262 abstractC12622 = (AbstractC1262) unsafe3.getObjectVolatile(this, j2);
            while (abstractC12622 != null && abstractC12622.mo1084()) {
                abstractC12622 = (AbstractC1262) AbstractC2112.f10448.getObjectVolatile(abstractC12622, j2);
            }
            Object objectVolatile2 = AbstractC2112.f10448.getObjectVolatile(this, j);
            AbstractC1262 abstractC12623 = objectVolatile2 == c0415 ? null : (AbstractC1262) objectVolatile2;
            do {
                abstractC1262 = abstractC12623;
                if (!abstractC1262.mo1084()) {
                    break;
                }
                Object objectVolatile3 = AbstractC2112.f10448.getObjectVolatile(abstractC1262, j);
                abstractC12623 = objectVolatile3 == c0415 ? null : (AbstractC1262) objectVolatile3;
            } while (abstractC12623 != null);
            while (true) {
                Object objectVolatile4 = AbstractC2112.f10448.getObjectVolatile(abstractC1262, j2);
                AbstractC1262 abstractC12624 = ((AbstractC1262) objectVolatile4) == null ? null : abstractC12622;
                do {
                    unsafe = AbstractC2112.f10448;
                    if (unsafe.compareAndSwapObject(abstractC1262, f5820, objectVolatile4, abstractC12624)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(abstractC1262, j2) == objectVolatile4);
            }
            if (abstractC12622 != null) {
                unsafe.putObjectVolatile(abstractC12622, j, abstractC1262);
            }
            if (abstractC1262.mo1084()) {
                Object objectVolatile5 = unsafe.getObjectVolatile(abstractC1262, j);
                if ((objectVolatile5 == c0415 ? null : (AbstractC1262) objectVolatile5) != null) {
                    continue;
                }
            }
            if (abstractC12622 == null || !abstractC12622.mo1084()) {
                return;
            }
        }
    }
}
