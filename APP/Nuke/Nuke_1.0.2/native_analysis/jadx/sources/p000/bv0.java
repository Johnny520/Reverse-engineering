package p000;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bv0 {

    /* JADX INFO: renamed from: a */
    public static final gs0[] f1041a;

    /* JADX INFO: renamed from: b */
    public static final Map f1042b;

    static {
        gs0 gs0Var = new gs0(gs0.f3691i, "");
        C0505no c0505no = gs0.f3688f;
        gs0 gs0Var2 = new gs0(c0505no, "GET");
        gs0 gs0Var3 = new gs0(c0505no, "POST");
        C0505no c0505no2 = gs0.f3689g;
        gs0 gs0Var4 = new gs0(c0505no2, "/");
        gs0 gs0Var5 = new gs0(c0505no2, "/index.html");
        C0505no c0505no3 = gs0.f3690h;
        gs0 gs0Var6 = new gs0(c0505no3, "http");
        gs0 gs0Var7 = new gs0(c0505no3, "https");
        C0505no c0505no4 = gs0.f3687e;
        gs0[] gs0VarArr = {gs0Var, gs0Var2, gs0Var3, gs0Var4, gs0Var5, gs0Var6, gs0Var7, new gs0(c0505no4, "200"), new gs0(c0505no4, "204"), new gs0(c0505no4, "206"), new gs0(c0505no4, "304"), new gs0(c0505no4, "400"), new gs0(c0505no4, "404"), new gs0(c0505no4, "500"), new gs0("accept-charset", ""), new gs0("accept-encoding", "gzip, deflate"), new gs0("accept-language", ""), new gs0("accept-ranges", ""), new gs0("accept", ""), new gs0("access-control-allow-origin", ""), new gs0("age", ""), new gs0("allow", ""), new gs0("authorization", ""), new gs0("cache-control", ""), new gs0("content-disposition", ""), new gs0("content-encoding", ""), new gs0("content-language", ""), new gs0("content-length", ""), new gs0("content-location", ""), new gs0("content-range", ""), new gs0("content-type", ""), new gs0("cookie", ""), new gs0("date", ""), new gs0("etag", ""), new gs0("expect", ""), new gs0("expires", ""), new gs0("from", ""), new gs0("host", ""), new gs0("if-match", ""), new gs0("if-modified-since", ""), new gs0("if-none-match", ""), new gs0("if-range", ""), new gs0("if-unmodified-since", ""), new gs0("last-modified", ""), new gs0("link", ""), new gs0("location", ""), new gs0("max-forwards", ""), new gs0("proxy-authenticate", ""), new gs0("proxy-authorization", ""), new gs0("range", ""), new gs0("referer", ""), new gs0("refresh", ""), new gs0("retry-after", ""), new gs0("server", ""), new gs0("set-cookie", ""), new gs0("strict-transport-security", ""), new gs0("transfer-encoding", ""), new gs0("user-agent", ""), new gs0("vary", ""), new gs0("via", ""), new gs0("www-authenticate", "")};
        f1041a = gs0VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(gs0VarArr[i].f3692a)) {
                linkedHashMap.put(gs0VarArr[i].f3692a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        f1042b = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: a */
    public static void m597a(C0505no c0505no) throws IOException {
        c0505no.getClass();
        int iMo3322a = c0505no.mo3322a();
        for (int i = 0; i < iMo3322a; i++) {
            byte bMo3325d = c0505no.mo3325d(i);
            if (65 <= bMo3325d && bMo3325d < 91) {
                c80.m678v("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0505no.m3331j()));
                return;
            }
        }
    }
}
