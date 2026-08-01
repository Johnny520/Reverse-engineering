package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Generics;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.FieldAccess;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import p007.AbstractC6136;
import p383.AbstractC9032;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class FieldSerializer<T> extends Serializer<T> {
    final CachedFields cachedFields;
    final FieldSerializerConfig config;
    private final Generics.GenericsHierarchy genericsHierarchy;
    final Kryo kryo;
    final Class type;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Bind {
        boolean canBeNull() default true;

        boolean optimizePositive() default false;

        Class<? extends Serializer> serializer() default Serializer.class;

        Class<? extends SerializerFactory> serializerFactory() default SerializerFactory.class;

        Class valueClass() default Object.class;

        boolean variableLengthEncoding() default true;
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class FieldSerializerConfig implements Cloneable {
        boolean extendedFieldNames;
        boolean fixedFieldTypes;
        boolean serializeTransient;
        boolean fieldsCanBeNull = true;
        boolean setFieldsAsAccessible = true;
        boolean ignoreSyntheticFields = true;
        boolean copyTransient = true;
        boolean varEncoding = true;

        @Override // 
        /* JADX INFO: renamed from: clone */
        public FieldSerializerConfig mo6906clone() {
            try {
                return (FieldSerializerConfig) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new KryoException(e);
            }
        }

        public boolean getCopyTransient() {
            return this.copyTransient;
        }

        public boolean getExtendedFieldNames() {
            return this.extendedFieldNames;
        }

        public boolean getFieldsCanBeNull() {
            return this.fieldsCanBeNull;
        }

        public boolean getFixedFieldTypes() {
            return this.fixedFieldTypes;
        }

        public boolean getIgnoreSyntheticFields() {
            return this.ignoreSyntheticFields;
        }

        public boolean getSerializeTransient() {
            return this.serializeTransient;
        }

        public boolean getSetFieldsAsAccessible() {
            return this.setFieldsAsAccessible;
        }

        public boolean getVariableLengthEncoding() {
            return this.varEncoding;
        }

        public void setCopyTransient(boolean z) {
            this.copyTransient = z;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig copyTransient: " + z);
            }
        }

        public void setExtendedFieldNames(boolean z) {
            this.extendedFieldNames = z;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig extendedFieldNames: " + z);
            }
        }

        public void setFieldsAsAccessible(boolean z) {
            this.setFieldsAsAccessible = z;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig setFieldsAsAccessible: " + z);
            }
        }

        public void setFieldsCanBeNull(boolean z) {
            this.fieldsCanBeNull = z;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig fieldsCanBeNull: " + z);
            }
        }

        public void setFixedFieldTypes(boolean z) {
            this.fixedFieldTypes = z;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig fixedFieldTypes: " + z);
            }
        }

        public void setIgnoreSyntheticFields(boolean z) {
            this.ignoreSyntheticFields = z;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig ignoreSyntheticFields: " + z);
            }
        }

        public void setSerializeTransient(boolean z) {
            this.serializeTransient = z;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig serializeTransient: " + z);
            }
        }

        public void setVariableLengthEncoding(boolean z) {
            this.varEncoding = z;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig variable length encoding: " + z);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface NotNull {
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Optional {
        String value();
    }

    public FieldSerializer(Kryo kryo, Class cls, FieldSerializerConfig fieldSerializerConfig) {
        if (cls == null) {
            C5919.m11249("type cannot be null.");
            throw null;
        }
        if (cls.isPrimitive()) {
            C5919.m11249(AbstractC9032.m14590(cls, "type cannot be a primitive class: "));
            throw null;
        }
        if (fieldSerializerConfig == null) {
            C5919.m11249("config cannot be null.");
            throw null;
        }
        this.kryo = kryo;
        this.type = cls;
        this.config = fieldSerializerConfig;
        this.genericsHierarchy = kryo.getGenerics().buildHierarchy(cls);
        CachedFields cachedFields = new CachedFields(this);
        this.cachedFields = cachedFields;
        cachedFields.rebuild();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T copy(Kryo kryo, T t) {
        T tCreateCopy = createCopy(kryo, t);
        kryo.reference(tCreateCopy);
        int length = this.cachedFields.copyFields.length;
        for (int i = 0; i < length; i++) {
            this.cachedFields.copyFields[i].copy(t, tCreateCopy);
        }
        return tCreateCopy;
    }

    public T create(Kryo kryo, Input input, Class<? extends T> cls) {
        return (T) kryo.newInstance(cls);
    }

    public T createCopy(Kryo kryo, T t) {
        return (T) kryo.newInstance(t.getClass());
    }

    public CachedField[] getCopyFields() {
        return this.cachedFields.copyFields;
    }

    public CachedField getField(String str) {
        for (CachedField cachedField : this.cachedFields.fields) {
            if (cachedField.name.equals(str)) {
                return cachedField;
            }
        }
        C5919.m11249(AbstractC6136.m11549(this.type, AbstractC6136.m11550("Field \"", str, "\" not found on class: ")));
        return null;
    }

    public FieldSerializerConfig getFieldSerializerConfig() {
        return this.config;
    }

    public CachedField[] getFields() {
        return this.cachedFields.fields;
    }

    public Kryo getKryo() {
        return this.kryo;
    }

    public Class getType() {
        return this.type;
    }

    public void log(String str, CachedField cachedField, int i) {
        String simpleName;
        if (cachedField instanceof ReflectField) {
            ReflectField reflectField = (ReflectField) cachedField;
            Class<?> clsResolveFieldClass = reflectField.resolveFieldClass();
            if (clsResolveFieldClass == null) {
                clsResolveFieldClass = cachedField.field.getType();
            }
            simpleName = Util.simpleName(clsResolveFieldClass, reflectField.genericType);
        } else {
            Class cls = cachedField.valueClass;
            simpleName = cls != null ? cls.getSimpleName() : cachedField.field.getType().getSimpleName();
        }
        Log.trace("kryo", str + " field " + simpleName + ": " + cachedField.name + " (" + Util.className(cachedField.field.getDeclaringClass()) + ')' + Util.pos(i));
    }

    public void popTypeVariables(int i) {
        Generics generics = this.kryo.getGenerics();
        if (i > 0) {
            generics.popTypeVariables(i);
        }
        generics.popGenericType();
    }

    public int pushTypeVariables() {
        Generics.GenericType[] genericTypeArrNextGenericTypes = this.kryo.getGenerics().nextGenericTypes();
        if (genericTypeArrNextGenericTypes == null) {
            return 0;
        }
        int iPushTypeVariables = this.kryo.getGenerics().pushTypeVariables(this.genericsHierarchy, genericTypeArrNextGenericTypes);
        if (Log.TRACE && iPushTypeVariables > 0) {
            Log.trace("kryo", "Generics: " + this.kryo.getGenerics());
        }
        return iPushTypeVariables;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        int iPushTypeVariables = pushTypeVariables();
        T tCreate = create(kryo, input, cls);
        kryo.reference(tCreate);
        CachedField[] cachedFieldArr = this.cachedFields.fields;
        int length = cachedFieldArr.length;
        for (int i = 0; i < length; i++) {
            if (Log.TRACE) {
                log("Read", cachedFieldArr[i], input.position());
            }
            try {
                cachedFieldArr[i].read(input, tCreate);
            } catch (KryoException e) {
                throw e;
            } catch (Exception e2) {
                e = e2;
                StringBuilder sb = new StringBuilder("Error reading ");
                sb.append(cachedFieldArr[i]);
                int iPosition = input.position();
                sb.append(" at position ");
                sb.append(iPosition);
                throw new KryoException(sb.toString(), e);
            } catch (OutOfMemoryError e3) {
                e = e3;
                StringBuilder sb2 = new StringBuilder("Error reading ");
                sb2.append(cachedFieldArr[i]);
                int iPosition2 = input.position();
                sb2.append(" at position ");
                sb2.append(iPosition2);
                throw new KryoException(sb2.toString(), e);
            }
        }
        popTypeVariables(iPushTypeVariables);
        return tCreate;
    }

    public void removeField(String str) {
        this.cachedFields.removeField(str);
    }

    public void updateFields() {
        if (Log.TRACE) {
            Log.trace("kryo", "Update fields: " + Util.className(this.type));
        }
        this.cachedFields.rebuild();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t) {
        int iPushTypeVariables = pushTypeVariables();
        CachedField[] cachedFieldArr = this.cachedFields.fields;
        int length = cachedFieldArr.length;
        for (int i = 0; i < length; i++) {
            if (Log.TRACE) {
                log("Write", cachedFieldArr[i], output.position());
            }
            try {
                cachedFieldArr[i].write(output, t);
            } catch (KryoException e) {
                throw e;
            } catch (Exception e2) {
                e = e2;
                StringBuilder sb = new StringBuilder("Error writing ");
                sb.append(cachedFieldArr[i]);
                int iPosition = output.position();
                sb.append(" at position ");
                sb.append(iPosition);
                throw new KryoException(sb.toString(), e);
            } catch (OutOfMemoryError e3) {
                e = e3;
                StringBuilder sb2 = new StringBuilder("Error writing ");
                sb2.append(cachedFieldArr[i]);
                int iPosition2 = output.position();
                sb2.append(" at position ");
                sb2.append(iPosition2);
                throw new KryoException(sb2.toString(), e);
            }
        }
        popTypeVariables(iPushTypeVariables);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static abstract class CachedField {
        FieldAccess access;
        boolean canBeNull;
        final Field field;
        String name;
        long offset;
        boolean optimizePositive;
        Serializer serializer;
        int tag;
        Class valueClass;
        boolean varEncoding = true;
        boolean reuseSerializer = true;
        int accessIndex = -1;

        public CachedField(Field field) {
            this.field = field;
        }

        public abstract void copy(Object obj, Object obj2);

        public boolean getCanBeNull() {
            return this.canBeNull;
        }

        public Field getField() {
            return this.field;
        }

        public String getName() {
            return this.name;
        }

        public boolean getOptimizePositive() {
            return this.optimizePositive;
        }

        public boolean getReuseSerializer() {
            return this.reuseSerializer;
        }

        public Serializer getSerializer() {
            return this.serializer;
        }

        public Class getValueClass() {
            return this.valueClass;
        }

        public boolean getVariableLengthEncoding() {
            return this.varEncoding;
        }

        public abstract void read(Input input, Object obj);

        public void setCanBeNull(boolean z) {
            this.canBeNull = z;
        }

        public void setOptimizePositive(boolean z) {
            this.optimizePositive = z;
        }

        public void setReuseSerializer(boolean z) {
            this.reuseSerializer = z;
        }

        public void setSerializer(Serializer serializer) {
            this.serializer = serializer;
        }

        public void setValueClass(Class cls, Serializer serializer) {
            this.valueClass = cls;
            this.serializer = serializer;
        }

        public void setVariableLengthEncoding(boolean z) {
            this.varEncoding = z;
        }

        public String toString() {
            return this.name;
        }

        public abstract void write(Output output, Object obj);

        public void setValueClass(Class cls) {
            this.valueClass = cls;
        }
    }

    public void removeField(CachedField cachedField) {
        this.cachedFields.removeField(cachedField);
    }

    public void initializeCachedFields() {
    }

    public FieldSerializer(Kryo kryo, Class cls) {
        this(kryo, cls, new FieldSerializerConfig());
    }
}
