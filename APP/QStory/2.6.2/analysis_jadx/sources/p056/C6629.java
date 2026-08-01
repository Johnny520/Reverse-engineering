package p056;

import io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest$IncludeContext;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.List;
import kotlin.InterfaceC5183;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p087.C7082;
import p087.C7105;
import p087.C7128;
import p087.C7134;
import p087.InterfaceC7078;
import p088.C7149;
import p088.C7151;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;
import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6629 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6629 f18021;

    static {
        C6629 c6629 = new C6629();
        f18021 = c6629;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest", c6629, 10);
        c7128.m12382("messages", false);
        c7128.m12382("systemPrompt", false);
        c7128.m12382("includeContext", false);
        c7128.m12382("temperature", false);
        c7128.m12382("maxTokens", false);
        c7128.m12382("stopSequences", false);
        c7128.m12382("metadata", true);
        c7128.m12382("modelPreferences", false);
        c7128.m12382("_meta", true);
        c7128.m12382("method", true);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        InterfaceC5183[] interfaceC5183Arr = C6618.f18001;
        C7149 c7149 = C7149.f19117;
        return new InterfaceC7183[]{interfaceC5183Arr[0].getValue(), C8675.m14355(C7134.f19094), C8675.m14355((InterfaceC7183) interfaceC5183Arr[2].getValue()), C8675.m14355(C7105.f19038), C7082.f19002, C8675.m14355((InterfaceC7183) interfaceC5183Arr[5].getValue()), c7149, C8675.m14355(C6816.f18261), c7149, C6791.f18237};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC5183[] interfaceC5183Arr;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr2 = C6618.f18001;
        interfaceC7188Mo6876.getClass();
        InterfaceC6815 interfaceC6815 = null;
        C7151 c7151 = null;
        boolean z = true;
        C6809 c6809 = null;
        int i = 0;
        List list = null;
        String str = null;
        CreateMessageRequest$IncludeContext createMessageRequest$IncludeContext = null;
        Double d = null;
        int iMo6872 = 0;
        List list2 = null;
        C7151 c71512 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            switch (iMo10672) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    interfaceC5183Arr = interfaceC5183Arr2;
                    list = (List) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    interfaceC5183Arr = interfaceC5183Arr2;
                    str = (String) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, C7134.f19094, str);
                    i |= 2;
                    break;
                case 2:
                    interfaceC5183Arr = interfaceC5183Arr2;
                    createMessageRequest$IncludeContext = (CreateMessageRequest$IncludeContext) interfaceC7188Mo6876.mo6875(interfaceC7190, 2, (InterfaceC7183) interfaceC5183Arr[2].getValue(), createMessageRequest$IncludeContext);
                    i |= 4;
                    break;
                case 3:
                    interfaceC5183Arr = interfaceC5183Arr2;
                    d = (Double) interfaceC7188Mo6876.mo6875(interfaceC7190, 3, C7105.f19038, d);
                    i |= 8;
                    break;
                case 4:
                    interfaceC5183Arr = interfaceC5183Arr2;
                    iMo6872 = interfaceC7188Mo6876.mo6872(interfaceC7190, 4);
                    i |= 16;
                    break;
                case 5:
                    interfaceC5183Arr = interfaceC5183Arr2;
                    list2 = (List) interfaceC7188Mo6876.mo6875(interfaceC7190, 5, (InterfaceC7183) interfaceC5183Arr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    interfaceC5183Arr = interfaceC5183Arr2;
                    c71512 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 6, C7149.f19117, c71512);
                    i |= 64;
                    break;
                case 7:
                    interfaceC5183Arr = interfaceC5183Arr2;
                    c6809 = (C6809) interfaceC7188Mo6876.mo6875(interfaceC7190, 7, C6816.f18261, c6809);
                    i |= 128;
                    break;
                case 8:
                    interfaceC5183Arr = interfaceC5183Arr2;
                    c7151 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 8, C7149.f19117, c7151);
                    i |= 256;
                    break;
                case 9:
                    interfaceC5183Arr = interfaceC5183Arr2;
                    interfaceC6815 = (InterfaceC6815) interfaceC7188Mo6876.mo6874(interfaceC7190, 9, C6791.f18237, interfaceC6815);
                    i |= 512;
                    break;
                default:
                    C7546.m12738(iMo10672);
                    return null;
            }
            interfaceC5183Arr2 = interfaceC5183Arr;
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6618(i, list, str, createMessageRequest$IncludeContext, d, iMo6872, list2, c71512, c6809, c7151, interfaceC6815);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6618 c6618 = (C6618) obj;
        c6618.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6618.f18001;
        InterfaceC7183 interfaceC7183 = (InterfaceC7183) interfaceC5183Arr[0].getValue();
        List list = c6618.f18007;
        InterfaceC6815 interfaceC6815 = c6618.f18011;
        C7151 c7151 = c6618.f18010;
        C7151 c71512 = c6618.f18009;
        interfaceC7187Mo6800.mo6791(interfaceC7190, 0, interfaceC7183, list);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 1, C7134.f19094, c6618.f18006);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 2, (InterfaceC7183) interfaceC5183Arr[2].getValue(), c6618.f18005);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 3, C7105.f19038, c6618.f18004);
        interfaceC7187Mo6800.mo6805(4, c6618.f18003, interfaceC7190);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 5, (InterfaceC7183) interfaceC5183Arr[5].getValue(), c6618.f18002);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c71512, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 6, C7149.f19117, c71512);
        }
        interfaceC7187Mo6800.mo6807(interfaceC7190, 7, C6816.f18261, c6618.f18008);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c7151, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 8, C7149.f19117, c7151);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || interfaceC6815 != Method$Defined.SamplingCreateMessage) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 9, C6791.f18237, interfaceC6815);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
