package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2921;
import com.alibaba.fastjson2.C2899;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2864;
import com.alibaba.fastjson2.util.C2833;
import com.alibaba.fastjson2.util.C2835;
import com.alibaba.fastjson2.util.C2851;
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
import p279.InterfaceC8366;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2761 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final long f8408;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final long f8409;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean f8410;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final JSONSchema f8411;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Locale f8412;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Object f8413;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public volatile InterfaceC2787 f8414;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public Type f8415;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final boolean f8416;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean f8417;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public volatile AbstractC2921 f8418;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public volatile InterfaceC2787 f8419;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f8420;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Type f8421;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Field f8422;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final long f8423;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f8424;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Method f8425;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f8426;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Class f8427;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f8428;

    public AbstractC2761(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field) {
        Class<?> enclosingClass;
        this.f8426 = str;
        this.f8421 = type;
        this.f8427 = cls;
        boolean zEquals = false;
        this.f8410 = cls != null && (Serializable.class.isAssignableFrom(cls) || Modifier.isInterface(cls.getModifiers()) || AbstractC2864.m5745(cls) || cls.isPrimitive());
        this.f8420 = j;
        this.f8409 = AbstractC2859.m5729(str);
        this.f8408 = AbstractC2859.m5728(str);
        this.f8428 = i;
        this.f8424 = str2;
        this.f8412 = locale;
        this.f8413 = obj;
        this.f8411 = jSONSchema;
        this.f8425 = method;
        this.f8422 = field;
        this.f8416 = (method != null && method.getParameterCount() == 0) || (field != null && Modifier.isFinal(field.getModifiers()));
        long jObjectFieldOffset = (field == null || (j & 36028797018963968L) != 0) ? -1L : AbstractC2853.f8919.objectFieldOffset(field);
        this.f8423 = jObjectFieldOffset;
        if (jObjectFieldOffset == -1 && field != null && method == null) {
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
                AbstractC2853.f8909.incrementAndGet();
            }
        }
        Class<?> declaringClass = method != null ? method.getDeclaringClass() : field != null ? field.getDeclaringClass() : null;
        Type[] typeArr = AbstractC2864.f9015;
        if (cls != null && !cls.isPrimitive() && cls != String.class && cls != List.class && (enclosingClass = cls.getEnclosingClass()) != null && (declaringClass == null || declaringClass.equals(enclosingClass))) {
            ConcurrentHashMap concurrentHashMap = AbstractC2864.f9010;
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
        this.f8417 = zEquals;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m5525(AbstractC2761 abstractC2761) {
        String name = abstractC2761.f8425.getName();
        return abstractC2761.mo5440() ? AbstractC2864.m5760(name, PropertyNamingStrategy.CamelCase.name()) : AbstractC2864.m5742(name, PropertyNamingStrategy.CamelCase.name());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InterfaceC2787 m5526(Type type, Class cls, String str, Locale locale) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String typeName = type.getTypeName();
        typeName.getClass();
        switch (typeName) {
            case "byte[]":
            case "[B":
                return new C2711(str);
            case "java.sql.Date":
                return new C2851(str, locale);
            case "java.sql.Time":
                return new C2835(str, locale);
            case "java.sql.Timestamp":
                return new C2833(str, locale);
            default:
                if (Calendar.class.isAssignableFrom(cls)) {
                    return new C2723(str, locale);
                }
                if (cls == ZonedDateTime.class) {
                    return new C2792(str, locale);
                }
                if (cls == LocalDateTime.class) {
                    return new C2695(str, locale);
                }
                if (cls == LocalDate.class) {
                    return new C2694(str, locale);
                }
                if (cls == LocalTime.class) {
                    return new C2716(str, locale);
                }
                if (cls == Instant.class) {
                    return new C2724(str, locale);
                }
                if (cls == OffsetTime.class) {
                    return new C2701(str, locale);
                }
                if (cls == OffsetDateTime.class) {
                    return new C2700(str, locale);
                }
                if (cls == Optional.class) {
                    return new C2705(type, str, locale);
                }
                if (cls == Date.class) {
                    return new C2740(str, locale);
                }
                return null;
        }
    }

    public final String toString() {
        Member member = this.f8425;
        if (member == null) {
            member = this.f8422;
        }
        return member != null ? member.getName() : this.f8426;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo5425(Class cls) {
        return this.f8427 == cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m5527(AbstractC2898 abstractC2898, Object obj, String str) {
        AbstractC2921 abstractC2921M6320;
        if (this.f8418 == null || !this.f8418.f9261.equals(str)) {
            abstractC2921M6320 = AbstractC2921.m6320(str);
            this.f8418 = abstractC2921M6320;
        } else {
            abstractC2921M6320 = this.f8418;
        }
        if (abstractC2898.f9198 == null) {
            abstractC2898.f9198 = new ArrayList();
        }
        abstractC2898.f9198.add(new C2899(this, obj, this.f8426, abstractC2921M6320));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5528(Object obj) {
        Object obj2 = this.f8413;
        if (obj2 != null) {
            mo5426(obj, obj2);
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
    public void mo5437(long r14, java.lang.Object r16, java.lang.Object r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.AbstractC2761.mo5437(long, java.lang.Object, java.lang.Object):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo5426(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract void mo5435(Object obj, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo5439(AbstractC2898 abstractC2898, Object obj) {
        abstractC2898.mo6188();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo5440() {
        return this.f8416;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract void mo5427(AbstractC2898 abstractC2898, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo5436(AbstractC2898 abstractC2898, Object obj) {
        mo5427(abstractC2898, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract Object mo5428(AbstractC2898 abstractC2898);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public InterfaceC2787 mo5449() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public BiConsumer mo5429() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public InterfaceC2787 mo5450(AbstractC2898 abstractC2898) {
        if (this.f8419 != null) {
            return this.f8419;
        }
        InterfaceC2787 interfaceC2787M6056 = abstractC2898.m6056(this.f8421);
        this.f8419 = interfaceC2787M6056;
        return interfaceC2787M6056;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2787 m5529(C2801 c2801) {
        if (this.f8419 != null) {
            return this.f8419;
        }
        InterfaceC2787 interfaceC2787M5588 = c2801.m5588(this.f8421, (this.f8420 & JSONReader$Feature.FieldBased.mask) != 0);
        this.f8419 = interfaceC2787M5588;
        return interfaceC2787M5588;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC2787 m5530(C2942 c2942) {
        if (this.f8414 != null) {
            return this.f8414;
        }
        InterfaceC2787 interfaceC2787M6353 = c2942.m6353(this.f8415);
        this.f8414 = interfaceC2787M6353;
        return interfaceC2787M6353;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC2787 mo5451(C2942 c2942) {
        if (this.f8419 != null) {
            return this.f8419;
        }
        InterfaceC2787 interfaceC2787M6353 = c2942.m6353(this.f8421);
        this.f8419 = interfaceC2787M6353;
        return interfaceC2787M6353;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC2761 abstractC2761) {
        Class<?> superclass;
        Class<?> superclass2;
        Class<?> type;
        Class<?> declaringClass;
        Class<?> declaringClass2;
        String str = abstractC2761.f8426;
        Field field = abstractC2761.f8422;
        Method method = abstractC2761.f8425;
        String str2 = this.f8426;
        int iCompareTo = str2.compareTo(str);
        if (iCompareTo != 0) {
            int i = abstractC2761.f8428;
            int i2 = this.f8428;
            if (i2 >= i) {
                if (i2 > i) {
                    return 1;
                }
                return iCompareTo;
            }
            return -1;
        }
        int i3 = mo5440() == abstractC2761.mo5440() ? 0 : mo5440() ? 1 : -1;
        if (i3 == 0) {
            Field field2 = this.f8422;
            Method method2 = this.f8425;
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
                                    InterfaceC8366 interfaceC8366 = (InterfaceC8366) AbstractC2864.m5773(method2, InterfaceC8366.class);
                                    InterfaceC8366 interfaceC83662 = (InterfaceC8366) AbstractC2864.m5773(method, InterfaceC8366.class);
                                    boolean z = interfaceC8366 != null;
                                    if (z == (interfaceC83662 == null)) {
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
                    String strM5742 = AbstractC2864.m5742(name, null);
                    String strM57422 = AbstractC2864.m5742(name2, null);
                    boolean zEquals = str2.equals(strM5742);
                    if (zEquals != abstractC2761.f8426.equals(strM57422)) {
                        return zEquals ? 1 : -1;
                    }
                }
            }
            InterfaceC2787 interfaceC2787Mo5449 = mo5449();
            InterfaceC2787 interfaceC2787Mo54492 = abstractC2761.mo5449();
            if (interfaceC2787Mo5449 == null || interfaceC2787Mo54492 != null) {
                if (interfaceC2787Mo5449 != null || interfaceC2787Mo54492 == null) {
                    Class cls = abstractC2761.f8427;
                    Class cls2 = this.f8427;
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
    public void mo5438(Object obj, String str, Object obj2) {
    }
}
