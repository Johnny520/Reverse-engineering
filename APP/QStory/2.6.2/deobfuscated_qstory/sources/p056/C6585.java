package p056;

import p087.AbstractC7143;
import p087.C7087;
import p087.C7134;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6585 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6585 f17964;

    static {
        C6585 c6585 = new C6585();
        f17964 = c6585;
        C7087 c7087 = new C7087("io.modelcontextprotocol.kotlin.sdk.StopReason.Other", c6585);
        c7087.m12382("value", false);
        descriptor = c7087;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C7134.f19094};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        String strMo6867 = interfaceC7186.mo6880(descriptor).mo6867();
        strMo6867.getClass();
        return new C6583(strMo6867);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        String str = ((C6583) obj).f17963;
        InterfaceC7185 interfaceC7185Mo6808 = interfaceC7185.mo6808(descriptor);
        if (interfaceC7185Mo6808 == null) {
            return;
        }
        interfaceC7185Mo6808.mo6813(str);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
