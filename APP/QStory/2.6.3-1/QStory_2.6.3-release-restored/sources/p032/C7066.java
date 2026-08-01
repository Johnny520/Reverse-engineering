package p032;

import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.bumptech.glide.AbstractC3888;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import okhttp3.Protocol;
import p020.C6921;
import p020.InterfaceC6939;
import p023.AbstractC6957;
import p023.AbstractC6962;
import p023.C6954;
import p023.C6958;
import p023.C6960;
import p023.C6961;
import p023.C6966;
import p023.C6978;
import p023.C6980;
import p023.InterfaceC6950;
import p023.InterfaceC6969;
import p023.InterfaceC6970;
import p028.C7050;
import p029.AbstractC7054;
import p069.AbstractC7390;
import p269.AbstractC9019;
import p348.C9615;

/* JADX INFO: renamed from: 飘花落叶言世兰楪苏子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7066 implements InterfaceC6969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17541;

    public /* synthetic */ C7066(int i) {
        this.f17541 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    @Override // p023.InterfaceC6969
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6960 intercept(InterfaceC6970 interfaceC6970) {
        C5703 c5703;
        C5703 c57032;
        C6960 c6960;
        int i;
        int i2;
        C5703 c57033;
        String string;
        String strMo12028;
        switch (this.f17541) {
            case 0:
                C7050 c7050 = (C7050) interfaceC6970;
                System.currentTimeMillis();
                C6954 c6954 = c7050.f17489;
                C5703 c57034 = new C5703(c6954, 6, (Object) null);
                C6966 c6966 = c6954.f17056;
                if (c6966 == null) {
                    int i3 = C6966.f17138;
                    C6980 c6980 = c6954.f17059;
                    c6980.getClass();
                    int size = c6980.size();
                    String str = null;
                    int i4 = 0;
                    boolean z = true;
                    boolean z2 = false;
                    boolean z3 = false;
                    int iM12241 = -1;
                    int iM122412 = -1;
                    boolean z4 = false;
                    boolean z5 = false;
                    boolean z6 = false;
                    int iM122413 = -1;
                    int iM122414 = -1;
                    boolean z7 = false;
                    boolean z8 = false;
                    boolean z9 = false;
                    while (i4 < size) {
                        String strM12109 = c6980.m12109(i4);
                        String strM12111 = c6980.m12111(i4);
                        if (strM12109.equalsIgnoreCase("Cache-Control")) {
                            if (str == null) {
                                str = strM12111;
                            }
                            i2 = 0;
                            while (i2 < strM12111.length()) {
                                int length = strM12111.length();
                                int length2 = i2;
                                while (true) {
                                    if (length2 < length) {
                                        c57033 = c57034;
                                        if (!AbstractC5976.m10722("=,;", strM12111.charAt(length2))) {
                                            length2++;
                                            c57034 = c57033;
                                        }
                                    } else {
                                        c57033 = c57034;
                                        length2 = strM12111.length();
                                    }
                                }
                                String string2 = AbstractC5976.m10714(strM12111.substring(i2, length2)).toString();
                                if (length2 == strM12111.length() || strM12111.charAt(length2) == ',' || strM12111.charAt(length2) == ';') {
                                    i2 = length2 + 1;
                                    string = null;
                                } else {
                                    int length3 = length2 + 1;
                                    byte[] bArr = AbstractC7054.f17503;
                                    int length4 = strM12111.length();
                                    while (true) {
                                        if (length3 >= length4) {
                                            length3 = strM12111.length();
                                        } else {
                                            char cCharAt = strM12111.charAt(length3);
                                            if (cCharAt == ' ' || cCharAt == '\t') {
                                                length3++;
                                            }
                                        }
                                    }
                                    if (length3 >= strM12111.length() || strM12111.charAt(length3) != '\"') {
                                        int length5 = strM12111.length();
                                        int length6 = length3;
                                        while (true) {
                                            if (length6 < length5) {
                                                int i5 = length5;
                                                if (!AbstractC5976.m10722(",;", strM12111.charAt(length6))) {
                                                    length6++;
                                                    length5 = i5;
                                                }
                                            } else {
                                                length6 = strM12111.length();
                                            }
                                        }
                                        string = AbstractC5976.m10714(strM12111.substring(length3, length6)).toString();
                                        i2 = length6;
                                    } else {
                                        int i6 = length3 + 1;
                                        int iM10730 = AbstractC5976.m10730(strM12111, '\"', i6, 4);
                                        string = strM12111.substring(i6, iM10730);
                                        i2 = iM10730 + 1;
                                    }
                                }
                                if ("no-cache".equalsIgnoreCase(string2)) {
                                    z2 = true;
                                } else if ("no-store".equalsIgnoreCase(string2)) {
                                    z3 = true;
                                } else if ("max-age".equalsIgnoreCase(string2)) {
                                    iM12241 = AbstractC7054.m12241(-1, string);
                                } else if ("s-maxage".equalsIgnoreCase(string2)) {
                                    iM122412 = AbstractC7054.m12241(-1, string);
                                } else if ("private".equalsIgnoreCase(string2)) {
                                    z4 = true;
                                } else if ("public".equalsIgnoreCase(string2)) {
                                    z5 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(string2)) {
                                    z6 = true;
                                } else if ("max-stale".equalsIgnoreCase(string2)) {
                                    iM122413 = AbstractC7054.m12241(Integer.MAX_VALUE, string);
                                } else if ("min-fresh".equalsIgnoreCase(string2)) {
                                    iM122414 = AbstractC7054.m12241(-1, string);
                                } else if ("only-if-cached".equalsIgnoreCase(string2)) {
                                    z7 = true;
                                } else if ("no-transform".equalsIgnoreCase(string2)) {
                                    z8 = true;
                                } else if ("immutable".equalsIgnoreCase(string2)) {
                                    z9 = true;
                                }
                                c57034 = c57033;
                            }
                            i4++;
                            c57034 = c57034;
                        } else if (!strM12109.equalsIgnoreCase("Pragma")) {
                            i4++;
                            c57034 = c57034;
                        }
                        z = false;
                        i2 = 0;
                        while (i2 < strM12111.length()) {
                        }
                        i4++;
                        c57034 = c57034;
                    }
                    c5703 = c57034;
                    C6966 c69662 = new C6966(z2, z3, iM12241, iM122412, z4, z5, z6, iM122413, iM122414, z7, z8, z9, !z ? null : str);
                    c6954.f17056 = c69662;
                    c6966 = c69662;
                } else {
                    c5703 = c57034;
                }
                if (c6966.f17151) {
                    Object obj = null;
                    c57032 = new C5703(obj, 6, obj);
                } else {
                    c57032 = c5703;
                }
                C6954 c69542 = (C6954) c57032.f14509;
                C6960 c69602 = (C6960) c57032.f14510;
                if (c69542 == null && c69602 == null) {
                    C6958 c6958 = AbstractC6957.f17094;
                    ArrayList arrayList = new ArrayList(20);
                    Protocol protocol = Protocol.HTTP_1_1;
                    protocol.getClass();
                    return new C6960(c6954, protocol, "Unsatisfiable Request (only-if-cached)", 504, null, new C6980((String[]) arrayList.toArray(new String[0])), c6958, null, null, null, null, -1L, System.currentTimeMillis(), null, InterfaceC6950.f17048);
                }
                if (c69542 == null) {
                    c69602.getClass();
                    C6961 c6961M12079 = c69602.m12079();
                    C6960 c6960M12621 = AbstractC7390.m12621(c69602);
                    C6961.m12080("cacheResponse", c6960M12621);
                    c6961M12079.f17133 = c6960M12621;
                    return c6961M12079.m12081();
                }
                C6960 c6960M12232 = c7050.m12232(c69542);
                if (c69602 == null) {
                    c6960 = null;
                } else {
                    if (c6960M12232.f17111 == 304) {
                        C6961 c6961M120792 = c69602.m12079();
                        C6980 c69802 = c69602.f17114;
                        C6980 c69803 = c6960M12232.f17114;
                        ArrayList arrayList2 = new ArrayList(20);
                        int i7 = 0;
                        for (int size2 = c69802.size(); i7 < size2; size2 = i) {
                            String strM121092 = c69802.m12109(i7);
                            String strM121112 = c69802.m12111(i7);
                            if ("Warning".equalsIgnoreCase(strM121092)) {
                                i = size2;
                                if (AbstractC5971.m10698(strM121112, "1", false)) {
                                }
                                i7++;
                            } else {
                                i = size2;
                            }
                            if ("Content-Length".equalsIgnoreCase(strM121092) || "Content-Encoding".equalsIgnoreCase(strM121092) || "Content-Type".equalsIgnoreCase(strM121092) || !AbstractC9019.m14260(strM121092) || c69803.m12110(strM121092) == null) {
                                arrayList2.add(strM121092);
                                arrayList2.add(AbstractC5976.m10714(strM121112).toString());
                            }
                            i7++;
                        }
                        int size3 = c69803.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            String strM121093 = c69803.m12109(i8);
                            if (!"Content-Length".equalsIgnoreCase(strM121093) && !"Content-Encoding".equalsIgnoreCase(strM121093) && !"Content-Type".equalsIgnoreCase(strM121093) && AbstractC9019.m14260(strM121093)) {
                                String strM121113 = c69803.m12111(i8);
                                arrayList2.add(strM121093);
                                arrayList2.add(AbstractC5976.m10714(strM121113).toString());
                            }
                        }
                        c6961M120792.f17119 = new C6980((String[]) arrayList2.toArray(new String[0])).m12108();
                        c6961M120792.f17131 = c6960M12232.f17106;
                        c6961M120792.f17126 = c6960M12232.f17105;
                        C6960 c6960M126212 = AbstractC7390.m12621(c69602);
                        C6961.m12080("cacheResponse", c6960M126212);
                        c6961M120792.f17133 = c6960M126212;
                        C6960 c6960M126213 = AbstractC7390.m12621(c6960M12232);
                        C6961.m12080("networkResponse", c6960M126213);
                        c6961M120792.f17132 = c6960M126213;
                        c6961M120792.m12081();
                        c6960M12232.f17115.close();
                        throw null;
                    }
                    c6960 = null;
                    AbstractC7054.m12239(c69602.f17115);
                }
                C6961 c6961M120793 = c6960M12232.m12079();
                C6960 c6960M126214 = c69602 != null ? AbstractC7390.m12621(c69602) : c6960;
                C6961.m12080("cacheResponse", c6960M126214);
                c6961M120793.f17133 = c6960M126214;
                C6960 c6960M126215 = AbstractC7390.m12621(c6960M12232);
                C6961.m12080("networkResponse", c6960M126215);
                c6961M120793.f17132 = c6960M126215;
                return c6961M120793.m12081();
            case 1:
                C7050 c70502 = (C7050) interfaceC6970;
                C6954 c69543 = c70502.f17489;
                AbstractC6962 abstractC6962 = c69543.f17058;
                C6978 c6978 = c69543.f17061;
                if (abstractC6962 != null) {
                    C6921 c6921 = new C6921();
                    abstractC6962.mo11711(c6921);
                    strMo12028 = c6921.mo12028(StandardCharsets.UTF_8);
                } else {
                    strMo12028 = "";
                }
                C6960 c6960M122322 = c70502.m12232(c69543);
                InterfaceC6939 interfaceC6939Mo11726 = c6960M122322.f17115.mo11726();
                interfaceC6939Mo11726.mo12032(Long.MAX_VALUE);
                String strMo120282 = interfaceC6939Mo11726.mo12035().clone().mo12028(StandardCharsets.UTF_8);
                String.format("请求成功：%s\nRequestBody:%s\nResponseBody:%s\n", c6978, strMo12028, strMo120282);
                try {
                    String strM14531 = "请求成功：%s\nRequestBody:%s\nResponseBody:%s\n";
                    JSONObject jSONObjectM6934 = InterfaceC3749.m6934(strMo12028);
                    JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.PrettyFormat;
                    String.format(strM14531, c6978, InterfaceC3749.m6932(jSONObjectM6934, jSONWriter$Feature), InterfaceC3749.m6932(InterfaceC3749.m6934(strMo120282), jSONWriter$Feature));
                    break;
                } catch (Exception unused) {
                }
                return c6960M122322;
            default:
                C7050 c70503 = (C7050) interfaceC6970;
                C2080 c2080M12074 = c70503.f17489.m12074();
                C9615 c9615M7267 = AbstractC3888.m7267();
                if (c9615M7267 != null) {
                    String str2 = c9615M7267.f25093;
                    String str3 = c9615M7267.f25092;
                    if (str2 != null && str3 != null) {
                        c2080M12074.m2716(str2, str3);
                    }
                }
                return c70503.m12232(new C6954(c2080M12074));
        }
    }
}
