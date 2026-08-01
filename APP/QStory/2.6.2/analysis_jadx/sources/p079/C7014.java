package p079;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4908;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import net.bytebuddy.description.method.MethodDescription;
import p049.AbstractC6529;
import p066.C6871;
import p066.C6873;
import p098.C7239;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7014 extends AbstractC4908 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7013 f18851;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4460 f18852;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7014(AbstractC7013 abstractC7013, C4844 c4844, C4460 c4460) {
        super(c4844);
        if (c4844 == null) {
            m12328(0);
            throw null;
        }
        this.f18851 = abstractC7013;
        this.f18852 = c4460;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m12328(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12328(2);
        throw null;
    }

    public final String toString() {
        return this.f18851.getName().f13701;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo9837(InterfaceC4476 interfaceC4476) {
        if (!(interfaceC4476 instanceof InterfaceC4462)) {
            return false;
        }
        return C6871.f18318.m12093(this.f18851, (InterfaceC4462) interfaceC4476, true, C6873.f18321);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4460 mo9219() {
        C4460 c4460 = this.f18852;
        if (c4460 != null) {
            return c4460;
        }
        m12328(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6529 mo9503() {
        AbstractC6529 abstractC6529M9509 = AbstractC4772.m9509(this.f18851);
        if (abstractC6529M9509 != null) {
            return abstractC6529M9509;
        }
        m12328(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC4881 mo9838() {
        return C7239.m12443(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9220() {
        List listMo9184 = this.f18851.mo9184();
        if (listMo9184 != null) {
            return listMo9184;
        }
        m12328(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4476 mo9221() {
        return this.f18851;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9222() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo9846(List list) {
        if (list == null) {
            m12328(7);
            throw null;
        }
        List listMo9183 = this.f18851.mo9183(list);
        if (listMo9183 != null) {
            return listMo9183;
        }
        m12328(8);
        throw null;
    }
}
