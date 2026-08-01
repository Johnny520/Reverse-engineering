package org.apache.commons.compress.archivers.zip;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p392.AbstractC9813;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6420 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6445 f15723;

    static {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        int i = AbstractC9813.f25557;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        f15723 = new C6445(charsetDefaultCharset);
    }
}
