package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0053;
import java.util.Arrays;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5604 extends AbstractC5616 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final ZipShort f15448 = new ZipShort(23);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f15449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m10973(int i, int i2, String str, int i3) throws ZipException {
        if (i2 + i <= i3) {
            return;
        }
        throw new ZipException("Invalid X0017_StrongEncryptionHeader: " + str + " " + i + " doesn't fit into " + i3 + " bytes of data at position " + i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC5616, org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        super.parseFromCentralDirectoryData(bArr, i, i2);
        m10977(12, i2);
        ZipShort.getValue(bArr, i);
        PKWareExtraHeader$EncryptionAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 2));
        ZipShort.getValue(bArr, i + 4);
        ZipShort.getValue(bArr, i + 6);
        if (ZipLong.getValue(bArr, i + 8) > 0) {
            m10977(16, i2);
            PKWareExtraHeader$HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 12));
            this.f15449 = ZipShort.getValue(bArr, i + 14);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC5616, org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        super.parseFromLocalFileData(bArr, i, i2);
        m10977(4, i2);
        int value = ZipShort.getValue(bArr, i);
        m10973(value, 4, "ivSize", i2);
        int i3 = i + 4;
        m10977(i3, value);
        Arrays.copyOfRange(bArr, i3, value);
        int i4 = value + 16;
        m10977(i4, i2);
        int i5 = i + value;
        ZipShort.getValue(bArr, i5 + 6);
        PKWareExtraHeader$EncryptionAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i5 + 8));
        ZipShort.getValue(bArr, i5 + 10);
        ZipShort.getValue(bArr, i5 + 12);
        int value2 = ZipShort.getValue(bArr, i5 + 14);
        m10973(value2, i4, "erdSize", i2);
        int i6 = i5 + 16;
        m10977(i6, value2);
        Arrays.copyOfRange(bArr, i6, value2);
        int i7 = value + 20 + value2;
        m10977(i7, i2);
        if (ZipLong.getValue(bArr, i6 + value2) == 0) {
            m10977(i7 + 2, i2);
            int value3 = ZipShort.getValue(bArr, i5 + 20 + value2);
            m10973(value3, value + 22 + value2, "vSize", i2);
            if (value3 < 4) {
                throw new ZipException(AbstractC0053.m162(value3, "Invalid X0017_StrongEncryptionHeader: vSize ", " is too small to hold CRC"));
            }
            int i8 = i5 + 22 + value2;
            int i9 = value3 - 4;
            m10977(i8, i9);
            Arrays.copyOfRange(bArr, i8, i9);
            int i10 = (i8 + value3) - 4;
            m10977(i10, 4);
            Arrays.copyOfRange(bArr, i10, 4);
            return;
        }
        m10977(i7 + 6, i2);
        PKWareExtraHeader$HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i5 + 20 + value2));
        int i11 = i5 + 22 + value2;
        this.f15449 = ZipShort.getValue(bArr, i11);
        int i12 = i5 + 24 + value2;
        int value4 = ZipShort.getValue(bArr, i12);
        if (value4 < this.f15449) {
            StringBuilder sbM150 = AbstractC0053.m150(value4, "Invalid X0017_StrongEncryptionHeader: resize ", " is too small to hold hashSize");
            sbM150.append(this.f15449);
            throw new ZipException(sbM150.toString());
        }
        m10973(value4, value + 24 + value2, "resize", i2);
        Arrays.copyOfRange(bArr, i12, this.f15449);
        int i13 = this.f15449;
        Arrays.copyOfRange(bArr, i12 + i13, value4 - i13);
        m10977(value + 26 + value2 + value4 + 2, i2);
        int value5 = ZipShort.getValue(bArr, i5 + 26 + value2 + value4);
        if (value5 < 4) {
            throw new ZipException(AbstractC0053.m162(value5, "Invalid X0017_StrongEncryptionHeader: vSize ", " is too small to hold CRC"));
        }
        m10973(value5, value + 22 + value2 + value4, "vSize", i2);
        int i14 = i11 + value4;
        Arrays.copyOfRange(bArr, i14, value5 - 4);
        Arrays.copyOfRange(bArr, (i14 + value5) - 4, 4);
    }
}
