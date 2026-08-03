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
public class ObjectReader6<T> extends ObjectReaderAdapter<T> {
    protected final FieldReader fieldReader0;
    protected final FieldReader fieldReader1;
    protected final FieldReader fieldReader2;
    protected final FieldReader fieldReader3;
    protected final FieldReader fieldReader4;
    protected final FieldReader fieldReader5;
    final long hashCode0;
    final long hashCode0LCase;
    final long hashCode1;
    final long hashCode1LCase;
    final long hashCode2;
    final long hashCode2LCase;
    final long hashCode3;
    final long hashCode3LCase;
    final long hashCode4;
    final long hashCode4LCase;
    final long hashCode5;
    final long hashCode5LCase;
    protected ObjectReader objectReader0;
    protected ObjectReader objectReader1;
    protected ObjectReader objectReader2;
    protected ObjectReader objectReader3;
    protected ObjectReader objectReader4;
    protected ObjectReader objectReader5;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader6(Class cls, String str, String str2, long j3, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        super(cls, str, str2, j3, supplier, function, null, null, null, fieldReaderArr);
        FieldReader fieldReader = fieldReaderArr[0];
        this.fieldReader0 = fieldReader;
        FieldReader fieldReader2 = fieldReaderArr[1];
        this.fieldReader1 = fieldReader2;
        FieldReader fieldReader3 = fieldReaderArr[2];
        this.fieldReader2 = fieldReader3;
        FieldReader fieldReader4 = fieldReaderArr[3];
        this.fieldReader3 = fieldReader4;
        FieldReader fieldReader5 = fieldReaderArr[4];
        this.fieldReader4 = fieldReader5;
        FieldReader fieldReader6 = fieldReaderArr[5];
        this.fieldReader5 = fieldReader6;
        this.hashCode0 = fieldReader.fieldNameHash;
        this.hashCode1 = fieldReader2.fieldNameHash;
        this.hashCode2 = fieldReader3.fieldNameHash;
        this.hashCode3 = fieldReader4.fieldNameHash;
        this.hashCode4 = fieldReader5.fieldNameHash;
        this.hashCode5 = fieldReader6.fieldNameHash;
        this.hashCode0LCase = fieldReader.fieldNameHashLCase;
        this.hashCode1LCase = fieldReader2.fieldNameHashLCase;
        this.hashCode2LCase = fieldReader3.fieldNameHashLCase;
        this.hashCode3LCase = fieldReader4.fieldNameHashLCase;
        this.hashCode4LCase = fieldReader5.fieldNameHashLCase;
        this.hashCode5LCase = fieldReader6.fieldNameHashLCase;
        this.hasDefaultValue = (fieldReader.defaultValue == null && fieldReader2.defaultValue == null && fieldReader3.defaultValue == null && fieldReader4.defaultValue == null && fieldReader5.defaultValue == null && fieldReader6.defaultValue == null) ? false : true;
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
        if (j3 == this.hashCode2) {
            return this.fieldReader2;
        }
        if (j3 == this.hashCode3) {
            return this.fieldReader3;
        }
        if (j3 == this.hashCode4) {
            return this.fieldReader4;
        }
        if (j3 == this.hashCode5) {
            return this.fieldReader5;
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
        if (j3 == this.hashCode2LCase) {
            return this.fieldReader2;
        }
        if (j3 == this.hashCode3LCase) {
            return this.fieldReader3;
        }
        if (j3 == this.hashCode4LCase) {
            return this.fieldReader4;
        }
        if (j3 == this.hashCode5LCase) {
            return this.fieldReader5;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T t9) {
        this.fieldReader0.acceptDefaultValue(t9);
        this.fieldReader1.acceptDefaultValue(t9);
        this.fieldReader2.acceptDefaultValue(t9);
        this.fieldReader3.acceptDefaultValue(t9);
        this.fieldReader4.acceptDefaultValue(t9);
        this.fieldReader5.acceptDefaultValue(t9);
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
                if (iStartArray > 2) {
                    this.fieldReader2.readFieldValue(jSONReader, t9);
                    if (iStartArray > 3) {
                        this.fieldReader3.readFieldValue(jSONReader, t9);
                        if (iStartArray > 4) {
                            this.fieldReader4.readFieldValue(jSONReader, t9);
                            if (iStartArray > 5) {
                                this.fieldReader5.readFieldValue(jSONReader, t9);
                                for (int i9 = 6; i9 < iStartArray; i9++) {
                                    jSONReader.skipValue();
                                }
                            }
                        }
                    }
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
        if (jSONReader.isArray()) {
            T t10 = this.creator.get();
            int iStartArray = jSONReader.startArray();
            if (iStartArray > 0) {
                this.fieldReader0.readFieldValue(jSONReader, t10);
                if (iStartArray > 1) {
                    this.fieldReader1.readFieldValue(jSONReader, t10);
                    if (iStartArray > 2) {
                        this.fieldReader2.readFieldValue(jSONReader, t10);
                        if (iStartArray > 3) {
                            this.fieldReader3.readFieldValue(jSONReader, t10);
                            if (iStartArray > 4) {
                                this.fieldReader4.readFieldValue(jSONReader, t10);
                                if (iStartArray > 5) {
                                    this.fieldReader5.readFieldValue(jSONReader, t10);
                                    for (int i9 = 6; i9 < iStartArray; i9++) {
                                        jSONReader.skipValue();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Function function = this.buildFunction;
            return function != null ? (T) function.apply(t10) : t10;
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, getTypeNameHash(), this.features | j3);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j3);
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
        while (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT_END)) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode != 0) {
                if (fieldNameHashCode == this.hashCode0) {
                    this.fieldReader0.readFieldValue(jSONReader, t9);
                } else if (fieldNameHashCode == this.hashCode1) {
                    this.fieldReader1.readFieldValue(jSONReader, t9);
                } else if (fieldNameHashCode == this.hashCode2) {
                    this.fieldReader2.readFieldValue(jSONReader, t9);
                } else if (fieldNameHashCode == this.hashCode3) {
                    this.fieldReader3.readFieldValue(jSONReader, t9);
                } else if (fieldNameHashCode == this.hashCode4) {
                    this.fieldReader4.readFieldValue(jSONReader, t9);
                } else if (fieldNameHashCode == this.hashCode5) {
                    this.fieldReader5.readFieldValue(jSONReader, t9);
                } else if (jSONReader.isSupportSmartMatch(this.features | j3)) {
                    long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
                    if (nameHashCodeLCase == this.hashCode0LCase) {
                        this.fieldReader0.readFieldValue(jSONReader, t9);
                    } else if (nameHashCodeLCase == this.hashCode1LCase) {
                        this.fieldReader1.readFieldValue(jSONReader, t9);
                    } else if (nameHashCodeLCase == this.hashCode2LCase) {
                        this.fieldReader2.readFieldValue(jSONReader, t9);
                    } else if (nameHashCodeLCase == this.hashCode3LCase) {
                        this.fieldReader3.readFieldValue(jSONReader, t9);
                    } else if (nameHashCodeLCase == this.hashCode4LCase) {
                        this.fieldReader4.readFieldValue(jSONReader, t9);
                    } else if (nameHashCodeLCase == this.hashCode5LCase) {
                        this.fieldReader5.readFieldValue(jSONReader, t9);
                    } else {
                        processExtra(jSONReader, t9, j3);
                    }
                } else {
                    processExtra(jSONReader, t9, j3);
                }
            }
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
            jSONReader.nextIfArrayStart();
            T t9 = this.creator.get();
            if (this.hasDefaultValue) {
                initDefaultValue(t9);
            }
            this.fieldReader0.readFieldValue(jSONReader, t9);
            this.fieldReader1.readFieldValue(jSONReader, t9);
            this.fieldReader2.readFieldValue(jSONReader, t9);
            this.fieldReader3.readFieldValue(jSONReader, t9);
            this.fieldReader4.readFieldValue(jSONReader, t9);
            this.fieldReader5.readFieldValue(jSONReader, t9);
            if (!jSONReader.nextIfArrayEnd()) {
                C0086a.m464w(jSONReader.info("array to bean end error"));
                return null;
            }
            jSONReader.nextIfComma();
            Function function = this.buildFunction;
            return function != null ? (T) function.apply(t9) : t9;
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
            } else if (fieldNameHashCode == this.hashCode2) {
                this.fieldReader2.readFieldValue(jSONReader, t10);
            } else if (fieldNameHashCode == this.hashCode3) {
                this.fieldReader3.readFieldValue(jSONReader, t10);
            } else if (fieldNameHashCode == this.hashCode4) {
                this.fieldReader4.readFieldValue(jSONReader, t10);
            } else if (fieldNameHashCode == this.hashCode5) {
                this.fieldReader5.readFieldValue(jSONReader, t10);
            } else if (jSONReader.isSupportSmartMatch(this.features | j3)) {
                long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
                if (nameHashCodeLCase == this.hashCode0LCase) {
                    this.fieldReader0.readFieldValue(jSONReader, t10);
                } else if (nameHashCodeLCase == this.hashCode1LCase) {
                    this.fieldReader1.readFieldValue(jSONReader, t10);
                } else if (nameHashCodeLCase == this.hashCode2LCase) {
                    this.fieldReader2.readFieldValue(jSONReader, t10);
                } else if (nameHashCodeLCase == this.hashCode3LCase) {
                    this.fieldReader3.readFieldValue(jSONReader, t10);
                } else if (nameHashCodeLCase == this.hashCode4LCase) {
                    this.fieldReader4.readFieldValue(jSONReader, t10);
                } else if (nameHashCodeLCase == this.hashCode5LCase) {
                    this.fieldReader5.readFieldValue(jSONReader, t10);
                } else {
                    processExtra(jSONReader, t10, j3);
                }
            } else {
                processExtra(jSONReader, t10, j3);
            }
            i9++;
        }
        jSONReader.nextIfComma();
        Function function2 = this.buildFunction;
        return function2 != null ? (T) function2.apply(t10) : t10;
    }
}
