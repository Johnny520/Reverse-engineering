package p079;

import java.util.List;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.C5041;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7013 extends AbstractC7007 implements InterfaceC4462 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C4844 f18845;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Variance f18846;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4846 f18847;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4846 f18848;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f18849;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f18850;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7013(C4844 c4844, InterfaceC4498 interfaceC4498, InterfaceC6480 interfaceC6480, C4690 c4690, Variance variance, boolean z, int i, C4460 c4460) {
        super(interfaceC4498, interfaceC6480, c4690, InterfaceC4461.f13087);
        boolean z2 = false;
        if (c4844 == null) {
            m12327(0);
            throw null;
        }
        if (interfaceC4498 == null) {
            m12327(1);
            throw null;
        }
        if (interfaceC6480 == null) {
            m12327(2);
            throw null;
        }
        if (c4690 == null) {
            m12327(3);
            throw null;
        }
        if (variance == null) {
            m12327(4);
            throw null;
        }
        if (c4460 == null) {
            m12327(6);
            throw null;
        }
        this.f18846 = variance;
        this.f18849 = z;
        this.f18850 = i;
        this.f18847 = new C4846(c4844, new C5041(this, c4844, c4460));
        this.f18848 = new C4846(c4844, new C5027(18, this, c4690, z2));
        this.f18845 = c4844;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12327(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    public final int getIndex() {
        return this.f18850;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    public final List getUpperBounds() {
        List listMo9504 = ((C7014) mo9011()).mo9504();
        if (listMo9504 != null) {
            return listMo9504;
        }
        m12327(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo9009() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final C4844 mo9010() {
        C4844 c4844 = this.f18845;
        if (c4844 != null) {
            return c4844;
        }
        m12327(14);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public List mo9183(List list) {
        if (list == null) {
            m12327(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        m12327(13);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public abstract List mo9184();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4872 mo9011() {
        InterfaceC4872 interfaceC4872 = (InterfaceC4872) this.f18847.invoke();
        if (interfaceC4872 != null) {
            return interfaceC4872;
        }
        m12327(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9037(InterfaceC4496 interfaceC4496, Object obj) {
        return interfaceC4496.mo301(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Variance mo9013() {
        Variance variance = this.f18846;
        if (variance != null) {
            return variance;
        }
        m12327(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo9014() {
        return this.f18849;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final AbstractC4877 mo9035() {
        AbstractC4877 abstractC4877 = (AbstractC4877) this.f18848.invoke();
        if (abstractC4877 != null) {
            return abstractC4877;
        }
        m12327(10);
        throw null;
    }

    @Override // p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4498 mo9012() {
        return this;
    }

    @Override // p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4462 mo9012() {
        return this;
    }

    @Override // p079.AbstractC7007
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final InterfaceC4499 mo9012() {
        return this;
    }

    @Override // p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4476 mo9012() {
        return this;
    }
}
