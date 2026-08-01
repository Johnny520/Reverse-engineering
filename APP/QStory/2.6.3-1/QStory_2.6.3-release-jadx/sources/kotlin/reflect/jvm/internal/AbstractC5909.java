package kotlin.reflect.jvm.internal;

import kotlin.reflect.KParameter$Kind;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5909 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14973;

    static {
        int[] iArr = new int[KParameter$Kind.values().length];
        try {
            iArr[KParameter$Kind.INSTANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KParameter$Kind.CONTEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KParameter$Kind.EXTENSION_RECEIVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[KParameter$Kind.VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f14973 = iArr;
    }
}
