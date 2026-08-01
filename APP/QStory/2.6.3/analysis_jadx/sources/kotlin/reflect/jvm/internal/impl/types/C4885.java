package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.runtime.C1322;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.checker.C4849;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4885 extends AbstractC4870 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f14197;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f14198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f14199 = 0;

    public C4885(InterfaceC4463 interfaceC4463) {
        interfaceC4463.getClass();
        this.f14198 = interfaceC4463;
        this.f14197 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C1322(this, 8));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m9776(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4870
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC4870 mo9739(AbstractC4861 abstractC4861) {
        switch (this.f14199) {
            case 0:
                abstractC4861.getClass();
                return this;
            default:
                if (abstractC4861 == null) {
                    m9776(6);
                    throw null;
                }
                Variance variance = (Variance) this.f14198;
                AbstractC4882 abstractC4882 = (AbstractC4882) this.f14197;
                ((C4849) abstractC4861).getClass();
                abstractC4882.getClass();
                return new C4885(abstractC4882, variance);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4870
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo9740() {
        switch (this.f14199) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4870
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC4882 mo9741() {
        int i = this.f14199;
        Object obj = this.f14197;
        switch (i) {
            case 0:
                return (AbstractC4882) ((InterfaceC5184) obj).getValue();
            default:
                AbstractC4882 abstractC4882 = (AbstractC4882) obj;
                if (abstractC4882 != null) {
                    return abstractC4882;
                }
                m9776(5);
                throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4870
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Variance mo9742() {
        switch (this.f14199) {
            case 0:
                return Variance.OUT_VARIANCE;
            default:
                Variance variance = (Variance) this.f14198;
                if (variance != null) {
                    return variance;
                }
                m9776(4);
                throw null;
        }
    }

    public C4885(AbstractC4882 abstractC4882, Variance variance) {
        if (variance == null) {
            m9776(0);
            throw null;
        }
        if (abstractC4882 != null) {
            this.f14198 = variance;
            this.f14197 = abstractC4882;
        } else {
            m9776(1);
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4885(AbstractC4882 abstractC4882) {
        this(abstractC4882, Variance.INVARIANT);
        if (abstractC4882 != null) {
        } else {
            m9776(2);
            throw null;
        }
    }
}
