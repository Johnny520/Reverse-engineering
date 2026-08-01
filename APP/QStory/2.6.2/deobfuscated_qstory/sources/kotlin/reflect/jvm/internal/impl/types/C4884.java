package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.runtime.C1322;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.checker.C4848;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4884 extends AbstractC4869 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f14193;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f14194;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f14195 = 0;

    public C4884(InterfaceC4462 interfaceC4462) {
        interfaceC4462.getClass();
        this.f14194 = interfaceC4462;
        this.f14193 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C1322(this, 8));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m9782(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4869
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC4869 mo9749(AbstractC4860 abstractC4860) {
        switch (this.f14195) {
            case 0:
                abstractC4860.getClass();
                return this;
            default:
                if (abstractC4860 == null) {
                    m9782(6);
                    throw null;
                }
                Variance variance = (Variance) this.f14194;
                AbstractC4881 abstractC4881 = (AbstractC4881) this.f14193;
                ((C4848) abstractC4860).getClass();
                abstractC4881.getClass();
                return new C4884(abstractC4881, variance);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4869
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo9750() {
        switch (this.f14195) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4869
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC4881 mo9751() {
        int i = this.f14195;
        Object obj = this.f14193;
        switch (i) {
            case 0:
                return (AbstractC4881) ((InterfaceC5183) obj).getValue();
            default:
                AbstractC4881 abstractC4881 = (AbstractC4881) obj;
                if (abstractC4881 != null) {
                    return abstractC4881;
                }
                m9782(5);
                throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4869
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Variance mo9752() {
        switch (this.f14195) {
            case 0:
                return Variance.OUT_VARIANCE;
            default:
                Variance variance = (Variance) this.f14194;
                if (variance != null) {
                    return variance;
                }
                m9782(4);
                throw null;
        }
    }

    public C4884(AbstractC4881 abstractC4881, Variance variance) {
        if (variance == null) {
            m9782(0);
            throw null;
        }
        if (abstractC4881 != null) {
            this.f14194 = variance;
            this.f14193 = abstractC4881;
        } else {
            m9782(1);
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4884(AbstractC4881 abstractC4881) {
        this(abstractC4881, Variance.INVARIANT);
        if (abstractC4881 != null) {
        } else {
            m9782(2);
            throw null;
        }
    }
}
