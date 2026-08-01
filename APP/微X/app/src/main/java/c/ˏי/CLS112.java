// Decompiled by JEB v5.42.0.202606242140

package c.ˏי;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import c.ˏᵎ.CLS185;
import dalvik.system.DexFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CLS112 {
    public static final Set FLD407;
    public static final ConcurrentHashMap FLD408;
    public static final ConcurrentHashMap FLD409;
    public static final Set FLD410;
    public static final ConcurrentHashMap FLD411;
    public static final Set FLD412;

    static {
        CLS112.FLD411 = new ConcurrentHashMap();
        CLS112.FLD409 = new ConcurrentHashMap();
        CLS112.FLD412 = Collections.synchronizedSet(new HashSet());
        CLS112.FLD407 = Collections.synchronizedSet(new HashSet());
        CLS112.FLD408 = new ConcurrentHashMap();
        CLS112.FLD410 = Collections.synchronizedSet(new HashSet());
    }

    public static boolean MTH1592(Class class0, String s) {
        boolean z1;
        boolean z;
        if(class0 != null && !TextUtils.isEmpty(s)) {
            String s1 = class0.getName() + s;
            ConcurrentHashMap concurrentHashMap0 = CLS112.FLD408;
            if(concurrentHashMap0.containsKey(s1)) {
                Object object0 = concurrentHashMap0.get(s1);
                return Boolean.TRUE.equals(object0);
            }
            Method[] arr_method = class0.getDeclaredMethods();
            for(int v1 = 0; true; ++v1) {
                z = false;
                z1 = true;
                if(v1 >= arr_method.length) {
                    break;
                }
                if(arr_method[v1].getName().equals(s)) {
                    z = true;
                    break;
                }
            }
            if(!z) {
                Method[] arr_method1 = class0.getMethods();
                for(int v = 0; v < arr_method1.length; ++v) {
                    if(arr_method1[v].getName().equals(s)) {
                        CLS112.FLD408.put(s1, Boolean.valueOf(z1));
                        return z1;
                    }
                }
            }
            z1 = z;
            CLS112.FLD408.put(s1, Boolean.valueOf(z1));
            return z1;
        }
        return false;
    }

    public static boolean MTH1593(boolean z, String s, ClassLoader classLoader0, String s1, Object[] arr_object) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !"-".equals(s1)) {
            try {
                Class class0 = CLS112.MTH1613(s, classLoader0);
                return class0 == null ? false : CLS112.MTH1629(z, class0, s1, arr_object);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2710(throwable0);
            }
        }
        return false;
    }

    public static boolean MTH1594(String s, ClassLoader classLoader0, String s1, Object object0) {
        return CLS112.MTH1627(false, s, classLoader0, s1, object0);
    }

    public static boolean MTH1595(Class class0, String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            class0.getDeclaredField(s);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static void MTH1596(String s, ClassLoader classLoader0, Object object0) {
        CLS112.MTH1601(false, s, classLoader0, object0);
    }

    public static View MTH1597(ViewGroup viewGroup0, String s) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0.getClass().getName().contains(s)) {
                return view0;
            }
            if(view0 instanceof ViewGroup) {
                return CLS112.MTH1597(((ViewGroup)view0), s);
            }
        }
        return null;
    }

    // This method contains unreflected code
    public static boolean MTH1598(ClassLoader classLoader0, String s) {
        try {
            if(classLoader0.findLoadedClass(s) != null) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    public static boolean MTH1599(boolean z, Member member0, Object object0) {
        if(member0 == null) {
            return false;
        }
        String s = member0.toString();
        try {
            Set set0 = CLS112.FLD412;
            if(set0.contains(s)) {
                return false;
            }
            if(!z) {
                CLS112.FLD407.add(s);
            }
            if(CLS111.MTH1583(member0, object0)) {
                set0.add(s);
                CLS112.FLD407.remove(s);
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        CLS185.MTH2711(("hook failed: " + member0));
        CLS185.MTH2711(s);
        return false;
    }

    public static Method MTH1600(Class class0, int v, String s, Object object0, Object[] arr_object) {
        return CLS112.MTH1618(class0, s, v, object0, arr_object);
    }

    public static void MTH1601(boolean z, String s, ClassLoader classLoader0, Object object0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            CLS112.MTH1603(z, CLS112.MTH1613(s, classLoader0), object0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static Method MTH1602(Class class0, String s, Object object0, Object[] arr_object) {
        return CLS112.MTH1618(class0, s, 0, object0, arr_object);
    }

    public static void MTH1603(boolean z, Class class0, Object object0) {
        if(class0 != null && !class0.isInterface()) {
            Method[] arr_method = class0.getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                try {
                    CLS112.MTH1599(z, method0, object0);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    public static boolean MTH1604(Object object0, String s) {
        return object0 == null ? false : CLS112.MTH1592(object0.getClass(), s);
    }

    public static Object MTH1605(Object object0, Object object1) {
        if(object0 != null && object1 != null) {
            try {
                String s = object1 instanceof Class ? ((Class)object1).getName() : ((String)object1);
                Field[] arr_field = object0.getClass().getDeclaredFields();
            label_4:
                for(int v = 0; v < arr_field.length; ++v) {
                    Field field0 = arr_field[v];
                    field0.setAccessible(true);
                    if(field0.getType().getName().contains(s)) {
                        Object object2 = field0.get(object0);
                        if(object2 != null) {
                            return object2;
                        }
                    }
                }
            }
            catch(Exception exception0) {
                CLS185.MTH2708(exception0);
                if(true) {
                    return null;
                }
                goto label_4;
            }
        }
        return null;
    }

    public static boolean MTH1606(boolean z, Class class0, ClassLoader classLoader0, Object[] arr_object) {
        if(class0 == null) {
            return false;
        }
        try {
            Class[] arr_class = new Class[arr_object.length - 1];
            for(int v = 0; v < arr_object.length - 1; ++v) {
                Object object0 = arr_object[v];
                if(object0 instanceof String) {
                    arr_class[v] = CLS112.MTH1613(((String)object0), classLoader0);
                }
                else if(object0 instanceof Class) {
                    arr_class[v] = (Class)object0;
                }
            }
            Constructor constructor0 = class0.getDeclaredConstructor(arr_class);
            constructor0.setAccessible(true);
            return CLS112.MTH1599(z, constructor0, arr_object[arr_object.length - 1]);
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static boolean MTH1607(String[] arr_s) {
        StackTraceElement[] arr_stackTraceElement = Thread.currentThread().getStackTrace();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            String s = arr_stackTraceElement[v].toString();
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s1 = arr_s[v1];
                if(!TextUtils.isEmpty(s1) && s.contains(s1)) {
                    return true;
                }
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static Method MTH1608(Object object0, String s, Object object1, Object[] arr_object) {
        return object0 instanceof Class ? CLS112.MTH1618(((Class)object0), s, 0, object1, arr_object) : CLS112.MTH1618(object0.getClass(), s, 0, object1, arr_object);
    }

    public static ArrayList MTH1609(Object object0, Class class0) {
        ArrayList arrayList0 = new ArrayList();
        if(object0 != null && class0 != null) {
            try {
                String s = class0.getName();
                Field[] arr_field = object0.getClass().getDeclaredFields();
            label_5:
                for(int v = 0; v < arr_field.length; ++v) {
                    Field field0 = arr_field[v];
                    field0.setAccessible(true);
                    if(field0.getType().getName().contains(s)) {
                        Object object1 = field0.get(object0);
                        if(object1 != null) {
                            arrayList0.add(object1);
                        }
                    }
                }
            }
            catch(Exception exception0) {
                CLS185.MTH2708(exception0);
                if(true) {
                    return arrayList0;
                }
                goto label_5;
            }
        }
        return arrayList0;
    }

    public static boolean MTH1610(boolean z, Class class0, String s, Object object0) {
        if(class0 != null && !class0.isInterface() && !TextUtils.isEmpty(s) && !"-".equals(s)) {
            String s1 = CLS112.MTH1616(class0, s, new Object[0]);
            try {
                Set set0 = CLS112.FLD412;
                if(set0.contains(s1)) {
                    return false;
                }
                if(!z) {
                    CLS112.FLD407.add(s1);
                }
                CLS111.MTH1554(class0, s, object0);
                set0.add(s1);
                CLS112.FLD407.remove(s1);
                return true;
            }
            catch(Throwable throwable0) {
                CLS185.MTH2710(throwable0);
            }
        }
        return false;
    }

    public static Object MTH1611(Class class0, Object object0, String s) {
        try {
            if(class0 == null) {
                return null;
            }
            Field[] arr_field = class0.getDeclaredFields();
        label_4:
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                field0.setAccessible(true);
                if(field0.getType().getName().contains(s)) {
                    return field0.get(object0);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            if(true) {
                return null;
            }
            goto label_4;
        }
        return null;
    }

    public static Object MTH1612(Object object0, int v) {
        try {
            if(object0 == null) {
                return null;
            }
            Field[] arr_field = object0.getClass().getDeclaredFields();
            if(arr_field == null) {
                return null;
            }
            if(v >= arr_field.length) {
                return null;
            }
            Field field0 = arr_field[v];
            if(field0 == null) {
                return null;
            }
            field0.setAccessible(true);
            Object object1 = field0.get(object0);
            if(object1 != null) {
                return object1;
            }
        }
        catch(Exception exception0) {
            CLS185.MTH2708(exception0);
        }
        return null;
    }

    public static Class MTH1613(String s, ClassLoader classLoader0) {
        Class class0;
        if(!TextUtils.isEmpty(s) && !"-".equals(s)) {
            ConcurrentHashMap concurrentHashMap0 = CLS112.FLD409;
            if(concurrentHashMap0.containsKey(s)) {
                return (Class)concurrentHashMap0.get(s);
            }
            try {
                class0 = null;
                class0 = CLS111.MTH1560(s, classLoader0);
            }
            catch(Throwable unused_ex) {
            }
            if(class0 == null) {
                return null;
            }
            synchronized(CLS112.FLD409) {
                CLS112.FLD409.put(s, class0);
                return class0;
            }
        }
        return null;
    }

    public static int MTH1614() {
        Set set0 = CLS112.FLD407;
        if(set0.isEmpty()) {
            return 0;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: set0) {
                String s = (String)object0;
                if(!TextUtils.isEmpty(s)) {
                    arrayList0.add(s);
                }
            }
            return arrayList0.size();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return 0;
        }
    }

    public static Object MTH1615(Method method0, Object[] arr_object) {
        return method0 == null ? null : CLS112.MTH1630(method0, null, arr_object);
    }

    public static String MTH1616(Object object0, String s, Object[] arr_object) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(object0.toString());
        stringBuilder0.append(".");
        stringBuilder0.append(s);
        if(arr_object != null) {
            for(int v = 0; v < arr_object.length - 1; ++v) {
                Object object1 = arr_object[v];
                if(object1 == null) {
                    stringBuilder0.append(".");
                    stringBuilder0.append("null");
                }
                else {
                    stringBuilder0.append(".");
                    stringBuilder0.append((object1 instanceof Class ? ((Class)object1).getName() : ((String)object1)));
                }
            }
            return stringBuilder0.toString();
        }
        stringBuilder0.append(".");
        stringBuilder0.append("null");
        return stringBuilder0.toString();
    }

    public static boolean MTH1617(Class class0, String s, Object[] arr_object) {
        return CLS112.MTH1629(false, class0, s, arr_object);
    }

    // This method was un-flattened
    public static Method MTH1618(Class class0, String s, int v, Object object0, Object[] arr_object) {
        List list0;
        String s2;
        if(class0 != null && !"-".equals(s)) {
            String s1 = CLS112.MTH1621(class0, s, object0, arr_object) + v;
            if(CLS112.FLD410.contains(s1)) {
                return null;
            }
            ConcurrentHashMap concurrentHashMap0 = CLS112.FLD411;
            if(concurrentHashMap0.containsKey(s1)) {
                return (Method)concurrentHashMap0.get(s1);
            }
            if(object0 == null) {
                s2 = Void.TYPE.getName();
            }
            else {
                s2 = object0 instanceof Class ? ((Class)object0).getName() : ((String)object0);
            }
            HashSet hashSet0 = new HashSet();
            if(v == 0) {
                list0 = Arrays.asList(class0.getDeclaredMethods());
            }
            else {
                if(v != 1) {
                    hashSet0.addAll(Arrays.asList(class0.getDeclaredMethods()));
                }
                list0 = Arrays.asList(class0.getMethods());
            }
            hashSet0.addAll(list0);
            for(Object object1: hashSet0) {
                Method method0 = (Method)object1;
                if(!TextUtils.isEmpty(s) && !method0.getName().equals(s) || !method0.getReturnType().getName().contains(s2)) {
                    continue;
                }
                Class[] arr_class = method0.getParameterTypes();
                if(arr_object.length != arr_class.length) {
                    continue;
                }
                int v1 = 0;
            label_29:
                if(v1 < arr_object.length) {
                    Object object2 = arr_object[v1];
                    if(object2 != null) {
                        String s3 = object2 instanceof Class ? ((Class)object2).getName() : ((String)object2);
                        if(!TextUtils.isEmpty(s3) && !arr_class[v1].getName().contains(s3)) {
                            continue;
                        }
                    }
                    ++v1;
                    goto label_29;
                }
                method0.setAccessible(true);
                CLS112.FLD411.put(s1, method0);
                return method0;
            }
            CLS185.MTH2710(("not found: " + s1));
            CLS112.FLD410.add(s1);
        }
        return null;
    }

    public static boolean MTH1619(String s, ClassLoader classLoader0, String s1, Object[] arr_object) {
        return CLS112.MTH1593(false, s, classLoader0, s1, arr_object);
    }

    public static Method MTH1620(String[] arr_s, Object object0, Object object1, Object[] arr_object) {
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(!TextUtils.isEmpty(s)) {
                Method method0 = CLS112.MTH1618(object0.getClass(), s, 3, object1, arr_object);
                if(method0 != null) {
                    return method0;
                }
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static String MTH1621(Class class0, String s, Object object0, Object[] arr_object) {
        String s1;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(class0.getName());
        stringBuilder0.append(".");
        stringBuilder0.append(s);
        if(object0 == null) {
            s1 = "void";
        }
        else {
            s1 = object0 instanceof Class ? ((Class)object0).getName() : ((String)object0);
        }
        stringBuilder0.append(".");
        stringBuilder0.append(s1);
        if(arr_object == null) {
            stringBuilder0.append(".");
            stringBuilder0.append("null");
            return stringBuilder0.toString();
        }
        for(int v = 0; v < arr_object.length; ++v) {
            Object object1 = arr_object[v];
            if(object1 == null) {
                stringBuilder0.append(".");
                stringBuilder0.append("null");
            }
            else {
                stringBuilder0.append(".");
                stringBuilder0.append((object1 instanceof Class ? ((Class)object1).getName() : ((String)object1)));
            }
        }
        return stringBuilder0.toString();
    }

    public static Method MTH1622(String s, ClassLoader classLoader0, int v, String s1, Object object0, Object[] arr_object) {
        Class class0 = CLS112.MTH1625(s, classLoader0);
        return class0 == null ? null : CLS112.MTH1618(class0, s1, v, object0, arr_object);
    }

    public static boolean MTH1623(Member member0, Object object0) {
        return CLS112.MTH1599(false, member0, object0);
    }

    public static String MTH1624(Context context0, String s) {
        try {
            Enumeration enumeration0 = new DexFile(context0.getPackageCodePath()).entries();
            while(true) {
            label_1:
                if(!enumeration0.hasMoreElements()) {
                    return null;
                }
                String s1 = (String)enumeration0.nextElement();
                if(s1.endsWith(s)) {
                    return s1;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
        goto label_1;
    }

    public static Class MTH1625(String s, ClassLoader classLoader0) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(s.equals("-")) {
            return null;
        }
        try {
            return CLS112.MTH1613(s, classLoader0);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static boolean MTH1626(boolean z, Class class0, Object object0) {
        if(class0 != null && !class0.isInterface()) {
            try {
                Constructor[] arr_constructor = class0.getDeclaredConstructors();
                for(int v = 0; true; ++v) {
                    if(v >= arr_constructor.length) {
                        return true;
                    }
                    Constructor constructor0 = arr_constructor[v];
                    try {
                        constructor0.setAccessible(true);
                        CLS112.MTH1599(z, constructor0, object0);
                    }
                    catch(Throwable throwable0) {
                        CLS185.MTH2708(throwable0);
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        return false;
    }

    public static boolean MTH1627(boolean z, String s, ClassLoader classLoader0, String s1, Object object0) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !"-".equals(s1)) {
            String s2 = CLS112.MTH1616(s, s1, new Object[0]);
            try {
                Set set0 = CLS112.FLD412;
                if(set0.contains(s2)) {
                    return false;
                }
                if(!z) {
                    CLS112.FLD407.add(s2);
                }
                Class class0 = CLS112.MTH1613(s, classLoader0);
                if(class0 == null) {
                    return false;
                }
                CLS111.MTH1554(class0, s1, object0);
                set0.add(s2);
                CLS112.FLD407.remove(s2);
                return true;
            }
            catch(Throwable throwable0) {
                CLS185.MTH2710(throwable0);
            }
        }
        return false;
    }

    public static Method MTH1628(String s, ClassLoader classLoader0, String s1, Object object0, Object[] arr_object) {
        Class class0 = CLS112.MTH1625(s, classLoader0);
        return class0 == null ? null : CLS112.MTH1618(class0, s1, 0, object0, arr_object);
    }

    public static boolean MTH1629(boolean z, Class class0, String s, Object[] arr_object) {
        if(class0 != null && !class0.isInterface() && !TextUtils.isEmpty(s) && !"-".equals(s)) {
            String s1 = CLS112.MTH1616(class0, s, arr_object);
            try {
                Set set0 = CLS112.FLD412;
                if(set0.contains(s1)) {
                    return false;
                }
                if(!z) {
                    CLS112.FLD407.add(s1);
                }
                if(CLS111.MTH1553(class0, s, arr_object)) {
                    set0.add(s1);
                    CLS112.FLD407.remove(s1);
                    return true;
                }
                goto label_17;
            }
            catch(Error error0) {
                CLS185.MTH2711(("" + class0));
                CLS185.MTH2711(s1);
            }
            catch(Throwable error0) {
            }
            CLS185.MTH2708(error0);
        label_17:
            CLS185.MTH2711(("hook failed: " + class0));
            CLS185.MTH2711(s1);
        }
        return false;
    }

    public static Object MTH1630(Method method0, Object object0, Object[] arr_object) {
        if(method0 == null) {
            return null;
        }
        try {
            method0.setAccessible(true);
            return method0.invoke(object0, arr_object);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2710(throwable0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    public static boolean MTH1631(boolean z, String s, ClassLoader classLoader0, Object[] arr_object) {
        return TextUtils.isEmpty(s) ? false : CLS112.MTH1606(z, CLS112.MTH1613(s, classLoader0), classLoader0, arr_object);
    }

    public static boolean MTH1632(boolean z, String s, ClassLoader classLoader0, Object object0) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            return CLS112.MTH1626(z, CLS112.MTH1613(s, classLoader0), object0);
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }
}

