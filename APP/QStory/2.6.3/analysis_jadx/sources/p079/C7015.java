package p079;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4909;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import net.bytebuddy.description.method.MethodDescription;
import p049.AbstractC6530;
import p066.C6872;
import p066.C6874;
import p098.C7240;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7015 extends AbstractC4909 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7014 f18846;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4461 f18847;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7015(AbstractC7014 abstractC7014, C4845 c4845, C4461 c4461) {
        super(c4845);
        if (c4845 == null) {
            m12355(0);
            throw null;
        }
        this.f18846 = abstractC7014;
        this.f18847 = c4461;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m12355(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12355(2);
        throw null;
    }

    public final String toString() {
        return this.f18846.getName().f13705;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo9831(InterfaceC4477 interfaceC4477) {
        if (!(interfaceC4477 instanceof InterfaceC4463)) {
            return false;
        }
        return C6872.f18313.m12121(this.f18846, (InterfaceC4463) interfaceC4477, true, C6874.f18316);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4461 mo9209() {
        C4461 c4461 = this.f18847;
        if (c4461 != null) {
            return c4461;
        }
        m12355(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6530 mo9493() {
        AbstractC6530 abstractC6530M9499 = AbstractC4773.m9499(this.f18846);
        if (abstractC6530M9499 != null) {
            return abstractC6530M9499;
        }
        m12355(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC4882 mo9832() {
        return C7240.m12470(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9210() {
        List listMo9174 = this.f18846.mo9174();
        if (listMo9174 != null) {
            return listMo9174;
        }
        m12355(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4477 mo9211() {
        return this.f18846;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9212() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo9840(List list) {
        if (list == null) {
            m12355(7);
            throw null;
        }
        List listMo9173 = this.f18846.mo9173(list);
        if (listMo9173 != null) {
            return listMo9173;
        }
        m12355(8);
        throw null;
    }
}
