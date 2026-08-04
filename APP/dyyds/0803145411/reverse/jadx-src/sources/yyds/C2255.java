package yyds;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᲁᛶᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2255 extends C1778 implements InterfaceC1062 {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11104 = AtomicReferenceFieldUpdater.newUpdater(C2255.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final /* synthetic */ long f11105 = AbstractC2112.f10448.objectFieldOffset(C2255.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public C2255() {
        super(1);
        this.owner$volatile = AbstractC0598.f2825;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC2408.m4457(this));
        sb.append("[isLocked=");
        Unsafe unsafe = AbstractC2112.f10448;
        sb.append(Math.max(unsafe.getIntVolatile(this, C1778.f8923), 0) == 0);
        sb.append(",owner=");
        sb.append(unsafe.getObjectVolatile(this, f11105));
        sb.append(']');
        return sb.toString();
    }

    @Override // yyds.InterfaceC1062
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo2251(Object obj) {
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            if (Math.max(unsafe.getIntVolatile(this, C1778.f8923), 0) != 0) {
                C0188.m800("This mutex is not locked");
                return;
            }
            long j = f11105;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            C0415 c0415 = AbstractC0598.f2825;
            if (objectVolatile != c0415) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = AbstractC2112.f10448;
                    C2255 c2255 = this;
                    if (unsafe2.compareAndSwapObject(c2255, f11105, objectVolatile, c0415)) {
                        c2255.m3539();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(c2255, j) != objectVolatile) {
                            this = c2255;
                            break;
                        }
                        this = c2255;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        r0.mo3311(r6.f8930);
     */
    @Override // yyds.InterfaceC1062
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2252(AbstractC1320 abstractC1320) throws Throwable {
        C2255 c2255;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = C1778.f8923;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = this.f8929;
            if (intVolatile > i) {
                while (true) {
                    Unsafe unsafe2 = AbstractC2112.f10448;
                    long j2 = C1778.f8923;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i2 = this.f8929;
                    c2255 = this;
                    if (intVolatile2 <= i2 || unsafe2.compareAndSwapInt(c2255, j2, intVolatile2, i2)) {
                        break;
                    }
                    this = c2255;
                }
            } else {
                c2255 = this;
                C2746 c2746 = C2746.f13459;
                if (intVolatile <= 0) {
                    C1853 c1853M1140 = AbstractC0395.m1140(AbstractC1367.m2783(abstractC1320));
                    try {
                        C1698 c1698 = new C1698(c2255, c1853M1140);
                        while (true) {
                            int andDecrement = C1778.f8926.getAndDecrement(c2255);
                            if (andDecrement <= i) {
                                if (andDecrement > 0) {
                                    break;
                                }
                                if (c2255.m3538(c1698)) {
                                    break;
                                }
                            }
                        }
                        Object objM3629 = c1853M1140.m3629();
                        EnumC1765 enumC1765 = EnumC1765.f8858;
                        if (objM3629 != enumC1765) {
                            objM3629 = c2746;
                        }
                        return objM3629 == enumC1765 ? objM3629 : c2746;
                    } catch (Throwable th) {
                        c1853M1140.m3618();
                        throw th;
                    }
                }
                if (unsafe.compareAndSwapInt(c2255, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(c2255, f11105, (Object) null);
                    return c2746;
                }
            }
            this = c2255;
        }
    }
}
