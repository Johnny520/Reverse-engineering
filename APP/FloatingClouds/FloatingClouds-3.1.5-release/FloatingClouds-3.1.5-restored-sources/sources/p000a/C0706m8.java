package p000a;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Handler;
import android.os.Looper;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p000a.C0186K3;
import p000a.C0901wd;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.m8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0706m8 implements IPlugin {

    /* JADX INFO: renamed from: l */
    public static volatile C0706m8 f2654l;

    /* JADX INFO: renamed from: d */
    public volatile Object f2658d;

    /* JADX INFO: renamed from: e */
    public volatile Object f2659e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f2660f;

    /* JADX INFO: renamed from: h */
    public volatile Object f2662h;

    /* JADX INFO: renamed from: i */
    public volatile ArrayList f2663i;

    /* JADX INFO: renamed from: j */
    public volatile String f2664j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f2665k;

    /* JADX INFO: renamed from: a */
    public volatile String f2655a = "xc4.k";

    /* JADX INFO: renamed from: b */
    public volatile String f2656b = "xc4.i";

    /* JADX INFO: renamed from: c */
    public volatile String f2657c = "zc4.b";

    /* JADX INFO: renamed from: g */
    public final Map<Object, String> f2661g = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: a.m8$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m1623a() {
            String strM1618j;
            C0706m8 c0706m8 = C0706m8.f2654l;
            if (c0706m8 == null || !C0706m8.m1610m() || C0706m8.m1609k().isEmpty() || (strM1618j = c0706m8.m1618j()) == null) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC0273P0(c0706m8, 6, strM1618j));
        }

        /* JADX INFO: renamed from: b */
        public static void m1624b() {
            final Object obj;
            final ArrayList arrayList;
            final C0706m8 c0706m8 = C0706m8.f2654l;
            if (c0706m8 == null || (obj = c0706m8.f2662h) == null || (arrayList = c0706m8.f2663i) == null || !C0706m8.m1610m()) {
                return;
            }
            final Set setM1609k = C0706m8.m1609k();
            if (setM1609k.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: a.k8
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList2 = arrayList;
                    Set<String> set = setM1609k;
                    Object obj2 = obj;
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            C0706m8 c0706m82 = c0706m8;
                            if (!zHasNext) {
                                c0706m82.getClass();
                                C0706m8.m1604d(obj2, "c", arrayList3);
                                return;
                            } else {
                                Object next = it.next();
                                if (!c0706m82.m1622v(next, set)) {
                                    arrayList3.add(next);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        C0920xd.m2206a(th);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: a.m8$b */
    public final class b extends CursorWrapper {

        /* JADX INFO: renamed from: a */
        public final Cursor f2666a;

        /* JADX INFO: renamed from: b */
        public final Set<String> f2667b;

        /* JADX INFO: renamed from: c */
        public final int[] f2668c;

        /* JADX INFO: renamed from: d */
        public final String[] f2669d;

        /* JADX INFO: renamed from: e */
        public final int f2670e;

        /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(Cursor cursor, Set<String> set) {
            int i;
            String strM1612o;
            super(cursor);
            this.f2666a = cursor;
            this.f2667b = set;
            int columnIndex = cursor.getColumnIndex("snsID");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int position = cursor.getPosition();
            if (columnIndex >= 0) {
                try {
                    if (cursor.moveToFirst()) {
                        i = 0;
                        do {
                            i++;
                            try {
                                long j = this.f2666a.getLong(columnIndex);
                                String strM1601a = C0706m8.m1601a(C0706m8.this, j);
                                if (strM1601a.length() == 0) {
                                    strM1612o = "?";
                                } else {
                                    C0706m8.this.getClass();
                                    strM1612o = C0706m8.m1612o(strM1601a);
                                }
                                boolean zContains = this.f2667b.contains(strM1612o);
                                arrayList2.add("0x" + Long.toHexString(j) + "->" + strM1612o + (zContains ? "[HIDDEN]" : ""));
                                if (!zContains) {
                                    arrayList.add(Integer.valueOf(this.f2666a.getPosition()));
                                }
                            } catch (Throwable unused) {
                            }
                        } while (this.f2666a.moveToNext());
                    } else {
                        i = 0;
                    }
                } catch (Throwable unused2) {
                    i = 0;
                }
            }
            try {
                this.f2666a.moveToPosition(position);
            } catch (Throwable unused3) {
            }
            this.f2668c = C0834t3.m1958v0(arrayList);
            this.f2670e = i;
            this.f2669d = (String[]) arrayList2.toArray(new String[0]);
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final int getCount() {
            return this.f2668c.length;
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean move(int i) {
            return moveToPosition(getPosition() + i);
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean moveToFirst() {
            return moveToPosition(0);
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean moveToLast() {
            return moveToPosition(this.f2668c.length - 1);
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean moveToNext() {
            return moveToPosition(getPosition() + 1);
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean moveToPosition(int i) {
            if (i < -1) {
                return false;
            }
            int[] iArr = this.f2668c;
            if (i >= iArr.length) {
                return false;
            }
            if (i >= 0) {
                i = iArr[i];
            }
            return super.moveToPosition(i);
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean moveToPrevious() {
            return moveToPosition(getPosition() - 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m1601a(C0706m8 c0706m8, long j) {
        c0706m8.getClass();
        String str = "";
        if (j == 0) {
            return "";
        }
        String string = new BigInteger(Long.toBinaryString(j), 2).toString(10);
        if (string.length() >= 22) {
            return string;
        }
        int length = 22 - string.length();
        if (length < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + length + '.').toString());
        }
        if (length != 0) {
            str = "0";
            if (length != 1) {
                char cCharAt = "0".charAt(0);
                char[] cArr = new char[length];
                for (int i = 0; i < length; i++) {
                    cArr[i] = cCharAt;
                }
                str = new String(cArr);
            }
        }
        return str.concat(string);
    }

    /* JADX INFO: renamed from: b */
    public static void m1602b(C0706m8 c0706m8, ArrayList arrayList, String str) {
        c0706m8.getClass();
        if (str == null || C0034Be.m101P(str) || C0034Be.m101P(str)) {
            return;
        }
        String strM1612o = m1612o(str);
        if (strM1612o.length() > 0) {
            arrayList.add(strM1612o);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m1603c(Object obj, String str) {
        if (obj != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                try {
                    Method declaredMethod = superclass.getDeclaredMethod(str, null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod.invoke(obj, null);
                } catch (NoSuchMethodException unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m1604d(Object obj, String str, ArrayList arrayList) {
        Object objM2206a;
        if (obj == null) {
            return;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredMethods());
            while (c0112g1M2122I.hasNext()) {
                Method method = (Method) c0112g1M2122I.next();
                if (C0631i9.m1478a(method.getName(), str) && method.getParameterTypes().length == 1 && C0631i9.m1478a(method.getParameterTypes()[0], List.class)) {
                    method.setAccessible(true);
                    try {
                        objM2206a = method.invoke(obj, arrayList);
                    } catch (Throwable th) {
                        objM2206a = C0920xd.m2206a(th);
                    }
                    boolean z = objM2206a instanceof C0901wd.a;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m1605e(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            Object objM1608i = m1608i(it.next(), "a");
            List list2 = objM1608i instanceof List ? (List) objM1608i : null;
            if (list2 != null) {
                size += list2.size();
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: g */
    public static Method m1606g(Object obj) {
        if (obj == null) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredMethods());
            while (c0112g1M2122I.hasNext()) {
                Method method = (Method) c0112g1M2122I.next();
                Class<?>[] parameterTypes = method.getParameterTypes();
                C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && C0631i9.m1478a(method.getReturnType(), Void.TYPE) && C0631i9.m1478a(method.getName(), "notifyDataSetChanged")) {
                    return method;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static List m1607h(Object obj) throws IllegalAccessException {
        for (Class<?> superclass = obj != null ? obj.getClass() : null; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField("data");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (C0198Kf.m549b(obj2)) {
                    return (List) obj2;
                }
                return null;
            } catch (NoSuchFieldException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static Object m1608i(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (NoSuchFieldException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static Set m1609k() {
        C0186K3.f638a.getClass();
        LinkedHashSet linkedHashSetM502c = C0186K3.a.m502c();
        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(linkedHashSetM502c, 10));
        Iterator it = linkedHashSetM502c.iterator();
        while (it.hasNext()) {
            arrayList.add(m1612o((String) it.next()));
        }
        return C0834t3.m1946A0(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m1610m() {
        C0186K3.f638a.getClass();
        return C0186K3.a.m511l() && C0186K3.a.m508i().f2440j;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m1611n(String str) {
        if (C0034Be.m101P(str)) {
            return false;
        }
        String strM1612o = m1612o(C0034Be.m104S(C0034Be.m104S(str, "sns_table_"), "ad_table_"));
        if (strM1612o.length() == 0) {
            return false;
        }
        return m1609k().contains(strM1612o);
    }

    /* JADX INFO: renamed from: o */
    public static String m1612o(String str) {
        CharSequence charSequenceSubSequence = "";
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] cArr = {'0'};
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            int i2 = 0;
            while (true) {
                if (i2 >= 1) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            if (!(i2 >= 0)) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        String string = charSequenceSubSequence.toString();
        return string.length() == 0 ? "0" : string;
    }

    /* JADX INFO: renamed from: p */
    public static void m1613p(Object obj) {
        Method methodM1606g;
        if (obj == null || (methodM1606g = m1606g(obj)) == null) {
            return;
        }
        try {
            methodM1606g.setAccessible(true);
            methodM1606g.invoke(obj, null);
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m1614q(Object obj, String str) {
        Field declaredField;
        Object objM2206a;
        if (obj == null) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            try {
                declaredField = superclass.getDeclaredField(str);
                break;
            } catch (NoSuchFieldException unused) {
            }
        }
        declaredField = null;
        if (declaredField == null) {
            return null;
        }
        try {
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            objM2206a = obj2 != null ? obj2.toString() : null;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        return (String) (objM2206a instanceof C0901wd.a ? null : objM2206a);
    }

    /* JADX INFO: renamed from: t */
    public static void m1615t(Object obj, ArrayList arrayList) throws IllegalAccessException {
        for (Class<?> superclass = obj != null ? obj.getClass() : null; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField("data");
                declaredField.setAccessible(true);
                declaredField.set(obj, arrayList);
                return;
            } catch (NoSuchFieldException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m1616u(Object obj, Object obj2, String str) throws IllegalAccessException {
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                declaredField.set(obj, obj2);
                return;
            } catch (NoSuchFieldException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1617f(List<?> list, Set<String> set) {
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (next != null) {
                Object objM1608i = m1608i(next, "b");
                String str = objM1608i instanceof String ? (String) objM1608i : null;
                Object objM1608i2 = m1608i(next, "a");
                List list2 = C0198Kf.m549b(objM1608i2) ? (List) objM1608i2 : null;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (m1622v(it.next(), set)) {
                            it.remove();
                        }
                    }
                    if (list2.isEmpty() && !C0631i9.m1478a(str, "loading") && !C0631i9.m1478a(str, "my_timeline")) {
                        listIterator.remove();
                    }
                }
            }
        }
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        C0631i9.m1482e(c0173j8, "session");
        f2654l = this;
        ClassLoader classLoader = c0173j8.f608a;
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: handleHook START (album+timeline+profile data-layer)"}, 1));
        int i = -1;
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
            }
            C0021B1.f64a = i;
        }
        C0578fd c0578fd = new C0578fd(C0021B1.f64a, classLoader);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a = C0616hd.m1467a("sns_album_classes", c0578fd);
        Class<?> clsM1426a = c0597gdM1467a.m1426a("albumHelper");
        this.f2655a = clsM1426a != null ? clsM1426a.getName() : "xc4.k";
        Class<?> clsM1426a2 = c0597gdM1467a.m1426a("albumAdapter");
        this.f2656b = clsM1426a2 != null ? clsM1426a2.getName() : "xc4.i";
        String strM1427b = c0597gdM1467a.m1427b("viewHolderSuffix");
        if (strM1427b == null) {
            strM1427b = "zc4.b";
        }
        this.f2657c = strM1427b;
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: sns_album via=" + c0597gdM1467a.f2211d + " helper=" + this.f2655a + " adapter=" + this.f2656b + " vh=" + this.f2657c}, 1));
        final int i2 = 3;
        if (C0173J8.m464b(c0173j8, "com.tencent.mm.plugin.sns.ui.improve.component.h2", new C0586g2(28), new InterfaceC0064D7(this) { // from class: a.i8

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0706m8 f2307b;

            {
                this.f2307b = this;
            }

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
            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                List listM1607h;
                List list;
                switch (i2) {
                    case 0:
                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain, "chain");
                        C0706m8 c0706m8 = this.f2307b;
                        if (C0706m8.m1610m()) {
                            List args = chain.getArgs();
                            C0631i9.m1481d(args, "getArgs(...)");
                            Object objM1951o0 = C0834t3.m1951o0(args, 0);
                            List<?> list2 = C0198Kf.m549b(objM1951o0) ? (List) objM1951o0 : null;
                            Set<String> setM1609k = C0706m8.m1609k();
                            if (list2 != null && !setM1609k.isEmpty()) {
                                c0706m8.m1617f(list2, setM1609k);
                            }
                        }
                        return chain.proceed();
                    case 1:
                        C0706m8 c0706m82 = this.f2307b;
                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain2, "chain");
                        if (C0706m8.m1610m()) {
                            List args2 = chain2.getArgs();
                            C0631i9.m1481d(args2, "getArgs(...)");
                            Object objM1951o02 = C0834t3.m1951o0(args2, 0);
                            List list3 = C0198Kf.m549b(objM1951o02) ? (List) objM1951o02 : null;
                            Set<String> setM1609k2 = C0706m8.m1609k();
                            if (list3 != null && !setM1609k2.isEmpty()) {
                                c0706m82.f2662h = chain2.getThisObject();
                                c0706m82.f2663i = new ArrayList(list3);
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    if (c0706m82.m1622v(it.next(), setM1609k2)) {
                                        it.remove();
                                    }
                                }
                            }
                        }
                        return chain2.proceed();
                    case 2:
                        C0706m8 c0706m83 = this.f2307b;
                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain3, "chain");
                        chain3.proceed();
                        try {
                            c0706m83.m1619l(chain3);
                            C0413Wf c0413Wf = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th) {
                            C0920xd.m2206a(th);
                        }
                        return null;
                    case 3:
                        C0706m8 c0706m84 = this.f2307b;
                        XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain4, "chain");
                        Object objProceed = chain4.proceed();
                        if (C0706m8.m1610m() && !c0706m84.f2660f) {
                            Set<String> setM1609k3 = C0706m8.m1609k();
                            if (!setM1609k3.isEmpty()) {
                                c0706m84.f2660f = true;
                                try {
                                    Object thisObject = chain4.getThisObject();
                                    List listM1607h2 = C0706m8.m1607h(thisObject);
                                    if (listM1607h2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : listM1607h2) {
                                            if (!c0706m84.m1622v(obj2, setM1609k3)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        if (arrayList.size() != listM1607h2.size()) {
                                            C0706m8.m1615t(thisObject, arrayList);
                                            C0706m8.m1613p(thisObject);
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: timeline hide removed=" + (listM1607h2.size() - arrayList.size())}, 1));
                                        }
                                    }
                                    break;
                                } catch (Throwable unused) {
                                }
                                c0706m84.f2660f = false;
                            }
                        }
                        return objProceed;
                    case 4:
                        C0706m8 c0706m85 = this.f2307b;
                        XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain5, "chain");
                        List args3 = chain5.getArgs();
                        C0631i9.m1481d(args3, "getArgs(...)");
                        Object objM1951o03 = C0834t3.m1951o0(args3, 0);
                        chain5.proceed();
                        String name = objM1951o03 != null ? objM1951o03.getClass().getName() : "";
                        if (name.equals(c0706m85.f2656b)) {
                            c0706m85.f2658d = objM1951o03;
                            c0706m85.m1620r();
                        } else if (name.equals("com.tencent.mm.plugin.sns.ui.improve.component.h2")) {
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        } else if (objM1951o03 != null && (listM1607h = C0706m8.m1607h(objM1951o03)) != null) {
                            Iterator it2 = listM1607h.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (next != null) {
                                        String name2 = next.getClass().getName();
                                        if (name2.endsWith(c0706m85.f2657c) || name2.endsWith(C0015Ae.m48G(c0706m85.f2657c, ".", "$"))) {
                                        }
                                    }
                                }
                            }
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        }
                        return null;
                    case 5:
                        C0706m8 c0706m86 = this.f2307b;
                        XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain6, "chain");
                        try {
                            List args4 = chain6.getArgs();
                            C0631i9.m1481d(args4, "getArgs(...)");
                            Object objM1951o04 = C0834t3.m1951o0(args4, 0);
                            String str = objM1951o04 instanceof String ? (String) objM1951o04 : null;
                            Object thisObject2 = chain6.getThisObject();
                            if (str != null && !C0034Be.m101P(str) && thisObject2 != null) {
                                Map<Object, String> map = c0706m86.f2661g;
                                C0631i9.m1481d(map, "prefUserNames");
                                map.put(thisObject2, str);
                            }
                            C0413Wf c0413Wf2 = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th2) {
                            C0920xd.m2206a(th2);
                        }
                        return chain6.proceed();
                    default:
                        XposedInterface.Chain chain7 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain7, "chain");
                        C0706m8 c0706m87 = this.f2307b;
                        if (C0706m8.m1610m() && !C0706m8.m1609k().isEmpty()) {
                            try {
                                List args5 = chain7.getArgs();
                                C0631i9.m1481d(args5, "getArgs(...)");
                                Object objM1951o05 = C0834t3.m1951o0(args5, 0);
                                list = C0198Kf.m549b(objM1951o05) ? (List) objM1951o05 : null;
                            } catch (Throwable th3) {
                                C0908x1.m2193a(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept error: " + th3.getClass().getSimpleName() + ": " + th3.getMessage()}, 1));
                            }
                            if (list == null) {
                                return chain7.proceed();
                            }
                            String str2 = c0706m87.f2661g.get(chain7.getThisObject());
                            if (str2 != null && !C0034Be.m101P(str2)) {
                                String strM1618j = c0706m87.m1618j();
                                if (strM1618j == null || !str2.equals(strM1618j)) {
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: profile " + str2 + " != self, native preview kept"}, 1));
                                } else {
                                    list.clear();
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: SELF profile (" + str2 + ") has hidden moments -> blank 4 previews"}, 1));
                                }
                                return chain7.proceed();
                            }
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: username not captured, skip (native)"}, 1));
                            return chain7.proceed();
                        }
                        return chain7.proceed();
                }
            }
        }).isEmpty()) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideOwnSns: com.tencent.mm.plugin.sns.ui.improve.component.h2.e(o0) NOT hooked"}, 1));
        } else {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: hooked com.tencent.mm.plugin.sns.ui.improve.component.h2.e(o0)"}, 1));
        }
        final int i3 = 0;
        if (C0173J8.m464b(c0173j8, this.f2655a, new C0586g2(22), new InterfaceC0064D7(this) { // from class: a.i8

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0706m8 f2307b;

            {
                this.f2307b = this;
            }

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
            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                List listM1607h;
                List list;
                switch (i3) {
                    case 0:
                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain, "chain");
                        C0706m8 c0706m8 = this.f2307b;
                        if (C0706m8.m1610m()) {
                            List args = chain.getArgs();
                            C0631i9.m1481d(args, "getArgs(...)");
                            Object objM1951o0 = C0834t3.m1951o0(args, 0);
                            List<?> list2 = C0198Kf.m549b(objM1951o0) ? (List) objM1951o0 : null;
                            Set<String> setM1609k = C0706m8.m1609k();
                            if (list2 != null && !setM1609k.isEmpty()) {
                                c0706m8.m1617f(list2, setM1609k);
                            }
                        }
                        return chain.proceed();
                    case 1:
                        C0706m8 c0706m82 = this.f2307b;
                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain2, "chain");
                        if (C0706m8.m1610m()) {
                            List args2 = chain2.getArgs();
                            C0631i9.m1481d(args2, "getArgs(...)");
                            Object objM1951o02 = C0834t3.m1951o0(args2, 0);
                            List list3 = C0198Kf.m549b(objM1951o02) ? (List) objM1951o02 : null;
                            Set<String> setM1609k2 = C0706m8.m1609k();
                            if (list3 != null && !setM1609k2.isEmpty()) {
                                c0706m82.f2662h = chain2.getThisObject();
                                c0706m82.f2663i = new ArrayList(list3);
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    if (c0706m82.m1622v(it.next(), setM1609k2)) {
                                        it.remove();
                                    }
                                }
                            }
                        }
                        return chain2.proceed();
                    case 2:
                        C0706m8 c0706m83 = this.f2307b;
                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain3, "chain");
                        chain3.proceed();
                        try {
                            c0706m83.m1619l(chain3);
                            C0413Wf c0413Wf = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th) {
                            C0920xd.m2206a(th);
                        }
                        return null;
                    case 3:
                        C0706m8 c0706m84 = this.f2307b;
                        XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain4, "chain");
                        Object objProceed = chain4.proceed();
                        if (C0706m8.m1610m() && !c0706m84.f2660f) {
                            Set<String> setM1609k3 = C0706m8.m1609k();
                            if (!setM1609k3.isEmpty()) {
                                c0706m84.f2660f = true;
                                try {
                                    Object thisObject = chain4.getThisObject();
                                    List listM1607h2 = C0706m8.m1607h(thisObject);
                                    if (listM1607h2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : listM1607h2) {
                                            if (!c0706m84.m1622v(obj2, setM1609k3)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        if (arrayList.size() != listM1607h2.size()) {
                                            C0706m8.m1615t(thisObject, arrayList);
                                            C0706m8.m1613p(thisObject);
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: timeline hide removed=" + (listM1607h2.size() - arrayList.size())}, 1));
                                        }
                                    }
                                    break;
                                } catch (Throwable unused) {
                                }
                                c0706m84.f2660f = false;
                            }
                        }
                        return objProceed;
                    case 4:
                        C0706m8 c0706m85 = this.f2307b;
                        XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain5, "chain");
                        List args3 = chain5.getArgs();
                        C0631i9.m1481d(args3, "getArgs(...)");
                        Object objM1951o03 = C0834t3.m1951o0(args3, 0);
                        chain5.proceed();
                        String name = objM1951o03 != null ? objM1951o03.getClass().getName() : "";
                        if (name.equals(c0706m85.f2656b)) {
                            c0706m85.f2658d = objM1951o03;
                            c0706m85.m1620r();
                        } else if (name.equals("com.tencent.mm.plugin.sns.ui.improve.component.h2")) {
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        } else if (objM1951o03 != null && (listM1607h = C0706m8.m1607h(objM1951o03)) != null) {
                            Iterator it2 = listM1607h.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (next != null) {
                                        String name2 = next.getClass().getName();
                                        if (name2.endsWith(c0706m85.f2657c) || name2.endsWith(C0015Ae.m48G(c0706m85.f2657c, ".", "$"))) {
                                        }
                                    }
                                }
                            }
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        }
                        return null;
                    case 5:
                        C0706m8 c0706m86 = this.f2307b;
                        XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain6, "chain");
                        try {
                            List args4 = chain6.getArgs();
                            C0631i9.m1481d(args4, "getArgs(...)");
                            Object objM1951o04 = C0834t3.m1951o0(args4, 0);
                            String str = objM1951o04 instanceof String ? (String) objM1951o04 : null;
                            Object thisObject2 = chain6.getThisObject();
                            if (str != null && !C0034Be.m101P(str) && thisObject2 != null) {
                                Map<Object, String> map = c0706m86.f2661g;
                                C0631i9.m1481d(map, "prefUserNames");
                                map.put(thisObject2, str);
                            }
                            C0413Wf c0413Wf2 = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th2) {
                            C0920xd.m2206a(th2);
                        }
                        return chain6.proceed();
                    default:
                        XposedInterface.Chain chain7 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain7, "chain");
                        C0706m8 c0706m87 = this.f2307b;
                        if (C0706m8.m1610m() && !C0706m8.m1609k().isEmpty()) {
                            try {
                                List args5 = chain7.getArgs();
                                C0631i9.m1481d(args5, "getArgs(...)");
                                Object objM1951o05 = C0834t3.m1951o0(args5, 0);
                                list = C0198Kf.m549b(objM1951o05) ? (List) objM1951o05 : null;
                            } catch (Throwable th3) {
                                C0908x1.m2193a(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept error: " + th3.getClass().getSimpleName() + ": " + th3.getMessage()}, 1));
                            }
                            if (list == null) {
                                return chain7.proceed();
                            }
                            String str2 = c0706m87.f2661g.get(chain7.getThisObject());
                            if (str2 != null && !C0034Be.m101P(str2)) {
                                String strM1618j = c0706m87.m1618j();
                                if (strM1618j == null || !str2.equals(strM1618j)) {
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: profile " + str2 + " != self, native preview kept"}, 1));
                                } else {
                                    list.clear();
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: SELF profile (" + str2 + ") has hidden moments -> blank 4 previews"}, 1));
                                }
                                return chain7.proceed();
                            }
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: username not captured, skip (native)"}, 1));
                            return chain7.proceed();
                        }
                        return chain7.proceed();
                }
            }
        }).isEmpty()) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideOwnSns: xc4.k.c(List) NOT hooked"}, 1));
        } else {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: hooked xc4.k.c(List)"}, 1));
        }
        final int i4 = 1;
        if (C0173J8.m464b(c0173j8, "com.tencent.mm.plugin.sns.ui.lp", new C0586g2(23), new InterfaceC0064D7(this) { // from class: a.i8

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0706m8 f2307b;

            {
                this.f2307b = this;
            }

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
            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                List listM1607h;
                List list;
                switch (i4) {
                    case 0:
                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain, "chain");
                        C0706m8 c0706m8 = this.f2307b;
                        if (C0706m8.m1610m()) {
                            List args = chain.getArgs();
                            C0631i9.m1481d(args, "getArgs(...)");
                            Object objM1951o0 = C0834t3.m1951o0(args, 0);
                            List<?> list2 = C0198Kf.m549b(objM1951o0) ? (List) objM1951o0 : null;
                            Set<String> setM1609k = C0706m8.m1609k();
                            if (list2 != null && !setM1609k.isEmpty()) {
                                c0706m8.m1617f(list2, setM1609k);
                            }
                        }
                        return chain.proceed();
                    case 1:
                        C0706m8 c0706m82 = this.f2307b;
                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain2, "chain");
                        if (C0706m8.m1610m()) {
                            List args2 = chain2.getArgs();
                            C0631i9.m1481d(args2, "getArgs(...)");
                            Object objM1951o02 = C0834t3.m1951o0(args2, 0);
                            List list3 = C0198Kf.m549b(objM1951o02) ? (List) objM1951o02 : null;
                            Set<String> setM1609k2 = C0706m8.m1609k();
                            if (list3 != null && !setM1609k2.isEmpty()) {
                                c0706m82.f2662h = chain2.getThisObject();
                                c0706m82.f2663i = new ArrayList(list3);
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    if (c0706m82.m1622v(it.next(), setM1609k2)) {
                                        it.remove();
                                    }
                                }
                            }
                        }
                        return chain2.proceed();
                    case 2:
                        C0706m8 c0706m83 = this.f2307b;
                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain3, "chain");
                        chain3.proceed();
                        try {
                            c0706m83.m1619l(chain3);
                            C0413Wf c0413Wf = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th) {
                            C0920xd.m2206a(th);
                        }
                        return null;
                    case 3:
                        C0706m8 c0706m84 = this.f2307b;
                        XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain4, "chain");
                        Object objProceed = chain4.proceed();
                        if (C0706m8.m1610m() && !c0706m84.f2660f) {
                            Set<String> setM1609k3 = C0706m8.m1609k();
                            if (!setM1609k3.isEmpty()) {
                                c0706m84.f2660f = true;
                                try {
                                    Object thisObject = chain4.getThisObject();
                                    List listM1607h2 = C0706m8.m1607h(thisObject);
                                    if (listM1607h2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : listM1607h2) {
                                            if (!c0706m84.m1622v(obj2, setM1609k3)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        if (arrayList.size() != listM1607h2.size()) {
                                            C0706m8.m1615t(thisObject, arrayList);
                                            C0706m8.m1613p(thisObject);
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: timeline hide removed=" + (listM1607h2.size() - arrayList.size())}, 1));
                                        }
                                    }
                                    break;
                                } catch (Throwable unused) {
                                }
                                c0706m84.f2660f = false;
                            }
                        }
                        return objProceed;
                    case 4:
                        C0706m8 c0706m85 = this.f2307b;
                        XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain5, "chain");
                        List args3 = chain5.getArgs();
                        C0631i9.m1481d(args3, "getArgs(...)");
                        Object objM1951o03 = C0834t3.m1951o0(args3, 0);
                        chain5.proceed();
                        String name = objM1951o03 != null ? objM1951o03.getClass().getName() : "";
                        if (name.equals(c0706m85.f2656b)) {
                            c0706m85.f2658d = objM1951o03;
                            c0706m85.m1620r();
                        } else if (name.equals("com.tencent.mm.plugin.sns.ui.improve.component.h2")) {
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        } else if (objM1951o03 != null && (listM1607h = C0706m8.m1607h(objM1951o03)) != null) {
                            Iterator it2 = listM1607h.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (next != null) {
                                        String name2 = next.getClass().getName();
                                        if (name2.endsWith(c0706m85.f2657c) || name2.endsWith(C0015Ae.m48G(c0706m85.f2657c, ".", "$"))) {
                                        }
                                    }
                                }
                            }
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        }
                        return null;
                    case 5:
                        C0706m8 c0706m86 = this.f2307b;
                        XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain6, "chain");
                        try {
                            List args4 = chain6.getArgs();
                            C0631i9.m1481d(args4, "getArgs(...)");
                            Object objM1951o04 = C0834t3.m1951o0(args4, 0);
                            String str = objM1951o04 instanceof String ? (String) objM1951o04 : null;
                            Object thisObject2 = chain6.getThisObject();
                            if (str != null && !C0034Be.m101P(str) && thisObject2 != null) {
                                Map<Object, String> map = c0706m86.f2661g;
                                C0631i9.m1481d(map, "prefUserNames");
                                map.put(thisObject2, str);
                            }
                            C0413Wf c0413Wf2 = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th2) {
                            C0920xd.m2206a(th2);
                        }
                        return chain6.proceed();
                    default:
                        XposedInterface.Chain chain7 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain7, "chain");
                        C0706m8 c0706m87 = this.f2307b;
                        if (C0706m8.m1610m() && !C0706m8.m1609k().isEmpty()) {
                            try {
                                List args5 = chain7.getArgs();
                                C0631i9.m1481d(args5, "getArgs(...)");
                                Object objM1951o05 = C0834t3.m1951o0(args5, 0);
                                list = C0198Kf.m549b(objM1951o05) ? (List) objM1951o05 : null;
                            } catch (Throwable th3) {
                                C0908x1.m2193a(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept error: " + th3.getClass().getSimpleName() + ": " + th3.getMessage()}, 1));
                            }
                            if (list == null) {
                                return chain7.proceed();
                            }
                            String str2 = c0706m87.f2661g.get(chain7.getThisObject());
                            if (str2 != null && !C0034Be.m101P(str2)) {
                                String strM1618j = c0706m87.m1618j();
                                if (strM1618j == null || !str2.equals(strM1618j)) {
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: profile " + str2 + " != self, native preview kept"}, 1));
                                } else {
                                    list.clear();
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: SELF profile (" + str2 + ") has hidden moments -> blank 4 previews"}, 1));
                                }
                                return chain7.proceed();
                            }
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: username not captured, skip (native)"}, 1));
                            return chain7.proceed();
                        }
                        return chain7.proceed();
                }
            }
        }).isEmpty()) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideOwnSns: com.tencent.mm.plugin.sns.ui.lp.c(List) NOT hooked"}, 1));
        } else {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: hooked com.tencent.mm.plugin.sns.ui.lp.c(List)"}, 1));
        }
        for (String str : C0739o3.m1757d0("com.tencent.mm.view.recyclerview.WxRecyclerView", "androidx.recyclerview.widget.RecyclerView")) {
            final int i5 = 4;
            ArrayList arrayListM464b = C0173J8.m464b(c0173j8, str, new C0586g2(29), new InterfaceC0064D7(this) { // from class: a.i8

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0706m8 f2307b;

                {
                    this.f2307b = this;
                }

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
                @Override // p000a.InterfaceC0064D7
                /* JADX INFO: renamed from: f */
                public final Object mo53f(Object obj) {
                    List listM1607h;
                    List list;
                    switch (i5) {
                        case 0:
                            XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain, "chain");
                            C0706m8 c0706m8 = this.f2307b;
                            if (C0706m8.m1610m()) {
                                List args = chain.getArgs();
                                C0631i9.m1481d(args, "getArgs(...)");
                                Object objM1951o0 = C0834t3.m1951o0(args, 0);
                                List<?> list2 = C0198Kf.m549b(objM1951o0) ? (List) objM1951o0 : null;
                                Set<String> setM1609k = C0706m8.m1609k();
                                if (list2 != null && !setM1609k.isEmpty()) {
                                    c0706m8.m1617f(list2, setM1609k);
                                }
                            }
                            return chain.proceed();
                        case 1:
                            C0706m8 c0706m82 = this.f2307b;
                            XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain2, "chain");
                            if (C0706m8.m1610m()) {
                                List args2 = chain2.getArgs();
                                C0631i9.m1481d(args2, "getArgs(...)");
                                Object objM1951o02 = C0834t3.m1951o0(args2, 0);
                                List list3 = C0198Kf.m549b(objM1951o02) ? (List) objM1951o02 : null;
                                Set<String> setM1609k2 = C0706m8.m1609k();
                                if (list3 != null && !setM1609k2.isEmpty()) {
                                    c0706m82.f2662h = chain2.getThisObject();
                                    c0706m82.f2663i = new ArrayList(list3);
                                    Iterator it = list3.iterator();
                                    while (it.hasNext()) {
                                        if (c0706m82.m1622v(it.next(), setM1609k2)) {
                                            it.remove();
                                        }
                                    }
                                }
                            }
                            return chain2.proceed();
                        case 2:
                            C0706m8 c0706m83 = this.f2307b;
                            XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain3, "chain");
                            chain3.proceed();
                            try {
                                c0706m83.m1619l(chain3);
                                C0413Wf c0413Wf = C0413Wf.f1577a;
                                break;
                            } catch (Throwable th) {
                                C0920xd.m2206a(th);
                            }
                            return null;
                        case 3:
                            C0706m8 c0706m84 = this.f2307b;
                            XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain4, "chain");
                            Object objProceed = chain4.proceed();
                            if (C0706m8.m1610m() && !c0706m84.f2660f) {
                                Set<String> setM1609k3 = C0706m8.m1609k();
                                if (!setM1609k3.isEmpty()) {
                                    c0706m84.f2660f = true;
                                    try {
                                        Object thisObject = chain4.getThisObject();
                                        List listM1607h2 = C0706m8.m1607h(thisObject);
                                        if (listM1607h2 != null) {
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj2 : listM1607h2) {
                                                if (!c0706m84.m1622v(obj2, setM1609k3)) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                            if (arrayList.size() != listM1607h2.size()) {
                                                C0706m8.m1615t(thisObject, arrayList);
                                                C0706m8.m1613p(thisObject);
                                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: timeline hide removed=" + (listM1607h2.size() - arrayList.size())}, 1));
                                            }
                                        }
                                        break;
                                    } catch (Throwable unused) {
                                    }
                                    c0706m84.f2660f = false;
                                }
                            }
                            return objProceed;
                        case 4:
                            C0706m8 c0706m85 = this.f2307b;
                            XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain5, "chain");
                            List args3 = chain5.getArgs();
                            C0631i9.m1481d(args3, "getArgs(...)");
                            Object objM1951o03 = C0834t3.m1951o0(args3, 0);
                            chain5.proceed();
                            String name = objM1951o03 != null ? objM1951o03.getClass().getName() : "";
                            if (name.equals(c0706m85.f2656b)) {
                                c0706m85.f2658d = objM1951o03;
                                c0706m85.m1620r();
                            } else if (name.equals("com.tencent.mm.plugin.sns.ui.improve.component.h2")) {
                                c0706m85.f2659e = objM1951o03;
                                c0706m85.m1621s();
                            } else if (objM1951o03 != null && (listM1607h = C0706m8.m1607h(objM1951o03)) != null) {
                                Iterator it2 = listM1607h.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next = it2.next();
                                        if (next != null) {
                                            String name2 = next.getClass().getName();
                                            if (name2.endsWith(c0706m85.f2657c) || name2.endsWith(C0015Ae.m48G(c0706m85.f2657c, ".", "$"))) {
                                            }
                                        }
                                    }
                                }
                                c0706m85.f2659e = objM1951o03;
                                c0706m85.m1621s();
                            }
                            return null;
                        case 5:
                            C0706m8 c0706m86 = this.f2307b;
                            XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain6, "chain");
                            try {
                                List args4 = chain6.getArgs();
                                C0631i9.m1481d(args4, "getArgs(...)");
                                Object objM1951o04 = C0834t3.m1951o0(args4, 0);
                                String str2 = objM1951o04 instanceof String ? (String) objM1951o04 : null;
                                Object thisObject2 = chain6.getThisObject();
                                if (str2 != null && !C0034Be.m101P(str2) && thisObject2 != null) {
                                    Map<Object, String> map = c0706m86.f2661g;
                                    C0631i9.m1481d(map, "prefUserNames");
                                    map.put(thisObject2, str2);
                                }
                                C0413Wf c0413Wf2 = C0413Wf.f1577a;
                                break;
                            } catch (Throwable th2) {
                                C0920xd.m2206a(th2);
                            }
                            return chain6.proceed();
                        default:
                            XposedInterface.Chain chain7 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain7, "chain");
                            C0706m8 c0706m87 = this.f2307b;
                            if (C0706m8.m1610m() && !C0706m8.m1609k().isEmpty()) {
                                try {
                                    List args5 = chain7.getArgs();
                                    C0631i9.m1481d(args5, "getArgs(...)");
                                    Object objM1951o05 = C0834t3.m1951o0(args5, 0);
                                    list = C0198Kf.m549b(objM1951o05) ? (List) objM1951o05 : null;
                                } catch (Throwable th3) {
                                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept error: " + th3.getClass().getSimpleName() + ": " + th3.getMessage()}, 1));
                                }
                                if (list == null) {
                                    return chain7.proceed();
                                }
                                String str22 = c0706m87.f2661g.get(chain7.getThisObject());
                                if (str22 != null && !C0034Be.m101P(str22)) {
                                    String strM1618j = c0706m87.m1618j();
                                    if (strM1618j == null || !str22.equals(strM1618j)) {
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: profile " + str22 + " != self, native preview kept"}, 1));
                                    } else {
                                        list.clear();
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: SELF profile (" + str22 + ") has hidden moments -> blank 4 previews"}, 1));
                                    }
                                    return chain7.proceed();
                                }
                                C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: username not captured, skip (native)"}, 1));
                                return chain7.proceed();
                            }
                            return chain7.proceed();
                    }
                }
            });
            if (arrayListM464b.isEmpty()) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2227g("HideOwnSns: ", str, ".setAdapter hook FAILED")}, 1));
            } else {
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: " + str + ".setAdapter hooked (" + arrayListM464b.size() + ")"}, 1));
            }
        }
        final int i6 = 5;
        C0173J8.m464b(c0173j8, "com.tencent.mm.pluginsdk.ui.preference.SnsPreference", new C0687l8(0), new InterfaceC0064D7(this) { // from class: a.i8

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0706m8 f2307b;

            {
                this.f2307b = this;
            }

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
            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                List listM1607h;
                List list;
                switch (i6) {
                    case 0:
                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain, "chain");
                        C0706m8 c0706m8 = this.f2307b;
                        if (C0706m8.m1610m()) {
                            List args = chain.getArgs();
                            C0631i9.m1481d(args, "getArgs(...)");
                            Object objM1951o0 = C0834t3.m1951o0(args, 0);
                            List<?> list2 = C0198Kf.m549b(objM1951o0) ? (List) objM1951o0 : null;
                            Set<String> setM1609k = C0706m8.m1609k();
                            if (list2 != null && !setM1609k.isEmpty()) {
                                c0706m8.m1617f(list2, setM1609k);
                            }
                        }
                        return chain.proceed();
                    case 1:
                        C0706m8 c0706m82 = this.f2307b;
                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain2, "chain");
                        if (C0706m8.m1610m()) {
                            List args2 = chain2.getArgs();
                            C0631i9.m1481d(args2, "getArgs(...)");
                            Object objM1951o02 = C0834t3.m1951o0(args2, 0);
                            List list3 = C0198Kf.m549b(objM1951o02) ? (List) objM1951o02 : null;
                            Set<String> setM1609k2 = C0706m8.m1609k();
                            if (list3 != null && !setM1609k2.isEmpty()) {
                                c0706m82.f2662h = chain2.getThisObject();
                                c0706m82.f2663i = new ArrayList(list3);
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    if (c0706m82.m1622v(it.next(), setM1609k2)) {
                                        it.remove();
                                    }
                                }
                            }
                        }
                        return chain2.proceed();
                    case 2:
                        C0706m8 c0706m83 = this.f2307b;
                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain3, "chain");
                        chain3.proceed();
                        try {
                            c0706m83.m1619l(chain3);
                            C0413Wf c0413Wf = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th) {
                            C0920xd.m2206a(th);
                        }
                        return null;
                    case 3:
                        C0706m8 c0706m84 = this.f2307b;
                        XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain4, "chain");
                        Object objProceed = chain4.proceed();
                        if (C0706m8.m1610m() && !c0706m84.f2660f) {
                            Set<String> setM1609k3 = C0706m8.m1609k();
                            if (!setM1609k3.isEmpty()) {
                                c0706m84.f2660f = true;
                                try {
                                    Object thisObject = chain4.getThisObject();
                                    List listM1607h2 = C0706m8.m1607h(thisObject);
                                    if (listM1607h2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : listM1607h2) {
                                            if (!c0706m84.m1622v(obj2, setM1609k3)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        if (arrayList.size() != listM1607h2.size()) {
                                            C0706m8.m1615t(thisObject, arrayList);
                                            C0706m8.m1613p(thisObject);
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: timeline hide removed=" + (listM1607h2.size() - arrayList.size())}, 1));
                                        }
                                    }
                                    break;
                                } catch (Throwable unused) {
                                }
                                c0706m84.f2660f = false;
                            }
                        }
                        return objProceed;
                    case 4:
                        C0706m8 c0706m85 = this.f2307b;
                        XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain5, "chain");
                        List args3 = chain5.getArgs();
                        C0631i9.m1481d(args3, "getArgs(...)");
                        Object objM1951o03 = C0834t3.m1951o0(args3, 0);
                        chain5.proceed();
                        String name = objM1951o03 != null ? objM1951o03.getClass().getName() : "";
                        if (name.equals(c0706m85.f2656b)) {
                            c0706m85.f2658d = objM1951o03;
                            c0706m85.m1620r();
                        } else if (name.equals("com.tencent.mm.plugin.sns.ui.improve.component.h2")) {
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        } else if (objM1951o03 != null && (listM1607h = C0706m8.m1607h(objM1951o03)) != null) {
                            Iterator it2 = listM1607h.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (next != null) {
                                        String name2 = next.getClass().getName();
                                        if (name2.endsWith(c0706m85.f2657c) || name2.endsWith(C0015Ae.m48G(c0706m85.f2657c, ".", "$"))) {
                                        }
                                    }
                                }
                            }
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        }
                        return null;
                    case 5:
                        C0706m8 c0706m86 = this.f2307b;
                        XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain6, "chain");
                        try {
                            List args4 = chain6.getArgs();
                            C0631i9.m1481d(args4, "getArgs(...)");
                            Object objM1951o04 = C0834t3.m1951o0(args4, 0);
                            String str2 = objM1951o04 instanceof String ? (String) objM1951o04 : null;
                            Object thisObject2 = chain6.getThisObject();
                            if (str2 != null && !C0034Be.m101P(str2) && thisObject2 != null) {
                                Map<Object, String> map = c0706m86.f2661g;
                                C0631i9.m1481d(map, "prefUserNames");
                                map.put(thisObject2, str2);
                            }
                            C0413Wf c0413Wf2 = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th2) {
                            C0920xd.m2206a(th2);
                        }
                        return chain6.proceed();
                    default:
                        XposedInterface.Chain chain7 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain7, "chain");
                        C0706m8 c0706m87 = this.f2307b;
                        if (C0706m8.m1610m() && !C0706m8.m1609k().isEmpty()) {
                            try {
                                List args5 = chain7.getArgs();
                                C0631i9.m1481d(args5, "getArgs(...)");
                                Object objM1951o05 = C0834t3.m1951o0(args5, 0);
                                list = C0198Kf.m549b(objM1951o05) ? (List) objM1951o05 : null;
                            } catch (Throwable th3) {
                                C0908x1.m2193a(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept error: " + th3.getClass().getSimpleName() + ": " + th3.getMessage()}, 1));
                            }
                            if (list == null) {
                                return chain7.proceed();
                            }
                            String str22 = c0706m87.f2661g.get(chain7.getThisObject());
                            if (str22 != null && !C0034Be.m101P(str22)) {
                                String strM1618j = c0706m87.m1618j();
                                if (strM1618j == null || !str22.equals(strM1618j)) {
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: profile " + str22 + " != self, native preview kept"}, 1));
                                } else {
                                    list.clear();
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: SELF profile (" + str22 + ") has hidden moments -> blank 4 previews"}, 1));
                                }
                                return chain7.proceed();
                            }
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: username not captured, skip (native)"}, 1));
                            return chain7.proceed();
                        }
                        return chain7.proceed();
                }
            }
        });
        final int i7 = 6;
        C0173J8.m464b(c0173j8, "com.tencent.mm.pluginsdk.ui.preference.SnsPreference", new C0687l8(1), new InterfaceC0064D7(this) { // from class: a.i8

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0706m8 f2307b;

            {
                this.f2307b = this;
            }

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
            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                List listM1607h;
                List list;
                switch (i7) {
                    case 0:
                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain, "chain");
                        C0706m8 c0706m8 = this.f2307b;
                        if (C0706m8.m1610m()) {
                            List args = chain.getArgs();
                            C0631i9.m1481d(args, "getArgs(...)");
                            Object objM1951o0 = C0834t3.m1951o0(args, 0);
                            List<?> list2 = C0198Kf.m549b(objM1951o0) ? (List) objM1951o0 : null;
                            Set<String> setM1609k = C0706m8.m1609k();
                            if (list2 != null && !setM1609k.isEmpty()) {
                                c0706m8.m1617f(list2, setM1609k);
                            }
                        }
                        return chain.proceed();
                    case 1:
                        C0706m8 c0706m82 = this.f2307b;
                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain2, "chain");
                        if (C0706m8.m1610m()) {
                            List args2 = chain2.getArgs();
                            C0631i9.m1481d(args2, "getArgs(...)");
                            Object objM1951o02 = C0834t3.m1951o0(args2, 0);
                            List list3 = C0198Kf.m549b(objM1951o02) ? (List) objM1951o02 : null;
                            Set<String> setM1609k2 = C0706m8.m1609k();
                            if (list3 != null && !setM1609k2.isEmpty()) {
                                c0706m82.f2662h = chain2.getThisObject();
                                c0706m82.f2663i = new ArrayList(list3);
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    if (c0706m82.m1622v(it.next(), setM1609k2)) {
                                        it.remove();
                                    }
                                }
                            }
                        }
                        return chain2.proceed();
                    case 2:
                        C0706m8 c0706m83 = this.f2307b;
                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain3, "chain");
                        chain3.proceed();
                        try {
                            c0706m83.m1619l(chain3);
                            C0413Wf c0413Wf = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th) {
                            C0920xd.m2206a(th);
                        }
                        return null;
                    case 3:
                        C0706m8 c0706m84 = this.f2307b;
                        XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain4, "chain");
                        Object objProceed = chain4.proceed();
                        if (C0706m8.m1610m() && !c0706m84.f2660f) {
                            Set<String> setM1609k3 = C0706m8.m1609k();
                            if (!setM1609k3.isEmpty()) {
                                c0706m84.f2660f = true;
                                try {
                                    Object thisObject = chain4.getThisObject();
                                    List listM1607h2 = C0706m8.m1607h(thisObject);
                                    if (listM1607h2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : listM1607h2) {
                                            if (!c0706m84.m1622v(obj2, setM1609k3)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        if (arrayList.size() != listM1607h2.size()) {
                                            C0706m8.m1615t(thisObject, arrayList);
                                            C0706m8.m1613p(thisObject);
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: timeline hide removed=" + (listM1607h2.size() - arrayList.size())}, 1));
                                        }
                                    }
                                    break;
                                } catch (Throwable unused) {
                                }
                                c0706m84.f2660f = false;
                            }
                        }
                        return objProceed;
                    case 4:
                        C0706m8 c0706m85 = this.f2307b;
                        XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain5, "chain");
                        List args3 = chain5.getArgs();
                        C0631i9.m1481d(args3, "getArgs(...)");
                        Object objM1951o03 = C0834t3.m1951o0(args3, 0);
                        chain5.proceed();
                        String name = objM1951o03 != null ? objM1951o03.getClass().getName() : "";
                        if (name.equals(c0706m85.f2656b)) {
                            c0706m85.f2658d = objM1951o03;
                            c0706m85.m1620r();
                        } else if (name.equals("com.tencent.mm.plugin.sns.ui.improve.component.h2")) {
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        } else if (objM1951o03 != null && (listM1607h = C0706m8.m1607h(objM1951o03)) != null) {
                            Iterator it2 = listM1607h.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (next != null) {
                                        String name2 = next.getClass().getName();
                                        if (name2.endsWith(c0706m85.f2657c) || name2.endsWith(C0015Ae.m48G(c0706m85.f2657c, ".", "$"))) {
                                        }
                                    }
                                }
                            }
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        }
                        return null;
                    case 5:
                        C0706m8 c0706m86 = this.f2307b;
                        XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain6, "chain");
                        try {
                            List args4 = chain6.getArgs();
                            C0631i9.m1481d(args4, "getArgs(...)");
                            Object objM1951o04 = C0834t3.m1951o0(args4, 0);
                            String str2 = objM1951o04 instanceof String ? (String) objM1951o04 : null;
                            Object thisObject2 = chain6.getThisObject();
                            if (str2 != null && !C0034Be.m101P(str2) && thisObject2 != null) {
                                Map<Object, String> map = c0706m86.f2661g;
                                C0631i9.m1481d(map, "prefUserNames");
                                map.put(thisObject2, str2);
                            }
                            C0413Wf c0413Wf2 = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th2) {
                            C0920xd.m2206a(th2);
                        }
                        return chain6.proceed();
                    default:
                        XposedInterface.Chain chain7 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain7, "chain");
                        C0706m8 c0706m87 = this.f2307b;
                        if (C0706m8.m1610m() && !C0706m8.m1609k().isEmpty()) {
                            try {
                                List args5 = chain7.getArgs();
                                C0631i9.m1481d(args5, "getArgs(...)");
                                Object objM1951o05 = C0834t3.m1951o0(args5, 0);
                                list = C0198Kf.m549b(objM1951o05) ? (List) objM1951o05 : null;
                            } catch (Throwable th3) {
                                C0908x1.m2193a(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept error: " + th3.getClass().getSimpleName() + ": " + th3.getMessage()}, 1));
                            }
                            if (list == null) {
                                return chain7.proceed();
                            }
                            String str22 = c0706m87.f2661g.get(chain7.getThisObject());
                            if (str22 != null && !C0034Be.m101P(str22)) {
                                String strM1618j = c0706m87.m1618j();
                                if (strM1618j == null || !str22.equals(strM1618j)) {
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: profile " + str22 + " != self, native preview kept"}, 1));
                                } else {
                                    list.clear();
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: SELF profile (" + str22 + ") has hidden moments -> blank 4 previews"}, 1));
                                }
                                return chain7.proceed();
                            }
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: username not captured, skip (native)"}, 1));
                            return chain7.proceed();
                        }
                        return chain7.proceed();
                }
            }
        });
        C0173J8.m464b(c0173j8, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI", new C0586g2(24), new C0586g2(25, this));
        C0173J8.m464b(c0173j8, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI", new C0586g2(26), new C0586g2(27, this));
        final int i8 = 2;
        if (C0173J8.m464b(c0173j8, "com.tencent.mm.plugin.sns.ui.bm", new C0586g2(21), new InterfaceC0064D7(this) { // from class: a.i8

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0706m8 f2307b;

            {
                this.f2307b = this;
            }

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
            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                List listM1607h;
                List list;
                switch (i8) {
                    case 0:
                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain, "chain");
                        C0706m8 c0706m8 = this.f2307b;
                        if (C0706m8.m1610m()) {
                            List args = chain.getArgs();
                            C0631i9.m1481d(args, "getArgs(...)");
                            Object objM1951o0 = C0834t3.m1951o0(args, 0);
                            List<?> list2 = C0198Kf.m549b(objM1951o0) ? (List) objM1951o0 : null;
                            Set<String> setM1609k = C0706m8.m1609k();
                            if (list2 != null && !setM1609k.isEmpty()) {
                                c0706m8.m1617f(list2, setM1609k);
                            }
                        }
                        return chain.proceed();
                    case 1:
                        C0706m8 c0706m82 = this.f2307b;
                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain2, "chain");
                        if (C0706m8.m1610m()) {
                            List args2 = chain2.getArgs();
                            C0631i9.m1481d(args2, "getArgs(...)");
                            Object objM1951o02 = C0834t3.m1951o0(args2, 0);
                            List list3 = C0198Kf.m549b(objM1951o02) ? (List) objM1951o02 : null;
                            Set<String> setM1609k2 = C0706m8.m1609k();
                            if (list3 != null && !setM1609k2.isEmpty()) {
                                c0706m82.f2662h = chain2.getThisObject();
                                c0706m82.f2663i = new ArrayList(list3);
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    if (c0706m82.m1622v(it.next(), setM1609k2)) {
                                        it.remove();
                                    }
                                }
                            }
                        }
                        return chain2.proceed();
                    case 2:
                        C0706m8 c0706m83 = this.f2307b;
                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain3, "chain");
                        chain3.proceed();
                        try {
                            c0706m83.m1619l(chain3);
                            C0413Wf c0413Wf = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th) {
                            C0920xd.m2206a(th);
                        }
                        return null;
                    case 3:
                        C0706m8 c0706m84 = this.f2307b;
                        XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain4, "chain");
                        Object objProceed = chain4.proceed();
                        if (C0706m8.m1610m() && !c0706m84.f2660f) {
                            Set<String> setM1609k3 = C0706m8.m1609k();
                            if (!setM1609k3.isEmpty()) {
                                c0706m84.f2660f = true;
                                try {
                                    Object thisObject = chain4.getThisObject();
                                    List listM1607h2 = C0706m8.m1607h(thisObject);
                                    if (listM1607h2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : listM1607h2) {
                                            if (!c0706m84.m1622v(obj2, setM1609k3)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        if (arrayList.size() != listM1607h2.size()) {
                                            C0706m8.m1615t(thisObject, arrayList);
                                            C0706m8.m1613p(thisObject);
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: timeline hide removed=" + (listM1607h2.size() - arrayList.size())}, 1));
                                        }
                                    }
                                    break;
                                } catch (Throwable unused) {
                                }
                                c0706m84.f2660f = false;
                            }
                        }
                        return objProceed;
                    case 4:
                        C0706m8 c0706m85 = this.f2307b;
                        XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain5, "chain");
                        List args3 = chain5.getArgs();
                        C0631i9.m1481d(args3, "getArgs(...)");
                        Object objM1951o03 = C0834t3.m1951o0(args3, 0);
                        chain5.proceed();
                        String name = objM1951o03 != null ? objM1951o03.getClass().getName() : "";
                        if (name.equals(c0706m85.f2656b)) {
                            c0706m85.f2658d = objM1951o03;
                            c0706m85.m1620r();
                        } else if (name.equals("com.tencent.mm.plugin.sns.ui.improve.component.h2")) {
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        } else if (objM1951o03 != null && (listM1607h = C0706m8.m1607h(objM1951o03)) != null) {
                            Iterator it2 = listM1607h.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (next != null) {
                                        String name2 = next.getClass().getName();
                                        if (name2.endsWith(c0706m85.f2657c) || name2.endsWith(C0015Ae.m48G(c0706m85.f2657c, ".", "$"))) {
                                        }
                                    }
                                }
                            }
                            c0706m85.f2659e = objM1951o03;
                            c0706m85.m1621s();
                        }
                        return null;
                    case 5:
                        C0706m8 c0706m86 = this.f2307b;
                        XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain6, "chain");
                        try {
                            List args4 = chain6.getArgs();
                            C0631i9.m1481d(args4, "getArgs(...)");
                            Object objM1951o04 = C0834t3.m1951o0(args4, 0);
                            String str2 = objM1951o04 instanceof String ? (String) objM1951o04 : null;
                            Object thisObject2 = chain6.getThisObject();
                            if (str2 != null && !C0034Be.m101P(str2) && thisObject2 != null) {
                                Map<Object, String> map = c0706m86.f2661g;
                                C0631i9.m1481d(map, "prefUserNames");
                                map.put(thisObject2, str2);
                            }
                            C0413Wf c0413Wf2 = C0413Wf.f1577a;
                            break;
                        } catch (Throwable th2) {
                            C0920xd.m2206a(th2);
                        }
                        return chain6.proceed();
                    default:
                        XposedInterface.Chain chain7 = (XposedInterface.Chain) obj;
                        C0631i9.m1482e(chain7, "chain");
                        C0706m8 c0706m87 = this.f2307b;
                        if (C0706m8.m1610m() && !C0706m8.m1609k().isEmpty()) {
                            try {
                                List args5 = chain7.getArgs();
                                C0631i9.m1481d(args5, "getArgs(...)");
                                Object objM1951o05 = C0834t3.m1951o0(args5, 0);
                                list = C0198Kf.m549b(objM1951o05) ? (List) objM1951o05 : null;
                            } catch (Throwable th3) {
                                C0908x1.m2193a(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept error: " + th3.getClass().getSimpleName() + ": " + th3.getMessage()}, 1));
                            }
                            if (list == null) {
                                return chain7.proceed();
                            }
                            String str22 = c0706m87.f2661g.get(chain7.getThisObject());
                            if (str22 != null && !C0034Be.m101P(str22)) {
                                String strM1618j = c0706m87.m1618j();
                                if (strM1618j == null || !str22.equals(strM1618j)) {
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: profile " + str22 + " != self, native preview kept"}, 1));
                                } else {
                                    list.clear();
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: SELF profile (" + str22 + ") has hidden moments -> blank 4 previews"}, 1));
                                }
                                return chain7.proceed();
                            }
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideOwnSns: N intercept: username not captured, skip (native)"}, 1));
                            return chain7.proceed();
                        }
                        return chain7.proceed();
                }
            }
        }).isEmpty()) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideOwnSns: com.tencent.mm.plugin.sns.ui.bm.q() NOT hooked"}, 1));
        } else {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: hooked com.tencent.mm.plugin.sns.ui.bm.q() (notify list filter)"}, 1));
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: handleHook DONE"}, 1));
        C0083E8.m209b("F008", "hideOwnSns", "album+timeline+profile");
    }

    /* JADX INFO: renamed from: j */
    public final String m1618j() {
        Object objM2206a;
        if (this.f2665k) {
            return this.f2664j;
        }
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
            Context context = objInvoke instanceof Context ? (Context) objInvoke : null;
            SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("com.tencent.mm_preferences", 0) : null;
            objM2206a = sharedPreferences != null ? sharedPreferences.getString("login_weixin_username", null) : null;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        String str = (String) (objM2206a instanceof C0901wd.a ? null : objM2206a);
        this.f2664j = str;
        this.f2665k = true;
        return str;
    }

    /* JADX INFO: renamed from: l */
    public final void m1619l(XposedInterface.Chain chain) throws IllegalAccessException {
        Object thisObject;
        if (m1610m()) {
            Set setM1609k = m1609k();
            if (setM1609k.isEmpty() || (thisObject = chain.getThisObject()) == null) {
                return;
            }
            Object objM1608i = m1608i(thisObject, "f212584f");
            Cursor cursor = objM1608i instanceof Cursor ? (Cursor) objM1608i : null;
            if (cursor == null || (cursor instanceof b)) {
                return;
            }
            b bVar = new b(cursor, setM1609k);
            m1616u(thisObject, bVar, "f212584f");
            m1616u(thisObject, -1, "f212587i");
            m1616u(thisObject, null, "f212585g");
            m1613p(thisObject);
            int[] iArr = bVar.f2668c;
            int length = iArr.length;
            int length2 = iArr.length;
            int i = bVar.f2670e;
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideOwnSns: SnsMsgUI notify scan: total=" + i + " kept=" + length + " removed=" + (i - length2) + " hiddenSet=" + setM1609k.size() + " candidates=" + C0238N1.m631e0(bVar.f2669d, " | ", null, 62)}, 1));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1620r() {
        Object obj = this.f2658d;
        if (obj != null && m1610m()) {
            Set setM1609k = m1609k();
            if (setM1609k.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC0649j8(this, obj, setM1609k, 1));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1621s() {
        Object obj = this.f2659e;
        if (obj != null && m1610m()) {
            Set setM1609k = m1609k();
            if (setM1609k.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC0649j8(this, obj, setM1609k, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[PHI: r3
  0x0082: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v2 java.lang.String) binds: [B:28:0x0080, B:39:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1622v(Object obj, Set<String> set) {
        String str;
        Field declaredField;
        Field declaredField2;
        if (obj == null) {
            return false;
        }
        Collection collectionM1959w0 = C0439Y5.f1645a;
        String name = obj.getClass().getName();
        if (name.endsWith(this.f2657c) || name.endsWith(C0015Ae.m48G(this.f2657c, ".", "$"))) {
            ArrayList arrayList = new ArrayList();
            Object objM1603c = m1603c(obj, "n");
            if (objM1603c != null) {
                Object objM1608i = m1608i(objM1603c, "l1");
                Object objM1603c2 = objM1608i != null ? m1603c(objM1608i, "getValue") : null;
                if (objM1603c2 != null) {
                    String strM1614q = m1614q(objM1603c2, "field_snsId");
                    if (strM1614q != null && !C0034Be.m101P(strM1614q)) {
                        String strM104S = C0034Be.m104S(C0034Be.m104S(strM1614q, "sns_table_"), "ad_table_");
                        if (!C0034Be.m101P(strM104S)) {
                            String strM1612o = m1612o(strM104S);
                            if (strM1612o.length() > 0) {
                                arrayList.add(strM1612o);
                            }
                        }
                    }
                    m1602b(this, arrayList, m1614q(objM1603c2, "field_stringSeq"));
                }
                Object objM1608i2 = m1608i(objM1603c, "y0");
                Object objM1603c3 = objM1608i2 != null ? m1603c(objM1608i2, "getValue") : null;
                if (objM1603c3 != null) {
                    m1602b(this, arrayList, objM1603c3.toString());
                }
                Object objM1603c4 = m1603c(objM1603c, "v");
                string = objM1603c4 != null ? objM1603c4.toString() : null;
                if (string != null && !C0034Be.m101P(string)) {
                    String strM104S2 = C0034Be.m104S(C0034Be.m104S(string, "sns_table_"), "ad_table_");
                    if (!C0034Be.m101P(strM104S2)) {
                        String strM1612o2 = m1612o(strM104S2);
                        if (strM1612o2.length() > 0) {
                            arrayList.add(strM1612o2);
                        }
                    }
                }
                Object objM1603c5 = m1603c(objM1603c, "U0");
                if (objM1603c5 != null) {
                    m1602b(this, arrayList, objM1603c5.toString());
                }
                collectionM1959w0 = C0834t3.m1959w0(new LinkedHashSet(arrayList));
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            String strM1614q2 = m1614q(obj, "field_snsId");
            if (strM1614q2 != null && !C0034Be.m101P(strM1614q2)) {
                String strM104S3 = C0034Be.m104S(C0034Be.m104S(strM1614q2, "sns_table_"), "ad_table_");
                if (!C0034Be.m101P(strM104S3)) {
                    String strM1612o3 = m1612o(strM104S3);
                    if (strM1612o3.length() > 0) {
                        arrayList2.add(strM1612o3);
                    }
                }
            }
            m1602b(this, arrayList2, m1614q(obj, "field_stringSeq"));
            Class<?> superclass = obj.getClass();
            while (true) {
                str = "localid";
                if (superclass == null || superclass.equals(Object.class)) {
                    break;
                }
                try {
                    declaredField = superclass.getDeclaredField("localid");
                    break;
                } catch (NoSuchFieldException unused) {
                    superclass = superclass.getSuperclass();
                }
            }
            if (declaredField != null) {
                string = str;
                if (string != null) {
                    m1602b(this, arrayList2, m1614q(obj, string));
                }
                collectionM1959w0 = C0834t3.m1959w0(new LinkedHashSet(arrayList2));
            } else {
                Class<?> superclass2 = obj.getClass();
                while (true) {
                    str = "field_localId";
                    if (superclass2 == null || superclass2.equals(Object.class)) {
                        break;
                    }
                    try {
                        declaredField2 = superclass2.getDeclaredField("field_localId");
                        break;
                    } catch (NoSuchFieldException unused2) {
                        superclass2 = superclass2.getSuperclass();
                    }
                }
                if (declaredField2 != null) {
                }
                if (string != null) {
                }
                collectionM1959w0 = C0834t3.m1959w0(new LinkedHashSet(arrayList2));
            }
        }
        if (collectionM1959w0.isEmpty()) {
            return false;
        }
        Iterator it = collectionM1959w0.iterator();
        while (it.hasNext()) {
            if (set.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
