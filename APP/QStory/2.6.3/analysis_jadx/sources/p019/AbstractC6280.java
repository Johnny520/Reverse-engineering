package p019;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f17337;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6264[] f17338;

    static {
        C6264 c6264 = new C6264("", C6264.f17250);
        ByteString byteString = C6264.f17245;
        C6264 c62642 = new C6264("GET", byteString);
        C6264 c62643 = new C6264("POST", byteString);
        ByteString byteString2 = C6264.f17249;
        C6264 c62644 = new C6264("/", byteString2);
        C6264 c62645 = new C6264("/index.html", byteString2);
        ByteString byteString3 = C6264.f17248;
        C6264 c62646 = new C6264("http", byteString3);
        C6264 c62647 = new C6264("https", byteString3);
        ByteString byteString4 = C6264.f17246;
        C6264[] c6264Arr = {c6264, c62642, c62643, c62644, c62645, c62646, c62647, new C6264("200", byteString4), new C6264("204", byteString4), new C6264("206", byteString4), new C6264("304", byteString4), new C6264("400", byteString4), new C6264("404", byteString4), new C6264("500", byteString4), new C6264("accept-charset", ""), new C6264("accept-encoding", "gzip, deflate"), new C6264("accept-language", ""), new C6264("accept-ranges", ""), new C6264("accept", ""), new C6264("access-control-allow-origin", ""), new C6264("age", ""), new C6264("allow", ""), new C6264("authorization", ""), new C6264("cache-control", ""), new C6264("content-disposition", ""), new C6264("content-encoding", ""), new C6264("content-language", ""), new C6264("content-length", ""), new C6264("content-location", ""), new C6264("content-range", ""), new C6264("content-type", ""), new C6264("cookie", ""), new C6264("date", ""), new C6264("etag", ""), new C6264("expect", ""), new C6264("expires", ""), new C6264("from", ""), new C6264("host", ""), new C6264("if-match", ""), new C6264("if-modified-since", ""), new C6264("if-none-match", ""), new C6264("if-range", ""), new C6264("if-unmodified-since", ""), new C6264("last-modified", ""), new C6264("link", ""), new C6264("location", ""), new C6264("max-forwards", ""), new C6264("proxy-authenticate", ""), new C6264("proxy-authorization", ""), new C6264("range", ""), new C6264("referer", ""), new C6264("refresh", ""), new C6264("retry-after", ""), new C6264("server", ""), new C6264("set-cookie", ""), new C6264("strict-transport-security", ""), new C6264("transfer-encoding", ""), new C6264("user-agent", ""), new C6264("vary", ""), new C6264("via", ""), new C6264("www-authenticate", "")};
        f17338 = c6264Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c6264Arr[i].f17253)) {
                linkedHashMap.put(c6264Arr[i].f17253, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        f17337 = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11816(ByteString byteString) {
        byteString.getClass();
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            if (65 <= b && b < 91) {
                C6263.m11777(byteString.utf8(), "PROTOCOL_ERROR response malformed: mixed case name: ");
                return;
            }
        }
    }
}
