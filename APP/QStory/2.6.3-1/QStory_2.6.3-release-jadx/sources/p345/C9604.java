package p345;

import com.alibaba.fastjson2.AbstractC3738;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import lin.xposed.hook.util.p011qq.QQFriendTool;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7986;
import p303.AbstractC9234;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9604 implements InterfaceC9598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9604 f25068 = new C9604();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f25067 = AbstractC9234.m14531(2501);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f25066 = AbstractC9234.m14531(2502);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f25065 = AbstractC9234.m14531(2503);

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
        AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
        C9603 c9603 = new C9603();
        AbstractC9234.m14531(2337);
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
