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
public class FieldReaderZonedDateTime<T> extends FieldReaderDateTimeCodec<T> {
    final BiConsumer<T, ZonedDateTime> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderZonedDateTime(String str, Type type, Class cls, int i9, long j3, String str2, Locale locale, Object obj, Field field, Method method, BiConsumer<T, ZonedDateTime> biConsumer) {
        super(str, type, cls, i9, j3, str2, locale, obj, method, field, ObjectReaderImplZonedDateTime.m1742of(str2, locale));
        this.function = biConsumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t9, ZonedDateTime zonedDateTime) {
        if (zonedDateTime != null || (this.features & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            if (t9 == null) {
                C0086a.m464w(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error, object is null"));
                return;
            }
            BiConsumer<T, ZonedDateTime> biConsumer = this.function;
            if (biConsumer != null) {
                biConsumer.accept(t9, zonedDateTime);
                return;
            }
            Method method = this.method;
            if (method != null) {
                try {
                    method.invoke(t9, zonedDateTime);
                    return;
                } catch (Exception e6) {
                    C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
                    return;
                }
            }
            long j3 = this.fieldOffset;
            if (j3 != -1) {
                JDKUtils.UNSAFE.putObject(t9, j3, zonedDateTime);
                return;
            }
            try {
                this.field.set(t9, zonedDateTime);
            } catch (Exception e7) {
                C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void acceptNull(T t9) {
        accept((Object) t9, (ZonedDateTime) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(Date date) {
        return ZonedDateTime.ofInstant(date.toInstant(), DateUtils.DEFAULT_ZONE_ID);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final void readFieldValue(JSONReader jSONReader, T t9) {
        accept((Object) t9, (ZonedDateTime) this.dateReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final void readFieldValueJSONB(JSONReader jSONReader, T t9) {
        accept((Object) t9, jSONReader.readZonedDateTime());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ boolean supportAcceptType(Class cls) {
        return super.supportAcceptType(cls);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(ZonedDateTime zonedDateTime) {
        return zonedDateTime;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(Instant instant) {
        return ZonedDateTime.ofInstant(instant, DateUtils.DEFAULT_ZONE_ID);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(long j3) {
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(j3), DateUtils.DEFAULT_ZONE_ID);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(LocalDateTime localDateTime) {
        return localDateTime.atZone(DateUtils.DEFAULT_ZONE_ID);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t9, Date date) {
        accept((Object) t9, ZonedDateTime.ofInstant(date.toInstant(), DateUtils.DEFAULT_ZONE_ID));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t9, Instant instant) {
        accept((Object) t9, ZonedDateTime.ofInstant(instant, DateUtils.DEFAULT_ZONE_ID));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t9, LocalDateTime localDateTime) {
        accept((Object) t9, ZonedDateTime.of(localDateTime, DateUtils.DEFAULT_ZONE_ID));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, long j3) {
        accept((Object) t9, ZonedDateTime.ofInstant(Instant.ofEpochMilli(j3), DateUtils.DEFAULT_ZONE_ID));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        super.accept(obj, obj2);
    }
}
