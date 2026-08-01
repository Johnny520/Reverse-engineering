package p079;

import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6998 extends AbstractC7013 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6998(C4844 c4844, InterfaceC4498 interfaceC4498, InterfaceC6480 interfaceC6480, C4690 c4690, Variance variance, boolean z, int i, C4460 c4460) {
        super(c4844, interfaceC4498, interfaceC6480, c4690, variance, z, i, c4460);
        if (c4844 == null) {
            m12301(0);
            throw null;
        }
        if (interfaceC4498 == null) {
            m12301(1);
            throw null;
        }
        if (variance == null) {
            m12301(4);
            throw null;
        }
        if (c4460 != null) {
        } else {
            m12301(6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12301(int i) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p079.AbstractC7008
    public final String toString() {
        String str = "";
        String str2 = this.f18849 ? "reified " : "";
        if (mo9013() != Variance.INVARIANT) {
            str = mo9013() + " ";
        }
        return str2 + str + getName();
    }
}
