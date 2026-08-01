package p072;

import io.ktor.client.plugins.AbstractC4765;
import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.InterfaceC6016;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7451 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7451 f18352;

    static {
        C7451 c7451 = new C7451();
        f18352 = c7451;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.CreateMessageResult", c7451, 5);
        c7958.m12968("model", false);
        c7958.m12968("stopReason", true);
        c7958.m12968("role", false);
        c7958.m12968("content", false);
        c7958.m12968("_meta", true);
        descriptor = c7958;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C7964.f19434, AbstractC4765.m8872(C7410.f18301), C7446.f18334[2].getValue(), C7675.f18629, C7979.f19457};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C7446.f18334;
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        String strMo11245 = null;
        InterfaceC7411 interfaceC7411 = null;
        Role role = null;
        InterfaceC7561 interfaceC7561 = null;
        C7981 c7981 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                strMo11245 = interfaceC8018Mo11235.mo11245(interfaceC8020, 0);
                i |= 1;
            } else if (iMo11277 == 1) {
                interfaceC7411 = (InterfaceC7411) interfaceC8018Mo11235.mo11234(interfaceC8020, 1, C7410.f18301, interfaceC7411);
                i |= 2;
            } else if (iMo11277 == 2) {
                role = (Role) interfaceC8018Mo11235.mo11233(interfaceC8020, 2, (InterfaceC8013) interfaceC6016Arr[2].getValue(), role);
                i |= 4;
            } else if (iMo11277 == 3) {
                interfaceC7561 = (InterfaceC7561) interfaceC8018Mo11235.mo11233(interfaceC8020, 3, C7675.f18629, interfaceC7561);
                i |= 8;
            } else {
                if (iMo11277 != 4) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                c7981 = (C7981) interfaceC8018Mo11235.mo11233(interfaceC8020, 4, C7979.f19457, c7981);
                i |= 16;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7446(i, strMo11245, interfaceC7411, role, interfaceC7561, c7981);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7446 c7446 = (C7446) obj;
        c7446.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C7446.f18334;
        String str = c7446.f18339;
        C7981 c7981 = c7446.f18335;
        InterfaceC7411 interfaceC7411 = c7446.f18338;
        interfaceC8017Mo11269.mo11294(interfaceC8020, 0, str);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || interfaceC7411 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 1, C7410.f18301, interfaceC7411);
        }
        interfaceC8017Mo11269.mo11278(interfaceC8020, 2, (InterfaceC8013) interfaceC6016Arr[2].getValue(), c7446.f18337);
        interfaceC8017Mo11269.mo11278(interfaceC8020, 3, C7675.f18629, c7446.f18336);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(c7981, AbstractC7431.f18321)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 4, C7979.f19457, c7981);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
