package p069;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import net.bytebuddy.description.type.TypeDescription;
import p097.InterfaceC7222;
import p098.C7239;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: 飘花落叶言世楪兰苏子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6896 extends AbstractC4877 implements InterfaceC7222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4873 f18356;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f18357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4869 f18358;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6894 f18359;

    public C6896(AbstractC4869 abstractC4869, C6894 c6894, boolean z, C4873 c4873) {
        abstractC4869.getClass();
        c4873.getClass();
        this.f18358 = abstractC4869;
        this.f18359 = c6894;
        this.f18357 = z;
        this.f18356 = c4873;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f18358);
        sb.append(')');
        sb.append(this.f18357 ? TypeDescription.Generic.OfWildcardType.SYMBOL : "");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4881 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        return new C6896(this.f18358.mo9749(abstractC4860), this.f18359, this.f18357, this.f18356);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC4872 mo9732() {
        return this.f18359;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C4873 mo9733() {
        return this.f18356;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7253 mo9734() {
        return C7239.m12445(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9735() {
        return this.f18357;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo9736() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4877 mo9776(C4873 c4873) {
        c4873.getClass();
        return new C6896(this.f18358, this.f18359, this.f18357, c4873);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4877 mo9741(boolean z) {
        if (z == this.f18357) {
            return this;
        }
        return new C6896(this.f18358, this.f18359, z, this.f18356);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4913 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        return new C6896(this.f18358.mo9749(abstractC4860), this.f18359, this.f18357, this.f18356);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877, kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC4913 mo9741(boolean z) {
        if (z == this.f18357) {
            return this;
        }
        return new C6896(this.f18358, this.f18359, z, this.f18356);
    }
}
