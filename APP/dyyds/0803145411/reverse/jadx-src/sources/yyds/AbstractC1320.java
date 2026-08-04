package yyds;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛶᛴᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1320 extends AbstractC0332 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public transient InterfaceC0274 f6069;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC2213 f6070;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1320(InterfaceC0274 interfaceC0274) {
        super(interfaceC0274);
        InterfaceC2213 interfaceC2213Mo733 = interfaceC0274 != null ? interfaceC0274.mo733() : null;
        this.f6070 = interfaceC2213Mo733;
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final InterfaceC2213 mo733() {
        return this.f6070;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final void mo1007() {
        Unsafe unsafe;
        long j;
        InterfaceC0274 interfaceC0274 = this.f6069;
        if (interfaceC0274 != null && interfaceC0274 != this) {
            ((AbstractC0974) this.f6070.mo423(C0135.f836)).getClass();
            C1118 c1118 = (C1118) interfaceC0274;
            do {
                unsafe = AbstractC2112.f10448;
                j = C1118.f5136;
            } while (unsafe.getObjectVolatile(c1118, j) == AbstractC0427.f2178);
            Object objectVolatile = unsafe.getObjectVolatile(c1118, j);
            C1853 c1853 = objectVolatile instanceof C1853 ? (C1853) objectVolatile : null;
            if (c1853 != null) {
                c1853.m3623();
            }
        }
        this.f6069 = C1769.f8872;
    }
}
