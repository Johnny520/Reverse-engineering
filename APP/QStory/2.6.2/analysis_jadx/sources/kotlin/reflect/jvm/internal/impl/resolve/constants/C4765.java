package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p049.AbstractC6529;
import p098.C7239;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4765 implements InterfaceC4872 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5183 f13899;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f13900;

    public C4765(Set set) {
        C4873.f14171.getClass();
        C4873 c4873 = C4873.f14172;
        c4873.getClass();
        AbstractC4892.m9825(EmptyList.INSTANCE, c4873, this, C7239.m12445(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), false);
        this.f13899 = AbstractC5186.m10210(new C4769());
        this.f13900 = set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + AbstractC4343.m8813(this.f13900, ",", null, null, C4761.f13897, 30) + ']');
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC6529 mo9503() {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4476 mo9221() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9222() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Collection mo9504() {
        return (List) this.f13899.getValue();
    }
}
