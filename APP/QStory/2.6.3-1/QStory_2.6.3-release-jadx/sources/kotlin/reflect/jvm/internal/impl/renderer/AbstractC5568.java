package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5568 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14171;

    static {
        int[] iArr = new int[ClassKind.values().length];
        try {
            iArr[ClassKind.CLASS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClassKind.INTERFACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ClassKind.OBJECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f14171 = iArr;
    }
}
