package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2922;
import com.alibaba.fastjson2.C2900;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.C2834;
import com.alibaba.fastjson2.util.C2836;
import com.alibaba.fastjson2.util.C2852;
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
import p279.InterfaceC8367;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2762 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final long f8410;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final long f8411;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean f8412;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final JSONSchema f8413;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Locale f8414;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Object f8415;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public volatile InterfaceC2788 f8416;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public Type f8417;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final boolean f8418;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean f8419;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public volatile AbstractC2922 f8420;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public volatile InterfaceC2788 f8421;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f8422;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Type f8423;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Field f8424;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final long f8425;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f8426;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Method f8427;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f8428;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Class f8429;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f8430;

    public AbstractC2762(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field) {
        Class<?> enclosingClass;
        this.f8428 = str;
        this.f8423 = type;
        this.f8429 = cls;
        boolean zEquals = false;
        this.f8412 = cls != null && (Serializable.class.isAssignableFrom(cls) || Modifier.isInterface(cls.getModifiers()) || AbstractC2865.m5790(cls) || cls.isPrimitive());
        this.f8422 = j;
        this.f8411 = AbstractC2860.m5774(str);
        this.f8410 = AbstractC2860.m5773(str);
        this.f8430 = i;
        this.f8426 = str2;
        this.f8414 = locale;
        this.f8415 = obj;
        this.f8413 = jSONSchema;
        this.f8427 = method;
        this.f8424 = field;
        this.f8418 = (method != null && method.getParameterCount() == 0) || (field != null && Modifier.isFinal(field.getModifiers()));
        long jObjectFieldOffset = (field == null || (j & 36028797018963968L) != 0) ? -1L : AbstractC2854.f8921.objectFieldOffset(field);
        this.f8425 = jObjectFieldOffset;
        if (jObjectFieldOffset == -1 && field != null && method == null) {
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
                AbstractC2854.f8911.incrementAndGet();
            }
        }
        Class<?> declaringClass = method != null ? method.getDeclaringClass() : field != null ? field.getDeclaringClass() : null;
        Type[] typeArr = AbstractC2865.f9017;
        if (cls != null && !cls.isPrimitive() && cls != String.class && cls != List.class && (enclosingClass = cls.getEnclosingClass()) != null && (declaringClass == null || declaringClass.equals(enclosingClass))) {
            ConcurrentHashMap concurrentHashMap = AbstractC2865.f9012;
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
        this.f8419 = zEquals;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m5570(AbstractC2762 abstractC2762) {
        String name = abstractC2762.f8427.getName();
        return abstractC2762.mo5485() ? AbstractC2865.m5805(name, PropertyNamingStrategy.CamelCase.name()) : AbstractC2865.m5787(name, PropertyNamingStrategy.CamelCase.name());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InterfaceC2788 m5571(Type type, Class cls, String str, Locale locale) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String typeName = type.getTypeName();
        typeName.getClass();
        switch (typeName) {
            case "byte[]":
            case "[B":
                return new C2712(str);
            case "java.sql.Date":
                return new C2852(str, locale);
            case "java.sql.Time":
                return new C2836(str, locale);
            case "java.sql.Timestamp":
                return new C2834(str, locale);
            default:
                if (Calendar.class.isAssignableFrom(cls)) {
                    return new C2724(str, locale);
                }
                if (cls == ZonedDateTime.class) {
                    return new C2793(str, locale);
                }
                if (cls == LocalDateTime.class) {
                    return new C2696(str, locale);
                }
                if (cls == LocalDate.class) {
                    return new C2695(str, locale);
                }
                if (cls == LocalTime.class) {
                    return new C2717(str, locale);
                }
                if (cls == Instant.class) {
                    return new C2725(str, locale);
                }
                if (cls == OffsetTime.class) {
                    return new C2702(str, locale);
                }
                if (cls == OffsetDateTime.class) {
                    return new C2701(str, locale);
                }
                if (cls == Optional.class) {
                    return new C2706(type, str, locale);
                }
                if (cls == Date.class) {
                    return new C2741(str, locale);
                }
                return null;
        }
    }

    public final String toString() {
        Member member = this.f8427;
        if (member == null) {
            member = this.f8424;
        }
        return member != null ? member.getName() : this.f8428;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo5470(Class cls) {
        return this.f8429 == cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m5572(AbstractC2899 abstractC2899, Object obj, String str) {
        AbstractC2922 abstractC2922M6378;
        if (this.f8420 == null || !this.f8420.f9263.equals(str)) {
            abstractC2922M6378 = AbstractC2922.m6378(str);
            this.f8420 = abstractC2922M6378;
        } else {
            abstractC2922M6378 = this.f8420;
        }
        if (abstractC2899.f9200 == null) {
            abstractC2899.f9200 = new ArrayList();
        }
        abstractC2899.f9200.add(new C2900(this, obj, this.f8428, abstractC2922M6378));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5573(Object obj) {
        Object obj2 = this.f8415;
        if (obj2 != null) {
            mo5471(obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5482(long r14, java.lang.Object r16, java.lang.Object r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.AbstractC2762.mo5482(long, java.lang.Object, java.lang.Object):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo5471(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract void mo5480(Object obj, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo5484(AbstractC2899 abstractC2899, Object obj) {
        abstractC2899.mo6233();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo5485() {
        return this.f8418;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract void mo5472(AbstractC2899 abstractC2899, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo5481(AbstractC2899 abstractC2899, Object obj) {
        mo5472(abstractC2899, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract Object mo5473(AbstractC2899 abstractC2899);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public InterfaceC2788 mo5494() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public BiConsumer mo5474() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public InterfaceC2788 mo5495(AbstractC2899 abstractC2899) {
        if (this.f8421 != null) {
            return this.f8421;
        }
        InterfaceC2788 interfaceC2788M6102 = abstractC2899.m6102(this.f8423);
        this.f8421 = interfaceC2788M6102;
        return interfaceC2788M6102;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2788 m5574(C2802 c2802) {
        if (this.f8421 != null) {
            return this.f8421;
        }
        InterfaceC2788 interfaceC2788M5633 = c2802.m5633(this.f8423, (this.f8422 & JSONReader$Feature.FieldBased.mask) != 0);
        this.f8421 = interfaceC2788M5633;
        return interfaceC2788M5633;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC2788 m5575(C2943 c2943) {
        if (this.f8416 != null) {
            return this.f8416;
        }
        InterfaceC2788 interfaceC2788M6411 = c2943.m6411(this.f8417);
        this.f8416 = interfaceC2788M6411;
        return interfaceC2788M6411;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC2788 mo5496(C2943 c2943) {
        if (this.f8421 != null) {
            return this.f8421;
        }
        InterfaceC2788 interfaceC2788M6411 = c2943.m6411(this.f8423);
        this.f8421 = interfaceC2788M6411;
        return interfaceC2788M6411;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC2762 abstractC2762) {
        Class<?> superclass;
        Class<?> superclass2;
        Class<?> type;
        Class<?> declaringClass;
        Class<?> declaringClass2;
        String str = abstractC2762.f8428;
        Field field = abstractC2762.f8424;
        Method method = abstractC2762.f8427;
        String str2 = this.f8428;
        int iCompareTo = str2.compareTo(str);
        if (iCompareTo != 0) {
            int i = abstractC2762.f8430;
            int i2 = this.f8430;
            if (i2 >= i) {
                if (i2 > i) {
                    return 1;
                }
                return iCompareTo;
            }
            return -1;
        }
        int i3 = mo5485() == abstractC2762.mo5485() ? 0 : mo5485() ? 1 : -1;
        if (i3 == 0) {
            Field field2 = this.f8424;
            Method method2 = this.f8427;
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
                                    InterfaceC8367 interfaceC8367 = (InterfaceC8367) AbstractC2865.m5818(method2, InterfaceC8367.class);
                                    InterfaceC8367 interfaceC83672 = (InterfaceC8367) AbstractC2865.m5818(method, InterfaceC8367.class);
                                    boolean z = interfaceC8367 != null;
                                    if (z == (interfaceC83672 == null)) {
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
                    String strM5787 = AbstractC2865.m5787(name, null);
                    String strM57872 = AbstractC2865.m5787(name2, null);
                    boolean zEquals = str2.equals(strM5787);
                    if (zEquals != abstractC2762.f8428.equals(strM57872)) {
                        return zEquals ? 1 : -1;
                    }
                }
            }
            InterfaceC2788 interfaceC2788Mo5494 = mo5494();
            InterfaceC2788 interfaceC2788Mo54942 = abstractC2762.mo5494();
            if (interfaceC2788Mo5494 == null || interfaceC2788Mo54942 != null) {
                if (interfaceC2788Mo5494 != null || interfaceC2788Mo54942 == null) {
                    Class cls = abstractC2762.f8429;
                    Class cls2 = this.f8429;
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
    public void mo5483(Object obj, String str, Object obj2) {
    }
}
