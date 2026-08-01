package p252;

import com.android.p002dx.p005io.Opcodes;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import p050.AbstractC7176;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8926 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C8926 f22685;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C8926 f22686;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C8926 f22687;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C8926 f22688;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C8926 f22689;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C8926 f22690;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final List f22691;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C8926 f22692;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final C8926 f22693;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final C8926 f22694;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C8926 f22695;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C8926 f22696;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C8926 f22697;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C8926 f22698;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C8926 f22699;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C8926 f22700;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C8926 f22701;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8926 f22702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f22703;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f22704;

    static {
        C8926 c8926 = new C8926(100, "Continue");
        f22702 = c8926;
        C8926 c89262 = new C8926(101, "Switching Protocols");
        f22697 = c89262;
        C8926 c89263 = new C8926(102, "Processing");
        C8926 c89264 = new C8926(200, "OK");
        f22696 = c89264;
        C8926 c89265 = new C8926(201, "Created");
        C8926 c89266 = new C8926(Opcodes.REM_FLOAT_2ADDR, "Accepted");
        C8926 c89267 = new C8926(Opcodes.ADD_DOUBLE_2ADDR, "Non-Authoritative Information");
        C8926 c89268 = new C8926(Opcodes.SUB_DOUBLE_2ADDR, "No Content");
        f22700 = c89268;
        C8926 c89269 = new C8926(Opcodes.MUL_DOUBLE_2ADDR, "Reset Content");
        C8926 c892610 = new C8926(Opcodes.DIV_DOUBLE_2ADDR, "Partial Content");
        C8926 c892611 = new C8926(Opcodes.REM_DOUBLE_2ADDR, "Multi-Status");
        C8926 c892612 = new C8926(300, "Multiple Choices");
        C8926 c892613 = new C8926(301, "Moved Permanently");
        C8926 c892614 = new C8926(302, "Found");
        C8926 c892615 = new C8926(303, "See Other");
        C8926 c892616 = new C8926(304, "Not Modified");
        f22701 = c892616;
        C8926 c892617 = new C8926(305, "Use Proxy");
        C8926 c892618 = new C8926(306, "Switch Proxy");
        C8926 c892619 = new C8926(307, "Temporary Redirect");
        C8926 c892620 = new C8926(308, "Permanent Redirect");
        C8926 c892621 = new C8926(400, "Bad Request");
        f22698 = c892621;
        C8926 c892622 = new C8926(401, "Unauthorized");
        C8926 c892623 = new C8926(402, "Payment Required");
        C8926 c892624 = new C8926(403, "Forbidden");
        f22699 = c892624;
        C8926 c892625 = new C8926(404, "Not Found");
        f22690 = c892625;
        C8926 c892626 = new C8926(405, "Method Not Allowed");
        f22689 = c892626;
        C8926 c892627 = new C8926(406, "Not Acceptable");
        f22688 = c892627;
        C8926 c892628 = new C8926(407, "Proxy Authentication Required");
        C8926 c892629 = new C8926(408, "Request Timeout");
        C8926 c892630 = new C8926(409, "Conflict");
        C8926 c892631 = new C8926(410, "Gone");
        f22687 = c892631;
        C8926 c892632 = new C8926(411, "Length Required");
        C8926 c892633 = new C8926(412, "Precondition Failed");
        f22686 = c892633;
        C8926 c892634 = new C8926(413, "Payload Too Large");
        f22685 = c892634;
        C8926 c892635 = new C8926(414, "Request-URI Too Long");
        C8926 c892636 = new C8926(415, "Unsupported Media Type");
        f22695 = c892636;
        C8926 c892637 = new C8926(416, "Requested Range Not Satisfiable");
        C8926 c892638 = new C8926(417, "Expectation Failed");
        f22694 = c892638;
        C8926 c892639 = new C8926(422, "Unprocessable Entity");
        C8926 c892640 = new C8926(423, "Locked");
        C8926 c892641 = new C8926(424, "Failed Dependency");
        C8926 c892642 = new C8926(425, "Too Early");
        C8926 c892643 = new C8926(426, "Upgrade Required");
        C8926 c892644 = new C8926(429, "Too Many Requests");
        C8926 c892645 = new C8926(431, "Request Header Fields Too Large");
        C8926 c892646 = new C8926(500, "Internal Server Error");
        f22693 = c892646;
        C8926 c892647 = new C8926(501, "Not Implemented");
        C8926 c892648 = new C8926(502, "Bad Gateway");
        C8926 c892649 = new C8926(503, "Service Unavailable");
        C8926 c892650 = new C8926(504, "Gateway Timeout");
        f22692 = c892650;
        List listM12490 = AbstractC7176.m12490(c8926, c89262, c89263, c89264, c89265, c89266, c89267, c89268, c89269, c892610, c892611, c892612, c892613, c892614, c892615, c892616, c892617, c892618, c892619, c892620, c892621, c892622, c892623, c892624, c892625, c892626, c892627, c892628, c892629, c892630, c892631, c892632, c892633, c892634, c892635, c892636, c892637, c892638, c892639, c892640, c892641, c892642, c892643, c892644, c892645, c892646, c892647, c892648, c892649, c892650, new C8926(505, "HTTP Version Not Supported"), new C8926(506, "Variant Also Negotiates"), new C8926(507, "Insufficient Storage"));
        f22691 = listM12490;
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(listM12490, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        for (Object obj : listM12490) {
            linkedHashMap.put(Integer.valueOf(((C8926) obj).f22704), obj);
        }
    }

    public C8926(int i, String str) {
        str.getClass();
        this.f22704 = i;
        this.f22703 = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8926 c8926 = (C8926) obj;
        c8926.getClass();
        return this.f22704 - c8926.f22704;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8926) && ((C8926) obj).f22704 == this.f22704;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22704);
    }

    public final String toString() {
        return this.f22704 + ' ' + this.f22703;
    }
}
