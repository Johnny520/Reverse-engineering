package org.apache.commons.compress.archivers.zip;

import java.math.BigDecimal;
import java.math.MathContext;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Objects;
import p360.AbstractC8919;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5601 implements InterfaceC5589 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ZipEightByteInteger f15432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ZipEightByteInteger f15433;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ZipEightByteInteger f15434;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ZipShort f15430 = new ZipShort(10);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final ZipShort f15429 = new ZipShort(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final ZipShort f15431 = new ZipShort(24);

    public C5601() {
        ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
        this.f15434 = zipEightByteInteger;
        this.f15432 = zipEightByteInteger;
        this.f15433 = zipEightByteInteger;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static FileTime m10970(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null || ZipEightByteInteger.ZERO.equals(zipEightByteInteger)) {
            return null;
        }
        long longValue = zipEightByteInteger.getLongValue();
        MathContext mathContext = AbstractC8919.f25117;
        BigDecimal[] bigDecimalArrDivideAndRemainder = BigDecimal.valueOf(longValue).add(AbstractC8919.f25115).divideAndRemainder(AbstractC8919.f25114, AbstractC8919.f25117);
        return FileTime.from(Instant.ofEpochSecond(bigDecimalArrDivideAndRemainder[0].longValueExact(), bigDecimalArrDivideAndRemainder[1].multiply(AbstractC8919.f25113).longValueExact()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ZipEightByteInteger m10971(FileTime fileTime) {
        MathContext mathContext = AbstractC8919.f25117;
        return new ZipEightByteInteger(BigDecimal.valueOf(fileTime.toInstant().getEpochSecond()).multiply(AbstractC8919.f25114).add(BigDecimal.valueOf(r4.getNano() / 100)).subtract(AbstractC8919.f25115).longValueExact());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5601) {
            C5601 c5601 = (C5601) obj;
            if (Objects.equals(this.f15434, c5601.f15434) && Objects.equals(this.f15432, c5601.f15432) && Objects.equals(this.f15433, c5601.f15433)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getCentralDirectoryData() {
        return getLocalFileDataData();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getCentralDirectoryLength() {
        return getLocalFileDataLength();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getHeaderId() {
        return f15430;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getLocalFileDataData() {
        byte[] bArr = new byte[getLocalFileDataLength().getValue()];
        System.arraycopy(f15429.getBytes(), 0, bArr, 4, 2);
        System.arraycopy(f15431.getBytes(), 0, bArr, 6, 2);
        System.arraycopy(this.f15434.getBytes(), 0, bArr, 8, 8);
        System.arraycopy(this.f15432.getBytes(), 0, bArr, 16, 8);
        System.arraycopy(this.f15433.getBytes(), 0, bArr, 24, 8);
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getLocalFileDataLength() {
        return new ZipShort(32);
    }

    public final int hashCode() {
        ZipEightByteInteger zipEightByteInteger = this.f15434;
        int iHashCode = zipEightByteInteger != null ? (-123) ^ zipEightByteInteger.hashCode() : -123;
        ZipEightByteInteger zipEightByteInteger2 = this.f15432;
        if (zipEightByteInteger2 != null) {
            iHashCode ^= Integer.rotateLeft(zipEightByteInteger2.hashCode(), 11);
        }
        ZipEightByteInteger zipEightByteInteger3 = this.f15433;
        return zipEightByteInteger3 != null ? Integer.rotateLeft(zipEightByteInteger3.hashCode(), 22) ^ iHashCode : iHashCode;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
        this.f15434 = zipEightByteInteger;
        this.f15432 = zipEightByteInteger;
        this.f15433 = zipEightByteInteger;
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        int value = i + 4;
        while (value + 4 <= i3) {
            int i4 = value + 2;
            if (new ZipShort(bArr, value).equals(f15429)) {
                if (i3 - i4 >= 26) {
                    if (f15431.equals(new ZipShort(bArr, i4))) {
                        this.f15434 = new ZipEightByteInteger(bArr, value + 4);
                        this.f15432 = new ZipEightByteInteger(bArr, value + 12);
                        this.f15433 = new ZipEightByteInteger(bArr, value + 20);
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
        return "0x000A Zip Extra Field: Modify:[" + m10970(this.f15434) + "]  Access:[" + m10970(this.f15432) + "]  Create:[" + m10970(this.f15433) + "] ";
    }
}
