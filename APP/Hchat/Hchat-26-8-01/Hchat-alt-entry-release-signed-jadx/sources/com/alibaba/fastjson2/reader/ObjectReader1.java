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
public class ObjectReader1<T> extends ObjectReaderAdapter<T> {
    protected final FieldReader fieldReader0;
    final long hashCode0;
    final long hashCode0LCase;
    protected ObjectReader objectReader0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader1(Class cls, String str, String str2, long j3, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        super(cls, str, str2, j3, supplier, function, null, null, null, fieldReaderArr);
        FieldReader fieldReader = fieldReaderArr[0];
        this.fieldReader0 = fieldReader;
        this.hashCode0 = fieldReader.fieldNameHash;
        this.hashCode0LCase = fieldReader.fieldNameHashLCase;
        this.hasDefaultValue = fieldReader.defaultValue != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReader(long j3) {
        if (j3 == this.hashCode0) {
            return this.fieldReader0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReaderLCase(long j3) {
        if (j3 == this.hashCode0LCase) {
            return this.fieldReader0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T t9) {
        this.fieldReader0.acceptDefaultValue(t9);
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
            for (int i9 = 1; i9 < iStartArray; i9++) {
                jSONReader.skipValue();
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
        ObjectReader objectReaderAutoType;
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        ObjectReader objectReaderCheckAutoType = checkAutoType(jSONReader, this.objectClass, this.features | j3);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType != this && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j3);
        }
        if (jSONReader.isArray()) {
            T t10 = this.creator.get();
            int iStartArray = jSONReader.startArray();
            if (iStartArray > 0) {
                this.fieldReader0.readFieldValue(jSONReader, t10);
                for (int i9 = 1; i9 < iStartArray; i9++) {
                    jSONReader.skipValue();
                }
            }
            Function function = this.buildFunction;
            return function != null ? (T) function.apply(t10) : t10;
        }
        int i10 = 0;
        if (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT)) {
            if (!jSONReader.isTypeRedirect()) {
                C0086a.m464w(jSONReader.info("expect object, but " + JSONB.typeName(jSONReader.getType())));
                return null;
            }
            jSONReader.setTypeRedirect(false);
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
        while (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT_END)) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == getTypeKeyHash() && i10 == 0) {
                long typeHashCode = jSONReader.readTypeHashCode();
                JSONReader.Context context = jSONReader.context;
                ObjectReader objectReaderAutoType2 = autoType(context, typeHashCode);
                if (objectReaderAutoType2 == null) {
                    String string = jSONReader.getString();
                    objectReaderAutoType = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType == null) {
                        C0086a.m464w(jSONReader.info("auotype not support : " + string));
                        return null;
                    }
                } else {
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    return (T) objectReaderAutoType.readJSONBObject(jSONReader, type, obj, j3);
                }
            } else if (fieldNameHashCode != 0) {
                if (fieldNameHashCode == this.hashCode0) {
                    this.fieldReader0.readFieldValueJSONB(jSONReader, t9);
                } else if (jSONReader.isSupportSmartMatch(this.features | j3) && jSONReader.getNameHashCodeLCase() == this.hashCode0LCase) {
                    this.fieldReader0.readFieldValue(jSONReader, t9);
                } else {
                    processExtra(jSONReader, t9, j3);
                }
            }
            i10++;
        }
        Function function2 = this.buildFunction;
        return function2 != null ? (T) function2.apply(t9) : t9;
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
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        ObjectReader objectReader;
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        T t9 = null;
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        long jFeatures = jSONReader.features(this.features | j3);
        if (jSONReader.isArray()) {
            if ((JSONReader.Feature.SupportArrayToBean.mask & jFeatures) == 0) {
                return processObjectInputSingleItemArray(jSONReader, type, obj, jFeatures);
            }
            jSONReader.next();
            T t10 = this.creator.get();
            this.fieldReader0.readFieldValue(jSONReader, t10);
            if (jSONReader.nextIfArrayEnd()) {
                jSONReader.nextIfComma();
                Function function = this.buildFunction;
                return function != null ? (T) function.apply(t10) : t10;
            }
            C0086a.m464w(jSONReader.info("array to bean end error, " + jSONReader.current()));
            return null;
        }
        jSONReader.nextIfObjectStart();
        Supplier<T> supplier = this.creator;
        if (supplier != null) {
            t9 = supplier.get();
        }
        if (this.hasDefaultValue) {
            initDefaultValue(t9);
        }
        if (t9 != null && (jFeatures & JSONReader.Feature.InitStringFieldAsEmpty.mask) != 0) {
            initStringFieldAsEmpty(t9);
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
                if ((objectReaderAutoType != null || (objectReaderAutoType = context.getObjectReaderAutoType(jSONReader.getString(), this.objectClass)) != null) && (objectReader = objectReaderAutoType) != this) {
                    t9 = (T) objectReader.readObject(jSONReader, type, obj, j3);
                    break;
                }
            } else if (fieldNameHashCode == this.hashCode0) {
                this.fieldReader0.readFieldValue(jSONReader, t9);
            } else if (jSONReader.isSupportSmartMatch(this.features | j3) && jSONReader.getNameHashCodeLCase() == this.hashCode0LCase) {
                this.fieldReader0.readFieldValue(jSONReader, t9);
            } else {
                processExtra(jSONReader, t9, j3);
            }
            i9++;
        }
        jSONReader.nextIfComma();
        Function function2 = this.buildFunction;
        return function2 != null ? (T) function2.apply(t9) : t9;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader) {
        return readObject(jSONReader, null, null, this.features);
    }
}
