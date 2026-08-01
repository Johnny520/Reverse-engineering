package p001A0;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import dalvik.system.DexFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.luckypray.dexkit.DexKitBridge;
import p009E0.AbstractC0105e;
import p009E0.C0103c;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0129q;
import p011F0.AbstractC0134v;
import p011F0.C0131s;
import p011F0.C0132t;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0306p;
import p040U0.AbstractC0307q;
import p043W0.C0353a;
import p047Z0.C0361a;
import p047Z0.C0362b;
import p052b1.AbstractC0503h;
import p052b1.C0499d;
import p052b1.C0500e;
import p052b1.C0505j;
import p052b1.C0506k;
import p052b1.C0507l;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1135r;

/* JADX INFO: renamed from: A0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0034g {

    /* JADX INFO: renamed from: a */
    public static final String[] f227a = {"com.tencent.mm", "va5", "kc5", "sd5", "yf5"};

    /* JADX INFO: renamed from: b */
    public static final String[] f228b = {"fh5"};

    /* JADX INFO: renamed from: c */
    public static final String[] f229c = {"va5.", "kc5.", "sd5.", "yf5."};

    /* JADX INFO: renamed from: d */
    public static final String[] f230d = {"fh5."};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x007d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: A */
    public static List m10A(DexKitBridge dexKitBridge, List list, Set set) {
        ?? c0104d;
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        try {
            C0353a c0353a = new C0353a(1);
            C0362b c0362b = new C0362b();
            C0362b.m623e0(c0362b, list);
            c0353a.f828f = c0362b;
            C0506k c0506kM1442e = dexKitBridge.m1442e(c0353a);
            c0104d = new ArrayList();
            Iterator it = c0506kM1442e.iterator();
            while (it.hasNext()) {
                List<C0507l> list2 = (List) ((C0505j) it.next()).f1614e.m247a();
                ArrayList arrayList = new ArrayList();
                for (C0507l c0507l : list2) {
                    String str = c0507l.f1615a.m964b().f1865b;
                    if (!AbstractC0307q.m532b0(c0507l.f1615a.m964b().f1864a, ".R$id") || (set != null && !set.contains(str))) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                AbstractC0129q.m291e0(arrayList, c0104d);
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        C0131s c0131s = C0131s.f426a;
        boolean z2 = c0104d instanceof C0104d;
        ?? r6 = c0104d;
        if (z2) {
            r6 = c0131s;
        }
        return (List) r6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static boolean m11B(Class cls) {
        ArrayList<Method> arrayListM39o = m39o(cls);
        if (!arrayListM39o.isEmpty()) {
            for (Method method : arrayListM39o) {
                if (AbstractC0223g.m414a(method.getName(), "onMMMenuItemSelected") && method.getParameterTypes().length == 2 && MenuItem.class.isAssignableFrom(method.getParameterTypes()[0]) && AbstractC0223g.m414a(method.getParameterTypes()[1], Integer.TYPE)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m12C(Class cls, Set set) {
        if (set.isEmpty()) {
            return false;
        }
        ArrayList arrayListM34j = m34j(cls);
        if (arrayListM34j.isEmpty()) {
            return false;
        }
        Iterator it = arrayListM34j.iterator();
        while (it.hasNext()) {
            if (set.contains(((Field) it.next()).getType().getName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static boolean m13D(String str) {
        if (!AbstractC0307q.m538h0(str, false, "com.tencent.mm")) {
            boolean zM16G = m16G();
            String[] strArr = f229c;
            if (zM16G) {
                String[] strArr2 = f230d;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, 5);
                System.arraycopy(strArr2, 0, objArrCopyOf, 4, 1);
                AbstractC0223g.m415b(objArrCopyOf);
                strArr = (String[]) objArrCopyOf;
            }
            for (String str2 : strArr) {
                if (!AbstractC0307q.m538h0(str, false, str2)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static boolean m14E(String str) {
        boolean zM16G = m16G();
        String[] strArr = f229c;
        if (zM16G) {
            String[] strArr2 = f230d;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, 5);
            System.arraycopy(strArr2, 0, objArrCopyOf, 4, 1);
            AbstractC0223g.m415b(objArrCopyOf);
            strArr = (String[]) objArrCopyOf;
        }
        for (String str2 : strArr) {
            if (AbstractC0307q.m538h0(str, false, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static boolean m15F(Class cls) {
        return cls.isPrimitive() || AbstractC0307q.m538h0(cls.getName(), false, "java.") || AbstractC0307q.m538h0(cls.getName(), false, "android.") || AbstractC0307q.m538h0(cls.getName(), false, "kotlin.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[RETURN] */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m16G() {
        String string = AbstractC0299i.m507C0(AbstractC1135r.m2495q()).toString();
        if (string == null) {
            string = "";
        }
        if (AbstractC0307q.m534d0(string)) {
            return AbstractC1135r.m2494p() > 3120;
        }
        List listM523u0 = AbstractC0299i.m523u0(AbstractC0299i.m507C0(AbstractC0299i.m526x0(AbstractC0299i.m526x0(string, '-'), '(')).toString(), new char[]{'.'});
        ArrayList arrayList = new ArrayList();
        Iterator it = listM523u0.iterator();
        while (it.hasNext()) {
            Integer numM530Z = AbstractC0306p.m530Z((String) it.next());
            if (numM530Z != null) {
                arrayList.add(numM530Z);
            }
        }
        if (arrayList.size() < 3 || ((Number) arrayList.get(0)).intValue() != 8 || ((Number) arrayList.get(1)).intValue() != 0) {
            int i2 = -1;
            if (AbstractC1135r.f3833e == -1) {
                try {
                    i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                } catch (Exception e2) {
                    AbstractC0731a.m1385b(e2);
                }
                AbstractC1135r.f3833e = i2;
            }
            if (AbstractC1135r.f3833e > 3120) {
            }
        } else if (((Number) arrayList.get(2)).intValue() >= 76) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static Class m17H(ClassLoader classLoader, String str) {
        Object c0104d;
        try {
            c0104d = Class.forName(str, false, classLoader);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        return (Class) c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static boolean m18I(String str) {
        return AbstractC0307q.m532b0(str, ".g") || AbstractC0299i.m511i0(str, "contact", true) || AbstractC0299i.m511i0(str, "address", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static boolean m19J(Class cls) {
        boolean z2;
        boolean z3;
        Object c0104d;
        AbstractC0223g.m418e(cls, "clazz");
        ArrayList<Method> arrayList = new ArrayList();
        for (Class superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            try {
                Method[] declaredMethods = superclass.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                c0104d = AbstractC0120h.m262j0(declaredMethods);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
        }
        if (arrayList.isEmpty()) {
            z2 = false;
        } else {
            for (Method method : arrayList) {
                if (AbstractC0223g.m414a(method.getName(), "onBindViewHolder") && method.getParameterTypes().length >= 2 && AbstractC0223g.m414a(method.getParameterTypes()[1], Integer.TYPE)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (arrayList.isEmpty()) {
            z3 = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String name = ((Method) it.next()).getName();
                AbstractC0223g.m417d(name, "getName(...)");
                if (AbstractC0307q.m538h0(name, false, "notify")) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        }
        return z2 && z3 && !m49y(cls).isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static boolean m20K(Class cls) {
        ArrayList<Method> arrayListM37m = m37m(cls);
        if (!arrayListM37m.isEmpty()) {
            for (Method method : arrayListM37m) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length >= 2 && parameterTypes[0].getName().equals("androidx.recyclerview.widget.k3") && AbstractC0223g.m414a(parameterTypes[1], Integer.TYPE) && AbstractC0223g.m414a(method.getReturnType(), Void.TYPE)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static int m21L(Class cls, Map map, Map map2, int i2) {
        int i3 = i2 & 2;
        C0132t c0132t = C0132t.f427a;
        if (i3 != 0) {
            map = c0132t;
        }
        int i4 = (i2 & 8) != 0 ? 6 : 8;
        int i5 = (i2 & 16) != 0 ? 4 : 8;
        AbstractC0223g.m418e(cls, "clazz");
        String name = cls.getName();
        Integer num = (Integer) map.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            if (AbstractC0307q.m538h0(name, false, str)) {
                iIntValue += iIntValue2;
            }
        }
        if (AbstractC0299i.m525w0(name).length() <= 3) {
            iIntValue += i4;
        }
        return !m49y(cls).isEmpty() ? iIntValue + i5 : iIntValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static int m22M(Class cls) {
        String name = cls.getName();
        int i2 = AbstractC0299i.m511i0(name, "contact", true) ? 2 : 0;
        if (AbstractC0299i.m511i0(name, "address", true)) {
            i2 += 3;
        }
        if (AbstractC0299i.m511i0(name, "fragment", true)) {
            i2 += 3;
        }
        ArrayList<Method> arrayListM37m = m37m(cls);
        if (!arrayListM37m.isEmpty()) {
            Iterator it = arrayListM37m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Method method = (Method) it.next();
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && AbstractC0299i.m511i0(method.getReturnType().getName(), "LiveList", false)) {
                    i2 += 6;
                    break;
                }
            }
        }
        if (!arrayListM37m.isEmpty()) {
            Iterator it2 = arrayListM37m.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Method method2 = (Method) it2.next();
                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                if (parameterTypes2.length == 0) {
                    Class<?> returnType = method2.getReturnType();
                    AbstractC0223g.m417d(returnType, "getReturnType(...)");
                    if (m20K(returnType)) {
                        i2 += 6;
                        break;
                    }
                }
            }
        }
        if (arrayListM37m.isEmpty()) {
            return i2;
        }
        for (Method method3 : arrayListM37m) {
            if (AbstractC0223g.m414a(method3.getName(), "onViewCreated") || AbstractC0223g.m414a(method3.getName(), "onResume")) {
                return i2 + 2;
            }
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static int m23N(Class cls) {
        String name = cls.getName();
        int i2 = AbstractC0299i.m511i0(name, "LiveList", true) ? 4 : 0;
        if (AbstractC0299i.m511i0(name, "Address", true)) {
            i2 += 3;
        }
        if (AbstractC0299i.m511i0(name, "contact", true)) {
            i2 += 2;
        }
        ArrayList<Method> arrayListM37m = m37m(cls);
        if (arrayListM37m.isEmpty()) {
            return i2;
        }
        for (Method method : arrayListM37m) {
            if (method.getParameterTypes().length == 1 && List.class.isAssignableFrom(method.getParameterTypes()[0])) {
                return i2 + 6;
            }
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static int m24O(Class cls) {
        if (m15F(cls)) {
            return 0;
        }
        String strM525w0 = AbstractC0299i.m525w0(cls.getName());
        int i2 = (strM525w0.equals("c") || strM525w0.equals("a")) ? 8 : 0;
        if (strM525w0.length() <= 2) {
            i2 += 3;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
        int i3 = 0;
        for (Field field : declaredFields) {
            if (!Modifier.isStatic(field.getModifiers()) && AbstractC0223g.m414a(field.getType(), String.class)) {
                i3++;
            }
        }
        if (1 <= i3 && i3 < 7) {
            i2 += 8;
        }
        Field[] declaredFields2 = cls.getDeclaredFields();
        AbstractC0223g.m417d(declaredFields2, "getDeclaredFields(...)");
        for (Field field2 : declaredFields2) {
            if (AbstractC0223g.m414a(field2.getType(), String.class)) {
                if (!AbstractC0223g.m414a(field2.getName(), "a")) {
                    String name = field2.getName();
                    AbstractC0223g.m417d(name, "getName(...)");
                    if (name.endsWith("a")) {
                    }
                }
                i2 += 10;
                break;
            }
        }
        Field[] declaredFields3 = cls.getDeclaredFields();
        AbstractC0223g.m417d(declaredFields3, "getDeclaredFields(...)");
        for (Field field3 : declaredFields3) {
            if (!Modifier.isStatic(field3.getModifiers()) && AbstractC0223g.m414a(field3.getType(), Long.TYPE)) {
                return i2 + 2;
            }
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m25a(C0505j c0505j) {
        String strM1007c = c0505j.m1007c();
        String str = c0505j.m1006b().f1869a;
        int i2 = AbstractC0223g.m414a(strM1007c, "(Landroid/widget/ImageView;Ljava/lang/String;FZ)V") ? 100 : 0;
        if (AbstractC0223g.m414a(strM1007c, "(Landroid/widget/ImageView;Ljava/lang/String;)V")) {
            i2 += 80;
        }
        if (AbstractC0223g.m414a(strM1007c, "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;F)V")) {
            i2 += 70;
        }
        if (AbstractC0307q.m538h0(str, false, "com.tencent.mm.pluginsdk.ui")) {
            i2 += 40;
        }
        if (AbstractC0307q.m538h0(str, false, "com.tencent.mm.feature.avatar")) {
            i2 += 35;
        }
        return AbstractC0307q.m538h0(str, false, "com.tencent.mm") ? i2 + 10 : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final int m26b(Class cls) {
        return m21L(cls, AbstractC0134v.m295Z(new C0103c("com.tencent.mm.ui.contact.h0", 30)), AbstractC0134v.m295Z(new C0103c("com.tencent.mm.ui.contact", 12)), 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m27c(Class cls) {
        C0103c[] c0103cArr = {new C0103c("com.tencent.mm.ui.contact", 16), new C0103c("com.tencent.mm.ui.mvvm", 10)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0134v.m294Y(2));
        AbstractC0134v.m297b0(linkedHashMap, c0103cArr);
        return m21L(cls, null, linkedHashMap, 26);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m28d(Class cls) {
        return m21L(cls, null, AbstractC0134v.m295Z(new C0103c("com.tencent.mm.plugin.textstatus", 20)), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m29e(Class cls, Set set, Set set2) {
        ArrayList arrayListM34j = m34j(cls);
        int i2 = m11B(cls) ? 8 : 0;
        if (!arrayListM34j.isEmpty()) {
            Iterator it = arrayListM34j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (set.contains(((Field) it.next()).getType().getName())) {
                    i2 += 10;
                    break;
                }
            }
        }
        if (!arrayListM34j.isEmpty()) {
            Iterator it2 = arrayListM34j.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (set2.contains(((Field) it2.next()).getType().getName())) {
                    i2 += 6;
                    break;
                }
            }
        }
        return cls.getSimpleName().length() <= 3 ? i2 + 2 : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m30f(Class cls) {
        int i2 = View.OnCreateContextMenuListener.class.isAssignableFrom(cls) ? 8 : 0;
        ArrayList arrayListM34j = m34j(cls);
        if (!arrayListM34j.isEmpty()) {
            Iterator it = arrayListM34j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AbstractC0307q.m538h0(((Field) it.next()).getType().getName(), false, "com.tencent.mm.ui.contact")) {
                    i2 += 6;
                    break;
                }
            }
        }
        ArrayList arrayListM34j2 = m34j(cls);
        if (!arrayListM34j2.isEmpty()) {
            Iterator it2 = arrayListM34j2.iterator();
            loop1: while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Class<?> type = ((Field) it2.next()).getType();
                AbstractC0223g.m417d(type, "getType(...)");
                ArrayList arrayListM34j3 = m34j(type);
                if (!arrayListM34j3.isEmpty()) {
                    Iterator it3 = arrayListM34j3.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC0307q.m538h0(((Field) it3.next()).getType().getName(), false, "com.tencent.mm.storage.")) {
                            i2 += 8;
                            break loop1;
                        }
                    }
                }
            }
        }
        return cls.getSimpleName().length() <= 3 ? i2 + 2 : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final int m31g(String str) {
        if (str.equalsIgnoreCase("q7")) {
            return 100;
        }
        if (str.equalsIgnoreCase("N7") || str.equalsIgnoreCase("m7") || str.equalsIgnoreCase("C7") || str.equalsIgnoreCase("I7")) {
            return 95;
        }
        if (str.equalsIgnoreCase("a7")) {
            return -20;
        }
        return str.equalsIgnoreCase("o7") ? -10 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final int m32h(C0505j c0505j) {
        int i2 = AbstractC0307q.m538h0(c0505j.m1006b().f1869a, false, "com.tencent.mm.storage.") ? 80 : 0;
        if (AbstractC0307q.m532b0(c0505j.m1007c(), ")J")) {
            i2 += 40;
        }
        if (AbstractC0299i.m511i0(c0505j.m1007c(), "Lcom/tencent/mm/storage/", false)) {
            i2 += 30;
        }
        return AbstractC0307q.m538h0(c0505j.m1006b().f1869a, false, "com.tencent.mm") ? i2 + 10 : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static ArrayList m33i(Class cls) {
        Object c0104d;
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                c0104d = Boolean.valueOf(AbstractC0129q.m292f0(arrayList, declaredFields));
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                m41q("conversation dexkit read fields fail " + cls.getName() + " " + thM246a.getClass().getSimpleName());
            }
            cls = cls.getSuperclass();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Field) it.next()).setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static ArrayList m34j(Class cls) {
        Object c0104d;
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                c0104d = AbstractC0120h.m262j0(declaredFields);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static ArrayList m35k(Class cls) {
        Object c0104d;
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                c0104d = AbstractC0120h.m262j0(declaredFields);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static ArrayList m36l(Class cls) {
        Object c0104d;
        AbstractC0223g.m418e(cls, "clazz");
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                c0104d = AbstractC0120h.m262j0(declaredFields);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static ArrayList m37m(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            AbstractC0129q.m292f0(arrayList, declaredMethods);
            cls = cls.getSuperclass();
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Method method = (Method) obj;
            String name = method.getDeclaringClass().getName();
            String name2 = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
            if (hashSet.add(name + "#" + name2 + AbstractC0120h.m260h0(parameterTypes, null, new C0026a(6), 25))) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((Method) it.next()).setAccessible(true);
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static ArrayList m38n(Class cls) {
        Object c0104d;
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                c0104d = Boolean.valueOf(AbstractC0129q.m292f0(arrayList, declaredMethods));
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                m41q("conversation dexkit read methods fail " + cls.getName() + " " + thM246a.getClass().getSimpleName());
            }
            cls = cls.getSuperclass();
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Method method = (Method) obj;
            String name = method.getDeclaringClass().getName();
            String name2 = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
            if (hashSet.add(name + "#" + name2 + AbstractC0120h.m260h0(parameterTypes, null, new C0026a(13), 25))) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            try {
                ((Method) it.next()).setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static ArrayList m39o(Class cls) {
        Object c0104d;
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                c0104d = AbstractC0120h.m262j0(declaredMethods);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static ArrayList m40p(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            AbstractC0129q.m292f0(arrayList, declaredMethods);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m41q(String str) {
        Log.w("WXMaskDexKit", str);
        AbstractC0731a.m1387d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static List m42r(DexKitBridge dexKitBridge, String... strArr) {
        Object c0104d;
        try {
            C0353a c0353a = new C0353a(1);
            C0362b c0362b = new C0362b();
            if (strArr.length == 1) {
                C0362b.m623e0(c0362b, AbstractC0120h.m262j0(strArr));
            } else {
                c0362b.m626d0((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            c0353a.f828f = c0362b;
            c0104d = AbstractC0123k.m281w0(dexKitBridge.m1442e(c0353a));
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("custom avatar dexkit string scan fail", AbstractC0120h.m260h0(strArr, ",", null, 62), thM246a);
        }
        C0131s c0131s = C0131s.f426a;
        if (c0104d instanceof C0104d) {
            c0104d = c0131s;
        }
        return (List) c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0086 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0070 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX INFO: renamed from: s */
    public static ArrayList m43s(DexKitBridge dexKitBridge, ClassLoader classLoader, List list) {
        ?? c0104d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                C0353a c0353a = new C0353a(0);
                boolean zM16G = m16G();
                String[] strArr = f227a;
                if (zM16G) {
                    String[] strArr2 = f228b;
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, 6);
                    System.arraycopy(strArr2, 0, objArrCopyOf, 5, 1);
                    AbstractC0223g.m415b(objArrCopyOf);
                    strArr = (String[]) objArrCopyOf;
                }
                c0353a.m608Z((String[]) Arrays.copyOf(strArr, strArr.length));
                C0361a c0361a = new C0361a();
                c0361a.m617Y(str, 1, false);
                c0353a.f828f = c0361a;
                C0500e c0500eM1441d = dexKitBridge.m1441d(c0353a);
                c0104d = new ArrayList();
                Iterator it2 = c0500eM1441d.iterator();
                while (it2.hasNext()) {
                    c0104d.add(((C0499d) it2.next()).m963c(classLoader));
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("conversation dexkit find class fail", str, thM246a);
            }
            C0131s c0131s = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = c0131s;
            }
            AbstractC0129q.m291e0((Iterable) c0104d, arrayList);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((Class) obj).getName())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static Class m44t(ClassLoader classLoader, DexKitBridge dexKitBridge, List list, List list2) {
        Object c0104d;
        Object next;
        Object c0104d2;
        Object c0104d3;
        Class cls;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        C0499d c0499dM1443f = dexKitBridge.m1443f((String) it2.next());
                        c0104d2 = c0499dM1443f != null ? c0499dM1443f.m963c(classLoader) : null;
                    } catch (Throwable th) {
                        c0104d2 = new C0104d(th);
                    }
                    boolean z2 = c0104d2 instanceof C0104d;
                    Object obj = c0104d2;
                    if (z2) {
                        obj = null;
                    }
                    Class cls2 = (Class) obj;
                    if (cls2 != null) {
                        return cls2;
                    }
                }
                try {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            c0104d = null;
                            break;
                        }
                        String str = (String) it3.next();
                        C0353a c0353a = new C0353a(0);
                        c0353a.m608Z("com.tencent.mm.ui.contact");
                        C0361a c0361a = new C0361a();
                        c0361a.m617Y(str, 1, false);
                        c0353a.f828f = c0361a;
                        Iterator it4 = dexKitBridge.m1441d(c0353a).iterator();
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (it4.hasNext()) {
                                C0499d c0499d = (C0499d) next;
                                String str2 = (!AbstractC0299i.m525w0(c0499d.m962b().f1863a).equals(str) ? 1 : 0) + ":" + c0499d.m962b().f1863a;
                                do {
                                    Object next2 = it4.next();
                                    C0499d c0499d2 = (C0499d) next2;
                                    String str3 = (!AbstractC0299i.m525w0(c0499d2.m962b().f1863a).equals(str) ? 1 : 0) + ":" + c0499d2.m962b().f1863a;
                                    if (str2.compareTo(str3) > 0) {
                                        next = next2;
                                        str2 = str3;
                                    }
                                } while (it4.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        C0499d c0499d3 = (C0499d) next;
                        c0104d = c0499d3 != null ? c0499d3.m963c(classLoader) : null;
                        if (c0104d != null) {
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    c0104d = new C0104d(th2);
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("contact dexkit find class by simple name fail", AbstractC0123k.m271m0(list2, ",", null, null, null, 62), thM246a);
                }
                return (Class) (c0104d instanceof C0104d ? null : c0104d);
            }
            try {
                c0104d3 = Class.forName((String) it.next(), false, classLoader);
            } catch (Throwable th3) {
                c0104d3 = new C0104d(th3);
            }
            cls = (Class) (c0104d3 instanceof C0104d ? null : c0104d3);
        } while (cls == null);
        return cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0072 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x006b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: u */
    public static List m45u(DexKitBridge dexKitBridge, List list, List list2, boolean z2) {
        ?? c0104d;
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                C0353a c0353a = new C0353a(0);
                String[] strArr = (String[]) list.toArray(new String[0]);
                c0353a.m608Z((String[]) Arrays.copyOf(strArr, strArr.length));
                C0361a c0361a = new C0361a();
                c0361a.m617Y(str, 1, z2);
                c0353a.f828f = c0361a;
                C0500e c0500eM1441d = dexKitBridge.m1441d(c0353a);
                c0104d = new ArrayList(AbstractC0125m.m289c0(c0500eM1441d));
                Iterator it2 = c0500eM1441d.iterator();
                while (it2.hasNext()) {
                    c0104d.add(((C0499d) it2.next()).m962b().f1863a);
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            C0131s c0131s = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = c0131s;
            }
            AbstractC0129q.m291e0((Iterable) c0104d, linkedHashSet);
        }
        return AbstractC0123k.m281w0(linkedHashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:71:0x0131, B:55:0x00eb, B:58:0x00f6, B:59:0x00fa, B:61:0x0100, B:63:0x0110, B:65:0x011c, B:68:0x0125, B:70:0x012e, B:47:0x00d7), top: B:97:0x00eb }] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m46v(Class cls, ClassLoader classLoader) {
        Object c0104d;
        boolean z2;
        Object c0104d2;
        ArrayList<Method> arrayListM38n;
        ClassLoader classLoader2 = classLoader;
        boolean z3 = true;
        Object obj = C0131s.f426a;
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Field declaredField = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Field declaredField2 = Class.forName("dalvik.system.DexPathList").getDeclaredField("dexElements");
            declaredField2.setAccessible(true);
            Field declaredField3 = Class.forName("dalvik.system.DexPathList$Element").getDeclaredField("dexFile");
            declaredField3.setAccessible(true);
            Object obj2 = declaredField.get(classLoader2);
            if (obj2 == null) {
                c0104d = obj;
            } else {
                Object obj3 = declaredField2.get(obj2);
                Object[] objArr = obj3 instanceof Object[] ? (Object[]) obj3 : null;
                if (objArr == null) {
                    c0104d = obj;
                } else {
                    int length = objArr.length;
                    boolean z4 = false;
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < length) {
                        Object obj4 = declaredField3.get(objArr[i3]);
                        DexFile dexFile = obj4 instanceof DexFile ? (DexFile) obj4 : null;
                        if (dexFile != null) {
                            Enumeration<String> enumerationEntries = dexFile.entries();
                            int i4 = i2;
                            boolean z5 = z4;
                            while (enumerationEntries.hasMoreElements()) {
                                String strNextElement = enumerationEntries.nextElement();
                                AbstractC0223g.m415b(strNextElement);
                                if (!m14E(strNextElement) || AbstractC0307q.m538h0(strNextElement, z5, "com.tencent.mm.storage.") || AbstractC0299i.m511i0(strNextElement, "finder", z3) || AbstractC0299i.m511i0(strNextElement, "game", z3) || AbstractC0299i.m511i0(strNextElement, "scanner", z3)) {
                                    z2 = z3;
                                } else {
                                    try {
                                        Class clsM17H = m17H(classLoader2, strNextElement);
                                        if (clsM17H == null) {
                                            z2 = z3;
                                        } else {
                                            ArrayList arrayListM33i = m33i(clsM17H);
                                            if (arrayListM33i.isEmpty()) {
                                                z2 = z3;
                                                try {
                                                    arrayListM38n = m38n(clsM17H);
                                                    if (arrayListM38n.isEmpty()) {
                                                        boolean z6 = z5;
                                                        for (Method method : arrayListM38n) {
                                                            if (!AbstractC0223g.m414a(method.getReturnType(), cls)) {
                                                                Class<?>[] parameterTypes = method.getParameterTypes();
                                                                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                                                                int length2 = parameterTypes.length;
                                                                for (?? r10 = z6; r10 < length2; r10++) {
                                                                    if (!AbstractC0223g.m414a(parameterTypes[r10], cls)) {
                                                                    }
                                                                }
                                                                z6 = false;
                                                            }
                                                            linkedHashSet.add(clsM17H);
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    c0104d2 = new C0104d(th);
                                                }
                                            } else {
                                                Iterator it = arrayListM33i.iterator();
                                                while (it.hasNext()) {
                                                    z2 = z3;
                                                    if (AbstractC0223g.m414a(((Field) it.next()).getType(), cls)) {
                                                        break;
                                                    }
                                                    z3 = z2;
                                                }
                                                z2 = z3;
                                                arrayListM38n = m38n(clsM17H);
                                                if (arrayListM38n.isEmpty()) {
                                                }
                                            }
                                        }
                                        c0104d2 = C0109i.f404a;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z2 = z3;
                                    }
                                    Throwable thM246a = AbstractC0105e.m246a(c0104d2);
                                    if (thM246a != null) {
                                        if (i4 < 12) {
                                            m41q("conversation dexkit skip bad class " + strNextElement + " " + thM246a.getClass().getSimpleName());
                                        }
                                        i4++;
                                    }
                                }
                                classLoader2 = classLoader;
                                z3 = z2;
                                z5 = false;
                            }
                            i2 = i4;
                        }
                        i3++;
                        classLoader2 = classLoader;
                        z3 = z3;
                        z4 = false;
                    }
                    if (i2 > 0) {
                        m41q("conversation dexkit skipped bad classes " + i2);
                    }
                    c0104d = AbstractC0123k.m281w0(linkedHashSet);
                }
            }
        } catch (Throwable th3) {
            c0104d = new C0104d(th3);
        }
        Throwable thM246a2 = AbstractC0105e.m246a(c0104d);
        if (thM246a2 != null) {
            AbstractC0731a.m1387d("conversation dexkit class reference scan fail", cls.getName(), thM246a2);
        }
        if (!(c0104d instanceof C0104d)) {
            obj = c0104d;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ce A[SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m47w(Class cls, List list) {
        ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Class) it.next()).getName());
        }
        Set setM265B0 = AbstractC0123k.m265B0(arrayList);
        ArrayList arrayListM38n = m38n(cls);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListM38n) {
            Method method = (Method) obj;
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
            int length = parameterTypes.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (!setM265B0.contains(parameterTypes[i2].getName())) {
                    i2++;
                } else if (m13D(method.getReturnType().getName()) && !setM265B0.contains(method.getReturnType().getName()) && !AbstractC0307q.m538h0(method.getReturnType().getName(), false, "com.tencent.mm.storage.") && !AbstractC0223g.m414a(method.getReturnType(), Void.TYPE) && !AbstractC0223g.m414a(method.getReturnType(), Object.class)) {
                    arrayList2.add(obj);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0125m.m289c0(arrayList2));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Method) it2.next()).getReturnType());
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            Class cls2 = (Class) obj2;
            AbstractC0223g.m415b(cls2);
            ArrayList arrayList5 = new ArrayList(AbstractC0125m.m289c0(list));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((Class) it3.next()).getName());
            }
            Set setM265B02 = AbstractC0123k.m265B0(arrayList5);
            if (m13D(cls2.getName()) && !setM265B02.contains(cls2.getName()) && !AbstractC0307q.m538h0(cls2.getName(), false, "android.") && !AbstractC0307q.m538h0(cls2.getName(), false, "java.")) {
                ArrayList<Field> arrayListM33i = m33i(cls2);
                if (!arrayListM33i.isEmpty()) {
                    for (Field field : arrayListM33i) {
                        String name = field.getName();
                        AbstractC0223g.m417d(name, "getName(...)");
                        if (AbstractC0299i.m511i0(name, "unRead", true)) {
                            break;
                        }
                        String name2 = field.getName();
                        AbstractC0223g.m417d(name2, "getName(...)");
                        if (AbstractC0299i.m511i0(name2, "digest", true)) {
                            break;
                        }
                        String name3 = field.getName();
                        AbstractC0223g.m417d(name3, "getName(...)");
                        if (AbstractC0299i.m511i0(name3, "content", true)) {
                            break;
                        }
                    }
                    if (arrayListM33i.isEmpty()) {
                    }
                } else if (arrayListM33i.isEmpty()) {
                    Iterator it4 = arrayListM33i.iterator();
                    while (it4.hasNext()) {
                        if (setM265B02.contains(((Field) it4.next()).getType().getName())) {
                            arrayList4.add(obj2);
                            break;
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (hashSet.add(((Class) obj3).getName())) {
                arrayList6.add(obj3);
            }
        }
        return arrayList6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static List m48x(ClassLoader classLoader) {
        Object c0104d;
        Class clsM17H;
        Object obj = C0131s.f426a;
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Field declaredField = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Field declaredField2 = Class.forName("dalvik.system.DexPathList").getDeclaredField("dexElements");
            declaredField2.setAccessible(true);
            Field declaredField3 = Class.forName("dalvik.system.DexPathList$Element").getDeclaredField("dexFile");
            declaredField3.setAccessible(true);
            Object obj2 = declaredField.get(classLoader);
            if (obj2 == null) {
                c0104d = obj;
            } else {
                Object obj3 = declaredField2.get(obj2);
                Object[] objArr = obj3 instanceof Object[] ? (Object[]) obj3 : null;
                if (objArr == null) {
                    c0104d = obj;
                } else {
                    for (Object obj4 : objArr) {
                        Object obj5 = declaredField3.get(obj4);
                        DexFile dexFile = obj5 instanceof DexFile ? (DexFile) obj5 : null;
                        if (dexFile != null) {
                            Enumeration<String> enumerationEntries = dexFile.entries();
                            while (enumerationEntries.hasMoreElements()) {
                                String strNextElement = enumerationEntries.nextElement();
                                AbstractC0223g.m415b(strNextElement);
                                if (m14E(strNextElement) && !AbstractC0299i.m511i0(strNextElement, "$", false) && (clsM17H = m17H(classLoader, strNextElement)) != null) {
                                    linkedHashSet.add(clsM17H);
                                }
                            }
                        }
                    }
                    m41q("conversation dexkit core classes " + linkedHashSet.size());
                    c0104d = AbstractC0123k.m281w0(linkedHashSet);
                }
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("conversation dexkit core class scan fail", thM246a);
        }
        if (!(c0104d instanceof C0104d)) {
            obj = c0104d;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static List m49y(Class cls) {
        Object c0104d;
        AbstractC0223g.m418e(cls, "clazz");
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                c0104d = AbstractC0120h.m262j0(declaredFields);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
            cls = cls.getSuperclass();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!Modifier.isStatic(((Field) obj2).getModifiers())) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            Field field = (Field) obj3;
            if (List.class.isAssignableFrom(field.getType()) || AbstractC0223g.m414a(field.getName(), "data")) {
                arrayList3.add(obj3);
            }
        }
        List listM276r0 = AbstractC0123k.m276r0(arrayList3, new C0033f(6, new C0032e(4)));
        ArrayList arrayList4 = new ArrayList(AbstractC0125m.m289c0(listM276r0));
        Iterator it = listM276r0.iterator();
        while (it.hasNext()) {
            arrayList4.add(((Field) it.next()).getName());
        }
        return AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static Method m50z(Class cls, List list) {
        Object next;
        Iterator it = m37m(cls).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Method method = (Method) next;
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
            if (parameterTypes.length == 0 && list.contains(method.getName()) && !AbstractC0223g.m414a(method.getReturnType(), Void.TYPE)) {
                break;
            }
        }
        return (Method) next;
    }
}
