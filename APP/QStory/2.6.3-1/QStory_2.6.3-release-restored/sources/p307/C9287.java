package p307;

import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.util.AbstractC3699;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p294.AbstractC9193;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9287 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9287 f23766 = new C9287(null, null);

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        abstractC3730.mo6589((Instant) obj);
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        long j2;
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        C3728 c3728 = abstractC3730.f9523;
        String str = this.f23415;
        if (str == null) {
            str = null;
        }
        Instant instant = (Instant) obj;
        if (str == null) {
            abstractC3730.mo6589(instant);
            return;
        }
        boolean z = this.f23417;
        boolean z2 = this.f23423;
        boolean z3 = this.f23425;
        if (!z2 && !z3 && !this.f23416 && !z) {
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(instant, c3728.m6585());
            if (this.f23414) {
                abstractC3730.mo6523(zonedDateTimeOfInstant.toInstant().toEpochMilli() / 1000);
                return;
            }
            if (this.f23413) {
                abstractC3730.mo6523(zonedDateTimeOfInstant.toInstant().toEpochMilli());
                return;
            }
            int year = zonedDateTimeOfInstant.getYear();
            if (year >= 0 && year <= 9999 && this.f23412) {
                abstractC3730.mo6538(year, zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
                return;
            }
            DateTimeFormatter dateTimeFormatterM14428 = m14428();
            DateTimeFormatter dateTimeFormatter = dateTimeFormatterM14428 != null ? dateTimeFormatterM14428 : null;
            if (dateTimeFormatter == null) {
                abstractC3730.mo6561(zonedDateTimeOfInstant);
                return;
            } else {
                abstractC3730.mo6577(dateTimeFormatter.format(zonedDateTimeOfInstant));
                return;
            }
        }
        ZoneId zoneIdM6585 = c3728.m6585();
        long epochSecond = instant.getEpochSecond();
        long jM6417 = epochSecond + ((long) ((zoneIdM6585 == AbstractC3699.f9371 || zoneIdM6585.getRules() == AbstractC3699.f9370) ? AbstractC3699.m6417(epochSecond) : zoneIdM6585.getRules().getOffset(instant).getTotalSeconds()));
        long jFloorDiv = Math.floorDiv(jM6417, 86400L);
        int iFloorMod = (int) Math.floorMod(jM6417, 86400L);
        long j3 = 719468 + jFloorDiv;
        if (j3 < 0) {
            long j4 = ((jFloorDiv + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        if (j7 < -999999999 || j7 > 999999999) {
            throw new DateTimeException(AbstractC3275.m5143(j7, "Invalid year "));
        }
        int i5 = (int) j7;
        long j8 = iFloorMod;
        if (j8 < 0 || j8 > 86399) {
            throw new DateTimeException(AbstractC3275.m5143(j8, "Invalid secondOfDay "));
        }
        int i6 = (int) (j8 / 3600);
        long j9 = j8 - ((long) (i6 * 3600));
        int i7 = (int) (j9 / 60);
        int i8 = (int) (j9 - ((long) (i7 * 60)));
        if (z3) {
            abstractC3730.mo6537(i5, i3, i4, i6, i7, i8);
            return;
        }
        if (z2) {
            abstractC3730.mo6541(i5, i3, i4, i6, i7, i8);
        } else if (z) {
            abstractC3730.mo6552(i5, i3, i4);
        } else {
            abstractC3730.mo6553(i5, i3, i4);
        }
    }
}
