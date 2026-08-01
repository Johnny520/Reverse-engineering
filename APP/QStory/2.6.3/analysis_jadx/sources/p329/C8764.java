package p329;

import com.alibaba.fastjson2.AbstractC2905;
import java.util.ArrayList;
import java.util.Iterator;
import p088.AbstractC7176;
import p088.C7152;
import p088.C7157;
import p287.AbstractC8405;
import p339.C8808;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8764 implements InterfaceC8769 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8764 f24700 = new C8764();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f24699 = AbstractC8405.m13972(2597);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f24698 = AbstractC8405.m13972(2598);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f24697 = AbstractC8405.m13972(2599);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7152 f24696 = AbstractC2905.m6337(3, null);

    @Override // p329.InterfaceC8769
    public final String getId() {
        return f24699;
    }

    @Override // p329.InterfaceC8769
    public final String getTitle() {
        return f24698;
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo14451(C7152 c7152, AbstractC7176 abstractC7176) {
        C8808.f24794.getClass();
        ArrayList arrayListM14477 = C8808.m14477();
        AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
        C8774 c8774 = new C8774();
        AbstractC8405.m13972(2337);
        Iterator it = arrayListM14477.iterator();
        while (it.hasNext()) {
            c8774.m14470(AbstractC8765.m14467(new C6057((NewFriendInfo) it.next(), 11)));
        }
        return AbstractC2905.m6331(AbstractC8765.m14464(new C7157(c8774.f24718)), abstractC7176, false);
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7152 mo14452() {
        return f24696;
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14453() {
        return f24697;
    }
}
