package p079;

import androidx.compose.runtime.AbstractC1332;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.renderer.C4744;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7009 extends AbstractC1332 implements InterfaceC4499 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4691 f18829;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7009(InterfaceC6481 interfaceC6481, C4691 c4691) {
        super(interfaceC6481);
        if (interfaceC6481 == null) {
            m12348(0);
            throw null;
        }
        if (c4691 == null) {
            m12348(1);
            throw null;
        }
        this.f18829 = c4691;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public static String m12347(InterfaceC4499 interfaceC4499) {
        try {
            return C4744.f13888.m9473(interfaceC4499) + "[" + interfaceC4499.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC4499)) + "]";
        } catch (Throwable unused) {
            return interfaceC4499.getClass().getSimpleName() + " " + interfaceC4499.getName();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12348(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    public final C4691 getName() {
        C4691 c4691 = this.f18829;
        if (c4691 != null) {
            return c4691;
        }
        m12348(2);
        throw null;
    }

    public String toString() {
        return m12347(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public InterfaceC4499 mo9002() {
        return this;
    }
}
