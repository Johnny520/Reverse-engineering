package p079;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6481;
import p046.InterfaceC6480;
import p066.AbstractC6869;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6981 extends AbstractC7013 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f18683;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ArrayList f18684;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6981(InterfaceC4498 interfaceC4498, InterfaceC6480 interfaceC6480, boolean z, Variance variance, C4690 c4690, int i, C4844 c4844) {
        C4460 c4460 = C4460.f13085;
        if (interfaceC4498 == null) {
            m12273(19);
            throw null;
        }
        if (interfaceC6480 == null) {
            m12273(20);
            throw null;
        }
        if (variance == null) {
            m12273(21);
            throw null;
        }
        if (c4690 == null) {
            m12273(22);
            throw null;
        }
        if (c4844 == null) {
            m12273(25);
            throw null;
        }
        super(c4844, interfaceC4498, interfaceC6480, c4690, variance, z, i, c4460);
        this.f18684 = new ArrayList(1);
        this.f18683 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public static C6981 m12271(AbstractC6999 abstractC6999, Variance variance, C4690 c4690, int i, C4844 c4844) {
        if (variance == null) {
            m12273(2);
            throw null;
        }
        if (c4844 == null) {
            m12273(4);
            throw null;
        }
        C6981 c6981M12272 = m12272(abstractC6999, C6481.f17772, false, variance, c4690, i, c4844);
        AbstractC4877 abstractC4877M11990 = AbstractC4772.m9509(abstractC6999).m11990();
        if (c6981M12272.f18683) {
            C5919.m11250("Type parameter descriptor is already initialized: ".concat(c6981M12272.m12274()));
            return null;
        }
        if (!AbstractC4892.m9835(abstractC4877M11990)) {
            c6981M12272.f18684.add(abstractC4877M11990);
        }
        if (c6981M12272.f18683) {
            C5919.m11250("Type parameter descriptor is already initialized: ".concat(c6981M12272.m12274()));
            return null;
        }
        c6981M12272.f18683 = true;
        return c6981M12272;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static C6981 m12272(InterfaceC4498 interfaceC4498, InterfaceC6480 interfaceC6480, boolean z, Variance variance, C4690 c4690, int i, C4844 c4844) {
        if (interfaceC4498 == null) {
            m12273(6);
            throw null;
        }
        if (interfaceC6480 == null) {
            m12273(7);
            throw null;
        }
        if (variance == null) {
            m12273(8);
            throw null;
        }
        if (c4690 == null) {
            m12273(9);
            throw null;
        }
        if (c4844 != null) {
            return new C6981(interfaceC4498, interfaceC6480, z, variance, c4690, i, c4844);
        }
        m12273(11);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12273(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final String m12274() {
        return getName() + " declared in " + AbstractC6869.m12073(mo9038());
    }

    @Override // p079.AbstractC7013
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final List mo9184() {
        if (!this.f18683) {
            C5919.m11250("Type parameter descriptor is not initialized: ".concat(m12274()));
            return null;
        }
        ArrayList arrayList = this.f18684;
        if (arrayList != null) {
            return arrayList;
        }
        m12273(28);
        throw null;
    }
}
