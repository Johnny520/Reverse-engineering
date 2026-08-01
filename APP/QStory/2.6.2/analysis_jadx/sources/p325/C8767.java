package p325;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import lin.xposed.hook.util.qq.QQFriendTool;
import p088.AbstractC7175;
import p088.C7151;
import p088.C7156;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8767 implements InterfaceC8761 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8767 f24698 = new C8767();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f24697 = AbstractC3056.m6668(-3937813178847856039L);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f24696 = AbstractC3056.m6668(-3937813110128379303L);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f24695 = AbstractC3056.m6668(-3937813002754196903L);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7151 f24694 = AbstractC3056.m6655(3, null);

    @Override // p325.InterfaceC8761
    public final String getId() {
        return f24697;
    }

    @Override // p325.InterfaceC8761
    public final String getTitle() {
        return f24696;
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo14417(C7151 c7151, AbstractC7175 abstractC7175) {
        ArrayList<FriendInfo> allFriend = QQFriendTool.getAllFriend();
        AbstractC3056.m6668(-3937811065723946407L);
        C8766 c8766 = new C8766();
        AbstractC3056.m6668(-3937805782914172327L);
        allFriend.getClass();
        Iterator<T> it = allFriend.iterator();
        while (it.hasNext()) {
            c8766.m14436(AbstractC8757.m14433(new C6051((FriendInfo) it.next(), 9)));
        }
        return AbstractC3056.m6699(AbstractC8757.m14430(new C7156(c8766.f24693)), abstractC7175, false);
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7151 mo14418() {
        return f24694;
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14419() {
        return f24695;
    }
}
