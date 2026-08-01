package p104;

import com.alibaba.fastjson2.AbstractC2905;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4565;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4885;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p034.AbstractC6347;
import p049.AbstractC6527;
import p049.C6532;
import p049.C6533;
import p066.AbstractC6870;
import p079.AbstractC6977;
import p079.AbstractC6989;
import p079.C6979;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7297 implements InterfaceC7280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f19437;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7297 f19436 = new C7297(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7297 f19435 = new C7297(1);

    public /* synthetic */ C7297(int i) {
        this.f19437 = i;
    }

    @Override // p104.InterfaceC7280
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ String mo12496(C4565 c4565) {
        switch (this.f19437) {
        }
        return AbstractC4922.m9874(this, c4565);
    }

    @Override // p104.InterfaceC7280
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12497(C4565 c4565) {
        AbstractC4878 abstractC4878M9814;
        switch (this.f19437) {
            case 0:
                InterfaceC4481 interfaceC4481 = (InterfaceC4456) c4565.mo9035().get(1);
                C6532 c6532 = C6533.f17928;
                interfaceC4481.getClass();
                int i = AbstractC4773.f13909;
                InterfaceC4486 interfaceC4486M12104 = AbstractC6870.m12104(interfaceC4481);
                interfaceC4486M12104.getClass();
                c6532.getClass();
                AbstractC6989 abstractC6989M9077 = AbstractC4491.m9077(interfaceC4486M12104, AbstractC6527.f17858);
                if (abstractC6989M9077 == null) {
                    abstractC4878M9814 = null;
                } else {
                    C4874.f14175.getClass();
                    C4874 c4874 = C4874.f14176;
                    List parameters = abstractC6989M9077.mo9001().getParameters();
                    parameters.getClass();
                    Object objM8779 = AbstractC4344.m8779(parameters);
                    objM8779.getClass();
                    abstractC4878M9814 = AbstractC4893.m9814(c4874, abstractC6989M9077, AbstractC6347.m11928(new C4885((InterfaceC4463) objM8779)));
                }
                if (abstractC4878M9814 == null) {
                    return false;
                }
                AbstractC4882 type = ((AbstractC6977) interfaceC4481).getType();
                type.getClass();
                return AbstractC2905.m6292(abstractC4878M9814, AbstractC4917.m9850(type, false));
            default:
                List<InterfaceC4456> listMo9035 = c4565.mo9035();
                listMo9035.getClass();
                if (!listMo9035.isEmpty()) {
                    for (InterfaceC4456 interfaceC4456 : listMo9035) {
                        interfaceC4456.getClass();
                        if (AbstractC4773.m9503(interfaceC4456) || ((C6979) interfaceC4456).f18671 != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // p104.InterfaceC7280
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12498() {
        switch (this.f19437) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
