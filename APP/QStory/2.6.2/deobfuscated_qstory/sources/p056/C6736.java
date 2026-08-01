package p056;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.InterfaceC5183;
import p087.AbstractC7143;
import p087.C7128;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世哲兰子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6736 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6736 f18169;

    static {
        C6736 c6736 = new C6736();
        f18169 = c6736;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.PromptMessage", c6736, 2);
        c7128.m12382("role", false);
        c7128.m12382("content", false);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C6733.f18165[0].getValue(), C6734.f18168};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6733.f18165;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        Role role = null;
        InterfaceC6735 interfaceC6735 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                role = (Role) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), role);
                i |= 1;
            } else {
                if (iMo10672 != 1) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                interfaceC6735 = (InterfaceC6735) interfaceC7188Mo6876.mo6874(interfaceC7190, 1, C6734.f18168, interfaceC6735);
                i |= 2;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6733(i, role, interfaceC6735);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6733 c6733 = (C6733) obj;
        c6733.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        interfaceC7187Mo6800.mo6791(interfaceC7190, 0, (InterfaceC7183) C6733.f18165[0].getValue(), c6733.f18167);
        interfaceC7187Mo6800.mo6791(interfaceC7190, 1, C6734.f18168, c6733.f18166);
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
