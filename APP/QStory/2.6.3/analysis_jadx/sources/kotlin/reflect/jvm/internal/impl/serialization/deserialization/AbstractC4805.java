package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14011;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14012;

    static {
        int[] iArr = new int[ProtoBuf$MemberKind.values().length];
        try {
            iArr[ProtoBuf$MemberKind.DECLARATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProtoBuf$MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProtoBuf$MemberKind.DELEGATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProtoBuf$MemberKind.SYNTHESIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f14012 = iArr;
        int[] iArr2 = new int[CallableMemberDescriptor$Kind.values().length];
        try {
            iArr2[CallableMemberDescriptor$Kind.DECLARATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CallableMemberDescriptor$Kind.FAKE_OVERRIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CallableMemberDescriptor$Kind.DELEGATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[CallableMemberDescriptor$Kind.SYNTHESIZED.ordinal()] = 4;
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
        f14011 = iArr3;
    }
}
