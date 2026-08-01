package p365;

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

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪兰世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9676 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9676 f25291;

    static {
        C9676 c9676 = new C9676();
        f25291 = c9676;
        C7958 c7958 = new C7958("top.suzhelan.qstory.hook.service.proto.TroopReplyEmoji", c9676, 6);
        c7958.m12968("troopUin", false);
        c7958.m12967(new C9680(2, 1));
        c7958.m12968("msgSeq", false);
        c7958.m12967(new C9680(3, 1));
        c7958.m12968("emojiId", false);
        c7958.m12967(new C9680(4, 1));
        c7958.m12968("type", false);
        c7958.m12967(new C9680(5, 1));
        c7958.m12968("p6", false);
        c7958.m12967(new C9680(6, 1));
        c7958.m12968("p7", false);
        c7958.m12967(new C9680(7, 1));
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        C7901 c7901 = C7901.f19321;
        C7912 c7912 = C7912.f19342;
        return new InterfaceC8013[]{c7901, c7901, C7964.f19434, c7912, c7912, c7912};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        "decoder";
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        int i = 0;
        int iMo11230 = 0;
        int iMo112302 = 0;
        int iMo112303 = 0;
        long jMo11258 = 0;
        long jMo112582 = 0;
        String strMo11245 = null;
        boolean z = true;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            switch (iMo11277) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jMo11258 = interfaceC8018Mo11235.mo11258(interfaceC8020, 0);
                    i |= 1;
                    break;
                case 1:
                    jMo112582 = interfaceC8018Mo11235.mo11258(interfaceC8020, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo11245 = interfaceC8018Mo11235.mo11245(interfaceC8020, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo11230 = interfaceC8018Mo11235.mo11230(interfaceC8020, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo112302 = interfaceC8018Mo11235.mo11230(interfaceC8020, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo112303 = interfaceC8018Mo11235.mo11230(interfaceC8020, 5);
                    i |= 32;
                    break;
                default:
                    C8376.m13326(iMo11277);
                    return null;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9681(i, jMo11258, jMo112582, strMo11245, iMo11230, iMo112302, iMo112303);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9681 c9681 = (C9681) obj;
        "encoder";
        "value";
        c9681.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        interfaceC8017Mo11269.mo11281(interfaceC8020, 0, c9681.f25305);
        interfaceC8017Mo11269.mo11281(interfaceC8020, 1, c9681.f25304);
        interfaceC8017Mo11269.mo11294(interfaceC8020, 2, c9681.f25303);
        interfaceC8017Mo11269.mo11288(3, c9681.f25302, interfaceC8020);
        interfaceC8017Mo11269.mo11288(4, c9681.f25301, interfaceC8020);
        interfaceC8017Mo11269.mo11288(5, c9681.f25300, interfaceC8020);
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
