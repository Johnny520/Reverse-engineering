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
public final class FieldReaderLocalDateTime<T> extends FieldReaderDateTimeCodec<T> {
    final BiConsumer<T, ZonedDateTime> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderLocalDateTime(String str, Type type, Class cls, int i9, long j3, String str2, Locale locale, Object obj, Field field, Method method, BiConsumer<T, ZonedDateTime> biConsumer) {
        Locale locale2;
        ObjectReaderImplLocalDateTime objectReaderImplLocalDateTime;
        if (str2 != null) {
            locale2 = locale;
            objectReaderImplLocalDateTime = new ObjectReaderImplLocalDateTime(str2, locale2);
        } else {
            locale2 = locale;
            objectReaderImplLocalDateTime = ObjectReaderImplLocalDateTime.INSTANCE;
        }
        super(str, type, cls, i9, j3, str2, locale2, obj, method, field, objectReaderImplLocalDateTime);
        this.function = biConsumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(Object obj, LocalDateTime localDateTime) {
        if (obj == null) {
            C0086a.m464w(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error, object is null"));
            return;
        }
        if (localDateTime != null || (this.features & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            long j3 = this.fieldOffset;
            if (j3 != -1) {
                JDKUtils.UNSAFE.putObject(obj, j3, localDateTime);
                return;
            }
            try {
                this.field.set(obj, localDateTime);
            } catch (Exception e6) {
                C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void acceptNull(Object obj) {
        accept(obj, (LocalDateTime) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(Date date) {
        return date.toInstant().atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, Object obj) {
        boolean z9 = jSONReader.jsonb;
        ObjectReader objectReader = this.dateReader;
        accept(obj, z9 ? (LocalDateTime) objectReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features) : (LocalDateTime) objectReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec, com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(Class cls) {
        Class cls2 = this.fieldClass;
        return cls2 == Instant.class || cls2 == Long.class;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(LocalDateTime localDateTime) {
        return localDateTime;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(Instant instant) {
        return instant.atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime();
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(ZonedDateTime zonedDateTime) {
        return zonedDateTime.toLocalDateTime();
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(long j3) {
        return Instant.ofEpochMilli(j3).atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(Object obj, long j3) {
        accept(obj, (LocalDateTime) Instant.ofEpochMilli(j3).atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime());
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(Object obj, Date date) {
        accept(obj, (LocalDateTime) date.toInstant().atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime());
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(Object obj, Instant instant) {
        accept(obj, (LocalDateTime) instant.atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(Object obj, ZonedDateTime zonedDateTime) {
        accept(obj, (LocalDateTime) zonedDateTime.toLocalDateTime());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        super.accept(obj, obj2);
    }
}
