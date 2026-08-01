package p072;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p103.C7958;
import p103.C7964;
import p103.InterfaceC7908;
import p104.C7979;
import p104.C7981;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7542 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7542 f18481;

    static {
        C7542 c7542 = new C7542();
        f18481 = c7542;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.InitializeResult", c7542, 4);
        c7958.m12968("protocolVersion", true);
        c7958.m12968("capabilities", true);
        c7958.m12968("serverInfo", false);
        c7958.m12968("_meta", true);
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C7964.f19434, C7588.f18536, C7548.f18492, C7979.f19457};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        String strMo11245 = null;
        C7590 c7590 = null;
        C7550 c7550 = null;
        C7981 c7981 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                strMo11245 = interfaceC8018Mo11235.mo11245(interfaceC8020, 0);
                i |= 1;
            } else if (iMo11277 == 1) {
                c7590 = (C7590) interfaceC8018Mo11235.mo11233(interfaceC8020, 1, C7588.f18536, c7590);
                i |= 2;
            } else if (iMo11277 == 2) {
                c7550 = (C7550) interfaceC8018Mo11235.mo11233(interfaceC8020, 2, C7548.f18492, c7550);
                i |= 4;
            } else {
                if (iMo11277 != 3) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                c7981 = (C7981) interfaceC8018Mo11235.mo11233(interfaceC8020, 3, C7979.f19457, c7981);
                i |= 8;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7544(i, strMo11245, c7590, c7550, c7981);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7544 c7544 = (C7544) obj;
        c7544.getClass();
        C7590 c7590 = c7544.f18489;
        String str = c7544.f18490;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(str, "2024-11-05")) {
            interfaceC8017Mo11269.mo11294(interfaceC8020, 0, str);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(c7590, new C7590(null, null, null, 63))) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 1, C7588.f18536, c7590);
        }
        C7548 c7548 = C7548.f18492;
        C7550 c7550 = c7544.f18488;
        C7981 c7981 = c7544.f18487;
        interfaceC8017Mo11269.mo11278(interfaceC8020, 2, c7548, c7550);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(c7981, AbstractC7431.f18321)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 3, C7979.f19457, c7981);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
