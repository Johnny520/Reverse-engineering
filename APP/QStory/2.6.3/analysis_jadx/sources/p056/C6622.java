package p056;

import io.ktor.client.plugins.AbstractC3933;
import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.InterfaceC5184;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p087.C7129;
import p087.C7135;
import p087.InterfaceC7079;
import p088.C7150;
import p088.C7152;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6622 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6622 f18007;

    static {
        C6622 c6622 = new C6622();
        f18007 = c6622;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.CreateMessageResult", c6622, 5);
        c7129.m12409("model", false);
        c7129.m12409("stopReason", true);
        c7129.m12409("role", false);
        c7129.m12409("content", false);
        c7129.m12409("_meta", true);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C7135.f19089, AbstractC3933.m8313(C6581.f17956), C6617.f17989[2].getValue(), C6846.f18284, C7150.f19112};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6617.f17989;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        String strMo10686 = null;
        InterfaceC6582 interfaceC6582 = null;
        Role role = null;
        InterfaceC6732 interfaceC6732 = null;
        C7152 c7152 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 0);
                i |= 1;
            } else if (iMo10718 == 1) {
                interfaceC6582 = (InterfaceC6582) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, C6581.f17956, interfaceC6582);
                i |= 2;
            } else if (iMo10718 == 2) {
                role = (Role) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, (InterfaceC7184) interfaceC5184Arr[2].getValue(), role);
                i |= 4;
            } else if (iMo10718 == 3) {
                interfaceC6732 = (InterfaceC6732) interfaceC7189Mo10676.mo10674(interfaceC7191, 3, C6846.f18284, interfaceC6732);
                i |= 8;
            } else {
                if (iMo10718 != 4) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                c7152 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 4, C7150.f19112, c7152);
                i |= 16;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6617(i, strMo10686, interfaceC6582, role, interfaceC6732, c7152);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6617 c6617 = (C6617) obj;
        c6617.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6617.f17989;
        String str = c6617.f17994;
        C7152 c7152 = c6617.f17990;
        InterfaceC6582 interfaceC6582 = c6617.f17993;
        interfaceC7188Mo10710.mo10735(interfaceC7191, 0, str);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || interfaceC6582 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 1, C6581.f17956, interfaceC6582);
        }
        interfaceC7188Mo10710.mo10719(interfaceC7191, 2, (InterfaceC7184) interfaceC5184Arr[2].getValue(), c6617.f17992);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 3, C6846.f18284, c6617.f17991);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 4, C7150.f19112, c7152);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
