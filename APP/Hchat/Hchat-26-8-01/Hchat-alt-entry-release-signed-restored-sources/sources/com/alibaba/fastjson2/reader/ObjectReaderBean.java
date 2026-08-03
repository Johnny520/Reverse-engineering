package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.filter.ExtraProcessor;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import p012ah.C0086a;
import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectReaderBean<T> implements ObjectReader<T> {
    protected JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler;
    protected final Function buildFunction;
    protected final Supplier<T> creator;
    protected final boolean disableSmartMatch;
    protected FieldReader extraFieldReader;
    protected final long features;
    protected boolean hasDefaultValue;
    protected final Class objectClass;
    protected final boolean serializable;
    protected String typeName;
    protected long typeNameHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderBean(Class cls, Supplier<T> supplier, String str, long j3, Function function) {
        this.objectClass = cls;
        this.creator = supplier;
        this.buildFunction = function;
        this.features = j3;
        this.typeName = str;
        this.typeNameHash = str != null ? Fnv.hashCode64(str) : 0L;
        this.serializable = cls != null && Serializable.class.isAssignableFrom(cls);
        this.disableSmartMatch = (j3 & FieldInfo.DISABLE_SMART_MATCH) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public void acceptExtra(Object obj, String str, Object obj2, long j3) {
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
            if ((j3 & JSONReader.Feature.ErrorOnUnknownProperties.mask) == 0) {
                return;
            }
            C0086a.m464w("Unknown Property ".concat(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final ObjectReader checkAutoType(JSONReader jSONReader, Class cls, long j3) {
        Class cls2;
        if (!jSONReader.nextIfMatchTypedAny()) {
            return null;
        }
        long typeHashCode = jSONReader.readTypeHashCode();
        JSONReader.Context context = jSONReader.context;
        long jFeatures = jSONReader.features(j3 | this.features);
        JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
        if (contextAutoTypeBeforeHandler != null) {
            Class<?> clsApply = contextAutoTypeBeforeHandler.apply(typeHashCode, (Class<?>) cls, j3);
            if (clsApply == null) {
                String string = jSONReader.getString();
                Class<?> clsApply2 = contextAutoTypeBeforeHandler.apply(string, (Class<?>) cls, j3);
                cls2 = clsApply2;
                if (clsApply2 != null) {
                    boolean zIsAssignableFrom = cls.isAssignableFrom(clsApply2);
                    cls2 = clsApply2;
                    if (!zIsAssignableFrom) {
                        if ((jSONReader.features(j3) & JSONReader.Feature.IgnoreAutoTypeNotMatch.mask) == 0) {
                            C0086a.m459r(AbstractC0255e.m1026o("type not match. ", string, " -> "), cls.getName());
                            return null;
                        }
                        cls2 = cls;
                    }
                }
            } else {
                cls2 = clsApply;
            }
            return context.getObjectReader(cls2);
        }
        ObjectReader objectReaderAutoType = jSONReader.getObjectReaderAutoType(typeHashCode, cls, j3);
        if (objectReaderAutoType == null) {
            C0086a.m464w(jSONReader.info("auotype not support"));
            return null;
        }
        Class<T> objectClass = objectReaderAutoType.getObjectClass();
        if (cls != null && objectClass != null && !cls.isAssignableFrom(objectClass)) {
            if ((JSONReader.Feature.IgnoreAutoTypeNotMatch.mask & jFeatures) != 0) {
                return context.getObjectReader(cls);
            }
            C0086a.m454m("type not match. ", this.typeName, " -> ", cls.getName());
            return null;
        }
        if (typeHashCode == getTypeNameHash()) {
            return this;
        }
        if ((JSONReader.Feature.SupportAutoType.mask & jFeatures) == 0) {
            return null;
        }
        return objectReaderAutoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONReader.AutoTypeBeforeHandler getAutoTypeBeforeHandler() {
        return this.autoTypeBeforeHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class<T> getObjectClass() {
        return this.objectClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getTypeName() {
        Class cls;
        if (this.typeName == null && (cls = this.objectClass) != null) {
            this.typeName = TypeUtils.getTypeName(cls);
        }
        return this.typeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getTypeNameHash() {
        String typeName;
        if (this.typeNameHash == 0 && (typeName = getTypeName()) != null) {
            this.typeNameHash = Fnv.hashCode64(typeName);
        }
        return this.typeNameHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void processExtra(JSONReader jSONReader, Object obj, long j3) {
        FieldReader fieldReaderLCase;
        Class cls;
        FieldReader fieldReader = this.extraFieldReader;
        if (fieldReader != null && obj != null) {
            fieldReader.processExtra(jSONReader, obj);
            return;
        }
        if ((jSONReader.features(this.features | j3) & JSONReader.Feature.SupportSmartMatch.mask) != 0) {
            String fieldName = jSONReader.getFieldName();
            if (fieldName.startsWith("is") && (fieldReaderLCase = getFieldReaderLCase(Fnv.hashCode64LCase(fieldName.substring(2)))) != null && obj != null && ((cls = fieldReaderLCase.fieldClass) == Boolean.class || cls == Boolean.TYPE)) {
                fieldReaderLCase.readFieldValue(jSONReader, obj);
                return;
            }
        }
        ExtraProcessor extraProcessor = jSONReader.context.extraProcessor;
        if (extraProcessor != null) {
            String fieldName2 = jSONReader.getFieldName();
            extraProcessor.processExtra(obj, fieldName2, jSONReader.read(extraProcessor.getType(fieldName2)));
        } else if ((jSONReader.features(j3) & JSONReader.Feature.ErrorOnUnknownProperties.mask) == 0) {
            jSONReader.skipValue();
        } else {
            C0086a.m450i(jSONReader.getFieldName(), "Unknown Property ");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T processObjectInputSingleItemArray(JSONReader jSONReader, Type type, Object obj, long j3) {
        String str = "expect {, but [, class " + this.typeName;
        if (obj != null) {
            str = str + ", parent fieldName " + obj;
        }
        String strInfo = jSONReader.info(str);
        if ((jSONReader.features(j3) & JSONReader.Feature.SupportSmartMatch.mask) != 0) {
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
        C0086a.m464w(strInfo);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean readFieldValueWithLCase(JSONReader jSONReader, Object obj, long j3, long j4) {
        FieldReader fieldReaderLCase;
        if (!jSONReader.isSupportSmartMatch(j4)) {
            return false;
        }
        long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
        if (nameHashCodeLCase == j3 || (fieldReaderLCase = getFieldReaderLCase(nameHashCodeLCase)) == null) {
            return false;
        }
        fieldReaderLCase.readFieldValue(jSONReader, obj);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0135  */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        T t9;
        long j4;
        long j5;
        ObjectReader objectReaderAutoType;
        String string;
        Class<?> clsApply;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j3);
        }
        if (jSONReader.nextIfNullOrEmptyString()) {
            jSONReader.nextIfComma();
            return null;
        }
        long jFeatures = jSONReader.features(getFeatures() | j3);
        long j10 = 0;
        if (jSONReader.isArray()) {
            return (JSONReader.Feature.SupportArrayToBean.mask & jFeatures) != 0 ? readArrayMappingObject(jSONReader, type, obj, j3) : processObjectInputSingleItemArray(jSONReader, type, obj, jFeatures);
        }
        if (!jSONReader.nextIfObjectStart()) {
            char cCurrent = jSONReader.current();
            if (cCurrent == 't' || cCurrent == 'f') {
                jSONReader.readBoolValue();
                return null;
            }
            if (cCurrent != '\"' && cCurrent != '\'' && cCurrent != '}') {
                C0086a.m464w(jSONReader.info());
                return null;
            }
        }
        int i9 = 0;
        T tCreateInstance = null;
        while (!jSONReader.nextIfObjectEnd()) {
            JSONReader.Context context = jSONReader.context;
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = this.autoTypeBeforeHandler;
            if (contextAutoTypeBeforeHandler == null) {
                contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
            }
            JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = contextAutoTypeBeforeHandler;
            if (i9 == 0 && fieldNameHashCode == getTypeKeyHash()) {
                t9 = tCreateInstance;
                long features = j3 | getFeatures() | context.features;
                if ((features & JSONReader.Feature.SupportAutoType.mask) != j10 || autoTypeBeforeHandler != null) {
                    long typeHashCode = jSONReader.readTypeHashCode();
                    if (autoTypeBeforeHandler != null) {
                        j4 = typeHashCode;
                        j5 = features;
                        if (autoTypeBeforeHandler.apply(typeHashCode, this.objectClass, features) == null && (clsApply = autoTypeBeforeHandler.apply(jSONReader.getString(), this.objectClass, j5)) != null) {
                            objectReaderAutoType = context.getObjectReader(clsApply);
                        }
                        if (objectReaderAutoType == null) {
                            objectReaderAutoType = autoType(context, j4);
                        }
                        if (objectReaderAutoType != null) {
                            String string2 = jSONReader.getString();
                            ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string2, this.objectClass, j5);
                            if (objectReaderAutoType2 == null) {
                                C0086a.m464w(jSONReader.info("No suitable ObjectReader found for" + string2));
                                return null;
                            }
                            string = string2;
                            objectReaderAutoType = objectReaderAutoType2;
                        } else {
                            string = null;
                        }
                        if (objectReaderAutoType == this) {
                            FieldReader fieldReader = objectReaderAutoType.getFieldReader(fieldNameHashCode);
                            if (fieldReader != null && string == null) {
                                string = jSONReader.getString();
                            }
                            String str = string;
                            T t10 = (T) objectReaderAutoType.readObject(jSONReader, null, null, j3 | getFeatures());
                            if (fieldReader != null) {
                                fieldReader.accept(t10, str);
                            }
                            return t10;
                        }
                        tCreateInstance = t9;
                    } else {
                        j4 = typeHashCode;
                        j5 = features;
                    }
                    objectReaderAutoType = null;
                    if (objectReaderAutoType == null) {
                    }
                    if (objectReaderAutoType != null) {
                    }
                    if (objectReaderAutoType == this) {
                    }
                }
                i9++;
                j10 = 0;
            } else {
                t9 = tCreateInstance;
            }
            FieldReader fieldReader2 = getFieldReader(fieldNameHashCode);
            if (fieldReader2 == null && jSONReader.isSupportSmartMatch(getFeatures() | j3)) {
                fieldReader2 = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
            }
            tCreateInstance = t9 == null ? createInstance(jSONReader.context.features | j3) : t9;
            if (fieldReader2 == null) {
                processExtra(jSONReader, tCreateInstance, j3);
            } else {
                fieldReader2.readFieldValue(jSONReader, tCreateInstance);
            }
            i9++;
            j10 = 0;
        }
        if (tCreateInstance == null && (tCreateInstance = createInstance(j3 | jSONReader.context.features)) != null && (JSONReader.Feature.InitStringFieldAsEmpty.mask & jFeatures) != j10) {
            initStringFieldAsEmpty(tCreateInstance);
        }
        jSONReader.nextIfComma();
        Function buildFunction = getBuildFunction();
        return buildFunction != null ? (T) buildFunction.apply(tCreateInstance) : tCreateInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAutoTypeBeforeHandler(JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler) {
        this.autoTypeBeforeHandler = autoTypeBeforeHandler;
    }

    public void initDefaultValue(T t9) {
    }

    public void initStringFieldAsEmpty(Object obj) {
    }

    public void processExtra(JSONReader jSONReader, Object obj) {
        processExtra(jSONReader, obj, 0L);
    }

    public void readObject(JSONReader jSONReader, Object obj, long j3) {
        if (jSONReader.nextIfNull()) {
            jSONReader.nextIfComma();
            return;
        }
        if (jSONReader.nextIfObjectStart()) {
            while (!jSONReader.nextIfObjectEnd()) {
                FieldReader fieldReader = getFieldReader(jSONReader.readFieldNameHashCode());
                if (fieldReader == null && jSONReader.isSupportSmartMatch(getFeatures() | j3)) {
                    fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                }
                if (fieldReader == null) {
                    processExtra(jSONReader, obj, j3);
                } else {
                    fieldReader.readFieldValue(jSONReader, obj);
                }
            }
            jSONReader.nextIfComma();
            return;
        }
        C0086a.m464w(jSONReader.info());
    }
}
