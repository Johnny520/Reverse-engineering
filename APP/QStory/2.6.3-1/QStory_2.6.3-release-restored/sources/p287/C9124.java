package p287;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import com.google.gson.AbstractC4083;
import com.google.gson.C4076;
import com.google.gson.C4085;
import com.google.gson.InterfaceC4078;
import com.google.gson.InterfaceC4081;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter$FilterResult;
import com.google.gson.internal.AbstractC4053;
import com.google.gson.internal.AbstractC4065;
import com.google.gson.internal.C4054;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p191.AbstractC8568;
import p248.C8894;
import p276.C9075;
import p283.InterfaceC9094;
import p283.InterfaceC9095;
import p285.AbstractC9097;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9124 implements InterfaceC4081 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List f23250;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C9153 f23251;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4078 f23252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4054 f23253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8894 f23254;

    public C9124(C8894 c8894, InterfaceC4078 interfaceC4078, C4054 c4054, C9153 c9153, List list) {
        this.f23254 = c8894;
        this.f23252 = interfaceC4078;
        this.f23253 = c4054;
        this.f23251 = c9153;
        this.f23250 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14397(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC9097.m14393(field) + " and " + AbstractC9097.m14393(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14398(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!AbstractC4065.f11236.mo7884(obj, accessibleObject)) {
            throw new JsonIOException(AbstractC9097.m14392(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m14399(Field field, boolean z) {
        boolean z2;
        C4054 c4054 = this.f23253;
        c4054.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || c4054.m7879(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? c4054.f11219 : c4054.f11218;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw AbstractC3275.m5138(it);
                }
            }
            z2 = false;
        }
        return !z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C9141 m14400(C4085 c4085, C9075 c9075, Class cls, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        Method method;
        InterfaceC9094 interfaceC9094;
        String strValue;
        List listAsList;
        boolean z5;
        List<String> listSingletonList;
        InterfaceC9095 interfaceC9095;
        C4085 c40852;
        int i;
        Field field;
        AbstractC4083 abstractC4083M7899;
        int i2;
        C9142 c9142;
        if (cls.isInterface()) {
            return C9141.f23272;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C9075 c90752 = c9075;
        boolean z6 = z;
        Class cls2 = cls;
        while (true) {
            Type type = c90752.f23159;
            if (cls2 == Object.class) {
                return new C9141(linkedHashMap, new ArrayList(linkedHashMap2.values()));
            }
            Field[] declaredFields = cls2.getDeclaredFields();
            boolean z7 = true;
            if (cls2 == cls || declaredFields.length <= 0) {
                z3 = z6;
            } else {
                ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResultM7867 = AbstractC4053.m7867(this.f23250);
                if (reflectionAccessFilter$FilterResultM7867 == ReflectionAccessFilter$FilterResult.BLOCK_ALL) {
                    throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls2 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z3 = reflectionAccessFilter$FilterResultM7867 == ReflectionAccessFilter$FilterResult.BLOCK_INACCESSIBLE;
            }
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                Field field2 = declaredFields[i3];
                boolean zM14399 = m14399(field2, z7);
                boolean zM143992 = m14399(field2, false);
                if (zM14399 || zM143992) {
                    if (!z2) {
                        z4 = zM143992;
                    } else if (Modifier.isStatic(field2.getModifiers())) {
                        z4 = false;
                    } else {
                        Method methodMo13650 = AbstractC9097.f23229.mo13650(cls2, field2);
                        if (!z3) {
                            AbstractC9097.m14390(methodMo13650);
                        }
                        if (methodMo13650.getAnnotation(InterfaceC9094.class) != null && field2.getAnnotation(InterfaceC9094.class) == null) {
                            throw new JsonIOException(AbstractC0900.m718("@SerializedName on ", AbstractC9097.m14392(methodMo13650, false), " is not supported"));
                        }
                        z4 = zM143992;
                        method = methodMo13650;
                        if (!z3 && method == null) {
                            AbstractC9097.m14390(field2);
                        }
                        Type typeM7878 = AbstractC4053.m7878(type, cls2, field2.getGenericType(), new HashMap());
                        interfaceC9094 = (InterfaceC9094) field2.getAnnotation(InterfaceC9094.class);
                        if (interfaceC9094 != null) {
                            InterfaceC4078 interfaceC4078 = this.f23252;
                            strValue = interfaceC4078.translateName(field2);
                            listAsList = interfaceC4078.alternateNames(field2);
                        } else {
                            strValue = interfaceC9094.value();
                            listAsList = Arrays.asList(interfaceC9094.alternate());
                        }
                        if (listAsList.isEmpty()) {
                            z5 = z7;
                            ArrayList arrayList = new ArrayList(listAsList.size() + 1);
                            arrayList.add(strValue);
                            arrayList.addAll(listAsList);
                            listSingletonList = arrayList;
                        } else {
                            z5 = z7;
                            listSingletonList = Collections.singletonList(strValue);
                        }
                        String str = (String) listSingletonList.get(0);
                        C9075 c90753 = new C9075(typeM7878);
                        Class cls3 = c90753.f23160;
                        boolean z8 = (cls3 == null && cls3.isPrimitive()) ? z5 : false;
                        int modifiers = field2.getModifiers();
                        boolean z9 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? false : z5;
                        interfaceC9095 = (InterfaceC9095) field2.getAnnotation(InterfaceC9095.class);
                        if (interfaceC9095 == null) {
                            field = field2;
                            i = i3;
                            c40852 = c4085;
                            abstractC4083M7899 = this.f23251.m14410(this.f23254, c40852, c90753, interfaceC9095, false);
                        } else {
                            c40852 = c4085;
                            i = i3;
                            field = field2;
                            abstractC4083M7899 = null;
                        }
                        boolean z10 = abstractC4083M7899 == null ? z5 : false;
                        if (abstractC4083M7899 == null) {
                            abstractC4083M7899 = c40852.m7899(c90753);
                        }
                        AbstractC4083 c9148 = zM14399 ? abstractC4083M7899 : z10 ? abstractC4083M7899 : new C9148(c40852, abstractC4083M7899, c90753.f23159);
                        i2 = length;
                        C9142 c91422 = new C9142(str, field, z3, method, c9148, abstractC4083M7899, z8, z9);
                        Field field3 = field;
                        if (z4) {
                            for (String str2 : listSingletonList) {
                                C9142 c91423 = (C9142) linkedHashMap.put(str2, c91422);
                                if (c91423 != null) {
                                    m14397(cls, str2, c91423.f23279, field3);
                                    throw null;
                                }
                            }
                        }
                        if (zM14399 && (c9142 = (C9142) linkedHashMap2.put(str, c91422)) != null) {
                            m14397(cls, str, c9142.f23279, field3);
                            throw null;
                        }
                    }
                    method = null;
                    if (!z3) {
                        AbstractC9097.m14390(field2);
                    }
                    Type typeM78782 = AbstractC4053.m7878(type, cls2, field2.getGenericType(), new HashMap());
                    interfaceC9094 = (InterfaceC9094) field2.getAnnotation(InterfaceC9094.class);
                    if (interfaceC9094 != null) {
                    }
                    if (listAsList.isEmpty()) {
                    }
                    String str3 = (String) listSingletonList.get(0);
                    C9075 c907532 = new C9075(typeM78782);
                    Class cls32 = c907532.f23160;
                    if (cls32 == null) {
                        int modifiers2 = field2.getModifiers();
                        if (Modifier.isStatic(modifiers2)) {
                            interfaceC9095 = (InterfaceC9095) field2.getAnnotation(InterfaceC9095.class);
                            if (interfaceC9095 == null) {
                            }
                            if (abstractC4083M7899 == null) {
                            }
                            if (abstractC4083M7899 == null) {
                            }
                            if (zM14399) {
                            }
                            i2 = length;
                            C9142 c914222 = new C9142(str3, field, z3, method, c9148, abstractC4083M7899, z8, z9);
                            Field field32 = field;
                            if (z4) {
                            }
                            if (zM14399) {
                                continue;
                            }
                        }
                    }
                } else {
                    i = i3;
                    z5 = z7;
                    i2 = length;
                }
                i3 = i + 1;
                z7 = z5;
                length = i2;
            }
            C9075 c90754 = new C9075(AbstractC4053.m7878(type, cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = c90754.f23160;
            c90752 = c90754;
            z6 = z3;
        }
    }

    @Override // com.google.gson.InterfaceC4081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4083 mo7880(C4085 c4085, C9075 c9075) {
        Class cls = c9075.f23160;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC8568 abstractC8568 = AbstractC9097.f23229;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C4076(2);
        }
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResultM7867 = AbstractC4053.m7867(this.f23250);
        if (reflectionAccessFilter$FilterResultM7867 != ReflectionAccessFilter$FilterResult.BLOCK_ALL) {
            boolean z = reflectionAccessFilter$FilterResultM7867 == ReflectionAccessFilter$FilterResult.BLOCK_INACCESSIBLE;
            return AbstractC9097.f23229.mo13648(cls) ? new C9125(cls, m14400(c4085, c9075, cls, z, true), z) : new C9140(this.f23254.m14108(c9075, true), m14400(c4085, c9075, cls, z, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
