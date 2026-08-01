package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.AbstractC2867;
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
import p278.AbstractC8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2741 extends AbstractC8364 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2741 f8378 = new C2741(null, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Date m5538(AbstractC2899 abstractC2899) {
        long jMo6209;
        long jM6204;
        LocalDateTime localDateTimeOf;
        boolean z;
        ZonedDateTime zonedDateTimeMo6241;
        long j;
        int i;
        boolean zMo6181 = abstractC2899.mo6181();
        C2943 c2943 = abstractC2899.f9201;
        boolean z2 = this.f23069;
        if (zMo6181) {
            long jMo62092 = abstractC2899.mo6209();
            if (z2) {
                jMo62092 *= 1000;
            }
            return new Date(jMo62092);
        }
        if (!abstractC2899.mo6119() && !abstractC2899.mo6151()) {
            if (abstractC2899.f9193 == 'n') {
                return abstractC2899.mo6193();
            }
            boolean z3 = this.f23075;
            Locale locale = this.f23079;
            String str = this.f23070;
            if (z3 || locale != null) {
                String strMo6184 = abstractC2899.mo6184();
                try {
                    return (locale != null ? new SimpleDateFormat(str, locale) : new SimpleDateFormat(str)).parse(strMo6184);
                } catch (ParseException e) {
                    C0276.m843(abstractC2899.mo6170("parse error : " + strMo6184), e);
                    return null;
                }
            }
            if ((z2 || this.f23068) && abstractC2899.mo6179()) {
                jMo6209 = abstractC2899.mo6209();
                if (z2) {
                    jMo6209 *= 1000;
                }
            } else if (str != null) {
                if (this.f23080) {
                    long jM62042 = (c2943.f9320 & 64) != 0 ? abstractC2899.m6204() : abstractC2899.mo6205();
                    if (jM62042 != 0 || !abstractC2899.f9196) {
                        return new Date(jM62042);
                    }
                    zonedDateTimeMo6241 = abstractC2899.mo6241();
                } else {
                    abstractC2899.m6107();
                    DateTimeFormatter dateTimeFormatterM13868 = m13868();
                    if (dateTimeFormatterM13868 != null) {
                        String strMo61842 = abstractC2899.mo6184();
                        if (!strMo61842.isEmpty() && !"null".equals(strMo61842)) {
                            if (str.indexOf(45) != -1 && strMo61842.indexOf(45) == -1 && AbstractC2867.m5939(strMo61842)) {
                                return new Date(Long.parseLong(strMo61842));
                            }
                            boolean z4 = this.f23076;
                            boolean z5 = this.f23066;
                            if (z4) {
                                if (strMo61842.length() == 19 && ((z = this.f23077) || abstractC2899.m6166(JSONReader$Feature.SupportSmartMatch) || "yyyy-MM-dd hh:mm:ss".equals(str))) {
                                    localDateTimeOf = AbstractC2866.m5849(z ? 16 : 19, strMo61842);
                                } else {
                                    localDateTimeOf = z5 ? LocalDateTime.parse(strMo61842, dateTimeFormatterM13868) : LocalDateTime.of(LocalDate.MIN, LocalTime.parse(strMo61842, dateTimeFormatterM13868));
                                }
                            } else if (!z5) {
                                TemporalAccessor temporalAccessor = dateTimeFormatterM13868.parse(strMo61842);
                                localDateTimeOf = LocalDateTime.of(LocalDate.of(temporalAccessor.get(ChronoField.YEAR), temporalAccessor.get(ChronoField.MONTH_OF_YEAR), 1), LocalTime.MIN);
                            } else if (strMo61842.length() == 19 && abstractC2899.m6166(JSONReader$Feature.SupportSmartMatch)) {
                                localDateTimeOf = AbstractC2866.m5849(strMo61842.length(), strMo61842);
                            } else {
                                localDateTimeOf = LocalDateTime.of((!this.f23072 || strMo61842.length() <= 10) ? LocalDate.parse(strMo61842, dateTimeFormatterM13868) : LocalDate.parse(strMo61842.substring(0, 10), dateTimeFormatterM13868), LocalTime.MIN);
                            }
                            zonedDateTimeMo6241 = localDateTimeOf.atZone(c2943.m6409());
                        }
                    } else {
                        zonedDateTimeMo6241 = abstractC2899.mo6241();
                    }
                }
                if (zonedDateTimeMo6241 != 0) {
                    long epochSecond = zonedDateTimeMo6241.toEpochSecond();
                    int nano = zonedDateTimeMo6241.toLocalTime().getNano();
                    if (epochSecond >= 0 || nano <= 0) {
                        j = epochSecond * 1000;
                        i = nano / 1000000;
                    } else {
                        j = (epochSecond + 1) * 1000;
                        i = (nano / 1000000) - 1000;
                    }
                    jM6204 = j + ((long) i);
                }
            } else {
                if (abstractC2899.mo6167()) {
                    return abstractC2899.mo6130();
                }
                if (abstractC2899.f9180 && abstractC2899.mo6136()) {
                    abstractC2899.mo6144(':');
                    long jMo62093 = abstractC2899.mo6209();
                    abstractC2899.mo6152();
                    abstractC2899.f9180 = false;
                    jM6204 = jMo62093;
                } else {
                    jM6204 = abstractC2899.m6204();
                }
                if (jM6204 != 0 || !abstractC2899.f9196) {
                    jMo6209 = z2 ? jM6204 * 1000 : jM6204;
                }
            }
            return new Date(jMo6209);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return m5538(abstractC2899);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return Date.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return m5538(abstractC2899);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5507(Map map, long j) {
        return AbstractC2867.m5919(map);
    }
}
