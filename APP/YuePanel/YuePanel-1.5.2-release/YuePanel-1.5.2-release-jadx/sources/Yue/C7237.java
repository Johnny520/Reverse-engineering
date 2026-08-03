package Yue;

import java.io.IOException;
import java.io.Reader;
import java.util.Hashtable;
import java.util.Stack;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۡۧۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7237 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final C7864 f21843 = new C7864(0, "LTQUES");

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final C7864 f21844 = new C7864(1, "IDENTIFIER");

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final C7864 f21845 = new C7864(2, "EQUAL");

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final C7864 f21846 = new C7864(3, "LPAREN");

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final C7864 f21847 = new C7864(4, "RPAREN");

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final C7864 f21848 = new C7864(5, "COMMA");

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final C7864 f21849 = new C7864(6, "STRING");

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final C7864 f21850 = new C7864(7, "QUESGT");

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final C7864 f21851 = new C7864(8, "LTBANG");

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final C7864 f21852 = new C7864(9, "GT");

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final C7864 f21853 = new C7864(10, "PIPE");

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final C7864 f21854 = new C7864(11, "QUES");

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final C7864 f21855 = new C7864(12, "PLUS");

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final C7864 f21856 = new C7864(13, "ASTERISK");

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final C7864 f21857 = new C7864(14, "LT");

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final C7864 f21858 = new C7864(15, "EOF");

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final C7864 f21859 = new C7864(16, "COMMENT");

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final C7864 f21860 = new C7864(17, "PERCENT");

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final C7864 f21861 = new C7864(18, "CONDITIONAL");

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final C7864 f21862 = new C7864(19, "ENDCONDITIONAL");

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final C7864 f21863 = new C7864(20, "NMTOKEN");

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static char[][] f21864 = {new char[]{'A', 'Z'}, new char[]{'a', 'z'}, new char[]{192, 214}, new char[]{216, 246}, new char[]{248, 255}, new char[]{256, 305}, new char[]{308, 318}, new char[]{321, 328}, new char[]{330, 382}, new char[]{384, 451}, new char[]{461, 496}, new char[]{500, 501}, new char[]{506, 535}, new char[]{592, 680}, new char[]{699, 705}, new char[]{902, 902}, new char[]{904, 906}, new char[]{908, 908}, new char[]{910, 929}, new char[]{931, 974}, new char[]{976, 982}, new char[]{986, 986}, new char[]{988, 988}, new char[]{990, 990}, new char[]{992, 992}, new char[]{994, 1011}, new char[]{1025, 1036}, new char[]{1038, 1103}, new char[]{1105, 1116}, new char[]{1118, 1153}, new char[]{1168, 1220}, new char[]{1223, 1224}, new char[]{1227, 1228}, new char[]{1232, 1259}, new char[]{1262, 1269}, new char[]{1272, 1273}, new char[]{1329, 1366}, new char[]{1369, 1369}, new char[]{1377, 1414}, new char[]{1488, 1514}, new char[]{1520, 1522}, new char[]{1569, 1594}, new char[]{1601, 1610}, new char[]{1649, 1719}, new char[]{1722, 1726}, new char[]{1728, 1742}, new char[]{1744, 1747}, new char[]{1749, 1749}, new char[]{1765, 1766}, new char[]{2309, 2361}, new char[]{2365, 2365}, new char[]{2392, 2401}, new char[]{2437, 2444}, new char[]{2447, 2448}, new char[]{2451, 2472}, new char[]{2474, 2480}, new char[]{2482, 2482}, new char[]{2486, 2489}, new char[]{2524, 2525}, new char[]{2527, 2529}, new char[]{2544, 2545}, new char[]{2565, 2570}, new char[]{2575, 2576}, new char[]{2579, 2600}, new char[]{2602, 2608}, new char[]{2610, 2611}, new char[]{2613, 2614}, new char[]{2616, 2617}, new char[]{2649, 2652}, new char[]{2654, 2654}, new char[]{2674, 2676}, new char[]{2693, 2699}, new char[]{2701, 2701}, new char[]{2703, 2705}, new char[]{2707, 2728}, new char[]{2730, 2736}, new char[]{2738, 2739}, new char[]{2741, 2745}, new char[]{2749, 2749}, new char[]{2784, 2784}, new char[]{2821, 2828}, new char[]{2831, 2832}, new char[]{2835, 2856}, new char[]{2858, 2864}, new char[]{2866, 2867}, new char[]{2870, 2873}, new char[]{2877, 2877}, new char[]{2908, 2909}, new char[]{2911, 2913}, new char[]{2949, 2954}, new char[]{2958, 2960}, new char[]{2962, 2965}, new char[]{2969, 2970}, new char[]{2972, 2972}, new char[]{2974, 2975}, new char[]{2979, 2980}, new char[]{2984, 2986}, new char[]{2990, 2997}, new char[]{2999, 3001}, new char[]{3077, 3084}, new char[]{3086, 3088}, new char[]{3090, 3112}, new char[]{3114, 3123}, new char[]{3125, 3129}, new char[]{3168, 3169}, new char[]{3205, 3212}, new char[]{3214, 3216}, new char[]{3218, 3240}, new char[]{3242, 3251}, new char[]{3253, 3257}, new char[]{3294, 3294}, new char[]{3296, 3297}, new char[]{3333, 3340}, new char[]{3342, 3344}, new char[]{3346, 3368}, new char[]{3370, 3385}, new char[]{3424, 3425}, new char[]{3585, 3630}, new char[]{3632, 3632}, new char[]{3634, 3635}, new char[]{3648, 3653}, new char[]{3713, 3714}, new char[]{3716, 3716}, new char[]{3719, 3720}, new char[]{3722, 3722}, new char[]{3725, 3725}, new char[]{3732, 3735}, new char[]{3737, 3743}, new char[]{3745, 3747}, new char[]{3749, 3749}, new char[]{3751, 3751}, new char[]{3754, 3755}, new char[]{3757, 3758}, new char[]{3760, 3760}, new char[]{3762, 3763}, new char[]{3773, 3773}, new char[]{3776, 3780}, new char[]{3904, 3911}, new char[]{3913, 3945}, new char[]{4256, 4293}, new char[]{4304, 4342}, new char[]{4352, 4352}, new char[]{4354, 4355}, new char[]{4357, 4359}, new char[]{4361, 4361}, new char[]{4363, 4364}, new char[]{4366, 4370}, new char[]{4412, 4412}, new char[]{4414, 4414}, new char[]{4416, 4416}, new char[]{4428, 4428}, new char[]{4430, 4430}, new char[]{4432, 4432}, new char[]{4436, 4437}, new char[]{4441, 4441}, new char[]{4447, 4449}, new char[]{4451, 4451}, new char[]{4453, 4453}, new char[]{4455, 4455}, new char[]{4457, 4457}, new char[]{4461, 4462}, new char[]{4466, 4467}, new char[]{4469, 4469}, new char[]{4510, 4510}, new char[]{4520, 4520}, new char[]{4523, 4523}, new char[]{4526, 4527}, new char[]{4535, 4536}, new char[]{4538, 4538}, new char[]{4540, 4546}, new char[]{4587, 4587}, new char[]{4592, 4592}, new char[]{4601, 4601}, new char[]{7680, 7835}, new char[]{7840, 7929}, new char[]{7936, 7957}, new char[]{7960, 7965}, new char[]{7968, 8005}, new char[]{8008, 8013}, new char[]{8016, 8023}, new char[]{8025, 8025}, new char[]{8027, 8027}, new char[]{8029, 8029}, new char[]{8031, 8061}, new char[]{8064, 8116}, new char[]{8118, 8124}, new char[]{8126, 8126}, new char[]{8130, 8132}, new char[]{8134, 8140}, new char[]{8144, 8147}, new char[]{8150, 8155}, new char[]{8160, 8172}, new char[]{8178, 8180}, new char[]{8182, 8188}, new char[]{8486, 8486}, new char[]{8490, 8491}, new char[]{8494, 8494}, new char[]{8576, 8578}, new char[]{12353, 12436}, new char[]{12449, 12538}, new char[]{12549, 12588}, new char[]{44032, 55203}};

    /* JADX INFO: renamed from: ۥ */
    public C1218 f2755;

    /* JADX INFO: renamed from: ۥ۟ */
    public Stack f2756;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C7862 f21865;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f21866;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f21867;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f21868;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public char[] f21869;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f21870;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Hashtable f21871;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public InterfaceC4650 f21872;

    /* JADX INFO: renamed from: Yue.ۥۡۧۤۤ$ۥ */
    public class C1218 {

        /* JADX INFO: renamed from: ۥ */
        public String f2757;

        /* JADX INFO: renamed from: ۥ۟ */
        public Reader f2758;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f21873 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f21874 = 1;

        public C1218(String str, Reader reader) {
            this.f2757 = str;
            this.f2758 = reader;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7237(Reader reader, InterfaceC4650 interfaceC4650) {
        this(reader, false, interfaceC4650);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3522(String str, String str2) {
        Hashtable hashtable = this.f21871;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("%");
        stringBuffer.append(str);
        stringBuffer.append(";");
        hashtable.put(stringBuffer.toString(), str2);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3523(char[] cArr) {
        char[] cArr2 = this.f21869;
        if (cArr2 == null) {
            this.f21869 = cArr;
            this.f21870 = 0;
            if (cArr.length == 0) {
                this.f21869 = null;
                this.f21870 = -1;
                return;
            }
            return;
        }
        int length = cArr2.length - this.f21870;
        char[] cArr3 = new char[cArr.length + length];
        System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
        System.arraycopy(this.f21869, this.f21870, cArr3, cArr.length, length);
        this.f21870 = 0;
        this.f21869 = cArr3;
        if (cArr3.length == 0) {
            this.f21869 = null;
            this.f21870 = -1;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m22645(String str) throws IOException {
        Reader readerM12357;
        String str2 = (String) this.f21871.get(str);
        if (str2 != null) {
            m3523(str2.toCharArray());
            return true;
        }
        C4281 c4281Mo1250 = this.f21872.mo1250(str.substring(1, str.length() - 1));
        if (c4281Mo1250 == null || (readerM12357 = c4281Mo1250.m12357()) == null) {
            return false;
        }
        if (this.f2756 == null) {
            this.f2756 = new Stack();
        }
        this.f2756.push(this.f2755);
        this.f2755 = new C1218(c4281Mo1250.m12354(), readerM12357);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C7862 m22646() throws IOException {
        if (this.f21865 == null) {
            this.f21865 = m22663();
        }
        C7862 c7862 = this.f21865;
        this.f21865 = null;
        return c7862;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m22647() {
        return this.f2755.f21874;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m22648() {
        return this.f2755.f21873;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public String m22649(char c) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int iM22661 = m22661();
            if (iM22661 >= 0 && iM22661 != c) {
                stringBuffer.append((char) iM22661);
            }
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public String m22650() {
        return this.f2755.f2757;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m22651(char c) {
        char[] cArr;
        char c2;
        int i = 0;
        while (true) {
            char[][] cArr2 = f21864;
            if (i >= cArr2.length || c < (c2 = (cArr = cArr2[i])[0])) {
                return false;
            }
            if (c >= c2 && c <= cArr[1]) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m22652(char c) {
        if (c < 768) {
            return false;
        }
        if (c >= 768 && c <= 837) {
            return true;
        }
        if (c >= 864 && c <= 865) {
            return true;
        }
        if (c >= 1155 && c <= 1158) {
            return true;
        }
        if (c >= 1425 && c <= 1441) {
            return true;
        }
        if (c >= 1443 && c <= 1465) {
            return true;
        }
        if ((c >= 1467 && c <= 1469) || c == 1471) {
            return true;
        }
        if ((c >= 1473 && c <= 1474) || c == 1476) {
            return true;
        }
        if ((c >= 1611 && c <= 1618) || c == 1648) {
            return true;
        }
        if (c >= 1750 && c <= 1756) {
            return true;
        }
        if (c >= 1757 && c <= 1759) {
            return true;
        }
        if (c >= 1760 && c <= 1764) {
            return true;
        }
        if (c >= 1767 && c <= 1768) {
            return true;
        }
        if (c >= 1770 && c <= 1773) {
            return true;
        }
        if ((c >= 2305 && c <= 2307) || c == 2364) {
            return true;
        }
        if ((c >= 2366 && c <= 2380) || c == 2381) {
            return true;
        }
        if (c >= 2385 && c <= 2388) {
            return true;
        }
        if (c >= 2402 && c <= 2403) {
            return true;
        }
        if ((c >= 2433 && c <= 2435) || c == 2492 || c == 2494 || c == 2495) {
            return true;
        }
        if (c >= 2496 && c <= 2500) {
            return true;
        }
        if (c >= 2503 && c <= 2504) {
            return true;
        }
        if ((c >= 2507 && c <= 2509) || c == 2519) {
            return true;
        }
        if ((c >= 2530 && c <= 2531) || c == 2562 || c == 2620 || c == 2622 || c == 2623) {
            return true;
        }
        if (c >= 2624 && c <= 2626) {
            return true;
        }
        if (c >= 2631 && c <= 2632) {
            return true;
        }
        if (c >= 2635 && c <= 2637) {
            return true;
        }
        if (c >= 2672 && c <= 2673) {
            return true;
        }
        if ((c >= 2689 && c <= 2691) || c == 2748) {
            return true;
        }
        if (c >= 2750 && c <= 2757) {
            return true;
        }
        if (c >= 2759 && c <= 2761) {
            return true;
        }
        if (c >= 2763 && c <= 2765) {
            return true;
        }
        if ((c >= 2817 && c <= 2819) || c == 2876) {
            return true;
        }
        if (c >= 2878 && c <= 2883) {
            return true;
        }
        if (c >= 2887 && c <= 2888) {
            return true;
        }
        if (c >= 2891 && c <= 2893) {
            return true;
        }
        if (c >= 2902 && c <= 2903) {
            return true;
        }
        if (c >= 2946 && c <= 2947) {
            return true;
        }
        if (c >= 3006 && c <= 3010) {
            return true;
        }
        if (c >= 3014 && c <= 3016) {
            return true;
        }
        if ((c >= 3018 && c <= 3021) || c == 3031) {
            return true;
        }
        if (c >= 3073 && c <= 3075) {
            return true;
        }
        if (c >= 3134 && c <= 3140) {
            return true;
        }
        if (c >= 3142 && c <= 3144) {
            return true;
        }
        if (c >= 3146 && c <= 3149) {
            return true;
        }
        if (c >= 3157 && c <= 3158) {
            return true;
        }
        if (c >= 3202 && c <= 3203) {
            return true;
        }
        if (c >= 3262 && c <= 3268) {
            return true;
        }
        if (c >= 3270 && c <= 3272) {
            return true;
        }
        if (c >= 3274 && c <= 3277) {
            return true;
        }
        if (c >= 3285 && c <= 3286) {
            return true;
        }
        if (c >= 3330 && c <= 3331) {
            return true;
        }
        if (c >= 3390 && c <= 3395) {
            return true;
        }
        if (c >= 3398 && c <= 3400) {
            return true;
        }
        if ((c >= 3402 && c <= 3405) || c == 3415 || c == 3633) {
            return true;
        }
        if (c >= 3636 && c <= 3642) {
            return true;
        }
        if ((c >= 3655 && c <= 3662) || c == 3761) {
            return true;
        }
        if (c >= 3764 && c <= 3769) {
            return true;
        }
        if (c >= 3771 && c <= 3772) {
            return true;
        }
        if (c >= 3784 && c <= 3789) {
            return true;
        }
        if ((c >= 3864 && c <= 3865) || c == 3893 || c == 3895 || c == 3897 || c == 3902 || c == 3903) {
            return true;
        }
        if (c >= 3953 && c <= 3972) {
            return true;
        }
        if (c >= 3974 && c <= 3979) {
            return true;
        }
        if ((c >= 3984 && c <= 3989) || c == 3991) {
            return true;
        }
        if (c >= 3993 && c <= 4013) {
            return true;
        }
        if ((c >= 4017 && c <= 4023) || c == 4025) {
            return true;
        }
        if ((c < 8400 || c > 8412) && c != 8417) {
            return (c >= 12330 && c <= 12335) || c == 12441 || c == 12442;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m22653(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 1632) {
            return false;
        }
        if (c >= 1632 && c <= 1641) {
            return true;
        }
        if (c < 1776) {
            return false;
        }
        if (c >= 1776 && c <= 1785) {
            return true;
        }
        if (c < 2406) {
            return false;
        }
        if (c >= 2406 && c <= 2415) {
            return true;
        }
        if (c < 2534) {
            return false;
        }
        if (c >= 2534 && c <= 2543) {
            return true;
        }
        if (c < 2662) {
            return false;
        }
        if (c >= 2662 && c <= 2671) {
            return true;
        }
        if (c < 2790) {
            return false;
        }
        if (c >= 2790 && c <= 2799) {
            return true;
        }
        if (c < 2918) {
            return false;
        }
        if (c >= 2918 && c <= 2927) {
            return true;
        }
        if (c < 3047) {
            return false;
        }
        if (c >= 3047 && c <= 3055) {
            return true;
        }
        if (c < 3174) {
            return false;
        }
        if (c >= 3174 && c <= 3183) {
            return true;
        }
        if (c < 3302) {
            return false;
        }
        if (c >= 3302 && c <= 3311) {
            return true;
        }
        if (c < 3430) {
            return false;
        }
        if (c >= 3430 && c <= 3439) {
            return true;
        }
        if (c < 3664) {
            return false;
        }
        if (c >= 3664 && c <= 3673) {
            return true;
        }
        if (c < 3792) {
            return false;
        }
        if (c < 3792 || c > 3801) {
            return c >= 3872 && c >= 3872 && c <= 3881;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m22654(char c) {
        if (c < 183) {
            return false;
        }
        if (c == 183 || c == 720 || c == 721 || c == 903 || c == 1600 || c == 3654) {
            return true;
        }
        if (c >= 12337 && c <= 12341) {
            return true;
        }
        if (c < 12445 || c > 12446) {
            return c >= 12540 && c <= 12542;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m22655(char c) {
        return m22657(c) || c == '_' || c == ':';
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m22656(char c) {
        if (c < 19968) {
            return false;
        }
        if ((c < 19968 || c > 40869) && c != 12295) {
            return c >= 12321 && c <= 12329;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m22657(char c) {
        return m22651(c) || m22656(c);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m22658(char c) {
        return m22657(c) || m22653(c) || c == '-' || c == '_' || c == '.' || c == ':' || m22652(c) || m22654(c);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C7862 m22659() throws IOException {
        if (this.f21865 == null) {
            this.f21865 = m22663();
        }
        return this.f21865;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int m22660() throws IOException {
        char[] cArr = this.f21869;
        if (cArr != null) {
            return cArr[this.f21870];
        }
        if (this.f21866 == 0) {
            int iM22662 = m22662();
            this.f21866 = iM22662;
            C1218 c1218 = this.f2755;
            c1218.f21874++;
            if (iM22662 == 10) {
                c1218.f21873++;
                c1218.f21874 = 1;
            }
        }
        return this.f21866;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int m22661() throws IOException {
        char[] cArr = this.f21869;
        if (cArr == null) {
            if (this.f21866 == 0) {
                m22660();
            }
            int i = this.f21866;
            this.f21866 = 0;
            if (this.f21868) {
                System.out.print((char) i);
            }
            return i;
        }
        int i2 = this.f21870;
        int i3 = i2 + 1;
        this.f21870 = i3;
        char c = cArr[i2];
        if (i3 >= cArr.length) {
            this.f21870 = -1;
            this.f21869 = null;
        }
        if (this.f21868) {
            System.out.print(c);
        }
        return c;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int m22662() throws IOException {
        Stack stack;
        int i = this.f2755.f2758.read();
        if (i >= 0 || (stack = this.f2756) == null || stack.empty()) {
            return i;
        }
        this.f2755.f2758.close();
        this.f2755 = (C1218) this.f2756.pop();
        return m22662();
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0390, code lost:
    
        r1 = new java.lang.StringBuffer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0399, code lost:
    
        if (m22660() == r0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x039b, code lost:
    
        r2 = m22661();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03a1, code lost:
    
        if (r2 != 92) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03a3, code lost:
    
        r1.append((char) m22661());
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03ac, code lost:
    
        if (r2 >= 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03af, code lost:
    
        r1.append((char) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03b4, code lost:
    
        m22661();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03c2, code lost:
    
        return new Yue.C7862(Yue.C7237.f21849, r1.toString());
     */
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7862 m22663() throws IOException {
        while (true) {
            int iM22661 = m22661();
            if (iM22661 == 60) {
                int iM22660 = m22660();
                if (iM22660 != 33) {
                    if (iM22660 != 63) {
                        return new C7862(f21857);
                    }
                    m22661();
                    return new C7862(f21843);
                }
                m22661();
                if (m22660() == 91) {
                    m22661();
                    return new C7862(f21861);
                }
                if (m22660() != 45) {
                    return new C7862(f21851);
                }
                m22661();
                if (m22660() != 45) {
                    String strM22650 = m22650();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Invalid character sequence <!-");
                    stringBuffer.append(m22661());
                    throw new C4292(strM22650, stringBuffer.toString(), m22648(), m22647());
                }
                m22661();
                StringBuffer stringBuffer2 = new StringBuffer();
                while (m22660() >= 0) {
                    if (m22660() != 45) {
                        stringBuffer2.append((char) m22661());
                    } else {
                        m22661();
                        if (m22660() < 0) {
                            String strM226502 = m22650();
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("Unterminated comment: <!--");
                            stringBuffer3.append(stringBuffer2.toString());
                            throw new C4292(strM226502, stringBuffer3.toString(), m22648(), m22647());
                        }
                        if (m22660() == 45) {
                            m22661();
                            if (m22660() == 62) {
                                m22661();
                                return new C7862(f21859, stringBuffer2.toString());
                            }
                            String strM226503 = m22650();
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append("Invalid character sequence --");
                            stringBuffer4.append(m22661());
                            throw new C4292(strM226503, stringBuffer4.toString(), m22648(), m22647());
                        }
                        stringBuffer2.append(SignatureVisitor.SUPER);
                    }
                }
                String strM226504 = m22650();
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("Unterminated comment: <!--");
                stringBuffer5.append(stringBuffer2.toString());
                throw new C4292(strM226504, stringBuffer5.toString(), m22648(), m22647());
            }
            if (iM22661 == 63) {
                return new C7862(f21854);
            }
            if (iM22661 == 34 || iM22661 == 39) {
                break;
            }
            if (iM22661 == 40) {
                return new C7862(f21846);
            }
            if (iM22661 == 41) {
                return new C7862(f21847);
            }
            if (iM22661 == 124) {
                return new C7862(f21853);
            }
            if (iM22661 == 62) {
                return new C7862(f21852);
            }
            if (iM22661 == 61) {
                return new C7862(f21845);
            }
            if (iM22661 == 42) {
                return new C7862(f21856);
            }
            if (iM22661 == 93) {
                if (m22661() != 93) {
                    String strM226505 = m22650();
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("Illegal character in input stream: ");
                    stringBuffer6.append(iM22661);
                    throw new C4292(strM226505, stringBuffer6.toString(), m22648(), m22647());
                }
                if (m22661() == 62) {
                    return new C7862(f21862);
                }
                String strM226506 = m22650();
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append("Illegal character in input stream: ");
                stringBuffer7.append(iM22661);
                throw new C4292(strM226506, stringBuffer7.toString(), m22648(), m22647());
            }
            if (iM22661 == 35) {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append((char) iM22661);
                if (m22655((char) m22660())) {
                    stringBuffer8.append((char) m22661());
                    while (m22658((char) m22660())) {
                        stringBuffer8.append((char) m22661());
                    }
                }
                return new C7862(f21844, stringBuffer8.toString());
            }
            if (iM22661 == 38 || iM22661 == 37) {
                if (iM22661 == 37 && Character.isWhitespace((char) m22660())) {
                    return new C7862(f21860);
                }
                boolean z = iM22661 == 37;
                StringBuffer stringBuffer9 = new StringBuffer();
                stringBuffer9.append((char) iM22661);
                if (m22655((char) m22660())) {
                    stringBuffer9.append((char) m22661());
                    while (m22658((char) m22660())) {
                        stringBuffer9.append((char) m22661());
                    }
                }
                if (m22661() != 59) {
                    String strM226507 = m22650();
                    StringBuffer stringBuffer10 = new StringBuffer();
                    stringBuffer10.append("Expected ';' after reference ");
                    stringBuffer10.append(stringBuffer9.toString());
                    stringBuffer10.append(", found '");
                    stringBuffer10.append(iM22661);
                    stringBuffer10.append("'");
                    throw new C4292(strM226507, stringBuffer10.toString(), m22648(), m22647());
                }
                stringBuffer9.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
                if (!z) {
                    return new C7862(f21844, stringBuffer9.toString());
                }
                m22645(stringBuffer9.toString());
            } else {
                if (iM22661 == 43) {
                    return new C7862(f21855);
                }
                if (iM22661 == 44) {
                    return new C7862(f21848);
                }
                char c = (char) iM22661;
                if (m22655(c)) {
                    StringBuffer stringBuffer11 = new StringBuffer();
                    stringBuffer11.append(c);
                    while (m22658((char) m22660())) {
                        stringBuffer11.append((char) m22661());
                    }
                    return new C7862(f21844, stringBuffer11.toString());
                }
                if (m22658(c)) {
                    StringBuffer stringBuffer12 = new StringBuffer();
                    stringBuffer12.append(c);
                    while (m22658((char) m22660())) {
                        stringBuffer12.append((char) m22661());
                    }
                    return new C7862(f21863, stringBuffer12.toString());
                }
                if (iM22661 < 0) {
                    if (this.f21867) {
                        throw new IOException("Read past EOF");
                    }
                    this.f21867 = true;
                    return new C7862(f21858);
                }
                if (!Character.isWhitespace(c)) {
                    String strM226508 = m22650();
                    StringBuffer stringBuffer13 = new StringBuffer();
                    stringBuffer13.append("Illegal character in input stream: ");
                    stringBuffer13.append(iM22661);
                    throw new C4292(strM226508, stringBuffer13.toString(), m22648(), m22647());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m22664() throws IOException {
        int iM22661 = 0;
        int i = 0;
        while (true) {
            if (iM22661 != 93) {
                iM22661 = m22661();
            }
            if (iM22661 == 93 && (iM22661 = m22661()) == 93 && (iM22661 = m22661()) == 62) {
                if (i == 0) {
                    return;
                } else {
                    i--;
                }
            }
            if (iM22661 == 60 && (iM22661 = m22661()) == 33 && (iM22661 = m22661()) == 91) {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m22665(char c) throws IOException {
        int iM22661;
        do {
            iM22661 = m22661();
            if (iM22661 < 0) {
                return;
            }
        } while (iM22661 != c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7237(Reader reader, boolean z, InterfaceC4650 interfaceC4650) {
        this.f2755 = new C1218("", reader);
        this.f21867 = false;
        this.f21868 = z;
        this.f21869 = null;
        this.f21871 = new Hashtable();
        this.f21872 = interfaceC4650;
    }
}
