package p056;

import io.ktor.client.plugins.AbstractC3933;
import io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest$IncludeContext;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.List;
import kotlin.InterfaceC5184;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p087.C7083;
import p087.C7106;
import p087.C7129;
import p087.C7135;
import p087.InterfaceC7079;
import p088.C7150;
import p088.C7152;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6630 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6630 f18016;

    static {
        C6630 c6630 = new C6630();
        f18016 = c6630;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest", c6630, 10);
        c7129.m12409("messages", false);
        c7129.m12409("systemPrompt", false);
        c7129.m12409("includeContext", false);
        c7129.m12409("temperature", false);
        c7129.m12409("maxTokens", false);
        c7129.m12409("stopSequences", false);
        c7129.m12409("metadata", true);
        c7129.m12409("modelPreferences", false);
        c7129.m12409("_meta", true);
        c7129.m12409("method", true);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        InterfaceC5184[] interfaceC5184Arr = C6619.f17996;
        C7150 c7150 = C7150.f19112;
        return new InterfaceC7184[]{interfaceC5184Arr[0].getValue(), AbstractC3933.m8313(C7135.f19089), AbstractC3933.m8313((InterfaceC7184) interfaceC5184Arr[2].getValue()), AbstractC3933.m8313(C7106.f19033), C7083.f18997, AbstractC3933.m8313((InterfaceC7184) interfaceC5184Arr[5].getValue()), c7150, AbstractC3933.m8313(C6817.f18256), c7150, C6792.f18232};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC5184[] interfaceC5184Arr;
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr2 = C6619.f17996;
        interfaceC7189Mo10676.getClass();
        InterfaceC6816 interfaceC6816 = null;
        C7152 c7152 = null;
        boolean z = true;
        C6810 c6810 = null;
        int i = 0;
        List list = null;
        String str = null;
        CreateMessageRequest$IncludeContext createMessageRequest$IncludeContext = null;
        Double d = null;
        int iMo10671 = 0;
        List list2 = null;
        C7152 c71522 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            switch (iMo10718) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    interfaceC5184Arr = interfaceC5184Arr2;
                    list = (List) interfaceC7189Mo10676.mo10674(interfaceC7191, 0, (InterfaceC7184) interfaceC5184Arr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    interfaceC5184Arr = interfaceC5184Arr2;
                    str = (String) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, C7135.f19089, str);
                    i |= 2;
                    break;
                case 2:
                    interfaceC5184Arr = interfaceC5184Arr2;
                    createMessageRequest$IncludeContext = (CreateMessageRequest$IncludeContext) interfaceC7189Mo10676.mo10675(interfaceC7191, 2, (InterfaceC7184) interfaceC5184Arr[2].getValue(), createMessageRequest$IncludeContext);
                    i |= 4;
                    break;
                case 3:
                    interfaceC5184Arr = interfaceC5184Arr2;
                    d = (Double) interfaceC7189Mo10676.mo10675(interfaceC7191, 3, C7106.f19033, d);
                    i |= 8;
                    break;
                case 4:
                    interfaceC5184Arr = interfaceC5184Arr2;
                    iMo10671 = interfaceC7189Mo10676.mo10671(interfaceC7191, 4);
                    i |= 16;
                    break;
                case 5:
                    interfaceC5184Arr = interfaceC5184Arr2;
                    list2 = (List) interfaceC7189Mo10676.mo10675(interfaceC7191, 5, (InterfaceC7184) interfaceC5184Arr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    interfaceC5184Arr = interfaceC5184Arr2;
                    c71522 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 6, C7150.f19112, c71522);
                    i |= 64;
                    break;
                case 7:
                    interfaceC5184Arr = interfaceC5184Arr2;
                    c6810 = (C6810) interfaceC7189Mo10676.mo10675(interfaceC7191, 7, C6817.f18256, c6810);
                    i |= 128;
                    break;
                case 8:
                    interfaceC5184Arr = interfaceC5184Arr2;
                    c7152 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 8, C7150.f19112, c7152);
                    i |= 256;
                    break;
                case 9:
                    interfaceC5184Arr = interfaceC5184Arr2;
                    interfaceC6816 = (InterfaceC6816) interfaceC7189Mo10676.mo10674(interfaceC7191, 9, C6792.f18232, interfaceC6816);
                    i |= 512;
                    break;
                default:
                    C7547.m12767(iMo10718);
                    return null;
            }
            interfaceC5184Arr2 = interfaceC5184Arr;
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6619(i, list, str, createMessageRequest$IncludeContext, d, iMo10671, list2, c71522, c6810, c7152, interfaceC6816);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6619 c6619 = (C6619) obj;
        c6619.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6619.f17996;
        InterfaceC7184 interfaceC7184 = (InterfaceC7184) interfaceC5184Arr[0].getValue();
        List list = c6619.f18002;
        InterfaceC6816 interfaceC6816 = c6619.f18006;
        C7152 c7152 = c6619.f18005;
        C7152 c71522 = c6619.f18004;
        interfaceC7188Mo10710.mo10719(interfaceC7191, 0, interfaceC7184, list);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 1, C7135.f19089, c6619.f18001);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 2, (InterfaceC7184) interfaceC5184Arr[2].getValue(), c6619.f18000);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 3, C7106.f19033, c6619.f17999);
        interfaceC7188Mo10710.mo10729(4, c6619.f17998, interfaceC7191);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 5, (InterfaceC7184) interfaceC5184Arr[5].getValue(), c6619.f17997);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c71522, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 6, C7150.f19112, c71522);
        }
        interfaceC7188Mo10710.mo10715(interfaceC7191, 7, C6817.f18256, c6619.f18003);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 8, C7150.f19112, c7152);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || interfaceC6816 != Method$Defined.SamplingCreateMessage) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 9, C6792.f18232, interfaceC6816);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
