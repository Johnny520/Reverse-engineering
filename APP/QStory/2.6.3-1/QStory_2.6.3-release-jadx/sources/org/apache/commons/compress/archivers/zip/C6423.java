package org.apache.commons.compress.archivers.zip;

import com.android.p002dx.p005io.Opcodes;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.apache.commons.compress.compressors.deflate64.C6453;
import org.apache.commons.compress.compressors.zstandard.C6456;
import p025.AbstractC7012;
import p391.AbstractC9807;
import p392.AbstractC9814;
import p394.C9823;
import p395.AbstractC9825;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6423 extends AbstractC9807 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final byte[] f15733;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final byte[] f15734;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final byte[] f15735;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final byte[] f15736;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final byte[] f15737;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ByteArrayInputStream f15738;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f15739;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Inflater f15740;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f15741;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f15742;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f15743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ByteBuffer f15744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C6424 f15745;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6445 f15746;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final byte[] f15732 = ZipLong.LFH_SIG.getBytes();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final byte[] f15731 = ZipLong.CFH_SIG.getBytes();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final byte[] f15730 = ZipLong.DD_SIG.getBytes();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final byte[] f15729 = {65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50};

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final BigInteger f15728 = BigInteger.valueOf(Long.MAX_VALUE);

    /* JADX WARN: Illegal instructions before constructor call */
    public C6423(BufferedInputStream bufferedInputStream) {
        Charset charsetDefaultCharset;
        String strName = StandardCharsets.UTF_8.name();
        super(bufferedInputStream, strName);
        this.f15740 = new Inflater(true);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(512);
        this.f15744 = byteBufferAllocate;
        this.f15737 = new byte[30];
        this.f15736 = new byte[1024];
        this.f15735 = new byte[2];
        this.f15734 = new byte[4];
        this.f15733 = new byte[16];
        ((FilterInputStream) this).in = new PushbackInputStream(bufferedInputStream, byteBufferAllocate.capacity());
        C6445 c6445 = AbstractC6420.f15723;
        try {
            charsetDefaultCharset = Charset.defaultCharset();
            if (strName != null) {
                charsetDefaultCharset = Charset.forName(strName);
            }
        } catch (IllegalArgumentException | NullPointerException unused) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        this.f15746 = new C6445(charsetDefaultCharset);
        this.f15741 = true;
        this.f15744.limit(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15742) {
            return;
        }
        this.f15742 = true;
        try {
            ((FilterInputStream) this).in.close();
        } finally {
            this.f15740.end();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0172  */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        char c;
        int i4;
        int i5 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f15742) {
            C6755.m11866("The stream is closed");
            return 0;
        }
        C6424 c6424 = this.f15745;
        int i6 = -1;
        if (c6424 == null) {
            return -1;
        }
        if (i > bArr.length || i2 < 0 || i < 0 || bArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        C6415 c6415 = c6424.f15752;
        int i7 = AbstractC6411.f15702;
        if (c6415.f15713.f15825) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.ENCRYPTION, c6415);
        }
        if (!AbstractC6411.m11501(c6415)) {
            ZipMethod methodByCode = ZipMethod.getMethodByCode(c6415.f15716);
            if (methodByCode == null) {
                throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.METHOD, c6415);
            }
            throw new UnsupportedZipFeatureException(methodByCode, c6415);
        }
        C6415 c64152 = this.f15745.f15752;
        int i8 = c64152.f15716;
        if (c64152.f15713.f15824 && i8 != 8 && i8 != ZipMethod.ENHANCED_DEFLATED.getCode() && !ZipMethod.isZstd(i8) && i8 != ZipMethod.XZ.getCode()) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR, this.f15745.f15752);
        }
        C6415 c64153 = this.f15745.f15752;
        int i9 = c64153.f15716;
        if (c64153.getCompressedSize() == -1 && i9 != 8 && i9 != ZipMethod.ENHANCED_DEFLATED.getCode()) {
            boolean z = c64153.f15713.f15824;
            if (!ZipMethod.isZstd(i9) && i9 != ZipMethod.XZ.getCode()) {
                throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE, this.f15745.f15752);
            }
        }
        C6424 c64242 = this.f15745;
        C6415 c64154 = c64242.f15752;
        int i10 = c64154.f15716;
        if (i10 == 0) {
            if (c64242.f15751) {
                if (this.f15738 == null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int i11 = this.f15745.f15750 ? 20 : 12;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 == 0) {
                        int i14 = ((FilterInputStream) this).in.read(this.f15744.array(), i13, 512 - i13);
                        if (i14 <= 0) {
                            int i15 = i5;
                            C6755.m11866("Truncated ZIP file");
                            return i15;
                        }
                        int i16 = i14 + i13;
                        if (i16 < 4) {
                            i13 = i16;
                        } else {
                            ByteBuffer byteBuffer = this.f15744;
                            int i17 = i5;
                            int i18 = i17;
                            while (i17 == 0 && i18 < i16 - 4) {
                                byte b = byteBuffer.array()[i18];
                                byte[] bArr2 = f15732;
                                if (b == bArr2[i5] && byteBuffer.array()[i18 + 1] == bArr2[1]) {
                                    if (i18 >= i11) {
                                        c = 2;
                                        if (byteBuffer.array()[i18 + 2] == bArr2[2] && byteBuffer.array()[i18 + 3] == bArr2[3]) {
                                            i4 = i18 - i11;
                                            i17 = 1;
                                            if (i17 != 0) {
                                                m11521(i4, byteBuffer.array(), i16 - i4);
                                                byteArrayOutputStream.write(byteBuffer.array(), 0, i4);
                                                m11520();
                                            }
                                        }
                                    } else {
                                        c = 2;
                                    }
                                    int i19 = i18 + 2;
                                    byte b2 = byteBuffer.array()[i19];
                                    byte[] bArr3 = f15731;
                                    if (b2 != bArr3[c] || byteBuffer.array()[i18 + 3] != bArr3[3]) {
                                        byte b3 = byteBuffer.array()[i19];
                                        byte[] bArr4 = f15730;
                                        if (b3 == bArr4[c] && byteBuffer.array()[i18 + 3] == bArr4[3]) {
                                            i4 = i18;
                                        } else {
                                            i4 = i18;
                                            if (i17 != 0) {
                                            }
                                        }
                                    }
                                    i17 = 1;
                                    if (i17 != 0) {
                                    }
                                }
                                i18++;
                                i5 = 0;
                            }
                            if (i17 == 0) {
                                ByteBuffer byteBuffer2 = this.f15744;
                                int i20 = (i16 - i11) - 3;
                                if (i20 > 0) {
                                    i3 = 0;
                                    byteArrayOutputStream.write(byteBuffer2.array(), 0, i20);
                                    i16 = i11 + 3;
                                    System.arraycopy(byteBuffer2.array(), i20, byteBuffer2.array(), 0, i16);
                                } else {
                                    i3 = 0;
                                }
                                i13 = i16;
                            } else {
                                i3 = 0;
                            }
                            i12 = i17;
                            i5 = i3;
                        }
                    }
                    if (this.f15745.f15752.getCompressedSize() != this.f15745.f15752.f15714) {
                        throw new ZipException("compressed and uncompressed size don't match while reading a stored entry using data descriptor. Either the archive is broken or it cannot be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See https://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray.length != this.f15745.f15752.f15714) {
                        throw new ZipException("actual and claimed size don't match while reading a stored entry using data descriptor. Either the archive is broken or it cannot be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See https://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile");
                    }
                    this.f15738 = new ByteArrayInputStream(byteArray);
                }
                i6 = this.f15738.read(bArr, i, i2);
            } else {
                long j = c64154.f15714;
                if (c64242.f15749 < j) {
                    if (this.f15744.position() >= this.f15744.limit()) {
                        this.f15744.position(0);
                        int i21 = ((FilterInputStream) this).in.read(this.f15744.array());
                        ByteBuffer byteBuffer3 = this.f15744;
                        if (i21 == -1) {
                            byteBuffer3.limit(0);
                            C6755.m11866("Truncated ZIP file");
                            return 0;
                        }
                        byteBuffer3.limit(i21);
                        long j2 = i21;
                        m15139(j2);
                        this.f15745.f15748 += j2;
                    }
                    int iMin = Math.min(this.f15744.remaining(), i2);
                    long j3 = j - this.f15745.f15749;
                    if (j3 < iMin) {
                        iMin = (int) j3;
                    }
                    i6 = iMin;
                    this.f15744.get(bArr, i, i6);
                    this.f15745.f15749 += (long) i6;
                }
            }
        } else if (i10 == 8) {
            int iInflate = 0;
            while (true) {
                if (!this.f15740.needsInput()) {
                    try {
                        iInflate = this.f15740.inflate(bArr, i, i2);
                        if (iInflate != 0 || !this.f15740.needsInput()) {
                            break;
                        }
                    } catch (DataFormatException e) {
                        throw ((ZipException) new ZipException(e.getMessage()).initCause(e));
                    }
                } else {
                    if (this.f15742) {
                        C6755.m11866("The stream is closed");
                        return 0;
                    }
                    int i22 = ((FilterInputStream) this).in.read(this.f15744.array());
                    if (i22 > 0) {
                        this.f15744.limit(i22);
                        m15139(this.f15744.limit());
                        this.f15740.setInput(this.f15744.array(), 0, this.f15744.limit());
                    }
                    if (i22 > 0) {
                        this.f15745.f15748 += (long) this.f15744.limit();
                        iInflate = this.f15740.inflate(bArr, i, i2);
                        if (iInflate != 0) {
                            break;
                        }
                        break;
                        break;
                    }
                    if (i22 == -1) {
                        iInflate = -1;
                    }
                }
            }
            if (iInflate > 0) {
                i6 = iInflate;
            } else if (!this.f15740.finished()) {
                if (this.f15740.needsDictionary()) {
                    throw new ZipException("This archive needs a preset dictionary which is not supported by Commons Compress.");
                }
                if (iInflate == -1) {
                    C6755.m11866("Truncated ZIP file");
                    return 0;
                }
                i6 = iInflate;
            }
        } else {
            if (i10 != ZipMethod.UNSHRINKING.getCode() && i10 != ZipMethod.IMPLODING.getCode() && i10 != ZipMethod.ENHANCED_DEFLATED.getCode() && i10 != ZipMethod.BZIP2.getCode() && !ZipMethod.isZstd(i10) && i10 != ZipMethod.XZ.getCode()) {
                throw new UnsupportedZipFeatureException(ZipMethod.getMethodByCode(i10), this.f15745.f15752);
            }
            i6 = this.f15745.f15753.read(bArr, i, i2);
        }
        if (i6 >= 0) {
            this.f15745.f15747.update(bArr, i, i6);
        }
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            C6755.m11869("Negative skip value");
            return 0L;
        }
        while (j2 < j) {
            long length = j - j2;
            byte[] bArr = this.f15736;
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
    */
    public final C6415 m11516() throws IOException {
        long j;
        boolean z;
        ZipLong zipLong;
        ZipLong zipLong2;
        long bytesRead;
        boolean z2 = this.f15742;
        String strM11535 = null;
        if (!z2 && !this.f15743) {
            C6424 c6424 = this.f15745;
            if (c6424 != null) {
                Inflater inflater = this.f15740;
                ByteBuffer byteBuffer = this.f15744;
                if (z2) {
                    C6755.m11866("The stream is closed");
                    return null;
                }
                if (c6424.f15748 <= c6424.f15752.getCompressedSize() && !this.f15745.f15751) {
                    m11517();
                    j = 0;
                } else {
                    if (skip(Long.MAX_VALUE) < 0) {
                        C6755.m11870("Can't read the remainder of the stream");
                        return null;
                    }
                    C6424 c64242 = this.f15745;
                    if (c64242.f15752.f15716 == 8) {
                        bytesRead = inflater.getBytesRead();
                        j = 0;
                        if (this.f15745.f15748 >= 4294967296L) {
                            while (true) {
                                long j2 = bytesRead + 4294967296L;
                                if (j2 > this.f15745.f15748) {
                                    break;
                                }
                                bytesRead = j2;
                            }
                        }
                    } else {
                        j = 0;
                        bytesRead = c64242.f15749;
                    }
                    int i = (int) (this.f15745.f15748 - bytesRead);
                    if (i > 0) {
                        m11521(byteBuffer.limit() - i, byteBuffer.array(), i);
                        this.f15745.f15748 -= (long) i;
                    }
                    C6424 c64243 = this.f15745;
                    if (c64243.f15748 <= c64243.f15752.getCompressedSize() && !this.f15745.f15751) {
                        m11517();
                    }
                }
                if (this.f15738 == null && this.f15745.f15751) {
                    m11520();
                }
                inflater.reset();
                byteBuffer.clear().flip();
                this.f15745 = null;
                this.f15738 = null;
                z = false;
            } else {
                j = 0;
                z = true;
            }
            long j3 = this.f25547;
            try {
                if (!z) {
                    m11522(this.f15737, 0);
                } else if (!m11524()) {
                    this.f15743 = true;
                    m11519();
                    return null;
                }
                ZipLong zipLong3 = new ZipLong(this.f15737);
                if (!zipLong3.equals(ZipLong.LFH_SIG)) {
                    if (!zipLong3.equals(ZipLong.CFH_SIG) && !zipLong3.equals(ZipLong.AED_SIG)) {
                        byte[] bArr = this.f15737;
                        BigInteger value = ZipEightByteInteger.getValue(bArr);
                        long length = 8 - bArr.length;
                        byte[] bArr2 = f15729;
                        BigInteger bigIntegerAdd = value.add(BigInteger.valueOf(length - ((long) bArr2.length)));
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        if (bigIntegerAdd.signum() < 0) {
                            int length3 = bArr.length + bigIntegerAdd.intValue();
                            if (length3 >= 8) {
                                int iAbs = Math.abs(bigIntegerAdd.intValue());
                                System.arraycopy(bArr, length3, bArr3, 0, Math.min(iAbs, length2));
                                if (iAbs < length2) {
                                    m11522(bArr3, iAbs);
                                }
                            } else if (!zEquals) {
                                throw new ZipException(String.format("Unexpected record signature: 0x%x", Long.valueOf(zipLong3.getValue())));
                            }
                        } else {
                            while (true) {
                                BigInteger bigInteger = f15728;
                                if (bigIntegerAdd.compareTo(bigInteger) <= 0) {
                                    break;
                                }
                                m11518(Long.MAX_VALUE);
                                bigIntegerAdd = bigIntegerAdd.add(bigInteger.negate());
                            }
                            m11518(bigIntegerAdd.longValue());
                            m11522(bArr3, 0);
                        }
                        zEquals = Arrays.equals(bArr3, bArr2);
                        if (!zEquals) {
                        }
                    }
                    this.f15743 = true;
                    m11519();
                    return null;
                }
                this.f15745 = new C6424();
                int value2 = ZipShort.getValue(this.f15737, 4);
                C6415 c6415 = this.f15745.f15752;
                int i2 = AbstractC6409.f15700;
                c6415.f15715 = (value2 >> 8) & 15;
                int value3 = ZipShort.getValue(this.f15737, 6);
                C6447 c6447 = new C6447();
                boolean z3 = (value3 & 8) != 0;
                c6447.f15824 = z3;
                boolean z4 = (value3 & 2048) != 0;
                c6447.f15826 = z4;
                boolean z5 = (value3 & 64) != 0;
                c6447.f15822 = z5;
                if (z5) {
                    c6447.f15825 = true;
                }
                c6447.f15825 = (value3 & 1) != 0;
                c6447.f15821 = (value3 & 2) != 0 ? 8192 : 4096;
                c6447.f15823 = (value3 & 4) != 0 ? 3 : 2;
                C6445 c6445 = z4 ? AbstractC6420.f15723 : this.f15746;
                C6424 c64244 = this.f15745;
                c64244.f15751 = z3;
                C6415 c64152 = c64244.f15752;
                c64152.f15713 = c6447;
                c64152.setMethod(ZipShort.getValue(this.f15737, 8));
                this.f15745.f15752.setTime(AbstractC6411.m11504(ZipLong.getValue(this.f15737, 10)));
                C6424 c64245 = this.f15745;
                if (c64245.f15751) {
                    zipLong = null;
                    zipLong2 = null;
                } else {
                    c64245.f15752.setCrc(ZipLong.getValue(this.f15737, 14));
                    zipLong = new ZipLong(this.f15737, 18);
                    zipLong2 = new ZipLong(this.f15737, 22);
                }
                int value4 = ZipShort.getValue(this.f15737, 26);
                int value5 = ZipShort.getValue(this.f15737, 28);
                byte[] bArrM15158 = AbstractC9825.m15158(((FilterInputStream) this).in, value4);
                m15139(bArrM15158.length);
                if (bArrM15158.length < value4) {
                    throw new EOFException();
                }
                this.f15745.f15752.m11512(c6445.m11535(bArrM15158));
                if (z4) {
                    C6415 c64153 = this.f15745.f15752;
                    ZipArchiveEntry$NameSource zipArchiveEntry$NameSource = ZipArchiveEntry$NameSource.NAME;
                    c64153.getClass();
                }
                byte[] bArrM151582 = AbstractC9825.m15158(((FilterInputStream) this).in, value5);
                m15139(bArrM151582.length);
                if (bArrM151582.length < value5) {
                    throw new EOFException();
                }
                try {
                    this.f15745.f15752.setExtra(bArrM151582);
                    if (!z4 && this.f15741) {
                        C6415 c64154 = this.f15745.f15752;
                        InterfaceC6419 interfaceC6419M11509 = c64154.m11509(C6441.f15808);
                        C6441 c6441 = interfaceC6419M11509 instanceof C6441 ? (C6441) interfaceC6419M11509 : null;
                        if (c6441 != null) {
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArrM15158);
                            if (crc32.getValue() == c6441.f15773) {
                                try {
                                    C6445 c64452 = AbstractC6420.f15723;
                                    byte[] bArr4 = c6441.f15771;
                                    strM11535 = c64452.m11535(bArr4 != null ? Arrays.copyOf(bArr4, bArr4.length) : null);
                                } catch (IOException unused) {
                                }
                            }
                        }
                        if (strM11535 != null) {
                            c64154.m11512(strM11535);
                            ZipArchiveEntry$NameSource zipArchiveEntry$NameSource2 = ZipArchiveEntry$NameSource.NAME;
                        }
                    }
                    InterfaceC6419 interfaceC6419M115092 = this.f15745.f15752.m11509(C6417.f15717);
                    if (interfaceC6419M115092 != null && !(interfaceC6419M115092 instanceof C6417)) {
                        throw new ZipException("archive contains unparseable zip64 extra field");
                    }
                    C6417 c6417 = (C6417) interfaceC6419M115092;
                    C6424 c64246 = this.f15745;
                    c64246.f15750 = c6417 != null;
                    if (!c64246.f15751) {
                        if (c6417 != null) {
                            ZipLong zipLong4 = ZipLong.ZIP64_MAGIC;
                            if (zipLong4.equals(zipLong) || zipLong4.equals(zipLong2)) {
                                ZipEightByteInteger zipEightByteInteger = c6417.f15719;
                                if (zipEightByteInteger == null || c6417.f15721 == null) {
                                    throw new ZipException("archive contains corrupted zip64 extra field");
                                }
                                long longValue = zipEightByteInteger.getLongValue();
                                if (longValue < j) {
                                    throw new ZipException("broken archive, entry with negative compressed size");
                                }
                                this.f15745.f15752.setCompressedSize(longValue);
                                long longValue2 = c6417.f15721.getLongValue();
                                if (longValue2 < j) {
                                    throw new ZipException("broken archive, entry with negative size");
                                }
                                this.f15745.f15752.setSize(longValue2);
                            } else if (zipLong != null && zipLong2 != null) {
                                if (zipLong.getValue() < j) {
                                    throw new ZipException("broken archive, entry with negative compressed size");
                                }
                                this.f15745.f15752.setCompressedSize(zipLong.getValue());
                                if (zipLong2.getValue() < j) {
                                    throw new ZipException("broken archive, entry with negative size");
                                }
                                this.f15745.f15752.setSize(zipLong2.getValue());
                            }
                        }
                    }
                    C6415 c64155 = this.f15745.f15752;
                    c64155.f15710 = j3;
                    c64155.f15711 = this.f25547;
                    ZipMethod methodByCode = ZipMethod.getMethodByCode(c64155.f15716);
                    if (this.f15745.f15752.getCompressedSize() != -1) {
                        C6415 c64156 = this.f15745.f15752;
                        if (!c64156.f15713.f15825 && AbstractC6411.m11501(c64156) && methodByCode != ZipMethod.STORED && methodByCode != ZipMethod.DEFLATED) {
                            C6413 c6413 = new C6413(this, ((FilterInputStream) this).in, this.f15745.f15752.getCompressedSize());
                            switch (AbstractC6414.f15705[methodByCode.ordinal()]) {
                                case 1:
                                    this.f15745.f15753 = new C6432(c6413);
                                    break;
                                case 2:
                                    try {
                                        C6424 c64247 = this.f15745;
                                        C6447 c64472 = c64247.f15752.f15713;
                                        c64247.f15753 = new C6427(c64472.f15821, c64472.f15823, c6413);
                                    } catch (IllegalArgumentException e) {
                                        throw new IOException("bad IMPLODE data", e);
                                    }
                                    break;
                                case 3:
                                    this.f15745.f15753 = new C9823(c6413);
                                    break;
                                case 4:
                                    this.f15745.f15753 = new C6453(c6413);
                                    break;
                                case 5:
                                case 6:
                                    this.f15745.f15753 = new C6456(c6413);
                                    break;
                            }
                        }
                    } else if (methodByCode == ZipMethod.ENHANCED_DEFLATED) {
                        this.f15745.f15753 = new C6453(((FilterInputStream) this).in);
                    }
                    this.f15739++;
                    return this.f15745.f15752;
                } catch (RuntimeException e2) {
                    throw ((ZipException) new ZipException("Invalid extra data in entry " + this.f15745.f15752.getName()).initCause(e2));
                }
            } catch (EOFException unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11517() throws EOFException {
        Character.UnicodeBlock unicodeBlockOf;
        long compressedSize = this.f15745.f15752.getCompressedSize() - this.f15745.f15748;
        while (compressedSize > 0) {
            long j = ((FilterInputStream) this).in.read(this.f15744.array(), 0, (int) Math.min(this.f15744.capacity(), compressedSize));
            if (j < 0) {
                StringBuilder sb = new StringBuilder("Truncated ZIP entry: ");
                char[] charArray = this.f15745.f15752.getName().toCharArray();
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
            m15139(j);
            compressedSize -= j;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m11518(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            C6755.m11865();
            return;
        }
        while (j2 < j) {
            long length = j - j2;
            InputStream inputStream = ((FilterInputStream) this).in;
            byte[] bArr = this.f15736;
            if (bArr.length <= length) {
                length = bArr.length;
            }
            int i = inputStream.read(bArr, 0, (int) length);
            if (i == -1) {
                return;
            }
            long j3 = i;
            m15139(j3);
            j2 += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        top.suzhelan.qstory.hook.item.C6755.m11866("Truncated ZIP file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v2 int) = (r3v1 int), (r3v9 int) binds: [B:6:0x0012, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11519() throws IOException {
        int i = this.f15739;
        if (i > 0) {
            m11518((((long) i) * 46) - 30);
        }
        boolean z = false;
        int iM11523 = -1;
        while (true) {
            if (!z) {
                iM11523 = m11523();
                if (iM11523 <= -1) {
                    break;
                }
            } else {
                byte[] bArr = AbstractC6422.f15726;
                if (iM11523 == bArr[0]) {
                    iM11523 = m11523();
                    if (iM11523 == bArr[1]) {
                        iM11523 = m11523();
                        if (iM11523 == bArr[2]) {
                            iM11523 = m11523();
                            if (iM11523 == -1) {
                                break;
                            }
                            if (iM11523 == bArr[3]) {
                                m11518(16L);
                                byte[] bArr2 = this.f15735;
                                m11522(bArr2, 0);
                                int value = ZipShort.getValue(bArr2);
                                if (value >= 0) {
                                    m11518(value);
                                    return;
                                }
                            } else if (iM11523 == bArr[0]) {
                                z = true;
                            }
                        } else if (iM11523 == -1) {
                            break;
                        } else if (iM11523 == bArr[0]) {
                            z = true;
                        }
                    } else if (iM11523 == -1) {
                        break;
                    } else if (iM11523 == bArr[0]) {
                        z = true;
                    }
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11520() throws IOException {
        byte[] bArr = this.f15734;
        m11522(bArr, 0);
        ZipLong zipLong = new ZipLong(bArr);
        if (ZipLong.DD_SIG.equals(zipLong)) {
            m11522(bArr, 0);
            zipLong = new ZipLong(bArr);
        }
        this.f15745.f15752.setCrc(zipLong.getValue());
        byte[] bArr2 = this.f15733;
        m11522(bArr2, 0);
        ZipLong zipLong2 = new ZipLong(bArr2, 8);
        if (!zipLong2.equals(ZipLong.CFH_SIG) && !zipLong2.equals(ZipLong.LFH_SIG)) {
            long longValue = ZipEightByteInteger.getLongValue(bArr2);
            if (longValue < 0) {
                throw new ZipException("broken archive, entry with negative compressed size");
            }
            this.f15745.f15752.setCompressedSize(longValue);
            long longValue2 = ZipEightByteInteger.getLongValue(bArr2, 8);
            if (longValue2 < 0) {
                throw new ZipException("broken archive, entry with negative size");
            }
            this.f15745.f15752.setSize(longValue2);
            return;
        }
        m11521(8, bArr2, 8);
        long value = ZipLong.getValue(bArr2);
        if (value < 0) {
            throw new ZipException("broken archive, entry with negative compressed size");
        }
        this.f15745.f15752.setCompressedSize(value);
        long value2 = ZipLong.getValue(bArr2, 4);
        if (value2 < 0) {
            throw new ZipException("broken archive, entry with negative size");
        }
        this.f15745.f15752.setSize(value2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11521(int i, byte[] bArr, int i2) throws IOException {
        if (i < 0) {
            throw new IOException(String.format("Negative offset %,d into buffer", Integer.valueOf(i)));
        }
        ((PushbackInputStream) ((FilterInputStream) this).in).unread(bArr, i, i2);
        this.f25547 -= (long) i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11522(byte[] bArr, int i) throws IOException {
        int i2;
        int i3;
        int length = bArr.length - i;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (length < 0 || i < 0 || (i2 = length + i) > bArr.length || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr2 = AbstractC9814.f25560;
        if (length == 0) {
            i3 = 0;
        } else {
            Objects.requireNonNull(inputStream);
            if (length < 0) {
                C6755.m11869(AbstractC7012.m12147(length, "Length must not be negative: "));
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
        m15139(i3);
        if (i3 < length) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int m11523() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            m15139(1L);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r4 = r1 - r5;
        java.lang.System.arraycopy(r2, r5, r2, 0, r4);
        m11522(r2, r4);
        java.lang.System.arraycopy(r2, 0, r0, 0, r1);
        m11522(r0, r1);
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
        m11522(r0, r0.length - 4);
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
    */
    public final boolean m11524() throws IOException {
        byte[] bArr = this.f15737;
        int iMin = Math.min(30, 22);
        byte[] bArr2 = new byte[iMin];
        m11522(bArr2, 0);
        int i = 0;
        loop0: while (true) {
            int i2 = 0;
            while (i <= 4092 && i2 <= iMin - 4) {
                try {
                    ZipLong zipLong = new ZipLong(bArr2, i2);
                    if (zipLong.equals(ZipLong.LFH_SIG) || zipLong.equals(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER) || zipLong.equals(ZipLong.DD_SIG)) {
                        break loop0;
                    }
                    if (zipLong.equals(new ZipLong(AbstractC6422.f15726))) {
                        m11521(i2, bArr2, iMin - i2);
                        return false;
                    }
                    i2++;
                    i++;
                } catch (EOFException unused) {
                    throw new ZipException("Cannot find zip signature within the file");
                }
            }
            if (i >= 4092) {
                throw new ZipException("Cannot find zip signature within the first 4096 bytes");
            }
            System.arraycopy(bArr2, iMin - 3, bArr2, 0, 3);
            m11522(bArr2, 3);
        }
    }
}
