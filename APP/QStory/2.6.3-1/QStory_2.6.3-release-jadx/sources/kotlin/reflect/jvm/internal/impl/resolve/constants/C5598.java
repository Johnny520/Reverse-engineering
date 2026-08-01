package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p065.AbstractC7359;
import p114.C8069;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5598 implements InterfaceC5705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6016 f14248;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f14249;

    public C5598(Set set) {
        C5706.f14520.getClass();
        C5706 c5706 = C5706.f14521;
        c5706.getClass();
        AbstractC5725.m10378(EmptyList.INSTANCE, c5706, this, C8069.m13031(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), false);
        this.f14248 = AbstractC6019.m10773(new C5602());
        this.f14249 = set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + AbstractC5176.m9369(this.f14249, ",", null, null, C5594.f14246, 30) + ']');
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7359 mo10052() {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5309 mo9770() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9771() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Collection mo10053() {
        return (List) this.f14248.getValue();
    }
}
