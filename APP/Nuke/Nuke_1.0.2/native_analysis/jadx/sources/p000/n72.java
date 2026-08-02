package p000;

import java.lang.reflect.Field;
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
import java.util.Locale;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n72 implements r43 {

    /* JADX INFO: renamed from: h */
    public final sz0 f7035h;

    /* JADX INFO: renamed from: i */
    public final int f7036i;

    /* JADX INFO: renamed from: j */
    public final ah0 f7037j;

    /* JADX INFO: renamed from: k */
    public final x21 f7038k;

    /* JADX INFO: renamed from: l */
    public final List f7039l;

    public n72(sz0 sz0Var, int i, ah0 ah0Var, x21 x21Var, List list) {
        this.f7035h = sz0Var;
        this.f7036i = i;
        this.f7037j = ah0Var;
        this.f7038k = x21Var;
        this.f7039l = list;
    }

    /* JADX INFO: renamed from: b */
    public static void m3256b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + h72.m2118c(field) + " and " + h72.m2118c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // p000.r43
    /* JADX INFO: renamed from: a */
    public final q43 mo162a(ir0 ir0Var, j63 j63Var) {
        Class cls = j63Var.f4904a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        tp0 tp0Var = h72.f3884a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new fr0(2);
        }
        sp0.m4906B(this.f7039l);
        return h72.f3884a.mo1549A(cls) ? new m72(cls, m3257c(ir0Var, j63Var, cls, true)) : new k72(this.f7035h.m5031D(j63Var, true), m3257c(ir0Var, j63Var, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c5  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r29v0, types: [n72] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l72 m3257c(ir0 ir0Var, j63 j63Var, Class cls, boolean z) {
        ?? r26;
        ?? r262;
        Method method;
        fp2 fp2Var;
        List listAsList;
        String name;
        boolean z2;
        ?? SingletonList;
        v21 v21Var;
        ir0 ir0Var2;
        boolean z3;
        Field field;
        ?? r27;
        q43 q43VarM2386c;
        i72 i72Var;
        if (cls.isInterface()) {
            return l72.f5972c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        j63 j63Var2 = j63Var;
        Class cls2 = cls;
        while (true) {
            Type type = j63Var2.f4905b;
            if (cls2 == Object.class) {
                return new l72(new ArrayList(linkedHashMap2.values()), linkedHashMap);
            }
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                sp0.m4906B(this.f7039l);
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i = 0;
            while (i < length) {
                Field field2 = declaredFields[i];
                boolean zM3258d = m3258d(field2, true);
                boolean zM3258d2 = m3258d(field2, r14);
                if (zM3258d || zM3258d2) {
                    if (!z) {
                        r26 = zM3258d2;
                    } else if (Modifier.isStatic(field2.getModifiers())) {
                        r26 = r14;
                    } else {
                        Method methodMo1550u = h72.f3884a.mo1550u(cls2, field2);
                        h72.m2121f(methodMo1550u);
                        if (methodMo1550u.getAnnotation(fp2.class) != null && field2.getAnnotation(fp2.class) == null) {
                            throw new t31(vi0.m5691j("@SerializedName on ", h72.m2119d(methodMo1550u, r14), " is not supported"));
                        }
                        r262 = zM3258d2;
                        method = methodMo1550u;
                        if (method == null) {
                            h72.m2121f(field2);
                        }
                        Type typeM5290S = AbstractC0738tl.m5290S(type, cls2, field2.getGenericType(), new HashMap());
                        fp2Var = (fp2) field2.getAnnotation(fp2.class);
                        if (fp2Var != null) {
                            switch (this.f7036i) {
                                case 1:
                                    name = field2.getName();
                                    break;
                                case 2:
                                    name = vi0.m5683b(field2.getName());
                                    break;
                                case 3:
                                    name = vi0.m5683b(vi0.m5682a(field2.getName(), ' '));
                                    break;
                                case 4:
                                    name = vi0.m5682a(field2.getName(), '_').toUpperCase(Locale.ENGLISH);
                                    break;
                                case 5:
                                    name = vi0.m5682a(field2.getName(), '_').toLowerCase(Locale.ENGLISH);
                                    break;
                                case AIChatConfig.DefaultContextRounds /* 6 */:
                                    name = vi0.m5682a(field2.getName(), '-').toLowerCase(Locale.ENGLISH);
                                    break;
                                default:
                                    name = vi0.m5682a(field2.getName(), '.').toLowerCase(Locale.ENGLISH);
                                    break;
                            }
                            listAsList = Collections.EMPTY_LIST;
                        } else {
                            String strValue = fp2Var.value();
                            listAsList = Arrays.asList(fp2Var.alternate());
                            name = strValue;
                        }
                        if (listAsList.isEmpty()) {
                            z2 = true;
                            ArrayList arrayList = new ArrayList(listAsList.size() + 1);
                            arrayList.add(name);
                            arrayList.addAll(listAsList);
                            SingletonList = arrayList;
                        } else {
                            z2 = true;
                            SingletonList = Collections.singletonList(name);
                        }
                        String str = (String) SingletonList.get(r14);
                        j63 j63Var3 = new j63(typeM5290S);
                        Class cls3 = j63Var3.f4904a;
                        ?? r22 = (cls3 == null && cls3.isPrimitive()) ? z2 : r14;
                        int modifiers = field2.getModifiers();
                        ?? r23 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? r14 : z2;
                        v21Var = (v21) field2.getAnnotation(v21.class);
                        if (v21Var == null) {
                            field = field2;
                            z3 = z2;
                            r27 = SingletonList;
                            ir0Var2 = ir0Var;
                            q43VarM2386c = this.f7038k.m6024b(this.f7035h, ir0Var2, j63Var3, v21Var, false);
                        } else {
                            ir0Var2 = ir0Var;
                            z3 = z2;
                            field = field2;
                            r27 = SingletonList;
                            q43VarM2386c = null;
                        }
                        ?? r2 = q43VarM2386c == null ? z3 : r14;
                        if (q43VarM2386c == null) {
                            q43VarM2386c = ir0Var2.m2386c(j63Var3);
                        }
                        i72 i72Var2 = new i72(str, field, method, zM3258d ? q43VarM2386c : r2 != 0 ? q43VarM2386c : new ue1(ir0Var2, q43VarM2386c, j63Var3.f4905b), q43VarM2386c, r22, r23);
                        Field field3 = field;
                        if (r262 != 0) {
                            for (String str2 : r27) {
                                i72 i72Var3 = (i72) linkedHashMap.put(str2, i72Var2);
                                if (i72Var3 != null) {
                                    m3256b(cls, str2, i72Var3.f4472b, field3);
                                    throw null;
                                }
                            }
                        }
                        if (zM3258d && (i72Var = (i72) linkedHashMap2.put(str, i72Var2)) != null) {
                            m3256b(cls, str, i72Var.f4472b, field3);
                            throw null;
                        }
                    }
                    method = null;
                    r262 = r26;
                    if (method == null) {
                    }
                    Type typeM5290S2 = AbstractC0738tl.m5290S(type, cls2, field2.getGenericType(), new HashMap());
                    fp2Var = (fp2) field2.getAnnotation(fp2.class);
                    if (fp2Var != null) {
                    }
                    if (listAsList.isEmpty()) {
                    }
                    String str3 = (String) SingletonList.get(r14);
                    j63 j63Var32 = new j63(typeM5290S2);
                    Class cls32 = j63Var32.f4904a;
                    if (cls32 == null) {
                        int modifiers2 = field2.getModifiers();
                        if (Modifier.isStatic(modifiers2)) {
                            v21Var = (v21) field2.getAnnotation(v21.class);
                            if (v21Var == null) {
                            }
                            if (q43VarM2386c == null) {
                            }
                            if (q43VarM2386c == null) {
                            }
                            if (zM3258d) {
                            }
                            i72 i72Var22 = new i72(str3, field, method, zM3258d ? q43VarM2386c : r2 != 0 ? q43VarM2386c : new ue1(ir0Var2, q43VarM2386c, j63Var32.f4905b), q43VarM2386c, r22, r23);
                            Field field32 = field;
                            if (r262 != 0) {
                            }
                            if (zM3258d) {
                                continue;
                            }
                        }
                    }
                }
                i++;
                r14 = 0;
            }
            j63 j63Var4 = new j63(AbstractC0738tl.m5290S(type, cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = j63Var4.f4904a;
            j63Var2 = j63Var4;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3258d(Field field, boolean z) {
        boolean z2;
        ah0 ah0Var = this.f7037j;
        ah0Var.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || ah0Var.m169d(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? ah0Var.f200h : ah0Var.f201i;
            z2 = false;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    c80.m664g();
                    return false;
                }
            }
        }
        return !z2;
    }
}
