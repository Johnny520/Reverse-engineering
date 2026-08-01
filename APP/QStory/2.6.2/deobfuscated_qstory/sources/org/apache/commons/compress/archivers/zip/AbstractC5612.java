package org.apache.commons.compress.archivers.zip;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5612 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC5588[] f15464;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f15465;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f15465 = concurrentHashMap;
        concurrentHashMap.put(C5598.f15419, new C5594(0));
        concurrentHashMap.put(X5455_ExtendedTimestamp.HEADER_ID, new C5594(9));
        concurrentHashMap.put(X7875_NewUnix.HEADER_ID, new C5594(10));
        concurrentHashMap.put(C5617.f15483, new C5594(11));
        concurrentHashMap.put(C5610.f15463, new C5594(12));
        concurrentHashMap.put(C5606.f15452, new C5594(13));
        concurrentHashMap.put(C5586.f15372, new C5594(1));
        concurrentHashMap.put(C5600.f15430, new C5594(2));
        concurrentHashMap.put(C5604.f15450, new C5594(3));
        concurrentHashMap.put(C5605.f15451, new C5594(4));
        concurrentHashMap.put(C5602.f15447, new C5594(5));
        concurrentHashMap.put(C5603.f15448, new C5594(6));
        concurrentHashMap.put(C5587.f15377, new C5594(7));
        concurrentHashMap.put(C5607.f15453, new C5594(8));
        f15464 = new InterfaceC5588[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC5588[] m10917(byte[] bArr, ZipArchiveEntry$ExtraFieldParsingMode zipArchiveEntry$ExtraFieldParsingMode) throws ZipException {
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
                InterfaceC5588 interfaceC5588OnUnparseableExtraField = zipArchiveEntry$ExtraFieldParsingMode.onUnparseableExtraField(bArr, i, length - i, true, value);
                if (interfaceC5588OnUnparseableExtraField != null) {
                    arrayList.add(interfaceC5588OnUnparseableExtraField);
                }
            } else {
                byte[] bArr2 = bArr;
                ZipArchiveEntry$ExtraFieldParsingMode zipArchiveEntry$ExtraFieldParsingMode2 = zipArchiveEntry$ExtraFieldParsingMode;
                try {
                    InterfaceC5588 interfaceC5588CreateExtraField = zipArchiveEntry$ExtraFieldParsingMode2.createExtraField(zipShort);
                    Objects.requireNonNull(interfaceC5588CreateExtraField, "createExtraField must not return null");
                    InterfaceC5588 interfaceC5588Fill = zipArchiveEntry$ExtraFieldParsingMode2.fill(interfaceC5588CreateExtraField, bArr2, i2, value, true);
                    Objects.requireNonNull(interfaceC5588Fill, "fill must not return null");
                    arrayList.add(interfaceC5588Fill);
                    i += value + 4;
                    zipArchiveEntry$ExtraFieldParsingMode = zipArchiveEntry$ExtraFieldParsingMode2;
                    bArr = bArr2;
                } catch (IllegalAccessException | InstantiationException e) {
                    String message = e.getMessage();
                    int i3 = AbstractC5580.f15357;
                    throw ((ZipException) new ZipException(message).initCause(e));
                }
            }
        }
        return (InterfaceC5588[]) arrayList.toArray(f15464);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m10918(InterfaceC5588 interfaceC5588, byte[] bArr, int i, int i2, boolean z) {
        try {
            if (z) {
                interfaceC5588.parseFromLocalFileData(bArr, i, i2);
            } else {
                interfaceC5588.parseFromCentralDirectoryData(bArr, i, i2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            String str = "Failed to parse corrupt ZIP extra field of type " + Integer.toHexString(interfaceC5588.getHeaderId().getValue());
            int i3 = AbstractC5580.f15357;
            throw ((ZipException) new ZipException(str).initCause(e));
        }
    }
}
