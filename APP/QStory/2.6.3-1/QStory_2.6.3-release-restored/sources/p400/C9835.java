package p400;

import kotlin.jvm.internal.AbstractC5227;
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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9835 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9835 f25631;

    static {
        C9835 c9835 = new C9835();
        f25631 = c9835;
        C7958 c7958 = new C7958("top.artmoe.inao.entries.QQMessage.MessageBody.RichMsg.MsgContent.MsgSender", c9835, 1);
        c7958.m12968("nickName", true);
        c7958.m12967(new C9680(1, 3));
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C7964.f19434};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        "decoder";
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        String strMo11245 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else {
                if (iMo11277 != 0) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                strMo11245 = interfaceC8018Mo11235.mo11245(interfaceC8020, 0);
                i = 1;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9837(i, strMo11245);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9837 c9837 = (C9837) obj;
        "encoder";
        "value";
        c9837.getClass();
        String str = c9837.f25632;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(str, "")) {
            interfaceC8017Mo11269.mo11294(interfaceC8020, 0, str);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
