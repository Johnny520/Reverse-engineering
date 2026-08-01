package org.apache.commons.compress.archivers.zip;

import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5594 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final CRC32 f15402;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f15403;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f15404;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f15405;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f15406;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5585 f15407;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InputStream f15408;

    public C5594() {
        C5585 c5585 = new C5585("");
        c5585.f15371 = -1;
        c5585.f15369 = -1L;
        c5585.f15370 = 0;
        c5585.f15368 = new C5617();
        c5585.f15365 = -1L;
        c5585.f15366 = -1L;
        ZipArchiveEntry$NameSource zipArchiveEntry$NameSource = ZipArchiveEntry$NameSource.NAME;
        ZipArchiveEntry$CommentSource zipArchiveEntry$CommentSource = ZipArchiveEntry$CommentSource.COMMENT;
        c5585.f15361 = -1L;
        c5585.m10953("");
        this.f15407 = c5585;
        this.f15402 = new CRC32();
    }
}
