// Decompiled by JEB v5.42.0.202606242140

package d.ˎˏ;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import d.יʻ.CLS62;
import d.יʻ.CLS69;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

public final class CLS2 {
    public static final HashMap FLD32;

    static {
        CLS2.FLD32 = new HashMap();
    }

    public static Object MTH378(Object object0) {
        Object object1;
        HashMap hashMap0;
        Class class0 = TextView.class;
        if(object0 != null) {
            if("" + class0 == null) {
                throw new NullPointerException("key must not be null");
            }

            WeakHashMap weakHashMap0 = CLS4.FLD35;
            synchronized(weakHashMap0) {
                hashMap0 = (HashMap)weakHashMap0.get(object0);
                if(hashMap0 == null) {
                    object1 = null;
                }
                else {
                    goto label_13;
                }

                goto label_20;
            }

        label_13:
            synchronized(hashMap0) {
                object1 = hashMap0.get("" + class0);
            }

        label_20:
            if(object1 != null) {
                return object1;
            }

            try {
                String s = class0.getName();
                Field[] arr_field = object0.getClass().getDeclaredFields();
            label_25:
                for(int v1 = 0; v1 < arr_field.length; ++v1) {
                    Field field0 = arr_field[v1];
                    if(field0.getType().getName().contains(s)) {
                        field0.setAccessible(true);
                        Object object2 = field0.get(object0);
                        if(object2 != null) {
                            CLS4.MTH388(object0, "" + class0, object2);
                            return object2;
                        }
                    }
                }
            }
            catch(Exception exception0) {
                CLS69.MTH797(exception0);
                if(true) {
                    return null;
                }

                goto label_25;
            }

            return null;
        }

        return null;
    }

    // 此方法包含解密的字符串
    public static Class MTH379(String s, ClassLoader classLoader0) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }

        if(s.equals("-")) {
            return null;
        }

        try {
            Method method0 = CLS62.FLD317.MTH762("fc");
            return method0 == null ? null : ((Class)method0.invoke(CLS69.FLD335, s, classLoader0));
        }
        catch(Throwable unused_ex) {
        }

        return null;
    }

    public static Method MTH380(Class class0, Object[] arr_object) {
        var stringBuilder0 = new StringBuilder();
        stringBuilder0.append(class0.getName());
        stringBuilder0.append(".null");
        Class class1 = Context.class;
        stringBuilder0.append(".");
        stringBuilder0.append(class1.getName());
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 == null) {
                stringBuilder0.append(".null");
            }
            else {
                stringBuilder0.append(".");
                stringBuilder0.append((object0 instanceof Class ? ((Class)object0).getName() : ((String)object0)));
            }
        }

        String s = stringBuilder0.toString();
        HashMap hashMap0 = CLS2.FLD32;
        if(hashMap0.containsKey(s)) {
            return (Method)hashMap0.get(s);
        }

        String s1 = class1.getName();
        var hashSet0 = new HashSet();
        hashSet0.addAll(Arrays.asList(class0.getDeclaredMethods()));
        for(Object object1: hashSet0) {
            var method0 = (Method)object1;
            if((TextUtils.isEmpty(null) || method0.getName().equals(null)) && method0.getReturnType().getName().contains(s1)) {
                Class[] arr_class = method0.getParameterTypes();
                if(arr_object.length == arr_class.length) {
                    for(int v1 = 0; true; ++v1) {
                        boolean z = true;
                        if(v1 >= arr_object.length) {
                            break;
                        }

                        Object object2 = arr_object[v1];
                        if(object2 != null) {
                            String s2 = object2 instanceof Class ? ((Class)object2).getName() : ((String)object2);
                            if(!TextUtils.isEmpty(s2) && !arr_class[v1].getName().contains(s2)) {
                                z = false;
                                break;
                            }
                        }
                    }

                    if(z) {
                        method0.setAccessible(true);
                        hashMap0.put(s, method0);
                        return method0;
                    }

                    if(false) {
                        break;
                    }
                }
            }
        }

        return null;
    }
}

