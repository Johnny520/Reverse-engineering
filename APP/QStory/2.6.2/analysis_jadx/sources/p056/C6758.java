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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰世苏哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6758 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6758 f18196;

    static {
        C6758 c6758 = new C6758();
        f18196 = c6758;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.ServerCapabilities", c6758, 6);
        c7128.m12382("experimental", true);
        c7128.m12382("sampling", true);
        c7128.m12382("logging", true);
        c7128.m12382("prompts", true);
        c7128.m12382("resources", true);
        c7128.m12382("tools", true);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7149 c7149 = C7149.f19117;
        return new InterfaceC7183[]{C8675.m14355(c7149), C8675.m14355(c7149), C8675.m14355(c7149), C8675.m14355(C6755.f18194), C8675.m14355(C6773.f18215), C8675.m14355(C6774.f18216)};
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
        C7151 c71513 = null;
        C6777 c6777 = null;
        C6775 c6775 = null;
        C6763 c6763 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            switch (iMo10672) {
                case -1:
                    z = false;
                    break;
                case 0:
                    c7151 = (C7151) interfaceC7188Mo6876.mo6875(interfaceC7190, 0, C7149.f19117, c7151);
                    i |= 1;
                    break;
                case 1:
                    c71512 = (C7151) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, C7149.f19117, c71512);
                    i |= 2;
                    break;
                case 2:
                    c71513 = (C7151) interfaceC7188Mo6876.mo6875(interfaceC7190, 2, C7149.f19117, c71513);
                    i |= 4;
                    break;
                case 3:
                    c6777 = (C6777) interfaceC7188Mo6876.mo6875(interfaceC7190, 3, C6755.f18194, c6777);
                    i |= 8;
                    break;
                case 4:
                    c6775 = (C6775) interfaceC7188Mo6876.mo6875(interfaceC7190, 4, C6773.f18215, c6775);
                    i |= 16;
                    break;
                case 5:
                    c6763 = (C6763) interfaceC7188Mo6876.mo6875(interfaceC7190, 5, C6774.f18216, c6763);
                    i |= 32;
                    break;
                default:
                    C7546.m12738(iMo10672);
                    return null;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6760(i, c7151, c71512, c71513, c6777, c6775, c6763);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6760 c6760 = (C6760) obj;
        c6760.getClass();
        C6763 c6763 = c6760.f18200;
        C6775 c6775 = c6760.f18201;
        C6777 c6777 = c6760.f18202;
        C7151 c7151 = c6760.f18203;
        C7151 c71512 = c6760.f18204;
        C7151 c71513 = c6760.f18205;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c71513, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 0, C7149.f19117, c71513);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c71512, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 1, C7149.f19117, c71512);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c7151, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 2, C7149.f19117, c7151);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c6777 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 3, C6755.f18194, c6777);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c6775 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 4, C6773.f18215, c6775);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c6763 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 5, C6774.f18216, c6763);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
