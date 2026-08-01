package p022;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6284 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f17355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6268[] f17356;

    static {
        C6268 c6268 = new C6268("", C6268.f17268);
        ByteString byteString = C6268.f17263;
        C6268 c62682 = new C6268("GET", byteString);
        C6268 c62683 = new C6268("POST", byteString);
        ByteString byteString2 = C6268.f17267;
        C6268 c62684 = new C6268("/", byteString2);
        C6268 c62685 = new C6268("/index.html", byteString2);
        ByteString byteString3 = C6268.f17266;
        C6268 c62686 = new C6268("http", byteString3);
        C6268 c62687 = new C6268("https", byteString3);
        ByteString byteString4 = C6268.f17264;
        C6268[] c6268Arr = {c6268, c62682, c62683, c62684, c62685, c62686, c62687, new C6268("200", byteString4), new C6268("204", byteString4), new C6268("206", byteString4), new C6268("304", byteString4), new C6268("400", byteString4), new C6268("404", byteString4), new C6268("500", byteString4), new C6268("accept-charset", ""), new C6268("accept-encoding", "gzip, deflate"), new C6268("accept-language", ""), new C6268("accept-ranges", ""), new C6268("accept", ""), new C6268("access-control-allow-origin", ""), new C6268("age", ""), new C6268("allow", ""), new C6268("authorization", ""), new C6268("cache-control", ""), new C6268("content-disposition", ""), new C6268("content-encoding", ""), new C6268("content-language", ""), new C6268("content-length", ""), new C6268("content-location", ""), new C6268("content-range", ""), new C6268("content-type", ""), new C6268("cookie", ""), new C6268("date", ""), new C6268("etag", ""), new C6268("expect", ""), new C6268("expires", ""), new C6268("from", ""), new C6268("host", ""), new C6268("if-match", ""), new C6268("if-modified-since", ""), new C6268("if-none-match", ""), new C6268("if-range", ""), new C6268("if-unmodified-since", ""), new C6268("last-modified", ""), new C6268("link", ""), new C6268("location", ""), new C6268("max-forwards", ""), new C6268("proxy-authenticate", ""), new C6268("proxy-authorization", ""), new C6268("range", ""), new C6268("referer", ""), new C6268("refresh", ""), new C6268("retry-after", ""), new C6268("server", ""), new C6268("set-cookie", ""), new C6268("strict-transport-security", ""), new C6268("transfer-encoding", ""), new C6268("user-agent", ""), new C6268("vary", ""), new C6268("via", ""), new C6268("www-authenticate", "")};
        f17356 = c6268Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c6268Arr[i].f17271)) {
                linkedHashMap.put(c6268Arr[i].f17271, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        f17355 = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11799(ByteString byteString) {
        byteString.getClass();
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            if (65 <= b && b < 91) {
                C6267.m11760(byteString.utf8(), "PROTOCOL_ERROR response malformed: mixed case name: ");
                return;
            }
        }
    }
}
