package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import net.bytebuddy.description.method.MethodDescription;
import p082.AbstractC7699;
import p095.AbstractC7818;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5743 extends AbstractC5726 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Collection f14582;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final List f14583;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7818 f14584;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5743(AbstractC7818 abstractC7818, List list, Collection collection, C5677 c5677) {
        super(c5677);
        if (list == null) {
            m10401(1);
            throw null;
        }
        if (collection == null) {
            m10401(2);
            throw null;
        }
        if (c5677 == null) {
            m10401(3);
            throw null;
        }
        this.f14584 = abstractC7818;
        this.f14583 = Collections.unmodifiableList(new ArrayList(list));
        this.f14582 = Collections.unmodifiableCollection(collection);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m10401(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    public final List getParameters() {
        List list = this.f14583;
        if (list != null) {
            return list;
        }
        m10401(4);
        throw null;
    }

    public final String toString() {
        return AbstractC7699.m12660(this.f14584).f14038;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C5293 mo9768() {
        return C5293.f13434;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9769() {
        Collection collection = this.f14582;
        if (collection != null) {
            return collection;
        }
        m10401(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9771() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5726
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final AbstractC7818 mo9770() {
        AbstractC7818 abstractC7818 = this.f14584;
        if (abstractC7818 != null) {
            return abstractC7818;
        }
        m10401(5);
        throw null;
    }
}
