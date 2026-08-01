package p056;

import java.util.List;
import kotlin.InterfaceC5183;
import p087.AbstractC7143;
import p087.C7105;
import p087.C7128;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;
import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6816 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6816 f18261;

    static {
        C6816 c6816 = new C6816();
        f18261 = c6816;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.ModelPreferences", c6816, 4);
        c7128.m12382("hints", false);
        c7128.m12382("costPriority", false);
        c7128.m12382("speedPriority", false);
        c7128.m12382("intelligencePriority", false);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        InterfaceC7183 interfaceC7183M14355 = C8675.m14355((InterfaceC7183) C6809.f18253[0].getValue());
        C7105 c7105 = C7105.f19038;
        return new InterfaceC7183[]{interfaceC7183M14355, C8675.m14355(c7105), C8675.m14355(c7105), C8675.m14355(c7105)};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6809.f18253;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                list = (List) interfaceC7188Mo6876.mo6875(interfaceC7190, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo10672 == 1) {
                d = (Double) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, C7105.f19038, d);
                i |= 2;
            } else if (iMo10672 == 2) {
                d2 = (Double) interfaceC7188Mo6876.mo6875(interfaceC7190, 2, C7105.f19038, d2);
                i |= 4;
            } else {
                if (iMo10672 != 3) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                d3 = (Double) interfaceC7188Mo6876.mo6875(interfaceC7190, 3, C7105.f19038, d3);
                i |= 8;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6809(i, list, d, d2, d3);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6809 c6809 = (C6809) obj;
        c6809.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 0, (InterfaceC7183) C6809.f18253[0].getValue(), c6809.f18257);
        C7105 c7105 = C7105.f19038;
        interfaceC7187Mo6800.mo6807(interfaceC7190, 1, c7105, c6809.f18256);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 2, c7105, c6809.f18255);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 3, c7105, c6809.f18254);
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
