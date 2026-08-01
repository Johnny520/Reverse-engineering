package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1605j;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.modules.ObjectReaderAnnotationProcessor;
import com.alibaba.fastjson2.modules.ObjectReaderModule;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderCreator {
    public static final ObjectReaderCreator INSTANCE;
    public static final boolean JIT;
    protected static final Map<Class, LambdaSetterInfo> methodTypeMapping;
    protected final AtomicInteger jitErrorCount = new AtomicInteger();
    protected volatile Throwable jitErrorLast;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class LambdaSetterInfo {
        final Class fieldClass;
        final MethodType invokedType;
        final MethodType methodType;
        final MethodType sameMethodMethod;

        public LambdaSetterInfo(Class cls, Class cls2) {
            this.fieldClass = cls;
            Class cls3 = Void.TYPE;
            this.sameMethodMethod = MethodType.methodType(cls3, Object.class, cls);
            this.methodType = MethodType.methodType((Class<?>) cls3, (Class<?>) cls);
            this.invokedType = MethodType.methodType(cls2);
        }
    }

    static {
        JIT = (JDKUtils.ANDROID || JDKUtils.GRAAL) ? false : true;
        INSTANCE = new ObjectReaderCreator();
        HashMap map = new HashMap();
        methodTypeMapping = map;
        Class cls = Boolean.TYPE;
        map.put(cls, new LambdaSetterInfo(cls, ObjBoolConsumer.class));
        Class cls2 = Byte.TYPE;
        map.put(cls2, new LambdaSetterInfo(cls2, ObjByteConsumer.class));
        Class cls3 = Short.TYPE;
        map.put(cls3, new LambdaSetterInfo(cls3, ObjShortConsumer.class));
        Class cls4 = Integer.TYPE;
        map.put(cls4, new LambdaSetterInfo(cls4, ObjIntConsumer.class));
        Class cls5 = Long.TYPE;
        map.put(cls5, new LambdaSetterInfo(cls5, ObjLongConsumer.class));
        Class cls6 = Character.TYPE;
        map.put(cls6, new LambdaSetterInfo(cls6, ObjCharConsumer.class));
        Class cls7 = Float.TYPE;
        map.put(cls7, new LambdaSetterInfo(cls7, ObjFloatConsumer.class));
        Class cls8 = Double.TYPE;
        map.put(cls8, new LambdaSetterInfo(cls8, ObjDoubleConsumer.class));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6349a(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j10, String str, Class cls, Type type, String str2, String[] strArr, Map map, ObjectReaderProvider objectReaderProvider, Field field) {
        objectReaderCreator.getClass();
        fieldInfo.init();
        fieldInfo.features = j10 | fieldInfo.features | JSONReader.Feature.FieldBased.mask;
        fieldInfo.format = str;
        objectReaderCreator.createFieldReader(cls, type, str2, strArr, fieldInfo, field, (Map<String, List<FieldReader>>) map, objectReaderProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m6350b(com.alibaba.fastjson2.reader.ObjectReaderCreator r20, com.alibaba.fastjson2.codec.FieldInfo r21, com.alibaba.fastjson2.reader.ObjectReaderProvider r22, java.lang.Class r23, java.lang.String r24, java.lang.Class r25, com.alibaba.fastjson2.codec.BeanInfo r26, int r27, java.util.Map r28, java.lang.reflect.Type r29, java.lang.reflect.Method r30) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderCreator.m6350b(com.alibaba.fastjson2.reader.ObjectReaderCreator, com.alibaba.fastjson2.codec.FieldInfo, com.alibaba.fastjson2.reader.ObjectReaderProvider, java.lang.Class, java.lang.String, java.lang.Class, com.alibaba.fastjson2.codec.BeanInfo, int, java.util.Map, java.lang.reflect.Type, java.lang.reflect.Method):void");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6351c(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j10, Class cls, Type type, String str, String[] strArr, BeanInfo beanInfo, Map map, ObjectReaderProvider objectReaderProvider, Method method) {
        objectReaderCreator.getClass();
        fieldInfo.init();
        fieldInfo.features = j10 | fieldInfo.features;
        objectReaderCreator.createFieldReader(cls, type, str, strArr, beanInfo, fieldInfo, method, map, objectReaderProvider);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6352d(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j10, String str, Class cls, Type type, String str2, String[] strArr, BeanInfo beanInfo, Map map, ObjectReaderProvider objectReaderProvider, Method method) {
        objectReaderCreator.getClass();
        fieldInfo.init();
        fieldInfo.features = j10 | fieldInfo.features;
        fieldInfo.format = str;
        objectReaderCreator.createFieldReader(cls, type, str2, strArr, beanInfo, fieldInfo, method, map, objectReaderProvider);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m6353e(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j10, String str, Class cls, Type type, String str2, String[] strArr, Map map, ObjectReaderProvider objectReaderProvider, BeanInfo beanInfo, Field field) {
        objectReaderCreator.getClass();
        fieldInfo.init();
        fieldInfo.ignore = (field.getModifiers() & 1) == 0 && (JSONReader.Feature.FieldBased.mask & j10) == 0;
        fieldInfo.features = j10 | fieldInfo.features;
        fieldInfo.format = str;
        objectReaderCreator.createFieldReader(cls, type, str2, strArr, fieldInfo, field, (Map<String, List<FieldReader>>) map, objectReaderProvider);
        if (fieldInfo.required) {
            String name = fieldInfo.fieldName;
            if (name == null || name.isEmpty()) {
                name = field.getName();
            }
            beanInfo.required(name);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m6354f(Method method, Object obj) {
        try {
            return method.invoke(obj, null);
        } catch (Throwable th) {
            C1565a.m6255a("create instance error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6355g(Class cls, ObjectReaderProvider objectReaderProvider, Class cls2, BeanInfo beanInfo, String str, FieldInfo fieldInfo, Method method) {
        if (method.getReturnType() != cls) {
            return;
        }
        FieldInfo fieldInfo2 = new FieldInfo();
        objectReaderProvider.getFieldInfo(fieldInfo2, cls2, method);
        String str2 = fieldInfo2.fieldName;
        if (str2 == null) {
            str2 = BeanUtils.getterName(method, beanInfo.f33661kotlin, PropertyNamingStrategy.CamelCase.name());
        }
        if (fieldInfo2.readUsing == null || !str.equals(str2)) {
            return;
        }
        fieldInfo.readUsing = fieldInfo2.readUsing;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.ObjectReader getInitReader(com.alibaba.fastjson2.reader.ObjectReaderProvider r6, java.lang.reflect.Type r7, java.lang.Class r8, com.alibaba.fastjson2.codec.FieldInfo r9) {
        /*
            com.alibaba.fastjson2.reader.ObjectReader r0 = r9.getInitReader()
            if (r0 != 0) goto L56
            java.lang.Class<?> r1 = r9.keyUsing
            if (r1 != 0) goto Le
            java.lang.Class<?> r1 = r9.valueUsing
            if (r1 == 0) goto L56
        Le:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L56
            java.lang.Class<?> r1 = r9.keyUsing
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2a
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L2a
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L2a
            java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.Exception -> L2a
            com.alibaba.fastjson2.reader.ObjectReader r1 = (com.alibaba.fastjson2.reader.ObjectReader) r1     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
            r1 = r3
        L2b:
            java.lang.Class<?> r4 = r9.valueUsing
            if (r4 == 0) goto L3d
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L3d
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> L3d
            java.lang.Object r2 = r4.newInstance(r3)     // Catch: java.lang.Exception -> L3d
            com.alibaba.fastjson2.reader.ObjectReader r2 = (com.alibaba.fastjson2.reader.ObjectReader) r2     // Catch: java.lang.Exception -> L3d
            r3 = r2
        L3d:
            if (r1 != 0) goto L41
            if (r3 == 0) goto L56
        L41:
            long r4 = r9.features
            com.alibaba.fastjson2.reader.ObjectReader r7 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.m6389of(r7, r8, r4)
            boolean r9 = r7 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped
            if (r9 == 0) goto L56
            com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped r7 = (com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped) r7
            if (r1 == 0) goto L51
            r7.keyObjectReader = r1
        L51:
            if (r3 == 0) goto L55
            r7.valueObjectReader = r3
        L55:
            return r7
        L56:
            if (r0 != 0) goto L92
            java.lang.Class r7 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r9 = java.lang.Long.class
            if (r8 == r7) goto L89
            if (r8 != r9) goto L61
            goto L89
        L61:
            java.lang.Class<java.math.BigDecimal> r7 = java.math.BigDecimal.class
            if (r8 != r7) goto L6e
            com.alibaba.fastjson2.reader.ObjectReader r6 = r6.getObjectReader(r7)
            com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal r7 = com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal.INSTANCE
            if (r6 == r7) goto L92
            goto L87
        L6e:
            java.lang.Class<java.math.BigInteger> r7 = java.math.BigInteger.class
            if (r8 != r7) goto L7b
            com.alibaba.fastjson2.reader.ObjectReader r6 = r6.getObjectReader(r7)
            com.alibaba.fastjson2.reader.ObjectReaderImplBigInteger r7 = com.alibaba.fastjson2.reader.ObjectReaderImplBigInteger.INSTANCE
            if (r6 == r7) goto L92
            goto L87
        L7b:
            java.lang.Class<java.util.Date> r7 = java.util.Date.class
            if (r8 != r7) goto L92
            com.alibaba.fastjson2.reader.ObjectReader r6 = r6.getObjectReader(r7)
            com.alibaba.fastjson2.reader.ObjectReaderImplDate r7 = com.alibaba.fastjson2.reader.ObjectReaderImplDate.INSTANCE
            if (r6 == r7) goto L92
        L87:
            r0 = r6
            goto L92
        L89:
            com.alibaba.fastjson2.reader.ObjectReader r6 = r6.getObjectReader(r9)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64 r7 = com.alibaba.fastjson2.reader.ObjectReaderImplInt64.INSTANCE
            if (r6 == r7) goto L92
            goto L87
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderCreator.getInitReader(com.alibaba.fastjson2.reader.ObjectReaderProvider, java.lang.reflect.Type, java.lang.Class, com.alibaba.fastjson2.codec.FieldInfo):com.alibaba.fastjson2.reader.ObjectReader");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m6356h(Object obj, Object obj2) {
        Map map = (Map) obj;
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    private List<FieldReader> listOf(FieldReader fieldReader) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fieldReader);
        return arrayList;
    }

    private void putIfAbsent(Map<String, List<FieldReader>> map, String str, FieldReader fieldReader, Class cls) {
        FieldReader fieldReader2;
        List<FieldReader> list = map.get(str);
        if (list == null) {
            map.put(str, listOf(fieldReader));
            return;
        }
        if (fieldReader.isReadOnly()) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                fieldReader2 = null;
                break;
            }
            fieldReader2 = list.get(i10);
            if (fieldReader2.sameTo(fieldReader)) {
                break;
            } else {
                i10++;
            }
        }
        if (fieldReader2 == null) {
            list.add(fieldReader);
        } else if (fieldReader2.compareTo(fieldReader) > 0 || !fieldReader2.belongTo(cls)) {
            list.set(list.indexOf(fieldReader2), fieldReader);
        }
    }

    private FieldReader[] toFieldReaderArray(Map<String, List<FieldReader>> map) {
        FieldReader[] fieldReaderArr = new FieldReader[map.values().stream().mapToInt(new ToIntFunction() { // from class: com.alibaba.fastjson2.reader.a2
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((List) obj).size();
            }
        }).sum()];
        ((List) map.values().stream().flatMap(new Function() { // from class: com.alibaba.fastjson2.reader.q1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((List) obj).stream();
            }
        }).collect(Collectors.toList())).toArray(fieldReaderArr);
        Arrays.sort(fieldReaderArr);
        return fieldReaderArr;
    }

    public <T, R> Function<T, R> createBuildFunction(final Method method) {
        try {
            return createBuildFunctionLambda(method);
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            method.setAccessible(true);
            return new Function() { // from class: com.alibaba.fastjson2.reader.z1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ObjectReaderCreator.m6354f(method, obj);
                }
            };
        }
    }

    public <T, R> Function<T, R> createBuildFunctionLambda(Method method) {
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(method.getDeclaringClass());
        try {
            MethodHandle methodHandleFindVirtual = lookupTrustedLookup.findVirtual(method.getDeclaringClass(), method.getName(), MethodType.methodType(method.getReturnType()));
            MethodType methodTypeType = methodHandleFindVirtual.type();
            return (Function) (Object) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, methodTypeType.erase(), methodHandleFindVirtual, methodTypeType).getTarget().invoke();
        } catch (Throwable th) {
            C1565a.m6255a("create fieldReader error", th);
            return null;
        }
    }

    public Function<Consumer, ByteArrayValueConsumer> createByteArrayValueConsumerCreator(Class cls, FieldReader[] fieldReaderArr) {
        return null;
    }

    public Function<Consumer, CharArrayValueConsumer> createCharArrayValueConsumerCreator(Class cls, FieldReader[] fieldReaderArr) {
        return null;
    }

    public ObjectReader createEnumReader(Class cls, Method method, ObjectReaderProvider objectReaderProvider) throws NoSuchMethodException {
        Class mixIn;
        FieldInfo fieldInfo = new FieldInfo();
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; enumArr != null && i10 < enumArr.length; i10++) {
            Enum r42 = enumArr[i10];
            String strName = r42.name();
            linkedHashMap.put(Long.valueOf(Fnv.hashCode64(strName)), r42);
            try {
                fieldInfo.init();
                objectReaderProvider.getFieldInfo(fieldInfo, cls, cls.getField(strName));
                String str = fieldInfo.fieldName;
                if (str != null && !str.isEmpty() && !str.equals(strName)) {
                    linkedHashMap.putIfAbsent(Long.valueOf(Fnv.hashCode64(str)), r42);
                }
                String[] strArr = fieldInfo.alternateNames;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (str2 != null && !str2.isEmpty()) {
                            linkedHashMap.putIfAbsent(Long.valueOf(Fnv.hashCode64(str2)), r42);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        for (int i11 = 0; enumArr != null && i11 < enumArr.length; i11++) {
            Enum r32 = enumArr[i11];
            String strName2 = r32.name();
            linkedHashMap.putIfAbsent(Long.valueOf(Fnv.hashCode64LCase(strName2)), r32);
            String string = r32.toString();
            if (!strName2.equals(string)) {
                linkedHashMap.putIfAbsent(Long.valueOf(Fnv.hashCode64LCase(string)), r32);
            }
        }
        int size = linkedHashMap.size();
        long[] jArr = new long[size];
        Iterator it = linkedHashMap.keySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            jArr[i12] = ((Long) it.next()).longValue();
            i12++;
        }
        Arrays.sort(jArr);
        Member enumValueField = BeanUtils.getEnumValueField(cls, objectReaderProvider);
        if (enumValueField == null && objectReaderProvider.modules.size() > 0 && (mixIn = objectReaderProvider.getMixIn(cls)) != null) {
            Member enumValueField2 = BeanUtils.getEnumValueField(mixIn, objectReaderProvider);
            if (enumValueField2 instanceof Field) {
                try {
                    enumValueField = cls.getField(enumValueField2.getName());
                } catch (NoSuchFieldException | NoSuchMethodException unused2) {
                }
            } else if (enumValueField2 instanceof Method) {
                enumValueField = cls.getMethod(enumValueField2.getName(), null);
            }
        }
        Member member = enumValueField;
        Enum[] enumArr2 = new Enum[size];
        for (int i13 = 0; i13 < size; i13++) {
            enumArr2[i13] = (Enum) linkedHashMap.get(Long.valueOf(jArr[i13]));
        }
        return new ObjectReaderImplEnum(cls, method, member, enumArr2, enumArr, jArr);
    }

    public <T> Function<Map<Long, Object>, T> createFactoryFunction(Method method, String... strArr) {
        method.setAccessible(true);
        return new FactoryFunction(method, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.alibaba.fastjson2.reader.FieldReader<T> createFieldReader(java.lang.Class r21, java.lang.reflect.Type r22, java.lang.String r23, int r24, long r25, java.lang.String r27, java.util.Locale r28, java.lang.Object r29, java.lang.String r30, java.lang.reflect.Type r31, java.lang.Class r32, java.lang.reflect.Field r33, com.alibaba.fastjson2.reader.ObjectReader r34, java.lang.String r35, java.util.function.BiConsumer r36) {
        /*
            Method dump skipped, instruction units count: 1519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderCreator.createFieldReader(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Field, com.alibaba.fastjson2.reader.ObjectReader, java.lang.String, java.util.function.BiConsumer):com.alibaba.fastjson2.reader.FieldReader");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReaderLambda(java.lang.Class<T> r18, java.lang.reflect.Type r19, java.lang.String r20, int r21, long r22, java.lang.String r24, java.util.Locale r25, java.lang.Object r26, java.lang.String r27, java.lang.reflect.Type r28, java.lang.Class r29, java.lang.reflect.Method r30, com.alibaba.fastjson2.reader.ObjectReader r31) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderCreator.createFieldReaderLambda(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Method, com.alibaba.fastjson2.reader.ObjectReader):com.alibaba.fastjson2.reader.FieldReader");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReaderMethod(java.lang.Class<T> r22, java.lang.reflect.Type r23, java.lang.String r24, int r25, long r26, java.lang.String r28, java.util.Locale r29, java.lang.Object r30, java.lang.String r31, java.lang.reflect.Type r32, java.lang.Class r33, java.lang.reflect.Method r34, com.alibaba.fastjson2.reader.ObjectReader r35, java.lang.String r36, java.util.function.BiConsumer r37) {
        /*
            Method dump skipped, instruction units count: 1464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderCreator.createFieldReaderMethod(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Method, com.alibaba.fastjson2.reader.ObjectReader, java.lang.String, java.util.function.BiConsumer):com.alibaba.fastjson2.reader.FieldReader");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReaderParam(java.lang.Class<T> r22, java.lang.reflect.Type r23, java.lang.String r24, int r25, long r26, java.lang.String r28, java.util.Locale r29, java.lang.Object r30, java.lang.reflect.Type r31, java.lang.Class r32, java.lang.String r33, java.lang.Class r34, java.lang.reflect.Parameter r35, com.alibaba.fastjson2.schema.JSONSchema r36, com.alibaba.fastjson2.reader.ObjectReader r37) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderCreator.createFieldReaderParam(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.reflect.Type, java.lang.Class, java.lang.String, java.lang.Class, java.lang.reflect.Parameter, com.alibaba.fastjson2.schema.JSONSchema, com.alibaba.fastjson2.reader.ObjectReader):com.alibaba.fastjson2.reader.FieldReader");
    }

    public FieldReader[] createFieldReaders(ObjectReaderProvider objectReaderProvider, Class cls, Type type, Executable executable, Parameter[] parameterArr, String... strArr) {
        ObjectReaderProvider objectReaderProvider2;
        Class<?> cls2;
        int i10;
        int i11;
        String[] strArr2;
        String str;
        Field declaredField;
        Class<?> declaringClass = executable != null ? executable.getDeclaringClass() : null;
        ArrayList arrayList = new ArrayList(parameterArr.length);
        int i12 = 0;
        while (i12 < parameterArr.length) {
            FieldInfo fieldInfo = new FieldInfo();
            Parameter parameter = parameterArr[i12];
            String name = i12 < strArr.length ? strArr[i12] : parameter.getName();
            boolean z10 = executable instanceof Constructor;
            if (z10) {
                objectReaderProvider2 = objectReaderProvider;
                cls2 = declaringClass;
                objectReaderProvider2.getFieldInfo(fieldInfo, cls2, (Constructor) executable, i12, parameter);
            } else {
                objectReaderProvider2 = objectReaderProvider;
                cls2 = declaringClass;
            }
            if (z10 && (declaredField = BeanUtils.getDeclaredField(cls2, name)) != null) {
                objectReaderProvider2.getFieldInfo(fieldInfo, cls2, declaredField);
            }
            String str2 = fieldInfo.fieldName;
            String str3 = (str2 == null || str2.isEmpty()) ? name : fieldInfo.fieldName;
            if (str3 == null) {
                str3 = "arg" + i12;
            }
            String str4 = str3;
            if (name == null) {
                name = "arg" + i12;
            }
            String str5 = name;
            ObjectReader initReader = getInitReader(objectReaderProvider2, parameter.getParameterizedType(), parameter.getType(), fieldInfo);
            Type parameterizedType = parameter.getParameterizedType();
            Type typeResolve = BeanUtils.resolve(type, cls, parameterizedType);
            Type type2 = typeResolve != null ? typeResolve : parameterizedType;
            declaringClass = cls2;
            ArrayList arrayList2 = arrayList;
            String str6 = str4;
            arrayList2.add(createFieldReaderParam(null, null, str4, i12, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, type2, parameter.getType(), str5, declaringClass, parameter, null, initReader));
            String[] strArr3 = fieldInfo.alternateNames;
            if (strArr3 != null) {
                int length = strArr3.length;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = i13;
                    String str7 = strArr3[i14];
                    if (str6.equals(str7)) {
                        str = str6;
                        strArr2 = strArr3;
                        i10 = length;
                        i11 = i14;
                    } else {
                        i10 = length;
                        i11 = i14;
                        strArr2 = strArr3;
                        str = str6;
                        arrayList2.add(createFieldReaderParam(null, null, str7, i12, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, type2, parameter.getType(), str5, declaringClass, parameter, null, initReader));
                    }
                    i13 = i11 + 1;
                    str6 = str;
                    strArr3 = strArr2;
                    length = i10;
                }
            }
            i12++;
            arrayList = arrayList2;
        }
        return (FieldReader[]) arrayList.toArray(new FieldReader[0]);
    }

    public <T> Function<Map<Long, Object>, T> createFunction(Constructor constructor, Constructor constructor2, String... strArr) {
        if (constructor2 == null) {
            constructor.setAccessible(true);
        } else {
            constructor2.setAccessible(true);
        }
        return new ConstructorFunction(null, constructor, null, null, constructor2, strArr);
    }

    public <T> IntFunction<T> createIntFunction(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) Integer.TYPE);
            return (IntFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_INT_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_INT, lookupTrustedLookup.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public <T> ObjectReaderNoneDefaultConstructor createNoneDefaultConstructorObjectReader(Class cls, BeanInfo beanInfo, Function<Map<Long, Object>, T> function, List<Constructor> list, String[] strArr, FieldReader[] fieldReaderArr, FieldReader[] fieldReaderArr2) {
        return new ObjectReaderNoneDefaultConstructor(cls, beanInfo.typeKey, beanInfo.typeName, beanInfo.readerFeatures, function, list, strArr, fieldReaderArr, fieldReaderArr2, beanInfo.seeAlso, beanInfo.seeAlsoNames);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0370  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReader(java.lang.Class<T> r22, java.lang.reflect.Type r23, boolean r24, com.alibaba.fastjson2.reader.ObjectReaderProvider r25) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderCreator.createObjectReader(java.lang.Class, java.lang.reflect.Type, boolean, com.alibaba.fastjson2.reader.ObjectReaderProvider):com.alibaba.fastjson2.reader.ObjectReader");
    }

    public <T> ObjectReader<T> createObjectReaderFactoryMethod(Method method, String... strArr) {
        return new ObjectReaderNoneDefaultConstructor(null, null, null, 0L, createFactoryFunction(method, strArr), null, strArr, createFieldReaders(JSONFactory.getDefaultObjectReaderProvider(), null, null, method, method.getParameters(), strArr), null, null, null);
    }

    public <T> ObjectReader<T> createObjectReaderNoneDefaultConstructor(Constructor constructor, String... strArr) {
        Function<Map<Long, Object>, T> functionCreateFunction = createFunction(constructor, strArr);
        Class<T> declaringClass = constructor.getDeclaringClass();
        return createObjectReaderNoneDefaultConstructor(declaringClass, functionCreateFunction, createFieldReaders(JSONFactory.getDefaultObjectReaderProvider(), declaringClass, declaringClass, constructor, constructor.getParameters(), strArr));
    }

    public <T> ObjectReader<T> createObjectReaderSeeAlso(Class<T> cls, Class[] clsArr, FieldReader... fieldReaderArr) {
        return new ObjectReaderSeeAlso(cls, createSupplier(cls), "@type", clsArr, null, null, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReaderWithBuilder(final Class<T> cls, final Type type, final ObjectReaderProvider objectReaderProvider, final BeanInfo beanInfo) {
        Method method = beanInfo.buildMethod;
        Function functionCreateBuildFunction = method != null ? createBuildFunction(method) : null;
        final Class<T> cls2 = beanInfo.builder;
        String str = beanInfo.builderWithPrefix;
        if (str == null || str.isEmpty()) {
            str = "with";
        }
        final String str2 = str;
        final int length = str2.length();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final FieldInfo fieldInfo = new FieldInfo();
        BeanUtils.setters((Class) cls2, false, (Consumer<Method>) new Consumer() { // from class: com.alibaba.fastjson2.reader.y1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ObjectReaderCreator.m6350b(this.f4714a, fieldInfo, objectReaderProvider, cls, str2, cls2, beanInfo, length, linkedHashMap, type, (Method) obj);
            }
        });
        return createObjectReader(cls2, 0L, createSupplier(cls2), functionCreateBuildFunction, toFieldReaderArray(linkedHashMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReaderWithCreator(final java.lang.Class<T> r23, java.lang.reflect.Type r24, final com.alibaba.fastjson2.reader.ObjectReaderProvider r25, final com.alibaba.fastjson2.codec.BeanInfo r26) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderCreator.createObjectReaderWithCreator(java.lang.Class, java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReaderProvider, com.alibaba.fastjson2.codec.BeanInfo):com.alibaba.fastjson2.reader.ObjectReader");
    }

    public <T> Function<String, T> createStringFunction(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) String.class);
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public <T> Supplier<T> createSupplier(Class<T> cls) {
        if (cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            return createSupplier((cls.getName().indexOf(36) == -1 || Modifier.isStatic(cls.getModifiers())) ? cls.getDeclaredConstructor(null) : cls.getDeclaredConstructor(cls.getDeclaringClass()));
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Throwable th) {
            C1565a.m6255a("get constructor error, class ".concat(cls.getName()), th);
            return null;
        }
    }

    public <I, T> Function<I, T> createValueFunction(Method method, Class cls) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) cls);
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public Object lambdaSetter(Class cls, Class cls2, Method method) {
        MethodType methodType;
        MethodType methodType2;
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(cls);
        Class<?> returnType = method.getReturnType();
        LambdaSetterInfo lambdaSetterInfo = methodTypeMapping.get(cls2);
        Class<?> cls3 = Void.TYPE;
        MethodType methodType3 = null;
        if (lambdaSetterInfo != null) {
            methodType = lambdaSetterInfo.sameMethodMethod;
            methodType2 = lambdaSetterInfo.invokedType;
            if (returnType == cls3) {
                methodType3 = lambdaSetterInfo.methodType;
            }
        } else {
            methodType = TypeUtils.METHOD_TYPE_VOO;
            methodType2 = TypeUtils.METHOD_TYPE_BI_CONSUMER;
        }
        MethodType methodType4 = methodType2;
        if (methodType3 == null) {
            methodType3 = MethodType.methodType(returnType, (Class<?>) cls2);
        }
        try {
            return (Object) LambdaMetafactory.metafactory(lookupTrustedLookup, "accept", methodType4, methodType, lookupTrustedLookup.findVirtual(cls, method.getName(), methodType3), MethodType.methodType(cls3, cls, cls2)).getTarget().invoke();
        } catch (Throwable th) {
            C1565a.m6255a("create fieldReader error", th);
            return null;
        }
    }

    public <T> ObjectReader<T> createObjectReaderSeeAlso(Class<T> cls, String str, Class[] clsArr, String[] strArr, FieldReader... fieldReaderArr) {
        return new ObjectReaderSeeAlso(cls, createSupplier(cls), str, clsArr, strArr, null, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReaderSeeAlso(Class<T> cls, String str, Class[] clsArr, String[] strArr, Class cls2, FieldReader... fieldReaderArr) {
        return new ObjectReaderSeeAlso(cls, createSupplier(cls), str, clsArr, strArr, cls2, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReaderSeeAlso(Class<T> cls, Supplier<T> supplier, String str, Class[] clsArr, String[] strArr, FieldReader... fieldReaderArr) {
        return new ObjectReaderSeeAlso(cls, supplier, str, clsArr, strArr, null, fieldReaderArr);
    }

    public <T> Function<Map<Long, Object>, T> createFunction(Constructor constructor, String... strArr) {
        constructor.setAccessible(true);
        return new ConstructorFunction(null, constructor, null, null, null, strArr);
    }

    public <T> ObjectReader<T> createObjectReaderNoneDefaultConstructor(Class cls, Function<Map<Long, Object>, T> function, FieldReader... fieldReaderArr) {
        return new ObjectReaderNoneDefaultConstructor(cls, null, null, 0L, function, null, null, fieldReaderArr, null, null, null);
    }

    public <T> FieldReader createFieldReaderParam(Class<T> cls, Type type, String str, int i10, long j10, String str2, Type type2, Class cls2, String str3, Class cls3, Parameter parameter, JSONSchema jSONSchema, ObjectReader objectReader) {
        return createFieldReaderParam(cls, type, str, i10, j10, str2, null, null, type2, cls2, str3, cls3, parameter, jSONSchema, objectReader);
    }

    public <T> FieldReader createFieldReaderParam(Class<T> cls, Type type, String str, int i10, long j10, String str2, Type type2, Class cls2, String str3, Class cls3, Parameter parameter, JSONSchema jSONSchema) {
        return createFieldReaderParam(cls, type, str, i10, j10, str2, type2, cls2, str3, cls3, parameter, jSONSchema, null);
    }

    public <I, T> Function<I, T> createValueFunction(Constructor<T> constructor, Class<I> cls) {
        Class<T> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, (Class<?>) cls)), MethodType.methodType((Class<?>) declaringClass, (Class<?>) cls)).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public <T> IntFunction<T> createIntFunction(Constructor constructor) {
        Class<T> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            return (IntFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_INT_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_INT, lookupTrustedLookup.findConstructor(declaringClass, TypeUtils.METHOD_TYPE_VOID_INT), MethodType.methodType((Class<?>) declaringClass, (Class<?>) Integer.TYPE)).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public <T> Function<String, T> createStringFunction(Constructor constructor) {
        Class<T> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, TypeUtils.METHOD_TYPE_VOID_STRING), MethodType.methodType((Class<?>) declaringClass, (Class<?>) String.class)).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public <T> Supplier<T> createSupplier(Constructor<T> constructor) {
        return createSupplier(constructor, true);
    }

    public <T> Supplier<T> createSupplier(Constructor constructor, boolean z10) {
        if (z10 & JIT) {
            Class<T> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            try {
                if (constructor.getParameterCount() == 0) {
                    MethodHandle methodHandleFindConstructor = lookupTrustedLookup.findConstructor(declaringClass, TypeUtils.METHOD_TYPE_VOID);
                    MethodType methodType = TypeUtils.METHOD_TYPE_SUPPLIER;
                    MethodType methodType2 = TypeUtils.METHOD_TYPE_OBJECT;
                    return (Supplier) LambdaMetafactory.metafactory(lookupTrustedLookup, "get", methodType, methodType2, methodHandleFindConstructor, methodType2).getTarget().invokeExact();
                }
            } catch (Throwable th) {
                this.jitErrorCount.incrementAndGet();
                this.jitErrorLast = th;
            }
        }
        return new ConstructorSupplier(constructor);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void createFieldReader(java.lang.Class r21, java.lang.reflect.Type r22, java.lang.String r23, java.lang.String[] r24, com.alibaba.fastjson2.codec.BeanInfo r25, com.alibaba.fastjson2.codec.FieldInfo r26, java.lang.reflect.Method r27, java.util.Map<java.lang.String, java.util.List<com.alibaba.fastjson2.reader.FieldReader>> r28, com.alibaba.fastjson2.reader.ObjectReaderProvider r29) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderCreator.createFieldReader(java.lang.Class, java.lang.reflect.Type, java.lang.String, java.lang.String[], com.alibaba.fastjson2.codec.BeanInfo, com.alibaba.fastjson2.codec.FieldInfo, java.lang.reflect.Method, java.util.Map, com.alibaba.fastjson2.reader.ObjectReaderProvider):void");
    }

    public <T> FieldReader createFieldReaderMethod(Class<T> cls, Type type, String str, int i10, long j10, String str2, Locale locale, Object obj, String str3, Type type2, Class cls2, Method method, ObjectReader objectReader) {
        return createFieldReaderMethod(cls, type, str, i10, j10, str2, locale, obj, str3, type2, cls2, method, objectReader, null, null);
    }

    public <T> FieldReader createFieldReaderMethod(Class<T> cls, String str, String str2, Type type, Class cls2, Method method) {
        return createFieldReaderMethod(cls, cls, str, 0, 0L, str2, null, null, null, type, cls2, method, null);
    }

    public <T> FieldReader createFieldReader(Class<T> cls, String str, Type type, Class cls2, Method method) {
        return createFieldReaderMethod(cls, cls, str, 0, 0L, null, null, null, null, type, cls2, method, null);
    }

    public <T> FieldReader createFieldReader(Class<T> cls, String str, String str2, Type type, Class cls2, Method method) {
        return createFieldReaderMethod(cls, str, str2, type, cls2, method);
    }

    public <T> FieldReader<T> createFieldReader(String str, Type type, Field field) {
        return createFieldReader(str, null, type, field);
    }

    public <T> FieldReader<T> createFieldReader(String str, Field field) {
        return createFieldReader(str, null, field.getGenericType(), field);
    }

    public <T> FieldReader createFieldReader(String str, Method method) {
        Class<?> returnType;
        Type genericReturnType;
        Class<?> declaringClass = method.getDeclaringClass();
        int parameterCount = method.getParameterCount();
        if (parameterCount == 0) {
            returnType = method.getReturnType();
            genericReturnType = method.getGenericReturnType();
        } else if (parameterCount == 1) {
            returnType = method.getParameterTypes()[0];
            genericReturnType = method.getGenericParameterTypes()[0];
        } else {
            C1605j.m6294a("illegal setter method ", method);
            return null;
        }
        return createFieldReaderMethod(declaringClass, declaringClass, str, 0, 0L, null, null, null, null, genericReturnType, returnType, method, null);
    }

    public <T> FieldReader<T> createFieldReader(String str, String str2, Type type, Field field) {
        Class<?> declaringClass = field.getDeclaringClass();
        return createFieldReader(declaringClass, declaringClass, str, 0L, str2, type, field.getType(), field);
    }

    public <T> FieldReader<T> createFieldReader(Class cls, Type type, String str, long j10, String str2, Type type2, Class cls2, Field field) {
        return createFieldReader(cls, type, str, 0, j10, str2, null, null, null, type2, field.getType(), field, null, null, null);
    }

    public <T> FieldReader<T> createFieldReader(Class cls, Type type, String str, int i10, long j10, String str2, Locale locale, Object obj, String str3, Type type2, Class cls2, Field field, ObjectReader objectReader) {
        return createFieldReader(cls, type, str, 0, j10, str2, locale, obj, str3, type2, field.getType(), field, objectReader, null, null);
    }

    public void createFieldReader(Class cls, Type type, String str, String[] strArr, FieldInfo fieldInfo, Field field, Map<String, List<FieldReader>> map, ObjectReaderProvider objectReaderProvider) {
        String strFieldName;
        String[] strArr2;
        int i10;
        int i11;
        String str2;
        Map<String, List<FieldReader>> map2;
        objectReaderProvider.getFieldInfo(fieldInfo, cls, field);
        if (!fieldInfo.ignore || ((fieldInfo.features & FieldInfo.UNWRAPPED_MASK) != 0 && Map.class.isAssignableFrom(field.getType()))) {
            String str3 = fieldInfo.fieldName;
            if (str3 != null && !str3.isEmpty()) {
                strFieldName = fieldInfo.fieldName;
            } else {
                String name = field.getName();
                strFieldName = str != null ? BeanUtils.fieldName(name, str) : name;
            }
            if (strArr != null && strArr.length > 0) {
                int i12 = 0;
                while (true) {
                    if (i12 < strArr.length) {
                        if (strFieldName.equals(strArr[i12])) {
                            fieldInfo.ordinal = i12;
                            break;
                        }
                        i12++;
                    } else if (fieldInfo.ordinal == 0) {
                        fieldInfo.ordinal = strArr.length;
                    }
                }
            }
            Type genericType = field.getGenericType();
            Class<?> type2 = field.getType();
            ObjectReader initReader = getInitReader(objectReaderProvider, genericType, type2, fieldInfo);
            String str4 = fieldInfo.schema;
            if (fieldInfo.required && str4 == null) {
                str4 = "{\"required\":true}";
            }
            Class<?> cls2 = type2;
            Type type3 = genericType;
            String str5 = str4;
            String str6 = strFieldName;
            Map<String, List<FieldReader>> map3 = map;
            Class cls3 = cls;
            ObjectReaderCreator objectReaderCreator = this;
            FieldReader fieldReaderCreateFieldReader = objectReaderCreator.createFieldReader(cls3, type, str6, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, str5, type3, cls2, field, initReader, fieldInfo.arrayToMapKey, fieldInfo.getInitArrayToMapDuplicateHandler());
            String str7 = str6;
            objectReaderCreator.putIfAbsent(map3, str7, fieldReaderCreateFieldReader, cls3);
            FieldInfo fieldInfo2 = fieldInfo;
            String[] strArr3 = fieldInfo2.alternateNames;
            if (strArr3 != null) {
                int length = strArr3.length;
                int i13 = 0;
                while (i13 < length) {
                    String str8 = strArr3[i13];
                    if (str7.equals(str8)) {
                        strArr2 = strArr3;
                        i11 = length;
                        i10 = i13;
                        str2 = str7;
                        map2 = map3;
                    } else {
                        strArr2 = strArr3;
                        String str9 = str5;
                        Type type4 = type3;
                        Class<?> cls4 = cls2;
                        i10 = i13;
                        i11 = length;
                        str2 = str7;
                        map2 = map3;
                        ObjectReaderCreator objectReaderCreator2 = objectReaderCreator;
                        Class cls5 = cls3;
                        FieldReader fieldReaderCreateFieldReader2 = objectReaderCreator2.createFieldReader(cls5, type, str8, fieldInfo2.ordinal, fieldInfo2.features, null, fieldInfo2.locale, fieldInfo2.defaultValue, str9, type4, cls4, field, null);
                        cls3 = cls5;
                        cls2 = cls4;
                        objectReaderCreator = objectReaderCreator2;
                        type3 = type4;
                        str5 = str9;
                        objectReaderCreator.putIfAbsent(map2, str8, fieldReaderCreateFieldReader2, cls3);
                    }
                    i13 = i10 + 1;
                    fieldInfo2 = fieldInfo;
                    map3 = map2;
                    str7 = str2;
                    strArr3 = strArr2;
                    length = i11;
                }
            }
        }
    }

    public <T, V> FieldReader createFieldReader(String str, Type type, Class<V> cls, long j10, BiConsumer<T, V> biConsumer) {
        return createFieldReader(null, null, str, type, cls, 0, j10, null, null, null, null, null, biConsumer, null);
    }

    public <T, V> FieldReader createFieldReader(String str, Type type, Class<V> cls, Method method, BiConsumer<T, V> biConsumer) {
        return createFieldReader(null, null, str, type, cls, 0, 0L, null, null, null, null, method, biConsumer, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T, V> com.alibaba.fastjson2.reader.FieldReader createFieldReader(java.lang.Class r22, java.lang.reflect.Type r23, java.lang.String r24, java.lang.reflect.Type r25, java.lang.Class<V> r26, int r27, long r28, java.lang.String r30, java.util.Locale r31, java.lang.Object r32, com.alibaba.fastjson2.schema.JSONSchema r33, java.lang.reflect.Method r34, java.util.function.BiConsumer<T, V> r35, com.alibaba.fastjson2.reader.ObjectReader r36) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderCreator.createFieldReader(java.lang.Class, java.lang.reflect.Type, java.lang.String, java.lang.reflect.Type, java.lang.Class, int, long, java.lang.String, java.util.Locale, java.lang.Object, com.alibaba.fastjson2.schema.JSONSchema, java.lang.reflect.Method, java.util.function.BiConsumer, com.alibaba.fastjson2.reader.ObjectReader):com.alibaba.fastjson2.reader.FieldReader");
    }

    public <T> FieldReader[] createFieldReaders(Class<T> cls) {
        return createFieldReaders(cls, cls, null, false, JSONFactory.getDefaultObjectReaderProvider());
    }

    public <T> FieldReader[] createFieldReaders(Class<T> cls, Type type) {
        return createFieldReaders(cls, type, null, false, JSONFactory.getDefaultObjectReaderProvider());
    }

    public <T> FieldReader[] createFieldReaders(final Class<T> cls, final Type type, BeanInfo beanInfo, boolean z10, final ObjectReaderProvider objectReaderProvider) {
        final BeanInfo beanInfo2;
        LinkedHashMap linkedHashMap;
        final ObjectReaderProvider objectReaderProvider2;
        final LinkedHashMap linkedHashMap2;
        if (beanInfo == null) {
            BeanInfo beanInfo3 = new BeanInfo(objectReaderProvider);
            Iterator<ObjectReaderModule> it = objectReaderProvider.modules.iterator();
            while (it.hasNext()) {
                ObjectReaderAnnotationProcessor annotationProcessor = it.next().getAnnotationProcessor();
                if (annotationProcessor != null) {
                    annotationProcessor.getBeanInfo(beanInfo3, cls);
                }
            }
            beanInfo2 = beanInfo3;
        } else {
            beanInfo2 = beanInfo;
        }
        boolean zIsRecord = BeanUtils.isRecord(cls);
        final String str = beanInfo2.namingStrategy;
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        final long j10 = beanInfo2.readerFeatures;
        final String str2 = beanInfo2.format;
        final FieldInfo fieldInfo = new FieldInfo();
        final String[] strArr = beanInfo2.orders;
        if (z10) {
            linkedHashMap2 = linkedHashMap3;
            BeanUtils.declaredFields(cls, new Consumer() { // from class: com.alibaba.fastjson2.reader.p1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ObjectReaderCreator.m6349a(this.f4640a, fieldInfo, j10, str2, cls, type, str, strArr, linkedHashMap3, objectReaderProvider, (Field) obj);
                }
            });
        } else {
            if (zIsRecord) {
                linkedHashMap = linkedHashMap3;
                objectReaderProvider2 = objectReaderProvider;
            } else {
                final BeanInfo beanInfo4 = beanInfo2;
                objectReaderProvider2 = objectReaderProvider;
                linkedHashMap = linkedHashMap3;
                beanInfo2 = beanInfo4;
                BeanUtils.declaredFields(cls, new Consumer() { // from class: com.alibaba.fastjson2.reader.s1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ObjectReaderCreator.m6353e(this.f4658a, fieldInfo, j10, str2, cls, type, str, strArr, linkedHashMap3, objectReaderProvider2, beanInfo4, (Field) obj);
                    }
                });
            }
            Class mixIn = objectReaderProvider2.getMixIn(cls);
            linkedHashMap2 = linkedHashMap;
            BeanUtils.setters(cls, beanInfo2, mixIn, new Consumer() { // from class: com.alibaba.fastjson2.reader.t1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ObjectReaderCreator.m6352d(this.f4671a, fieldInfo, j10, str2, cls, type, str, strArr, beanInfo2, linkedHashMap2, objectReaderProvider, (Method) obj);
                }
            });
            if (cls.isInterface()) {
                final BeanInfo beanInfo5 = beanInfo2;
                Consumer consumer = new Consumer() { // from class: com.alibaba.fastjson2.reader.u1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ObjectReaderCreator.m6351c(this.f4685a, fieldInfo, j10, cls, type, str, strArr, beanInfo5, linkedHashMap2, objectReaderProvider, (Method) obj);
                    }
                };
                linkedHashMap2 = linkedHashMap2;
                BeanUtils.getters(cls, consumer);
            }
        }
        Class<? super T> superclass = cls.getSuperclass();
        if (BeanUtils.isExtendedMap(cls)) {
            linkedHashMap2.put(BeanUtils.SUPER, listOf(ObjectReaders.fieldReader(BeanUtils.SUPER, cls.getGenericSuperclass(), superclass, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.v1
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ObjectReaderCreator.m6356h(obj, obj2);
                }
            })));
        }
        return toFieldReaderArray(linkedHashMap2);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, Supplier<T> supplier, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, null, 0L, null, supplier, null, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, long j10, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, null, j10, null, supplier, function, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, String str, long j10, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, str, null, j10, jSONSchema, supplier, function, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, String str, String str2, long j10, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        if (cls != null) {
            int modifiers = cls.getModifiers();
            if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
                return new ObjectReaderAdapter(cls, str, null, j10, jSONSchema, supplier, function, fieldReaderArr);
            }
        }
        if (str2 != null) {
            return new ObjectReaderRootName(cls, str, null, str2, j10, jSONSchema, supplier, function, null, null, null, fieldReaderArr);
        }
        switch (fieldReaderArr.length) {
            case 1:
                return new ObjectReader1(cls, null, null, j10, jSONSchema, supplier, function, fieldReaderArr[0]);
            case 2:
                return new ObjectReader2(cls, j10, jSONSchema, supplier, function, fieldReaderArr[0], fieldReaderArr[1]);
            case 3:
                return new ObjectReader3(cls, supplier, j10, jSONSchema, function, fieldReaderArr[0], fieldReaderArr[1], fieldReaderArr[2]);
            case 4:
                return new ObjectReader4(cls, j10, jSONSchema, supplier, function, fieldReaderArr[0], fieldReaderArr[1], fieldReaderArr[2], fieldReaderArr[3]);
            case 5:
                return new ObjectReader5(cls, supplier, j10, jSONSchema, function, fieldReaderArr[0], fieldReaderArr[1], fieldReaderArr[2], fieldReaderArr[3], fieldReaderArr[4]);
            case 6:
                return new ObjectReader6(cls, supplier, j10, jSONSchema, function, fieldReaderArr[0], fieldReaderArr[1], fieldReaderArr[2], fieldReaderArr[3], fieldReaderArr[4], fieldReaderArr[5]);
            case 7:
                return new ObjectReader7(cls, null, null, j10, jSONSchema, supplier, function, fieldReaderArr);
            case 8:
                return new ObjectReader8(cls, null, null, j10, jSONSchema, supplier, function, fieldReaderArr);
            case 9:
                return new ObjectReader9(cls, null, null, j10, jSONSchema, supplier, function, fieldReaderArr);
            case 10:
                return new ObjectReader10(cls, null, null, j10, jSONSchema, supplier, function, fieldReaderArr);
            case Opcodes.FCONST_0 /* 11 */:
                return new ObjectReader11(cls, null, null, j10, jSONSchema, supplier, function, fieldReaderArr);
            case Opcodes.FCONST_1 /* 12 */:
                return new ObjectReader12(cls, null, null, j10, jSONSchema, supplier, function, fieldReaderArr);
            default:
                return new ObjectReaderAdapter(cls, str, null, j10, jSONSchema, supplier, function, fieldReaderArr);
        }
    }

    public <T> ObjectReader<T> createObjectReader(Type type) {
        if (type instanceof Class) {
            return createObjectReader((Class) type);
        }
        Class<?> mapping = TypeUtils.getMapping(type);
        return createObjectReader(mapping, createSupplier(mapping), createFieldReaders(mapping, type));
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls) {
        return createObjectReader(cls, cls, false, JSONFactory.getDefaultObjectReaderProvider());
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, boolean z10) {
        return createObjectReader(cls, cls, z10, JSONFactory.getDefaultObjectReaderProvider());
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, null, 0L, null, createSupplier(cls), null, fieldReaderArr);
    }
}
