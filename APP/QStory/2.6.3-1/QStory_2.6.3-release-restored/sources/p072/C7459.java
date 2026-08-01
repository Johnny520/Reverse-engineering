package p072;

import io.ktor.client.plugins.AbstractC4765;
import io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest$IncludeContext;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.List;
import kotlin.InterfaceC6016;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p103.C7912;
import p103.C7935;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7459 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7459 f18361;

    static {
        C7459 c7459 = new C7459();
        f18361 = c7459;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest", c7459, 10);
        c7958.m12968("messages", false);
        c7958.m12968("systemPrompt", false);
        c7958.m12968("includeContext", false);
        c7958.m12968("temperature", false);
        c7958.m12968("maxTokens", false);
        c7958.m12968("stopSequences", false);
        c7958.m12968("metadata", true);
        c7958.m12968("modelPreferences", false);
        c7958.m12968("_meta", true);
        c7958.m12968("method", true);
        descriptor = c7958;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        InterfaceC6016[] interfaceC6016Arr = C7448.f18341;
        C7979 c7979 = C7979.f19457;
        return new InterfaceC8013[]{interfaceC6016Arr[0].getValue(), AbstractC4765.m8872(C7964.f19434), AbstractC4765.m8872((InterfaceC8013) interfaceC6016Arr[2].getValue()), AbstractC4765.m8872(C7935.f19378), C7912.f19342, AbstractC4765.m8872((InterfaceC8013) interfaceC6016Arr[5].getValue()), c7979, AbstractC4765.m8872(C7646.f18601), c7979, C7621.f18577};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC6016[] interfaceC6016Arr;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr2 = C7448.f18341;
        interfaceC8018Mo11235.getClass();
        InterfaceC7645 interfaceC7645 = null;
        C7981 c7981 = null;
        boolean z = true;
        C7639 c7639 = null;
        int i = 0;
        List list = null;
        String str = null;
        CreateMessageRequest$IncludeContext createMessageRequest$IncludeContext = null;
        Double d = null;
        int iMo11230 = 0;
        List list2 = null;
        C7981 c79812 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            switch (iMo11277) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    interfaceC6016Arr = interfaceC6016Arr2;
                    list = (List) interfaceC8018Mo11235.mo11233(interfaceC8020, 0, (InterfaceC8013) interfaceC6016Arr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    interfaceC6016Arr = interfaceC6016Arr2;
                    str = (String) interfaceC8018Mo11235.mo11234(interfaceC8020, 1, C7964.f19434, str);
                    i |= 2;
                    break;
                case 2:
                    interfaceC6016Arr = interfaceC6016Arr2;
                    createMessageRequest$IncludeContext = (CreateMessageRequest$IncludeContext) interfaceC8018Mo11235.mo11234(interfaceC8020, 2, (InterfaceC8013) interfaceC6016Arr[2].getValue(), createMessageRequest$IncludeContext);
                    i |= 4;
                    break;
                case 3:
                    interfaceC6016Arr = interfaceC6016Arr2;
                    d = (Double) interfaceC8018Mo11235.mo11234(interfaceC8020, 3, C7935.f19378, d);
                    i |= 8;
                    break;
                case 4:
                    interfaceC6016Arr = interfaceC6016Arr2;
                    iMo11230 = interfaceC8018Mo11235.mo11230(interfaceC8020, 4);
                    i |= 16;
                    break;
                case 5:
                    interfaceC6016Arr = interfaceC6016Arr2;
                    list2 = (List) interfaceC8018Mo11235.mo11234(interfaceC8020, 5, (InterfaceC8013) interfaceC6016Arr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    interfaceC6016Arr = interfaceC6016Arr2;
                    c79812 = (C7981) interfaceC8018Mo11235.mo11233(interfaceC8020, 6, C7979.f19457, c79812);
                    i |= 64;
                    break;
                case 7:
                    interfaceC6016Arr = interfaceC6016Arr2;
                    c7639 = (C7639) interfaceC8018Mo11235.mo11234(interfaceC8020, 7, C7646.f18601, c7639);
                    i |= 128;
                    break;
                case 8:
                    interfaceC6016Arr = interfaceC6016Arr2;
                    c7981 = (C7981) interfaceC8018Mo11235.mo11233(interfaceC8020, 8, C7979.f19457, c7981);
                    i |= 256;
                    break;
                case 9:
                    interfaceC6016Arr = interfaceC6016Arr2;
                    interfaceC7645 = (InterfaceC7645) interfaceC8018Mo11235.mo11233(interfaceC8020, 9, C7621.f18577, interfaceC7645);
                    i |= 512;
                    break;
                default:
                    C8376.m13326(iMo11277);
                    return null;
            }
            interfaceC6016Arr2 = interfaceC6016Arr;
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7448(i, list, str, createMessageRequest$IncludeContext, d, iMo11230, list2, c79812, c7639, c7981, interfaceC7645);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7448 c7448 = (C7448) obj;
        c7448.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C7448.f18341;
        InterfaceC8013 interfaceC8013 = (InterfaceC8013) interfaceC6016Arr[0].getValue();
        List list = c7448.f18347;
        InterfaceC7645 interfaceC7645 = c7448.f18351;
        C7981 c7981 = c7448.f18350;
        C7981 c79812 = c7448.f18349;
        interfaceC8017Mo11269.mo11278(interfaceC8020, 0, interfaceC8013, list);
        interfaceC8017Mo11269.mo11274(interfaceC8020, 1, C7964.f19434, c7448.f18346);
        interfaceC8017Mo11269.mo11274(interfaceC8020, 2, (InterfaceC8013) interfaceC6016Arr[2].getValue(), c7448.f18345);
        interfaceC8017Mo11269.mo11274(interfaceC8020, 3, C7935.f19378, c7448.f18344);
        interfaceC8017Mo11269.mo11288(4, c7448.f18343, interfaceC8020);
        interfaceC8017Mo11269.mo11274(interfaceC8020, 5, (InterfaceC8013) interfaceC6016Arr[5].getValue(), c7448.f18342);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(c79812, AbstractC7431.f18321)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 6, C7979.f19457, c79812);
        }
        interfaceC8017Mo11269.mo11274(interfaceC8020, 7, C7646.f18601, c7448.f18348);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(c7981, AbstractC7431.f18321)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 8, C7979.f19457, c7981);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || interfaceC7645 != Method$Defined.SamplingCreateMessage) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 9, C7621.f18577, interfaceC7645);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
