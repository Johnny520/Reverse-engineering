package okio.internal;

/* JADX INFO: renamed from: okio.internal.-ByteString, reason: invalid class name */
/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0080\b\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\r\u0010\u0011\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0080\b\u001a-\u0010\u0016\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u000f\u0010\u001c\u001a\u0004\u0018\u00010\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\tH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0080\b\u001a\u0017\u0010\"\u001a\u00020 *\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010#H\u0080\b\u001a\u0015\u0010$\u001a\u00020%*\u00020\f2\u0006\u0010&\u001a\u00020\u0007H\u0080\b\u001a\r\u0010'\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010(\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010)\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u001d\u0010*\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\r\u0010,\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\tH\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\fH\u0080\b\u001a\u001d\u00102\u001a\u00020\f*\u00020\f2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0080\b\u001a\r\u00105\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00106\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00107\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u00108\u001a\u00020\f*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010:\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a$\u0010;\u001a\u00020\u0017*\u00020\f2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006>"}, m115d2 = {"HEX_DIGIT_CHARS", "", "getHEX_DIGIT_CHARS$annotations", "()V", "getHEX_DIGIT_CHARS", "()[C", "codePointIndexToCharIndex", "", "s", "", "codePointCount", "commonOf", "Lokio/ByteString;", "data", "decodeHexDigit", "c", "", "commonBase64", "", "commonBase64Url", "commonCompareTo", "other", "commonCopyInto", "", "offset", "target", "targetOffset", "byteCount", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", "", "suffix", "commonEquals", "", "commonGetByte", "", "pos", "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", "otherOffset", "commonStartsWith", "prefix", "commonSubstring", "beginIndex", "endIndex", "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToByteString", "commonToString", "commonUtf8", "commonWrite", "buffer", "Lokio/Buffer;", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            okio.internal.ByteString.HEX_DIGIT_CHARS = r0
            return
    }

    public static final /* synthetic */ int access$codePointIndexToCharIndex(byte[] r1, int r2) {
            int r0 = codePointIndexToCharIndex(r1, r2)
            return r0
    }

    public static final /* synthetic */ int access$decodeHexDigit(char r1) {
            int r0 = decodeHexDigit(r1)
            return r0
    }

    private static final int codePointIndexToCharIndex(byte[] r30, int r31) {
            r0 = r31
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r30
            int r5 = r4.length
            r6 = r30
            r7 = 0
            r8 = r3
        Lc:
            if (r8 >= r5) goto L83e
            r9 = r6[r8]
            r10 = 160(0xa0, float:2.24E-43)
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 32
            r14 = 13
            r13 = 10
            r15 = 65536(0x10000, float:9.1835E-41)
            r16 = 2
            r17 = 0
            r18 = 1
            if (r9 < 0) goto Lb5
            r19 = r9
            r20 = 0
            int r21 = r2 + 1
            if (r2 != r0) goto L2e
            return r1
        L2e:
            r2 = r19
            if (r2 == r13) goto L54
            if (r2 == r14) goto L54
            r19 = 0
            if (r2 < 0) goto L3d
            if (r2 >= r12) goto L3d
            r22 = r18
            goto L3f
        L3d:
            r22 = r17
        L3f:
            if (r22 != 0) goto L50
            if (r11 > r2) goto L48
            if (r2 >= r10) goto L48
            r22 = r18
            goto L4a
        L48:
            r22 = r17
        L4a:
            if (r22 == 0) goto L4d
            goto L50
        L4d:
            r19 = r17
            goto L52
        L50:
            r19 = r18
        L52:
            if (r19 != 0) goto L59
        L54:
            r10 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r10) goto L5b
        L59:
            r10 = -1
            return r10
        L5b:
            if (r2 >= r15) goto L60
            r10 = r18
            goto L62
        L60:
            r10 = r16
        L62:
            int r1 = r1 + r10
            int r8 = r8 + 1
            r2 = r21
        L69:
            if (r8 >= r5) goto Lc
            r10 = r6[r8]
            if (r10 < 0) goto Lc
            int r10 = r8 + 1
            r8 = r6[r8]
            r20 = 0
            int r21 = r2 + 1
            if (r2 != r0) goto L7a
            return r1
        L7a:
            if (r8 == r13) goto L9f
            if (r8 == r14) goto L9f
            r2 = 0
            if (r8 < 0) goto L86
            if (r8 >= r12) goto L86
            r22 = r18
            goto L88
        L86:
            r22 = r17
        L88:
            if (r22 != 0) goto L9b
            if (r11 > r8) goto L93
            r11 = 160(0xa0, float:2.24E-43)
            if (r8 >= r11) goto L93
            r11 = r18
            goto L95
        L93:
            r11 = r17
        L95:
            if (r11 == 0) goto L98
            goto L9b
        L98:
            r2 = r17
            goto L9d
        L9b:
            r2 = r18
        L9d:
            if (r2 != 0) goto La4
        L9f:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r8 != r2) goto La6
        La4:
            r2 = -1
            return r2
        La6:
            if (r8 >= r15) goto Lab
            r2 = r18
            goto Lad
        Lab:
            r2 = r16
        Lad:
            int r1 = r1 + r2
            r8 = r10
            r2 = r21
            r11 = 127(0x7f, float:1.78E-43)
            goto L69
        Lb5:
            r10 = 5
            r11 = r9
            r20 = 0
            int r10 = r11 >> r10
            r11 = -2
            if (r10 != r11) goto L23b
            r10 = r6
            r11 = 0
            int r15 = r8 + 1
            if (r5 > r15) goto L113
            r15 = 65533(0xfffd, float:9.1831E-41)
            r21 = 0
            r23 = r15
            r24 = 0
            int r25 = r2 + 1
            if (r2 != r0) goto Ld2
            return r1
        Ld2:
            r2 = r23
            if (r2 == r13) goto Lf7
            if (r2 == r14) goto Lf7
            r13 = 0
            if (r2 < 0) goto Le0
            if (r2 >= r12) goto Le0
            r12 = r18
            goto Le2
        Le0:
            r12 = r17
        Le2:
            if (r12 != 0) goto Lf3
            r12 = 127(0x7f, float:1.78E-43)
            if (r12 > r2) goto Lef
            r12 = 160(0xa0, float:2.24E-43)
            if (r2 >= r12) goto Lef
            r12 = r18
            goto Lf1
        Lef:
            r12 = r17
        Lf1:
            if (r12 == 0) goto Lf5
        Lf3:
            r17 = r18
        Lf5:
            if (r17 != 0) goto Lfc
        Lf7:
            r12 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r12) goto Lfe
        Lfc:
            r12 = -1
            return r12
        Lfe:
            r12 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r12) goto L104
            r16 = r18
        L104:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r27 = r3
            r16 = r18
            r2 = r25
            goto L233
        L113:
            r15 = r10[r8]
            int r23 = r8 + 1
            r12 = r10[r23]
            r23 = 0
            r25 = 192(0xc0, float:2.69E-43)
            r26 = r12
            r27 = 0
            r14 = r26 & r25
            r13 = 128(0x80, float:1.8E-43)
            if (r14 != r13) goto L12a
            r13 = r18
            goto L12c
        L12a:
            r13 = r17
        L12c:
            if (r13 != 0) goto L186
            r13 = 65533(0xfffd, float:9.1831E-41)
            r14 = 0
            r21 = r13
            r23 = 0
            int r26 = r2 + 1
            if (r2 != r0) goto L13b
            return r1
        L13b:
            r27 = r3
            r2 = r21
            r3 = 10
            if (r2 == r3) goto L16c
            r3 = 13
            if (r2 == r3) goto L16c
            r3 = 0
            if (r2 < 0) goto L153
            r21 = r3
            r3 = 32
            if (r2 >= r3) goto L155
            r3 = r18
            goto L157
        L153:
            r21 = r3
        L155:
            r3 = r17
        L157:
            if (r3 != 0) goto L168
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 > r2) goto L164
            r3 = 160(0xa0, float:2.24E-43)
            if (r2 >= r3) goto L164
            r3 = r18
            goto L166
        L164:
            r3 = r17
        L166:
            if (r3 == 0) goto L16a
        L168:
            r17 = r18
        L16a:
            if (r17 != 0) goto L171
        L16c:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r3) goto L173
        L171:
            r3 = -1
            return r3
        L173:
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r3) goto L179
            r16 = r18
        L179:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r16 = r18
            r2 = r26
            goto L233
        L186:
            r27 = r3
            r3 = r12 ^ 3968(0xf80, float:5.56E-42)
            int r13 = r15 << 6
            r3 = r3 ^ r13
            r13 = 128(0x80, float:1.8E-43)
            if (r3 >= r13) goto L1e5
            r13 = 65533(0xfffd, float:9.1831E-41)
            r14 = 0
            r21 = r13
            r23 = 0
            int r26 = r2 + 1
            if (r2 != r0) goto L1a1
            return r1
        L1a1:
            r2 = r21
            r4 = 10
            if (r2 == r4) goto L1d0
            r4 = 13
            if (r2 == r4) goto L1d0
            r4 = 0
            if (r2 < 0) goto L1b7
            r21 = r4
            r4 = 32
            if (r2 >= r4) goto L1b9
            r4 = r18
            goto L1bb
        L1b7:
            r21 = r4
        L1b9:
            r4 = r17
        L1bb:
            if (r4 != 0) goto L1cc
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 > r2) goto L1c8
            r4 = 160(0xa0, float:2.24E-43)
            if (r2 >= r4) goto L1c8
            r4 = r18
            goto L1ca
        L1c8:
            r4 = r17
        L1ca:
            if (r4 == 0) goto L1ce
        L1cc:
            r17 = r18
        L1ce:
            if (r17 != 0) goto L1d5
        L1d0:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r4) goto L1d7
        L1d5:
            r4 = -1
            return r4
        L1d7:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r4) goto L1dc
            goto L1de
        L1dc:
            r18 = r16
        L1de:
            int r1 = r1 + r18
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L231
        L1e5:
            r4 = r3
            r13 = 0
            r14 = r4
            r21 = 0
            int r26 = r2 + 1
            if (r2 != r0) goto L1ef
            return r1
        L1ef:
            r2 = 10
            if (r14 == r2) goto L21c
            r2 = 13
            if (r14 == r2) goto L21c
            r2 = 0
            if (r14 < 0) goto L203
            r23 = r2
            r2 = 32
            if (r14 >= r2) goto L205
            r2 = r18
            goto L207
        L203:
            r23 = r2
        L205:
            r2 = r17
        L207:
            if (r2 != 0) goto L218
            r2 = 127(0x7f, float:1.78E-43)
            if (r2 > r14) goto L214
            r2 = 160(0xa0, float:2.24E-43)
            if (r14 >= r2) goto L214
            r2 = r18
            goto L216
        L214:
            r2 = r17
        L216:
            if (r2 == 0) goto L21a
        L218:
            r17 = r18
        L21a:
            if (r17 != 0) goto L221
        L21c:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r14 != r2) goto L223
        L221:
            r2 = -1
            return r2
        L223:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r14 >= r2) goto L228
            goto L22a
        L228:
            r18 = r16
        L22a:
            int r1 = r1 + r18
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L231:
            r2 = r26
        L233:
            int r8 = r8 + r16
            r4 = r30
            r3 = r27
            goto Lc
        L23b:
            r27 = r3
            r3 = 4
            r4 = r9
            r10 = 0
            int r3 = r4 >> r3
            if (r3 != r11) goto L4a9
            r3 = r6
            r11 = 0
            int r13 = r8 + 2
            if (r5 > r13) goto L2b7
            r4 = 65533(0xfffd, float:9.1831E-41)
            r10 = 0
            r12 = r4
            r13 = 0
            int r14 = r2 + 1
            if (r2 != r0) goto L255
            return r1
        L255:
            r2 = 10
            if (r12 == r2) goto L282
            r2 = 13
            if (r12 == r2) goto L282
            r2 = 0
            if (r12 < 0) goto L267
            r15 = 32
            if (r12 >= r15) goto L267
            r15 = r18
            goto L269
        L267:
            r15 = r17
        L269:
            if (r15 != 0) goto L27e
            r15 = 127(0x7f, float:1.78E-43)
            if (r15 > r12) goto L276
            r15 = 160(0xa0, float:2.24E-43)
            if (r12 >= r15) goto L276
            r15 = r18
            goto L278
        L276:
            r15 = r17
        L278:
            if (r15 == 0) goto L27b
            goto L27e
        L27b:
            r2 = r17
            goto L280
        L27e:
            r2 = r18
        L280:
            if (r2 != 0) goto L287
        L282:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r12 != r2) goto L289
        L287:
            r2 = -1
            return r2
        L289:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r12 >= r2) goto L290
            r2 = r18
            goto L292
        L290:
            r2 = r16
        L292:
            int r1 = r1 + r2
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            int r2 = r8 + 1
            if (r5 <= r2) goto L2b2
            int r2 = r8 + 1
            r2 = r3[r2]
            r4 = 0
            r10 = 192(0xc0, float:2.69E-43)
            r12 = r2
            r13 = 0
            r10 = r10 & r12
            r12 = 128(0x80, float:1.8E-43)
            if (r10 != r12) goto L2ac
            r17 = r18
        L2ac:
            if (r17 != 0) goto L2af
            goto L2b2
        L2af:
            r2 = r14
            goto L4a1
        L2b2:
            r2 = r14
            r16 = r18
            goto L4a1
        L2b7:
            r13 = r3[r8]
            int r14 = r8 + 1
            r14 = r3[r14]
            r15 = 0
            r23 = 192(0xc0, float:2.69E-43)
            r26 = r14
            r28 = 0
            r12 = r26 & r23
            r4 = 128(0x80, float:1.8E-43)
            if (r12 != r4) goto L2cd
            r4 = r18
            goto L2cf
        L2cd:
            r4 = r17
        L2cf:
            if (r4 != 0) goto L323
            r4 = 65533(0xfffd, float:9.1831E-41)
            r10 = 0
            r12 = r4
            r15 = 0
            int r21 = r2 + 1
            if (r2 != r0) goto L2dc
            return r1
        L2dc:
            r2 = 10
            if (r12 == r2) goto L309
            r2 = 13
            if (r12 == r2) goto L309
            r2 = 0
            if (r12 < 0) goto L2f0
            r23 = r2
            r2 = 32
            if (r12 >= r2) goto L2f2
            r2 = r18
            goto L2f4
        L2f0:
            r23 = r2
        L2f2:
            r2 = r17
        L2f4:
            if (r2 != 0) goto L305
            r2 = 127(0x7f, float:1.78E-43)
            if (r2 > r12) goto L301
            r2 = 160(0xa0, float:2.24E-43)
            if (r12 >= r2) goto L301
            r2 = r18
            goto L303
        L301:
            r2 = r17
        L303:
            if (r2 == 0) goto L307
        L305:
            r17 = r18
        L307:
            if (r17 != 0) goto L30e
        L309:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r12 != r2) goto L310
        L30e:
            r2 = -1
            return r2
        L310:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r12 >= r2) goto L316
            r16 = r18
        L316:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r16 = r18
            r2 = r21
            goto L4a1
        L323:
            int r4 = r8 + 2
            r4 = r3[r4]
            r12 = 0
            r15 = 192(0xc0, float:2.69E-43)
            r26 = r4
            r28 = 0
            r15 = r26 & r15
            r10 = 128(0x80, float:1.8E-43)
            if (r15 != r10) goto L337
            r10 = r18
            goto L339
        L337:
            r10 = r17
        L339:
            if (r10 != 0) goto L38d
            r10 = 65533(0xfffd, float:9.1831E-41)
            r12 = 0
            r15 = r10
            r21 = 0
            int r23 = r2 + 1
            if (r2 != r0) goto L347
            return r1
        L347:
            r2 = 10
            if (r15 == r2) goto L374
            r2 = 13
            if (r15 == r2) goto L374
            r2 = 0
            if (r15 < 0) goto L35b
            r25 = r2
            r2 = 32
            if (r15 >= r2) goto L35d
            r2 = r18
            goto L35f
        L35b:
            r25 = r2
        L35d:
            r2 = r17
        L35f:
            if (r2 != 0) goto L370
            r2 = 127(0x7f, float:1.78E-43)
            if (r2 > r15) goto L36c
            r2 = 160(0xa0, float:2.24E-43)
            if (r15 >= r2) goto L36c
            r2 = r18
            goto L36e
        L36c:
            r2 = r17
        L36e:
            if (r2 == 0) goto L372
        L370:
            r17 = r18
        L372:
            if (r17 != 0) goto L379
        L374:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r15 != r2) goto L37b
        L379:
            r2 = -1
            return r2
        L37b:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r15 >= r2) goto L380
            goto L382
        L380:
            r18 = r16
        L382:
            int r1 = r1 + r18
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r2 = r23
            goto L4a1
        L38d:
            r10 = -123008(0xfffffffffffe1f80, float:NaN)
            r10 = r10 ^ r4
            int r12 = r14 << 6
            r10 = r10 ^ r12
            int r12 = r13 << 12
            r10 = r10 ^ r12
            r12 = 2048(0x800, float:2.87E-42)
            if (r10 >= r12) goto L3f2
            r12 = 65533(0xfffd, float:9.1831E-41)
            r15 = 0
            r21 = r12
            r23 = 0
            int r26 = r2 + 1
            if (r2 != r0) goto L3ac
            return r1
        L3ac:
            r2 = r21
            r21 = r3
            r3 = 10
            if (r2 == r3) goto L3dd
            r3 = 13
            if (r2 == r3) goto L3dd
            r3 = 0
            if (r2 < 0) goto L3c4
            r25 = r3
            r3 = 32
            if (r2 >= r3) goto L3c6
            r3 = r18
            goto L3c8
        L3c4:
            r25 = r3
        L3c6:
            r3 = r17
        L3c8:
            if (r3 != 0) goto L3d9
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 > r2) goto L3d5
            r3 = 160(0xa0, float:2.24E-43)
            if (r2 >= r3) goto L3d5
            r3 = r18
            goto L3d7
        L3d5:
            r3 = r17
        L3d7:
            if (r3 == 0) goto L3db
        L3d9:
            r17 = r18
        L3db:
            if (r17 != 0) goto L3e2
        L3dd:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r3) goto L3e4
        L3e2:
            r3 = -1
            return r3
        L3e4:
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r3) goto L3ea
            r16 = r18
        L3ea:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L49d
        L3f2:
            r21 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r3 > r10) goto L401
            r3 = 57344(0xe000, float:8.0356E-41)
            if (r10 >= r3) goto L401
            r3 = r18
            goto L403
        L401:
            r3 = r17
        L403:
            if (r3 == 0) goto L452
            r3 = 65533(0xfffd, float:9.1831E-41)
            r12 = 0
            r15 = r3
            r23 = 0
            int r26 = r2 + 1
            if (r2 != r0) goto L411
            return r1
        L411:
            r2 = 10
            if (r15 == r2) goto L43e
            r2 = 13
            if (r15 == r2) goto L43e
            r2 = 0
            if (r15 < 0) goto L425
            r25 = r2
            r2 = 32
            if (r15 >= r2) goto L427
            r2 = r18
            goto L429
        L425:
            r25 = r2
        L427:
            r2 = r17
        L429:
            if (r2 != 0) goto L43a
            r2 = 127(0x7f, float:1.78E-43)
            if (r2 > r15) goto L436
            r2 = 160(0xa0, float:2.24E-43)
            if (r15 >= r2) goto L436
            r2 = r18
            goto L438
        L436:
            r2 = r17
        L438:
            if (r2 == 0) goto L43c
        L43a:
            r17 = r18
        L43c:
            if (r17 != 0) goto L443
        L43e:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r15 != r2) goto L445
        L443:
            r2 = -1
            return r2
        L445:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r15 >= r2) goto L44b
            r16 = r18
        L44b:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L49d
        L452:
            r3 = r10
            r12 = 0
            r15 = r3
            r23 = 0
            int r26 = r2 + 1
            if (r2 != r0) goto L45c
            return r1
        L45c:
            r2 = 10
            if (r15 == r2) goto L489
            r2 = 13
            if (r15 == r2) goto L489
            r2 = 0
            if (r15 < 0) goto L470
            r25 = r2
            r2 = 32
            if (r15 >= r2) goto L472
            r2 = r18
            goto L474
        L470:
            r25 = r2
        L472:
            r2 = r17
        L474:
            if (r2 != 0) goto L485
            r2 = 127(0x7f, float:1.78E-43)
            if (r2 > r15) goto L481
            r2 = 160(0xa0, float:2.24E-43)
            if (r15 >= r2) goto L481
            r2 = r18
            goto L483
        L481:
            r2 = r17
        L483:
            if (r2 == 0) goto L487
        L485:
            r17 = r18
        L487:
            if (r17 != 0) goto L48e
        L489:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r15 != r2) goto L490
        L48e:
            r2 = -1
            return r2
        L490:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r15 >= r2) goto L496
            r16 = r18
        L496:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L49d:
            r2 = r26
            r16 = 3
        L4a1:
            int r8 = r8 + r16
            r4 = r30
            r3 = r27
            goto Lc
        L4a9:
            r3 = 3
            r4 = r9
            r10 = 0
            int r3 = r4 >> r3
            if (r3 != r11) goto L7f2
            r3 = r6
            r4 = 0
            int r10 = r8 + 3
            if (r5 > r10) goto L542
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 0
            r12 = r10
            r13 = 0
            int r14 = r2 + 1
            if (r2 != r0) goto L4c1
            return r1
        L4c1:
            r2 = 10
            if (r12 == r2) goto L4ee
            r2 = 13
            if (r12 == r2) goto L4ee
            r2 = 0
            if (r12 < 0) goto L4d3
            r15 = 32
            if (r12 >= r15) goto L4d3
            r15 = r18
            goto L4d5
        L4d3:
            r15 = r17
        L4d5:
            if (r15 != 0) goto L4ea
            r15 = 127(0x7f, float:1.78E-43)
            if (r15 > r12) goto L4e2
            r15 = 160(0xa0, float:2.24E-43)
            if (r12 >= r15) goto L4e2
            r15 = r18
            goto L4e4
        L4e2:
            r15 = r17
        L4e4:
            if (r15 == 0) goto L4e7
            goto L4ea
        L4e7:
            r2 = r17
            goto L4ec
        L4ea:
            r2 = r18
        L4ec:
            if (r2 != 0) goto L4f3
        L4ee:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r12 != r2) goto L4f5
        L4f3:
            r2 = -1
            return r2
        L4f5:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r12 >= r2) goto L4fc
            r2 = r18
            goto L4fe
        L4fc:
            r2 = r16
        L4fe:
            int r1 = r1 + r2
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            int r2 = r8 + 1
            if (r5 <= r2) goto L53d
            int r2 = r8 + 1
            r2 = r3[r2]
            r10 = 0
            r11 = 192(0xc0, float:2.69E-43)
            r12 = r2
            r13 = 0
            r11 = r11 & r12
            r12 = 128(0x80, float:1.8E-43)
            if (r11 != r12) goto L519
            r2 = r18
            goto L51b
        L519:
            r2 = r17
        L51b:
            if (r2 != 0) goto L51e
            goto L53d
        L51e:
            int r2 = r8 + 2
            if (r5 <= r2) goto L53a
            int r2 = r8 + 2
            r2 = r3[r2]
            r10 = 0
            r11 = 192(0xc0, float:2.69E-43)
            r12 = r2
            r13 = 0
            r11 = r11 & r12
            r12 = 128(0x80, float:1.8E-43)
            if (r11 != r12) goto L532
            r17 = r18
        L532:
            if (r17 != 0) goto L535
            goto L53a
        L535:
            r2 = r14
            r16 = 3
            goto L7ea
        L53a:
            r2 = r14
            goto L7ea
        L53d:
            r2 = r14
            r16 = r18
            goto L7ea
        L542:
            r10 = r3[r8]
            int r11 = r8 + 1
            r11 = r3[r11]
            r12 = 0
            r13 = 192(0xc0, float:2.69E-43)
            r14 = r11
            r15 = 0
            r13 = r13 & r14
            r14 = 128(0x80, float:1.8E-43)
            if (r13 != r14) goto L555
            r12 = r18
            goto L557
        L555:
            r12 = r17
        L557:
            if (r12 != 0) goto L5ab
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            r14 = r12
            r15 = 0
            int r21 = r2 + 1
            if (r2 != r0) goto L564
            return r1
        L564:
            r2 = 10
            if (r14 == r2) goto L591
            r2 = 13
            if (r14 == r2) goto L591
            r2 = 0
            if (r14 < 0) goto L578
            r23 = r2
            r2 = 32
            if (r14 >= r2) goto L57a
            r2 = r18
            goto L57c
        L578:
            r23 = r2
        L57a:
            r2 = r17
        L57c:
            if (r2 != 0) goto L58d
            r2 = 127(0x7f, float:1.78E-43)
            if (r2 > r14) goto L589
            r2 = 160(0xa0, float:2.24E-43)
            if (r14 >= r2) goto L589
            r2 = r18
            goto L58b
        L589:
            r2 = r17
        L58b:
            if (r2 == 0) goto L58f
        L58d:
            r17 = r18
        L58f:
            if (r17 != 0) goto L596
        L591:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r14 != r2) goto L598
        L596:
            r2 = -1
            return r2
        L598:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r14 >= r2) goto L59e
            r16 = r18
        L59e:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r16 = r18
            r2 = r21
            goto L7ea
        L5ab:
            int r12 = r8 + 2
            r12 = r3[r12]
            r13 = 0
            r14 = 192(0xc0, float:2.69E-43)
            r15 = r12
            r28 = 0
            r14 = r14 & r15
            r15 = 128(0x80, float:1.8E-43)
            if (r14 != r15) goto L5bd
            r13 = r18
            goto L5bf
        L5bd:
            r13 = r17
        L5bf:
            if (r13 != 0) goto L613
            r13 = 65533(0xfffd, float:9.1831E-41)
            r14 = 0
            r15 = r13
            r21 = 0
            int r23 = r2 + 1
            if (r2 != r0) goto L5cd
            return r1
        L5cd:
            r2 = 10
            if (r15 == r2) goto L5fa
            r2 = 13
            if (r15 == r2) goto L5fa
            r2 = 0
            if (r15 < 0) goto L5e1
            r25 = r2
            r2 = 32
            if (r15 >= r2) goto L5e3
            r2 = r18
            goto L5e5
        L5e1:
            r25 = r2
        L5e3:
            r2 = r17
        L5e5:
            if (r2 != 0) goto L5f6
            r2 = 127(0x7f, float:1.78E-43)
            if (r2 > r15) goto L5f2
            r2 = 160(0xa0, float:2.24E-43)
            if (r15 >= r2) goto L5f2
            r2 = r18
            goto L5f4
        L5f2:
            r2 = r17
        L5f4:
            if (r2 == 0) goto L5f8
        L5f6:
            r17 = r18
        L5f8:
            if (r17 != 0) goto L5ff
        L5fa:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r15 != r2) goto L601
        L5ff:
            r2 = -1
            return r2
        L601:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r15 >= r2) goto L606
            goto L608
        L606:
            r18 = r16
        L608:
            int r1 = r1 + r18
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r2 = r23
            goto L7ea
        L613:
            int r13 = r8 + 3
            r13 = r3[r13]
            r14 = 0
            r15 = 192(0xc0, float:2.69E-43)
            r28 = r13
            r29 = 0
            r15 = r28 & r15
            r28 = r3
            r3 = 128(0x80, float:1.8E-43)
            if (r15 != r3) goto L629
            r3 = r18
            goto L62b
        L629:
            r3 = r17
        L62b:
            if (r3 != 0) goto L680
            r3 = 65533(0xfffd, float:9.1831E-41)
            r14 = 0
            r15 = r3
            r21 = 0
            int r23 = r2 + 1
            if (r2 != r0) goto L639
            return r1
        L639:
            r2 = 10
            if (r15 == r2) goto L666
            r2 = 13
            if (r15 == r2) goto L666
            r2 = 0
            if (r15 < 0) goto L64d
            r25 = r2
            r2 = 32
            if (r15 >= r2) goto L64f
            r2 = r18
            goto L651
        L64d:
            r25 = r2
        L64f:
            r2 = r17
        L651:
            if (r2 != 0) goto L662
            r2 = 127(0x7f, float:1.78E-43)
            if (r2 > r15) goto L65e
            r2 = 160(0xa0, float:2.24E-43)
            if (r15 >= r2) goto L65e
            r2 = r18
            goto L660
        L65e:
            r2 = r17
        L660:
            if (r2 == 0) goto L664
        L662:
            r17 = r18
        L664:
            if (r17 != 0) goto L66b
        L666:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r15 != r2) goto L66d
        L66b:
            r2 = -1
            return r2
        L66d:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r15 >= r2) goto L673
            r16 = r18
        L673:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r2 = r23
            r16 = 3
            goto L7ea
        L680:
            r3 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r13
            int r14 = r12 << 6
            r3 = r3 ^ r14
            int r14 = r11 << 12
            r3 = r3 ^ r14
            int r14 = r10 << 18
            r3 = r3 ^ r14
            r14 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r14) goto L6e9
            r14 = 65533(0xfffd, float:9.1831E-41)
            r15 = 0
            r21 = r14
            r23 = 0
            int r26 = r2 + 1
            if (r2 != r0) goto L6a3
            return r1
        L6a3:
            r2 = r21
            r21 = r4
            r4 = 10
            if (r2 == r4) goto L6d4
            r4 = 13
            if (r2 == r4) goto L6d4
            r4 = 0
            if (r2 < 0) goto L6bb
            r25 = r4
            r4 = 32
            if (r2 >= r4) goto L6bd
            r4 = r18
            goto L6bf
        L6bb:
            r25 = r4
        L6bd:
            r4 = r17
        L6bf:
            if (r4 != 0) goto L6d0
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 > r2) goto L6cc
            r4 = 160(0xa0, float:2.24E-43)
            if (r2 >= r4) goto L6cc
            r4 = r18
            goto L6ce
        L6cc:
            r4 = r17
        L6ce:
            if (r4 == 0) goto L6d2
        L6d0:
            r17 = r18
        L6d2:
            if (r17 != 0) goto L6d9
        L6d4:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r4) goto L6db
        L6d9:
            r4 = -1
            return r4
        L6db:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r4) goto L6e1
            r16 = r18
        L6e1:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L7e6
        L6e9:
            r21 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r4 > r3) goto L6f8
            r4 = 57344(0xe000, float:8.0356E-41)
            if (r3 >= r4) goto L6f8
            r4 = r18
            goto L6fa
        L6f8:
            r4 = r17
        L6fa:
            if (r4 == 0) goto L74a
            r4 = 65533(0xfffd, float:9.1831E-41)
            r14 = 0
            r15 = r4
            r23 = 0
            int r26 = r2 + 1
            if (r2 != r0) goto L708
            return r1
        L708:
            r2 = 10
            if (r15 == r2) goto L735
            r2 = 13
            if (r15 == r2) goto L735
            r2 = 0
            if (r15 < 0) goto L71c
            r25 = r2
            r2 = 32
            if (r15 >= r2) goto L71e
            r2 = r18
            goto L720
        L71c:
            r25 = r2
        L71e:
            r2 = r17
        L720:
            if (r2 != 0) goto L731
            r2 = 127(0x7f, float:1.78E-43)
            if (r2 > r15) goto L72d
            r2 = 160(0xa0, float:2.24E-43)
            if (r15 >= r2) goto L72d
            r2 = r18
            goto L72f
        L72d:
            r2 = r17
        L72f:
            if (r2 == 0) goto L733
        L731:
            r17 = r18
        L733:
            if (r17 != 0) goto L73a
        L735:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r15 != r2) goto L73c
        L73a:
            r2 = -1
            return r2
        L73c:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r15 >= r2) goto L742
            r16 = r18
        L742:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L7e6
        L74a:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r4) goto L79b
            r4 = 65533(0xfffd, float:9.1831E-41)
            r14 = 0
            r15 = r4
            r23 = 0
            int r26 = r2 + 1
            if (r2 != r0) goto L75a
            return r1
        L75a:
            r2 = 10
            if (r15 == r2) goto L787
            r2 = 13
            if (r15 == r2) goto L787
            r2 = 0
            if (r15 < 0) goto L76e
            r25 = r2
            r2 = 32
            if (r15 >= r2) goto L770
            r2 = r18
            goto L772
        L76e:
            r25 = r2
        L770:
            r2 = r17
        L772:
            if (r2 != 0) goto L783
            r2 = 127(0x7f, float:1.78E-43)
            if (r2 > r15) goto L77f
            r2 = 160(0xa0, float:2.24E-43)
            if (r15 >= r2) goto L77f
            r2 = r18
            goto L781
        L77f:
            r2 = r17
        L781:
            if (r2 == 0) goto L785
        L783:
            r17 = r18
        L785:
            if (r17 != 0) goto L78c
        L787:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r15 != r2) goto L78e
        L78c:
            r2 = -1
            return r2
        L78e:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r15 >= r2) goto L794
            r16 = r18
        L794:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L7e6
        L79b:
            r4 = r3
            r14 = 0
            r15 = r4
            r23 = 0
            int r26 = r2 + 1
            if (r2 != r0) goto L7a5
            return r1
        L7a5:
            r2 = 10
            if (r15 == r2) goto L7d2
            r2 = 13
            if (r15 == r2) goto L7d2
            r2 = 0
            if (r15 < 0) goto L7b9
            r25 = r2
            r2 = 32
            if (r15 >= r2) goto L7bb
            r2 = r18
            goto L7bd
        L7b9:
            r25 = r2
        L7bb:
            r2 = r17
        L7bd:
            if (r2 != 0) goto L7ce
            r2 = 127(0x7f, float:1.78E-43)
            if (r2 > r15) goto L7ca
            r2 = 160(0xa0, float:2.24E-43)
            if (r15 >= r2) goto L7ca
            r2 = r18
            goto L7cc
        L7ca:
            r2 = r17
        L7cc:
            if (r2 == 0) goto L7d0
        L7ce:
            r17 = r18
        L7d0:
            if (r17 != 0) goto L7d7
        L7d2:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r15 != r2) goto L7d9
        L7d7:
            r2 = -1
            return r2
        L7d9:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r15 >= r2) goto L7df
            r16 = r18
        L7df:
            int r1 = r1 + r16
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L7e6:
            r16 = 4
            r2 = r26
        L7ea:
            int r8 = r8 + r16
            r4 = r30
            r3 = r27
            goto Lc
        L7f2:
            r3 = 65533(0xfffd, float:9.1831E-41)
            r4 = 0
            int r10 = r2 + 1
            if (r2 != r0) goto L7fb
            return r1
        L7fb:
            r2 = 10
            if (r3 == r2) goto L824
            r2 = 13
            if (r3 == r2) goto L824
            r2 = 0
            if (r3 < 0) goto L80d
            r11 = 32
            if (r3 >= r11) goto L80d
            r11 = r18
            goto L80f
        L80d:
            r11 = r17
        L80f:
            if (r11 != 0) goto L820
            r11 = 127(0x7f, float:1.78E-43)
            if (r11 > r3) goto L81c
            r11 = 160(0xa0, float:2.24E-43)
            if (r3 >= r11) goto L81c
            r11 = r18
            goto L81e
        L81c:
            r11 = r17
        L81e:
            if (r11 == 0) goto L822
        L820:
            r17 = r18
        L822:
            if (r17 != 0) goto L829
        L824:
            r2 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r2) goto L82b
        L829:
            r2 = -1
            return r2
        L82b:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r2) goto L831
            r16 = r18
        L831:
            int r1 = r1 + r16
            int r8 = r8 + 1
            r4 = r30
            r2 = r10
            r3 = r27
            goto Lc
        L83e:
            return r1
    }

    public static final java.lang.String commonBase64(okio.ByteString r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            byte[] r1 = r4.getData$okio()
            r2 = 0
            r3 = 1
            java.lang.String r1 = okio.Base64.encodeBase64$default(r1, r2, r3, r2)
            return r1
    }

    public static final java.lang.String commonBase64Url(okio.ByteString r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            byte[] r1 = r3.getData$okio()
            byte[] r2 = okio.Base64.getBASE64_URL_SAFE()
            java.lang.String r1 = okio.Base64.encodeBase64(r1, r2)
            return r1
    }

    public static final int commonCompareTo(okio.ByteString r11, okio.ByteString r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            int r1 = r11.size()
            int r2 = r12.size()
            r3 = 0
            int r4 = java.lang.Math.min(r1, r2)
        L18:
            r5 = -1
            r6 = 1
            if (r3 >= r4) goto L38
            byte r7 = r11.getByte(r3)
            r8 = 255(0xff, float:3.57E-43)
            r9 = 0
            r7 = r7 & r8
            byte r8 = r12.getByte(r3)
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r8 = r8 & r9
            if (r7 != r8) goto L33
            int r3 = r3 + 1
            goto L18
        L33:
            if (r7 >= r8) goto L36
            goto L37
        L36:
            r5 = r6
        L37:
            return r5
        L38:
            if (r1 != r2) goto L3c
            r5 = 0
            return r5
        L3c:
            if (r1 >= r2) goto L3f
            goto L40
        L3f:
            r5 = r6
        L40:
            return r5
    }

    public static final void commonCopyInto(okio.ByteString r3, int r4, byte[] r5, int r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            byte[] r1 = r3.getData$okio()
            int r2 = r4 + r7
            kotlin.collections.ArraysKt.copyInto(r1, r5, r6, r4, r2)
            return
    }

    public static final okio.ByteString commonDecodeBase64(java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            byte[] r1 = okio.Base64.decodeBase64ToArray(r3)
            if (r1 == 0) goto L12
            okio.ByteString r2 = new okio.ByteString
            r2.<init>(r1)
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public static final okio.ByteString commonDecodeHex(java.lang.String r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            int r1 = r8.length()
            int r1 = r1 % 2
            r2 = 1
            if (r1 != 0) goto L11
            r1 = r2
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L45
            int r1 = r8.length()
            int r1 = r1 / 2
            byte[] r1 = new byte[r1]
            r3 = 0
            int r4 = r1.length
        L1e:
            if (r3 >= r4) goto L3f
            int r5 = r3 * 2
            char r5 = r8.charAt(r5)
            int r5 = access$decodeHexDigit(r5)
            int r5 = r5 << 4
            int r6 = r3 * 2
            int r6 = r6 + r2
            char r6 = r8.charAt(r6)
            int r6 = access$decodeHexDigit(r6)
            int r7 = r5 + r6
            byte r7 = (byte) r7
            r1[r3] = r7
            int r3 = r3 + 1
            goto L1e
        L3f:
            okio.ByteString r2 = new okio.ByteString
            r2.<init>(r1)
            return r2
        L45:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected hex string: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final okio.ByteString commonEncodeUtf8(java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            okio.ByteString r1 = new okio.ByteString
            byte[] r2 = okio._JvmPlatformKt.asUtf8ToByteArray(r3)
            r1.<init>(r2)
            r1.setUtf8$okio(r3)
            return r1
    }

    public static final boolean commonEndsWith(okio.ByteString r4, okio.ByteString r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r1 = r4.size()
            int r2 = r5.size()
            int r1 = r1 - r2
            r2 = 0
            int r3 = r5.size()
            boolean r1 = r4.rangeEquals(r1, r5, r2, r3)
            return r1
    }

    public static final boolean commonEndsWith(okio.ByteString r4, byte[] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r1 = r4.size()
            int r2 = r5.length
            int r1 = r1 - r2
            r2 = 0
            int r3 = r5.length
            boolean r1 = r4.rangeEquals(r1, r5, r2, r3)
            return r1
    }

    public static final boolean commonEquals(okio.ByteString r6, java.lang.Object r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 1
            if (r7 != r6) goto Lb
            goto L34
        Lb:
            boolean r2 = r7 instanceof okio.ByteString
            r3 = 0
            if (r2 == 0) goto L33
            r2 = r7
            okio.ByteString r2 = (okio.ByteString) r2
            int r2 = r2.size()
            byte[] r4 = r6.getData$okio()
            int r4 = r4.length
            if (r2 != r4) goto L31
            r2 = r7
            okio.ByteString r2 = (okio.ByteString) r2
            byte[] r4 = r6.getData$okio()
            byte[] r5 = r6.getData$okio()
            int r5 = r5.length
            boolean r2 = r2.rangeEquals(r3, r4, r3, r5)
            if (r2 == 0) goto L31
            goto L34
        L31:
            r1 = r3
            goto L34
        L33:
            r1 = r3
        L34:
            return r1
    }

    public static final byte commonGetByte(okio.ByteString r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            byte[] r1 = r2.getData$okio()
            r1 = r1[r3]
            return r1
    }

    public static final int commonGetSize(okio.ByteString r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            byte[] r1 = r2.getData$okio()
            int r1 = r1.length
            return r1
    }

    public static final int commonHashCode(okio.ByteString r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r1 = r5.getHashCode$okio()
            if (r1 == 0) goto Ld
            return r1
        Ld:
            byte[] r2 = r5.getData$okio()
            int r2 = java.util.Arrays.hashCode(r2)
            r3 = r2
            r4 = 0
            r5.setHashCode$okio(r3)
            return r2
    }

    public static final java.lang.String commonHex(okio.ByteString r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            byte[] r1 = r12.getData$okio()
            int r1 = r1.length
            int r1 = r1 * 2
            char[] r1 = new char[r1]
            r2 = 0
            byte[] r3 = r12.getData$okio()
            int r4 = r3.length
            r5 = 0
        L16:
            if (r5 >= r4) goto L3c
            r6 = r3[r5]
            int r7 = r2 + 1
            char[] r8 = getHEX_DIGIT_CHARS()
            r9 = 4
            r10 = r6
            r11 = 0
            int r9 = r10 >> r9
            r9 = r9 & 15
            char r8 = r8[r9]
            r1[r2] = r8
            int r2 = r7 + 1
            char[] r8 = getHEX_DIGIT_CHARS()
            r9 = 15
            r11 = 0
            r9 = r9 & r10
            char r8 = r8[r9]
            r1[r7] = r8
            int r5 = r5 + 1
            goto L16
        L3c:
            java.lang.String r3 = kotlin.text.StringsKt.concatToString(r1)
            return r3
    }

    public static final int commonIndexOf(okio.ByteString r6, byte[] r7, int r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            byte[] r1 = r6.getData$okio()
            int r1 = r1.length
            int r2 = r7.length
            int r1 = r1 - r2
            r2 = 0
            int r3 = java.lang.Math.max(r8, r2)
            if (r3 > r1) goto L2a
        L19:
            byte[] r4 = r6.getData$okio()
            int r5 = r7.length
            boolean r4 = okio.SegmentedByteString.arrayRangeEquals(r4, r3, r7, r2, r5)
            if (r4 == 0) goto L25
            return r3
        L25:
            if (r3 == r1) goto L2a
            int r3 = r3 + 1
            goto L19
        L2a:
            r2 = -1
            return r2
    }

    public static final byte[] commonInternalArray(okio.ByteString r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            byte[] r1 = r2.getData$okio()
            return r1
    }

    public static final int commonLastIndexOf(okio.ByteString r2, okio.ByteString r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            byte[] r1 = r3.internalArray$okio()
            int r1 = r2.lastIndexOf(r1, r4)
            return r1
    }

    public static final int commonLastIndexOf(okio.ByteString r7, byte[] r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            int r1 = okio.SegmentedByteString.resolveDefaultParameter(r7, r9)
            byte[] r2 = r7.getData$okio()
            int r2 = r2.length
            int r3 = r8.length
            int r2 = r2 - r3
            int r3 = java.lang.Math.min(r1, r2)
        L1a:
            r4 = -1
            if (r4 >= r3) goto L2d
            byte[] r4 = r7.getData$okio()
            r5 = 0
            int r6 = r8.length
            boolean r4 = okio.SegmentedByteString.arrayRangeEquals(r4, r3, r8, r5, r6)
            if (r4 == 0) goto L2a
            return r3
        L2a:
            int r3 = r3 + (-1)
            goto L1a
        L2d:
            return r4
    }

    public static final okio.ByteString commonOf(byte[] r4) {
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            okio.ByteString r1 = new okio.ByteString
            int r2 = r4.length
            byte[] r2 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r3 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>(r2)
            return r1
    }

    public static final boolean commonRangeEquals(okio.ByteString r2, int r3, okio.ByteString r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            byte[] r1 = r2.getData$okio()
            boolean r1 = r4.rangeEquals(r5, r1, r3, r6)
            return r1
    }

    public static final boolean commonRangeEquals(okio.ByteString r2, int r3, byte[] r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            if (r3 < 0) goto L27
            byte[] r1 = r2.getData$okio()
            int r1 = r1.length
            int r1 = r1 - r6
            if (r3 > r1) goto L27
            if (r5 < 0) goto L27
            int r1 = r4.length
            int r1 = r1 - r6
            if (r5 > r1) goto L27
            byte[] r1 = r2.getData$okio()
            boolean r1 = okio.SegmentedByteString.arrayRangeEquals(r1, r3, r4, r5, r6)
            if (r1 == 0) goto L27
            r1 = 1
            goto L28
        L27:
            r1 = 0
        L28:
            return r1
    }

    public static final boolean commonStartsWith(okio.ByteString r3, okio.ByteString r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 0
            int r2 = r4.size()
            boolean r1 = r3.rangeEquals(r1, r4, r1, r2)
            return r1
    }

    public static final boolean commonStartsWith(okio.ByteString r3, byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 0
            int r2 = r4.length
            boolean r1 = r3.rangeEquals(r1, r4, r1, r2)
            return r1
    }

    public static final okio.ByteString commonSubstring(okio.ByteString r5, int r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r1 = okio.SegmentedByteString.resolveDefaultParameter(r5, r7)
            r2 = 1
            r3 = 0
            if (r6 < 0) goto L10
            r4 = r2
            goto L11
        L10:
            r4 = r3
        L11:
            if (r4 == 0) goto L76
            byte[] r4 = r5.getData$okio()
            int r4 = r4.length
            if (r1 > r4) goto L1c
            r4 = r2
            goto L1d
        L1c:
            r4 = r3
        L1d:
            if (r4 == 0) goto L4d
            int r4 = r1 - r6
            if (r4 < 0) goto L24
            goto L25
        L24:
            r2 = r3
        L25:
            if (r2 == 0) goto L3f
            if (r6 != 0) goto L31
            byte[] r2 = r5.getData$okio()
            int r2 = r2.length
            if (r1 != r2) goto L31
            return r5
        L31:
            okio.ByteString r2 = new okio.ByteString
            byte[] r3 = r5.getData$okio()
            byte[] r3 = kotlin.collections.ArraysKt.copyOfRange(r3, r6, r1)
            r2.<init>(r3)
            return r2
        L3f:
            r2 = 0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "endIndex < beginIndex"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L4d:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "endIndex > length("
            java.lang.StringBuilder r3 = r3.append(r4)
            byte[] r4 = r5.getData$okio()
            int r4 = r4.length
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = 41
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L76:
            r2 = 0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "beginIndex < 0"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static final okio.ByteString commonToAsciiLowercase(okio.ByteString r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 0
        L7:
            byte[] r2 = r8.getData$okio()
            int r2 = r2.length
            if (r1 >= r2) goto L50
            byte[] r2 = r8.getData$okio()
            r2 = r2[r1]
            r3 = 65
            if (r2 < r3) goto L4d
            r4 = 90
            if (r2 <= r4) goto L1d
            goto L4d
        L1d:
            byte[] r5 = r8.getData$okio()
            int r6 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.String r6 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            int r6 = r1 + 1
            int r7 = r2 + 32
            byte r7 = (byte) r7
            r5[r1] = r7
        L32:
            int r1 = r5.length
            if (r6 >= r1) goto L47
            r2 = r5[r6]
            if (r2 < r3) goto L44
            if (r2 <= r4) goto L3c
            goto L44
        L3c:
            int r1 = r2 + 32
            byte r1 = (byte) r1
            r5[r6] = r1
            int r6 = r6 + 1
            goto L32
        L44:
            int r6 = r6 + 1
            goto L32
        L47:
            okio.ByteString r1 = new okio.ByteString
            r1.<init>(r5)
            return r1
        L4d:
            int r1 = r1 + 1
            goto L7
        L50:
            return r8
    }

    public static final okio.ByteString commonToAsciiUppercase(okio.ByteString r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 0
        L7:
            byte[] r2 = r8.getData$okio()
            int r2 = r2.length
            if (r1 >= r2) goto L50
            byte[] r2 = r8.getData$okio()
            r2 = r2[r1]
            r3 = 97
            if (r2 < r3) goto L4d
            r4 = 122(0x7a, float:1.71E-43)
            if (r2 <= r4) goto L1d
            goto L4d
        L1d:
            byte[] r5 = r8.getData$okio()
            int r6 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.String r6 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            int r6 = r1 + 1
            int r7 = r2 + (-32)
            byte r7 = (byte) r7
            r5[r1] = r7
        L32:
            int r1 = r5.length
            if (r6 >= r1) goto L47
            r2 = r5[r6]
            if (r2 < r3) goto L44
            if (r2 <= r4) goto L3c
            goto L44
        L3c:
            int r1 = r2 + (-32)
            byte r1 = (byte) r1
            r5[r6] = r1
            int r6 = r6 + 1
            goto L32
        L44:
            int r6 = r6 + 1
            goto L32
        L47:
            okio.ByteString r1 = new okio.ByteString
            r1.<init>(r5)
            return r1
        L4d:
            int r1 = r1 + 1
            goto L7
        L50:
            return r8
    }

    public static final byte[] commonToByteArray(okio.ByteString r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            byte[] r1 = r3.getData$okio()
            int r2 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static final okio.ByteString commonToByteString(byte[] r9, int r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r1 = okio.SegmentedByteString.resolveDefaultParameter(r9, r11)
            int r2 = r9.length
            long r3 = (long) r2
            long r5 = (long) r10
            long r7 = (long) r1
            okio.SegmentedByteString.checkOffsetAndCount(r3, r5, r7)
            okio.ByteString r2 = new okio.ByteString
            int r3 = r10 + r1
            byte[] r3 = kotlin.collections.ArraysKt.copyOfRange(r9, r10, r3)
            r2.<init>(r3)
            return r2
    }

    public static final java.lang.String commonToString(okio.ByteString r22) {
            java.lang.String r0 = "<this>"
            r1 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            byte[] r2 = r22.getData$okio()
            int r2 = r2.length
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L13
            r2 = r3
            goto L14
        L13:
            r2 = r4
        L14:
            if (r2 == 0) goto L19
            java.lang.String r2 = "[size=0]"
            return r2
        L19:
            byte[] r2 = r22.getData$okio()
            r5 = 64
            int r2 = access$codePointIndexToCharIndex(r2, r5)
            r6 = -1
            java.lang.String r7 = "…]"
            java.lang.String r8 = "[size="
            r9 = 93
            if (r2 != r6) goto Le4
            byte[] r6 = r22.getData$okio()
            int r6 = r6.length
            if (r6 > r5) goto L4f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[hex="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r22.hex()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r3 = r3.toString()
            goto Lac
        L4f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r8)
            byte[] r6 = r22.getData$okio()
            int r6 = r6.length
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " hex="
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = 0
            r8 = 64
            r9 = r22
            r10 = 0
            int r11 = okio.SegmentedByteString.resolveDefaultParameter(r9, r8)
            byte[] r12 = r9.getData$okio()
            int r12 = r12.length
            if (r11 > r12) goto L7b
            r12 = r3
            goto L7c
        L7b:
            r12 = r4
        L7c:
            if (r12 == 0) goto Lbb
            int r12 = r11 - r6
            if (r12 < 0) goto L83
            goto L84
        L83:
            r3 = r4
        L84:
            if (r3 == 0) goto Lad
            byte[] r3 = r9.getData$okio()
            int r3 = r3.length
            if (r11 != r3) goto L8e
            goto L9c
        L8e:
            okio.ByteString r3 = new okio.ByteString
            byte[] r4 = r9.getData$okio()
            byte[] r4 = kotlin.collections.ArraysKt.copyOfRange(r4, r6, r11)
            r3.<init>(r4)
            r9 = r3
        L9c:
            java.lang.String r3 = r9.hex()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
        Lac:
            return r3
        Lad:
            r3 = 0
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "endIndex < beginIndex"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        Lbb:
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "endIndex > length("
            java.lang.StringBuilder r4 = r4.append(r5)
            byte[] r5 = r9.getData$okio()
            int r5 = r5.length
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = 41
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        Le4:
            java.lang.String r3 = r22.utf8()
            java.lang.String r10 = r3.substring(r4, r2)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)
            r14 = 4
            r15 = 0
            java.lang.String r11 = "\\"
            java.lang.String r12 = "\\\\"
            r13 = 0
            java.lang.String r16 = kotlin.text.StringsKt.replace$default(r10, r11, r12, r13, r14, r15)
            r20 = 4
            r21 = 0
            java.lang.String r17 = "\n"
            java.lang.String r18 = "\\n"
            r19 = 0
            java.lang.String r10 = kotlin.text.StringsKt.replace$default(r16, r17, r18, r19, r20, r21)
            java.lang.String r11 = "\r"
            java.lang.String r12 = "\\r"
            java.lang.String r4 = kotlin.text.StringsKt.replace$default(r10, r11, r12, r13, r14, r15)
            int r5 = r3.length()
            if (r2 >= r5) goto L13e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r8)
            byte[] r6 = r22.getData$okio()
            int r6 = r6.length
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " text="
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            goto L155
        L13e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[text="
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.StringBuilder r5 = r5.append(r9)
            java.lang.String r5 = r5.toString()
        L155:
            return r5
    }

    public static final java.lang.String commonUtf8(okio.ByteString r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            java.lang.String r1 = r3.getUtf8$okio()
            if (r1 != 0) goto L17
            byte[] r2 = r3.internalArray$okio()
            java.lang.String r1 = okio._JvmPlatformKt.toUtf8String(r2)
            r3.setUtf8$okio(r1)
        L17:
            return r1
    }

    public static final void commonWrite(okio.ByteString r1, okio.Buffer r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r0 = r1.getData$okio()
            r2.write(r0, r3, r4)
            return
    }

    private static final int decodeHexDigit(char r3) {
            r0 = 48
            r1 = 1
            r2 = 0
            if (r0 > r3) goto Ld
            r0 = 58
            if (r3 >= r0) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L13
            int r0 = r3 + (-48)
            goto L35
        L13:
            r0 = 97
            if (r0 > r3) goto L1d
            r0 = 103(0x67, float:1.44E-43)
            if (r3 >= r0) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r2
        L1e:
            if (r0 == 0) goto L25
            int r0 = r3 + (-97)
            int r0 = r0 + 10
            goto L35
        L25:
            r0 = 65
            if (r0 > r3) goto L2e
            r0 = 71
            if (r3 >= r0) goto L2e
            goto L2f
        L2e:
            r1 = r2
        L2f:
            if (r1 == 0) goto L36
            int r0 = r3 + (-65)
            int r0 = r0 + 10
        L35:
            return r0
        L36:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected hex digit: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final char[] getHEX_DIGIT_CHARS() {
            char[] r0 = okio.internal.ByteString.HEX_DIGIT_CHARS
            return r0
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
            return
    }
}
