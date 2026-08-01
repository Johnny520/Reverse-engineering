package p291;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.util.AbstractC2865;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8363;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8466 extends AbstractC8363 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8466 f23430 = new C8466(null, null);

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        abstractC2896.mo5984((Instant) obj);
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        long j2;
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        C2894 c2894 = abstractC2896.f9176;
        String str = this.f23071;
        if (str == null) {
            str = null;
        }
        Instant instant = (Instant) obj;
        if (str == null) {
            abstractC2896.mo5984(instant);
            return;
        }
        boolean z = this.f23073;
        boolean z2 = this.f23079;
        boolean z3 = this.f23081;
        if (!z2 && !z3 && !this.f23072 && !z) {
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(instant, c2894.m5980());
            if (this.f23070) {
                abstractC2896.mo5918(zonedDateTimeOfInstant.toInstant().toEpochMilli() / 1000);
                return;
            }
            if (this.f23069) {
                abstractC2896.mo5918(zonedDateTimeOfInstant.toInstant().toEpochMilli());
                return;
            }
            int year = zonedDateTimeOfInstant.getYear();
            if (year >= 0 && year <= 9999 && this.f23068) {
                abstractC2896.mo5933(year, zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
                return;
            }
            DateTimeFormatter dateTimeFormatterM13852 = m13852();
            DateTimeFormatter dateTimeFormatter = dateTimeFormatterM13852 != null ? dateTimeFormatterM13852 : null;
            if (dateTimeFormatter == null) {
                abstractC2896.mo5956(zonedDateTimeOfInstant);
                return;
            } else {
                abstractC2896.mo5972(dateTimeFormatter.format(zonedDateTimeOfInstant));
                return;
            }
        }
        ZoneId zoneIdM5980 = c2894.m5980();
        long epochSecond = instant.getEpochSecond();
        long jM5812 = epochSecond + ((long) ((zoneIdM5980 == AbstractC2865.f9024 || zoneIdM5980.getRules() == AbstractC2865.f9023) ? AbstractC2865.m5812(epochSecond) : zoneIdM5980.getRules().getOffset(instant).getTotalSeconds()));
        long jFloorDiv = Math.floorDiv(jM5812, 86400L);
        int iFloorMod = (int) Math.floorMod(jM5812, 86400L);
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
            throw new DateTimeException(AbstractC2442.m4572(j7, "Invalid year "));
        }
        int i5 = (int) j7;
        long j8 = iFloorMod;
        if (j8 < 0 || j8 > 86399) {
            throw new DateTimeException(AbstractC2442.m4572(j8, "Invalid secondOfDay "));
        }
        int i6 = (int) (j8 / 3600);
        long j9 = j8 - ((long) (i6 * 3600));
        int i7 = (int) (j9 / 60);
        int i8 = (int) (j9 - ((long) (i7 * 60)));
        if (z3) {
            abstractC2896.mo5932(i5, i3, i4, i6, i7, i8);
            return;
        }
        if (z2) {
            abstractC2896.mo5936(i5, i3, i4, i6, i7, i8);
        } else if (z) {
            abstractC2896.mo5947(i5, i3, i4);
        } else {
            abstractC2896.mo5948(i5, i3, i4);
        }
    }
}
