package p072;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.InterfaceC6016;
import p103.AbstractC7973;
import p103.C7958;
import p103.InterfaceC7908;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰世子苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7587 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7587 f18535;

    static {
        C7587 c7587 = new C7587();
        f18535 = c7587;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.SamplingMessage", c7587, 2);
        c7958.m12968("role", false);
        c7958.m12968("content", false);
        descriptor = c7958;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C7589.f18537[0].getValue(), C7675.f18629};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C7589.f18537;
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        Role role = null;
        InterfaceC7561 interfaceC7561 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                role = (Role) interfaceC8018Mo11235.mo11233(interfaceC8020, 0, (InterfaceC8013) interfaceC6016Arr[0].getValue(), role);
                i |= 1;
            } else {
                if (iMo11277 != 1) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                interfaceC7561 = (InterfaceC7561) interfaceC8018Mo11235.mo11233(interfaceC8020, 1, C7675.f18629, interfaceC7561);
                i |= 2;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7589(i, role, interfaceC7561);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7589 c7589 = (C7589) obj;
        c7589.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        interfaceC8017Mo11269.mo11278(interfaceC8020, 0, (InterfaceC8013) C7589.f18537[0].getValue(), c7589.f18539);
        interfaceC8017Mo11269.mo11278(interfaceC8020, 1, C7675.f18629, c7589.f18538);
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
