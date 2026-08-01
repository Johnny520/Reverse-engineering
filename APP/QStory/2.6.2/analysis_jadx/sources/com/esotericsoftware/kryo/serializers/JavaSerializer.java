package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.ObjectMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class JavaSerializer extends Serializer {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class ObjectInputStreamWithKryoClassLoader extends ObjectInputStream {
        private final Kryo kryo;

        public ObjectInputStreamWithKryoClassLoader(InputStream inputStream, Kryo kryo) {
            super(inputStream);
            this.kryo = kryo;
        }

        @Override // java.io.ObjectInputStream
        public Class resolveClass(ObjectStreamClass objectStreamClass) {
            try {
                try {
                    return Class.forName(objectStreamClass.getName(), false, this.kryo.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    return super.resolveClass(objectStreamClass);
                }
            } catch (IOException e) {
                C3073.m6909("Could not load class: ", objectStreamClass.getName(), e);
                return null;
            } catch (ClassNotFoundException e2) {
                C3073.m6909("Class not found: ", objectStreamClass.getName(), e2);
                return null;
            }
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class cls) {
        try {
            ObjectMap graphContext = kryo.getGraphContext();
            ObjectInputStream objectInputStreamWithKryoClassLoader = (ObjectInputStream) graphContext.get(this);
            if (objectInputStreamWithKryoClassLoader == null) {
                objectInputStreamWithKryoClassLoader = new ObjectInputStreamWithKryoClassLoader(input, kryo);
                graphContext.put(this, objectInputStreamWithKryoClassLoader);
            }
            return objectInputStreamWithKryoClassLoader.readObject();
        } catch (Exception e) {
            throw new KryoException("Error during Java deserialization.", e);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        try {
            ObjectMap graphContext = kryo.getGraphContext();
            ObjectOutputStream objectOutputStream = (ObjectOutputStream) graphContext.get(this);
            if (objectOutputStream == null) {
                objectOutputStream = new ObjectOutputStream(output);
                graphContext.put(this, objectOutputStream);
            }
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
        } catch (Exception e) {
            throw new KryoException("Error during Java serialization.", e);
        }
    }
}
