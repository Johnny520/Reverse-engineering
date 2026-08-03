package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p012ah.C0086a;
import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderException<T> extends ObjectReaderAdapter<T> {
    final Constructor constructorCause;
    final Constructor constructorDefault;
    final Constructor constructorMessage;
    final Constructor constructorMessageCause;
    final List<String[]> constructorParameters;
    final List<Constructor> constructors;
    private final FieldReader fieldReaderStackTrace;
    static final long HASH_TYPE = Fnv.hashCode64("@type");
    static final long HASH_MESSAGE = Fnv.hashCode64("message");
    static final long HASH_DETAIL_MESSAGE = Fnv.hashCode64("detailMessage");
    static final long HASH_LOCALIZED_MESSAGE = Fnv.hashCode64("localizedMessage");
    static final long HASH_CAUSE = Fnv.hashCode64("cause");
    static final long HASH_STACKTRACE = Fnv.hashCode64("stackTrace");
    static final long HASH_SUPPRESSED_EXCEPTIONS = Fnv.hashCode64("suppressedExceptions");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderException(Class<T> cls, List<Constructor> list, FieldReader... fieldReaderArr) {
        int i9;
        String[] strArrLookupParameterNames;
        super(cls, null, cls.getName(), 0L, null, null, fieldReaderArr);
        this.constructors = list;
        Iterator<Constructor> it = list.iterator();
        Constructor constructor = null;
        Constructor constructor2 = null;
        Constructor constructor3 = null;
        Constructor constructor4 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Constructor next = it.next();
            if (next != null && constructor3 == null) {
                int parameterCount = next.getParameterCount();
                if (parameterCount == 0) {
                    constructor = next;
                } else {
                    Class<?>[] parameterTypes = next.getParameterTypes();
                    Class<?> cls2 = parameterTypes[0];
                    if (parameterCount == 1) {
                        if (cls2 == String.class) {
                            constructor2 = next;
                        } else if (Throwable.class.isAssignableFrom(cls2)) {
                            constructor4 = next;
                        }
                    }
                    if (parameterCount == 2 && cls2 == String.class && Throwable.class.isAssignableFrom(parameterTypes[1])) {
                        constructor3 = next;
                    }
                }
            }
        }
        this.constructorDefault = constructor;
        this.constructorMessage = constructor2;
        this.constructorMessageCause = constructor3;
        this.constructorCause = constructor4;
        Collections.sort(list, new C0626e());
        this.constructorParameters = new ArrayList(list.size());
        for (Constructor constructor5 : list) {
            Class<?>[] parameterTypes2 = constructor5.getParameterTypes();
            if (parameterTypes2.length > 0) {
                strArrLookupParameterNames = BeanUtils.lookupParameterNames(constructor5);
                FieldInfo fieldInfo = new FieldInfo();
                Annotation[][] parameterAnnotations = constructor5.getParameterAnnotations();
                for (int i10 = 0; i10 < parameterTypes2.length && i10 < strArrLookupParameterNames.length; i10++) {
                    fieldInfo.init();
                    JSONFactory.defaultObjectReaderProvider.getFieldInfo(fieldInfo, cls, constructor5, i10, parameterAnnotations);
                    String str = fieldInfo.fieldName;
                    if (str != null) {
                        strArrLookupParameterNames[i10] = str;
                    }
                }
            } else {
                strArrLookupParameterNames = null;
            }
            this.constructorParameters.add(strArrLookupParameterNames);
        }
        FieldReader fieldReader = null;
        for (FieldReader fieldReader2 : fieldReaderArr) {
            if ("stackTrace".equals(fieldReader2.fieldName) && fieldReader2.fieldClass == StackTraceElement[].class) {
                fieldReader = fieldReader2;
            }
        }
        this.fieldReaderStackTrace = fieldReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Throwable createObject(String str, Throwable th2) {
        try {
            Constructor constructor = this.constructorMessageCause;
            if (constructor != null && th2 != null && str != null) {
                return (Throwable) constructor.newInstance(str, th2);
            }
            Constructor constructor2 = this.constructorMessage;
            if (constructor2 != null && str != null) {
                return (Throwable) constructor2.newInstance(str);
            }
            Constructor constructor3 = this.constructorCause;
            if (constructor3 != null && th2 != null) {
                return (Throwable) constructor3.newInstance(th2);
            }
            if (constructor != null && (th2 != null || str != null)) {
                return (Throwable) constructor.newInstance(str, th2);
            }
            Constructor constructor4 = this.constructorDefault;
            if (constructor4 != null) {
                return (Throwable) constructor4.newInstance(null);
            }
            if (constructor != null) {
                return (Throwable) constructor.newInstance(str, th2);
            }
            if (constructor2 != null) {
                return (Throwable) constructor2.newInstance(str);
            }
            if (constructor3 != null) {
                return (Throwable) constructor3.newInstance(th2);
            }
            return null;
        } catch (Throwable th3) {
            throw new JSONException("create Exception error, class " + this.objectClass.getName() + ", " + th3.getMessage(), th3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Constructor constructor, Constructor constructor2) {
        int parameterCount = constructor.getParameterCount();
        int parameterCount2 = constructor2.getParameterCount();
        if (parameterCount < parameterCount2) {
            return 1;
        }
        return parameterCount > parameterCount2 ? -1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        ObjectReader objectReader;
        if (jSONReader.getType() == -110) {
            JSONReader.Context context = jSONReader.context;
            if (jSONReader.isSupportAutoType(j3) || context.getContextAutoTypeBeforeHandler() != null) {
                jSONReader.next();
                ObjectReader objectReaderAutoType = context.getObjectReaderAutoType(jSONReader.readTypeHashCode());
                if (objectReaderAutoType == null) {
                    String string = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType2 == null) {
                        StringBuilder sbM1026o = AbstractC0255e.m1026o("autoType not support : ", string, ", offset ");
                        sbM1026o.append(jSONReader.getOffset());
                        throw new JSONException(sbM1026o.toString());
                    }
                    objectReader = objectReaderAutoType2;
                } else {
                    objectReader = objectReaderAutoType;
                }
                return (T) objectReader.readJSONBObject(jSONReader, type, obj, 0L);
            }
        }
        return readObject(jSONReader, type, obj, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        T t9;
        T t10 = null;
        if (!jSONReader.nextIfObjectStart() && jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        String string = null;
        Throwable th2 = null;
        HashMap map = null;
        HashMap map2 = null;
        StackTraceElement[] stackTraceElementArr = null;
        String reference = null;
        int i9 = 0;
        while (!jSONReader.nextIfObjectEnd()) {
            T t11 = t10;
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (i9 == 0 && fieldNameHashCode == HASH_TYPE && jSONReader.isSupportAutoType(j3)) {
                long typeHashCode = jSONReader.readTypeHashCode();
                JSONReader.Context context = jSONReader.context;
                ObjectReader objectReaderAutoType = autoType(context, typeHashCode);
                if (objectReaderAutoType == null) {
                    String string2 = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string2, this.objectClass, j3);
                    if (objectReaderAutoType2 == null) {
                        C0086a.m464w(jSONReader.info("No suitable ObjectReader found for" + string2));
                        return t11;
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    return (T) objectReaderAutoType.readObject(jSONReader);
                }
            } else if (fieldNameHashCode == HASH_MESSAGE || fieldNameHashCode == HASH_DETAIL_MESSAGE) {
                string = jSONReader.readString();
            } else if (fieldNameHashCode == HASH_LOCALIZED_MESSAGE) {
                jSONReader.readString();
            } else if (fieldNameHashCode == HASH_CAUSE) {
                if (jSONReader.isReference()) {
                    jSONReader.readReference();
                } else {
                    th2 = (Throwable) jSONReader.read((Class) Throwable.class);
                }
            } else if (fieldNameHashCode == HASH_STACKTRACE) {
                if (jSONReader.isReference()) {
                    reference = jSONReader.readReference();
                } else {
                    stackTraceElementArr = (StackTraceElement[]) jSONReader.read((Class) StackTraceElement[].class);
                }
            } else if (fieldNameHashCode != HASH_SUPPRESSED_EXCEPTIONS) {
                FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                if (map == null) {
                    map = new HashMap();
                }
                String fieldName = fieldReader != null ? fieldReader.fieldName : jSONReader.getFieldName();
                if (jSONReader.isReference()) {
                    String reference2 = jSONReader.readReference();
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    map2.put(fieldName, reference2);
                } else {
                    map.put(fieldName, fieldReader != null ? fieldReader.readFieldValue(jSONReader) : jSONReader.readAny());
                }
            } else if (jSONReader.isReference()) {
                jSONReader.readReference();
            } else if (jSONReader.getType() == -110) {
            } else {
                jSONReader.readArray(Throwable.class);
            }
            i9++;
            t10 = t11;
        }
        Object obj2 = (T) createObject(string, th2);
        if (obj2 == null) {
            int i10 = 0;
            while (i10 < this.constructors.size()) {
                String[] strArr = this.constructorParameters.get(i10);
                if (strArr == null || strArr.length == 0) {
                    t9 = t10;
                } else {
                    boolean z9 = true;
                    int i11 = 0;
                    while (true) {
                        t9 = t10;
                        if (i11 >= strArr.length) {
                            break;
                        }
                        String str = strArr[i11];
                        if (str == null) {
                            z9 = false;
                            break;
                        }
                        if (!str.equals("cause") && !str.equals("message") && !map.containsKey(str)) {
                            z9 = false;
                        }
                        i11++;
                        t10 = t9;
                    }
                    if (z9) {
                        Object[] objArr = new Object[strArr.length];
                        for (int i12 = 0; i12 < strArr.length; i12++) {
                            String str2 = strArr[i12];
                            str2.getClass();
                            objArr[i12] = !str2.equals("cause") ? !str2.equals("message") ? map.get(str2) : string : th2;
                        }
                        Constructor constructor = this.constructors.get(i10);
                        try {
                            obj2 = (T) ((Throwable) constructor.newInstance(objArr));
                        } catch (Throwable th3) {
                            StringBuilder sb2 = new StringBuilder("create error, objectClass ");
                            sb2.append(constructor);
                            String message = th3.getMessage();
                            sb2.append(", ");
                            sb2.append(message);
                            throw new JSONException(sb2.toString(), th3);
                        }
                    }
                }
                i10++;
                t10 = t9;
            }
            t9 = t10;
        } else {
            t9 = t10;
        }
        if (obj2 == null) {
            C0086a.m464w(jSONReader.info(jSONReader.info("not support : ".concat(this.objectClass.getName()))));
            return t9;
        }
        if (stackTraceElementArr != null) {
            int i13 = 0;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement == null) {
                    i13++;
                }
            }
            if (stackTraceElementArr.length == 0 || i13 != stackTraceElementArr.length) {
                ((Throwable) obj2).setStackTrace(stackTraceElementArr);
            }
        }
        if (reference != null) {
            jSONReader.addResolveTask(this.fieldReaderStackTrace, obj2, JSONPath.m1657of(reference));
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                FieldReader fieldReader2 = getFieldReader((String) entry.getKey());
                if (fieldReader2 != null) {
                    fieldReader2.accept(obj2, entry.getValue());
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                FieldReader fieldReader3 = getFieldReader((String) entry2.getKey());
                if (fieldReader3 != null) {
                    fieldReader3.addResolveTask(jSONReader, obj2, (String) entry2.getValue());
                }
            }
        }
        return (T) obj2;
    }

    public ObjectReaderException(Class<T> cls) {
        this(cls, Arrays.asList(BeanUtils.getConstructor(cls)), ObjectReaders.fieldReader("stackTrace", StackTraceElement[].class, new C0625d()));
    }
}
