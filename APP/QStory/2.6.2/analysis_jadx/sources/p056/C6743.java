package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6743 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6743 f18175;

    static {
        C6743 c6743 = new C6743();
        f18175 = c6743;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.ProgressNotification", c6743, 6);
        c7128.m12382("progress", false);
        c7128.m12382("progressToken", false);
        c7128.m12382("_meta", true);
        c7128.m12382("total", false);
        c7128.m12382("message", false);
        c7128.m12382("method", true);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C7082.f19002, C6753.f18187[1].getValue(), C7149.f19117, C8675.m14355(C7105.f19038), C8675.m14355(C7134.f19094), C6791.f18237};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6753.f18187;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        int iMo6872 = 0;
        InterfaceC6835 interfaceC6835 = null;
        C7151 c7151 = null;
        Double d = null;
        String str = null;
        InterfaceC6815 interfaceC6815 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            switch (iMo10672) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iMo6872 = interfaceC7188Mo6876.mo6872(interfaceC7190, 0);
                    i |= 1;
                    break;
                case 1:
                    interfaceC6835 = (InterfaceC6835) interfaceC7188Mo6876.mo6874(interfaceC7190, 1, (InterfaceC7183) interfaceC5183Arr[1].getValue(), interfaceC6835);
                    i |= 2;
                    break;
                case 2:
                    c7151 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 2, C7149.f19117, c7151);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) interfaceC7188Mo6876.mo6875(interfaceC7190, 3, C7105.f19038, d);
                    i |= 8;
                    break;
                case 4:
                    str = (String) interfaceC7188Mo6876.mo6875(interfaceC7190, 4, C7134.f19094, str);
                    i |= 16;
                    break;
                case 5:
                    interfaceC6815 = (InterfaceC6815) interfaceC7188Mo6876.mo6874(interfaceC7190, 5, C6791.f18237, interfaceC6815);
                    i |= 32;
                    break;
                default:
                    C7546.m12738(iMo10672);
                    return null;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6753(i, iMo6872, interfaceC6835, c7151, d, str, interfaceC6815);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6753 c6753 = (C6753) obj;
        c6753.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6753.f18187;
        int i = c6753.f18193;
        InterfaceC6815 interfaceC6815 = c6753.f18188;
        C7151 c7151 = c6753.f18191;
        interfaceC7187Mo6800.mo6805(0, i, interfaceC7190);
        interfaceC7187Mo6800.mo6791(interfaceC7190, 1, (InterfaceC7183) interfaceC5183Arr[1].getValue(), c6753.f18192);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c7151, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 2, C7149.f19117, c7151);
        }
        interfaceC7187Mo6800.mo6807(interfaceC7190, 3, C7105.f19038, c6753.f18190);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 4, C7134.f19094, c6753.f18189);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || interfaceC6815 != Method$Defined.NotificationsProgress) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 5, C6791.f18237, interfaceC6815);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
