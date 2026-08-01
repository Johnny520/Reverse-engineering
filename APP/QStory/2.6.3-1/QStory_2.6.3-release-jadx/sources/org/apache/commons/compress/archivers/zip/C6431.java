package org.apache.commons.compress.archivers.zip;

import java.math.BigDecimal;
import java.math.MathContext;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Objects;
import p376.AbstractC9748;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6431 implements InterfaceC6419 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ZipEightByteInteger f15777;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ZipEightByteInteger f15778;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ZipEightByteInteger f15779;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ZipShort f15775 = new ZipShort(10);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final ZipShort f15774 = new ZipShort(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final ZipShort f15776 = new ZipShort(24);

    public C6431() {
        ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
        this.f15779 = zipEightByteInteger;
        this.f15777 = zipEightByteInteger;
        this.f15778 = zipEightByteInteger;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static FileTime m11529(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null || ZipEightByteInteger.ZERO.equals(zipEightByteInteger)) {
            return null;
        }
        long longValue = zipEightByteInteger.getLongValue();
        MathContext mathContext = AbstractC9748.f25462;
        BigDecimal[] bigDecimalArrDivideAndRemainder = BigDecimal.valueOf(longValue).add(AbstractC9748.f25460).divideAndRemainder(AbstractC9748.f25459, AbstractC9748.f25462);
        return FileTime.from(Instant.ofEpochSecond(bigDecimalArrDivideAndRemainder[0].longValueExact(), bigDecimalArrDivideAndRemainder[1].multiply(AbstractC9748.f25458).longValueExact()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ZipEightByteInteger m11530(FileTime fileTime) {
        MathContext mathContext = AbstractC9748.f25462;
        return new ZipEightByteInteger(BigDecimal.valueOf(fileTime.toInstant().getEpochSecond()).multiply(AbstractC9748.f25459).add(BigDecimal.valueOf(r4.getNano() / 100)).subtract(AbstractC9748.f25460).longValueExact());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6431) {
            C6431 c6431 = (C6431) obj;
            if (Objects.equals(this.f15779, c6431.f15779) && Objects.equals(this.f15777, c6431.f15777) && Objects.equals(this.f15778, c6431.f15778)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final byte[] getCentralDirectoryData() {
        return getLocalFileDataData();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getCentralDirectoryLength() {
        return getLocalFileDataLength();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getHeaderId() {
        return f15775;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final byte[] getLocalFileDataData() {
        byte[] bArr = new byte[getLocalFileDataLength().getValue()];
        System.arraycopy(f15774.getBytes(), 0, bArr, 4, 2);
        System.arraycopy(f15776.getBytes(), 0, bArr, 6, 2);
        System.arraycopy(this.f15779.getBytes(), 0, bArr, 8, 8);
        System.arraycopy(this.f15777.getBytes(), 0, bArr, 16, 8);
        System.arraycopy(this.f15778.getBytes(), 0, bArr, 24, 8);
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getLocalFileDataLength() {
        return new ZipShort(32);
    }

    public final int hashCode() {
        ZipEightByteInteger zipEightByteInteger = this.f15779;
        int iHashCode = zipEightByteInteger != null ? (-123) ^ zipEightByteInteger.hashCode() : -123;
        ZipEightByteInteger zipEightByteInteger2 = this.f15777;
        if (zipEightByteInteger2 != null) {
            iHashCode ^= Integer.rotateLeft(zipEightByteInteger2.hashCode(), 11);
        }
        ZipEightByteInteger zipEightByteInteger3 = this.f15778;
        return zipEightByteInteger3 != null ? Integer.rotateLeft(zipEightByteInteger3.hashCode(), 22) ^ iHashCode : iHashCode;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
        this.f15779 = zipEightByteInteger;
        this.f15777 = zipEightByteInteger;
        this.f15778 = zipEightByteInteger;
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        int value = i + 4;
        while (value + 4 <= i3) {
            int i4 = value + 2;
            if (new ZipShort(bArr, value).equals(f15774)) {
                if (i3 - i4 >= 26) {
                    if (f15776.equals(new ZipShort(bArr, i4))) {
                        this.f15779 = new ZipEightByteInteger(bArr, value + 4);
                        this.f15777 = new ZipEightByteInteger(bArr, value + 12);
                        this.f15778 = new ZipEightByteInteger(bArr, value + 20);
                        return;
                    }
                    return;
                }
                return;
            }
            value = new ZipShort(bArr, i4).getValue() + 2 + i4;
        }
    }

    public final String toString() {
        return "0x000A Zip Extra Field: Modify:[" + m11529(this.f15779) + "]  Access:[" + m11529(this.f15777) + "]  Create:[" + m11529(this.f15778) + "] ";
    }
}
