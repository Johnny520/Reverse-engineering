package p400;

import kotlin.jvm.internal.AbstractC5227;
import p103.C7901;
import p103.C7912;
import p103.C7958;
import p103.C7964;
import p103.InterfaceC7908;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;
import p365.C9680;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9849 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9849 f25649;

    static {
        C9849 c9849 = new C9849();
        f25649 = c9849;
        C7958 c7958 = new C7958("top.artmoe.inao.entries.QQMessage.MessageBody.C2CRecallOperationInfo.Info", c9849, 5);
        c7958.m12968("operatorUid", true);
        c7958.m12967(new C9680(1, 3));
        c7958.m12968("receiverUid", true);
        c7958.m12967(new C9680(2, 3));
        c7958.m12968("msgTime", true);
        c7958.m12967(new C9680(5, 3));
        c7958.m12968("msgRandom", true);
        c7958.m12967(new C9680(6, 3));
        c7958.m12968("msgSeq", true);
        c7958.m12967(new C9680(20, 3));
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        C7964 c7964 = C7964.f19434;
        C7901 c7901 = C7901.f19321;
        return new InterfaceC8013[]{c7964, c7964, c7901, c7901, C7912.f19342};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        "decoder";
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        int i = 0;
        int iMo11230 = 0;
        String strMo11245 = null;
        String strMo112452 = null;
        long jMo11258 = 0;
        long jMo112582 = 0;
        boolean z = true;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                strMo11245 = interfaceC8018Mo11235.mo11245(interfaceC8020, 0);
                i |= 1;
            } else if (iMo11277 == 1) {
                strMo112452 = interfaceC8018Mo11235.mo11245(interfaceC8020, 1);
                i |= 2;
            } else if (iMo11277 == 2) {
                jMo11258 = interfaceC8018Mo11235.mo11258(interfaceC8020, 2);
                i |= 4;
            } else if (iMo11277 == 3) {
                jMo112582 = interfaceC8018Mo11235.mo11258(interfaceC8020, 3);
                i |= 8;
            } else {
                if (iMo11277 != 4) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                iMo11230 = interfaceC8018Mo11235.mo11230(interfaceC8020, 4);
                i |= 16;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9847(i, strMo11245, strMo112452, jMo11258, jMo112582, iMo11230);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9847 c9847 = (C9847) obj;
        "encoder";
        "value";
        c9847.getClass();
        int i = c9847.f25644;
        long j = c9847.f25645;
        long j2 = c9847.f25646;
        String str = c9847.f25647;
        String str2 = c9847.f25648;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(str2, "")) {
            interfaceC8017Mo11269.mo11294(interfaceC8020, 0, str2);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(str, "")) {
            interfaceC8017Mo11269.mo11294(interfaceC8020, 1, str);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || j2 != 0) {
            interfaceC8017Mo11269.mo11281(interfaceC8020, 2, j2);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || j != 0) {
            interfaceC8017Mo11269.mo11281(interfaceC8020, 3, j);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i != 0) {
            interfaceC8017Mo11269.mo11288(4, i, interfaceC8020);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
