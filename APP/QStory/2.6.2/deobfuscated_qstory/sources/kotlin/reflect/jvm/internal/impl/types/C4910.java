package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import net.bytebuddy.description.method.MethodDescription;
import p066.AbstractC6869;
import p079.AbstractC6988;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4910 extends AbstractC4893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Collection f14233;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final List f14234;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC6988 f14235;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4910(AbstractC6988 abstractC6988, List list, Collection collection, C4844 c4844) {
        super(c4844);
        if (list == null) {
            m9848(1);
            throw null;
        }
        if (collection == null) {
            m9848(2);
            throw null;
        }
        if (c4844 == null) {
            m9848(3);
            throw null;
        }
        this.f14235 = abstractC6988;
        this.f14234 = Collections.unmodifiableList(new ArrayList(list));
        this.f14233 = Collections.unmodifiableCollection(collection);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m9848(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    public final List getParameters() {
        List list = this.f14234;
        if (list != null) {
            return list;
        }
        m9848(4);
        throw null;
    }

    public final String toString() {
        return AbstractC6869.m12073(this.f14235).f13689;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4460 mo9219() {
        return C4460.f13085;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9220() {
        Collection collection = this.f14233;
        if (collection != null) {
            return collection;
        }
        m9848(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9222() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4893
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final AbstractC6988 mo9221() {
        AbstractC6988 abstractC6988 = this.f14235;
        if (abstractC6988 != null) {
            return abstractC6988;
        }
        m9848(5);
        throw null;
    }
}
