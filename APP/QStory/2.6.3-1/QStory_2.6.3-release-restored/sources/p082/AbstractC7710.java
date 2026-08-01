package p082;

import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC7710 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f18669;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f18670;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f18671;

    static {
        int[] iArr = new int[Modality.values().length];
        f18669 = iArr;
        try {
            iArr[Modality.FINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18669[Modality.SEALED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18669[Modality.OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18669[Modality.ABSTRACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[OverridingUtil$OverrideCompatibilityInfo$Result.values().length];
        f18670 = iArr2;
        try {
            iArr2[OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18670[OverridingUtil$OverrideCompatibilityInfo$Result.CONFLICT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f18670[OverridingUtil$OverrideCompatibilityInfo$Result.INCOMPATIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[ExternalOverridabilityCondition$Result.values().length];
        f18671 = iArr3;
        try {
            iArr3[ExternalOverridabilityCondition$Result.OVERRIDABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f18671[ExternalOverridabilityCondition$Result.INCOMPATIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f18671[ExternalOverridabilityCondition$Result.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
