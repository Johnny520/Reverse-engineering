package org.apache.commons.compress.archivers.zip;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5614 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f15470 = String.valueOf('?');

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f15471;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Charset f15472;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5614(java.nio.charset.Charset r4) {
        /*
            r3 = this;
            r3.<init>()
            r3.f15472 = r4
            int r0 = p377.AbstractC8984.f25233
            if (r4 != 0) goto Ld
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()
        Ld:
            java.lang.String r4 = r4.name()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = r0.name()
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 != 0) goto L34
            java.util.Set r0 = r0.aliases()
            java.util.stream.Stream r0 = r0.stream()
            java.util.Objects.requireNonNull(r4)
            org.apache.commons.compress.archivers.zip.飘花落叶言子世苏哲兰楪 r1 = new org.apache.commons.compress.archivers.zip.飘花落叶言子世苏哲兰楪
            r2 = 0
            r1.<init>(r4, r2)
            boolean r4 = r0.anyMatch(r1)
            if (r4 == 0) goto L35
        L34:
            r2 = 1
        L35:
            r3.f15471 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.C5614.<init>(java.nio.charset.Charset):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m10919(byte[] bArr) {
        CharsetDecoder charsetDecoderReplaceWith;
        boolean z = this.f15471;
        Charset charset = this.f15472;
        if (z) {
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            charsetDecoderReplaceWith = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(f15470);
        } else {
            CharsetDecoder charsetDecoderNewDecoder2 = charset.newDecoder();
            CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
            charsetDecoderReplaceWith = charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2);
        }
        return charsetDecoderReplaceWith.decode(ByteBuffer.wrap(bArr)).toString();
    }
}
