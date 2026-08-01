package p095;

import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import net.bytebuddy.description.method.MethodDescription;
import p062.InterfaceC7310;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7828 extends AbstractC7843 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7828(C5677 c5677, InterfaceC5331 interfaceC5331, InterfaceC7310 interfaceC7310, C5523 c5523, Variance variance, boolean z, int i, C5293 c5293) {
        super(c5677, interfaceC5331, interfaceC7310, c5523, variance, z, i, c5293);
        if (c5677 == null) {
            m12887(0);
            throw null;
        }
        if (interfaceC5331 == null) {
            m12887(1);
            throw null;
        }
        if (variance == null) {
            m12887(4);
            throw null;
        }
        if (c5293 != null) {
        } else {
            m12887(6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12887(int i) {
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

    @Override // p095.AbstractC7838
    public final String toString() {
        String str = "";
        String str2 = this.f19189 ? "reified " : "";
        if (mo9562() != Variance.INVARIANT) {
            str = mo9562() + " ";
        }
        return str2 + str + getName();
    }
}
