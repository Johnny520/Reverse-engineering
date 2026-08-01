package p329;

import com.alibaba.fastjson2.AbstractC2905;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import lin.xposed.hook.util.qq.QQFriendTool;
import p088.AbstractC7176;
import p088.C7152;
import p088.C7157;
import p287.AbstractC8405;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8775 implements InterfaceC8769 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8775 f24723 = new C8775();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f24722 = AbstractC8405.m13972(2501);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f24721 = AbstractC8405.m13972(2502);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f24720 = AbstractC8405.m13972(2503);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7152 f24719 = AbstractC2905.m6337(3, null);

    @Override // p329.InterfaceC8769
    public final String getId() {
        return f24722;
    }

    @Override // p329.InterfaceC8769
    public final String getTitle() {
        return f24721;
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo14451(C7152 c7152, AbstractC7176 abstractC7176) {
        ArrayList<FriendInfo> allFriend = QQFriendTool.getAllFriend();
        AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
        C8774 c8774 = new C8774();
        AbstractC8405.m13972(2337);
        allFriend.getClass();
        Iterator<T> it = allFriend.iterator();
        while (it.hasNext()) {
            c8774.m14470(AbstractC8765.m14467(new C6057((FriendInfo) it.next(), 9)));
        }
        return AbstractC2905.m6331(AbstractC8765.m14464(new C7157(c8774.f24718)), abstractC7176, false);
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7152 mo14452() {
        return f24719;
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14453() {
        return f24720;
    }
}
