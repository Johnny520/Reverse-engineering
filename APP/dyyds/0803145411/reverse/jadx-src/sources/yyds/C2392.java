package yyds;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲇᛲᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2392 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final List f11806;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f11807;

    public C2392(String[] strArr, int i) {
        this.f11807 = i;
        this.f11806 = Arrays.asList(strArr);
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) throws IOException {
        if (c1942.m3744() == 9) {
            c1942.m3767();
            return null;
        }
        c1942.m3769();
        List list = this.f11806;
        long[] jArr = new long[list.size()];
        while (c1942.m3744() != 4) {
            int iIndexOf = list.indexOf(c1942.m3741());
            if (iIndexOf >= 0) {
                jArr[iIndexOf] = c1942.m3743();
            } else {
                c1942.m3754();
            }
        }
        c1942.m3768();
        switch (this.f11807) {
            case 0:
                return Year.of(Math.toIntExact(jArr[0]));
            case 1:
                return YearMonth.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
            case 2:
                return Duration.ofSeconds(jArr[0], jArr[1]);
            case 3:
                return Instant.ofEpochSecond(jArr[0], jArr[1]);
            case 4:
                return LocalDate.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
            case 5:
                return LocalTime.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]), Math.toIntExact(jArr[3]));
            case 6:
                return MonthDay.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
            case 7:
                return Period.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
            default:
                return new GregorianCalendar(AbstractC0193.m818(jArr[0]), AbstractC0193.m818(jArr[1]), AbstractC0193.m818(jArr[2]), AbstractC0193.m818(jArr[3]), AbstractC0193.m818(jArr[4]), AbstractC0193.m818(jArr[5]));
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) throws IOException {
        int i;
        long[] jArr;
        long[] jArr2;
        if (obj == null) {
            c1405.m2857();
            return;
        }
        c1405.m2858();
        switch (this.f11807) {
            case 0:
                i = 0;
                jArr = new long[]{((Year) obj).getValue()};
                jArr2 = jArr;
                break;
            case 1:
                i = 0;
                YearMonth yearMonth = (YearMonth) obj;
                jArr2 = new long[]{yearMonth.getYear(), yearMonth.getMonthValue()};
                break;
            case 2:
                i = 0;
                jArr2 = new long[]{((Duration) obj).getSeconds(), r2.getNano()};
                break;
            case 3:
                i = 0;
                jArr2 = new long[]{((Instant) obj).getEpochSecond(), r2.getNano()};
                break;
            case 4:
                i = 0;
                LocalDate localDate = (LocalDate) obj;
                jArr = new long[]{localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth()};
                jArr2 = jArr;
                break;
            case 5:
                i = 0;
                LocalTime localTime = (LocalTime) obj;
                jArr2 = new long[]{localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNano()};
                break;
            case 6:
                i = 0;
                MonthDay monthDay = (MonthDay) obj;
                jArr2 = new long[]{monthDay.getMonthValue(), monthDay.getDayOfMonth()};
                break;
            case 7:
                i = 0;
                Period period = (Period) obj;
                jArr = new long[]{period.getYears(), period.getMonths(), period.getDays()};
                jArr2 = jArr;
                break;
            default:
                Calendar calendar = (Calendar) obj;
                i = 0;
                jArr2 = new long[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
                break;
        }
        int i2 = i;
        while (true) {
            List list = this.f11806;
            if (i2 >= list.size()) {
                c1405.m2865();
                return;
            } else {
                c1405.m2856((String) list.get(i2));
                c1405.m2861(jArr2[i2]);
                i2++;
            }
        }
    }
}
