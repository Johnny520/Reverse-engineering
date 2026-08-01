package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.runtime.C2157;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import kotlin.reflect.jvm.internal.impl.types.checker.C5681;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5717 extends AbstractC5702 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f14542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f14543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f14544 = 0;

    public C5717(InterfaceC5295 interfaceC5295) {
        interfaceC5295.getClass();
        this.f14543 = interfaceC5295;
        this.f14542 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C2157(this, 8));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m10335(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5702
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC5702 mo10298(AbstractC5693 abstractC5693) {
        switch (this.f14544) {
            case 0:
                abstractC5693.getClass();
                return this;
            default:
                if (abstractC5693 == null) {
                    m10335(6);
                    throw null;
                }
                Variance variance = (Variance) this.f14543;
                AbstractC5714 abstractC5714 = (AbstractC5714) this.f14542;
                ((C5681) abstractC5693).getClass();
                abstractC5714.getClass();
                return new C5717(abstractC5714, variance);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5702
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo10299() {
        switch (this.f14544) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5702
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC5714 mo10300() {
        int i = this.f14544;
        Object obj = this.f14542;
        switch (i) {
            case 0:
                return (AbstractC5714) ((InterfaceC6016) obj).getValue();
            default:
                AbstractC5714 abstractC5714 = (AbstractC5714) obj;
                if (abstractC5714 != null) {
                    return abstractC5714;
                }
                m10335(5);
                throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5702
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Variance mo10301() {
        switch (this.f14544) {
            case 0:
                return Variance.OUT_VARIANCE;
            default:
                Variance variance = (Variance) this.f14543;
                if (variance != null) {
                    return variance;
                }
                m10335(4);
                throw null;
        }
    }

    public C5717(AbstractC5714 abstractC5714, Variance variance) {
        if (variance == null) {
            m10335(0);
            throw null;
        }
        if (abstractC5714 != null) {
            this.f14543 = variance;
            this.f14542 = abstractC5714;
        } else {
            m10335(1);
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5717(AbstractC5714 abstractC5714) {
        this(abstractC5714, Variance.INVARIANT);
        if (abstractC5714 != null) {
        } else {
            m10335(2);
            throw null;
        }
    }
}
