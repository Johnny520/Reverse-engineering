package p079;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7008 extends AbstractC7009 implements InterfaceC4500 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4462 f18827;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4499 f18828;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7008(InterfaceC4499 interfaceC4499, InterfaceC6481 interfaceC6481, C4691 c4691, InterfaceC4462 interfaceC4462) {
        super(interfaceC6481, c4691);
        if (interfaceC4499 == null) {
            m12346(0);
            throw null;
        }
        if (interfaceC6481 == null) {
            m12346(1);
            throw null;
        }
        if (c4691 == null) {
            m12346(2);
            throw null;
        }
        if (interfaceC4462 == null) {
            m12346(3);
            throw null;
        }
        this.f18828 = interfaceC4499;
        this.f18827 = interfaceC4462;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12346(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC4462 mo9026() {
        InterfaceC4462 interfaceC4462 = this.f18827;
        if (interfaceC4462 != null) {
            return interfaceC4462;
        }
        m12346(6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC4499 mo9028() {
        InterfaceC4499 interfaceC4499 = this.f18828;
        if (interfaceC4499 != null) {
            return interfaceC4499;
        }
        m12346(5);
        throw null;
    }

    @Override // p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public InterfaceC4500 mo9002() {
        return this;
    }
}
