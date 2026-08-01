package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplClass extends ObjectReaderPrimitive {
    static final ObjectReaderImplClass INSTANCE = new ObjectReaderImplClass();
    static final long TYPE_HASH = Fnv.hashCode64("java.lang.Class");

    public ObjectReaderImplClass() {
        super(Class.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (!jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) || jSONReader.readTypeHashCode() == TYPE_HASH) {
            return readObject(jSONReader, type, obj, j10);
        }
        C1569c.m6258a(jSONReader.info("not support autoType : " + jSONReader.getString()));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        long j11;
        long valueHashCode = jSONReader.readValueHashCode();
        JSONReader.Context context = jSONReader.getContext();
        JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
        if (contextAutoTypeBeforeHandler != null) {
            j11 = j10;
            Class<?> clsApply = contextAutoTypeBeforeHandler.apply(valueHashCode, Class.class, j11);
            if (clsApply == null) {
                clsApply = contextAutoTypeBeforeHandler.apply(jSONReader.getString(), Class.class, j11);
            }
            if (clsApply != null) {
                return clsApply;
            }
        } else {
            j11 = j10;
        }
        String string = jSONReader.getString();
        if (((context.getFeatures() | j11) & JSONReader.Feature.SupportClassForName.mask) == 0) {
            C1569c.m6258a(jSONReader.info("not support ClassForName : " + string + ", you can config 'JSONReader.Feature.SupportClassForName'"));
            return null;
        }
        Class mapping = TypeUtils.getMapping(string);
        if (mapping != null) {
            return mapping;
        }
        Class<?> clsCheckAutoType = context.getProvider().checkAutoType(string, null, JSONReader.Feature.SupportAutoType.mask);
        if (clsCheckAutoType != null) {
            return clsCheckAutoType;
        }
        C1569c.m6258a(jSONReader.info("class not found " + string));
        return null;
    }
}
