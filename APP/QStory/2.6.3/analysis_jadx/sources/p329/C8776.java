package p329;

import com.alibaba.fastjson2.AbstractC2905;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import p053.AbstractC6561;
import p088.AbstractC7176;
import p088.C7152;
import p088.C7157;
import p287.AbstractC8405;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8776 implements InterfaceC8769 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8776 f24728 = new C8776();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f24727 = AbstractC8405.m13972(2506);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f24726 = AbstractC8405.m13972(2507);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f24725 = AbstractC8405.m13972(2508);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7152 f24724 = AbstractC2905.m6337(3, null);

    @Override // p329.InterfaceC8769
    public final String getId() {
        return f24727;
    }

    @Override // p329.InterfaceC8769
    public final String getTitle() {
        return f24726;
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo14451(C7152 c7152, AbstractC7176 abstractC7176) {
        ArrayList arrayListM12047 = AbstractC6561.m12047();
        AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
        C8774 c8774 = new C8774();
        AbstractC8405.m13972(2337);
        Iterator it = arrayListM12047.iterator();
        while (it.hasNext()) {
            c8774.m14470(AbstractC8765.m14467(new C6057((GroupInfo) it.next(), 10)));
        }
        return AbstractC2905.m6331(AbstractC8765.m14464(new C7157(c8774.f24718)), abstractC7176, false);
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7152 mo14452() {
        return f24724;
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14453() {
        return f24725;
    }
}
