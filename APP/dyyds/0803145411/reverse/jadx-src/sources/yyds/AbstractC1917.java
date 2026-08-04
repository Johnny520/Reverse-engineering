package yyds;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.Button;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: yyds.ᲀᛱᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1917 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final Type[] f9668 = new Type[0];

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static String m3691(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[3] = cCharAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static void m3692(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            C0188.m798("Primitive type is not allowed");
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static Type m3693(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m3693(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m3693(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static C2534 m3694(String str) {
        if (str.length() % 2 != 0) {
            C0188.m806("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (AbstractC1579.m3239(str.charAt(i2 + 1)) + (AbstractC1579.m3239(str.charAt(i2)) << 4));
        }
        return new C2534(bArr);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static C0658 m3695(C0658 c0658) {
        C0728 c0728 = c0658.f3148;
        c0728.m1672();
        c0728.f3401 = true;
        if (c0728.f3403 <= 0) {
            C0728 c07282 = C0728.f3395;
        }
        return c0728.f3403 > 0 ? c0658 : C0658.f3147;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2454 m3696(InterfaceC2213 interfaceC2213) {
        if (interfaceC2213.mo423(C1586.f8041) == null) {
            interfaceC2213 = interfaceC2213.mo422(AbstractC0024.m3297());
        }
        return new C2454(interfaceC2213);
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static final void m3697(C0172 c0172, C2673 c2673, C0299 c0299, C1417 c1417, C2235 c2235) {
        int iNextInt;
        int i;
        String str;
        c0172.f997 = c2235;
        List list = c2235.f11036;
        boolean z = c2235.f11037;
        LinkedHashMap linkedHashMap = c2673.f13118;
        AbstractC2328.m4341(-122015298782062L);
        ArrayList arrayList = c2673.f13120;
        ArrayList arrayList2 = new ArrayList(AbstractC0055.m419(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C2673.m4765((Aweme) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0055.m419(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(C2673.m4765((Aweme) it2.next()));
        }
        if (arrayList2.equals(arrayList3)) {
            C2807 c2807M4849 = AbstractC2725.m4849(arrayList);
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = c2807M4849.iterator();
            while (true) {
                C1953 c1953 = (C1953) it3;
                if (!c1953.f9807) {
                    break;
                }
                Object next = c1953.next();
                int iIntValue = ((Number) next).intValue();
                if (arrayList.get(iIntValue) != list.get(iIntValue)) {
                    arrayList4.add(next);
                }
            }
            if (!arrayList4.isEmpty()) {
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    int iIntValue2 = ((Number) it4.next()).intValue();
                    arrayList.set(iIntValue2, list.get(iIntValue2));
                    linkedHashMap.remove(arrayList3.get(iIntValue2));
                }
                c2673.m4768(arrayList.size(), arrayList4);
                c2673.m4767();
            }
        } else {
            int size = arrayList.size();
            if (list.size() > size) {
                Iterable iterableM4849 = AbstractC2725.m4849(arrayList2);
                if (!(iterableM4849 instanceof Collection) || !((Collection) iterableM4849).isEmpty()) {
                    Iterator it5 = iterableM4849.iterator();
                    do {
                        C1953 c19532 = (C1953) it5;
                        if (c19532.f9807) {
                            iNextInt = c19532.nextInt();
                        }
                    } while (AbstractC1544.m3188(arrayList2.get(iNextInt), arrayList3.get(iNextInt)));
                    arrayList.clear();
                    arrayList.addAll(list);
                    HashSet hashSet = new HashSet(AbstractC2366.m4382(AbstractC0055.m419(arrayList3, 12)));
                    AbstractC1595.m3283(arrayList3, hashSet);
                    c2673.f13121.retainAll(hashSet);
                    linkedHashMap.clear();
                    c2673.m1058();
                    c2673.m4767();
                }
                C2807 c2807M48492 = AbstractC2725.m4849(arrayList2);
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = c2807M48492.iterator();
                while (true) {
                    C1953 c19533 = (C1953) it6;
                    if (!c19533.f9807) {
                        break;
                    }
                    Object next2 = c19533.next();
                    int iIntValue3 = ((Number) next2).intValue();
                    if (arrayList.get(iIntValue3) != list.get(iIntValue3)) {
                        arrayList5.add(next2);
                    }
                }
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    int iIntValue4 = ((Number) it7.next()).intValue();
                    arrayList.set(iIntValue4, list.get(iIntValue4));
                    linkedHashMap.remove(arrayList2.get(iIntValue4));
                }
                c2673.m4768(size, arrayList5);
                arrayList.addAll(list.subList(size, list.size()));
                c2673.f1869.m1870(size, list.size() - size);
                c2673.m4767();
            } else {
                arrayList.clear();
                arrayList.addAll(list);
                HashSet hashSet2 = new HashSet(AbstractC2366.m4382(AbstractC0055.m419(arrayList3, 12)));
                AbstractC1595.m3283(arrayList3, hashSet2);
                c2673.f13121.retainAll(hashSet2);
                linkedHashMap.clear();
                c2673.m1058();
                c2673.m4767();
            }
        }
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it8 = arrayList.iterator();
            i = 0;
            while (it8.hasNext()) {
                if (c2673.m4766((Aweme) it8.next()) && (i = i + 1) < 0) {
                    AbstractC2725.m4851();
                    throw null;
                }
            }
        }
        TextView textView = (TextView) c0299.f1574;
        Button button = (Button) c0299.f1573;
        if (c1417.f6702) {
            str = AbstractC2328.m4341(-199887350825838L) + list.size() + AbstractC2328.m4341(-199938890433390L);
        } else if (z) {
            str = AbstractC2328.m4341(-199960365269870L) + list.size() + AbstractC2328.m4341(-199981840106350L) + i + AbstractC2328.m4341(-199999019975534L);
        } else {
            str = AbstractC2328.m4341(-200054854550382L) + list.size() + AbstractC2328.m4341(-200067739452270L) + i + AbstractC2328.m4341(-200084919321454L);
        }
        textView.setText(str);
        button.setVisibility(z ? 0 : 8);
        button.setEnabled(!c1417.f6702);
        button.setText(AbstractC2328.m4341(c1417.f6702 ? -200149343830894L : -200170818667374L));
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static Class m3698(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m3698(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m3698(((WildcardType) type).getUpperBounds()[0]);
        }
        C0188.m792("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static C0680[] m3699(int i) {
        C0680[] c0680Arr = new C0680[i];
        for (int i2 = 0; i2 < i; i2++) {
            c0680Arr[i2] = new C0680();
        }
        return c0680Arr;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2454 m3700() {
        C2326 c2326M3466 = AbstractC1741.m3466();
        C1206 c1206 = AbstractC0221.f1238;
        return new C2454(AbstractC0879.m1960(c2326M3466, AbstractC1353.f6250));
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static boolean m3701(Context context, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((AbstractC0333) it.next()).mo1020(context, true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static Type m3702(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0600(m3702(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C1747(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C0600(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C0559(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static String m3703(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static final Object m3704(C1612 c1612, C1612 c16122, InterfaceC0477 interfaceC0477) throws Throwable {
        Object c0417;
        Object objM2161;
        try {
            AbstractC0395.m1136(interfaceC0477);
            c0417 = interfaceC0477.mo511(c16122, c1612);
        } catch (Throwable th) {
            c0417 = new C0417(th, false);
        }
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (c0417 == enumC1765 || (objM2161 = c1612.m2161(c0417)) == AbstractC0395.f2035) {
            return enumC1765;
        }
        if (objM2161 instanceof C0417) {
            throw ((C0417) objM2161).f2152;
        }
        return AbstractC0395.m1137(objM2161);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static C2534 m3705(String str) {
        C2534 c2534 = new C2534(str.getBytes(AbstractC0347.f1806));
        c2534.f12476 = str;
        return c2534;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static boolean m3706(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m3706(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static int m3707(int i, float f) {
        return (int) ((i * f) + 0.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141 A[EDGE_INSN: B:86:0x0141->B:80:0x0141 BREAK  A[LOOP:0: B:3:0x0002->B:89:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[LOOP:0: B:3:0x0002->B:89:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [yyds.ᛳᛳᲀᲇ] */
    /* JADX WARN: Type inference failed for: r12v4, types: [yyds.ᛳᛳᲀᲇ] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type m3708(Type type, Class cls, Type type2, HashMap map) {
        Type typeM3708;
        Type c1747;
        TypeVariable typeVariable = null;
        while (true) {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = (TypeVariable) type2;
                Type type3 = (Type) map.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                map.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls3 == null) {
                    type2 = typeVariable2;
                    if (type2 != typeVariable2) {
                        break;
                    }
                } else {
                    Type typeM3693 = m3693(type, cls, cls3);
                    if (typeM3693 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable2.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) typeM3693).getActualTypeArguments()[i];
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                    if (type2 != typeVariable2) {
                    }
                }
            } else if (type2 instanceof Class) {
                Class cls4 = (Class) type2;
                if (cls4.isArray()) {
                    Class<?> componentType = cls4.getComponentType();
                    Type typeM37082 = m3708(type, cls, componentType, map);
                    if (Objects.equals(componentType, typeM37082)) {
                        type2 = cls4;
                    } else {
                        c1747 = new C0600(typeM37082);
                        type2 = c1747;
                    }
                } else if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type typeM37083 = m3708(type, cls, genericComponentType, map);
                    if (!Objects.equals(genericComponentType, typeM37083)) {
                        c1747 = new C0600(typeM37083);
                        type2 = c1747;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type typeM37084 = m3708(type, cls, ownerType, map);
                    boolean zEquals = Objects.equals(typeM37084, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    Type[] typeArr = actualTypeArguments;
                    boolean z = false;
                    while (i < length2) {
                        Type typeM37085 = m3708(type, cls, typeArr[i], map);
                        if (!Objects.equals(typeM37085, typeArr[i])) {
                            if (!z) {
                                typeArr = (Type[]) typeArr.clone();
                                z = true;
                            }
                            typeArr[i] = typeM37085;
                        }
                        i++;
                    }
                    if (!zEquals || z) {
                        c1747 = new C1747(typeM37084, (Class) type2.getRawType(), typeArr);
                        type2 = c1747;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeM37086 = m3708(type, cls, lowerBounds[0], map);
                        if (typeM37086 != lowerBounds[0]) {
                            type2 = new C0559(new Type[]{Object.class}, typeM37086 instanceof WildcardType ? ((WildcardType) typeM37086).getLowerBounds() : new Type[]{typeM37086});
                        }
                    } else if (upperBounds.length == 1 && (typeM3708 = m3708(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                        type2 = new C0559(typeM3708 instanceof WildcardType ? ((WildcardType) typeM3708).getUpperBounds() : new Type[]{typeM3708}, f9668);
                    }
                }
            }
        }
        if (typeVariable != null) {
            map.put(typeVariable, type2);
        }
        return type2;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static TextView m3709(Context context, String str, int i, float f, InterfaceC2266 interfaceC2266) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setGravity(17);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setTextColor(i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(419310677);
        gradientDrawable.setStroke(m3707(1, f), 1727933525);
        gradientDrawable.setCornerRadius(m3707(12, f));
        textView.setBackground(gradientDrawable);
        textView.setOnClickListener(new ViewOnClickListenerC1456(0, interfaceC2266));
        return textView;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static Type m3710(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return m3708(type, cls, m3693(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static void m3711(C2454 c2454) {
        InterfaceC2798 interfaceC2798 = (InterfaceC2798) c2454.f12093.mo423(C1586.f8041);
        if (interfaceC2798 != null) {
            interfaceC2798.mo2093(null);
        } else {
            C0188.m791(c2454, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m3712(C1399 c1399, C1308 c1308) {
        int i = c1308.f5986;
        if (i == 12) {
            i = 10;
        }
        switch (i) {
            case 1:
                c1399.m2829(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                break;
            case 2:
                c1399.m2829(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
                break;
            case 3:
                c1399.m2829(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
                break;
            case 4:
                c1399.m2829(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
                break;
            case 5:
                c1399.m2829(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
                break;
            case 6:
                c1399.m2829(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
                break;
            case 7:
                c1399.m2829(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
                break;
            case 8:
                c1399.m2829(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
                break;
        }
    }
}
