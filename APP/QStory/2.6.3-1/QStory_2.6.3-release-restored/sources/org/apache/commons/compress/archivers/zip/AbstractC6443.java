package org.apache.commons.compress.archivers.zip;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6443 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC6419[] f15809;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f15810;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f15810 = concurrentHashMap;
        concurrentHashMap.put(C6429.f15764, new C6425(0));
        concurrentHashMap.put(X5455_ExtendedTimestamp.HEADER_ID, new C6425(9));
        concurrentHashMap.put(X7875_NewUnix.HEADER_ID, new C6425(10));
        concurrentHashMap.put(C6448.f15828, new C6425(11));
        concurrentHashMap.put(C6441.f15808, new C6425(12));
        concurrentHashMap.put(C6437.f15797, new C6425(13));
        concurrentHashMap.put(C6417.f15717, new C6425(1));
        concurrentHashMap.put(C6431.f15775, new C6425(2));
        concurrentHashMap.put(C6435.f15795, new C6425(3));
        concurrentHashMap.put(C6436.f15796, new C6425(4));
        concurrentHashMap.put(C6433.f15792, new C6425(5));
        concurrentHashMap.put(C6434.f15793, new C6425(6));
        concurrentHashMap.put(C6418.f15722, new C6425(7));
        concurrentHashMap.put(C6438.f15798, new C6425(8));
        f15809 = new InterfaceC6419[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC6419[] m11533(byte[] bArr, ZipArchiveEntry$ExtraFieldParsingMode zipArchiveEntry$ExtraFieldParsingMode) throws ZipException {
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
                InterfaceC6419 interfaceC6419OnUnparseableExtraField = zipArchiveEntry$ExtraFieldParsingMode.onUnparseableExtraField(bArr, i, length - i, true, value);
                if (interfaceC6419OnUnparseableExtraField != null) {
                    arrayList.add(interfaceC6419OnUnparseableExtraField);
                }
            } else {
                byte[] bArr2 = bArr;
                ZipArchiveEntry$ExtraFieldParsingMode zipArchiveEntry$ExtraFieldParsingMode2 = zipArchiveEntry$ExtraFieldParsingMode;
                try {
                    InterfaceC6419 interfaceC6419CreateExtraField = zipArchiveEntry$ExtraFieldParsingMode2.createExtraField(zipShort);
                    Objects.requireNonNull(interfaceC6419CreateExtraField, "createExtraField must not return null");
                    InterfaceC6419 interfaceC6419Fill = zipArchiveEntry$ExtraFieldParsingMode2.fill(interfaceC6419CreateExtraField, bArr2, i2, value, true);
                    Objects.requireNonNull(interfaceC6419Fill, "fill must not return null");
                    arrayList.add(interfaceC6419Fill);
                    i += value + 4;
                    zipArchiveEntry$ExtraFieldParsingMode = zipArchiveEntry$ExtraFieldParsingMode2;
                    bArr = bArr2;
                } catch (IllegalAccessException | InstantiationException e) {
                    String message = e.getMessage();
                    int i3 = AbstractC6411.f15702;
                    throw ((ZipException) new ZipException(message).initCause(e));
                }
            }
        }
        return (InterfaceC6419[]) arrayList.toArray(f15809);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11534(InterfaceC6419 interfaceC6419, byte[] bArr, int i, int i2, boolean z) {
        try {
            if (z) {
                interfaceC6419.parseFromLocalFileData(bArr, i, i2);
            } else {
                interfaceC6419.parseFromCentralDirectoryData(bArr, i, i2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            String str = "Failed to parse corrupt ZIP extra field of type " + Integer.toHexString(interfaceC6419.getHeaderId().getValue());
            int i3 = AbstractC6411.f15702;
            throw ((ZipException) new ZipException(str).initCause(e));
        }
    }
}
