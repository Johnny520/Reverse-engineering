package p056;

import io.modelcontextprotocol.kotlin.sdk.LoggingLevel;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6806 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6806 f18251;

    static {
        C6806 c6806 = new C6806();
        f18251 = c6806;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.LoggingMessageNotification", c6806, 5);
        c7128.m12382("level", false);
        c7128.m12382("logger", true);
        c7128.m12382("data", true);
        c7128.m12382("_meta", true);
        c7128.m12382("method", true);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7149 c7149 = C7149.f19117;
        return new InterfaceC7183[]{C6821.f18264[0].getValue(), C8675.m14355(C7134.f19094), c7149, c7149, C6791.f18237};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6821.f18264;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        LoggingLevel loggingLevel = null;
        String str = null;
        C7151 c7151 = null;
        C7151 c71512 = null;
        InterfaceC6815 interfaceC6815 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                loggingLevel = (LoggingLevel) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), loggingLevel);
                i |= 1;
            } else if (iMo10672 == 1) {
                str = (String) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, C7134.f19094, str);
                i |= 2;
            } else if (iMo10672 == 2) {
                c7151 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 2, C7149.f19117, c7151);
                i |= 4;
            } else if (iMo10672 == 3) {
                c71512 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 3, C7149.f19117, c71512);
                i |= 8;
            } else {
                if (iMo10672 != 4) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                interfaceC6815 = (InterfaceC6815) interfaceC7188Mo6876.mo6874(interfaceC7190, 4, C6791.f18237, interfaceC6815);
                i |= 16;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6821(i, loggingLevel, str, c7151, c71512, interfaceC6815);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6821 c6821 = (C6821) obj;
        c6821.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC7183 interfaceC7183 = (InterfaceC7183) C6821.f18264[0].getValue();
        LoggingLevel loggingLevel = c6821.f18269;
        InterfaceC6815 interfaceC6815 = c6821.f18265;
        C7151 c7151 = c6821.f18266;
        C7151 c71512 = c6821.f18267;
        String str = c6821.f18268;
        interfaceC7187Mo6800.mo6791(interfaceC7190, 0, interfaceC7183, loggingLevel);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || str != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 1, C7134.f19094, str);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c71512, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 2, C7149.f19117, c71512);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c7151, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 3, C7149.f19117, c7151);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || interfaceC6815 != Method$Defined.NotificationsMessage) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 4, C6791.f18237, interfaceC6815);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
