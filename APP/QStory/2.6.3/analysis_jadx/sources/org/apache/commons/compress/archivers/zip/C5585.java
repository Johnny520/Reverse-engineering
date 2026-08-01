package org.apache.commons.compress.archivers.zip;

import com.esotericsoftware.kryo.util.C3076;
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
import p009.AbstractC6183;
import p360.AbstractC8919;
import p379.AbstractC8996;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5585 extends ZipEntry {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public long f15361;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f15362;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C5609 f15363;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC5589[] f15364;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f15365;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f15366;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f15367;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C5617 f15368;

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
        C5585 c5585 = (C5585) super.clone();
        c5585.getClass();
        c5585.m10956(m10952());
        return c5585;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5585.class != obj.getClass()) {
            return false;
        }
        C5585 c5585 = (C5585) obj;
        if (!Objects.equals(getName(), c5585.getName())) {
            return false;
        }
        String comment = getComment();
        String comment2 = c5585.getComment();
        if (comment == null) {
            comment = "";
        }
        if (comment2 == null) {
            comment2 = "";
        }
        if (!Objects.equals(getLastModifiedTime(), c5585.getLastModifiedTime()) || !Objects.equals(getLastAccessTime(), c5585.getLastAccessTime()) || !Objects.equals(getCreationTime(), c5585.getCreationTime()) || !comment.equals(comment2) || this.f15370 != c5585.f15370 || this.f15371 != c5585.f15371 || this.f15369 != c5585.f15369 || getCrc() != c5585.getCrc() || getCompressedSize() != c5585.getCompressedSize() || !Arrays.equals(m10951(), c5585.m10951())) {
            return false;
        }
        byte[] extra = getExtra();
        byte[] bArr = AbstractC8996.f25259;
        if (extra == null) {
            extra = bArr;
        }
        byte[] extra2 = c5585.getExtra();
        if (extra2 != null) {
            bArr = extra2;
        }
        return Arrays.equals(extra, bArr) && this.f15365 == c5585.f15365 && this.f15366 == c5585.f15366 && this.f15368.equals(c5585.f15368);
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
        m10955();
        return this;
    }

    @Override // java.util.zip.ZipEntry
    public final void setExtra(byte[] bArr) {
        try {
            m10947(AbstractC5613.m10974(bArr, ZipArchiveEntry$ExtraFieldParsingMode.BEST_EFFORT));
        } catch (ZipException e) {
            C3076.m6900("Error parsing extra fields for entry: ", getName(), " - ", e.getMessage(), e);
        }
    }

    @Override // java.util.zip.ZipEntry
    public final ZipEntry setLastAccessTime(FileTime fileTime) {
        super.setLastAccessTime(fileTime);
        m10955();
        return this;
    }

    @Override // java.util.zip.ZipEntry
    public final ZipEntry setLastModifiedTime(FileTime fileTime) {
        super.setLastModifiedTime(fileTime);
        this.f15361 = fileTime.toMillis();
        this.f15362 = true;
        m10955();
        return this;
    }

    @Override // java.util.zip.ZipEntry
    public final void setMethod(int i) {
        if (i >= 0) {
            this.f15371 = i;
        } else {
            C5925.m11310(AbstractC6183.m11588(i, "ZIP compression method cannot be negative: "));
        }
    }

    @Override // java.util.zip.ZipEntry
    public final void setSize(long j) {
        if (j >= 0) {
            this.f15369 = j;
        } else {
            C5925.m11310("Invalid entry size");
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
            long r0 = org.apache.commons.compress.archivers.zip.AbstractC5581.f15358
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
            r6.m10955()
            return
        L69:
            int r0 = org.apache.commons.compress.archivers.zip.AbstractC5581.f15357
        L6b:
            java.nio.file.attribute.FileTime r7 = java.nio.file.attribute.FileTime.fromMillis(r7)
            r6.setLastModifiedTime(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.C5585.setTime(long):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m10947(InterfaceC5589[] interfaceC5589Arr) {
        if (this.f15364 == null) {
            m10956(interfaceC5589Arr);
            return;
        }
        for (InterfaceC5589 interfaceC5589 : interfaceC5589Arr) {
            InterfaceC5589 interfaceC5589M10950 = interfaceC5589 instanceof C5609 ? this.f15363 : m10950(interfaceC5589.getHeaderId());
            if (interfaceC5589M10950 == null) {
                m10949(interfaceC5589);
            } else {
                byte[] localFileDataData = interfaceC5589.getLocalFileDataData();
                try {
                    interfaceC5589M10950.parseFromLocalFileData(localFileDataData, 0, localFileDataData.length);
                } catch (ZipException unused) {
                    C5610 c5610 = new C5610();
                    c5610.f15462 = interfaceC5589M10950.getHeaderId();
                    c5610.f15460 = AbstractC5581.m10946(localFileDataData);
                    c5610.f15461 = AbstractC5581.m10946(interfaceC5589M10950.getCentralDirectoryData());
                    m10948(interfaceC5589M10950.getHeaderId());
                    m10949(c5610);
                }
            }
        }
        m10954();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m10948(ZipShort zipShort) {
        if (this.f15364 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5589 interfaceC5589 : this.f15364) {
            if (!zipShort.equals(interfaceC5589.getHeaderId())) {
                arrayList.add(interfaceC5589);
            }
        }
        if (this.f15364.length == arrayList.size()) {
            return;
        }
        this.f15364 = (InterfaceC5589[]) arrayList.toArray(AbstractC5613.f15464);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m10949(InterfaceC5589 interfaceC5589) {
        if (interfaceC5589 instanceof C5609) {
            this.f15363 = (C5609) interfaceC5589;
            return;
        }
        if (this.f15364 == null) {
            this.f15364 = new InterfaceC5589[]{interfaceC5589};
            return;
        }
        if (m10950(interfaceC5589.getHeaderId()) != null) {
            m10948(interfaceC5589.getHeaderId());
        }
        InterfaceC5589[] interfaceC5589Arr = this.f15364;
        InterfaceC5589[] interfaceC5589Arr2 = (InterfaceC5589[]) Arrays.copyOf(interfaceC5589Arr, interfaceC5589Arr.length + 1);
        interfaceC5589Arr2[interfaceC5589Arr2.length - 1] = interfaceC5589;
        this.f15364 = interfaceC5589Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5589 m10950(ZipShort zipShort) {
        InterfaceC5589[] interfaceC5589Arr = this.f15364;
        if (interfaceC5589Arr == null) {
            return null;
        }
        for (InterfaceC5589 interfaceC5589 : interfaceC5589Arr) {
            if (zipShort.equals(interfaceC5589.getHeaderId())) {
                return interfaceC5589;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] m10951() {
        byte[] centralDirectoryData;
        InterfaceC5589[] interfaceC5589ArrM10952 = m10952();
        ConcurrentHashMap concurrentHashMap = AbstractC5613.f15465;
        int length = interfaceC5589ArrM10952.length;
        boolean z = length > 0 && (interfaceC5589ArrM10952[length + (-1)] instanceof C5609);
        int i = z ? length - 1 : length;
        int value = i * 4;
        for (InterfaceC5589 interfaceC5589 : interfaceC5589ArrM10952) {
            value += interfaceC5589.getCentralDirectoryLength().getValue();
        }
        byte[] bArr = new byte[value];
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            System.arraycopy(interfaceC5589ArrM10952[i2].getHeaderId().getBytes(), 0, bArr, length2, 2);
            System.arraycopy(interfaceC5589ArrM10952[i2].getCentralDirectoryLength().getBytes(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] centralDirectoryData2 = interfaceC5589ArrM10952[i2].getCentralDirectoryData();
            if (centralDirectoryData2 != null) {
                System.arraycopy(centralDirectoryData2, 0, bArr, length2, centralDirectoryData2.length);
                length2 += centralDirectoryData2.length;
            }
        }
        if (z && (centralDirectoryData = interfaceC5589ArrM10952[length - 1].getCentralDirectoryData()) != null) {
            System.arraycopy(centralDirectoryData, 0, bArr, length2, centralDirectoryData.length);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5589[] m10952() {
        InterfaceC5589[] interfaceC5589Arr = this.f15364;
        C5609 c5609 = this.f15363;
        if (interfaceC5589Arr == null) {
            return c5609 == null ? AbstractC5613.f15464 : new InterfaceC5589[]{c5609};
        }
        if (c5609 == null) {
            return interfaceC5589Arr;
        }
        InterfaceC5589[] interfaceC5589Arr2 = (InterfaceC5589[]) Arrays.copyOf(interfaceC5589Arr, interfaceC5589Arr.length + 1);
        interfaceC5589Arr2[this.f15364.length] = this.f15363;
        return interfaceC5589Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m10953(String str) {
        if (str != null && this.f15370 == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.f15367 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m10954() {
        FileTime createFileTime;
        FileTime accessFileTime;
        FileTime modifyFileTime;
        byte[] localFileDataData;
        InterfaceC5589[] interfaceC5589ArrM10952 = m10952();
        ConcurrentHashMap concurrentHashMap = AbstractC5613.f15465;
        int length = interfaceC5589ArrM10952.length;
        boolean z = length > 0 && (interfaceC5589ArrM10952[length + (-1)] instanceof C5609);
        int i = z ? length - 1 : length;
        int value = i * 4;
        for (InterfaceC5589 interfaceC5589 : interfaceC5589ArrM10952) {
            value += interfaceC5589.getLocalFileDataLength().getValue();
        }
        byte[] bArr = new byte[value];
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            System.arraycopy(interfaceC5589ArrM10952[i2].getHeaderId().getBytes(), 0, bArr, length2, 2);
            System.arraycopy(interfaceC5589ArrM10952[i2].getLocalFileDataLength().getBytes(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] localFileDataData2 = interfaceC5589ArrM10952[i2].getLocalFileDataData();
            if (localFileDataData2 != null) {
                System.arraycopy(localFileDataData2, 0, bArr, length2, localFileDataData2.length);
                length2 += localFileDataData2.length;
            }
        }
        if (z && (localFileDataData = interfaceC5589ArrM10952[length - 1].getLocalFileDataData()) != null) {
            System.arraycopy(localFileDataData, 0, bArr, length2, localFileDataData.length);
        }
        super.setExtra(bArr);
        InterfaceC5589 interfaceC5589M10950 = m10950(X5455_ExtendedTimestamp.HEADER_ID);
        if (interfaceC5589M10950 instanceof X5455_ExtendedTimestamp) {
            X5455_ExtendedTimestamp x5455_ExtendedTimestamp = (X5455_ExtendedTimestamp) interfaceC5589M10950;
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
        InterfaceC5589 interfaceC5589M109502 = m10950(C5601.f15430);
        if (interfaceC5589M109502 instanceof C5601) {
            C5601 c5601 = (C5601) interfaceC5589M109502;
            FileTime fileTimeM10970 = C5601.m10970(c5601.f15434);
            if (fileTimeM10970 != null) {
                super.setLastModifiedTime(fileTimeM10970);
                this.f15361 = fileTimeM10970.toMillis();
                this.f15362 = true;
            }
            FileTime fileTimeM109702 = C5601.m10970(c5601.f15432);
            if (fileTimeM109702 != null) {
                super.setLastAccessTime(fileTimeM109702);
            }
            FileTime fileTimeM109703 = C5601.m10970(c5601.f15433);
            if (fileTimeM109703 != null) {
                super.setCreationTime(fileTimeM109703);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m10955() {
        ZipShort zipShort = X5455_ExtendedTimestamp.HEADER_ID;
        if (m10950(zipShort) != null) {
            m10948(zipShort);
        }
        ZipShort zipShort2 = C5601.f15430;
        if (m10950(zipShort2) != null) {
            m10948(zipShort2);
        }
        if ((getLastAccessTime() == null && getCreationTime() == null) ? this.f15362 : true) {
            FileTime lastModifiedTime = getLastModifiedTime();
            FileTime lastAccessTime = getLastAccessTime();
            FileTime creationTime = getCreationTime();
            MathContext mathContext = AbstractC8919.f25117;
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
                        m10949(x5455_ExtendedTimestamp);
                    }
                }
            }
            C5601 c5601 = new C5601();
            if (lastModifiedTime != null) {
                c5601.f15434 = C5601.m10971(lastModifiedTime);
            }
            if (lastAccessTime != null) {
                c5601.f15432 = C5601.m10971(lastAccessTime);
            }
            if (creationTime != null) {
                c5601.f15433 = C5601.m10971(creationTime);
            }
            m10949(c5601);
        }
        m10954();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10956(InterfaceC5589[] interfaceC5589Arr) {
        this.f15363 = null;
        ArrayList arrayList = new ArrayList();
        if (interfaceC5589Arr != null) {
            for (InterfaceC5589 interfaceC5589 : interfaceC5589Arr) {
                if (interfaceC5589 instanceof C5609) {
                    this.f15363 = (C5609) interfaceC5589;
                } else {
                    arrayList.add(interfaceC5589);
                }
            }
        }
        this.f15364 = (InterfaceC5589[]) arrayList.toArray(AbstractC5613.f15464);
        m10954();
    }
}
