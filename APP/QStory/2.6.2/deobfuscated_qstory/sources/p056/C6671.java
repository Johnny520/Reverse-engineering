package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6671 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6671 f18078;

    static {
        C6671 c6671 = new C6671();
        f18078 = c6671;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.InitializedNotification", c6671, 1);
        c7128.m12382("method", true);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C6791.f18237};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC6815 interfaceC6815 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else {
                if (iMo10672 != 0) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                interfaceC6815 = (InterfaceC6815) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, C6791.f18237, interfaceC6815);
                i = 1;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6674(i, interfaceC6815);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6674 c6674 = (C6674) obj;
        c6674.getClass();
        InterfaceC6815 interfaceC6815 = c6674.f18082;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || interfaceC6815 != Method$Defined.NotificationsInitialized) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 0, C6791.f18237, interfaceC6815);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
