package org.apache.commons.compress.archivers.zip;

import com.esotericsoftware.kryo.util.C3908;
import java.math.MathContext;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import p025.AbstractC7012;
import p376.AbstractC9748;
import p395.AbstractC9825;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6415 extends ZipEntry {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public long f15706;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f15707;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C6439 f15708;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC6419[] f15709;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f15710;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f15711;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f15712;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C6447 f15713;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f15714;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15715;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f15716;

    static {
        new LinkedList();
    }

    @Override // java.util.zip.ZipEntry
    public final Object clone() {
        C6415 c6415 = (C6415) super.clone();
        c6415.getClass();
        c6415.m11515(m11511());
        return c6415;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6415.class != obj.getClass()) {
            return false;
        }
        C6415 c6415 = (C6415) obj;
        if (!Objects.equals(getName(), c6415.getName())) {
            return false;
        }
        String comment = getComment();
        String comment2 = c6415.getComment();
        if (comment == null) {
            comment = "";
        }
        if (comment2 == null) {
            comment2 = "";
        }
        if (!Objects.equals(getLastModifiedTime(), c6415.getLastModifiedTime()) || !Objects.equals(getLastAccessTime(), c6415.getLastAccessTime()) || !Objects.equals(getCreationTime(), c6415.getCreationTime()) || !comment.equals(comment2) || this.f15715 != c6415.f15715 || this.f15716 != c6415.f15716 || this.f15714 != c6415.f15714 || getCrc() != c6415.getCrc() || getCompressedSize() != c6415.getCompressedSize() || !Arrays.equals(m11510(), c6415.m11510())) {
            return false;
        }
        byte[] extra = getExtra();
        byte[] bArr = AbstractC9825.f25604;
        if (extra == null) {
            extra = bArr;
        }
        byte[] extra2 = c6415.getExtra();
        if (extra2 != null) {
            bArr = extra2;
        }
        return Arrays.equals(extra, bArr) && this.f15710 == c6415.f15710 && this.f15711 == c6415.f15711 && this.f15713.equals(c6415.f15713);
    }

    @Override // java.util.zip.ZipEntry
    public final int getMethod() {
        return this.f15716;
    }

    @Override // java.util.zip.ZipEntry
    public final String getName() {
        String str = this.f15712;
        return str == null ? super.getName() : str;
    }

    @Override // java.util.zip.ZipEntry
    public final long getSize() {
        return this.f15714;
    }

    @Override // java.util.zip.ZipEntry
    public final long getTime() {
        if (this.f15707) {
            return getLastModifiedTime().toMillis();
        }
        long j = this.f15706;
        return j != -1 ? j : super.getTime();
    }

    @Override // java.util.zip.ZipEntry
    public final int hashCode() {
        return getName().hashCode();
    }

    @Override // java.util.zip.ZipEntry
    public final boolean isDirectory() {
        return getName().endsWith("/");
    }

    @Override // java.util.zip.ZipEntry
    public final ZipEntry setCreationTime(FileTime fileTime) {
        super.setCreationTime(fileTime);
        m11514();
        return this;
    }

    @Override // java.util.zip.ZipEntry
    public final void setExtra(byte[] bArr) {
        try {
            m11506(AbstractC6443.m11533(bArr, ZipArchiveEntry$ExtraFieldParsingMode.BEST_EFFORT));
        } catch (ZipException e) {
            C3908.m7459("Error parsing extra fields for entry: ", getName(), " - ", e.getMessage(), e);
        }
    }

    @Override // java.util.zip.ZipEntry
    public final ZipEntry setLastAccessTime(FileTime fileTime) {
        super.setLastAccessTime(fileTime);
        m11514();
        return this;
    }

    @Override // java.util.zip.ZipEntry
    public final ZipEntry setLastModifiedTime(FileTime fileTime) {
        super.setLastModifiedTime(fileTime);
        this.f15706 = fileTime.toMillis();
        this.f15707 = true;
        m11514();
        return this;
    }

    @Override // java.util.zip.ZipEntry
    public final void setMethod(int i) {
        if (i >= 0) {
            this.f15716 = i;
        } else {
            C6755.m11869(AbstractC7012.m12147(i, "ZIP compression method cannot be negative: "));
        }
    }

    @Override // java.util.zip.ZipEntry
    public final void setSize(long j) {
        if (j >= 0) {
            this.f15714 = j;
        } else {
            C6755.m11869("Invalid entry size");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r0 != 2162688) goto L12;
     */
    @Override // java.util.zip.ZipEntry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTime(long j) {
        long second;
        if (j <= 4036608000000L) {
            if (j != AbstractC6411.f15703) {
                LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault());
                if (localDateTimeOfInstant.getYear() < 1980) {
                    second = 2162688;
                } else {
                    second = ((long) ((localDateTimeOfInstant.getSecond() >> 1) | ((localDateTimeOfInstant.getYear() - 1980) << 25) | (localDateTimeOfInstant.getMonthValue() << 21) | (localDateTimeOfInstant.getDayOfMonth() << 16) | (localDateTimeOfInstant.getHour() << 11) | (localDateTimeOfInstant.getMinute() << 5))) & 4294967295L;
                }
            }
            super.setTime(j);
            this.f15706 = j;
            this.f15707 = false;
            m11514();
            return;
        }
        int i = AbstractC6411.f15702;
        setLastModifiedTime(FileTime.fromMillis(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11506(InterfaceC6419[] interfaceC6419Arr) {
        if (this.f15709 == null) {
            m11515(interfaceC6419Arr);
            return;
        }
        for (InterfaceC6419 interfaceC6419 : interfaceC6419Arr) {
            InterfaceC6419 interfaceC6419M11509 = interfaceC6419 instanceof C6439 ? this.f15708 : m11509(interfaceC6419.getHeaderId());
            if (interfaceC6419M11509 == null) {
                m11508(interfaceC6419);
            } else {
                byte[] localFileDataData = interfaceC6419.getLocalFileDataData();
                try {
                    interfaceC6419M11509.parseFromLocalFileData(localFileDataData, 0, localFileDataData.length);
                } catch (ZipException unused) {
                    C6440 c6440 = new C6440();
                    c6440.f15807 = interfaceC6419M11509.getHeaderId();
                    c6440.f15805 = AbstractC6411.m11505(localFileDataData);
                    c6440.f15806 = AbstractC6411.m11505(interfaceC6419M11509.getCentralDirectoryData());
                    m11507(interfaceC6419M11509.getHeaderId());
                    m11508(c6440);
                }
            }
        }
        m11513();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11507(ZipShort zipShort) {
        if (this.f15709 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC6419 interfaceC6419 : this.f15709) {
            if (!zipShort.equals(interfaceC6419.getHeaderId())) {
                arrayList.add(interfaceC6419);
            }
        }
        if (this.f15709.length == arrayList.size()) {
            return;
        }
        this.f15709 = (InterfaceC6419[]) arrayList.toArray(AbstractC6443.f15809);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11508(InterfaceC6419 interfaceC6419) {
        if (interfaceC6419 instanceof C6439) {
            this.f15708 = (C6439) interfaceC6419;
            return;
        }
        if (this.f15709 == null) {
            this.f15709 = new InterfaceC6419[]{interfaceC6419};
            return;
        }
        if (m11509(interfaceC6419.getHeaderId()) != null) {
            m11507(interfaceC6419.getHeaderId());
        }
        InterfaceC6419[] interfaceC6419Arr = this.f15709;
        InterfaceC6419[] interfaceC6419Arr2 = (InterfaceC6419[]) Arrays.copyOf(interfaceC6419Arr, interfaceC6419Arr.length + 1);
        interfaceC6419Arr2[interfaceC6419Arr2.length - 1] = interfaceC6419;
        this.f15709 = interfaceC6419Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6419 m11509(ZipShort zipShort) {
        InterfaceC6419[] interfaceC6419Arr = this.f15709;
        if (interfaceC6419Arr == null) {
            return null;
        }
        for (InterfaceC6419 interfaceC6419 : interfaceC6419Arr) {
            if (zipShort.equals(interfaceC6419.getHeaderId())) {
                return interfaceC6419;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] m11510() {
        byte[] centralDirectoryData;
        InterfaceC6419[] interfaceC6419ArrM11511 = m11511();
        ConcurrentHashMap concurrentHashMap = AbstractC6443.f15810;
        int length = interfaceC6419ArrM11511.length;
        boolean z = length > 0 && (interfaceC6419ArrM11511[length + (-1)] instanceof C6439);
        int i = z ? length - 1 : length;
        int value = i * 4;
        for (InterfaceC6419 interfaceC6419 : interfaceC6419ArrM11511) {
            value += interfaceC6419.getCentralDirectoryLength().getValue();
        }
        byte[] bArr = new byte[value];
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            System.arraycopy(interfaceC6419ArrM11511[i2].getHeaderId().getBytes(), 0, bArr, length2, 2);
            System.arraycopy(interfaceC6419ArrM11511[i2].getCentralDirectoryLength().getBytes(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] centralDirectoryData2 = interfaceC6419ArrM11511[i2].getCentralDirectoryData();
            if (centralDirectoryData2 != null) {
                System.arraycopy(centralDirectoryData2, 0, bArr, length2, centralDirectoryData2.length);
                length2 += centralDirectoryData2.length;
            }
        }
        if (z && (centralDirectoryData = interfaceC6419ArrM11511[length - 1].getCentralDirectoryData()) != null) {
            System.arraycopy(centralDirectoryData, 0, bArr, length2, centralDirectoryData.length);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6419[] m11511() {
        InterfaceC6419[] interfaceC6419Arr = this.f15709;
        C6439 c6439 = this.f15708;
        if (interfaceC6419Arr == null) {
            return c6439 == null ? AbstractC6443.f15809 : new InterfaceC6419[]{c6439};
        }
        if (c6439 == null) {
            return interfaceC6419Arr;
        }
        InterfaceC6419[] interfaceC6419Arr2 = (InterfaceC6419[]) Arrays.copyOf(interfaceC6419Arr, interfaceC6419Arr.length + 1);
        interfaceC6419Arr2[this.f15709.length] = this.f15708;
        return interfaceC6419Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m11512(String str) {
        if (str != null && this.f15715 == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.f15712 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11513() {
        FileTime createFileTime;
        FileTime accessFileTime;
        FileTime modifyFileTime;
        byte[] localFileDataData;
        InterfaceC6419[] interfaceC6419ArrM11511 = m11511();
        ConcurrentHashMap concurrentHashMap = AbstractC6443.f15810;
        int length = interfaceC6419ArrM11511.length;
        boolean z = length > 0 && (interfaceC6419ArrM11511[length + (-1)] instanceof C6439);
        int i = z ? length - 1 : length;
        int value = i * 4;
        for (InterfaceC6419 interfaceC6419 : interfaceC6419ArrM11511) {
            value += interfaceC6419.getLocalFileDataLength().getValue();
        }
        byte[] bArr = new byte[value];
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            System.arraycopy(interfaceC6419ArrM11511[i2].getHeaderId().getBytes(), 0, bArr, length2, 2);
            System.arraycopy(interfaceC6419ArrM11511[i2].getLocalFileDataLength().getBytes(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] localFileDataData2 = interfaceC6419ArrM11511[i2].getLocalFileDataData();
            if (localFileDataData2 != null) {
                System.arraycopy(localFileDataData2, 0, bArr, length2, localFileDataData2.length);
                length2 += localFileDataData2.length;
            }
        }
        if (z && (localFileDataData = interfaceC6419ArrM11511[length - 1].getLocalFileDataData()) != null) {
            System.arraycopy(localFileDataData, 0, bArr, length2, localFileDataData.length);
        }
        super.setExtra(bArr);
        InterfaceC6419 interfaceC6419M11509 = m11509(X5455_ExtendedTimestamp.HEADER_ID);
        if (interfaceC6419M11509 instanceof X5455_ExtendedTimestamp) {
            X5455_ExtendedTimestamp x5455_ExtendedTimestamp = (X5455_ExtendedTimestamp) interfaceC6419M11509;
            if (x5455_ExtendedTimestamp.isBit0_modifyTimePresent() && (modifyFileTime = x5455_ExtendedTimestamp.getModifyFileTime()) != null) {
                super.setLastModifiedTime(modifyFileTime);
                this.f15706 = modifyFileTime.toMillis();
                this.f15707 = true;
            }
            if (x5455_ExtendedTimestamp.isBit1_accessTimePresent() && (accessFileTime = x5455_ExtendedTimestamp.getAccessFileTime()) != null) {
                super.setLastAccessTime(accessFileTime);
            }
            if (x5455_ExtendedTimestamp.isBit2_createTimePresent() && (createFileTime = x5455_ExtendedTimestamp.getCreateFileTime()) != null) {
                super.setCreationTime(createFileTime);
            }
        }
        InterfaceC6419 interfaceC6419M115092 = m11509(C6431.f15775);
        if (interfaceC6419M115092 instanceof C6431) {
            C6431 c6431 = (C6431) interfaceC6419M115092;
            FileTime fileTimeM11529 = C6431.m11529(c6431.f15779);
            if (fileTimeM11529 != null) {
                super.setLastModifiedTime(fileTimeM11529);
                this.f15706 = fileTimeM11529.toMillis();
                this.f15707 = true;
            }
            FileTime fileTimeM115292 = C6431.m11529(c6431.f15777);
            if (fileTimeM115292 != null) {
                super.setLastAccessTime(fileTimeM115292);
            }
            FileTime fileTimeM115293 = C6431.m11529(c6431.f15778);
            if (fileTimeM115293 != null) {
                super.setCreationTime(fileTimeM115293);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11514() {
        ZipShort zipShort = X5455_ExtendedTimestamp.HEADER_ID;
        if (m11509(zipShort) != null) {
            m11507(zipShort);
        }
        ZipShort zipShort2 = C6431.f15775;
        if (m11509(zipShort2) != null) {
            m11507(zipShort2);
        }
        if ((getLastAccessTime() == null && getCreationTime() == null) ? this.f15707 : true) {
            FileTime lastModifiedTime = getLastModifiedTime();
            FileTime lastAccessTime = getLastAccessTime();
            FileTime creationTime = getCreationTime();
            MathContext mathContext = AbstractC9748.f25462;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long j = lastModifiedTime != null ? lastModifiedTime.to(timeUnit) : 0L;
            if (-2147483648L <= j && j <= 2147483647L) {
                long j2 = lastAccessTime != null ? lastAccessTime.to(timeUnit) : 0L;
                if (-2147483648L <= j2 && j2 <= 2147483647L) {
                    long j3 = creationTime != null ? creationTime.to(timeUnit) : 0L;
                    if (-2147483648L <= j3 && j3 <= 2147483647L) {
                        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
                        if (lastModifiedTime != null) {
                            x5455_ExtendedTimestamp.setModifyFileTime(lastModifiedTime);
                        }
                        if (lastAccessTime != null) {
                            x5455_ExtendedTimestamp.setAccessFileTime(lastAccessTime);
                        }
                        if (creationTime != null) {
                            x5455_ExtendedTimestamp.setCreateFileTime(creationTime);
                        }
                        m11508(x5455_ExtendedTimestamp);
                    }
                }
            }
            C6431 c6431 = new C6431();
            if (lastModifiedTime != null) {
                c6431.f15779 = C6431.m11530(lastModifiedTime);
            }
            if (lastAccessTime != null) {
                c6431.f15777 = C6431.m11530(lastAccessTime);
            }
            if (creationTime != null) {
                c6431.f15778 = C6431.m11530(creationTime);
            }
            m11508(c6431);
        }
        m11513();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m11515(InterfaceC6419[] interfaceC6419Arr) {
        this.f15708 = null;
        ArrayList arrayList = new ArrayList();
        if (interfaceC6419Arr != null) {
            for (InterfaceC6419 interfaceC6419 : interfaceC6419Arr) {
                if (interfaceC6419 instanceof C6439) {
                    this.f15708 = (C6439) interfaceC6419;
                } else {
                    arrayList.add(interfaceC6419);
                }
            }
        }
        this.f15709 = (InterfaceC6419[]) arrayList.toArray(AbstractC6443.f15809);
        m11513();
    }
}
