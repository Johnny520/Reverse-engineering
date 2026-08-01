package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.p006io.Input;
import com.esotericsoftware.kryo.p006io.Output;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class RecordSerializer<T> extends ImmutableSerializer<T> {
    private static final ClassValue<Constructor<?>> CONSTRUCTOR;
    private static final Method GET_NAME;
    private static final Method GET_RECORD_COMPONENTS;
    private static final Method GET_TYPE;
    private static final Method IS_RECORD;
    private static final ClassValue<RecordComponent[]> RECORD_COMPONENTS;
    private boolean fixedFieldTypes = false;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class RecordComponent {
        private final Method getter;
        private final int index;
        private final String name;
        private final Class<?> recordType;
        private final Class<?> type;

        public RecordComponent(Class<?> cls, String str, Class<?> cls2, int i) {
            this.recordType = cls;
            this.name = str;
            this.type = cls2;
            this.index = i;
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, null);
                this.getter = declaredMethod;
                if (declaredMethod.isAccessible()) {
                    return;
                }
                declaredMethod.setAccessible(true);
            } catch (Exception e) {
                KryoException kryoException = new KryoException(e);
                kryoException.addTrace("Could not retrieve record component getter (" + cls.getName() + ")");
                throw kryoException;
            }
        }

        public Object getValue(Object obj) {
            try {
                return this.getter.invoke(obj, null);
            } catch (Exception e) {
                KryoException kryoException = new KryoException(e);
                kryoException.addTrace("Could not retrieve record component value (" + this.recordType.getName() + ")");
                throw kryoException;
            }
        }

        public int index() {
            return this.index;
        }

        public String name() {
            return this.name;
        }

        public Class<?> type() {
            return this.type;
        }
    }

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4 = null;
        try {
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            Method declaredMethod = Class.class.getDeclaredMethod("isRecord", null);
            method = Class.class.getMethod("getRecordComponents", null);
            method3 = cls.getMethod("getName", null);
            method2 = cls.getMethod("getType", null);
            method4 = declaredMethod;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            method2 = null;
            method3 = null;
        }
        IS_RECORD = method4;
        GET_RECORD_COMPONENTS = method;
        GET_NAME = method3;
        GET_TYPE = method2;
        CONSTRUCTOR = new ClassValue<Constructor<?>>() { // from class: com.esotericsoftware.kryo.serializers.RecordSerializer.1
            @Override // java.lang.ClassValue
            /* JADX INFO: renamed from: computeValue, reason: avoid collision after fix types in other method */
            public Constructor<?> computeValue2(Class<?> cls2) {
                return RecordSerializer.getCanonicalConstructor(cls2, RecordSerializer.recordComponents(cls2, Comparator.comparing(new C3905(1))));
            }

            @Override // java.lang.ClassValue
            public /* bridge */ /* synthetic */ Constructor<?> computeValue(Class cls2) {
                return computeValue2((Class<?>) cls2);
            }
        };
        RECORD_COMPONENTS = new ClassValue<RecordComponent[]>() { // from class: com.esotericsoftware.kryo.serializers.RecordSerializer.2
            @Override // java.lang.ClassValue
            /* JADX INFO: renamed from: computeValue, reason: avoid collision after fix types in other method */
            public RecordComponent[] computeValue2(Class<?> cls2) {
                return RecordSerializer.recordComponents(cls2, Comparator.comparing(new C3905(2)));
            }

            @Override // java.lang.ClassValue
            public /* bridge */ /* synthetic */ RecordComponent[] computeValue(Class cls2) {
                return computeValue2((Class<?>) cls2);
            }
        };
    }

    public RecordSerializer(Class<T> cls) {
        if (isRecord(cls)) {
            return;
        }
        throw new KryoException(cls + " is not a record");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> Constructor<T> getCanonicalConstructor(Class<T> cls, RecordComponent[] recordComponentArr) {
        try {
            return getCanonicalConstructor(cls, (Class<?>[]) Arrays.stream(recordComponentArr).map(new C3905(0)).toArray(new C3904()));
        } catch (Throwable th) {
            KryoException kryoException = new KryoException(th);
            kryoException.addTrace("Could not retrieve record canonical constructor (" + cls.getName() + ")");
            throw kryoException;
        }
    }

    private T invokeCanonicalConstructor(Class<? extends T> cls, Object[] objArr) {
        try {
            return (T) ((Constructor) CONSTRUCTOR.get(cls)).newInstance(objArr);
        } catch (Throwable th) {
            KryoException kryoException = new KryoException(th);
            kryoException.addTrace("Could not construct type (" + cls.getName() + ")");
            throw kryoException;
        }
    }

    private boolean isRecord(Class<?> cls) {
        return ((Boolean) IS_RECORD.invoke(cls, null)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class[] lambda$getCanonicalConstructor$0(int i) {
        return new Class[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> RecordComponent[] recordComponents(Class<T> cls, Comparator<RecordComponent> comparator) {
        try {
            Object[] objArr = (Object[]) GET_RECORD_COMPONENTS.invoke(cls, null);
            RecordComponent[] recordComponentArr = new RecordComponent[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                recordComponentArr[i] = new RecordComponent(cls, (String) GET_NAME.invoke(obj, null), (Class) GET_TYPE.invoke(obj, null), i);
            }
            if (comparator != null) {
                Arrays.sort(recordComponentArr, comparator);
            }
            return recordComponentArr;
        } catch (Throwable th) {
            KryoException kryoException = new KryoException(th);
            kryoException.addTrace("Could not retrieve record components (" + cls.getName() + ")");
            throw kryoException;
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        RecordComponent[] recordComponentArr = (RecordComponent[]) RECORD_COMPONENTS.get(cls);
        Object[] objArr = new Object[recordComponentArr.length];
        for (RecordComponent recordComponent : recordComponentArr) {
            String strName = recordComponent.name();
            Class clsType = recordComponent.type();
            try {
                if (Log.TRACE) {
                    Log.trace("kryo", "Read property: " + strName + " (" + cls.getName() + ")");
                }
                if (clsType.isPrimitive()) {
                    objArr[recordComponent.index()] = kryo.readObject(input, clsType);
                } else if (this.fixedFieldTypes || kryo.isFinal(clsType)) {
                    objArr[recordComponent.index()] = kryo.readObjectOrNull(input, clsType);
                } else {
                    objArr[recordComponent.index()] = kryo.readClassAndObject(input);
                }
            } catch (KryoException e) {
                StringBuilder sbM12143 = AbstractC7012.m12143(strName, " (");
                sbM12143.append(cls.getName());
                sbM12143.append(")");
                e.addTrace(sbM12143.toString());
                throw e;
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                StringBuilder sbM121432 = AbstractC7012.m12143(strName, " (");
                sbM121432.append(cls.getName());
                sbM121432.append(")");
                kryoException.addTrace(sbM121432.toString());
                throw kryoException;
            }
        }
        return invokeCanonicalConstructor(cls, objArr);
    }

    public void setFixedFieldTypes(boolean z) {
        this.fixedFieldTypes = z;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t) {
        for (RecordComponent recordComponent : (RecordComponent[]) RECORD_COMPONENTS.get(t.getClass())) {
            Class<?> clsType = recordComponent.type();
            String strName = recordComponent.name();
            try {
                if (Log.TRACE) {
                    Log.trace("kryo", "Write property: " + strName + " (" + clsType.getName() + ")");
                }
                if (clsType.isPrimitive()) {
                    kryo.writeObject(output, recordComponent.getValue(t));
                } else if (this.fixedFieldTypes || kryo.isFinal(clsType)) {
                    kryo.writeObjectOrNull(output, recordComponent.getValue(t), clsType);
                } else {
                    kryo.writeClassAndObject(output, recordComponent.getValue(t));
                }
            } catch (KryoException e) {
                StringBuilder sbM12143 = AbstractC7012.m12143(strName, " (");
                sbM12143.append(clsType.getName());
                sbM12143.append(")");
                e.addTrace(sbM12143.toString());
                throw e;
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                StringBuilder sbM121432 = AbstractC7012.m12143(strName, " (");
                sbM121432.append(clsType.getName());
                sbM121432.append(")");
                kryoException.addTrace(sbM121432.toString());
                throw kryoException;
            }
        }
    }

    @Deprecated(forRemoval = true)
    public RecordSerializer() {
    }

    private static <T> Constructor<T> getCanonicalConstructor(Class<T> cls, Class<?>[] clsArr) throws NoSuchMethodException {
        try {
            Constructor<T> constructor = cls.getConstructor(clsArr);
            if (!constructor.canAccess(null)) {
                constructor.setAccessible(true);
            }
            return constructor;
        } catch (Exception unused) {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        }
    }
}
