package p056;

import io.ktor.client.plugins.AbstractC3933;
import java.util.List;
import kotlin.InterfaceC5184;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世苏子兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6753 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6753 f18181;

    static {
        C6753 c6753 = new C6753();
        f18181 = c6753;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.Prompt", c6753, 3);
        c7129.m12409("name", false);
        c7129.m12409("description", false);
        c7129.m12409("arguments", false);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        InterfaceC5184[] interfaceC5184Arr = C6751.f18177;
        C7135 c7135 = C7135.f19089;
        return new InterfaceC7184[]{c7135, AbstractC3933.m8313(c7135), AbstractC3933.m8313((InterfaceC7184) interfaceC5184Arr[2].getValue())};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6751.f18177;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        String strMo10686 = null;
        String str = null;
        List list = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 0);
                i |= 1;
            } else if (iMo10718 == 1) {
                str = (String) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, C7135.f19089, str);
                i |= 2;
            } else {
                if (iMo10718 != 2) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                list = (List) interfaceC7189Mo10676.mo10675(interfaceC7191, 2, (InterfaceC7184) interfaceC5184Arr[2].getValue(), list);
                i |= 4;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6751(i, strMo10686, str, list);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6751 c6751 = (C6751) obj;
        c6751.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6751.f18177;
        interfaceC7188Mo10710.mo10735(interfaceC7191, 0, c6751.f18180);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 1, C7135.f19089, c6751.f18179);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 2, (InterfaceC7184) interfaceC5184Arr[2].getValue(), c6751.f18178);
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
