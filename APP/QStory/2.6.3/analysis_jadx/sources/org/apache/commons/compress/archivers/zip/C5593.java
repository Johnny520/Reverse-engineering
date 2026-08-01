package org.apache.commons.compress.archivers.zip;

import com.android.dx.io.Opcodes;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.Character;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;
import p375.AbstractC8978;
import p376.AbstractC8985;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5593 extends AbstractC8978 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final byte[] f15388;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final byte[] f15389;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final byte[] f15390;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final byte[] f15391;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final byte[] f15392;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ByteArrayInputStream f15393;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f15394;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Inflater f15395;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f15396;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f15397;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f15398;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ByteBuffer f15399;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C5594 f15400;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5615 f15401;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final byte[] f15387 = ZipLong.LFH_SIG.getBytes();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final byte[] f15386 = ZipLong.CFH_SIG.getBytes();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final byte[] f15385 = ZipLong.DD_SIG.getBytes();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final byte[] f15384 = {65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50};

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final BigInteger f15383 = BigInteger.valueOf(Long.MAX_VALUE);

    /* JADX WARN: Illegal instructions before constructor call */
    public C5593(BufferedInputStream bufferedInputStream) {
        Charset charsetDefaultCharset;
        String strName = StandardCharsets.UTF_8.name();
        super(bufferedInputStream, strName);
        this.f15395 = new Inflater(true);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(512);
        this.f15399 = byteBufferAllocate;
        this.f15392 = new byte[30];
        this.f15391 = new byte[1024];
        this.f15390 = new byte[2];
        this.f15389 = new byte[4];
        this.f15388 = new byte[16];
        ((FilterInputStream) this).in = new PushbackInputStream(bufferedInputStream, byteBufferAllocate.capacity());
        C5615 c5615 = AbstractC5590.f15378;
        try {
            charsetDefaultCharset = Charset.defaultCharset();
            if (strName != null) {
                charsetDefaultCharset = Charset.forName(strName);
            }
        } catch (IllegalArgumentException | NullPointerException unused) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        this.f15401 = new C5615(charsetDefaultCharset);
        this.f15396 = true;
        this.f15399.limit(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15397) {
            return;
        }
        this.f15397 = true;
        try {
            ((FilterInputStream) this).in.close();
        } finally {
            this.f15395.end();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0172  */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r21, int r22, int r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.C5593.read(byte[], int, int):int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            C5925.m11310("Negative skip value");
            return 0L;
        }
        while (j2 < j) {
            long length = j - j2;
            byte[] bArr = this.f15391;
            if (bArr.length <= length) {
                length = bArr.length;
            }
            int i = read(bArr, 0, (int) length);
            if (i == -1) {
                break;
            }
            j2 += (long) i;
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.apache.commons.compress.archivers.zip.C5585 m10957() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.C5593.m10957():org.apache.commons.compress.archivers.zip.飘花落叶言子世楪哲兰苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m10958() throws EOFException {
        Character.UnicodeBlock unicodeBlockOf;
        long compressedSize = this.f15400.f15407.getCompressedSize() - this.f15400.f15403;
        while (compressedSize > 0) {
            long j = ((FilterInputStream) this).in.read(this.f15399.array(), 0, (int) Math.min(this.f15399.capacity(), compressedSize));
            if (j < 0) {
                StringBuilder sb = new StringBuilder("Truncated ZIP entry: ");
                char[] charArray = this.f15400.f15407.getName().toCharArray();
                char[] cArrCopyOf = charArray.length <= 255 ? charArray : Arrays.copyOf(charArray, Opcodes.CONST_METHOD_TYPE);
                if (charArray.length > 255) {
                    Arrays.fill(cArrCopyOf, Opcodes.INVOKE_CUSTOM, Opcodes.CONST_METHOD_TYPE, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                }
                StringBuilder sb2 = new StringBuilder();
                for (char c : cArrCopyOf) {
                    if (Character.isISOControl(c) || (unicodeBlockOf = Character.UnicodeBlock.of(c)) == null || unicodeBlockOf == Character.UnicodeBlock.SPECIALS) {
                        sb2.append('?');
                    } else {
                        sb2.append(c);
                    }
                }
                sb.append(sb2.toString());
                throw new EOFException(sb.toString());
            }
            m14580(j);
            compressedSize -= j;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m10959(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            C5925.m11306();
            return;
        }
        while (j2 < j) {
            long length = j - j2;
            InputStream inputStream = ((FilterInputStream) this).in;
            byte[] bArr = this.f15391;
            if (bArr.length <= length) {
                length = bArr.length;
            }
            int i = inputStream.read(bArr, 0, (int) length);
            if (i == -1) {
                return;
            }
            long j3 = i;
            m14580(j3);
            j2 += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        top.suzhelan.qstory.hook.item.C5925.m11307("Truncated ZIP file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v2 int) = (r3v1 int), (r3v9 int) binds: [B:6:0x0012, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10960() throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r6.f15394
            if (r0 <= 0) goto Le
            long r0 = (long) r0
            r2 = 46
            long r0 = r0 * r2
            r2 = 30
            long r0 = r0 - r2
            r6.m10959(r0)
        Le:
            r0 = 0
            r1 = -1
            r2 = r0
            r3 = r1
        L12:
            if (r2 != 0) goto L1a
            int r3 = r6.m10964()
            if (r3 <= r1) goto L66
        L1a:
            byte[] r2 = org.apache.commons.compress.archivers.zip.AbstractC5592.f15381
            r4 = r2[r0]
            if (r3 != r4) goto L6c
            int r3 = r6.m10964()
            r4 = 1
            r5 = r2[r4]
            if (r3 == r5) goto L31
            if (r3 == r1) goto L66
            r2 = r2[r0]
            if (r3 != r2) goto L6c
        L2f:
            r2 = r4
            goto L12
        L31:
            int r3 = r6.m10964()
            r5 = 2
            r5 = r2[r5]
            if (r3 == r5) goto L41
            if (r3 == r1) goto L66
            r2 = r2[r0]
            if (r3 != r2) goto L6c
            goto L2f
        L41:
            int r3 = r6.m10964()
            if (r3 == r1) goto L66
            r5 = 3
            r5 = r2[r5]
            if (r3 != r5) goto L61
            r1 = 16
            r6.m10959(r1)
            byte[] r1 = r6.f15390
            r6.m10963(r1, r0)
            int r0 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r1)
            if (r0 < 0) goto L66
            long r0 = (long) r0
            r6.m10959(r0)
            return
        L61:
            r2 = r2[r0]
            if (r3 != r2) goto L6c
            goto L2f
        L66:
            java.lang.String r6 = "Truncated ZIP file"
            top.suzhelan.qstory.hook.item.C5925.m11307(r6)
            return
        L6c:
            r2 = r0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.C5593.m10960():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m10961() throws IOException {
        byte[] bArr = this.f15389;
        m10963(bArr, 0);
        ZipLong zipLong = new ZipLong(bArr);
        if (ZipLong.DD_SIG.equals(zipLong)) {
            m10963(bArr, 0);
            zipLong = new ZipLong(bArr);
        }
        this.f15400.f15407.setCrc(zipLong.getValue());
        byte[] bArr2 = this.f15388;
        m10963(bArr2, 0);
        ZipLong zipLong2 = new ZipLong(bArr2, 8);
        if (!zipLong2.equals(ZipLong.CFH_SIG) && !zipLong2.equals(ZipLong.LFH_SIG)) {
            long longValue = ZipEightByteInteger.getLongValue(bArr2);
            if (longValue < 0) {
                throw new ZipException("broken archive, entry with negative compressed size");
            }
            this.f15400.f15407.setCompressedSize(longValue);
            long longValue2 = ZipEightByteInteger.getLongValue(bArr2, 8);
            if (longValue2 < 0) {
                throw new ZipException("broken archive, entry with negative size");
            }
            this.f15400.f15407.setSize(longValue2);
            return;
        }
        m10962(8, bArr2, 8);
        long value = ZipLong.getValue(bArr2);
        if (value < 0) {
            throw new ZipException("broken archive, entry with negative compressed size");
        }
        this.f15400.f15407.setCompressedSize(value);
        long value2 = ZipLong.getValue(bArr2, 4);
        if (value2 < 0) {
            throw new ZipException("broken archive, entry with negative size");
        }
        this.f15400.f15407.setSize(value2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m10962(int i, byte[] bArr, int i2) throws IOException {
        if (i < 0) {
            throw new IOException(String.format("Negative offset %,d into buffer", Integer.valueOf(i)));
        }
        ((PushbackInputStream) ((FilterInputStream) this).in).unread(bArr, i, i2);
        this.f25202 -= (long) i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m10963(byte[] bArr, int i) throws IOException {
        int i2;
        int i3;
        int length = bArr.length - i;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (length < 0 || i < 0 || (i2 = length + i) > bArr.length || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr2 = AbstractC8985.f25215;
        if (length == 0) {
            i3 = 0;
        } else {
            Objects.requireNonNull(inputStream);
            if (length < 0) {
                C5925.m11310(AbstractC6183.m11588(length, "Length must not be negative: "));
                return;
            }
            int i4 = length;
            while (i4 > 0) {
                int i5 = inputStream.read(bArr, (length - i4) + i, i4);
                if (-1 == i5) {
                    break;
                } else {
                    i4 -= i5;
                }
            }
            i3 = length - i4;
        }
        m14580(i3);
        if (i3 < length) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int m10964() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            m14580(1L);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r4 = r1 - r5;
        java.lang.System.arraycopy(r2, r5, r2, 0, r4);
        m10963(r2, r4);
        java.lang.System.arraycopy(r2, 0, r0, 0, r1);
        m10963(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        r1 = new org.apache.commons.compress.archivers.zip.ZipLong(r0);
        r2 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r1.equals(r2) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r1.equals(org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r1.equals(r2) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        java.lang.System.arraycopy(r0, 4, r0, 0, r0.length - 4);
        m10963(r0, r0.length - 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        throw new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.SPLITTING);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m10965() throws java.io.IOException {
        /*
            r9 = this;
            byte[] r0 = r9.f15392
            r1 = 30
            r2 = 22
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = new byte[r1]
            r3 = 0
            r9.m10963(r2, r3)
            r4 = r3
        L11:
            r5 = r3
        L12:
            r6 = 4092(0xffc, float:5.734E-42)
            if (r4 > r6) goto L8f
            int r7 = r1 + (-4)
            if (r5 > r7) goto L8f
            org.apache.commons.compress.archivers.zip.ZipLong r6 = new org.apache.commons.compress.archivers.zip.ZipLong     // Catch: java.io.EOFException -> La4
            r6.<init>(r2, r5)     // Catch: java.io.EOFException -> La4
            org.apache.commons.compress.archivers.zip.ZipLong r7 = org.apache.commons.compress.archivers.zip.ZipLong.LFH_SIG     // Catch: java.io.EOFException -> La4
            boolean r7 = r6.equals(r7)     // Catch: java.io.EOFException -> La4
            if (r7 != 0) goto L4f
            org.apache.commons.compress.archivers.zip.ZipLong r7 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER     // Catch: java.io.EOFException -> La4
            boolean r7 = r6.equals(r7)     // Catch: java.io.EOFException -> La4
            if (r7 != 0) goto L4f
            org.apache.commons.compress.archivers.zip.ZipLong r7 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG     // Catch: java.io.EOFException -> La4
            boolean r7 = r6.equals(r7)     // Catch: java.io.EOFException -> La4
            if (r7 == 0) goto L38
            goto L4f
        L38:
            org.apache.commons.compress.archivers.zip.ZipLong r7 = new org.apache.commons.compress.archivers.zip.ZipLong     // Catch: java.io.EOFException -> La4
            byte[] r8 = org.apache.commons.compress.archivers.zip.AbstractC5592.f15381     // Catch: java.io.EOFException -> La4
            r7.<init>(r8)     // Catch: java.io.EOFException -> La4
            boolean r6 = r6.equals(r7)     // Catch: java.io.EOFException -> La4
            if (r6 == 0) goto L4a
            int r1 = r1 - r5
            r9.m10962(r5, r2, r1)     // Catch: java.io.EOFException -> La4
            return r3
        L4a:
            int r5 = r5 + 1
            int r4 = r4 + 1
            goto L12
        L4f:
            int r4 = r1 - r5
            java.lang.System.arraycopy(r2, r5, r2, r3, r4)     // Catch: java.io.EOFException -> La4
            r9.m10963(r2, r4)     // Catch: java.io.EOFException -> La4
            java.lang.System.arraycopy(r2, r3, r0, r3, r1)     // Catch: java.io.EOFException -> La4
            r9.m10963(r0, r1)     // Catch: java.io.EOFException -> La4
            org.apache.commons.compress.archivers.zip.ZipLong r1 = new org.apache.commons.compress.archivers.zip.ZipLong
            r1.<init>(r0)
            org.apache.commons.compress.archivers.zip.ZipLong r2 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L87
            org.apache.commons.compress.archivers.zip.ZipLong r4 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER
            boolean r4 = r1.equals(r4)
            r5 = 1
            if (r4 != 0) goto L7b
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7a
            goto L7b
        L7a:
            return r5
        L7b:
            int r1 = r0.length
            r2 = 4
            int r1 = r1 - r2
            java.lang.System.arraycopy(r0, r2, r0, r3, r1)
            int r1 = r0.length
            int r1 = r1 - r2
            r9.m10963(r0, r1)
            return r5
        L87:
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r9 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.SPLITTING
            r9.<init>(r0)
            throw r9
        L8f:
            if (r4 >= r6) goto L9c
            int r5 = r1 + (-3)
            r6 = 3
            java.lang.System.arraycopy(r2, r5, r2, r3, r6)     // Catch: java.io.EOFException -> La4
            r9.m10963(r2, r6)     // Catch: java.io.EOFException -> La4
            goto L11
        L9c:
            java.util.zip.ZipException r9 = new java.util.zip.ZipException     // Catch: java.io.EOFException -> La4
            java.lang.String r0 = "Cannot find zip signature within the first 4096 bytes"
            r9.<init>(r0)     // Catch: java.io.EOFException -> La4
            throw r9     // Catch: java.io.EOFException -> La4
        La4:
            java.util.zip.ZipException r9 = new java.util.zip.ZipException
            java.lang.String r0 = "Cannot find zip signature within the file"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.C5593.m10965():boolean");
    }
}
