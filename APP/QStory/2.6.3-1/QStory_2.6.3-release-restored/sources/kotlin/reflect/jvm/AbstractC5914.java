package kotlin.reflect.jvm;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;

/* JADX INFO: renamed from: kotlin.reflect.jvm.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5914 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14976;

    static {
        int[] iArr = new int[KotlinClassHeader$Kind.values().length];
        try {
            iArr[KotlinClassHeader$Kind.FILE_FACADE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KotlinClassHeader$Kind.MULTIFILE_CLASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KotlinClassHeader$Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f14976 = iArr;
    }
}
