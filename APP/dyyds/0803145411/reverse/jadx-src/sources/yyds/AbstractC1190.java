package yyds;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛵᲀᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1190 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1843[] f5457;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Map f5458;

    static {
        C1843 c1843 = new C1843(C1843.f9265, "");
        C2534 c2534 = C1843.f9268;
        C1843 c18432 = new C1843(c2534, "GET");
        C1843 c18433 = new C1843(c2534, "POST");
        C2534 c25342 = C1843.f9267;
        C1843 c18434 = new C1843(c25342, "/");
        C1843 c18435 = new C1843(c25342, "/index.html");
        C2534 c25343 = C1843.f9264;
        C1843 c18436 = new C1843(c25343, "http");
        C1843 c18437 = new C1843(c25343, "https");
        C2534 c25344 = C1843.f9266;
        C1843[] c1843Arr = {c1843, c18432, c18433, c18434, c18435, c18436, c18437, new C1843(c25344, "200"), new C1843(c25344, "204"), new C1843(c25344, "206"), new C1843(c25344, "304"), new C1843(c25344, "400"), new C1843(c25344, "404"), new C1843(c25344, "500"), new C1843("accept-charset", ""), new C1843("accept-encoding", "gzip, deflate"), new C1843("accept-language", ""), new C1843("accept-ranges", ""), new C1843("accept", ""), new C1843("access-control-allow-origin", ""), new C1843("age", ""), new C1843("allow", ""), new C1843("authorization", ""), new C1843("cache-control", ""), new C1843("content-disposition", ""), new C1843("content-encoding", ""), new C1843("content-language", ""), new C1843("content-length", ""), new C1843("content-location", ""), new C1843("content-range", ""), new C1843("content-type", ""), new C1843("cookie", ""), new C1843("date", ""), new C1843("etag", ""), new C1843("expect", ""), new C1843("expires", ""), new C1843("from", ""), new C1843("host", ""), new C1843("if-match", ""), new C1843("if-modified-since", ""), new C1843("if-none-match", ""), new C1843("if-range", ""), new C1843("if-unmodified-since", ""), new C1843("last-modified", ""), new C1843("link", ""), new C1843("location", ""), new C1843("max-forwards", ""), new C1843("proxy-authenticate", ""), new C1843("proxy-authorization", ""), new C1843("range", ""), new C1843("referer", ""), new C1843("refresh", ""), new C1843("retry-after", ""), new C1843("server", ""), new C1843("set-cookie", ""), new C1843("strict-transport-security", ""), new C1843("transfer-encoding", ""), new C1843("user-agent", ""), new C1843("vary", ""), new C1843("via", ""), new C1843("www-authenticate", "")};
        f5457 = c1843Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c1843Arr[i].f9270)) {
                linkedHashMap.put(c1843Arr[i].f9270, Integer.valueOf(i));
            }
        }
        f5458 = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2394(C2534 c2534) throws IOException {
        int iMo4261 = c2534.mo4261();
        for (int i = 0; i < iMo4261; i++) {
            byte bMo4259 = c2534.mo4259(i);
            if (65 <= bMo4259 && bMo4259 < 91) {
                C0188.m804("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c2534.m4576()));
                return;
            }
        }
    }
}
