package p072;

import io.ktor.client.plugins.AbstractC4765;
import kotlin.InterfaceC6016;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7506 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7506 f18424;

    static {
        C7506 c7506 = new C7506();
        f18424 = c7506;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.JSONRPCResponse", c7506, 4);
        c7958.m12968("id", false);
        c7958.m12968("jsonrpc", true);
        c7958.m12968("result", true);
        c7958.m12968("error", true);
        descriptor = c7958;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C7508.f18430[0].getValue(), C7964.f19434, AbstractC4765.m8872(C7622.f18578), AbstractC4765.m8872(C7505.f18423)};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C7508.f18430;
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC7665 interfaceC7665 = null;
        String strMo11245 = null;
        InterfaceC7625 interfaceC7625 = null;
        C7503 c7503 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                interfaceC7665 = (InterfaceC7665) interfaceC8018Mo11235.mo11233(interfaceC8020, 0, (InterfaceC8013) interfaceC6016Arr[0].getValue(), interfaceC7665);
                i |= 1;
            } else if (iMo11277 == 1) {
                strMo11245 = interfaceC8018Mo11235.mo11245(interfaceC8020, 1);
                i |= 2;
            } else if (iMo11277 == 2) {
                interfaceC7625 = (InterfaceC7625) interfaceC8018Mo11235.mo11234(interfaceC8020, 2, C7622.f18578, interfaceC7625);
                i |= 4;
            } else {
                if (iMo11277 != 3) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                c7503 = (C7503) interfaceC8018Mo11235.mo11234(interfaceC8020, 3, C7505.f18423, c7503);
                i |= 8;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7508(i, interfaceC7665, strMo11245, interfaceC7625, c7503);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7508 c7508 = (C7508) obj;
        c7508.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC8013 interfaceC8013 = (InterfaceC8013) C7508.f18430[0].getValue();
        InterfaceC7665 interfaceC7665 = c7508.f18434;
        C7503 c7503 = c7508.f18431;
        InterfaceC7625 interfaceC7625 = c7508.f18432;
        String str = c7508.f18433;
        interfaceC8017Mo11269.mo11278(interfaceC8020, 0, interfaceC8013, interfaceC7665);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(str, "2.0")) {
            interfaceC8017Mo11269.mo11294(interfaceC8020, 1, str);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || interfaceC7625 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 2, C7622.f18578, interfaceC7625);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || c7503 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 3, C7505.f18423, c7503);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
