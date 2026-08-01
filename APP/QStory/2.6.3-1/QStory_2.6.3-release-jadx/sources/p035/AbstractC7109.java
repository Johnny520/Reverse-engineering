package p035;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7109 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f17682;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7093[] f17683;

    static {
        C7093 c7093 = new C7093("", C7093.f17595);
        ByteString byteString = C7093.f17590;
        C7093 c70932 = new C7093("GET", byteString);
        C7093 c70933 = new C7093("POST", byteString);
        ByteString byteString2 = C7093.f17594;
        C7093 c70934 = new C7093("/", byteString2);
        C7093 c70935 = new C7093("/index.html", byteString2);
        ByteString byteString3 = C7093.f17593;
        C7093 c70936 = new C7093("http", byteString3);
        C7093 c70937 = new C7093("https", byteString3);
        ByteString byteString4 = C7093.f17591;
        C7093[] c7093Arr = {c7093, c70932, c70933, c70934, c70935, c70936, c70937, new C7093("200", byteString4), new C7093("204", byteString4), new C7093("206", byteString4), new C7093("304", byteString4), new C7093("400", byteString4), new C7093("404", byteString4), new C7093("500", byteString4), new C7093("accept-charset", ""), new C7093("accept-encoding", "gzip, deflate"), new C7093("accept-language", ""), new C7093("accept-ranges", ""), new C7093("accept", ""), new C7093("access-control-allow-origin", ""), new C7093("age", ""), new C7093("allow", ""), new C7093("authorization", ""), new C7093("cache-control", ""), new C7093("content-disposition", ""), new C7093("content-encoding", ""), new C7093("content-language", ""), new C7093("content-length", ""), new C7093("content-location", ""), new C7093("content-range", ""), new C7093("content-type", ""), new C7093("cookie", ""), new C7093("date", ""), new C7093("etag", ""), new C7093("expect", ""), new C7093("expires", ""), new C7093("from", ""), new C7093("host", ""), new C7093("if-match", ""), new C7093("if-modified-since", ""), new C7093("if-none-match", ""), new C7093("if-range", ""), new C7093("if-unmodified-since", ""), new C7093("last-modified", ""), new C7093("link", ""), new C7093("location", ""), new C7093("max-forwards", ""), new C7093("proxy-authenticate", ""), new C7093("proxy-authorization", ""), new C7093("range", ""), new C7093("referer", ""), new C7093("refresh", ""), new C7093("retry-after", ""), new C7093("server", ""), new C7093("set-cookie", ""), new C7093("strict-transport-security", ""), new C7093("transfer-encoding", ""), new C7093("user-agent", ""), new C7093("vary", ""), new C7093("via", ""), new C7093("www-authenticate", "")};
        f17683 = c7093Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c7093Arr[i].f17598)) {
                linkedHashMap.put(c7093Arr[i].f17598, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        f17682 = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12375(ByteString byteString) {
        byteString.getClass();
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            if (65 <= b && b < 91) {
                C7092.m12336(byteString.utf8(), "PROTOCOL_ERROR response malformed: mixed case name: ");
                return;
            }
        }
    }
}
