package p082;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7711 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7711 f18672 = new C7711(OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE, "SUCCESS");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final OverridingUtil$OverrideCompatibilityInfo$Result f18674;

    public C7711(OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$Result, String str) {
        if (overridingUtil$OverrideCompatibilityInfo$Result == null) {
            m12717(3);
            throw null;
        }
        this.f18674 = overridingUtil$OverrideCompatibilityInfo$Result;
        this.f18673 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7711 m12716(String str) {
        return new C7711(OverridingUtil$OverrideCompatibilityInfo$Result.INCOMPATIBLE, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m12717(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 3 : 2];
        if (i == 1 || i == 2) {
            objArr[0] = "debugMessage";
        } else if (i == 3) {
            objArr[0] = "success";
        } else if (i != 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                break;
            case 5:
                objArr[1] = "getResult";
                break;
            case 6:
                objArr[1] = "getDebugMessage";
                break;
            default:
                objArr[1] = "success";
                break;
        }
        if (i == 1) {
            objArr[2] = "incompatible";
        } else if (i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    public final String toString() {
        return this.f18674 + ": " + this.f18673;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final OverridingUtil$OverrideCompatibilityInfo$Result m12718() {
        OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$Result = this.f18674;
        if (overridingUtil$OverrideCompatibilityInfo$Result != null) {
            return overridingUtil$OverrideCompatibilityInfo$Result;
        }
        m12717(5);
        throw null;
    }
}
