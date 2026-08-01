package p072;

import io.ktor.client.plugins.AbstractC4765;
import p103.AbstractC7973;
import p103.C7929;
import p103.C7958;
import p103.InterfaceC7908;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰苏世子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7603 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7603 f18555;

    static {
        C7603 c7603 = new C7603();
        f18555 = c7603;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.ServerCapabilities.Resources", c7603, 2);
        c7958.m12968("subscribe", false);
        c7958.m12968("listChanged", false);
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        C7929 c7929 = C7929.f19370;
        return new InterfaceC8013[]{AbstractC4765.m8872(c7929), AbstractC4765.m8872(c7929)};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                bool = (Boolean) interfaceC8018Mo11235.mo11234(interfaceC8020, 0, C7929.f19370, bool);
                i |= 1;
            } else {
                if (iMo11277 != 1) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                bool2 = (Boolean) interfaceC8018Mo11235.mo11234(interfaceC8020, 1, C7929.f19370, bool2);
                i |= 2;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7605(i, bool, bool2);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7605 c7605 = (C7605) obj;
        c7605.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        C7929 c7929 = C7929.f19370;
        interfaceC8017Mo11269.mo11274(interfaceC8020, 0, c7929, c7605.f18558);
        interfaceC8017Mo11269.mo11274(interfaceC8020, 1, c7929, c7605.f18557);
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
