package p400;

import io.ktor.client.plugins.AbstractC4765;
import kotlin.jvm.internal.AbstractC5227;
import p103.C7947;
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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9865 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9865 f25667;

    static {
        C9865 c9865 = new C9865();
        f25667 = c9865;
        C7958 c7958 = new C7958("top.artmoe.inao.entries.QQMessage.MessageBody", c9865, 2);
        c7958.m12968("richMsg", true);
        c7958.m12967(new C9680(1, 3));
        c7958.m12968("operationInfo", true);
        c7958.m12967(new C9680(2, 3));
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{AbstractC4765.m8872(C9843.f25639), C7947.f19399};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        "decoder";
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        C9893 c9893 = null;
        byte[] bArr = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                c9893 = (C9893) interfaceC8018Mo11235.mo11234(interfaceC8020, 0, C9843.f25639, c9893);
                i |= 1;
            } else {
                if (iMo11277 != 1) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                bArr = (byte[]) interfaceC8018Mo11235.mo11233(interfaceC8020, 1, C7947.f19399, bArr);
                i |= 2;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9894(i, c9893, bArr);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9894 c9894 = (C9894) obj;
        "encoder";
        "value";
        c9894.getClass();
        byte[] bArr = c9894.f25705;
        C9893 c9893 = c9894.f25706;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || c9893 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 0, C9843.f25639, c9893);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(bArr, new byte[0])) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 1, C7947.f19399, bArr);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
