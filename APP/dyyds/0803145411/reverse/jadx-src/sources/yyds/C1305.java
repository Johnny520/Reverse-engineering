package yyds;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛶᛳᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1305 extends C1612 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f5970 = AbstractC2112.f10448.objectFieldOffset(C1305.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // yyds.C1612, yyds.AbstractC0986
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final void mo2147(Object obj) {
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f5970;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile != 1) {
                    C0188.m800("Already resumed");
                    return;
                } else {
                    AbstractC0427.m1189(AbstractC0476.m1328(obj), AbstractC1367.m2783(this.f8219));
                    return;
                }
            }
            C1305 c1305 = this;
            if (unsafe.compareAndSwapInt(c1305, j, 0, 2)) {
                return;
            } else {
                this = c1305;
            }
        }
    }

    @Override // yyds.C1612, yyds.AbstractC0986
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final void mo1619(Object obj) {
        mo2147(obj);
    }
}
