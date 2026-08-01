package p345;

import com.alibaba.fastjson2.AbstractC3738;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import lin.xposed.hook.util.p011qq.QQFriendTool;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7986;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9604 implements InterfaceC9598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9604 f25068 = new C9604();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f25067 = "get_friend_list";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f25066 = "获取好友列表";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f25065 = "读取当前账号的好友列表并返回 (QQ号)uin、备注与昵称、是否有会员，会员等级";

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7981 f25064 = AbstractC3738.m6897(3, null);

    @Override // p345.InterfaceC9598
    public final String getId() {
        return f25067;
    }

    @Override // p345.InterfaceC9598
    public final String getTitle() {
        return f25066;
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo15010(C7981 c7981, AbstractC8005 abstractC8005) {
        ArrayList<FriendInfo> allFriend = QQFriendTool.getAllFriend();
        "block";
        C9603 c9603 = new C9603();
        "$this$jsonArray";
        allFriend.getClass();
        Iterator<T> it = allFriend.iterator();
        while (it.hasNext()) {
            c9603.m15029(AbstractC9594.m15026(new C6886((FriendInfo) it.next(), 9)));
        }
        return AbstractC3738.m6891(AbstractC9594.m15023(new C7986(c9603.f25063)), abstractC8005, false);
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7981 mo15011() {
        return f25064;
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo15012() {
        return f25065;
    }
}
