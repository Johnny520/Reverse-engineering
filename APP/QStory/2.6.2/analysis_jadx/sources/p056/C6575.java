package p056;

import java.util.List;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6575 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6575 f17954;

    static {
        C6575 c6575 = new C6575();
        f17954 = c6575;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.Tool.Input", c6575, 3);
        c7128.m12382("properties", true);
        c7128.m12382("required", true);
        c7128.m12382("type", true);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C7149.f19117, C8675.m14355((InterfaceC7183) C6570.f17946[1].getValue()), C7134.f19094};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6570.f17946;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        C7151 c7151 = null;
        List list = null;
        String strMo6878 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                c7151 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, C7149.f19117, c7151);
                i |= 1;
            } else if (iMo10672 == 1) {
                list = (List) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, (InterfaceC7183) interfaceC5183Arr[1].getValue(), list);
                i |= 2;
            } else {
                if (iMo10672 != 2) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 2);
                i |= 4;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6570(i, strMo6878, list, c7151);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6570 c6570 = (C6570) obj;
        c6570.getClass();
        String str = c6570.f17947;
        List list = c6570.f17948;
        C7151 c7151 = c6570.f17949;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6570.f17946;
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c7151, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 0, C7149.f19117, c7151);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || list != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 1, (InterfaceC7183) interfaceC5183Arr[1].getValue(), list);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(str, "object")) {
            interfaceC7187Mo6800.mo6814(interfaceC7190, 2, str);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
