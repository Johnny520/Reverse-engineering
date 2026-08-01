package top.suzhelan.qstory.p015ui.components;

import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import com.alibaba.fastjson2.AbstractC3738;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p104.AbstractC8005;
import p104.C7981;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6801 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7372 f16532;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16533 = 1;

    public /* synthetic */ C6801(InterfaceC7372 interfaceC7372) {
        this.f16532 = interfaceC7372;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16533;
        InterfaceC7372 interfaceC7372 = this.f16532;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC6799.m11912(interfaceC7372, (InterfaceC2208) obj, AbstractC2202.m3031(7));
                return C6008.f15084;
            default:
                AbstractC8005 abstractC8005 = (AbstractC8005) obj2;
                AbstractC9234.m14531(1293);
                ((C7981) obj).getClass();
                String str = (String) interfaceC7372.invoke();
                if (str == null) {
                    str = "";
                }
                return AbstractC3738.m6891(str, abstractC8005, false);
        }
    }

    public /* synthetic */ C6801(InterfaceC7372 interfaceC7372, int i) {
        this.f16532 = interfaceC7372;
    }
}
