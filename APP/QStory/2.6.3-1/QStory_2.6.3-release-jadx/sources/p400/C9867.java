package p400;

import io.ktor.client.plugins.AbstractC4765;
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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9867 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9867 f25669;

    static {
        C9867 c9867 = new C9867();
        f25669 = c9867;
        C7958 c7958 = new C7958(AbstractC9234.m14531(1414), c9867, 3);
        c7958.m12968(AbstractC9234.m14531(1415), false);
        c7958.m12967(new C9680(1, 3));
        c7958.m12968(AbstractC9234.m14531(1416), false);
        c7958.m12967(new C9680(2, 3));
        c7958.m12968(AbstractC9234.m14531(1417), true);
        c7958.m12967(new C9680(3, 3));
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C9885.f25685, C9891.f25702, AbstractC4765.m8872(C9865.f25667)};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        C9887 c9887 = null;
        C9886 c9886 = null;
        C9894 c9894 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                c9887 = (C9887) interfaceC8018Mo11235.mo11233(interfaceC8020, 0, C9885.f25685, c9887);
                i |= 1;
            } else if (iMo11277 == 1) {
                c9886 = (C9886) interfaceC8018Mo11235.mo11233(interfaceC8020, 1, C9891.f25702, c9886);
                i |= 2;
            } else {
                if (iMo11277 != 2) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                c9894 = (C9894) interfaceC8018Mo11235.mo11234(interfaceC8020, 2, C9865.f25667, c9894);
                i |= 4;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9888(i, c9887, c9886, c9894);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9888 c9888 = (C9888) obj;
        AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        c9888.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        C9885 c9885 = C9885.f25685;
        C9887 c9887 = c9888.f25698;
        C9894 c9894 = c9888.f25696;
        interfaceC8017Mo11269.mo11278(interfaceC8020, 0, c9885, c9887);
        interfaceC8017Mo11269.mo11278(interfaceC8020, 1, C9891.f25702, c9888.f25697);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || c9894 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 2, C9865.f25667, c9894);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
