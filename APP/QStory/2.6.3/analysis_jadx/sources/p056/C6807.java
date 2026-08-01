package p056;

import io.ktor.client.plugins.AbstractC3933;
import io.modelcontextprotocol.kotlin.sdk.LoggingLevel;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6807 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6807 f18246;

    static {
        C6807 c6807 = new C6807();
        f18246 = c6807;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.LoggingMessageNotification", c6807, 5);
        c7129.m12409("level", false);
        c7129.m12409("logger", true);
        c7129.m12409("data", true);
        c7129.m12409("_meta", true);
        c7129.m12409("method", true);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        C7150 c7150 = C7150.f19112;
        return new InterfaceC7184[]{C6822.f18259[0].getValue(), AbstractC3933.m8313(C7135.f19089), c7150, c7150, C6792.f18232};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6822.f18259;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        LoggingLevel loggingLevel = null;
        String str = null;
        C7152 c7152 = null;
        C7152 c71522 = null;
        InterfaceC6816 interfaceC6816 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                loggingLevel = (LoggingLevel) interfaceC7189Mo10676.mo10674(interfaceC7191, 0, (InterfaceC7184) interfaceC5184Arr[0].getValue(), loggingLevel);
                i |= 1;
            } else if (iMo10718 == 1) {
                str = (String) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, C7135.f19089, str);
                i |= 2;
            } else if (iMo10718 == 2) {
                c7152 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, C7150.f19112, c7152);
                i |= 4;
            } else if (iMo10718 == 3) {
                c71522 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 3, C7150.f19112, c71522);
                i |= 8;
            } else {
                if (iMo10718 != 4) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                interfaceC6816 = (InterfaceC6816) interfaceC7189Mo10676.mo10674(interfaceC7191, 4, C6792.f18232, interfaceC6816);
                i |= 16;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6822(i, loggingLevel, str, c7152, c71522, interfaceC6816);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6822 c6822 = (C6822) obj;
        c6822.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC7184 interfaceC7184 = (InterfaceC7184) C6822.f18259[0].getValue();
        LoggingLevel loggingLevel = c6822.f18264;
        InterfaceC6816 interfaceC6816 = c6822.f18260;
        C7152 c7152 = c6822.f18261;
        C7152 c71522 = c6822.f18262;
        String str = c6822.f18263;
        interfaceC7188Mo10710.mo10719(interfaceC7191, 0, interfaceC7184, loggingLevel);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || str != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 1, C7135.f19089, str);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c71522, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 2, C7150.f19112, c71522);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 3, C7150.f19112, c7152);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || interfaceC6816 != Method$Defined.NotificationsMessage) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 4, C6792.f18232, interfaceC6816);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
