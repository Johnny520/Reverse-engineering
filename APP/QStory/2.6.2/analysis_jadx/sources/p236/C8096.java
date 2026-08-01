package p236;

import com.android.dx.io.Opcodes;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4344;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8096 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C8096 f22342;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C8096 f22343;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C8096 f22344;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C8096 f22345;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C8096 f22346;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C8096 f22347;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final List f22348;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C8096 f22349;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final C8096 f22350;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final C8096 f22351;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C8096 f22352;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C8096 f22353;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C8096 f22354;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C8096 f22355;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C8096 f22356;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C8096 f22357;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C8096 f22358;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8096 f22359;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f22360;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f22361;

    static {
        C8096 c8096 = new C8096(100, "Continue");
        f22359 = c8096;
        C8096 c80962 = new C8096(101, "Switching Protocols");
        f22354 = c80962;
        C8096 c80963 = new C8096(102, "Processing");
        C8096 c80964 = new C8096(200, "OK");
        f22353 = c80964;
        C8096 c80965 = new C8096(201, "Created");
        C8096 c80966 = new C8096(Opcodes.REM_FLOAT_2ADDR, "Accepted");
        C8096 c80967 = new C8096(Opcodes.ADD_DOUBLE_2ADDR, "Non-Authoritative Information");
        C8096 c80968 = new C8096(Opcodes.SUB_DOUBLE_2ADDR, "No Content");
        f22357 = c80968;
        C8096 c80969 = new C8096(Opcodes.MUL_DOUBLE_2ADDR, "Reset Content");
        C8096 c809610 = new C8096(Opcodes.DIV_DOUBLE_2ADDR, "Partial Content");
        C8096 c809611 = new C8096(Opcodes.REM_DOUBLE_2ADDR, "Multi-Status");
        C8096 c809612 = new C8096(300, "Multiple Choices");
        C8096 c809613 = new C8096(301, "Moved Permanently");
        C8096 c809614 = new C8096(302, "Found");
        C8096 c809615 = new C8096(303, "See Other");
        C8096 c809616 = new C8096(304, "Not Modified");
        f22358 = c809616;
        C8096 c809617 = new C8096(305, "Use Proxy");
        C8096 c809618 = new C8096(306, "Switch Proxy");
        C8096 c809619 = new C8096(307, "Temporary Redirect");
        C8096 c809620 = new C8096(308, "Permanent Redirect");
        C8096 c809621 = new C8096(400, "Bad Request");
        f22355 = c809621;
        C8096 c809622 = new C8096(401, "Unauthorized");
        C8096 c809623 = new C8096(402, "Payment Required");
        C8096 c809624 = new C8096(403, "Forbidden");
        f22356 = c809624;
        C8096 c809625 = new C8096(404, "Not Found");
        f22347 = c809625;
        C8096 c809626 = new C8096(405, "Method Not Allowed");
        f22346 = c809626;
        C8096 c809627 = new C8096(406, "Not Acceptable");
        f22345 = c809627;
        C8096 c809628 = new C8096(407, "Proxy Authentication Required");
        C8096 c809629 = new C8096(408, "Request Timeout");
        C8096 c809630 = new C8096(409, "Conflict");
        C8096 c809631 = new C8096(410, "Gone");
        f22344 = c809631;
        C8096 c809632 = new C8096(411, "Length Required");
        C8096 c809633 = new C8096(412, "Precondition Failed");
        f22343 = c809633;
        C8096 c809634 = new C8096(413, "Payload Too Large");
        f22342 = c809634;
        C8096 c809635 = new C8096(414, "Request-URI Too Long");
        C8096 c809636 = new C8096(415, "Unsupported Media Type");
        f22352 = c809636;
        C8096 c809637 = new C8096(416, "Requested Range Not Satisfiable");
        C8096 c809638 = new C8096(417, "Expectation Failed");
        f22351 = c809638;
        C8096 c809639 = new C8096(422, "Unprocessable Entity");
        C8096 c809640 = new C8096(423, "Locked");
        C8096 c809641 = new C8096(424, "Failed Dependency");
        C8096 c809642 = new C8096(425, "Too Early");
        C8096 c809643 = new C8096(426, "Upgrade Required");
        C8096 c809644 = new C8096(429, "Too Many Requests");
        C8096 c809645 = new C8096(431, "Request Header Fields Too Large");
        C8096 c809646 = new C8096(500, "Internal Server Error");
        f22350 = c809646;
        C8096 c809647 = new C8096(501, "Not Implemented");
        C8096 c809648 = new C8096(502, "Bad Gateway");
        C8096 c809649 = new C8096(503, "Service Unavailable");
        C8096 c809650 = new C8096(504, "Gateway Timeout");
        f22349 = c809650;
        List listM13659 = AbstractC8189.m13659(c8096, c80962, c80963, c80964, c80965, c80966, c80967, c80968, c80969, c809610, c809611, c809612, c809613, c809614, c809615, c809616, c809617, c809618, c809619, c809620, c809621, c809622, c809623, c809624, c809625, c809626, c809627, c809628, c809629, c809630, c809631, c809632, c809633, c809634, c809635, c809636, c809637, c809638, c809639, c809640, c809641, c809642, c809643, c809644, c809645, c809646, c809647, c809648, c809649, c809650, new C8096(505, "HTTP Version Not Supported"), new C8096(506, "Variant Also Negotiates"), new C8096(507, "Insufficient Storage"));
        f22348 = listM13659;
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(listM13659, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
        for (Object obj : listM13659) {
            linkedHashMap.put(Integer.valueOf(((C8096) obj).f22361), obj);
        }
    }

    public C8096(int i, String str) {
        str.getClass();
        this.f22361 = i;
        this.f22360 = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8096 c8096 = (C8096) obj;
        c8096.getClass();
        return this.f22361 - c8096.f22361;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8096) && ((C8096) obj).f22361 == this.f22361;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22361);
    }

    public final String toString() {
        return this.f22361 + ' ' + this.f22360;
    }
}
