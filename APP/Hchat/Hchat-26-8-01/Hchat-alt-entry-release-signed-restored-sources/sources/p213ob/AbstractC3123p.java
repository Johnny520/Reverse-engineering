package p213ob;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p129ig.AbstractC2043a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p259r9.AbstractC3754e0;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: ob.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3123p {

    /* JADX INFO: renamed from: a */
    public static final List f10127a = AbstractC0000a.m101y0(m6634d(1, "shigeju", "慢波"), m6634d(2, "dianzijianchen", "电子奸臣"), m6634d(3, "zhangfei-guichu", "激昂张飞"), m6634d(4, "maikease", "麦克阿瑟"), m6634d(5, "jixiedianjing", "电竞解说"), m6634d(6, "shaweima", "沙老板"), m6634d(7, "dingzhen", "理唐小子"), m6634d(8, "fanzhiyi-guichu", "大将锐评"), m6634d(9, "sunxiaochuan", "游戏解说"), m6634d(10, "wangdachui", "锤大力"), m6634d(11, "xianyumengxiangjia-guichu", "梦想家"), m6634d(12, "jixiezhanjing", "机甲战警"), m6634d(13, "tixunan", "体虚生"), m6634d(14, "heyboy", "说唱小哥"), m6634d(15, "xiaomeng", "萌琦"), m6634d(16, "xionger", "熊熊"), m6634d(17, "ziwei", "紫薇"), m6634d(18, "houge", "猴哥"), m6634d(19, "haixing", "海星"), m6634d(20, "guanyu-guichu", "豪迈二爷"), m6634d(21, "caocaogaifan-guichu", "愤怒阿瞒"), m6634d(22, "zhugeliang-guichu", "智谋丞相"), m6634d(23, "chunribu", "春日部"), m6634d(24, "laodie", "魔法老爹"), m6634d(25, "guangxige", "洗头男"), m6634d(26, "haibao", "海星"), m6634d(27, "kenanvc", "名侦探"), m6634d(28, "luxun", "树人"), m6634d(29, "zhubo", "青年主播"), m6634d(30, "diyinpao", "低音炮"), m6634d(31, "jieshuonannew", "解说男生"), m6634d(32, "jieshuonv", "解说女声"), m6634d(33, "huayuanbaobao", "治愈男生"), m6634d(34, "bage", "娱乐扒哥"), m6634d(35, "bamei", "娱乐扒妹"), m6634d(36, "meishi", "舌尖美食"), m6634d(37, "yizhi", "抑制腔"), m6634d(38, "xiaoxin", "萌小孩"), m6634d(39, "zhengtai", "元气正太"), m6634d(40, "daimeng", "小鬼头"), m6634d(41, "nvhai", "超萌奶娃"), m6634d(42, "db6", "知性女声"), m6634d(43, "wenrounvsheng", "温柔女声"), m6634d(44, "tvbfemale", "TVB女"), m6634d(45, "xindong", "元气少女"), m6634d(46, "liyuling", "玉玲"), m6634d(47, "xiaoxiao", "清仓促销员"), m6634d(48, "xiaoyao", "热血男孩"), m6634d(49, "qingsong", "轻松少年"), m6634d(50, "db8", "森系少年"), m6634d(51, "jixueguanggao", "鸡血广告"), m6634d(52, "tianjinhua", "天津话"), m6634d(53, "xiaopo", "说书先生"), m6634d(54, "zh-CN-shaanxi-XiaoniNeural", "陕西话"), m6634d(55, "zh-HK-WanLungNeural", "粤语男声"), m6634d(56, "zh-CN-henan-YundengNeural", "河南话"), m6634d(57, "v50", "英文男生"), m6634d(58, "zh-CN-liaoning-XiaobeiNeural", "东北话"), m6634d(59, "zh-TW-HsiaoChenNeural", "台湾话"), m6634d(60, "zh-CN-shandong-YunxiangNeural", "山东话"), m6634d(61, "zh-CN-sichuan-YunxiNeural", "四川话"), m6634d(62, "xindong", "中英双语"), m6634d(63, "zh-HK-HiuMaanNeural", "粤语女声"), m6634d(64, "wuu-CN-XiaotongNeural", "上海话"));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static float m6631a(float f3) {
        if (Math.abs(f3) <= Float.MAX_VALUE) {
            return AbstractC2043a.m5018X(AbstractC3754e0.m7907q(f3, 0.1f, 3.0f) * 10.0f) / 10.0f;
        }
        return 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m6632b(Context context) {
        String string = AbstractC4302b.m8640c(context, "Hchat_text_voice_config").getString("text_voice_voice", "1:shigeju");
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        boolean z9 = false;
        List list = f10127a;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C3122o) it.next()).f10124a.equals(string)) {
                    z9 = true;
                    break;
                }
            }
        }
        if (!z9) {
            string = null;
        }
        return string != null ? string : "1:shigeju";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m6633c(String str) {
        str.getClass();
        if (!AbstractC3156t.m6740d0(str, "tts:", false)) {
            str = null;
        }
        String strM6686A0 = str != null ? AbstractC3149m.m6686A0(str, "tts:") : null;
        return strM6686A0 == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM6686A0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C3122o m6634d(int i9, String str, String str2) {
        return new C3122o(i9 + ":" + str, str2, str);
    }
}
