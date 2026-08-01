package com.alibaba.fastjson2;

import androidx.collection.C0276;
import com.alibaba.fastjson2.util.AbstractC2820;
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
import java.util.function.Function;
import p007.AbstractC6136;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2905 extends AbstractC2896 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final long f9247;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f9248;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public byte[] f9249;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C2910 f9250;

    static {
        byte[] bArr = {123, 34, 36, 114, 101, 102, 34, 58};
        Unsafe unsafe = AbstractC2853.f8919;
        long j = AbstractC2853.f8917;
        f9247 = unsafe.getLong(bArr, j);
        unsafe.getShort(bArr, j + 6);
        bArr[6] = 39;
        unsafe.getShort(bArr, j + 6);
    }

    public C2905(C2894 c2894) {
        super(c2894, false, StandardCharsets.UTF_8);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        C2910 c2910 = AbstractC2932.f9297[iIdentityHashCode & (r0.length - 1)];
        this.f9250 = c2910;
        byte[] bArr = (byte[]) AbstractC2932.f9288.getAndSet(c2910, null);
        this.f9249 = bArr == null ? new byte[8192] : bArr;
        this.f9248 = this.f9168 ? -2821266740684990248L : -2459565876494606883L;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
    public static long m6284(long j) {
        long j2 = (j & (-281470681743361L)) | ((j << 16) & 281470681743360L);
        long j3 = (j2 & (-71776119077928961L)) | ((j2 << 8) & 71776119077928960L);
        long j4 = ((j3 & (-1080880403494997761L)) | ((j3 << 4) & 1080880403494997760L)) & 1085102592571150095L;
        long j5 = (434041037028460038L + j4) & 1157442765409226768L;
        long j6 = (((j5 << 1) + (j5 >> 1)) - (j5 >> 4)) + 3472328296227680304L + j4;
        return !AbstractC2853.f8929 ? Long.reverseBytes(j6) : j6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = this.f9249;
        if (bArr.length > 8388608) {
            return;
        }
        AbstractC2932.f9288.lazySet(this.f9250, bArr);
    }

    public final String toString() {
        return new String(this.f9249, 0, this.f9167, StandardCharsets.UTF_8);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public final void mo5915(byte[] bArr) {
        if (bArr == null) {
            mo5922();
            return;
        }
        boolean z = (this.f9176.f9151 & 256) != 0;
        int i = this.f9167;
        int iM11541 = AbstractC6136.m11541(bArr.length, 5, i, 2);
        byte[] bArr2 = this.f9249;
        if (iM11541 > bArr2.length) {
            m6288(iM11541);
            bArr2 = this.f9249;
        }
        int iM5664 = i + 1;
        bArr2[i] = 91;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i2 != 0) {
                bArr2[iM5664] = 44;
                iM5664++;
            }
            char c = this.f9172;
            if (z) {
                bArr2[iM5664] = (byte) c;
                iM5664++;
            }
            iM5664 = AbstractC2848.m5664(bArr2, iM5664, bArr[i2]);
            if (z) {
                bArr2[iM5664] = (byte) c;
                iM5664++;
            }
        }
        bArr2[iM5664] = 93;
        this.f9167 = iM5664 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public final void mo5916(LocalDate localDate) {
        if (localDate == null) {
            mo5922();
            return;
        }
        int i = this.f9167;
        int i2 = i + 18;
        byte[] bArr = this.f9249;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        byte b = (byte) this.f9172;
        bArr[i] = b;
        int iM5666 = AbstractC2848.m5666(bArr, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArr[iM5666] = b;
        this.f9167 = iM5666 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏 */
    public final void mo5917(Long l) {
        mo5918(l.longValue());
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public final void mo5918(long j) {
        int i;
        long j2 = this.f9176.f9151;
        int i2 = this.f9167;
        int i3 = i2 + 23;
        byte[] bArr = this.f9249;
        if (i3 > bArr.length) {
            m6288(i3);
            bArr = this.f9249;
        }
        boolean zM6008 = AbstractC2896.m6008(j, j2);
        char c = this.f9172;
        if (zM6008) {
            bArr[i2] = (byte) c;
            i2++;
        }
        int iM5671 = AbstractC2848.m5671(j, bArr, i2);
        if (!zM6008) {
            if ((512 & j2) != 0 && (j2 & 1099511627776L) == 0 && j >= -2147483648L && j <= 2147483647L) {
                i = iM5671 + 1;
                bArr[iM5671] = 76;
            }
            this.f9167 = iM5671;
        }
        i = iM5671 + 1;
        bArr[iM5671] = (byte) c;
        iM5671 = i;
        this.f9167 = iM5671;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪 */
    public final void mo5919(byte b) {
        boolean z = (this.f9176.f9151 & 256) != 0;
        int i = this.f9167;
        int i2 = i + 5;
        byte[] bArr = this.f9249;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        char c = this.f9172;
        if (z) {
            bArr[i] = (byte) c;
            i++;
        }
        int iM5664 = AbstractC2848.m5664(bArr, i, b);
        if (z) {
            bArr[iM5664] = (byte) c;
            iM5664++;
        }
        this.f9167 = iM5664;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲 */
    public final void mo5920(long[] jArr) {
        if (jArr == null) {
            mo5922();
            return;
        }
        int i = this.f9167;
        int length = (jArr.length * 23) + i + 2;
        byte[] bArr = this.f9249;
        if (length > bArr.length) {
            m6288(length);
            bArr = this.f9249;
        }
        int iM5671 = i + 1;
        bArr[i] = 91;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            if (i2 != 0) {
                bArr[iM5671] = 44;
                iM5671++;
            }
            long j = jArr[i2];
            boolean zM6008 = AbstractC2896.m6008(j, this.f9176.f9151);
            char c = this.f9172;
            if (zM6008) {
                bArr[iM5671] = (byte) c;
                iM5671++;
            }
            iM5671 = AbstractC2848.m5671(j, bArr, iM5671);
            if (zM6008) {
                bArr[iM5671] = (byte) c;
                iM5671++;
            }
        }
        bArr[iM5671] = 93;
        this.f9167 = iM5671 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏 */
    public final void mo5921(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世 */
    public final void mo5922() {
        int i = this.f9167;
        byte[] bArr = this.f9249;
        int i2 = i + 4;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        AbstractC2848.m5699(bArr, i);
        this.f9167 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪 */
    public final void mo5923(OffsetTime offsetTime) {
        int length;
        if (offsetTime == null) {
            mo5922();
            return;
        }
        int i = this.f9167;
        int i2 = i + 28;
        byte[] bArr = this.f9249;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        char c = this.f9172;
        bArr[i] = (byte) c;
        int iM5661 = AbstractC2848.m5661(bArr, i + 1, offsetTime.toLocalTime());
        ZoneOffset offset = offsetTime.getOffset();
        if (offset.getTotalSeconds() == 0) {
            length = iM5661 + 1;
            bArr[iM5661] = 90;
        } else {
            String id = offset.getId();
            id.getBytes(0, id.length(), bArr, iM5661);
            length = id.length() + iM5661;
        }
        bArr[length] = (byte) c;
        this.f9167 = length + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public final void mo5924(OffsetDateTime offsetDateTime) {
        int length;
        if (offsetDateTime == null) {
            mo5922();
            return;
        }
        int i = this.f9167;
        int i2 = i + 45;
        byte[] bArr = this.f9249;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        char c = this.f9172;
        bArr[i] = (byte) c;
        LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
        LocalDate localDate = localDateTime.toLocalDate();
        int iM5666 = AbstractC2848.m5666(bArr, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArr[iM5666] = 84;
        int iM5661 = AbstractC2848.m5661(bArr, iM5666 + 1, localDateTime.toLocalTime());
        ZoneOffset offset = offsetDateTime.getOffset();
        if (offset.getTotalSeconds() == 0) {
            length = iM5661 + 1;
            bArr[iM5661] = 90;
        } else {
            String id = offset.getId();
            id.getBytes(0, id.length(), bArr, iM5661);
            length = id.length() + iM5661;
        }
        bArr[length] = (byte) c;
        this.f9167 = length + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public final void mo5925(short s) {
        int i;
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.f9167;
        int i3 = i2 + 7;
        byte[] bArr = this.f9249;
        if (i3 > bArr.length) {
            m6288(i3);
            bArr = this.f9249;
        }
        char c = this.f9172;
        if (z) {
            bArr[i2] = (byte) c;
            i2++;
        }
        int[] iArr = AbstractC2848.f8885;
        int i4 = s;
        if (s < 0) {
            AbstractC2848.m5638(bArr, i2, (byte) 45);
            i2++;
            i4 = -s;
        }
        if (i4 < 1000) {
            int i5 = iArr[i4 & 1023];
            byte b = (byte) i5;
            if (b == 0) {
                AbstractC2848.m5716(bArr, i2, (short) (i5 >> 8));
                i2 += 2;
            } else if (b == 1) {
                AbstractC2848.m5638(bArr, i2, (byte) (i5 >> 16));
                i2++;
            }
            AbstractC2848.m5638(bArr, i2, (byte) (i5 >> 24));
            i = i2 + 1;
        } else {
            int i6 = (int) ((((long) i4) * 274877907) >> 38);
            int i7 = iArr[i6 & 1023];
            if (((byte) i7) == 1) {
                AbstractC2848.m5638(bArr, i2, (byte) (i7 >> 16));
                i2++;
            }
            AbstractC2848.m5722(i2, bArr, (iArr[(i4 - (i6 * DescriptorProtos$Edition.EDITION_2023_VALUE)) & 1023] & (-256)) | (i7 >> 24));
            i = i2 + 4;
        }
        if (z) {
            bArr[i] = (byte) c;
            i++;
        }
        this.f9167 = i;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏 */
    public final void mo5926(Integer num) {
        mo5928(num.intValue());
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世 */
    public final void mo5927(int[] iArr) {
        if (iArr == null) {
            mo5922();
            return;
        }
        boolean z = (this.f9176.f9151 & 256) != 0;
        int i = this.f9167;
        int iM11541 = AbstractC6136.m11541(iArr.length, 13, i, 2);
        byte[] bArr = this.f9249;
        if (iM11541 > bArr.length) {
            m6288(iM11541);
            bArr = this.f9249;
        }
        int iM5708 = i + 1;
        bArr[i] = 91;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 != 0) {
                bArr[iM5708] = 44;
                iM5708++;
            }
            char c = this.f9172;
            if (z) {
                bArr[iM5708] = (byte) c;
                iM5708++;
            }
            iM5708 = AbstractC2848.m5708(iArr[i2], bArr, iM5708);
            if (z) {
                bArr[iM5708] = (byte) c;
                iM5708++;
            }
        }
        bArr[iM5708] = 93;
        this.f9167 = iM5708 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世 */
    public final void mo5928(int i) {
        boolean z = (this.f9176.f9151 & 256) != 0;
        int i2 = this.f9167;
        int i3 = i2 + 13;
        byte[] bArr = this.f9249;
        if (i3 > bArr.length) {
            m6288(i3);
            bArr = this.f9249;
        }
        char c = this.f9172;
        if (z) {
            bArr[i2] = (byte) c;
            i2++;
        }
        int iM5708 = AbstractC2848.m5708(i, bArr, i2);
        if (z) {
            bArr[iM5708] = (byte) c;
            iM5708++;
        }
        this.f9167 = iM5708;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    public final void mo5929(byte[] bArr) {
        int iM6293 = this.f9167;
        int length = bArr.length + iM6293 + 2;
        int i = this.f9171;
        byte b = this.f9162;
        int i2 = (i * b) + length;
        byte[] bArr2 = this.f9249;
        if (i2 > bArr2.length) {
            m6288(i2);
            bArr2 = this.f9249;
        }
        if (this.f9170) {
            this.f9170 = false;
        } else {
            int i3 = iM6293 + 1;
            bArr2[iM6293] = 44;
            iM6293 = b != 0 ? m6293(bArr2, i3) : i3;
        }
        System.arraycopy(bArr, 0, bArr2, iM6293, bArr.length);
        this.f9167 = iM6293 + bArr.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public final void mo5930(LocalDateTime localDateTime) {
        int i = this.f9167;
        int i2 = i + 38;
        byte[] bArr = this.f9249;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        int i3 = i + 1;
        char c = this.f9172;
        bArr[i] = (byte) c;
        LocalDate localDate = localDateTime.toLocalDate();
        int iM5666 = AbstractC2848.m5666(bArr, i3, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArr[iM5666] = 32;
        int iM5661 = AbstractC2848.m5661(bArr, iM5666 + 1, localDateTime.toLocalTime());
        bArr[iM5661] = (byte) c;
        this.f9167 = iM5661 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世 */
    public final void mo5931(LocalTime localTime) {
        int i = this.f9167;
        int i2 = i + 20;
        byte[] bArr = this.f9249;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        char c = this.f9172;
        bArr[i] = (byte) c;
        int iM5661 = AbstractC2848.m5661(bArr, i + 1, localTime);
        bArr[iM5661] = (byte) c;
        this.f9167 = iM5661 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final void mo5932(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f9167;
        int i8 = i7 + 21;
        byte[] bArr = this.f9249;
        if (i8 > bArr.length) {
            m6288(i8);
            bArr = this.f9249;
        }
        char c = this.f9172;
        bArr[i7] = (byte) c;
        int iM5666 = AbstractC2848.m5666(bArr, i7 + 1, i, i2, i3);
        bArr[iM5666] = 32;
        AbstractC2848.m5673(bArr, iM5666 + 1, i4, i5, i6);
        bArr[iM5666 + 9] = (byte) c;
        this.f9167 = iM5666 + 10;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo5933(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = z ? i8 == 0 ? 1 : 6 : 0;
        int i10 = this.f9167;
        int i11 = i10 + 25 + i9;
        byte[] bArr = this.f9249;
        if (i11 > bArr.length) {
            m6288(i11);
            bArr = this.f9249;
        }
        char c = this.f9172;
        bArr[i10] = (byte) c;
        int iM5666 = AbstractC2848.m5666(bArr, i10 + 1, i, i2, i3);
        bArr[iM5666] = (byte) (z ? 84 : 32);
        AbstractC2848.m5673(bArr, iM5666 + 1, i4, i5, i6);
        int i12 = iM5666 + 9;
        if (i7 > 0) {
            int i13 = i7 / 10;
            int i14 = i13 / 10;
            if (i7 - (i13 * 10) != 0) {
                AbstractC2848.m5722(i12, bArr, (AbstractC2848.f8885[i7 & 1023] & (-256)) | 46);
                i12 = iM5666 + 13;
            } else {
                int i15 = iM5666 + 10;
                bArr[i12] = 46;
                if (i13 - (i14 * 10) != 0) {
                    AbstractC2848.m5710(i15, bArr, i13);
                    i12 = iM5666 + 12;
                } else {
                    i12 = iM5666 + 11;
                    bArr[i15] = (byte) (i14 + 48);
                }
            }
        }
        if (z) {
            int i16 = i8 / 3600;
            if (i8 == 0) {
                bArr[i12] = 90;
                i12++;
            } else {
                int iAbs = Math.abs(i16);
                bArr[i12] = i16 >= 0 ? (byte) 43 : (byte) 45;
                AbstractC2848.m5710(i12 + 1, bArr, iAbs);
                bArr[i12 + 3] = 58;
                int i17 = (i8 - (i16 * 3600)) / 60;
                if (i17 < 0) {
                    i17 = -i17;
                }
                AbstractC2848.m5710(i12 + 4, bArr, i17);
                i12 += 6;
            }
        }
        bArr[i12] = (byte) c;
        this.f9167 = i12 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo5934() {
        int i = this.f9167;
        m6287(i)[i] = 58;
        this.f9167 = i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5935(char r6) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2905.mo5935(char):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final void mo5936(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f9167;
        int i8 = i7 + 16;
        byte[] bArr = this.f9249;
        if (i8 > bArr.length) {
            m6288(i8);
            bArr = this.f9249;
        }
        char c = this.f9172;
        bArr[i7] = (byte) c;
        if (i < 0 || i > 9999) {
            throw AbstractC2896.m6009(i);
        }
        int i9 = i / 100;
        AbstractC2848.m5710(i7 + 1, bArr, i9);
        AbstractC2848.m5710(i7 + 3, bArr, i - (i9 * 100));
        AbstractC2848.m5710(i7 + 5, bArr, i2);
        AbstractC2848.m5710(i7 + 7, bArr, i3);
        AbstractC2848.m5710(i7 + 9, bArr, i4);
        AbstractC2848.m5710(i7 + 11, bArr, i5);
        AbstractC2848.m5710(i7 + 13, bArr, i6);
        bArr[i7 + 15] = (byte) c;
        this.f9167 = i8;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final void mo5937() {
        this.f9170 = false;
        int i = this.f9167;
        int i2 = this.f9171;
        byte b = this.f9162;
        int i3 = (i2 * b) + i + 2;
        byte[] bArr = this.f9249;
        if (i3 > bArr.length) {
            m6288(i3);
            bArr = this.f9249;
        }
        int iM6293 = i + 1;
        bArr[i] = 44;
        if (b != 0) {
            iM6293 = m6293(bArr, iM6293);
        }
        this.f9167 = iM6293;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏 */
    public final void mo5938(float f) {
        boolean z = (this.f9176.f9151 & 256) != 0;
        int i = this.f9167;
        int i2 = i + 17;
        byte[] bArr = this.f9249;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        if (z) {
            bArr[i] = 34;
            i++;
        }
        int iM5630 = AbstractC2826.m5630(bArr, i, f);
        if (z) {
            bArr[iM5630] = 34;
            iM5630++;
        }
        this.f9167 = iM5630;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏 */
    public final void mo5939(double[] dArr) {
        if (dArr == null) {
            mo5922();
            return;
        }
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9167;
        int iM11541 = AbstractC6136.m11541(dArr.length, 27, i, 1);
        byte[] bArr = this.f9249;
        if (iM11541 > bArr.length) {
            m6288(iM11541);
            bArr = this.f9249;
        }
        int iM5629 = i + 1;
        bArr[i] = 91;
        for (int i2 = 0; i2 < dArr.length; i2++) {
            if (i2 != 0) {
                bArr[iM5629] = 44;
                iM5629++;
            }
            if (z) {
                bArr[iM5629] = 34;
                iM5629++;
            }
            iM5629 = AbstractC2826.m5629(bArr, iM5629, dArr[i2]);
            if (z) {
                bArr[iM5629] = 34;
                iM5629++;
            }
        }
        bArr[iM5629] = 93;
        this.f9167 = iM5629 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public final void mo5940(byte[] bArr) {
        int length = (bArr.length * 2) + 3;
        int i = this.f9167;
        int i2 = length + i + 2;
        byte[] bArr2 = this.f9249;
        if (i2 > bArr2.length) {
            m6288(i2);
            bArr2 = this.f9249;
        }
        AbstractC2848.m5716(bArr2, i, (short) 10104);
        int i3 = i + 2;
        for (byte b : bArr) {
            int i4 = ((b & 15) << 8) | ((b & 240) >> 4);
            int i5 = (101058054 + i4) & 269488144;
            AbstractC2848.m5716(bArr2, i3, (short) (((i5 >> 1) - (i5 >> 4)) + 808464432 + i4));
            i3 += 2;
        }
        bArr2[i3] = 39;
        this.f9167 = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final void mo5941(float[] fArr) {
        if (fArr == null) {
            mo5994();
            return;
        }
        boolean z = (this.f9176.f9151 & 256) != 0;
        int i = this.f9167;
        int iM11541 = AbstractC6136.m11541(fArr.length, z ? 16 : 18, i, 1);
        byte[] bArr = this.f9249;
        if (iM11541 > bArr.length) {
            m6288(iM11541);
            bArr = this.f9249;
        }
        int iM5630 = i + 1;
        bArr[i] = 91;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 != 0) {
                bArr[iM5630] = 44;
                iM5630++;
            }
            if (z) {
                bArr[iM5630] = 34;
                iM5630++;
            }
            iM5630 = AbstractC2826.m5630(bArr, iM5630, fArr[i2]);
            if (z) {
                bArr[iM5630] = 34;
                iM5630++;
            }
        }
        bArr[iM5630] = 93;
        this.f9167 = iM5630 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
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
        byte[] bArr = this.f9249;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        if (zM6006) {
            bArr[i] = 34;
            i++;
        }
        string.getBytes(0, length, bArr, i);
        int i3 = i + length;
        if (zM6006) {
            bArr[i3] = 34;
            i3++;
        }
        this.f9167 = i3;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo5943(byte[] bArr) {
        int i = this.f9167;
        int length = ((((bArr.length - 1) / 3) + 1) << 2) + i + 2;
        byte[] bArr2 = this.f9249;
        if (length > bArr2.length) {
            m6288(length);
            bArr2 = this.f9249;
        }
        int i2 = i + 1;
        char c = this.f9172;
        bArr2[i] = (byte) c;
        int length2 = (bArr.length / 3) * 3;
        int i3 = 0;
        while (i3 < length2) {
            int i4 = i3 + 2;
            int i5 = ((bArr[i3 + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i3] & DefaultClassResolver.NAME) << 16);
            i3 += 3;
            int i6 = i5 | (bArr[i4] & DefaultClassResolver.NAME);
            char[] cArr = AbstractC2932.f9294;
            bArr2[i2] = (byte) cArr[(i6 >>> 18) & 63];
            bArr2[i2 + 1] = (byte) cArr[(i6 >>> 12) & 63];
            bArr2[i2 + 2] = (byte) cArr[(i6 >>> 6) & 63];
            bArr2[i2 + 3] = (byte) cArr[i6 & 63];
            i2 += 4;
        }
        int length3 = bArr.length - length2;
        if (length3 > 0) {
            int i7 = ((bArr[length2] & DefaultClassResolver.NAME) << 10) | (length3 == 2 ? (bArr[bArr.length - 1] & DefaultClassResolver.NAME) << 2 : 0);
            char[] cArr2 = AbstractC2932.f9294;
            bArr2[i2] = (byte) cArr2[i7 >> 12];
            bArr2[i2 + 1] = (byte) cArr2[(i7 >>> 6) & 63];
            bArr2[i2 + 2] = length3 == 2 ? (byte) cArr2[i7 & 63] : (byte) 61;
            bArr2[i2 + 3] = 61;
            i2 += 4;
        }
        bArr2[i2] = (byte) c;
        this.f9167 = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo5944(boolean z) {
        int iM5641;
        int i = this.f9167 + 5;
        byte[] bArr = this.f9249;
        if (i > bArr.length) {
            m6288(i);
            bArr = this.f9249;
        }
        int i2 = this.f9167;
        if ((this.f9176.f9151 & 128) != 0) {
            iM5641 = i2 + 1;
            bArr[i2] = (byte) (z ? 49 : 48);
        } else {
            iM5641 = AbstractC2848.m5641(bArr, i2, z);
        }
        this.f9167 = iM5641;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5945(java.math.BigDecimal r17, long r18, java.text.DecimalFormat r20) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2905.mo5945(java.math.BigDecimal, long, java.text.DecimalFormat):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    public final void mo5946(double d) {
        boolean z = (this.f9176.f9151 & 256) != 0;
        int i = this.f9167;
        int i2 = i + 26;
        byte[] bArr = this.f9249;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        if (z) {
            bArr[i] = 34;
            i++;
        }
        int iM5629 = AbstractC2826.m5629(bArr, i, d);
        if (z) {
            bArr[iM5629] = 34;
            iM5629++;
        }
        this.f9167 = iM5629;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final void mo5947(int i, int i2, int i3) {
        int i4 = this.f9167;
        int i5 = i4 + 13;
        byte[] bArr = this.f9249;
        if (i5 > bArr.length) {
            m6288(i5);
            bArr = this.f9249;
        }
        char c = this.f9172;
        bArr[i4] = (byte) c;
        int iM5666 = AbstractC2848.m5666(bArr, i4 + 1, i, i2, i3);
        bArr[iM5666] = (byte) c;
        this.f9167 = iM5666 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo5948(int i, int i2, int i3) {
        int i4 = this.f9167;
        int i5 = i4 + 10;
        byte[] bArr = this.f9249;
        if (i5 > bArr.length) {
            m6288(i5);
            bArr = this.f9249;
        }
        char c = this.f9172;
        bArr[i4] = (byte) c;
        if (i < 0 || i > 9999) {
            throw AbstractC2896.m6009(i);
        }
        int i6 = i / 100;
        AbstractC2848.m5710(i4 + 1, bArr, i6);
        AbstractC2848.m5710(i4 + 3, bArr, i - (i6 * 100));
        AbstractC2848.m5710(i4 + 5, bArr, i2);
        AbstractC2848.m5710(i4 + 7, bArr, i3);
        bArr[i4 + 9] = (byte) c;
        this.f9167 = i5;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo5949() {
        int i = this.f9171 - 1;
        this.f9171 = i;
        int iM6293 = this.f9167;
        int i2 = iM6293 + 1;
        byte b = this.f9162;
        int i3 = i2 + (b == 0 ? 0 : (i * b) + 1);
        byte[] bArr = this.f9249;
        if (i3 > bArr.length) {
            m6288(i3);
            bArr = this.f9249;
        }
        if (b != 0) {
            iM6293 = m6293(bArr, iM6293);
        }
        bArr[iM6293] = 125;
        this.f9167 = iM6293 + 1;
        this.f9170 = false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5950() {
        int i = this.f9171 - 1;
        this.f9171 = i;
        int iM6293 = this.f9167;
        int i2 = iM6293 + 1;
        byte b = this.f9162;
        int i3 = i2 + (b == 0 ? 0 : (i * b) + 1);
        byte[] bArr = this.f9249;
        if (i3 > bArr.length) {
            m6288(i3);
            bArr = this.f9249;
        }
        if (b != 0) {
            iM6293 = m6293(bArr, iM6293);
        }
        bArr[iM6293] = 93;
        this.f9167 = iM6293 + 1;
        this.f9170 = false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
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
        long j = c2894.f9151;
        if ((AbstractC2896.f9160 & j) != 0) {
            c2894.m5982(map.getClass()).mo5634(this, map, null, null, 0L);
            return;
        }
        int i = this.f9167;
        if (i == this.f9249.length) {
            m6288(i + 1);
        }
        byte[] bArr = this.f9249;
        int i2 = this.f9167;
        this.f9167 = i2 + 1;
        bArr[i2] = 123;
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (16 & j) != 0) {
                if (!z) {
                    int i3 = this.f9167;
                    if (i3 == this.f9249.length) {
                        m6288(i3 + 1);
                    }
                    byte[] bArr2 = this.f9249;
                    int i4 = this.f9167;
                    this.f9167 = i4 + 1;
                    bArr2[i4] = 44;
                }
                Object key = entry.getKey();
                if (key instanceof String) {
                    mo5972((String) key);
                } else {
                    mo5992(key);
                }
                int i5 = this.f9167;
                if (i5 == this.f9249.length) {
                    m6288(i5 + 1);
                }
                byte[] bArr3 = this.f9249;
                int i6 = this.f9167;
                this.f9167 = i6 + 1;
                bArr3[i6] = 58;
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
        int i7 = this.f9167;
        if (i7 == this.f9249.length) {
            m6288(i7 + 1);
        }
        byte[] bArr4 = this.f9249;
        int i8 = this.f9167;
        this.f9167 = i8 + 1;
        bArr4[i8] = 125;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo5952() {
        int i = this.f9171 + 1;
        this.f9171 = i;
        if (i > this.f9176.f9149) {
            m6038();
            throw null;
        }
        this.f9170 = true;
        int i2 = this.f9167;
        byte b = this.f9162;
        int i3 = (i * b) + i2 + 3;
        byte[] bArr = this.f9249;
        if (i3 > bArr.length) {
            m6288(i3);
            bArr = this.f9249;
        }
        int iM6293 = i2 + 1;
        bArr[i2] = 123;
        if (b != 0) {
            iM6293 = m6293(bArr, iM6293);
        }
        this.f9167 = iM6293;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final void mo5953(List list) {
        C2894 c2894 = this.f9176;
        if ((c2894.f9151 & 67309568) != 0) {
            c2894.m5982(list.getClass()).mo5634(this, list, null, null, 0L);
            return;
        }
        int i = this.f9167;
        if (i == this.f9249.length) {
            m6288(i + 1);
        }
        byte[] bArr = this.f9249;
        int i2 = this.f9167;
        this.f9167 = i2 + 1;
        bArr[i2] = 91;
        boolean z = true;
        int i3 = 0;
        while (i3 < list.size()) {
            Object obj = list.get(i3);
            if (!z) {
                int i4 = this.f9167;
                if (i4 == this.f9249.length) {
                    m6288(i4 + 1);
                }
                byte[] bArr2 = this.f9249;
                int i5 = this.f9167;
                this.f9167 = i5 + 1;
                bArr2[i5] = 44;
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
        if (i6 == this.f9249.length) {
            m6288(i6 + 1);
        }
        byte[] bArr3 = this.f9249;
        int i7 = this.f9167;
        this.f9167 = i7 + 1;
        bArr3[i7] = 93;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
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
        byte[] bArr = this.f9249;
        if (i3 > bArr.length) {
            m6288(i3);
            bArr = this.f9249;
        }
        int iM6293 = i2 + 1;
        bArr[i2] = 91;
        if (b != 0) {
            iM6293 = m6293(bArr, iM6293);
        }
        this.f9167 = iM6293;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0062. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX INFO: renamed from: 飘花落叶言楪世哲子兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6285(byte[] r19) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2905.m6285(byte[]):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世哲子苏兰, reason: contains not printable characters */
    public final void m6286(byte[] bArr) {
        byte b;
        long j = this.f9176.f9151 & 34359738368L;
        char c = this.f9172;
        if (j != 0) {
            byte b2 = (byte) c;
            int i = 0;
            while (i < bArr.length && (b = bArr[i]) != b2 && b != 92 && b >= 32 && b != 60 && b != 62 && b != 40 && b != 41) {
                i++;
            }
            int i2 = this.f9167;
            if (i != bArr.length) {
                m6291(bArr);
                return;
            }
            int length = bArr.length + i2 + 2;
            byte[] bArr2 = this.f9249;
            if (length > bArr2.length) {
                m6288(length);
                bArr2 = this.f9249;
            }
            bArr2[i2] = b2;
            System.arraycopy(bArr, 0, bArr2, i2 + 1, bArr.length);
            int length2 = bArr.length + 1 + i2;
            bArr2[length2] = b2;
            this.f9167 = length2 + 1;
            return;
        }
        byte b3 = (byte) c;
        int i3 = AbstractC2820.f8781;
        int length3 = bArr.length & (-8);
        int i4 = 0;
        while (true) {
            if (i4 >= length3) {
                while (i4 < bArr.length) {
                    byte b4 = bArr[i4];
                    if (b4 != b3 && b4 != 92 && b4 >= 32) {
                        i4++;
                    }
                }
                int i5 = this.f9167;
                int length4 = bArr.length + i5 + 2;
                byte[] bArr3 = this.f9249;
                if (length4 > bArr3.length) {
                    m6288(length4);
                    bArr3 = this.f9249;
                }
                int length5 = bArr.length;
                bArr3[i5] = b3;
                System.arraycopy(bArr, 0, bArr3, i5 + 1, length5);
                int i6 = i5 + length5;
                bArr3[i6 + 1] = b3;
                this.f9167 = i6 + 2;
                return;
            }
            if (!AbstractC2820.m5619(AbstractC2848.m5654(bArr, i4), this.f9248)) {
                break;
            } else {
                i4 += 8;
            }
        }
        m6291(bArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏, reason: contains not printable characters */
    public final byte[] m6287(int i) {
        byte[] bArr = this.f9249;
        if (i != bArr.length) {
            return bArr;
        }
        m6288(i + 1);
        return this.f9249;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
    public final void m6288(int i) {
        byte[] bArr = this.f9249;
        this.f9249 = Arrays.copyOf(bArr, m6044(i, bArr.length));
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
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
        byte[] bArr = this.f9249;
        if (i4 > bArr.length) {
            m6288(i4);
            bArr = this.f9249;
        }
        char c = this.f9172;
        bArr[i3] = (byte) c;
        LocalDate localDate = zonedDateTime.toLocalDate();
        int iM5666 = AbstractC2848.m5666(bArr, i3 + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArr[iM5666] = 84;
        int iM5661 = AbstractC2848.m5661(bArr, iM5666 + 1, zonedDateTime.toLocalTime());
        if (i == 1) {
            i2 = iM5661 + 1;
            bArr[iM5661] = 90;
        } else if (cCharAt == '+' || cCharAt == '-') {
            id.getBytes(0, length, bArr, iM5661);
            i2 = iM5661 + length;
        } else {
            int i5 = iM5661 + 1;
            bArr[iM5661] = 91;
            id.getBytes(0, length, bArr, i5);
            int i6 = i5 + length;
            bArr[i6] = 93;
            i2 = i6 + 1;
        }
        bArr[i2] = (byte) c;
        this.f9167 = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    public final void mo5957(UUID uuid) {
        if (uuid == null) {
            mo5922();
            return;
        }
        int i = this.f9167;
        int i2 = i + 38;
        byte[] bArr = this.f9249;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        byte[] bArr2 = bArr;
        byte b = (byte) this.f9172;
        long j = AbstractC2853.f8918 + ((long) i);
        Unsafe unsafe = AbstractC2853.f8919;
        unsafe.putByte(bArr2, j, b);
        unsafe.putByte(bArr2, 9 + j, (byte) 45);
        unsafe.putByte(bArr2, 14 + j, (byte) 45);
        unsafe.putByte(bArr2, 19 + j, (byte) 45);
        unsafe.putByte(bArr2, 24 + j, (byte) 45);
        unsafe.putByte(bArr2, 37 + j, b);
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long jM6284 = m6284(mostSignificantBits >>> 32);
        long jM62842 = m6284(mostSignificantBits);
        unsafe.putLong(bArr2, 1 + j, jM6284);
        unsafe.putInt(bArr2, 10 + j, (int) jM62842);
        unsafe.putInt(bArr2, 15 + j, (int) (jM62842 >>> 32));
        long jM62843 = m6284(leastSignificantBits >>> 32);
        long jM62844 = m6284(leastSignificantBits);
        unsafe.putInt(bArr2, 20 + j, (int) jM62843);
        unsafe.putInt(bArr2, 25 + j, (int) (jM62843 >>> 32));
        unsafe.putLong(bArr2, j + 29, jM62844);
        this.f9167 += 38;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子, reason: contains not printable characters */
    public final void m6289(String str) {
        int i;
        C2905 c2905;
        char c;
        char[] cArrM5725 = AbstractC2853.m5725(str);
        long j = this.f9176.f9151;
        boolean z = true;
        boolean z2 = (JSONWriter$Feature.BrowserSecure.mask & j) != 0;
        if ((j & JSONWriter$Feature.EscapeNoneAscii.mask) != 0) {
            i = 1;
        } else {
            i = 1;
            z = false;
        }
        int i2 = this.f9167;
        int iM11541 = AbstractC6136.m11541(cArrM5725.length, 3, i2, 2);
        if (z || z2) {
            iM11541 += cArrM5725.length * 3;
        }
        byte[] bArr = this.f9249;
        if (iM11541 > bArr.length) {
            m6288(iM11541);
            bArr = this.f9249;
        }
        char c2 = this.f9172;
        byte b = (byte) c2;
        bArr[i2] = b;
        int i3 = 0;
        int i4 = i2 + 1;
        while (i3 < cArrM5725.length && (c = cArrM5725[i3]) != c2 && c != '\\' && c >= ' ' && c <= 127 && (!z2 || (c != '<' && c != '>' && c != '(' && c != ')'))) {
            bArr[i4] = (byte) c;
            i3++;
            i4++;
        }
        if (i3 == cArrM5725.length) {
            bArr[i4] = b;
            this.f9167 = i4 + i;
            return;
        }
        this.f9167 = i4;
        if (i3 < cArrM5725.length) {
            c2905 = this;
            c2905.m6290(cArrM5725, cArrM5725.length, z2, z, i3);
        } else {
            c2905 = this;
        }
        byte[] bArr2 = c2905.f9249;
        int i5 = c2905.f9167;
        c2905.f9167 = i5 + 1;
        bArr2[i5] = b;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0032. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6290(char[] r9, int r10, boolean r11, boolean r12, int r13) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2905.m6290(char[], int, boolean, boolean, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0047. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6291(byte[] r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2905.m6291(byte[]):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰, reason: contains not printable characters */
    public final void m6292() {
        mo6000((byte) this.f9172);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲, reason: contains not printable characters */
    public final int m6293(byte[] bArr, int i) {
        bArr[i] = 10;
        int i2 = i + 1;
        int i3 = this.f9171;
        byte b = this.f9162;
        int i4 = (i3 * b) + i2;
        Arrays.fill(bArr, i2, i4, b == 1 ? (byte) 9 : (byte) 32);
        return i4;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏 */
    public final void mo5963(byte[] bArr) {
        int i = this.f9167;
        int length = bArr.length + i;
        if (length > this.f9249.length) {
            m6288(length);
        }
        System.arraycopy(bArr, 0, this.f9249, i, bArr.length);
        this.f9167 = i + bArr.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public final void mo5964(String str) {
        char[] cArrM5725 = AbstractC2853.m5725(str);
        int i = this.f9167;
        int length = (cArrM5725.length * 3) + i;
        byte[] bArr = this.f9249;
        if (length > bArr.length) {
            m6288(length);
            bArr = this.f9249;
        }
        for (char c : cArrM5725) {
            if (c >= 1 && c <= 127) {
                bArr[i] = (byte) c;
                i++;
            } else if (c > 2047) {
                bArr[i] = (byte) (((c >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                bArr[i + 1] = (byte) (((c >> 6) & 63) | 128);
                bArr[i + 2] = (byte) ((c & '?') | 128);
                i += 3;
            } else {
                bArr[i] = (byte) (((c >> 6) & 31) | 192);
                bArr[i + 1] = (byte) ((c & '?') | 128);
                i += 2;
            }
        }
        this.f9167 = i;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰 */
    public final void mo5966(char c, char c2) {
        if (c > 128 || c2 > 128) {
            throw new JSONException("not support " + c + ", " + c2);
        }
        int i = this.f9167;
        byte[] bArr = this.f9249;
        int i2 = i + 2;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        bArr[i] = (byte) c;
        bArr[i + 1] = (byte) c2;
        this.f9167 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public final void mo5967(char c) {
        if (c > 128) {
            C0276.m838(c, "not support ");
            return;
        }
        int i = this.f9167;
        if (i == this.f9249.length) {
            m6288(i + 1);
        }
        byte[] bArr = this.f9249;
        int i2 = this.f9167;
        this.f9167 = i2 + 1;
        bArr[i2] = (byte) c;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰 */
    public final void mo6000(byte b) {
        int i = this.f9167;
        m6287(i)[i] = b;
        this.f9167 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public final void mo5968(String[] strArr) {
        if (this.f9162 != 0 || strArr == null) {
            super.mo5968(strArr);
            return;
        }
        int i = this.f9167;
        m6287(i)[i] = 91;
        this.f9167 = i + 1;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (i2 != 0) {
                int i3 = this.f9167;
                m6287(i3)[i3] = 44;
                this.f9167 = i3 + 1;
            }
            mo5972(strArr[i2]);
        }
        int i4 = this.f9167;
        m6287(i4)[i4] = 93;
        this.f9167 = i4 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    public final void mo5969(int i, int i2, int i3) {
        int i4 = this.f9167;
        int i5 = i4 + 10;
        byte[] bArr = this.f9249;
        if (i5 > bArr.length) {
            m6288(i5);
            bArr = this.f9249;
        }
        char c = this.f9172;
        bArr[i4] = (byte) c;
        AbstractC2848.m5673(bArr, i4 + 1, i, i2, i3);
        bArr[i4 + 9] = (byte) c;
        this.f9167 = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5970(int r18, char[] r19) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2905.mo5970(int, char[]):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public final void mo5971(List list) {
        if (this.f9162 != 0) {
            super.mo5971(list);
            return;
        }
        int i = this.f9167;
        m6287(i)[i] = 91;
        this.f9167 = i + 1;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                int i3 = this.f9167;
                m6287(i3)[i3] = 44;
                this.f9167 = i3 + 1;
            }
            String str = (String) list.get(i2);
            if (str == null) {
                mo6003();
            } else {
                Function function = AbstractC2853.f8925;
                if (function != null) {
                    byte[] bArr = (byte[]) function.apply(str);
                    if (AbstractC2853.f8924.applyAsInt(str) == 0) {
                        m6286(bArr);
                    } else {
                        m6285(bArr);
                    }
                } else {
                    m6289(str);
                }
            }
        }
        int i4 = this.f9167;
        m6287(i4)[i4] = 93;
        this.f9167 = i4 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final void mo5972(String str) {
        if (str == null) {
            mo6003();
            return;
        }
        Function function = AbstractC2853.f8925;
        if (function == null) {
            m6289(str);
            return;
        }
        byte[] bArr = (byte[]) function.apply(str);
        if (AbstractC2853.f8924.applyAsInt(str) == 0) {
            m6286(bArr);
        } else {
            m6285(bArr);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public final void mo5973(short s) {
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m6292();
        }
        mo5925(s);
        if (z) {
            m6292();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public final void mo5974(boolean z) {
        byte b = (byte) this.f9172;
        byte[] bArr = this.f9249;
        int i = this.f9167;
        this.f9167 = i + 1;
        bArr[i] = b;
        mo5944(z);
        byte[] bArr2 = this.f9249;
        int i2 = this.f9167;
        this.f9167 = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰 */
    public final void mo5975(String str) {
        this.f9163 = str;
        int i = this.f9167;
        byte[] bArr = this.f9249;
        int i2 = i + 8;
        if (i2 > bArr.length) {
            m6288(i2);
            bArr = this.f9249;
        }
        AbstractC2853.f8919.putLong(bArr, AbstractC2853.f8918 + ((long) i), f9247);
        this.f9167 = i2;
        mo5972(str);
        mo6000((byte) 125);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public final void mo5976(int i, char[] cArr) {
        long j = this.f9176.f9151;
        boolean z = (JSONWriter$Feature.BrowserSecure.mask & j) != 0;
        boolean z2 = (j & JSONWriter$Feature.EscapeNoneAscii.mask) != 0;
        int i2 = this.f9167;
        int i3 = i * 3;
        int i4 = i2 + i3 + 2;
        if (z2 || z) {
            i4 += i3;
        }
        byte[] bArr = this.f9249;
        if (i4 > bArr.length) {
            m6288(i4);
            bArr = this.f9249;
        }
        int i5 = i2 + 1;
        char c = this.f9172;
        byte b = (byte) c;
        bArr[i2] = b;
        int i6 = 0;
        while (i6 < i) {
            char c2 = cArr[i6];
            if (c2 == c || c2 == '\\' || c2 < ' ' || c2 > 127 || (z && (c2 == '<' || c2 == '>' || c2 == '(' || c2 == ')'))) {
                break;
            }
            bArr[i5] = (byte) c2;
            i6++;
            i5++;
        }
        this.f9167 = i5;
        if (i6 < i) {
            m6290(cArr, i, z, z2, i6);
        }
        byte[] bArr2 = this.f9249;
        int i7 = this.f9167;
        this.f9167 = i7 + 1;
        bArr2[i7] = b;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public final void mo5977(long j) {
        boolean z = (this.f9176.f9151 & (JSONWriter$Feature.WriteNonStringValueAsString.mask | JSONWriter$Feature.WriteLongAsString.mask)) == 0;
        if (z) {
            m6292();
        }
        mo5918(j);
        if (z) {
            m6292();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public final void mo5978(byte b) {
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m6292();
        }
        mo5919(b);
        if (z) {
            m6292();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public final void mo5979(int i) {
        boolean z = (this.f9176.f9151 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m6292();
        }
        mo5928(i);
        if (z) {
            m6292();
        }
    }
}
