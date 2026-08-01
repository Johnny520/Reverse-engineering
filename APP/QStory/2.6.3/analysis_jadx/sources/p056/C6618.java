package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p087.C7129;
import p087.C7135;
import p087.InterfaceC7079;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6618 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6618 f17995;

    static {
        C6618 c6618 = new C6618();
        f17995 = c6618;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.EmbeddedResource", c6618, 2);
        c7129.m12409("resource", false);
        c7129.m12409("type", true);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C6779.f18215, C7135.f19089};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC6783 interfaceC6783 = null;
        String strMo10686 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                interfaceC6783 = (InterfaceC6783) interfaceC7189Mo10676.mo10674(interfaceC7191, 0, C6779.f18215, interfaceC6783);
                i |= 1;
            } else {
                if (iMo10718 != 1) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 1);
                i |= 2;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6613(i, interfaceC6783, strMo10686);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6613 c6613 = (C6613) obj;
        c6613.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        C6779 c6779 = C6779.f18215;
        InterfaceC6783 interfaceC6783 = c6613.f17987;
        String str = c6613.f17986;
        interfaceC7188Mo10710.mo10719(interfaceC7191, 0, c6779, interfaceC6783);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(str, "resource")) {
            interfaceC7188Mo10710.mo10735(interfaceC7191, 1, str);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
