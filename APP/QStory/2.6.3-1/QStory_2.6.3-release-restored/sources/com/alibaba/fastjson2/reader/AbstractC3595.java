package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3755;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3733;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3667;
import com.alibaba.fastjson2.util.C3669;
import com.alibaba.fastjson2.util.C3685;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Function;
import p295.InterfaceC9196;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3595 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final long f8755;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final long f8756;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean f8757;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final JSONSchema f8758;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Locale f8759;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Object f8760;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public volatile InterfaceC3621 f8761;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public Type f8762;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final boolean f8763;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean f8764;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public volatile AbstractC3755 f8765;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public volatile InterfaceC3621 f8766;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f8767;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Type f8768;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Field f8769;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final long f8770;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f8771;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Method f8772;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f8773;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Class f8774;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f8775;

    public AbstractC3595(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field) {
        Class<?> enclosingClass;
        this.f8773 = str;
        this.f8768 = type;
        this.f8774 = cls;
        boolean zEquals = false;
        this.f8757 = cls != null && (Serializable.class.isAssignableFrom(cls) || Modifier.isInterface(cls.getModifiers()) || AbstractC3698.m6350(cls) || cls.isPrimitive());
        this.f8767 = j;
        this.f8756 = AbstractC3693.m6334(str);
        this.f8755 = AbstractC3693.m6333(str);
        this.f8775 = i;
        this.f8771 = str2;
        this.f8759 = locale;
        this.f8760 = obj;
        this.f8758 = jSONSchema;
        this.f8772 = method;
        this.f8769 = field;
        this.f8763 = (method != null && method.getParameterCount() == 0) || (field != null && Modifier.isFinal(field.getModifiers()));
        long jObjectFieldOffset = (field == null || (j & 36028797018963968L) != 0) ? -1L : AbstractC3687.f9266.objectFieldOffset(field);
        this.f8770 = jObjectFieldOffset;
        if (jObjectFieldOffset == -1 && field != null && method == null) {
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
                AbstractC3687.f9256.incrementAndGet();
            }
        }
        Class<?> declaringClass = method != null ? method.getDeclaringClass() : field != null ? field.getDeclaringClass() : null;
        Type[] typeArr = AbstractC3698.f9362;
        if (cls != null && !cls.isPrimitive() && cls != String.class && cls != List.class && (enclosingClass = cls.getEnclosingClass()) != null && (declaringClass == null || declaringClass.equals(enclosingClass))) {
            ConcurrentHashMap concurrentHashMap = AbstractC3698.f9357;
            Constructor<?>[] declaredConstructors = (Constructor[]) concurrentHashMap.get(cls);
            if (declaredConstructors == null) {
                declaredConstructors = cls.getDeclaredConstructors();
                concurrentHashMap.putIfAbsent(cls, declaredConstructors);
            }
            if (declaredConstructors.length != 0) {
                Constructor<?> constructor = declaredConstructors[0];
                if (constructor.getParameterCount() != 0) {
                    zEquals = enclosingClass.equals(constructor.getParameterTypes()[0]);
                }
            }
        }
        this.f8764 = zEquals;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m6130(AbstractC3595 abstractC3595) {
        String name = abstractC3595.f8772.getName();
        return abstractC3595.mo6045() ? AbstractC3698.m6365(name, PropertyNamingStrategy.CamelCase.name()) : AbstractC3698.m6347(name, PropertyNamingStrategy.CamelCase.name());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InterfaceC3621 m6131(Type type, Class cls, String str, Locale locale) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String typeName = type.getTypeName();
        typeName.getClass();
        switch (typeName) {
            case "byte[]":
            case "[B":
                return new C3545(str);
            case "java.sql.Date":
                return new C3685(str, locale);
            case "java.sql.Time":
                return new C3669(str, locale);
            case "java.sql.Timestamp":
                return new C3667(str, locale);
            default:
                if (Calendar.class.isAssignableFrom(cls)) {
                    return new C3557(str, locale);
                }
                if (cls == ZonedDateTime.class) {
                    return new C3626(str, locale);
                }
                if (cls == LocalDateTime.class) {
                    return new C3529(str, locale);
                }
                if (cls == LocalDate.class) {
                    return new C3528(str, locale);
                }
                if (cls == LocalTime.class) {
                    return new C3550(str, locale);
                }
                if (cls == Instant.class) {
                    return new C3558(str, locale);
                }
                if (cls == OffsetTime.class) {
                    return new C3535(str, locale);
                }
                if (cls == OffsetDateTime.class) {
                    return new C3534(str, locale);
                }
                if (cls == Optional.class) {
                    return new C3539(type, str, locale);
                }
                if (cls == Date.class) {
                    return new C3574(str, locale);
                }
                return null;
        }
    }

    public final String toString() {
        Member member = this.f8772;
        if (member == null) {
            member = this.f8769;
        }
        return member != null ? member.getName() : this.f8773;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo6030(Class cls) {
        return this.f8774 == cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m6132(AbstractC3732 abstractC3732, Object obj, String str) {
        AbstractC3755 abstractC3755M6938;
        if (this.f8765 == null || !this.f8765.f9608.equals(str)) {
            abstractC3755M6938 = AbstractC3755.m6938(str);
            this.f8765 = abstractC3755M6938;
        } else {
            abstractC3755M6938 = this.f8765;
        }
        if (abstractC3732.f9545 == null) {
            abstractC3732.f9545 = new ArrayList();
        }
        abstractC3732.f9545.add(new C3733(this, obj, this.f8773, abstractC3755M6938));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m6133(Object obj) {
        Object obj2 = this.f8760;
        if (obj2 != null) {
            mo6031(obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6042(long j, Object obj, Object obj2) throws IOException {
        Object objMo6023;
        boolean z;
        Object objValueOf;
        Function functionM6191;
        C3635 c3635M6947 = AbstractC3766.m6947();
        Class<?> cls = this.f8774;
        if (obj2 != null) {
            Class<?> cls2 = obj2.getClass();
            if (mo6030(cls2)) {
                objMo6023 = obj2;
                z = true;
            } else {
                if (cls2 != String.class) {
                    if (cls2 == Integer.class && ((cls == Boolean.TYPE || cls == Boolean.class) && (JSONReader$Feature.NonZeroNumberCastToBooleanAsTrue.mask & j) != 0)) {
                        objValueOf = Boolean.valueOf(((Integer) obj2).intValue() != 0);
                    }
                    z = true;
                    if (cls2 == cls) {
                    }
                } else if (cls == Date.class) {
                    objValueOf = obj2;
                    z = false;
                    objMo6023 = (cls2 == cls || !z || (functionM6191 = c3635M6947.m6191(cls2, cls)) == null) ? objValueOf : functionM6191.apply(objValueOf);
                }
                objValueOf = obj2;
                z = true;
                if (cls2 == cls) {
                }
            }
        }
        if (objMo6023 != null) {
            Class<?> cls3 = objMo6023.getClass();
            Type type = this.f8768;
            if (type != cls3 && type != Object.class) {
                if (objMo6023 instanceof JSONObject) {
                    JSONReader$Feature jSONReader$Feature = JSONReader$Feature.SupportSmartMatch;
                    objMo6023 = ((JSONObject) objMo6023).m17to(type, (j & jSONReader$Feature.mask) != 0 ? new JSONReader$Feature[]{jSONReader$Feature} : new JSONReader$Feature[0]);
                } else if (objMo6023 instanceof JSONArray) {
                    objMo6023 = ((JSONArray) objMo6023).m6to(type, j);
                } else if ((j == 0 || j == JSONReader$Feature.SupportSmartMatch.mask) && !cls.isInstance(objMo6023) && this.f8771 == null) {
                    InterfaceC3621 interfaceC3621Mo6054 = mo6054();
                    objMo6023 = interfaceC3621Mo6054 != null ? interfaceC3621Mo6054.mo6023(AbstractC3732.m6651(InterfaceC3749.m6935(objMo6023)), this.f8768, this.f8773, j) : AbstractC3700.m6484(objMo6023, type, c3635M6947);
                } else if (z) {
                    AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(InterfaceC3749.m6935(objMo6023), new C3776(AbstractC3766.m6947(), j));
                    try {
                        objMo6023 = mo6055(abstractC3732M6652).mo6023(abstractC3732M6652, null, this.f8773, j);
                        abstractC3732M6652.close();
                    } finally {
                    }
                }
            }
        }
        mo6031(obj, objMo6023);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo6031(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract void mo6040(Object obj, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo6044(AbstractC3732 abstractC3732, Object obj) {
        abstractC3732.mo6793();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo6045() {
        return this.f8763;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract void mo6032(AbstractC3732 abstractC3732, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo6041(AbstractC3732 abstractC3732, Object obj) {
        mo6032(abstractC3732, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract Object mo6033(AbstractC3732 abstractC3732);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public InterfaceC3621 mo6054() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public BiConsumer mo6034() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public InterfaceC3621 mo6055(AbstractC3732 abstractC3732) {
        if (this.f8766 != null) {
            return this.f8766;
        }
        InterfaceC3621 interfaceC3621M6662 = abstractC3732.m6662(this.f8768);
        this.f8766 = interfaceC3621M6662;
        return interfaceC3621M6662;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC3621 m6134(C3635 c3635) {
        if (this.f8766 != null) {
            return this.f8766;
        }
        InterfaceC3621 interfaceC3621M6193 = c3635.m6193(this.f8768, (this.f8767 & JSONReader$Feature.FieldBased.mask) != 0);
        this.f8766 = interfaceC3621M6193;
        return interfaceC3621M6193;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC3621 m6135(C3776 c3776) {
        if (this.f8761 != null) {
            return this.f8761;
        }
        InterfaceC3621 interfaceC3621M6971 = c3776.m6971(this.f8762);
        this.f8761 = interfaceC3621M6971;
        return interfaceC3621M6971;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC3621 mo6056(C3776 c3776) {
        if (this.f8766 != null) {
            return this.f8766;
        }
        InterfaceC3621 interfaceC3621M6971 = c3776.m6971(this.f8768);
        this.f8766 = interfaceC3621M6971;
        return interfaceC3621M6971;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC3595 abstractC3595) {
        Class<?> superclass;
        Class<?> superclass2;
        Class<?> type;
        Class<?> declaringClass;
        Class<?> declaringClass2;
        String str = abstractC3595.f8773;
        Field field = abstractC3595.f8769;
        Method method = abstractC3595.f8772;
        String str2 = this.f8773;
        int iCompareTo = str2.compareTo(str);
        if (iCompareTo != 0) {
            int i = abstractC3595.f8775;
            int i2 = this.f8775;
            if (i2 >= i) {
                if (i2 > i) {
                    return 1;
                }
                return iCompareTo;
            }
            return -1;
        }
        int i3 = mo6045() == abstractC3595.mo6045() ? 0 : mo6045() ? 1 : -1;
        if (i3 == 0) {
            Field field2 = this.f8769;
            Method method2 = this.f8772;
            Member member = field2 != null ? field2 : method2;
            Member member2 = field != null ? field : method;
            if (member != null && member2 != null && member.getClass() != member2.getClass() && (declaringClass2 = member.getDeclaringClass()) != (declaringClass = member2.getDeclaringClass())) {
                if (!declaringClass2.isAssignableFrom(declaringClass)) {
                    if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    }
                    return -1;
                }
                return 1;
            }
            if (field2 != null && field != null) {
                Class<?> declaringClass3 = field2.getDeclaringClass();
                Class<?> declaringClass4 = field.getDeclaringClass();
                for (Class<? super Object> superclass3 = declaringClass3.getSuperclass(); superclass3 != null && superclass3 != Object.class; superclass3 = superclass3.getSuperclass()) {
                    if (superclass3 == declaringClass4) {
                        break;
                    }
                }
                do {
                    declaringClass4 = declaringClass4.getSuperclass();
                    if (declaringClass4 == null || declaringClass4 == Object.class) {
                    }
                } while (declaringClass4 != declaringClass3);
                return -1;
            }
            if (method2 != null && method != null) {
                Class<?> declaringClass5 = method2.getDeclaringClass();
                Class<?> declaringClass6 = method.getDeclaringClass();
                if (declaringClass5 != declaringClass6) {
                    for (Class<? super Object> superclass4 = declaringClass5.getSuperclass(); superclass4 != null && superclass4 != Object.class; superclass4 = superclass4.getSuperclass()) {
                        if (superclass4 == declaringClass6) {
                            break;
                        }
                    }
                    for (Class<? super Object> superclass5 = declaringClass6.getSuperclass(); superclass5 != null && superclass5 != Object.class; superclass5 = superclass5.getSuperclass()) {
                        if (superclass5 == declaringClass5) {
                            break;
                        }
                    }
                }
                if (method2.getParameterCount() == 1 && method.getParameterCount() == 1 && (superclass = method2.getParameterTypes()[0]) != (superclass2 = method.getParameterTypes()[0])) {
                    if (!superclass.isAssignableFrom(superclass2)) {
                        if (!superclass2.isAssignableFrom(superclass)) {
                            if (!Collection.class.isAssignableFrom(superclass2) || Collection.class.isAssignableFrom(superclass)) {
                                if (!Collection.class.isAssignableFrom(superclass) || Collection.class.isAssignableFrom(superclass2)) {
                                    if (superclass.isEnum() || superclass.isInterface() || superclass2.isEnum() || superclass2.isInterface()) {
                                        try {
                                            type = declaringClass5.getDeclaredField(str2).getType();
                                            if (type == null) {
                                                try {
                                                    type = declaringClass6.getDeclaredField(str2).getType();
                                                } catch (NoSuchFieldException unused) {
                                                }
                                            }
                                        } catch (NoSuchFieldException unused2) {
                                            type = null;
                                        }
                                        if (type != null) {
                                            while (superclass != null && superclass != Object.class) {
                                                if (superclass == type) {
                                                    break;
                                                }
                                                superclass = superclass.getSuperclass();
                                            }
                                            while (superclass2 != null && superclass2 != Object.class) {
                                                if (superclass2 == type) {
                                                    break;
                                                }
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                    InterfaceC9196 interfaceC9196 = (InterfaceC9196) AbstractC3698.m6378(method2, InterfaceC9196.class);
                                    InterfaceC9196 interfaceC91962 = (InterfaceC9196) AbstractC3698.m6378(method, InterfaceC9196.class);
                                    boolean z = interfaceC9196 != null;
                                    if (z == (interfaceC91962 == null)) {
                                        return z ? -1 : 1;
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    return 1;
                }
                String name = method2.getName();
                String name2 = method.getName();
                if (!name.equals(name2)) {
                    boolean zStartsWith = name.startsWith("set");
                    if (zStartsWith != name2.startsWith("set")) {
                        return zStartsWith ? -1 : 1;
                    }
                    String strM6347 = AbstractC3698.m6347(name, null);
                    String strM63472 = AbstractC3698.m6347(name2, null);
                    boolean zEquals = str2.equals(strM6347);
                    if (zEquals != abstractC3595.f8773.equals(strM63472)) {
                        return zEquals ? 1 : -1;
                    }
                }
            }
            InterfaceC3621 interfaceC3621Mo6054 = mo6054();
            InterfaceC3621 interfaceC3621Mo60542 = abstractC3595.mo6054();
            if (interfaceC3621Mo6054 == null || interfaceC3621Mo60542 != null) {
                if (interfaceC3621Mo6054 != null || interfaceC3621Mo60542 == null) {
                    Class cls = abstractC3595.f8774;
                    Class cls2 = this.f8774;
                    boolean zIsPrimitive = cls2.isPrimitive();
                    boolean zIsPrimitive2 = cls.isPrimitive();
                    if (!zIsPrimitive || zIsPrimitive2) {
                        if (zIsPrimitive || !zIsPrimitive2) {
                            boolean zStartsWith2 = cls2.getName().startsWith("java.");
                            boolean zStartsWith3 = cls.getName().startsWith("java.");
                            if (!zStartsWith2 || zStartsWith3) {
                                if (zStartsWith2 || !zStartsWith3) {
                                }
                            }
                        }
                    }
                }
                return 1;
            }
            return -1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo6043(Object obj, String str, Object obj2) {
    }
}
