package p072;

import io.ktor.client.plugins.AbstractC4765;
import java.util.List;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7471 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7471 f18381;

    static {
        C7471 c7471 = new C7471();
        f18381 = c7471;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.ListToolsResult", c7471, 3);
        c7958.m12968("tools", false);
        c7958.m12968("nextCursor", false);
        c7958.m12968("_meta", true);
        descriptor = c7958;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C7474.f18383[0].getValue(), AbstractC4765.m8872(C7964.f19434), C7979.f19457};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C7474.f18383;
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        C7981 c7981 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                list = (List) interfaceC8018Mo11235.mo11233(interfaceC8020, 0, (InterfaceC8013) interfaceC6016Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo11277 == 1) {
                str = (String) interfaceC8018Mo11235.mo11234(interfaceC8020, 1, C7964.f19434, str);
                i |= 2;
            } else {
                if (iMo11277 != 2) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                c7981 = (C7981) interfaceC8018Mo11235.mo11233(interfaceC8020, 2, C7979.f19457, c7981);
                i |= 4;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7474(i, str, list, c7981);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7474 c7474 = (C7474) obj;
        c7474.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC8013 interfaceC8013 = (InterfaceC8013) C7474.f18383[0].getValue();
        List list = c7474.f18386;
        C7981 c7981 = c7474.f18384;
        interfaceC8017Mo11269.mo11278(interfaceC8020, 0, interfaceC8013, list);
        interfaceC8017Mo11269.mo11274(interfaceC8020, 1, C7964.f19434, c7474.f18385);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(c7981, AbstractC7431.f18321)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 2, C7979.f19457, c7981);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
