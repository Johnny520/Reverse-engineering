package p095;

import androidx.compose.runtime.AbstractC2167;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.renderer.C5576;
import net.bytebuddy.description.method.MethodDescription;
import p062.InterfaceC7310;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7838 extends AbstractC2167 implements InterfaceC5331 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5523 f19174;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7838(InterfaceC7310 interfaceC7310, C5523 c5523) {
        super(interfaceC7310);
        if (interfaceC7310 == null) {
            m12907(0);
            throw null;
        }
        if (c5523 == null) {
            m12907(1);
            throw null;
        }
        this.f19174 = c5523;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public static String m12906(InterfaceC5331 interfaceC5331) {
        try {
            return C5576.f14233.m10032(interfaceC5331) + "[" + interfaceC5331.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC5331)) + "]";
        } catch (Throwable unused) {
            return interfaceC5331.getClass().getSimpleName() + " " + interfaceC5331.getName();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12907(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    public final C5523 getName() {
        C5523 c5523 = this.f19174;
        if (c5523 != null) {
            return c5523;
        }
        m12907(2);
        throw null;
    }

    public String toString() {
        return m12906(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public InterfaceC5331 mo9561() {
        return this;
    }
}
