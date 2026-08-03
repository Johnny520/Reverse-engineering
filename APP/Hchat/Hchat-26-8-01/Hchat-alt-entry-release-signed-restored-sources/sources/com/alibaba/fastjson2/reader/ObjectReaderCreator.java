package com.alibaba.fastjson2.reader;

import be.C0294m0;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.TypeReference;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import p012ah.C0086a;
import p025bc.C0260j;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderCreator {
    public static final ObjectReaderCreator INSTANCE = new ObjectReaderCreator();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class CreateFieldReaderConsumer implements Consumer {
        final BeanInfo beanInfo;
        final FieldInfo fieldInfo;
        final Map<String, FieldReader> fieldReaders;
        final String namingStrategy;
        final Class objectClass;
        final Type objectType;
        final String[] orders;
        final ObjectReaderProvider provider;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public CreateFieldReaderConsumer(Class cls, Type type, String str, String[] strArr, BeanInfo beanInfo, FieldInfo fieldInfo, Map<String, FieldReader> map, ObjectReaderProvider objectReaderProvider) {
            this.objectClass = cls;
            this.objectType = type;
            this.namingStrategy = str;
            this.orders = strArr;
            this.beanInfo = beanInfo;
            this.fieldInfo = fieldInfo;
            this.fieldReaders = map;
            this.provider = objectReaderProvider;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.function.Consumer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void accept(Object obj) {
            int i9;
            int i10;
            String[] strArr;
            String str;
            char cCharAt;
            CreateFieldReaderConsumer createFieldReaderConsumer = this;
            Method method = (Method) obj;
            createFieldReaderConsumer.fieldInfo.init();
            FieldInfo fieldInfo = createFieldReaderConsumer.fieldInfo;
            long j3 = fieldInfo.features;
            BeanInfo beanInfo = createFieldReaderConsumer.beanInfo;
            fieldInfo.features = j3 | beanInfo.readerFeatures;
            fieldInfo.format = beanInfo.format;
            createFieldReaderConsumer.provider.getFieldInfo(fieldInfo, createFieldReaderConsumer.objectClass, method);
            FieldInfo fieldInfo2 = createFieldReaderConsumer.fieldInfo;
            if (fieldInfo2.ignore) {
                return;
            }
            String name = fieldInfo2.fieldName;
            if (name == null) {
                String name2 = method.getName();
                if (name2.startsWith("set", 0)) {
                    str = BeanUtils.setterName(name2, createFieldReaderConsumer.namingStrategy);
                    if (createFieldReaderConsumer.fieldInfo.alternateNames == null) {
                        String strSubstring = name2.substring(3);
                        Field declaredField = BeanUtils.getDeclaredField(createFieldReaderConsumer.objectClass, strSubstring);
                        if (declaredField == null && method.getParameterTypes()[0] == Boolean.TYPE && !strSubstring.isEmpty()) {
                            strSubstring = "is" + Character.toUpperCase(strSubstring.charAt(0)) + strSubstring.substring(1);
                            declaredField = BeanUtils.getDeclaredField(createFieldReaderConsumer.objectClass, strSubstring);
                        }
                        if (declaredField != null) {
                            createFieldReaderConsumer.fieldInfo.alternateNames = new String[]{strSubstring};
                        }
                    }
                } else {
                    str = BeanUtils.getterName(method, createFieldReaderConsumer.beanInfo.kotlin, createFieldReaderConsumer.namingStrategy);
                }
                int length = str.length();
                char cCharAt2 = length > 0 ? str.charAt(0) : (char) 0;
                if ((length != 1 || cCharAt2 < 'a' || cCharAt2 > 'z') && (length <= 2 || cCharAt2 < 'A' || cCharAt2 > 'Z' || (cCharAt = str.charAt(1)) < 'A' || cCharAt > 'Z')) {
                    name = str;
                } else {
                    char[] charArray = str.toCharArray();
                    if (length == 1) {
                        charArray[0] = (char) (charArray[0] - ' ');
                    } else {
                        charArray[0] = (char) (charArray[0] + ' ');
                    }
                    Field declaredField2 = BeanUtils.getDeclaredField(createFieldReaderConsumer.objectClass, new String(charArray));
                    if (declaredField2 != null) {
                        if (Modifier.isPublic(declaredField2.getModifiers())) {
                            name = declaredField2.getName();
                        } else if (length == 1) {
                            createFieldReaderConsumer.fieldInfo.alternateNames = new String[]{str};
                            name = declaredField2.getName();
                        }
                    }
                }
            }
            String[] strArr2 = createFieldReaderConsumer.orders;
            if (strArr2 != null && strArr2.length > 0) {
                int i11 = 0;
                while (true) {
                    String[] strArr3 = createFieldReaderConsumer.orders;
                    if (i11 >= strArr3.length) {
                        FieldInfo fieldInfo3 = createFieldReaderConsumer.fieldInfo;
                        if (fieldInfo3.ordinal == 0) {
                            fieldInfo3.ordinal = strArr3.length;
                        }
                    } else {
                        if (name.equals(strArr3[i11])) {
                            createFieldReaderConsumer.fieldInfo.ordinal = i11;
                            break;
                        }
                        i11++;
                    }
                }
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                String str2 = name;
                ObjectReaderCreator objectReaderCreator = ObjectReaderCreator.this;
                Class cls = createFieldReaderConsumer.objectClass;
                Type type = createFieldReaderConsumer.objectType;
                FieldInfo fieldInfo4 = createFieldReaderConsumer.fieldInfo;
                int i12 = fieldInfo4.ordinal;
                long j4 = fieldInfo4.features | FieldInfo.READ_ONLY;
                String str3 = fieldInfo4.format;
                Locale locale = fieldInfo4.locale;
                String str4 = fieldInfo4.defaultValue;
                Type genericReturnType = method.getGenericReturnType();
                Class<?> returnType = method.getReturnType();
                ObjectReader initReader = createFieldReaderConsumer.fieldInfo.getInitReader();
                FieldInfo fieldInfo5 = createFieldReaderConsumer.fieldInfo;
                FieldReader fieldReaderCreateFieldReaderMethod = objectReaderCreator.createFieldReaderMethod(cls, type, str2, i12, j4, str3, locale, str4, genericReturnType, returnType, method, initReader, fieldInfo5.arrayToMapKey, fieldInfo5.getInitArrayToMapDuplicateHandler());
                FieldReader fieldReader = createFieldReaderConsumer.fieldReaders.get(str2);
                if (fieldReader == null) {
                    createFieldReaderConsumer.fieldReaders.put(str2, fieldReaderCreateFieldReaderMethod);
                    return;
                } else {
                    if (fieldReader.compareTo(fieldReaderCreateFieldReaderMethod) > 0) {
                        createFieldReaderConsumer.fieldReaders.put(str2, fieldReaderCreateFieldReaderMethod);
                        return;
                    }
                    return;
                }
            }
            String str5 = name;
            if (length2 == 2) {
                Class<?> cls2 = parameterTypes[1];
                Type type2 = method.getGenericParameterTypes()[1];
                method.setAccessible(true);
                FieldInfo fieldInfo6 = createFieldReaderConsumer.fieldInfo;
                FieldReaderAnySetter fieldReaderAnySetter = new FieldReaderAnySetter(type2, cls2, fieldInfo6.ordinal, fieldInfo6.features, fieldInfo6.format, method);
                createFieldReaderConsumer.fieldReaders.put(fieldReaderAnySetter.fieldName, fieldReaderAnySetter);
                return;
            }
            Class<?> cls3 = parameterTypes[0];
            Type type3 = (cls3.isPrimitive() || cls3 == String.class || cls3.isEnum()) ? cls3 : method.getGenericParameterTypes()[0];
            if ((type3 instanceof Class) && Collection.class.isAssignableFrom((Class) type3)) {
                for (Class<?> cls4 : createFieldReaderConsumer.objectClass.getInterfaces()) {
                    Method method2 = BeanUtils.getMethod(cls4, method);
                    if (method2 != null) {
                        Type[] genericParameterTypes = method2.getGenericParameterTypes();
                        if (genericParameterTypes.length == 1) {
                            Type type4 = genericParameterTypes[0];
                            if (type4 instanceof ParameterizedType) {
                                type3 = type4;
                            }
                        }
                    }
                }
            }
            Type type5 = type3;
            ObjectReader initReader2 = ObjectReaderCreator.getInitReader(createFieldReaderConsumer.provider, type5, cls3, createFieldReaderConsumer.fieldInfo);
            ObjectReaderCreator objectReaderCreator2 = ObjectReaderCreator.this;
            Class cls5 = createFieldReaderConsumer.objectClass;
            Type type6 = createFieldReaderConsumer.objectType;
            FieldInfo fieldInfo7 = createFieldReaderConsumer.fieldInfo;
            FieldReader fieldReaderCreateFieldReaderMethod2 = objectReaderCreator2.createFieldReaderMethod(cls5, type6, str5, fieldInfo7.ordinal, fieldInfo7.features, fieldInfo7.format, fieldInfo7.locale, fieldInfo7.defaultValue, type5, cls3, method, initReader2, fieldInfo7.arrayToMapKey, fieldInfo7.getInitArrayToMapDuplicateHandler());
            FieldReader fieldReader2 = createFieldReaderConsumer.fieldReaders.get(str5);
            if (fieldReader2 == null || fieldReader2.compareTo(fieldReaderCreateFieldReaderMethod2) > 0) {
                createFieldReaderConsumer.fieldReaders.put(str5, fieldReaderCreateFieldReaderMethod2);
            }
            String[] strArr4 = createFieldReaderConsumer.fieldInfo.alternateNames;
            if (strArr4 != null) {
                int length3 = strArr4.length;
                int i13 = 0;
                while (i13 < length3) {
                    String str6 = strArr4[i13];
                    if (!str5.equals(str6) && createFieldReaderConsumer.fieldReaders.get(str6) == null) {
                        Map<String, FieldReader> map = createFieldReaderConsumer.fieldReaders;
                        String[] strArr5 = strArr4;
                        ObjectReaderCreator objectReaderCreator3 = ObjectReaderCreator.this;
                        int i14 = length3;
                        Class cls6 = createFieldReaderConsumer.objectClass;
                        i9 = i13;
                        Type type7 = createFieldReaderConsumer.objectType;
                        FieldInfo fieldInfo8 = createFieldReaderConsumer.fieldInfo;
                        i10 = i14;
                        strArr = strArr5;
                        map.put(str6, objectReaderCreator3.createFieldReaderMethod(cls6, type7, str6, fieldInfo8.ordinal, fieldInfo8.features, fieldInfo8.format, fieldInfo8.locale, fieldInfo8.defaultValue, type5, cls3, method, initReader2));
                    } else {
                        strArr = strArr4;
                        i10 = length3;
                        i9 = i13;
                    }
                    i13 = i9 + 1;
                    createFieldReaderConsumer = this;
                    strArr4 = strArr;
                    length3 = i10;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class FieldConsumer implements Consumer {
        final BeanInfo beanInfo;
        final boolean fieldBased;
        final FieldInfo fieldInfo;
        final Map<String, FieldReader> fieldReaders;
        final String namingStrategy;
        final Class objectClass;
        final Type objectType;
        final ObjectReaderProvider provider;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public FieldConsumer(Class cls, Type type, String str, FieldInfo fieldInfo, Map<String, FieldReader> map, ObjectReaderProvider objectReaderProvider, BeanInfo beanInfo, boolean z9) {
            this.objectClass = cls;
            this.objectType = type;
            this.namingStrategy = str;
            this.fieldInfo = fieldInfo;
            this.fieldReaders = map;
            this.provider = objectReaderProvider;
            this.beanInfo = beanInfo;
            this.fieldBased = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.function.Consumer
        public void accept(Object obj) {
            String name;
            String[] strArr;
            int i9;
            int i10;
            Field field = (Field) obj;
            this.fieldInfo.init();
            boolean z9 = this.fieldBased;
            FieldInfo fieldInfo = this.fieldInfo;
            if (z9) {
                fieldInfo.features |= JSONReader.Feature.FieldBased.mask;
            } else {
                fieldInfo.ignore = (field.getModifiers() & 1) == 0;
            }
            FieldInfo fieldInfo2 = this.fieldInfo;
            long j3 = fieldInfo2.features;
            BeanInfo beanInfo = this.beanInfo;
            fieldInfo2.features = j3 | beanInfo.readerFeatures;
            fieldInfo2.format = beanInfo.format;
            this.provider.getFieldInfo(fieldInfo2, this.objectClass, field);
            FieldInfo fieldInfo3 = this.fieldInfo;
            if (!fieldInfo3.ignore || ((fieldInfo3.features & FieldInfo.UNWRAPPED_MASK) != 0 && Map.class.isAssignableFrom(field.getType()))) {
                String str = this.fieldInfo.fieldName;
                if (str == null || str.isEmpty()) {
                    name = field.getName();
                    String str2 = this.namingStrategy;
                    if (str2 != null) {
                        name = BeanUtils.fieldName(name, str2);
                    }
                } else {
                    name = this.fieldInfo.fieldName;
                }
                String str3 = name;
                String[] strArr2 = this.beanInfo.orders;
                if (strArr2 != null && strArr2.length > 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= strArr2.length) {
                            FieldInfo fieldInfo4 = this.fieldInfo;
                            if (fieldInfo4.ordinal == 0) {
                                fieldInfo4.ordinal = strArr2.length;
                            }
                        } else {
                            if (str3.equals(strArr2[i11])) {
                                this.fieldInfo.ordinal = i11;
                                break;
                            }
                            i11++;
                        }
                    }
                }
                Class<?> type = field.getType();
                Type genericType = field.getGenericType();
                ObjectReader initReader = ObjectReaderCreator.getInitReader(this.provider, genericType, type, this.fieldInfo);
                ObjectReaderCreator objectReaderCreator = ObjectReaderCreator.this;
                Class cls = this.objectClass;
                Type type2 = this.objectType;
                FieldInfo fieldInfo5 = this.fieldInfo;
                FieldReader fieldReaderCreateFieldReader = objectReaderCreator.createFieldReader(cls, type2, str3, fieldInfo5.ordinal, fieldInfo5.features, fieldInfo5.format, fieldInfo5.locale, fieldInfo5.defaultValue, genericType, type, field, initReader, fieldInfo5.arrayToMapKey, fieldInfo5.getInitArrayToMapDuplicateHandler());
                FieldReader fieldReader = this.fieldReaders.get(str3);
                if (fieldReader == null || fieldReaderCreateFieldReader.compareTo(fieldReader) > 0) {
                    this.fieldReaders.put(str3, fieldReaderCreateFieldReader);
                }
                String[] strArr3 = this.fieldInfo.alternateNames;
                if (strArr3 != null) {
                    int length = strArr3.length;
                    int i12 = 0;
                    while (i12 < length) {
                        String str4 = strArr3[i12];
                        if (str3.equals(str4)) {
                            strArr = strArr3;
                            i9 = length;
                            i10 = i12;
                        } else {
                            String[] strArr4 = strArr3;
                            ObjectReaderCreator objectReaderCreator2 = ObjectReaderCreator.this;
                            int i13 = length;
                            Class cls2 = this.objectClass;
                            int i14 = i12;
                            Type type3 = this.objectType;
                            FieldInfo fieldInfo6 = this.fieldInfo;
                            strArr = strArr4;
                            i9 = i13;
                            i10 = i14;
                            FieldReader fieldReaderCreateFieldReader2 = objectReaderCreator2.createFieldReader(cls2, type3, str4, fieldInfo6.ordinal, fieldInfo6.features, null, fieldInfo6.locale, fieldInfo6.defaultValue, genericType, type, field, null);
                            if (this.fieldReaders.get(str4) == null) {
                                this.fieldReaders.put(str4, fieldReaderCreateFieldReader2);
                            }
                        }
                        i12 = i10 + 1;
                        strArr3 = strArr;
                        length = i9;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ObjectReader getInitReader(ObjectReaderProvider objectReaderProvider, Type type, Class cls, FieldInfo fieldInfo) {
        ObjectReader objectReader;
        ObjectReader objectReader2;
        Class<?> cls2;
        ObjectReader objectReaderM1732of;
        ObjectReader initReader = fieldInfo.getInitReader();
        if (initReader == null && ((fieldInfo.keyUsing != null || fieldInfo.valueUsing != null) && Map.class.isAssignableFrom(cls))) {
            Class<?> cls3 = fieldInfo.keyUsing;
            ObjectReader objectReader3 = null;
            if (cls3 != null) {
                try {
                    Constructor<?> declaredConstructor = cls3.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    objectReader2 = (ObjectReader) declaredConstructor.newInstance(null);
                } catch (Exception unused) {
                    objectReader2 = null;
                }
                cls2 = fieldInfo.valueUsing;
                if (cls2 != null) {
                    try {
                        Constructor<?> declaredConstructor2 = cls2.getDeclaredConstructor(null);
                        declaredConstructor2.setAccessible(true);
                        objectReader3 = (ObjectReader) declaredConstructor2.newInstance(null);
                    } catch (Exception unused2) {
                    }
                }
                if (objectReader2 == null || objectReader3 != null) {
                    objectReaderM1732of = ObjectReaderImplMap.m1732of(type, cls, fieldInfo.features);
                    if (objectReaderM1732of instanceof ObjectReaderImplMapTyped) {
                        ObjectReaderImplMapTyped objectReaderImplMapTyped = (ObjectReaderImplMapTyped) objectReaderM1732of;
                        if (objectReader2 != null) {
                            objectReaderImplMapTyped.keyObjectReader = objectReader2;
                        }
                        if (objectReader3 != null) {
                            objectReaderImplMapTyped.valueObjectReader = objectReader3;
                        }
                        return objectReaderImplMapTyped;
                    }
                }
            } else {
                objectReader2 = null;
                cls2 = fieldInfo.valueUsing;
                if (cls2 != null) {
                }
                if (objectReader2 == null) {
                    objectReaderM1732of = ObjectReaderImplMap.m1732of(type, cls, fieldInfo.features);
                    if (objectReaderM1732of instanceof ObjectReaderImplMapTyped) {
                    }
                }
            }
        }
        if (initReader != null) {
            return initReader;
        }
        if (cls == BigDecimal.class) {
            objectReader = objectReaderProvider.getObjectReader(BigDecimal.class, false);
            if (objectReader == ObjectReaderImplBigDecimal.INSTANCE) {
                return initReader;
            }
        } else if (cls == BigInteger.class) {
            objectReader = objectReaderProvider.getObjectReader(BigInteger.class, false);
            if (objectReader == ObjectReaderImplBigInteger.INSTANCE) {
                return initReader;
            }
        } else if (cls != Date.class || (objectReader = objectReaderProvider.getObjectReader(Date.class, false)) == ObjectReaderImplDate.INSTANCE) {
            return initReader;
        }
        return objectReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$createBuildFunction$3(Method method, Object obj) {
        try {
            return method.invoke(obj, null);
        } catch (Throwable th2) {
            C0086a.m465x("create instance error", th2);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$createObjectReaderWithBuilder$0(FieldInfo fieldInfo, ObjectReaderProvider objectReaderProvider, Class cls, String str, Class cls2, BeanInfo beanInfo, int i9, Map map, Type type, Method method) {
        Class cls3;
        String str2;
        String[] strArr;
        int i10;
        fieldInfo.init();
        objectReaderProvider.getFieldInfo(fieldInfo, cls, method);
        if (fieldInfo.ignore) {
            return;
        }
        String name = method.getName();
        String str3 = fieldInfo.fieldName;
        if (str3 != null && !str3.isEmpty()) {
            name = fieldInfo.fieldName;
        } else {
            if (name.length() <= str.length() || !name.startsWith(str, 0)) {
                if (method.getDeclaringClass() == Object.class || method.getReturnType() != (cls3 = cls2)) {
                    return;
                }
                if (method.getAnnotation(JSONField.class) == null && (beanInfo.readerFeatures & JSONReader.Feature.SupportSmartMatch.mask) == 0) {
                    return;
                }
                if (method.getParameterTypes().length != 0) {
                    Class cls4 = cls3;
                    String str4 = name;
                    FieldReader fieldReaderCreateFieldReaderMethod = createFieldReaderMethod(cls4, cls2, str4, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, method.getGenericReturnType(), method.getReturnType(), method, null);
                    FieldReader fieldReader = (FieldReader) map.get(str4);
                    if (fieldReader == null) {
                        map.put(str4, fieldReaderCreateFieldReaderMethod);
                        return;
                    } else {
                        if (fieldReader.compareTo(fieldReaderCreateFieldReaderMethod) > 0) {
                            map.put(str4, fieldReaderCreateFieldReaderMethod);
                            return;
                        }
                        return;
                    }
                }
                String str5 = name;
                Type type2 = method.getGenericParameterTypes()[0];
                Class<?> cls5 = method.getParameterTypes()[0];
                method.setAccessible(true);
                FieldReader fieldReaderCreateFieldReaderMethod2 = createFieldReaderMethod(cls2, type, str5, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, type2, cls5, method, null);
                String str6 = str5;
                FieldReader fieldReader2 = (FieldReader) map.get(str6);
                if (fieldReader2 == null || fieldReader2.compareTo(fieldReaderCreateFieldReaderMethod2) > 0) {
                    map.put(str6, fieldReaderCreateFieldReaderMethod2);
                }
                String[] strArr2 = fieldInfo.alternateNames;
                if (strArr2 != null) {
                    int i11 = 0;
                    while (i11 < strArr2.length) {
                        String str7 = strArr2[i11];
                        if (!str6.equals(str7) && ((FieldReader) map.get(str7)) == null) {
                            str2 = str6;
                            strArr = strArr2;
                            i10 = i11;
                            map.put(str7, createFieldReaderMethod(cls2, type, str7, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, type2, cls5, method, null));
                        } else {
                            str2 = str6;
                            strArr = strArr2;
                            i10 = i11;
                        }
                        i11 = i10 + 1;
                        str6 = str2;
                        strArr2 = strArr;
                    }
                    return;
                }
                return;
            }
            name = BeanUtils.setterName(name, i9);
        }
        cls3 = cls2;
        if (method.getParameterTypes().length != 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createObjectReaderWithCreator$1(Class cls, ObjectReaderProvider objectReaderProvider, Class cls2, BeanInfo beanInfo, String str, FieldInfo fieldInfo, Method method) {
        if (method.getReturnType() != cls) {
            return;
        }
        FieldInfo fieldInfo2 = new FieldInfo();
        objectReaderProvider.getFieldInfo(fieldInfo2, cls2, method);
        String str2 = fieldInfo2.fieldName;
        if (str2 == null) {
            str2 = BeanUtils.getterName(method, beanInfo.kotlin, PropertyNamingStrategy.CamelCase.name());
        }
        if (fieldInfo2.readUsing == null || !str.equals(str2)) {
            return;
        }
        fieldInfo.readUsing = fieldInfo2.readUsing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T, R> Function<T, R> createBuildFunction(Method method) {
        method.setAccessible(true);
        return new C0260j(method, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader createEnumReader(Class cls, Method method, ObjectReaderProvider objectReaderProvider) throws NoSuchMethodException {
        Class cls2;
        FieldInfo fieldInfo = new FieldInfo();
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i9 = 0; enumArr != null && i9 < enumArr.length; i9++) {
            Enum r42 = enumArr[i9];
            String strName = r42.name();
            linkedHashMap.put(Long.valueOf(Fnv.hashCode64(strName)), r42);
            try {
                fieldInfo.init();
                objectReaderProvider.getFieldInfo(fieldInfo, cls, BeanUtils.getField(cls, strName));
                String str = fieldInfo.fieldName;
                if (str != null && !str.isEmpty() && !str.equals(strName)) {
                    linkedHashMap.put(Long.valueOf(Fnv.hashCode64(str)), r42);
                }
                String[] strArr = fieldInfo.alternateNames;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (str2 != null && !str2.isEmpty()) {
                            linkedHashMap.put(Long.valueOf(Fnv.hashCode64(str2)), r42);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        for (int i10 = 0; enumArr != null && i10 < enumArr.length; i10++) {
            Enum r32 = enumArr[i10];
            String strName2 = r32.name();
            linkedHashMap.put(Long.valueOf(Fnv.hashCode64LCase(strName2)), r32);
            String string = r32.toString();
            if (!strName2.equals(string)) {
                linkedHashMap.putIfAbsent(Long.valueOf(Fnv.hashCode64LCase(string)), r32);
            }
        }
        int size = linkedHashMap.size();
        long[] jArr = new long[size];
        Iterator it = linkedHashMap.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        Member enumValueField = BeanUtils.getEnumValueField(cls, objectReaderProvider);
        if (enumValueField == null && objectReaderProvider != null && (cls2 = objectReaderProvider.mixInCache.get(cls)) != null) {
            Member enumValueField2 = BeanUtils.getEnumValueField(cls2, objectReaderProvider);
            if (enumValueField2 instanceof Field) {
                try {
                    enumValueField = cls.getField(((Field) enumValueField2).getName());
                } catch (NoSuchFieldException | NoSuchMethodException unused2) {
                }
            } else if (enumValueField2 instanceof Method) {
                enumValueField = cls.getMethod(((Method) enumValueField2).getName(), null);
            }
        }
        Member member = enumValueField;
        Enum[] enumArr2 = new Enum[size];
        for (int i12 = 0; i12 < size; i12++) {
            enumArr2[i12] = (Enum) linkedHashMap.get(Long.valueOf(jArr[i12]));
        }
        if (method == null && member == null && enumArr != null && enumArr.length == 2) {
            Enum r14 = enumArr[0];
            for (int i13 = 0; i13 < size; i13++) {
                Enum r142 = enumArr2[i13];
            }
        }
        return new ObjectReaderImplEnum(cls, method, member, enumArr2, enumArr, jArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T> Function<Map<Long, Object>, T> createFactoryFunction(Method method, String... strArr) {
        method.setAccessible(true);
        return new FactoryFunction(method, strArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v56, resolved type: java.util.function.Function */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> FieldReader<T> createFieldReader(Class cls, Type type, String str, int i9, long j3, String str2, Locale locale, Object obj, Type type2, Class cls2, Field field, ObjectReader objectReader, String str3, BiConsumer biConsumer) {
        Type fieldType;
        Class<?> mapping;
        Object objApply = obj;
        if ((objApply instanceof String) && cls2.isEnum()) {
            objApply = Enum.valueOf(cls2, (String) objApply);
        }
        if (objApply != null && objApply.getClass() != cls2) {
            Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objApply.getClass(), type2);
            if (typeConvert == 0) {
                StringBuilder sb2 = new StringBuilder("illegal defaultValue : ");
                sb2.append(objApply);
                C0086a.m460s(sb2, ", class ", cls2.getName());
                return null;
            }
            objApply = typeConvert.apply(objApply);
        }
        Object obj2 = objApply;
        if (field != null && !cls.getName().startsWith("java.lang", 0)) {
            field.setAccessible(true);
        }
        if (objectReader != null) {
            FieldReaderObjectField fieldReaderObjectField = new FieldReaderObjectField(str, type2, cls2, i9, j3 | FieldInfo.READ_USING_MASK, str2, obj2, field);
            fieldReaderObjectField.initReader = objectReader;
            return fieldReaderObjectField;
        }
        if (cls2 == Integer.TYPE) {
            return new FieldReaderInt32ValueField(str, cls2, i9, str2, (Integer) obj2, field);
        }
        if (cls2 == Integer.class) {
            return new FieldReaderInt32Field(str, cls2, i9, j3, str2, (Integer) obj2, field);
        }
        if (cls2 == Long.TYPE) {
            return new FieldReaderInt64ValueField(str, cls2, i9, j3, str2, (Long) obj2, field);
        }
        if (cls2 == Long.class) {
            return new FieldReaderInt64Field(str, cls2, i9, j3, str2, (Long) obj2, field);
        }
        if (cls2 == Short.TYPE) {
            return new FieldReaderInt16ValueField(str, cls2, i9, j3, str2, (Short) obj2, field);
        }
        if (cls2 == Short.class) {
            return new FieldReaderInt16Field(str, cls2, i9, j3, str2, (Short) obj2, field);
        }
        if (cls2 == Boolean.TYPE) {
            return new FieldReaderBoolValueField(str, i9, j3, str2, (Boolean) obj2, field);
        }
        if (cls2 == Boolean.class) {
            return new FieldReaderBoolField(str, cls2, i9, j3, str2, (Boolean) obj2, field);
        }
        if (cls2 == Byte.TYPE) {
            return new FieldReaderInt8ValueField(str, cls2, i9, j3, str2, (Byte) obj2, field);
        }
        if (cls2 == Byte.class) {
            return new FieldReaderInt8Field(str, cls2, i9, j3, str2, (Byte) obj2, field);
        }
        if (cls2 == Float.TYPE) {
            return new FieldReaderFloatValueField(str, cls2, i9, j3, str2, (Float) obj2, field);
        }
        if (cls2 == Float.class) {
            return new FieldReaderFloatField(str, cls2, i9, j3, str2, (Float) obj2, field);
        }
        if (cls2 == Double.TYPE) {
            return new FieldReaderDoubleValueField(str, cls2, i9, j3, str2, (Double) obj2, field);
        }
        if (cls2 == Double.class) {
            return new FieldReaderDoubleField(str, cls2, i9, j3, str2, (Double) obj2, field);
        }
        if (cls2 == Character.TYPE) {
            return new FieldReaderCharValueField(str, i9, j3, str2, (Character) obj2, field);
        }
        if (cls2 == BigDecimal.class) {
            return new FieldReaderBigDecimalField(str, cls2, i9, j3, str2, (BigDecimal) obj2, field);
        }
        if (cls2 == BigInteger.class) {
            return new FieldReaderBigIntegerField(str, cls2, i9, j3, str2, (BigInteger) obj2, field);
        }
        if (cls2 == String.class) {
            return new FieldReaderStringField(str, cls2, i9, j3, str2, (String) obj2, field);
        }
        if (cls2 == Date.class) {
            return new FieldReaderDate(str, type2, cls2, i9, j3, str2, locale, obj2, field, null, null);
        }
        if (cls2 == AtomicBoolean.class) {
            return new FieldReaderAtomicBooleanFieldReadOnly(str, cls2, i9, str2, (AtomicBoolean) obj2, field);
        }
        if (cls2 == AtomicReference.class) {
            return new FieldReaderAtomicReferenceField(str, type2, cls2, i9, str2, field);
        }
        Type type3 = null;
        if (type2 instanceof Class) {
            fieldType = null;
            mapping = null;
        } else {
            fieldType = BeanUtils.getFieldType(TypeReference.get(type), cls, field, type2);
            mapping = TypeUtils.getMapping(fieldType);
        }
        boolean zIsFinal = Modifier.isFinal(field.getModifiers());
        if (Collection.class.isAssignableFrom(cls2)) {
            if (fieldType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) fieldType).getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    Type type4 = actualTypeArguments[0];
                    Type type5 = fieldType;
                    Class<?> mapping2 = TypeUtils.getMapping(type4);
                    return mapping2 == String.class ? zIsFinal ? (j3 & JSONReader.Feature.FieldBased.mask) != 0 ? new FieldReaderListFieldUF(str, type5, mapping, String.class, String.class, i9, j3, str2, locale, null, field) : new FieldReaderCollectionFieldReadOnly(str, type5, mapping, i9, j3, str2, field) : new FieldReaderListFieldUF(str, type5, mapping, String.class, String.class, i9, j3, str2, locale, null, field) : new FieldReaderListFieldUF(str, type5, mapping, type4, mapping2, i9, j3, str2, locale, (Collection) obj2, field);
                }
            }
            if (type2 instanceof ParameterizedType) {
                Type[] actualTypeArguments2 = ((ParameterizedType) type2).getActualTypeArguments();
                if (actualTypeArguments2.length > 0) {
                    type3 = actualTypeArguments2[0];
                }
            }
            if (type3 == null) {
                type3 = Object.class;
            }
            return new FieldReaderListFieldUF(str, type2, cls2, type3, TypeUtils.getClass(type3), i9, j3, str2, locale, (Collection) obj2, field);
        }
        Class<?> cls3 = mapping;
        if (Map.class.isAssignableFrom(cls2) && (fieldType instanceof ParameterizedType) && ((ParameterizedType) fieldType).getActualTypeArguments().length == 2 && zIsFinal && (j3 & JSONReader.Feature.FieldBased.mask) == 0) {
            return new FieldReaderMapFieldReadOnly(str, fieldType, cls3, i9, j3, str2, field, str3, biConsumer);
        }
        if (zIsFinal) {
            if (cls2 == int[].class) {
                return new FieldReaderInt32ValueArrayFinalField(str, cls2, i9, j3, str2, (int[]) obj2, field);
            }
            if (cls2 == long[].class) {
                return new FieldReaderInt64ValueArrayFinalField(str, cls2, i9, j3, str2, (long[]) obj2, field);
            }
        }
        if (cls3 == null) {
            return cls2 == LocalDateTime.class ? new FieldReaderLocalDateTime(str, type2, cls2, i9, j3, str2, locale, obj2, field, null, null) : cls2 == ZonedDateTime.class ? new FieldReaderZonedDateTime(str, type2, cls2, i9, j3, str2, locale, obj2, field, null, null) : cls2 == Instant.class ? new FieldReaderInstant(str, type2, cls2, i9, j3, str2, locale, obj2, field, null, null) : new FieldReaderObjectField(str, type2, cls2, i9, j3, str2, obj2, field);
        }
        long j4 = j3 & FieldInfo.UNWRAPPED_MASK;
        if (j4 != 0 && Map.class.isAssignableFrom(cls3)) {
            return new FieldReaderMapFieldReadOnly(str, fieldType, cls2, i9, j3, str2, field, str3, biConsumer);
        }
        Type type6 = fieldType;
        return Map.class.isAssignableFrom(cls3) ? j4 != 0 ? new FieldReaderMapFieldReadOnly(str, type6, cls2, i9, j3, str2, field, str3, biConsumer) : new FieldReaderMapField(str, type6, cls2, i9, j3, str2, locale, obj2, field, str3, biConsumer) : new FieldReaderObjectField(str, type6, cls2, i9, j3, str2, obj2, field);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v38, resolved type: java.util.function.Function */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> FieldReader createFieldReaderMethod(Class<T> cls, Type type, String str, int i9, long j3, String str2, Locale locale, Object obj, Type type2, Class cls2, Method method, ObjectReader objectReader, String str3, BiConsumer biConsumer) {
        boolean z9;
        Type type3;
        Type fieldType;
        Class<?> mapping;
        Object objApply = obj;
        if (method != null) {
            method.setAccessible(true);
        }
        if ((objApply instanceof String) && cls2.isEnum()) {
            objApply = Enum.valueOf(cls2, (String) objApply);
        }
        if (objApply != null && objApply.getClass() != cls2) {
            Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objApply.getClass(), type2);
            if (typeConvert == 0) {
                StringBuilder sb2 = new StringBuilder("illegal defaultValue : ");
                sb2.append(objApply);
                C0086a.m460s(sb2, ", class ", cls2.getName());
                return null;
            }
            objApply = typeConvert.apply(objApply);
        }
        Object obj2 = objApply;
        if (objectReader != null) {
            FieldReaderObject fieldReaderObject = new FieldReaderObject(str, type2, cls2, i9, j3 | FieldInfo.READ_USING_MASK, str2, locale, obj2, method, null, null);
            fieldReaderObject.initReader = objectReader;
            return fieldReaderObject;
        }
        if (type2 == Boolean.TYPE) {
            return new FieldReaderBoolValueMethod(str, i9, j3, str2, (Boolean) obj2, method);
        }
        if (type2 == Boolean.class) {
            return new FieldReaderBoolMethod(str, type2, cls2, i9, j3, str2, locale, (Boolean) obj2, method);
        }
        if (type2 == Byte.TYPE) {
            return new FieldReaderInt8ValueMethod(str, type2, cls2, i9, j3, str2, locale, (Byte) obj2, method);
        }
        if (type2 == Short.TYPE) {
            return new FieldReaderInt16ValueMethod(str, type2, cls2, i9, j3, str2, locale, (Short) obj2, method);
        }
        if (type2 == Integer.TYPE) {
            return new FieldReaderInt32ValueMethod(str, type2, cls2, i9, j3, str2, (Integer) obj2, method);
        }
        if (type2 == Long.TYPE) {
            return new FieldReaderInt64ValueMethod(str, type2, cls2, i9, j3, str2, locale, (Long) obj2, method);
        }
        if (type2 == Float.TYPE) {
            return new FieldReaderFloatValueMethod(str, type2, cls2, i9, j3, str2, locale, (Float) obj2, method);
        }
        if (type2 == Double.TYPE) {
            return new FieldReaderDoubleValueMethod(str, type2, cls2, i9, j3, str2, locale, (Double) obj2, method);
        }
        if (type2 == Byte.class) {
            return new FieldReaderInt8Method(str, type2, cls2, i9, j3, str2, locale, (Byte) obj2, method);
        }
        if (type2 == Short.class) {
            return new FieldReaderInt16Method(str, type2, cls2, i9, j3, str2, locale, (Short) obj2, method);
        }
        if (type2 == Integer.class) {
            return new FieldReaderInt32Method(str, i9, j3, str2, locale, (Integer) obj2, method);
        }
        if (type2 == Long.class) {
            return new FieldReaderInt64Method(str, i9, j3, str2, locale, (Long) obj2, method);
        }
        if (type2 == Float.class) {
            return new FieldReaderFloatMethod(str, i9, j3, str2, locale, (Float) obj2, method);
        }
        if (type2 == Double.class) {
            return new FieldReaderDoubleMethod(str, i9, j3, str2, (Double) obj2, method);
        }
        if (cls2 == BigDecimal.class) {
            return new FieldReaderBigDecimalMethod(str, type2, cls2, i9, j3, str2, locale, (BigDecimal) obj2, method);
        }
        if (cls2 == BigInteger.class) {
            return new FieldReaderBigIntegerMethod(str, type2, cls2, i9, j3, str2, locale, (BigInteger) obj2, method);
        }
        if (type2 == String.class) {
            return new FieldReaderStringMethod(str, type2, cls2, i9, j3, str2, locale, (String) obj2, method);
        }
        if (type2 == LocalDate.class) {
            return new FieldReaderLocalDate(str, type2, cls2, i9, j3, str2, locale, obj2, method, null, null);
        }
        if (type2 == OffsetDateTime.class) {
            return new FieldReaderOffsetDateTime(str, type2, cls2, i9, j3, str2, locale, obj2, method, null, null);
        }
        if (type2 == UUID.class) {
            return new FieldReaderUUID(str, type2, cls2, i9, j3, str2, locale, obj2, method, null, null);
        }
        if (type2 == String[].class) {
            return new FieldReaderStringArray(str, type2, cls2, i9, j3, str2, locale, obj2, method, null, null);
        }
        Method method2 = method;
        if (method2.getParameterTypes().length != 0) {
            z9 = true;
            type3 = type2;
        } else {
            if (cls2 == AtomicInteger.class) {
                return new FieldReaderAtomicIntegerMethodReadOnly(str, cls2, i9, method2);
            }
            if (cls2 == AtomicLong.class) {
                return new FieldReaderAtomicLongReadOnly(str, cls2, i9, method2);
            }
            if (cls2 == AtomicIntegerArray.class) {
                return new FieldReaderAtomicIntegerArrayReadOnly(str, cls2, i9, method2);
            }
            if (cls2 == AtomicLongArray.class) {
                return new FieldReaderAtomicLongArrayReadOnly(str, cls2, i9, method2);
            }
            if (cls2 == AtomicBoolean.class) {
                return new FieldReaderAtomicBooleanMethodReadOnly(str, cls2, i9, method2);
            }
            if (cls2 == AtomicReference.class) {
                return new FieldReaderAtomicReferenceMethodReadOnly(str, type2, cls2, i9, method2);
            }
            if (Collection.class.isAssignableFrom(cls2)) {
                String name = method.getName();
                return new FieldReaderCollectionMethodReadOnly(str, type2, cls2, i9, j3, str2, method, name.startsWith("get", 0) ? BeanUtils.getDeclaredField(method.getDeclaringClass(), BeanUtils.getterName(name, PropertyNamingStrategy.CamelCase.name())) : null);
            }
            if (Map.class.isAssignableFrom(cls2)) {
                String name2 = method.getName();
                return new FieldReaderMapMethodReadOnly(str, type2, cls2, i9, j3, str2, method, name2.startsWith("get", 0) ? BeanUtils.getDeclaredField(method.getDeclaringClass(), BeanUtils.getterName(name2, PropertyNamingStrategy.CamelCase.name())) : null, str3, biConsumer);
            }
            method2 = method;
            z9 = true;
            type3 = type2;
            if (!cls.isInterface()) {
                return null;
            }
        }
        if (type3 instanceof Class) {
            fieldType = null;
            mapping = null;
        } else {
            fieldType = BeanUtils.getFieldType(TypeReference.get(type), cls, method2, type3);
            mapping = TypeUtils.getMapping(fieldType);
        }
        if (cls2 == List.class || cls2 == ArrayList.class) {
            if (fieldType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) fieldType).getActualTypeArguments();
                if (actualTypeArguments.length == z9) {
                    Type type4 = actualTypeArguments[0];
                    Class<?> cls3 = mapping;
                    Class<?> mapping2 = TypeUtils.getMapping(type4);
                    return mapping2 == String.class ? new FieldReaderList(str, fieldType, cls2, String.class, String.class, i9, j3, str2, locale, null, method, null, null) : new FieldReaderList(str, fieldType, cls3, type4, mapping2, i9, j3, str2, locale, null, method, null, null);
                }
            }
            return new FieldReaderList(str, type2, cls2, Object.class, Object.class, i9, j3, str2, locale, null, method, null, null);
        }
        if (cls2 == Date.class) {
            return new FieldReaderDate(str, type3, cls2, i9, j3, str2, locale, obj2, null, method, null);
        }
        if (cls2 == StackTraceElement[].class && method.getDeclaringClass() == Throwable.class) {
            return new FieldReaderStackTrace(str, fieldType != null ? fieldType : type2, cls2, i9, j3, str2, locale, obj2, method, null, new C0625d());
        }
        if ((j3 & FieldInfo.UNWRAPPED_MASK) != 0) {
            String name3 = method.getName();
            if (name3.startsWith("set", 0)) {
                declaredField = BeanUtils.getDeclaredField(method.getDeclaringClass(), BeanUtils.setterName(name3, PropertyNamingStrategy.CamelCase.name()));
                try {
                    declaredField.setAccessible(z9);
                } catch (Throwable unused) {
                }
            }
        }
        Field field = declaredField;
        if (Map.class.isAssignableFrom(cls2)) {
            return new FieldReaderMapMethod(str, fieldType != null ? fieldType : type2, cls2, i9, j3, str2, locale, obj2, method, field, null, str3, biConsumer);
        }
        return new FieldReaderObject(str, fieldType != null ? fieldType : type2, cls2, i9, j3, str2, locale, obj2, method, field, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> FieldReader createFieldReaderParam(Class<T> cls, Type type, String str, int i9, long j3, String str2, Locale locale, Object obj, Type type2, Class cls2, String str3, Class cls3, ObjectReader objectReader) {
        Type mapping;
        if (objectReader != null) {
            FieldReaderObjectParam fieldReaderObjectParam = new FieldReaderObjectParam(str, type2, cls2, str3, i9, j3, str2, locale, obj);
            fieldReaderObjectParam.initReader = objectReader;
            return fieldReaderObjectParam;
        }
        if (type2 == Byte.TYPE || type2 == Byte.class) {
            return new FieldReaderInt8Param(str, cls2, str3, i9, j3, str2, locale, obj);
        }
        if (type2 == Short.TYPE || type2 == Short.class) {
            return new FieldReaderInt16Param(str, cls2, str3, i9, j3, str2, locale, obj);
        }
        if (type2 == Integer.TYPE || type2 == Integer.class) {
            return new FieldReaderInt32Param(str, cls2, str3, i9, j3, str2, locale, obj);
        }
        if (type2 == Long.TYPE || type2 == Long.class) {
            return new FieldReaderInt64Param(str, cls2, str3, i9, j3, str2, locale, obj);
        }
        if ((type2 instanceof Class) || type == null) {
            mapping = null;
        } else {
            Type paramType = BeanUtils.getParamType(TypeReference.get(type), cls, cls3, type2);
            type = paramType;
            mapping = paramType != null ? TypeUtils.getMapping(paramType) : null;
        }
        return new FieldReaderObjectParam(str, type == null ? type2 : type, mapping == null ? cls2 : mapping, str3, i9, j3, str2, locale, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FieldReader[] createFieldReaders(ObjectReaderProvider objectReaderProvider, Class cls, Type type, AccessibleObject accessibleObject, Class[] clsArr, String... strArr) {
        Class<?> cls2;
        Annotation[][] annotationArr;
        Type[] typeArr;
        Class<?> declaringClass;
        Type[] genericParameterTypes;
        Annotation[][] parameterAnnotations;
        int i9;
        ObjectReaderProvider objectReaderProvider2;
        Field declaredField;
        boolean z9 = accessibleObject instanceof Constructor;
        if (z9) {
            Constructor constructor = (Constructor) accessibleObject;
            declaringClass = constructor.getDeclaringClass();
            genericParameterTypes = constructor.getGenericParameterTypes();
            parameterAnnotations = constructor.getParameterAnnotations();
        } else {
            if (!(accessibleObject instanceof Method)) {
                cls2 = null;
                annotationArr = null;
                typeArr = null;
                FieldReader[] fieldReaderArr = new FieldReader[clsArr.length];
                i9 = 0;
                while (i9 < clsArr.length) {
                    FieldInfo fieldInfo = new FieldInfo();
                    String strM2249l = i9 < strArr.length ? strArr[i9] : AbstractC0921a.m2249l(i9, "arg");
                    if (z9) {
                        objectReaderProvider2 = objectReaderProvider;
                        objectReaderProvider2.getFieldInfo(fieldInfo, cls2, (Constructor) accessibleObject, i9, annotationArr);
                    } else {
                        objectReaderProvider2 = objectReaderProvider;
                    }
                    if (z9 && (declaredField = BeanUtils.getDeclaredField(cls2, strM2249l)) != null) {
                        objectReaderProvider2.getFieldInfo(fieldInfo, cls2, declaredField);
                    }
                    String str = fieldInfo.fieldName;
                    String strM2249l2 = (str == null || str.isEmpty()) ? strM2249l : fieldInfo.fieldName;
                    if (strM2249l2 == null) {
                        strM2249l2 = AbstractC0921a.m2249l(i9, "arg");
                    }
                    String str2 = strM2249l2;
                    if (strM2249l == null) {
                        strM2249l = AbstractC0921a.m2249l(i9, "arg");
                    }
                    String str3 = strM2249l;
                    Type type2 = typeArr[i9];
                    Type typeResolve = BeanUtils.resolve(type, cls, type2);
                    if (typeResolve != null) {
                        type2 = typeResolve;
                    }
                    ObjectReader initReader = getInitReader(objectReaderProvider2, type2, clsArr[i9], fieldInfo);
                    Class<?> cls3 = cls2;
                    long j3 = fieldInfo.features;
                    String str4 = fieldInfo.format;
                    Locale locale = fieldInfo.locale;
                    String str5 = fieldInfo.defaultValue;
                    FieldReader[] fieldReaderArr2 = fieldReaderArr;
                    fieldReaderArr2[i9] = createFieldReaderParam(null, null, str2, i9, j3, str4, locale, str5, type2, clsArr[i9], str3, cls3, initReader);
                    i9++;
                    fieldReaderArr = fieldReaderArr2;
                    cls2 = cls3;
                }
                return fieldReaderArr;
            }
            Method method = (Method) accessibleObject;
            declaringClass = method.getDeclaringClass();
            genericParameterTypes = method.getGenericParameterTypes();
            parameterAnnotations = method.getParameterAnnotations();
        }
        annotationArr = parameterAnnotations;
        typeArr = genericParameterTypes;
        cls2 = declaringClass;
        FieldReader[] fieldReaderArr3 = new FieldReader[clsArr.length];
        i9 = 0;
        while (i9 < clsArr.length) {
        }
        return fieldReaderArr3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T> Function<Map<Long, Object>, T> createFunction(Constructor constructor, Constructor constructor2, String... strArr) {
        if (constructor2 == null) {
            constructor.setAccessible(true);
        } else {
            constructor2.setAccessible(true);
        }
        return new ConstructorFunction(null, constructor, null, null, constructor2, strArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v19, resolved type: java.util.function.Function */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> ObjectReader<T> createObjectReader(Class<T> cls, Type type, boolean z9, ObjectReaderProvider objectReaderProvider) {
        boolean z10;
        int i9;
        Constructor constructor;
        JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler;
        JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandlerNewInstance;
        String[] strArrLookupParameterNames;
        ArrayList arrayList;
        int i10;
        Method method;
        BeanInfo beanInfo = new BeanInfo();
        if (z9) {
            beanInfo.readerFeatures |= JSONReader.Feature.FieldBased.mask;
        }
        objectReaderProvider.getBeanInfo(beanInfo, (Class<?>) cls);
        long j3 = beanInfo.readerFeatures;
        JSONReader.Feature feature = JSONReader.Feature.FieldBased;
        boolean z11 = (j3 & feature.mask) != 0 ? true : z9;
        Class cls2 = beanInfo.deserializer;
        if (cls2 != null && ObjectReader.class.isAssignableFrom(cls2)) {
            try {
                Constructor<T> declaredConstructor = beanInfo.deserializer.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return (ObjectReader) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
                C0086a.m465x("create deserializer error", e6);
                return null;
            }
        }
        if (z11) {
            beanInfo.readerFeatures |= feature.mask;
        }
        if (Enum.class.isAssignableFrom(cls) && ((method = beanInfo.createMethod) == null || method.getParameterTypes().length == 1)) {
            return createEnumReader(cls, beanInfo.createMethod, objectReaderProvider);
        }
        if (Throwable.class.isAssignableFrom(cls)) {
            beanInfo.readerFeatures |= JSONReader.Feature.IgnoreSetNullValue.mask;
            z11 = false;
        }
        if (cls == Class.class) {
            return ObjectReaderImplClass.INSTANCE;
        }
        if (z11 && cls.isInterface()) {
            z11 = false;
        }
        FieldReader[] fieldReaderArrCreateFieldReaders = createFieldReaders(cls, type, beanInfo, z11, objectReaderProvider);
        boolean z12 = z11;
        ObjectReaderProvider objectReaderProvider2 = objectReaderProvider;
        int i11 = 0;
        while (true) {
            if (i11 >= fieldReaderArrCreateFieldReaders.length) {
                z10 = true;
                break;
            }
            if (!fieldReaderArrCreateFieldReaders[i11].isReadOnly()) {
                z10 = false;
                break;
            }
            i11++;
        }
        if (beanInfo.creatorConstructor != null || beanInfo.createMethod != null) {
            return createObjectReaderWithCreator(cls, type, objectReaderProvider2, beanInfo);
        }
        if (beanInfo.builder != null) {
            return createObjectReaderWithBuilder(cls, type, objectReaderProvider2, beanInfo);
        }
        ArrayList arrayList2 = new ArrayList();
        BeanUtils.constructor(cls, new C0294m0(2, arrayList2));
        if (Throwable.class.isAssignableFrom(cls)) {
            return new ObjectReaderException(cls, arrayList2, fieldReaderArrCreateFieldReaders);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        int i12 = -1;
        Constructor constructor2 = null;
        Constructor constructor3 = null;
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList2.size()) {
                i9 = 0;
                constructor = constructor2;
                i13 = i12;
                break;
            }
            Constructor constructor4 = (Constructor) arrayList2.get(i13);
            int length = constructor4.getParameterTypes().length;
            if (length == 0) {
                constructor3 = constructor4;
            }
            if (declaringClass != null && length == 1) {
                i9 = 0;
                if (declaringClass.equals(constructor4.getParameterTypes()[0])) {
                    constructor = constructor4;
                    break;
                }
            }
            if (constructor2 == null || length == 0 || constructor2.getParameterTypes().length < length) {
                i12 = i13;
                constructor2 = constructor4;
            }
            i13++;
        }
        int length2 = constructor != null ? constructor.getParameterTypes().length : -1;
        if (i13 != -1) {
            arrayList2.remove(i13);
        }
        if (constructor != null && length2 != 0 && beanInfo.seeAlso == null) {
            constructor.setAccessible(true);
            String[] strArr = beanInfo.createParameterNames;
            if (strArr == null || strArr.length == 0) {
                strArrLookupParameterNames = BeanUtils.lookupParameterNames(constructor);
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                FieldInfo fieldInfo = new FieldInfo();
                arrayList = arrayList2;
                int i14 = i9;
                while (i14 < parameterTypes.length && i14 < strArrLookupParameterNames.length) {
                    fieldInfo.init();
                    objectReaderProvider2.getFieldInfo(fieldInfo, cls, constructor, i14, parameterAnnotations);
                    String str = fieldInfo.fieldName;
                    if (str != null) {
                        strArrLookupParameterNames[i14] = str;
                    }
                    i14++;
                    objectReaderProvider2 = objectReaderProvider;
                }
            } else {
                arrayList = arrayList2;
                strArrLookupParameterNames = strArr;
            }
            if (constructor3 != null) {
                int i15 = i9;
                i10 = i15;
                while (i15 < strArrLookupParameterNames.length) {
                    String str2 = strArrLookupParameterNames[i15];
                    if (str2 != null) {
                        int i16 = i9;
                        while (true) {
                            if (i16 >= fieldReaderArrCreateFieldReaders.length) {
                                break;
                            }
                            FieldReader fieldReader = fieldReaderArrCreateFieldReaders[i16];
                            if (fieldReader != null && str2.equals(fieldReader.fieldName)) {
                                i10++;
                                break;
                            }
                            i16++;
                        }
                    }
                    i15++;
                }
            } else {
                i10 = i9;
            }
            if (!z12 && !Throwable.class.isAssignableFrom(cls) && constructor3 == null && i10 != strArrLookupParameterNames.length) {
                if (length2 == 1) {
                    FieldInfo fieldInfo2 = new FieldInfo();
                    objectReaderProvider.getFieldInfo(fieldInfo2, cls, constructor, 0, null);
                    if ((fieldInfo2.features & FieldInfo.VALUE_MASK) != 0) {
                        Type type2 = constructor.getGenericParameterTypes()[i9];
                        Class<?> cls3 = constructor.getParameterTypes()[i9];
                        Object objApply = fieldInfo2.defaultValue;
                        if (objApply != null && objApply.getClass() != cls3) {
                            Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objApply.getClass(), type2);
                            if (typeConvert == 0) {
                                StringBuilder sb2 = new StringBuilder("illegal defaultValue : ");
                                sb2.append(objApply);
                                C0086a.m460s(sb2, ", class ", cls3.getName());
                                return null;
                            }
                            objApply = typeConvert.apply(objApply);
                        }
                        return new ObjectReaderImplValue(cls, type2, cls3, fieldInfo2.features, fieldInfo2.format, objApply, constructor, null, null);
                    }
                }
                if (z10 && fieldReaderArrCreateFieldReaders.length != 0 && arrayList.isEmpty()) {
                    for (int i17 = i9; i17 < strArrLookupParameterNames.length; i17++) {
                        String str3 = strArrLookupParameterNames[i17];
                        int length3 = fieldReaderArrCreateFieldReaders.length;
                        int i18 = i9;
                        while (true) {
                            if (i18 >= length3) {
                                break;
                            }
                            FieldReader fieldReader2 = fieldReaderArrCreateFieldReaders[i18];
                            Field field = fieldReader2.field;
                            if (field != null && field.getName().equals(str3) && !fieldReader2.fieldName.equals(str3)) {
                                strArrLookupParameterNames[i17] = fieldReader2.fieldName;
                                break;
                            }
                            i18++;
                        }
                    }
                }
                String[] strArr2 = strArrLookupParameterNames;
                return new ObjectReaderNoneDefaultConstructor(cls, beanInfo.typeKey, beanInfo.typeName, beanInfo.readerFeatures, new ConstructorFunction(arrayList, constructor, null, null, null, strArr2), strArr2, createFieldReaders(objectReaderProvider, cls, type, constructor, constructor.getParameterTypes(), strArr2), fieldReaderArrCreateFieldReaders, null, null);
            }
        }
        Class[] clsArr = beanInfo.seeAlso;
        if (clsArr != null && clsArr.length != 0) {
            return createObjectReaderSeeAlso(cls, beanInfo.typeKey, clsArr, beanInfo.seeAlsoNames, beanInfo.seeAlsoDefault, fieldReaderArrCreateFieldReaders);
        }
        if (cls.isInterface()) {
            return new ObjectReaderInterface(cls, null, null, 0L, null, null, fieldReaderArrCreateFieldReaders);
        }
        ObjectReader<T> objectReaderCreateObjectReader = createObjectReader(cls, beanInfo.typeKey, beanInfo.rootName, beanInfo.readerFeatures, createSupplier(cls), null, fieldReaderArrCreateFieldReaders);
        if (objectReaderCreateObjectReader instanceof ObjectReaderBean) {
            Class<? extends JSONReader.AutoTypeBeforeHandler> cls4 = beanInfo.autoTypeBeforeHandler;
            if (cls4 != null) {
                autoTypeBeforeHandler = null;
                try {
                    Constructor<? extends JSONReader.AutoTypeBeforeHandler> declaredConstructor2 = cls4.getDeclaredConstructor(null);
                    declaredConstructor2.setAccessible(true);
                    autoTypeBeforeHandlerNewInstance = declaredConstructor2.newInstance(null);
                } catch (Exception unused) {
                    autoTypeBeforeHandlerNewInstance = autoTypeBeforeHandler;
                }
                if (autoTypeBeforeHandlerNewInstance != null) {
                    ((ObjectReaderBean) objectReaderCreateObjectReader).setAutoTypeBeforeHandler(autoTypeBeforeHandlerNewInstance);
                }
            } else {
                autoTypeBeforeHandler = null;
            }
            autoTypeBeforeHandlerNewInstance = autoTypeBeforeHandler;
            if (autoTypeBeforeHandlerNewInstance != null) {
            }
        }
        return objectReaderCreateObjectReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T> ObjectReader<T> createObjectReaderFactoryMethod(Method method, String... strArr) {
        return new ObjectReaderNoneDefaultConstructor(null, null, null, 0L, createFactoryFunction(method, strArr), strArr, createFieldReaders(JSONFactory.defaultObjectReaderProvider, null, null, method, method.getParameterTypes(), strArr), null, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T> ObjectReader<T> createObjectReaderNoneDefaultConstructor(Constructor constructor, String... strArr) {
        Function<Map<Long, Object>, T> functionCreateFunction = createFunction(constructor, strArr);
        Class<T> declaringClass = constructor.getDeclaringClass();
        return createObjectReaderNoneDefaultConstructor(declaringClass, functionCreateFunction, createFieldReaders(JSONFactory.defaultObjectReaderProvider, declaringClass, declaringClass, constructor, constructor.getParameterTypes(), strArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T> ObjectReader<T> createObjectReaderSeeAlso(Class<T> cls, Class[] clsArr, FieldReader... fieldReaderArr) {
        return new ObjectReaderSeeAlso(cls, createSupplier(cls), "@type", clsArr, null, null, fieldReaderArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        BeanUtils.setters(cls2, false, new Consumer() { // from class: com.alibaba.fastjson2.reader.c
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f1952a.lambda$createObjectReaderWithBuilder$0(fieldInfo, objectReaderProvider, cls, str2, cls2, beanInfo, length, linkedHashMap, type, (Method) obj);
            }
        });
        FieldReader[] fieldReaderArr = new FieldReader[linkedHashMap.size()];
        linkedHashMap.values().toArray(fieldReaderArr);
        Arrays.sort(fieldReaderArr);
        return createObjectReader(cls2, 0L, createSupplier(cls2), functionCreateBuildFunction, fieldReaderArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: java.util.function.Function */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> ObjectReader<T> createObjectReaderWithCreator(Class<T> cls, Type type, final ObjectReaderProvider objectReaderProvider, BeanInfo beanInfo) {
        Class[] parameterTypes;
        Class declaringClass;
        String[] strArrLookupParameterNames;
        Type[] genericParameterTypes;
        Annotation[][] parameterAnnotations;
        String[] strArr;
        FieldInfo fieldInfo;
        String[] strArr2;
        Function<Map<Long, Object>, T> functionCreateFactoryFunction;
        FieldInfo fieldInfo2;
        int i9;
        Annotation[][] annotationArr;
        Class<T> cls2;
        String[] strArr3;
        int i10;
        Class cls3;
        BeanInfo beanInfo2 = beanInfo;
        FieldInfo fieldInfo3 = new FieldInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Constructor constructor = beanInfo2.creatorConstructor;
        if (constructor != null) {
            parameterTypes = constructor.getParameterTypes();
            declaringClass = beanInfo2.creatorConstructor.getDeclaringClass();
            strArrLookupParameterNames = BeanUtils.lookupParameterNames(beanInfo2.creatorConstructor);
            genericParameterTypes = beanInfo2.creatorConstructor.getGenericParameterTypes();
            parameterAnnotations = beanInfo2.creatorConstructor.getParameterAnnotations();
        } else {
            parameterTypes = beanInfo2.createMethod.getParameterTypes();
            declaringClass = beanInfo2.createMethod.getDeclaringClass();
            strArrLookupParameterNames = new String[parameterTypes.length];
            genericParameterTypes = beanInfo2.createMethod.getGenericParameterTypes();
            parameterAnnotations = beanInfo2.createMethod.getParameterAnnotations();
        }
        Class[] clsArr = parameterTypes;
        Class cls4 = declaringClass;
        String[] strArr4 = strArrLookupParameterNames;
        Type[] typeArr = genericParameterTypes;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= clsArr.length) {
                strArr = strArr4;
                fieldInfo = fieldInfo3;
                break;
            }
            fieldInfo3.init();
            Constructor constructor2 = beanInfo2.creatorConstructor;
            if (constructor2 != null) {
                objectReaderProvider.getFieldInfo(fieldInfo3, cls, constructor2, i12, parameterAnnotations);
                fieldInfo2 = fieldInfo3;
                cls2 = cls;
                i9 = i12;
                annotationArr = parameterAnnotations;
            } else {
                fieldInfo2 = fieldInfo3;
                i9 = i12;
                annotationArr = parameterAnnotations;
                cls2 = cls;
                objectReaderProvider.getFieldInfo(fieldInfo2, cls2, beanInfo2.createMethod, i9);
            }
            if (clsArr.length == 1 && (fieldInfo2.features & FieldInfo.VALUE_MASK) != 0) {
                strArr = strArr4;
                fieldInfo = fieldInfo2;
                break;
            }
            String strM2249l = fieldInfo2.fieldName;
            if (strM2249l == null || strM2249l.isEmpty()) {
                String[] strArr5 = beanInfo2.createParameterNames;
                if (strArr5 != null && i9 < strArr5.length) {
                    strM2249l = strArr5[i9];
                }
                if (strM2249l == null || strM2249l.isEmpty()) {
                    strM2249l = AbstractC0921a.m2249l(i9, "arg");
                }
            }
            if (!strM2249l.startsWith("arg", i11)) {
                strArr4[i9] = strM2249l;
            } else if (strArr4.length > i9) {
                strM2249l = strArr4[i9];
            }
            final String strM2249l2 = strM2249l;
            final Class cls5 = clsArr[i9];
            final Class<T> cls6 = cls2;
            final BeanInfo beanInfo3 = beanInfo2;
            final FieldInfo fieldInfo4 = fieldInfo2;
            BeanUtils.getters(cls6, new Consumer() { // from class: com.alibaba.fastjson2.reader.b
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ObjectReaderCreator.lambda$createObjectReaderWithCreator$1(cls5, objectReaderProvider, cls6, beanInfo3, strM2249l2, fieldInfo4, (Method) obj);
                }
            });
            if (strM2249l2 == null || strM2249l2.isEmpty()) {
                strM2249l2 = AbstractC0921a.m2249l(i9, "arg");
            }
            String str = strM2249l2;
            Type type2 = typeArr[i9];
            int i13 = i9;
            int i14 = i11;
            String[] strArr6 = strArr4;
            linkedHashMap.put(str, createFieldReaderParam(cls6, type, str, i13, fieldInfo4.features, fieldInfo4.format, type2, cls5, str, cls4, getInitReader(objectReaderProvider, type2, cls5, fieldInfo4)));
            String[] strArr7 = fieldInfo4.alternateNames;
            if (strArr7 != null) {
                int i15 = i14;
                while (i15 < strArr7.length) {
                    String str2 = strArr7[i15];
                    if (!str.equals(str2) && ((FieldReader) linkedHashMap.get(str2)) == null) {
                        strArr3 = strArr7;
                        i10 = i15;
                        String str3 = str;
                        FieldReader fieldReaderCreateFieldReaderParam = createFieldReaderParam(cls, type, str2, i13, fieldInfo4.features, fieldInfo4.format, type2, cls5, str3, cls4, null);
                        cls3 = cls4;
                        str = str3;
                        linkedHashMap.put(str2, fieldReaderCreateFieldReaderParam);
                    } else {
                        strArr3 = strArr7;
                        i10 = i15;
                        cls3 = cls4;
                    }
                    i15 = i10 + 1;
                    cls4 = cls3;
                    strArr7 = strArr3;
                }
            }
            i12 = i13 + 1;
            beanInfo2 = beanInfo;
            cls4 = cls4;
            fieldInfo3 = fieldInfo4;
            parameterAnnotations = annotationArr;
            i11 = i14;
            strArr4 = strArr6;
        }
        int i16 = i11;
        if (clsArr.length == 1 && (fieldInfo.features & FieldInfo.VALUE_MASK) != 0) {
            Type type3 = beanInfo.creatorConstructor == null ? beanInfo.createMethod.getGenericParameterTypes()[i16] : typeArr[i16];
            Constructor constructor3 = beanInfo.creatorConstructor;
            Class<?> cls7 = constructor3 == null ? beanInfo.createMethod.getParameterTypes()[i16] : constructor3.getParameterTypes()[i16];
            Object objApply = fieldInfo.defaultValue;
            if (objApply != null && objApply.getClass() != cls7) {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objApply.getClass(), type3);
                if (typeConvert == 0) {
                    StringBuilder sb2 = new StringBuilder("illegal defaultValue : ");
                    sb2.append(objApply);
                    C0086a.m460s(sb2, ", class ", cls7.getName());
                    return null;
                }
                objApply = typeConvert.apply(objApply);
            }
            return new ObjectReaderImplValue(cls, type3, cls7, fieldInfo.features, fieldInfo.format, objApply, beanInfo.creatorConstructor, beanInfo.createMethod, null);
        }
        Constructor constructor4 = beanInfo.creatorConstructor;
        if (constructor4 != null) {
            strArr2 = strArr;
            functionCreateFactoryFunction = createFunction(constructor4, beanInfo.markerConstructor, strArr2);
        } else {
            strArr2 = strArr;
            functionCreateFactoryFunction = createFactoryFunction(beanInfo.createMethod, strArr2);
        }
        Function<Map<Long, Object>, T> function = functionCreateFactoryFunction;
        FieldReader[] fieldReaderArr = new FieldReader[linkedHashMap.size()];
        linkedHashMap.values().toArray(fieldReaderArr);
        Arrays.sort(fieldReaderArr);
        FieldReader[] fieldReaderArrCreateFieldReaders = createFieldReaders(cls, type, null, false, objectReaderProvider);
        Arrays.sort(fieldReaderArrCreateFieldReaders);
        boolean[] zArr = null;
        int i17 = i16;
        int i18 = i17;
        while (i17 < fieldReaderArrCreateFieldReaders.length) {
            if (linkedHashMap.containsKey(fieldReaderArrCreateFieldReaders[i17].fieldName)) {
                if (zArr == null) {
                    zArr = new boolean[fieldReaderArrCreateFieldReaders.length];
                }
                zArr[i17] = true;
                i18++;
            }
            i17++;
        }
        if (i18 > 0) {
            FieldReader[] fieldReaderArr2 = new FieldReader[fieldReaderArrCreateFieldReaders.length - i18];
            for (int i19 = i16; i19 < fieldReaderArrCreateFieldReaders.length; i19++) {
                if (!zArr[i19]) {
                    fieldReaderArr2[i16] = fieldReaderArrCreateFieldReaders[i19];
                    i16++;
                }
            }
            fieldReaderArrCreateFieldReaders = fieldReaderArr2;
        }
        return new ObjectReaderNoneDefaultConstructor(cls, beanInfo.typeKey, beanInfo.typeName, beanInfo.readerFeatures, function, strArr2, fieldReaderArr, fieldReaderArrCreateFieldReaders, beanInfo.seeAlso, beanInfo.seeAlsoNames);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T> Supplier<T> createSupplier(Class<T> cls) {
        if (!cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return new ConstructorSupplier(declaredConstructor);
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th2) {
                C0086a.m465x("get constructor error, class ".concat(cls.getName()), th2);
                return null;
            }
        }
        return null;
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
        return new ObjectReaderNoneDefaultConstructor(cls, null, null, 0L, function, null, fieldReaderArr, null, null, null);
    }

    public <T> FieldReader[] createFieldReaders(Class<T> cls) {
        return createFieldReaders(cls, cls, null, false, JSONFactory.defaultObjectReaderProvider);
    }

    public <T> FieldReader[] createFieldReaders(Class<T> cls, Type type) {
        return createFieldReaders(cls, type, null, false, JSONFactory.defaultObjectReaderProvider);
    }

    public <T> FieldReader[] createFieldReaders(Class<T> cls, Type type, BeanInfo beanInfo, boolean z9, ObjectReaderProvider objectReaderProvider) {
        BeanInfo beanInfo2;
        if (beanInfo == null) {
            BeanInfo beanInfo3 = new BeanInfo();
            objectReaderProvider.getBeanInfo(beanInfo3, (Class<?>) cls);
            beanInfo2 = beanInfo3;
        } else {
            beanInfo2 = beanInfo;
        }
        String str = beanInfo2.namingStrategy;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FieldInfo fieldInfo = new FieldInfo();
        String[] strArr = beanInfo2.orders;
        BeanInfo beanInfo4 = beanInfo2;
        FieldConsumer fieldConsumer = new FieldConsumer(cls, type, str, fieldInfo, linkedHashMap, objectReaderProvider, beanInfo4, z9);
        if (z9) {
            BeanUtils.declaredFields(cls, fieldConsumer);
        } else {
            BeanUtils.declaredFields(cls, fieldConsumer);
            Class cls2 = objectReaderProvider.mixInCache.get(cls);
            CreateFieldReaderConsumer createFieldReaderConsumer = new CreateFieldReaderConsumer(cls, type, str, strArr, beanInfo4, fieldInfo, linkedHashMap, objectReaderProvider);
            BeanUtils.setters(cls, beanInfo4, cls2, createFieldReaderConsumer);
            if (cls.isInterface()) {
                BeanUtils.getters(cls, createFieldReaderConsumer);
            }
        }
        FieldReader[] fieldReaderArr = new FieldReader[linkedHashMap.size()];
        linkedHashMap.values().toArray(fieldReaderArr);
        Arrays.sort(fieldReaderArr);
        return fieldReaderArr;
    }

    public <T> FieldReader createFieldReaderParam(Class<T> cls, Type type, String str, int i9, long j3, String str2, Type type2, Class cls2, String str3, Class cls3, ObjectReader objectReader) {
        return createFieldReaderParam(cls, type, str, i9, j3, str2, null, null, type2, cls2, str3, cls3, objectReader);
    }

    public <T> FieldReader createFieldReaderParam(Class<T> cls, Type type, String str, int i9, long j3, String str2, Type type2, Class cls2, String str3, Class cls3) {
        return createFieldReaderParam(cls, type, str, i9, j3, str2, null, null, type2, cls2, str3, cls3, null);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, Supplier<T> supplier, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, null, 0L, supplier, null, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, long j3, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, null, null, j3, supplier, function, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, String str, long j3, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, str, null, j3, supplier, function, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, String str, String str2, long j3, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        if (cls != null) {
            int modifiers = cls.getModifiers();
            if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
                return new ObjectReaderAdapter(cls, str, null, j3, supplier, function, fieldReaderArr);
            }
        }
        if (str2 != null) {
            return new ObjectReaderRootName(cls, str, null, str2, j3, supplier, function, null, null, null, fieldReaderArr);
        }
        switch (fieldReaderArr.length) {
            case 1:
                return new ObjectReader1(cls, null, null, j3, supplier, function, fieldReaderArr);
            case 2:
                return new ObjectReader2(cls, null, null, j3, supplier, function, fieldReaderArr);
            case 3:
                return new ObjectReader3(cls, null, null, j3, supplier, function, fieldReaderArr);
            case 4:
                return new ObjectReader4(cls, null, null, j3, supplier, function, fieldReaderArr);
            case 5:
                return new ObjectReader5(cls, null, null, j3, supplier, function, fieldReaderArr);
            case 6:
                return new ObjectReader6(cls, null, null, j3, supplier, function, fieldReaderArr);
            default:
                return new ObjectReaderAdapter(cls, str, null, j3, supplier, function, fieldReaderArr);
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
        return createObjectReader(cls, cls, false, JSONFactory.defaultObjectReaderProvider);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, boolean z9) {
        return createObjectReader(cls, cls, z9, JSONFactory.defaultObjectReaderProvider);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, null, 0L, createSupplier(cls), null, fieldReaderArr);
    }

    public <T> FieldReader createFieldReader(Class<T> cls, String str, String str2, Type type, Class cls2, Method method) {
        return createFieldReaderMethod(cls, str, str2, type, cls2, method);
    }

    public <T> FieldReader<T> createFieldReader(String str, Type type, Field field) {
        return createFieldReader(str, null, type, field);
    }

    public <T> FieldReader<T> createFieldReader(String str, String str2, Type type, Field field) {
        Class<?> declaringClass = field.getDeclaringClass();
        return createFieldReader(declaringClass, declaringClass, str, 0L, str2, type, field.getType(), field);
    }

    public <T> FieldReader<T> createFieldReader(Class cls, Type type, String str, long j3, String str2, Type type2, Class cls2, Field field) {
        return createFieldReader(cls, type, str, 0, j3, str2, null, null, type2, field.getType(), field, null);
    }

    public <T> FieldReader<T> createFieldReader(Class cls, Type type, String str, int i9, long j3, String str2, Locale locale, Object obj, Type type2, Class cls2, Field field, ObjectReader objectReader) {
        return createFieldReader(cls, type, str, i9, j3, str2, locale, obj, type2, field.getType(), field, objectReader, null, null);
    }

    public <T> FieldReader createFieldReader(Class<T> cls, String str, Type type, Class cls2, Method method) {
        return createFieldReaderMethod(cls, cls, str, 0, 0L, null, null, null, type, cls2, method, null);
    }

    public <T, V> FieldReader createFieldReader(String str, Type type, Class<V> cls, Method method, BiConsumer<T, V> biConsumer) {
        return createFieldReader(null, null, str, type, cls, 0, 0L, null, null, null, method, biConsumer, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T, V> FieldReader createFieldReader(Class cls, Type type, String str, Type type2, Class<V> cls2, int i9, long j3, String str2, Locale locale, Object obj, Method method, BiConsumer<T, V> biConsumer, ObjectReader objectReader) {
        Method method2;
        Class<?> mapping;
        Class<?> cls3;
        Type type3;
        Class cls4;
        if (objectReader != null) {
            FieldReaderObject fieldReaderObject = new FieldReaderObject(str, type2, cls2, i9, j3 | FieldInfo.READ_USING_MASK, str2, locale, obj, method, null, biConsumer);
            fieldReaderObject.initReader = objectReader;
            return fieldReaderObject;
        }
        if (cls2 == Integer.class) {
            return new FieldReaderInt32Func(str, cls2, i9, j3, str2, locale, obj, method, biConsumer);
        }
        if (cls2 == Long.class) {
            return new FieldReaderInt64Func(str, cls2, i9, j3, str2, locale, obj, method, biConsumer);
        }
        if (cls2 == String.class) {
            return new FieldReaderStringFunc(str, cls2, i9, j3, str2, locale, obj, method, biConsumer);
        }
        if (cls2 == Boolean.class) {
            return new FieldReaderBoolFunc(str, cls2, i9, j3, str2, locale, obj, method, biConsumer);
        }
        if (cls2 == Short.class) {
            return new FieldReaderInt16Func(str, cls2, i9, j3, str2, locale, obj, method, biConsumer);
        }
        if (cls2 == Byte.class) {
            return new FieldReaderInt8Func(str, cls2, i9, j3, str2, locale, obj, method, biConsumer);
        }
        if (cls2 == BigDecimal.class) {
            return new FieldReaderBigDecimalFunc(str, cls2, i9, j3, str2, locale, obj, method, biConsumer);
        }
        if (cls2 == BigInteger.class) {
            return new FieldReaderBigIntegerFunc(str, cls2, i9, j3, str2, locale, obj, method, biConsumer);
        }
        if (cls2 == Float.class) {
            return new FieldReaderFloatFunc(str, cls2, i9, j3, str2, locale, (Float) obj, method, biConsumer);
        }
        if (cls2 == Double.class) {
            return new FieldReaderDoubleFunc(str, cls2, i9, j3, str2, locale, (Double) obj, method, biConsumer);
        }
        if (cls2 == Number.class) {
            return new FieldReaderNumberFunc(str, cls2, i9, j3, str2, locale, (Number) obj, method, biConsumer);
        }
        if (cls2 == Date.class) {
            return new FieldReaderDate(str, type2, cls2, i9, j3, str2, locale, obj, null, method, biConsumer);
        }
        Type fieldType = null;
        if (type2 instanceof Class) {
            method2 = method;
            mapping = null;
        } else {
            method2 = method;
            fieldType = BeanUtils.getFieldType(type != null ? TypeReference.get(type) : null, cls, method2, type2);
            mapping = TypeUtils.getMapping(fieldType);
        }
        if (cls2 != List.class && cls2 != ArrayList.class) {
            if (fieldType != null) {
                return new FieldReaderObjectFunc(str, fieldType, cls2, i9, j3, str2, locale, obj, method2, biConsumer, null);
            }
            return new FieldReaderObjectFunc(str, type2, cls2, i9, j3, str2, locale, obj, method, biConsumer, null);
        }
        Type type4 = fieldType;
        if (type4 instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type4).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                Type type5 = actualTypeArguments[0];
                Class<?> mapping2 = TypeUtils.getMapping(type5);
                if (mapping2 == String.class) {
                    return new FieldReaderList(str, type4, mapping, String.class, String.class, i9, j3, str2, locale, obj, method, null, biConsumer);
                }
                cls3 = mapping;
                cls4 = mapping2;
                type3 = type5;
            } else {
                cls3 = mapping;
                type3 = Object.class;
                cls4 = type3;
            }
        }
        return new FieldReaderList(str, type4, cls3, type3, cls4, i9, j3, str2, locale, obj, method, null, biConsumer);
    }

    public <T> FieldReader createFieldReaderMethod(Class<T> cls, Type type, String str, int i9, long j3, String str2, Locale locale, Object obj, Type type2, Class cls2, Method method, ObjectReader objectReader) {
        return createFieldReaderMethod(cls, type, str, i9, j3, str2, locale, obj, type2, cls2, method, objectReader, null, null);
    }

    public <T> FieldReader createFieldReaderMethod(Class<T> cls, String str, String str2, Type type, Class cls2, Method method) {
        return createFieldReaderMethod(cls, cls, str, 0, 0L, str2, null, null, type, cls2, method, null);
    }

    public <T> FieldReader<T> createFieldReader(String str, Field field) {
        return createFieldReader(str, null, field.getGenericType(), field);
    }

    public <T> FieldReader createFieldReader(String str, Method method) {
        Class<?> returnType;
        Type genericReturnType;
        Class<?> declaringClass = method.getDeclaringClass();
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 0) {
            returnType = method.getReturnType();
            genericReturnType = method.getGenericReturnType();
        } else if (parameterTypes.length == 1) {
            returnType = parameterTypes[0];
            genericReturnType = method.getGenericParameterTypes()[0];
        } else {
            C0086a.m463v(method, "illegal setter method ");
            return null;
        }
        return createFieldReaderMethod(declaringClass, declaringClass, str, 0, 0L, null, null, null, genericReturnType, returnType, method, null);
    }
}
