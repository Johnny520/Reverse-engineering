package p400;

import p103.C7901;
import p103.C7912;
import p103.C7958;
import p103.InterfaceC7908;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;
import p303.AbstractC9234;
import p365.C9680;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9891 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9891 f25702;

    static {
        C9891 c9891 = new C9891();
        f25702 = c9891;
        C7958 c7958 = new C7958(AbstractC9234.m14531(1451), c9891, 5);
        c7958.m12968(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵喵"), true);
        c7958.m12967(new C9680(1, 3));
        c7958.m12968(AbstractC9234.m14531(1452), true);
        c7958.m12967(new C9680(2, 3));
        c7958.m12968(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵呜呜呜喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜"), true);
        c7958.m12967(new C9680(3, 3));
        c7958.m12968(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜"), true);
        c7958.m12967(new C9680(5, 3));
        c7958.m12968(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), true);
        c7958.m12967(new C9680(6, 3));
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        C7912 c7912 = C7912.f19342;
        return new InterfaceC8013[]{c7912, c7912, c7912, c7912, C7901.f19321};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        int i = 0;
        int iMo11230 = 0;
        int iMo112302 = 0;
        int iMo112303 = 0;
        int iMo112304 = 0;
        long jMo11258 = 0;
        boolean z = true;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                iMo11230 = interfaceC8018Mo11235.mo11230(interfaceC8020, 0);
                i |= 1;
            } else if (iMo11277 == 1) {
                iMo112302 = interfaceC8018Mo11235.mo11230(interfaceC8020, 1);
                i |= 2;
            } else if (iMo11277 == 2) {
                iMo112303 = interfaceC8018Mo11235.mo11230(interfaceC8020, 2);
                i |= 4;
            } else if (iMo11277 == 3) {
                iMo112304 = interfaceC8018Mo11235.mo11230(interfaceC8020, 3);
                i |= 8;
            } else {
                if (iMo11277 != 4) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                jMo11258 = interfaceC8018Mo11235.mo11258(interfaceC8020, 4);
                i |= 16;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9886(i, iMo11230, iMo112302, iMo112303, iMo112304, jMo11258);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9886 c9886 = (C9886) obj;
        AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        c9886.getClass();
        long j = c9886.f25686;
        int i = c9886.f25687;
        int i2 = c9886.f25688;
        int i3 = c9886.f25689;
        int i4 = c9886.f25690;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i4 != 0) {
            interfaceC8017Mo11269.mo11288(0, i4, interfaceC8020);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i3 != 0) {
            interfaceC8017Mo11269.mo11288(1, i3, interfaceC8020);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i2 != 0) {
            interfaceC8017Mo11269.mo11288(2, i2, interfaceC8020);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i != 0) {
            interfaceC8017Mo11269.mo11288(3, i, interfaceC8020);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || j != 0) {
            interfaceC8017Mo11269.mo11281(interfaceC8020, 4, j);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
