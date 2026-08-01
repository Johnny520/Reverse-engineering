package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0053;
import java.util.zip.ZipException;
import p007.AbstractC6136;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5613 implements InterfaceC5611 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f15469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5613 f15467 = new C5613(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5613 f15468 = new C5613(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5613 f15466 = new C5613(2);

    public C5613(int i) {
        this.f15469 = i;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5611
    public final InterfaceC5588 onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) throws ZipException {
        int i4 = this.f15469;
        if (i4 == 0) {
            StringBuilder sbM151 = AbstractC0053.m151(i, i3, "Bad extra field starting at ", ".  Block length of ", " bytes exceeds remaining data of ");
            sbM151.append(i2 - 4);
            sbM151.append(" bytes.");
            throw new ZipException(sbM151.toString());
        }
        if (i4 == 1) {
            return null;
        }
        if (i4 != 2) {
            throw new ZipException(AbstractC6136.m11556(i4, "Unknown UnparseableExtraField key: "));
        }
        C5608 c5608 = new C5608();
        if (z) {
            c5608.parseFromLocalFileData(bArr, i, i2);
            return c5608;
        }
        c5608.parseFromCentralDirectoryData(bArr, i, i2);
        return c5608;
    }
}
