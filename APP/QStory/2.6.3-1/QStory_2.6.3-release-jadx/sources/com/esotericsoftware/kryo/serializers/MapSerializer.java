package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.p006io.Input;
import com.esotericsoftware.kryo.p006io.Output;
import com.esotericsoftware.kryo.util.Generics;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MapSerializer<T extends Map> extends Serializer<T> {
    private Class keyClass;
    private Serializer keySerializer;
    private Class valueClass;
    private Serializer valueSerializer;
    private boolean keysCanBeNull = true;
    private boolean valuesCanBeNull = true;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BindMap {
        Class keyClass() default Object.class;

        Class<? extends Serializer> keySerializer() default Serializer.class;

        Class<? extends SerializerFactory> keySerializerFactory() default SerializerFactory.class;

        boolean keysCanBeNull() default true;

        Class valueClass() default Object.class;

        Class<? extends Serializer> valueSerializer() default Serializer.class;

        Class<? extends SerializerFactory> valueSerializerFactory() default SerializerFactory.class;

        boolean valuesCanBeNull() default true;
    }

    public MapSerializer() {
        setAcceptsNull(true);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T copy(Kryo kryo, T t) {
        T t2 = (T) createCopy(kryo, t);
        for (Map.Entry entry : t.entrySet()) {
            t2.put(kryo.copy(entry.getKey()), kryo.copy(entry.getValue()));
        }
        return t2;
    }

    public T create(Kryo kryo, Input input, Class<? extends T> cls, int i) {
        if (cls != HashMap.class) {
            return (T) kryo.newInstance(cls);
        }
        if (i < 3) {
            i++;
        } else if (i < 1073741824) {
            i = (int) ((i / 0.75f) + 1.0f);
        }
        return new HashMap(i);
    }

    public T createCopy(Kryo kryo, T t) {
        return (T) kryo.newInstance(t.getClass());
    }

    public Class getKeyClass() {
        return this.keyClass;
    }

    public Serializer getKeySerializer() {
        return this.keySerializer;
    }

    public Class getValueClass() {
        return this.valueClass;
    }

    public Serializer getValueSerializer() {
        return this.valueSerializer;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        Class clsResolve;
        Class clsResolve2;
        int varInt = input.readVarInt(true);
        if (varInt == 0) {
            return null;
        }
        int i = varInt - 1;
        T t = (T) create(kryo, input, cls, i);
        kryo.reference(t);
        if (i == 0) {
            return t;
        }
        Class cls2 = this.keyClass;
        Class cls3 = this.valueClass;
        Serializer serializer = this.keySerializer;
        Serializer serializer2 = this.valueSerializer;
        Generics.GenericType[] genericTypeArrNextGenericTypes = kryo.getGenerics().nextGenericTypes();
        if (genericTypeArrNextGenericTypes != null) {
            if (serializer == null && (clsResolve2 = genericTypeArrNextGenericTypes[0].resolve(kryo.getGenerics())) != null && kryo.isFinal(clsResolve2)) {
                serializer = kryo.getSerializer(clsResolve2);
                cls2 = clsResolve2;
            }
            if (serializer2 == null && (clsResolve = genericTypeArrNextGenericTypes[1].resolve(kryo.getGenerics())) != null && kryo.isFinal(clsResolve)) {
                serializer2 = kryo.getSerializer(clsResolve);
                cls3 = clsResolve;
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (genericTypeArrNextGenericTypes != null) {
                kryo.getGenerics().pushGenericType(genericTypeArrNextGenericTypes[0]);
            }
            Object objectOrNull = serializer != null ? this.keysCanBeNull ? kryo.readObjectOrNull(input, cls2, serializer) : kryo.readObject(input, cls2, serializer) : kryo.readClassAndObject(input);
            if (genericTypeArrNextGenericTypes != null) {
                kryo.getGenerics().popGenericType();
            }
            t.put(objectOrNull, serializer2 != null ? this.valuesCanBeNull ? kryo.readObjectOrNull(input, cls3, serializer2) : kryo.readObject(input, cls3, serializer2) : kryo.readClassAndObject(input));
        }
        kryo.getGenerics().popGenericType();
        return t;
    }

    public void setKeyClass(Class cls, Serializer serializer) {
        this.keyClass = cls;
        this.keySerializer = serializer;
    }

    public void setKeySerializer(Serializer serializer) {
        this.keySerializer = serializer;
    }

    public void setKeysCanBeNull(boolean z) {
        this.keysCanBeNull = z;
    }

    public void setValueClass(Class cls, Serializer serializer) {
        this.valueClass = cls;
        this.valueSerializer = serializer;
    }

    public void setValueSerializer(Serializer serializer) {
        this.valueSerializer = serializer;
    }

    public void setValuesCanBeNull(boolean z) {
        this.valuesCanBeNull = z;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t) {
        Class clsResolve;
        Class clsResolve2;
        if (t == null) {
            output.writeByte(0);
            return;
        }
        int size = t.size();
        if (size == 0) {
            output.writeByte(1);
            writeHeader(kryo, output, t);
            return;
        }
        output.writeVarInt(size + 1, true);
        writeHeader(kryo, output, t);
        Serializer serializer = this.keySerializer;
        Serializer serializer2 = this.valueSerializer;
        Generics.GenericType[] genericTypeArrNextGenericTypes = kryo.getGenerics().nextGenericTypes();
        if (genericTypeArrNextGenericTypes != null) {
            if (serializer == null && (clsResolve2 = genericTypeArrNextGenericTypes[0].resolve(kryo.getGenerics())) != null && kryo.isFinal(clsResolve2)) {
                serializer = kryo.getSerializer(clsResolve2);
            }
            if (serializer2 == null && (clsResolve = genericTypeArrNextGenericTypes[1].resolve(kryo.getGenerics())) != null && kryo.isFinal(clsResolve)) {
                serializer2 = kryo.getSerializer(clsResolve);
            }
        }
        for (Map.Entry entry : t.entrySet()) {
            if (genericTypeArrNextGenericTypes != null) {
                kryo.getGenerics().pushGenericType(genericTypeArrNextGenericTypes[0]);
            }
            if (serializer == null) {
                kryo.writeClassAndObject(output, entry.getKey());
            } else if (this.keysCanBeNull) {
                kryo.writeObjectOrNull(output, entry.getKey(), serializer);
            } else {
                kryo.writeObject(output, entry.getKey(), serializer);
            }
            if (genericTypeArrNextGenericTypes != null) {
                kryo.getGenerics().popGenericType();
            }
            if (serializer2 == null) {
                kryo.writeClassAndObject(output, entry.getValue());
            } else if (this.valuesCanBeNull) {
                kryo.writeObjectOrNull(output, entry.getValue(), serializer2);
            } else {
                kryo.writeObject(output, entry.getValue(), serializer2);
            }
        }
        kryo.getGenerics().popGenericType();
    }

    public void setKeyClass(Class cls) {
        this.keyClass = cls;
    }

    public void setValueClass(Class cls) {
        this.valueClass = cls;
    }

    public void writeHeader(Kryo kryo, Output output, T t) {
    }
}
