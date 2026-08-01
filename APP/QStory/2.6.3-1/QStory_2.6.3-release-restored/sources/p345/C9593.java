package p345;

import com.alibaba.fastjson2.AbstractC3738;
import java.util.ArrayList;
import java.util.Iterator;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7986;
import p355.C9637;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9593 implements InterfaceC9598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9593 f25045 = new C9593();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f25044 = "get_new_friend_list";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f25043 = "获取好友列表(新)";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f25042 = "读取当前账号的好友列表并返回 (QQ号)uin、备注与昵称、性别，年龄";

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7981 f25041 = AbstractC3738.m6897(3, null);

    @Override // p345.InterfaceC9598
    public final String getId() {
        return f25044;
    }

    @Override // p345.InterfaceC9598
    public final String getTitle() {
        return f25043;
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo15010(C7981 c7981, AbstractC8005 abstractC8005) {
        C9637.f25139.getClass();
        ArrayList arrayListM15036 = C9637.m15036();
        "block";
        C9603 c9603 = new C9603();
        "$this$jsonArray";
        Iterator it = arrayListM15036.iterator();
        while (it.hasNext()) {
            c9603.m15029(AbstractC9594.m15026(new C6886((NewFriendInfo) it.next(), 11)));
        }
        return AbstractC3738.m6891(AbstractC9594.m15023(new C7986(c9603.f25063)), abstractC8005, false);
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7981 mo15011() {
        return f25041;
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo15012() {
        return f25042;
    }
}
