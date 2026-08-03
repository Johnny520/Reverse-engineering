package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.function.Supplier;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReader2<T> extends ObjectReaderAdapter<T> {
    protected final FieldReader fieldReader0;
    protected final FieldReader fieldReader1;
    protected final long hashCode0;
    protected final long hashCode0LCase;
    protected final long hashCode1;
    protected final long hashCode1LCase;
    protected ObjectReader objectReader0;
    protected ObjectReader objectReader1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader2(Class cls, String str, String str2, long j3, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        super(cls, str, str2, j3, supplier, function, null, null, null, fieldReaderArr);
        FieldReader fieldReader = fieldReaderArr[0];
        this.fieldReader0 = fieldReader;
        FieldReader fieldReader2 = fieldReaderArr[1];
        this.fieldReader1 = fieldReader2;
        this.hashCode0 = fieldReader.fieldNameHash;
        this.hashCode0LCase = fieldReader.fieldNameHashLCase;
        this.hashCode1 = fieldReader2.fieldNameHash;
        this.hashCode1LCase = fieldReader2.fieldNameHashLCase;
        this.hasDefaultValue = (fieldReader.defaultValue == null && fieldReader2.defaultValue == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReader(long j3) {
        if (j3 == this.hashCode0) {
            return this.fieldReader0;
        }
        if (j3 == this.hashCode1) {
            return this.fieldReader1;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReaderLCase(long j3) {
        if (j3 == this.hashCode0LCase) {
            return this.fieldReader0;
        }
        if (j3 == this.hashCode1LCase) {
            return this.fieldReader1;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T t9) {
        this.fieldReader0.acceptDefaultValue(t9);
        this.fieldReader1.acceptDefaultValue(t9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        ObjectReader objectReaderCheckAutoType = checkAutoType(jSONReader, this.objectClass, this.features | j3);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType != this && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readArrayMappingJSONBObject(jSONReader, type, obj, j3);
        }
        T t9 = this.creator.get();
        int iStartArray = jSONReader.startArray();
        if (iStartArray > 0) {
            this.fieldReader0.readFieldValue(jSONReader, t9);
            if (iStartArray > 1) {
                this.fieldReader1.readFieldValue(jSONReader, t9);
                for (int i9 = 2; i9 < iStartArray; i9++) {
                    jSONReader.skipValue();
                }
            }
        }
        Function function = this.buildFunction;
        return function != null ? (T) function.apply(t9) : t9;
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
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        T t9;
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, getTypeNameHash(), this.features | j3);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j3);
        }
        if (jSONReader.isArray()) {
            T t10 = this.creator.get();
            if (this.hasDefaultValue) {
                initDefaultValue(t10);
            }
            int iStartArray = jSONReader.startArray();
            if (iStartArray > 0) {
                this.fieldReader0.readFieldValue(jSONReader, t10);
                if (iStartArray > 1) {
                    this.fieldReader1.readFieldValue(jSONReader, t10);
                    for (int i9 = 2; i9 < iStartArray; i9++) {
                        jSONReader.skipValue();
                    }
                }
            }
            Function function = this.buildFunction;
            return function != null ? (T) function.apply(t10) : t10;
        }
        if (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT)) {
            C0086a.m464w(jSONReader.info("expect object, but " + JSONB.typeName(jSONReader.getType())));
            return null;
        }
        Supplier<T> supplier = this.creator;
        if (supplier != null) {
            t9 = supplier.get();
        } else if (((jSONReader.context.features | j3) & JSONReader.Feature.FieldBased.mask) != 0) {
            try {
                t9 = (T) JDKUtils.UNSAFE.allocateInstance(this.objectClass);
            } catch (InstantiationException e6) {
                C0086a.m465x(jSONReader.info("create instance error"), e6);
                return null;
            }
        } else {
            t9 = null;
        }
        if (t9 != null && this.hasDefaultValue) {
            initDefaultValue(t9);
        }
        if (t9 != null && jSONReader.isInitStringFieldAsEmpty()) {
            initStringFieldAsEmpty(t9);
        }
        while (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT_END)) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode != 0) {
                if (fieldNameHashCode == this.hashCode0) {
                    this.fieldReader0.readFieldValue(jSONReader, t9);
                } else if (fieldNameHashCode == this.hashCode1) {
                    this.fieldReader1.readFieldValueJSONB(jSONReader, t9);
                } else {
                    if (jSONReader.isSupportSmartMatch(this.features | j3)) {
                        long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
                        if (nameHashCodeLCase == this.hashCode0LCase) {
                            this.fieldReader0.readFieldValueJSONB(jSONReader, t9);
                        } else if (nameHashCodeLCase == this.hashCode1LCase) {
                            this.fieldReader1.readFieldValueJSONB(jSONReader, t9);
                        }
                    }
                    processExtra(jSONReader, t9, j3);
                }
            }
        }
        Function function2 = this.buildFunction;
        return function2 != null ? (T) function2.apply(t9) : t9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124  */
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
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j3);
        }
        if (jSONReader.nextIfNull()) {
            jSONReader.nextIfComma();
            return null;
        }
        long jFeatures = jSONReader.features(this.features | j3);
        if (jSONReader.isArray()) {
            if ((JSONReader.Feature.SupportArrayToBean.mask & jFeatures) == 0) {
                return processObjectInputSingleItemArray(jSONReader, type, obj, jFeatures);
            }
            jSONReader.next();
            T t9 = this.creator.get();
            if (this.hasDefaultValue) {
                initDefaultValue(t9);
            }
            this.fieldReader0.readFieldValue(jSONReader, t9);
            this.fieldReader1.readFieldValue(jSONReader, t9);
            if (jSONReader.current() == ']') {
                jSONReader.next();
                return t9;
            }
            C0086a.m464w(jSONReader.info("array to bean end error"));
            return null;
        }
        jSONReader.nextIfObjectStart();
        T t10 = this.creator.get();
        if (this.hasDefaultValue) {
            initDefaultValue(t10);
        }
        if (t10 != null && (JSONReader.Feature.InitStringFieldAsEmpty.mask & jFeatures) != 0) {
            initStringFieldAsEmpty(t10);
        }
        int i9 = 0;
        while (true) {
            if (jSONReader.nextIfObjectEnd()) {
                break;
            }
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (i9 == 0 && fieldNameHashCode == ObjectReader.HASH_TYPE) {
                long typeHashCode = jSONReader.readTypeHashCode();
                JSONReader.Context context = jSONReader.context;
                ObjectReader objectReaderAutoType = context.getObjectReaderAutoType(typeHashCode);
                if ((objectReaderAutoType != null || (objectReaderAutoType = context.getObjectReaderAutoType(jSONReader.getString(), this.objectClass)) != null) && objectReaderAutoType != this) {
                    t10 = (T) objectReaderAutoType.readObject(jSONReader, type, obj, j3);
                    break;
                }
            } else if (fieldNameHashCode == this.hashCode0) {
                this.fieldReader0.readFieldValue(jSONReader, t10);
            } else if (fieldNameHashCode == this.hashCode1) {
                this.fieldReader1.readFieldValue(jSONReader, t10);
            } else if (jSONReader.isSupportSmartMatch(this.features | j3)) {
                long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
                if (nameHashCodeLCase == this.hashCode0LCase) {
                    this.fieldReader0.readFieldValue(jSONReader, t10);
                } else if (nameHashCodeLCase == this.hashCode1LCase) {
                    this.fieldReader1.readFieldValue(jSONReader, t10);
                } else {
                    processExtra(jSONReader, t10, j3);
                }
            }
            i9++;
        }
        jSONReader.nextIfComma();
        Function function = this.buildFunction;
        if (function == null) {
            return t10;
        }
        try {
            return (T) function.apply(t10);
        } catch (IllegalStateException e6) {
            C0086a.m465x(jSONReader.info("build object error"), e6);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader) {
        return readObject(jSONReader, null, null, this.features);
    }
}
