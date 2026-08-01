package p400;

import java.util.List;
import kotlin.InterfaceC6016;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9843 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9843 f25639;

    static {
        C9843 c9843 = new C9843();
        f25639 = c9843;
        C7958 c7958 = new C7958("top.artmoe.inao.entries.QQMessage.MessageBody.RichMsg", c9843, 1);
        c7958.m12968("msgContent", true);
        c7958.m12967(new C9680(2, 3));
        descriptor = c7958;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C9893.f25703[0].getValue()};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        "decoder";
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C9893.f25703;
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else {
                if (iMo11277 != 0) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                list = (List) interfaceC8018Mo11235.mo11233(interfaceC8020, 0, (InterfaceC8013) interfaceC6016Arr[0].getValue(), list);
                i = 1;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9893(i, list);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9893 c9893 = (C9893) obj;
        "encoder";
        "value";
        c9893.getClass();
        List list = c9893.f25704;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C9893.f25703;
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(list, EmptyList.INSTANCE)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 0, (InterfaceC8013) interfaceC6016Arr[0].getValue(), list);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
