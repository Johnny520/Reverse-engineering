package p079;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7007 extends AbstractC7008 implements InterfaceC4499 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4461 f18832;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4498 f18833;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7007(InterfaceC4498 interfaceC4498, InterfaceC6480 interfaceC6480, C4690 c4690, InterfaceC4461 interfaceC4461) {
        super(interfaceC6480, c4690);
        if (interfaceC4498 == null) {
            m12319(0);
            throw null;
        }
        if (interfaceC6480 == null) {
            m12319(1);
            throw null;
        }
        if (c4690 == null) {
            m12319(2);
            throw null;
        }
        if (interfaceC4461 == null) {
            m12319(3);
            throw null;
        }
        this.f18833 = interfaceC4498;
        this.f18832 = interfaceC4461;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12319(int i) {
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
    public InterfaceC4461 mo9036() {
        InterfaceC4461 interfaceC4461 = this.f18832;
        if (interfaceC4461 != null) {
            return interfaceC4461;
        }
        m12319(6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC4498 mo9038() {
        InterfaceC4498 interfaceC4498 = this.f18833;
        if (interfaceC4498 != null) {
            return interfaceC4498;
        }
        m12319(5);
        throw null;
    }

    @Override // p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public InterfaceC4499 mo9012() {
        return this;
    }
}
