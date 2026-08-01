package p079;

import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6999 extends AbstractC7014 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6999(C4845 c4845, InterfaceC4499 interfaceC4499, InterfaceC6481 interfaceC6481, C4691 c4691, Variance variance, boolean z, int i, C4461 c4461) {
        super(c4845, interfaceC4499, interfaceC6481, c4691, variance, z, i, c4461);
        if (c4845 == null) {
            m12328(0);
            throw null;
        }
        if (interfaceC4499 == null) {
            m12328(1);
            throw null;
        }
        if (variance == null) {
            m12328(4);
            throw null;
        }
        if (c4461 != null) {
        } else {
            m12328(6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12328(int i) {
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

    @Override // p079.AbstractC7009
    public final String toString() {
        String str = "";
        String str2 = this.f18844 ? "reified " : "";
        if (mo9003() != Variance.INVARIANT) {
            str = mo9003() + " ";
        }
        return str2 + str + getName();
    }
}
