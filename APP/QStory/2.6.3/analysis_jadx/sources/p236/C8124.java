package p236;

import io.ktor.client.plugins.AbstractC3933;
import io.ktor.http.CookieEncoding;
import java.util.Map;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p087.C7083;
import p087.C7100;
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
import p243.C8147;
import p243.C8149;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8124 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8124 f22423;

    static {
        C8124 c8124 = new C8124();
        f22423 = c8124;
        C7129 c7129 = new C7129("io.ktor.http.Cookie", c8124, 10);
        c7129.m12409("name", false);
        c7129.m12409("value", false);
        c7129.m12409("encoding", true);
        c7129.m12409("maxAge", true);
        c7129.m12409("expires", true);
        c7129.m12409("domain", true);
        c7129.m12409("path", true);
        c7129.m12409("secure", true);
        c7129.m12409("httpOnly", true);
        c7129.m12409("extensions", true);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        InterfaceC7184[] interfaceC7184Arr = C8129.f22430;
        C7135 c7135 = C7135.f19089;
        InterfaceC7184 interfaceC7184 = interfaceC7184Arr[2];
        InterfaceC7184 interfaceC7184M8313 = AbstractC3933.m8313(C7083.f18997);
        InterfaceC7184 interfaceC7184M83132 = AbstractC3933.m8313(C8149.f22473);
        InterfaceC7184 interfaceC7184M83133 = AbstractC3933.m8313(c7135);
        InterfaceC7184 interfaceC7184M83134 = AbstractC3933.m8313(c7135);
        InterfaceC7184 interfaceC71842 = interfaceC7184Arr[9];
        C7100 c7100 = C7100.f19025;
        return new InterfaceC7184[]{c7135, c7135, interfaceC7184, interfaceC7184M8313, interfaceC7184M83132, interfaceC7184M83133, interfaceC7184M83134, c7100, c7100, interfaceC71842};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC7184[] interfaceC7184Arr = C8129.f22430;
        interfaceC7189Mo10676.getClass();
        Object obj = null;
        boolean z = true;
        Map map = null;
        String strMo10686 = null;
        String strMo106862 = null;
        CookieEncoding cookieEncoding = null;
        Integer num = null;
        C8147 c8147 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean zMo10652 = false;
        boolean zMo106522 = false;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            switch (iMo10718) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo106862 = interfaceC7189Mo10676.mo10686(interfaceC7191, 1);
                    i |= 2;
                    break;
                case 2:
                    cookieEncoding = (CookieEncoding) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, interfaceC7184Arr[2], cookieEncoding);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) interfaceC7189Mo10676.mo10675(interfaceC7191, 3, C7083.f18997, num);
                    i |= 8;
                    break;
                case 4:
                    c8147 = (C8147) interfaceC7189Mo10676.mo10675(interfaceC7191, 4, C8149.f22473, c8147);
                    i |= 16;
                    break;
                case 5:
                    str = (String) interfaceC7189Mo10676.mo10675(interfaceC7191, 5, C7135.f19089, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) interfaceC7189Mo10676.mo10675(interfaceC7191, 6, C7135.f19089, str2);
                    i |= 64;
                    break;
                case 7:
                    zMo10652 = interfaceC7189Mo10676.mo10652(interfaceC7191, 7);
                    i |= 128;
                    break;
                case 8:
                    zMo106522 = interfaceC7189Mo10676.mo10652(interfaceC7191, 8);
                    i |= 256;
                    break;
                case 9:
                    map = (Map) interfaceC7189Mo10676.mo10674(interfaceC7191, 9, interfaceC7184Arr[9], map);
                    i |= 512;
                    break;
                default:
                    C7547.m12767(iMo10718);
                    return obj;
            }
            obj = null;
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C8129(i, strMo10686, strMo106862, cookieEncoding, num, c8147, str, str2, zMo10652, zMo106522, map);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C8129 c8129 = (C8129) obj;
        c8129.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC7184[] interfaceC7184Arr = C8129.f22430;
        String str = c8129.f22436;
        Map map = c8129.f22440;
        boolean z = c8129.f22439;
        boolean z2 = c8129.f22437;
        String str2 = c8129.f22438;
        String str3 = c8129.f22431;
        C8147 c8147 = c8129.f22432;
        Integer num = c8129.f22433;
        CookieEncoding cookieEncoding = c8129.f22434;
        interfaceC7188Mo10710.mo10735(interfaceC7191, 0, str);
        interfaceC7188Mo10710.mo10735(interfaceC7191, 1, c8129.f22435);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || cookieEncoding != CookieEncoding.URI_ENCODING) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 2, interfaceC7184Arr[2], cookieEncoding);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || num != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 3, C7083.f18997, num);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || c8147 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 4, C8149.f22473, c8147);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || str3 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 5, C7135.f19089, str3);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || str2 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 6, C7135.f19089, str2);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || z2) {
            interfaceC7188Mo10710.mo10737(interfaceC7191, 7, z2);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || z) {
            interfaceC7188Mo10710.mo10737(interfaceC7191, 8, z);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(map, AbstractC4339.m8776())) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 9, interfaceC7184Arr[9], map);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
