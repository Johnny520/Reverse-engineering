package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3699;
import com.alibaba.fastjson2.util.AbstractC3700;
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
import p294.AbstractC9193;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3574 extends AbstractC9193 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C3574 f8723 = new C3574(null, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Date m6098(AbstractC3732 abstractC3732) {
        long jMo6769;
        long jM6764;
        LocalDateTime localDateTimeOf;
        boolean z;
        ZonedDateTime zonedDateTimeMo6801;
        long j;
        int i;
        boolean zMo6741 = abstractC3732.mo6741();
        C3776 c3776 = abstractC3732.f9546;
        boolean z2 = this.f23414;
        if (zMo6741) {
            long jMo67692 = abstractC3732.mo6769();
            if (z2) {
                jMo67692 *= 1000;
            }
            return new Date(jMo67692);
        }
        if (!abstractC3732.mo6679() && !abstractC3732.mo6711()) {
            if (abstractC3732.f9538 == 'n') {
                return abstractC3732.mo6753();
            }
            boolean z3 = this.f23420;
            Locale locale = this.f23424;
            String str = this.f23415;
            if (z3 || locale != null) {
                String strMo6744 = abstractC3732.mo6744();
                try {
                    return (locale != null ? new SimpleDateFormat(str, locale) : new SimpleDateFormat(str)).parse(strMo6744);
                } catch (ParseException e) {
                    C1123.m1403(abstractC3732.mo6730("parse error : " + strMo6744), e);
                    return null;
                }
            }
            if ((z2 || this.f23413) && abstractC3732.mo6739()) {
                jMo6769 = abstractC3732.mo6769();
                if (z2) {
                    jMo6769 *= 1000;
                }
            } else if (str != null) {
                if (this.f23425) {
                    long jM67642 = (c3776.f9665 & 64) != 0 ? abstractC3732.m6764() : abstractC3732.mo6765();
                    if (jM67642 != 0 || !abstractC3732.f9541) {
                        return new Date(jM67642);
                    }
                    zonedDateTimeMo6801 = abstractC3732.mo6801();
                } else {
                    abstractC3732.m6667();
                    DateTimeFormatter dateTimeFormatterM14427 = m14427();
                    if (dateTimeFormatterM14427 != null) {
                        String strMo67442 = abstractC3732.mo6744();
                        if (!strMo67442.isEmpty() && !"null".equals(strMo67442)) {
                            if (str.indexOf(45) != -1 && strMo67442.indexOf(45) == -1 && AbstractC3700.m6499(strMo67442)) {
                                return new Date(Long.parseLong(strMo67442));
                            }
                            boolean z4 = this.f23421;
                            boolean z5 = this.f23411;
                            if (z4) {
                                if (strMo67442.length() == 19 && ((z = this.f23422) || abstractC3732.m6726(JSONReader$Feature.SupportSmartMatch) || "yyyy-MM-dd hh:mm:ss".equals(str))) {
                                    localDateTimeOf = AbstractC3699.m6409(z ? 16 : 19, strMo67442);
                                } else {
                                    localDateTimeOf = z5 ? LocalDateTime.parse(strMo67442, dateTimeFormatterM14427) : LocalDateTime.of(LocalDate.MIN, LocalTime.parse(strMo67442, dateTimeFormatterM14427));
                                }
                            } else if (!z5) {
                                TemporalAccessor temporalAccessor = dateTimeFormatterM14427.parse(strMo67442);
                                localDateTimeOf = LocalDateTime.of(LocalDate.of(temporalAccessor.get(ChronoField.YEAR), temporalAccessor.get(ChronoField.MONTH_OF_YEAR), 1), LocalTime.MIN);
                            } else if (strMo67442.length() == 19 && abstractC3732.m6726(JSONReader$Feature.SupportSmartMatch)) {
                                localDateTimeOf = AbstractC3699.m6409(strMo67442.length(), strMo67442);
                            } else {
                                localDateTimeOf = LocalDateTime.of((!this.f23417 || strMo67442.length() <= 10) ? LocalDate.parse(strMo67442, dateTimeFormatterM14427) : LocalDate.parse(strMo67442.substring(0, 10), dateTimeFormatterM14427), LocalTime.MIN);
                            }
                            zonedDateTimeMo6801 = localDateTimeOf.atZone(c3776.m6969());
                        }
                    } else {
                        zonedDateTimeMo6801 = abstractC3732.mo6801();
                    }
                }
                if (zonedDateTimeMo6801 != 0) {
                    long epochSecond = zonedDateTimeMo6801.toEpochSecond();
                    int nano = zonedDateTimeMo6801.toLocalTime().getNano();
                    if (epochSecond >= 0 || nano <= 0) {
                        j = epochSecond * 1000;
                        i = nano / 1000000;
                    } else {
                        j = (epochSecond + 1) * 1000;
                        i = (nano / 1000000) - 1000;
                    }
                    jM6764 = j + ((long) i);
                }
            } else {
                if (abstractC3732.mo6727()) {
                    return abstractC3732.mo6690();
                }
                if (abstractC3732.f9525 && abstractC3732.mo6696()) {
                    abstractC3732.mo6704(':');
                    long jMo67693 = abstractC3732.mo6769();
                    abstractC3732.mo6712();
                    abstractC3732.f9525 = false;
                    jM6764 = jMo67693;
                } else {
                    jM6764 = abstractC3732.m6764();
                }
                if (jM6764 != 0 || !abstractC3732.f9541) {
                    jMo6769 = z2 ? jM6764 * 1000 : jM6764;
                }
            }
            return new Date(jMo6769);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return m6098(abstractC3732);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return Date.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return m6098(abstractC3732);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo6067(Map map, long j) {
        return AbstractC3700.m6479(map);
    }
}
