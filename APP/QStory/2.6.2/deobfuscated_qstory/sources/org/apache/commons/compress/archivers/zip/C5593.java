package org.apache.commons.compress.archivers.zip;

import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5593 {

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
    public final C5584 f15407;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InputStream f15408;

    public C5593() {
        C5584 c5584 = new C5584("");
        c5584.f15371 = -1;
        c5584.f15369 = -1L;
        c5584.f15370 = 0;
        c5584.f15368 = new C5616();
        c5584.f15365 = -1L;
        c5584.f15366 = -1L;
        ZipArchiveEntry$NameSource zipArchiveEntry$NameSource = ZipArchiveEntry$NameSource.NAME;
        ZipArchiveEntry$CommentSource zipArchiveEntry$CommentSource = ZipArchiveEntry$CommentSource.COMMENT;
        c5584.f15361 = -1L;
        c5584.m10896("");
        this.f15407 = c5584;
        this.f15402 = new CRC32();
    }
}
