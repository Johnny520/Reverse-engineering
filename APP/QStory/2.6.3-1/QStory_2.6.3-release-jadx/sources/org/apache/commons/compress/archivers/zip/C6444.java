package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0900;
import java.util.zip.ZipException;
import p025.AbstractC7012;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6444 implements InterfaceC6442 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f15814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6444 f15812 = new C6444(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C6444 f15813 = new C6444(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C6444 f15811 = new C6444(2);

    public C6444(int i) {
        this.f15814 = i;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6442
    public final InterfaceC6419 onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) throws ZipException {
        int i4 = this.f15814;
        if (i4 == 0) {
            StringBuilder sbM709 = AbstractC0900.m709(i, i3, "Bad extra field starting at ", ".  Block length of ", " bytes exceeds remaining data of ");
            sbM709.append(i2 - 4);
            sbM709.append(" bytes.");
            throw new ZipException(sbM709.toString());
        }
        if (i4 == 1) {
            return null;
        }
        if (i4 != 2) {
            throw new ZipException(AbstractC7012.m12147(i4, "Unknown UnparseableExtraField key: "));
        }
        C6439 c6439 = new C6439();
        if (z) {
            c6439.parseFromLocalFileData(bArr, i, i2);
            return c6439;
        }
        c6439.parseFromCentralDirectoryData(bArr, i, i2);
        return c6439;
    }
}
