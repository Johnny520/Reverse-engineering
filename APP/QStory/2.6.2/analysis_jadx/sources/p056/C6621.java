package p056;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.InterfaceC5183;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6621 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6621 f18012;

    static {
        C6621 c6621 = new C6621();
        f18012 = c6621;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.CreateMessageResult", c6621, 5);
        c7128.m12382("model", false);
        c7128.m12382("stopReason", true);
        c7128.m12382("role", false);
        c7128.m12382("content", false);
        c7128.m12382("_meta", true);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C7134.f19094, C8675.m14355(C6580.f17961), C6616.f17994[2].getValue(), C6845.f18289, C7149.f19117};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6616.f17994;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        String strMo6878 = null;
        InterfaceC6581 interfaceC6581 = null;
        Role role = null;
        InterfaceC6731 interfaceC6731 = null;
        C7151 c7151 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 0);
                i |= 1;
            } else if (iMo10672 == 1) {
                interfaceC6581 = (InterfaceC6581) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, C6580.f17961, interfaceC6581);
                i |= 2;
            } else if (iMo10672 == 2) {
                role = (Role) interfaceC7188Mo6876.mo6874(interfaceC7190, 2, (InterfaceC7183) interfaceC5183Arr[2].getValue(), role);
                i |= 4;
            } else if (iMo10672 == 3) {
                interfaceC6731 = (InterfaceC6731) interfaceC7188Mo6876.mo6874(interfaceC7190, 3, C6845.f18289, interfaceC6731);
                i |= 8;
            } else {
                if (iMo10672 != 4) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                c7151 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 4, C7149.f19117, c7151);
                i |= 16;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6616(i, strMo6878, interfaceC6581, role, interfaceC6731, c7151);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6616 c6616 = (C6616) obj;
        c6616.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6616.f17994;
        String str = c6616.f17999;
        C7151 c7151 = c6616.f17995;
        InterfaceC6581 interfaceC6581 = c6616.f17998;
        interfaceC7187Mo6800.mo6814(interfaceC7190, 0, str);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || interfaceC6581 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 1, C6580.f17961, interfaceC6581);
        }
        interfaceC7187Mo6800.mo6791(interfaceC7190, 2, (InterfaceC7183) interfaceC5183Arr[2].getValue(), c6616.f17997);
        interfaceC7187Mo6800.mo6791(interfaceC7190, 3, C6845.f18289, c6616.f17996);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c7151, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 4, C7149.f19117, c7151);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
