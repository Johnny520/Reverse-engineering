package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p278.AbstractC8363;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2740 extends AbstractC8363 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2740 f8376 = new C2740(null, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Date m5493(AbstractC2898 abstractC2898) {
        long jMo6164;
        long jM6159;
        LocalDateTime localDateTimeOf;
        boolean z;
        ZonedDateTime zonedDateTimeMo6196;
        long j;
        int i;
        boolean zMo6135 = abstractC2898.mo6135();
        C2942 c2942 = abstractC2898.f9199;
        boolean z2 = this.f23070;
        if (zMo6135) {
            long jMo61642 = abstractC2898.mo6164();
            if (z2) {
                jMo61642 *= 1000;
            }
            return new Date(jMo61642);
        }
        if (!abstractC2898.mo6073() && !abstractC2898.mo6105()) {
            if (abstractC2898.f9191 == 'n') {
                return abstractC2898.mo6148();
            }
            boolean z3 = this.f23076;
            Locale locale = this.f23080;
            String str = this.f23071;
            if (z3 || locale != null) {
                String strMo6139 = abstractC2898.mo6139();
                try {
                    return (locale != null ? new SimpleDateFormat(str, locale) : new SimpleDateFormat(str)).parse(strMo6139);
                } catch (ParseException e) {
                    C0276.m842(abstractC2898.mo6124("parse error : " + strMo6139), e);
                    return null;
                }
            }
            if ((z2 || this.f23069) && abstractC2898.mo6133()) {
                jMo6164 = abstractC2898.mo6164();
                if (z2) {
                    jMo6164 *= 1000;
                }
            } else if (str != null) {
                if (this.f23081) {
                    long jM61592 = (c2942.f9318 & 64) != 0 ? abstractC2898.m6159() : abstractC2898.mo6160();
                    if (jM61592 != 0 || !abstractC2898.f9194) {
                        return new Date(jM61592);
                    }
                    zonedDateTimeMo6196 = abstractC2898.mo6196();
                } else {
                    abstractC2898.m6061();
                    DateTimeFormatter dateTimeFormatterM13851 = m13851();
                    if (dateTimeFormatterM13851 != null) {
                        String strMo61392 = abstractC2898.mo6139();
                        if (!strMo61392.isEmpty() && !"null".equals(strMo61392)) {
                            if (str.indexOf(45) != -1 && strMo61392.indexOf(45) == -1 && AbstractC2866.m5894(strMo61392)) {
                                return new Date(Long.parseLong(strMo61392));
                            }
                            boolean z4 = this.f23077;
                            boolean z5 = this.f23067;
                            if (z4) {
                                if (strMo61392.length() == 19 && ((z = this.f23078) || abstractC2898.m6120(JSONReader$Feature.SupportSmartMatch) || "yyyy-MM-dd hh:mm:ss".equals(str))) {
                                    localDateTimeOf = AbstractC2865.m5804(z ? 16 : 19, strMo61392);
                                } else {
                                    localDateTimeOf = z5 ? LocalDateTime.parse(strMo61392, dateTimeFormatterM13851) : LocalDateTime.of(LocalDate.MIN, LocalTime.parse(strMo61392, dateTimeFormatterM13851));
                                }
                            } else if (!z5) {
                                TemporalAccessor temporalAccessor = dateTimeFormatterM13851.parse(strMo61392);
                                localDateTimeOf = LocalDateTime.of(LocalDate.of(temporalAccessor.get(ChronoField.YEAR), temporalAccessor.get(ChronoField.MONTH_OF_YEAR), 1), LocalTime.MIN);
                            } else if (strMo61392.length() == 19 && abstractC2898.m6120(JSONReader$Feature.SupportSmartMatch)) {
                                localDateTimeOf = AbstractC2865.m5804(strMo61392.length(), strMo61392);
                            } else {
                                localDateTimeOf = LocalDateTime.of((!this.f23073 || strMo61392.length() <= 10) ? LocalDate.parse(strMo61392, dateTimeFormatterM13851) : LocalDate.parse(strMo61392.substring(0, 10), dateTimeFormatterM13851), LocalTime.MIN);
                            }
                            zonedDateTimeMo6196 = localDateTimeOf.atZone(c2942.m6351());
                        }
                    } else {
                        zonedDateTimeMo6196 = abstractC2898.mo6196();
                    }
                }
                if (zonedDateTimeMo6196 != 0) {
                    long epochSecond = zonedDateTimeMo6196.toEpochSecond();
                    int nano = zonedDateTimeMo6196.toLocalTime().getNano();
                    if (epochSecond >= 0 || nano <= 0) {
                        j = epochSecond * 1000;
                        i = nano / 1000000;
                    } else {
                        j = (epochSecond + 1) * 1000;
                        i = (nano / 1000000) - 1000;
                    }
                    jM6159 = j + ((long) i);
                }
            } else {
                if (abstractC2898.mo6121()) {
                    return abstractC2898.mo6084();
                }
                if (abstractC2898.f9178 && abstractC2898.mo6090()) {
                    abstractC2898.mo6098(':');
                    long jMo61643 = abstractC2898.mo6164();
                    abstractC2898.mo6106();
                    abstractC2898.f9178 = false;
                    jM6159 = jMo61643;
                } else {
                    jM6159 = abstractC2898.m6159();
                }
                if (jM6159 != 0 || !abstractC2898.f9194) {
                    jMo6164 = z2 ? jM6159 * 1000 : jM6159;
                }
            }
            return new Date(jMo6164);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return m5493(abstractC2898);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return Date.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return m5493(abstractC2898);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5462(Map map, long j) {
        return AbstractC2866.m5874(map);
    }
}
