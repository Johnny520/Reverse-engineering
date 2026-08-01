package com.esotericsoftware.kryo;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.ClosureSerializer;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers;
import com.esotericsoftware.kryo.serializers.DefaultSerializers;
import com.esotericsoftware.kryo.serializers.ImmutableCollectionsSerializers;
import com.esotericsoftware.kryo.serializers.MapSerializer;
import com.esotericsoftware.kryo.serializers.OptionalSerializers;
import com.esotericsoftware.kryo.serializers.RecordSerializer;
import com.esotericsoftware.kryo.serializers.TimeSerializers;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.esotericsoftware.kryo.util.DefaultGenerics;
import com.esotericsoftware.kryo.util.DefaultInstantiatorStrategy;
import com.esotericsoftware.kryo.util.Generics;
import com.esotericsoftware.kryo.util.IdentityMap;
import com.esotericsoftware.kryo.util.IntArray;
import com.esotericsoftware.kryo.util.MapReferenceResolver;
import com.esotericsoftware.kryo.util.NoGenerics;
import com.esotericsoftware.kryo.util.ObjectMap;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import p009.AbstractC6183;
import p394.InterfaceC9110;
import p395.InterfaceC9111;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Kryo {
    private static final int DEFAULT_SERIALIZER_SIZE = 68;
    public static final byte NOT_NULL = 1;
    private static final int NO_REF = -2;
    public static final byte NULL = 0;
    private static final int REF = -1;
    private boolean autoReset;
    private ClassLoader classLoader;
    private final ClassResolver classResolver;
    private ObjectMap context;
    private int copyDepth;
    private boolean copyReferences;
    private boolean copyShallow;
    private SerializerFactory defaultSerializer;
    private final ArrayList<DefaultSerializerEntry> defaultSerializers;
    private int depth;
    private Generics generics;
    private ObjectMap graphContext;
    private final int lowPriorityDefaultSerializerCount;
    private int maxDepth;
    private Object needsCopyReference;
    private int nextRegisterID;
    private IdentityMap originalToCopy;
    private Object readObject;
    private final IntArray readReferenceIds;
    private ReferenceResolver referenceResolver;
    private boolean references;
    private boolean registrationRequired;
    private InterfaceC9110 strategy;
    private volatile Thread thread;
    private boolean warnUnregisteredClasses;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class DefaultSerializerEntry {
        final SerializerFactory serializerFactory;
        final Class type;

        public DefaultSerializerEntry(Class cls, SerializerFactory serializerFactory) {
            this.type = cls;
            this.serializerFactory = serializerFactory;
        }
    }

    public Kryo(ClassResolver classResolver, ReferenceResolver referenceResolver) {
        this.defaultSerializer = new SerializerFactory.FieldSerializerFactory();
        ArrayList<DefaultSerializerEntry> arrayList = new ArrayList<>(68);
        this.defaultSerializers = arrayList;
        this.classLoader = getClass().getClassLoader();
        this.strategy = new DefaultInstantiatorStrategy();
        this.registrationRequired = true;
        this.maxDepth = Integer.MAX_VALUE;
        this.autoReset = true;
        this.readReferenceIds = new IntArray(0);
        this.copyReferences = true;
        this.generics = new DefaultGenerics(this);
        if (classResolver == null) {
            C5925.m11310("classResolver cannot be null.");
            throw null;
        }
        this.classResolver = classResolver;
        classResolver.setKryo(this);
        this.referenceResolver = referenceResolver;
        if (referenceResolver != null) {
            referenceResolver.setKryo(this);
            this.references = true;
        }
        addDefaultSerializer(byte[].class, DefaultArraySerializers.ByteArraySerializer.class);
        addDefaultSerializer(char[].class, DefaultArraySerializers.CharArraySerializer.class);
        addDefaultSerializer(short[].class, DefaultArraySerializers.ShortArraySerializer.class);
        addDefaultSerializer(int[].class, DefaultArraySerializers.IntArraySerializer.class);
        addDefaultSerializer(long[].class, DefaultArraySerializers.LongArraySerializer.class);
        addDefaultSerializer(float[].class, DefaultArraySerializers.FloatArraySerializer.class);
        addDefaultSerializer(double[].class, DefaultArraySerializers.DoubleArraySerializer.class);
        addDefaultSerializer(boolean[].class, DefaultArraySerializers.BooleanArraySerializer.class);
        addDefaultSerializer(String[].class, DefaultArraySerializers.StringArraySerializer.class);
        addDefaultSerializer(Object[].class, DefaultArraySerializers.ObjectArraySerializer.class);
        addDefaultSerializer(BigInteger.class, DefaultSerializers.BigIntegerSerializer.class);
        addDefaultSerializer(BigDecimal.class, DefaultSerializers.BigDecimalSerializer.class);
        addDefaultSerializer(Class.class, DefaultSerializers.ClassSerializer.class);
        addDefaultSerializer(Date.class, DefaultSerializers.DateSerializer.class);
        addDefaultSerializer(Enum.class, DefaultSerializers.EnumSerializer.class);
        addDefaultSerializer(EnumSet.class, DefaultSerializers.EnumSetSerializer.class);
        addDefaultSerializer(Currency.class, DefaultSerializers.CurrencySerializer.class);
        addDefaultSerializer(StringBuffer.class, DefaultSerializers.StringBufferSerializer.class);
        addDefaultSerializer(StringBuilder.class, DefaultSerializers.StringBuilderSerializer.class);
        addDefaultSerializer(Collections.EMPTY_LIST.getClass(), DefaultSerializers.CollectionsEmptyListSerializer.class);
        addDefaultSerializer(Collections.EMPTY_MAP.getClass(), DefaultSerializers.CollectionsEmptyMapSerializer.class);
        addDefaultSerializer(Collections.EMPTY_SET.getClass(), DefaultSerializers.CollectionsEmptySetSerializer.class);
        addDefaultSerializer(Collections.singletonList(null).getClass(), DefaultSerializers.CollectionsSingletonListSerializer.class);
        addDefaultSerializer(Collections.singletonMap(null, null).getClass(), DefaultSerializers.CollectionsSingletonMapSerializer.class);
        addDefaultSerializer(Collections.singleton(null).getClass(), DefaultSerializers.CollectionsSingletonSetSerializer.class);
        addDefaultSerializer(TreeSet.class, DefaultSerializers.TreeSetSerializer.class);
        addDefaultSerializer(Collection.class, CollectionSerializer.class);
        addDefaultSerializer(ConcurrentSkipListMap.class, DefaultSerializers.ConcurrentSkipListMapSerializer.class);
        addDefaultSerializer(TreeMap.class, DefaultSerializers.TreeMapSerializer.class);
        addDefaultSerializer(Map.class, MapSerializer.class);
        addDefaultSerializer(TimeZone.class, DefaultSerializers.TimeZoneSerializer.class);
        addDefaultSerializer(Calendar.class, DefaultSerializers.CalendarSerializer.class);
        addDefaultSerializer(Locale.class, DefaultSerializers.LocaleSerializer.class);
        addDefaultSerializer(Charset.class, DefaultSerializers.CharsetSerializer.class);
        addDefaultSerializer(URL.class, DefaultSerializers.URLSerializer.class);
        addDefaultSerializer(Arrays.asList(new Object[0]).getClass(), DefaultSerializers.ArraysAsListSerializer.class);
        addDefaultSerializer(Void.TYPE, new DefaultSerializers.VoidSerializer());
        addDefaultSerializer(PriorityQueue.class, new DefaultSerializers.PriorityQueueSerializer());
        addDefaultSerializer(BitSet.class, new DefaultSerializers.BitSetSerializer());
        addDefaultSerializer(KryoSerializable.class, DefaultSerializers.KryoSerializableSerializer.class);
        OptionalSerializers.addDefaultSerializers(this);
        TimeSerializers.addDefaultSerializers(this);
        ImmutableCollectionsSerializers.addDefaultSerializers(this);
        if (Util.isClassAvailable("java.lang.Record")) {
            addDefaultSerializer("java.lang.Record", RecordSerializer.class);
        }
        this.lowPriorityDefaultSerializerCount = arrayList.size();
        register(Integer.TYPE, new DefaultSerializers.IntSerializer());
        register(String.class, new DefaultSerializers.StringSerializer());
        register(Float.TYPE, new DefaultSerializers.FloatSerializer());
        register(Boolean.TYPE, new DefaultSerializers.BooleanSerializer());
        register(Byte.TYPE, new DefaultSerializers.ByteSerializer());
        register(Character.TYPE, new DefaultSerializers.CharSerializer());
        register(Short.TYPE, new DefaultSerializers.ShortSerializer());
        register(Long.TYPE, new DefaultSerializers.LongSerializer());
        register(Double.TYPE, new DefaultSerializers.DoubleSerializer());
    }

    private void beginObject() {
        if (Log.DEBUG) {
            if (this.depth == 0) {
                this.thread = Thread.currentThread();
            } else if (this.thread != Thread.currentThread()) {
                throw new ConcurrentModificationException("Kryo must not be accessed concurrently by multiple threads.");
            }
        }
        int i = this.depth;
        if (i != this.maxDepth) {
            this.depth = i + 1;
            return;
        }
        throw new KryoException("Max depth exceeded: " + this.depth);
    }

    private int insertDefaultSerializer(Class cls, SerializerFactory serializerFactory) {
        int size = this.defaultSerializers.size() - this.lowPriorityDefaultSerializerCount;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList<DefaultSerializerEntry> arrayList = this.defaultSerializers;
            if (i >= size) {
                arrayList.add(i2, new DefaultSerializerEntry(cls, serializerFactory));
                return i2;
            }
            if (cls.isAssignableFrom(arrayList.get(i).type)) {
                i2 = i + 1;
            }
            i++;
        }
    }

    public void addDefaultSerializer(Class cls, Serializer serializer) {
        if (cls == null) {
            C5925.m11310("type cannot be null.");
        } else if (serializer != null) {
            insertDefaultSerializer(cls, new SerializerFactory.SingletonSerializerFactory(serializer));
        } else {
            C5925.m11310("serializer cannot be null.");
        }
    }

    public <T> T copy(T t) {
        if (t == null) {
            return null;
        }
        if (this.copyShallow) {
            return t;
        }
        this.copyDepth++;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t2 = (T) this.originalToCopy.get(t);
            if (t2 != null) {
                int i = this.copyDepth - 1;
                this.copyDepth = i;
                if (i == 0) {
                    reset();
                }
                return t2;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t;
            }
            T t3 = t instanceof KryoCopyable ? (T) ((KryoCopyable) t).copy(this) : (T) getSerializer(t.getClass()).copy(this, t);
            if (this.needsCopyReference != null) {
                reference(t3);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Copy", t3, -1);
            }
            int i2 = this.copyDepth - 1;
            this.copyDepth = i2;
            if (i2 == 0) {
                reset();
            }
            return t3;
        } catch (Throwable th) {
            int i3 = this.copyDepth - 1;
            this.copyDepth = i3;
            if (i3 == 0) {
                reset();
            }
            throw th;
        }
    }

    public <T> T copyShallow(T t) {
        if (t == null) {
            return null;
        }
        this.copyDepth++;
        this.copyShallow = true;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t2 = (T) this.originalToCopy.get(t);
            if (t2 != null) {
                this.copyShallow = false;
                int i = this.copyDepth - 1;
                this.copyDepth = i;
                if (i == 0) {
                    reset();
                }
                return t2;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t;
            }
            T t3 = t instanceof KryoCopyable ? (T) ((KryoCopyable) t).copy(this) : (T) getSerializer(t.getClass()).copy(this, t);
            if (this.needsCopyReference != null) {
                reference(t3);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Shallow copy", t3, -1);
            }
            this.copyShallow = false;
            int i2 = this.copyDepth - 1;
            this.copyDepth = i2;
            if (i2 == 0) {
                reset();
            }
            return t3;
        } catch (Throwable th) {
            this.copyShallow = false;
            int i3 = this.copyDepth - 1;
            this.copyDepth = i3;
            if (i3 == 0) {
                reset();
            }
            throw th;
        }
    }

    public ClassLoader getClassLoader() {
        return this.classLoader;
    }

    public ClassResolver getClassResolver() {
        return this.classResolver;
    }

    public ObjectMap getContext() {
        if (this.context == null) {
            this.context = new ObjectMap();
        }
        return this.context;
    }

    public Serializer getDefaultSerializer(Class cls) {
        if (cls == null) {
            C5925.m11310("type cannot be null.");
            return null;
        }
        Serializer defaultSerializerForAnnotatedType = getDefaultSerializerForAnnotatedType(cls);
        if (defaultSerializerForAnnotatedType != null) {
            return defaultSerializerForAnnotatedType;
        }
        int size = this.defaultSerializers.size();
        for (int i = 0; i < size; i++) {
            DefaultSerializerEntry defaultSerializerEntry = this.defaultSerializers.get(i);
            if (defaultSerializerEntry.type.isAssignableFrom(cls) && defaultSerializerEntry.serializerFactory.isSupported(cls)) {
                return defaultSerializerEntry.serializerFactory.newSerializer(this, cls);
            }
        }
        return newDefaultSerializer(cls);
    }

    public Serializer getDefaultSerializerForAnnotatedType(Class cls) {
        if (!cls.isAnnotationPresent(DefaultSerializer.class)) {
            return null;
        }
        DefaultSerializer defaultSerializer = (DefaultSerializer) cls.getAnnotation(DefaultSerializer.class);
        return Util.newFactory(defaultSerializer.serializerFactory(), defaultSerializer.value()).newSerializer(this, cls);
    }

    public int getDepth() {
        return this.depth;
    }

    public Generics getGenerics() {
        return this.generics;
    }

    public ObjectMap getGraphContext() {
        if (this.graphContext == null) {
            this.graphContext = new ObjectMap();
        }
        return this.graphContext;
    }

    public InterfaceC9110 getInstantiatorStrategy() {
        return this.strategy;
    }

    public int getNextRegistrationId() {
        while (true) {
            int i = this.nextRegisterID;
            if (i == NO_REF) {
                throw new KryoException("No registration IDs are available.");
            }
            Registration registration = this.classResolver.getRegistration(i);
            int i2 = this.nextRegisterID;
            if (registration == null) {
                return i2;
            }
            this.nextRegisterID = i2 + 1;
        }
    }

    public IdentityMap getOriginalToCopyMap() {
        return this.originalToCopy;
    }

    public ReferenceResolver getReferenceResolver() {
        return this.referenceResolver;
    }

    public boolean getReferences() {
        return this.references;
    }

    public Registration getRegistration(Class cls) {
        if (cls == null) {
            C5925.m11310("type cannot be null.");
            return null;
        }
        Registration registration = this.classResolver.getRegistration(cls);
        if (registration == null) {
            if (!isProxy(cls)) {
                if (!cls.isEnum() && Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
                    while (true) {
                        cls = cls.getSuperclass();
                        if (cls == null) {
                            break;
                        }
                        if (cls.isEnum()) {
                            registration = this.classResolver.getRegistration(cls);
                            break;
                        }
                    }
                } else if (EnumSet.class.isAssignableFrom(cls)) {
                    registration = this.classResolver.getRegistration(EnumSet.class);
                } else if (isClosure(cls)) {
                    registration = this.classResolver.getRegistration(ClosureSerializer.Closure.class);
                }
            } else {
                registration = getRegistration(InvocationHandler.class);
            }
            if (registration == null) {
                if (this.registrationRequired) {
                    C5925.m11310(unregisteredClassMessage(cls));
                    return null;
                }
                if (Log.WARN && this.warnUnregisteredClasses) {
                    Log.warn(unregisteredClassMessage(cls));
                }
                return this.classResolver.registerImplicit(cls);
            }
        }
        return registration;
    }

    public Serializer getSerializer(Class cls) {
        return getRegistration(cls).getSerializer();
    }

    public boolean getWarnUnregisteredClasses() {
        return this.warnUnregisteredClasses;
    }

    public boolean isClosure(Class cls) {
        if (cls != null) {
            return cls.isSynthetic() && cls.getName().indexOf(47) >= 0;
        }
        C5925.m11310("type cannot be null.");
        return false;
    }

    public boolean isFinal(Class cls) {
        if (cls != null) {
            return cls.isArray() ? Modifier.isFinal(Util.getElementClass(cls).getModifiers()) : Modifier.isFinal(cls.getModifiers());
        }
        C5925.m11310("type cannot be null.");
        return false;
    }

    public boolean isProxy(Class cls) {
        if (cls != null) {
            return Proxy.isProxyClass(cls);
        }
        C5925.m11310("type cannot be null.");
        return false;
    }

    public boolean isRegistrationRequired() {
        return this.registrationRequired;
    }

    public Serializer newDefaultSerializer(Class cls) {
        return this.defaultSerializer.newSerializer(this, cls);
    }

    public <T> T newInstance(Class<T> cls) {
        Registration registration = getRegistration(cls);
        InterfaceC9111 instantiator = registration.getInstantiator();
        if (instantiator == null) {
            instantiator = newInstantiator(cls);
            registration.setInstantiator(instantiator);
        }
        return (T) instantiator.newInstance();
    }

    public InterfaceC9111 newInstantiator(Class cls) {
        return this.strategy.newInstantiatorOf(cls);
    }

    public Registration readClass(Input input) {
        if (input == null) {
            C5925.m11310("input cannot be null.");
            return null;
        }
        try {
            return this.classResolver.readClass(input);
        } finally {
            if (this.depth == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public Object readClassAndObject(Input input) {
        Object obj;
        if (input == null) {
            C5925.m11310("input cannot be null.");
            return null;
        }
        beginObject();
        try {
            Registration registration = readClass(input);
            if (registration == null) {
                return null;
            }
            Class type = registration.getType();
            if (this.references) {
                int referenceOrNull = readReferenceOrNull(input, type, false);
                if (referenceOrNull == -1) {
                    Object obj2 = this.readObject;
                    int i = this.depth - 1;
                    this.depth = i;
                    if (i == 0 && this.autoReset) {
                        reset();
                    }
                    return obj2;
                }
                obj = registration.getSerializer().read(this, input, type);
                if (referenceOrNull == this.readReferenceIds.size) {
                    reference(obj);
                }
            } else {
                obj = registration.getSerializer().read(this, input, type);
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Read", obj, input.position());
            }
            int i2 = this.depth - 1;
            this.depth = i2;
            if (i2 == 0 && this.autoReset) {
                reset();
            }
            return obj;
        } finally {
            int i3 = this.depth - 1;
            this.depth = i3;
            if (i3 == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public <T> T readObject(Input input, Class<T> cls) {
        T t;
        if (input == null) {
            C5925.m11310("input cannot be null.");
            return null;
        }
        if (cls == null) {
            C5925.m11310("type cannot be null.");
            return null;
        }
        beginObject();
        try {
            if (this.references) {
                int referenceOrNull = readReferenceOrNull(input, cls, false);
                if (referenceOrNull == -1) {
                    return (T) this.readObject;
                }
                t = (T) getRegistration(cls).getSerializer().read(this, input, cls);
                if (referenceOrNull == this.readReferenceIds.size) {
                    reference(t);
                }
            } else {
                t = (T) getRegistration(cls).getSerializer().read(this, input, cls);
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Read", t, input.position());
            }
            int i = this.depth - 1;
            this.depth = i;
            if (i == 0 && this.autoReset) {
                reset();
            }
            return t;
        } finally {
            int i2 = this.depth - 1;
            this.depth = i2;
            if (i2 == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public <T> T readObjectOrNull(Input input, Class<T> cls) {
        T t;
        if (input == null) {
            C5925.m11310("input cannot be null.");
            return null;
        }
        if (cls == null) {
            C5925.m11310("type cannot be null.");
            return null;
        }
        beginObject();
        try {
            if (this.references) {
                int referenceOrNull = readReferenceOrNull(input, cls, true);
                if (referenceOrNull == -1) {
                    return (T) this.readObject;
                }
                t = (T) getRegistration(cls).getSerializer().read(this, input, cls);
                if (referenceOrNull == this.readReferenceIds.size) {
                    reference(t);
                }
            } else {
                Serializer serializer = getRegistration(cls).getSerializer();
                if (!serializer.getAcceptsNull() && input.readByte() == 0) {
                    if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                        Util.log("Read", null, input.position());
                    }
                    int i = this.depth - 1;
                    this.depth = i;
                    if (i == 0 && this.autoReset) {
                        reset();
                    }
                    return null;
                }
                t = (T) serializer.read(this, input, cls);
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Read", t, input.position());
            }
            int i2 = this.depth - 1;
            this.depth = i2;
            if (i2 == 0 && this.autoReset) {
                reset();
            }
            return t;
        } finally {
            int i3 = this.depth - 1;
            this.depth = i3;
            if (i3 == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public int readReferenceOrNull(Input input, Class cls, boolean z) {
        int varInt;
        if (cls.isPrimitive()) {
            cls = Util.getWrapperClass(cls);
        }
        boolean zUseReferences = this.referenceResolver.useReferences(cls);
        if (z) {
            varInt = input.readVarInt(true);
            if (varInt == 0) {
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", null, input.position());
                }
                this.readObject = null;
                return -1;
            }
            if (!zUseReferences) {
                this.readReferenceIds.add(NO_REF);
                return this.readReferenceIds.size;
            }
        } else {
            if (!zUseReferences) {
                this.readReferenceIds.add(NO_REF);
                return this.readReferenceIds.size;
            }
            varInt = input.readVarInt(true);
        }
        if (varInt == 1) {
            if (Log.TRACE) {
                Log.trace("kryo", "Read: <not null>" + Util.pos(input.position()));
            }
            int iNextReadId = this.referenceResolver.nextReadId(cls);
            if (Log.TRACE) {
                StringBuilder sbM150 = AbstractC0053.m150(iNextReadId, "Read initial reference ", ": ");
                sbM150.append(Util.className(cls));
                sbM150.append(Util.pos(input.position()));
                Log.trace("kryo", sbM150.toString());
            }
            this.readReferenceIds.add(iNextReadId);
            return this.readReferenceIds.size;
        }
        int i = varInt + NO_REF;
        try {
            this.readObject = this.referenceResolver.getReadObject(cls, i);
            if (Log.DEBUG) {
                StringBuilder sbM1502 = AbstractC0053.m150(i, "Read reference ", ": ");
                sbM1502.append(Util.string(this.readObject));
                sbM1502.append(Util.pos(input.position()));
                Log.debug("kryo", sbM1502.toString());
            }
            return -1;
        } catch (Exception e) {
            throw new KryoException("Unable to resolve reference for " + Util.className(cls) + " with id: " + i, e);
        }
    }

    public void reference(Object obj) {
        int iPop;
        if (this.copyDepth <= 0) {
            if (!this.references || obj == null || (iPop = this.readReferenceIds.pop()) == NO_REF) {
                return;
            }
            this.referenceResolver.setReadObject(iPop, obj);
            return;
        }
        Object obj2 = this.needsCopyReference;
        if (obj2 != null) {
            if (obj == null) {
                C5925.m11310("object cannot be null.");
            } else {
                this.originalToCopy.put(obj2, obj);
                this.needsCopyReference = null;
            }
        }
    }

    public Registration register(Registration registration) {
        int id = registration.getId();
        if (id < 0) {
            C5925.m11310(AbstractC6183.m11588(id, "id must be > 0: "));
            return null;
        }
        Registration registrationUnregister = this.classResolver.unregister(id);
        if (Log.DEBUG && registrationUnregister != null && registrationUnregister.getType() != registration.getType()) {
            Log.debug("kryo", "Registration overwritten: " + registrationUnregister + " -> " + registration);
        }
        return this.classResolver.register(registration);
    }

    public void reset() {
        this.depth = 0;
        ObjectMap objectMap = this.graphContext;
        if (objectMap != null) {
            objectMap.clear(2048);
        }
        this.classResolver.reset();
        if (this.references) {
            this.referenceResolver.reset();
            this.readObject = null;
        }
        this.copyDepth = 0;
        IdentityMap identityMap = this.originalToCopy;
        if (identityMap != null) {
            identityMap.clear(2048);
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Object graph complete.");
        }
    }

    public void setAutoReset(boolean z) {
        this.autoReset = z;
    }

    public void setClassLoader(ClassLoader classLoader) {
        if (classLoader != null) {
            this.classLoader = classLoader;
        } else {
            C5925.m11310("classLoader cannot be null.");
        }
    }

    public void setCopyReferences(boolean z) {
        this.copyReferences = z;
    }

    public void setDefaultSerializer(Class<? extends Serializer> cls) {
        if (cls != null) {
            this.defaultSerializer = new SerializerFactory.ReflectionSerializerFactory(cls);
        } else {
            C5925.m11310("serializer cannot be null.");
        }
    }

    public void setInstantiatorStrategy(InterfaceC9110 interfaceC9110) {
        this.strategy = interfaceC9110;
    }

    public void setMaxDepth(int i) {
        if (i > 0) {
            this.maxDepth = i;
        } else {
            C5925.m11310("maxDepth must be > 0.");
        }
    }

    public void setOptimizedGenerics(boolean z) {
        this.generics = z ? new DefaultGenerics(this) : NoGenerics.INSTANCE;
    }

    public void setReferenceResolver(ReferenceResolver referenceResolver) {
        if (referenceResolver == null) {
            C5925.m11310("referenceResolver cannot be null.");
            return;
        }
        this.references = true;
        this.referenceResolver = referenceResolver;
        if (Log.TRACE) {
            Log.trace("kryo", "Reference resolver: ".concat(referenceResolver.getClass().getName()));
        }
    }

    public boolean setReferences(boolean z) {
        boolean z2 = this.references;
        if (z == z2) {
            return z;
        }
        if (z2) {
            this.referenceResolver.reset();
            this.readObject = null;
        }
        this.references = z;
        if (z && this.referenceResolver == null) {
            this.referenceResolver = new MapReferenceResolver();
        }
        if (Log.TRACE) {
            Log.trace("kryo", "References: " + z);
        }
        return !z;
    }

    public void setRegistrationRequired(boolean z) {
        this.registrationRequired = z;
        if (Log.TRACE) {
            Log.trace("kryo", "Registration required: " + z);
        }
    }

    public void setWarnUnregisteredClasses(boolean z) {
        this.warnUnregisteredClasses = z;
        if (Log.TRACE) {
            Log.trace("kryo", "Warn unregistered classes: " + z);
        }
    }

    public String unregisteredClassMessage(Class cls) {
        return "Class is not registered: " + Util.className(cls) + "\nNote: To register this class use: kryo.register(" + Util.canonicalName(cls) + ".class);";
    }

    public Registration writeClass(Output output, Class cls) {
        if (output == null) {
            C5925.m11310("output cannot be null.");
            return null;
        }
        try {
            return this.classResolver.writeClass(output, cls);
        } finally {
            if (this.depth == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public void writeClassAndObject(Output output, Object obj) {
        int i;
        boolean z;
        if (output == null) {
            C5925.m11310("output cannot be null.");
            return;
        }
        beginObject();
        try {
            if (obj == null) {
                writeClass(output, null);
                if (i == 0) {
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            Registration registrationWriteClass = writeClass(output, obj.getClass());
            if (this.references && writeReferenceOrNull(output, obj, false)) {
                int i2 = this.depth - 1;
                this.depth = i2;
                if (i2 == 0 && this.autoReset) {
                    reset();
                    return;
                }
                return;
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Write", obj, output.position());
            }
            registrationWriteClass.getSerializer().write(this, output, obj);
            int i3 = this.depth - 1;
            this.depth = i3;
            if (i3 == 0 && this.autoReset) {
                reset();
            }
        } finally {
            i = this.depth - 1;
            this.depth = i;
            if (i == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public void writeObject(Output output, Object obj) {
        int i;
        boolean z;
        if (output == null) {
            C5925.m11310("output cannot be null.");
            return;
        }
        if (obj == null) {
            C5925.m11310("object cannot be null.");
            return;
        }
        beginObject();
        try {
            if (this.references && writeReferenceOrNull(output, obj, false)) {
                if (i == 0) {
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Write", obj, output.position());
            }
            getRegistration(obj.getClass()).getSerializer().write(this, output, obj);
            int i2 = this.depth - 1;
            this.depth = i2;
            if (i2 == 0 && this.autoReset) {
                reset();
            }
        } finally {
            i = this.depth - 1;
            this.depth = i;
            if (i == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public void writeObjectOrNull(Output output, Object obj, Serializer serializer) {
        int i;
        boolean z;
        if (output == null) {
            C5925.m11310("output cannot be null.");
            return;
        }
        if (serializer == null) {
            C5925.m11310("serializer cannot be null.");
            return;
        }
        beginObject();
        try {
            if (this.references) {
                if (writeReferenceOrNull(output, obj, true)) {
                    if (i == 0) {
                        if (z) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
            } else if (!serializer.getAcceptsNull()) {
                if (obj == null) {
                    if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                        Util.log("Write", null, output.position());
                    }
                    output.writeByte((byte) 0);
                    int i2 = this.depth - 1;
                    this.depth = i2;
                    if (i2 == 0 && this.autoReset) {
                        reset();
                        return;
                    }
                    return;
                }
                if (Log.TRACE) {
                    Log.trace("kryo", "Write: <not null>" + Util.pos(output.position()));
                }
                output.writeByte((byte) 1);
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Write", obj, output.position());
            }
            serializer.write(this, output, obj);
            int i3 = this.depth - 1;
            this.depth = i3;
            if (i3 == 0 && this.autoReset) {
                reset();
            }
        } finally {
            i = this.depth - 1;
            this.depth = i;
            if (i == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public boolean writeReferenceOrNull(Output output, Object obj, boolean z) {
        if (obj == null) {
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Write", null, output.position());
            }
            output.writeByte((byte) 0);
            return true;
        }
        if (!this.referenceResolver.useReferences(obj.getClass())) {
            if (z) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Write: <not null>" + Util.pos(output.position()));
                }
                output.writeByte((byte) 1);
            }
            return false;
        }
        int writtenId = this.referenceResolver.getWrittenId(obj);
        if (writtenId != -1) {
            if (Log.DEBUG) {
                StringBuilder sbM150 = AbstractC0053.m150(writtenId, "Write reference ", ": ");
                sbM150.append(Util.string(obj));
                sbM150.append(Util.pos(output.position()));
                Log.debug("kryo", sbM150.toString());
            }
            output.writeVarInt(writtenId + 2, true);
            return true;
        }
        int iAddWrittenObject = this.referenceResolver.addWrittenObject(obj);
        if (Log.TRACE) {
            Log.trace("kryo", "Write: <not null>" + Util.pos(output.position()));
        }
        output.writeByte((byte) 1);
        if (Log.TRACE) {
            StringBuilder sbM1502 = AbstractC0053.m150(iAddWrittenObject, "Write initial reference ", ": ");
            sbM1502.append(Util.string(obj));
            sbM1502.append(Util.pos(output.position()));
            Log.trace("kryo", sbM1502.toString());
        }
        return false;
    }

    public void setDefaultSerializer(SerializerFactory serializerFactory) {
        if (serializerFactory != null) {
            this.defaultSerializer = serializerFactory;
        } else {
            C5925.m11310("serializer cannot be null.");
        }
    }

    public void addDefaultSerializer(Class cls, SerializerFactory serializerFactory) {
        if (cls == null) {
            C5925.m11310("type cannot be null.");
        } else if (serializerFactory != null) {
            insertDefaultSerializer(cls, serializerFactory);
        } else {
            C5925.m11310("serializerFactory cannot be null.");
        }
    }

    private void addDefaultSerializer(String str, Class<? extends Serializer> cls) {
        try {
            addDefaultSerializer(Class.forName(str), cls);
        } catch (ClassNotFoundException unused) {
            throw new KryoException(AbstractC0053.m157("default serializer cannot be added: ", str));
        }
    }

    public void addDefaultSerializer(Class cls, Class<? extends Serializer> cls2) {
        if (cls == null) {
            C5925.m11310("type cannot be null.");
        } else if (cls2 != null) {
            insertDefaultSerializer(cls, new SerializerFactory.ReflectionSerializerFactory(cls2));
        } else {
            C5925.m11310("serializerClass cannot be null.");
        }
    }

    public Registration register(Class cls, int i) {
        Registration registration = this.classResolver.getRegistration(cls);
        return registration != null ? registration : register(cls, getDefaultSerializer(cls), i);
    }

    public Registration register(Class cls, Serializer serializer) {
        Registration registration = this.classResolver.getRegistration(cls);
        if (registration != null) {
            registration.setSerializer(serializer);
            return registration;
        }
        return this.classResolver.register(new Registration(cls, serializer, getNextRegistrationId()));
    }

    public Registration register(Class cls, Serializer serializer, int i) {
        if (i >= 0) {
            return register(new Registration(cls, serializer, i));
        }
        C5925.m11310(AbstractC6183.m11588(i, "id must be >= 0: "));
        return null;
    }

    public Registration register(Class cls) {
        Registration registration = this.classResolver.getRegistration(cls);
        return registration != null ? registration : register(cls, getDefaultSerializer(cls));
    }

    public void writeObject(Output output, Object obj, Serializer serializer) {
        int i;
        boolean z;
        if (output == null) {
            C5925.m11310("output cannot be null.");
            return;
        }
        if (obj == null) {
            C5925.m11310("object cannot be null.");
            return;
        }
        if (serializer != null) {
            beginObject();
            try {
                if (this.references && writeReferenceOrNull(output, obj, false)) {
                    if (i == 0) {
                        if (z) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj, output.position());
                }
                serializer.write(this, output, obj);
                int i2 = this.depth - 1;
                this.depth = i2;
                if (i2 == 0 && this.autoReset) {
                    reset();
                    return;
                }
                return;
            } finally {
                i = this.depth - 1;
                this.depth = i;
                if (i == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        C5925.m11310("serializer cannot be null.");
    }

    public <T> T copy(T t, Serializer serializer) {
        T t2;
        if (t == null) {
            return null;
        }
        if (this.copyShallow) {
            return t;
        }
        this.copyDepth++;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t3 = (T) this.originalToCopy.get(t);
            if (t3 != null) {
                int i = this.copyDepth - 1;
                this.copyDepth = i;
                if (i == 0) {
                    reset();
                }
                return t3;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t;
            }
            if (t instanceof KryoCopyable) {
                t2 = (T) ((KryoCopyable) t).copy(this);
            } else {
                t2 = (T) serializer.copy(this, t);
            }
            if (this.needsCopyReference != null) {
                reference(t2);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Copy", t2, -1);
            }
            int i2 = this.copyDepth - 1;
            this.copyDepth = i2;
            if (i2 == 0) {
                reset();
            }
            return t2;
        } catch (Throwable th) {
            int i3 = this.copyDepth - 1;
            this.copyDepth = i3;
            if (i3 == 0) {
                reset();
            }
            throw th;
        }
    }

    public <T> T copyShallow(T t, Serializer serializer) {
        T t2;
        if (t == null) {
            return null;
        }
        this.copyDepth++;
        this.copyShallow = true;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t3 = (T) this.originalToCopy.get(t);
            if (t3 != null) {
                this.copyShallow = false;
                int i = this.copyDepth - 1;
                this.copyDepth = i;
                if (i == 0) {
                    reset();
                }
                return t3;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t;
            }
            if (t instanceof KryoCopyable) {
                t2 = (T) ((KryoCopyable) t).copy(this);
            } else {
                t2 = (T) serializer.copy(this, t);
            }
            if (this.needsCopyReference != null) {
                reference(t2);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Shallow copy", t2, -1);
            }
            this.copyShallow = false;
            int i2 = this.copyDepth - 1;
            this.copyDepth = i2;
            if (i2 == 0) {
                reset();
            }
            return t2;
        } catch (Throwable th) {
            this.copyShallow = false;
            int i3 = this.copyDepth - 1;
            this.copyDepth = i3;
            if (i3 == 0) {
                reset();
            }
            throw th;
        }
    }

    public Registration getRegistration(int i) {
        return this.classResolver.getRegistration(i);
    }

    public <T> T readObject(Input input, Class<T> cls, Serializer serializer) {
        T t;
        if (input == null) {
            C5925.m11310("input cannot be null.");
            return null;
        }
        if (cls == null) {
            C5925.m11310("type cannot be null.");
            return null;
        }
        if (serializer != null) {
            beginObject();
            try {
                if (this.references) {
                    int referenceOrNull = readReferenceOrNull(input, cls, false);
                    if (referenceOrNull == -1) {
                        return (T) this.readObject;
                    }
                    t = (T) serializer.read(this, input, cls);
                    if (referenceOrNull == this.readReferenceIds.size) {
                        reference(t);
                    }
                } else {
                    t = (T) serializer.read(this, input, cls);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", t, input.position());
                }
                int i = this.depth - 1;
                this.depth = i;
                if (i == 0 && this.autoReset) {
                    reset();
                }
                return t;
            } finally {
                int i2 = this.depth - 1;
                this.depth = i2;
                if (i2 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        C5925.m11310("serializer cannot be null.");
        return null;
    }

    public <T> T readObjectOrNull(Input input, Class<T> cls, Serializer serializer) {
        T t;
        if (input == null) {
            C5925.m11310("input cannot be null.");
            return null;
        }
        if (cls == null) {
            C5925.m11310("type cannot be null.");
            return null;
        }
        if (serializer != null) {
            beginObject();
            try {
                if (this.references) {
                    int referenceOrNull = readReferenceOrNull(input, cls, true);
                    if (referenceOrNull == -1) {
                        return (T) this.readObject;
                    }
                    t = (T) serializer.read(this, input, cls);
                    if (referenceOrNull == this.readReferenceIds.size) {
                        reference(t);
                    }
                } else {
                    if (!serializer.getAcceptsNull() && input.readByte() == 0) {
                        if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                            Util.log("Read", null, input.position());
                        }
                        int i = this.depth - 1;
                        this.depth = i;
                        if (i == 0 && this.autoReset) {
                            reset();
                        }
                        return null;
                    }
                    t = (T) serializer.read(this, input, cls);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", t, input.position());
                }
                int i2 = this.depth - 1;
                this.depth = i2;
                if (i2 == 0 && this.autoReset) {
                    reset();
                }
                return t;
            } finally {
                int i3 = this.depth - 1;
                this.depth = i3;
                if (i3 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        C5925.m11310("serializer cannot be null.");
        return null;
    }

    public void writeObjectOrNull(Output output, Object obj, Class cls) {
        int i;
        boolean z;
        if (output != null) {
            beginObject();
            try {
                Serializer serializer = getRegistration(cls).getSerializer();
                if (this.references) {
                    if (writeReferenceOrNull(output, obj, true)) {
                        if (i == 0) {
                            if (z) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                } else if (!serializer.getAcceptsNull()) {
                    if (obj == null) {
                        if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                            Util.log("Write", obj, output.position());
                        }
                        output.writeByte((byte) 0);
                        int i2 = this.depth - 1;
                        this.depth = i2;
                        if (i2 == 0 && this.autoReset) {
                            reset();
                            return;
                        }
                        return;
                    }
                    if (Log.TRACE) {
                        Log.trace("kryo", "Write: <not null>" + Util.pos(output.position()));
                    }
                    output.writeByte((byte) 1);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj, output.position());
                }
                serializer.write(this, output, obj);
                int i3 = this.depth - 1;
                this.depth = i3;
                if (i3 == 0 && this.autoReset) {
                    reset();
                    return;
                }
                return;
            } finally {
                i = this.depth - 1;
                this.depth = i;
                if (i == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        C5925.m11310("output cannot be null.");
    }

    public Kryo(ReferenceResolver referenceResolver) {
        this(new DefaultClassResolver(), referenceResolver);
    }

    public Kryo() {
        this(new DefaultClassResolver(), null);
    }
}
