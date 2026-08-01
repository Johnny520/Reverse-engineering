package com.alibaba.fastjson2;

import androidx.collection.C0276;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.android.dx.io.Opcodes;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p007.AbstractC6136;
import p291.InterfaceC8531;
import p298.C8604;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2895 extends AbstractC2896 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final byte[] f9153 = InterfaceC2911.m6297("Asia/Shanghai");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public long f9154;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f9155;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C8604 f9156;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public byte[] f9157;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C2910 f9158;

    static {
        InterfaceC2911.m6297("+08:00");
    }

    public C2895(C2894 c2894) {
        super(c2894, true, StandardCharsets.UTF_8);
        C2910[] c2910Arr = AbstractC2932.f9297;
        C2910 c2910 = c2910Arr[System.identityHashCode(Thread.currentThread()) & (c2910Arr.length - 1)];
        this.f9158 = c2910;
        byte[] bArr = (byte[]) AbstractC2932.f9288.getAndSet(c2910, null);
        this.f9157 = bArr == null ? new byte[8192] : bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏, reason: contains not printable characters */
    public static int m5983(int i) {
        if (i >= -16 && i <= 47) {
            return 1;
        }
        if (i < -2048 || i > 2047) {
            return (i < -262144 || i > 262143) ? 5 : 3;
        }
        return 2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = this.f9157;
        if (bArr.length < 8388608) {
            AbstractC2932.f9288.lazySet(this.f9158, bArr);
        }
    }

    public final String toString() {
        int i = this.f9167;
        if (i == 0) {
            return "<empty>";
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f9157, i);
        boolean[] zArr = AbstractC2898.f9177;
        C2903 c2903 = new C2903(bArrCopyOf.length, AbstractC2932.m6331(), bArrCopyOf);
        AbstractC2896 abstractC2896M6012 = AbstractC2896.m6012();
        try {
            abstractC2896M6012.mo5992(c2903.mo6078());
            return abstractC2896M6012.toString();
        } catch (Exception unused) {
            return InterfaceC2911.m6299(this.f9157[0]) + ", bytes length " + this.f9167;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public final void mo5915(byte[] bArr) {
        int iM6308;
        if (bArr == null) {
            mo5994();
            return;
        }
        int i = this.f9167;
        int length = bArr.length;
        int length2 = (bArr.length * 2) + i + 6;
        byte[] bArrM5996 = this.f9157;
        if (length2 > bArrM5996.length) {
            bArrM5996 = m5996(length2);
        }
        if (length <= 15) {
            iM6308 = i + 1;
            bArrM5996[i] = (byte) (length - 108);
        } else {
            bArrM5996[i] = -92;
            iM6308 = InterfaceC2912.m6308(i + 1, bArrM5996, length);
        }
        int length3 = bArr.length;
        int i2 = 0;
        while (i2 < length3) {
            byte b = bArr[i2];
            if (b < -16 || b > 47) {
                bArrM5996[iM6308] = (byte) ((b >> 8) + 56);
                iM6308++;
            }
            bArrM5996[iM6308] = b;
            i2++;
            iM6308++;
        }
        this.f9167 = iM6308;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public final void mo5916(LocalDate localDate) {
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 5;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        if (localDate == null) {
            bArrM5996[i] = -81;
            i2 = i + 1;
        } else {
            bArrM5996[i] = -87;
            AbstractC2848.m5717(i + 1, bArrM5996, localDate.getDayOfMonth() | (localDate.getYear() << 16) | (localDate.getMonthValue() << 8));
        }
        this.f9167 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏 */
    public final void mo5917(Long l) {
        int i = this.f9167 + 9;
        byte[] bArrM5996 = this.f9157;
        if (i > bArrM5996.length) {
            bArrM5996 = m5996(i);
        }
        this.f9167 = InterfaceC2912.m6309(l.longValue(), bArrM5996, this.f9167);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public final void mo5918(long j) {
        int i = this.f9167 + 9;
        byte[] bArrM5996 = this.f9157;
        if (i > bArrM5996.length) {
            bArrM5996 = m5996(i);
        }
        this.f9167 = InterfaceC2912.m6309(j, bArrM5996, this.f9167);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪 */
    public final void mo5919(byte b) {
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 2;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        AbstractC2848.m5716(bArrM5996, i, (short) ((b << 8) | 189));
        this.f9167 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲 */
    public final void mo5920(long[] jArr) {
        int iM6308;
        if (jArr == null) {
            mo5994();
            return;
        }
        int length = jArr.length;
        int i = this.f9167;
        int iM11541 = AbstractC6136.m11541(length, 9, i, 5);
        byte[] bArrM5996 = this.f9157;
        if (iM11541 > bArrM5996.length) {
            bArrM5996 = m5996(iM11541);
        }
        if (length <= 15) {
            iM6308 = i + 1;
            bArrM5996[i] = (byte) (length - 108);
        } else {
            bArrM5996[i] = -92;
            iM6308 = InterfaceC2912.m6308(i + 1, bArrM5996, length);
        }
        for (long j : jArr) {
            iM6308 = InterfaceC2912.m6309(j, bArrM5996, iM6308);
        }
        this.f9167 = iM6308;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏 */
    public final void mo5921(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世 */
    public final void mo5922() {
        mo6000((byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪 */
    public final void mo5923(OffsetTime offsetTime) {
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 21;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        if (offsetTime == null) {
            bArrM5996[i] = -81;
        } else {
            AbstractC2848.m5717(i, bArrM5996, -1442336255);
            AbstractC2848.m5717(i + 4, bArrM5996, (offsetTime.getHour() << 16) | 16777216 | (offsetTime.getMinute() << 8) | offsetTime.getSecond());
            int iM6308 = InterfaceC2912.m6308(i + 8, bArrM5996, offsetTime.getNano());
            String id = offsetTime.getOffset().getId();
            int length = id.length();
            bArrM5996[iM6308] = (byte) (length + 73);
            id.getBytes(0, length, bArrM5996, iM6308 + 1);
            i = iM6308 + length;
        }
        this.f9167 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public final void mo5924(OffsetDateTime offsetDateTime) {
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 21;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        if (offsetDateTime == null) {
            bArrM5996[i] = -81;
        } else {
            AbstractC2848.m5717(i, bArrM5996, (offsetDateTime.getYear() << 8) | (-1442840576) | offsetDateTime.getMonthValue());
            AbstractC2848.m5717(i + 4, bArrM5996, (offsetDateTime.getDayOfMonth() << 24) | (offsetDateTime.getHour() << 16) | (offsetDateTime.getMinute() << 8) | offsetDateTime.getSecond());
            int iM6308 = InterfaceC2912.m6308(i + 8, bArrM5996, offsetDateTime.getNano());
            String id = offsetDateTime.getOffset().getId();
            int length = id.length();
            bArrM5996[iM6308] = (byte) (length + 73);
            id.getBytes(0, length, bArrM5996, iM6308 + 1);
            i = iM6308 + length;
        }
        this.f9167 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public final void mo5925(short s) {
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 3;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        bArrM5996[i] = -68;
        AbstractC2848.m5715(bArrM5996, i + 1, s);
        this.f9167 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void mo5984(Instant instant) {
        int iM6308;
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 15;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        if (instant == null) {
            bArrM5996[i] = -81;
            iM6308 = i + 1;
        } else {
            bArrM5996[i] = -82;
            iM6308 = InterfaceC2912.m6308(InterfaceC2912.m6309(instant.getEpochSecond(), bArrM5996, i + 1), bArrM5996, instant.getNano());
        }
        this.f9167 = iM6308;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏 */
    public final void mo5926(Integer num) {
        int i = this.f9167;
        int i2 = i + 5;
        byte[] bArrM5996 = this.f9157;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        this.f9167 = InterfaceC2912.m6308(i, bArrM5996, num.intValue());
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世 */
    public final void mo5927(int[] iArr) {
        int iM6308;
        if (iArr == null) {
            mo5994();
            return;
        }
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int length = iArr.length;
        int length2 = (iArr.length * 5) + i + 6;
        if (length2 > bArrM5996.length) {
            bArrM5996 = m5996(length2);
        }
        if (length <= 15) {
            iM6308 = i + 1;
            bArrM5996[i] = (byte) (length - 108);
        } else {
            bArrM5996[i] = -92;
            iM6308 = InterfaceC2912.m6308(i + 1, bArrM5996, length);
        }
        for (int i2 : iArr) {
            iM6308 = InterfaceC2912.m6308(iM6308, bArrM5996, i2);
        }
        this.f9167 = iM6308;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void mo5985(short[] sArr) {
        if (sArr == null) {
            mo5922();
            return;
        }
        mo5995(sArr.length);
        for (short s : sArr) {
            mo5928(s);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世 */
    public final void mo5928(int i) {
        int i2 = this.f9167;
        int i3 = i2 + 5;
        byte[] bArrM5996 = this.f9157;
        if (i3 > bArrM5996.length) {
            bArrM5996 = m5996(i3);
        }
        this.f9167 = InterfaceC2912.m6308(i2, bArrM5996, i);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final void mo5986(String str) {
        mo5972(str);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void mo5987(long j) {
        int i = this.f9167;
        int i2 = i + 9;
        byte[] bArrM5996 = this.f9157;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        if (j % 1000 == 0) {
            long j2 = j / 1000;
            if (j2 >= -2147483648L && j2 <= 2147483647L) {
                bArrM5996[i] = -84;
                AbstractC2848.m5717(i + 1, bArrM5996, (int) j2);
                this.f9167 = i + 5;
                return;
            }
            if (j2 % 60 == 0) {
                long j3 = j2 / 60;
                if (j3 >= -2147483648L && j3 <= 2147483647L) {
                    bArrM5996[i] = -83;
                    AbstractC2848.m5717(i + 1, bArrM5996, (int) j3);
                    this.f9167 = i + 5;
                    return;
                }
            }
        }
        bArrM5996[i] = -85;
        AbstractC2848.m5704(j, bArrM5996, i + 1);
        this.f9167 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    public final void mo5929(byte[] bArr) {
        mo5963(bArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final void mo5988(long j, byte[] bArr) {
        boolean z;
        int iM14212;
        int iM6308;
        int iM63082;
        int i = this.f9167;
        int length = i + 6 + bArr.length;
        byte[] bArrM5996 = this.f9157;
        if (length > bArrM5996.length) {
            bArrM5996 = m5996(length);
        }
        if ((this.f9176.f9151 & JSONWriter$Feature.WriteNameAsSymbol.mask) == 0) {
            System.arraycopy(bArr, 0, bArrM5996, i, bArr.length);
            this.f9167 = i + bArr.length;
            return;
        }
        C8604 c8604 = this.f9156;
        if (c8604 != null) {
            iM14212 = c8604.m14212(this.f9155, j);
            int i2 = this.f9155;
            z = true;
            if (iM14212 == i2) {
                this.f9155 = i2 + 1;
                z = false;
            }
        } else {
            C8604 c86042 = new C8604();
            this.f9156 = c86042;
            int i3 = this.f9155;
            this.f9155 = i3 + 1;
            c86042.m14213(i3, j);
            z = false;
            iM14212 = i3;
        }
        if (z) {
            int i4 = i + 1;
            bArrM5996[i] = 127;
            int i5 = -(-iM14212);
            if (i5 < -16 || i5 > 47) {
                iM6308 = InterfaceC2912.m6308(i4, bArrM5996, i5);
            } else {
                iM6308 = i + 2;
                bArrM5996[i4] = (byte) i5;
            }
            this.f9167 = iM6308;
            return;
        }
        int i6 = i + 1;
        bArrM5996[i] = 127;
        System.arraycopy(bArr, 0, bArrM5996, i6, bArr.length);
        int length2 = i6 + bArr.length;
        if (iM14212 < -16 || iM14212 > 47) {
            iM63082 = InterfaceC2912.m6308(length2, bArrM5996, iM14212);
        } else {
            iM63082 = length2 + 1;
            bArrM5996[length2] = (byte) iM14212;
        }
        this.f9167 = iM63082;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public final void mo5930(LocalDateTime localDateTime) {
        int iM6308;
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 13;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        if (localDateTime == null) {
            bArrM5996[i] = -81;
            iM6308 = i + 1;
        } else {
            AbstractC2848.m5717(i, bArrM5996, (localDateTime.getYear() << 8) | (-1476395008) | localDateTime.getMonthValue());
            AbstractC2848.m5717(i + 4, bArrM5996, (localDateTime.getDayOfMonth() << 24) | (localDateTime.getHour() << 16) | (localDateTime.getMinute() << 8) | localDateTime.getSecond());
            iM6308 = InterfaceC2912.m6308(i + 8, bArrM5996, localDateTime.getNano());
        }
        this.f9167 = iM6308;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世 */
    public final void mo5931(LocalTime localTime) {
        int iM6308;
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 9;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        if (localTime == null) {
            bArrM5996[i] = -81;
            iM6308 = i + 1;
        } else {
            AbstractC2848.m5717(i, bArrM5996, (localTime.getHour() << 16) | (-1493172224) | (localTime.getMinute() << 8) | localTime.getSecond());
            iM6308 = InterfaceC2912.m6308(i + 4, bArrM5996, localTime.getNano());
        }
        this.f9167 = iM6308;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final void mo5932(int i, int i2, int i3, int i4, int i5, int i6) {
        mo5936(i, i2, i3, i4, i5, i6);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo5933(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo5934() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final void mo5935(char c) {
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 6;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        bArrM5996[i] = -112;
        this.f9167 = InterfaceC2912.m6308(i + 1, bArrM5996, c);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final void mo5936(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i8 = i7 + 9;
        if (i8 > bArrM5996.length) {
            bArrM5996 = m5996(i8);
        }
        AbstractC2848.m5717(i7, bArrM5996, ((i & Opcodes.MAX_VALUE) << 8) | (-1476395008) | i2);
        AbstractC2848.m5717(i7 + 4, bArrM5996, (i3 << 24) | (i4 << 16) | (i5 << 8) | i6);
        bArrM5996[i7 + 8] = 0;
        this.f9167 = i8;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final void mo5937() {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏 */
    public final void mo5938(float f) {
        int i = this.f9167;
        int i2 = i + 5;
        byte[] bArrM5996 = this.f9157;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        this.f9167 = InterfaceC2912.m6306(bArrM5996, i, f);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏 */
    public final void mo5939(double[] dArr) {
        int iM6305;
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int length = (dArr == null ? 1 : (dArr.length * 9) + 5) + i;
        if (length > bArrM5996.length) {
            bArrM5996 = m5996(length);
        }
        if (dArr == null) {
            bArrM5996[i] = -81;
            iM6305 = i + 1;
        } else {
            iM6305 = InterfaceC2912.m6305(i, bArrM5996, dArr.length);
            for (double d : dArr) {
                iM6305 = InterfaceC2912.m6307(bArrM5996, iM6305, d);
            }
        }
        this.f9167 = iM6305;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final void mo5989(Enum r7) {
        if (r7 == null) {
            mo5922();
            return;
        }
        long j = this.f9176.f9151;
        if ((24576 & j) != 0) {
            mo5972((j & JSONWriter$Feature.WriteEnumUsingToString.mask) != 0 ? r7.toString() : r7.name());
            return;
        }
        int iOrdinal = r7.ordinal();
        byte[] bArrM5996 = this.f9157;
        int i = this.f9167;
        int i2 = i + 5;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        this.f9167 = InterfaceC2912.m6308(i, bArrM5996, iOrdinal);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public final void mo5940(byte[] bArr) {
        mo5991(bArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final void mo5941(float[] fArr) {
        int iM6305;
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int length = (fArr == null ? 1 : (fArr.length * 5) + 5) + i;
        if (length > bArrM5996.length) {
            bArrM5996 = m5996(length);
        }
        if (fArr == null) {
            bArrM5996[i] = -81;
            iM6305 = i + 1;
        } else {
            iM6305 = InterfaceC2912.m6305(i, bArrM5996, fArr.length);
            for (float f : fArr) {
                iM6305 = InterfaceC2912.m6306(bArrM5996, iM6305, f);
            }
        }
        this.f9167 = iM6305;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final void mo5942(BigInteger bigInteger, long j) {
        if (bigInteger == null) {
            mo5922();
            return;
        }
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        if (AbstractC2866.m5893(bigInteger)) {
            int i2 = i + 10;
            if (i2 > bArrM5996.length) {
                bArrM5996 = m5996(i2);
            }
            bArrM5996[i] = -70;
            this.f9167 = InterfaceC2912.m6309(bigInteger.longValue(), bArrM5996, i + 1);
            return;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = i + 5 + byteArray.length;
        if (length > bArrM5996.length) {
            bArrM5996 = m5996(length);
        }
        bArrM5996[i] = -69;
        int iM6308 = InterfaceC2912.m6308(i + 1, bArrM5996, byteArray.length);
        System.arraycopy(byteArray, 0, bArrM5996, iM6308, byteArray.length);
        this.f9167 = iM6308 + byteArray.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo5943(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final void mo5990(boolean[] zArr) {
        int length;
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int length2 = (zArr == null ? 1 : zArr.length + 5) + i;
        if (length2 > bArrM5996.length) {
            bArrM5996 = m5996(length2);
        }
        if (zArr == null) {
            bArrM5996[i] = -81;
            length = i + 1;
        } else {
            int iM6305 = InterfaceC2912.m6305(i, bArrM5996, zArr.length);
            for (int i2 = 0; i2 < zArr.length; i2++) {
                bArrM5996[iM6305 + i2] = zArr[i2] ? (byte) -79 : (byte) -80;
            }
            length = iM6305 + zArr.length;
        }
        this.f9167 = length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final void mo5991(byte[] bArr) {
        if (bArr == null) {
            mo5922();
            return;
        }
        int i = this.f9167;
        int length = bArr.length;
        int i2 = i + 6 + length;
        byte[] bArrM5996 = this.f9157;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        bArrM5996[i] = -111;
        int iM6308 = InterfaceC2912.m6308(i + 1, bArrM5996, length);
        System.arraycopy(bArr, 0, bArrM5996, iM6308, length);
        this.f9167 = iM6308 + length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo5944(boolean z) {
        mo6000(z ? (byte) -79 : (byte) -80);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo5945(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat) {
        int iM6309;
        if (bigDecimal == null) {
            mo5922();
            return;
        }
        int iPrecision = bigDecimal.precision();
        int iScale = bigDecimal.scale();
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 15;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        if (iPrecision < 19) {
            long j2 = AbstractC2853.f8932;
            if (j2 != -1) {
                long j3 = AbstractC2853.f8919.getLong(bigDecimal, j2);
                if (iScale == 0) {
                    bArrM5996[i] = -72;
                    this.f9167 = InterfaceC2912.m6309(j3, bArrM5996, i + 1);
                    return;
                } else {
                    bArrM5996[i] = -71;
                    int iM6308 = InterfaceC2912.m6308(i + 1, bArrM5996, iScale);
                    this.f9167 = (j3 < -2147483648L || j3 > 2147483647L) ? InterfaceC2912.m6309(j3, bArrM5996, iM6308) : InterfaceC2912.m6308(iM6308, bArrM5996, (int) j3);
                    return;
                }
            }
        }
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        if (iScale == 0 && AbstractC2866.m5893(bigIntegerUnscaledValue)) {
            bArrM5996[i] = -72;
            this.f9167 = InterfaceC2912.m6309(bigIntegerUnscaledValue.longValue(), bArrM5996, i + 1);
            return;
        }
        bArrM5996[i] = -71;
        int iM63082 = InterfaceC2912.m6308(i + 1, bArrM5996, iScale);
        if (AbstractC2866.m5889(bigIntegerUnscaledValue)) {
            iM6309 = InterfaceC2912.m6308(iM63082, bArrM5996, bigIntegerUnscaledValue.intValue());
        } else {
            if (!AbstractC2866.m5893(bigIntegerUnscaledValue)) {
                this.f9167 = iM63082;
                mo5942(bigIntegerUnscaledValue, 0L);
                return;
            }
            iM6309 = InterfaceC2912.m6309(bigIntegerUnscaledValue.longValue(), bArrM5996, iM63082);
        }
        this.f9167 = iM6309;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    public final void mo5946(double d) {
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 9;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        this.f9167 = InterfaceC2912.m6307(bArrM5996, i, d);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final void mo5947(int i, int i2, int i3) {
        mo5948(i, i2, i3);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo5948(int i, int i2, int i3) {
        int i4 = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i5 = i4 + 5;
        if (i5 > bArrM5996.length) {
            bArrM5996 = m5996(i5);
        }
        bArrM5996[i4] = -87;
        AbstractC2848.m5717(i4 + 1, bArrM5996, (i << 16) | (i2 << 8) | i3);
        this.f9167 = i5;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo5949() {
        this.f9171--;
        mo6000((byte) -91);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void mo5992(Object obj) {
        if (obj == null) {
            mo5922();
            return;
        }
        C2894 c2894 = this.f9176;
        boolean z = (c2894.f9151 & JSONWriter$Feature.FieldBased.mask) != 0;
        Class<?> cls = obj.getClass();
        InterfaceC8531 interfaceC8531M14087 = c2894.f9152.m14087(cls, cls, z);
        if (m6033()) {
            interfaceC8531M14087.mo13999(this, obj, null, 0L);
        } else {
            interfaceC8531M14087.mo5633(this, obj, null, null, 0L);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final void mo5951(Map map) {
        if (map == null) {
            mo5922();
            return;
        }
        mo5952();
        for (Map.Entry entry : map.entrySet()) {
            mo5992(entry.getKey());
            mo5992(entry.getValue());
        }
        mo5949();
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void mo5993(long j) {
        mo6000((j & AbstractC2896.f9161) != 0 ? (byte) -108 : (byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void mo5994() {
        mo6000((this.f9176.f9151 & AbstractC2896.f9161) != 0 ? (byte) -108 : (byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo5952() {
        int i = this.f9171 + 1;
        this.f9171 = i;
        if (i <= this.f9176.f9149) {
            mo6000((byte) -90);
        } else {
            m6038();
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final void mo5953(List list) {
        mo5995(list.size());
        for (int i = 0; i < list.size(); i++) {
            mo5992(list.get(i));
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void mo5995(int i) {
        int i2 = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i3 = i2 + 6;
        if (i3 > bArrM5996.length) {
            bArrM5996 = m5996(i3);
        }
        this.f9167 = InterfaceC2912.m6305(i2, bArrM5996, i);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final void mo5954() {
        throw new JSONException("unsupported operation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
    public final byte[] m5996(int i) {
        byte[] bArr = this.f9157;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, m6044(i, bArr.length));
        this.f9157 = bArrCopyOf;
        return bArrCopyOf;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
    public final void mo5956(ZonedDateTime zonedDateTime) {
        if (zonedDateTime == null) {
            mo5922();
            return;
        }
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 13;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        AbstractC2848.m5717(i, bArrM5996, (zonedDateTime.getYear() << 8) | (-1442840576) | zonedDateTime.getMonthValue());
        AbstractC2848.m5717(i + 4, bArrM5996, (zonedDateTime.getDayOfMonth() << 24) | (zonedDateTime.getHour() << 16) | (zonedDateTime.getMinute() << 8) | zonedDateTime.getSecond());
        this.f9167 = InterfaceC2912.m6308(i + 8, bArrM5996, zonedDateTime.getNano());
        String id = zonedDateTime.getZone().getId();
        if (id.equals("Asia/Shanghai")) {
            mo5963(f9153);
        } else {
            mo5972(id);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    public final void mo5957(UUID uuid) {
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i2 = i + 18;
        if (i2 > bArrM5996.length) {
            bArrM5996 = m5996(i2);
        }
        if (uuid == null) {
            bArrM5996[i] = -81;
            i2 = i + 1;
        } else {
            AbstractC2848.m5716(bArrM5996, i, (short) 4241);
            AbstractC2848.m5704(uuid.getMostSignificantBits(), bArrM5996, i + 2);
            AbstractC2848.m5704(uuid.getLeastSignificantBits(), bArrM5996, i + 10);
        }
        this.f9167 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[EDGE_INSN: B:36:0x005e->B:24:0x005e BREAK  A[LOOP:0: B:14:0x0046->B:39:?]] */
    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5997(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f9167
            byte[] r2 = r0.f9157
            int r3 = r2.length
            if (r1 != r3) goto Lf
            int r2 = r1 + 1
            byte[] r2 = r0.m5996(r2)
        Lf:
            int r3 = r1 + 1
            r4 = -110(0xffffffffffffff92, float:NaN)
            r2[r1] = r4
            long r4 = com.alibaba.fastjson2.util.AbstractC2859.m5729(r18)
            飘花落叶言楪子苏兰哲世.飘花落叶言子楪世苏哲兰 r6 = r0.f9156
            r7 = -1
            if (r6 == 0) goto L5e
            long[] r8 = r6.f24080
            int r9 = r8.length
            r10 = 32
            long r10 = r4 >>> r10
            long r10 = r10 ^ r4
            int r10 = (int) r10
            r11 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r11
            int r9 = r10 % r9
            r11 = r8[r9]
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L36
            goto L5e
        L36:
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 != 0) goto L3f
            int[] r6 = r6.f24081
            r6 = r6[r9]
            goto L5f
        L3f:
            int r8 = r8.length
            int r11 = r8 + (-2)
            int r10 = r10 % r11
            int r10 = r10 + 1
            r11 = r9
        L46:
            int r11 = r11 - r10
            if (r11 >= 0) goto L4a
            int r11 = r11 + r8
        L4a:
            long[] r12 = r6.f24080
            r15 = r12[r11]
            int r12 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r12 != 0) goto L53
            goto L5e
        L53:
            int r12 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r12 != 0) goto L5c
            int[] r6 = r6.f24081
            r6 = r6[r11]
            goto L5f
        L5c:
            if (r11 != r9) goto L46
        L5e:
            r6 = r7
        L5f:
            if (r6 != r7) goto L80
            飘花落叶言楪子苏兰哲世.飘花落叶言子楪世苏哲兰 r1 = r0.f9156
            if (r1 != 0) goto L6c
            飘花落叶言楪子苏兰哲世.飘花落叶言子楪世苏哲兰 r1 = new 飘花落叶言楪子苏兰哲世.飘花落叶言子楪世苏哲兰
            r1.<init>()
            r0.f9156 = r1
        L6c:
            飘花落叶言楪子苏兰哲世.飘花落叶言子楪世苏哲兰 r1 = r0.f9156
            int r2 = r0.f9155
            int r6 = r2 + 1
            r0.f9155 = r6
            r1.m14213(r2, r4)
            r0.f9167 = r3
            r17.mo5972(r18)
            r0.mo5928(r2)
            return
        L80:
            int r4 = r2.length
            if (r3 != r4) goto L89
            int r1 = r1 + 2
            byte[] r2 = r0.m5996(r1)
        L89:
            int r1 = com.alibaba.fastjson2.InterfaceC2912.m6308(r3, r2, r6)
            r0.f9167 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2895.mo5997(java.lang.String):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
    public final void mo5998(long j, byte[] bArr) {
        int iM14212;
        boolean z;
        int iM6308;
        if (this.f9154 == j) {
            z = true;
            iM14212 = 0;
        } else {
            C8604 c8604 = this.f9156;
            iM14212 = this.f9155;
            if (c8604 != null) {
                iM14212 = c8604.m14212(iM14212, j);
                int i = this.f9155;
                if (iM14212 != i) {
                    z = true;
                } else {
                    this.f9155 = i + 1;
                }
            } else {
                this.f9155 = iM14212 + 1;
                if (iM14212 == 0) {
                    this.f9154 = j;
                }
                if (iM14212 != 0 || (this.f9176.f9151 & JSONWriter$Feature.WriteNameAsSymbol.mask) != 0) {
                    C8604 c86042 = new C8604();
                    c86042.f24076 = 18;
                    long[] jArr = new long[37];
                    c86042.f24080 = jArr;
                    int[] iArr = new int[37];
                    c86042.f24081 = iArr;
                    c86042.f24079 = true;
                    int i2 = (((int) ((j >>> 32) ^ j)) & Integer.MAX_VALUE) % 37;
                    jArr[i2] = j;
                    iArr[i2] = iM14212;
                    c86042.f24077 = 36;
                    c86042.f24078 = 1;
                    this.f9156 = c86042;
                }
            }
            z = false;
        }
        if (z) {
            int i3 = -iM14212;
            int i4 = this.f9167;
            byte[] bArrM5996 = this.f9157;
            int i5 = i4 + 7;
            if (i5 > bArrM5996.length) {
                bArrM5996 = m5996(i5);
            }
            bArrM5996[i4] = -110;
            this.f9167 = InterfaceC2912.m6308(i4 + 1, bArrM5996, -i3);
            return;
        }
        byte[] bArrM59962 = this.f9157;
        int i6 = this.f9167;
        int length = i6 + 2 + bArr.length;
        if (length > bArrM59962.length) {
            bArrM59962 = m5996(length);
        }
        bArrM59962[i6] = -110;
        System.arraycopy(bArr, 0, bArrM59962, i6 + 1, bArr.length);
        int length2 = bArr.length + 1 + i6;
        if (iM14212 < -16 || iM14212 > 47) {
            iM6308 = InterfaceC2912.m6308(length2, bArrM59962, iM14212);
        } else {
            iM6308 = length2 + 1;
            bArrM59962[length2] = (byte) iM14212;
        }
        this.f9167 = iM6308;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
    public final void m5999(int i, char[] cArr) {
        int i2;
        boolean zM5648;
        int iM6308;
        char c;
        char c2;
        int i3 = this.f9167;
        byte[] bArrM5996 = this.f9157;
        int i4 = 0;
        if (i < 47) {
            int i5 = i3 + 1;
            int i6 = i5 + i;
            if (i6 > bArrM5996.length) {
                bArrM5996 = m5996(i6);
            }
            bArrM5996[i3] = (byte) (i + 73);
            int i7 = 0;
            while (true) {
                if (i7 >= i) {
                    zM5648 = true;
                    break;
                }
                char c3 = cArr[i7];
                if (c3 > 255) {
                    zM5648 = false;
                    break;
                } else {
                    bArrM5996[i5] = (byte) c3;
                    i7++;
                    i5++;
                }
            }
            if (zM5648) {
                this.f9167 = i5;
                return;
            }
            i2 = this.f9167;
        } else {
            i2 = i3;
            zM5648 = AbstractC2848.m5648(i, cArr);
        }
        int i8 = (zM5648 ? i : i * 3) + i2 + 6;
        if (i8 > bArrM5996.length) {
            bArrM5996 = m5996(i8);
        }
        if (zM5648) {
            if (i <= 47) {
                iM6308 = i2 + 1;
                bArrM5996[i2] = (byte) (i + 73);
            } else {
                bArrM5996[i2] = 121;
                if (i <= 2047) {
                    AbstractC2848.m5715(bArrM5996, i2 + 1, (short) (i + 14336));
                    iM6308 = i2 + 3;
                } else {
                    iM6308 = InterfaceC2912.m6308(i2 + 1, bArrM5996, i);
                }
            }
            while (i4 < i) {
                bArrM5996[iM6308] = (byte) cArr[i4];
                i4++;
                iM6308++;
            }
        } else {
            int iM5983 = m5983(i * 3);
            int i9 = i2 + iM5983 + 1;
            short s = AbstractC2848.f8881;
            int iMin = Math.min(i, bArrM5996.length) + i9;
            int i10 = i9;
            while (i10 < iMin && (c2 = cArr[i4]) < 128) {
                i4++;
                bArrM5996[i10] = (byte) c2;
                i10++;
            }
            while (i4 < i) {
                int i11 = i4 + 1;
                char c4 = cArr[i4];
                if (c4 < 128) {
                    bArrM5996[i10] = (byte) c4;
                    i10++;
                } else if (c4 < 2048) {
                    bArrM5996[i10] = (byte) ((c4 >> 6) | 192);
                    bArrM5996[i10 + 1] = (byte) ((c4 & '?') | 128);
                    i10 += 2;
                } else if (c4 < 55296 || c4 > 57343) {
                    bArrM5996[i10] = (byte) ((c4 >> '\f') | Opcodes.SHL_INT_LIT8);
                    bArrM5996[i10 + 1] = (byte) (((c4 >> 6) & 63) | 128);
                    bArrM5996[i10 + 2] = (byte) ((c4 & '?') | 128);
                    i10 += 3;
                } else {
                    if (c4 > 56319 || i - i11 < 1 || (c = cArr[i11]) < 56320 || c > 57343) {
                        C0276.m849(AbstractC6136.m11556(i11, "malformed input off : "));
                        return;
                    }
                    int i12 = ((c4 << '\n') + c) - 56613888;
                    bArrM5996[i10] = (byte) ((i12 >> 18) | 240);
                    bArrM5996[i10 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                    bArrM5996[i10 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                    bArrM5996[i10 + 3] = (byte) ((i12 & 63) | 128);
                    i4 += 2;
                    i10 += 4;
                }
                i4 = i11;
            }
            int i13 = ((i10 - i2) - iM5983) - 1;
            int iM59832 = m5983(i13);
            if (iM5983 != iM59832) {
                System.arraycopy(bArrM5996, i9, bArrM5996, iM59832 + i2 + 1, i13);
            }
            bArrM5996[i2] = 122;
            iM6308 = InterfaceC2912.m6308(i2 + 1, bArrM5996, i13) + i13;
        }
        this.f9167 = iM6308;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏 */
    public final void mo5963(byte[] bArr) {
        int i = this.f9167;
        int length = bArr.length + i;
        byte[] bArrM5996 = this.f9157;
        if (length > bArrM5996.length) {
            bArrM5996 = m5996(length);
        }
        System.arraycopy(bArr, 0, bArrM5996, i, bArr.length);
        this.f9167 = i + bArr.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public final void mo5964(String str) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public final void mo5967(char c) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void mo6000(byte b) {
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        if (i == bArrM5996.length) {
            bArrM5996 = m5996(i + 1);
        }
        bArrM5996[i] = b;
        this.f9167 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
    public final void mo6001(short[] sArr) {
        if (sArr == null) {
            mo5994();
            return;
        }
        mo5995(sArr.length);
        for (short s : sArr) {
            mo5973(s);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public final void mo5968(String[] strArr) {
        if (strArr == null) {
            mo5994();
            return;
        }
        mo5995(strArr.length);
        for (String str : strArr) {
            if (str == null) {
                mo6003();
            } else {
                mo5972(str);
            }
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏, reason: contains not printable characters */
    public final void mo6002(String str) {
        if (str == null) {
            mo5922();
        } else {
            mo5972(str);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    public final void mo5969(int i, int i2, int i3) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public final void mo5970(int i, char[] cArr) {
        int iM6308;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (cArr[i3] > 255) {
                mo5972(new String(cArr, 0, i));
                return;
            }
        }
        int i4 = this.f9167;
        byte[] bArr = this.f9157;
        if (i <= 47) {
            iM6308 = i4 + 1;
            bArr[i4] = (byte) (i + 73);
        } else {
            bArr[i4] = 121;
            iM6308 = InterfaceC2912.m6308(i4 + 1, bArr, i);
        }
        while (i2 < i) {
            bArr[iM6308] = (byte) cArr[i2];
            i2++;
            iM6308++;
        }
        this.f9167 = iM6308;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
    public final void mo6003() {
        mo6000((byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public final void mo5971(List list) {
        if (list == null) {
            mo5994();
            return;
        }
        int size = list.size();
        mo5995(size);
        if (AbstractC2853.f8925 != null && AbstractC2853.f8924 != null) {
            int iM6304 = this.f9167;
            byte[] bArrM5996 = this.f9157;
            for (int i = 0; i < size; i++) {
                String str = (String) list.get(i);
                if (str == null) {
                    if (iM6304 == bArrM5996.length) {
                        bArrM5996 = m5996(iM6304 + 1);
                    }
                    bArrM5996[iM6304] = -81;
                    iM6304++;
                } else if (AbstractC2853.f8924.applyAsInt(str) == 0) {
                    byte[] bArr = (byte[]) AbstractC2853.f8925.apply(str);
                    if (bArr.length + iM6304 + 6 >= bArrM5996.length) {
                        bArrM5996 = m5996(bArr.length + iM6304 + 6);
                    }
                    iM6304 = InterfaceC2912.m6304(bArrM5996, iM6304, bArr);
                }
            }
            this.f9167 = iM6304;
            return;
        }
        for (int i2 = 0; i2 < size; i2++) {
            mo5972((String) list.get(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5972(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2895.mo5972(java.lang.String):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
    public final void mo6004(byte[] bArr) {
        mo5995(bArr.length);
        for (byte b : bArr) {
            mo5978(b);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世, reason: contains not printable characters */
    public final void mo6005(long[] jArr) {
        if (jArr == null) {
            mo5994();
            return;
        }
        mo5995(jArr.length);
        for (long j : jArr) {
            mo5977(j);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public final void mo5973(short s) {
        mo5972(Integer.toString(s));
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public final void mo5974(boolean z) {
        mo5972(Boolean.toString(z));
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰 */
    public final void mo5975(String str) {
        int i = this.f9167;
        byte[] bArrM5996 = this.f9157;
        if (i == bArrM5996.length) {
            bArrM5996 = m5996(i + 1);
        }
        bArrM5996[i] = -109;
        this.f9167 = i + 1;
        mo5972(str == this.f9163 ? "#-1" : str);
        this.f9163 = str;
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public final void mo5976(int i, char[] cArr) {
        m5999(i, cArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public final void mo5977(long j) {
        mo5972(Long.toString(j));
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public final void mo5978(byte b) {
        mo5972(Integer.toString(b));
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public final void mo5979(int i) {
        mo5972(Integer.toString(i));
    }

    @Override // com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5950() {
    }
}
