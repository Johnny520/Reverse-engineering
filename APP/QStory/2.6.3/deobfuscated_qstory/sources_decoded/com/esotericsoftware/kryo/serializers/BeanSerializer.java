package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.MethodAccess;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BeanSerializer<T> extends Serializer<T> {
    static final Object[] noArgs = new Object[0];
    Object access;
    private CachedProperty[] properties;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class CachedProperty<X> {
        Method getMethod;
        int getterAccessIndex;
        String name;
        Serializer serializer;
        Method setMethod;
        Class setMethodType;
        int setterAccessIndex;

        public CachedProperty() {
        }

        public Object get(Object obj) {
            Object obj2 = BeanSerializer.this.access;
            return obj2 != null ? ((MethodAccess) obj2).invoke(obj, this.getterAccessIndex, new Object[0]) : this.getMethod.invoke(obj, BeanSerializer.noArgs);
        }

        public void set(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
            Object obj3 = BeanSerializer.this.access;
            if (obj3 != null) {
                ((MethodAccess) obj3).invoke(obj, this.setterAccessIndex, obj2);
            } else {
                this.setMethod.invoke(obj, obj2);
            }
        }

        public String toString() {
            return this.name;
        }
    }

    public BeanSerializer(Kryo kryo, Class cls) {
        try {
            PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(cls).getPropertyDescriptors();
            Arrays.sort(propertyDescriptors, new Comparator<PropertyDescriptor>() { // from class: com.esotericsoftware.kryo.serializers.BeanSerializer.1
                @Override // java.util.Comparator
                public int compare(PropertyDescriptor propertyDescriptor, PropertyDescriptor propertyDescriptor2) {
                    return propertyDescriptor.getName().compareTo(propertyDescriptor2.getName());
                }
            });
            ArrayList arrayList = new ArrayList(propertyDescriptors.length);
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                String name = propertyDescriptor.getName();
                if (!name.equals("class")) {
                    Method readMethod = propertyDescriptor.getReadMethod();
                    Method writeMethod = propertyDescriptor.getWriteMethod();
                    if (readMethod != null && writeMethod != null) {
                        Class<?> returnType = readMethod.getReturnType();
                        Serializer serializer = kryo.isFinal(returnType) ? kryo.getRegistration(returnType).getSerializer() : null;
                        CachedProperty cachedProperty = new CachedProperty();
                        cachedProperty.name = name;
                        cachedProperty.getMethod = readMethod;
                        cachedProperty.setMethod = writeMethod;
                        cachedProperty.serializer = serializer;
                        cachedProperty.setMethodType = writeMethod.getParameterTypes()[0];
                        arrayList.add(cachedProperty);
                    }
                }
            }
            this.properties = (CachedProperty[]) arrayList.toArray(new CachedProperty[arrayList.size()]);
            try {
                this.access = MethodAccess.get(cls);
                int length = this.properties.length;
                for (int i = 0; i < length; i++) {
                    CachedProperty cachedProperty2 = this.properties[i];
                    cachedProperty2.getterAccessIndex = ((MethodAccess) this.access).getIndex(cachedProperty2.getMethod.getName(), cachedProperty2.getMethod.getParameterTypes());
                    cachedProperty2.setterAccessIndex = ((MethodAccess) this.access).getIndex(cachedProperty2.setMethod.getName(), cachedProperty2.setMethod.getParameterTypes());
                }
            } catch (Throwable unused) {
            }
        } catch (IntrospectionException e) {
            throw new KryoException("Error getting bean info.", e);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T copy(Kryo kryo, T t) {
        T t2 = (T) kryo.newInstance(t.getClass());
        int length = this.properties.length;
        for (int i = 0; i < length; i++) {
            CachedProperty cachedProperty = this.properties[i];
            try {
                cachedProperty.set(t2, cachedProperty.get(t));
            } catch (KryoException e) {
                e.addTrace(cachedProperty + " (" + t2.getClass().getName() + ")");
                throw e;
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("Error copying bean property: ");
                sb.append(cachedProperty);
                C3074.m6895(sb, t2.getClass().getName(), e2);
                return null;
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                kryoException.addTrace(cachedProperty + " (" + t2.getClass().getName() + ")");
                throw kryoException;
            }
        }
        return t2;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        T t = (T) kryo.newInstance(cls);
        kryo.reference(t);
        int length = this.properties.length;
        for (int i = 0; i < length; i++) {
            CachedProperty cachedProperty = this.properties[i];
            try {
                if (Log.TRACE) {
                    Log.trace("kryo", "Read property: " + cachedProperty + " (" + t.getClass() + ")");
                }
                Serializer serializer = cachedProperty.serializer;
                cachedProperty.set(t, serializer != null ? kryo.readObjectOrNull(input, cachedProperty.setMethodType, serializer) : kryo.readClassAndObject(input));
            } catch (KryoException e) {
                e.addTrace(cachedProperty + " (" + t.getClass().getName() + ")");
                throw e;
            } catch (IllegalAccessException e2) {
                StringBuilder sb = new StringBuilder("Error accessing setter method: ");
                sb.append(cachedProperty);
                C3074.m6895(sb, t.getClass().getName(), e2);
                return null;
            } catch (InvocationTargetException e3) {
                StringBuilder sb2 = new StringBuilder("Error invoking setter method: ");
                sb2.append(cachedProperty);
                C3074.m6895(sb2, t.getClass().getName(), e3);
                return null;
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                kryoException.addTrace(cachedProperty + " (" + t.getClass().getName() + ")");
                throw kryoException;
            }
        }
        return t;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t) {
        Class<?> cls = t.getClass();
        int length = this.properties.length;
        for (int i = 0; i < length; i++) {
            CachedProperty cachedProperty = this.properties[i];
            try {
                if (Log.TRACE) {
                    Log.trace("kryo", "Write property: " + cachedProperty + " (" + cls.getName() + ")");
                }
                Object obj = cachedProperty.get(t);
                Serializer serializer = cachedProperty.serializer;
                if (serializer != null) {
                    kryo.writeObjectOrNull(output, obj, serializer);
                } else {
                    kryo.writeClassAndObject(output, obj);
                }
            } catch (KryoException e) {
                e.addTrace(cachedProperty + " (" + cls.getName() + ")");
                throw e;
            } catch (IllegalAccessException e2) {
                StringBuilder sb = new StringBuilder("Error accessing getter method: ");
                sb.append(cachedProperty);
                C3074.m6895(sb, cls.getName(), e2);
                return;
            } catch (InvocationTargetException e3) {
                StringBuilder sb2 = new StringBuilder("Error invoking getter method: ");
                sb2.append(cachedProperty);
                C3074.m6895(sb2, cls.getName(), e3);
                return;
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                kryoException.addTrace(cachedProperty + " (" + cls.getName() + ")");
                throw kryoException;
            }
        }
    }
}
