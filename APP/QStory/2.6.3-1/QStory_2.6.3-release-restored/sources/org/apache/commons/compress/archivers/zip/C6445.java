package org.apache.commons.compress.archivers.zip;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.stream.Stream;
import p392.AbstractC9813;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6445 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f15815 = String.valueOf('?');

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f15816;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Charset f15817;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6445(Charset charset) {
        boolean z;
        this.f15817 = charset;
        int i = AbstractC9813.f25557;
        String strName = (charset == null ? Charset.defaultCharset() : charset).name();
        Charset charset2 = StandardCharsets.UTF_8;
        if (!charset2.name().equalsIgnoreCase(strName)) {
            Stream<String> stream = charset2.aliases().stream();
            Objects.requireNonNull(strName);
            z = stream.anyMatch(new C6421(strName, 0 == true ? 1 : 0));
        }
        this.f15816 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m11535(byte[] bArr) {
        CharsetDecoder charsetDecoderReplaceWith;
        boolean z = this.f15816;
        Charset charset = this.f15817;
        if (z) {
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            charsetDecoderReplaceWith = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(f15815);
        } else {
            CharsetDecoder charsetDecoderNewDecoder2 = charset.newDecoder();
            CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
            charsetDecoderReplaceWith = charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2);
        }
        return charsetDecoderReplaceWith.decode(ByteBuffer.wrap(bArr)).toString();
    }
}
