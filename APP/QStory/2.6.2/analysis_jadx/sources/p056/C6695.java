package p056;

import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6695 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6695 f18113;

    static {
        C6695 c6695 = new C6695();
        f18113 = c6695;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.ClientCapabilities", c6695, 3);
        c7128.m12382("experimental", true);
        c7128.m12382("sampling", true);
        c7128.m12382("roots", true);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7149 c7149 = C7149.f19117;
        return new InterfaceC7183[]{C8675.m14355(c7149), C8675.m14355(c7149), C8675.m14355(C6698.f18118)};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        C7151 c7151 = null;
        C7151 c71512 = null;
        C6696 c6696 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                c7151 = (C7151) interfaceC7188Mo6876.mo6875(interfaceC7190, 0, C7149.f19117, c7151);
                i |= 1;
            } else if (iMo10672 == 1) {
                c71512 = (C7151) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, C7149.f19117, c71512);
                i |= 2;
            } else {
                if (iMo10672 != 2) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                c6696 = (C6696) interfaceC7188Mo6876.mo6875(interfaceC7190, 2, C6698.f18118, c6696);
                i |= 4;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6697(i, c7151, c71512, c6696);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6697 c6697 = (C6697) obj;
        c6697.getClass();
        C6696 c6696 = c6697.f18115;
        C7151 c7151 = c6697.f18116;
        C7151 c71512 = c6697.f18117;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c71512, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 0, C7149.f19117, c71512);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c7151, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 1, C7149.f19117, c7151);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c6696 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 2, C6698.f18118, c6696);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
