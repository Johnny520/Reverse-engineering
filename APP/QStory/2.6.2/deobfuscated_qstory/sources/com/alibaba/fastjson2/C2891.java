package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2826;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.protobuf.DescriptorProtos$Edition;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
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
import p007.AbstractC6136;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2891 extends AbstractC2896 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final long f9134;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final long f9135;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final int[] f9136;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f9137;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C2910 f9138;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public char[] f9139;

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
        if (AbstractC2853.f8929) {
            for (int i3 = 0; i3 < 256; i3++) {
                iArr[i3] = Integer.reverseBytes(iArr[i3] << 8);
            }
        }
        f9136 = iArr;
        char[] cArr = {'{', '\"', '$', Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL, 'e', 'f', '\"', ':'};
        Unsafe unsafe = AbstractC2853.f8919;
        long j = AbstractC2853.f8917;
        f9135 = unsafe.getLong(cArr, j);
        f9134 = unsafe.getLong(cArr, 8 + j);
        unsafe.getInt(cArr, j + 12);
        cArr[6] = '\'';
        unsafe.getInt(cArr, j + 12);
    }

    public C2891(C2894 c2894) {
        super(c2894, false, StandardCharsets.UTF_16);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        C2910 c2910 = AbstractC2932.f9297[iIdentityHashCode & (r0.length - 1)];
        this.f9138 = c2910;
        char[] cArr = (char[]) AbstractC2932.f9289.getAndSet(c2910, null);
        this.f9139 = cArr == null ? new char[8192] : cArr;
        this.f9137 = this.f9168 ? -2821266740684990248L : -2459565876494606883L;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
    public static long m5913(long j) {
        return ((j & 4278190080L) << 24) | (255 & j) | ((65280 & j) << 8) | ((16711680 & j) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲, reason: contains not printable characters */
    public static void m5914(int i, int i2, char[] cArr, int i3) {
        int i4 = i2 & Opcodes.CONST_METHOD_TYPE;
        int[] iArr = f9136;
        long jReverseBytes = ((long) iArr[i4]) | (((long) iArr[i3 & Opcodes.CONST_METHOD_TYPE]) << 32);
        Unsafe unsafe = AbstractC2853.f8919;
        long j = AbstractC2853.f8917 + (((long) i) << 1);
        if (AbstractC2853.f8929) {
            jReverseBytes = Long.reverseBytes(jReverseBytes << 8);
        }
        unsafe.putLong(cArr, j, jReverseBytes);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        char[] cArr = this.f9139;
        if (cArr.length > 8388608) {
            return;
        }
        AbstractC2932.f9289.lazySet(this.f9138, cArr);
    }

    public final String toString() {
        return new String(this.f9139, 0, this.f9167);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final void mo5915(byte[] bArr) {
        if (bArr == null) {
            mo5922();
            return;
        }
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9167;
        int iM11541 = AbstractC6136.m11541(bArr.length, 5, i, 2);
        char[] cArr = this.f9139;
        if (iM11541 > cArr.length) {
            m5955(iM11541);
            cArr = this.f9139;
        }
        int iM5663 = i + 1;
        cArr[i] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i2 != 0) {
                cArr[iM5663] = ',';
                iM5663++;
            }
            char c = this.f9172;
            if (z) {
                cArr[iM5663] = c;
                iM5663++;
            }
            iM5663 = AbstractC2848.m5663(cArr, iM5663, bArr[i2]);
            if (z) {
                cArr[iM5663] = c;
                iM5663++;
            }
        }
        cArr[iM5663] = ']';
        this.f9167 = iM5663 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public final void mo5916(LocalDate localDate) {
        if (localDate == null) {
            mo5922();
            return;
        }
        int i = this.f9167;
        int i2 = i + 18;
        char[] cArr = this.f9139;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        char c = this.f9172;
        cArr[i] = c;
        int iM5665 = AbstractC2848.m5665(cArr, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[iM5665] = c;
        this.f9167 = iM5665 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final void mo5917(Long l) {
        mo5918(l.longValue());
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final void mo5918(long j) {
        int i;
        long j2 = this.f9176.f9151;
        int i2 = this.f9167;
        int i3 = i2 + 23;
        char[] cArr = this.f9139;
        if (i3 > cArr.length) {
            m5955(i3);
            cArr = this.f9139;
        }
        boolean zM6008 = AbstractC2896.m6008(j, j2);
        char c = this.f9172;
        if (zM6008) {
            cArr[i2] = c;
            i2++;
        }
        int iM5672 = AbstractC2848.m5672(cArr, i2, j);
        if (!zM6008) {
            if ((512 & j2) != 0 && (j2 & 1099511627776L) == 0 && j >= -2147483648L && j <= 2147483647L) {
                i = iM5672 + 1;
                cArr[iM5672] = 'L';
            }
            this.f9167 = iM5672;
        }
        i = iM5672 + 1;
        cArr[iM5672] = c;
        iM5672 = i;
        this.f9167 = iM5672;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final void mo5919(byte b) {
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9167;
        int i2 = i + 7;
        char[] cArr = this.f9139;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        char c = this.f9172;
        if (z) {
            cArr[i] = c;
            i++;
        }
        int iM5663 = AbstractC2848.m5663(cArr, i, b);
        if (z) {
            cArr[iM5663] = c;
            iM5663++;
        }
        this.f9167 = iM5663;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final void mo5920(long[] jArr) {
        if (jArr == null) {
            mo5922();
            return;
        }
        int i = this.f9167;
        int length = (jArr.length * 23) + i + 2;
        char[] cArr = this.f9139;
        if (length > cArr.length) {
            m5955(length);
            cArr = this.f9139;
        }
        int iM5672 = i + 1;
        cArr[i] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            if (i2 != 0) {
                cArr[iM5672] = ',';
                iM5672++;
            }
            long j = jArr[i2];
            boolean zM6008 = AbstractC2896.m6008(j, this.f9176.f9151);
            char c = this.f9172;
            if (zM6008) {
                cArr[iM5672] = c;
                iM5672++;
            }
            iM5672 = AbstractC2848.m5672(cArr, iM5672, j);
            if (zM6008) {
                cArr[iM5672] = c;
                iM5672++;
            }
        }
        cArr[iM5672] = ']';
        this.f9167 = iM5672 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final void mo5921(char[] cArr) {
        int iM5962 = this.f9167;
        int length = cArr.length + iM5962 + 2;
        int i = this.f9171;
        byte b = this.f9162;
        int i2 = (i * b) + length;
        char[] cArr2 = this.f9139;
        if (i2 > cArr2.length) {
            m5955(i2);
            cArr2 = this.f9139;
        }
        if (this.f9170) {
            this.f9170 = false;
        } else {
            int i3 = iM5962 + 1;
            cArr2[iM5962] = ',';
            iM5962 = b != 0 ? m5962(i3, cArr2) : i3;
        }
        System.arraycopy(cArr, 0, cArr2, iM5962, cArr.length);
        this.f9167 = iM5962 + cArr.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final void mo5922() {
        int i = this.f9167;
        int i2 = i + 4;
        char[] cArr = this.f9139;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        AbstractC2848.m5700(i, cArr);
        this.f9167 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public final void mo5923(OffsetTime offsetTime) {
        int length;
        if (offsetTime == null) {
            mo5922();
            return;
        }
        ZoneOffset offset = offsetTime.getOffset();
        int i = this.f9167;
        int i2 = i + 28;
        char[] cArr = this.f9139;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        char c = this.f9172;
        cArr[i] = c;
        int iM5662 = AbstractC2848.m5662(cArr, i + 1, offsetTime.toLocalTime());
        if (offset.getTotalSeconds() == 0) {
            length = iM5662 + 1;
            cArr[iM5662] = 'Z';
        } else {
            String id = offset.getId();
            id.getChars(0, id.length(), cArr, iM5662);
            length = id.length() + iM5662;
        }
        cArr[length] = c;
        this.f9167 = length + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public final void mo5924(OffsetDateTime offsetDateTime) {
        int length;
        if (offsetDateTime == null) {
            mo5922();
            return;
        }
        int i = this.f9167;
        int i2 = i + 45;
        char[] cArr = this.f9139;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        char c = this.f9172;
        cArr[i] = c;
        LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
        LocalDate localDate = localDateTime.toLocalDate();
        int iM5665 = AbstractC2848.m5665(cArr, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[iM5665] = 'T';
        int iM5662 = AbstractC2848.m5662(cArr, iM5665 + 1, localDateTime.toLocalTime());
        ZoneOffset offset = offsetDateTime.getOffset();
        if (offset.getTotalSeconds() == 0) {
            length = iM5662 + 1;
            cArr[iM5662] = 'Z';
        } else {
            String id = offset.getId();
            id.getChars(0, id.length(), cArr, iM5662);
            length = id.length() + iM5662;
        }
        cArr[length] = c;
        this.f9167 = length + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void mo5925(short s) {
        int i;
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.f9167;
        int i3 = i2 + 7;
        char[] cArr = this.f9139;
        if (i3 > cArr.length) {
            m5955(i3);
            cArr = this.f9139;
        }
        char c = this.f9172;
        if (z) {
            cArr[i2] = c;
            i2++;
        }
        long[] jArr = AbstractC2848.f8884;
        int i4 = s;
        if (s < 0) {
            AbstractC2848.m5718(cArr, i2, SignatureVisitor.SUPER);
            i2++;
            i4 = -s;
        }
        if (i4 < 1000) {
            long j = jArr[i4 & 1023];
            byte b = (byte) j;
            if (b == 0) {
                AbstractC2848.m5721(i2, (int) (j >> 16), cArr);
                i2 += 2;
            } else if (b == 1) {
                AbstractC2848.m5718(cArr, i2, (char) (j >> 32));
                i2++;
            }
            AbstractC2848.m5718(cArr, i2, (char) (j >> 48));
            i = i2 + 1;
        } else {
            int i5 = (int) ((((long) i4) * 274877907) >> 38);
            long j2 = jArr[i5 & 1023];
            if (((byte) j2) == 1) {
                AbstractC2848.m5718(cArr, i2, (char) (j2 >> 32));
                i2++;
            }
            AbstractC2848.m5702(cArr, i2, (j2 >> 48) | (jArr[(i4 - (i5 * DescriptorProtos$Edition.EDITION_2023_VALUE)) & 1023] & (-65536)));
            i = i2 + 4;
        }
        if (z) {
            cArr[i] = c;
            i++;
        }
        this.f9167 = i;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final void mo5926(Integer num) {
        mo5928(num.intValue());
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void mo5927(int[] iArr) {
        if (iArr == null) {
            mo5922();
            return;
        }
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9167;
        int iM11541 = AbstractC6136.m11541(iArr.length, 13, i, 2);
        char[] cArr = this.f9139;
        if (iM11541 > cArr.length) {
            m5955(iM11541);
            cArr = this.f9139;
        }
        int iM5707 = i + 1;
        cArr[i] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 != 0) {
                cArr[iM5707] = ',';
                iM5707++;
            }
            char c = this.f9172;
            if (z) {
                cArr[iM5707] = c;
                iM5707++;
            }
            iM5707 = AbstractC2848.m5707(cArr, iM5707, iArr[i2]);
            if (z) {
                cArr[iM5707] = c;
                iM5707++;
            }
        }
        cArr[iM5707] = ']';
        this.f9167 = iM5707 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void mo5928(int i) {
        boolean z = (this.f9176.f9151 & 256) != 0;
        int i2 = this.f9167;
        int i3 = i2 + 13;
        char[] cArr = this.f9139;
        if (i3 > cArr.length) {
            m5955(i3);
            cArr = this.f9139;
        }
        char c = this.f9172;
        if (z) {
            cArr[i2] = c;
            i2++;
        }
        int iM5707 = AbstractC2848.m5707(cArr, i2, i);
        if (z) {
            cArr[iM5707] = c;
            iM5707++;
        }
        this.f9167 = iM5707;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final void mo5929(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final void mo5930(LocalDateTime localDateTime) {
        int i = this.f9167;
        int i2 = i + 38;
        char[] cArr = this.f9139;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        int i3 = i + 1;
        char c = this.f9172;
        cArr[i] = c;
        LocalDate localDate = localDateTime.toLocalDate();
        int iM5665 = AbstractC2848.m5665(cArr, i3, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[iM5665] = ' ';
        int iM5662 = AbstractC2848.m5662(cArr, iM5665 + 1, localDateTime.toLocalTime());
        cArr[iM5662] = c;
        this.f9167 = iM5662 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final void mo5931(LocalTime localTime) {
        int i = this.f9167;
        int i2 = i + 20;
        char[] cArr = this.f9139;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        char c = this.f9172;
        cArr[i] = c;
        int iM5662 = AbstractC2848.m5662(cArr, i + 1, localTime);
        cArr[iM5662] = c;
        this.f9167 = iM5662 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final void mo5932(int i, int i2, int i3, int i4, int i5, int i6) {
        char[] cArr = this.f9139;
        int i7 = this.f9167;
        if (i7 + 21 > cArr.length) {
            m5955(i7 + 21);
            cArr = this.f9139;
        }
        int i8 = this.f9167;
        char c = this.f9172;
        cArr[i8] = c;
        if (i < 0 || i > 9999) {
            throw AbstractC2896.m6009(i);
        }
        int iM5665 = AbstractC2848.m5665(cArr, i8 + 1, i, i2, i3);
        cArr[iM5665] = ' ';
        AbstractC2848.m5674(cArr, iM5665 + 1, i4, i5, i6);
        cArr[iM5665 + 9] = c;
        this.f9167 = iM5665 + 10;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void mo5933(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = z ? i8 == 0 ? 1 : 6 : 0;
        int i10 = this.f9167;
        int i11 = i10 + 25 + i9;
        char[] cArr = this.f9139;
        if (i11 > cArr.length) {
            m5955(i11);
            cArr = this.f9139;
        }
        char c = this.f9172;
        cArr[i10] = c;
        int iM5665 = AbstractC2848.m5665(cArr, i10 + 1, i, i2, i3);
        cArr[iM5665] = z ? 'T' : ' ';
        AbstractC2848.m5674(cArr, iM5665 + 1, i4, i5, i6);
        int i12 = iM5665 + 9;
        if (i7 > 0) {
            int i13 = i7 / 10;
            int i14 = i13 / 10;
            if (i7 - (i13 * 10) != 0) {
                AbstractC2848.m5702(cArr, i12, (AbstractC2848.f8884[i7 & 1023] & (-65536)) | AbstractC2848.f8892);
                i12 = iM5665 + 13;
            } else {
                int i15 = iM5665 + 10;
                cArr[i12] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                if (i13 - (i14 * 10) != 0) {
                    AbstractC2848.m5709(i15, i13, cArr);
                    i12 = iM5665 + 12;
                } else {
                    i12 = iM5665 + 11;
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
                AbstractC2848.m5709(i12 + 1, iAbs, cArr);
                cArr[i12 + 3] = ':';
                int i17 = (i8 - (i16 * 3600)) / 60;
                if (i17 < 0) {
                    i17 = -i17;
                }
                AbstractC2848.m5709(i12 + 4, i17, cArr);
                i12 += 6;
            }
        }
        cArr[i12] = c;
        this.f9167 = i12 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final void mo5934() {
        int i = this.f9167;
        char[] cArr = this.f9139;
        if (i == cArr.length) {
            m5955(i + 1);
            cArr = this.f9139;
        }
        cArr[i] = ':';
        this.f9167 = i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5935(char r9) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2891.mo5935(char):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final void mo5936(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f9167;
        int i8 = i7 + 16;
        char[] cArr = this.f9139;
        if (i8 > cArr.length) {
            m5955(i8);
            cArr = this.f9139;
        }
        char c = this.f9172;
        cArr[i7] = c;
        if (i < 0 || i > 9999) {
            throw AbstractC2896.m6009(i);
        }
        int i9 = i / 100;
        AbstractC2848.m5709(i7 + 1, i9, cArr);
        AbstractC2848.m5709(i7 + 3, i - (i9 * 100), cArr);
        AbstractC2848.m5709(i7 + 5, i2, cArr);
        AbstractC2848.m5709(i7 + 7, i3, cArr);
        AbstractC2848.m5709(i7 + 9, i4, cArr);
        AbstractC2848.m5709(i7 + 11, i5, cArr);
        AbstractC2848.m5709(i7 + 13, i6, cArr);
        cArr[i7 + 15] = c;
        this.f9167 = i8;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final void mo5937() {
        this.f9170 = false;
        int i = this.f9167;
        int i2 = this.f9171;
        byte b = this.f9162;
        int i3 = (i2 * b) + i + 2;
        char[] cArr = this.f9139;
        if (i3 > cArr.length) {
            m5955(i3);
            cArr = this.f9139;
        }
        int iM5962 = i + 1;
        cArr[i] = ',';
        if (b != 0) {
            iM5962 = m5962(iM5962, cArr);
        }
        this.f9167 = iM5962;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final void mo5938(float f) {
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9167;
        int i2 = i + 15;
        if (z) {
            i2 = i + 17;
        }
        char[] cArr = this.f9139;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        if (z) {
            cArr[i] = '\"';
            i++;
        }
        int iM5631 = AbstractC2826.m5631(cArr, i, f);
        if (z) {
            cArr[iM5631] = '\"';
            iM5631++;
        }
        this.f9167 = iM5631;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final void mo5939(double[] dArr) {
        if (dArr == null) {
            mo5922();
            return;
        }
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9167;
        int iM11541 = AbstractC6136.m11541(dArr.length, 27, i, 1);
        char[] cArr = this.f9139;
        if (iM11541 > cArr.length) {
            m5955(iM11541);
            cArr = this.f9139;
        }
        int iM5628 = i + 1;
        cArr[i] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i2 = 0; i2 < dArr.length; i2++) {
            if (i2 != 0) {
                cArr[iM5628] = ',';
                iM5628++;
            }
            if (z) {
                cArr[iM5628] = '\"';
                iM5628++;
            }
            iM5628 = AbstractC2826.m5628(cArr, iM5628, dArr[i2]);
            if (z) {
                cArr[iM5628] = '\"';
                iM5628++;
            }
        }
        cArr[iM5628] = ']';
        this.f9167 = iM5628 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void mo5940(byte[] bArr) {
        int length = (bArr.length * 2) + 3;
        int i = this.f9167;
        char[] cArr = this.f9139;
        int i2 = length + i + 2;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
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
        this.f9167 = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void mo5941(float[] fArr) {
        if (fArr == null) {
            mo5994();
            return;
        }
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9167;
        int iM11541 = AbstractC6136.m11541(fArr.length, z ? 16 : 18, i, 1);
        char[] cArr = this.f9139;
        if (iM11541 > cArr.length) {
            m5955(iM11541);
            cArr = this.f9139;
        }
        int iM5631 = i + 1;
        cArr[i] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 != 0) {
                cArr[iM5631] = ',';
                iM5631++;
            }
            if (z) {
                cArr[iM5631] = '\"';
                iM5631++;
            }
            iM5631 = AbstractC2826.m5631(cArr, iM5631, fArr[i2]);
            if (z) {
                cArr[iM5631] = '\"';
                iM5631++;
            }
        }
        cArr[iM5631] = ']';
        this.f9167 = iM5631 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final void mo5942(BigInteger bigInteger, long j) {
        if (bigInteger == null) {
            m6019();
            return;
        }
        if (AbstractC2866.m5893(bigInteger) && j == 0) {
            mo5918(bigInteger.longValue());
            return;
        }
        String string = bigInteger.toString(10);
        boolean zM6006 = AbstractC2896.m6006(bigInteger, j | this.f9176.f9151);
        int i = this.f9167;
        int length = string.length();
        int i2 = i + length + (zM6006 ? 2 : 0);
        char[] cArr = this.f9139;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        if (zM6006) {
            cArr[i] = '\"';
            i++;
        }
        string.getChars(0, length, cArr, i);
        int i3 = i + length;
        if (zM6006) {
            cArr[i3] = '\"';
            i3++;
        }
        this.f9167 = i3;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final void mo5943(byte[] bArr) {
        if (bArr == null) {
            mo5994();
            return;
        }
        int i = this.f9167;
        int length = ((((bArr.length - 1) / 3) + 1) << 2) + i + 2;
        if (length > this.f9139.length) {
            m5955(length);
        }
        char[] cArr = this.f9139;
        int i2 = i + 1;
        char c = this.f9172;
        cArr[i] = c;
        int length2 = (bArr.length / 3) * 3;
        int i3 = 0;
        while (i3 < length2) {
            int i4 = i3 + 2;
            int i5 = ((bArr[i3 + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i3] & DefaultClassResolver.NAME) << 16);
            i3 += 3;
            int i6 = i5 | (bArr[i4] & DefaultClassResolver.NAME);
            char[] cArr2 = AbstractC2932.f9294;
            cArr[i2] = cArr2[(i6 >>> 18) & 63];
            cArr[i2 + 1] = cArr2[(i6 >>> 12) & 63];
            cArr[i2 + 2] = cArr2[(i6 >>> 6) & 63];
            cArr[i2 + 3] = cArr2[i6 & 63];
            i2 += 4;
        }
        int length3 = bArr.length - length2;
        if (length3 > 0) {
            int i7 = ((bArr[length2] & DefaultClassResolver.NAME) << 10) | (length3 == 2 ? (bArr[bArr.length - 1] & DefaultClassResolver.NAME) << 2 : 0);
            char[] cArr3 = AbstractC2932.f9294;
            cArr[i2] = cArr3[i7 >> 12];
            cArr[i2 + 1] = cArr3[(i7 >>> 6) & 63];
            cArr[i2 + 2] = length3 == 2 ? cArr3[i7 & 63] : '=';
            cArr[i2 + 3] = SignatureVisitor.INSTANCEOF;
            i2 += 4;
        }
        cArr[i2] = c;
        this.f9167 = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public void mo5944(boolean z) {
        int i;
        int i2 = this.f9167 + 5;
        char[] cArr = this.f9139;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        int i3 = this.f9167;
        if ((this.f9176.f9151 & JSONWriter$Feature.WriteBooleanAsNumber.mask) != 0) {
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
        this.f9167 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5945(java.math.BigDecimal r18, long r19, java.text.DecimalFormat r21) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2891.mo5945(java.math.BigDecimal, long, java.text.DecimalFormat):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final void mo5946(double d) {
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9167;
        int i2 = i + 24;
        if (z) {
            i2 = i + 26;
        }
        char[] cArr = this.f9139;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        if (z) {
            cArr[i] = '\"';
            i++;
        }
        int iM5628 = AbstractC2826.m5628(cArr, i, d);
        if (z) {
            cArr[iM5628] = '\"';
            iM5628++;
        }
        this.f9167 = iM5628;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final void mo5947(int i, int i2, int i3) {
        int i4 = this.f9167;
        int i5 = i4 + 13;
        char[] cArr = this.f9139;
        if (i5 > cArr.length) {
            m5955(i5);
            cArr = this.f9139;
        }
        char c = this.f9172;
        cArr[i4] = c;
        int iM5665 = AbstractC2848.m5665(cArr, i4 + 1, i, i2, i3);
        cArr[iM5665] = c;
        this.f9167 = iM5665 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final void mo5948(int i, int i2, int i3) {
        int i4 = this.f9167;
        int i5 = i4 + 10;
        char[] cArr = this.f9139;
        if (i5 > cArr.length) {
            m5955(i5);
            cArr = this.f9139;
        }
        char c = this.f9172;
        cArr[i4] = c;
        if (i < 0 || i > 9999) {
            throw AbstractC2896.m6009(i);
        }
        int i6 = i / 100;
        AbstractC2848.m5709(i4 + 1, i6, cArr);
        AbstractC2848.m5709(i4 + 3, i - (i6 * 100), cArr);
        AbstractC2848.m5709(i4 + 5, i2, cArr);
        AbstractC2848.m5709(i4 + 7, i3, cArr);
        cArr[i4 + 9] = c;
        this.f9167 = i5;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo5949() {
        int i = this.f9171 - 1;
        this.f9171 = i;
        int iM5962 = this.f9167;
        int i2 = iM5962 + 1;
        byte b = this.f9162;
        int i3 = i2 + (b == 0 ? 0 : (i * b) + 1);
        char[] cArr = this.f9139;
        if (i3 > cArr.length) {
            m5955(i3);
            cArr = this.f9139;
        }
        if (b != 0) {
            iM5962 = m5962(iM5962, cArr);
        }
        cArr[iM5962] = '}';
        this.f9167 = iM5962 + 1;
        this.f9170 = false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo5950() {
        int i = this.f9171 - 1;
        this.f9171 = i;
        int iM5962 = this.f9167;
        int i2 = iM5962 + 1;
        byte b = this.f9162;
        int i3 = i2 + (b == 0 ? 0 : (i * b) + 1);
        char[] cArr = this.f9139;
        if (i3 > cArr.length) {
            m5955(i3);
            cArr = this.f9139;
        }
        if (b != 0) {
            iM5962 = m5962(iM5962, cArr);
        }
        cArr[iM5962] = ']';
        this.f9167 = iM5962 + 1;
        this.f9170 = false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void mo5951(Map map) {
        if (this.f9162 != 0) {
            super.mo5951(map);
            return;
        }
        if (map == null) {
            mo5922();
            return;
        }
        C2894 c2894 = this.f9176;
        if ((c2894.f9151 & AbstractC2896.f9160) != 0) {
            c2894.m5982(map.getClass()).mo5634(this, map, null, null, 0L);
            return;
        }
        mo5967('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (c2894.f9151 & JSONWriter$Feature.WriteMapNullValue.mask) != 0) {
                if (!z) {
                    mo5967(',');
                }
                Object key = entry.getKey();
                if (key instanceof String) {
                    mo5972((String) key);
                } else {
                    mo5992(key);
                }
                mo5967(':');
                if (value == null) {
                    mo5922();
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == String.class) {
                        mo5972((String) value);
                    } else if (cls == Integer.class) {
                        mo5926((Integer) value);
                    } else if (cls == Long.class) {
                        mo5917((Long) value);
                    } else if (cls == Boolean.class) {
                        mo5944(((Boolean) value).booleanValue());
                    } else if (cls == BigDecimal.class) {
                        mo5945((BigDecimal) value, 0L, null);
                    } else if (cls == JSONArray.class) {
                        mo5953((JSONArray) value);
                    } else if (cls == JSONObject.class) {
                        mo5951((JSONObject) value);
                    } else {
                        c2894.m5981(cls, cls).mo5634(this, value, null, null, 0L);
                    }
                }
                z = false;
            }
        }
        mo5967('}');
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void mo5952() {
        int i = this.f9171 + 1;
        this.f9171 = i;
        if (i > this.f9176.f9149) {
            m6038();
            throw null;
        }
        this.f9170 = true;
        int i2 = this.f9167;
        char[] cArr = this.f9139;
        byte b = this.f9162;
        int i3 = (i * b) + i2 + 3;
        if (i3 > cArr.length) {
            m5955(i3);
            cArr = this.f9139;
        }
        int iM5962 = i2 + 1;
        cArr[i2] = '{';
        if (b != 0) {
            iM5962 = m5962(iM5962, cArr);
        }
        this.f9167 = iM5962;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final void mo5953(List list) {
        long j = JSONWriter$Feature.ReferenceDetection.mask | JSONWriter$Feature.PrettyFormat.mask | JSONWriter$Feature.NotWriteEmptyArray.mask | JSONWriter$Feature.NotWriteDefaultValue.mask;
        C2894 c2894 = this.f9176;
        if ((j & c2894.f9151) != 0) {
            c2894.m5982(list.getClass()).mo5634(this, list, null, null, 0L);
            return;
        }
        int i = this.f9167;
        if (i == this.f9139.length) {
            m5955(i + 1);
        }
        char[] cArr = this.f9139;
        int i2 = this.f9167;
        this.f9167 = i2 + 1;
        cArr[i2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        boolean z = true;
        int i3 = 0;
        while (i3 < list.size()) {
            Object obj = list.get(i3);
            if (!z) {
                int i4 = this.f9167;
                if (i4 == this.f9139.length) {
                    m5955(i4 + 1);
                }
                char[] cArr2 = this.f9139;
                int i5 = this.f9167;
                this.f9167 = i5 + 1;
                cArr2[i5] = ',';
            }
            if (obj == null) {
                mo5922();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == String.class) {
                    mo5972((String) obj);
                } else if (cls == Integer.class) {
                    mo5926((Integer) obj);
                } else if (cls == Long.class) {
                    mo5917((Long) obj);
                } else if (cls == Boolean.class) {
                    mo5944(((Boolean) obj).booleanValue());
                } else if (cls == BigDecimal.class) {
                    mo5945((BigDecimal) obj, 0L, null);
                } else if (cls == JSONArray.class) {
                    mo5953((JSONArray) obj);
                } else if (cls == JSONObject.class) {
                    mo5951((JSONObject) obj);
                } else {
                    c2894.m5981(cls, cls).mo5634(this, obj, null, null, 0L);
                }
            }
            i3++;
            z = false;
        }
        int i6 = this.f9167;
        if (i6 == this.f9139.length) {
            m5955(i6 + 1);
        }
        char[] cArr3 = this.f9139;
        int i7 = this.f9167;
        this.f9167 = i7 + 1;
        cArr3[i7] = ']';
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final void mo5954() {
        int i = this.f9171 + 1;
        this.f9171 = i;
        if (i > this.f9176.f9149) {
            m6038();
            throw null;
        }
        int i2 = this.f9167;
        byte b = this.f9162;
        int i3 = (i * b) + i2 + 3;
        char[] cArr = this.f9139;
        if (i3 > cArr.length) {
            m5955(i3);
            cArr = this.f9139;
        }
        int iM5962 = i2 + 1;
        cArr[i2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        if (b != 0) {
            iM5962 = m5962(iM5962, cArr);
        }
        this.f9167 = iM5962;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏, reason: contains not printable characters */
    public final void m5955(int i) {
        char[] cArr = this.f9139;
        this.f9139 = Arrays.copyOf(cArr, m6044(i, cArr.length));
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏, reason: contains not printable characters */
    public final void mo5956(ZonedDateTime zonedDateTime) {
        char cCharAt;
        int i;
        int i2;
        if (zonedDateTime == null) {
            mo5922();
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
        int i3 = this.f9167;
        int i4 = i3 + i + 38;
        char[] cArr = this.f9139;
        if (i4 > cArr.length) {
            m5955(i4);
            cArr = this.f9139;
        }
        char c = this.f9172;
        cArr[i3] = c;
        LocalDate localDate = zonedDateTime.toLocalDate();
        int iM5665 = AbstractC2848.m5665(cArr, i3 + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[iM5665] = 'T';
        int iM5662 = AbstractC2848.m5662(cArr, iM5665 + 1, zonedDateTime.toLocalTime());
        if (i == 1) {
            i2 = iM5662 + 1;
            cArr[iM5662] = 'Z';
        } else if (cCharAt == '+' || cCharAt == '-') {
            id.getChars(0, length, cArr, iM5662);
            i2 = iM5662 + length;
        } else {
            int i5 = iM5662 + 1;
            cArr[iM5662] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
            id.getChars(0, length, cArr, i5);
            int i6 = i5 + length;
            cArr[i6] = ']';
            i2 = i6 + 1;
        }
        cArr[i2] = c;
        this.f9167 = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰, reason: contains not printable characters */
    public final void mo5957(UUID uuid) {
        if (uuid == null) {
            mo5922();
            return;
        }
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        int i = this.f9167 + 38;
        char[] cArr = this.f9139;
        if (i > cArr.length) {
            m5955(i);
            cArr = this.f9139;
        }
        int i2 = this.f9167;
        cArr[i2] = '\"';
        m5914(i2 + 1, (int) (mostSignificantBits >> 56), cArr, (int) (mostSignificantBits >> 48));
        m5914(i2 + 5, (int) (mostSignificantBits >> 40), cArr, (int) (mostSignificantBits >> 32));
        cArr[i2 + 9] = SignatureVisitor.SUPER;
        int i3 = (int) mostSignificantBits;
        m5914(i2 + 10, i3 >> 24, cArr, i3 >> 16);
        cArr[i2 + 14] = SignatureVisitor.SUPER;
        m5914(i2 + 15, i3 >> 8, cArr, i3);
        cArr[i2 + 19] = SignatureVisitor.SUPER;
        m5914(i2 + 20, (int) (leastSignificantBits >> 56), cArr, (int) (leastSignificantBits >> 48));
        cArr[i2 + 24] = SignatureVisitor.SUPER;
        m5914(i2 + 25, (int) (leastSignificantBits >> 40), cArr, (int) (leastSignificantBits >> 32));
        int i4 = (int) leastSignificantBits;
        m5914(i2 + 29, i4 >> 24, cArr, i4 >> 16);
        m5914(i2 + 33, i4 >> 8, cArr, i4);
        cArr[i2 + 37] = '\"';
        this.f9167 += 38;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0059. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5958(byte[] r14) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2891.m5958(byte[]):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0051. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5959(char[] r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2891.m5959(char[]):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0055. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5960(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2891.m5960(java.lang.String):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰, reason: contains not printable characters */
    public final void m5961() {
        int i = this.f9167;
        if (i == this.f9139.length) {
            m5955(i + 1);
        }
        char[] cArr = this.f9139;
        int i2 = this.f9167;
        this.f9167 = i2 + 1;
        cArr[i2] = this.f9172;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
    public final int m5962(int i, char[] cArr) {
        cArr[i] = '\n';
        int i2 = i + 1;
        int i3 = this.f9171;
        byte b = this.f9162;
        int i4 = (i3 * b) + i2;
        Arrays.fill(cArr, i2, i4, b == 1 ? '\t' : ' ');
        return i4;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
    public final void mo5963(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
    public final void mo5964(String str) {
        int length = str.length();
        int i = this.f9167;
        char[] cArr = this.f9139;
        int i2 = i + length;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        str.getChars(0, length, cArr, i);
        this.f9167 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public final void mo5965(int i, char[] cArr) {
        int i2 = this.f9167;
        char[] cArr2 = this.f9139;
        int i3 = i2 + i;
        if (i3 > cArr2.length) {
            m5955(i3);
            cArr2 = this.f9139;
        }
        System.arraycopy(cArr, 0, cArr2, i2, i);
        this.f9167 = i3;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    public final void mo5966(char c, char c2) {
        int i = this.f9167;
        char[] cArr = this.f9139;
        int i2 = i + 2;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        cArr[i] = c;
        cArr[i + 1] = c2;
        this.f9167 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public final void mo5967(char c) {
        int i = this.f9167;
        if (i == this.f9139.length) {
            m5955(i + 1);
        }
        char[] cArr = this.f9139;
        int i2 = this.f9167;
        this.f9167 = i2 + 1;
        cArr[i2] = c;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
    public final void mo5968(String[] strArr) {
        if (this.f9162 != 0 || strArr == null) {
            super.mo5968(strArr);
            return;
        }
        int i = this.f9167;
        if (i == this.f9139.length) {
            m5955(i + 1);
        }
        char[] cArr = this.f9139;
        int i2 = this.f9167;
        this.f9167 = i2 + 1;
        cArr[i2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (i3 != 0) {
                int i4 = this.f9167;
                if (i4 == this.f9139.length) {
                    m5955(i4 + 1);
                }
                char[] cArr2 = this.f9139;
                int i5 = this.f9167;
                this.f9167 = i5 + 1;
                cArr2[i5] = ',';
            }
            mo5972(strArr[i3]);
        }
        int i6 = this.f9167;
        if (i6 == this.f9139.length) {
            m5955(i6 + 1);
        }
        char[] cArr3 = this.f9139;
        int i7 = this.f9167;
        this.f9167 = i7 + 1;
        cArr3[i7] = ']';
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世, reason: contains not printable characters */
    public final void mo5969(int i, int i2, int i3) {
        int i4 = this.f9167;
        int i5 = i4 + 10;
        char[] cArr = this.f9139;
        if (i5 > cArr.length) {
            m5955(i5);
            cArr = this.f9139;
        }
        char c = this.f9172;
        cArr[i4] = (char) ((byte) c);
        AbstractC2848.m5709(i4 + 1, i, cArr);
        cArr[i4 + 3] = ':';
        AbstractC2848.m5709(i4 + 4, i2, cArr);
        cArr[i4 + 6] = ':';
        AbstractC2848.m5709(i4 + 7, i3, cArr);
        cArr[i4 + 9] = (char) ((byte) c);
        this.f9167 = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5970(int r8, char[] r9) {
        /*
            r7 = this;
            com.alibaba.fastjson2.飘花落叶言子哲世楪苏兰 r0 = r7.f9176
            long r0 = r0.f9151
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter$Feature.EscapeNoneAscii
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = r1
        L13:
            int r2 = r7.f9167
            if (r0 == 0) goto L1b
            int r3 = r8 * 6
        L19:
            int r3 = r3 + r2
            goto L1e
        L1b:
            int r3 = r8 * 2
            goto L19
        L1e:
            char[] r4 = r7.f9139
            int r5 = r4.length
            int r5 = r3 - r5
            if (r5 <= 0) goto L2a
            r7.m5955(r3)
            char[] r4 = r7.f9139
        L2a:
            int r3 = r9.length
            int r8 = java.lang.Math.min(r8, r3)
        L2f:
            if (r1 >= r8) goto L6f
            char r3 = r9[r1]
            r5 = 34
            r6 = 92
            if (r3 == r5) goto L5e
            r5 = 39
            if (r3 == r5) goto L5e
            if (r3 == r6) goto L58
            switch(r3) {
                case 0: goto L54;
                case 1: goto L54;
                case 2: goto L54;
                case 3: goto L54;
                case 4: goto L54;
                case 5: goto L54;
                case 6: goto L54;
                case 7: goto L54;
                case 8: goto L58;
                case 9: goto L58;
                case 10: goto L58;
                case 11: goto L54;
                case 12: goto L58;
                case 13: goto L58;
                case 14: goto L54;
                case 15: goto L54;
                case 16: goto L54;
                case 17: goto L54;
                case 18: goto L54;
                case 19: goto L54;
                case 20: goto L54;
                case 21: goto L54;
                case 22: goto L54;
                case 23: goto L54;
                case 24: goto L54;
                case 25: goto L54;
                case 26: goto L54;
                case 27: goto L54;
                case 28: goto L54;
                case 29: goto L54;
                case 30: goto L54;
                case 31: goto L54;
                default: goto L42;
            }
        L42:
            if (r0 == 0) goto L4e
            r5 = 127(0x7f, float:1.78E-43)
            if (r3 <= r5) goto L4e
            com.alibaba.fastjson2.util.AbstractC2820.m5621(r2, r3, r4)
        L4b:
            int r2 = r2 + 6
            goto L6c
        L4e:
            int r5 = r2 + 1
            r4[r2] = r3
        L52:
            r2 = r5
            goto L6c
        L54:
            com.alibaba.fastjson2.util.AbstractC2820.m5615(r2, r3, r4)
            goto L4b
        L58:
            com.alibaba.fastjson2.util.AbstractC2820.m5618(r2, r3, r4)
            int r2 = r2 + 2
            goto L6c
        L5e:
            char r5 = r7.f9172
            if (r3 != r5) goto L67
            int r5 = r2 + 1
            r4[r2] = r6
            r2 = r5
        L67:
            int r5 = r2 + 1
            r4[r2] = r3
            goto L52
        L6c:
            int r1 = r1 + 1
            goto L2f
        L6f:
            r7.f9167 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2891.mo5970(int, char[]):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
    public final void mo5971(List list) {
        if (this.f9162 != 0) {
            super.mo5971(list);
            return;
        }
        int i = this.f9167;
        if (i == this.f9139.length) {
            m5955(i + 1);
        }
        char[] cArr = this.f9139;
        int i2 = this.f9167;
        this.f9167 = i2 + 1;
        cArr[i2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != 0) {
                int i4 = this.f9167;
                if (i4 == this.f9139.length) {
                    m5955(i4 + 1);
                }
                char[] cArr2 = this.f9139;
                int i5 = this.f9167;
                this.f9167 = i5 + 1;
                cArr2[i5] = ',';
            }
            mo5972((String) list.get(i3));
        }
        int i6 = this.f9167;
        if (i6 == this.f9139.length) {
            m5955(i6 + 1);
        }
        char[] cArr3 = this.f9139;
        int i7 = this.f9167;
        this.f9167 = i7 + 1;
        cArr3[i7] = ']';
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
    public void mo5972(String str) {
        if (str == null) {
            mo6003();
            return;
        }
        long j = this.f9176.f9151;
        boolean z = (JSONWriter$Feature.EscapeNoneAscii.mask & j) != 0;
        boolean z2 = (j & JSONWriter$Feature.BrowserSecure.mask) != 0;
        int length = str.length();
        int i = this.f9167 + length + 2;
        if (i >= this.f9139.length) {
            m5955(i);
        }
        int i2 = 0;
        while (true) {
            char c = this.f9172;
            if (i2 >= length) {
                int i3 = this.f9167;
                char[] cArr = this.f9139;
                int i4 = i3 + 1;
                cArr[i3] = c;
                str.getChars(0, length, cArr, i4);
                int i5 = i4 + length;
                cArr[i5] = c;
                this.f9167 = i5 + 1;
                return;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\\' || cCharAt == c || cCharAt < ' ' || ((z2 && (cCharAt == '<' || cCharAt == '>' || cCharAt == '(' || cCharAt == ')')) || (z && cCharAt > 127))) {
                break;
            } else {
                i2++;
            }
        }
        m5960(str);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰, reason: contains not printable characters */
    public final void mo5973(short s) {
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m5961();
        }
        mo5925(s);
        if (z) {
            m5961();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
    public final void mo5974(boolean z) {
        char[] cArr = this.f9139;
        int i = this.f9167;
        this.f9167 = i + 1;
        char c = this.f9172;
        cArr[i] = c;
        mo5944(z);
        char[] cArr2 = this.f9139;
        int i2 = this.f9167;
        this.f9167 = i2 + 1;
        cArr2[i2] = c;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
    public final void mo5975(String str) {
        this.f9163 = str;
        int i = this.f9167;
        char[] cArr = this.f9139;
        int i2 = i + 9;
        if (i2 > cArr.length) {
            m5955(i2);
            cArr = this.f9139;
        }
        char[] cArr2 = cArr;
        long j = (((long) i) << 1) + AbstractC2853.f8918;
        Unsafe unsafe = AbstractC2853.f8919;
        unsafe.putLong(cArr2, j, f9135);
        unsafe.putLong(cArr2, j + 8, f9134);
        this.f9167 = i + 8;
        mo5972(str);
        int i3 = this.f9167;
        char[] cArr3 = this.f9139;
        if (i3 == cArr3.length) {
            m5955(i3 + 1);
            cArr3 = this.f9139;
        }
        cArr3[i3] = '}';
        this.f9167 = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
    public final void mo5976(int i, char[] cArr) {
        char c;
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.EscapeNoneAscii.mask) != 0;
        int i2 = 0;
        while (true) {
            c = this.f9172;
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
            m5960(new String(cArr, 0, i));
            return;
        }
        int i3 = this.f9167;
        int i4 = i3 + i + 2;
        char[] cArr2 = this.f9139;
        if (i4 > cArr2.length) {
            m5955(i4);
            cArr2 = this.f9139;
        }
        int i5 = i3 + 1;
        cArr2[i3] = c;
        System.arraycopy(cArr, 0, cArr2, i5, i);
        int i6 = i5 + i;
        cArr2[i6] = c;
        this.f9167 = i6 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
    public final void mo5977(long j) {
        boolean z = (this.f9176.f9151 & (JSONWriter$Feature.WriteNonStringValueAsString.mask | JSONWriter$Feature.WriteLongAsString.mask)) == 0;
        if (z) {
            m5961();
        }
        mo5918(j);
        if (z) {
            m5961();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰, reason: contains not printable characters */
    public final void mo5978(byte b) {
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m5961();
        }
        mo5919(b);
        if (z) {
            m5961();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
    public final void mo5979(int i) {
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m5961();
        }
        mo5928(i);
        if (z) {
            m5961();
        }
    }
}
