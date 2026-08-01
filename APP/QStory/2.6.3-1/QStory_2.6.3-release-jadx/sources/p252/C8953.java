package p252;

import io.ktor.client.plugins.AbstractC4765;
import io.ktor.http.CookieEncoding;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p103.C7912;
import p103.C7929;
import p103.C7958;
import p103.C7964;
import p103.InterfaceC7908;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;
import p259.C8976;
import p259.C8978;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8953 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8953 f22768;

    static {
        C8953 c8953 = new C8953();
        f22768 = c8953;
        C7958 c7958 = new C7958("io.ktor.http.Cookie", c8953, 10);
        c7958.m12968("name", false);
        c7958.m12968("value", false);
        c7958.m12968("encoding", true);
        c7958.m12968("maxAge", true);
        c7958.m12968("expires", true);
        c7958.m12968("domain", true);
        c7958.m12968("path", true);
        c7958.m12968("secure", true);
        c7958.m12968("httpOnly", true);
        c7958.m12968("extensions", true);
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        InterfaceC8013[] interfaceC8013Arr = C8958.f22775;
        C7964 c7964 = C7964.f19434;
        InterfaceC8013 interfaceC8013 = interfaceC8013Arr[2];
        InterfaceC8013 interfaceC8013M8872 = AbstractC4765.m8872(C7912.f19342);
        InterfaceC8013 interfaceC8013M88722 = AbstractC4765.m8872(C8978.f22818);
        InterfaceC8013 interfaceC8013M88723 = AbstractC4765.m8872(c7964);
        InterfaceC8013 interfaceC8013M88724 = AbstractC4765.m8872(c7964);
        InterfaceC8013 interfaceC80132 = interfaceC8013Arr[9];
        C7929 c7929 = C7929.f19370;
        return new InterfaceC8013[]{c7964, c7964, interfaceC8013, interfaceC8013M8872, interfaceC8013M88722, interfaceC8013M88723, interfaceC8013M88724, c7929, c7929, interfaceC80132};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC8013[] interfaceC8013Arr = C8958.f22775;
        interfaceC8018Mo11235.getClass();
        Object obj = null;
        boolean z = true;
        Map map = null;
        String strMo11245 = null;
        String strMo112452 = null;
        CookieEncoding cookieEncoding = null;
        Integer num = null;
        C8976 c8976 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean zMo11211 = false;
        boolean zMo112112 = false;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            switch (iMo11277) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strMo11245 = interfaceC8018Mo11235.mo11245(interfaceC8020, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo112452 = interfaceC8018Mo11235.mo11245(interfaceC8020, 1);
                    i |= 2;
                    break;
                case 2:
                    cookieEncoding = (CookieEncoding) interfaceC8018Mo11235.mo11233(interfaceC8020, 2, interfaceC8013Arr[2], cookieEncoding);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) interfaceC8018Mo11235.mo11234(interfaceC8020, 3, C7912.f19342, num);
                    i |= 8;
                    break;
                case 4:
                    c8976 = (C8976) interfaceC8018Mo11235.mo11234(interfaceC8020, 4, C8978.f22818, c8976);
                    i |= 16;
                    break;
                case 5:
                    str = (String) interfaceC8018Mo11235.mo11234(interfaceC8020, 5, C7964.f19434, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) interfaceC8018Mo11235.mo11234(interfaceC8020, 6, C7964.f19434, str2);
                    i |= 64;
                    break;
                case 7:
                    zMo11211 = interfaceC8018Mo11235.mo11211(interfaceC8020, 7);
                    i |= 128;
                    break;
                case 8:
                    zMo112112 = interfaceC8018Mo11235.mo11211(interfaceC8020, 8);
                    i |= 256;
                    break;
                case 9:
                    map = (Map) interfaceC8018Mo11235.mo11233(interfaceC8020, 9, interfaceC8013Arr[9], map);
                    i |= 512;
                    break;
                default:
                    C8376.m13326(iMo11277);
                    return obj;
            }
            obj = null;
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C8958(i, strMo11245, strMo112452, cookieEncoding, num, c8976, str, str2, zMo11211, zMo112112, map);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C8958 c8958 = (C8958) obj;
        c8958.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC8013[] interfaceC8013Arr = C8958.f22775;
        String str = c8958.f22781;
        Map map = c8958.f22785;
        boolean z = c8958.f22784;
        boolean z2 = c8958.f22782;
        String str2 = c8958.f22783;
        String str3 = c8958.f22776;
        C8976 c8976 = c8958.f22777;
        Integer num = c8958.f22778;
        CookieEncoding cookieEncoding = c8958.f22779;
        interfaceC8017Mo11269.mo11294(interfaceC8020, 0, str);
        interfaceC8017Mo11269.mo11294(interfaceC8020, 1, c8958.f22780);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || cookieEncoding != CookieEncoding.URI_ENCODING) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 2, interfaceC8013Arr[2], cookieEncoding);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || num != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 3, C7912.f19342, num);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || c8976 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 4, C8978.f22818, c8976);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || str3 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 5, C7964.f19434, str3);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || str2 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 6, C7964.f19434, str2);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || z2) {
            interfaceC8017Mo11269.mo11296(interfaceC8020, 7, z2);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || z) {
            interfaceC8017Mo11269.mo11296(interfaceC8020, 8, z);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(map, AbstractC5171.m9335())) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 9, interfaceC8013Arr[9], map);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
