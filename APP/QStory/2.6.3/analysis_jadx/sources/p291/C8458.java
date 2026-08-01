package p291;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8364;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8458 extends AbstractC8364 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8458 f23421 = new C8458(null, null);

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        abstractC2897.mo6029((Instant) obj);
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        long j2;
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        C2895 c2895 = abstractC2897.f9178;
        String str = this.f23070;
        if (str == null) {
            str = null;
        }
        Instant instant = (Instant) obj;
        if (str == null) {
            abstractC2897.mo6029(instant);
            return;
        }
        boolean z = this.f23072;
        boolean z2 = this.f23078;
        boolean z3 = this.f23080;
        if (!z2 && !z3 && !this.f23071 && !z) {
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(instant, c2895.m6025());
            if (this.f23069) {
                abstractC2897.mo5963(zonedDateTimeOfInstant.toInstant().toEpochMilli() / 1000);
                return;
            }
            if (this.f23068) {
                abstractC2897.mo5963(zonedDateTimeOfInstant.toInstant().toEpochMilli());
                return;
            }
            int year = zonedDateTimeOfInstant.getYear();
            if (year >= 0 && year <= 9999 && this.f23067) {
                abstractC2897.mo5978(year, zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
                return;
            }
            DateTimeFormatter dateTimeFormatterM13869 = m13869();
            DateTimeFormatter dateTimeFormatter = dateTimeFormatterM13869 != null ? dateTimeFormatterM13869 : null;
            if (dateTimeFormatter == null) {
                abstractC2897.mo6001(zonedDateTimeOfInstant);
                return;
            } else {
                abstractC2897.mo6017(dateTimeFormatter.format(zonedDateTimeOfInstant));
                return;
            }
        }
        ZoneId zoneIdM6025 = c2895.m6025();
        long epochSecond = instant.getEpochSecond();
        long jM5857 = epochSecond + ((long) ((zoneIdM6025 == AbstractC2866.f9026 || zoneIdM6025.getRules() == AbstractC2866.f9025) ? AbstractC2866.m5857(epochSecond) : zoneIdM6025.getRules().getOffset(instant).getTotalSeconds()));
        long jFloorDiv = Math.floorDiv(jM5857, 86400L);
        int iFloorMod = (int) Math.floorMod(jM5857, 86400L);
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
            throw new DateTimeException(AbstractC2442.m4583(j7, "Invalid year "));
        }
        int i5 = (int) j7;
        long j8 = iFloorMod;
        if (j8 < 0 || j8 > 86399) {
            throw new DateTimeException(AbstractC2442.m4583(j8, "Invalid secondOfDay "));
        }
        int i6 = (int) (j8 / 3600);
        long j9 = j8 - ((long) (i6 * 3600));
        int i7 = (int) (j9 / 60);
        int i8 = (int) (j9 - ((long) (i7 * 60)));
        if (z3) {
            abstractC2897.mo5977(i5, i3, i4, i6, i7, i8);
            return;
        }
        if (z2) {
            abstractC2897.mo5981(i5, i3, i4, i6, i7, i8);
        } else if (z) {
            abstractC2897.mo5992(i5, i3, i4);
        } else {
            abstractC2897.mo5993(i5, i3, i4);
        }
    }
}
