package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import net.bytebuddy.pool.TypePool;
import p082.AbstractC7699;
import p095.AbstractC7818;
import p114.C8069;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5603 extends AbstractC5600 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5523 f14251;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5520 f14252;

    public C5603(C5520 c5520, C5523 c5523) {
        super(new Pair(c5520, c5523));
        this.f14252 = c5520;
        this.f14251 = c5523;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14252.m9882());
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f14251);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC5714 mo10050(InterfaceC5318 interfaceC5318) {
        AbstractC5710 abstractC5710Mo9584;
        interfaceC5318.getClass();
        C5520 c5520 = this.f14252;
        AbstractC7818 abstractC7818M9636 = AbstractC5323.m9636(interfaceC5318, c5520);
        if (abstractC7818M9636 != null) {
            int i = AbstractC7699.f18657;
            if (!AbstractC7699.m12675(abstractC7818M9636, ClassKind.ENUM_CLASS)) {
                abstractC7818M9636 = null;
            }
            if (abstractC7818M9636 != null && (abstractC5710Mo9584 = abstractC7818M9636.mo9584()) != null) {
                return abstractC5710Mo9584;
            }
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String string = c5520.toString();
        String str = this.f14251.f14050;
        str.getClass();
        return C8069.m13029(errorTypeKind, string, str);
    }
}
