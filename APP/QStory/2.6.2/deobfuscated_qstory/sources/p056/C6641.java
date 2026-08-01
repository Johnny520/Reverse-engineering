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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6641 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6641 f18041;

    static {
        C6641 c6641 = new C6641();
        f18041 = c6641;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.ListToolsResult", c6641, 3);
        c7128.m12382("tools", false);
        c7128.m12382("nextCursor", false);
        c7128.m12382("_meta", true);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C6644.f18043[0].getValue(), C8675.m14355(C7134.f19094), C7149.f19117};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6644.f18043;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        C7151 c7151 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                list = (List) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo10672 == 1) {
                str = (String) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, C7134.f19094, str);
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
        return new C6644(i, str, list, c7151);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6644 c6644 = (C6644) obj;
        c6644.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC7183 interfaceC7183 = (InterfaceC7183) C6644.f18043[0].getValue();
        List list = c6644.f18046;
        C7151 c7151 = c6644.f18044;
        interfaceC7187Mo6800.mo6791(interfaceC7190, 0, interfaceC7183, list);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 1, C7134.f19094, c6644.f18045);
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
