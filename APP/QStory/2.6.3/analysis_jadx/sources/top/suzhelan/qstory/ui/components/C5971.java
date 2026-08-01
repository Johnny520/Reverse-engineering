package top.suzhelan.qstory.ui.components;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import com.alibaba.fastjson2.AbstractC2905;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p088.AbstractC7176;
import p088.C7152;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5971 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6543 f16187;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16188 = 1;

    public /* synthetic */ C5971(InterfaceC6543 interfaceC6543) {
        this.f16187 = interfaceC6543;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16188;
        InterfaceC6543 interfaceC6543 = this.f16187;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC5969.m11353(interfaceC6543, (InterfaceC1373) obj, AbstractC1367.m2471(7));
                return C5176.f14739;
            default:
                AbstractC7176 abstractC7176 = (AbstractC7176) obj2;
                AbstractC8405.m13972(1293);
                ((C7152) obj).getClass();
                String str = (String) interfaceC6543.invoke();
                if (str == null) {
                    str = "";
                }
                return AbstractC2905.m6331(str, abstractC7176, false);
        }
    }

    public /* synthetic */ C5971(InterfaceC6543 interfaceC6543, int i) {
        this.f16187 = interfaceC6543;
    }
}
