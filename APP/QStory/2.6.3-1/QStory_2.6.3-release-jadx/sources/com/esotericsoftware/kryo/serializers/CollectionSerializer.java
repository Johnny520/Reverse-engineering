package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.p006io.Input;
import com.esotericsoftware.kryo.p006io.Output;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CollectionSerializer<T extends Collection> extends Serializer<T> {
    private Class elementClass;
    private Serializer elementSerializer;
    private boolean elementsCanBeNull = true;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BindCollection {
        Class elementClass() default Object.class;

        Class<? extends Serializer> elementSerializer() default Serializer.class;

        Class<? extends SerializerFactory> elementSerializerFactory() default SerializerFactory.class;

        boolean elementsCanBeNull() default true;
    }

    public CollectionSerializer() {
        setAcceptsNull(true);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T copy(Kryo kryo, T t) {
        T t2 = (T) createCopy(kryo, t);
        kryo.reference(t2);
        Iterator it = t.iterator();
        while (it.hasNext()) {
            t2.add(kryo.copy(it.next()));
        }
        return t2;
    }

    public T create(Kryo kryo, Input input, Class<? extends T> cls, int i) {
        if (cls == ArrayList.class) {
            return new ArrayList(i);
        }
        if (cls == HashSet.class) {
            return new HashSet(Math.max(((int) (i / 0.75f)) + 1, 16));
        }
        T t = (T) kryo.newInstance(cls);
        if (t instanceof ArrayList) {
            ((ArrayList) t).ensureCapacity(i);
        }
        return t;
    }

    public T createCopy(Kryo kryo, T t) {
        return (T) kryo.newInstance(t.getClass());
    }

    public Class getElementClass() {
        return this.elementClass;
    }

    public Serializer getElementSerializer() {
        return this.elementSerializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008e A[PHI: r0 r1 r2 r5 r7
  0x008e: PHI (r0v3 java.lang.Class) = (r0v1 java.lang.Class), (r0v2 java.lang.Class), (r0v2 java.lang.Class), (r0v1 java.lang.Class) binds: [B:30:0x0068, B:37:0x0088, B:38:0x008a, B:21:0x0047] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r1v3 com.esotericsoftware.kryo.Serializer) = 
  (r1v1 com.esotericsoftware.kryo.Serializer)
  (r1v2 com.esotericsoftware.kryo.Serializer)
  (r1v2 com.esotericsoftware.kryo.Serializer)
  (r1v1 com.esotericsoftware.kryo.Serializer)
 binds: [B:30:0x0068, B:37:0x0088, B:38:0x008a, B:21:0x0047] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r2v2 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v1 boolean), (r2v3 boolean) binds: [B:30:0x0068, B:37:0x0088, B:38:0x008a, B:21:0x0047] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v6 int) binds: [B:30:0x0068, B:37:0x0088, B:38:0x008a, B:21:0x0047] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r7v3 T extends java.util.Collection) = 
  (r7v2 T extends java.util.Collection)
  (r7v2 T extends java.util.Collection)
  (r7v2 T extends java.util.Collection)
  (r7v6 T extends java.util.Collection)
 binds: [B:30:0x0068, B:37:0x0088, B:38:0x008a, B:21:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa A[ADDED_TO_REGION, LOOP:2: B:45:0x00aa->B:47:0x00b3, LOOP_START, PHI: r4
  0x00aa: PHI (r4v3 int) = (r4v0 int), (r4v4 int) binds: [B:39:0x008e, B:47:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.esotericsoftware.kryo.Serializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        int i;
        T t;
        int varInt;
        Class clsNextGenericClass;
        Class type = this.elementClass;
        Serializer serializer = this.elementSerializer;
        if (serializer == null && (clsNextGenericClass = kryo.getGenerics().nextGenericClass()) != null && kryo.isFinal(clsNextGenericClass)) {
            serializer = kryo.getSerializer(clsNextGenericClass);
            type = clsNextGenericClass;
        }
        try {
            boolean varIntFlag = this.elementsCanBeNull;
            int i2 = 0;
            if (serializer != null) {
                if (varIntFlag) {
                    varIntFlag = input.readVarIntFlag();
                    varInt = input.readVarIntFlag(true);
                } else {
                    varInt = input.readVarInt(true);
                }
                if (varInt != 0) {
                    i = varInt - 1;
                    t = (T) create(kryo, input, cls, i);
                    kryo.reference(t);
                    if (i != 0) {
                        if (serializer != null) {
                            while (i2 < i) {
                                t.add(kryo.readClassAndObject(input));
                                i2++;
                            }
                        } else if (varIntFlag) {
                            while (i2 < i) {
                                t.add(kryo.readObjectOrNull(input, type, serializer));
                                i2++;
                            }
                        } else {
                            while (i2 < i) {
                                t.add(kryo.readObject(input, type, serializer));
                                i2++;
                            }
                        }
                    }
                }
                return null;
            }
            boolean varIntFlag2 = input.readVarIntFlag();
            int varIntFlag3 = input.readVarIntFlag(true);
            if (varIntFlag3 == 0) {
                return null;
            }
            i = varIntFlag3 - 1;
            t = (T) create(kryo, input, cls, i);
            kryo.reference(t);
            if (i != 0) {
                if (varIntFlag2) {
                    Registration registration = kryo.readClass(input);
                    if (registration == null) {
                        while (i2 < i) {
                            t.add(null);
                            i2++;
                        }
                        kryo.getGenerics().popGenericType();
                    } else {
                        type = registration.getType();
                        serializer = kryo.getSerializer(type);
                        if (varIntFlag) {
                            varIntFlag = input.readBoolean();
                        }
                        if (serializer != null) {
                        }
                    }
                }
            }
            kryo.getGenerics().popGenericType();
            return t;
        } finally {
            kryo.getGenerics().popGenericType();
        }
    }

    public void setElementClass(Class cls, Serializer serializer) {
        this.elementClass = cls;
        this.elementSerializer = serializer;
    }

    public void setElementSerializer(Serializer serializer) {
        this.elementSerializer = serializer;
    }

    public void setElementsCanBeNull(boolean z) {
        this.elementsCanBeNull = z;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t) {
        Class clsNextGenericClass;
        boolean z = false;
        if (t == null) {
            output.writeByte((byte) 0);
            return;
        }
        int size = t.size();
        if (size == 0) {
            output.writeByte(1);
            writeHeader(kryo, output, t);
            return;
        }
        boolean z2 = this.elementsCanBeNull;
        Serializer serializer = this.elementSerializer;
        if (serializer == null && (clsNextGenericClass = kryo.getGenerics().nextGenericClass()) != null && kryo.isFinal(clsNextGenericClass)) {
            serializer = kryo.getSerializer(clsNextGenericClass);
        }
        try {
            if (serializer != null) {
                if (z2) {
                    Iterator it = t.iterator();
                    while (it.hasNext()) {
                        if (it.next() == null) {
                            output.writeVarIntFlag(true, size + 1, true);
                        }
                    }
                    output.writeVarIntFlag(false, size + 1, true);
                    writeHeader(kryo, output, t);
                    z2 = z;
                } else {
                    output.writeVarInt(size + 1, true);
                }
                z = z2;
                writeHeader(kryo, output, t);
                z2 = z;
            } else {
                Iterator it2 = t.iterator();
                Class<?> cls = null;
                boolean z3 = false;
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (next == null) {
                            z3 = true;
                        } else if (cls == null) {
                            cls = next.getClass();
                        } else if (next.getClass() != cls) {
                            output.writeVarIntFlag(false, size + 1, true);
                            writeHeader(kryo, output, t);
                            break;
                        }
                    } else {
                        output.writeVarIntFlag(true, size + 1, true);
                        writeHeader(kryo, output, t);
                        if (cls == null) {
                            output.writeByte((byte) 0);
                            kryo.getGenerics().popGenericType();
                            return;
                        } else {
                            kryo.writeClass(output, cls);
                            serializer = kryo.getSerializer(cls);
                            if (z2) {
                                output.writeBoolean(z3);
                                z2 = z3;
                            }
                        }
                    }
                }
            }
            if (serializer == null) {
                Iterator it3 = t.iterator();
                while (it3.hasNext()) {
                    kryo.writeClassAndObject(output, it3.next());
                }
            } else if (z2) {
                Iterator it4 = t.iterator();
                while (it4.hasNext()) {
                    kryo.writeObjectOrNull(output, it4.next(), serializer);
                }
            } else {
                Iterator it5 = t.iterator();
                while (it5.hasNext()) {
                    kryo.writeObject(output, it5.next(), serializer);
                }
            }
            kryo.getGenerics().popGenericType();
        } catch (Throwable th) {
            kryo.getGenerics().popGenericType();
            throw th;
        }
    }

    public void setElementClass(Class cls) {
        this.elementClass = cls;
    }

    public void writeHeader(Kryo kryo, Output output, T t) {
    }
}
