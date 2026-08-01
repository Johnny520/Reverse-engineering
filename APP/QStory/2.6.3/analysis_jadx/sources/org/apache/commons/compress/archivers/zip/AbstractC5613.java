package org.apache.commons.compress.archivers.zip;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5613 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC5589[] f15464;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f15465;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f15465 = concurrentHashMap;
        concurrentHashMap.put(C5599.f15419, new C5595(0));
        concurrentHashMap.put(X5455_ExtendedTimestamp.HEADER_ID, new C5595(9));
        concurrentHashMap.put(X7875_NewUnix.HEADER_ID, new C5595(10));
        concurrentHashMap.put(C5618.f15483, new C5595(11));
        concurrentHashMap.put(C5611.f15463, new C5595(12));
        concurrentHashMap.put(C5607.f15452, new C5595(13));
        concurrentHashMap.put(C5587.f15372, new C5595(1));
        concurrentHashMap.put(C5601.f15430, new C5595(2));
        concurrentHashMap.put(C5605.f15450, new C5595(3));
        concurrentHashMap.put(C5606.f15451, new C5595(4));
        concurrentHashMap.put(C5603.f15447, new C5595(5));
        concurrentHashMap.put(C5604.f15448, new C5595(6));
        concurrentHashMap.put(C5588.f15377, new C5595(7));
        concurrentHashMap.put(C5608.f15453, new C5595(8));
        f15464 = new InterfaceC5589[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC5589[] m10974(byte[] bArr, ZipArchiveEntry$ExtraFieldParsingMode zipArchiveEntry$ExtraFieldParsingMode) throws ZipException {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i > length - 4) {
                break;
            }
            ZipShort zipShort = new ZipShort(bArr, i);
            int value = new ZipShort(bArr, i + 2).getValue();
            int i2 = i + 4;
            if (i2 + value > length) {
                InterfaceC5589 interfaceC5589OnUnparseableExtraField = zipArchiveEntry$ExtraFieldParsingMode.onUnparseableExtraField(bArr, i, length - i, true, value);
                if (interfaceC5589OnUnparseableExtraField != null) {
                    arrayList.add(interfaceC5589OnUnparseableExtraField);
                }
            } else {
                byte[] bArr2 = bArr;
                ZipArchiveEntry$ExtraFieldParsingMode zipArchiveEntry$ExtraFieldParsingMode2 = zipArchiveEntry$ExtraFieldParsingMode;
                try {
                    InterfaceC5589 interfaceC5589CreateExtraField = zipArchiveEntry$ExtraFieldParsingMode2.createExtraField(zipShort);
                    Objects.requireNonNull(interfaceC5589CreateExtraField, "createExtraField must not return null");
                    InterfaceC5589 interfaceC5589Fill = zipArchiveEntry$ExtraFieldParsingMode2.fill(interfaceC5589CreateExtraField, bArr2, i2, value, true);
                    Objects.requireNonNull(interfaceC5589Fill, "fill must not return null");
                    arrayList.add(interfaceC5589Fill);
                    i += value + 4;
                    zipArchiveEntry$ExtraFieldParsingMode = zipArchiveEntry$ExtraFieldParsingMode2;
                    bArr = bArr2;
                } catch (IllegalAccessException | InstantiationException e) {
                    String message = e.getMessage();
                    int i3 = AbstractC5581.f15357;
                    throw ((ZipException) new ZipException(message).initCause(e));
                }
            }
        }
        return (InterfaceC5589[]) arrayList.toArray(f15464);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m10975(InterfaceC5589 interfaceC5589, byte[] bArr, int i, int i2, boolean z) {
        try {
            if (z) {
                interfaceC5589.parseFromLocalFileData(bArr, i, i2);
            } else {
                interfaceC5589.parseFromCentralDirectoryData(bArr, i, i2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            String str = "Failed to parse corrupt ZIP extra field of type " + Integer.toHexString(interfaceC5589.getHeaderId().getValue());
            int i3 = AbstractC5581.f15357;
            throw ((ZipException) new ZipException(str).initCause(e));
        }
    }
}
