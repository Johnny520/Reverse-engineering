package p345;

import com.alibaba.fastjson2.AbstractC3738;
import java.util.List;
import p050.AbstractC7176;
import top.suzhelan.qstory.p015ui.components.C6797;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9602 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f25062;

    static {
        byte b = 0;
        f25062 = AbstractC7176.m12490(new C9592("get_group_info", "获取群信息", "读取指定群的基础信息", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("group_uin", "群号")), AbstractC7176.m12487("group_uin")), new C6797(b, 25)), new C9592("get_member_info", "获取群成员信息", "读取指定群成员的详细信息", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("group_uin", "群号"), AbstractC3738.m6892("uin", "成员 QQ 号")), AbstractC7176.m12490("group_uin", "uin")), new C6797(b, 29)), new C9592("get_member_name", "获取群成员名称", "读取指定群成员的显示名称", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("group_uin", "群号"), AbstractC3738.m6892("uin", "成员 QQ 号")), AbstractC7176.m12490("group_uin", "uin")), new C6797(b, 24)), new C9592("get_group_member_list", "获取群成员列表", "读取指定群的成员列表", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("group_uin", "群号")), AbstractC7176.m12487("group_uin")), new C6797(b, 23)), new C9592("get_forbidden_list", "获取群禁言列表", "读取指定群的禁言列表", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("group_uin", "群号")), AbstractC7176.m12487("group_uin")), new C6797(b, 26)), new C9592("set_title", "设置群成员头衔", "设置指定群成员的头衔", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("group_uin", "群号"), AbstractC3738.m6892("user_uin", "成员 QQ 号"), AbstractC3738.m6892("title", "头衔")), AbstractC7176.m12490("group_uin", "user_uin", "title")), new C6797(b, 27)), new C9592("forbidden", "群禁言", "执行群禁言操作。user_uin 为空时操作全体禁言", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("group_uin", "群号"), AbstractC3738.m6892("user_uin", "成员 QQ 号，全体禁言时留空"), AbstractC3738.m6863("time", "禁言秒数；全体禁言时传 1 表示开启，0 表示关闭")), AbstractC7176.m12490("group_uin", "time")), new C6797(b, 22)), new C9592("kick", "踢出群成员", "将指定成员移出群聊", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("group_uin", "群号"), AbstractC3738.m6892("user_uin", "成员 QQ 号"), AbstractC3738.m6869("is_black", "是否拉黑，默认 false")), AbstractC7176.m12490("group_uin", "user_uin")), new C6797(b, 28)));
    }
}
