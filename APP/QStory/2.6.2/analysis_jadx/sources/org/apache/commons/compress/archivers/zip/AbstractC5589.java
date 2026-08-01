package org.apache.commons.compress.archivers.zip;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p377.AbstractC8984;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5589 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5614 f15378;

    static {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        int i = AbstractC8984.f25233;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        f15378 = new C5614(charsetDefaultCharset);
    }
}
