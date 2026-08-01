package p236;

import io.ktor.http.CookieEncoding;
import java.util.Map;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p087.C7082;
import p087.C7099;
import p087.C7128;
import p087.C7134;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;
import p243.C8146;
import p243.C8148;
import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8123 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8123 f22425;

    static {
        C8123 c8123 = new C8123();
        f22425 = c8123;
        C7128 c7128 = new C7128("io.ktor.http.Cookie", c8123, 10);
        c7128.m12382("name", false);
        c7128.m12382("value", false);
        c7128.m12382("encoding", true);
        c7128.m12382("maxAge", true);
        c7128.m12382("expires", true);
        c7128.m12382("domain", true);
        c7128.m12382("path", true);
        c7128.m12382("secure", true);
        c7128.m12382("httpOnly", true);
        c7128.m12382("extensions", true);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        InterfaceC7183[] interfaceC7183Arr = C8128.f22432;
        C7134 c7134 = C7134.f19094;
        InterfaceC7183 interfaceC7183 = interfaceC7183Arr[2];
        InterfaceC7183 interfaceC7183M14355 = C8675.m14355(C7082.f19002);
        InterfaceC7183 interfaceC7183M143552 = C8675.m14355(C8148.f22475);
        InterfaceC7183 interfaceC7183M143553 = C8675.m14355(c7134);
        InterfaceC7183 interfaceC7183M143554 = C8675.m14355(c7134);
        InterfaceC7183 interfaceC71832 = interfaceC7183Arr[9];
        C7099 c7099 = C7099.f19030;
        return new InterfaceC7183[]{c7134, c7134, interfaceC7183, interfaceC7183M14355, interfaceC7183M143552, interfaceC7183M143553, interfaceC7183M143554, c7099, c7099, interfaceC71832};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC7183[] interfaceC7183Arr = C8128.f22432;
        interfaceC7188Mo6876.getClass();
        Object obj = null;
        boolean z = true;
        Map map = null;
        String strMo6878 = null;
        String strMo68782 = null;
        CookieEncoding cookieEncoding = null;
        Integer num = null;
        C8146 c8146 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean zMo6861 = false;
        boolean zMo68612 = false;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            switch (iMo10672) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo68782 = interfaceC7188Mo6876.mo6878(interfaceC7190, 1);
                    i |= 2;
                    break;
                case 2:
                    cookieEncoding = (CookieEncoding) interfaceC7188Mo6876.mo6874(interfaceC7190, 2, interfaceC7183Arr[2], cookieEncoding);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) interfaceC7188Mo6876.mo6875(interfaceC7190, 3, C7082.f19002, num);
                    i |= 8;
                    break;
                case 4:
                    c8146 = (C8146) interfaceC7188Mo6876.mo6875(interfaceC7190, 4, C8148.f22475, c8146);
                    i |= 16;
                    break;
                case 5:
                    str = (String) interfaceC7188Mo6876.mo6875(interfaceC7190, 5, C7134.f19094, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) interfaceC7188Mo6876.mo6875(interfaceC7190, 6, C7134.f19094, str2);
                    i |= 64;
                    break;
                case 7:
                    zMo6861 = interfaceC7188Mo6876.mo6861(interfaceC7190, 7);
                    i |= 128;
                    break;
                case 8:
                    zMo68612 = interfaceC7188Mo6876.mo6861(interfaceC7190, 8);
                    i |= 256;
                    break;
                case 9:
                    map = (Map) interfaceC7188Mo6876.mo6874(interfaceC7190, 9, interfaceC7183Arr[9], map);
                    i |= 512;
                    break;
                default:
                    C7546.m12738(iMo10672);
                    return obj;
            }
            obj = null;
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C8128(i, strMo6878, strMo68782, cookieEncoding, num, c8146, str, str2, zMo6861, zMo68612, map);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C8128 c8128 = (C8128) obj;
        c8128.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC7183[] interfaceC7183Arr = C8128.f22432;
        String str = c8128.f22438;
        Map map = c8128.f22442;
        boolean z = c8128.f22441;
        boolean z2 = c8128.f22439;
        String str2 = c8128.f22440;
        String str3 = c8128.f22433;
        C8146 c8146 = c8128.f22434;
        Integer num = c8128.f22435;
        CookieEncoding cookieEncoding = c8128.f22436;
        interfaceC7187Mo6800.mo6814(interfaceC7190, 0, str);
        interfaceC7187Mo6800.mo6814(interfaceC7190, 1, c8128.f22437);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || cookieEncoding != CookieEncoding.URI_ENCODING) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 2, interfaceC7183Arr[2], cookieEncoding);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || num != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 3, C7082.f19002, num);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c8146 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 4, C8148.f22475, c8146);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || str3 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 5, C7134.f19094, str3);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || str2 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 6, C7134.f19094, str2);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || z2) {
            interfaceC7187Mo6800.mo6816(interfaceC7190, 7, z2);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || z) {
            interfaceC7187Mo6800.mo6816(interfaceC7190, 8, z);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(map, AbstractC4338.m8781())) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 9, interfaceC7183Arr[9], map);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
