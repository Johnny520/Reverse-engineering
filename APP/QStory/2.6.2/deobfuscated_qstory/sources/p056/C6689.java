package p056;

import java.util.List;
import kotlin.InterfaceC5183;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p087.C7099;
import p087.C7128;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6689 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6689 f18105;

    static {
        C6689 c6689 = new C6689();
        f18105 = c6689;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.CompatibilityCallToolResult", c6689, 4);
        c7128.m12382("content", false);
        c7128.m12382("isError", true);
        c7128.m12382("_meta", true);
        c7128.m12382("toolResult", true);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7149 c7149 = C7149.f19117;
        return new InterfaceC7183[]{C6692.f18107[0].getValue(), C8675.m14355(C7099.f19030), c7149, c7149};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6692.f18107;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Boolean bool = null;
        C7151 c7151 = null;
        C7151 c71512 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                list = (List) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo10672 == 1) {
                bool = (Boolean) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, C7099.f19030, bool);
                i |= 2;
            } else if (iMo10672 == 2) {
                c7151 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 2, C7149.f19117, c7151);
                i |= 4;
            } else {
                if (iMo10672 != 3) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                c71512 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 3, C7149.f19117, c71512);
                i |= 8;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6692(i, list, bool, c7151, c71512);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6692 c6692 = (C6692) obj;
        c6692.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC7183 interfaceC7183 = (InterfaceC7183) C6692.f18107[0].getValue();
        List list = c6692.f18111;
        C7151 c7151 = c6692.f18108;
        C7151 c71512 = c6692.f18109;
        Boolean bool = c6692.f18110;
        interfaceC7187Mo6800.mo6791(interfaceC7190, 0, interfaceC7183, list);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(bool, Boolean.FALSE)) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 1, C7099.f19030, bool);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c71512, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 2, C7149.f19117, c71512);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c7151, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 3, C7149.f19117, c7151);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
