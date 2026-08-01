package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4645 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13573;

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
        f13573 = iArr;
    }
}
