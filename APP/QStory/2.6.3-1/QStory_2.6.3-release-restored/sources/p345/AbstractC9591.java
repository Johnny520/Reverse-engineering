package p345;

import androidx.compose.foundation.layout.C1481;
import androidx.compose.foundation.text.C1822;
import com.alibaba.fastjson2.AbstractC3738;
import java.util.List;
import p050.AbstractC7176;
import p104.C7996;
import top.suzhelan.qstory.p015ui.components.C6797;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9591 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f25035;

    static {
        byte b = 0;
        C9592 c9592 = new C9592("is_friend", "检查是否为好友", "检查指定 QQ 是否为当前账号好友", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("uin", "目标 QQ 号")), AbstractC7176.m12487("uin")), new C6797(b, 9));
        C9592 c9592M6848 = AbstractC3738.m6848("get_group_rkey", "获取群 RKey", "读取群相关请求使用的 RKey", new C7996(24));
        C9592 c9592M68482 = AbstractC3738.m6848("get_friend_rkey", "获取私聊 RKey", "读取私聊相关请求使用的 RKey", new C7996(20));
        C9592 c9592M68483 = AbstractC3738.m6848("get_skey", "获取 SKey", "读取当前登录态的 SKey", new C7996(21));
        C9592 c9592M68484 = AbstractC3738.m6848("get_real_skey", "获取 Real SKey", "读取当前登录态的真实 SKey", new C7996(23));
        C9592 c95922 = new C9592("get_pskey", "获取 PsKey", "按域名读取 PsKey", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("domain", "域名")), AbstractC7176.m12487("domain")), new C6797(b, 12));
        C9592 c95923 = new C9592("get_pt4_token", "获取 PT4Token", "按域名读取 PT4Token", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("domain", "域名")), AbstractC7176.m12487("domain")), new C6797(b, 7));
        C9592 c95924 = new C9592("get_bkn", "获取 BKN", "根据 pskey 计算 BKN", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("pskey", "用于计算的 pskey")), AbstractC7176.m12487("pskey")), new C6797(b, 8));
        int i = 11;
        C9592 c95925 = new C9592("get_gtk", "获取 GTK", "按域名读取 GTK", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("domain", "域名")), AbstractC7176.m12487("domain")), new C6797(b, i));
        C9592 c95926 = new C9592("get_string", "读取字符串配置", "读取字符串配置，使用 MCP 内置命名空间存储", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("config_name", "配置文件名"), AbstractC3738.m6892("key", "配置键"), AbstractC3738.m6892("default_value", "默认值，可选")), AbstractC7176.m12490("config_name", "key")), new C6797(b, 10));
        C9592 c9592M6885 = AbstractC3738.m6885("put_string", "写入字符串配置", "写入字符串配置，使用 MCP 内置命名空间存储", "value", AbstractC3738.m6892("value", "字符串值"), new C1822(i));
        C9592 c9592M6886 = AbstractC3738.m6886("get_boolean", "读取布尔配置", "读取布尔配置，使用 MCP 内置命名空间存储", AbstractC3738.m6869("default_value", "默认值"), new C1822(15));
        C9592 c9592M68852 = AbstractC3738.m6885("put_boolean", "写入布尔配置", "写入布尔配置，使用 MCP 内置命名空间存储", "value", AbstractC3738.m6869("value", "布尔值"), new C1822(19));
        C9592 c9592M68862 = AbstractC3738.m6886("get_int", "读取整型配置", "读取整型配置，使用 MCP 内置命名空间存储", AbstractC3738.m6863("default_value", "默认值"), new C1822(16));
        C9592 c9592M68853 = AbstractC3738.m6885("put_int", "写入整型配置", "写入整型配置，使用 MCP 内置命名空间存储", "value", AbstractC3738.m6863("value", "整型值"), new C1822(9));
        C9592 c9592M68863 = AbstractC3738.m6886("get_long", "读取长整型配置", "读取长整型配置，使用 MCP 内置命名空间存储", AbstractC3738.m6847("default_value", "long 默认值"), new C1822(18));
        C9592 c9592M68854 = AbstractC3738.m6885("put_long", "写入长整型配置", "写入长整型配置，使用 MCP 内置命名空间存储", "value", AbstractC3738.m6847("value", "long 值"), new C1822(12));
        C9592 c9592M68864 = AbstractC3738.m6886("get_float", "读取浮点配置", "读取浮点配置，使用 MCP 内置命名空间存储", AbstractC3738.m6847("default_value", "float 默认值"), new C1822(14));
        C9592 c9592M68855 = AbstractC3738.m6885("put_float", "写入浮点配置", "写入浮点配置，使用 MCP 内置命名空间存储", "value", AbstractC3738.m6847("value", "float 值"), new C1822(13));
        C9592 c9592M68865 = AbstractC3738.m6886("get_double", "读取双精度配置", "读取双精度配置，使用 MCP 内置命名空间存储", AbstractC3738.m6847("default_value", "double 默认值"), new C1822(17));
        C9592 c9592M68856 = AbstractC3738.m6885("put_double", "写入双精度配置", "写入双精度配置，使用 MCP 内置命名空间存储", "value", AbstractC3738.m6847("value", "double 值"), new C1822(10));
        String strM14531 = "get_chat_type";
        String strM145312 = "获取当前会话类型";
        String strM145313 = "读取当前会话类型";
        C7996 c7996 = new C7996(25);
        "id";
        "title";
        "description";
        "action";
        f25035 = AbstractC7176.m12490(c9592, c9592M6848, c9592M68482, c9592M68483, c9592M68484, c95922, c95923, c95924, c95925, c95926, c9592M6885, c9592M6886, c9592M68852, c9592M68862, c9592M68853, c9592M68863, c9592M68854, c9592M68864, c9592M68855, c9592M68865, c9592M68856, new C9592(strM14531, strM145312, strM145313, AbstractC3738.m6897(3, null), new C1481(c7996, 17)), AbstractC3738.m6848("get_current_group_uin", "获取当前群号", "读取当前会话中的群号", new C7996(26)), AbstractC3738.m6848("get_current_friend_uin", "获取当前好友 QQ", "读取当前会话中的好友 QQ 号", new C7996(22)));
    }
}
