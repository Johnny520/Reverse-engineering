package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import bsh.C3502;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3755;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3683;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
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
import p160.C8376;
import p352.C9620;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3531 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final Class f8520;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Class f8521;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static List f8522;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static Set f8523;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final Class f8524;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Class f8525;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Class f8526;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Class f8527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Class f8528;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Class f8529;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Class f8530;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Class f8531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f8532;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Type f8533;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f8534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f8536;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Function f8537;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f8538;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public volatile boolean f8539;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public volatile Constructor f8540;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object f8541;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC3621 f8542;

    static {
        Set set = Collections.EMPTY_SET;
        f8527 = set.getClass();
        List list = Collections.EMPTY_LIST;
        f8526 = list.getClass();
        f8530 = Collections.singleton(0).getClass();
        f8531 = Collections.singletonList(0).getClass();
        f8528 = Arrays.asList(0).getClass();
        f8529 = Collections.unmodifiableCollection(list).getClass();
        f8521 = Collections.unmodifiableList(list).getClass();
        f8520 = Collections.unmodifiableSet(set).getClass();
        f8524 = Collections.unmodifiableSortedSet(Collections.emptySortedSet()).getClass();
        f8525 = Collections.unmodifiableNavigableSet(Collections.emptyNavigableSet()).getClass();
        new C3531(ArrayList.class, ArrayList.class, ArrayList.class, Object.class, null);
    }

    public C3531(Type type, Class cls, Class cls2, Type type2, Function function) {
        this.f8536 = type;
        this.f8535 = cls;
        this.f8534 = cls2;
        AbstractC3693.m6334(AbstractC3700.m6503(cls2));
        this.f8533 = type2;
        Class clsM6504 = AbstractC3700.m6504(type2);
        this.f8532 = clsM6504;
        this.f8537 = function;
        String strM6503 = clsM6504 != null ? AbstractC3700.m6503(clsM6504) : null;
        this.f8538 = strM6503 != null ? AbstractC3693.m6334(strM6503) : 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01eb, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:?, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:?, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:?, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:?, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 2, list:
  (r0v0 int) from 0x0217: PHI (r0v11 int) = (r0v0 int), (r0v1 int), (r0v3 int), (r0v4 int), (r0v6 int), (r0v7 int), (r0v9 int), (r0v10 int), (r0v13 int) binds: [B:140:0x0214, B:166:?, B:165:?, B:138:0x020c, B:164:?, B:134:0x0201, B:163:?, B:130:0x01f6, B:126:0x01eb] A[DONT_GENERATE, DONT_INLINE, REMOVE]
  (r0v0 int) from 0x01cf: CONSTRUCTOR (r5v6 java.util.function.Function) = (r0v0 int) A[MD:(int):void (m), REMOVE] (LINE:464) call: com.alibaba.fastjson2.util.飘花落叶言子楪兰世苏哲.<init>(int):void type: CONSTRUCTOR
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
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC3621 m6060(Class cls, Type type) {
        Type type2;
        Type rawType;
        Type type3;
        Class cls2;
        Function c3602;
        String typeName;
        if (cls == type && cls.getSimpleName().isEmpty()) {
            type = cls.getGenericSuperclass();
            cls = cls.getSuperclass();
        }
        Type type4 = type;
        int i = 1;
        Type type5 = Object.class;
        if (!(type4 instanceof ParameterizedType)) {
            if (cls != null) {
                Type genericSuperclass = cls.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
                    rawType = parameterizedType.getRawType();
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    if (actualTypeArguments.length == 1) {
                        type5 = actualTypeArguments[0];
                    }
                }
            }
            type2 = type4;
            type3 = type5;
            if (cls == null) {
                cls = AbstractC3700.m6504(type2);
            }
            cls2 = ArrayList.class;
            c3602 = null;
            if (cls != Iterable.class && cls != Collection.class && cls != List.class && cls != AbstractCollection.class && cls != AbstractList.class) {
                if (cls != Queue.class || cls == Deque.class || cls == AbstractSequentialList.class) {
                    cls2 = LinkedList.class;
                } else if (cls == Set.class || cls == AbstractSet.class) {
                    cls2 = HashSet.class;
                } else {
                    if (cls == EnumSet.class) {
                        c3602 = new C3502(type3, 4);
                    } else if (cls == NavigableSet.class || cls == SortedSet.class) {
                        cls2 = TreeSet.class;
                    } else if (cls == f8530) {
                        c3602 = new C3602(25);
                    } else if (cls == f8531) {
                        c3602 = new C3602(26);
                    } else {
                        Class cls3 = f8528;
                        if (cls == cls3) {
                            c3602 = new C3602(27);
                            cls2 = cls3;
                        } else if (cls == f8529) {
                            c3602 = new C3602(28);
                        } else if (cls == f8521) {
                            c3602 = new C3602(29);
                        } else if (cls == f8520) {
                            c3602 = new C3602(9);
                            cls2 = LinkedHashSet.class;
                        } else {
                            if (cls == f8524) {
                                c3602 = new C3602(10);
                            } else if (cls == f8525) {
                                c3602 = new C3602(11);
                            } else {
                                String typeName2 = cls.getTypeName();
                                typeName2.getClass();
                                if (!typeName2.equals("java.util.AbstractList$RandomAccessSubList")) {
                                    if (typeName2.equals("java.util.Collections$SynchronizedSortedSet")) {
                                        c3602 = new C3602(23);
                                    } else if (typeName2.equals("com.google.common.collect.ImmutableList")) {
                                        c3602 = new C3683(r0);
                                    } else if (typeName2.equals("java.util.Collections$SynchronizedSet")) {
                                        c3602 = new C3602(22);
                                    } else if (!typeName2.equals("com.google.common.collect.RegularImmutableList")) {
                                        if (typeName2.equals("java.util.Collections$SynchronizedCollection")) {
                                            c3602 = new C3602(19);
                                        } else if (typeName2.equals("com.google.common.collect.SingletonImmutableSet")) {
                                            c3602 = new C3683(i);
                                        } else if (typeName2.equals("java.util.Collections$SynchronizedRandomAccessList")) {
                                            c3602 = new C3602(12);
                                        } else if (typeName2.equals("java.util.Collections$SynchronizedNavigableSet")) {
                                            c3602 = new C3602(24);
                                        } else if (!typeName2.equals("java.util.SubList")) {
                                            if (!typeName2.equals("com.google.common.collect.SingletonImmutableList")) {
                                                if (!typeName2.equals("java.util.RandomAccessSubList") && !typeName2.equals("java.util.AbstractList$SubList")) {
                                                    if (!typeName2.equals("com.google.common.collect.ImmutableSet")) {
                                                        if (!typeName2.equals("com.google.common.collect.Lists$TransformingRandomAccessList")) {
                                                            if (!typeName2.equals("com.google.common.collect.Lists.TransformingSequentialList")) {
                                                                if (!typeName2.equals("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList")) {
                                                                    if (!typeName2.equals("com.google.common.collect.RegularImmutableSet")) {
                                                                        cls2 = cls;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            cls2 = TreeSet.class;
                        }
                    }
                    cls2 = HashSet.class;
                }
            }
            typeName = type4.getTypeName();
            typeName.getClass();
            switch (typeName) {
                case "kotlin.collections.EmptyList":
                    Class cls4 = (Class) type4;
                    return new C3531(cls4, m6062(cls4));
                case "java.util.Collections$EmptySet":
                    return new C3531((Class) type4, Collections.EMPTY_SET);
                case "java.util.Collections$EmptyList":
                    return new C3531((Class) type4, Collections.EMPTY_LIST);
                case "kotlin.collections.EmptySet":
                    Class cls5 = (Class) type4;
                    return new C3531(cls5, m6061(cls5));
                default:
                    return (type3 == String.class && c3602 == null) ? new C3532(cls, cls2) : (type3 == Long.class && c3602 == null) ? new C3530(cls, cls2) : new C3531(type4, cls, cls2, type3, c3602);
            }
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) type4;
        rawType = parameterizedType2.getRawType();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        if (actualTypeArguments2.length == 1) {
            type5 = actualTypeArguments2[0];
        }
        type2 = rawType;
        type3 = type5;
        if (cls == null) {
        }
        cls2 = ArrayList.class;
        c3602 = null;
        if (cls != Iterable.class) {
            if (cls != Queue.class) {
                cls2 = LinkedList.class;
            }
        }
        typeName = type4.getTypeName();
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
        switch (r0) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Set m6061(Class cls) {
        Set set = f8523;
        if (set == null) {
            set = null;
            try {
                Field field = cls.getField("INSTANCE");
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Set set2 = (Set) field.get(null);
                f8523 = set2;
                return set2;
            } catch (IllegalAccessException e) {
                e = e;
                C9620.m15032(AbstractC0900.m714(cls, "Failed to get singleton of "), e);
                return set;
            } catch (NoSuchFieldException e2) {
                e = e2;
                C9620.m15032(AbstractC0900.m714(cls, "Failed to get singleton of "), e);
                return set;
            }
        }
        return set;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static List m6062(Class cls) {
        List list = f8522;
        if (list == null) {
            list = null;
            try {
                Field field = cls.getField("INSTANCE");
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                List list2 = (List) field.get(null);
                f8522 = list2;
                return list2;
            } catch (IllegalAccessException e) {
                e = e;
                C9620.m15032(AbstractC0900.m714(cls, "Failed to get singleton of "), e);
                return list;
            } catch (NoSuchFieldException e2) {
                e = e2;
                C9620.m15032(AbstractC0900.m714(cls, "Failed to get singleton of "), e);
                return list;
            }
        }
        return list;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo6059(long j) {
        Constructor constructorM6372;
        Class cls = this.f8534;
        if (cls == ArrayList.class) {
            return AbstractC3687.f9263 == 8 ? new ArrayList(10) : new ArrayList();
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
        Object obj = this.f8541;
        if (obj != null) {
            return obj;
        }
        if (cls != null) {
            if (this.f8540 == null && ((constructorM6372 = AbstractC3698.m6372(this.f8534, false)) == null || !Modifier.isPublic(constructorM6372.getModifiers()))) {
                this.f8540 = AbstractC3698.m6372(this.f8534, false);
                this.f8540.setAccessible(true);
            }
            JSONException jSONException = null;
            if (!this.f8539) {
                try {
                    return this.f8540 != null ? this.f8540.newInstance(null) : this.f8534.newInstance();
                } catch (IllegalAccessException | InstantiationException | RuntimeException | InvocationTargetException unused) {
                    this.f8539 = true;
                    jSONException = new JSONException("create list error, type " + this.f8534);
                }
            }
            if (this.f8539 && List.class.isAssignableFrom(this.f8534.getSuperclass())) {
                try {
                    return this.f8534.getSuperclass().newInstance();
                } catch (IllegalAccessException | InstantiationException unused2) {
                    this.f8539 = true;
                    jSONException = new JSONException("create list error, type " + this.f8534);
                }
            }
            if (jSONException != null) {
                throw jSONException;
            }
        }
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Type type2;
        Object objMo6023;
        C3776 c3776 = abstractC3732.f9546;
        InterfaceC3621 interfaceC3621 = this.f8542;
        Type type3 = this.f8533;
        if (interfaceC3621 == null) {
            this.f8542 = c3776.m6971(type3);
        }
        if (abstractC3732.f9544) {
            return mo6027(abstractC3732, type, obj, 0L);
        }
        if (!abstractC3732.mo6679()) {
            Collection hashSet = abstractC3732.mo6707() ? new HashSet() : (Collection) mo6059(c3776.f9665 | j);
            char c = abstractC3732.f9538;
            int i = 0;
            Class cls = this.f8532;
            if (c == '\"') {
                String strMo6744 = abstractC3732.mo6744();
                if (cls == String.class) {
                    abstractC3732.mo6705();
                    hashSet.add(strMo6744);
                    return hashSet;
                }
                if (strMo6744.isEmpty()) {
                    abstractC3732.mo6705();
                    return null;
                }
                C3635 c3635 = (C3635) c3776.f9663;
                if (cls.isEnum()) {
                    InterfaceC3621 interfaceC3621M6193 = c3635.m6193(cls, false);
                    if (interfaceC3621M6193 instanceof C3570) {
                        Enum enumM6095 = ((C3570) interfaceC3621M6193).m6095(AbstractC3693.m6334(strMo6744));
                        if (enumM6095 != null) {
                            hashSet.add(enumM6095);
                            return hashSet;
                        }
                        if (JSONReader$Feature.ErrorOnEnumNotMatch.isEnabled(abstractC3732.m6717(j))) {
                            C1123.m1410(abstractC3732.mo6730("enum not match : ".concat(strMo6744)));
                            return null;
                        }
                    }
                }
                Function functionM6191 = c3635.m6191(String.class, type3);
                if (functionM6191 == null) {
                    C1123.m1410(abstractC3732.mo6730(null));
                    return null;
                }
                Object objApply = functionM6191.apply(strMo6744);
                abstractC3732.mo6705();
                hashSet.add(objApply);
                return hashSet;
            }
            Function function = this.f8537;
            if (c != '[') {
                if ((cls == Object.class || this.f8542 == null) && !(cls == Object.class && abstractC3732.mo6737())) {
                    C1123.m1410(abstractC3732.mo6730(null));
                    return null;
                }
                hashSet.add(this.f8542.mo6023(abstractC3732, this.f8533, 0, 0L));
                return function != null ? (Collection) function.apply(hashSet) : hashSet;
            }
            abstractC3732.mo6733();
            InterfaceC3621 interfaceC3621M6662 = this.f8542;
            if (type == this.f8536 || !(type instanceof ParameterizedType)) {
                type2 = type3;
            } else {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    type2 = actualTypeArguments[0];
                    if (type2 != type3) {
                        interfaceC3621M6662 = abstractC3732.m6662(type2);
                    }
                }
            }
            while (!abstractC3732.mo6702()) {
                if (type2 == String.class) {
                    objMo6023 = abstractC3732.mo6744();
                } else {
                    if (interfaceC3621M6662 == null) {
                        C1123.m1410(abstractC3732.mo6730("TODO : " + type2));
                        return null;
                    }
                    if (abstractC3732.mo6740()) {
                        String strMo6749 = abstractC3732.mo6749();
                        if ("..".equals(strMo6749)) {
                            objMo6023 = this;
                        } else {
                            abstractC3732.m6714(hashSet, i, AbstractC3755.m6938(strMo6749));
                            i++;
                        }
                    } else {
                        objMo6023 = interfaceC3621M6662.mo6023(abstractC3732, type2, Integer.valueOf(i), 0L);
                    }
                }
                hashSet.add(objMo6023);
                i++;
            }
            abstractC3732.mo6705();
            return function != null ? function.apply(hashSet) : hashSet;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo6029(Collection collection, long j) {
        int size = collection.size();
        Function function = this.f8537;
        if (size == 0 && this.f8535 == List.class) {
            ArrayList arrayList = new ArrayList();
            return function != null ? function.apply(arrayList) : arrayList;
        }
        C3635 c3635M6947 = AbstractC3766.m6947();
        long j2 = 0;
        Collection arrayList2 = this.f8534 == ArrayList.class ? new ArrayList(collection.size()) : (Collection) mo6059(0L);
        for (Object objMo6067 : collection) {
            if (objMo6067 == null) {
                arrayList2.add(null);
            } else {
                Class<?> cls = objMo6067.getClass();
                Class<?> cls2 = this.f8532;
                Type type = this.f8533;
                if ((cls == JSONObject.class || cls == AbstractC3700.f9396) && cls2 != cls) {
                    if (this.f8542 == null) {
                        this.f8542 = c3635M6947.m6193(type, false);
                    }
                    objMo6067 = this.f8542.mo6067((Map) objMo6067, j);
                } else if (cls != type) {
                    Function functionM6191 = c3635M6947.m6191(cls, type);
                    if (functionM6191 != null) {
                        objMo6067 = functionM6191.apply(objMo6067);
                    } else if (objMo6067 instanceof Map) {
                        Map map = (Map) objMo6067;
                        if (this.f8542 == null) {
                            this.f8542 = c3635M6947.m6193(type, false);
                        }
                        objMo6067 = this.f8542.mo6067(map, j2);
                    } else if (objMo6067 instanceof Collection) {
                        if (this.f8542 == null) {
                            this.f8542 = c3635M6947.m6193(type, false);
                        }
                        objMo6067 = this.f8542.mo6029((Collection) objMo6067, j);
                    } else if (!cls2.isInstance(objMo6067)) {
                        if (!Enum.class.isAssignableFrom(cls2)) {
                            C8376.m13330("can not convert from ", cls, " to ", type);
                            return null;
                        }
                        if (this.f8542 == null) {
                            this.f8542 = c3635M6947.m6193(type, false);
                        }
                        InterfaceC3621 interfaceC3621 = this.f8542;
                        if (!(interfaceC3621 instanceof C3570)) {
                            C8376.m13330("can not convert from ", cls, " to ", type);
                            return null;
                        }
                        objMo6067 = ((C3570) interfaceC3621).m6095(AbstractC3693.m6334((String) objMo6067));
                    }
                }
                arrayList2.add(objMo6067);
                j2 = 0;
            }
        }
        return function != null ? function.apply(arrayList2) : arrayList2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return this.f8535;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Function mo6063() {
        return this.f8537;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0276 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        AbstractC3732 abstractC37322;
        Type type2;
        Class cls;
        Collection hashSet;
        Function c3502;
        Collection collection;
        Function function;
        JSONArray jSONArray;
        Type type3;
        InterfaceC3621 interfaceC3621;
        int i;
        Type type4;
        InterfaceC3621 interfaceC36212;
        Object objMo6027;
        Collection collection2;
        Collection collectionM6062;
        ArrayList arrayList;
        Object objMo60272;
        Class clsMo6058;
        boolean zMo6693 = abstractC3732.mo6693();
        C3776 c3776 = abstractC3732.f9546;
        if (zMo6693) {
            return null;
        }
        InterfaceC3621 interfaceC3621Mo6724 = abstractC3732.mo6724(0L, j, this.f8535);
        Class cls2 = f8531;
        Class cls3 = f8521;
        Function c3602 = this.f8537;
        if (interfaceC3621Mo6724 != null) {
            if (interfaceC3621Mo6724 instanceof C3531) {
                C3531 c3531 = (C3531) interfaceC3621Mo6724;
                clsMo6058 = c3531.f8534;
                c3602 = c3531.f8537;
            } else {
                clsMo6058 = interfaceC3621Mo6724.mo6058();
            }
            if (clsMo6058 == f8529) {
                c3602 = new C3602(13);
            } else if (clsMo6058 == cls3) {
                c3602 = new C3602(14);
            } else if (clsMo6058 == f8520) {
                c3602 = new C3602(15);
                abstractC37322 = abstractC3732;
                type2 = type;
                cls = LinkedHashSet.class;
            } else {
                if (clsMo6058 == f8524) {
                    c3602 = new C3602(16);
                } else if (clsMo6058 == f8525) {
                    c3602 = new C3602(17);
                } else if (clsMo6058 == f8530) {
                    c3602 = new C3602(18);
                } else if (clsMo6058 == cls2) {
                    c3602 = new C3602(20);
                } else {
                    String typeName = clsMo6058.getTypeName();
                    typeName.getClass();
                    if (typeName.equals("kotlin.collections.EmptyList") || typeName.equals("kotlin.collections.EmptySet")) {
                        return interfaceC3621Mo6724.mo6023(abstractC3732, type, obj, j);
                    }
                    abstractC37322 = abstractC3732;
                    cls = clsMo6058;
                    type2 = type;
                }
                abstractC37322 = abstractC3732;
                type2 = type;
                cls = TreeSet.class;
            }
            abstractC37322 = abstractC3732;
            type2 = type;
            cls = ArrayList.class;
        } else {
            abstractC37322 = abstractC3732;
            type2 = type;
            cls = this.f8534;
        }
        int iMo6792 = abstractC37322.mo6792();
        Type type5 = this.f8533;
        if (iMo6792 > 0 && this.f8542 == null) {
            this.f8542 = c3776.m6971(type5);
        }
        Function function2 = c3602;
        if (cls == f8528) {
            Object[] objArr = new Object[iMo6792];
            List listAsList = Arrays.asList(objArr);
            for (int i2 = 0; i2 < iMo6792; i2++) {
                if (abstractC37322.mo6740()) {
                    String strMo6749 = abstractC37322.mo6749();
                    if ("..".equals(strMo6749)) {
                        objMo60272 = listAsList;
                    } else {
                        abstractC37322.m6714(listAsList, i2, AbstractC3755.m6938(strMo6749));
                        objMo60272 = null;
                    }
                } else {
                    objMo60272 = this.f8542.mo6027(abstractC37322, this.f8533, Integer.valueOf(i2), j);
                }
                objArr[i2] = objMo60272;
            }
            return listAsList;
        }
        if (cls == ArrayList.class) {
            if (iMo6792 > 0) {
                collectionM6062 = arrayList;
                arrayList = new ArrayList(iMo6792);
            } else {
                collectionM6062 = arrayList;
                arrayList = new ArrayList();
            }
        } else if (cls == JSONArray.class) {
            if (iMo6792 > 0) {
                collectionM6062 = jSONArray;
                jSONArray = new JSONArray(iMo6792);
            } else {
                collectionM6062 = jSONArray;
                jSONArray = new JSONArray();
            }
        } else if (cls == HashSet.class) {
            collectionM6062 = new HashSet();
        } else if (cls == LinkedHashSet.class) {
            collectionM6062 = new LinkedHashSet();
        } else if (cls == TreeSet.class) {
            collectionM6062 = new TreeSet();
        } else if (cls == f8527) {
            collectionM6062 = Collections.EMPTY_SET;
        } else {
            if (cls != f8526) {
                if (cls == cls2) {
                    hashSet = new ArrayList();
                    c3502 = new C3602(21);
                } else if (cls == cls3) {
                    hashSet = new ArrayList();
                    c3502 = new C3602(14);
                } else if (cls != null && EnumSet.class.isAssignableFrom(cls)) {
                    hashSet = new HashSet();
                    c3502 = new C3502(this, 5);
                } else if (cls == null || cls == this.f8536) {
                    collectionM6062 = (Collection) mo6059(c3776.f9665 | j);
                } else {
                    String name = cls.getName();
                    if (name.equals("kotlin.collections.EmptyList")) {
                        collectionM6062 = m6062(cls);
                    } else if (name.equals("kotlin.collections.EmptySet")) {
                        collectionM6062 = m6061(cls);
                    } else {
                        try {
                            collectionM6062 = (Collection) cls.newInstance();
                        } catch (IllegalAccessException | InstantiationException e) {
                            C1123.m1403(abstractC37322.mo6730("create instance error " + cls), e);
                            return null;
                        }
                    }
                }
                collection = hashSet;
                function = c3502;
                InterfaceC3621 interfaceC3621M6662 = this.f8542;
                if (!(type2 instanceof ParameterizedType)) {
                    Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
                    if (actualTypeArguments.length == 1) {
                        Type type6 = actualTypeArguments[0];
                        if (type6 != type5) {
                            interfaceC3621M6662 = abstractC37322.m6662(type6);
                        }
                        interfaceC3621 = interfaceC3621M6662;
                        type3 = type6;
                    } else {
                        type3 = type5;
                        interfaceC3621 = interfaceC3621M6662;
                    }
                }
                i = 0;
                AbstractC3732 abstractC37323 = abstractC37322;
                while (i < iMo6792) {
                    if (abstractC37323.mo6740()) {
                        String strMo67492 = abstractC37323.mo6749();
                        if ("..".equals(strMo67492)) {
                            collection2 = collection;
                        } else {
                            abstractC37323.m6714(collection, i, AbstractC3755.m6938(strMo67492));
                            if (collection instanceof List) {
                                collection2 = null;
                            } else {
                                interfaceC36212 = interfaceC3621;
                                type4 = type3;
                                i++;
                                abstractC37323 = abstractC3732;
                                interfaceC3621 = interfaceC36212;
                                type3 = type4;
                            }
                        }
                        objMo6027 = collection2;
                        interfaceC36212 = interfaceC3621;
                        type4 = type3;
                    } else {
                        InterfaceC3621 interfaceC3621Mo67242 = abstractC3732.mo6724(this.f8538, j, this.f8532);
                        if (interfaceC3621Mo67242 != null) {
                            type4 = type3;
                            objMo6027 = interfaceC3621Mo67242.mo6027(abstractC3732, type4, Integer.valueOf(i), j);
                            interfaceC36212 = interfaceC3621;
                        } else {
                            type4 = type3;
                            interfaceC36212 = interfaceC3621;
                            objMo6027 = interfaceC36212.mo6027(abstractC3732, type4, Integer.valueOf(i), j);
                        }
                    }
                    collection.add(objMo6027);
                    i++;
                    abstractC37323 = abstractC3732;
                    interfaceC3621 = interfaceC36212;
                    type3 = type4;
                }
                return function == null ? function.apply(collection) : collection;
            }
            collectionM6062 = Collections.EMPTY_LIST;
        }
        function = function2;
        collection = collectionM6062;
        InterfaceC3621 interfaceC3621M66622 = this.f8542;
        if (!(type2 instanceof ParameterizedType)) {
        }
        i = 0;
        AbstractC3732 abstractC373232 = abstractC37322;
        while (i < iMo6792) {
        }
        if (function == null) {
        }
    }

    public C3531(Class cls, Collection collection) {
        this(cls, cls, cls, Object.class, null);
        this.f8541 = collection;
    }
}
