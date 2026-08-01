package org.apache.commons.compress.archivers.zip;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p376.AbstractC8984;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5590 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5615 f15378;

    static {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        int i = AbstractC8984.f25212;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        f15378 = new C5615(charsetDefaultCharset);
    }
}
