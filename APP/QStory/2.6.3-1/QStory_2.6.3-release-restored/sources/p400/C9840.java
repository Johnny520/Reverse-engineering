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
import p365.C9680;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9840 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9840 f25633;

    static {
        C9840 c9840 = new C9840();
        f25633 = c9840;
        C7958 c7958 = new C7958("top.artmoe.inao.entries.QQMessage.MessageBody.RichMsg.MsgContent", c9840, 2);
        c7958.m12968("textMsg", true);
        c7958.m12967(new C9680(1, 3));
        c7958.m12968("msgSender", true);
        c7958.m12967(new C9680(16, 3));
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{AbstractC4765.m8872(C9833.f25630), AbstractC4765.m8872(C9835.f25631)};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        "decoder";
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        C9890 c9890 = null;
        C9837 c9837 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                c9890 = (C9890) interfaceC8018Mo11235.mo11234(interfaceC8020, 0, C9833.f25630, c9890);
                i |= 1;
            } else {
                if (iMo11277 != 1) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                c9837 = (C9837) interfaceC8018Mo11235.mo11234(interfaceC8020, 1, C9835.f25631, c9837);
                i |= 2;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9889(i, c9890, c9837);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9889 c9889 = (C9889) obj;
        "encoder";
        "value";
        c9889.getClass();
        C9837 c9837 = c9889.f25699;
        C9890 c9890 = c9889.f25700;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || c9890 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 0, C9833.f25630, c9890);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || c9837 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 1, C9835.f25631, c9837);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
