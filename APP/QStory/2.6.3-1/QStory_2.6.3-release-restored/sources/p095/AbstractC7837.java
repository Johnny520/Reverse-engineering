package p095;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import net.bytebuddy.description.method.MethodDescription;
import p062.InterfaceC7310;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7837 extends AbstractC7838 implements InterfaceC5332 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC5294 f19172;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5331 f19173;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7837(InterfaceC5331 interfaceC5331, InterfaceC7310 interfaceC7310, C5523 c5523, InterfaceC5294 interfaceC5294) {
        super(interfaceC7310, c5523);
        if (interfaceC5331 == null) {
            m12905(0);
            throw null;
        }
        if (interfaceC7310 == null) {
            m12905(1);
            throw null;
        }
        if (c5523 == null) {
            m12905(2);
            throw null;
        }
        if (interfaceC5294 == null) {
            m12905(3);
            throw null;
        }
        this.f19173 = interfaceC5331;
        this.f19172 = interfaceC5294;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12905(int i) {
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
    public InterfaceC5294 mo9585() {
        InterfaceC5294 interfaceC5294 = this.f19172;
        if (interfaceC5294 != null) {
            return interfaceC5294;
        }
        m12905(6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC5331 mo9587() {
        InterfaceC5331 interfaceC5331 = this.f19173;
        if (interfaceC5331 != null) {
            return interfaceC5331;
        }
        m12905(5);
        throw null;
    }

    @Override // p095.AbstractC7838, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public InterfaceC5332 mo9561() {
        return this;
    }
}
