package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bv0 {
    public static final gs0[] a;
    public static final Map b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        gs0 gs0Var = new gs0(gs0.i, "");
        no noVar = gs0.f;
        gs0 gs0Var2 = new gs0(noVar, "GET");
        gs0 gs0Var3 = new gs0(noVar, "POST");
        no noVar2 = gs0.g;
        gs0 gs0Var4 = new gs0(noVar2, "/");
        gs0 gs0Var5 = new gs0(noVar2, "/index.html");
        no noVar3 = gs0.h;
        gs0 gs0Var6 = new gs0(noVar3, "http");
        gs0 gs0Var7 = new gs0(noVar3, "https");
        no noVar4 = gs0.e;
        gs0[] gs0VarArr = {gs0Var, gs0Var2, gs0Var3, gs0Var4, gs0Var5, gs0Var6, gs0Var7, new gs0(noVar4, "200"), new gs0(noVar4, "204"), new gs0(noVar4, "206"), new gs0(noVar4, "304"), new gs0(noVar4, "400"), new gs0(noVar4, "404"), new gs0(noVar4, "500"), new gs0("accept-charset", ""), new gs0("accept-encoding", "gzip, deflate"), new gs0("accept-language", ""), new gs0("accept-ranges", ""), new gs0("accept", ""), new gs0("access-control-allow-origin", ""), new gs0("age", ""), new gs0("allow", ""), new gs0("authorization", ""), new gs0("cache-control", ""), new gs0("content-disposition", ""), new gs0("content-encoding", ""), new gs0("content-language", ""), new gs0("content-length", ""), new gs0("content-location", ""), new gs0("content-range", ""), new gs0("content-type", ""), new gs0("cookie", ""), new gs0("date", ""), new gs0("etag", ""), new gs0("expect", ""), new gs0("expires", ""), new gs0("from", ""), new gs0("host", ""), new gs0("if-match", ""), new gs0("if-modified-since", ""), new gs0("if-none-match", ""), new gs0("if-range", ""), new gs0("if-unmodified-since", ""), new gs0("last-modified", ""), new gs0("link", ""), new gs0("location", ""), new gs0("max-forwards", ""), new gs0("proxy-authenticate", ""), new gs0("proxy-authorization", ""), new gs0("range", ""), new gs0("referer", ""), new gs0("refresh", ""), new gs0("retry-after", ""), new gs0("server", ""), new gs0("set-cookie", ""), new gs0("strict-transport-security", ""), new gs0("transfer-encoding", ""), new gs0("user-agent", ""), new gs0("vary", ""), new gs0("via", ""), new gs0("www-authenticate", "")};
        a = gs0VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(gs0VarArr[i].a)) {
                linkedHashMap.put(gs0VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(no noVar) throws IOException {
        noVar.getClass();
        int iA = noVar.a();
        for (int i = 0; i < iA; i++) {
            byte bD = noVar.d(i);
            if (65 <= bD && bD < 91) {
                c80.v("PROTOCOL_ERROR response malformed: mixed case name: ".concat(noVar.j()));
                return;
            }
        }
    }
}
