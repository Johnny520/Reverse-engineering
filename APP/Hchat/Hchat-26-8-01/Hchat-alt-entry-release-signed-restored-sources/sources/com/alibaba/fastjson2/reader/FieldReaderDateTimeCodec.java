package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.IOUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldReaderDateTimeCodec<T> extends FieldReader<T> {
    final ObjectReader dateReader;
    final boolean formatMillis;
    final boolean formatUnixTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FieldReaderDateTimeCodec(String str, Type type, Class cls, int i9, long j3, String str2, Locale locale, Object obj, Method method, Field field, ObjectReader objectReader) {
        boolean z9;
        super(str, type, cls, i9, j3, str2, locale, obj, method, field);
        this.dateReader = objectReader;
        boolean z10 = false;
        if (str2 != null) {
            z9 = true;
            if (!str2.equals("millis")) {
                if (str2.equals("unixtime")) {
                    z9 = false;
                    z10 = true;
                } else {
                    z9 = false;
                }
            }
        }
        this.formatUnixTime = z10;
        this.formatMillis = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        if (obj == null) {
            acceptNull(t9);
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                acceptNull(t9);
                return;
            }
            if ((this.format == null || this.formatUnixTime || this.formatMillis) && IOUtils.isNumber(str)) {
                long j3 = Long.parseLong(str);
                if (this.formatUnixTime) {
                    j3 *= 1000;
                }
                accept((Object) t9, j3);
                return;
            }
            obj = DateUtils.parseDate(str, this.format, DateUtils.DEFAULT_ZONE_ID);
        }
        if (obj instanceof Date) {
            accept((Object) t9, (Date) obj);
            return;
        }
        if (obj instanceof Instant) {
            accept((Object) t9, (Instant) obj);
            return;
        }
        if (obj instanceof Long) {
            accept((Object) t9, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof LocalDateTime) {
            accept((Object) t9, (LocalDateTime) obj);
        } else if (obj instanceof ZonedDateTime) {
            accept((Object) t9, (ZonedDateTime) obj);
        } else {
            C0086a.m450i(obj.getClass(), "not support value ");
        }
    }

    public abstract void accept(T t9, Instant instant);

    public abstract void accept(T t9, LocalDateTime localDateTime);

    public abstract void accept(T t9, ZonedDateTime zonedDateTime);

    public abstract void accept(T t9, Date date);

    public abstract void acceptNull(T t9);

    public abstract Object apply(long j3);

    public abstract Object apply(Instant instant);

    public abstract Object apply(LocalDateTime localDateTime);

    public abstract Object apply(ZonedDateTime zonedDateTime);

    public abstract Object apply(Date date);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final ObjectReader getObjectReader(JSONReader jSONReader) {
        return this.dateReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final Object readFieldValue(JSONReader jSONReader) {
        return this.dateReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(Class cls) {
        return cls == Date.class || cls == String.class;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final ObjectReader getObjectReader(JSONReader.Context context) {
        return this.dateReader;
    }
}
