package p056;

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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6675 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6675 f18083;

    static {
        C6675 c6675 = new C6675();
        f18083 = c6675;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.JSONRPCError", c6675, 3);
        c7128.m12382("code", false);
        c7128.m12382("message", false);
        c7128.m12382("data", true);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C6727.f18161, C7134.f19094, C7149.f19117};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC6726 interfaceC6726 = null;
        String strMo6878 = null;
        C7151 c7151 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                interfaceC6726 = (InterfaceC6726) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, C6727.f18161, interfaceC6726);
                i |= 1;
            } else if (iMo10672 == 1) {
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 1);
                i |= 2;
            } else {
                if (iMo10672 != 2) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                c7151 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 2, C7149.f19117, c7151);
                i |= 4;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6673(i, interfaceC6726, strMo6878, c7151);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6673 c6673 = (C6673) obj;
        c6673.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        C6727 c6727 = C6727.f18161;
        InterfaceC6726 interfaceC6726 = c6673.f18081;
        C7151 c7151 = c6673.f18079;
        interfaceC7187Mo6800.mo6791(interfaceC7190, 0, c6727, interfaceC6726);
        interfaceC7187Mo6800.mo6814(interfaceC7190, 1, c6673.f18080);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c7151, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 2, C7149.f19117, c7151);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
