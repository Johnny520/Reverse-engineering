package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.function.ToByteFunction;
import com.alibaba.fastjson2.function.ToFloatFunction;
import com.alibaba.fastjson2.function.ToShortFunction;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterCreator {
    public static final ObjectWriterCreator INSTANCE = new ObjectWriterCreator();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configSerializeFilters(BeanInfo beanInfo, ObjectWriterAdapter objectWriterAdapter) {
        for (Class<? extends Filter> cls : beanInfo.serializeFilters) {
            if (Filter.class.isAssignableFrom(cls)) {
                try {
                    objectWriterAdapter.setFilter(cls.newInstance());
                } catch (IllegalAccessException | InstantiationException unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getFieldName(Class cls, BeanInfo beanInfo, FieldInfo fieldInfo, Method method) {
        char cCharAt;
        String str = fieldInfo.fieldName;
        if (str != null && !str.isEmpty()) {
            return fieldInfo.fieldName;
        }
        String str2 = BeanUtils.getterName(method, beanInfo.kotlin, beanInfo.namingStrategy);
        int length = str2.length();
        char cCharAt2 = length > 0 ? str2.charAt(0) : (char) 0;
        if ((length == 1 && cCharAt2 >= 'a' && cCharAt2 <= 'z') || (length > 1 && cCharAt2 >= 'A' && cCharAt2 <= 'Z' && (cCharAt = str2.charAt(1)) >= 'A' && cCharAt <= 'Z')) {
            char[] charArray = str2.toCharArray();
            if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                charArray[0] = (char) (charArray[0] + ' ');
            } else {
                charArray[0] = (char) (charArray[0] - ' ');
            }
            String str3 = new String(charArray);
            Field declaredField = BeanUtils.getDeclaredField(cls, str3);
            if (declaredField != null) {
                int i9 = 2;
                while (true) {
                    if (i9 < charArray.length) {
                        char c10 = charArray[i9];
                        if (c10 >= 'a' && c10 <= 'z') {
                            if (Modifier.isPublic(declaredField.getModifiers())) {
                                break;
                            }
                        } else {
                            i9++;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createObjectWriter$0(FieldInfo fieldInfo, Class cls, long j3, ObjectWriterProvider objectWriterProvider, BeanInfo beanInfo, Map map, Field field) {
        fieldInfo.init();
        FieldWriter fieldWriterCreateFieldWriter = createFieldWriter(cls, j3, objectWriterProvider, beanInfo, fieldInfo, field);
        if (fieldWriterCreateFieldWriter != null) {
            if (fieldInfo.writeUsing != null && (fieldWriterCreateFieldWriter instanceof FieldWriterObject)) {
                ((FieldWriterObject) fieldWriterCreateFieldWriter).writeUsing = true;
            }
            map.put(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createObjectWriter$1(FieldInfo fieldInfo, Class cls, long j3, ObjectWriterProvider objectWriterProvider, BeanInfo beanInfo, Map map, Field field) {
        fieldInfo.init();
        fieldInfo.ignore = (field.getModifiers() & 1) == 0;
        FieldWriter fieldWriterCreateFieldWriter = createFieldWriter(cls, j3, objectWriterProvider, beanInfo, fieldInfo, field);
        if (fieldWriterCreateFieldWriter != null) {
            if (fieldInfo.writeUsing != null && (fieldWriterCreateFieldWriter instanceof FieldWriterObject)) {
                ((FieldWriterObject) fieldWriterCreateFieldWriter).writeUsing = true;
            }
            FieldWriter fieldWriter = (FieldWriter) map.get(fieldWriterCreateFieldWriter.fieldName);
            if (fieldWriter == null) {
                map.put(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
            }
            if (fieldWriter == null || fieldWriter.compareTo(fieldWriterCreateFieldWriter) <= 0) {
                return;
            }
            map.put(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createObjectWriter$2(FieldInfo fieldInfo, long j3, BeanInfo beanInfo, ObjectWriterProvider objectWriterProvider, Class cls, Map map, Method method) {
        ObjectWriter objectWriter;
        String str;
        FieldWriter fieldWriter;
        String[] strArr;
        fieldInfo.init();
        fieldInfo.features = j3;
        fieldInfo.format = beanInfo.format;
        objectWriterProvider.getFieldInfo(beanInfo, fieldInfo, cls, method);
        if (fieldInfo.ignore) {
            return;
        }
        String fieldName = getFieldName(cls, beanInfo, fieldInfo, method);
        String[] strArr2 = beanInfo.includes;
        if (strArr2 != null && strArr2.length > 0) {
            for (String str2 : strArr2) {
                if (!str2.equals(fieldName)) {
                }
            }
            return;
        }
        if ((beanInfo.writerFeatures & JSONWriter.Feature.WriteClassName.mask) == 0 || !fieldName.equals(beanInfo.typeKey)) {
            if (beanInfo.orders != null) {
                int i9 = 0;
                boolean z9 = false;
                while (true) {
                    strArr = beanInfo.orders;
                    if (i9 >= strArr.length) {
                        break;
                    }
                    if (fieldName.equals(strArr[i9])) {
                        fieldInfo.ordinal = i9;
                        z9 = true;
                    }
                    i9++;
                }
                if (!z9 && fieldInfo.ordinal == 0) {
                    fieldInfo.ordinal = strArr.length;
                }
            }
            Class<?> cls2 = fieldInfo.writeUsing;
            if (cls2 != null) {
                try {
                    Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    objectWriter = (ObjectWriter) declaredConstructor.newInstance(null);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
                    C0086a.m465x("create writeUsing Writer error", e6);
                    return;
                }
            } else {
                objectWriter = null;
            }
            if (objectWriter == null && fieldInfo.fieldClassMixIn) {
                objectWriter = ObjectWriterProvider.VoidObjectWriter.INSTANCE;
            }
            FieldWriter fieldWriterCreateFieldWriter = createFieldWriter(objectWriterProvider, cls, fieldName, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.label, method, objectWriter, fieldInfo.contentAs);
            if (fieldInfo.writeUsing != null && (fieldWriterCreateFieldWriter instanceof FieldWriterObject)) {
                ((FieldWriterObject) fieldWriterCreateFieldWriter).writeUsing = true;
            }
            FieldWriter fieldWriter2 = (FieldWriter) map.get(fieldWriterCreateFieldWriter.fieldName);
            if (fieldWriter2 == null) {
                map.put(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
            }
            if (fieldWriter2 != null && fieldWriter2.compareTo(fieldWriterCreateFieldWriter) > 0) {
                map.put(fieldName, fieldWriterCreateFieldWriter);
            }
            if (fieldWriter2 == null) {
                char cCharAt = fieldName.charAt(0);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    str = ((char) (cCharAt + ' ')) + fieldName.substring(1);
                } else if (cCharAt < 'a' || cCharAt > 'z') {
                    str = null;
                } else {
                    str = ((char) (cCharAt - ' ')) + fieldName.substring(1);
                }
                if (str == null || (fieldWriter = (FieldWriter) map.get(str)) == null) {
                    return;
                }
                Method method2 = fieldWriter.method;
                if (method2 == null || method2.equals(method)) {
                    map.remove(str);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i9, long j3, String str2, String str3, Method method, ObjectWriter objectWriter, Class<?> cls2) {
        Method method2;
        String str4;
        Class<?> returnType = method.getReturnType();
        Type genericReturnType = method.getGenericReturnType();
        if (returnType == Object.class) {
            try {
                if (method.getDeclaringClass().getName().equals("java.util.HashMap$Node")) {
                    String name = method.getName();
                    method2 = (name.equals("getValue") || name.equals("getKey")) ? Map.Entry.class.getMethod(name, null) : method;
                    try {
                        method2.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                method2 = method;
            }
        }
        Method method3 = method2;
        ObjectWriter initWriter = (objectWriter == null && objectWriterProvider != null && (str2 == null || str2.isEmpty() || returnType != Date.class)) ? getInitWriter(objectWriterProvider, returnType) : objectWriter;
        Field field = (j3 & FieldInfo.RECORD) != 0 ? null : BeanUtils.getField(cls, method3);
        if (initWriter != null) {
            FieldWriterObjectMethod fieldWriterObjectMethod = new FieldWriterObjectMethod(str, i9, j3, str2, str3, genericReturnType, returnType, field, method3);
            fieldWriterObjectMethod.initValueClass = returnType;
            if (initWriter != ObjectWriterProvider.VoidObjectWriter.INSTANCE) {
                fieldWriterObjectMethod.initObjectWriter = initWriter;
            }
            return fieldWriterObjectMethod;
        }
        String str5 = str == null ? BeanUtils.getterName(method3, false, null) : str;
        if (returnType == Boolean.TYPE || returnType == Boolean.class) {
            return new FieldWriterBoolMethod(str5, i9, j3, str2, str3, field, method3, returnType);
        }
        if (returnType == Integer.TYPE || returnType == Integer.class) {
            return new FieldWriterInt32Method(str5, i9, j3, str2, str3, field, method3, returnType);
        }
        if (returnType == Float.TYPE || returnType == Float.class) {
            return new FieldWriterFloatMethod(str5, i9, j3, str2, str3, returnType, returnType, field, method3);
        }
        if (returnType == Double.TYPE || returnType == Double.class) {
            return new FieldWriterDoubleMethod(str5, i9, j3, str2, str3, returnType, returnType, field, method3);
        }
        if (returnType == Long.TYPE || returnType == Long.class) {
            String str6 = str5;
            return (str2 == null || str2.isEmpty() || "string".equals(str2)) ? new FieldWriterInt64Method(str6, i9, j3, str2, str3, method3, field, returnType) : new FieldWriterMillisMethod(str6, i9, j3, str2, str3, returnType, field, method3);
        }
        if (returnType == Short.TYPE || returnType == Short.class) {
            return new FieldWriterInt16Method(str5, i9, j3, str2, str3, field, method3, returnType);
        }
        if (returnType == Byte.TYPE || returnType == Byte.class) {
            return new FieldWriterInt8Method(str5, i9, j3, str2, str3, field, method3, returnType);
        }
        if (returnType == Character.TYPE || returnType == Character.class) {
            return new FieldWriterCharMethod(str5, i9, j3, str2, str3, field, method3, returnType);
        }
        if (returnType == BigDecimal.class) {
            return new FieldWriterBigDecimalMethod(str5, i9, j3, str2, str3, field, method3);
        }
        String str7 = str5;
        if (returnType.isEnum() && BeanUtils.getEnumValueField(returnType, objectWriterProvider) == null && !BeanUtils.isWriteEnumAsJavaBean(returnType) && BeanUtils.getEnumAnnotationNames(returnType) == null) {
            return new FieldWriterEnumMethod(str7, i9, j3, str2, str3, returnType, field, method3);
        }
        if (returnType == Date.class) {
            if (str2 != null) {
                String strTrim = str2.trim();
                str4 = strTrim.isEmpty() ? null : strTrim;
            } else {
                str4 = str2;
            }
            return new FieldWriterDateMethod(str7, i9, j3, str4, str3, returnType, field, method3);
        }
        if (returnType == String.class) {
            return new FieldWriterStringMethod(str7, i9, str2, str3, j3, field, method3);
        }
        if (returnType == List.class || returnType == ArrayList.class || returnType == Iterable.class) {
            return new FieldWriterListMethod(str7, genericReturnType instanceof ParameterizedType ? ((ParameterizedType) genericReturnType).getActualTypeArguments()[0] : Object.class, i9, j3, str2, str3, field, method3, genericReturnType, returnType, cls2);
        }
        return Map.class.isAssignableFrom(returnType) ? new FieldWriterMapMethod(str7, i9, j3, str2, str3, genericReturnType, returnType, field, method3, cls2) : returnType == Float[].class ? new FieldWriterObjectArrayMethod(str7, Float.class, i9, j3, str2, str3, genericReturnType, returnType, field, method3) : returnType == Double[].class ? new FieldWriterObjectArrayMethod(str7, Double.class, i9, j3, str2, str3, genericReturnType, returnType, field, method3) : returnType == BigDecimal[].class ? new FieldWriterObjectArrayMethod(str7, BigDecimal.class, i9, j3, str2, str3, genericReturnType, returnType, field, method3) : new FieldWriterObjectMethod(str7, i9, j3, str2, str3, genericReturnType, returnType, field, method3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ObjectWriter createObjectWriter(Class cls, long j3, ObjectWriterProvider objectWriterProvider) {
        Class cls2;
        BeanInfo beanInfo;
        ArrayList arrayList;
        ObjectWriterAdapter objectWriter1;
        BeanInfo beanInfo2 = new BeanInfo();
        objectWriterProvider.getBeanInfo(beanInfo2, cls);
        Class cls3 = beanInfo2.serializer;
        if (cls3 != null && ObjectWriter.class.isAssignableFrom(cls3)) {
            try {
                return (ObjectWriter) beanInfo2.serializer.newInstance();
            } catch (IllegalAccessException | InstantiationException e6) {
                C0086a.m465x("create serializer error", e6);
                return null;
            }
        }
        long j4 = beanInfo2.writerFeatures;
        if (beanInfo2.seeAlso != null) {
            j4 &= ~JSONWriter.Feature.WriteClassName.mask;
        }
        long j5 = (~JSONWriter.Feature.BeanToArray.mask) & (j3 | j4);
        boolean z9 = (JSONWriter.Feature.FieldBased.mask & j5) != 0;
        boolean z10 = (z9 && cls.isInterface()) ? false : z9;
        FieldInfo fieldInfo = new FieldInfo();
        if (z10) {
            TreeMap treeMap = new TreeMap();
            cls2 = cls;
            BeanUtils.declaredFields(cls2, new C0639a(this, fieldInfo, cls, j5, objectWriterProvider, beanInfo2, treeMap, 0));
            arrayList = new ArrayList(treeMap.values());
            beanInfo = beanInfo2;
        } else {
            TreeMap treeMap2 = new TreeMap();
            BeanUtils.declaredFields(cls, new C0639a(this, fieldInfo, cls, j5, objectWriterProvider, beanInfo2, treeMap2, 1));
            Class mixIn = objectWriterProvider.getMixIn(cls);
            boolean z11 = beanInfo2.kotlin;
            C0639a c0639a = new C0639a(this, fieldInfo, j5, beanInfo2, objectWriterProvider, cls, treeMap2);
            cls2 = cls;
            beanInfo = beanInfo2;
            BeanUtils.getters(cls2, mixIn, z11, c0639a);
            arrayList = new ArrayList(treeMap2.values());
        }
        long j10 = j3 | beanInfo.writerFeatures;
        if (!z10 && Throwable.class.isAssignableFrom(cls2)) {
            return new ObjectWriterException(cls2, j10, arrayList);
        }
        handleIgnores(beanInfo, arrayList);
        if (beanInfo.alphabetic) {
            Collections.sort(arrayList);
        }
        cls2.getClass();
        if (beanInfo.rootName == null) {
            switch (arrayList.size()) {
                case 1:
                    objectWriter1 = (arrayList.get(0).features & FieldInfo.VALUE_MASK) != 0 ? null : new ObjectWriter1(cls, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
                case 2:
                    objectWriter1 = new ObjectWriter2(cls, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
                case 3:
                    objectWriter1 = new ObjectWriter3(cls, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
                case 4:
                    objectWriter1 = new ObjectWriter4(cls, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
                case 5:
                    objectWriter1 = new ObjectWriter5(cls, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
                case 6:
                    objectWriter1 = new ObjectWriter6(cls, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
                case 7:
                    objectWriter1 = new ObjectWriter7(cls, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
                case 8:
                    objectWriter1 = new ObjectWriter8(cls, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
                case 9:
                    objectWriter1 = new ObjectWriter9(cls, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
                case 10:
                    objectWriter1 = new ObjectWriter10(cls, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
                case 11:
                    objectWriter1 = new ObjectWriter11(cls, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
                case 12:
                    objectWriter1 = new ObjectWriter12(cls2, beanInfo.typeKey, beanInfo.typeName, j10, arrayList);
                    break;
            }
        }
        if (objectWriter1 == null) {
            ArrayList arrayList2 = arrayList;
            String str = beanInfo.rootName;
            String str2 = beanInfo.typeKey;
            String str3 = beanInfo.typeName;
            objectWriter1 = str != null ? new ObjectWriterRootName(cls, str2, str3, str, j10, arrayList2) : new ObjectWriterAdapter(cls, str2, str3, j10, arrayList2);
        }
        if (beanInfo.serializeFilters != null) {
            configSerializeFilters(beanInfo, objectWriter1);
        }
        return objectWriter1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriter getInitWriter(ObjectWriterProvider objectWriterProvider, Class cls) {
        ObjectWriter objectWriter;
        ObjectWriter objectWriter2;
        ObjectWriter objectWriter3;
        if (cls == Date.class) {
            if ((objectWriterProvider.userDefineMask & 16) == 0 || (objectWriter3 = objectWriterProvider.cache.get(cls)) == ObjectWriterImplDate.INSTANCE) {
                return null;
            }
            return objectWriter3;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            if ((objectWriterProvider.userDefineMask & 4) == 0 || (objectWriter = objectWriterProvider.cache.get(Long.class)) == ObjectWriterImplInt64.INSTANCE) {
                return null;
            }
            return objectWriter;
        }
        if (cls == BigDecimal.class) {
            if ((objectWriterProvider.userDefineMask & 8) == 0 || (objectWriter2 = objectWriterProvider.cache.get(cls)) == ObjectWriterImplBigDecimal.INSTANCE) {
                return null;
            }
            return objectWriter2;
        }
        if (!Enum.class.isAssignableFrom(cls)) {
            return null;
        }
        ObjectWriter objectWriter4 = objectWriterProvider.cache.get(cls);
        if (objectWriter4 instanceof ObjectWriterImplEnum) {
            return null;
        }
        return objectWriter4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void handleIgnores(BeanInfo beanInfo, List<FieldWriter> list) {
        String[] strArr = beanInfo.ignores;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            FieldWriter fieldWriter = list.get(size);
            String[] strArr2 = beanInfo.ignores;
            int length = strArr2.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (strArr2[i9].equals(fieldWriter.fieldName)) {
                    list.remove(size);
                    break;
                }
                i9++;
            }
        }
    }

    public ObjectWriter createObjectWriter(FieldWriter... fieldWriterArr) {
        return new ObjectWriterAdapter(null, null, null, 0L, Arrays.asList(fieldWriterArr));
    }

    public ObjectWriter createObjectWriter(Class cls) {
        return createObjectWriter(cls, 0L, JSONFactory.defaultObjectWriterProvider);
    }

    public ObjectWriter createObjectWriter(Class cls, FieldWriter... fieldWriterArr) {
        return createObjectWriter(cls, 0L, fieldWriterArr);
    }

    public ObjectWriter createObjectWriter(Class cls, long j3, FieldWriter... fieldWriterArr) {
        if (fieldWriterArr.length == 0) {
            return createObjectWriter(cls, j3, JSONFactory.defaultObjectWriterProvider);
        }
        switch (fieldWriterArr.length) {
            case 1:
                if ((fieldWriterArr[0].features & FieldInfo.VALUE_MASK) == 0) {
                    return new ObjectWriter1(cls, null, null, j3, Arrays.asList(fieldWriterArr));
                }
                return new ObjectWriterAdapter(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            case 2:
                return new ObjectWriter2(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            case 3:
                return new ObjectWriter3(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            case 4:
                return new ObjectWriter4(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            case 5:
                return new ObjectWriter5(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            case 6:
                return new ObjectWriter6(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            case 7:
                return new ObjectWriter7(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            case 8:
                return new ObjectWriter8(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            case 9:
                return new ObjectWriter9(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            case 10:
                return new ObjectWriter10(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            case 11:
                return new ObjectWriter11(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            case 12:
                return new ObjectWriter12(cls, null, null, j3, Arrays.asList(fieldWriterArr));
            default:
                return new ObjectWriterAdapter(cls, null, null, j3, Arrays.asList(fieldWriterArr));
        }
    }

    public ObjectWriter createObjectWriter(List<FieldWriter> list) {
        return new ObjectWriterAdapter(null, null, null, 0L, list);
    }

    public <T> FieldWriter<T> createFieldWriter(String str, String str2, Field field) {
        return createFieldWriter(JSONFactory.defaultObjectWriterProvider, str, 0, 0L, str2, null, field, null);
    }

    public <T> FieldWriter<T> createFieldWriter(String str, int i9, long j3, String str2, Field field) {
        return createFieldWriter(JSONFactory.defaultObjectWriterProvider, str, i9, j3, str2, null, field, null);
    }

    public <T> FieldWriter<T> createFieldWriter(String str, int i9, long j3, String str2, String str3, Field field, ObjectWriter objectWriter) {
        return createFieldWriter(JSONFactory.defaultObjectWriterProvider, str, i9, j3, str2, str3, field, objectWriter);
    }

    public <T> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, String str, int i9, long j3, String str2, String str3, Field field, ObjectWriter objectWriter) {
        return createFieldWriter(objectWriterProvider, str, i9, j3, str2, str3, field, objectWriter, (Class<?>) null);
    }

    public <T> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, String str, int i9, long j3, String str2, String str3, Field field, ObjectWriter objectWriter, Class<?> cls) {
        ObjectWriter objectWriter2;
        Method method = (field.getDeclaringClass() == Throwable.class && field.getName().equals("stackTrace")) ? BeanUtils.getMethod(Throwable.class, "getStackTrace") : null;
        if (method != null) {
            return createFieldWriter(objectWriterProvider, Throwable.class, str, i9, j3, str2, str3, method, objectWriter);
        }
        Class<?> type = field.getType();
        Type genericType = field.getGenericType();
        if (objectWriter != null) {
            FieldWriterObject fieldWriterObject = new FieldWriterObject(str, i9, j3, str2, str3, genericType, type, field, null);
            fieldWriterObject.initValueClass = type;
            if (objectWriter != ObjectWriterProvider.VoidObjectWriter.INSTANCE) {
                fieldWriterObject.initObjectWriter = objectWriter;
            }
            return fieldWriterObject;
        }
        if (type == Boolean.TYPE) {
            return new FieldWriterBoolValField(str, i9, j3, str2, str3, field, type);
        }
        if (type == Boolean.class) {
            return new FieldWriterBoolField(str, i9, j3, str2, str3, field, null, type);
        }
        if (type == Byte.TYPE) {
            return new FieldWriterInt8ValField(str, i9, j3, str2, str3, field);
        }
        if (type == Short.TYPE) {
            return new FieldWriterInt16ValField(str, i9, j3, str2, str3, field);
        }
        if (type == Integer.TYPE) {
            return new FieldWriterInt32Val(str, i9, j3, str2, str3, field);
        }
        if (type == Long.TYPE) {
            if (str2 != null && !str2.isEmpty() && !"string".equals(str2)) {
                return new FieldWriterMillisField(str, i9, j3, str2, str3, field);
            }
            return new FieldWriterInt64ValField(str, i9, j3, str2, str3, field);
        }
        if (type == Float.TYPE) {
            return new FieldWriterFloatValField(str, i9, j3, str2, str3, field);
        }
        if (type == Float.class) {
            return new FieldWriterFloatField(str, i9, j3, str2, str3, field);
        }
        if (type == Double.TYPE) {
            return new FieldWriterDoubleValField(str, i9, str2, str3, field);
        }
        if (type == Double.class) {
            return new FieldWriterDoubleField(str, i9, j3, str2, str3, field);
        }
        if (type == Character.TYPE) {
            return new FieldWriterCharValField(str, i9, j3, str2, str3, field);
        }
        if (type == BigInteger.class) {
            return new FieldWriterBigIntField(str, i9, j3, str2, str3, field);
        }
        if (type == BigDecimal.class) {
            return new FieldWriterBigDecimalField(str, i9, j3, str2, str3, field);
        }
        if (type == Date.class) {
            return new FieldWriterDateField(str, i9, j3, str2, str3, field);
        }
        if (type == String.class) {
            return new FieldWriterStringField(str, i9, j3, str2, str3, field);
        }
        if (type.isEnum()) {
            BeanInfo beanInfo = new BeanInfo();
            objectWriterProvider.getBeanInfo(beanInfo, type);
            boolean z9 = beanInfo.writeEnumAsJavaBean;
            if (!z9 && (objectWriter2 = objectWriterProvider.cache.get(type)) != null && !(objectWriter2 instanceof ObjectWriterImplEnum)) {
                z9 = true;
            }
            if (BeanUtils.getEnumValueField(type, objectWriterProvider) == null && !z9 && BeanUtils.getEnumAnnotationNames(type) == null) {
                return new FieldWriterEnum(str, i9, j3, str2, str3, genericType, type, field, null);
            }
        }
        if (type != List.class && type != ArrayList.class && type != Iterable.class) {
            if (Map.class.isAssignableFrom(type)) {
                return new FieldWriterMapField(str, i9, j3, str2, str3, field.getGenericType(), type, field, null, cls);
            }
            if (type.isArray() && !type.getComponentType().isPrimitive()) {
                Class<?> componentType = type.getComponentType();
                return new FieldWriterObjectArrayField(str, componentType, i9, j3, str2, str3, componentType, type, field);
            }
            return new FieldWriterObject(str, i9, j3, str2, str3, field.getGenericType(), type, field, null);
        }
        return new FieldWriterListField(str, genericType instanceof ParameterizedType ? ((ParameterizedType) genericType).getActualTypeArguments()[0] : null, i9, j3, str2, str3, genericType, type, field, cls);
    }

    public <T> FieldWriter<T> createFieldWriter(Class<T> cls, String str, String str2, Method method) {
        return createFieldWriter(cls, str, 0, 0L, str2, method);
    }

    public <T> FieldWriter<T> createFieldWriter(Class<T> cls, String str, int i9, long j3, String str2, Method method) {
        return createFieldWriter((ObjectWriterProvider) null, cls, str, i9, j3, str2, (String) null, method, (ObjectWriter) null);
    }

    public <T> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i9, long j3, String str2, String str3, Method method, ObjectWriter objectWriter) {
        return createFieldWriter(objectWriterProvider, cls, str, i9, j3, str2, str3, method, objectWriter, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x009f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x00a7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.alibaba.fastjson2.writer.ObjectWriter] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.alibaba.fastjson2.writer.ObjectWriterCreator] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v21, types: [com.alibaba.fastjson2.writer.ObjectWriterImplMap] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [com.alibaba.fastjson2.writer.ObjectWriterProvider$VoidObjectWriter] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FieldWriter createFieldWriter(Class cls, long j3, ObjectWriterProvider objectWriterProvider, BeanInfo beanInfo, FieldInfo fieldInfo, Field field) {
        String name;
        ?? M1785of;
        String str;
        Class<?> cls2;
        ObjectWriter objectWriter;
        Class<?> cls3;
        String[] strArr;
        fieldInfo.features = j3;
        objectWriterProvider.getFieldInfo(beanInfo, fieldInfo, cls, field);
        ObjectWriter objectWriter2 = null;
        if (fieldInfo.ignore) {
            return null;
        }
        String str2 = fieldInfo.fieldName;
        if (str2 != null && !str2.isEmpty()) {
            name = fieldInfo.fieldName;
        } else {
            name = field.getName();
            String str3 = beanInfo.namingStrategy;
            if (str3 != null) {
                name = BeanUtils.fieldName(name, str3);
            }
        }
        String str4 = name;
        if (beanInfo.orders != null) {
            int i9 = 0;
            boolean z9 = false;
            while (true) {
                strArr = beanInfo.orders;
                if (i9 >= strArr.length) {
                    break;
                }
                if (str4.equals(strArr[i9])) {
                    fieldInfo.ordinal = i9;
                    z9 = true;
                }
                i9++;
            }
            if (!z9 && fieldInfo.ordinal == 0) {
                fieldInfo.ordinal = strArr.length;
            }
        }
        if (fieldInfo.ordinal == 0 && str4.equals(beanInfo.typeKey)) {
            fieldInfo.ordinal = -1;
        }
        String[] strArr2 = beanInfo.includes;
        if (strArr2 != null && strArr2.length > 0) {
            for (String str5 : strArr2) {
                if (!str5.equals(str4)) {
                }
            }
            return null;
        }
        Class<?> cls4 = fieldInfo.writeUsing;
        if (cls4 != null) {
            try {
                Constructor<?> declaredConstructor = cls4.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                M1785of = (ObjectWriter) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
                C0086a.m465x("create writeUsing Writer error", e6);
                return null;
            }
        } else {
            M1785of = 0;
        }
        try {
            field.setAccessible(true);
        } catch (Throwable unused) {
        }
        if (M1785of == 0 && fieldInfo.fieldClassMixIn) {
            M1785of = ObjectWriterProvider.VoidObjectWriter.INSTANCE;
        }
        if (M1785of == 0) {
            Class<?> type = field.getType();
            if (type == Date.class) {
                ObjectWriter objectWriter3 = objectWriterProvider.cache.get(type);
                if (objectWriter3 != ObjectWriterImplDate.INSTANCE) {
                    M1785of = objectWriter3;
                }
            } else if (Map.class.isAssignableFrom(type) && ((cls2 = fieldInfo.keyUsing) != null || fieldInfo.valueUsing != null)) {
                if (cls2 != null) {
                    try {
                        Constructor<?> declaredConstructor2 = cls2.getDeclaredConstructor(null);
                        declaredConstructor2.setAccessible(true);
                        objectWriter = (ObjectWriter) declaredConstructor2.newInstance(null);
                    } catch (Exception unused2) {
                        objectWriter = null;
                    }
                    cls3 = fieldInfo.valueUsing;
                    if (cls3 != null) {
                        try {
                            Constructor<?> declaredConstructor3 = cls3.getDeclaredConstructor(null);
                            declaredConstructor3.setAccessible(true);
                            objectWriter2 = (ObjectWriter) declaredConstructor3.newInstance(null);
                        } catch (Exception unused3) {
                        }
                    }
                    if (objectWriter == null || objectWriter2 != null) {
                        M1785of = ObjectWriterImplMap.m1785of(field.getType(), type);
                        M1785of.keyWriter = objectWriter;
                        M1785of.valueWriter = objectWriter2;
                    }
                } else {
                    objectWriter = null;
                    cls3 = fieldInfo.valueUsing;
                    if (cls3 != null) {
                    }
                    if (objectWriter == null) {
                        M1785of = ObjectWriterImplMap.m1785of(field.getType(), type);
                        M1785of.keyWriter = objectWriter;
                        M1785of.valueWriter = objectWriter2;
                    }
                }
            }
        }
        ?? r10 = M1785of;
        String str6 = fieldInfo.format;
        return createFieldWriter(objectWriterProvider, str4, fieldInfo.ordinal, fieldInfo.features, (str6 != null || (str = beanInfo.format) == null) ? str6 : str, fieldInfo.label, field, r10, fieldInfo.contentAs);
    }

    public <T> FieldWriter createFieldWriter(String str, ToLongFunction<T> toLongFunction) {
        return new FieldWriterInt64ValFunc(str, 0, 0L, null, null, null, toLongFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, ToIntFunction<T> toIntFunction) {
        return new FieldWriterInt32ValFunc(str, 0, 0L, null, null, null, toIntFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, ToShortFunction<T> toShortFunction) {
        return new FieldWriterInt16ValFunc(str, 0, 0L, null, null, null, toShortFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, ToByteFunction<T> toByteFunction) {
        return new FieldWriterInt8ValFunc(str, 0, 0L, null, null, null, toByteFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, ToFloatFunction<T> toFloatFunction) {
        return new FieldWriterFloatValueFunc(str, 0, 0L, null, null, null, toFloatFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, ToDoubleFunction<T> toDoubleFunction) {
        return new FieldWriterDoubleValueFunc(str, 0, 0L, null, null, null, toDoubleFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, Predicate<T> predicate) {
        return new FieldWriterBoolValFunc(str, 0, 0L, null, null, null, predicate);
    }

    public <T, V> FieldWriter createFieldWriter(String str, Class cls, Function<T, V> function) {
        return createFieldWriter(null, null, str, 0, 0L, null, null, cls, cls, null, function);
    }

    public <T, V> FieldWriter createFieldWriter(String str, Type type, Class cls, Function<T, V> function) {
        return createFieldWriter(null, null, str, 0, 0L, null, null, type, cls, null, function);
    }

    public <T, V> FieldWriter createFieldWriter(String str, long j3, String str2, Class cls, Function<T, V> function) {
        return createFieldWriter(null, null, str, 0, j3, str2, null, cls, cls, null, function);
    }

    public <T, V> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i9, long j3, String str2, String str3, Type type, Class<V> cls2, Method method, Function<T, V> function) {
        return createFieldWriter(objectWriterProvider, cls, str, i9, j3, str2, str3, type, cls2, method, function, null);
    }

    public <T, V> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i9, long j3, String str2, String str3, Type type, Class<V> cls2, Method method, Function<T, V> function, Class<?> cls3) {
        ObjectWriter objectWriter;
        if (cls2 == Byte.class) {
            return new FieldWriterInt8Func(str, i9, j3, str2, str3, method, function);
        }
        if (cls2 == Short.class) {
            return new FieldWriterInt16Func(str, i9, j3, str2, str3, method, function);
        }
        if (cls2 == Integer.class) {
            return new FieldWriterInt32Func(str, i9, j3, str2, str3, method, function);
        }
        if (cls2 == Long.class) {
            return new FieldWriterInt64Func(str, i9, j3, str2, str3, method, function);
        }
        if (cls2 == BigInteger.class) {
            return new FieldWriterBigIntFunc(str, i9, j3, str2, str3, method, function);
        }
        if (cls2 == BigDecimal.class) {
            return new FieldWriterBigDecimalFunc(str, i9, j3, str2, str3, method, function);
        }
        if (cls2 == String.class) {
            return new FieldWriterStringFunc(str, i9, j3, str2, str3, method, function);
        }
        if (cls2 == Date.class) {
            return new FieldWriterDateFunc(str, i9, j3, str2, str3, method, function);
        }
        if (cls2 == UUID.class) {
            return new FieldWriterUUIDFunc(str, i9, j3, str2, str3, type, cls2, method, function);
        }
        if (Calendar.class.isAssignableFrom(cls2)) {
            return new FieldWriterCalendarFunc(str, i9, j3, str2, str3, method, function);
        }
        if (cls2.isEnum()) {
            BeanInfo beanInfo = new BeanInfo();
            if (objectWriterProvider == null) {
                objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
            }
            objectWriterProvider.getBeanInfo(beanInfo, cls2);
            boolean z9 = beanInfo.writeEnumAsJavaBean;
            if (!z9 && (objectWriter = objectWriterProvider.cache.get(cls2)) != null && !(objectWriter instanceof ObjectWriterImplEnum)) {
                z9 = true;
            }
            if (!z9 && BeanUtils.getEnumValueField(cls2, objectWriterProvider) == null && BeanUtils.getEnumAnnotationNames(cls2) == null) {
                return new FieldWriterEnumFunc(str, i9, j3, str2, str3, type, cls2, method, function);
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if ((rawType == List.class || rawType == ArrayList.class || rawType == Iterable.class) && actualTypeArguments.length == 1) {
                Type type2 = actualTypeArguments[0];
                if (type2 == String.class) {
                    return new FieldWriterListStrFunc(str, i9, j3, str2, str3, method, function, type, cls2);
                }
                return new FieldWriterListFunc(str, i9, j3, str2, str3, type2, method, function, type, cls2, cls3);
            }
            if ((rawType instanceof Class) && Map.class.isAssignableFrom((Class) rawType)) {
                return new FieldWriterMapFunction(str, i9, j3, str2, str3, type, cls2, null, method, function, cls3);
            }
        }
        if (Modifier.isFinal(cls2.getModifiers())) {
            return new FieldWriterObjectFuncFinal(str, i9, j3, str2, str3, type, cls2, method, function);
        }
        return new FieldWriterObjectFunc(str, i9, j3, str2, str3, type, cls2, method, function);
    }
}
