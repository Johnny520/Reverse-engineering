package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5071 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14614;

    static {
        int[] iArr = new int[PrimitiveType.values().length];
        try {
            iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PrimitiveType.CHAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PrimitiveType.BYTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PrimitiveType.SHORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PrimitiveType.INT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PrimitiveType.FLOAT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PrimitiveType.LONG.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f14614 = iArr;
    }
}
