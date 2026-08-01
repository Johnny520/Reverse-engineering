package p325;

import com.bumptech.glide.AbstractC3056;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p087.C7067;
import p088.AbstractC7175;
import p088.C7151;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8752 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6550 f24662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24663;

    public /* synthetic */ C8752(InterfaceC6550 interfaceC6550, int i) {
        this.f24663 = i;
        this.f24662 = interfaceC6550;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24663;
        InterfaceC6550 interfaceC6550 = this.f24662;
        C7151 c7151 = (C7151) obj;
        AbstractC7175 abstractC7175 = (AbstractC7175) obj2;
        switch (i) {
            case 0:
                "args";
                c7151.getClass();
                interfaceC6550.invoke(AbstractC3056.m6713(c7151, "config_name"), AbstractC3056.m6713(c7151, "key"), c7151);
                return AbstractC3056.m6699("\u4fdd\u5b58\u6210\u529f", abstractC7175, false);
            default:
                "args";
                c7151.getClass();
                return AbstractC3056.m6672(AbstractC8757.m14433(new C7067(interfaceC6550, 5, c7151)), abstractC7175);
        }
    }
}
