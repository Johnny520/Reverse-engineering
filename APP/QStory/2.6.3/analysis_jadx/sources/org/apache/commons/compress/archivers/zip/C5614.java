package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0053;
import java.util.zip.ZipException;
import p009.AbstractC6183;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5614 implements InterfaceC5612 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f15469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5614 f15467 = new C5614(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5614 f15468 = new C5614(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5614 f15466 = new C5614(2);

    public C5614(int i) {
        this.f15469 = i;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5612
    public final InterfaceC5589 onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) throws ZipException {
        int i4 = this.f15469;
        if (i4 == 0) {
            StringBuilder sbM149 = AbstractC0053.m149(i, i3, "Bad extra field starting at ", ".  Block length of ", " bytes exceeds remaining data of ");
            sbM149.append(i2 - 4);
            sbM149.append(" bytes.");
            throw new ZipException(sbM149.toString());
        }
        if (i4 == 1) {
            return null;
        }
        if (i4 != 2) {
            throw new ZipException(AbstractC6183.m11588(i4, "Unknown UnparseableExtraField key: "));
        }
        C5609 c5609 = new C5609();
        if (z) {
            c5609.parseFromLocalFileData(bArr, i, i2);
            return c5609;
        }
        c5609.parseFromCentralDirectoryData(bArr, i, i2);
        return c5609;
    }
}
