package yyds;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛵᛴᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1068 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f4884;

    static {
        AbstractC2328.m4341(-1727461189124974L);
    }

    public C1068(String str) {
        AbstractC2328.m4341(-1726228533511022L);
        this.f4884 = str;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static Pair m2258(RandomAccessFile randomAccessFile, C0794 c0794) throws IOException {
        randomAccessFile.seek(c0794.f3652);
        int i = randomAccessFile.readByte() & 255;
        randomAccessFile.skipBytes(3);
        if (i == 0) {
            randomAccessFile.skipBytes(20);
        } else {
            randomAccessFile.skipBytes(32);
        }
        randomAccessFile.skipBytes(8);
        randomAccessFile.skipBytes(4);
        randomAccessFile.skipBytes(4);
        randomAccessFile.skipBytes(36);
        return new Pair(Integer.valueOf(randomAccessFile.readInt() >> 16), Integer.valueOf(randomAccessFile.readInt() >> 16));
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static C0206 m2259(RandomAccessFile randomAccessFile, C0794 c0794) throws IOException {
        Object next;
        EnumC1381 enumC1381;
        List listM2263 = m2263(randomAccessFile, c0794.f3652, c0794.f3648);
        Iterator it = listM2263.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C0794) next).f3649.equals(AbstractC2328.m4341(-1726816944030574L))) {
                break;
            }
        }
        C0794 c07942 = (C0794) next;
        if (c07942 != null) {
            ArrayList<C0794> arrayList = new ArrayList();
            for (Object obj : listM2263) {
                if (((C0794) obj).f3649.equals(AbstractC2328.m4341(-1726838418867054L))) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                List listM22632 = m2263(randomAccessFile, c07942.f3652, c07942.f3648);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int i = 0;
                for (Object obj2 : listM22632) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC2725.m4853();
                        throw null;
                    }
                    C0794 c07943 = (C0794) obj2;
                    if (c07943.f3649.equals(AbstractC2328.m4341(-1726859893703534L))) {
                        byte[] bytes = AbstractC2328.m4341(-1727199196119918L).getBytes(AbstractC0347.f1811);
                        AbstractC2328.m4341(-1727315160236910L);
                        if (m2262(c07943.f3652, 5 + ((long) bytes.length), c07943.f3648)) {
                            randomAccessFile.seek(c07943.f3652);
                            int unsignedByte = randomAccessFile.readUnsignedByte();
                            randomAccessFile.skipBytes(3);
                            if (unsignedByte != 0) {
                                enumC1381 = EnumC1381.f6425;
                            } else {
                                int length = bytes.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < length) {
                                        if (randomAccessFile.readUnsignedByte() != (bytes[i3] & 255)) {
                                            enumC1381 = EnumC1381.f6425;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        enumC1381 = randomAccessFile.readUnsignedByte() != 0 ? EnumC1381.f6425 : randomAccessFile.getFilePointer() == c07943.f3648 ? EnumC1381.f6427 : EnumC1381.f6424;
                                    }
                                }
                            }
                        } else {
                            enumC1381 = EnumC1381.f6425;
                        }
                        int iOrdinal = enumC1381.ordinal();
                        if (iOrdinal == 0) {
                            continue;
                        } else if (iOrdinal == 1) {
                            linkedHashSet.add(Integer.valueOf(i2));
                        } else {
                            if (iOrdinal != 2) {
                                C0188.m801();
                                return null;
                            }
                            linkedHashSet.add(Integer.valueOf(i2));
                            linkedHashSet2.add(Integer.valueOf(i2));
                        }
                    }
                    i = i2;
                }
                if (linkedHashSet.isEmpty()) {
                    C1422 c1422 = C1422.f6715;
                    return new C0206(c1422, c1422);
                }
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                for (C0794 c07944 : arrayList) {
                    LinkedHashSet linkedHashSetM2260 = m2260(randomAccessFile, c07944, listM22632.size(), linkedHashSet);
                    if (linkedHashSetM2260 != null) {
                        linkedHashSet3.addAll(linkedHashSetM2260);
                        if (!linkedHashSet2.isEmpty()) {
                            LinkedHashSet linkedHashSetM22602 = m2260(randomAccessFile, c07944, listM22632.size(), linkedHashSet2);
                            if (linkedHashSetM22602 != null) {
                                linkedHashSet4.addAll(linkedHashSetM22602);
                            }
                        }
                    }
                }
                return new C0206(linkedHashSet3, linkedHashSet4);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static LinkedHashSet m2260(RandomAccessFile randomAccessFile, C0794 c0794, int i, LinkedHashSet linkedHashSet) throws IOException {
        int i2;
        Integer numM2270;
        if (!m2262(c0794.f3652, 8L, c0794.f3648)) {
            return null;
        }
        randomAccessFile.seek(c0794.f3652);
        int unsignedByte = randomAccessFile.readUnsignedByte();
        int unsignedByte2 = (randomAccessFile.readUnsignedByte() << 16) | (randomAccessFile.readUnsignedByte() << 8) | randomAccessFile.readUnsignedByte();
        if (unsignedByte == 0) {
            i2 = 2;
        } else {
            if (unsignedByte != 1) {
                return null;
            }
            i2 = 4;
        }
        int i3 = (unsignedByte2 & 1) != 0 ? 2 : 1;
        int i4 = i3 == 2 ? 32767 : 127;
        long j = ((long) randomAccessFile.readInt()) & 4294967295L;
        if (j > 100000) {
            return null;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i5 = (int) j;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = i4;
            if (!m2262(randomAccessFile.getFilePointer(), ((long) i2) + 1, c0794.f3648) || (numM2270 = m2270(randomAccessFile, i2)) == null) {
                return null;
            }
            int unsignedByte3 = randomAccessFile.readUnsignedByte();
            if (!m2262(randomAccessFile.getFilePointer(), ((long) unsignedByte3) * ((long) i3), c0794.f3648)) {
                return null;
            }
            boolean z = false;
            for (int i8 = 0; i8 < unsignedByte3; i8++) {
                int unsignedShort = (i3 == 2 ? randomAccessFile.readUnsignedShort() : randomAccessFile.readUnsignedByte()) & i7;
                if (unsignedShort > i) {
                    return null;
                }
                if (linkedHashSet.contains(Integer.valueOf(unsignedShort))) {
                    z = true;
                }
            }
            if (z) {
                linkedHashSet2.add(numM2270);
            }
            i6++;
            i4 = i7;
        }
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static LinkedHashSet m2261(RandomAccessFile randomAccessFile, C0794 c0794, int i) throws IOException {
        int i2;
        int unsignedShort;
        long j = c0794.f3652;
        if (!m2262(j, 4L, c0794.f3648)) {
            return null;
        }
        randomAccessFile.seek(j);
        int unsignedByte = randomAccessFile.readUnsignedByte();
        randomAccessFile.skipBytes(3);
        if (unsignedByte == 0) {
            i2 = 2;
        } else {
            if (unsignedByte != 1) {
                return null;
            }
            i2 = 4;
        }
        List<C0794> listM2263 = m2263(randomAccessFile, j + 4, c0794.f3648);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C0794 c07942 : listM2263) {
            if (c07942.f3649.equals(AbstractC2328.m4341(-1726773994357614L))) {
                long j2 = i2;
                if (!m2262(c07942.f3652, 2 + j2, c07942.f3648)) {
                    return null;
                }
                randomAccessFile.seek(c07942.f3652);
                Integer numM2270 = m2270(randomAccessFile, i2);
                if (numM2270 == null || (unsignedShort = randomAccessFile.readUnsignedShort()) > 100000) {
                    return null;
                }
                if (!m2262(randomAccessFile.getFilePointer(), ((long) unsignedShort) * j2, c07942.f3648)) {
                    return null;
                }
                boolean z = false;
                for (int i3 = 0; i3 < unsignedShort; i3++) {
                    Integer numM22702 = m2270(randomAccessFile, i2);
                    if (numM22702 == null) {
                        return null;
                    }
                    if (numM22702.intValue() == i) {
                        z = true;
                    }
                }
                if (z) {
                    linkedHashSet.add(numM2270);
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static boolean m2262(long j, long j2, long j3) {
        return j >= 0 && j2 >= 0 && j <= j3 && j2 <= j3 - j;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static List m2263(RandomAccessFile randomAccessFile, long j, long j2) throws IOException {
        long j3;
        if (j >= 0 && j2 >= j && j2 <= randomAccessFile.length()) {
            ArrayList arrayList = new ArrayList();
            long j4 = j;
            while (m2262(j4, 8L, j2)) {
                if (arrayList.size() < 100000) {
                    randomAccessFile.seek(j4);
                    byte[] bArr = new byte[8];
                    if (randomAccessFile.read(bArr) != 8) {
                        break;
                    }
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                    ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                    long j5 = ((long) byteBufferWrap.order(byteOrder).getInt()) & 4294967295L;
                    String str = new String(bArr, 4, 4, AbstractC0347.f1811);
                    if (j5 != 1) {
                        if (j5 == 0) {
                            j5 = j2 - j4;
                        }
                        j3 = 8;
                    } else {
                        if (!m2262(j4, 16L, j2)) {
                            break;
                        }
                        byte[] bArr2 = new byte[8];
                        if (randomAccessFile.read(bArr2) != 8) {
                            break;
                        }
                        j5 = ByteBuffer.wrap(bArr2).order(byteOrder).getLong();
                        j3 = 16;
                    }
                    long j6 = j5;
                    if (j6 < j3 || j6 > j2 - j4) {
                        break;
                    }
                    long j7 = j3;
                    long j8 = j4;
                    long j9 = j8 + j6;
                    arrayList.add(new C0794(str, j8, j6, j7 + j8, j9));
                    j4 = j9;
                }
            }
            return arrayList;
        }
        return C1860.f9345;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Boolean m2264(RandomAccessFile randomAccessFile, C0794 c0794, int i, int i2) throws IOException {
        int i3;
        long j = c0794.f3652;
        if (!m2262(j, 4L, c0794.f3648)) {
            return null;
        }
        randomAccessFile.seek(j);
        int unsignedByte = randomAccessFile.readUnsignedByte();
        randomAccessFile.skipBytes(3);
        if (unsignedByte == 0) {
            i3 = 2;
        } else {
            if (unsignedByte != 1) {
                return null;
            }
            i3 = 4;
        }
        for (C0794 c07942 : m2263(randomAccessFile, j + 4, c0794.f3648)) {
            if (c07942.f3649.equals(AbstractC2328.m4341(-1726795469194094L))) {
                long j2 = i3;
                if (!m2262(c07942.f3652, 2 + j2, c07942.f3648)) {
                    return null;
                }
                randomAccessFile.seek(c07942.f3652);
                Integer numM2270 = m2270(randomAccessFile, i3);
                if (numM2270 == null) {
                    return null;
                }
                int iIntValue = numM2270.intValue();
                int unsignedShort = randomAccessFile.readUnsignedShort();
                if (unsignedShort > 100000) {
                    return null;
                }
                if (!m2262(randomAccessFile.getFilePointer(), ((long) unsignedShort) * j2, c07942.f3648)) {
                    return null;
                }
                for (int i4 = 0; i4 < unsignedShort; i4++) {
                    Integer numM22702 = m2270(randomAccessFile, i3);
                    if (numM22702 == null) {
                        return null;
                    }
                    int iIntValue2 = numM22702.intValue();
                    if ((iIntValue == i && iIntValue2 == i2) || (iIntValue == i2 && iIntValue2 == i)) {
                        return Boolean.TRUE;
                    }
                }
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static Long m2265(RandomAccessFile randomAccessFile, int i, long j) {
        long j2 = 0;
        if (i == 0) {
            return 0L;
        }
        if (1 > i || i >= 9 || !m2262(randomAccessFile.getFilePointer(), i, j)) {
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            long unsignedByte = randomAccessFile.readUnsignedByte();
            if (j2 > (Long.MAX_VALUE - unsignedByte) / 256) {
                return null;
            }
            j2 = (j2 * 256) + unsignedByte;
        }
        return Long.valueOf(j2);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static ArrayList m2266(RandomAccessFile randomAccessFile, C0794 c0794, int i, C0794 c07942) throws IOException {
        long unsignedShort;
        Integer numM2270;
        int i2;
        int unsignedShort2;
        Long lM2265;
        int i3;
        int i4;
        int i5;
        char c;
        long j;
        Long lValueOf;
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        C0794 c07943 = c0794;
        C0794 c07944 = c07942;
        long j2 = c07943.f3652;
        long j3 = c07943.f3648;
        if (m2262(j2, 6L, j3)) {
            randomAccessFile2.seek(c07943.f3652);
            int unsignedByte = randomAccessFile2.readUnsignedByte();
            int unsignedByte2 = (randomAccessFile2.readUnsignedByte() << 8) | (randomAccessFile2.readUnsignedByte() << 16) | randomAccessFile2.readUnsignedByte();
            if (unsignedByte >= 0 && unsignedByte < 3 && unsignedByte2 == 0) {
                int unsignedByte3 = randomAccessFile2.readUnsignedByte();
                int i6 = unsignedByte3 >>> 4;
                int i7 = unsignedByte3 & 15;
                int unsignedByte4 = randomAccessFile2.readUnsignedByte();
                int i8 = unsignedByte4 >>> 4;
                int i9 = unsignedByte4 & 15;
                int i10 = 2;
                if (unsignedByte != 1 && unsignedByte != 2) {
                    if (i9 != 0) {
                        return null;
                    }
                    i9 = 0;
                }
                if (!AbstractC0068.m441(0, 4, 8).contains(Integer.valueOf(i6)) || !AbstractC0068.m441(4, 8).contains(Integer.valueOf(i7)) || !AbstractC0068.m441(0, 4, 8).contains(Integer.valueOf(i8)) || !AbstractC0068.m441(0, 4, 8).contains(Integer.valueOf(i9))) {
                    return null;
                }
                if (unsignedByte < 2) {
                    if (!m2262(randomAccessFile2.getFilePointer(), 2L, c07943.f3648)) {
                        return null;
                    }
                    unsignedShort = randomAccessFile2.readUnsignedShort();
                } else {
                    if (!m2262(randomAccessFile2.getFilePointer(), 4L, c07943.f3648)) {
                        return null;
                    }
                    unsignedShort = ((long) randomAccessFile2.readInt()) & 4294967295L;
                }
                if (unsignedShort > 100000) {
                    return null;
                }
                int i11 = (int) unsignedShort;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = unsignedByte < i10 ? i10 : 4;
                    int i14 = i13;
                    if (!m2262(randomAccessFile2.getFilePointer(), i13, c07943.f3648) || (numM2270 = m2270(randomAccessFile2, i14)) == null) {
                        return null;
                    }
                    int iIntValue = numM2270.intValue();
                    if (unsignedByte == 1 || unsignedByte == 2) {
                        if (!m2262(randomAccessFile2.getFilePointer(), 2L, c07943.f3648)) {
                            return null;
                        }
                        int unsignedShort3 = randomAccessFile2.readUnsignedShort();
                        if ((65520 & unsignedShort3) != 0) {
                            return null;
                        }
                        i2 = unsignedShort3 & 15;
                    } else {
                        i2 = 0;
                    }
                    if (!m2262(randomAccessFile2.getFilePointer(), 2L, c07943.f3648)) {
                        return null;
                    }
                    int unsignedShort4 = randomAccessFile2.readUnsignedShort();
                    Long lM22652 = m2265(randomAccessFile2, i8, j3);
                    if (lM22652 == null) {
                        return null;
                    }
                    long jLongValue = lM22652.longValue();
                    int i15 = i11;
                    int i16 = i8;
                    if (!m2262(randomAccessFile2.getFilePointer(), 2L, c07943.f3648) || (unsignedShort2 = randomAccessFile2.readUnsignedShort()) > 100000) {
                        return null;
                    }
                    boolean z = iIntValue == i;
                    if (z && unsignedShort4 != 0) {
                        return null;
                    }
                    ArrayList arrayList = z ? new ArrayList(unsignedShort2) : null;
                    int i17 = 0;
                    while (i17 < unsignedShort2) {
                        if ((i9 > 0 && m2265(randomAccessFile2, i9, j3) == null) || (lM2265 = m2265(randomAccessFile2, i6, j3)) == null) {
                            return null;
                        }
                        long jLongValue2 = lM2265.longValue();
                        Long lM22653 = m2265(randomAccessFile2, i7, j3);
                        if (lM22653 == null) {
                            return null;
                        }
                        long jLongValue3 = lM22653.longValue();
                        if (!z) {
                            i3 = i17;
                            i4 = i7;
                            i5 = unsignedShort2;
                        } else {
                            if (jLongValue3 <= 0) {
                                return null;
                            }
                            if (i2 == 0) {
                                i3 = i17;
                                c = 1;
                                j = 0;
                            } else {
                                if (i2 != 1 || c07944 == null) {
                                    return null;
                                }
                                c = 1;
                                i3 = i17;
                                j = c07944.f3652;
                            }
                            long[] jArr = new long[3];
                            jArr[0] = j;
                            jArr[c] = jLongValue;
                            jArr[2] = jLongValue2;
                            long j4 = 0;
                            for (int i18 = 0; i18 < 3; i18++) {
                                long j5 = jArr[i18];
                                if (j5 < 0 || j4 > Long.MAX_VALUE - j5) {
                                    lValueOf = null;
                                    break;
                                }
                                j4 += j5;
                            }
                            lValueOf = Long.valueOf(j4);
                            if (lValueOf == null) {
                                return null;
                            }
                            long jLongValue4 = lValueOf.longValue();
                            i4 = i7;
                            if (!m2262(jLongValue4, jLongValue3, i2 == 1 ? c07944.f3648 : randomAccessFile.length())) {
                                return null;
                            }
                            i5 = unsignedShort2;
                            arrayList.add(new C1771(jLongValue4, jLongValue3));
                        }
                        i17 = i3 + 1;
                        randomAccessFile2 = randomAccessFile;
                        c07944 = c07942;
                        unsignedShort2 = i5;
                        i7 = i4;
                    }
                    int i19 = i7;
                    if (z) {
                        return arrayList;
                    }
                    i12++;
                    randomAccessFile2 = randomAccessFile;
                    c07943 = c0794;
                    c07944 = c07942;
                    i8 = i16;
                    i11 = i15;
                    i7 = i19;
                    i10 = 2;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static C2792 m2267(RandomAccessFile randomAccessFile, C0794 c0794) throws IOException {
        int i;
        Integer numM2270;
        if (!m2262(c0794.f3652, 4L, c0794.f3648)) {
            return null;
        }
        randomAccessFile.seek(c0794.f3652);
        int unsignedByte = randomAccessFile.readUnsignedByte();
        randomAccessFile.skipBytes(3);
        if (unsignedByte == 0) {
            i = 2;
        } else {
            if (unsignedByte != 1) {
                return null;
            }
            i = 4;
        }
        long filePointer = randomAccessFile.getFilePointer();
        if (m2262(filePointer, i, c0794.f3648) && (numM2270 = m2270(randomAccessFile, i)) != null) {
            return new C2792(numM2270.intValue(), filePointer, i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2443 m2268(RandomAccessFile randomAccessFile, C0794 c0794, int i, int i2) throws IOException {
        Object next;
        int i3;
        C2443 c2443;
        Pair pair;
        int i4;
        Pair pair2;
        Object str;
        Object objValueOf;
        Object obj;
        List listM2263 = m2263(randomAccessFile, c0794.f3652, c0794.f3648);
        Iterator it = listM2263.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C0794) next).f3649.equals(AbstractC2328.m4341(-1726881368540014L))) {
                break;
            }
        }
        C0794 c07942 = (C0794) next;
        if (c07942 != null) {
            List listM22632 = m2263(randomAccessFile, c07942.f3652, c07942.f3648);
            if (!listM22632.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listM2263) {
                    if (((C0794) obj2).f3649.equals(AbstractC2328.m4341(-1726902843376494L))) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            LinkedHashSet linkedHashSetM2271 = m2271(randomAccessFile, (C0794) it2.next(), listM22632.size(), i);
                            if (linkedHashSetM2271 == null) {
                                break;
                            }
                            linkedHashSet.addAll(linkedHashSetM2271);
                        } else {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    LinkedHashSet linkedHashSetM22712 = m2271(randomAccessFile, (C0794) it3.next(), listM22632.size(), i2);
                                    if (linkedHashSetM22712 == null) {
                                        break;
                                    }
                                    linkedHashSet2.addAll(linkedHashSetM22712);
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it4 = linkedHashSet.iterator();
                                    while (it4.hasNext()) {
                                        C0794 c07943 = (C0794) AbstractC1595.m3276(((Number) it4.next()).intValue() - 1, listM22632);
                                        if (c07943 == null || !c07943.f3649.equals(AbstractC2328.m4341(-1726924318212974L))) {
                                            c07943 = null;
                                        }
                                        if (c07943 != null) {
                                            arrayList2.add(c07943);
                                        }
                                    }
                                    if (arrayList2.size() == 1) {
                                        C0794 c07944 = (C0794) AbstractC1595.m3266(arrayList2);
                                        if (m2262(c07944.f3652, 23L, c07944.f3648)) {
                                            long j = c07944.f3648;
                                            long j2 = c07944.f3652;
                                            long j3 = j - j2;
                                            if (23 > j3 || j3 >= 262145) {
                                                i3 = 1;
                                                c2443 = null;
                                                pair = c2443;
                                            } else {
                                                int i5 = (int) j3;
                                                byte[] bArr = new byte[i5];
                                                randomAccessFile.seek(j2);
                                                randomAccessFile.readFully(bArr);
                                                if (bArr[0] == 1) {
                                                    int i6 = bArr[16] & 3;
                                                    int i7 = bArr[17] & 7;
                                                    int i8 = bArr[18] & 7;
                                                    if (i6 == 1 && i7 == 0 && i8 == 0) {
                                                        int i9 = (bArr[21] & 3) + 1;
                                                        int i10 = bArr[22] & 255;
                                                        c2443 = null;
                                                        Pair[] pairArr = {new Pair(32, new ArrayList()), new Pair(33, new ArrayList()), new Pair(34, new ArrayList())};
                                                        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2366.m4382(3));
                                                        AbstractC2366.m4384(linkedHashMap, pairArr);
                                                        int i11 = 23;
                                                        i3 = 1;
                                                        int i12 = 0;
                                                        int i13 = 0;
                                                        int i14 = 0;
                                                        loop8: while (true) {
                                                            if (i12 >= i10) {
                                                                int i15 = i9;
                                                                if (i11 != i5) {
                                                                    break;
                                                                }
                                                                Collection collectionValues = linkedHashMap.values();
                                                                if (collectionValues == null || !collectionValues.isEmpty()) {
                                                                    Iterator it5 = collectionValues.iterator();
                                                                    while (it5.hasNext()) {
                                                                        if (((List) it5.next()).isEmpty()) {
                                                                        }
                                                                    }
                                                                }
                                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i14);
                                                                for (int i16 = 32; i16 < 35; i16++) {
                                                                    for (byte[] bArr2 : (List) AbstractC2366.m4386(linkedHashMap, Integer.valueOf(i16))) {
                                                                        byteArrayOutputStream.write(new byte[]{0, 0, 0, 1});
                                                                        byteArrayOutputStream.write(bArr2);
                                                                    }
                                                                }
                                                                pair = new Pair(Integer.valueOf(i15), byteArrayOutputStream.toByteArray());
                                                            } else {
                                                                if (i11 > i5 - 3) {
                                                                    break;
                                                                }
                                                                byte b = bArr[i11];
                                                                if ((b & 64) != 0) {
                                                                    break;
                                                                }
                                                                int i17 = b & 63;
                                                                int i18 = ((bArr[i11 + 1] & 255) << 8) | (bArr[i11 + 2] & 255);
                                                                i11 += 3;
                                                                if (i13 > 256 - i18) {
                                                                    break;
                                                                }
                                                                i13 += i18;
                                                                int i19 = 0;
                                                                while (i19 < i18) {
                                                                    int i20 = i9;
                                                                    if (i11 > i5 - 2) {
                                                                        break loop8;
                                                                    }
                                                                    int i21 = i11;
                                                                    int i22 = (bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8);
                                                                    int i23 = i21 + 2;
                                                                    int i24 = i12;
                                                                    if (i22 < 2 || i23 > i5 - i22 || ((bArr[i23] >>> 1) & 63) != i17) {
                                                                        break loop8;
                                                                    }
                                                                    if (32 > i17 || i17 >= 35) {
                                                                        i4 = i22;
                                                                    } else {
                                                                        if (i14 > 262140 - i22) {
                                                                            break loop8;
                                                                        }
                                                                        i4 = i22;
                                                                        ((List) AbstractC2366.m4386(linkedHashMap, Integer.valueOf(i17))).add(AbstractC2070.m3946(bArr, i23, i23 + i4));
                                                                        i14 = i22 + 4 + i14;
                                                                    }
                                                                    i11 = i23 + i4;
                                                                    i19++;
                                                                    i9 = i20;
                                                                    i12 = i24;
                                                                }
                                                                i12++;
                                                            }
                                                        }
                                                    }
                                                    pair = c2443;
                                                }
                                            }
                                        } else {
                                            i3 = 1;
                                            c2443 = null;
                                            pair = 0;
                                        }
                                        if (pair == 0) {
                                            return c2443;
                                        }
                                        LinkedHashSet linkedHashSet3 = new LinkedHashSet(AbstractC2366.m4382(linkedHashSet.size() + linkedHashSet2.size()));
                                        linkedHashSet3.addAll(linkedHashSet);
                                        AbstractC1432.m2928(linkedHashSet2, linkedHashSet3);
                                        if (!linkedHashSet3.isEmpty()) {
                                            Iterator it6 = linkedHashSet3.iterator();
                                            while (it6.hasNext()) {
                                                int iIntValue = ((Number) it6.next()).intValue();
                                                Set setM441 = AbstractC0068.m441(AbstractC2328.m4341(-1726945793049454L), AbstractC2328.m4341(-1726967267885934L), AbstractC2328.m4341(-1726988742722414L));
                                                C0794 c07945 = (C0794) AbstractC1595.m3276(iIntValue - 1, listM22632);
                                                if (AbstractC1595.m3286(setM441, c07945 != null ? c07945.f3649 : c2443)) {
                                                    return c2443;
                                                }
                                            }
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it7 = linkedHashSet.iterator();
                                        while (it7.hasNext()) {
                                            C0794 c07946 = (C0794) AbstractC1595.m3276(((Number) it7.next()).intValue() - 1, listM22632);
                                            if (c07946 != null) {
                                                boolean zEquals = c07946.f3649.equals(AbstractC2328.m4341(-1727010217558894L));
                                                obj = c07946;
                                                if (!zEquals) {
                                                    obj = c2443;
                                                }
                                            }
                                            if (obj != null) {
                                                arrayList3.add(obj);
                                            }
                                        }
                                        if (arrayList3.size() != i3) {
                                            return c2443;
                                        }
                                        C0794 c07947 = (C0794) AbstractC1595.m3266(arrayList3);
                                        if (m2262(c07947.f3652, 12L, c07947.f3648)) {
                                            randomAccessFile.seek(c07947.f3652);
                                            if (randomAccessFile.readInt() == 0) {
                                                long j4 = ((long) randomAccessFile.readInt()) & 4294967295L;
                                                Object objValueOf2 = (1 > j4 || j4 >= 2147483648L) ? c2443 : Integer.valueOf((int) j4);
                                                if (objValueOf2 != null) {
                                                    long j5 = ((long) randomAccessFile.readInt()) & 4294967295L;
                                                    Object objValueOf3 = (1 > j5 || j5 >= 2147483648L) ? c2443 : Integer.valueOf((int) j5);
                                                    if (objValueOf3 != null) {
                                                        pair2 = new Pair(objValueOf2, objValueOf3);
                                                    }
                                                }
                                            }
                                        } else {
                                            pair2 = c2443;
                                        }
                                        if (pair2 == 0) {
                                            return c2443;
                                        }
                                        AbstractC2328.m4341(-1727031692395374L);
                                        Boolean bool = c2443;
                                        for (Object obj3 : linkedHashSet) {
                                            AbstractC2328.m4341(-1727091821937518L);
                                            C0794 c07948 = (C0794) AbstractC1595.m3276(((Number) obj3).intValue() - 1, listM22632);
                                            if (c07948 == null) {
                                                return c2443;
                                            }
                                            long j6 = c07948.f3652;
                                            if (c07948.f3649.equals(AbstractC2328.m4341(-1727134771610478L))) {
                                                if (m2262(c07948.f3652, 4L, c07948.f3648)) {
                                                    randomAccessFile.seek(j6);
                                                    byte[] bArr3 = new byte[4];
                                                    randomAccessFile.readFully(bArr3);
                                                    str = new String(bArr3, AbstractC0347.f1811);
                                                } else {
                                                    str = c2443;
                                                }
                                                if (str == null) {
                                                    return c2443;
                                                }
                                                if (str.equals(AbstractC2328.m4341(-1727156246446958L))) {
                                                    if (m2262(c07948.f3652, 11L, c07948.f3648)) {
                                                        randomAccessFile.seek(j6);
                                                        byte[] bArr4 = new byte[4];
                                                        if (randomAccessFile.read(bArr4) == 4 && new String(bArr4, AbstractC0347.f1811).equals(AbstractC2328.m4341(-1727177721283438L))) {
                                                            randomAccessFile.skipBytes(6);
                                                            objValueOf = Boolean.valueOf((randomAccessFile.readUnsignedByte() & 128) != 0);
                                                        } else {
                                                            objValueOf = c2443;
                                                        }
                                                    } else {
                                                        objValueOf = c2443;
                                                    }
                                                    if (objValueOf == null) {
                                                        return c2443;
                                                    }
                                                    if (bool != 0 && !bool.equals(objValueOf)) {
                                                        return c2443;
                                                    }
                                                    bool = objValueOf;
                                                }
                                            }
                                        }
                                        return new C2443(((Number) pair2.getFirst()).intValue(), ((Number) pair2.getSecond()).intValue(), ((Number) pair.getFirst()).intValue(), (byte[]) pair.getSecond(), bool);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static boolean m2269(RandomAccessFile randomAccessFile, C0794 c0794) throws IOException {
        Object obj;
        Object next;
        Iterator it = m2263(randomAccessFile, c0794.f3652, c0794.f3648).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C0794) next).f3649.equals(AbstractC2328.m4341(-1727375289779054L))) {
                break;
            }
        }
        C0794 c07942 = (C0794) next;
        if (c07942 == null) {
            return false;
        }
        Iterator it2 = m2263(randomAccessFile, c07942.f3652, c07942.f3648).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((C0794) next2).f3649.equals(AbstractC2328.m4341(-1727396764615534L))) {
                obj = next2;
                break;
            }
        }
        C0794 c07943 = (C0794) obj;
        if (c07943 == null) {
            return false;
        }
        randomAccessFile.seek(c07943.f3652 + 8);
        byte[] bArr = new byte[4];
        if (randomAccessFile.read(bArr) < 4) {
            return false;
        }
        String str = new String(bArr, AbstractC0347.f1811);
        return str.equals(AbstractC2328.m4341(-1727418239452014L)) || str.equals(AbstractC2328.m4341(-1727439714288494L));
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static Integer m2270(RandomAccessFile randomAccessFile, int i) {
        long unsignedShort;
        if (i == 2) {
            unsignedShort = randomAccessFile.readUnsignedShort();
        } else {
            if (i != 4) {
                return null;
            }
            unsignedShort = ((long) randomAccessFile.readInt()) & 4294967295L;
        }
        if (1 > unsignedShort || unsignedShort >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) unsignedShort);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static LinkedHashSet m2271(RandomAccessFile randomAccessFile, C0794 c0794, int i, int i2) throws IOException {
        int i3;
        Integer numM2270;
        if (!m2262(c0794.f3652, 8L, c0794.f3648)) {
            return null;
        }
        randomAccessFile.seek(c0794.f3652);
        int unsignedByte = randomAccessFile.readUnsignedByte();
        int unsignedByte2 = (randomAccessFile.readUnsignedByte() << 16) | (randomAccessFile.readUnsignedByte() << 8) | randomAccessFile.readUnsignedByte();
        if (unsignedByte == 0) {
            i3 = 2;
        } else {
            if (unsignedByte != 1) {
                return null;
            }
            i3 = 4;
        }
        int i4 = (unsignedByte2 & 1) != 0 ? 2 : 1;
        int i5 = i4 == 2 ? 32767 : 127;
        long j = ((long) randomAccessFile.readInt()) & 4294967295L;
        if (j > 100000) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i6 = (int) j;
        for (int i7 = 0; i7 < i6; i7++) {
            if (!m2262(randomAccessFile.getFilePointer(), ((long) i3) + 1, c0794.f3648) || (numM2270 = m2270(randomAccessFile, i3)) == null) {
                return null;
            }
            int iIntValue = numM2270.intValue();
            int unsignedByte3 = randomAccessFile.readUnsignedByte();
            if (!m2262(randomAccessFile.getFilePointer(), ((long) unsignedByte3) * ((long) i4), c0794.f3648)) {
                return null;
            }
            for (int i8 = 0; i8 < unsignedByte3; i8++) {
                int unsignedShort = (i4 == 2 ? randomAccessFile.readUnsignedShort() : randomAccessFile.readUnsignedByte()) & i5;
                if (unsignedShort > i) {
                    return null;
                }
                if (iIntValue == i2 && unsignedShort != 0) {
                    linkedHashSet.add(Integer.valueOf(unsignedShort));
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2272(RandomAccessFile randomAccessFile, C0794 c0794, int i) throws IOException {
        long unsignedShort;
        int i2;
        Integer numM2270;
        if (m2262(c0794.f3652, 6L, c0794.f3648)) {
            randomAccessFile.seek(c0794.f3652);
            int unsignedByte = randomAccessFile.readUnsignedByte();
            if (((randomAccessFile.readUnsignedByte() << 16) | (randomAccessFile.readUnsignedByte() << 8) | randomAccessFile.readUnsignedByte()) == 0) {
                if (unsignedByte == 0) {
                    unsignedShort = randomAccessFile.readUnsignedShort();
                } else if (unsignedByte == 1 && m2262(randomAccessFile.getFilePointer(), 4L, c0794.f3648)) {
                    unsignedShort = ((long) randomAccessFile.readInt()) & 4294967295L;
                }
                if (unsignedShort <= 100000) {
                    List<C0794> listM2263 = m2263(randomAccessFile, randomAccessFile.getFilePointer(), c0794.f3648);
                    if (listM2263.size() == ((int) unsignedShort)) {
                        if (!listM2263.isEmpty()) {
                            Iterator it = listM2263.iterator();
                            while (it.hasNext()) {
                                if (!((C0794) it.next()).f3649.equals(AbstractC2328.m4341(-1726731044684654L))) {
                                    break;
                                }
                            }
                            boolean z = false;
                            while (r1.hasNext()) {
                            }
                            return z;
                        }
                        boolean z2 = false;
                        for (C0794 c07942 : listM2263) {
                            if (m2262(c07942.f3652, 4L, c07942.f3648)) {
                                randomAccessFile.seek(c07942.f3652);
                                int unsignedByte2 = randomAccessFile.readUnsignedByte();
                                if ((((randomAccessFile.readUnsignedByte() << 16) | (randomAccessFile.readUnsignedByte() << 8) | randomAccessFile.readUnsignedByte()) & 16777214) == 0) {
                                    if (unsignedByte2 == 0 || unsignedByte2 == 1 || unsignedByte2 == 2) {
                                        i2 = 2;
                                    } else if (unsignedByte2 == 3) {
                                        i2 = 4;
                                    }
                                    if (m2262(randomAccessFile.getFilePointer(), ((long) i2) + 2, c07942.f3648) && (numM2270 = m2270(randomAccessFile, i2)) != null) {
                                        int iIntValue = numM2270.intValue();
                                        int unsignedShort2 = randomAccessFile.readUnsignedShort();
                                        if (iIntValue == i) {
                                            if (2 <= unsignedByte2 && unsignedByte2 < 4 && m2262(randomAccessFile.getFilePointer(), 4L, c07942.f3648)) {
                                                byte[] bArr = new byte[4];
                                                randomAccessFile.readFully(bArr);
                                                if (!z2 && unsignedShort2 == 0 && new String(bArr, AbstractC0347.f1811).equals(AbstractC2328.m4341(-1726752519521134L))) {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return z2;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [yyds.ᛸᲀᛶᲈ] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2347 m2273() throws IOException {
        C2347 c2347;
        Object next;
        Object next2;
        Object next3;
        int iIntValue;
        int iIntValue2;
        Object next4;
        Object next5;
        long j;
        Object next6;
        Object next7;
        Object next8;
        Object next9;
        File file = new File(this.f4884);
        if (!file.exists()) {
            return null;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, AbstractC2328.m4341(-1726267188216686L));
        try {
            Iterator it = m2263(randomAccessFile, 0L, randomAccessFile.length()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C0794) next).f3649.equals(AbstractC2328.m4341(-1726275778151278L))) {
                    break;
                }
            }
            C0794 c0794 = (C0794) next;
            if (c0794 == null) {
                return null;
            }
            List listM2263 = m2263(randomAccessFile, c0794.f3652, c0794.f3648);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM2263) {
                if (((C0794) obj).f3649.equals(AbstractC2328.m4341(-1726297252987758L))) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (m2269(randomAccessFile, (C0794) next2)) {
                    break;
                }
            }
            C0794 c07942 = (C0794) next2;
            if (c07942 == null) {
                c07942 = (C0794) AbstractC1595.m3280(arrayList);
            }
            List listM22632 = m2263(randomAccessFile, c07942.f3652, c07942.f3648);
            Iterator it3 = listM22632.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (((C0794) next3).f3649.equals(AbstractC2328.m4341(-1726318727824238L))) {
                    break;
                }
            }
            C0794 c07943 = (C0794) next3;
            if (c07943 != null) {
                Pair pairM2258 = m2258(randomAccessFile, c07943);
                iIntValue2 = ((Number) pairM2258.getFirst()).intValue();
                iIntValue = ((Number) pairM2258.getSecond()).intValue();
            } else {
                iIntValue = 0;
                iIntValue2 = 0;
            }
            Iterator it4 = listM22632.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it4.next();
                if (((C0794) next4).f3649.equals(AbstractC2328.m4341(-1726340202660718L))) {
                    break;
                }
            }
            C0794 c07944 = (C0794) next4;
            if (c07944 == null) {
                return null;
            }
            List listM22633 = m2263(randomAccessFile, c07944.f3652, c07944.f3648);
            Iterator it5 = listM22633.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it5.next();
                if (((C0794) next5).f3649.equals(AbstractC2328.m4341(-1726361677497198L))) {
                    break;
                }
            }
            C0794 c07945 = (C0794) next5;
            if (c07945 != null) {
                randomAccessFile.seek(c07945.f3652);
                int i = randomAccessFile.readByte() & 255;
                randomAccessFile.skipBytes(3);
                if (i == 0) {
                    randomAccessFile.skipBytes(8);
                } else {
                    randomAccessFile.skipBytes(16);
                }
                j = ((long) randomAccessFile.readInt()) & 4294967295L;
            } else {
                j = 1000;
            }
            Iterator it6 = listM22633.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next6 = null;
                    break;
                }
                next6 = it6.next();
                if (((C0794) next6).f3649.equals(AbstractC2328.m4341(-1726383152333678L))) {
                    break;
                }
            }
            C0794 c07946 = (C0794) next6;
            if (c07946 == null) {
                return null;
            }
            c2347 = null;
            try {
                Iterator it7 = m2263(randomAccessFile, c07946.f3652, c07946.f3648).iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        next7 = null;
                        break;
                    }
                    next7 = it7.next();
                    if (((C0794) next7).f3649.equals(AbstractC2328.m4341(-1726404627170158L))) {
                        break;
                    }
                }
                C0794 c07947 = (C0794) next7;
                if (c07947 == null) {
                    return null;
                }
                List listM22634 = m2263(randomAccessFile, c07947.f3652, c07947.f3648);
                Iterator it8 = listM22634.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next8 = null;
                        break;
                    }
                    next8 = it8.next();
                    if (((C0794) next8).f3649.equals(AbstractC2328.m4341(-1726426102006638L))) {
                        break;
                    }
                }
                C0794 c07948 = (C0794) next8;
                if (c07948 == null) {
                    return null;
                }
                randomAccessFile.seek(c07948.f3652);
                randomAccessFile.skipBytes(4);
                randomAccessFile.readInt();
                int i2 = randomAccessFile.readInt();
                if (i2 > 0 && i2 <= 100000) {
                    Iterator it9 = listM22634.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next9 = null;
                            break;
                        }
                        next9 = it9.next();
                        if (((C0794) next9).f3649.equals(AbstractC2328.m4341(-1726447576843118L))) {
                            break;
                        }
                    }
                    C0794 c07949 = (C0794) next9;
                    ?? arrayList2 = C1860.f9345;
                    if (c07949 != null) {
                        randomAccessFile.seek(c07949.f3652);
                        randomAccessFile.skipBytes(4);
                        int i3 = randomAccessFile.readInt();
                        if (i3 >= 0 && i3 <= 100000) {
                            arrayList2 = new ArrayList();
                            for (int i4 = 0; i4 < i3; i4++) {
                                arrayList2.add(new Pair(Integer.valueOf(randomAccessFile.readInt()), Integer.valueOf(randomAccessFile.readInt())));
                            }
                        }
                    }
                    int[] iArr = new int[i2];
                    if (j > 0) {
                        int i5 = 0;
                        loop11: for (Pair pair : arrayList2) {
                            int iIntValue3 = ((Number) pair.component1()).intValue();
                            int iIntValue4 = ((Number) pair.component2()).intValue();
                            if (iIntValue3 > 0) {
                                int i6 = (int) ((((long) iIntValue4) * 1000) / j);
                                for (int i7 = 0; i7 < iIntValue3; i7++) {
                                    if (i5 >= i2) {
                                        break loop11;
                                    }
                                    iArr[i5] = i6;
                                    i5++;
                                }
                            }
                        }
                    }
                    AbstractC2328.m4341(-1729531363361646L);
                    C2347 c23472 = new C2347();
                    c23472.f11526 = i2;
                    c23472.f11527 = iArr;
                    c23472.f11528 = iIntValue2;
                    c23472.f11529 = iIntValue;
                    return c23472;
                }
                return null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            c2347 = null;
        }
        try {
            th.printStackTrace();
            return c2347;
        } finally {
            randomAccessFile.close();
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0343 m2274() {
        File file;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        try {
            file = new File(this.f4884);
        } catch (Throwable unused) {
        }
        if (file.isFile()) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, AbstractC2328.m4341(-1726469051679598L));
            try {
                Iterator it = m2263(randomAccessFile, 0L, randomAccessFile.length()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C0794) next).f3649.equals(AbstractC2328.m4341(-1726477641614190L))) {
                        break;
                    }
                }
                C0794 c0794 = (C0794) next;
                if (c0794 == null) {
                    randomAccessFile.close();
                    return null;
                }
                if (!m2262(c0794.f3652, 4L, c0794.f3648)) {
                    randomAccessFile.close();
                    return null;
                }
                List listM2263 = m2263(randomAccessFile, c0794.f3652 + 4, c0794.f3648);
                Iterator it2 = listM2263.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (((C0794) next2).f3649.equals(AbstractC2328.m4341(-1726499116450670L))) {
                        break;
                    }
                }
                C0794 c07942 = (C0794) next2;
                if (c07942 == null) {
                    randomAccessFile.close();
                    return null;
                }
                C2792 c2792M2267 = m2267(randomAccessFile, c07942);
                Integer numValueOf = c2792M2267 != null ? Integer.valueOf(c2792M2267.f13651) : null;
                if (numValueOf == null) {
                    randomAccessFile.close();
                    return null;
                }
                int iIntValue = numValueOf.intValue();
                Iterator it3 = listM2263.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (((C0794) next3).f3649.equals(AbstractC2328.m4341(-1726520591287150L))) {
                        break;
                    }
                }
                C0794 c07943 = (C0794) next3;
                if (c07943 == null) {
                    randomAccessFile.close();
                    return null;
                }
                LinkedHashSet linkedHashSetM2261 = m2261(randomAccessFile, c07943, iIntValue);
                if (linkedHashSetM2261 == null) {
                    randomAccessFile.close();
                    return null;
                }
                if (linkedHashSetM2261.isEmpty()) {
                    randomAccessFile.close();
                    return null;
                }
                Iterator it4 = listM2263.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                    if (((C0794) next4).f3649.equals(AbstractC2328.m4341(-1726542066123630L))) {
                        break;
                    }
                }
                C0794 c07944 = (C0794) next4;
                if (c07944 == null) {
                    randomAccessFile.close();
                    return null;
                }
                C0206 c0206M2259 = m2259(randomAccessFile, c07944);
                if (c0206M2259 == null) {
                    randomAccessFile.close();
                    return null;
                }
                Iterator it5 = linkedHashSetM2261.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it5.next();
                    if (c0206M2259.f1185.contains(Integer.valueOf(((Number) next5).intValue()))) {
                        break;
                    }
                }
                Integer num = (Integer) next5;
                if (num == null) {
                    randomAccessFile.close();
                    return null;
                }
                int iIntValue2 = num.intValue();
                C0343 c0343 = new C0343(iIntValue, iIntValue2, !c0206M2259.f1186.contains(num) && AbstractC1544.m3188(m2264(randomAccessFile, c07943, iIntValue, iIntValue2), Boolean.FALSE));
                randomAccessFile.close();
                return c0343;
            } finally {
            }
        }
        return null;
    }
}
