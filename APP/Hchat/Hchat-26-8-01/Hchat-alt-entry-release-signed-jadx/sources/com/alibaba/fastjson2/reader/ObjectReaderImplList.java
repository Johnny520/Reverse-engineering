package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p025bc.C0260j;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplList implements ObjectReader {
    static final Class CLASS_ARRAYS_LIST;
    static final Class CLASS_EMPTY_LIST;
    static final Class CLASS_EMPTY_SET;
    static final Class CLASS_SINGLETON;
    static final Class CLASS_SINGLETON_LIST;
    static final Class CLASS_UNMODIFIABLE_COLLECTION;
    static final Class CLASS_UNMODIFIABLE_LIST;
    static final Class CLASS_UNMODIFIABLE_SET;
    public static ObjectReaderImplList INSTANCE;
    public static ObjectReaderImplList JSON_ARRAY_READER;
    final Function builder;
    volatile boolean instanceError;
    final Class instanceType;
    final long instanceTypeHash;
    final Class itemClass;
    final String itemClassName;
    final long itemClassNameHash;
    ObjectReader itemObjectReader;
    final Type itemType;
    final Class listClass;
    Object listSingleton;
    final Type listType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Set set = Collections.EMPTY_SET;
        CLASS_EMPTY_SET = set.getClass();
        List list = Collections.EMPTY_LIST;
        CLASS_EMPTY_LIST = list.getClass();
        CLASS_SINGLETON = Collections.singleton(0).getClass();
        CLASS_SINGLETON_LIST = Collections.singletonList(0).getClass();
        CLASS_ARRAYS_LIST = Arrays.asList(0).getClass();
        CLASS_UNMODIFIABLE_COLLECTION = Collections.unmodifiableCollection(list).getClass();
        CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(list).getClass();
        CLASS_UNMODIFIABLE_SET = Collections.unmodifiableSet(set).getClass();
        INSTANCE = new ObjectReaderImplList(ArrayList.class, ArrayList.class, ArrayList.class, 65L, Object.class, Object.class, null, "Object", 127970252055119L);
        JSON_ARRAY_READER = new ObjectReaderImplList(JSONArray.class, JSONArray.class, JSONArray.class, 8893561198416334968L, Object.class, Object.class, null, "Object", 127970252055119L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplList(Type type, Class cls, Class cls2, Type type2, Function function) {
        this.listType = type;
        this.listClass = cls;
        this.instanceType = cls2;
        this.instanceTypeHash = Fnv.hashCode64(TypeUtils.getTypeName(cls2));
        this.itemType = type2;
        Class<?> cls3 = TypeUtils.getClass(type2);
        this.itemClass = cls3;
        this.builder = function;
        String typeName = cls3 != null ? TypeUtils.getTypeName((Class) cls3) : null;
        this.itemClassName = typeName;
        this.itemClassNameHash = typeName != null ? Fnv.hashCode64(typeName) : 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$0(Type type, Object obj) {
        Collection collection = (Collection) obj;
        return (collection.isEmpty() && (type instanceof Class)) ? EnumSet.noneOf((Class) type) : EnumSet.copyOf(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$1(Object obj) {
        return Collections.singleton(((List) obj).get(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$2(Object obj) {
        return Collections.singletonList(((List) obj).get(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$3(Object obj) {
        return Arrays.asList(((List) obj).toArray());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$4(Object obj) {
        return Collections.unmodifiableCollection((Collection) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$5(Object obj) {
        return Collections.unmodifiableList((List) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$6(Object obj) {
        return Collections.unmodifiableSet((Set) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$readJSONBObject$11(Object obj) {
        Collection collection = (Collection) obj;
        if (collection.isEmpty()) {
            Type type = this.itemType;
            if (type instanceof Class) {
                return EnumSet.noneOf((Class) type);
            }
        }
        return EnumSet.copyOf(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$readJSONBObject$7(Collection collection) {
        return Collections.singleton(collection.iterator().next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$readJSONBObject$8(List list) {
        return Collections.singletonList(list.get(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$readJSONBObject$9(Collection collection) {
        return Collections.singletonList(collection.iterator().next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0199, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:?, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:?, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:?, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:?, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:?, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:?, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:?, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:?, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:?, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0105, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v1 int, still in use, count: 2, list:
  (r14v1 int) from 0x01c5: PHI (r14v11 int) = (r14v1 int), (r14v2 int), (r14v3 int), (r14v4 int), (r14v5 int), (r14v6 int), (r14v9 int), (r14v10 int), (r14v16 int) binds: [B:132:0x01c2, B:176:?, B:175:?, B:130:0x01ba, B:174:?, B:126:0x01af, B:173:?, B:122:0x01a4, B:118:0x0199] A[DONT_GENERATE, DONT_INLINE, REMOVE]
  (r14v1 int) from 0x0175: CONSTRUCTOR (r12v48 java.util.function.Function) = (r14v1 int) A[MD:(int):void (m), REMOVE] (LINE:374) call: com.alibaba.fastjson2.reader.f.<init>(int):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:271)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.markCodeForRemoval(SwitchOverStringVisitor.java:160)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:124)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:71)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 int, still in use, count: 2, list:
  (r8v1 int) from 0x015d: PHI (r8v24 int) = 
  (r8v3 int)
  (r8v4 int)
  (r8v6 int)
  (r8v7 int)
  (r8v9 int)
  (r8v10 int)
  (r8v12 int)
  (r8v13 int)
  (r8v1 int)
  (r8v14 int)
  (r8v16 int)
  (r8v17 int)
  (r8v19 int)
  (r8v20 int)
  (r8v22 int)
  (r8v23 int)
  (r8v25 int)
 binds: [B:184:?, B:104:0x015c, B:183:?, B:100:0x0151, B:182:?, B:96:0x0146, B:181:?, B:92:0x013b, B:87:0x012f, B:180:?, B:179:?, B:85:0x0127, B:178:?, B:81:0x011c, B:177:?, B:77:0x0111, B:73:0x0105] A[DONT_GENERATE, DONT_INLINE, REMOVE]
  (r8v1 int) from 0x0092: CONSTRUCTOR (r12v57 java.util.function.Function) = (r4v1 java.lang.reflect.Type), (r8v1 int) A[MD:(java.lang.Object, int):void (m), REMOVE] (LINE:147) call: bc.j.<init>(java.lang.Object, int):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:271)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.markCodeForRemoval(SwitchOverStringVisitor.java:160)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:124)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:71)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0161 A[PHI: r6
  0x0161: PHI (r6v1 java.lang.Class) = 
  (r6v0 java.lang.Class)
  (r6v0 java.lang.Class)
  (r6v0 java.lang.Class)
  (r6v0 java.lang.Class)
  (r6v0 java.lang.Class)
  (r6v3 java.lang.Class)
  (r6v0 java.lang.Class)
  (r6v7 java.lang.Class)
 binds: [B:22:0x005d, B:24:0x0061, B:26:0x0065, B:28:0x0069, B:30:0x006d, B:115:0x0188, B:105:0x015d, B:106:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX INFO: renamed from: of */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ObjectReader m1726of(Type type, Class cls, long j3) {
        Type type2;
        Type rawType;
        Class cls2;
        Class cls3;
        Function c0627f;
        String typeName;
        if (cls == type && HttpUrl.FRAGMENT_ENCODE_SET.equals(cls.getSimpleName())) {
            type = cls.getGenericSuperclass();
            cls = cls.getSuperclass();
        }
        Type type3 = type;
        Type type4 = Object.class;
        if (!(type3 instanceof ParameterizedType)) {
            if (cls != null) {
                Type genericSuperclass = cls.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
                    rawType = parameterizedType.getRawType();
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    if (actualTypeArguments.length == 1) {
                        type4 = actualTypeArguments[0];
                    }
                }
            }
            type2 = type4;
            rawType = type3;
            if (cls == null) {
                cls = TypeUtils.getClass(rawType);
            }
            cls2 = cls;
            cls3 = ArrayList.class;
            if (cls2 != Iterable.class || cls2 == Collection.class || cls2 == List.class || cls2 == AbstractCollection.class || cls2 == AbstractList.class) {
                c0627f = null;
            } else {
                if (cls2 == Queue.class || cls2 == Deque.class || cls2 == AbstractSequentialList.class) {
                    cls3 = LinkedList.class;
                } else {
                    if (cls2 == Set.class || cls2 == AbstractSet.class) {
                        c0627f = null;
                    } else {
                        if (cls2 == EnumSet.class) {
                            c0627f = new C0260j(type2, r8);
                        } else {
                            if (cls2 != NavigableSet.class && cls2 != SortedSet.class) {
                                if (cls2 != CLASS_SINGLETON) {
                                    if (cls2 != CLASS_SINGLETON_LIST) {
                                        Class cls4 = CLASS_ARRAYS_LIST;
                                        if (cls2 != cls4) {
                                            if (cls2 != CLASS_UNMODIFIABLE_COLLECTION) {
                                                if (cls2 != CLASS_UNMODIFIABLE_LIST) {
                                                    if (cls2 != CLASS_UNMODIFIABLE_SET) {
                                                        String typeName2 = TypeUtils.getTypeName(cls2);
                                                        typeName2.getClass();
                                                        switch (typeName2) {
                                                            case "java.util.AbstractList$RandomAccessSubList":
                                                            case "java.util.SubList":
                                                            case "java.util.RandomAccessSubList":
                                                            case "java.util.AbstractList$SubList":
                                                                break;
                                                            case "java.util.Collections$SynchronizedSortedSet":
                                                                c0627f = new C0627f(8);
                                                                break;
                                                            case "java.util.Collections$SynchronizedSet":
                                                                c0627f = new C0627f(r14);
                                                                break;
                                                            case "java.util.Collections$SynchronizedCollection":
                                                                c0627f = new C0627f(16);
                                                                break;
                                                            case "java.util.Collections$SynchronizedRandomAccessList":
                                                                c0627f = new C0627f(15);
                                                                break;
                                                            default:
                                                                cls3 = cls2;
                                                                break;
                                                        }
                                                    } else {
                                                        c0627f = new C0627f(14);
                                                        cls3 = LinkedHashSet.class;
                                                    }
                                                } else {
                                                    c0627f = new C0627f(13);
                                                }
                                            } else {
                                                c0627f = new C0627f(12);
                                            }
                                        } else {
                                            cls3 = cls4;
                                            c0627f = new C0627f(11);
                                        }
                                    } else {
                                        c0627f = new C0627f(10);
                                    }
                                } else {
                                    c0627f = new C0627f(9);
                                }
                            } else {
                                c0627f = null;
                            }
                            cls3 = TreeSet.class;
                        }
                    }
                    cls3 = HashSet.class;
                }
                c0627f = null;
            }
            typeName = TypeUtils.getTypeName(type3);
            typeName.getClass();
            switch (typeName) {
                case "kotlin.collections.EmptyList":
                case "kotlin.collections.EmptySet":
                    Class cls5 = (Class) type3;
                    try {
                        Field field = cls5.getField("INSTANCE");
                        if (!field.isAccessible()) {
                            field.setAccessible(true);
                        }
                        return new ObjectReaderImplList(cls5, field.get(null));
                    } catch (IllegalAccessException e6) {
                        e = e6;
                        throw new IllegalStateException("Failed to get singleton of " + type3, e);
                    } catch (NoSuchFieldException e7) {
                        e = e7;
                        throw new IllegalStateException("Failed to get singleton of " + type3, e);
                    }
                case "java.util.Collections$EmptySet":
                    return new ObjectReaderImplList((Class) type3, Collections.EMPTY_SET);
                case "java.util.Collections$EmptyList":
                    return new ObjectReaderImplList((Class) type3, Collections.EMPTY_LIST);
                default:
                    if (type3 == CLASS_EMPTY_SET || type3 == CLASS_EMPTY_LIST) {
                        Class cls6 = (Class) type3;
                        return new ObjectReaderImplList(type3, cls6, cls6, Object.class, null);
                    }
                    if (type2 == String.class && c0627f == null) {
                        return new ObjectReaderImplListStr(cls2, cls3);
                    }
                    if (type2 == Long.class && c0627f == null) {
                        return new ObjectReaderImplListInt64(cls2, cls3);
                    }
                    return new ObjectReaderImplList(type3, cls2, cls3, type2, c0627f);
            }
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) type3;
        rawType = parameterizedType2.getRawType();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        if (actualTypeArguments2.length == 1) {
            type4 = actualTypeArguments2[0];
        }
        type2 = type4;
        if (cls == null) {
        }
        cls2 = cls;
        cls3 = ArrayList.class;
        if (cls2 != Iterable.class) {
            c0627f = null;
        }
        typeName = TypeUtils.getTypeName(type3);
        typeName.getClass();
        switch (typeName) {
            case -1815537371:
                break;
            case -413656092:
                break;
            case 61358428:
                break;
            case 357082875:
                break;
        }
        switch (r14) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        if (collection.size() == 0 && this.listClass == List.class) {
            ArrayList arrayList = new ArrayList();
            Function function = this.builder;
            return function != null ? function.apply(arrayList) : arrayList;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Collection arrayList2 = this.instanceType == ArrayList.class ? new ArrayList(collection.size()) : (Collection) createInstance(j3);
        for (Object objCreateInstance : collection) {
            if (objCreateInstance == null) {
                arrayList2.add(null);
            } else {
                Class<?> cls = objCreateInstance.getClass();
                if ((cls == JSONObject.class || cls == JSONFactory.getClassJSONObject1x()) && this.itemClass != cls) {
                    if (this.itemObjectReader == null) {
                        this.itemObjectReader = objectReaderProvider.getObjectReader(this.itemType);
                    }
                    objCreateInstance = this.itemObjectReader.createInstance((JSONObject) objCreateInstance, j3);
                } else {
                    Type type = this.itemType;
                    if (cls != type) {
                        Function typeConvert = objectReaderProvider.getTypeConvert(cls, type);
                        if (typeConvert != null) {
                            objCreateInstance = typeConvert.apply(objCreateInstance);
                        } else if (objCreateInstance instanceof Map) {
                            Map map = (Map) objCreateInstance;
                            if (this.itemObjectReader == null) {
                                this.itemObjectReader = objectReaderProvider.getObjectReader(this.itemType);
                            }
                            objCreateInstance = this.itemObjectReader.createInstance(map, j3);
                        } else if (objCreateInstance instanceof Collection) {
                            if (this.itemObjectReader == null) {
                                this.itemObjectReader = objectReaderProvider.getObjectReader(this.itemType);
                            }
                            objCreateInstance = this.itemObjectReader.createInstance((Collection) objCreateInstance, j3);
                        } else if (!this.itemClass.isInstance(objCreateInstance)) {
                            if (!Enum.class.isAssignableFrom(this.itemClass)) {
                                StringBuilder sb2 = new StringBuilder("can not convert from ");
                                sb2.append(cls);
                                C0086a.m460s(sb2, " to ", this.itemType);
                                return null;
                            }
                            if (this.itemObjectReader == null) {
                                this.itemObjectReader = objectReaderProvider.getObjectReader(this.itemType);
                            }
                            ObjectReader objectReader = this.itemObjectReader;
                            if (!(objectReader instanceof ObjectReaderImplEnum)) {
                                StringBuilder sb3 = new StringBuilder("can not convert from ");
                                sb3.append(cls);
                                C0086a.m460s(sb3, " to ", this.itemType);
                                return null;
                            }
                            objCreateInstance = ((ObjectReaderImplEnum) objectReader).getEnum((String) objCreateInstance);
                        }
                    }
                }
                arrayList2.add(objCreateInstance);
            }
        }
        Function function2 = this.builder;
        return function2 != null ? function2.apply(arrayList2) : arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Function getBuildFunction() {
        return this.builder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.listClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:134:? */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        JSONArray jSONArray;
        Collection treeSet;
        Object jSONBObject;
        Collection collection;
        ArrayList arrayList;
        JSONReader jSONReader2;
        Object jSONBObject2;
        List list;
        if (jSONReader.nextIfNull()) {
            return null;
        }
        JSONReader jSONReader3 = jSONReader;
        ObjectReader objectReaderCheckAutoType = jSONReader3.checkAutoType(this.listClass, 0L, j3);
        Function c0260j = this.builder;
        Class objectClass = this.instanceType;
        if (objectReaderCheckAutoType != null) {
            if (objectReaderCheckAutoType instanceof ObjectReaderImplList) {
                ObjectReaderImplList objectReaderImplList = (ObjectReaderImplList) objectReaderCheckAutoType;
                objectClass = objectReaderImplList.instanceType;
                c0260j = objectReaderImplList.builder;
            } else {
                objectClass = objectReaderCheckAutoType.getObjectClass();
            }
            if (objectClass == CLASS_UNMODIFIABLE_COLLECTION) {
                c0260j = new C0627f(1);
            } else if (objectClass == CLASS_UNMODIFIABLE_LIST) {
                c0260j = new C0627f(2);
            } else if (objectClass == CLASS_UNMODIFIABLE_SET) {
                c0260j = new C0627f(3);
                objectClass = LinkedHashSet.class;
            } else if (objectClass == CLASS_SINGLETON) {
                c0260j = new C0627f(4);
            } else if (objectClass == CLASS_SINGLETON_LIST) {
                c0260j = new C0627f(5);
            }
            objectClass = ArrayList.class;
        }
        int iStartArray = jSONReader3.startArray();
        if (iStartArray > 0 && this.itemObjectReader == null) {
            this.itemObjectReader = jSONReader3.context.getObjectReader(this.itemType);
        }
        int i9 = 0;
        if (objectClass == CLASS_ARRAYS_LIST) {
            Object[] objArr = new Object[iStartArray];
            List listAsList = Arrays.asList(objArr);
            while (i9 < iStartArray) {
                if (jSONReader3.isReference()) {
                    String reference = jSONReader3.readReference();
                    if ("..".equals(reference)) {
                        list = listAsList;
                    } else {
                        jSONReader3.addResolveTask(listAsList, i9, JSONPath.m1657of(reference));
                        list = null;
                    }
                    List list2 = list;
                    jSONReader2 = jSONReader3;
                    jSONBObject2 = list2;
                } else {
                    jSONReader2 = jSONReader;
                    jSONBObject2 = this.itemObjectReader.readJSONBObject(jSONReader2, this.itemType, Integer.valueOf(i9), j3);
                }
                objArr[i9] = jSONBObject2;
                i9++;
                jSONReader3 = jSONReader2;
            }
            return listAsList;
        }
        JSONReader jSONReader4 = jSONReader3;
        if (objectClass == ArrayList.class) {
            if (iStartArray > 0) {
                treeSet = arrayList;
                arrayList = new ArrayList(iStartArray);
            } else {
                treeSet = arrayList;
                arrayList = new ArrayList();
            }
        } else if (objectClass == JSONArray.class) {
            if (iStartArray > 0) {
                treeSet = jSONArray;
                jSONArray = new JSONArray(iStartArray);
            } else {
                treeSet = jSONArray;
                jSONArray = new JSONArray();
            }
        } else if (objectClass == HashSet.class) {
            treeSet = new HashSet();
        } else if (objectClass == LinkedHashSet.class) {
            treeSet = new LinkedHashSet();
        } else if (objectClass == TreeSet.class) {
            treeSet = new TreeSet();
        } else if (objectClass == CLASS_EMPTY_SET) {
            treeSet = Collections.EMPTY_SET;
        } else if (objectClass == CLASS_EMPTY_LIST) {
            treeSet = Collections.EMPTY_LIST;
        } else if (objectClass == CLASS_SINGLETON_LIST) {
            ArrayList arrayList2 = new ArrayList();
            c0260j = new C0627f(6);
            treeSet = arrayList2;
        } else if (objectClass == CLASS_UNMODIFIABLE_LIST) {
            ArrayList arrayList3 = new ArrayList();
            c0260j = new C0627f(7);
            treeSet = arrayList3;
        } else if (objectClass != null && EnumSet.class.isAssignableFrom(objectClass)) {
            HashSet hashSet = new HashSet();
            c0260j = new C0260j(this, 5);
            treeSet = hashSet;
        } else if (objectClass == null || objectClass == this.listType) {
            treeSet = (Collection) createInstance(jSONReader4.context.features | j3);
        } else {
            try {
                treeSet = (Collection) objectClass.newInstance();
            } catch (IllegalAccessException | InstantiationException e6) {
                C0086a.m465x(jSONReader4.info("create instance error " + objectClass), e6);
                return null;
            }
        }
        Collection collection2 = treeSet;
        Function function = c0260j;
        ObjectReader objectReader = this.itemObjectReader;
        Type type2 = this.itemType;
        if (type != null && type != objectClass && (type instanceof ParameterizedType)) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 1 && (type2 = actualTypeArguments[0]) != this.itemType) {
                objectReader = jSONReader4.getObjectReader(type2);
            }
        }
        while (true) {
            ObjectReader objectReader2 = objectReader;
            Type type3 = type2;
            if (i9 >= iStartArray) {
                break;
            }
            if (jSONReader4.isReference()) {
                String reference2 = jSONReader4.readReference();
                if ("..".equals(reference2)) {
                    collection = collection2;
                } else {
                    jSONReader4.addResolveTask(collection2, i9, JSONPath.m1657of(reference2));
                    if (collection2 instanceof List) {
                        collection = null;
                    } else {
                        objectReader = objectReader2;
                        type2 = type3;
                        i9++;
                        jSONReader4 = jSONReader;
                    }
                }
                Collection collection3 = collection;
                objectReader = objectReader2;
                jSONBObject = collection3;
                type2 = type3;
            } else {
                ObjectReader objectReaderCheckAutoType2 = jSONReader.checkAutoType(this.itemClass, this.itemClassNameHash, j3);
                if (objectReaderCheckAutoType2 != null) {
                    type2 = type3;
                    objectReader = objectReader2;
                    jSONBObject = objectReaderCheckAutoType2.readJSONBObject(jSONReader, type2, Integer.valueOf(i9), j3);
                } else {
                    type2 = type3;
                    objectReader = objectReader2;
                    jSONBObject = objectReader.readJSONBObject(jSONReader, type2, Integer.valueOf(i9), j3);
                }
            }
            collection2.add(jSONBObject);
            i9++;
            jSONReader4 = jSONReader;
        }
        return function != null ? function.apply(collection2) : collection2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Object object;
        JSONReader.Context context = jSONReader.context;
        if (this.itemObjectReader == null) {
            this.itemObjectReader = context.getObjectReader(this.itemType);
        }
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        Collection hashSet = jSONReader.nextIfSet() ? new HashSet() : (Collection) createInstance(context.features | j3);
        char cCurrent = jSONReader.current();
        if (cCurrent == '\"') {
            String string = jSONReader.readString();
            if (this.itemClass == String.class) {
                jSONReader.nextIfComma();
                hashSet.add(string);
                return hashSet;
            }
            if (string.isEmpty()) {
                jSONReader.nextIfComma();
                return null;
            }
            ObjectReaderProvider provider = context.getProvider();
            if (this.itemClass.isEnum()) {
                ObjectReader objectReader = provider.getObjectReader(this.itemClass);
                if (objectReader instanceof ObjectReaderImplEnum) {
                    Enum r02 = ((ObjectReaderImplEnum) objectReader).getEnum(string);
                    if (r02 != null) {
                        hashSet.add(r02);
                        return hashSet;
                    }
                    if (!JSONReader.Feature.ErrorOnEnumNotMatch.isEnabled(jSONReader.features(j3))) {
                        return null;
                    }
                    C0086a.m464w(jSONReader.info("enum not match : ".concat(string)));
                    return null;
                }
            }
            Function typeConvert = context.provider.getTypeConvert(String.class, this.itemType);
            if (typeConvert == null) {
                C0086a.m464w(jSONReader.info());
                return null;
            }
            Object objApply = typeConvert.apply(string);
            jSONReader.nextIfComma();
            hashSet.add(objApply);
            return hashSet;
        }
        int i9 = 0;
        if (cCurrent != '[') {
            Class cls = this.itemClass;
            if ((cls == Object.class || this.itemObjectReader == null) && !(cls == Object.class && jSONReader.isObject())) {
                C0086a.m464w(jSONReader.info());
                return null;
            }
            hashSet.add(this.itemObjectReader.readObject(jSONReader, this.itemType, 0, 0L));
            Function function = this.builder;
            return function != null ? (Collection) function.apply(hashSet) : hashSet;
        }
        jSONReader.next();
        ObjectReader objectReader2 = this.itemObjectReader;
        Type type2 = this.itemType;
        if (type != null && type != this.listType && (type instanceof ParameterizedType)) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 1 && (type2 = actualTypeArguments[0]) != this.itemType) {
                objectReader2 = jSONReader.getObjectReader(type2);
            }
        }
        ObjectReader objectReader3 = objectReader2;
        Type type3 = type2;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.current() == ',') {
                C0086a.m464w(jSONReader.info("illegal input error"));
                return null;
            }
            if (type3 == String.class) {
                object = jSONReader.readString();
            } else {
                if (objectReader3 == null) {
                    C0086a.m464w(jSONReader.info("TODO : " + type3));
                    return null;
                }
                if (jSONReader.isReference()) {
                    String reference = jSONReader.readReference();
                    if ("..".equals(reference)) {
                        object = this;
                    } else {
                        jSONReader.addResolveTask(hashSet, i9, JSONPath.m1657of(reference));
                        i9++;
                    }
                } else {
                    object = objectReader3.readObject(jSONReader, type3, Integer.valueOf(i9), 0L);
                }
            }
            hashSet.add(object);
            i9++;
        }
        jSONReader.nextIfComma();
        Function function2 = this.builder;
        return function2 != null ? function2.apply(hashSet) : hashSet;
    }

    public ObjectReaderImplList(Class cls, Object obj) {
        this(cls, cls, cls, Object.class, null);
        this.listSingleton = obj;
    }

    private ObjectReaderImplList(Type type, Class cls, Class cls2, long j3, Type type2, Class cls3, Function function, String str, long j4) {
        this.listType = type;
        this.listClass = cls;
        this.instanceType = cls2;
        this.instanceTypeHash = j3;
        this.itemType = type2;
        this.itemClass = cls3;
        this.builder = function;
        this.itemClassName = str;
        this.itemClassNameHash = j4;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j3) {
        JSONException jSONException;
        Class cls = this.instanceType;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        if (cls == HashSet.class) {
            return new HashSet();
        }
        if (cls == LinkedHashSet.class) {
            return new LinkedHashSet();
        }
        if (cls == TreeSet.class) {
            return new TreeSet();
        }
        Object obj = this.listSingleton;
        if (obj != null) {
            return obj;
        }
        if (cls != null) {
            if (this.instanceError) {
                jSONException = null;
            } else {
                try {
                    return this.instanceType.newInstance();
                } catch (IllegalAccessException | InstantiationException unused) {
                    this.instanceError = true;
                    jSONException = new JSONException("create list error, type " + this.instanceType);
                }
            }
            if (this.instanceError && List.class.isAssignableFrom(this.instanceType.getSuperclass())) {
                try {
                    return this.instanceType.getSuperclass().newInstance();
                } catch (IllegalAccessException | InstantiationException unused2) {
                    this.instanceError = true;
                    jSONException = new JSONException("create list error, type " + this.instanceType);
                }
            }
            if (jSONException != null) {
                throw jSONException;
            }
        }
        return new ArrayList();
    }
}
