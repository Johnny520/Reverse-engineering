package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.function.BiConsumer;
import p012ah.C0086a;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderDate<T> extends FieldReaderDateTimeCodec<T> {
    final BiConsumer<T, Date> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderDate(String str, Type type, Class cls, int i9, long j3, String str2, Locale locale, Object obj, Field field, Method method, BiConsumer<T, Date> biConsumer) {
        super(str, type, cls, i9, j3, str2, locale, obj, method, field, ObjectReaderImplDate.m1711of(str2, locale));
        this.function = biConsumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t9, Date date) {
        BiConsumer<T, Date> biConsumer = this.function;
        if (biConsumer != null) {
            biConsumer.accept(t9, date);
            return;
        }
        if (t9 == null) {
            C0086a.m464w(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error, object is null"));
            return;
        }
        Method method = this.method;
        if (method != null) {
            try {
                method.invoke(t9, date);
                return;
            } catch (Exception e6) {
                C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
                return;
            }
        }
        long j3 = this.fieldOffset;
        if (j3 != -1) {
            JDKUtils.UNSAFE.putObject(t9, j3, date);
            return;
        }
        try {
            this.field.set(t9, date);
        } catch (Exception e7) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void acceptNull(T t9) {
        accept((Object) t9, (Date) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(LocalDateTime localDateTime) {
        return Date.from(localDateTime.toInstant(DateUtils.DEFAULT_ZONE_ID.getRules().getOffset(localDateTime)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) throws Exception {
        Date date;
        try {
            date = (Date) this.dateReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features);
        } catch (Exception e6) {
            if ((this.features & JSONReader.Feature.NullOnError.mask) == 0) {
                throw e6;
            }
            date = null;
        }
        accept((Object) t9, date);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(Date date) {
        return date;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(Instant instant) {
        return Date.from(instant);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(ZonedDateTime zonedDateTime) {
        return Date.from(zonedDateTime.toInstant());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(long j3) {
        return new Date(j3);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t9, Instant instant) {
        accept((Object) t9, Date.from(instant));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, long j3) {
        accept((Object) t9, new Date(j3));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t9, ZonedDateTime zonedDateTime) {
        accept((Object) t9, new Date(zonedDateTime.toInstant().toEpochMilli()));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t9, LocalDateTime localDateTime) {
        accept((Object) t9, Date.from(localDateTime.toInstant(DateUtils.DEFAULT_ZONE_ID.getRules().getOffset(localDateTime))));
    }
}
