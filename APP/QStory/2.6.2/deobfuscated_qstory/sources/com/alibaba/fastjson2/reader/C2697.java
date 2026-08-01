package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2864;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import p144.C7546;
import p330.C8796;
import p383.AbstractC9032;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2697 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final Class f8173;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Class f8174;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static List f8175;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static Set f8176;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final Class f8177;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Class f8178;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Class f8179;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Class f8180;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Class f8181;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Class f8182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Class f8183;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Class f8184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f8185;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Type f8186;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f8187;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f8189;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Function f8190;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f8191;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public volatile boolean f8192;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public volatile Constructor f8193;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object f8194;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC2787 f8195;

    static {
        Set set = Collections.EMPTY_SET;
        f8180 = set.getClass();
        List list = Collections.EMPTY_LIST;
        f8179 = list.getClass();
        f8183 = Collections.singleton(0).getClass();
        f8184 = Collections.singletonList(0).getClass();
        f8181 = Arrays.asList(0).getClass();
        f8182 = Collections.unmodifiableCollection(list).getClass();
        f8174 = Collections.unmodifiableList(list).getClass();
        f8173 = Collections.unmodifiableSet(set).getClass();
        f8177 = Collections.unmodifiableSortedSet(Collections.emptySortedSet()).getClass();
        f8178 = Collections.unmodifiableNavigableSet(Collections.emptyNavigableSet()).getClass();
        new C2697(ArrayList.class, ArrayList.class, ArrayList.class, Object.class, null);
    }

    public C2697(Type type, Class cls, Class cls2, Type type2, Function function) {
        this.f8189 = type;
        this.f8188 = cls;
        this.f8187 = cls2;
        AbstractC2859.m5729(AbstractC2866.m5898(cls2));
        this.f8186 = type2;
        Class clsM5899 = AbstractC2866.m5899(type2);
        this.f8185 = clsM5899;
        this.f8190 = function;
        String strM5898 = clsM5899 != null ? AbstractC2866.m5898(clsM5899) : null;
        this.f8191 = strM5898 != null ? AbstractC2859.m5729(strM5898) : 0L;
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
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.InterfaceC2787 m5455(java.lang.Class r10, java.lang.reflect.Type r11) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2697.m5455(java.lang.Class, java.lang.reflect.Type):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Set m5456(Class cls) {
        Set set = f8176;
        if (set == null) {
            set = null;
            try {
                Field field = cls.getField("INSTANCE");
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Set set2 = (Set) field.get(null);
                f8176 = set2;
                return set2;
            } catch (IllegalAccessException e) {
                e = e;
                C8796.m14449(AbstractC9032.m14590(cls, "Failed to get singleton of "), e);
                return set;
            } catch (NoSuchFieldException e2) {
                e = e2;
                C8796.m14449(AbstractC9032.m14590(cls, "Failed to get singleton of "), e);
                return set;
            }
        }
        return set;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static List m5457(Class cls) {
        List list = f8175;
        if (list == null) {
            list = null;
            try {
                Field field = cls.getField("INSTANCE");
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                List list2 = (List) field.get(null);
                f8175 = list2;
                return list2;
            } catch (IllegalAccessException e) {
                e = e;
                C8796.m14449(AbstractC9032.m14590(cls, "Failed to get singleton of "), e);
                return list;
            } catch (NoSuchFieldException e2) {
                e = e2;
                C8796.m14449(AbstractC9032.m14590(cls, "Failed to get singleton of "), e);
                return list;
            }
        }
        return list;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5454(long j) {
        Constructor constructorM5767;
        Class cls = this.f8187;
        if (cls == ArrayList.class) {
            return AbstractC2853.f8916 == 8 ? new ArrayList(10) : new ArrayList();
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
        Object obj = this.f8194;
        if (obj != null) {
            return obj;
        }
        if (cls != null) {
            if (this.f8193 == null && ((constructorM5767 = AbstractC2864.m5767(this.f8187, false)) == null || !Modifier.isPublic(constructorM5767.getModifiers()))) {
                this.f8193 = AbstractC2864.m5767(this.f8187, false);
                this.f8193.setAccessible(true);
            }
            JSONException jSONException = null;
            if (!this.f8192) {
                try {
                    return this.f8193 != null ? this.f8193.newInstance(null) : this.f8187.newInstance();
                } catch (IllegalAccessException | InstantiationException | RuntimeException | InvocationTargetException unused) {
                    this.f8192 = true;
                    jSONException = new JSONException("create list error, type " + this.f8187);
                }
            }
            if (this.f8192 && List.class.isAssignableFrom(this.f8187.getSuperclass())) {
                try {
                    return this.f8187.getSuperclass().newInstance();
                } catch (IllegalAccessException | InstantiationException unused2) {
                    this.f8192 = true;
                    jSONException = new JSONException("create list error, type " + this.f8187);
                }
            }
            if (jSONException != null) {
                throw jSONException;
            }
        }
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5418(com.alibaba.fastjson2.AbstractC2898 r15, java.lang.reflect.Type r16, java.lang.Object r17, long r18) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2697.mo5418(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5424(Collection collection, long j) {
        int size = collection.size();
        Function function = this.f8190;
        if (size == 0 && this.f8188 == List.class) {
            ArrayList arrayList = new ArrayList();
            return function != null ? function.apply(arrayList) : arrayList;
        }
        C2801 c2801M6329 = AbstractC2932.m6329();
        long j2 = 0;
        Collection arrayList2 = this.f8187 == ArrayList.class ? new ArrayList(collection.size()) : (Collection) mo5454(0L);
        for (Object objMo5462 : collection) {
            if (objMo5462 == null) {
                arrayList2.add(null);
            } else {
                Class<?> cls = objMo5462.getClass();
                Class<?> cls2 = this.f8185;
                Type type = this.f8186;
                if ((cls == JSONObject.class || cls == AbstractC2866.f9049) && cls2 != cls) {
                    if (this.f8195 == null) {
                        this.f8195 = c2801M6329.m5588(type, false);
                    }
                    objMo5462 = this.f8195.mo5462((Map) objMo5462, j);
                } else if (cls != type) {
                    Function functionM5586 = c2801M6329.m5586(cls, type);
                    if (functionM5586 != null) {
                        objMo5462 = functionM5586.apply(objMo5462);
                    } else if (objMo5462 instanceof Map) {
                        Map map = (Map) objMo5462;
                        if (this.f8195 == null) {
                            this.f8195 = c2801M6329.m5588(type, false);
                        }
                        objMo5462 = this.f8195.mo5462(map, j2);
                    } else if (objMo5462 instanceof Collection) {
                        if (this.f8195 == null) {
                            this.f8195 = c2801M6329.m5588(type, false);
                        }
                        objMo5462 = this.f8195.mo5424((Collection) objMo5462, j);
                    } else if (!cls2.isInstance(objMo5462)) {
                        if (!Enum.class.isAssignableFrom(cls2)) {
                            C7546.m12742("can not convert from ", cls, " to ", type);
                            return null;
                        }
                        if (this.f8195 == null) {
                            this.f8195 = c2801M6329.m5588(type, false);
                        }
                        InterfaceC2787 interfaceC2787 = this.f8195;
                        if (!(interfaceC2787 instanceof C2736)) {
                            C7546.m12742("can not convert from ", cls, " to ", type);
                            return null;
                        }
                        objMo5462 = ((C2736) interfaceC2787).m5490(AbstractC2859.m5729((String) objMo5462));
                    }
                }
                arrayList2.add(objMo5462);
                j2 = 0;
            }
        }
        return function != null ? function.apply(arrayList2) : arrayList2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return this.f8188;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Function mo5458() {
        return this.f8190;
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
    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5422(com.alibaba.fastjson2.AbstractC2898 r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2697.mo5422(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    public C2697(Class cls, Collection collection) {
        this(cls, cls, cls, Object.class, null);
        this.f8194 = collection;
    }
}
