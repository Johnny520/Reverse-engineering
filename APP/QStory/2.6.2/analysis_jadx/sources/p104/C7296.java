package p104;

import com.bumptech.glide.AbstractC3055;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4564;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import p049.AbstractC6526;
import p049.C6531;
import p049.C6532;
import p066.AbstractC6869;
import p079.AbstractC6976;
import p079.AbstractC6988;
import p079.C6978;
import p175.AbstractC7738;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7296 implements InterfaceC7279 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f19442;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7296 f19441 = new C7296(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7296 f19440 = new C7296(1);

    public /* synthetic */ C7296(int i) {
        this.f19442 = i;
    }

    @Override // p104.InterfaceC7279
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ String mo12469(C4564 c4564) {
        switch (this.f19442) {
        }
        return AbstractC3055.m6641(this, c4564);
    }

    @Override // p104.InterfaceC7279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12470(C4564 c4564) {
        AbstractC4877 abstractC4877M9820;
        switch (this.f19442) {
            case 0:
                InterfaceC4480 interfaceC4480 = (InterfaceC4455) c4564.mo9045().get(1);
                C6531 c6531 = C6532.f17932;
                interfaceC4480.getClass();
                int i = AbstractC4772.f13905;
                InterfaceC4485 interfaceC4485M12076 = AbstractC6869.m12076(interfaceC4480);
                interfaceC4485M12076.getClass();
                c6531.getClass();
                AbstractC6988 abstractC6988M9087 = AbstractC4490.m9087(interfaceC4485M12076, AbstractC6526.f17862);
                if (abstractC6988M9087 == null) {
                    abstractC4877M9820 = null;
                } else {
                    C4873.f14171.getClass();
                    C4873 c4873 = C4873.f14172;
                    List parameters = abstractC6988M9087.mo9011().getParameters();
                    parameters.getClass();
                    Object objM8818 = AbstractC4343.m8818(parameters);
                    objM8818.getClass();
                    abstractC4877M9820 = AbstractC4892.m9820(c4873, abstractC6988M9087, AbstractC8189.m13660(new C4884((InterfaceC4462) objM8818)));
                }
                if (abstractC4877M9820 == null) {
                    return false;
                }
                AbstractC4881 type = ((AbstractC6976) interfaceC4480).getType();
                type.getClass();
                return AbstractC7738.m13028(abstractC4877M9820, AbstractC4916.m9856(type, false));
            default:
                List<InterfaceC4455> listMo9045 = c4564.mo9045();
                listMo9045.getClass();
                if (!listMo9045.isEmpty()) {
                    for (InterfaceC4455 interfaceC4455 : listMo9045) {
                        interfaceC4455.getClass();
                        if (AbstractC4772.m9513(interfaceC4455) || ((C6978) interfaceC4455).f18676 != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // p104.InterfaceC7279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12471() {
        switch (this.f19442) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
