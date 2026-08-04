package yyds;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: yyds.ᛶᛲᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1277 implements InterfaceC2684, InterfaceC1851 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0477 f5865;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0124 f5866;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final AtomicInteger f5867 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public EnumC2065 f5868;

    public C1277(InterfaceC0477 interfaceC0477, InterfaceC0124 interfaceC0124) {
        this.f5865 = interfaceC0477;
        this.f5866 = interfaceC0124;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2545(EnumC2065 enumC2065, InterfaceC0477 interfaceC0477, AbstractC1320 abstractC1320) {
        C1791 c1791;
        if (abstractC1320 instanceof C1791) {
            c1791 = (C1791) abstractC1320;
            int i = c1791.f9036;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1791.f9036 = i - Integer.MIN_VALUE;
            } else {
                c1791 = new C1791(this, abstractC1320);
            }
        }
        Object objMo511 = c1791.f9037;
        int i2 = c1791.f9036;
        AtomicInteger atomicInteger = this.f5867;
        int i3 = 1;
        InterfaceC0124 interfaceC0124 = this.f5866;
        try {
            if (i2 == 0) {
                AbstractC1544.m3189(objMo511);
                int iOrdinal = enumC2065.ordinal();
                if (iOrdinal == 0) {
                    AbstractC2328.m4335(interfaceC0124, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    AbstractC2328.m4335(interfaceC0124, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        C0188.m801();
                        return null;
                    }
                    AbstractC2328.m4335(interfaceC0124, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.f5868 = enumC2065;
                }
                Object c0236 = new C0236(0, this);
                c1791.f9038 = 1;
                c1791.f9036 = 1;
                objMo511 = interfaceC0477.mo511(c0236, c1791);
                Object obj = EnumC1765.f8858;
                if (objMo511 == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    C0188.m800("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = c1791.f9038;
                AbstractC1544.m3189(objMo511);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.f5868 = null;
            }
            if (i3 != 0) {
                AbstractC2328.m4335(interfaceC0124, "END TRANSACTION");
                return objMo511;
            }
            AbstractC2328.m4335(interfaceC0124, "ROLLBACK TRANSACTION");
            return objMo511;
        } finally {
        }
    }

    @Override // yyds.InterfaceC2684
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Boolean mo2546(InterfaceC0274 interfaceC0274) {
        return Boolean.valueOf(this.f5868 != null || this.f5866.mo574());
    }

    @Override // yyds.InterfaceC1851
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC0124 mo885() {
        return this.f5866;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yyds.InterfaceC2349
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo886(String str, InterfaceC1549 interfaceC1549, AbstractC1320 abstractC1320) throws Exception {
        C2562 c2562;
        if (abstractC1320 instanceof C2562) {
            c2562 = (C2562) abstractC1320;
            int i = c2562.f12643;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2562.f12643 = i - Integer.MIN_VALUE;
            } else {
                c2562 = new C2562(this, abstractC1320);
            }
        }
        Object objMo2546 = c2562.f12640;
        int i2 = c2562.f12643;
        Object obj = EnumC1765.f8858;
        if (i2 == 0) {
            AbstractC1544.m3189(objMo2546);
            c2562.f12644 = str;
            c2562.f12642 = interfaceC1549;
            c2562.f12643 = 1;
            objMo2546 = mo2546(c2562);
            if (objMo2546 != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC1544.m3189(objMo2546);
                return objMo2546;
            }
            C0188.m800("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC1549 = c2562.f12642;
        str = c2562.f12644;
        AbstractC1544.m3189(objMo2546);
        if (((Boolean) objMo2546).booleanValue()) {
            C0392 c0392 = new C0392(this, str, interfaceC1549, null);
            c2562.f12644 = null;
            c2562.f12642 = null;
            c2562.f12643 = 2;
            Object objMo511 = this.f5865.mo511(c0392, c2562);
            return objMo511 == obj ? obj : objMo511;
        }
        InterfaceC1212 interfaceC1212Mo575 = this.f5866.mo575(str);
        try {
            Object objMo371 = interfaceC1549.mo371(interfaceC1212Mo575);
            AbstractC0797.m1819(interfaceC1212Mo575, null);
            return objMo371;
        } finally {
        }
    }

    @Override // yyds.InterfaceC2684
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object mo2547(EnumC2065 enumC2065, InterfaceC0477 interfaceC0477, AbstractC1861 abstractC1861) {
        return this.f5865.mo511(new C2395(this, enumC2065, interfaceC0477, null), abstractC1861);
    }
}
