package p400;

import io.ktor.client.plugins.AbstractC4765;
import java.util.List;
import kotlin.InterfaceC6016;
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
import p365.C9680;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9870 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9870 f25670;

    static {
        C9870 c9870 = new C9870();
        f25670 = c9870;
        C7958 c7958 = new C7958("top.artmoe.inao.entries.NewSyncPush.SyncRecallOperateInfo", c9870, 4);
        c7958.m12968("syncInfoHead", true);
        c7958.m12967(new C9680(3, 2));
        c7958.m12968("syncInfoBody", true);
        c7958.m12967(new C9680(4, 2));
        c7958.m12968("subHead", true);
        c7958.m12967(new C9680(5, 2));
        c7958.m12968("unknownFlag", true);
        c7958.m12967(new C9680(6, 2));
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        InterfaceC6016[] interfaceC6016Arr = C9872.f25672;
        C9873 c9873 = C9873.f25677;
        return new InterfaceC8013[]{AbstractC4765.m8872(c9873), AbstractC4765.m8872((InterfaceC8013) interfaceC6016Arr[1].getValue()), AbstractC4765.m8872(c9873), C7912.f19342};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        "decoder";
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C9872.f25672;
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        int iMo11230 = 0;
        C9871 c9871 = null;
        List list = null;
        C9871 c98712 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                c9871 = (C9871) interfaceC8018Mo11235.mo11234(interfaceC8020, 0, C9873.f25677, c9871);
                i |= 1;
            } else if (iMo11277 == 1) {
                list = (List) interfaceC8018Mo11235.mo11234(interfaceC8020, 1, (InterfaceC8013) interfaceC6016Arr[1].getValue(), list);
                i |= 2;
            } else if (iMo11277 == 2) {
                c98712 = (C9871) interfaceC8018Mo11235.mo11234(interfaceC8020, 2, C9873.f25677, c98712);
                i |= 4;
            } else {
                if (iMo11277 != 3) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                iMo11230 = interfaceC8018Mo11235.mo11230(interfaceC8020, 3);
                i |= 8;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9872(i, c9871, list, c98712, iMo11230);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9872 c9872 = (C9872) obj;
        "encoder";
        "value";
        c9872.getClass();
        int i = c9872.f25673;
        C9871 c9871 = c9872.f25674;
        List list = c9872.f25675;
        C9871 c98712 = c9872.f25676;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C9872.f25672;
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || c98712 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 0, C9873.f25677, c98712);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || list != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 1, (InterfaceC8013) interfaceC6016Arr[1].getValue(), list);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || c9871 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 2, C9873.f25677, c9871);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i != 0) {
            interfaceC8017Mo11269.mo11288(3, i, interfaceC8020);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
