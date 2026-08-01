package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5752 extends AbstractC5739 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f14595;

    public C5752(String str) {
        this.f14595 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m10423(int i) {
        String str = (i == 1 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else if (i == 2) {
            objArr[0] = MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX;
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 4) {
            objArr[0] = "newAttributes";
        }
        if (i == 1) {
            objArr[1] = "toString";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else {
            objArr[1] = "refine";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "replaceDelegate";
            } else if (i == 3) {
                objArr[2] = "refine";
            } else if (i != 4) {
                objArr[2] = "replaceAttributes";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    public final String toString() {
        return this.f14595;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739, kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC5714 mo10289(AbstractC5693 abstractC5693) {
        if (abstractC5693 != null) {
            return this;
        }
        m10423(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC5710 mo10329(C5706 c5706) {
        if (c5706 != null) {
            throw new IllegalStateException(this.f14595);
        }
        m10423(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC5710 mo10290(boolean z) {
        throw new IllegalStateException(this.f14595);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final AbstractC5710 mo10280(AbstractC5693 abstractC5693) {
        if (abstractC5693 != null) {
            return this;
        }
        m10423(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC5739 mo10330(AbstractC5710 abstractC5710) {
        throw new IllegalStateException(this.f14595);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC5710 mo10340() {
        throw new IllegalStateException(this.f14595);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739, kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC5746 mo10289(AbstractC5693 abstractC5693) {
        if (abstractC5693 != null) {
            return this;
        }
        m10423(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710, kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5746 mo10290(boolean z) {
        mo10290(z);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710, kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final /* bridge */ /* synthetic */ AbstractC5746 mo10329(C5706 c5706) {
        mo10329(c5706);
        throw null;
    }
}
