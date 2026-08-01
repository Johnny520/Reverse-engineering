package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5043 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14533;

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
        try {
            iArr[KotlinClassHeader$Kind.SYNTHETIC_CLASS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[KotlinClassHeader$Kind.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[KotlinClassHeader$Kind.CLASS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f14533 = iArr;
    }
}
