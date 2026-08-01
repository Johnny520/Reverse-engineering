package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p087.C7129;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6694 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6694 f18107;

    static {
        C6694 c6694 = new C6694();
        f18107 = c6694;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.CompleteRequest", c6694, 4);
        c7129.m12409("ref", false);
        c7129.m12409("argument", false);
        c7129.m12409("_meta", true);
        c7129.m12409("method", true);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C6843.f18281, C6691.f18101, C7150.f19112, C6792.f18232};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC6827 interfaceC6827 = null;
        C6628 c6628 = null;
        C7152 c7152 = null;
        InterfaceC6816 interfaceC6816 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                interfaceC6827 = (InterfaceC6827) interfaceC7189Mo10676.mo10674(interfaceC7191, 0, C6843.f18281, interfaceC6827);
                i |= 1;
            } else if (iMo10718 == 1) {
                c6628 = (C6628) interfaceC7189Mo10676.mo10674(interfaceC7191, 1, C6691.f18101, c6628);
                i |= 2;
            } else if (iMo10718 == 2) {
                c7152 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, C7150.f19112, c7152);
                i |= 4;
            } else {
                if (iMo10718 != 3) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                interfaceC6816 = (InterfaceC6816) interfaceC7189Mo10676.mo10674(interfaceC7191, 3, C6792.f18232, interfaceC6816);
                i |= 8;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6626(i, interfaceC6827, c6628, c7152, interfaceC6816);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6626 c6626 = (C6626) obj;
        c6626.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        C6843 c6843 = C6843.f18281;
        InterfaceC6827 interfaceC6827 = c6626.f18013;
        InterfaceC6816 interfaceC6816 = c6626.f18010;
        C7152 c7152 = c6626.f18011;
        interfaceC7188Mo10710.mo10719(interfaceC7191, 0, c6843, interfaceC6827);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 1, C6691.f18101, c6626.f18012);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 2, C7150.f19112, c7152);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || interfaceC6816 != Method$Defined.CompletionComplete) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 3, C6792.f18232, interfaceC6816);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
