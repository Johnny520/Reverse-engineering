package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.filter.ExtraProcessor;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectReaderBean<T> implements ObjectReader<T> {
    protected JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler;
    protected final Function buildFunction;
    protected final Supplier<T> creator;
    protected FieldReader extraFieldReader;
    protected final long features;
    protected boolean hasDefaultValue;
    protected final Class objectClass;
    protected final JSONSchema schema;
    protected final boolean serializable;
    protected final String typeName;
    protected final long typeNameHash;

    public ObjectReaderBean(Class cls, Supplier<T> supplier, String str, long j10, JSONSchema jSONSchema, Function function) {
        if (str == null && cls != null) {
            str = TypeUtils.getTypeName(cls);
        }
        this.objectClass = cls;
        this.creator = supplier;
        this.buildFunction = function;
        this.features = j10;
        this.typeName = str;
        this.typeNameHash = str != null ? Fnv.hashCode64(str) : 0L;
        this.schema = jSONSchema;
        this.serializable = cls != null && Serializable.class.isAssignableFrom(cls);
    }

    private JSONException auotypeError(JSONReader jSONReader) {
        return new JSONException(jSONReader.info("autoType not support"));
    }

    private JSONException notMatchError() {
        return new JSONException("type not match. " + this.typeName + " -> " + this.objectClass.getName());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public void acceptExtra(Object obj, String str, Object obj2, long j10) {
        FieldReader fieldReaderLCase;
        Class cls;
        FieldReader fieldReader = this.extraFieldReader;
        if (fieldReader != null && obj != null) {
            fieldReader.acceptExtra(obj, str, obj2);
            return;
        }
        if (str.startsWith("is") && (fieldReaderLCase = getFieldReaderLCase(Fnv.hashCode64LCase(str.substring(2)))) != null && ((cls = fieldReaderLCase.fieldClass) == Boolean.class || cls == Boolean.TYPE)) {
            fieldReaderLCase.accept(obj, obj2);
        } else {
            if ((j10 & JSONReader.Feature.ErrorOnUnknownProperties.mask) == 0) {
                return;
            }
            C1569c.m6258a("Unknown Property ".concat(str));
        }
    }

    public final ObjectReader checkAutoType(JSONReader jSONReader, long j10) {
        if (jSONReader.nextIfMatchTypedAny()) {
            return checkAutoType0(jSONReader, j10);
        }
        return null;
    }

    public final ObjectReader checkAutoType0(JSONReader jSONReader, long j10) {
        ObjectReader objectReaderAutoType;
        Class<?> cls = this.objectClass;
        long typeHashCode = jSONReader.readTypeHashCode();
        JSONReader.Context context = jSONReader.getContext();
        long jFeatures = jSONReader.features(this.features | j10);
        JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
        if (contextAutoTypeBeforeHandler != null) {
            Class<?> clsApply = contextAutoTypeBeforeHandler.apply(typeHashCode, cls, j10);
            if (clsApply != null || (clsApply = contextAutoTypeBeforeHandler.apply(jSONReader.getString(), cls, j10)) == null || cls.isAssignableFrom(clsApply)) {
                cls = clsApply;
            } else if ((jSONReader.features(j10) & JSONReader.Feature.IgnoreAutoTypeNotMatch.mask) == 0) {
                throw notMatchError();
            }
            objectReaderAutoType = context.getObjectReader(cls);
        } else {
            objectReaderAutoType = jSONReader.getObjectReaderAutoType(typeHashCode, cls, j10);
            if (objectReaderAutoType == null) {
                throw auotypeError(jSONReader);
            }
            Class<?> objectClass = objectReaderAutoType.getObjectClass();
            if (cls == null || objectClass == null || cls.isAssignableFrom(objectClass)) {
                if (typeHashCode == this.typeNameHash || (JSONReader.Feature.SupportAutoType.mask & jFeatures) == 0) {
                    objectReaderAutoType = null;
                }
            } else {
                if ((JSONReader.Feature.IgnoreAutoTypeNotMatch.mask & jFeatures) == 0) {
                    throw notMatchError();
                }
                objectReaderAutoType = context.getObjectReader(cls);
            }
        }
        if (objectReaderAutoType == this || (objectReaderAutoType != null && objectReaderAutoType.getObjectClass() == this.objectClass)) {
            return null;
        }
        return objectReaderAutoType;
    }

    public JSONReader.AutoTypeBeforeHandler getAutoTypeBeforeHandler() {
        return this.autoTypeBeforeHandler;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class<T> getObjectClass() {
        return this.objectClass;
    }

    public void processExtra(JSONReader jSONReader, Object obj, long j10) {
        FieldReader fieldReaderLCase;
        Class cls;
        if ((jSONReader.features(this.features | j10) & JSONReader.Feature.SupportSmartMatch.mask) != 0) {
            String fieldName = jSONReader.getFieldName();
            if (fieldName.startsWith("is") && (fieldReaderLCase = getFieldReaderLCase(Fnv.hashCode64LCase(fieldName.substring(2)))) != null && obj != null && ((cls = fieldReaderLCase.fieldClass) == Boolean.class || cls == Boolean.TYPE)) {
                fieldReaderLCase.readFieldValue(jSONReader, obj);
                return;
            }
        }
        FieldReader fieldReader = this.extraFieldReader;
        if (fieldReader != null && obj != null) {
            fieldReader.processExtra(jSONReader, obj);
            return;
        }
        ExtraProcessor extraProcessor = jSONReader.getContext().getExtraProcessor();
        if (extraProcessor != null) {
            String fieldName2 = jSONReader.getFieldName();
            extraProcessor.processExtra(obj, fieldName2, jSONReader.read(extraProcessor.getType(fieldName2)));
        } else if ((jSONReader.features(j10) & JSONReader.Feature.ErrorOnUnknownProperties.mask) == 0) {
            jSONReader.skipValue();
        } else {
            C1607k.m6296a("Unknown Property ", jSONReader.getFieldName());
        }
    }

    public T processObjectInputSingleItemArray(JSONReader jSONReader, Type type, Object obj, long j10) {
        String str = "expect {, but [, class " + this.typeName;
        if (obj != null) {
            str = str + ", parent fieldName " + obj;
        }
        String strInfo = jSONReader.info(str);
        if ((jSONReader.features(j10) & JSONReader.Feature.SupportSmartMatch.mask) != 0) {
            if (type == null) {
                type = this.objectClass;
            }
            List array = jSONReader.readArray(type);
            if (array != null) {
                if (array.size() == 0) {
                    return null;
                }
                if (array.size() == 1) {
                    return (T) array.get(0);
                }
            }
        }
        C1569c.m6258a(strInfo);
        return null;
    }

    public boolean readFieldValueWithLCase(JSONReader jSONReader, Object obj, long j10, long j11) {
        FieldReader fieldReaderLCase;
        if (!jSONReader.isSupportSmartMatch(j11)) {
            return false;
        }
        long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
        if (nameHashCodeLCase == j10 || (fieldReaderLCase = getFieldReaderLCase(nameHashCodeLCase)) == null) {
            return false;
        }
        fieldReaderLCase.readFieldValue(jSONReader, obj);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T readObject(com.alibaba.fastjson2.JSONReader r20, java.lang.reflect.Type r21, java.lang.Object r22, long r23) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderBean.readObject(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    public void setAutoTypeBeforeHandler(JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler) {
        this.autoTypeBeforeHandler = autoTypeBeforeHandler;
    }

    @Deprecated
    public final ObjectReader checkAutoType(JSONReader jSONReader, Class cls, long j10) {
        return checkAutoType(jSONReader, j10);
    }

    public void initDefaultValue(T t10) {
    }

    public void initStringFieldAsEmpty(Object obj) {
    }

    public void processExtra(JSONReader jSONReader, Object obj) {
        processExtra(jSONReader, obj, 0L);
    }

    public void readObject(JSONReader jSONReader, Object obj, long j10) {
        if (jSONReader.nextIfNull()) {
            jSONReader.nextIfComma();
            return;
        }
        if (jSONReader.nextIfObjectStart()) {
            while (!jSONReader.nextIfObjectEnd()) {
                FieldReader fieldReader = getFieldReader(jSONReader.readFieldNameHashCode());
                if (fieldReader == null && jSONReader.isSupportSmartMatch(getFeatures() | j10)) {
                    fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                }
                if (fieldReader == null) {
                    processExtra(jSONReader, obj);
                } else {
                    fieldReader.readFieldValue(jSONReader, obj);
                }
            }
            jSONReader.nextIfComma();
            JSONSchema jSONSchema = this.schema;
            if (jSONSchema != null) {
                jSONSchema.assertValidate(obj);
                return;
            }
            return;
        }
        C1569c.m6258a(jSONReader.info());
    }
}
