package org.apache.commons.compress.archivers.zip;

import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6424 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final CRC32 f15747;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f15748;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f15749;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f15750;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f15751;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6415 f15752;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InputStream f15753;

    public C6424() {
        C6415 c6415 = new C6415("");
        c6415.f15716 = -1;
        c6415.f15714 = -1L;
        c6415.f15715 = 0;
        c6415.f15713 = new C6447();
        c6415.f15710 = -1L;
        c6415.f15711 = -1L;
        ZipArchiveEntry$NameSource zipArchiveEntry$NameSource = ZipArchiveEntry$NameSource.NAME;
        ZipArchiveEntry$CommentSource zipArchiveEntry$CommentSource = ZipArchiveEntry$CommentSource.COMMENT;
        c6415.f15706 = -1L;
        c6415.m11512("");
        this.f15752 = c6415;
        this.f15747 = new CRC32();
    }
}
