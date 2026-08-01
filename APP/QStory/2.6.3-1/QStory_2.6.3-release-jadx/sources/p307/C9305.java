package p307;

import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3699;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;
import p294.AbstractC9193;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9305 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final char[] f23860;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final byte[] f23861;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final byte[] f23862;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9305 f23863 = new C9305(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final char[] f23864 = {'n', 'e', 'w', ' ', 'D', 'a', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, 'e', '('};

    static {
        Charset charset = StandardCharsets.UTF_8;
        f23861 = "new Date(".getBytes(charset);
        f23860 = new char[]{'{', '\"', '@', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, 'y', Advice.OffsetMapping.ForOrigin.Renderer.ForPropertyName.SYMBOL, 'e', '\"', ':', '\"', 'j', 'a', 'v', 'a', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, 'q', 'l', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, 'D', 'a', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, 'e', '\"', ',', '\"', 'v', 'a', 'l', '\"', ':'};
        f23862 = "{\"@type\":\"java.sql.Date\",\"val\":".getBytes(charset);
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
        } else {
            abstractC3730.mo6592(((Date) obj).getTime());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        AbstractC3730 abstractC37302;
        String str;
        long j2;
        int iM6417;
        long j3;
        long j4;
        long j5;
        long j6;
        byte[] bArr;
        char[] cArr;
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        C3728 c3728 = abstractC3730.f9523;
        Date date = (Date) obj;
        long time = date.getTime();
        if (abstractC3730.m6619(obj, type)) {
            char c = '}';
            if (abstractC3730.f9522) {
                if ("java.sql.Date".equals(date.getClass().getName())) {
                    cArr = f23860;
                } else {
                    cArr = f23864;
                    c = ')';
                }
                abstractC3730.mo6570(cArr.length, cArr);
            } else {
                if ("java.sql.Date".equals(date.getClass().getName())) {
                    bArr = f23862;
                } else {
                    bArr = f23861;
                    c = ')';
                }
                abstractC3730.mo6568(bArr);
            }
            abstractC3730.mo6523(time);
            abstractC3730.mo6572(c);
            return;
        }
        if (this.f23413 || (abstractC3730.m6638(j) & JSONWriter$Feature.WriterUtilDateAsMillis.mask) != 0) {
            abstractC3730.mo6523(time);
            return;
        }
        if (this.f23414) {
            abstractC3730.mo6523(time / 1000);
            return;
        }
        ZoneId zoneIdM6585 = c3728.m6585();
        ZoneId zoneId = AbstractC3699.f9371;
        int iM64172 = (zoneIdM6585 == zoneId || zoneIdM6585.getRules() == AbstractC3699.f9370) ? AbstractC3699.m6417(Math.floorDiv(time, 1000L)) : (zoneIdM6585 == ZoneOffset.UTC || "UTC".equals(zoneIdM6585.getId())) ? 0 : ZonedDateTime.ofInstant(Instant.ofEpochMilli(time), zoneIdM6585).getOffset().getTotalSeconds();
        String str2 = this.f23415;
        boolean z = this.f23412;
        if (((z || str2 == null) ? null : str2) == null) {
            long jFloorDiv = Math.floorDiv(time, 1000L);
            if (zoneIdM6585 != zoneId) {
                j2 = 0;
                if (zoneIdM6585.getRules() != AbstractC3699.f9370) {
                    iM6417 = zoneIdM6585.getRules().getOffset(Instant.ofEpochMilli(time)).getTotalSeconds();
                }
                long j7 = jFloorDiv + ((long) iM6417);
                long jFloorDiv2 = Math.floorDiv(j7, 86400L);
                int iFloorMod = (int) Math.floorMod(j7, 86400L);
                j3 = jFloorDiv2 + 719468;
                if (j3 >= j2) {
                    long j8 = ((jFloorDiv2 + 719469) / 146097) - 1;
                    j4 = j8 * 400;
                    j3 += (-j8) * 146097;
                } else {
                    j4 = j2;
                }
                long j9 = ((j3 * 400) + 591) / 146097;
                j5 = j3 - ((j9 / 400) + (((j9 / 4) + (j9 * 365)) - (j9 / 100)));
                if (j5 < j2) {
                    j9--;
                    j5 = j3 - ((j9 / 400) + (((j9 / 4) + (365 * j9)) - (j9 / 100)));
                }
                long j10 = j9 + j4;
                int i = (int) j5;
                int i2 = ((i * 5) + 2) / 153;
                int i3 = ((i2 + 2) % 12) + 1;
                int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
                str = str2;
                j6 = j10 + ((long) (i2 / 10));
                if (j6 >= -999999999 || j6 > 999999999) {
                    throw new DateTimeException(AbstractC3275.m5143(j6, "Invalid year "));
                }
                int i5 = (int) j6;
                long j11 = iFloorMod;
                if (j11 < j2 || j11 > 86399) {
                    throw new DateTimeException(AbstractC3275.m5143(j11, "Invalid secondOfDay "));
                }
                int i6 = iM64172;
                int i7 = (int) (j11 / 3600);
                long j12 = j11 - ((long) (i7 * 3600));
                int i8 = (int) (j12 / 60);
                int i9 = (int) (j12 - ((long) (i8 * 60)));
                if (i5 >= 0 && i5 <= 9999) {
                    int iFloorMod2 = (int) Math.floorMod(time, 1000L);
                    if (iFloorMod2 != 0 || z) {
                        abstractC3730.mo6538(i5, i3, i4, i7, i8, i9, iFloorMod2, i6, z);
                        return;
                    }
                    if (i7 == 0 && i8 == 0 && i9 == 0 && "java.sql.Date".equals(date.getClass().getName())) {
                        abstractC3730.mo6552(i5, i3, i4);
                        return;
                    } else {
                        abstractC3730.mo6537(i5, i3, i4, i7, i8, i9);
                        return;
                    }
                }
                abstractC37302 = abstractC3730;
            } else {
                j2 = 0;
            }
            iM6417 = AbstractC3699.m6417(jFloorDiv);
            long j72 = jFloorDiv + ((long) iM6417);
            long jFloorDiv22 = Math.floorDiv(j72, 86400L);
            int iFloorMod3 = (int) Math.floorMod(j72, 86400L);
            j3 = jFloorDiv22 + 719468;
            if (j3 >= j2) {
            }
            long j92 = ((j3 * 400) + 591) / 146097;
            j5 = j3 - ((j92 / 400) + (((j92 / 4) + (j92 * 365)) - (j92 / 100)));
            if (j5 < j2) {
            }
            long j102 = j92 + j4;
            int i10 = (int) j5;
            int i22 = ((i10 * 5) + 2) / 153;
            int i32 = ((i22 + 2) % 12) + 1;
            int i42 = (i10 - (((i22 * 306) + 5) / 10)) + 1;
            str = str2;
            j6 = j102 + ((long) (i22 / 10));
            if (j6 >= -999999999) {
            }
            throw new DateTimeException(AbstractC3275.m5143(j6, "Invalid year "));
        }
        abstractC37302 = abstractC3730;
        str = str2;
        abstractC37302.mo6577((str != null ? m14428() : null).format(ZonedDateTime.ofInstant(Instant.ofEpochMilli(time), zoneIdM6585)));
    }
}
