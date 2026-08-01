package p095;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7848 extends AbstractC7829 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5331 f19202;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5294 f19203;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7848(C5677 c5677, InterfaceC5331 interfaceC5331, C5523 c5523, InterfaceC5294 interfaceC5294) {
        super(c5677, c5523);
        if (c5677 == null) {
            m12924(0);
            throw null;
        }
        if (interfaceC5331 == null) {
            m12924(1);
            throw null;
        }
        if (c5523 == null) {
            m12924(2);
            throw null;
        }
        this.f19202 = interfaceC5331;
        this.f19203 = interfaceC5294;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static /* synthetic */ void m12924(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5294 mo9585() {
        InterfaceC5294 interfaceC5294 = this.f19203;
        if (interfaceC5294 != null) {
            return interfaceC5294;
        }
        m12924(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5331 mo9587() {
        InterfaceC5331 interfaceC5331 = this.f19202;
        if (interfaceC5331 != null) {
            return interfaceC5331;
        }
        m12924(4);
        throw null;
    }
}
