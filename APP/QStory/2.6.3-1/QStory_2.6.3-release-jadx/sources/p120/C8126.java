package p120;

import com.alibaba.fastjson2.AbstractC3738;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5397;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p050.AbstractC7176;
import p065.AbstractC7356;
import p065.C7361;
import p065.C7362;
import p082.AbstractC7699;
import p095.AbstractC7806;
import p095.AbstractC7818;
import p095.C7808;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8126 implements InterfaceC8109 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f19782;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8126 f19781 = new C8126(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8126 f19780 = new C8126(1);

    public /* synthetic */ C8126(int i) {
        this.f19782 = i;
    }

    @Override // p120.InterfaceC8109
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ String mo13055(C5397 c5397) {
        switch (this.f19782) {
        }
        return AbstractC5754.m10433(this, c5397);
    }

    @Override // p120.InterfaceC8109
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13056(C5397 c5397) {
        AbstractC5710 abstractC5710M10373;
        switch (this.f19782) {
            case 0:
                InterfaceC5313 interfaceC5313 = (InterfaceC5288) c5397.mo9594().get(1);
                C7361 c7361 = C7362.f18273;
                interfaceC5313.getClass();
                int i = AbstractC5605.f14254;
                InterfaceC5318 interfaceC5318M12663 = AbstractC7699.m12663(interfaceC5313);
                interfaceC5318M12663.getClass();
                c7361.getClass();
                AbstractC7818 abstractC7818M9636 = AbstractC5323.m9636(interfaceC5318M12663, AbstractC7356.f18203);
                if (abstractC7818M9636 == null) {
                    abstractC5710M10373 = null;
                } else {
                    C5706.f14520.getClass();
                    C5706 c5706 = C5706.f14521;
                    List parameters = abstractC7818M9636.mo9560().getParameters();
                    parameters.getClass();
                    Object objM9338 = AbstractC5176.m9338(parameters);
                    objM9338.getClass();
                    abstractC5710M10373 = AbstractC5725.m10373(c5706, abstractC7818M9636, AbstractC7176.m12487(new C5717((InterfaceC5295) objM9338)));
                }
                if (abstractC5710M10373 == null) {
                    return false;
                }
                AbstractC5714 type = ((AbstractC7806) interfaceC5313).getType();
                type.getClass();
                return AbstractC3738.m6852(abstractC5710M10373, AbstractC5749.m10409(type, false));
            default:
                List<InterfaceC5288> listMo9594 = c5397.mo9594();
                listMo9594.getClass();
                if (!listMo9594.isEmpty()) {
                    for (InterfaceC5288 interfaceC5288 : listMo9594) {
                        interfaceC5288.getClass();
                        if (AbstractC5605.m10062(interfaceC5288) || ((C7808) interfaceC5288).f19016 != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // p120.InterfaceC8109
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo13057() {
        switch (this.f19782) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
