package yyds;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛲᛶᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0381 extends AbstractC1262 implements InterfaceC0576 {
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final long f1959;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1958 = AtomicIntegerFieldUpdater.newUpdater(AbstractC0381.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ long f1957 = AbstractC2112.f10448.objectFieldOffset(AbstractC0381.class.getDeclaredField("cleanedAndPointers$volatile"));

    public AbstractC0381(long j, C1056 c1056, int i) {
        super(c1056);
        this.f1959 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public abstract int mo1083();

    @Override // yyds.AbstractC1262
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean mo1084() {
        Unsafe unsafe = AbstractC2112.f10448;
        if (unsafe.getIntVolatile(this, f1957) != mo1083()) {
            return false;
        }
        Object objectVolatile = unsafe.getObjectVolatile(this, AbstractC1262.f5819);
        return (objectVolatile == AbstractC1367.f6359 ? null : (AbstractC1262) objectVolatile) != null;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean m1085() {
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f1957;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.mo1083()) {
                Object objectVolatile = unsafe.getObjectVolatile(this, AbstractC1262.f5819);
                if ((objectVolatile == AbstractC1367.f6359 ? null : (AbstractC1262) objectVolatile) != null) {
                    return false;
                }
            }
            AbstractC0381 abstractC0381 = this;
            if (unsafe.compareAndSwapInt(abstractC0381, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = abstractC0381;
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public abstract void mo1086(int i);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean m1087() {
        if (f1958.addAndGet(this, -65536) != mo1083()) {
            return false;
        }
        Object objectVolatile = AbstractC2112.f10448.getObjectVolatile(this, AbstractC1262.f5819);
        return (objectVolatile == AbstractC1367.f6359 ? null : (AbstractC1262) objectVolatile) != null;
    }
}
