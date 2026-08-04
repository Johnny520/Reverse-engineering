package yyds;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛲᛱᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0278 extends AbstractC0931 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C1853 f1492;

    public C0278(C1853 c1853) {
        this.f1492 = c1853;
    }

    @Override // yyds.AbstractC0931
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void mo925(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        AbstractC0986 abstractC0986 = this.f4255;
        if (abstractC0986 == null) {
            abstractC0986 = null;
        }
        C1853 c1853 = this.f1492;
        Throwable thMo1354 = c1853.mo1354(abstractC0986);
        if (c1853.m3624()) {
            C1118 c1118 = (C1118) c1853.f9327;
            long j = C1118.f5136;
            loop0: while (true) {
                Object objectVolatile = AbstractC2112.f10448.getObjectVolatile(c1118, j);
                C0415 c0415 = AbstractC0427.f2178;
                if (AbstractC1544.m3188(objectVolatile, c0415)) {
                    do {
                        unsafe = AbstractC2112.f10448;
                        if (unsafe.compareAndSwapObject(c1118, C1118.f5136, c0415, thMo1354)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(c1118, j) == c0415);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = AbstractC2112.f10448;
                        if (unsafe2.compareAndSwapObject(c1118, C1118.f5136, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(c1118, j) == objectVolatile);
                }
            }
        }
        c1853.m3626(thMo1354);
        if (c1853.m3624()) {
            return;
        }
        c1853.m3623();
    }

    @Override // yyds.AbstractC0931
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final boolean mo926() {
        return true;
    }
}
