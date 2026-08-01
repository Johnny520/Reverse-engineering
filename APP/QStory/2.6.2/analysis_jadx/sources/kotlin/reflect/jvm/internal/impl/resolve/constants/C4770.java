package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import net.bytebuddy.pool.TypePool;
import p066.AbstractC6869;
import p079.AbstractC6988;
import p098.C7239;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4770 extends AbstractC4767 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4690 f13902;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4687 f13903;

    public C4770(C4687 c4687, C4690 c4690) {
        super(new Pair(c4687, c4690));
        this.f13903 = c4687;
        this.f13902 = c4690;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13903.m9333());
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13902);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4881 mo9501(InterfaceC4485 interfaceC4485) {
        AbstractC4877 abstractC4877Mo9035;
        interfaceC4485.getClass();
        C4687 c4687 = this.f13903;
        AbstractC6988 abstractC6988M9087 = AbstractC4490.m9087(interfaceC4485, c4687);
        if (abstractC6988M9087 != null) {
            int i = AbstractC6869.f18317;
            if (!AbstractC6869.m12088(abstractC6988M9087, ClassKind.ENUM_CLASS)) {
                abstractC6988M9087 = null;
            }
            if (abstractC6988M9087 != null && (abstractC4877Mo9035 = abstractC6988M9087.mo9035()) != null) {
                return abstractC4877Mo9035;
            }
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String string = c4687.toString();
        String str = this.f13902.f13701;
        str.getClass();
        return C7239.m12443(errorTypeKind, string, str);
    }
}
