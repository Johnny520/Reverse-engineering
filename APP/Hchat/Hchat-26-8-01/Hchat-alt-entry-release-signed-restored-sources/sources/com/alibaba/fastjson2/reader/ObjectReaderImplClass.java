package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplClass extends ObjectReaderPrimitive {
    static final ObjectReaderImplClass INSTANCE = new ObjectReaderImplClass();
    static final long TYPE_HASH = Fnv.hashCode64("java.lang.Class");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplClass() {
        super(Class.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (!jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) || jSONReader.readTypeHashCode() == TYPE_HASH) {
            return readObject(jSONReader, type, obj, j3);
        }
        C0086a.m464w(jSONReader.info("not support autoType : " + jSONReader.getString()));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        long j4;
        long valueHashCode = jSONReader.readValueHashCode();
        JSONReader.Context context = jSONReader.context;
        JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
        if (contextAutoTypeBeforeHandler != null) {
            j4 = j3;
            Class<?> clsApply = contextAutoTypeBeforeHandler.apply(valueHashCode, Class.class, j4);
            if (clsApply == null) {
                clsApply = contextAutoTypeBeforeHandler.apply(jSONReader.getString(), Class.class, j4);
            }
            if (clsApply != null) {
                return clsApply;
            }
        } else {
            j4 = j3;
        }
        String string = jSONReader.getString();
        if (((context.features | j4) & JSONReader.Feature.SupportClassForName.mask) == 0) {
            C0086a.m464w(jSONReader.info("not support ClassForName : " + string + ", you can config 'JSONReader.Feature.SupportClassForName'"));
            return null;
        }
        Class mapping = TypeUtils.getMapping(string);
        if (mapping != null) {
            return mapping;
        }
        Class<?> clsCheckAutoType = context.provider.checkAutoType(string, null, JSONReader.Feature.SupportAutoType.mask);
        if (clsCheckAutoType != null) {
            return clsCheckAutoType;
        }
        C0086a.m464w(jSONReader.info("class not found " + string));
        return null;
    }
}
