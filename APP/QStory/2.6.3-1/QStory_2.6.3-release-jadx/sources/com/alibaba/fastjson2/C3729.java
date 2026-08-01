package com.alibaba.fastjson2;

import androidx.collection.C1123;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.android.p002dx.p005io.Opcodes;
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
import java.util.function.Function;
import p025.AbstractC7012;
import p307.InterfaceC9352;
import p314.C9425;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3729 extends AbstractC3730 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final byte[] f9500 = InterfaceC3745.m6915("Asia/Shanghai");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public long f9501;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f9502;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C9425 f9503;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public byte[] f9504;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C3744 f9505;

    static {
        InterfaceC3745.m6915("+08:00");
    }

    public C3729(C3728 c3728) {
        super(c3728, true, StandardCharsets.UTF_8);
        C3744[] c3744Arr = AbstractC3766.f9644;
        C3744 c3744 = c3744Arr[System.identityHashCode(Thread.currentThread()) & (c3744Arr.length - 1)];
        this.f9505 = c3744;
        byte[] bArr = (byte[]) AbstractC3766.f9635.getAndSet(c3744, null);
        this.f9504 = bArr == null ? new byte[8192] : bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏, reason: contains not printable characters */
    public static int m6588(int i) {
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
        byte[] bArr = this.f9504;
        if (bArr.length < 8388608) {
            AbstractC3766.f9635.lazySet(this.f9505, bArr);
        }
    }

    public final String toString() {
        int i = this.f9514;
        if (i == 0) {
            return "<empty>";
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f9504, i);
        boolean[] zArr = AbstractC3732.f9524;
        C3737 c3737 = new C3737(bArrCopyOf.length, AbstractC3766.m6949(), bArrCopyOf);
        AbstractC3730 abstractC3730M6617 = AbstractC3730.m6617();
        try {
            abstractC3730M6617.mo6597(c3737.mo6684());
            return abstractC3730M6617.toString();
        } catch (Exception unused) {
            return InterfaceC3745.m6917(this.f9504[0]) + ", bytes length " + this.f9514;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public final void mo6520(byte[] bArr) {
        int iM6926;
        if (bArr == null) {
            mo6599();
            return;
        }
        int i = this.f9514;
        int length = bArr.length;
        int length2 = (bArr.length * 2) + i + 6;
        byte[] bArrM6601 = this.f9504;
        if (length2 > bArrM6601.length) {
            bArrM6601 = m6601(length2);
        }
        if (length <= 15) {
            iM6926 = i + 1;
            bArrM6601[i] = (byte) (length - 108);
        } else {
            bArrM6601[i] = -92;
            iM6926 = InterfaceC3746.m6926(i + 1, bArrM6601, length);
        }
        int length3 = bArr.length;
        int i2 = 0;
        while (i2 < length3) {
            byte b = bArr[i2];
            if (b < -16 || b > 47) {
                bArrM6601[iM6926] = (byte) ((b >> 8) + 56);
                iM6926++;
            }
            bArrM6601[iM6926] = b;
            i2++;
            iM6926++;
        }
        this.f9514 = iM6926;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public final void mo6521(LocalDate localDate) {
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 5;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        if (localDate == null) {
            bArrM6601[i] = -81;
            i2 = i + 1;
        } else {
            bArrM6601[i] = -87;
            AbstractC3682.m6322(i + 1, bArrM6601, localDate.getDayOfMonth() | (localDate.getYear() << 16) | (localDate.getMonthValue() << 8));
        }
        this.f9514 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏 */
    public final void mo6522(Long l) {
        int i = this.f9514 + 9;
        byte[] bArrM6601 = this.f9504;
        if (i > bArrM6601.length) {
            bArrM6601 = m6601(i);
        }
        this.f9514 = InterfaceC3746.m6927(l.longValue(), bArrM6601, this.f9514);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public final void mo6523(long j) {
        int i = this.f9514 + 9;
        byte[] bArrM6601 = this.f9504;
        if (i > bArrM6601.length) {
            bArrM6601 = m6601(i);
        }
        this.f9514 = InterfaceC3746.m6927(j, bArrM6601, this.f9514);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪 */
    public final void mo6524(byte b) {
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 2;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        AbstractC3682.m6321(bArrM6601, i, (short) ((b << 8) | 189));
        this.f9514 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲 */
    public final void mo6525(long[] jArr) {
        int iM6926;
        if (jArr == null) {
            mo6599();
            return;
        }
        int length = jArr.length;
        int i = this.f9514;
        int iM12133 = AbstractC7012.m12133(length, 9, i, 5);
        byte[] bArrM6601 = this.f9504;
        if (iM12133 > bArrM6601.length) {
            bArrM6601 = m6601(iM12133);
        }
        if (length <= 15) {
            iM6926 = i + 1;
            bArrM6601[i] = (byte) (length - 108);
        } else {
            bArrM6601[i] = -92;
            iM6926 = InterfaceC3746.m6926(i + 1, bArrM6601, length);
        }
        for (long j : jArr) {
            iM6926 = InterfaceC3746.m6927(j, bArrM6601, iM6926);
        }
        this.f9514 = iM6926;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏 */
    public final void mo6526(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世 */
    public final void mo6527() {
        mo6605((byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪 */
    public final void mo6528(OffsetTime offsetTime) {
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 21;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        if (offsetTime == null) {
            bArrM6601[i] = -81;
        } else {
            AbstractC3682.m6322(i, bArrM6601, -1442336255);
            AbstractC3682.m6322(i + 4, bArrM6601, (offsetTime.getHour() << 16) | 16777216 | (offsetTime.getMinute() << 8) | offsetTime.getSecond());
            int iM6926 = InterfaceC3746.m6926(i + 8, bArrM6601, offsetTime.getNano());
            String id = offsetTime.getOffset().getId();
            int length = id.length();
            bArrM6601[iM6926] = (byte) (length + 73);
            id.getBytes(0, length, bArrM6601, iM6926 + 1);
            i = iM6926 + length;
        }
        this.f9514 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public final void mo6529(OffsetDateTime offsetDateTime) {
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 21;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        if (offsetDateTime == null) {
            bArrM6601[i] = -81;
        } else {
            AbstractC3682.m6322(i, bArrM6601, (offsetDateTime.getYear() << 8) | (-1442840576) | offsetDateTime.getMonthValue());
            AbstractC3682.m6322(i + 4, bArrM6601, (offsetDateTime.getDayOfMonth() << 24) | (offsetDateTime.getHour() << 16) | (offsetDateTime.getMinute() << 8) | offsetDateTime.getSecond());
            int iM6926 = InterfaceC3746.m6926(i + 8, bArrM6601, offsetDateTime.getNano());
            String id = offsetDateTime.getOffset().getId();
            int length = id.length();
            bArrM6601[iM6926] = (byte) (length + 73);
            id.getBytes(0, length, bArrM6601, iM6926 + 1);
            i = iM6926 + length;
        }
        this.f9514 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public final void mo6530(short s) {
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 3;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        bArrM6601[i] = -68;
        AbstractC3682.m6320(bArrM6601, i + 1, s);
        this.f9514 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void mo6589(Instant instant) {
        int iM6926;
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 15;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        if (instant == null) {
            bArrM6601[i] = -81;
            iM6926 = i + 1;
        } else {
            bArrM6601[i] = -82;
            iM6926 = InterfaceC3746.m6926(InterfaceC3746.m6927(instant.getEpochSecond(), bArrM6601, i + 1), bArrM6601, instant.getNano());
        }
        this.f9514 = iM6926;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏 */
    public final void mo6531(Integer num) {
        int i = this.f9514;
        int i2 = i + 5;
        byte[] bArrM6601 = this.f9504;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        this.f9514 = InterfaceC3746.m6926(i, bArrM6601, num.intValue());
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世 */
    public final void mo6532(int[] iArr) {
        int iM6926;
        if (iArr == null) {
            mo6599();
            return;
        }
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int length = iArr.length;
        int length2 = (iArr.length * 5) + i + 6;
        if (length2 > bArrM6601.length) {
            bArrM6601 = m6601(length2);
        }
        if (length <= 15) {
            iM6926 = i + 1;
            bArrM6601[i] = (byte) (length - 108);
        } else {
            bArrM6601[i] = -92;
            iM6926 = InterfaceC3746.m6926(i + 1, bArrM6601, length);
        }
        for (int i2 : iArr) {
            iM6926 = InterfaceC3746.m6926(iM6926, bArrM6601, i2);
        }
        this.f9514 = iM6926;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void mo6590(short[] sArr) {
        if (sArr == null) {
            mo6527();
            return;
        }
        mo6600(sArr.length);
        for (short s : sArr) {
            mo6533(s);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世 */
    public final void mo6533(int i) {
        int i2 = this.f9514;
        int i3 = i2 + 5;
        byte[] bArrM6601 = this.f9504;
        if (i3 > bArrM6601.length) {
            bArrM6601 = m6601(i3);
        }
        this.f9514 = InterfaceC3746.m6926(i2, bArrM6601, i);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final void mo6591(String str) {
        mo6577(str);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void mo6592(long j) {
        int i = this.f9514;
        int i2 = i + 9;
        byte[] bArrM6601 = this.f9504;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        if (j % 1000 == 0) {
            long j2 = j / 1000;
            if (j2 >= -2147483648L && j2 <= 2147483647L) {
                bArrM6601[i] = -84;
                AbstractC3682.m6322(i + 1, bArrM6601, (int) j2);
                this.f9514 = i + 5;
                return;
            }
            if (j2 % 60 == 0) {
                long j3 = j2 / 60;
                if (j3 >= -2147483648L && j3 <= 2147483647L) {
                    bArrM6601[i] = -83;
                    AbstractC3682.m6322(i + 1, bArrM6601, (int) j3);
                    this.f9514 = i + 5;
                    return;
                }
            }
        }
        bArrM6601[i] = -85;
        AbstractC3682.m6309(j, bArrM6601, i + 1);
        this.f9514 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    public final void mo6534(byte[] bArr) {
        mo6568(bArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final void mo6593(long j, byte[] bArr) {
        boolean z;
        int iM14790;
        int iM6926;
        int iM69262;
        int i = this.f9514;
        int length = i + 6 + bArr.length;
        byte[] bArrM6601 = this.f9504;
        if (length > bArrM6601.length) {
            bArrM6601 = m6601(length);
        }
        if ((this.f9523.f9498 & JSONWriter$Feature.WriteNameAsSymbol.mask) == 0) {
            System.arraycopy(bArr, 0, bArrM6601, i, bArr.length);
            this.f9514 = i + bArr.length;
            return;
        }
        C9425 c9425 = this.f9503;
        if (c9425 != null) {
            iM14790 = c9425.m14790(this.f9502, j);
            int i2 = this.f9502;
            z = true;
            if (iM14790 == i2) {
                this.f9502 = i2 + 1;
                z = false;
            }
        } else {
            C9425 c94252 = new C9425();
            this.f9503 = c94252;
            int i3 = this.f9502;
            this.f9502 = i3 + 1;
            c94252.m14791(i3, j);
            z = false;
            iM14790 = i3;
        }
        if (z) {
            int i4 = i + 1;
            bArrM6601[i] = 127;
            int i5 = -(-iM14790);
            if (i5 < -16 || i5 > 47) {
                iM6926 = InterfaceC3746.m6926(i4, bArrM6601, i5);
            } else {
                iM6926 = i + 2;
                bArrM6601[i4] = (byte) i5;
            }
            this.f9514 = iM6926;
            return;
        }
        int i6 = i + 1;
        bArrM6601[i] = 127;
        System.arraycopy(bArr, 0, bArrM6601, i6, bArr.length);
        int length2 = i6 + bArr.length;
        if (iM14790 < -16 || iM14790 > 47) {
            iM69262 = InterfaceC3746.m6926(length2, bArrM6601, iM14790);
        } else {
            iM69262 = length2 + 1;
            bArrM6601[length2] = (byte) iM14790;
        }
        this.f9514 = iM69262;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public final void mo6535(LocalDateTime localDateTime) {
        int iM6926;
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 13;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        if (localDateTime == null) {
            bArrM6601[i] = -81;
            iM6926 = i + 1;
        } else {
            AbstractC3682.m6322(i, bArrM6601, (localDateTime.getYear() << 8) | (-1476395008) | localDateTime.getMonthValue());
            AbstractC3682.m6322(i + 4, bArrM6601, (localDateTime.getDayOfMonth() << 24) | (localDateTime.getHour() << 16) | (localDateTime.getMinute() << 8) | localDateTime.getSecond());
            iM6926 = InterfaceC3746.m6926(i + 8, bArrM6601, localDateTime.getNano());
        }
        this.f9514 = iM6926;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世 */
    public final void mo6536(LocalTime localTime) {
        int iM6926;
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 9;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        if (localTime == null) {
            bArrM6601[i] = -81;
            iM6926 = i + 1;
        } else {
            AbstractC3682.m6322(i, bArrM6601, (localTime.getHour() << 16) | (-1493172224) | (localTime.getMinute() << 8) | localTime.getSecond());
            iM6926 = InterfaceC3746.m6926(i + 4, bArrM6601, localTime.getNano());
        }
        this.f9514 = iM6926;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final void mo6537(int i, int i2, int i3, int i4, int i5, int i6) {
        mo6541(i, i2, i3, i4, i5, i6);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo6538(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo6539() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final void mo6540(char c) {
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 6;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        bArrM6601[i] = -112;
        this.f9514 = InterfaceC3746.m6926(i + 1, bArrM6601, c);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final void mo6541(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i8 = i7 + 9;
        if (i8 > bArrM6601.length) {
            bArrM6601 = m6601(i8);
        }
        AbstractC3682.m6322(i7, bArrM6601, ((i & Opcodes.MAX_VALUE) << 8) | (-1476395008) | i2);
        AbstractC3682.m6322(i7 + 4, bArrM6601, (i3 << 24) | (i4 << 16) | (i5 << 8) | i6);
        bArrM6601[i7 + 8] = 0;
        this.f9514 = i8;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final void mo6542() {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏 */
    public final void mo6543(float f) {
        int i = this.f9514;
        int i2 = i + 5;
        byte[] bArrM6601 = this.f9504;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        this.f9514 = InterfaceC3746.m6924(bArrM6601, i, f);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏 */
    public final void mo6544(double[] dArr) {
        int iM6923;
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int length = (dArr == null ? 1 : (dArr.length * 9) + 5) + i;
        if (length > bArrM6601.length) {
            bArrM6601 = m6601(length);
        }
        if (dArr == null) {
            bArrM6601[i] = -81;
            iM6923 = i + 1;
        } else {
            iM6923 = InterfaceC3746.m6923(i, bArrM6601, dArr.length);
            for (double d : dArr) {
                iM6923 = InterfaceC3746.m6925(bArrM6601, iM6923, d);
            }
        }
        this.f9514 = iM6923;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final void mo6594(Enum r7) {
        if (r7 == null) {
            mo6527();
            return;
        }
        long j = this.f9523.f9498;
        if ((24576 & j) != 0) {
            mo6577((j & JSONWriter$Feature.WriteEnumUsingToString.mask) != 0 ? r7.toString() : r7.name());
            return;
        }
        int iOrdinal = r7.ordinal();
        byte[] bArrM6601 = this.f9504;
        int i = this.f9514;
        int i2 = i + 5;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        this.f9514 = InterfaceC3746.m6926(i, bArrM6601, iOrdinal);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public final void mo6545(byte[] bArr) {
        mo6596(bArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final void mo6546(float[] fArr) {
        int iM6923;
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int length = (fArr == null ? 1 : (fArr.length * 5) + 5) + i;
        if (length > bArrM6601.length) {
            bArrM6601 = m6601(length);
        }
        if (fArr == null) {
            bArrM6601[i] = -81;
            iM6923 = i + 1;
        } else {
            iM6923 = InterfaceC3746.m6923(i, bArrM6601, fArr.length);
            for (float f : fArr) {
                iM6923 = InterfaceC3746.m6924(bArrM6601, iM6923, f);
            }
        }
        this.f9514 = iM6923;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final void mo6547(BigInteger bigInteger, long j) {
        if (bigInteger == null) {
            mo6527();
            return;
        }
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        if (AbstractC3700.m6498(bigInteger)) {
            int i2 = i + 10;
            if (i2 > bArrM6601.length) {
                bArrM6601 = m6601(i2);
            }
            bArrM6601[i] = -70;
            this.f9514 = InterfaceC3746.m6927(bigInteger.longValue(), bArrM6601, i + 1);
            return;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = i + 5 + byteArray.length;
        if (length > bArrM6601.length) {
            bArrM6601 = m6601(length);
        }
        bArrM6601[i] = -69;
        int iM6926 = InterfaceC3746.m6926(i + 1, bArrM6601, byteArray.length);
        System.arraycopy(byteArray, 0, bArrM6601, iM6926, byteArray.length);
        this.f9514 = iM6926 + byteArray.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo6548(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final void mo6595(boolean[] zArr) {
        int length;
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int length2 = (zArr == null ? 1 : zArr.length + 5) + i;
        if (length2 > bArrM6601.length) {
            bArrM6601 = m6601(length2);
        }
        if (zArr == null) {
            bArrM6601[i] = -81;
            length = i + 1;
        } else {
            int iM6923 = InterfaceC3746.m6923(i, bArrM6601, zArr.length);
            for (int i2 = 0; i2 < zArr.length; i2++) {
                bArrM6601[iM6923 + i2] = zArr[i2] ? (byte) -79 : (byte) -80;
            }
            length = iM6923 + zArr.length;
        }
        this.f9514 = length;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final void mo6596(byte[] bArr) {
        if (bArr == null) {
            mo6527();
            return;
        }
        int i = this.f9514;
        int length = bArr.length;
        int i2 = i + 6 + length;
        byte[] bArrM6601 = this.f9504;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        bArrM6601[i] = -111;
        int iM6926 = InterfaceC3746.m6926(i + 1, bArrM6601, length);
        System.arraycopy(bArr, 0, bArrM6601, iM6926, length);
        this.f9514 = iM6926 + length;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo6549(boolean z) {
        mo6605(z ? (byte) -79 : (byte) -80);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo6550(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat) {
        int iM6927;
        if (bigDecimal == null) {
            mo6527();
            return;
        }
        int iPrecision = bigDecimal.precision();
        int iScale = bigDecimal.scale();
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 15;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        if (iPrecision < 19) {
            long j2 = AbstractC3687.f9279;
            if (j2 != -1) {
                long j3 = AbstractC3687.f9266.getLong(bigDecimal, j2);
                if (iScale == 0) {
                    bArrM6601[i] = -72;
                    this.f9514 = InterfaceC3746.m6927(j3, bArrM6601, i + 1);
                    return;
                } else {
                    bArrM6601[i] = -71;
                    int iM6926 = InterfaceC3746.m6926(i + 1, bArrM6601, iScale);
                    this.f9514 = (j3 < -2147483648L || j3 > 2147483647L) ? InterfaceC3746.m6927(j3, bArrM6601, iM6926) : InterfaceC3746.m6926(iM6926, bArrM6601, (int) j3);
                    return;
                }
            }
        }
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        if (iScale == 0 && AbstractC3700.m6498(bigIntegerUnscaledValue)) {
            bArrM6601[i] = -72;
            this.f9514 = InterfaceC3746.m6927(bigIntegerUnscaledValue.longValue(), bArrM6601, i + 1);
            return;
        }
        bArrM6601[i] = -71;
        int iM69262 = InterfaceC3746.m6926(i + 1, bArrM6601, iScale);
        if (AbstractC3700.m6494(bigIntegerUnscaledValue)) {
            iM6927 = InterfaceC3746.m6926(iM69262, bArrM6601, bigIntegerUnscaledValue.intValue());
        } else {
            if (!AbstractC3700.m6498(bigIntegerUnscaledValue)) {
                this.f9514 = iM69262;
                mo6547(bigIntegerUnscaledValue, 0L);
                return;
            }
            iM6927 = InterfaceC3746.m6927(bigIntegerUnscaledValue.longValue(), bArrM6601, iM69262);
        }
        this.f9514 = iM6927;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    public final void mo6551(double d) {
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 9;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        this.f9514 = InterfaceC3746.m6925(bArrM6601, i, d);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final void mo6552(int i, int i2, int i3) {
        mo6553(i, i2, i3);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo6553(int i, int i2, int i3) {
        int i4 = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i5 = i4 + 5;
        if (i5 > bArrM6601.length) {
            bArrM6601 = m6601(i5);
        }
        bArrM6601[i4] = -87;
        AbstractC3682.m6322(i4 + 1, bArrM6601, (i << 16) | (i2 << 8) | i3);
        this.f9514 = i5;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6554() {
        this.f9518--;
        mo6605((byte) -91);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void mo6597(Object obj) {
        if (obj == null) {
            mo6527();
            return;
        }
        C3728 c3728 = this.f9523;
        boolean z = (c3728.f9498 & JSONWriter$Feature.FieldBased.mask) != 0;
        Class<?> cls = obj.getClass();
        InterfaceC9352 interfaceC9352M14665 = c3728.f9499.m14665(cls, cls, z);
        if (m6639()) {
            interfaceC9352M14665.mo14577(this, obj, null, 0L);
        } else {
            interfaceC9352M14665.mo6238(this, obj, null, null, 0L);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final void mo6556(Map map) {
        if (map == null) {
            mo6527();
            return;
        }
        mo6557();
        for (Map.Entry entry : map.entrySet()) {
            mo6597(entry.getKey());
            mo6597(entry.getValue());
        }
        mo6554();
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void mo6598(long j) {
        mo6605((j & AbstractC3730.f9508) != 0 ? (byte) -108 : (byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void mo6599() {
        mo6605((this.f9523.f9498 & AbstractC3730.f9508) != 0 ? (byte) -108 : (byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo6557() {
        int i = this.f9518 + 1;
        this.f9518 = i;
        if (i <= this.f9523.f9496) {
            mo6605((byte) -90);
        } else {
            m6644();
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final void mo6558(List list) {
        mo6600(list.size());
        for (int i = 0; i < list.size(); i++) {
            mo6597(list.get(i));
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void mo6600(int i) {
        int i2 = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i3 = i2 + 6;
        if (i3 > bArrM6601.length) {
            bArrM6601 = m6601(i3);
        }
        this.f9514 = InterfaceC3746.m6923(i2, bArrM6601, i);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final void mo6559() {
        throw new JSONException("unsupported operation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
    public final byte[] m6601(int i) {
        byte[] bArr = this.f9504;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, m6649(i, bArr.length));
        this.f9504 = bArrCopyOf;
        return bArrCopyOf;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
    public final void mo6561(ZonedDateTime zonedDateTime) {
        if (zonedDateTime == null) {
            mo6527();
            return;
        }
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 13;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        AbstractC3682.m6322(i, bArrM6601, (zonedDateTime.getYear() << 8) | (-1442840576) | zonedDateTime.getMonthValue());
        AbstractC3682.m6322(i + 4, bArrM6601, (zonedDateTime.getDayOfMonth() << 24) | (zonedDateTime.getHour() << 16) | (zonedDateTime.getMinute() << 8) | zonedDateTime.getSecond());
        this.f9514 = InterfaceC3746.m6926(i + 8, bArrM6601, zonedDateTime.getNano());
        String id = zonedDateTime.getZone().getId();
        if (id.equals("Asia/Shanghai")) {
            mo6568(f9500);
        } else {
            mo6577(id);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    public final void mo6562(UUID uuid) {
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i2 = i + 18;
        if (i2 > bArrM6601.length) {
            bArrM6601 = m6601(i2);
        }
        if (uuid == null) {
            bArrM6601[i] = -81;
            i2 = i + 1;
        } else {
            AbstractC3682.m6321(bArrM6601, i, (short) 4241);
            AbstractC3682.m6309(uuid.getMostSignificantBits(), bArrM6601, i + 2);
            AbstractC3682.m6309(uuid.getLeastSignificantBits(), bArrM6601, i + 10);
        }
        this.f9514 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[EDGE_INSN: B:36:0x005e->B:24:0x005e BREAK  A[LOOP:0: B:14:0x0046->B:39:?]] */
    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6602(String str) {
        int i;
        int i2 = this.f9514;
        byte[] bArrM6601 = this.f9504;
        if (i2 == bArrM6601.length) {
            bArrM6601 = m6601(i2 + 1);
        }
        int i3 = i2 + 1;
        bArrM6601[i2] = -110;
        long jM6334 = AbstractC3693.m6334(str);
        C9425 c9425 = this.f9503;
        if (c9425 != null) {
            long[] jArr = c9425.f24416;
            int i4 = ((int) ((jM6334 >>> 32) ^ jM6334)) & Integer.MAX_VALUE;
            int length = i4 % jArr.length;
            long j = jArr[length];
            if (j == 0) {
                i = -1;
            } else if (j == jM6334) {
                i = c9425.f24417[length];
            } else {
                int length2 = jArr.length;
                int i5 = (i4 % (length2 - 2)) + 1;
                int i6 = length;
                do {
                    i6 -= i5;
                    if (i6 < 0) {
                        i6 += length2;
                    }
                    long j2 = c9425.f24416[i6];
                    if (j2 == 0) {
                        break;
                    } else if (jM6334 == j2) {
                        i = c9425.f24417[i6];
                        break;
                    }
                } while (i6 != length);
                i = -1;
            }
        }
        if (i != -1) {
            if (i3 == bArrM6601.length) {
                bArrM6601 = m6601(i2 + 2);
            }
            this.f9514 = InterfaceC3746.m6926(i3, bArrM6601, i);
            return;
        }
        if (this.f9503 == null) {
            this.f9503 = new C9425();
        }
        C9425 c94252 = this.f9503;
        int i7 = this.f9502;
        this.f9502 = i7 + 1;
        c94252.m14791(i7, jM6334);
        this.f9514 = i3;
        mo6577(str);
        mo6533(i7);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
    public final void mo6603(long j, byte[] bArr) {
        int iM14790;
        boolean z;
        int iM6926;
        if (this.f9501 == j) {
            z = true;
            iM14790 = 0;
        } else {
            C9425 c9425 = this.f9503;
            iM14790 = this.f9502;
            if (c9425 != null) {
                iM14790 = c9425.m14790(iM14790, j);
                int i = this.f9502;
                if (iM14790 != i) {
                    z = true;
                } else {
                    this.f9502 = i + 1;
                }
            } else {
                this.f9502 = iM14790 + 1;
                if (iM14790 == 0) {
                    this.f9501 = j;
                }
                if (iM14790 != 0 || (this.f9523.f9498 & JSONWriter$Feature.WriteNameAsSymbol.mask) != 0) {
                    C9425 c94252 = new C9425();
                    c94252.f24412 = 18;
                    long[] jArr = new long[37];
                    c94252.f24416 = jArr;
                    int[] iArr = new int[37];
                    c94252.f24417 = iArr;
                    c94252.f24415 = true;
                    int i2 = (((int) ((j >>> 32) ^ j)) & Integer.MAX_VALUE) % 37;
                    jArr[i2] = j;
                    iArr[i2] = iM14790;
                    c94252.f24413 = 36;
                    c94252.f24414 = 1;
                    this.f9503 = c94252;
                }
            }
            z = false;
        }
        if (z) {
            int i3 = -iM14790;
            int i4 = this.f9514;
            byte[] bArrM6601 = this.f9504;
            int i5 = i4 + 7;
            if (i5 > bArrM6601.length) {
                bArrM6601 = m6601(i5);
            }
            bArrM6601[i4] = -110;
            this.f9514 = InterfaceC3746.m6926(i4 + 1, bArrM6601, -i3);
            return;
        }
        byte[] bArrM66012 = this.f9504;
        int i6 = this.f9514;
        int length = i6 + 2 + bArr.length;
        if (length > bArrM66012.length) {
            bArrM66012 = m6601(length);
        }
        bArrM66012[i6] = -110;
        System.arraycopy(bArr, 0, bArrM66012, i6 + 1, bArr.length);
        int length2 = bArr.length + 1 + i6;
        if (iM14790 < -16 || iM14790 > 47) {
            iM6926 = InterfaceC3746.m6926(length2, bArrM66012, iM14790);
        } else {
            iM6926 = length2 + 1;
            bArrM66012[length2] = (byte) iM14790;
        }
        this.f9514 = iM6926;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
    public final void m6604(int i, char[] cArr) {
        int i2;
        boolean zM6253;
        int iM6926;
        char c;
        char c2;
        int i3 = this.f9514;
        byte[] bArrM6601 = this.f9504;
        int i4 = 0;
        if (i < 47) {
            int i5 = i3 + 1;
            int i6 = i5 + i;
            if (i6 > bArrM6601.length) {
                bArrM6601 = m6601(i6);
            }
            bArrM6601[i3] = (byte) (i + 73);
            int i7 = 0;
            while (true) {
                if (i7 >= i) {
                    zM6253 = true;
                    break;
                }
                char c3 = cArr[i7];
                if (c3 > 255) {
                    zM6253 = false;
                    break;
                } else {
                    bArrM6601[i5] = (byte) c3;
                    i7++;
                    i5++;
                }
            }
            if (zM6253) {
                this.f9514 = i5;
                return;
            }
            i2 = this.f9514;
        } else {
            i2 = i3;
            zM6253 = AbstractC3682.m6253(i, cArr);
        }
        int i8 = (zM6253 ? i : i * 3) + i2 + 6;
        if (i8 > bArrM6601.length) {
            bArrM6601 = m6601(i8);
        }
        if (zM6253) {
            if (i <= 47) {
                iM6926 = i2 + 1;
                bArrM6601[i2] = (byte) (i + 73);
            } else {
                bArrM6601[i2] = 121;
                if (i <= 2047) {
                    AbstractC3682.m6320(bArrM6601, i2 + 1, (short) (i + 14336));
                    iM6926 = i2 + 3;
                } else {
                    iM6926 = InterfaceC3746.m6926(i2 + 1, bArrM6601, i);
                }
            }
            while (i4 < i) {
                bArrM6601[iM6926] = (byte) cArr[i4];
                i4++;
                iM6926++;
            }
        } else {
            int iM6588 = m6588(i * 3);
            int i9 = i2 + iM6588 + 1;
            short s = AbstractC3682.f9228;
            int iMin = Math.min(i, bArrM6601.length) + i9;
            int i10 = i9;
            while (i10 < iMin && (c2 = cArr[i4]) < 128) {
                i4++;
                bArrM6601[i10] = (byte) c2;
                i10++;
            }
            while (i4 < i) {
                int i11 = i4 + 1;
                char c4 = cArr[i4];
                if (c4 < 128) {
                    bArrM6601[i10] = (byte) c4;
                    i10++;
                } else if (c4 < 2048) {
                    bArrM6601[i10] = (byte) ((c4 >> 6) | 192);
                    bArrM6601[i10 + 1] = (byte) ((c4 & '?') | 128);
                    i10 += 2;
                } else if (c4 < 55296 || c4 > 57343) {
                    bArrM6601[i10] = (byte) ((c4 >> '\f') | Opcodes.SHL_INT_LIT8);
                    bArrM6601[i10 + 1] = (byte) (((c4 >> 6) & 63) | 128);
                    bArrM6601[i10 + 2] = (byte) ((c4 & '?') | 128);
                    i10 += 3;
                } else {
                    if (c4 > 56319 || i - i11 < 1 || (c = cArr[i11]) < 56320 || c > 57343) {
                        C1123.m1410(AbstractC7012.m12147(i11, "malformed input off : "));
                        return;
                    }
                    int i12 = ((c4 << '\n') + c) - 56613888;
                    bArrM6601[i10] = (byte) ((i12 >> 18) | 240);
                    bArrM6601[i10 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                    bArrM6601[i10 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                    bArrM6601[i10 + 3] = (byte) ((i12 & 63) | 128);
                    i4 += 2;
                    i10 += 4;
                }
                i4 = i11;
            }
            int i13 = ((i10 - i2) - iM6588) - 1;
            int iM65882 = m6588(i13);
            if (iM6588 != iM65882) {
                System.arraycopy(bArrM6601, i9, bArrM6601, iM65882 + i2 + 1, i13);
            }
            bArrM6601[i2] = 122;
            iM6926 = InterfaceC3746.m6926(i2 + 1, bArrM6601, i13) + i13;
        }
        this.f9514 = iM6926;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏 */
    public final void mo6568(byte[] bArr) {
        int i = this.f9514;
        int length = bArr.length + i;
        byte[] bArrM6601 = this.f9504;
        if (length > bArrM6601.length) {
            bArrM6601 = m6601(length);
        }
        System.arraycopy(bArr, 0, bArrM6601, i, bArr.length);
        this.f9514 = i + bArr.length;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public final void mo6569(String str) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public final void mo6572(char c) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void mo6605(byte b) {
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        if (i == bArrM6601.length) {
            bArrM6601 = m6601(i + 1);
        }
        bArrM6601[i] = b;
        this.f9514 = i + 1;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
    public final void mo6606(short[] sArr) {
        if (sArr == null) {
            mo6599();
            return;
        }
        mo6600(sArr.length);
        for (short s : sArr) {
            mo6578(s);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public final void mo6573(String[] strArr) {
        if (strArr == null) {
            mo6599();
            return;
        }
        mo6600(strArr.length);
        for (String str : strArr) {
            if (str == null) {
                mo6608();
            } else {
                mo6577(str);
            }
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏, reason: contains not printable characters */
    public final void mo6607(String str) {
        if (str == null) {
            mo6527();
        } else {
            mo6577(str);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    public final void mo6574(int i, int i2, int i3) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public final void mo6575(int i, char[] cArr) {
        int iM6926;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (cArr[i3] > 255) {
                mo6577(new String(cArr, 0, i));
                return;
            }
        }
        int i4 = this.f9514;
        byte[] bArr = this.f9504;
        if (i <= 47) {
            iM6926 = i4 + 1;
            bArr[i4] = (byte) (i + 73);
        } else {
            bArr[i4] = 121;
            iM6926 = InterfaceC3746.m6926(i4 + 1, bArr, i);
        }
        while (i2 < i) {
            bArr[iM6926] = (byte) cArr[i2];
            i2++;
            iM6926++;
        }
        this.f9514 = iM6926;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
    public final void mo6608() {
        mo6605((byte) -81);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public final void mo6576(List list) {
        if (list == null) {
            mo6599();
            return;
        }
        int size = list.size();
        mo6600(size);
        if (AbstractC3687.f9272 != null && AbstractC3687.f9271 != null) {
            int iM6922 = this.f9514;
            byte[] bArrM6601 = this.f9504;
            for (int i = 0; i < size; i++) {
                String str = (String) list.get(i);
                if (str == null) {
                    if (iM6922 == bArrM6601.length) {
                        bArrM6601 = m6601(iM6922 + 1);
                    }
                    bArrM6601[iM6922] = -81;
                    iM6922++;
                } else if (AbstractC3687.f9271.applyAsInt(str) == 0) {
                    byte[] bArr = (byte[]) AbstractC3687.f9272.apply(str);
                    if (bArr.length + iM6922 + 6 >= bArrM6601.length) {
                        bArrM6601 = m6601(bArr.length + iM6922 + 6);
                    }
                    iM6922 = InterfaceC3746.m6922(bArrM6601, iM6922, bArr);
                }
            }
            this.f9514 = iM6922;
            return;
        }
        for (int i2 = 0; i2 < size; i2++) {
            mo6577((String) list.get(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6577(String str) {
        byte b;
        if (str == null) {
            mo6527();
            return;
        }
        Function function = AbstractC3687.f9272;
        if (function != null) {
            byte[] bArr = (byte[]) function.apply(str);
            if (AbstractC3687.f9271.applyAsInt(str) == 0) {
                byte[] bArrM6601 = this.f9504;
                int i = this.f9514;
                int length = bArr.length + i + 6;
                if (length - bArrM6601.length > 0) {
                    bArrM6601 = m6601(length);
                }
                this.f9514 = InterfaceC3746.m6922(bArrM6601, i, bArr);
                return;
            }
            int length2 = 128 > bArr.length ? bArr.length : 128;
            boolean z = true;
            if ((length2 & 1) == 1) {
                length2--;
            }
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 2;
                if (i4 > length2) {
                    break;
                }
                byte b2 = bArr[i2];
                byte b3 = bArr[i2 + 1];
                if (b2 == 0 || b3 == 0) {
                    i3++;
                }
                i2 = i4;
            }
            boolean z2 = bArr.length != 0 && (i3 == 0 || (length2 >> 1) / i3 >= 3);
            int i5 = this.f9514;
            int iM12133 = AbstractC7012.m12133(bArr.length, 2, i5 + 6, 1);
            byte[] bArrM66012 = this.f9504;
            if (iM12133 > bArrM66012.length) {
                bArrM66012 = m6601(iM12133);
            }
            if (z2) {
                z = z2;
                if (z) {
                }
            } else {
                int iM6588 = m6588(bArr.length + (bArr.length >> 2));
                int i6 = i5 + iM6588 + 1;
                int iM6303 = AbstractC3682.m6303(bArr.length, i6, bArr, bArrM66012);
                int iM6926 = (iM6303 - i5) - iM6588;
                int i7 = iM6926 - 1;
                if (i7 <= bArr.length) {
                    if (iM6303 != -1) {
                        if (i7 * 2 != bArr.length) {
                            b = 122;
                        } else {
                            if (i3 <= 47) {
                                bArrM66012[i5] = (byte) (iM6926 + 72);
                                int i8 = i5 + 1;
                                System.arraycopy(bArrM66012, iM6588 + i8, bArrM66012, i8, i7);
                                this.f9514 = i5 + iM6926;
                                return;
                            }
                            b = 121;
                        }
                        int iM65882 = m6588(i7);
                        if (iM6588 != iM65882) {
                            System.arraycopy(bArrM66012, i6, bArrM66012, iM65882 + i5 + 1, i7);
                        }
                        bArrM66012[i5] = b;
                        iM6926 = (InterfaceC3746.m6926(i5 + 1, bArrM66012, i7) - i5) + i7;
                        this.f9514 = i5 + iM6926;
                        return;
                    }
                    z = z2;
                }
                if (z) {
                    bArrM66012[i5] = AbstractC3687.f9276 ? (byte) 125 : (byte) 124;
                    int iM69262 = InterfaceC3746.m6926(i5 + 1, bArrM66012, bArr.length);
                    System.arraycopy(bArr, 0, bArrM66012, iM69262, bArr.length);
                    this.f9514 = ((bArr.length + iM69262) - i5) + i5;
                    return;
                }
            }
        }
        char[] cArrM6330 = AbstractC3687.m6330(str);
        if (cArrM6330 == null) {
            mo6527();
        } else {
            m6604(cArrM6330.length, cArrM6330);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
    public final void mo6609(byte[] bArr) {
        mo6600(bArr.length);
        for (byte b : bArr) {
            mo6583(b);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世, reason: contains not printable characters */
    public final void mo6610(long[] jArr) {
        if (jArr == null) {
            mo6599();
            return;
        }
        mo6600(jArr.length);
        for (long j : jArr) {
            mo6582(j);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public final void mo6578(short s) {
        mo6577(Integer.toString(s));
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public final void mo6579(boolean z) {
        mo6577(Boolean.toString(z));
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰 */
    public final void mo6580(String str) {
        int i = this.f9514;
        byte[] bArrM6601 = this.f9504;
        if (i == bArrM6601.length) {
            bArrM6601 = m6601(i + 1);
        }
        bArrM6601[i] = -109;
        this.f9514 = i + 1;
        mo6577(str == this.f9510 ? "#-1" : str);
        this.f9510 = str;
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public final void mo6581(int i, char[] cArr) {
        m6604(i, cArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public final void mo6582(long j) {
        mo6577(Long.toString(j));
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public final void mo6583(byte b) {
        mo6577(Integer.toString(b));
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public final void mo6584(int i) {
        mo6577(Integer.toString(i));
    }

    @Override // com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6555() {
    }
}
