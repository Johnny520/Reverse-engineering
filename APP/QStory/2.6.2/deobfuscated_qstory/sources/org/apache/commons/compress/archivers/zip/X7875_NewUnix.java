package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2941;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.zip.ZipException;
import org.apache.commons.lang3.AbstractC5685;
import p376.AbstractC8977;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class X7875_NewUnix implements InterfaceC5588, Cloneable, Serializable {
    private static final long serialVersionUID = 1;
    private BigInteger gid;
    private BigInteger uid;
    private int version = 1;
    static final ZipShort HEADER_ID = new ZipShort(30837);
    private static final ZipShort ZERO = new ZipShort(0);
    private static final BigInteger ONE_THOUSAND = BigInteger.valueOf(1000);

    public X7875_NewUnix() {
        reset();
    }

    private void reset() {
        BigInteger bigInteger = ONE_THOUSAND;
        this.uid = bigInteger;
        this.gid = bigInteger;
    }

    public static byte[] trimLeadingZeroesForceMinLength(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length && bArr[i2] == 0; i2++) {
            i++;
        }
        int iMax = Math.max(1, bArr.length - i);
        byte[] bArr2 = new byte[iMax];
        int length2 = iMax - (bArr.length - i);
        System.arraycopy(bArr, i, bArr2, length2, iMax - length2);
        return bArr2;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj instanceof X7875_NewUnix) {
            X7875_NewUnix x7875_NewUnix = (X7875_NewUnix) obj;
            if (this.version == x7875_NewUnix.version && this.uid.equals(x7875_NewUnix.uid) && this.gid.equals(x7875_NewUnix.gid)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public byte[] getCentralDirectoryData() {
        return AbstractC8977.f25219;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public ZipShort getCentralDirectoryLength() {
        return ZERO;
    }

    public long getGID() {
        BigInteger bigInteger = this.gid;
        int i = AbstractC5580.f15357;
        try {
            return bigInteger.longValueExact();
        } catch (ArithmeticException unused) {
            C2941.m6345(bigInteger, "The BigInteger cannot fit inside a 64 bit java long: [", "]");
            return 0L;
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public byte[] getLocalFileDataData() {
        byte[] byteArray = this.uid.toByteArray();
        byte[] byteArray2 = this.gid.toByteArray();
        byte[] bArrTrimLeadingZeroesForceMinLength = trimLeadingZeroesForceMinLength(byteArray);
        int iM10996 = AbstractC5685.m10996(bArrTrimLeadingZeroesForceMinLength);
        byte[] bArrTrimLeadingZeroesForceMinLength2 = trimLeadingZeroesForceMinLength(byteArray2);
        int iM109962 = AbstractC5685.m10996(bArrTrimLeadingZeroesForceMinLength2);
        int i = iM10996 + 3;
        byte[] bArr = new byte[i + iM109962];
        if (bArrTrimLeadingZeroesForceMinLength != null) {
            AbstractC5580.m10886(bArrTrimLeadingZeroesForceMinLength);
        }
        if (bArrTrimLeadingZeroesForceMinLength2 != null) {
            AbstractC5580.m10886(bArrTrimLeadingZeroesForceMinLength2);
        }
        bArr[0] = AbstractC5580.m10884(this.version);
        bArr[1] = AbstractC5580.m10884(iM10996);
        if (bArrTrimLeadingZeroesForceMinLength != null) {
            System.arraycopy(bArrTrimLeadingZeroesForceMinLength, 0, bArr, 2, iM10996);
        }
        bArr[2 + iM10996] = AbstractC5580.m10884(iM109962);
        if (bArrTrimLeadingZeroesForceMinLength2 != null) {
            System.arraycopy(bArrTrimLeadingZeroesForceMinLength2, 0, bArr, i, iM109962);
        }
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public ZipShort getLocalFileDataLength() {
        return new ZipShort(AbstractC5685.m10996(trimLeadingZeroesForceMinLength(this.uid.toByteArray())) + 3 + AbstractC5685.m10996(trimLeadingZeroesForceMinLength(this.gid.toByteArray())));
    }

    public long getUID() {
        BigInteger bigInteger = this.uid;
        int i = AbstractC5580.f15357;
        try {
            return bigInteger.longValueExact();
        } catch (ArithmeticException unused) {
            C2941.m6345(bigInteger, "The BigInteger cannot fit inside a 64 bit java long: [", "]");
            return 0L;
        }
    }

    public int hashCode() {
        return this.gid.hashCode() ^ (Integer.rotateLeft(this.uid.hashCode(), 16) ^ (this.version * (-1234567)));
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        reset();
        if (i2 < 3) {
            throw new ZipException(AbstractC0053.m161(i2, "X7875_NewUnix length is too short, only ", " bytes"));
        }
        int i3 = i + 1;
        this.version = Byte.toUnsignedInt(bArr[i]);
        int i4 = i + 2;
        int unsignedInt = Byte.toUnsignedInt(bArr[i3]);
        int i5 = unsignedInt + 3;
        if (i5 > i2) {
            throw new ZipException("X7875_NewUnix invalid: uidSize " + unsignedInt + " doesn't fit into " + i2 + " bytes");
        }
        int i6 = unsignedInt + i4;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i6);
        AbstractC5580.m10886(bArrCopyOfRange);
        this.uid = new BigInteger(1, bArrCopyOfRange);
        int i7 = i6 + 1;
        int unsignedInt2 = Byte.toUnsignedInt(bArr[i6]);
        if (i5 + unsignedInt2 <= i2) {
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i7, unsignedInt2 + i7);
            AbstractC5580.m10886(bArrCopyOfRange2);
            this.gid = new BigInteger(1, bArrCopyOfRange2);
        } else {
            throw new ZipException("X7875_NewUnix invalid: gidSize " + unsignedInt2 + " doesn't fit into " + i2 + " bytes");
        }
    }

    public void setGID(long j) {
        this.gid = AbstractC5580.m10887(j);
    }

    public void setUID(long j) {
        this.uid = AbstractC5580.m10887(j);
    }

    public String toString() {
        return "0x7875 Zip Extra Field: UID=" + this.uid + " GID=" + this.gid;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
    }
}
