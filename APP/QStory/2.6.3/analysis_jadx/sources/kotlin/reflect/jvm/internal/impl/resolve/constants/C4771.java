package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import net.bytebuddy.pool.TypePool;
import p066.AbstractC6870;
import p079.AbstractC6989;
import p098.C7240;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4771 extends AbstractC4768 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4691 f13906;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4688 f13907;

    public C4771(C4688 c4688, C4691 c4691) {
        super(new Pair(c4688, c4691));
        this.f13907 = c4688;
        this.f13906 = c4691;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13907.m9323());
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13906);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4882 mo9491(InterfaceC4486 interfaceC4486) {
        AbstractC4878 abstractC4878Mo9025;
        interfaceC4486.getClass();
        C4688 c4688 = this.f13907;
        AbstractC6989 abstractC6989M9077 = AbstractC4491.m9077(interfaceC4486, c4688);
        if (abstractC6989M9077 != null) {
            int i = AbstractC6870.f18312;
            if (!AbstractC6870.m12116(abstractC6989M9077, ClassKind.ENUM_CLASS)) {
                abstractC6989M9077 = null;
            }
            if (abstractC6989M9077 != null && (abstractC4878Mo9025 = abstractC6989M9077.mo9025()) != null) {
                return abstractC4878Mo9025;
            }
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String string = c4688.toString();
        String str = this.f13906.f13705;
        str.getClass();
        return C7240.m12470(errorTypeKind, string, str);
    }
}
