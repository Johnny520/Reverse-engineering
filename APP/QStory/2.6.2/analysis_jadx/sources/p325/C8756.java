package p325;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import p088.AbstractC7175;
import p088.C7151;
import p088.C7156;
import p338.C8810;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8756 implements InterfaceC8761 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8756 f24675 = new C8756();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f24674 = AbstractC3056.m6668(-3937825256295892391L);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f24673 = AbstractC3056.m6668(-3937825170396546471L);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f24672 = AbstractC3056.m6668(-3937825213346219431L);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7151 f24671 = AbstractC3056.m6655(3, null);

    @Override // p325.InterfaceC8761
    public final String getId() {
        return f24674;
    }

    @Override // p325.InterfaceC8761
    public final String getTitle() {
        return f24673;
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo14417(C7151 c7151, AbstractC7175 abstractC7175) {
        C8810.f24796.getClass();
        ArrayList arrayListM14454 = C8810.m14454();
        AbstractC3056.m6668(-3937811065723946407L);
        C8766 c8766 = new C8766();
        AbstractC3056.m6668(-3937805782914172327L);
        Iterator it = arrayListM14454.iterator();
        while (it.hasNext()) {
            c8766.m14436(AbstractC8757.m14433(new C6051((NewFriendInfo) it.next(), 11)));
        }
        return AbstractC3056.m6699(AbstractC8757.m14430(new C7156(c8766.f24693)), abstractC7175, false);
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7151 mo14418() {
        return f24671;
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14419() {
        return f24672;
    }
}
