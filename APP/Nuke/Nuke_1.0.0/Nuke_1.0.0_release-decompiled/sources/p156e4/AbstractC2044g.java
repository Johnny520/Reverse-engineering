package p156e4;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p117X2.AbstractC1665j;
import p208n4.C2709h;

/* JADX INFO: renamed from: e4.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2044g {

    /* JADX INFO: renamed from: a */
    public static final C2041d[] f6818a;

    /* JADX INFO: renamed from: b */
    public static final Map f6819b;

    static {
        C2041d c2041d = new C2041d(C2041d.f6798i, "");
        C2709h c2709h = C2041d.f6795f;
        C2041d c2041d2 = new C2041d(c2709h, "GET");
        C2041d c2041d3 = new C2041d(c2709h, "POST");
        C2709h c2709h2 = C2041d.f6796g;
        C2041d c2041d4 = new C2041d(c2709h2, "/");
        C2041d c2041d5 = new C2041d(c2709h2, "/index.html");
        C2709h c2709h3 = C2041d.f6797h;
        C2041d c2041d6 = new C2041d(c2709h3, "http");
        C2041d c2041d7 = new C2041d(c2709h3, "https");
        C2709h c2709h4 = C2041d.f6794e;
        C2041d[] c2041dArr = {c2041d, c2041d2, c2041d3, c2041d4, c2041d5, c2041d6, c2041d7, new C2041d(c2709h4, "200"), new C2041d(c2709h4, "204"), new C2041d(c2709h4, "206"), new C2041d(c2709h4, "304"), new C2041d(c2709h4, "400"), new C2041d(c2709h4, "404"), new C2041d(c2709h4, "500"), new C2041d("accept-charset", ""), new C2041d("accept-encoding", "gzip, deflate"), new C2041d("accept-language", ""), new C2041d("accept-ranges", ""), new C2041d("accept", ""), new C2041d("access-control-allow-origin", ""), new C2041d("age", ""), new C2041d("allow", ""), new C2041d("authorization", ""), new C2041d("cache-control", ""), new C2041d("content-disposition", ""), new C2041d("content-encoding", ""), new C2041d("content-language", ""), new C2041d("content-length", ""), new C2041d("content-location", ""), new C2041d("content-range", ""), new C2041d("content-type", ""), new C2041d("cookie", ""), new C2041d("date", ""), new C2041d("etag", ""), new C2041d("expect", ""), new C2041d("expires", ""), new C2041d("from", ""), new C2041d("host", ""), new C2041d("if-match", ""), new C2041d("if-modified-since", ""), new C2041d("if-none-match", ""), new C2041d("if-range", ""), new C2041d("if-unmodified-since", ""), new C2041d("last-modified", ""), new C2041d("link", ""), new C2041d("location", ""), new C2041d("max-forwards", ""), new C2041d("proxy-authenticate", ""), new C2041d("proxy-authorization", ""), new C2041d("range", ""), new C2041d("referer", ""), new C2041d("refresh", ""), new C2041d("retry-after", ""), new C2041d("server", ""), new C2041d("set-cookie", ""), new C2041d("strict-transport-security", ""), new C2041d("transfer-encoding", ""), new C2041d("user-agent", ""), new C2041d("vary", ""), new C2041d("via", ""), new C2041d("www-authenticate", "")};
        f6818a = c2041dArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i5 = 0; i5 < 61; i5++) {
            if (!linkedHashMap.containsKey(c2041dArr[i5].f6799a)) {
                linkedHashMap.put(c2041dArr[i5].f6799a, Integer.valueOf(i5));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC1665j.m2984d(mapUnmodifiableMap, "unmodifiableMap(...)");
        f6819b = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: a */
    public static void m3748a(C2709h c2709h) throws IOException {
        AbstractC1665j.m2985e(c2709h, "name");
        int iMo4732a = c2709h.mo4732a();
        for (int i5 = 0; i5 < iMo4732a; i5++) {
            byte bMo4735d = c2709h.mo4735d(i5);
            if (65 <= bMo4735d && bMo4735d < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c2709h.m4741j()));
            }
        }
    }
}
