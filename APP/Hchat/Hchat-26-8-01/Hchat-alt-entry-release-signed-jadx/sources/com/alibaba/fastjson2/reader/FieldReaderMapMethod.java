package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderMapMethod<T> extends FieldReaderObject<T> {
    protected final BiConsumer arrayToMapDuplicateHandler;
    protected final String arrayToMapKey;
    protected final PropertyNamingStrategy namingStrategy;
    protected final Type valueType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderMapMethod(String str, Type type, Class cls, int i9, long j3, String str2, Locale locale, Object obj, Method method, Field field, BiConsumer biConsumer, String str3, BiConsumer biConsumer2) {
        super(str, type, cls, i9, j3, str2, locale, obj, method, field, biConsumer);
        this.valueType = TypeUtils.getMapValueType(type);
        this.arrayToMapKey = str3;
        this.namingStrategy = PropertyNamingStrategy.m1688of(str2);
        this.arrayToMapDuplicateHandler = biConsumer2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void acceptAny(T t9, Object obj, long j3) {
        if (this.arrayToMapKey == null || !(obj instanceof Collection)) {
            super.acceptAny(t9, obj, j3);
            return;
        }
        Map map = (Map) getObjectReader(JSONFactory.createReadContext()).createInstance(j3);
        FieldReaderObject.arrayToMap(map, (Collection) obj, this.arrayToMapKey, this.namingStrategy, JSONFactory.getObjectReader(this.valueType, j3 | this.features), this.arrayToMapDuplicateHandler);
        accept(t9, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        if (this.arrayToMapKey == null || !jSONReader.isArray()) {
            super.readFieldValue(jSONReader, t9);
            return;
        }
        Map map = (Map) getObjectReader(jSONReader).createInstance(this.features);
        FieldReaderObject.arrayToMap(map, jSONReader.readArray(this.valueType), this.arrayToMapKey, this.namingStrategy, JSONFactory.getObjectReader(this.valueType, this.features), this.arrayToMapDuplicateHandler);
        accept(t9, map);
    }
}
