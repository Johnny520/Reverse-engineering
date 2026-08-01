package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;
import p376.AbstractC8977;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5617 implements InterfaceC5588 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final ZipShort f15483 = new ZipShort(51966);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ZipShort f15482 = new ZipShort(0);

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final byte[] getCentralDirectoryData() {
        return AbstractC8977.f25219;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final ZipShort getCentralDirectoryLength() {
        return f15482;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final ZipShort getHeaderId() {
        return f15483;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final byte[] getLocalFileDataData() {
        return AbstractC8977.f25219;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final ZipShort getLocalFileDataLength() {
        return f15482;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }
}
