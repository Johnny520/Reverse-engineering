package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class CollectionSerializer<T extends Collection> extends Serializer<T> {
    private Class elementClass;
    private Serializer elementSerializer;
    private boolean elementsCanBeNull = true;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public T read(com.esotericsoftware.kryo.Kryo r8, com.esotericsoftware.kryo.io.Input r9, java.lang.Class<? extends T> r10) {
        /*
            r7 = this;
            java.lang.Class r0 = r7.elementClass
            com.esotericsoftware.kryo.Serializer r1 = r7.elementSerializer
            if (r1 != 0) goto L1b
            com.esotericsoftware.kryo.util.Generics r2 = r8.getGenerics()
            java.lang.Class r2 = r2.nextGenericClass()
            if (r2 == 0) goto L1b
            boolean r3 = r8.isFinal(r2)
            if (r3 == 0) goto L1b
            com.esotericsoftware.kryo.Serializer r1 = r8.getSerializer(r2)
            r0 = r2
        L1b:
            boolean r2 = r7.elementsCanBeNull     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L51
            if (r2 == 0) goto L30
            boolean r2 = r9.readVarIntFlag()     // Catch: java.lang.Throwable -> L2d
            int r5 = r9.readVarIntFlag(r5)     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r7 = move-exception
            goto Lb6
        L30:
            int r5 = r9.readVarInt(r5)     // Catch: java.lang.Throwable -> L2d
        L34:
            if (r5 != 0) goto L3e
        L36:
            com.esotericsoftware.kryo.util.Generics r7 = r8.getGenerics()
            r7.popGenericType()
            return r3
        L3e:
            int r5 = r5 + (-1)
            java.util.Collection r7 = r7.create(r8, r9, r10, r5)     // Catch: java.lang.Throwable -> L2d
            r8.reference(r7)     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto L8e
        L49:
            com.esotericsoftware.kryo.util.Generics r8 = r8.getGenerics()
            r8.popGenericType()
            return r7
        L51:
            boolean r6 = r9.readVarIntFlag()     // Catch: java.lang.Throwable -> L2d
            int r5 = r9.readVarIntFlag(r5)     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto L5c
            goto L36
        L5c:
            int r5 = r5 + (-1)
            java.util.Collection r7 = r7.create(r8, r9, r10, r5)     // Catch: java.lang.Throwable -> L2d
            r8.reference(r7)     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto L68
            goto L49
        L68:
            if (r6 == 0) goto L8e
            com.esotericsoftware.kryo.Registration r10 = r8.readClass(r9)     // Catch: java.lang.Throwable -> L2d
            if (r10 != 0) goto L80
        L70:
            if (r4 >= r5) goto L78
            r7.add(r3)     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 + 1
            goto L70
        L78:
            com.esotericsoftware.kryo.util.Generics r9 = r8.getGenerics()     // Catch: java.lang.Throwable -> L2d
            r9.popGenericType()     // Catch: java.lang.Throwable -> L2d
            goto L49
        L80:
            java.lang.Class r0 = r10.getType()     // Catch: java.lang.Throwable -> L2d
            com.esotericsoftware.kryo.Serializer r1 = r8.getSerializer(r0)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L8e
            boolean r2 = r9.readBoolean()     // Catch: java.lang.Throwable -> L2d
        L8e:
            if (r1 == 0) goto Laa
            if (r2 == 0) goto L9e
        L92:
            if (r4 >= r5) goto L49
            java.lang.Object r10 = r8.readObjectOrNull(r9, r0, r1)     // Catch: java.lang.Throwable -> L2d
            r7.add(r10)     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 + 1
            goto L92
        L9e:
            if (r4 >= r5) goto L49
            java.lang.Object r10 = r8.readObject(r9, r0, r1)     // Catch: java.lang.Throwable -> L2d
            r7.add(r10)     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 + 1
            goto L9e
        Laa:
            if (r4 >= r5) goto L49
            java.lang.Object r10 = r8.readClassAndObject(r9)     // Catch: java.lang.Throwable -> L2d
            r7.add(r10)     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 + 1
            goto Laa
        Lb6:
            com.esotericsoftware.kryo.util.Generics r8 = r8.getGenerics()
            r8.popGenericType()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.CollectionSerializer.read(com.esotericsoftware.kryo.Kryo, com.esotericsoftware.kryo.io.Input, java.lang.Class):java.util.Collection");
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
