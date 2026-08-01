package org.apache.commons.compress.archivers.zip;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5588 {
    byte[] getCentralDirectoryData();

    ZipShort getCentralDirectoryLength();

    ZipShort getHeaderId();

    byte[] getLocalFileDataData();

    ZipShort getLocalFileDataLength();

    void parseFromCentralDirectoryData(byte[] bArr, int i, int i2);

    void parseFromLocalFileData(byte[] bArr, int i, int i2);
}
