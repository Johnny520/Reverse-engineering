package top.suzhelan.qstory.ui.components;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import com.bumptech.glide.AbstractC3056;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p088.AbstractC7175;
import p088.C7151;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5965 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6542 f16178;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16179 = 1;

    public /* synthetic */ C5965(InterfaceC6542 interfaceC6542) {
        this.f16178 = interfaceC6542;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16179;
        InterfaceC6542 interfaceC6542 = this.f16178;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC5963.m11293(interfaceC6542, (InterfaceC1373) obj, AbstractC1367.m2460(7));
                return C5175.f14739;
            default:
                AbstractC7175 abstractC7175 = (AbstractC7175) obj2;
                AbstractC3056.m6668(-3937690725035279783L);
                ((C7151) obj).getClass();
                String strM6668 = (String) interfaceC6542.invoke();
                if (strM6668 == null) {
                    strM6668 = AbstractC3056.m6668(-3937561979095614887L);
                }
                return AbstractC3056.m6699(strM6668, abstractC7175, false);
        }
    }

    public /* synthetic */ C5965(InterfaceC6542 interfaceC6542, int i) {
        this.f16178 = interfaceC6542;
    }
}
