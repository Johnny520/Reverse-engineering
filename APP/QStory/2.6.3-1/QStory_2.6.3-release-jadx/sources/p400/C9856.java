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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9856 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9856 f25652;

    static {
        C9856 c9856 = new C9856();
        f25652 = c9856;
        C7958 c7958 = new C7958(AbstractC9234.m14531(1428), c9856, 3);
        c7958.m12968(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜喵呜呜喵喵~喵喵喵喵呜喵喵喵"), true);
        c7958.m12967(new C9680(4, 3));
        c7958.m12968(AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜"), false);
        c7958.m12967(new C9680(11, 3));
        c7958.m12968(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜"), true);
        c7958.m12967(new C9680(37, 3));
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C7901.f19321, C9854.f25651, C7912.f19342};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        int i = 0;
        int iMo11230 = 0;
        long jMo11258 = 0;
        C9841 c9841 = null;
        boolean z = true;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                jMo11258 = interfaceC8018Mo11235.mo11258(interfaceC8020, 0);
                i |= 1;
            } else if (iMo11277 == 1) {
                c9841 = (C9841) interfaceC8018Mo11235.mo11233(interfaceC8020, 1, C9854.f25651, c9841);
                i |= 2;
            } else {
                if (iMo11277 != 2) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                iMo11230 = interfaceC8018Mo11235.mo11230(interfaceC8020, 2);
                i |= 4;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9844(i, jMo11258, c9841, iMo11230);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9844 c9844 = (C9844) obj;
        AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        c9844.getClass();
        long j = c9844.f25642;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || j != 0) {
            interfaceC8017Mo11269.mo11281(interfaceC8020, 0, j);
        }
        C9854 c9854 = C9854.f25651;
        C9841 c9841 = c9844.f25641;
        int i = c9844.f25640;
        interfaceC8017Mo11269.mo11278(interfaceC8020, 1, c9854, c9841);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i != 0) {
            interfaceC8017Mo11269.mo11288(2, i, interfaceC8020);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
