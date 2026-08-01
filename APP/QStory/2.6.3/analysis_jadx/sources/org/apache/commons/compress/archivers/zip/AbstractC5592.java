package org.apache.commons.compress.archivers.zip;

import java.io.FilterOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5592 extends FilterOutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final byte[] f15381;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final byte[] f15382;

    static {
        Charset charset = StandardCharsets.UTF_8;
        ZipLong.getBytes(1L);
        ZipLong.LFH_SIG.getBytes();
        ZipLong.DD_SIG.getBytes();
        f15382 = ZipLong.CFH_SIG.getBytes();
        f15381 = ZipLong.getBytes(101010256L);
        ZipLong.getBytes(101075792L);
        ZipLong.getBytes(117853008L);
    }
}
