package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2867;
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
import p144.C7547;
import p336.C8791;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2698 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final Class f8175;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Class f8176;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static List f8177;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static Set f8178;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final Class f8179;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Class f8180;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Class f8181;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Class f8182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Class f8183;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Class f8184;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Class f8185;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Class f8186;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f8187;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Type f8188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f8189;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f8191;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Function f8192;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f8193;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public volatile boolean f8194;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public volatile Constructor f8195;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object f8196;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC2788 f8197;

    static {
        Set set = Collections.EMPTY_SET;
        f8182 = set.getClass();
        List list = Collections.EMPTY_LIST;
        f8181 = list.getClass();
        f8185 = Collections.singleton(0).getClass();
        f8186 = Collections.singletonList(0).getClass();
        f8183 = Arrays.asList(0).getClass();
        f8184 = Collections.unmodifiableCollection(list).getClass();
        f8176 = Collections.unmodifiableList(list).getClass();
        f8175 = Collections.unmodifiableSet(set).getClass();
        f8179 = Collections.unmodifiableSortedSet(Collections.emptySortedSet()).getClass();
        f8180 = Collections.unmodifiableNavigableSet(Collections.emptyNavigableSet()).getClass();
        new C2698(ArrayList.class, ArrayList.class, ArrayList.class, Object.class, null);
    }

    public C2698(Type type, Class cls, Class cls2, Type type2, Function function) {
        this.f8191 = type;
        this.f8190 = cls;
        this.f8189 = cls2;
        AbstractC2860.m5774(AbstractC2867.m5943(cls2));
        this.f8188 = type2;
        Class clsM5944 = AbstractC2867.m5944(type2);
        this.f8187 = clsM5944;
        this.f8192 = function;
        String strM5943 = clsM5944 != null ? AbstractC2867.m5943(clsM5944) : null;
        this.f8193 = strM5943 != null ? AbstractC2860.m5774(strM5943) : 0L;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.InterfaceC2788 m5500(java.lang.Class r10, java.lang.reflect.Type r11) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2698.m5500(java.lang.Class, java.lang.reflect.Type):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Set m5501(Class cls) {
        Set set = f8178;
        if (set == null) {
            set = null;
            try {
                Field field = cls.getField("INSTANCE");
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Set set2 = (Set) field.get(null);
                f8178 = set2;
                return set2;
            } catch (IllegalAccessException e) {
                e = e;
                C8791.m14473(AbstractC0053.m154(cls, "Failed to get singleton of "), e);
                return set;
            } catch (NoSuchFieldException e2) {
                e = e2;
                C8791.m14473(AbstractC0053.m154(cls, "Failed to get singleton of "), e);
                return set;
            }
        }
        return set;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static List m5502(Class cls) {
        List list = f8177;
        if (list == null) {
            list = null;
            try {
                Field field = cls.getField("INSTANCE");
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                List list2 = (List) field.get(null);
                f8177 = list2;
                return list2;
            } catch (IllegalAccessException e) {
                e = e;
                C8791.m14473(AbstractC0053.m154(cls, "Failed to get singleton of "), e);
                return list;
            } catch (NoSuchFieldException e2) {
                e = e2;
                C8791.m14473(AbstractC0053.m154(cls, "Failed to get singleton of "), e);
                return list;
            }
        }
        return list;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5499(long j) {
        Constructor constructorM5812;
        Class cls = this.f8189;
        if (cls == ArrayList.class) {
            return AbstractC2854.f8918 == 8 ? new ArrayList(10) : new ArrayList();
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
        Object obj = this.f8196;
        if (obj != null) {
            return obj;
        }
        if (cls != null) {
            if (this.f8195 == null && ((constructorM5812 = AbstractC2865.m5812(this.f8189, false)) == null || !Modifier.isPublic(constructorM5812.getModifiers()))) {
                this.f8195 = AbstractC2865.m5812(this.f8189, false);
                this.f8195.setAccessible(true);
            }
            JSONException jSONException = null;
            if (!this.f8194) {
                try {
                    return this.f8195 != null ? this.f8195.newInstance(null) : this.f8189.newInstance();
                } catch (IllegalAccessException | InstantiationException | RuntimeException | InvocationTargetException unused) {
                    this.f8194 = true;
                    jSONException = new JSONException("create list error, type " + this.f8189);
                }
            }
            if (this.f8194 && List.class.isAssignableFrom(this.f8189.getSuperclass())) {
                try {
                    return this.f8189.getSuperclass().newInstance();
                } catch (IllegalAccessException | InstantiationException unused2) {
                    this.f8194 = true;
                    jSONException = new JSONException("create list error, type " + this.f8189);
                }
            }
            if (jSONException != null) {
                throw jSONException;
            }
        }
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5463(com.alibaba.fastjson2.AbstractC2899 r15, java.lang.reflect.Type r16, java.lang.Object r17, long r18) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2698.mo5463(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5469(Collection collection, long j) {
        int size = collection.size();
        Function function = this.f8192;
        if (size == 0 && this.f8190 == List.class) {
            ArrayList arrayList = new ArrayList();
            return function != null ? function.apply(arrayList) : arrayList;
        }
        C2802 c2802M6387 = AbstractC2933.m6387();
        long j2 = 0;
        Collection arrayList2 = this.f8189 == ArrayList.class ? new ArrayList(collection.size()) : (Collection) mo5499(0L);
        for (Object objMo5507 : collection) {
            if (objMo5507 == null) {
                arrayList2.add(null);
            } else {
                Class<?> cls = objMo5507.getClass();
                Class<?> cls2 = this.f8187;
                Type type = this.f8188;
                if ((cls == JSONObject.class || cls == AbstractC2867.f9051) && cls2 != cls) {
                    if (this.f8197 == null) {
                        this.f8197 = c2802M6387.m5633(type, false);
                    }
                    objMo5507 = this.f8197.mo5507((Map) objMo5507, j);
                } else if (cls != type) {
                    Function functionM5631 = c2802M6387.m5631(cls, type);
                    if (functionM5631 != null) {
                        objMo5507 = functionM5631.apply(objMo5507);
                    } else if (objMo5507 instanceof Map) {
                        Map map = (Map) objMo5507;
                        if (this.f8197 == null) {
                            this.f8197 = c2802M6387.m5633(type, false);
                        }
                        objMo5507 = this.f8197.mo5507(map, j2);
                    } else if (objMo5507 instanceof Collection) {
                        if (this.f8197 == null) {
                            this.f8197 = c2802M6387.m5633(type, false);
                        }
                        objMo5507 = this.f8197.mo5469((Collection) objMo5507, j);
                    } else if (!cls2.isInstance(objMo5507)) {
                        if (!Enum.class.isAssignableFrom(cls2)) {
                            C7547.m12771("can not convert from ", cls, " to ", type);
                            return null;
                        }
                        if (this.f8197 == null) {
                            this.f8197 = c2802M6387.m5633(type, false);
                        }
                        InterfaceC2788 interfaceC2788 = this.f8197;
                        if (!(interfaceC2788 instanceof C2737)) {
                            C7547.m12771("can not convert from ", cls, " to ", type);
                            return null;
                        }
                        objMo5507 = ((C2737) interfaceC2788).m5535(AbstractC2860.m5774((String) objMo5507));
                    }
                }
                arrayList2.add(objMo5507);
                j2 = 0;
            }
        }
        return function != null ? function.apply(arrayList2) : arrayList2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return this.f8190;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Function mo5503() {
        return this.f8192;
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
    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5467(com.alibaba.fastjson2.AbstractC2899 r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2698.mo5467(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    public C2698(Class cls, Collection collection) {
        this(cls, cls, cls, Object.class, null);
        this.f8196 = collection;
    }
}
