package com.alibaba.fastjson2;

import androidx.collection.C0276;
import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2867;
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
import p009.AbstractC6183;
import p291.InterfaceC8523;
import p298.C8596;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2896 extends AbstractC2897 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final byte[] f9155 = InterfaceC2912.m6355("Asia/Shanghai");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public long f9156;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f9157;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C8596 f9158;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public byte[] f9159;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C2911 f9160;

    static {
        InterfaceC2912.m6355("+08:00");
    }

    public C2896(C2895 c2895) {
        super(c2895, true, StandardCharsets.UTF_8);
        C2911[] c2911Arr = AbstractC2933.f9299;
        C2911 c2911 = c2911Arr[System.identityHashCode(Thread.currentThread()) & (c2911Arr.length - 1)];
        this.f9160 = c2911;
        byte[] bArr = (byte[]) AbstractC2933.f9290.getAndSet(c2911, null);
        this.f9159 = bArr == null ? new byte[8192] : bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏, reason: contains not printable characters */
    public static int m6028(int i) {
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
        byte[] bArr = this.f9159;
        if (bArr.length < 8388608) {
            AbstractC2933.f9290.lazySet(this.f9160, bArr);
        }
    }

    public final String toString() {
        int i = this.f9169;
        if (i == 0) {
            return "<empty>";
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f9159, i);
        boolean[] zArr = AbstractC2899.f9179;
        C2904 c2904 = new C2904(bArrCopyOf.length, AbstractC2933.m6389(), bArrCopyOf);
        AbstractC2897 abstractC2897M6057 = AbstractC2897.m6057();
        try {
            abstractC2897M6057.mo6037(c2904.mo6124());
            return abstractC2897M6057.toString();
        } catch (Exception unused) {
            return InterfaceC2912.m6357(this.f9159[0]) + ", bytes length " + this.f9169;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public final void mo5960(byte[] bArr) {
        int iM6366;
        if (bArr == null) {
            mo6039();
            return;
        }
        int i = this.f9169;
        int length = bArr.length;
        int length2 = (bArr.length * 2) + i + 6;
        byte[] bArrM6041 = this.f9159;
        if (length2 > bArrM6041.length) {
            bArrM6041 = m6041(length2);
        }
        if (length <= 15) {
            iM6366 = i + 1;
            bArrM6041[i] = (byte) (length - 108);
        } else {
            bArrM6041[i] = -92;
            iM6366 = InterfaceC2913.m6366(i + 1, bArrM6041, length);
        }
        int length3 = bArr.length;
        int i2 = 0;
        while (i2 < length3) {
            byte b = bArr[i2];
            if (b < -16 || b > 47) {
                bArrM6041[iM6366] = (byte) ((b >> 8) + 56);
                iM6366++;
            }
            bArrM6041[iM6366] = b;
            i2++;
            iM6366++;
        }
        this.f9169 = iM6366;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public final void mo5961(LocalDate localDate) {
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 5;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        if (localDate == null) {
            bArrM6041[i] = -81;
            i2 = i + 1;
        } else {
            bArrM6041[i] = -87;
            AbstractC2849.m5762(i + 1, bArrM6041, localDate.getDayOfMonth() | (localDate.getYear() << 16) | (localDate.getMonthValue() << 8));
        }
        this.f9169 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏 */
    public final void mo5962(Long l) {
        int i = this.f9169 + 9;
        byte[] bArrM6041 = this.f9159;
        if (i > bArrM6041.length) {
            bArrM6041 = m6041(i);
        }
        this.f9169 = InterfaceC2913.m6367(l.longValue(), bArrM6041, this.f9169);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public final void mo5963(long j) {
        int i = this.f9169 + 9;
        byte[] bArrM6041 = this.f9159;
        if (i > bArrM6041.length) {
            bArrM6041 = m6041(i);
        }
        this.f9169 = InterfaceC2913.m6367(j, bArrM6041, this.f9169);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪 */
    public final void mo5964(byte b) {
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 2;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        AbstractC2849.m5761(bArrM6041, i, (short) ((b << 8) | 189));
        this.f9169 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲 */
    public final void mo5965(long[] jArr) {
        int iM6366;
        if (jArr == null) {
            mo6039();
            return;
        }
        int length = jArr.length;
        int i = this.f9169;
        int iM11574 = AbstractC6183.m11574(length, 9, i, 5);
        byte[] bArrM6041 = this.f9159;
        if (iM11574 > bArrM6041.length) {
            bArrM6041 = m6041(iM11574);
        }
        if (length <= 15) {
            iM6366 = i + 1;
            bArrM6041[i] = (byte) (length - 108);
        } else {
            bArrM6041[i] = -92;
            iM6366 = InterfaceC2913.m6366(i + 1, bArrM6041, length);
        }
        for (long j : jArr) {
            iM6366 = InterfaceC2913.m6367(j, bArrM6041, iM6366);
        }
        this.f9169 = iM6366;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏 */
    public final void mo5966(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世 */
    public final void mo5967() {
        mo6045((byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪 */
    public final void mo5968(OffsetTime offsetTime) {
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 21;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        if (offsetTime == null) {
            bArrM6041[i] = -81;
        } else {
            AbstractC2849.m5762(i, bArrM6041, -1442336255);
            AbstractC2849.m5762(i + 4, bArrM6041, (offsetTime.getHour() << 16) | 16777216 | (offsetTime.getMinute() << 8) | offsetTime.getSecond());
            int iM6366 = InterfaceC2913.m6366(i + 8, bArrM6041, offsetTime.getNano());
            String id = offsetTime.getOffset().getId();
            int length = id.length();
            bArrM6041[iM6366] = (byte) (length + 73);
            id.getBytes(0, length, bArrM6041, iM6366 + 1);
            i = iM6366 + length;
        }
        this.f9169 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public final void mo5969(OffsetDateTime offsetDateTime) {
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 21;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        if (offsetDateTime == null) {
            bArrM6041[i] = -81;
        } else {
            AbstractC2849.m5762(i, bArrM6041, (offsetDateTime.getYear() << 8) | (-1442840576) | offsetDateTime.getMonthValue());
            AbstractC2849.m5762(i + 4, bArrM6041, (offsetDateTime.getDayOfMonth() << 24) | (offsetDateTime.getHour() << 16) | (offsetDateTime.getMinute() << 8) | offsetDateTime.getSecond());
            int iM6366 = InterfaceC2913.m6366(i + 8, bArrM6041, offsetDateTime.getNano());
            String id = offsetDateTime.getOffset().getId();
            int length = id.length();
            bArrM6041[iM6366] = (byte) (length + 73);
            id.getBytes(0, length, bArrM6041, iM6366 + 1);
            i = iM6366 + length;
        }
        this.f9169 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public final void mo5970(short s) {
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 3;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        bArrM6041[i] = -68;
        AbstractC2849.m5760(bArrM6041, i + 1, s);
        this.f9169 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void mo6029(Instant instant) {
        int iM6366;
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 15;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        if (instant == null) {
            bArrM6041[i] = -81;
            iM6366 = i + 1;
        } else {
            bArrM6041[i] = -82;
            iM6366 = InterfaceC2913.m6366(InterfaceC2913.m6367(instant.getEpochSecond(), bArrM6041, i + 1), bArrM6041, instant.getNano());
        }
        this.f9169 = iM6366;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏 */
    public final void mo5971(Integer num) {
        int i = this.f9169;
        int i2 = i + 5;
        byte[] bArrM6041 = this.f9159;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        this.f9169 = InterfaceC2913.m6366(i, bArrM6041, num.intValue());
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世 */
    public final void mo5972(int[] iArr) {
        int iM6366;
        if (iArr == null) {
            mo6039();
            return;
        }
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int length = iArr.length;
        int length2 = (iArr.length * 5) + i + 6;
        if (length2 > bArrM6041.length) {
            bArrM6041 = m6041(length2);
        }
        if (length <= 15) {
            iM6366 = i + 1;
            bArrM6041[i] = (byte) (length - 108);
        } else {
            bArrM6041[i] = -92;
            iM6366 = InterfaceC2913.m6366(i + 1, bArrM6041, length);
        }
        for (int i2 : iArr) {
            iM6366 = InterfaceC2913.m6366(iM6366, bArrM6041, i2);
        }
        this.f9169 = iM6366;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void mo6030(short[] sArr) {
        if (sArr == null) {
            mo5967();
            return;
        }
        mo6040(sArr.length);
        for (short s : sArr) {
            mo5973(s);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世 */
    public final void mo5973(int i) {
        int i2 = this.f9169;
        int i3 = i2 + 5;
        byte[] bArrM6041 = this.f9159;
        if (i3 > bArrM6041.length) {
            bArrM6041 = m6041(i3);
        }
        this.f9169 = InterfaceC2913.m6366(i2, bArrM6041, i);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final void mo6031(String str) {
        mo6017(str);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void mo6032(long j) {
        int i = this.f9169;
        int i2 = i + 9;
        byte[] bArrM6041 = this.f9159;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        if (j % 1000 == 0) {
            long j2 = j / 1000;
            if (j2 >= -2147483648L && j2 <= 2147483647L) {
                bArrM6041[i] = -84;
                AbstractC2849.m5762(i + 1, bArrM6041, (int) j2);
                this.f9169 = i + 5;
                return;
            }
            if (j2 % 60 == 0) {
                long j3 = j2 / 60;
                if (j3 >= -2147483648L && j3 <= 2147483647L) {
                    bArrM6041[i] = -83;
                    AbstractC2849.m5762(i + 1, bArrM6041, (int) j3);
                    this.f9169 = i + 5;
                    return;
                }
            }
        }
        bArrM6041[i] = -85;
        AbstractC2849.m5749(j, bArrM6041, i + 1);
        this.f9169 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    public final void mo5974(byte[] bArr) {
        mo6008(bArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final void mo6033(long j, byte[] bArr) {
        boolean z;
        int iM14231;
        int iM6366;
        int iM63662;
        int i = this.f9169;
        int length = i + 6 + bArr.length;
        byte[] bArrM6041 = this.f9159;
        if (length > bArrM6041.length) {
            bArrM6041 = m6041(length);
        }
        if ((this.f9178.f9153 & JSONWriter$Feature.WriteNameAsSymbol.mask) == 0) {
            System.arraycopy(bArr, 0, bArrM6041, i, bArr.length);
            this.f9169 = i + bArr.length;
            return;
        }
        C8596 c8596 = this.f9158;
        if (c8596 != null) {
            iM14231 = c8596.m14231(this.f9157, j);
            int i2 = this.f9157;
            z = true;
            if (iM14231 == i2) {
                this.f9157 = i2 + 1;
                z = false;
            }
        } else {
            C8596 c85962 = new C8596();
            this.f9158 = c85962;
            int i3 = this.f9157;
            this.f9157 = i3 + 1;
            c85962.m14232(i3, j);
            z = false;
            iM14231 = i3;
        }
        if (z) {
            int i4 = i + 1;
            bArrM6041[i] = 127;
            int i5 = -(-iM14231);
            if (i5 < -16 || i5 > 47) {
                iM6366 = InterfaceC2913.m6366(i4, bArrM6041, i5);
            } else {
                iM6366 = i + 2;
                bArrM6041[i4] = (byte) i5;
            }
            this.f9169 = iM6366;
            return;
        }
        int i6 = i + 1;
        bArrM6041[i] = 127;
        System.arraycopy(bArr, 0, bArrM6041, i6, bArr.length);
        int length2 = i6 + bArr.length;
        if (iM14231 < -16 || iM14231 > 47) {
            iM63662 = InterfaceC2913.m6366(length2, bArrM6041, iM14231);
        } else {
            iM63662 = length2 + 1;
            bArrM6041[length2] = (byte) iM14231;
        }
        this.f9169 = iM63662;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public final void mo5975(LocalDateTime localDateTime) {
        int iM6366;
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 13;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        if (localDateTime == null) {
            bArrM6041[i] = -81;
            iM6366 = i + 1;
        } else {
            AbstractC2849.m5762(i, bArrM6041, (localDateTime.getYear() << 8) | (-1476395008) | localDateTime.getMonthValue());
            AbstractC2849.m5762(i + 4, bArrM6041, (localDateTime.getDayOfMonth() << 24) | (localDateTime.getHour() << 16) | (localDateTime.getMinute() << 8) | localDateTime.getSecond());
            iM6366 = InterfaceC2913.m6366(i + 8, bArrM6041, localDateTime.getNano());
        }
        this.f9169 = iM6366;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世 */
    public final void mo5976(LocalTime localTime) {
        int iM6366;
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 9;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        if (localTime == null) {
            bArrM6041[i] = -81;
            iM6366 = i + 1;
        } else {
            AbstractC2849.m5762(i, bArrM6041, (localTime.getHour() << 16) | (-1493172224) | (localTime.getMinute() << 8) | localTime.getSecond());
            iM6366 = InterfaceC2913.m6366(i + 4, bArrM6041, localTime.getNano());
        }
        this.f9169 = iM6366;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final void mo5977(int i, int i2, int i3, int i4, int i5, int i6) {
        mo5981(i, i2, i3, i4, i5, i6);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo5978(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo5979() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final void mo5980(char c) {
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 6;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        bArrM6041[i] = -112;
        this.f9169 = InterfaceC2913.m6366(i + 1, bArrM6041, c);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final void mo5981(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i8 = i7 + 9;
        if (i8 > bArrM6041.length) {
            bArrM6041 = m6041(i8);
        }
        AbstractC2849.m5762(i7, bArrM6041, ((i & Opcodes.MAX_VALUE) << 8) | (-1476395008) | i2);
        AbstractC2849.m5762(i7 + 4, bArrM6041, (i3 << 24) | (i4 << 16) | (i5 << 8) | i6);
        bArrM6041[i7 + 8] = 0;
        this.f9169 = i8;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final void mo5982() {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏 */
    public final void mo5983(float f) {
        int i = this.f9169;
        int i2 = i + 5;
        byte[] bArrM6041 = this.f9159;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        this.f9169 = InterfaceC2913.m6364(bArrM6041, i, f);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏 */
    public final void mo5984(double[] dArr) {
        int iM6363;
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int length = (dArr == null ? 1 : (dArr.length * 9) + 5) + i;
        if (length > bArrM6041.length) {
            bArrM6041 = m6041(length);
        }
        if (dArr == null) {
            bArrM6041[i] = -81;
            iM6363 = i + 1;
        } else {
            iM6363 = InterfaceC2913.m6363(i, bArrM6041, dArr.length);
            for (double d : dArr) {
                iM6363 = InterfaceC2913.m6365(bArrM6041, iM6363, d);
            }
        }
        this.f9169 = iM6363;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final void mo6034(Enum r7) {
        if (r7 == null) {
            mo5967();
            return;
        }
        long j = this.f9178.f9153;
        if ((24576 & j) != 0) {
            mo6017((j & JSONWriter$Feature.WriteEnumUsingToString.mask) != 0 ? r7.toString() : r7.name());
            return;
        }
        int iOrdinal = r7.ordinal();
        byte[] bArrM6041 = this.f9159;
        int i = this.f9169;
        int i2 = i + 5;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        this.f9169 = InterfaceC2913.m6366(i, bArrM6041, iOrdinal);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public final void mo5985(byte[] bArr) {
        mo6036(bArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final void mo5986(float[] fArr) {
        int iM6363;
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int length = (fArr == null ? 1 : (fArr.length * 5) + 5) + i;
        if (length > bArrM6041.length) {
            bArrM6041 = m6041(length);
        }
        if (fArr == null) {
            bArrM6041[i] = -81;
            iM6363 = i + 1;
        } else {
            iM6363 = InterfaceC2913.m6363(i, bArrM6041, fArr.length);
            for (float f : fArr) {
                iM6363 = InterfaceC2913.m6364(bArrM6041, iM6363, f);
            }
        }
        this.f9169 = iM6363;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final void mo5987(BigInteger bigInteger, long j) {
        if (bigInteger == null) {
            mo5967();
            return;
        }
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        if (AbstractC2867.m5938(bigInteger)) {
            int i2 = i + 10;
            if (i2 > bArrM6041.length) {
                bArrM6041 = m6041(i2);
            }
            bArrM6041[i] = -70;
            this.f9169 = InterfaceC2913.m6367(bigInteger.longValue(), bArrM6041, i + 1);
            return;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = i + 5 + byteArray.length;
        if (length > bArrM6041.length) {
            bArrM6041 = m6041(length);
        }
        bArrM6041[i] = -69;
        int iM6366 = InterfaceC2913.m6366(i + 1, bArrM6041, byteArray.length);
        System.arraycopy(byteArray, 0, bArrM6041, iM6366, byteArray.length);
        this.f9169 = iM6366 + byteArray.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo5988(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final void mo6035(boolean[] zArr) {
        int length;
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int length2 = (zArr == null ? 1 : zArr.length + 5) + i;
        if (length2 > bArrM6041.length) {
            bArrM6041 = m6041(length2);
        }
        if (zArr == null) {
            bArrM6041[i] = -81;
            length = i + 1;
        } else {
            int iM6363 = InterfaceC2913.m6363(i, bArrM6041, zArr.length);
            for (int i2 = 0; i2 < zArr.length; i2++) {
                bArrM6041[iM6363 + i2] = zArr[i2] ? (byte) -79 : (byte) -80;
            }
            length = iM6363 + zArr.length;
        }
        this.f9169 = length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final void mo6036(byte[] bArr) {
        if (bArr == null) {
            mo5967();
            return;
        }
        int i = this.f9169;
        int length = bArr.length;
        int i2 = i + 6 + length;
        byte[] bArrM6041 = this.f9159;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        bArrM6041[i] = -111;
        int iM6366 = InterfaceC2913.m6366(i + 1, bArrM6041, length);
        System.arraycopy(bArr, 0, bArrM6041, iM6366, length);
        this.f9169 = iM6366 + length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo5989(boolean z) {
        mo6045(z ? (byte) -79 : (byte) -80);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo5990(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat) {
        int iM6367;
        if (bigDecimal == null) {
            mo5967();
            return;
        }
        int iPrecision = bigDecimal.precision();
        int iScale = bigDecimal.scale();
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 15;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        if (iPrecision < 19) {
            long j2 = AbstractC2854.f8934;
            if (j2 != -1) {
                long j3 = AbstractC2854.f8921.getLong(bigDecimal, j2);
                if (iScale == 0) {
                    bArrM6041[i] = -72;
                    this.f9169 = InterfaceC2913.m6367(j3, bArrM6041, i + 1);
                    return;
                } else {
                    bArrM6041[i] = -71;
                    int iM6366 = InterfaceC2913.m6366(i + 1, bArrM6041, iScale);
                    this.f9169 = (j3 < -2147483648L || j3 > 2147483647L) ? InterfaceC2913.m6367(j3, bArrM6041, iM6366) : InterfaceC2913.m6366(iM6366, bArrM6041, (int) j3);
                    return;
                }
            }
        }
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        if (iScale == 0 && AbstractC2867.m5938(bigIntegerUnscaledValue)) {
            bArrM6041[i] = -72;
            this.f9169 = InterfaceC2913.m6367(bigIntegerUnscaledValue.longValue(), bArrM6041, i + 1);
            return;
        }
        bArrM6041[i] = -71;
        int iM63662 = InterfaceC2913.m6366(i + 1, bArrM6041, iScale);
        if (AbstractC2867.m5934(bigIntegerUnscaledValue)) {
            iM6367 = InterfaceC2913.m6366(iM63662, bArrM6041, bigIntegerUnscaledValue.intValue());
        } else {
            if (!AbstractC2867.m5938(bigIntegerUnscaledValue)) {
                this.f9169 = iM63662;
                mo5987(bigIntegerUnscaledValue, 0L);
                return;
            }
            iM6367 = InterfaceC2913.m6367(bigIntegerUnscaledValue.longValue(), bArrM6041, iM63662);
        }
        this.f9169 = iM6367;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    public final void mo5991(double d) {
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 9;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        this.f9169 = InterfaceC2913.m6365(bArrM6041, i, d);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final void mo5992(int i, int i2, int i3) {
        mo5993(i, i2, i3);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo5993(int i, int i2, int i3) {
        int i4 = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i5 = i4 + 5;
        if (i5 > bArrM6041.length) {
            bArrM6041 = m6041(i5);
        }
        bArrM6041[i4] = -87;
        AbstractC2849.m5762(i4 + 1, bArrM6041, (i << 16) | (i2 << 8) | i3);
        this.f9169 = i5;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo5994() {
        this.f9173--;
        mo6045((byte) -91);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void mo6037(Object obj) {
        if (obj == null) {
            mo5967();
            return;
        }
        C2895 c2895 = this.f9178;
        boolean z = (c2895.f9153 & JSONWriter$Feature.FieldBased.mask) != 0;
        Class<?> cls = obj.getClass();
        InterfaceC8523 interfaceC8523M14106 = c2895.f9154.m14106(cls, cls, z);
        if (m6079()) {
            interfaceC8523M14106.mo14018(this, obj, null, 0L);
        } else {
            interfaceC8523M14106.mo5678(this, obj, null, null, 0L);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final void mo5996(Map map) {
        if (map == null) {
            mo5967();
            return;
        }
        mo5997();
        for (Map.Entry entry : map.entrySet()) {
            mo6037(entry.getKey());
            mo6037(entry.getValue());
        }
        mo5994();
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void mo6038(long j) {
        mo6045((j & AbstractC2897.f9163) != 0 ? (byte) -108 : (byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void mo6039() {
        mo6045((this.f9178.f9153 & AbstractC2897.f9163) != 0 ? (byte) -108 : (byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo5997() {
        int i = this.f9173 + 1;
        this.f9173 = i;
        if (i <= this.f9178.f9151) {
            mo6045((byte) -90);
        } else {
            m6084();
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final void mo5998(List list) {
        mo6040(list.size());
        for (int i = 0; i < list.size(); i++) {
            mo6037(list.get(i));
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void mo6040(int i) {
        int i2 = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i3 = i2 + 6;
        if (i3 > bArrM6041.length) {
            bArrM6041 = m6041(i3);
        }
        this.f9169 = InterfaceC2913.m6363(i2, bArrM6041, i);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final void mo5999() {
        throw new JSONException("unsupported operation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
    public final byte[] m6041(int i) {
        byte[] bArr = this.f9159;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, m6089(i, bArr.length));
        this.f9159 = bArrCopyOf;
        return bArrCopyOf;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
    public final void mo6001(ZonedDateTime zonedDateTime) {
        if (zonedDateTime == null) {
            mo5967();
            return;
        }
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 13;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        AbstractC2849.m5762(i, bArrM6041, (zonedDateTime.getYear() << 8) | (-1442840576) | zonedDateTime.getMonthValue());
        AbstractC2849.m5762(i + 4, bArrM6041, (zonedDateTime.getDayOfMonth() << 24) | (zonedDateTime.getHour() << 16) | (zonedDateTime.getMinute() << 8) | zonedDateTime.getSecond());
        this.f9169 = InterfaceC2913.m6366(i + 8, bArrM6041, zonedDateTime.getNano());
        String id = zonedDateTime.getZone().getId();
        if (id.equals("Asia/Shanghai")) {
            mo6008(f9155);
        } else {
            mo6017(id);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    public final void mo6002(UUID uuid) {
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i2 = i + 18;
        if (i2 > bArrM6041.length) {
            bArrM6041 = m6041(i2);
        }
        if (uuid == null) {
            bArrM6041[i] = -81;
            i2 = i + 1;
        } else {
            AbstractC2849.m5761(bArrM6041, i, (short) 4241);
            AbstractC2849.m5749(uuid.getMostSignificantBits(), bArrM6041, i + 2);
            AbstractC2849.m5749(uuid.getLeastSignificantBits(), bArrM6041, i + 10);
        }
        this.f9169 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[EDGE_INSN: B:36:0x005e->B:24:0x005e BREAK  A[LOOP:0: B:14:0x0046->B:39:?]] */
    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6042(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f9169
            byte[] r2 = r0.f9159
            int r3 = r2.length
            if (r1 != r3) goto Lf
            int r2 = r1 + 1
            byte[] r2 = r0.m6041(r2)
        Lf:
            int r3 = r1 + 1
            r4 = -110(0xffffffffffffff92, float:NaN)
            r2[r1] = r4
            long r4 = com.alibaba.fastjson2.util.AbstractC2860.m5774(r18)
            飘花落叶言楪子苏兰哲世.飘花落叶言子楪世苏哲兰 r6 = r0.f9158
            r7 = -1
            if (r6 == 0) goto L5e
            long[] r8 = r6.f24071
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
            int[] r6 = r6.f24072
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
            long[] r12 = r6.f24071
            r15 = r12[r11]
            int r12 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r12 != 0) goto L53
            goto L5e
        L53:
            int r12 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r12 != 0) goto L5c
            int[] r6 = r6.f24072
            r6 = r6[r11]
            goto L5f
        L5c:
            if (r11 != r9) goto L46
        L5e:
            r6 = r7
        L5f:
            if (r6 != r7) goto L80
            飘花落叶言楪子苏兰哲世.飘花落叶言子楪世苏哲兰 r1 = r0.f9158
            if (r1 != 0) goto L6c
            飘花落叶言楪子苏兰哲世.飘花落叶言子楪世苏哲兰 r1 = new 飘花落叶言楪子苏兰哲世.飘花落叶言子楪世苏哲兰
            r1.<init>()
            r0.f9158 = r1
        L6c:
            飘花落叶言楪子苏兰哲世.飘花落叶言子楪世苏哲兰 r1 = r0.f9158
            int r2 = r0.f9157
            int r6 = r2 + 1
            r0.f9157 = r6
            r1.m14232(r2, r4)
            r0.f9169 = r3
            r17.mo6017(r18)
            r0.mo5973(r2)
            return
        L80:
            int r4 = r2.length
            if (r3 != r4) goto L89
            int r1 = r1 + 2
            byte[] r2 = r0.m6041(r1)
        L89:
            int r1 = com.alibaba.fastjson2.InterfaceC2913.m6366(r3, r2, r6)
            r0.f9169 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2896.mo6042(java.lang.String):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
    public final void mo6043(long j, byte[] bArr) {
        int iM14231;
        boolean z;
        int iM6366;
        if (this.f9156 == j) {
            z = true;
            iM14231 = 0;
        } else {
            C8596 c8596 = this.f9158;
            iM14231 = this.f9157;
            if (c8596 != null) {
                iM14231 = c8596.m14231(iM14231, j);
                int i = this.f9157;
                if (iM14231 != i) {
                    z = true;
                } else {
                    this.f9157 = i + 1;
                }
            } else {
                this.f9157 = iM14231 + 1;
                if (iM14231 == 0) {
                    this.f9156 = j;
                }
                if (iM14231 != 0 || (this.f9178.f9153 & JSONWriter$Feature.WriteNameAsSymbol.mask) != 0) {
                    C8596 c85962 = new C8596();
                    c85962.f24067 = 18;
                    long[] jArr = new long[37];
                    c85962.f24071 = jArr;
                    int[] iArr = new int[37];
                    c85962.f24072 = iArr;
                    c85962.f24070 = true;
                    int i2 = (((int) ((j >>> 32) ^ j)) & Integer.MAX_VALUE) % 37;
                    jArr[i2] = j;
                    iArr[i2] = iM14231;
                    c85962.f24068 = 36;
                    c85962.f24069 = 1;
                    this.f9158 = c85962;
                }
            }
            z = false;
        }
        if (z) {
            int i3 = -iM14231;
            int i4 = this.f9169;
            byte[] bArrM6041 = this.f9159;
            int i5 = i4 + 7;
            if (i5 > bArrM6041.length) {
                bArrM6041 = m6041(i5);
            }
            bArrM6041[i4] = -110;
            this.f9169 = InterfaceC2913.m6366(i4 + 1, bArrM6041, -i3);
            return;
        }
        byte[] bArrM60412 = this.f9159;
        int i6 = this.f9169;
        int length = i6 + 2 + bArr.length;
        if (length > bArrM60412.length) {
            bArrM60412 = m6041(length);
        }
        bArrM60412[i6] = -110;
        System.arraycopy(bArr, 0, bArrM60412, i6 + 1, bArr.length);
        int length2 = bArr.length + 1 + i6;
        if (iM14231 < -16 || iM14231 > 47) {
            iM6366 = InterfaceC2913.m6366(length2, bArrM60412, iM14231);
        } else {
            iM6366 = length2 + 1;
            bArrM60412[length2] = (byte) iM14231;
        }
        this.f9169 = iM6366;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
    public final void m6044(int i, char[] cArr) {
        int i2;
        boolean zM5693;
        int iM6366;
        char c;
        char c2;
        int i3 = this.f9169;
        byte[] bArrM6041 = this.f9159;
        int i4 = 0;
        if (i < 47) {
            int i5 = i3 + 1;
            int i6 = i5 + i;
            if (i6 > bArrM6041.length) {
                bArrM6041 = m6041(i6);
            }
            bArrM6041[i3] = (byte) (i + 73);
            int i7 = 0;
            while (true) {
                if (i7 >= i) {
                    zM5693 = true;
                    break;
                }
                char c3 = cArr[i7];
                if (c3 > 255) {
                    zM5693 = false;
                    break;
                } else {
                    bArrM6041[i5] = (byte) c3;
                    i7++;
                    i5++;
                }
            }
            if (zM5693) {
                this.f9169 = i5;
                return;
            }
            i2 = this.f9169;
        } else {
            i2 = i3;
            zM5693 = AbstractC2849.m5693(i, cArr);
        }
        int i8 = (zM5693 ? i : i * 3) + i2 + 6;
        if (i8 > bArrM6041.length) {
            bArrM6041 = m6041(i8);
        }
        if (zM5693) {
            if (i <= 47) {
                iM6366 = i2 + 1;
                bArrM6041[i2] = (byte) (i + 73);
            } else {
                bArrM6041[i2] = 121;
                if (i <= 2047) {
                    AbstractC2849.m5760(bArrM6041, i2 + 1, (short) (i + 14336));
                    iM6366 = i2 + 3;
                } else {
                    iM6366 = InterfaceC2913.m6366(i2 + 1, bArrM6041, i);
                }
            }
            while (i4 < i) {
                bArrM6041[iM6366] = (byte) cArr[i4];
                i4++;
                iM6366++;
            }
        } else {
            int iM6028 = m6028(i * 3);
            int i9 = i2 + iM6028 + 1;
            short s = AbstractC2849.f8883;
            int iMin = Math.min(i, bArrM6041.length) + i9;
            int i10 = i9;
            while (i10 < iMin && (c2 = cArr[i4]) < 128) {
                i4++;
                bArrM6041[i10] = (byte) c2;
                i10++;
            }
            while (i4 < i) {
                int i11 = i4 + 1;
                char c4 = cArr[i4];
                if (c4 < 128) {
                    bArrM6041[i10] = (byte) c4;
                    i10++;
                } else if (c4 < 2048) {
                    bArrM6041[i10] = (byte) ((c4 >> 6) | 192);
                    bArrM6041[i10 + 1] = (byte) ((c4 & '?') | 128);
                    i10 += 2;
                } else if (c4 < 55296 || c4 > 57343) {
                    bArrM6041[i10] = (byte) ((c4 >> '\f') | Opcodes.SHL_INT_LIT8);
                    bArrM6041[i10 + 1] = (byte) (((c4 >> 6) & 63) | 128);
                    bArrM6041[i10 + 2] = (byte) ((c4 & '?') | 128);
                    i10 += 3;
                } else {
                    if (c4 > 56319 || i - i11 < 1 || (c = cArr[i11]) < 56320 || c > 57343) {
                        C0276.m850(AbstractC6183.m11588(i11, "malformed input off : "));
                        return;
                    }
                    int i12 = ((c4 << '\n') + c) - 56613888;
                    bArrM6041[i10] = (byte) ((i12 >> 18) | 240);
                    bArrM6041[i10 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                    bArrM6041[i10 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                    bArrM6041[i10 + 3] = (byte) ((i12 & 63) | 128);
                    i4 += 2;
                    i10 += 4;
                }
                i4 = i11;
            }
            int i13 = ((i10 - i2) - iM6028) - 1;
            int iM60282 = m6028(i13);
            if (iM6028 != iM60282) {
                System.arraycopy(bArrM6041, i9, bArrM6041, iM60282 + i2 + 1, i13);
            }
            bArrM6041[i2] = 122;
            iM6366 = InterfaceC2913.m6366(i2 + 1, bArrM6041, i13) + i13;
        }
        this.f9169 = iM6366;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏 */
    public final void mo6008(byte[] bArr) {
        int i = this.f9169;
        int length = bArr.length + i;
        byte[] bArrM6041 = this.f9159;
        if (length > bArrM6041.length) {
            bArrM6041 = m6041(length);
        }
        System.arraycopy(bArr, 0, bArrM6041, i, bArr.length);
        this.f9169 = i + bArr.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public final void mo6009(String str) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public final void mo6012(char c) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void mo6045(byte b) {
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        if (i == bArrM6041.length) {
            bArrM6041 = m6041(i + 1);
        }
        bArrM6041[i] = b;
        this.f9169 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
    public final void mo6046(short[] sArr) {
        if (sArr == null) {
            mo6039();
            return;
        }
        mo6040(sArr.length);
        for (short s : sArr) {
            mo6018(s);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public final void mo6013(String[] strArr) {
        if (strArr == null) {
            mo6039();
            return;
        }
        mo6040(strArr.length);
        for (String str : strArr) {
            if (str == null) {
                mo6048();
            } else {
                mo6017(str);
            }
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏, reason: contains not printable characters */
    public final void mo6047(String str) {
        if (str == null) {
            mo5967();
        } else {
            mo6017(str);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    public final void mo6014(int i, int i2, int i3) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public final void mo6015(int i, char[] cArr) {
        int iM6366;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (cArr[i3] > 255) {
                mo6017(new String(cArr, 0, i));
                return;
            }
        }
        int i4 = this.f9169;
        byte[] bArr = this.f9159;
        if (i <= 47) {
            iM6366 = i4 + 1;
            bArr[i4] = (byte) (i + 73);
        } else {
            bArr[i4] = 121;
            iM6366 = InterfaceC2913.m6366(i4 + 1, bArr, i);
        }
        while (i2 < i) {
            bArr[iM6366] = (byte) cArr[i2];
            i2++;
            iM6366++;
        }
        this.f9169 = iM6366;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
    public final void mo6048() {
        mo6045((byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public final void mo6016(List list) {
        if (list == null) {
            mo6039();
            return;
        }
        int size = list.size();
        mo6040(size);
        if (AbstractC2854.f8927 != null && AbstractC2854.f8926 != null) {
            int iM6362 = this.f9169;
            byte[] bArrM6041 = this.f9159;
            for (int i = 0; i < size; i++) {
                String str = (String) list.get(i);
                if (str == null) {
                    if (iM6362 == bArrM6041.length) {
                        bArrM6041 = m6041(iM6362 + 1);
                    }
                    bArrM6041[iM6362] = -81;
                    iM6362++;
                } else if (AbstractC2854.f8926.applyAsInt(str) == 0) {
                    byte[] bArr = (byte[]) AbstractC2854.f8927.apply(str);
                    if (bArr.length + iM6362 + 6 >= bArrM6041.length) {
                        bArrM6041 = m6041(bArr.length + iM6362 + 6);
                    }
                    iM6362 = InterfaceC2913.m6362(bArrM6041, iM6362, bArr);
                }
            }
            this.f9169 = iM6362;
            return;
        }
        for (int i2 = 0; i2 < size; i2++) {
            mo6017((String) list.get(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6017(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2896.mo6017(java.lang.String):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
    public final void mo6049(byte[] bArr) {
        mo6040(bArr.length);
        for (byte b : bArr) {
            mo6023(b);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世, reason: contains not printable characters */
    public final void mo6050(long[] jArr) {
        if (jArr == null) {
            mo6039();
            return;
        }
        mo6040(jArr.length);
        for (long j : jArr) {
            mo6022(j);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public final void mo6018(short s) {
        mo6017(Integer.toString(s));
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public final void mo6019(boolean z) {
        mo6017(Boolean.toString(z));
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰 */
    public final void mo6020(String str) {
        int i = this.f9169;
        byte[] bArrM6041 = this.f9159;
        if (i == bArrM6041.length) {
            bArrM6041 = m6041(i + 1);
        }
        bArrM6041[i] = -109;
        this.f9169 = i + 1;
        mo6017(str == this.f9165 ? "#-1" : str);
        this.f9165 = str;
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public final void mo6021(int i, char[] cArr) {
        m6044(i, cArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public final void mo6022(long j) {
        mo6017(Long.toString(j));
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public final void mo6023(byte b) {
        mo6017(Integer.toString(b));
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public final void mo6024(int i) {
        mo6017(Integer.toString(i));
    }

    @Override // com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5995() {
    }
}
