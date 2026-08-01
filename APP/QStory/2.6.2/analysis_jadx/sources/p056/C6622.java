package p056;

import java.util.List;
import kotlin.InterfaceC5183;
import p087.AbstractC7143;
import p087.C7082;
import p087.C7099;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6622 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6622 f18013;

    static {
        C6622 c6622 = new C6622();
        f18013 = c6622;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.CompleteResult.Completion", c6622, 3);
        c7128.m12382("values", false);
        c7128.m12382("total", false);
        c7128.m12382("hasMore", false);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C6632.f18025[0].getValue(), C8675.m14355(C7082.f19002), C8675.m14355(C7099.f19030)};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6632.f18025;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
        Boolean bool = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                list = (List) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo10672 == 1) {
                num = (Integer) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, C7082.f19002, num);
                i |= 2;
            } else {
                if (iMo10672 != 2) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                bool = (Boolean) interfaceC7188Mo6876.mo6875(interfaceC7190, 2, C7099.f19030, bool);
                i |= 4;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6632(i, list, num, bool);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6632 c6632 = (C6632) obj;
        c6632.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        interfaceC7187Mo6800.mo6791(interfaceC7190, 0, (InterfaceC7183) C6632.f18025[0].getValue(), c6632.f18028);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 1, C7082.f19002, c6632.f18027);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 2, C7099.f19030, c6632.f18026);
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
