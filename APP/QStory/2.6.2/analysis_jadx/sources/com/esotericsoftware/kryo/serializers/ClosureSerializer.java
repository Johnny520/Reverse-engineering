package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ClosureSerializer extends Serializer {
    private static Field capturingClass;
    private static Method readResolve;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class Closure {
    }

    public ClosureSerializer() {
        if (readResolve == null) {
            try {
                Method declaredMethod = SerializedLambda.class.getDeclaredMethod("readResolve", null);
                readResolve = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e) {
                readResolve = null;
                Log.warn("Unable to obtain SerializedLambda#readResolve via reflection. Falling back on resolving lambdas via capturing class.", e);
            }
        }
        if (capturingClass == null) {
            try {
                Field declaredField = SerializedLambda.class.getDeclaredField("capturingClass");
                capturingClass = declaredField;
                declaredField.setAccessible(true);
            } catch (Exception e2) {
                capturingClass = null;
                Log.warn("Unable to obtain SerializedLambda#capturingClass via reflection. Falling back to resolving capturing class via Class.forName.", e2);
            }
        }
    }

    private static Class<?> getCapturingClass(SerializedLambda serializedLambda) {
        Field field = capturingClass;
        if (field != null) {
            try {
                return (Class) field.get(serializedLambda);
            } catch (IllegalAccessException unused) {
            }
        }
        return Class.forName(serializedLambda.getCapturingClass().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
    }

    private Object readResolve(Class<?> cls, SerializedLambda serializedLambda) throws NoSuchMethodException {
        Method method = readResolve;
        if (method != null) {
            return method.invoke(serializedLambda, null);
        }
        Method declaredMethod = cls.getDeclaredMethod("$deserializeLambda$", SerializedLambda.class);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(null, serializedLambda);
    }

    private SerializedLambda toSerializedLambda(Object obj) {
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod("writeReplace", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(obj, null);
            try {
                return (SerializedLambda) objInvoke;
            } catch (Exception e) {
                C3073.m6909("writeReplace must return a SerializedLambda: ", Util.className(objInvoke.getClass()), e);
                return null;
            }
        } catch (Exception e2) {
            if (obj instanceof Serializable) {
                throw new KryoException("Error serializing closure.", e2);
            }
            throw new KryoException("Closure must implement java.io.Serializable.", e2);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object copy(Kryo kryo, Object obj) {
        try {
            SerializedLambda serializedLambda = toSerializedLambda(obj);
            return readResolve(getCapturingClass(serializedLambda), serializedLambda);
        } catch (Exception e) {
            throw new KryoException("Error copying closure.", e);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class cls) {
        int varInt = input.readVarInt(true);
        Object[] objArr = new Object[varInt];
        for (int i = 0; i < varInt; i++) {
            objArr[i] = kryo.readClassAndObject(input);
        }
        Class type = kryo.readClass(input).getType();
        try {
            return readResolve(type, new SerializedLambda(type, input.readString(), input.readString(), input.readString(), input.readVarInt(true), input.readString(), input.readString(), input.readString(), input.readString(), objArr));
        } catch (Exception e) {
            throw new KryoException("Error reading closure.", e);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        SerializedLambda serializedLambda = toSerializedLambda(obj);
        int capturedArgCount = serializedLambda.getCapturedArgCount();
        output.writeVarInt(capturedArgCount, true);
        for (int i = 0; i < capturedArgCount; i++) {
            kryo.writeClassAndObject(output, serializedLambda.getCapturedArg(i));
        }
        try {
            kryo.writeClass(output, getCapturingClass(serializedLambda));
            output.writeString(serializedLambda.getFunctionalInterfaceClass());
            output.writeString(serializedLambda.getFunctionalInterfaceMethodName());
            output.writeString(serializedLambda.getFunctionalInterfaceMethodSignature());
            output.writeVarInt(serializedLambda.getImplMethodKind(), true);
            output.writeString(serializedLambda.getImplClass());
            output.writeString(serializedLambda.getImplMethodName());
            output.writeString(serializedLambda.getImplMethodSignature());
            output.writeString(serializedLambda.getInstantiatedMethodType());
        } catch (ClassNotFoundException e) {
            throw new KryoException("Error writing closure.", e);
        }
    }
}
