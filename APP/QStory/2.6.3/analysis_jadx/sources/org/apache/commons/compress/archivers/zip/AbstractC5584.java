package org.apache.commons.compress.archivers.zip;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5584 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f15360;

    static {
        int[] iArr = new int[ZipMethod.values().length];
        f15360 = iArr;
        try {
            iArr[ZipMethod.UNSHRINKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f15360[ZipMethod.IMPLODING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f15360[ZipMethod.BZIP2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f15360[ZipMethod.ENHANCED_DEFLATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f15360[ZipMethod.ZSTD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f15360[ZipMethod.ZSTD_DEPRECATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
