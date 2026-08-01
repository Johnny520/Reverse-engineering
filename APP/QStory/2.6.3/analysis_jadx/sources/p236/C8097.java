package p236;

import com.android.dx.io.Opcodes;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import p034.AbstractC6347;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8097 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C8097 f22340;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C8097 f22341;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C8097 f22342;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C8097 f22343;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C8097 f22344;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C8097 f22345;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final List f22346;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C8097 f22347;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final C8097 f22348;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final C8097 f22349;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C8097 f22350;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C8097 f22351;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C8097 f22352;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C8097 f22353;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C8097 f22354;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C8097 f22355;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C8097 f22356;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8097 f22357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f22358;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f22359;

    static {
        C8097 c8097 = new C8097(100, "Continue");
        f22357 = c8097;
        C8097 c80972 = new C8097(101, "Switching Protocols");
        f22352 = c80972;
        C8097 c80973 = new C8097(102, "Processing");
        C8097 c80974 = new C8097(200, "OK");
        f22351 = c80974;
        C8097 c80975 = new C8097(201, "Created");
        C8097 c80976 = new C8097(Opcodes.REM_FLOAT_2ADDR, "Accepted");
        C8097 c80977 = new C8097(Opcodes.ADD_DOUBLE_2ADDR, "Non-Authoritative Information");
        C8097 c80978 = new C8097(Opcodes.SUB_DOUBLE_2ADDR, "No Content");
        f22355 = c80978;
        C8097 c80979 = new C8097(Opcodes.MUL_DOUBLE_2ADDR, "Reset Content");
        C8097 c809710 = new C8097(Opcodes.DIV_DOUBLE_2ADDR, "Partial Content");
        C8097 c809711 = new C8097(Opcodes.REM_DOUBLE_2ADDR, "Multi-Status");
        C8097 c809712 = new C8097(300, "Multiple Choices");
        C8097 c809713 = new C8097(301, "Moved Permanently");
        C8097 c809714 = new C8097(302, "Found");
        C8097 c809715 = new C8097(303, "See Other");
        C8097 c809716 = new C8097(304, "Not Modified");
        f22356 = c809716;
        C8097 c809717 = new C8097(305, "Use Proxy");
        C8097 c809718 = new C8097(306, "Switch Proxy");
        C8097 c809719 = new C8097(307, "Temporary Redirect");
        C8097 c809720 = new C8097(308, "Permanent Redirect");
        C8097 c809721 = new C8097(400, "Bad Request");
        f22353 = c809721;
        C8097 c809722 = new C8097(401, "Unauthorized");
        C8097 c809723 = new C8097(402, "Payment Required");
        C8097 c809724 = new C8097(403, "Forbidden");
        f22354 = c809724;
        C8097 c809725 = new C8097(404, "Not Found");
        f22345 = c809725;
        C8097 c809726 = new C8097(405, "Method Not Allowed");
        f22344 = c809726;
        C8097 c809727 = new C8097(406, "Not Acceptable");
        f22343 = c809727;
        C8097 c809728 = new C8097(407, "Proxy Authentication Required");
        C8097 c809729 = new C8097(408, "Request Timeout");
        C8097 c809730 = new C8097(409, "Conflict");
        C8097 c809731 = new C8097(410, "Gone");
        f22342 = c809731;
        C8097 c809732 = new C8097(411, "Length Required");
        C8097 c809733 = new C8097(412, "Precondition Failed");
        f22341 = c809733;
        C8097 c809734 = new C8097(413, "Payload Too Large");
        f22340 = c809734;
        C8097 c809735 = new C8097(414, "Request-URI Too Long");
        C8097 c809736 = new C8097(415, "Unsupported Media Type");
        f22350 = c809736;
        C8097 c809737 = new C8097(416, "Requested Range Not Satisfiable");
        C8097 c809738 = new C8097(417, "Expectation Failed");
        f22349 = c809738;
        C8097 c809739 = new C8097(422, "Unprocessable Entity");
        C8097 c809740 = new C8097(423, "Locked");
        C8097 c809741 = new C8097(424, "Failed Dependency");
        C8097 c809742 = new C8097(425, "Too Early");
        C8097 c809743 = new C8097(426, "Upgrade Required");
        C8097 c809744 = new C8097(429, "Too Many Requests");
        C8097 c809745 = new C8097(431, "Request Header Fields Too Large");
        C8097 c809746 = new C8097(500, "Internal Server Error");
        f22348 = c809746;
        C8097 c809747 = new C8097(501, "Not Implemented");
        C8097 c809748 = new C8097(502, "Bad Gateway");
        C8097 c809749 = new C8097(503, "Service Unavailable");
        C8097 c809750 = new C8097(504, "Gateway Timeout");
        f22347 = c809750;
        List listM11931 = AbstractC6347.m11931(c8097, c80972, c80973, c80974, c80975, c80976, c80977, c80978, c80979, c809710, c809711, c809712, c809713, c809714, c809715, c809716, c809717, c809718, c809719, c809720, c809721, c809722, c809723, c809724, c809725, c809726, c809727, c809728, c809729, c809730, c809731, c809732, c809733, c809734, c809735, c809736, c809737, c809738, c809739, c809740, c809741, c809742, c809743, c809744, c809745, c809746, c809747, c809748, c809749, c809750, new C8097(505, "HTTP Version Not Supported"), new C8097(506, "Variant Also Negotiates"), new C8097(507, "Insufficient Storage"));
        f22346 = listM11931;
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(listM11931, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
        for (Object obj : listM11931) {
            linkedHashMap.put(Integer.valueOf(((C8097) obj).f22359), obj);
        }
    }

    public C8097(int i, String str) {
        str.getClass();
        this.f22359 = i;
        this.f22358 = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8097 c8097 = (C8097) obj;
        c8097.getClass();
        return this.f22359 - c8097.f22359;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8097) && ((C8097) obj).f22359 == this.f22359;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22359);
    }

    public final String toString() {
        return this.f22359 + ' ' + this.f22358;
    }
}
