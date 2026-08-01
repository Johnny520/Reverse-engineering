package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p049.AbstractC6530;
import p098.C7240;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4766 implements InterfaceC4873 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5184 f13903;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f13904;

    public C4766(Set set) {
        C4874.f14175.getClass();
        C4874 c4874 = C4874.f14176;
        c4874.getClass();
        AbstractC4893.m9819(EmptyList.INSTANCE, c4874, this, C7240.m12472(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), false);
        this.f13903 = AbstractC5187.m10214(new C4770());
        this.f13904 = set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + AbstractC4344.m8810(this.f13904, ",", null, null, C4762.f13901, 30) + ']');
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC6530 mo9493() {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4477 mo9211() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9212() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Collection mo9494() {
        return (List) this.f13903.getValue();
    }
}
