// Decompiled by JEB v5.42.0.202606242140

package p.pkg4;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS19 {
    public static final HashMap FLD272;

    static {
        CLS19.FLD272 = new HashMap();
    }

    public static Method MTH797(Class class0, Object[] arr_object) {
        StringBuilder stringBuilder0 = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(class0.getName());
        stringBuilder1.append(".null");
        Class class1 = Context.class;
        stringBuilder1.append(".");
        stringBuilder1.append(class1.getName());
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 == null) {
                stringBuilder1.append(".null");
            }
            else {
                stringBuilder1.append(".");
                stringBuilder1.append((object0 instanceof Class ? ((Class)object0).getName() : ((String)object0)));
            }
        }
        stringBuilder0.append(stringBuilder1.toString());
        stringBuilder0.append(0);
        String s = stringBuilder0.toString();
        HashMap hashMap0 = CLS19.FLD272;
        if(hashMap0.containsKey(s)) {
            return (Method)hashMap0.get(s);
        }
        String s1 = class1.getName();
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(Arrays.asList(class0.getDeclaredMethods()));
        for(Object object1: hashSet0) {
            Method method0 = (Method)object1;
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

