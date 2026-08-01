package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import net.bytebuddy.description.method.MethodDescription;
import p066.AbstractC6870;
import p079.AbstractC6989;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4911 extends AbstractC4894 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Collection f14237;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final List f14238;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC6989 f14239;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4911(AbstractC6989 abstractC6989, List list, Collection collection, C4845 c4845) {
        super(c4845);
        if (list == null) {
            m9842(1);
            throw null;
        }
        if (collection == null) {
            m9842(2);
            throw null;
        }
        if (c4845 == null) {
            m9842(3);
            throw null;
        }
        this.f14239 = abstractC6989;
        this.f14238 = Collections.unmodifiableList(new ArrayList(list));
        this.f14237 = Collections.unmodifiableCollection(collection);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m9842(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    public final List getParameters() {
        List list = this.f14238;
        if (list != null) {
            return list;
        }
        m9842(4);
        throw null;
    }

    public final String toString() {
        return AbstractC6870.m12101(this.f14239).f13693;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4461 mo9209() {
        return C4461.f13089;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9210() {
        Collection collection = this.f14237;
        if (collection != null) {
            return collection;
        }
        m9842(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9212() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4894
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final AbstractC6989 mo9211() {
        AbstractC6989 abstractC6989 = this.f14239;
        if (abstractC6989 != null) {
            return abstractC6989;
        }
        m9842(5);
        throw null;
    }
}
