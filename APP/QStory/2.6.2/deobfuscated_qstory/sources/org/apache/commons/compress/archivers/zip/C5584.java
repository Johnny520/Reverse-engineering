package org.apache.commons.compress.archivers.zip;

import com.esotericsoftware.kryo.util.C3075;
import java.math.MathContext;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import p007.AbstractC6136;
import p360.AbstractC8929;
import p376.AbstractC8977;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5584 extends ZipEntry {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public long f15361;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f15362;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C5608 f15363;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC5588[] f15364;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f15365;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f15366;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f15367;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C5616 f15368;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f15369;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15370;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f15371;

    static {
        new LinkedList();
    }

    @Override // java.util.zip.ZipEntry
    public final Object clone() {
        C5584 c5584 = (C5584) super.clone();
        c5584.getClass();
        c5584.m10899(m10895());
        return c5584;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5584.class != obj.getClass()) {
            return false;
        }
        C5584 c5584 = (C5584) obj;
        if (!Objects.equals(getName(), c5584.getName())) {
            return false;
        }
        String comment = getComment();
        String comment2 = c5584.getComment();
        if (comment == null) {
            comment = "";
        }
        if (comment2 == null) {
            comment2 = "";
        }
        if (!Objects.equals(getLastModifiedTime(), c5584.getLastModifiedTime()) || !Objects.equals(getLastAccessTime(), c5584.getLastAccessTime()) || !Objects.equals(getCreationTime(), c5584.getCreationTime()) || !comment.equals(comment2) || this.f15370 != c5584.f15370 || this.f15371 != c5584.f15371 || this.f15369 != c5584.f15369 || getCrc() != c5584.getCrc() || getCompressedSize() != c5584.getCompressedSize() || !Arrays.equals(m10894(), c5584.m10894())) {
            return false;
        }
        byte[] extra = getExtra();
        byte[] bArr = AbstractC8977.f25219;
        if (extra == null) {
            extra = bArr;
        }
        byte[] extra2 = c5584.getExtra();
        if (extra2 != null) {
            bArr = extra2;
        }
        return Arrays.equals(extra, bArr) && this.f15365 == c5584.f15365 && this.f15366 == c5584.f15366 && this.f15368.equals(c5584.f15368);
    }

    @Override // java.util.zip.ZipEntry
    public final int getMethod() {
        return this.f15371;
    }

    @Override // java.util.zip.ZipEntry
    public final String getName() {
        String str = this.f15367;
        return str == null ? super.getName() : str;
    }

    @Override // java.util.zip.ZipEntry
    public final long getSize() {
        return this.f15369;
    }

    @Override // java.util.zip.ZipEntry
    public final long getTime() {
        if (this.f15362) {
            return getLastModifiedTime().toMillis();
        }
        long j = this.f15361;
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
        m10898();
        return this;
    }

    @Override // java.util.zip.ZipEntry
    public final void setExtra(byte[] bArr) {
        try {
            m10890(AbstractC5612.m10917(bArr, ZipArchiveEntry$ExtraFieldParsingMode.BEST_EFFORT));
        } catch (ZipException e) {
            C3075.m6913("Error parsing extra fields for entry: ", getName(), " - ", e.getMessage(), e);
        }
    }

    @Override // java.util.zip.ZipEntry
    public final ZipEntry setLastAccessTime(FileTime fileTime) {
        super.setLastAccessTime(fileTime);
        m10898();
        return this;
    }

    @Override // java.util.zip.ZipEntry
    public final ZipEntry setLastModifiedTime(FileTime fileTime) {
        super.setLastModifiedTime(fileTime);
        this.f15361 = fileTime.toMillis();
        this.f15362 = true;
        m10898();
        return this;
    }

    @Override // java.util.zip.ZipEntry
    public final void setMethod(int i) {
        if (i >= 0) {
            this.f15371 = i;
        } else {
            C5919.m11249(AbstractC6136.m11556(i, "ZIP compression method cannot be negative: "));
        }
    }

    @Override // java.util.zip.ZipEntry
    public final void setSize(long j) {
        if (j >= 0) {
            this.f15369 = j;
        } else {
            C5919.m11249("Invalid entry size");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r0 != 2162688) goto L12;
     */
    @Override // java.util.zip.ZipEntry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setTime(long r7) {
        /*
            r6 = this;
            r0 = 4036608000000(0x3abd8960000, double:1.994349338528E-311)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L69
            long r0 = org.apache.commons.compress.archivers.zip.AbstractC5580.f15358
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L5d
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r7)
            java.time.ZoneId r1 = java.time.ZoneId.systemDefault()
            java.time.LocalDateTime r0 = java.time.LocalDateTime.ofInstant(r0, r1)
            int r1 = r0.getYear()
            r2 = 2162688(0x210000, double:1.06851E-317)
            r4 = 1980(0x7bc, float:2.775E-42)
            if (r1 >= r4) goto L28
            r0 = r2
            goto L59
        L28:
            int r1 = r0.getYear()
            int r1 = r1 - r4
            int r1 = r1 << 25
            int r4 = r0.getMonthValue()
            int r4 = r4 << 21
            r1 = r1 | r4
            int r4 = r0.getDayOfMonth()
            int r4 = r4 << 16
            r1 = r1 | r4
            int r4 = r0.getHour()
            int r4 = r4 << 11
            r1 = r1 | r4
            int r4 = r0.getMinute()
            int r4 = r4 << 5
            r1 = r1 | r4
            int r0 = r0.getSecond()
            int r0 = r0 >> 1
            r0 = r0 | r1
            long r0 = (long) r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
        L59:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L6b
        L5d:
            super.setTime(r7)
            r6.f15361 = r7
            r7 = 0
            r6.f15362 = r7
            r6.m10898()
            return
        L69:
            int r0 = org.apache.commons.compress.archivers.zip.AbstractC5580.f15357
        L6b:
            java.nio.file.attribute.FileTime r7 = java.nio.file.attribute.FileTime.fromMillis(r7)
            r6.setLastModifiedTime(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.C5584.setTime(long):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m10890(InterfaceC5588[] interfaceC5588Arr) {
        if (this.f15364 == null) {
            m10899(interfaceC5588Arr);
            return;
        }
        for (InterfaceC5588 interfaceC5588 : interfaceC5588Arr) {
            InterfaceC5588 interfaceC5588M10893 = interfaceC5588 instanceof C5608 ? this.f15363 : m10893(interfaceC5588.getHeaderId());
            if (interfaceC5588M10893 == null) {
                m10892(interfaceC5588);
            } else {
                byte[] localFileDataData = interfaceC5588.getLocalFileDataData();
                try {
                    interfaceC5588M10893.parseFromLocalFileData(localFileDataData, 0, localFileDataData.length);
                } catch (ZipException unused) {
                    C5609 c5609 = new C5609();
                    c5609.f15462 = interfaceC5588M10893.getHeaderId();
                    c5609.f15460 = AbstractC5580.m10889(localFileDataData);
                    c5609.f15461 = AbstractC5580.m10889(interfaceC5588M10893.getCentralDirectoryData());
                    m10891(interfaceC5588M10893.getHeaderId());
                    m10892(c5609);
                }
            }
        }
        m10897();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m10891(ZipShort zipShort) {
        if (this.f15364 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5588 interfaceC5588 : this.f15364) {
            if (!zipShort.equals(interfaceC5588.getHeaderId())) {
                arrayList.add(interfaceC5588);
            }
        }
        if (this.f15364.length == arrayList.size()) {
            return;
        }
        this.f15364 = (InterfaceC5588[]) arrayList.toArray(AbstractC5612.f15464);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m10892(InterfaceC5588 interfaceC5588) {
        if (interfaceC5588 instanceof C5608) {
            this.f15363 = (C5608) interfaceC5588;
            return;
        }
        if (this.f15364 == null) {
            this.f15364 = new InterfaceC5588[]{interfaceC5588};
            return;
        }
        if (m10893(interfaceC5588.getHeaderId()) != null) {
            m10891(interfaceC5588.getHeaderId());
        }
        InterfaceC5588[] interfaceC5588Arr = this.f15364;
        InterfaceC5588[] interfaceC5588Arr2 = (InterfaceC5588[]) Arrays.copyOf(interfaceC5588Arr, interfaceC5588Arr.length + 1);
        interfaceC5588Arr2[interfaceC5588Arr2.length - 1] = interfaceC5588;
        this.f15364 = interfaceC5588Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5588 m10893(ZipShort zipShort) {
        InterfaceC5588[] interfaceC5588Arr = this.f15364;
        if (interfaceC5588Arr == null) {
            return null;
        }
        for (InterfaceC5588 interfaceC5588 : interfaceC5588Arr) {
            if (zipShort.equals(interfaceC5588.getHeaderId())) {
                return interfaceC5588;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] m10894() {
        byte[] centralDirectoryData;
        InterfaceC5588[] interfaceC5588ArrM10895 = m10895();
        ConcurrentHashMap concurrentHashMap = AbstractC5612.f15465;
        int length = interfaceC5588ArrM10895.length;
        boolean z = length > 0 && (interfaceC5588ArrM10895[length + (-1)] instanceof C5608);
        int i = z ? length - 1 : length;
        int value = i * 4;
        for (InterfaceC5588 interfaceC5588 : interfaceC5588ArrM10895) {
            value += interfaceC5588.getCentralDirectoryLength().getValue();
        }
        byte[] bArr = new byte[value];
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            System.arraycopy(interfaceC5588ArrM10895[i2].getHeaderId().getBytes(), 0, bArr, length2, 2);
            System.arraycopy(interfaceC5588ArrM10895[i2].getCentralDirectoryLength().getBytes(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] centralDirectoryData2 = interfaceC5588ArrM10895[i2].getCentralDirectoryData();
            if (centralDirectoryData2 != null) {
                System.arraycopy(centralDirectoryData2, 0, bArr, length2, centralDirectoryData2.length);
                length2 += centralDirectoryData2.length;
            }
        }
        if (z && (centralDirectoryData = interfaceC5588ArrM10895[length - 1].getCentralDirectoryData()) != null) {
            System.arraycopy(centralDirectoryData, 0, bArr, length2, centralDirectoryData.length);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5588[] m10895() {
        InterfaceC5588[] interfaceC5588Arr = this.f15364;
        C5608 c5608 = this.f15363;
        if (interfaceC5588Arr == null) {
            return c5608 == null ? AbstractC5612.f15464 : new InterfaceC5588[]{c5608};
        }
        if (c5608 == null) {
            return interfaceC5588Arr;
        }
        InterfaceC5588[] interfaceC5588Arr2 = (InterfaceC5588[]) Arrays.copyOf(interfaceC5588Arr, interfaceC5588Arr.length + 1);
        interfaceC5588Arr2[this.f15364.length] = this.f15363;
        return interfaceC5588Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m10896(String str) {
        if (str != null && this.f15370 == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.f15367 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m10897() {
        FileTime createFileTime;
        FileTime accessFileTime;
        FileTime modifyFileTime;
        byte[] localFileDataData;
        InterfaceC5588[] interfaceC5588ArrM10895 = m10895();
        ConcurrentHashMap concurrentHashMap = AbstractC5612.f15465;
        int length = interfaceC5588ArrM10895.length;
        boolean z = length > 0 && (interfaceC5588ArrM10895[length + (-1)] instanceof C5608);
        int i = z ? length - 1 : length;
        int value = i * 4;
        for (InterfaceC5588 interfaceC5588 : interfaceC5588ArrM10895) {
            value += interfaceC5588.getLocalFileDataLength().getValue();
        }
        byte[] bArr = new byte[value];
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            System.arraycopy(interfaceC5588ArrM10895[i2].getHeaderId().getBytes(), 0, bArr, length2, 2);
            System.arraycopy(interfaceC5588ArrM10895[i2].getLocalFileDataLength().getBytes(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] localFileDataData2 = interfaceC5588ArrM10895[i2].getLocalFileDataData();
            if (localFileDataData2 != null) {
                System.arraycopy(localFileDataData2, 0, bArr, length2, localFileDataData2.length);
                length2 += localFileDataData2.length;
            }
        }
        if (z && (localFileDataData = interfaceC5588ArrM10895[length - 1].getLocalFileDataData()) != null) {
            System.arraycopy(localFileDataData, 0, bArr, length2, localFileDataData.length);
        }
        super.setExtra(bArr);
        InterfaceC5588 interfaceC5588M10893 = m10893(X5455_ExtendedTimestamp.HEADER_ID);
        if (interfaceC5588M10893 instanceof X5455_ExtendedTimestamp) {
            X5455_ExtendedTimestamp x5455_ExtendedTimestamp = (X5455_ExtendedTimestamp) interfaceC5588M10893;
            if (x5455_ExtendedTimestamp.isBit0_modifyTimePresent() && (modifyFileTime = x5455_ExtendedTimestamp.getModifyFileTime()) != null) {
                super.setLastModifiedTime(modifyFileTime);
                this.f15361 = modifyFileTime.toMillis();
                this.f15362 = true;
            }
            if (x5455_ExtendedTimestamp.isBit1_accessTimePresent() && (accessFileTime = x5455_ExtendedTimestamp.getAccessFileTime()) != null) {
                super.setLastAccessTime(accessFileTime);
            }
            if (x5455_ExtendedTimestamp.isBit2_createTimePresent() && (createFileTime = x5455_ExtendedTimestamp.getCreateFileTime()) != null) {
                super.setCreationTime(createFileTime);
            }
        }
        InterfaceC5588 interfaceC5588M108932 = m10893(C5600.f15430);
        if (interfaceC5588M108932 instanceof C5600) {
            C5600 c5600 = (C5600) interfaceC5588M108932;
            FileTime fileTimeM10913 = C5600.m10913(c5600.f15434);
            if (fileTimeM10913 != null) {
                super.setLastModifiedTime(fileTimeM10913);
                this.f15361 = fileTimeM10913.toMillis();
                this.f15362 = true;
            }
            FileTime fileTimeM109132 = C5600.m10913(c5600.f15432);
            if (fileTimeM109132 != null) {
                super.setLastAccessTime(fileTimeM109132);
            }
            FileTime fileTimeM109133 = C5600.m10913(c5600.f15433);
            if (fileTimeM109133 != null) {
                super.setCreationTime(fileTimeM109133);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m10898() {
        ZipShort zipShort = X5455_ExtendedTimestamp.HEADER_ID;
        if (m10893(zipShort) != null) {
            m10891(zipShort);
        }
        ZipShort zipShort2 = C5600.f15430;
        if (m10893(zipShort2) != null) {
            m10891(zipShort2);
        }
        if ((getLastAccessTime() == null && getCreationTime() == null) ? this.f15362 : true) {
            FileTime lastModifiedTime = getLastModifiedTime();
            FileTime lastAccessTime = getLastAccessTime();
            FileTime creationTime = getCreationTime();
            MathContext mathContext = AbstractC8929.f25128;
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
                        m10892(x5455_ExtendedTimestamp);
                    }
                }
            }
            C5600 c5600 = new C5600();
            if (lastModifiedTime != null) {
                c5600.f15434 = C5600.m10914(lastModifiedTime);
            }
            if (lastAccessTime != null) {
                c5600.f15432 = C5600.m10914(lastAccessTime);
            }
            if (creationTime != null) {
                c5600.f15433 = C5600.m10914(creationTime);
            }
            m10892(c5600);
        }
        m10897();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10899(InterfaceC5588[] interfaceC5588Arr) {
        this.f15363 = null;
        ArrayList arrayList = new ArrayList();
        if (interfaceC5588Arr != null) {
            for (InterfaceC5588 interfaceC5588 : interfaceC5588Arr) {
                if (interfaceC5588 instanceof C5608) {
                    this.f15363 = (C5608) interfaceC5588;
                } else {
                    arrayList.add(interfaceC5588);
                }
            }
        }
        this.f15364 = (InterfaceC5588[]) arrayList.toArray(AbstractC5612.f15464);
        m10897();
    }
}
