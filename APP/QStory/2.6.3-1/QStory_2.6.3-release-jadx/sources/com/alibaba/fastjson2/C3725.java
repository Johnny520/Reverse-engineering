package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC3654;
import com.alibaba.fastjson2.util.AbstractC3660;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.android.p002dx.p005io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.protobuf.DescriptorProtos$Edition;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3725 extends AbstractC3730 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final long f9481;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final long f9482;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final int[] f9483;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f9484;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C3744 f9485;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public char[] f9486;

    static {
        int[] iArr = new int[256];
        int i = 0;
        while (i < 16) {
            short s = (short) (i < 10 ? i + 48 : i + 87);
            int i2 = 0;
            while (i2 < 16) {
                iArr[(i << 4) + i2] = (((short) (i2 < 10 ? i2 + 48 : i2 + 87)) << 16) | s;
                i2++;
            }
            i++;
        }
        if (AbstractC3687.f9276) {
            for (int i3 = 0; i3 < 256; i3++) {
                iArr[i3] = Integer.reverseBytes(iArr[i3] << 8);
            }
        }
        f9483 = iArr;
        char[] cArr = {'{', '\"', '$', Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL, 'e', 'f', '\"', ':'};
        Unsafe unsafe = AbstractC3687.f9266;
        long j = AbstractC3687.f9264;
        f9482 = unsafe.getLong(cArr, j);
        f9481 = unsafe.getLong(cArr, 8 + j);
        unsafe.getInt(cArr, j + 12);
        cArr[6] = '\'';
        unsafe.getInt(cArr, j + 12);
    }

    public C3725(C3728 c3728) {
        super(c3728, false, StandardCharsets.UTF_16);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        C3744 c3744 = AbstractC3766.f9644[iIdentityHashCode & (r0.length - 1)];
        this.f9485 = c3744;
        char[] cArr = (char[]) AbstractC3766.f9636.getAndSet(c3744, null);
        this.f9486 = cArr == null ? new char[8192] : cArr;
        this.f9484 = this.f9515 ? -2821266740684990248L : -2459565876494606883L;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
    public static long m6518(long j) {
        return ((j & 4278190080L) << 24) | (255 & j) | ((65280 & j) << 8) | ((16711680 & j) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲, reason: contains not printable characters */
    public static void m6519(int i, int i2, char[] cArr, int i3) {
        int i4 = i2 & Opcodes.CONST_METHOD_TYPE;
        int[] iArr = f9483;
        long jReverseBytes = ((long) iArr[i4]) | (((long) iArr[i3 & Opcodes.CONST_METHOD_TYPE]) << 32);
        Unsafe unsafe = AbstractC3687.f9266;
        long j = AbstractC3687.f9264 + (((long) i) << 1);
        if (AbstractC3687.f9276) {
            jReverseBytes = Long.reverseBytes(jReverseBytes << 8);
        }
        unsafe.putLong(cArr, j, jReverseBytes);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        char[] cArr = this.f9486;
        if (cArr.length > 8388608) {
            return;
        }
        AbstractC3766.f9636.lazySet(this.f9485, cArr);
    }

    public final String toString() {
        return new String(this.f9486, 0, this.f9514);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final void mo6520(byte[] bArr) {
        if (bArr == null) {
            mo6527();
            return;
        }
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9514;
        int iM12133 = AbstractC7012.m12133(bArr.length, 5, i, 2);
        char[] cArr = this.f9486;
        if (iM12133 > cArr.length) {
            m6560(iM12133);
            cArr = this.f9486;
        }
        int iM6268 = i + 1;
        cArr[i] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i2 != 0) {
                cArr[iM6268] = ',';
                iM6268++;
            }
            char c = this.f9519;
            if (z) {
                cArr[iM6268] = c;
                iM6268++;
            }
            iM6268 = AbstractC3682.m6268(cArr, iM6268, bArr[i2]);
            if (z) {
                cArr[iM6268] = c;
                iM6268++;
            }
        }
        cArr[iM6268] = ']';
        this.f9514 = iM6268 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public final void mo6521(LocalDate localDate) {
        if (localDate == null) {
            mo6527();
            return;
        }
        int i = this.f9514;
        int i2 = i + 18;
        char[] cArr = this.f9486;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        char c = this.f9519;
        cArr[i] = c;
        int iM6270 = AbstractC3682.m6270(cArr, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[iM6270] = c;
        this.f9514 = iM6270 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final void mo6522(Long l) {
        mo6523(l.longValue());
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final void mo6523(long j) {
        int i;
        long j2 = this.f9523.f9498;
        int i2 = this.f9514;
        int i3 = i2 + 23;
        char[] cArr = this.f9486;
        if (i3 > cArr.length) {
            m6560(i3);
            cArr = this.f9486;
        }
        boolean zM6613 = AbstractC3730.m6613(j, j2);
        char c = this.f9519;
        if (zM6613) {
            cArr[i2] = c;
            i2++;
        }
        int iM6277 = AbstractC3682.m6277(cArr, i2, j);
        if (!zM6613) {
            if ((512 & j2) != 0 && (j2 & 1099511627776L) == 0 && j >= -2147483648L && j <= 2147483647L) {
                i = iM6277 + 1;
                cArr[iM6277] = 'L';
            }
            this.f9514 = iM6277;
        }
        i = iM6277 + 1;
        cArr[iM6277] = c;
        iM6277 = i;
        this.f9514 = iM6277;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final void mo6524(byte b) {
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9514;
        int i2 = i + 7;
        char[] cArr = this.f9486;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        char c = this.f9519;
        if (z) {
            cArr[i] = c;
            i++;
        }
        int iM6268 = AbstractC3682.m6268(cArr, i, b);
        if (z) {
            cArr[iM6268] = c;
            iM6268++;
        }
        this.f9514 = iM6268;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final void mo6525(long[] jArr) {
        if (jArr == null) {
            mo6527();
            return;
        }
        int i = this.f9514;
        int length = (jArr.length * 23) + i + 2;
        char[] cArr = this.f9486;
        if (length > cArr.length) {
            m6560(length);
            cArr = this.f9486;
        }
        int iM6277 = i + 1;
        cArr[i] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            if (i2 != 0) {
                cArr[iM6277] = ',';
                iM6277++;
            }
            long j = jArr[i2];
            boolean zM6613 = AbstractC3730.m6613(j, this.f9523.f9498);
            char c = this.f9519;
            if (zM6613) {
                cArr[iM6277] = c;
                iM6277++;
            }
            iM6277 = AbstractC3682.m6277(cArr, iM6277, j);
            if (zM6613) {
                cArr[iM6277] = c;
                iM6277++;
            }
        }
        cArr[iM6277] = ']';
        this.f9514 = iM6277 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final void mo6526(char[] cArr) {
        int iM6567 = this.f9514;
        int length = cArr.length + iM6567 + 2;
        int i = this.f9518;
        byte b = this.f9509;
        int i2 = (i * b) + length;
        char[] cArr2 = this.f9486;
        if (i2 > cArr2.length) {
            m6560(i2);
            cArr2 = this.f9486;
        }
        if (this.f9517) {
            this.f9517 = false;
        } else {
            int i3 = iM6567 + 1;
            cArr2[iM6567] = ',';
            iM6567 = b != 0 ? m6567(i3, cArr2) : i3;
        }
        System.arraycopy(cArr, 0, cArr2, iM6567, cArr.length);
        this.f9514 = iM6567 + cArr.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final void mo6527() {
        int i = this.f9514;
        int i2 = i + 4;
        char[] cArr = this.f9486;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        AbstractC3682.m6305(i, cArr);
        this.f9514 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public final void mo6528(OffsetTime offsetTime) {
        int length;
        if (offsetTime == null) {
            mo6527();
            return;
        }
        ZoneOffset offset = offsetTime.getOffset();
        int i = this.f9514;
        int i2 = i + 28;
        char[] cArr = this.f9486;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        char c = this.f9519;
        cArr[i] = c;
        int iM6267 = AbstractC3682.m6267(cArr, i + 1, offsetTime.toLocalTime());
        if (offset.getTotalSeconds() == 0) {
            length = iM6267 + 1;
            cArr[iM6267] = 'Z';
        } else {
            String id = offset.getId();
            id.getChars(0, id.length(), cArr, iM6267);
            length = id.length() + iM6267;
        }
        cArr[length] = c;
        this.f9514 = length + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public final void mo6529(OffsetDateTime offsetDateTime) {
        int length;
        if (offsetDateTime == null) {
            mo6527();
            return;
        }
        int i = this.f9514;
        int i2 = i + 45;
        char[] cArr = this.f9486;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        char c = this.f9519;
        cArr[i] = c;
        LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
        LocalDate localDate = localDateTime.toLocalDate();
        int iM6270 = AbstractC3682.m6270(cArr, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[iM6270] = 'T';
        int iM6267 = AbstractC3682.m6267(cArr, iM6270 + 1, localDateTime.toLocalTime());
        ZoneOffset offset = offsetDateTime.getOffset();
        if (offset.getTotalSeconds() == 0) {
            length = iM6267 + 1;
            cArr[iM6267] = 'Z';
        } else {
            String id = offset.getId();
            id.getChars(0, id.length(), cArr, iM6267);
            length = id.length() + iM6267;
        }
        cArr[length] = c;
        this.f9514 = length + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void mo6530(short s) {
        int i;
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.f9514;
        int i3 = i2 + 7;
        char[] cArr = this.f9486;
        if (i3 > cArr.length) {
            m6560(i3);
            cArr = this.f9486;
        }
        char c = this.f9519;
        if (z) {
            cArr[i2] = c;
            i2++;
        }
        long[] jArr = AbstractC3682.f9231;
        int i4 = s;
        if (s < 0) {
            AbstractC3682.m6323(cArr, i2, SignatureVisitor.SUPER);
            i2++;
            i4 = -s;
        }
        if (i4 < 1000) {
            long j = jArr[i4 & 1023];
            byte b = (byte) j;
            if (b == 0) {
                AbstractC3682.m6326(i2, (int) (j >> 16), cArr);
                i2 += 2;
            } else if (b == 1) {
                AbstractC3682.m6323(cArr, i2, (char) (j >> 32));
                i2++;
            }
            AbstractC3682.m6323(cArr, i2, (char) (j >> 48));
            i = i2 + 1;
        } else {
            int i5 = (int) ((((long) i4) * 274877907) >> 38);
            long j2 = jArr[i5 & 1023];
            if (((byte) j2) == 1) {
                AbstractC3682.m6323(cArr, i2, (char) (j2 >> 32));
                i2++;
            }
            AbstractC3682.m6307(cArr, i2, (j2 >> 48) | (jArr[(i4 - (i5 * DescriptorProtos$Edition.EDITION_2023_VALUE)) & 1023] & (-65536)));
            i = i2 + 4;
        }
        if (z) {
            cArr[i] = c;
            i++;
        }
        this.f9514 = i;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final void mo6531(Integer num) {
        mo6533(num.intValue());
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void mo6532(int[] iArr) {
        if (iArr == null) {
            mo6527();
            return;
        }
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9514;
        int iM12133 = AbstractC7012.m12133(iArr.length, 13, i, 2);
        char[] cArr = this.f9486;
        if (iM12133 > cArr.length) {
            m6560(iM12133);
            cArr = this.f9486;
        }
        int iM6312 = i + 1;
        cArr[i] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 != 0) {
                cArr[iM6312] = ',';
                iM6312++;
            }
            char c = this.f9519;
            if (z) {
                cArr[iM6312] = c;
                iM6312++;
            }
            iM6312 = AbstractC3682.m6312(cArr, iM6312, iArr[i2]);
            if (z) {
                cArr[iM6312] = c;
                iM6312++;
            }
        }
        cArr[iM6312] = ']';
        this.f9514 = iM6312 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void mo6533(int i) {
        boolean z = (this.f9523.f9498 & 256) != 0;
        int i2 = this.f9514;
        int i3 = i2 + 13;
        char[] cArr = this.f9486;
        if (i3 > cArr.length) {
            m6560(i3);
            cArr = this.f9486;
        }
        char c = this.f9519;
        if (z) {
            cArr[i2] = c;
            i2++;
        }
        int iM6312 = AbstractC3682.m6312(cArr, i2, i);
        if (z) {
            cArr[iM6312] = c;
            iM6312++;
        }
        this.f9514 = iM6312;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final void mo6534(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final void mo6535(LocalDateTime localDateTime) {
        int i = this.f9514;
        int i2 = i + 38;
        char[] cArr = this.f9486;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        int i3 = i + 1;
        char c = this.f9519;
        cArr[i] = c;
        LocalDate localDate = localDateTime.toLocalDate();
        int iM6270 = AbstractC3682.m6270(cArr, i3, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[iM6270] = ' ';
        int iM6267 = AbstractC3682.m6267(cArr, iM6270 + 1, localDateTime.toLocalTime());
        cArr[iM6267] = c;
        this.f9514 = iM6267 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final void mo6536(LocalTime localTime) {
        int i = this.f9514;
        int i2 = i + 20;
        char[] cArr = this.f9486;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        char c = this.f9519;
        cArr[i] = c;
        int iM6267 = AbstractC3682.m6267(cArr, i + 1, localTime);
        cArr[iM6267] = c;
        this.f9514 = iM6267 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final void mo6537(int i, int i2, int i3, int i4, int i5, int i6) {
        char[] cArr = this.f9486;
        int i7 = this.f9514;
        if (i7 + 21 > cArr.length) {
            m6560(i7 + 21);
            cArr = this.f9486;
        }
        int i8 = this.f9514;
        char c = this.f9519;
        cArr[i8] = c;
        if (i < 0 || i > 9999) {
            throw AbstractC3730.m6614(i);
        }
        int iM6270 = AbstractC3682.m6270(cArr, i8 + 1, i, i2, i3);
        cArr[iM6270] = ' ';
        AbstractC3682.m6279(cArr, iM6270 + 1, i4, i5, i6);
        cArr[iM6270 + 9] = c;
        this.f9514 = iM6270 + 10;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void mo6538(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = z ? i8 == 0 ? 1 : 6 : 0;
        int i10 = this.f9514;
        int i11 = i10 + 25 + i9;
        char[] cArr = this.f9486;
        if (i11 > cArr.length) {
            m6560(i11);
            cArr = this.f9486;
        }
        char c = this.f9519;
        cArr[i10] = c;
        int iM6270 = AbstractC3682.m6270(cArr, i10 + 1, i, i2, i3);
        cArr[iM6270] = z ? 'T' : ' ';
        AbstractC3682.m6279(cArr, iM6270 + 1, i4, i5, i6);
        int i12 = iM6270 + 9;
        if (i7 > 0) {
            int i13 = i7 / 10;
            int i14 = i13 / 10;
            if (i7 - (i13 * 10) != 0) {
                AbstractC3682.m6307(cArr, i12, (AbstractC3682.f9231[i7 & 1023] & (-65536)) | AbstractC3682.f9239);
                i12 = iM6270 + 13;
            } else {
                int i15 = iM6270 + 10;
                cArr[i12] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                if (i13 - (i14 * 10) != 0) {
                    AbstractC3682.m6314(i15, i13, cArr);
                    i12 = iM6270 + 12;
                } else {
                    i12 = iM6270 + 11;
                    cArr[i15] = (char) ((byte) (i14 + 48));
                }
            }
        }
        if (z) {
            int i16 = i8 / 3600;
            if (i8 == 0) {
                cArr[i12] = 'Z';
                i12++;
            } else {
                int iAbs = Math.abs(i16);
                cArr[i12] = i16 >= 0 ? SignatureVisitor.EXTENDS : SignatureVisitor.SUPER;
                AbstractC3682.m6314(i12 + 1, iAbs, cArr);
                cArr[i12 + 3] = ':';
                int i17 = (i8 - (i16 * 3600)) / 60;
                if (i17 < 0) {
                    i17 = -i17;
                }
                AbstractC3682.m6314(i12 + 4, i17, cArr);
                i12 += 6;
            }
        }
        cArr[i12] = c;
        this.f9514 = i12 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final void mo6539() {
        int i = this.f9514;
        char[] cArr = this.f9486;
        if (i == cArr.length) {
            m6560(i + 1);
            cArr = this.f9486;
        }
        cArr[i] = ':';
        this.f9514 = i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6540(char c) {
        int i;
        int i2 = this.f9514;
        char[] cArr = this.f9486;
        int i3 = i2 + 8;
        if (i3 > cArr.length) {
            m6560(i3);
            cArr = this.f9486;
        }
        int i4 = i2 + 1;
        char c2 = this.f9519;
        cArr[i2] = c2;
        if (c == '\"' || c == '\'') {
            if (c == c2) {
                cArr[i4] = '\\';
                i4 = i2 + 2;
            }
            i = i4 + 1;
            cArr[i4] = c;
        } else if (c != '\\') {
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i4] = '\\';
                    cArr[i2 + 2] = 'u';
                    cArr[i2 + 3] = '0';
                    cArr[i2 + 4] = '0';
                    cArr[i2 + 5] = '0';
                    cArr[i2 + 6] = (char) (c + '0');
                    i = i2 + 7;
                    break;
                case '\b':
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                    AbstractC3654.m6223(i4, c, cArr);
                    i = i2 + 3;
                    break;
                case 11:
                case 14:
                case 15:
                    cArr[i4] = '\\';
                    cArr[i2 + 2] = 'u';
                    cArr[i2 + 3] = '0';
                    cArr[i2 + 4] = '0';
                    cArr[i2 + 5] = '0';
                    cArr[i2 + 6] = (char) (c + 'W');
                    i = i2 + 7;
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    cArr[i4] = '\\';
                    cArr[i2 + 2] = 'u';
                    cArr[i2 + 3] = '0';
                    cArr[i2 + 4] = '0';
                    cArr[i2 + 5] = '1';
                    cArr[i2 + 6] = (char) (c + ' ');
                    i = i2 + 7;
                    break;
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    cArr[i4] = '\\';
                    cArr[i2 + 2] = 'u';
                    cArr[i2 + 3] = '0';
                    cArr[i2 + 4] = '0';
                    cArr[i2 + 5] = '1';
                    cArr[i2 + 6] = (char) (c + 'G');
                    i = i2 + 7;
                    break;
                default:
                    i = i2 + 2;
                    cArr[i4] = c;
                    break;
            }
        }
        cArr[i] = c2;
        this.f9514 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final void mo6541(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f9514;
        int i8 = i7 + 16;
        char[] cArr = this.f9486;
        if (i8 > cArr.length) {
            m6560(i8);
            cArr = this.f9486;
        }
        char c = this.f9519;
        cArr[i7] = c;
        if (i < 0 || i > 9999) {
            throw AbstractC3730.m6614(i);
        }
        int i9 = i / 100;
        AbstractC3682.m6314(i7 + 1, i9, cArr);
        AbstractC3682.m6314(i7 + 3, i - (i9 * 100), cArr);
        AbstractC3682.m6314(i7 + 5, i2, cArr);
        AbstractC3682.m6314(i7 + 7, i3, cArr);
        AbstractC3682.m6314(i7 + 9, i4, cArr);
        AbstractC3682.m6314(i7 + 11, i5, cArr);
        AbstractC3682.m6314(i7 + 13, i6, cArr);
        cArr[i7 + 15] = c;
        this.f9514 = i8;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final void mo6542() {
        this.f9517 = false;
        int i = this.f9514;
        int i2 = this.f9518;
        byte b = this.f9509;
        int i3 = (i2 * b) + i + 2;
        char[] cArr = this.f9486;
        if (i3 > cArr.length) {
            m6560(i3);
            cArr = this.f9486;
        }
        int iM6567 = i + 1;
        cArr[i] = ',';
        if (b != 0) {
            iM6567 = m6567(iM6567, cArr);
        }
        this.f9514 = iM6567;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final void mo6543(float f) {
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9514;
        int i2 = i + 15;
        if (z) {
            i2 = i + 17;
        }
        char[] cArr = this.f9486;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        if (z) {
            cArr[i] = '\"';
            i++;
        }
        int iM6236 = AbstractC3660.m6236(cArr, i, f);
        if (z) {
            cArr[iM6236] = '\"';
            iM6236++;
        }
        this.f9514 = iM6236;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final void mo6544(double[] dArr) {
        if (dArr == null) {
            mo6527();
            return;
        }
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9514;
        int iM12133 = AbstractC7012.m12133(dArr.length, 27, i, 1);
        char[] cArr = this.f9486;
        if (iM12133 > cArr.length) {
            m6560(iM12133);
            cArr = this.f9486;
        }
        int iM6233 = i + 1;
        cArr[i] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i2 = 0; i2 < dArr.length; i2++) {
            if (i2 != 0) {
                cArr[iM6233] = ',';
                iM6233++;
            }
            if (z) {
                cArr[iM6233] = '\"';
                iM6233++;
            }
            iM6233 = AbstractC3660.m6233(cArr, iM6233, dArr[i2]);
            if (z) {
                cArr[iM6233] = '\"';
                iM6233++;
            }
        }
        cArr[iM6233] = ']';
        this.f9514 = iM6233 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void mo6545(byte[] bArr) {
        int length = (bArr.length * 2) + 3;
        int i = this.f9514;
        char[] cArr = this.f9486;
        int i2 = length + i + 2;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        cArr[i] = 'x';
        cArr[i + 1] = '\'';
        int i3 = i + 2;
        for (byte b : bArr) {
            int i4 = (b & DefaultClassResolver.NAME) >> 4;
            int i5 = b & 15;
            int i6 = 55;
            cArr[i3] = (char) (i4 + (i4 < 10 ? 48 : 55));
            int i7 = i3 + 1;
            if (i5 < 10) {
                i6 = 48;
            }
            cArr[i7] = (char) (i5 + i6);
            i3 += 2;
        }
        cArr[i3] = '\'';
        this.f9514 = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void mo6546(float[] fArr) {
        if (fArr == null) {
            mo6599();
            return;
        }
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9514;
        int iM12133 = AbstractC7012.m12133(fArr.length, z ? 16 : 18, i, 1);
        char[] cArr = this.f9486;
        if (iM12133 > cArr.length) {
            m6560(iM12133);
            cArr = this.f9486;
        }
        int iM6236 = i + 1;
        cArr[i] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 != 0) {
                cArr[iM6236] = ',';
                iM6236++;
            }
            if (z) {
                cArr[iM6236] = '\"';
                iM6236++;
            }
            iM6236 = AbstractC3660.m6236(cArr, iM6236, fArr[i2]);
            if (z) {
                cArr[iM6236] = '\"';
                iM6236++;
            }
        }
        cArr[iM6236] = ']';
        this.f9514 = iM6236 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final void mo6547(BigInteger bigInteger, long j) {
        if (bigInteger == null) {
            m6625();
            return;
        }
        if (AbstractC3700.m6498(bigInteger) && j == 0) {
            mo6523(bigInteger.longValue());
            return;
        }
        String string = bigInteger.toString(10);
        boolean zM6611 = AbstractC3730.m6611(bigInteger, j | this.f9523.f9498);
        int i = this.f9514;
        int length = string.length();
        int i2 = i + length + (zM6611 ? 2 : 0);
        char[] cArr = this.f9486;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        if (zM6611) {
            cArr[i] = '\"';
            i++;
        }
        string.getChars(0, length, cArr, i);
        int i3 = i + length;
        if (zM6611) {
            cArr[i3] = '\"';
            i3++;
        }
        this.f9514 = i3;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final void mo6548(byte[] bArr) {
        if (bArr == null) {
            mo6599();
            return;
        }
        int i = this.f9514;
        int length = ((((bArr.length - 1) / 3) + 1) << 2) + i + 2;
        if (length > this.f9486.length) {
            m6560(length);
        }
        char[] cArr = this.f9486;
        int i2 = i + 1;
        char c = this.f9519;
        cArr[i] = c;
        int length2 = (bArr.length / 3) * 3;
        int i3 = 0;
        while (i3 < length2) {
            int i4 = i3 + 2;
            int i5 = ((bArr[i3 + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i3] & DefaultClassResolver.NAME) << 16);
            i3 += 3;
            int i6 = i5 | (bArr[i4] & DefaultClassResolver.NAME);
            char[] cArr2 = AbstractC3766.f9641;
            cArr[i2] = cArr2[(i6 >>> 18) & 63];
            cArr[i2 + 1] = cArr2[(i6 >>> 12) & 63];
            cArr[i2 + 2] = cArr2[(i6 >>> 6) & 63];
            cArr[i2 + 3] = cArr2[i6 & 63];
            i2 += 4;
        }
        int length3 = bArr.length - length2;
        if (length3 > 0) {
            int i7 = ((bArr[length2] & DefaultClassResolver.NAME) << 10) | (length3 == 2 ? (bArr[bArr.length - 1] & DefaultClassResolver.NAME) << 2 : 0);
            char[] cArr3 = AbstractC3766.f9641;
            cArr[i2] = cArr3[i7 >> 12];
            cArr[i2 + 1] = cArr3[(i7 >>> 6) & 63];
            cArr[i2 + 2] = length3 == 2 ? cArr3[i7 & 63] : '=';
            cArr[i2 + 3] = SignatureVisitor.INSTANCEOF;
            i2 += 4;
        }
        cArr[i2] = c;
        this.f9514 = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public void mo6549(boolean z) {
        int i;
        int i2 = this.f9514 + 5;
        char[] cArr = this.f9486;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        int i3 = this.f9514;
        if ((this.f9523.f9498 & JSONWriter$Feature.WriteBooleanAsNumber.mask) != 0) {
            i = i3 + 1;
            cArr[i3] = z ? '1' : '0';
        } else if (z) {
            cArr[i3] = Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL;
            cArr[i3 + 1] = Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL;
            cArr[i3 + 2] = 'u';
            cArr[i3 + 3] = 'e';
            i = i3 + 4;
        } else {
            cArr[i3] = 'f';
            cArr[i3 + 1] = 'a';
            cArr[i3 + 2] = 'l';
            cArr[i3 + 3] = Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL;
            cArr[i3 + 4] = 'e';
            i = i3 + 5;
        }
        this.f9514 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6550(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat) {
        int length;
        int iScale;
        if (bigDecimal == null) {
            m6629();
            return;
        }
        if (decimalFormat != null) {
            mo6569(decimalFormat.format(bigDecimal));
            return;
        }
        long j2 = j | this.f9523.f9498;
        int iPrecision = bigDecimal.precision();
        boolean zM6612 = AbstractC3730.m6612(bigDecimal, j2);
        int i = this.f9514;
        int iAbs = Math.abs(bigDecimal.scale()) + i + iPrecision + 7;
        char[] cArr = this.f9486;
        if (iAbs > cArr.length) {
            m6560(iAbs);
            cArr = this.f9486;
        }
        if (zM6612) {
            cArr[i] = '\"';
            i++;
        }
        boolean z = (j2 & JSONWriter$Feature.WriteBigDecimalAsPlain.mask) != 0;
        if (iPrecision >= 19 || (iScale = bigDecimal.scale()) < 0) {
            String plainString = z ? bigDecimal.toPlainString() : bigDecimal.toString();
            plainString.getChars(0, plainString.length(), cArr, i);
            length = plainString.length() + i;
        } else {
            long j3 = AbstractC3687.f9279;
            if (j3 != -1) {
                long j4 = AbstractC3687.f9266.getLong(bigDecimal, j3);
                if (j4 != Long.MIN_VALUE && !z) {
                    if (j4 < 0) {
                        AbstractC3682.m6323(cArr, i, SignatureVisitor.SUPER);
                        j4 = -j4;
                        i++;
                    }
                    if (iScale == 0) {
                        length = AbstractC3682.m6277(cArr, i, j4);
                    } else {
                        int iM6319 = AbstractC3682.m6319(j4);
                        int i2 = iM6319 - iScale;
                        if (i2 == 0) {
                            int i3 = i + 1;
                            cArr[i] = '0';
                            i += 2;
                            cArr[i3] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                        } else if (i2 < 0) {
                            int i4 = i + 1;
                            cArr[i] = '0';
                            i += 2;
                            cArr[i4] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                            int i5 = 0;
                            while (i5 < (-i2)) {
                                AbstractC3682.m6323(cArr, i, '0');
                                i5++;
                                i++;
                            }
                        } else {
                            long j5 = AbstractC3682.f9230[iScale - 1];
                            long j6 = j4 / j5;
                            long j7 = j4 - (j5 * j6);
                            int iM6277 = AbstractC3682.m6277(cArr, i, j6);
                            AbstractC3682.m6323(cArr, iM6277, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                            if (iScale == 1) {
                                AbstractC3682.m6323(cArr, iM6277 + 1, (char) (j7 + 48));
                                length = iM6277 + 2;
                            } else if (iScale == 2) {
                                AbstractC3682.m6314(iM6277 + 1, (int) j7, cArr);
                                length = iM6277 + 3;
                            } else {
                                int iM63192 = (iM6319 - AbstractC3682.m6319(j7)) - i2;
                                int i6 = iM6277;
                                for (int i7 = 0; i7 < iM63192; i7++) {
                                    i6++;
                                    AbstractC3682.m6323(cArr, i6, '0');
                                }
                                length = AbstractC3682.m6277(cArr, i6 + 1, j7);
                            }
                        }
                        length = AbstractC3682.m6277(cArr, i, j4);
                    }
                }
            }
        }
        if (zM6612) {
            cArr[length] = '\"';
            length++;
        }
        this.f9514 = length;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final void mo6551(double d) {
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9514;
        int i2 = i + 24;
        if (z) {
            i2 = i + 26;
        }
        char[] cArr = this.f9486;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        if (z) {
            cArr[i] = '\"';
            i++;
        }
        int iM6233 = AbstractC3660.m6233(cArr, i, d);
        if (z) {
            cArr[iM6233] = '\"';
            iM6233++;
        }
        this.f9514 = iM6233;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final void mo6552(int i, int i2, int i3) {
        int i4 = this.f9514;
        int i5 = i4 + 13;
        char[] cArr = this.f9486;
        if (i5 > cArr.length) {
            m6560(i5);
            cArr = this.f9486;
        }
        char c = this.f9519;
        cArr[i4] = c;
        int iM6270 = AbstractC3682.m6270(cArr, i4 + 1, i, i2, i3);
        cArr[iM6270] = c;
        this.f9514 = iM6270 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final void mo6553(int i, int i2, int i3) {
        int i4 = this.f9514;
        int i5 = i4 + 10;
        char[] cArr = this.f9486;
        if (i5 > cArr.length) {
            m6560(i5);
            cArr = this.f9486;
        }
        char c = this.f9519;
        cArr[i4] = c;
        if (i < 0 || i > 9999) {
            throw AbstractC3730.m6614(i);
        }
        int i6 = i / 100;
        AbstractC3682.m6314(i4 + 1, i6, cArr);
        AbstractC3682.m6314(i4 + 3, i - (i6 * 100), cArr);
        AbstractC3682.m6314(i4 + 5, i2, cArr);
        AbstractC3682.m6314(i4 + 7, i3, cArr);
        cArr[i4 + 9] = c;
        this.f9514 = i5;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo6554() {
        int i = this.f9518 - 1;
        this.f9518 = i;
        int iM6567 = this.f9514;
        int i2 = iM6567 + 1;
        byte b = this.f9509;
        int i3 = i2 + (b == 0 ? 0 : (i * b) + 1);
        char[] cArr = this.f9486;
        if (i3 > cArr.length) {
            m6560(i3);
            cArr = this.f9486;
        }
        if (b != 0) {
            iM6567 = m6567(iM6567, cArr);
        }
        cArr[iM6567] = '}';
        this.f9514 = iM6567 + 1;
        this.f9517 = false;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo6555() {
        int i = this.f9518 - 1;
        this.f9518 = i;
        int iM6567 = this.f9514;
        int i2 = iM6567 + 1;
        byte b = this.f9509;
        int i3 = i2 + (b == 0 ? 0 : (i * b) + 1);
        char[] cArr = this.f9486;
        if (i3 > cArr.length) {
            m6560(i3);
            cArr = this.f9486;
        }
        if (b != 0) {
            iM6567 = m6567(iM6567, cArr);
        }
        cArr[iM6567] = ']';
        this.f9514 = iM6567 + 1;
        this.f9517 = false;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void mo6556(Map map) {
        if (this.f9509 != 0) {
            super.mo6556(map);
            return;
        }
        if (map == null) {
            mo6527();
            return;
        }
        C3728 c3728 = this.f9523;
        if ((c3728.f9498 & AbstractC3730.f9507) != 0) {
            c3728.m6587(map.getClass()).mo6239(this, map, null, null, 0L);
            return;
        }
        mo6572('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (c3728.f9498 & JSONWriter$Feature.WriteMapNullValue.mask) != 0) {
                if (!z) {
                    mo6572(',');
                }
                Object key = entry.getKey();
                if (key instanceof String) {
                    mo6577((String) key);
                } else {
                    mo6597(key);
                }
                mo6572(':');
                if (value == null) {
                    mo6527();
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == String.class) {
                        mo6577((String) value);
                    } else if (cls == Integer.class) {
                        mo6531((Integer) value);
                    } else if (cls == Long.class) {
                        mo6522((Long) value);
                    } else if (cls == Boolean.class) {
                        mo6549(((Boolean) value).booleanValue());
                    } else if (cls == BigDecimal.class) {
                        mo6550((BigDecimal) value, 0L, null);
                    } else if (cls == JSONArray.class) {
                        mo6558((JSONArray) value);
                    } else if (cls == JSONObject.class) {
                        mo6556((JSONObject) value);
                    } else {
                        c3728.m6586(cls, cls).mo6239(this, value, null, null, 0L);
                    }
                }
                z = false;
            }
        }
        mo6572('}');
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void mo6557() {
        int i = this.f9518 + 1;
        this.f9518 = i;
        if (i > this.f9523.f9496) {
            m6644();
            throw null;
        }
        this.f9517 = true;
        int i2 = this.f9514;
        char[] cArr = this.f9486;
        byte b = this.f9509;
        int i3 = (i * b) + i2 + 3;
        if (i3 > cArr.length) {
            m6560(i3);
            cArr = this.f9486;
        }
        int iM6567 = i2 + 1;
        cArr[i2] = '{';
        if (b != 0) {
            iM6567 = m6567(iM6567, cArr);
        }
        this.f9514 = iM6567;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final void mo6558(List list) {
        long j = JSONWriter$Feature.ReferenceDetection.mask | JSONWriter$Feature.PrettyFormat.mask | JSONWriter$Feature.NotWriteEmptyArray.mask | JSONWriter$Feature.NotWriteDefaultValue.mask;
        C3728 c3728 = this.f9523;
        if ((j & c3728.f9498) != 0) {
            c3728.m6587(list.getClass()).mo6239(this, list, null, null, 0L);
            return;
        }
        int i = this.f9514;
        if (i == this.f9486.length) {
            m6560(i + 1);
        }
        char[] cArr = this.f9486;
        int i2 = this.f9514;
        this.f9514 = i2 + 1;
        cArr[i2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        boolean z = true;
        int i3 = 0;
        while (i3 < list.size()) {
            Object obj = list.get(i3);
            if (!z) {
                int i4 = this.f9514;
                if (i4 == this.f9486.length) {
                    m6560(i4 + 1);
                }
                char[] cArr2 = this.f9486;
                int i5 = this.f9514;
                this.f9514 = i5 + 1;
                cArr2[i5] = ',';
            }
            if (obj == null) {
                mo6527();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == String.class) {
                    mo6577((String) obj);
                } else if (cls == Integer.class) {
                    mo6531((Integer) obj);
                } else if (cls == Long.class) {
                    mo6522((Long) obj);
                } else if (cls == Boolean.class) {
                    mo6549(((Boolean) obj).booleanValue());
                } else if (cls == BigDecimal.class) {
                    mo6550((BigDecimal) obj, 0L, null);
                } else if (cls == JSONArray.class) {
                    mo6558((JSONArray) obj);
                } else if (cls == JSONObject.class) {
                    mo6556((JSONObject) obj);
                } else {
                    c3728.m6586(cls, cls).mo6239(this, obj, null, null, 0L);
                }
            }
            i3++;
            z = false;
        }
        int i6 = this.f9514;
        if (i6 == this.f9486.length) {
            m6560(i6 + 1);
        }
        char[] cArr3 = this.f9486;
        int i7 = this.f9514;
        this.f9514 = i7 + 1;
        cArr3[i7] = ']';
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final void mo6559() {
        int i = this.f9518 + 1;
        this.f9518 = i;
        if (i > this.f9523.f9496) {
            m6644();
            throw null;
        }
        int i2 = this.f9514;
        byte b = this.f9509;
        int i3 = (i * b) + i2 + 3;
        char[] cArr = this.f9486;
        if (i3 > cArr.length) {
            m6560(i3);
            cArr = this.f9486;
        }
        int iM6567 = i2 + 1;
        cArr[i2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        if (b != 0) {
            iM6567 = m6567(iM6567, cArr);
        }
        this.f9514 = iM6567;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏, reason: contains not printable characters */
    public final void m6560(int i) {
        char[] cArr = this.f9486;
        this.f9486 = Arrays.copyOf(cArr, m6649(i, cArr.length));
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏, reason: contains not printable characters */
    public final void mo6561(ZonedDateTime zonedDateTime) {
        char cCharAt;
        int i;
        int i2;
        if (zonedDateTime == null) {
            mo6527();
            return;
        }
        ZoneId zone = zonedDateTime.getZone();
        String id = zone.getId();
        int length = id.length();
        if (ZoneOffset.UTC == zone || (length <= 3 && ("UTC".equals(id) || "Z".equals(id)))) {
            id = "Z";
            cCharAt = 0;
            i = 1;
        } else {
            if (length != 0) {
                cCharAt = id.charAt(0);
                if (cCharAt == '+' || cCharAt == '-') {
                    i = length;
                }
            } else {
                cCharAt = 0;
            }
            i = length + 2;
        }
        int i3 = this.f9514;
        int i4 = i3 + i + 38;
        char[] cArr = this.f9486;
        if (i4 > cArr.length) {
            m6560(i4);
            cArr = this.f9486;
        }
        char c = this.f9519;
        cArr[i3] = c;
        LocalDate localDate = zonedDateTime.toLocalDate();
        int iM6270 = AbstractC3682.m6270(cArr, i3 + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[iM6270] = 'T';
        int iM6267 = AbstractC3682.m6267(cArr, iM6270 + 1, zonedDateTime.toLocalTime());
        if (i == 1) {
            i2 = iM6267 + 1;
            cArr[iM6267] = 'Z';
        } else if (cCharAt == '+' || cCharAt == '-') {
            id.getChars(0, length, cArr, iM6267);
            i2 = iM6267 + length;
        } else {
            int i5 = iM6267 + 1;
            cArr[iM6267] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
            id.getChars(0, length, cArr, i5);
            int i6 = i5 + length;
            cArr[i6] = ']';
            i2 = i6 + 1;
        }
        cArr[i2] = c;
        this.f9514 = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰, reason: contains not printable characters */
    public final void mo6562(UUID uuid) {
        if (uuid == null) {
            mo6527();
            return;
        }
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        int i = this.f9514 + 38;
        char[] cArr = this.f9486;
        if (i > cArr.length) {
            m6560(i);
            cArr = this.f9486;
        }
        int i2 = this.f9514;
        cArr[i2] = '\"';
        m6519(i2 + 1, (int) (mostSignificantBits >> 56), cArr, (int) (mostSignificantBits >> 48));
        m6519(i2 + 5, (int) (mostSignificantBits >> 40), cArr, (int) (mostSignificantBits >> 32));
        cArr[i2 + 9] = SignatureVisitor.SUPER;
        int i3 = (int) mostSignificantBits;
        m6519(i2 + 10, i3 >> 24, cArr, i3 >> 16);
        cArr[i2 + 14] = SignatureVisitor.SUPER;
        m6519(i2 + 15, i3 >> 8, cArr, i3);
        cArr[i2 + 19] = SignatureVisitor.SUPER;
        m6519(i2 + 20, (int) (leastSignificantBits >> 56), cArr, (int) (leastSignificantBits >> 48));
        cArr[i2 + 24] = SignatureVisitor.SUPER;
        m6519(i2 + 25, (int) (leastSignificantBits >> 40), cArr, (int) (leastSignificantBits >> 32));
        int i4 = (int) leastSignificantBits;
        m6519(i2 + 29, i4 >> 24, cArr, i4 >> 16);
        m6519(i2 + 33, i4 >> 8, cArr, i4);
        cArr[i2 + 37] = '\"';
        this.f9514 += 38;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0059. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6563(byte[] bArr) {
        int i;
        int length = bArr.length;
        char c = this.f9519;
        long j = this.f9523.f9498;
        boolean z = (JSONWriter$Feature.EscapeNoneAscii.mask & j) != 0;
        boolean z2 = (j & JSONWriter$Feature.BrowserSecure.mask) != 0;
        int i2 = this.f9514;
        int iM12133 = AbstractC7012.m12133(length, 6, i2, 2);
        if (iM12133 > this.f9486.length) {
            m6560(iM12133);
        }
        char[] cArr = this.f9486;
        int i3 = i2 + 1;
        cArr[i2] = c;
        for (int i4 = 0; i4 < length; i4 += 2) {
            char c2 = AbstractC3687.f9266.getChar(bArr, ((long) Unsafe.ARRAY_BYTE_BASE_OFFSET) + ((long) i4));
            if (c2 == '\"') {
                if (c2 == c) {
                    cArr[i3] = '\\';
                    i3++;
                }
                i = i3 + 1;
                cArr[i3] = c2;
                i3 = i;
            } else if (c2 != '<' && c2 != '>') {
                if (c2 != '\\') {
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 11:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            AbstractC3654.m6220(i3, c2, cArr);
                            i3 += 6;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                            break;
                        default:
                            switch (c2) {
                                case '\'':
                                    break;
                                case '(':
                                case ')':
                                    break;
                                default:
                                    if (!z || c2 <= 127) {
                                        i = i3 + 1;
                                        cArr[i3] = c2;
                                        i3 = i;
                                    } else {
                                        AbstractC3654.m6226(i3, c2, cArr);
                                        i3 += 6;
                                    }
                                    break;
                            }
                            break;
                    }
                }
                AbstractC3654.m6223(i3, c2, cArr);
                i3 += 2;
            } else if (z2) {
                AbstractC3654.m6226(i3, c2, cArr);
                i3 += 6;
            } else {
                i = i3 + 1;
                cArr[i3] = c2;
                i3 = i;
            }
        }
        cArr[i3] = c;
        this.f9514 = i3 + 1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0051. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6564(char[] cArr) {
        int i;
        int length = cArr.length;
        long j = this.f9523.f9498;
        boolean z = (JSONWriter$Feature.EscapeNoneAscii.mask & j) != 0;
        boolean z2 = (j & JSONWriter$Feature.BrowserSecure.mask) != 0;
        int i2 = this.f9514;
        int iM12133 = AbstractC7012.m12133(length, 6, i2, 2);
        if (iM12133 > this.f9486.length) {
            m6560(iM12133);
        }
        char[] cArr2 = this.f9486;
        int i3 = i2 + 1;
        char c = this.f9519;
        cArr2[i2] = c;
        for (char c2 : cArr) {
            if (c2 == '\"') {
                if (c2 == c) {
                    cArr2[i3] = '\\';
                    i3++;
                }
                i = i3 + 1;
                cArr2[i3] = c2;
                i3 = i;
            } else if (c2 != '<' && c2 != '>') {
                if (c2 != '\\') {
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 11:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            AbstractC3654.m6220(i3, c2, cArr2);
                            i3 += 6;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                            break;
                        default:
                            switch (c2) {
                                case '\'':
                                    break;
                                case '(':
                                case ')':
                                    break;
                                default:
                                    if (!z || c2 <= 127) {
                                        i = i3 + 1;
                                        cArr2[i3] = c2;
                                        i3 = i;
                                    } else {
                                        AbstractC3654.m6226(i3, c2, cArr2);
                                        i3 += 6;
                                    }
                                    break;
                            }
                            break;
                    }
                }
                AbstractC3654.m6223(i3, c2, cArr2);
                i3 += 2;
            } else if (z2) {
                AbstractC3654.m6226(i3, c2, cArr2);
                i3 += 6;
            } else {
                i = i3 + 1;
                cArr2[i3] = c2;
                i3 = i;
            }
        }
        cArr2[i3] = c;
        this.f9514 = i3 + 1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0055. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6565(String str) {
        int i;
        int length = str.length();
        long j = this.f9523.f9498;
        boolean z = (JSONWriter$Feature.EscapeNoneAscii.mask & j) != 0;
        boolean z2 = (j & JSONWriter$Feature.BrowserSecure.mask) != 0;
        int i2 = this.f9514;
        int iM12133 = AbstractC7012.m12133(length, 6, i2, 2);
        if (iM12133 > this.f9486.length) {
            m6560(iM12133);
        }
        char[] cArr = this.f9486;
        int i3 = i2 + 1;
        char c = this.f9519;
        cArr[i2] = c;
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\"') {
                if (cCharAt == c) {
                    cArr[i3] = '\\';
                    i3++;
                }
                i = i3 + 1;
                cArr[i3] = cCharAt;
                i3 = i;
            } else if (cCharAt != '<' && cCharAt != '>') {
                if (cCharAt != '\\') {
                    switch (cCharAt) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 11:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            AbstractC3654.m6220(i3, cCharAt, cArr);
                            i3 += 6;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                            break;
                        default:
                            switch (cCharAt) {
                                case '\'':
                                    break;
                                case '(':
                                case ')':
                                    break;
                                default:
                                    if (!z || cCharAt <= 127) {
                                        i = i3 + 1;
                                        cArr[i3] = cCharAt;
                                        i3 = i;
                                    } else {
                                        AbstractC3654.m6226(i3, cCharAt, cArr);
                                        i3 += 6;
                                    }
                                    break;
                            }
                            break;
                    }
                }
                AbstractC3654.m6223(i3, cCharAt, cArr);
                i3 += 2;
            } else if (z2) {
                AbstractC3654.m6226(i3, cCharAt, cArr);
                i3 += 6;
            } else {
                i = i3 + 1;
                cArr[i3] = cCharAt;
                i3 = i;
            }
        }
        cArr[i3] = c;
        this.f9514 = i3 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰, reason: contains not printable characters */
    public final void m6566() {
        int i = this.f9514;
        if (i == this.f9486.length) {
            m6560(i + 1);
        }
        char[] cArr = this.f9486;
        int i2 = this.f9514;
        this.f9514 = i2 + 1;
        cArr[i2] = this.f9519;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
    public final int m6567(int i, char[] cArr) {
        cArr[i] = '\n';
        int i2 = i + 1;
        int i3 = this.f9518;
        byte b = this.f9509;
        int i4 = (i3 * b) + i2;
        Arrays.fill(cArr, i2, i4, b == 1 ? '\t' : ' ');
        return i4;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
    public final void mo6568(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
    public final void mo6569(String str) {
        int length = str.length();
        int i = this.f9514;
        char[] cArr = this.f9486;
        int i2 = i + length;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        str.getChars(0, length, cArr, i);
        this.f9514 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public final void mo6570(int i, char[] cArr) {
        int i2 = this.f9514;
        char[] cArr2 = this.f9486;
        int i3 = i2 + i;
        if (i3 > cArr2.length) {
            m6560(i3);
            cArr2 = this.f9486;
        }
        System.arraycopy(cArr, 0, cArr2, i2, i);
        this.f9514 = i3;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    public final void mo6571(char c, char c2) {
        int i = this.f9514;
        char[] cArr = this.f9486;
        int i2 = i + 2;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        cArr[i] = c;
        cArr[i + 1] = c2;
        this.f9514 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public final void mo6572(char c) {
        int i = this.f9514;
        if (i == this.f9486.length) {
            m6560(i + 1);
        }
        char[] cArr = this.f9486;
        int i2 = this.f9514;
        this.f9514 = i2 + 1;
        cArr[i2] = c;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
    public final void mo6573(String[] strArr) {
        if (this.f9509 != 0 || strArr == null) {
            super.mo6573(strArr);
            return;
        }
        int i = this.f9514;
        if (i == this.f9486.length) {
            m6560(i + 1);
        }
        char[] cArr = this.f9486;
        int i2 = this.f9514;
        this.f9514 = i2 + 1;
        cArr[i2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (i3 != 0) {
                int i4 = this.f9514;
                if (i4 == this.f9486.length) {
                    m6560(i4 + 1);
                }
                char[] cArr2 = this.f9486;
                int i5 = this.f9514;
                this.f9514 = i5 + 1;
                cArr2[i5] = ',';
            }
            mo6577(strArr[i3]);
        }
        int i6 = this.f9514;
        if (i6 == this.f9486.length) {
            m6560(i6 + 1);
        }
        char[] cArr3 = this.f9486;
        int i7 = this.f9514;
        this.f9514 = i7 + 1;
        cArr3[i7] = ']';
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世, reason: contains not printable characters */
    public final void mo6574(int i, int i2, int i3) {
        int i4 = this.f9514;
        int i5 = i4 + 10;
        char[] cArr = this.f9486;
        if (i5 > cArr.length) {
            m6560(i5);
            cArr = this.f9486;
        }
        char c = this.f9519;
        cArr[i4] = (char) ((byte) c);
        AbstractC3682.m6314(i4 + 1, i, cArr);
        cArr[i4 + 3] = ':';
        AbstractC3682.m6314(i4 + 4, i2, cArr);
        cArr[i4 + 6] = ':';
        AbstractC3682.m6314(i4 + 7, i3, cArr);
        cArr[i4 + 9] = (char) ((byte) c);
        this.f9514 = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6575(int i, char[] cArr) {
        int i2;
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.EscapeNoneAscii.mask) != 0;
        int i3 = this.f9514;
        int i4 = (z ? i * 6 : i * 2) + i3;
        char[] cArr2 = this.f9486;
        if (i4 - cArr2.length > 0) {
            m6560(i4);
            cArr2 = this.f9486;
        }
        int iMin = Math.min(i, cArr.length);
        for (int i5 = 0; i5 < iMin; i5++) {
            char c = cArr[i5];
            if (c == '\"' || c == '\'') {
                if (c == this.f9519) {
                    cArr2[i3] = '\\';
                    i3++;
                }
                i2 = i3 + 1;
                cArr2[i3] = c;
            } else {
                if (c != '\\') {
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 11:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            AbstractC3654.m6220(i3, c, cArr2);
                            i3 += 6;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                            AbstractC3654.m6223(i3, c, cArr2);
                            i3 += 2;
                            break;
                        default:
                            if (!z || c <= 127) {
                                i2 = i3 + 1;
                                cArr2[i3] = c;
                            } else {
                                AbstractC3654.m6226(i3, c, cArr2);
                                i3 += 6;
                            }
                            break;
                    }
                }
            }
            i3 = i2;
        }
        this.f9514 = i3;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
    public final void mo6576(List list) {
        if (this.f9509 != 0) {
            super.mo6576(list);
            return;
        }
        int i = this.f9514;
        if (i == this.f9486.length) {
            m6560(i + 1);
        }
        char[] cArr = this.f9486;
        int i2 = this.f9514;
        this.f9514 = i2 + 1;
        cArr[i2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != 0) {
                int i4 = this.f9514;
                if (i4 == this.f9486.length) {
                    m6560(i4 + 1);
                }
                char[] cArr2 = this.f9486;
                int i5 = this.f9514;
                this.f9514 = i5 + 1;
                cArr2[i5] = ',';
            }
            mo6577((String) list.get(i3));
        }
        int i6 = this.f9514;
        if (i6 == this.f9486.length) {
            m6560(i6 + 1);
        }
        char[] cArr3 = this.f9486;
        int i7 = this.f9514;
        this.f9514 = i7 + 1;
        cArr3[i7] = ']';
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
    public void mo6577(String str) {
        if (str == null) {
            mo6608();
            return;
        }
        long j = this.f9523.f9498;
        boolean z = (JSONWriter$Feature.EscapeNoneAscii.mask & j) != 0;
        boolean z2 = (j & JSONWriter$Feature.BrowserSecure.mask) != 0;
        int length = str.length();
        int i = this.f9514 + length + 2;
        if (i >= this.f9486.length) {
            m6560(i);
        }
        int i2 = 0;
        while (true) {
            char c = this.f9519;
            if (i2 >= length) {
                int i3 = this.f9514;
                char[] cArr = this.f9486;
                int i4 = i3 + 1;
                cArr[i3] = c;
                str.getChars(0, length, cArr, i4);
                int i5 = i4 + length;
                cArr[i5] = c;
                this.f9514 = i5 + 1;
                return;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\\' || cCharAt == c || cCharAt < ' ' || ((z2 && (cCharAt == '<' || cCharAt == '>' || cCharAt == '(' || cCharAt == ')')) || (z && cCharAt > 127))) {
                break;
            } else {
                i2++;
            }
        }
        m6565(str);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰, reason: contains not printable characters */
    public final void mo6578(short s) {
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m6566();
        }
        mo6530(s);
        if (z) {
            m6566();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
    public final void mo6579(boolean z) {
        char[] cArr = this.f9486;
        int i = this.f9514;
        this.f9514 = i + 1;
        char c = this.f9519;
        cArr[i] = c;
        mo6549(z);
        char[] cArr2 = this.f9486;
        int i2 = this.f9514;
        this.f9514 = i2 + 1;
        cArr2[i2] = c;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
    public final void mo6580(String str) {
        this.f9510 = str;
        int i = this.f9514;
        char[] cArr = this.f9486;
        int i2 = i + 9;
        if (i2 > cArr.length) {
            m6560(i2);
            cArr = this.f9486;
        }
        char[] cArr2 = cArr;
        long j = (((long) i) << 1) + AbstractC3687.f9265;
        Unsafe unsafe = AbstractC3687.f9266;
        unsafe.putLong(cArr2, j, f9482);
        unsafe.putLong(cArr2, j + 8, f9481);
        this.f9514 = i + 8;
        mo6577(str);
        int i3 = this.f9514;
        char[] cArr3 = this.f9486;
        if (i3 == cArr3.length) {
            m6560(i3 + 1);
            cArr3 = this.f9486;
        }
        cArr3[i3] = '}';
        this.f9514 = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
    public final void mo6581(int i, char[] cArr) {
        char c;
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.EscapeNoneAscii.mask) != 0;
        int i2 = 0;
        while (true) {
            c = this.f9519;
            if (i2 >= i) {
                break;
            }
            char c2 = cArr[i2];
            if (c2 == '\\' || c2 == c || c2 < ' ') {
                break;
            } else {
                i2++;
            }
        }
        z = true;
        if (z) {
            m6565(new String(cArr, 0, i));
            return;
        }
        int i3 = this.f9514;
        int i4 = i3 + i + 2;
        char[] cArr2 = this.f9486;
        if (i4 > cArr2.length) {
            m6560(i4);
            cArr2 = this.f9486;
        }
        int i5 = i3 + 1;
        cArr2[i3] = c;
        System.arraycopy(cArr, 0, cArr2, i5, i);
        int i6 = i5 + i;
        cArr2[i6] = c;
        this.f9514 = i6 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
    public final void mo6582(long j) {
        boolean z = (this.f9523.f9498 & (JSONWriter$Feature.WriteNonStringValueAsString.mask | JSONWriter$Feature.WriteLongAsString.mask)) == 0;
        if (z) {
            m6566();
        }
        mo6523(j);
        if (z) {
            m6566();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰, reason: contains not printable characters */
    public final void mo6583(byte b) {
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m6566();
        }
        mo6524(b);
        if (z) {
            m6566();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
    public final void mo6584(int i) {
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m6566();
        }
        mo6533(i);
        if (z) {
            m6566();
        }
    }
}
