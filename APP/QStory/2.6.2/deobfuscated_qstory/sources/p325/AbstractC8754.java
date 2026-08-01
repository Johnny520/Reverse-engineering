package p325;

import androidx.compose.foundation.layout.C0640;
import androidx.compose.foundation.text.C0984;
import com.bumptech.glide.AbstractC3056;
import java.util.List;
import p088.C7166;
import p253.AbstractC8189;
import top.suzhelan.qstory.ui.components.C5961;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8754 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f24665;

    static {
        byte b = 0;
        int i = 9;
        C8755 c8755 = new C8755("is_friend", "\u68c0\u67e5\u662f\u5426\u4e3a\u597d\u53cb", "\u68c0\u67e5\u6307\u5b9a QQ \u662f\u5426\u4e3a\u5f53\u524d\u8d26\u53f7\u597d\u53cb", AbstractC3056.m6659(AbstractC8189.m13660(AbstractC3056.m6700("uin", "\u76ee\u6807 QQ \u53f7")), AbstractC8189.m13660("uin")), new C5961(b, i));
        C8755 c8755M6663 = AbstractC3056.m6663("get_group_rkey", "\u83b7\u53d6\u7fa4 RKey", "\u8bfb\u53d6\u7fa4\u76f8\u5173\u8bf7\u6c42\u4f7f\u7528\u7684 RKey", new C7166(23));
        C8755 c8755M66632 = AbstractC3056.m6663("get_friend_rkey", "\u83b7\u53d6\u79c1\u804a RKey", "\u8bfb\u53d6\u79c1\u804a\u76f8\u5173\u8bf7\u6c42\u4f7f\u7528\u7684 RKey", new C7166(19));
        C8755 c8755M66633 = AbstractC3056.m6663("get_skey", "\u83b7\u53d6 SKey", "\u8bfb\u53d6\u5f53\u524d\u767b\u5f55\u6001\u7684 SKey", new C7166(20));
        C8755 c8755M66634 = AbstractC3056.m6663("get_real_skey", "\u83b7\u53d6 Real SKey", "\u8bfb\u53d6\u5f53\u524d\u767b\u5f55\u6001\u7684\u771f\u5b9e SKey", new C7166(22));
        C8755 c87552 = new C8755("get_pskey", "\u83b7\u53d6 PsKey", "\u6309\u57df\u540d\u8bfb\u53d6 PsKey", AbstractC3056.m6659(AbstractC8189.m13660(AbstractC3056.m6700("domain", "\u57df\u540d")), AbstractC8189.m13660("domain")), new C5961(b, 12));
        C8755 c87553 = new C8755("get_pt4_token", "\u83b7\u53d6 PT4Token", "\u6309\u57df\u540d\u8bfb\u53d6 PT4Token", AbstractC3056.m6659(AbstractC8189.m13660(AbstractC3056.m6700("domain", "\u57df\u540d")), AbstractC8189.m13660("domain")), new C5961(b, 7));
        C8755 c87554 = new C8755("get_bkn", "\u83b7\u53d6 BKN", "\u6839\u636e pskey \u8ba1\u7b97 BKN", AbstractC3056.m6659(AbstractC8189.m13660(AbstractC3056.m6700("pskey", "\u7528\u4e8e\u8ba1\u7b97\u7684 pskey")), AbstractC8189.m13660("pskey")), new C5961(b, 8));
        int i2 = 11;
        C8755 c87555 = new C8755("get_gtk", "\u83b7\u53d6 GTK", "\u6309\u57df\u540d\u8bfb\u53d6 GTK", AbstractC3056.m6659(AbstractC8189.m13660(AbstractC3056.m6700("domain", "\u57df\u540d")), AbstractC8189.m13660("domain")), new C5961(b, i2));
        C8755 c87556 = new C8755("get_string", "\u8bfb\u53d6\u5b57\u7b26\u4e32\u914d\u7f6e", "\u8bfb\u53d6\u5b57\u7b26\u4e32\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", AbstractC3056.m6659(AbstractC8189.m13659(AbstractC3056.m6700("config_name", "\u914d\u7f6e\u6587\u4ef6\u540d"), AbstractC3056.m6700("key", "\u914d\u7f6e\u952e"), AbstractC3056.m6700("default_value", "\u9ed8\u8ba4\u503c\uff0c\u53ef\u9009")), AbstractC8189.m13659("config_name", "key")), new C5961(b, 10));
        C8755 c8755M6698 = AbstractC3056.m6698("put_string", "\u5199\u5165\u5b57\u7b26\u4e32\u914d\u7f6e", "\u5199\u5165\u5b57\u7b26\u4e32\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", "value", AbstractC3056.m6700("value", "\u5b57\u7b26\u4e32\u503c"), new C0984(i2));
        C8755 c8755M6697 = AbstractC3056.m6697("get_boolean", "\u8bfb\u53d6\u5e03\u5c14\u914d\u7f6e", "\u8bfb\u53d6\u5e03\u5c14\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", AbstractC3056.m6681("default_value", "\u9ed8\u8ba4\u503c"), new C0984(15));
        C8755 c8755M66982 = AbstractC3056.m6698("put_boolean", "\u5199\u5165\u5e03\u5c14\u914d\u7f6e", "\u5199\u5165\u5e03\u5c14\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", "value", AbstractC3056.m6681("value", "\u5e03\u5c14\u503c"), new C0984(19));
        C8755 c8755M66972 = AbstractC3056.m6697("get_int", "\u8bfb\u53d6\u6574\u578b\u914d\u7f6e", "\u8bfb\u53d6\u6574\u578b\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", AbstractC3056.m6664("default_value", "\u9ed8\u8ba4\u503c"), new C0984(16));
        C8755 c8755M66983 = AbstractC3056.m6698("put_int", "\u5199\u5165\u6574\u578b\u914d\u7f6e", "\u5199\u5165\u6574\u578b\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", "value", AbstractC3056.m6664("value", "\u6574\u578b\u503c"), new C0984(i));
        C8755 c8755M66973 = AbstractC3056.m6697("get_long", "\u8bfb\u53d6\u957f\u6574\u578b\u914d\u7f6e", "\u8bfb\u53d6\u957f\u6574\u578b\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", AbstractC3056.m6662("default_value", "long \u9ed8\u8ba4\u503c"), new C0984(18));
        C8755 c8755M66984 = AbstractC3056.m6698("put_long", "\u5199\u5165\u957f\u6574\u578b\u914d\u7f6e", "\u5199\u5165\u957f\u6574\u578b\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", "value", AbstractC3056.m6662("value", "long \u503c"), new C0984(12));
        C8755 c8755M66974 = AbstractC3056.m6697("get_float", "\u8bfb\u53d6\u6d6e\u70b9\u914d\u7f6e", "\u8bfb\u53d6\u6d6e\u70b9\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", AbstractC3056.m6662("default_value", "float \u9ed8\u8ba4\u503c"), new C0984(14));
        C8755 c8755M66985 = AbstractC3056.m6698("put_float", "\u5199\u5165\u6d6e\u70b9\u914d\u7f6e", "\u5199\u5165\u6d6e\u70b9\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", "value", AbstractC3056.m6662("value", "float \u503c"), new C0984(13));
        C8755 c8755M66975 = AbstractC3056.m6697("get_double", "\u8bfb\u53d6\u53cc\u7cbe\u5ea6\u914d\u7f6e", "\u8bfb\u53d6\u53cc\u7cbe\u5ea6\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", AbstractC3056.m6662("default_value", "double \u9ed8\u8ba4\u503c"), new C0984(17));
        C8755 c8755M66986 = AbstractC3056.m6698("put_double", "\u5199\u5165\u53cc\u7cbe\u5ea6\u914d\u7f6e", "\u5199\u5165\u53cc\u7cbe\u5ea6\u914d\u7f6e\uff0c\u4f7f\u7528 MCP \u5185\u7f6e\u547d\u540d\u7a7a\u95f4\u5b58\u50a8", "value", AbstractC3056.m6662("value", "double \u503c"), new C0984(10));
        String strM6668 = "get_chat_type";
        String strM66682 = "\u83b7\u53d6\u5f53\u524d\u4f1a\u8bdd\u7c7b\u578b";
        String strM66683 = "\u8bfb\u53d6\u5f53\u524d\u4f1a\u8bdd\u7c7b\u578b";
        C7166 c7166 = new C7166(24);
        "id";
        "title";
        "description";
        "action";
        f24665 = AbstractC8189.m13659(c8755, c8755M6663, c8755M66632, c8755M66633, c8755M66634, c87552, c87553, c87554, c87555, c87556, c8755M6698, c8755M6697, c8755M66982, c8755M66972, c8755M66983, c8755M66973, c8755M66984, c8755M66974, c8755M66985, c8755M66975, c8755M66986, new C8755(strM6668, strM66682, strM66683, AbstractC3056.m6655(3, null), new C0640(c7166, 17)), AbstractC3056.m6663("get_current_group_uin", "\u83b7\u53d6\u5f53\u524d\u7fa4\u53f7", "\u8bfb\u53d6\u5f53\u524d\u4f1a\u8bdd\u4e2d\u7684\u7fa4\u53f7", new C7166(25)), AbstractC3056.m6663("get_current_friend_uin", "\u83b7\u53d6\u5f53\u524d\u597d\u53cb QQ", "\u8bfb\u53d6\u5f53\u524d\u4f1a\u8bdd\u4e2d\u7684\u597d\u53cb QQ \u53f7", new C7166(21)));
    }
}
