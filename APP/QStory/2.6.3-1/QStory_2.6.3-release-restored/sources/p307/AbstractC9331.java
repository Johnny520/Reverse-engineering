package p307;

import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3699;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9331 extends AbstractC9323 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final boolean f23968;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final boolean f23969;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f23970;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public DateTimeFormatter f23971;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f23972;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f23973;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public C9305 f23974;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean f23975;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC9331(String str, int i, long j, String str2, String str3, Class cls, Class cls2, Field field, Method method) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        super(str, i, j, str2, null, str3, cls, cls2, field, method);
        boolean z6 = false;
        if (str2 != null) {
            z2 = true;
            switch (str2) {
                case "millis":
                    z = false;
                    z3 = false;
                    z5 = false;
                    z4 = false;
                    z6 = true;
                    z2 = z4;
                    break;
                case "unixtime":
                    z3 = false;
                    z5 = false;
                    z4 = false;
                    z = true;
                    z2 = z4;
                    break;
                case "yyyyMMdd":
                    z = false;
                    z5 = false;
                    z4 = false;
                    z3 = true;
                    z2 = z4;
                    break;
                case "yyyy-MM-dd HH:mm:ss":
                    z = false;
                    z3 = false;
                    z5 = false;
                    z4 = true;
                    z2 = false;
                    break;
                case "yyyyMMddHHmmss":
                    z = false;
                    z3 = false;
                    z4 = false;
                    z5 = true;
                    z2 = z4;
                    break;
                case "iso8601":
                    z = false;
                    z3 = false;
                    z5 = z3;
                    z4 = z5;
                    break;
                default:
                    z = false;
                    z2 = false;
                    z3 = false;
                    z5 = z3;
                    z4 = z5;
                    break;
            }
        }
        this.f23970 = z6;
        this.f23973 = z2;
        this.f23975 = z;
        this.f23972 = z3;
        this.f23968 = z5;
        this.f23969 = z4;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC9352 mo14553(AbstractC3730 abstractC3730, Class cls) {
        if (cls != this.f23962) {
            return abstractC3730.m6637(cls);
        }
        C9368 c9368 = abstractC3730.f9523.f9499;
        C9305 c9305 = this.f23974;
        if (c9305 != null) {
            return c9305;
        }
        c9368.getClass();
        String str = this.f23959;
        if (str == null) {
            C9305 c93052 = C9305.f23863;
            this.f23974 = c93052;
            return c93052;
        }
        C9305 c93053 = new C9305(str, null);
        this.f23974 = c93053;
        return c93053;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14643(AbstractC3730 abstractC3730, long j) {
        String str;
        long j2;
        boolean z;
        AbstractC3730 abstractC37302;
        ZonedDateTime zonedDateTime;
        int year;
        if (abstractC3730.f9516) {
            m14637(abstractC3730);
            abstractC3730.mo6592(j);
            return;
        }
        C3728 c3728 = abstractC3730.f9523;
        boolean z2 = this.f23975;
        if (z2) {
            m14637(abstractC3730);
            abstractC3730.mo6523(j / 1000);
            return;
        }
        boolean z3 = this.f23970;
        if (z3 || (abstractC3730.m6638(this.f23956) & JSONWriter$Feature.WriterUtilDateAsMillis.mask) != 0) {
            m14637(abstractC3730);
            abstractC3730.mo6523(j);
            return;
        }
        ZoneId zoneIdM6585 = c3728.m6585();
        String str2 = this.f23959;
        String str3 = str2 != null ? str2 : null;
        boolean z4 = this.f23968;
        boolean z5 = this.f23969;
        if (str3 == null || z4 || z5) {
            long jFloorDiv = Math.floorDiv(j, 1000L);
            long jM6417 = jFloorDiv + ((long) ((zoneIdM6585 == AbstractC3699.f9371 || zoneIdM6585.getRules() == AbstractC3699.f9370) ? AbstractC3699.m6417(jFloorDiv) : zoneIdM6585.getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds()));
            long jFloorDiv2 = Math.floorDiv(jM6417, 86400L);
            int iFloorMod = (int) Math.floorMod(jM6417, 86400L);
            long j3 = jFloorDiv2 + 719468;
            if (j3 < 0) {
                str = str2;
                long j4 = ((jFloorDiv2 + 719469) / 146097) - 1;
                j2 = j4 * 400;
                j3 += (-j4) * 146097;
            } else {
                str = str2;
                j2 = 0;
            }
            long j5 = ((j3 * 400) + 591) / 146097;
            long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
            if (j6 < 0) {
                j5--;
                j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
            }
            long j7 = j5 + j2;
            int i = (int) j6;
            int i2 = ((i * 5) + 2) / 153;
            int i3 = ((i2 + 2) % 12) + 1;
            int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
            z = z2;
            long j8 = j7 + ((long) (i2 / 10));
            if (j8 < -999999999 || j8 > 999999999) {
                throw new DateTimeException(AbstractC3275.m5143(j8, "Invalid year "));
            }
            int i5 = (int) j8;
            long j9 = iFloorMod;
            if (j9 < 0 || j9 > 86399) {
                throw new DateTimeException(AbstractC3275.m5143(j9, "Invalid secondOfDay "));
            }
            int i6 = (int) (j9 / 3600);
            long j10 = j9 - ((long) (i6 * 3600));
            int i7 = (int) (j10 / 60);
            int i8 = (int) (j10 - ((long) (i7 * 60)));
            if (i5 >= 0 && i5 <= 9999) {
                if (z4) {
                    m14637(abstractC3730);
                    abstractC3730.mo6541(i5, i3, i4, i6, i7, i8);
                    return;
                }
                if (z5) {
                    m14637(abstractC3730);
                    abstractC3730.mo6537(i5, i3, i4, i6, i7, i8);
                    return;
                }
                int iFloorMod2 = (int) Math.floorMod(j, 1000L);
                if (iFloorMod2 == 0) {
                    m14637(abstractC3730);
                    abstractC3730.mo6537(i5, i3, i4, i6, i7, i8);
                    return;
                } else {
                    int totalSeconds = c3728.m6585().getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds();
                    m14637(abstractC3730);
                    abstractC3730.mo6538(i5, i3, i4, i6, i7, i8, iFloorMod2, totalSeconds, false);
                    return;
                }
            }
        } else {
            z = z2;
            str = str2;
        }
        m14637(abstractC3730);
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), zoneIdM6585);
        boolean z6 = this.f23973;
        if (z6) {
            int year2 = zonedDateTimeOfInstant.getYear();
            if (year2 >= 0 && year2 <= 9999) {
                abstractC3730.mo6538(year2, zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
                return;
            } else {
                abstractC37302 = abstractC3730;
                zonedDateTime = zonedDateTimeOfInstant;
            }
        } else {
            zonedDateTime = zonedDateTimeOfInstant;
            abstractC37302 = abstractC3730;
        }
        if (this.f23972 && (year = zonedDateTime.getYear()) >= 0 && year <= 9999) {
            abstractC37302.mo6553(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth());
            return;
        }
        if (this.f23971 == null && str != null && !z3 && !z6 && !z) {
            this.f23971 = DateTimeFormatter.ofPattern(str);
        }
        DateTimeFormatter dateTimeFormatter = this.f23971;
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter == null ? null : dateTimeFormatter;
        if (dateTimeFormatter2 != null) {
            abstractC37302.mo6577(dateTimeFormatter2.format(zonedDateTime));
        } else {
            abstractC37302.mo6561(zonedDateTime);
        }
    }
}
