package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import java.io.Serializable;
import java.math.MathContext;
import java.nio.file.attribute.FileTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipException;
import p360.AbstractC8929;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class X5455_ExtendedTimestamp implements InterfaceC5588, Cloneable, Serializable {
    public static final byte ACCESS_TIME_BIT = 2;
    public static final byte CREATE_TIME_BIT = 4;
    public static final ZipShort HEADER_ID = new ZipShort(21589);
    public static final byte MODIFY_TIME_BIT = 1;
    private static final long serialVersionUID = 1;
    private ZipLong accessTime;
    private boolean bit0_modifyTimePresent;
    private boolean bit1_accessTimePresent;
    private boolean bit2_createTimePresent;
    private ZipLong createTime;
    private byte flags;
    private ZipLong modifyTime;

    private static ZipLong dateToZipLong(Date date) {
        if (date == null) {
            return null;
        }
        return unixTimeToZipLong(date.getTime() / 1000);
    }

    private static ZipLong fileTimeToZipLong(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        MathContext mathContext = AbstractC8929.f25128;
        return unixTimeToZipLong(fileTime.to(TimeUnit.SECONDS));
    }

    private void reset() {
        setFlags((byte) 0);
        this.modifyTime = null;
        this.accessTime = null;
        this.createTime = null;
    }

    private static FileTime unixTimeToFileTime(ZipLong zipLong) {
        if (zipLong == null) {
            return null;
        }
        long intValue = zipLong.getIntValue();
        MathContext mathContext = AbstractC8929.f25128;
        return FileTime.from(intValue, TimeUnit.SECONDS);
    }

    private static ZipLong unixTimeToZipLong(long j) {
        MathContext mathContext = AbstractC8929.f25128;
        if (-2147483648L <= j && j <= 2147483647L) {
            return new ZipLong(j);
        }
        C5919.m11249(AbstractC2442.m4572(j, "X5455 timestamps must fit in a signed 32 bit integer: "));
        return null;
    }

    private static Date zipLongToDate(ZipLong zipLong) {
        if (zipLong != null) {
            return new Date(((long) zipLong.getIntValue()) * 1000);
        }
        return null;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj instanceof X5455_ExtendedTimestamp) {
            X5455_ExtendedTimestamp x5455_ExtendedTimestamp = (X5455_ExtendedTimestamp) obj;
            if ((this.flags & 7) == (x5455_ExtendedTimestamp.flags & 7) && Objects.equals(this.modifyTime, x5455_ExtendedTimestamp.modifyTime) && Objects.equals(this.accessTime, x5455_ExtendedTimestamp.accessTime) && Objects.equals(this.createTime, x5455_ExtendedTimestamp.createTime)) {
                return true;
            }
        }
        return false;
    }

    public FileTime getAccessFileTime() {
        return unixTimeToFileTime(this.accessTime);
    }

    public Date getAccessJavaTime() {
        return zipLongToDate(this.accessTime);
    }

    public ZipLong getAccessTime() {
        return this.accessTime;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public byte[] getCentralDirectoryData() {
        return Arrays.copyOf(getLocalFileDataData(), getCentralDirectoryLength().getValue());
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public ZipShort getCentralDirectoryLength() {
        return new ZipShort((this.bit0_modifyTimePresent ? 4 : 0) + 1);
    }

    public FileTime getCreateFileTime() {
        return unixTimeToFileTime(this.createTime);
    }

    public Date getCreateJavaTime() {
        return zipLongToDate(this.createTime);
    }

    public ZipLong getCreateTime() {
        return this.createTime;
    }

    public byte getFlags() {
        return this.flags;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public byte[] getLocalFileDataData() {
        ZipLong zipLong;
        ZipLong zipLong2;
        byte[] bArr = new byte[getLocalFileDataLength().getValue()];
        bArr[0] = 0;
        int i = 1;
        if (this.bit0_modifyTimePresent) {
            bArr[0] = (byte) 1;
            System.arraycopy(this.modifyTime.getBytes(), 0, bArr, 1, 4);
            i = 5;
        }
        if (this.bit1_accessTimePresent && (zipLong2 = this.accessTime) != null) {
            bArr[0] = (byte) (bArr[0] | 2);
            System.arraycopy(zipLong2.getBytes(), 0, bArr, i, 4);
            i += 4;
        }
        if (this.bit2_createTimePresent && (zipLong = this.createTime) != null) {
            bArr[0] = (byte) (bArr[0] | 4);
            System.arraycopy(zipLong.getBytes(), 0, bArr, i, 4);
        }
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public ZipShort getLocalFileDataLength() {
        int i = 0;
        int i2 = (this.bit0_modifyTimePresent ? 4 : 0) + 1 + ((!this.bit1_accessTimePresent || this.accessTime == null) ? 0 : 4);
        if (this.bit2_createTimePresent && this.createTime != null) {
            i = 4;
        }
        return new ZipShort(i2 + i);
    }

    public FileTime getModifyFileTime() {
        return unixTimeToFileTime(this.modifyTime);
    }

    public Date getModifyJavaTime() {
        return zipLongToDate(this.modifyTime);
    }

    public ZipLong getModifyTime() {
        return this.modifyTime;
    }

    public int hashCode() {
        int iRotateLeft = (this.flags & 7) * (-123);
        ZipLong zipLong = this.modifyTime;
        if (zipLong != null) {
            iRotateLeft ^= zipLong.hashCode();
        }
        ZipLong zipLong2 = this.accessTime;
        if (zipLong2 != null) {
            iRotateLeft ^= Integer.rotateLeft(zipLong2.hashCode(), 11);
        }
        ZipLong zipLong3 = this.createTime;
        return zipLong3 != null ? Integer.rotateLeft(zipLong3.hashCode(), 22) ^ iRotateLeft : iRotateLeft;
    }

    public boolean isBit0_modifyTimePresent() {
        return this.bit0_modifyTimePresent;
    }

    public boolean isBit1_accessTimePresent() {
        return this.bit1_accessTimePresent;
    }

    public boolean isBit2_createTimePresent() {
        return this.bit2_createTimePresent;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        reset();
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        int i3;
        int i4;
        reset();
        if (i2 < 1) {
            throw new ZipException(AbstractC0053.m161(i2, "X5455_ExtendedTimestamp too short, only ", " bytes"));
        }
        int i5 = i2 + i;
        int i6 = i + 1;
        setFlags(bArr[i]);
        if (!this.bit0_modifyTimePresent || (i4 = i + 5) > i5) {
            this.bit0_modifyTimePresent = false;
        } else {
            this.modifyTime = new ZipLong(bArr, i6);
            i6 = i4;
        }
        if (!this.bit1_accessTimePresent || (i3 = i6 + 4) > i5) {
            this.bit1_accessTimePresent = false;
        } else {
            this.accessTime = new ZipLong(bArr, i6);
            i6 = i3;
        }
        if (!this.bit2_createTimePresent || i6 + 4 > i5) {
            this.bit2_createTimePresent = false;
        } else {
            this.createTime = new ZipLong(bArr, i6);
        }
    }

    public void setAccessFileTime(FileTime fileTime) {
        setAccessTime(fileTimeToZipLong(fileTime));
    }

    public void setAccessJavaTime(Date date) {
        setAccessTime(dateToZipLong(date));
    }

    public void setAccessTime(ZipLong zipLong) {
        this.bit1_accessTimePresent = zipLong != null;
        byte b = this.flags;
        this.flags = (byte) (zipLong != null ? b | 2 : b & (-3));
        this.accessTime = zipLong;
    }

    public void setCreateFileTime(FileTime fileTime) {
        setCreateTime(fileTimeToZipLong(fileTime));
    }

    public void setCreateJavaTime(Date date) {
        setCreateTime(dateToZipLong(date));
    }

    public void setCreateTime(ZipLong zipLong) {
        this.bit2_createTimePresent = zipLong != null;
        byte b = this.flags;
        this.flags = (byte) (zipLong != null ? b | 4 : b & (-5));
        this.createTime = zipLong;
    }

    public void setFlags(byte b) {
        this.flags = b;
        this.bit0_modifyTimePresent = (b & 1) == 1;
        this.bit1_accessTimePresent = (b & 2) == 2;
        this.bit2_createTimePresent = (b & 4) == 4;
    }

    public void setModifyFileTime(FileTime fileTime) {
        setModifyTime(fileTimeToZipLong(fileTime));
    }

    public void setModifyJavaTime(Date date) {
        setModifyTime(dateToZipLong(date));
    }

    public void setModifyTime(ZipLong zipLong) {
        this.bit0_modifyTimePresent = zipLong != null;
        byte b = this.flags;
        this.flags = (byte) (zipLong != null ? 1 | b : b & (-2));
        this.modifyTime = zipLong;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("0x5455 Zip Extra Field: Flags=");
        sb.append(Integer.toBinaryString(AbstractC5580.m10884(this.flags)));
        sb.append(" ");
        if (this.bit0_modifyTimePresent && this.modifyTime != null) {
            Date modifyJavaTime = getModifyJavaTime();
            sb.append(" Modify:[");
            sb.append(modifyJavaTime);
            sb.append("] ");
        }
        if (this.bit1_accessTimePresent && this.accessTime != null) {
            Date accessJavaTime = getAccessJavaTime();
            sb.append(" Access:[");
            sb.append(accessJavaTime);
            sb.append("] ");
        }
        if (this.bit2_createTimePresent && this.createTime != null) {
            Date createJavaTime = getCreateJavaTime();
            sb.append(" Create:[");
            sb.append(createJavaTime);
            sb.append("] ");
        }
        return sb.toString();
    }
}
