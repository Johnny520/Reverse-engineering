package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4807 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14013;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14014;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14015;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14016;

    static {
        int[] iArr = new int[ProtoBuf$Modality.values().length];
        try {
            iArr[ProtoBuf$Modality.FINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProtoBuf$Modality.OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProtoBuf$Modality.ABSTRACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProtoBuf$Modality.SEALED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f14016 = iArr;
        int[] iArr2 = new int[Modality.values().length];
        try {
            iArr2[Modality.FINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Modality.OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Modality.ABSTRACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[Modality.SEALED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr3 = new int[ProtoBuf$Visibility.values().length];
        try {
            iArr3[ProtoBuf$Visibility.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[ProtoBuf$Visibility.PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[ProtoBuf$Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[ProtoBuf$Visibility.PROTECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[ProtoBuf$Visibility.PUBLIC.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[ProtoBuf$Visibility.LOCAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        int[] iArr4 = new int[ReturnValueStatus.values().length];
        try {
            iArr4[ReturnValueStatus.MustUse.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[ReturnValueStatus.ExplicitlyIgnorable.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[ReturnValueStatus.Unspecified.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        int[] iArr5 = new int[ProtoBuf$ReturnValueStatus.values().length];
        try {
            iArr5[ProtoBuf$ReturnValueStatus.MUST_USE.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[ProtoBuf$ReturnValueStatus.EXPLICITLY_IGNORABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[ProtoBuf$ReturnValueStatus.UNSPECIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        int[] iArr6 = new int[ProtoBuf$Class.Kind.values().length];
        try {
            iArr6[ProtoBuf$Class.Kind.CLASS.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[ProtoBuf$Class.Kind.INTERFACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr6[ProtoBuf$Class.Kind.ENUM_CLASS.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr6[ProtoBuf$Class.Kind.ENUM_ENTRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr6[ProtoBuf$Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[ProtoBuf$Class.Kind.OBJECT.ordinal()] = 6;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[ProtoBuf$Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
        } catch (NoSuchFieldError unused27) {
        }
        f14015 = iArr6;
        int[] iArr7 = new int[ClassKind.values().length];
        try {
            iArr7[ClassKind.CLASS.ordinal()] = 1;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr7[ClassKind.INTERFACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr7[ClassKind.ENUM_CLASS.ordinal()] = 3;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr7[ClassKind.ENUM_ENTRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr7[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr7[ClassKind.OBJECT.ordinal()] = 6;
        } catch (NoSuchFieldError unused33) {
        }
        int[] iArr8 = new int[ProtoBuf$TypeParameter.Variance.values().length];
        try {
            iArr8[ProtoBuf$TypeParameter.Variance.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr8[ProtoBuf$TypeParameter.Variance.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr8[ProtoBuf$TypeParameter.Variance.INV.ordinal()] = 3;
        } catch (NoSuchFieldError unused36) {
        }
        f14014 = iArr8;
        int[] iArr9 = new int[ProtoBuf$Type.Argument.Projection.values().length];
        try {
            iArr9[ProtoBuf$Type.Argument.Projection.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr9[ProtoBuf$Type.Argument.Projection.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr9[ProtoBuf$Type.Argument.Projection.INV.ordinal()] = 3;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr9[ProtoBuf$Type.Argument.Projection.STAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused40) {
        }
        f14013 = iArr9;
        int[] iArr10 = new int[Variance.values().length];
        try {
            iArr10[Variance.IN_VARIANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr10[Variance.OUT_VARIANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr10[Variance.INVARIANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused43) {
        }
    }
}
