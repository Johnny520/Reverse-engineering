package p079;

import androidx.compose.runtime.AbstractC1332;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7008 extends AbstractC1332 implements InterfaceC4498 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4690 f18834;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7008(InterfaceC6480 interfaceC6480, C4690 c4690) {
        super(interfaceC6480);
        if (interfaceC6480 == null) {
            m12321(0);
            throw null;
        }
        if (c4690 == null) {
            m12321(1);
            throw null;
        }
        this.f18834 = c4690;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public static String m12320(InterfaceC4498 interfaceC4498) {
        try {
            return C4743.f13884.m9483(interfaceC4498) + "[" + interfaceC4498.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC4498)) + "]";
        } catch (Throwable unused) {
            return interfaceC4498.getClass().getSimpleName() + " " + interfaceC4498.getName();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12321(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    public final C4690 getName() {
        C4690 c4690 = this.f18834;
        if (c4690 != null) {
            return c4690;
        }
        m12321(2);
        throw null;
    }

    public String toString() {
        return m12320(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public InterfaceC4498 mo9012() {
        return this;
    }
}
