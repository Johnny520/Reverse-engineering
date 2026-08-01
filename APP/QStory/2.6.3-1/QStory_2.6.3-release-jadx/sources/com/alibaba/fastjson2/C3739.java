package com.alibaba.fastjson2;

import androidx.collection.C1123;
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
import java.util.function.Function;
import p025.AbstractC7012;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3739 extends AbstractC3730 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final long f9594;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f9595;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public byte[] f9596;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C3744 f9597;

    static {
        byte[] bArr = {123, 34, 36, 114, 101, 102, 34, 58};
        Unsafe unsafe = AbstractC3687.f9266;
        long j = AbstractC3687.f9264;
        f9594 = unsafe.getLong(bArr, j);
        unsafe.getShort(bArr, j + 6);
        bArr[6] = 39;
        unsafe.getShort(bArr, j + 6);
    }

    public C3739(C3728 c3728) {
        super(c3728, false, StandardCharsets.UTF_8);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        C3744 c3744 = AbstractC3766.f9644[iIdentityHashCode & (r0.length - 1)];
        this.f9597 = c3744;
        byte[] bArr = (byte[]) AbstractC3766.f9635.getAndSet(c3744, null);
        this.f9596 = bArr == null ? new byte[8192] : bArr;
        this.f9595 = this.f9515 ? -2821266740684990248L : -2459565876494606883L;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
    public static long m6902(long j) {
        long j2 = (j & (-281470681743361L)) | ((j << 16) & 281470681743360L);
        long j3 = (j2 & (-71776119077928961L)) | ((j2 << 8) & 71776119077928960L);
        long j4 = ((j3 & (-1080880403494997761L)) | ((j3 << 4) & 1080880403494997760L)) & 1085102592571150095L;
        long j5 = (434041037028460038L + j4) & 1157442765409226768L;
        long j6 = (((j5 << 1) + (j5 >> 1)) - (j5 >> 4)) + 3472328296227680304L + j4;
        return !AbstractC3687.f9276 ? Long.reverseBytes(j6) : j6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = this.f9596;
        if (bArr.length > 8388608) {
            return;
        }
        AbstractC3766.f9635.lazySet(this.f9597, bArr);
    }

    public final String toString() {
        return new String(this.f9596, 0, this.f9514, StandardCharsets.UTF_8);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public final void mo6520(byte[] bArr) {
        if (bArr == null) {
            mo6527();
            return;
        }
        boolean z = (this.f9523.f9498 & 256) != 0;
        int i = this.f9514;
        int iM12133 = AbstractC7012.m12133(bArr.length, 5, i, 2);
        byte[] bArr2 = this.f9596;
        if (iM12133 > bArr2.length) {
            m6906(iM12133);
            bArr2 = this.f9596;
        }
        int iM6269 = i + 1;
        bArr2[i] = 91;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i2 != 0) {
                bArr2[iM6269] = 44;
                iM6269++;
            }
            char c = this.f9519;
            if (z) {
                bArr2[iM6269] = (byte) c;
                iM6269++;
            }
            iM6269 = AbstractC3682.m6269(bArr2, iM6269, bArr[i2]);
            if (z) {
                bArr2[iM6269] = (byte) c;
                iM6269++;
            }
        }
        bArr2[iM6269] = 93;
        this.f9514 = iM6269 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public final void mo6521(LocalDate localDate) {
        if (localDate == null) {
            mo6527();
            return;
        }
        int i = this.f9514;
        int i2 = i + 18;
        byte[] bArr = this.f9596;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        byte b = (byte) this.f9519;
        bArr[i] = b;
        int iM6271 = AbstractC3682.m6271(bArr, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArr[iM6271] = b;
        this.f9514 = iM6271 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏 */
    public final void mo6522(Long l) {
        mo6523(l.longValue());
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public final void mo6523(long j) {
        int i;
        long j2 = this.f9523.f9498;
        int i2 = this.f9514;
        int i3 = i2 + 23;
        byte[] bArr = this.f9596;
        if (i3 > bArr.length) {
            m6906(i3);
            bArr = this.f9596;
        }
        boolean zM6613 = AbstractC3730.m6613(j, j2);
        char c = this.f9519;
        if (zM6613) {
            bArr[i2] = (byte) c;
            i2++;
        }
        int iM6276 = AbstractC3682.m6276(j, bArr, i2);
        if (!zM6613) {
            if ((512 & j2) != 0 && (j2 & 1099511627776L) == 0 && j >= -2147483648L && j <= 2147483647L) {
                i = iM6276 + 1;
                bArr[iM6276] = 76;
            }
            this.f9514 = iM6276;
        }
        i = iM6276 + 1;
        bArr[iM6276] = (byte) c;
        iM6276 = i;
        this.f9514 = iM6276;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪 */
    public final void mo6524(byte b) {
        boolean z = (this.f9523.f9498 & 256) != 0;
        int i = this.f9514;
        int i2 = i + 5;
        byte[] bArr = this.f9596;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        char c = this.f9519;
        if (z) {
            bArr[i] = (byte) c;
            i++;
        }
        int iM6269 = AbstractC3682.m6269(bArr, i, b);
        if (z) {
            bArr[iM6269] = (byte) c;
            iM6269++;
        }
        this.f9514 = iM6269;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲 */
    public final void mo6525(long[] jArr) {
        if (jArr == null) {
            mo6527();
            return;
        }
        int i = this.f9514;
        int length = (jArr.length * 23) + i + 2;
        byte[] bArr = this.f9596;
        if (length > bArr.length) {
            m6906(length);
            bArr = this.f9596;
        }
        int iM6276 = i + 1;
        bArr[i] = 91;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            if (i2 != 0) {
                bArr[iM6276] = 44;
                iM6276++;
            }
            long j = jArr[i2];
            boolean zM6613 = AbstractC3730.m6613(j, this.f9523.f9498);
            char c = this.f9519;
            if (zM6613) {
                bArr[iM6276] = (byte) c;
                iM6276++;
            }
            iM6276 = AbstractC3682.m6276(j, bArr, iM6276);
            if (zM6613) {
                bArr[iM6276] = (byte) c;
                iM6276++;
            }
        }
        bArr[iM6276] = 93;
        this.f9514 = iM6276 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏 */
    public final void mo6526(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世 */
    public final void mo6527() {
        int i = this.f9514;
        byte[] bArr = this.f9596;
        int i2 = i + 4;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        AbstractC3682.m6304(bArr, i);
        this.f9514 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪 */
    public final void mo6528(OffsetTime offsetTime) {
        int length;
        if (offsetTime == null) {
            mo6527();
            return;
        }
        int i = this.f9514;
        int i2 = i + 28;
        byte[] bArr = this.f9596;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        char c = this.f9519;
        bArr[i] = (byte) c;
        int iM6266 = AbstractC3682.m6266(bArr, i + 1, offsetTime.toLocalTime());
        ZoneOffset offset = offsetTime.getOffset();
        if (offset.getTotalSeconds() == 0) {
            length = iM6266 + 1;
            bArr[iM6266] = 90;
        } else {
            String id = offset.getId();
            id.getBytes(0, id.length(), bArr, iM6266);
            length = id.length() + iM6266;
        }
        bArr[length] = (byte) c;
        this.f9514 = length + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public final void mo6529(OffsetDateTime offsetDateTime) {
        int length;
        if (offsetDateTime == null) {
            mo6527();
            return;
        }
        int i = this.f9514;
        int i2 = i + 45;
        byte[] bArr = this.f9596;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        char c = this.f9519;
        bArr[i] = (byte) c;
        LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
        LocalDate localDate = localDateTime.toLocalDate();
        int iM6271 = AbstractC3682.m6271(bArr, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArr[iM6271] = 84;
        int iM6266 = AbstractC3682.m6266(bArr, iM6271 + 1, localDateTime.toLocalTime());
        ZoneOffset offset = offsetDateTime.getOffset();
        if (offset.getTotalSeconds() == 0) {
            length = iM6266 + 1;
            bArr[iM6266] = 90;
        } else {
            String id = offset.getId();
            id.getBytes(0, id.length(), bArr, iM6266);
            length = id.length() + iM6266;
        }
        bArr[length] = (byte) c;
        this.f9514 = length + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public final void mo6530(short s) {
        int i;
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.f9514;
        int i3 = i2 + 7;
        byte[] bArr = this.f9596;
        if (i3 > bArr.length) {
            m6906(i3);
            bArr = this.f9596;
        }
        char c = this.f9519;
        if (z) {
            bArr[i2] = (byte) c;
            i2++;
        }
        int[] iArr = AbstractC3682.f9232;
        int i4 = s;
        if (s < 0) {
            AbstractC3682.m6243(bArr, i2, (byte) 45);
            i2++;
            i4 = -s;
        }
        if (i4 < 1000) {
            int i5 = iArr[i4 & 1023];
            byte b = (byte) i5;
            if (b == 0) {
                AbstractC3682.m6321(bArr, i2, (short) (i5 >> 8));
                i2 += 2;
            } else if (b == 1) {
                AbstractC3682.m6243(bArr, i2, (byte) (i5 >> 16));
                i2++;
            }
            AbstractC3682.m6243(bArr, i2, (byte) (i5 >> 24));
            i = i2 + 1;
        } else {
            int i6 = (int) ((((long) i4) * 274877907) >> 38);
            int i7 = iArr[i6 & 1023];
            if (((byte) i7) == 1) {
                AbstractC3682.m6243(bArr, i2, (byte) (i7 >> 16));
                i2++;
            }
            AbstractC3682.m6327(i2, bArr, (iArr[(i4 - (i6 * DescriptorProtos$Edition.EDITION_2023_VALUE)) & 1023] & (-256)) | (i7 >> 24));
            i = i2 + 4;
        }
        if (z) {
            bArr[i] = (byte) c;
            i++;
        }
        this.f9514 = i;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏 */
    public final void mo6531(Integer num) {
        mo6533(num.intValue());
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世 */
    public final void mo6532(int[] iArr) {
        if (iArr == null) {
            mo6527();
            return;
        }
        boolean z = (this.f9523.f9498 & 256) != 0;
        int i = this.f9514;
        int iM12133 = AbstractC7012.m12133(iArr.length, 13, i, 2);
        byte[] bArr = this.f9596;
        if (iM12133 > bArr.length) {
            m6906(iM12133);
            bArr = this.f9596;
        }
        int iM6313 = i + 1;
        bArr[i] = 91;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 != 0) {
                bArr[iM6313] = 44;
                iM6313++;
            }
            char c = this.f9519;
            if (z) {
                bArr[iM6313] = (byte) c;
                iM6313++;
            }
            iM6313 = AbstractC3682.m6313(iArr[i2], bArr, iM6313);
            if (z) {
                bArr[iM6313] = (byte) c;
                iM6313++;
            }
        }
        bArr[iM6313] = 93;
        this.f9514 = iM6313 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世 */
    public final void mo6533(int i) {
        boolean z = (this.f9523.f9498 & 256) != 0;
        int i2 = this.f9514;
        int i3 = i2 + 13;
        byte[] bArr = this.f9596;
        if (i3 > bArr.length) {
            m6906(i3);
            bArr = this.f9596;
        }
        char c = this.f9519;
        if (z) {
            bArr[i2] = (byte) c;
            i2++;
        }
        int iM6313 = AbstractC3682.m6313(i, bArr, i2);
        if (z) {
            bArr[iM6313] = (byte) c;
            iM6313++;
        }
        this.f9514 = iM6313;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    public final void mo6534(byte[] bArr) {
        int iM6911 = this.f9514;
        int length = bArr.length + iM6911 + 2;
        int i = this.f9518;
        byte b = this.f9509;
        int i2 = (i * b) + length;
        byte[] bArr2 = this.f9596;
        if (i2 > bArr2.length) {
            m6906(i2);
            bArr2 = this.f9596;
        }
        if (this.f9517) {
            this.f9517 = false;
        } else {
            int i3 = iM6911 + 1;
            bArr2[iM6911] = 44;
            iM6911 = b != 0 ? m6911(bArr2, i3) : i3;
        }
        System.arraycopy(bArr, 0, bArr2, iM6911, bArr.length);
        this.f9514 = iM6911 + bArr.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public final void mo6535(LocalDateTime localDateTime) {
        int i = this.f9514;
        int i2 = i + 38;
        byte[] bArr = this.f9596;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        int i3 = i + 1;
        char c = this.f9519;
        bArr[i] = (byte) c;
        LocalDate localDate = localDateTime.toLocalDate();
        int iM6271 = AbstractC3682.m6271(bArr, i3, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArr[iM6271] = 32;
        int iM6266 = AbstractC3682.m6266(bArr, iM6271 + 1, localDateTime.toLocalTime());
        bArr[iM6266] = (byte) c;
        this.f9514 = iM6266 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世 */
    public final void mo6536(LocalTime localTime) {
        int i = this.f9514;
        int i2 = i + 20;
        byte[] bArr = this.f9596;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        char c = this.f9519;
        bArr[i] = (byte) c;
        int iM6266 = AbstractC3682.m6266(bArr, i + 1, localTime);
        bArr[iM6266] = (byte) c;
        this.f9514 = iM6266 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final void mo6537(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f9514;
        int i8 = i7 + 21;
        byte[] bArr = this.f9596;
        if (i8 > bArr.length) {
            m6906(i8);
            bArr = this.f9596;
        }
        char c = this.f9519;
        bArr[i7] = (byte) c;
        int iM6271 = AbstractC3682.m6271(bArr, i7 + 1, i, i2, i3);
        bArr[iM6271] = 32;
        AbstractC3682.m6278(bArr, iM6271 + 1, i4, i5, i6);
        bArr[iM6271 + 9] = (byte) c;
        this.f9514 = iM6271 + 10;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo6538(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = z ? i8 == 0 ? 1 : 6 : 0;
        int i10 = this.f9514;
        int i11 = i10 + 25 + i9;
        byte[] bArr = this.f9596;
        if (i11 > bArr.length) {
            m6906(i11);
            bArr = this.f9596;
        }
        char c = this.f9519;
        bArr[i10] = (byte) c;
        int iM6271 = AbstractC3682.m6271(bArr, i10 + 1, i, i2, i3);
        bArr[iM6271] = (byte) (z ? 84 : 32);
        AbstractC3682.m6278(bArr, iM6271 + 1, i4, i5, i6);
        int i12 = iM6271 + 9;
        if (i7 > 0) {
            int i13 = i7 / 10;
            int i14 = i13 / 10;
            if (i7 - (i13 * 10) != 0) {
                AbstractC3682.m6327(i12, bArr, (AbstractC3682.f9232[i7 & 1023] & (-256)) | 46);
                i12 = iM6271 + 13;
            } else {
                int i15 = iM6271 + 10;
                bArr[i12] = 46;
                if (i13 - (i14 * 10) != 0) {
                    AbstractC3682.m6315(i15, bArr, i13);
                    i12 = iM6271 + 12;
                } else {
                    i12 = iM6271 + 11;
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
                AbstractC3682.m6315(i12 + 1, bArr, iAbs);
                bArr[i12 + 3] = 58;
                int i17 = (i8 - (i16 * 3600)) / 60;
                if (i17 < 0) {
                    i17 = -i17;
                }
                AbstractC3682.m6315(i12 + 4, bArr, i17);
                i12 += 6;
            }
        }
        bArr[i12] = (byte) c;
        this.f9514 = i12 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo6539() {
        int i = this.f9514;
        m6905(i)[i] = 58;
        this.f9514 = i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6540(char c) {
        int i;
        int i2 = this.f9514;
        byte[] bArr = this.f9596;
        int i3 = i2 + 8;
        if (i3 > bArr.length) {
            m6906(i3);
            bArr = this.f9596;
        }
        int i4 = i2 + 1;
        char c2 = this.f9519;
        bArr[i2] = (byte) c2;
        if (c > 127) {
            if (c >= 55296 && c < 57344) {
                C1123.m1399(c, "illegal char ");
                return;
            }
            if (c > 2047) {
                bArr[i4] = (byte) (((c >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                bArr[i2 + 2] = (byte) (((c >> 6) & 63) | 128);
                bArr[i2 + 3] = (byte) ((c & '?') | 128);
                i = i2 + 4;
            } else {
                bArr[i4] = (byte) (((c >> 6) & 31) | 192);
                bArr[i2 + 2] = (byte) ((c & '?') | 128);
                i = i2 + 3;
            }
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
                    AbstractC3654.m6219(i4, bArr, c);
                    i = i2 + 7;
                    break;
                case '\b':
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                    AbstractC3654.m6222(i4, bArr, c);
                    i = i2 + 3;
                    break;
                default:
                    if (c != c2) {
                        i = i2 + 2;
                        bArr[i4] = (byte) c;
                    } else {
                        bArr[i4] = 92;
                        bArr[i2 + 2] = (byte) c2;
                        i = i2 + 3;
                    }
                    break;
            }
        }
        bArr[i] = (byte) c2;
        this.f9514 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final void mo6541(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f9514;
        int i8 = i7 + 16;
        byte[] bArr = this.f9596;
        if (i8 > bArr.length) {
            m6906(i8);
            bArr = this.f9596;
        }
        char c = this.f9519;
        bArr[i7] = (byte) c;
        if (i < 0 || i > 9999) {
            throw AbstractC3730.m6614(i);
        }
        int i9 = i / 100;
        AbstractC3682.m6315(i7 + 1, bArr, i9);
        AbstractC3682.m6315(i7 + 3, bArr, i - (i9 * 100));
        AbstractC3682.m6315(i7 + 5, bArr, i2);
        AbstractC3682.m6315(i7 + 7, bArr, i3);
        AbstractC3682.m6315(i7 + 9, bArr, i4);
        AbstractC3682.m6315(i7 + 11, bArr, i5);
        AbstractC3682.m6315(i7 + 13, bArr, i6);
        bArr[i7 + 15] = (byte) c;
        this.f9514 = i8;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final void mo6542() {
        this.f9517 = false;
        int i = this.f9514;
        int i2 = this.f9518;
        byte b = this.f9509;
        int i3 = (i2 * b) + i + 2;
        byte[] bArr = this.f9596;
        if (i3 > bArr.length) {
            m6906(i3);
            bArr = this.f9596;
        }
        int iM6911 = i + 1;
        bArr[i] = 44;
        if (b != 0) {
            iM6911 = m6911(bArr, iM6911);
        }
        this.f9514 = iM6911;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏 */
    public final void mo6543(float f) {
        boolean z = (this.f9523.f9498 & 256) != 0;
        int i = this.f9514;
        int i2 = i + 17;
        byte[] bArr = this.f9596;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        if (z) {
            bArr[i] = 34;
            i++;
        }
        int iM6235 = AbstractC3660.m6235(bArr, i, f);
        if (z) {
            bArr[iM6235] = 34;
            iM6235++;
        }
        this.f9514 = iM6235;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏 */
    public final void mo6544(double[] dArr) {
        if (dArr == null) {
            mo6527();
            return;
        }
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.f9514;
        int iM12133 = AbstractC7012.m12133(dArr.length, 27, i, 1);
        byte[] bArr = this.f9596;
        if (iM12133 > bArr.length) {
            m6906(iM12133);
            bArr = this.f9596;
        }
        int iM6234 = i + 1;
        bArr[i] = 91;
        for (int i2 = 0; i2 < dArr.length; i2++) {
            if (i2 != 0) {
                bArr[iM6234] = 44;
                iM6234++;
            }
            if (z) {
                bArr[iM6234] = 34;
                iM6234++;
            }
            iM6234 = AbstractC3660.m6234(bArr, iM6234, dArr[i2]);
            if (z) {
                bArr[iM6234] = 34;
                iM6234++;
            }
        }
        bArr[iM6234] = 93;
        this.f9514 = iM6234 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public final void mo6545(byte[] bArr) {
        int length = (bArr.length * 2) + 3;
        int i = this.f9514;
        int i2 = length + i + 2;
        byte[] bArr2 = this.f9596;
        if (i2 > bArr2.length) {
            m6906(i2);
            bArr2 = this.f9596;
        }
        AbstractC3682.m6321(bArr2, i, (short) 10104);
        int i3 = i + 2;
        for (byte b : bArr) {
            int i4 = ((b & 15) << 8) | ((b & 240) >> 4);
            int i5 = (101058054 + i4) & 269488144;
            AbstractC3682.m6321(bArr2, i3, (short) (((i5 >> 1) - (i5 >> 4)) + 808464432 + i4));
            i3 += 2;
        }
        bArr2[i3] = 39;
        this.f9514 = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final void mo6546(float[] fArr) {
        if (fArr == null) {
            mo6599();
            return;
        }
        boolean z = (this.f9523.f9498 & 256) != 0;
        int i = this.f9514;
        int iM12133 = AbstractC7012.m12133(fArr.length, z ? 16 : 18, i, 1);
        byte[] bArr = this.f9596;
        if (iM12133 > bArr.length) {
            m6906(iM12133);
            bArr = this.f9596;
        }
        int iM6235 = i + 1;
        bArr[i] = 91;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 != 0) {
                bArr[iM6235] = 44;
                iM6235++;
            }
            if (z) {
                bArr[iM6235] = 34;
                iM6235++;
            }
            iM6235 = AbstractC3660.m6235(bArr, iM6235, fArr[i2]);
            if (z) {
                bArr[iM6235] = 34;
                iM6235++;
            }
        }
        bArr[iM6235] = 93;
        this.f9514 = iM6235 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
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
        byte[] bArr = this.f9596;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        if (zM6611) {
            bArr[i] = 34;
            i++;
        }
        string.getBytes(0, length, bArr, i);
        int i3 = i + length;
        if (zM6611) {
            bArr[i3] = 34;
            i3++;
        }
        this.f9514 = i3;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo6548(byte[] bArr) {
        int i = this.f9514;
        int length = ((((bArr.length - 1) / 3) + 1) << 2) + i + 2;
        byte[] bArr2 = this.f9596;
        if (length > bArr2.length) {
            m6906(length);
            bArr2 = this.f9596;
        }
        int i2 = i + 1;
        char c = this.f9519;
        bArr2[i] = (byte) c;
        int length2 = (bArr.length / 3) * 3;
        int i3 = 0;
        while (i3 < length2) {
            int i4 = i3 + 2;
            int i5 = ((bArr[i3 + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i3] & DefaultClassResolver.NAME) << 16);
            i3 += 3;
            int i6 = i5 | (bArr[i4] & DefaultClassResolver.NAME);
            char[] cArr = AbstractC3766.f9641;
            bArr2[i2] = (byte) cArr[(i6 >>> 18) & 63];
            bArr2[i2 + 1] = (byte) cArr[(i6 >>> 12) & 63];
            bArr2[i2 + 2] = (byte) cArr[(i6 >>> 6) & 63];
            bArr2[i2 + 3] = (byte) cArr[i6 & 63];
            i2 += 4;
        }
        int length3 = bArr.length - length2;
        if (length3 > 0) {
            int i7 = ((bArr[length2] & DefaultClassResolver.NAME) << 10) | (length3 == 2 ? (bArr[bArr.length - 1] & DefaultClassResolver.NAME) << 2 : 0);
            char[] cArr2 = AbstractC3766.f9641;
            bArr2[i2] = (byte) cArr2[i7 >> 12];
            bArr2[i2 + 1] = (byte) cArr2[(i7 >>> 6) & 63];
            bArr2[i2 + 2] = length3 == 2 ? (byte) cArr2[i7 & 63] : (byte) 61;
            bArr2[i2 + 3] = 61;
            i2 += 4;
        }
        bArr2[i2] = (byte) c;
        this.f9514 = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo6549(boolean z) {
        int iM6246;
        int i = this.f9514 + 5;
        byte[] bArr = this.f9596;
        if (i > bArr.length) {
            m6906(i);
            bArr = this.f9596;
        }
        int i2 = this.f9514;
        if ((this.f9523.f9498 & 128) != 0) {
            iM6246 = i2 + 1;
            bArr[i2] = (byte) (z ? 49 : 48);
        } else {
            iM6246 = AbstractC3682.m6246(bArr, i2, z);
        }
        this.f9514 = iM6246;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6550(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat) {
        byte b;
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
        byte[] bArr = this.f9596;
        if (iAbs > bArr.length) {
            m6906(iAbs);
            bArr = this.f9596;
        }
        if (zM6612) {
            bArr[i] = 34;
            i++;
        }
        int i2 = 0;
        boolean z = (j2 & JSONWriter$Feature.WriteBigDecimalAsPlain.mask) != 0;
        if (iPrecision >= 19 || (iScale = bigDecimal.scale()) < 0) {
            b = 34;
            String plainString = z ? bigDecimal.toPlainString() : bigDecimal.toString();
            plainString.getBytes(0, plainString.length(), bArr, i);
            length = plainString.length() + i;
        } else {
            long j3 = AbstractC3687.f9279;
            if (j3 != -1) {
                long j4 = AbstractC3687.f9266.getLong(bigDecimal, j3);
                if (j4 != Long.MIN_VALUE && !z) {
                    short s = AbstractC3682.f9229;
                    if (j4 < 0) {
                        AbstractC3682.m6243(bArr, i, (byte) 45);
                        j4 = -j4;
                        i++;
                    }
                    if (iScale == 0) {
                        b = 34;
                        length = AbstractC3682.m6276(j4, bArr, i);
                    } else {
                        int iM6319 = AbstractC3682.m6319(j4);
                        int i3 = iM6319 - iScale;
                        if (i3 == 0) {
                            AbstractC3682.m6317(bArr, i, s);
                            i += 2;
                        } else if (i3 < 0) {
                            AbstractC3682.m6317(bArr, i, s);
                            i += 2;
                            while (i2 < (-i3)) {
                                AbstractC3682.m6243(bArr, i, (byte) 48);
                                i2++;
                                i++;
                            }
                        } else {
                            long j5 = AbstractC3682.f9230[iScale - 1];
                            b = 34;
                            long j6 = j4 / j5;
                            long j7 = j4 - (j5 * j6);
                            int iM6276 = AbstractC3682.m6276(j6, bArr, i);
                            AbstractC3682.m6243(bArr, iM6276, (byte) 46);
                            if (iScale == 1) {
                                AbstractC3682.m6243(bArr, iM6276 + 1, (byte) (j7 + 48));
                                length = iM6276 + 2;
                            } else if (iScale == 2) {
                                AbstractC3682.m6315(iM6276 + 1, bArr, (int) j7);
                                length = iM6276 + 3;
                            } else {
                                int iM63192 = (iM6319 - AbstractC3682.m6319(j7)) - i3;
                                while (i2 < iM63192) {
                                    iM6276++;
                                    AbstractC3682.m6243(bArr, iM6276, (byte) 48);
                                    i2++;
                                }
                                length = AbstractC3682.m6276(j7, bArr, iM6276 + 1);
                            }
                        }
                        b = 34;
                        length = AbstractC3682.m6276(j4, bArr, i);
                    }
                }
            }
        }
        if (zM6612) {
            bArr[length] = b;
            length++;
        }
        this.f9514 = length;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    public final void mo6551(double d) {
        boolean z = (this.f9523.f9498 & 256) != 0;
        int i = this.f9514;
        int i2 = i + 26;
        byte[] bArr = this.f9596;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        if (z) {
            bArr[i] = 34;
            i++;
        }
        int iM6234 = AbstractC3660.m6234(bArr, i, d);
        if (z) {
            bArr[iM6234] = 34;
            iM6234++;
        }
        this.f9514 = iM6234;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final void mo6552(int i, int i2, int i3) {
        int i4 = this.f9514;
        int i5 = i4 + 13;
        byte[] bArr = this.f9596;
        if (i5 > bArr.length) {
            m6906(i5);
            bArr = this.f9596;
        }
        char c = this.f9519;
        bArr[i4] = (byte) c;
        int iM6271 = AbstractC3682.m6271(bArr, i4 + 1, i, i2, i3);
        bArr[iM6271] = (byte) c;
        this.f9514 = iM6271 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo6553(int i, int i2, int i3) {
        int i4 = this.f9514;
        int i5 = i4 + 10;
        byte[] bArr = this.f9596;
        if (i5 > bArr.length) {
            m6906(i5);
            bArr = this.f9596;
        }
        char c = this.f9519;
        bArr[i4] = (byte) c;
        if (i < 0 || i > 9999) {
            throw AbstractC3730.m6614(i);
        }
        int i6 = i / 100;
        AbstractC3682.m6315(i4 + 1, bArr, i6);
        AbstractC3682.m6315(i4 + 3, bArr, i - (i6 * 100));
        AbstractC3682.m6315(i4 + 5, bArr, i2);
        AbstractC3682.m6315(i4 + 7, bArr, i3);
        bArr[i4 + 9] = (byte) c;
        this.f9514 = i5;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6554() {
        int i = this.f9518 - 1;
        this.f9518 = i;
        int iM6911 = this.f9514;
        int i2 = iM6911 + 1;
        byte b = this.f9509;
        int i3 = i2 + (b == 0 ? 0 : (i * b) + 1);
        byte[] bArr = this.f9596;
        if (i3 > bArr.length) {
            m6906(i3);
            bArr = this.f9596;
        }
        if (b != 0) {
            iM6911 = m6911(bArr, iM6911);
        }
        bArr[iM6911] = 125;
        this.f9514 = iM6911 + 1;
        this.f9517 = false;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6555() {
        int i = this.f9518 - 1;
        this.f9518 = i;
        int iM6911 = this.f9514;
        int i2 = iM6911 + 1;
        byte b = this.f9509;
        int i3 = i2 + (b == 0 ? 0 : (i * b) + 1);
        byte[] bArr = this.f9596;
        if (i3 > bArr.length) {
            m6906(i3);
            bArr = this.f9596;
        }
        if (b != 0) {
            iM6911 = m6911(bArr, iM6911);
        }
        bArr[iM6911] = 93;
        this.f9514 = iM6911 + 1;
        this.f9517 = false;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
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
        long j = c3728.f9498;
        if ((AbstractC3730.f9507 & j) != 0) {
            c3728.m6587(map.getClass()).mo6239(this, map, null, null, 0L);
            return;
        }
        int i = this.f9514;
        if (i == this.f9596.length) {
            m6906(i + 1);
        }
        byte[] bArr = this.f9596;
        int i2 = this.f9514;
        this.f9514 = i2 + 1;
        bArr[i2] = 123;
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (16 & j) != 0) {
                if (!z) {
                    int i3 = this.f9514;
                    if (i3 == this.f9596.length) {
                        m6906(i3 + 1);
                    }
                    byte[] bArr2 = this.f9596;
                    int i4 = this.f9514;
                    this.f9514 = i4 + 1;
                    bArr2[i4] = 44;
                }
                Object key = entry.getKey();
                if (key instanceof String) {
                    mo6577((String) key);
                } else {
                    mo6597(key);
                }
                int i5 = this.f9514;
                if (i5 == this.f9596.length) {
                    m6906(i5 + 1);
                }
                byte[] bArr3 = this.f9596;
                int i6 = this.f9514;
                this.f9514 = i6 + 1;
                bArr3[i6] = 58;
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
        int i7 = this.f9514;
        if (i7 == this.f9596.length) {
            m6906(i7 + 1);
        }
        byte[] bArr4 = this.f9596;
        int i8 = this.f9514;
        this.f9514 = i8 + 1;
        bArr4[i8] = 125;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo6557() {
        int i = this.f9518 + 1;
        this.f9518 = i;
        if (i > this.f9523.f9496) {
            m6644();
            throw null;
        }
        this.f9517 = true;
        int i2 = this.f9514;
        byte b = this.f9509;
        int i3 = (i * b) + i2 + 3;
        byte[] bArr = this.f9596;
        if (i3 > bArr.length) {
            m6906(i3);
            bArr = this.f9596;
        }
        int iM6911 = i2 + 1;
        bArr[i2] = 123;
        if (b != 0) {
            iM6911 = m6911(bArr, iM6911);
        }
        this.f9514 = iM6911;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final void mo6558(List list) {
        C3728 c3728 = this.f9523;
        if ((c3728.f9498 & 67309568) != 0) {
            c3728.m6587(list.getClass()).mo6239(this, list, null, null, 0L);
            return;
        }
        int i = this.f9514;
        if (i == this.f9596.length) {
            m6906(i + 1);
        }
        byte[] bArr = this.f9596;
        int i2 = this.f9514;
        this.f9514 = i2 + 1;
        bArr[i2] = 91;
        boolean z = true;
        int i3 = 0;
        while (i3 < list.size()) {
            Object obj = list.get(i3);
            if (!z) {
                int i4 = this.f9514;
                if (i4 == this.f9596.length) {
                    m6906(i4 + 1);
                }
                byte[] bArr2 = this.f9596;
                int i5 = this.f9514;
                this.f9514 = i5 + 1;
                bArr2[i5] = 44;
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
        if (i6 == this.f9596.length) {
            m6906(i6 + 1);
        }
        byte[] bArr3 = this.f9596;
        int i7 = this.f9514;
        this.f9514 = i7 + 1;
        bArr3[i7] = 93;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
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
        byte[] bArr = this.f9596;
        if (i3 > bArr.length) {
            m6906(i3);
            bArr = this.f9596;
        }
        int iM6911 = i2 + 1;
        bArr[i2] = 91;
        if (b != 0) {
            iM6911 = m6911(bArr, iM6911);
        }
        this.f9514 = iM6911;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0062. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX INFO: renamed from: 飘花落叶言楪世哲子兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6903(byte[] bArr) {
        int i;
        boolean z;
        int i2;
        int i3;
        if (bArr == null) {
            mo6608();
            return;
        }
        int i4 = this.f9514;
        byte[] bArr2 = this.f9596;
        int iM12133 = AbstractC7012.m12133(bArr.length, 6, i4, 2);
        if (iM12133 > bArr2.length) {
            m6906(iM12133);
            bArr2 = this.f9596;
        }
        byte b = (byte) this.f9519;
        long j = this.f9523.f9498;
        int i5 = 0;
        boolean z2 = true;
        boolean z3 = (AbstractC3654.f9130 & j) != 0;
        boolean z4 = (j & AbstractC3654.f9129) != 0;
        int i6 = i4 + 1;
        bArr2[i4] = b;
        int length = bArr.length >> 1;
        while (i5 < length) {
            int i7 = i5 + 1;
            byte bM6293 = AbstractC3682.m6293(bArr, i5);
            if (bM6293 < 128) {
                if (bM6293 == 40 || bM6293 == 41 || bM6293 == 60 || bM6293 == 62) {
                    if (z4) {
                        AbstractC3654.m6225(i6, bArr2, bM6293);
                        i6 += 6;
                    } else {
                        i = i6 + 1;
                        bArr2[i6] = bM6293;
                        i6 = i;
                    }
                } else if (bM6293 != 92) {
                    switch (bM6293) {
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
                            AbstractC3654.m6219(i6, bArr2, bM6293);
                            i6 += 6;
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 13:
                            AbstractC3654.m6222(i6, bArr2, bM6293);
                            i6 += 2;
                            break;
                        default:
                            if (bM6293 != b) {
                                i = i6 + 1;
                                bArr2[i6] = bM6293;
                                i6 = i;
                            } else {
                                bArr2[i6] = 92;
                                bArr2[i6 + 1] = b;
                                i6 += 2;
                            }
                            break;
                    }
                }
            } else if (bM6293 < 2048) {
                bArr2[i6] = (byte) ((bM6293 >> 6) | 192);
                bArr2[i6 + 1] = (byte) ((bM6293 & 63) | 128);
                i6 += 2;
            } else if (z3) {
                AbstractC3654.m6225(i6, bArr2, bM6293);
                i6 += 6;
            } else if (bM6293 < 55296 || bM6293 >= 57344) {
                z = z2;
                bArr2[i6] = (byte) ((bM6293 >> 12) | Opcodes.SHL_INT_LIT8);
                bArr2[i6 + 1] = (byte) (((bM6293 >> 6) & 63) | 128);
                bArr2[i6 + 2] = (byte) ((bM6293 & 63) | 128);
                i6 += 3;
                i5 = i7;
                z2 = z;
            } else if (bM6293 < 56320) {
                int i8 = i5 + 2;
                if (i8 > length) {
                    i2 = -1;
                    z = z2;
                } else {
                    z = z2;
                    char cM6293 = AbstractC3682.m6293(bArr, i7);
                    if (cM6293 < 56320 || cM6293 >= 57344) {
                        bArr2[i6] = 63;
                        i6++;
                        i5 = i7;
                        z2 = z;
                    } else {
                        i7 = i8;
                        i2 = ((bM6293 << 10) + cM6293) - 56613888;
                    }
                }
                if (i2 < 0) {
                    i3 = i6 + 1;
                    bArr2[i6] = 63;
                } else {
                    bArr2[i6] = (byte) ((i2 >> 18) | 240);
                    bArr2[i6 + 1] = (byte) (((i2 >> 12) & 63) | 128);
                    bArr2[i6 + 2] = (byte) (((i2 >> 6) & 63) | 128);
                    bArr2[i6 + 3] = (byte) ((i2 & 63) | 128);
                    i3 = i6 + 4;
                }
                i6 = i3;
                i5 = i7;
                z2 = z;
            } else {
                bArr2[i6] = 63;
                i6++;
                i5 = i7;
            }
            i5 = i7;
            z = z2;
            z2 = z;
        }
        bArr2[i6] = b;
        this.f9514 = i6 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世哲子苏兰, reason: contains not printable characters */
    public final void m6904(byte[] bArr) {
        byte b;
        long j = this.f9523.f9498 & 34359738368L;
        char c = this.f9519;
        if (j != 0) {
            byte b2 = (byte) c;
            int i = 0;
            while (i < bArr.length && (b = bArr[i]) != b2 && b != 92 && b >= 32 && b != 60 && b != 62 && b != 40 && b != 41) {
                i++;
            }
            int i2 = this.f9514;
            if (i != bArr.length) {
                m6909(bArr);
                return;
            }
            int length = bArr.length + i2 + 2;
            byte[] bArr2 = this.f9596;
            if (length > bArr2.length) {
                m6906(length);
                bArr2 = this.f9596;
            }
            bArr2[i2] = b2;
            System.arraycopy(bArr, 0, bArr2, i2 + 1, bArr.length);
            int length2 = bArr.length + 1 + i2;
            bArr2[length2] = b2;
            this.f9514 = length2 + 1;
            return;
        }
        byte b3 = (byte) c;
        int i3 = AbstractC3654.f9128;
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
                int i5 = this.f9514;
                int length4 = bArr.length + i5 + 2;
                byte[] bArr3 = this.f9596;
                if (length4 > bArr3.length) {
                    m6906(length4);
                    bArr3 = this.f9596;
                }
                int length5 = bArr.length;
                bArr3[i5] = b3;
                System.arraycopy(bArr, 0, bArr3, i5 + 1, length5);
                int i6 = i5 + length5;
                bArr3[i6 + 1] = b3;
                this.f9514 = i6 + 2;
                return;
            }
            if (!AbstractC3654.m6224(AbstractC3682.m6259(bArr, i4), this.f9595)) {
                break;
            } else {
                i4 += 8;
            }
        }
        m6909(bArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏, reason: contains not printable characters */
    public final byte[] m6905(int i) {
        byte[] bArr = this.f9596;
        if (i != bArr.length) {
            return bArr;
        }
        m6906(i + 1);
        return this.f9596;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
    public final void m6906(int i) {
        byte[] bArr = this.f9596;
        this.f9596 = Arrays.copyOf(bArr, m6649(i, bArr.length));
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
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
        byte[] bArr = this.f9596;
        if (i4 > bArr.length) {
            m6906(i4);
            bArr = this.f9596;
        }
        char c = this.f9519;
        bArr[i3] = (byte) c;
        LocalDate localDate = zonedDateTime.toLocalDate();
        int iM6271 = AbstractC3682.m6271(bArr, i3 + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArr[iM6271] = 84;
        int iM6266 = AbstractC3682.m6266(bArr, iM6271 + 1, zonedDateTime.toLocalTime());
        if (i == 1) {
            i2 = iM6266 + 1;
            bArr[iM6266] = 90;
        } else if (cCharAt == '+' || cCharAt == '-') {
            id.getBytes(0, length, bArr, iM6266);
            i2 = iM6266 + length;
        } else {
            int i5 = iM6266 + 1;
            bArr[iM6266] = 91;
            id.getBytes(0, length, bArr, i5);
            int i6 = i5 + length;
            bArr[i6] = 93;
            i2 = i6 + 1;
        }
        bArr[i2] = (byte) c;
        this.f9514 = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    public final void mo6562(UUID uuid) {
        if (uuid == null) {
            mo6527();
            return;
        }
        int i = this.f9514;
        int i2 = i + 38;
        byte[] bArr = this.f9596;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        byte[] bArr2 = bArr;
        byte b = (byte) this.f9519;
        long j = AbstractC3687.f9265 + ((long) i);
        Unsafe unsafe = AbstractC3687.f9266;
        unsafe.putByte(bArr2, j, b);
        unsafe.putByte(bArr2, 9 + j, (byte) 45);
        unsafe.putByte(bArr2, 14 + j, (byte) 45);
        unsafe.putByte(bArr2, 19 + j, (byte) 45);
        unsafe.putByte(bArr2, 24 + j, (byte) 45);
        unsafe.putByte(bArr2, 37 + j, b);
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long jM6902 = m6902(mostSignificantBits >>> 32);
        long jM69022 = m6902(mostSignificantBits);
        unsafe.putLong(bArr2, 1 + j, jM6902);
        unsafe.putInt(bArr2, 10 + j, (int) jM69022);
        unsafe.putInt(bArr2, 15 + j, (int) (jM69022 >>> 32));
        long jM69023 = m6902(leastSignificantBits >>> 32);
        long jM69024 = m6902(leastSignificantBits);
        unsafe.putInt(bArr2, 20 + j, (int) jM69023);
        unsafe.putInt(bArr2, 25 + j, (int) (jM69023 >>> 32));
        unsafe.putLong(bArr2, j + 29, jM69024);
        this.f9514 += 38;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子, reason: contains not printable characters */
    public final void m6907(String str) {
        int i;
        C3739 c3739;
        char c;
        char[] cArrM6330 = AbstractC3687.m6330(str);
        long j = this.f9523.f9498;
        boolean z = true;
        boolean z2 = (JSONWriter$Feature.BrowserSecure.mask & j) != 0;
        if ((j & JSONWriter$Feature.EscapeNoneAscii.mask) != 0) {
            i = 1;
        } else {
            i = 1;
            z = false;
        }
        int i2 = this.f9514;
        int iM12133 = AbstractC7012.m12133(cArrM6330.length, 3, i2, 2);
        if (z || z2) {
            iM12133 += cArrM6330.length * 3;
        }
        byte[] bArr = this.f9596;
        if (iM12133 > bArr.length) {
            m6906(iM12133);
            bArr = this.f9596;
        }
        char c2 = this.f9519;
        byte b = (byte) c2;
        bArr[i2] = b;
        int i3 = 0;
        int i4 = i2 + 1;
        while (i3 < cArrM6330.length && (c = cArrM6330[i3]) != c2 && c != '\\' && c >= ' ' && c <= 127 && (!z2 || (c != '<' && c != '>' && c != '(' && c != ')'))) {
            bArr[i4] = (byte) c;
            i3++;
            i4++;
        }
        if (i3 == cArrM6330.length) {
            bArr[i4] = b;
            this.f9514 = i4 + i;
            return;
        }
        this.f9514 = i4;
        if (i3 < cArrM6330.length) {
            c3739 = this;
            c3739.m6908(cArrM6330, cArrM6330.length, z2, z, i3);
        } else {
            c3739 = this;
        }
        byte[] bArr2 = c3739.f9596;
        int i5 = c3739.f9514;
        c3739.f9514 = i5 + 1;
        bArr2[i5] = b;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0032. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6908(char[] cArr, int i, boolean z, boolean z2, int i2) {
        int i3;
        int i4;
        int i5;
        int iM12133 = AbstractC7012.m12133(cArr.length - i2, 6, this.f9514, 2);
        byte[] bArr = this.f9596;
        if (iM12133 > bArr.length) {
            m6906(iM12133);
            bArr = this.f9596;
        }
        int i6 = this.f9514;
        while (i2 < i) {
            char c = cArr[i2];
            if (c <= 127) {
                if (c == '(' || c == ')' || c == '<' || c == '>') {
                    if (z) {
                        AbstractC3654.m6225(i6, bArr, c);
                        i6 += 6;
                    } else {
                        i5 = i6 + 1;
                        bArr[i6] = (byte) c;
                        i6 = i5;
                    }
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
                            AbstractC3654.m6219(i6, bArr, c);
                            i6 += 6;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                            AbstractC3654.m6222(i6, bArr, c);
                            i6 += 2;
                            break;
                        default:
                            char c2 = this.f9519;
                            if (c != c2) {
                                i5 = i6 + 1;
                                bArr[i6] = (byte) c;
                                i6 = i5;
                            } else {
                                bArr[i6] = 92;
                                bArr[i6 + 1] = (byte) c2;
                                i6 += 2;
                            }
                            break;
                    }
                }
            } else if (z2) {
                AbstractC3654.m6225(i6, bArr, c);
                i6 += 6;
            } else if (c >= 55296 && c < 57344) {
                if (c < 56320) {
                    if (cArr.length - i2 < 2) {
                        i4 = -1;
                    } else {
                        char c3 = cArr[i2 + 1];
                        if (c3 < 56320 || c3 >= 57344) {
                            i3 = i6 + 1;
                            bArr[i6] = 63;
                        } else {
                            i4 = ((c << '\n') + c3) - 56613888;
                        }
                    }
                    if (i4 < 0) {
                        i3 = i6 + 1;
                        bArr[i6] = 63;
                    } else {
                        bArr[i6] = (byte) ((i4 >> 18) | 240);
                        bArr[i6 + 1] = (byte) (((i4 >> 12) & 63) | 128);
                        bArr[i6 + 2] = (byte) ((63 & (i4 >> 6)) | 128);
                        bArr[i6 + 3] = (byte) ((i4 & 63) | 128);
                        i3 = i6 + 4;
                        i2++;
                    }
                } else {
                    i3 = i6 + 1;
                    bArr[i6] = 63;
                }
                i6 = i3;
            } else if (c > 2047) {
                bArr[i6] = (byte) (((c >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                bArr[i6 + 1] = (byte) ((63 & (c >> 6)) | 128);
                bArr[i6 + 2] = (byte) ((c & '?') | 128);
                i6 += 3;
            } else {
                bArr[i6] = (byte) (((c >> 6) & 31) | 192);
                bArr[i6 + 1] = (byte) ((c & '?') | 128);
                i6 += 2;
            }
            i2++;
        }
        this.f9514 = i6;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0047. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6909(byte[] bArr) {
        int i;
        int iM12133 = AbstractC7012.m12133(bArr.length, 6, this.f9514, 2);
        byte[] bArr2 = this.f9596;
        if (iM12133 > bArr2.length) {
            m6906(iM12133);
            bArr2 = this.f9596;
        }
        int i2 = this.f9514;
        byte b = (byte) this.f9519;
        boolean z = (this.f9523.f9498 & AbstractC3654.f9129) != 0;
        int i3 = i2 + 1;
        bArr2[i2] = b;
        for (byte b2 : bArr) {
            if (b2 == 40 || b2 == 41 || b2 == 60 || b2 == 62) {
                if (z) {
                    AbstractC3654.m6225(i3, bArr2, b2);
                    i3 += 6;
                } else {
                    i = i3 + 1;
                    bArr2[i3] = b2;
                    i3 = i;
                }
            } else if (b2 != 92) {
                switch (b2) {
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
                        AbstractC3654.m6219(i3, bArr2, b2);
                        i3 += 6;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        AbstractC3654.m6222(i3, bArr2, b2);
                        i3 += 2;
                        break;
                    default:
                        if (b2 == b) {
                            bArr2[i3] = 92;
                            bArr2[i3 + 1] = b;
                        } else if (b2 >= 0) {
                            i = i3 + 1;
                            bArr2[i3] = b2;
                            i3 = i;
                        } else {
                            bArr2[i3] = (byte) (((b2 & DefaultClassResolver.NAME) >> 6) | 192);
                            bArr2[i3 + 1] = (byte) ((b2 & 63) | 128);
                        }
                        i3 += 2;
                        break;
                }
            }
        }
        bArr2[i3] = b;
        this.f9514 = i3 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰, reason: contains not printable characters */
    public final void m6910() {
        mo6605((byte) this.f9519);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲, reason: contains not printable characters */
    public final int m6911(byte[] bArr, int i) {
        bArr[i] = 10;
        int i2 = i + 1;
        int i3 = this.f9518;
        byte b = this.f9509;
        int i4 = (i3 * b) + i2;
        Arrays.fill(bArr, i2, i4, b == 1 ? (byte) 9 : (byte) 32);
        return i4;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏 */
    public final void mo6568(byte[] bArr) {
        int i = this.f9514;
        int length = bArr.length + i;
        if (length > this.f9596.length) {
            m6906(length);
        }
        System.arraycopy(bArr, 0, this.f9596, i, bArr.length);
        this.f9514 = i + bArr.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public final void mo6569(String str) {
        char[] cArrM6330 = AbstractC3687.m6330(str);
        int i = this.f9514;
        int length = (cArrM6330.length * 3) + i;
        byte[] bArr = this.f9596;
        if (length > bArr.length) {
            m6906(length);
            bArr = this.f9596;
        }
        for (char c : cArrM6330) {
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
        this.f9514 = i;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰 */
    public final void mo6571(char c, char c2) {
        if (c > 128 || c2 > 128) {
            throw new JSONException("not support " + c + ", " + c2);
        }
        int i = this.f9514;
        byte[] bArr = this.f9596;
        int i2 = i + 2;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        bArr[i] = (byte) c;
        bArr[i + 1] = (byte) c2;
        this.f9514 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public final void mo6572(char c) {
        if (c > 128) {
            C1123.m1399(c, "not support ");
            return;
        }
        int i = this.f9514;
        if (i == this.f9596.length) {
            m6906(i + 1);
        }
        byte[] bArr = this.f9596;
        int i2 = this.f9514;
        this.f9514 = i2 + 1;
        bArr[i2] = (byte) c;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰 */
    public final void mo6605(byte b) {
        int i = this.f9514;
        m6905(i)[i] = b;
        this.f9514 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public final void mo6573(String[] strArr) {
        if (this.f9509 != 0 || strArr == null) {
            super.mo6573(strArr);
            return;
        }
        int i = this.f9514;
        m6905(i)[i] = 91;
        this.f9514 = i + 1;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (i2 != 0) {
                int i3 = this.f9514;
                m6905(i3)[i3] = 44;
                this.f9514 = i3 + 1;
            }
            mo6577(strArr[i2]);
        }
        int i4 = this.f9514;
        m6905(i4)[i4] = 93;
        this.f9514 = i4 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    public final void mo6574(int i, int i2, int i3) {
        int i4 = this.f9514;
        int i5 = i4 + 10;
        byte[] bArr = this.f9596;
        if (i5 > bArr.length) {
            m6906(i5);
            bArr = this.f9596;
        }
        char c = this.f9519;
        bArr[i4] = (byte) c;
        AbstractC3682.m6278(bArr, i4 + 1, i, i2, i3);
        bArr[i4 + 9] = (byte) c;
        this.f9514 = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6575(int i, char[] cArr) {
        char c;
        int i2;
        int i3;
        char c2;
        int i4 = 0;
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.EscapeNoneAscii.mask) != 0;
        int iM12133 = AbstractC7012.m12133(cArr.length, 3, this.f9514, 2);
        if (z) {
            iM12133 += i * 3;
        }
        byte[] bArr = this.f9596;
        if (iM12133 > bArr.length) {
            m6906(iM12133);
            bArr = this.f9596;
        }
        int i5 = this.f9514;
        while (true) {
            c = this.f9519;
            if (i4 >= i || (c2 = cArr[i4]) == c || c2 == '\\' || c2 < ' ' || c2 > 127) {
                break;
            }
            bArr[i5] = (byte) c2;
            i4++;
            i5++;
        }
        if (i4 == i) {
            this.f9514 = i5;
            return;
        }
        while (i4 < i) {
            char c3 = cArr[i4];
            if (c3 <= 127) {
                if (c3 != '\\') {
                    switch (c3) {
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
                            AbstractC3654.m6219(i5, bArr, c3);
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                            AbstractC3654.m6222(i5, bArr, c3);
                            i5 += 2;
                            break;
                        default:
                            if (c3 != c) {
                                bArr[i5] = (byte) c3;
                                i5++;
                            } else {
                                bArr[i5] = 92;
                                bArr[i5 + 1] = (byte) c;
                                i5 += 2;
                            }
                            break;
                    }
                }
                i4++;
            } else if (z) {
                AbstractC3654.m6225(i5, bArr, c3);
            } else {
                if (c3 >= 55296 && c3 < 57344) {
                    if (c3 < 56320) {
                        if (cArr.length - i4 < 2) {
                            i3 = -1;
                        } else {
                            char c4 = cArr[i4 + 1];
                            if (c4 < 56320 || c4 >= 57344) {
                                i2 = i5 + 1;
                                bArr[i5] = 63;
                            } else {
                                i3 = (-56613888) + (c3 << '\n') + c4;
                            }
                        }
                        if (i3 < 0) {
                            i2 = i5 + 1;
                            bArr[i5] = 63;
                        } else {
                            bArr[i5] = (byte) ((i3 >> 18) | 240);
                            bArr[i5 + 1] = (byte) (((i3 >> 12) & 63) | 128);
                            bArr[i5 + 2] = (byte) (((i3 >> 6) & 63) | 128);
                            bArr[i5 + 3] = (byte) ((i3 & 63) | 128);
                            i2 = i5 + 4;
                            i4++;
                        }
                    } else {
                        i2 = i5 + 1;
                        bArr[i5] = 63;
                    }
                    i5 = i2;
                } else if (c3 > 2047) {
                    bArr[i5] = (byte) (((c3 >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                    bArr[i5 + 1] = (byte) (((c3 >> 6) & 63) | 128);
                    bArr[i5 + 2] = (byte) ((c3 & '?') | 128);
                    i5 += 3;
                } else {
                    bArr[i5] = (byte) (((c3 >> 6) & 31) | 192);
                    bArr[i5 + 1] = (byte) ((c3 & '?') | 128);
                    i5 += 2;
                }
                i4++;
            }
            i5 += 6;
            i4++;
        }
        this.f9514 = i5;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public final void mo6576(List list) {
        if (this.f9509 != 0) {
            super.mo6576(list);
            return;
        }
        int i = this.f9514;
        m6905(i)[i] = 91;
        this.f9514 = i + 1;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                int i3 = this.f9514;
                m6905(i3)[i3] = 44;
                this.f9514 = i3 + 1;
            }
            String str = (String) list.get(i2);
            if (str == null) {
                mo6608();
            } else {
                Function function = AbstractC3687.f9272;
                if (function != null) {
                    byte[] bArr = (byte[]) function.apply(str);
                    if (AbstractC3687.f9271.applyAsInt(str) == 0) {
                        m6904(bArr);
                    } else {
                        m6903(bArr);
                    }
                } else {
                    m6907(str);
                }
            }
        }
        int i4 = this.f9514;
        m6905(i4)[i4] = 93;
        this.f9514 = i4 + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final void mo6577(String str) {
        if (str == null) {
            mo6608();
            return;
        }
        Function function = AbstractC3687.f9272;
        if (function == null) {
            m6907(str);
            return;
        }
        byte[] bArr = (byte[]) function.apply(str);
        if (AbstractC3687.f9271.applyAsInt(str) == 0) {
            m6904(bArr);
        } else {
            m6903(bArr);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public final void mo6578(short s) {
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m6910();
        }
        mo6530(s);
        if (z) {
            m6910();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public final void mo6579(boolean z) {
        byte b = (byte) this.f9519;
        byte[] bArr = this.f9596;
        int i = this.f9514;
        this.f9514 = i + 1;
        bArr[i] = b;
        mo6549(z);
        byte[] bArr2 = this.f9596;
        int i2 = this.f9514;
        this.f9514 = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰 */
    public final void mo6580(String str) {
        this.f9510 = str;
        int i = this.f9514;
        byte[] bArr = this.f9596;
        int i2 = i + 8;
        if (i2 > bArr.length) {
            m6906(i2);
            bArr = this.f9596;
        }
        AbstractC3687.f9266.putLong(bArr, AbstractC3687.f9265 + ((long) i), f9594);
        this.f9514 = i2;
        mo6577(str);
        mo6605((byte) 125);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public final void mo6581(int i, char[] cArr) {
        long j = this.f9523.f9498;
        boolean z = (JSONWriter$Feature.BrowserSecure.mask & j) != 0;
        boolean z2 = (j & JSONWriter$Feature.EscapeNoneAscii.mask) != 0;
        int i2 = this.f9514;
        int i3 = i * 3;
        int i4 = i2 + i3 + 2;
        if (z2 || z) {
            i4 += i3;
        }
        byte[] bArr = this.f9596;
        if (i4 > bArr.length) {
            m6906(i4);
            bArr = this.f9596;
        }
        int i5 = i2 + 1;
        char c = this.f9519;
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
        this.f9514 = i5;
        if (i6 < i) {
            m6908(cArr, i, z, z2, i6);
        }
        byte[] bArr2 = this.f9596;
        int i7 = this.f9514;
        this.f9514 = i7 + 1;
        bArr2[i7] = b;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public final void mo6582(long j) {
        boolean z = (this.f9523.f9498 & (JSONWriter$Feature.WriteNonStringValueAsString.mask | JSONWriter$Feature.WriteLongAsString.mask)) == 0;
        if (z) {
            m6910();
        }
        mo6523(j);
        if (z) {
            m6910();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public final void mo6583(byte b) {
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m6910();
        }
        mo6524(b);
        if (z) {
            m6910();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public final void mo6584(int i) {
        boolean z = (this.f9523.f9498 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            m6910();
        }
        mo6533(i);
        if (z) {
            m6910();
        }
    }
}
