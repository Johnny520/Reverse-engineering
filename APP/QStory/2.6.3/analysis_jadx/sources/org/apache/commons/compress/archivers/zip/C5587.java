package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;
import p379.AbstractC8996;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5587 implements InterfaceC5589 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final ZipShort f15372 = new ZipShort(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ZipLong f15373;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ZipEightByteInteger f15374;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ZipEightByteInteger f15375;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ZipEightByteInteger f15376;

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getCentralDirectoryData() {
        int i;
        byte[] bArr = new byte[getCentralDirectoryLength().getValue()];
        ZipEightByteInteger zipEightByteInteger = this.f15376;
        if (zipEightByteInteger != null) {
            System.arraycopy(zipEightByteInteger.getBytes(), 0, bArr, 0, 8);
            i = 8;
        } else {
            i = 0;
        }
        ZipEightByteInteger zipEightByteInteger2 = this.f15374;
        if (zipEightByteInteger2 != null) {
            System.arraycopy(zipEightByteInteger2.getBytes(), 0, bArr, i, 8);
            i += 8;
        }
        ZipEightByteInteger zipEightByteInteger3 = this.f15375;
        if (zipEightByteInteger3 != null) {
            System.arraycopy(zipEightByteInteger3.getBytes(), 0, bArr, i, 8);
            i += 8;
        }
        ZipLong zipLong = this.f15373;
        if (zipLong != null) {
            System.arraycopy(zipLong.getBytes(), 0, bArr, i, 4);
        }
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getCentralDirectoryLength() {
        return new ZipShort((this.f15376 != null ? 8 : 0) + (this.f15374 != null ? 8 : 0) + (this.f15375 == null ? 0 : 8) + (this.f15373 != null ? 4 : 0));
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getHeaderId() {
        return f15372;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getLocalFileDataData() {
        int i;
        ZipEightByteInteger zipEightByteInteger = this.f15376;
        if (zipEightByteInteger == null && this.f15374 == null) {
            return AbstractC8996.f25259;
        }
        if (zipEightByteInteger == null || this.f15374 == null) {
            C5925.m11310("Zip64 extended information must contain both size values in the local file header.");
            return null;
        }
        byte[] bArr = new byte[16];
        if (zipEightByteInteger != null) {
            System.arraycopy(zipEightByteInteger.getBytes(), 0, bArr, 0, 8);
            i = 8;
        } else {
            i = 0;
        }
        ZipEightByteInteger zipEightByteInteger2 = this.f15374;
        if (zipEightByteInteger2 != null) {
            System.arraycopy(zipEightByteInteger2.getBytes(), 0, bArr, i, 8);
        }
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getLocalFileDataLength() {
        return new ZipShort(this.f15376 != null ? 16 : 0);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        System.arraycopy(bArr, i, new byte[i2], 0, i2);
        if (i2 >= 28) {
            parseFromLocalFileData(bArr, i, i2);
            return;
        }
        if (i2 == 24) {
            this.f15376 = new ZipEightByteInteger(bArr, i);
            this.f15374 = new ZipEightByteInteger(bArr, i + 8);
            this.f15375 = new ZipEightByteInteger(bArr, i + 16);
        } else if (i2 % 8 == 4) {
            this.f15373 = new ZipLong(bArr, (i + i2) - 4);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 == 0) {
            return;
        }
        if (i2 < 16) {
            throw new ZipException("Zip64 extended information must contain both size values in the local file header.");
        }
        this.f15376 = new ZipEightByteInteger(bArr, i);
        this.f15374 = new ZipEightByteInteger(bArr, i + 8);
        int i3 = i + 16;
        int i4 = i2 - 16;
        if (i4 >= 8) {
            this.f15375 = new ZipEightByteInteger(bArr, i3);
            i3 = i + 24;
            i4 = i2 - 24;
        }
        if (i4 >= 4) {
            this.f15373 = new ZipLong(bArr, i3);
        }
    }
}
