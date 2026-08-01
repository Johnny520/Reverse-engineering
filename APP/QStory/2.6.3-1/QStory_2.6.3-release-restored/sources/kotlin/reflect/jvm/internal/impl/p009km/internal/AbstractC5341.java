package kotlin.reflect.jvm.internal.impl.p009km.internal;

import kotlin.DeprecationLevel;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5341 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13497;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13498;

    static {
        int[] iArr = new int[ProtoBuf$TypeParameter.Variance.values().length];
        try {
            iArr[ProtoBuf$TypeParameter.Variance.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProtoBuf$TypeParameter.Variance.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProtoBuf$TypeParameter.Variance.INV.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f13497 = iArr;
        int[] iArr2 = new int[ProtoBuf$Type.Argument.Projection.values().length];
        try {
            iArr2[ProtoBuf$Type.Argument.Projection.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ProtoBuf$Type.Argument.Projection.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ProtoBuf$Type.Argument.Projection.INV.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ProtoBuf$Type.Argument.Projection.STAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f13496 = iArr2;
        int[] iArr3 = new int[ProtoBuf$VersionRequirement.VersionKind.values().length];
        try {
            iArr3[ProtoBuf$VersionRequirement.VersionKind.LANGUAGE_VERSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[ProtoBuf$VersionRequirement.VersionKind.COMPILER_VERSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[ProtoBuf$VersionRequirement.VersionKind.API_VERSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f13495 = iArr3;
        int[] iArr4 = new int[DeprecationLevel.values().length];
        try {
            iArr4[DeprecationLevel.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[DeprecationLevel.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[DeprecationLevel.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        f13494 = iArr4;
        int[] iArr5 = new int[ProtoBuf$Effect.EffectType.values().length];
        try {
            iArr5[ProtoBuf$Effect.EffectType.RETURNS_CONSTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[ProtoBuf$Effect.EffectType.CALLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[ProtoBuf$Effect.EffectType.RETURNS_NOT_NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        f13493 = iArr5;
        int[] iArr6 = new int[ProtoBuf$Effect.InvocationKind.values().length];
        try {
            iArr6[ProtoBuf$Effect.InvocationKind.AT_MOST_ONCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr6[ProtoBuf$Effect.InvocationKind.EXACTLY_ONCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr6[ProtoBuf$Effect.InvocationKind.AT_LEAST_ONCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        f13492 = iArr6;
        int[] iArr7 = new int[ProtoBuf$Expression.ConstantValue.values().length];
        try {
            iArr7[ProtoBuf$Expression.ConstantValue.TRUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr7[ProtoBuf$Expression.ConstantValue.FALSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr7[ProtoBuf$Expression.ConstantValue.NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        f13498 = iArr7;
    }
}
