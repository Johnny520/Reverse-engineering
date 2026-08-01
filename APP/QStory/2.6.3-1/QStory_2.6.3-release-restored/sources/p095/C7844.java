package p095;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5741;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import net.bytebuddy.description.method.MethodDescription;
import p065.AbstractC7359;
import p082.C7701;
import p082.C7703;
import p114.C8069;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7844 extends AbstractC5741 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7843 f19191;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5293 f19192;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7844(AbstractC7843 abstractC7843, C5677 c5677, C5293 c5293) {
        super(c5677);
        if (c5677 == null) {
            m12914(0);
            throw null;
        }
        this.f19191 = abstractC7843;
        this.f19192 = c5293;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m12914(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12914(2);
        throw null;
    }

    public final String toString() {
        return this.f19191.getName().f14050;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo10390(InterfaceC5309 interfaceC5309) {
        if (!(interfaceC5309 instanceof InterfaceC5295)) {
            return false;
        }
        return C7701.f18658.m12680(this.f19191, (InterfaceC5295) interfaceC5309, true, C7703.f18661);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C5293 mo9768() {
        C5293 c5293 = this.f19192;
        if (c5293 != null) {
            return c5293;
        }
        m12914(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC7359 mo10052() {
        AbstractC7359 abstractC7359M10058 = AbstractC5605.m10058(this.f19191);
        if (abstractC7359M10058 != null) {
            return abstractC7359M10058;
        }
        m12914(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC5714 mo10391() {
        return C8069.m13029(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9769() {
        List listMo9733 = this.f19191.mo9733();
        if (listMo9733 != null) {
            return listMo9733;
        }
        m12914(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5309 mo9770() {
        return this.f19191;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9771() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo10399(List list) {
        if (list == null) {
            m12914(7);
            throw null;
        }
        List listMo9732 = this.f19191.mo9732(list);
        if (listMo9732 != null) {
            return listMo9732;
        }
        m12914(8);
        throw null;
    }
}
