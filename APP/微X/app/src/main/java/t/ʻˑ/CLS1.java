// Decompiled by JEB v5.42.0.202606242140

package t.ʻˑ;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import t.ᵔʾ.CLS133;

public final class CLS1 {
    public static final HashMap FLD76;

    static {
        CLS1.FLD76 = new HashMap();
    }

    public static boolean MTH978(String s) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s);
        StackTraceElement[] arr_stackTraceElement = Thread.currentThread().getStackTrace();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            String s1 = arr_stackTraceElement[v].getClassName();
            for(Object object0: arrayList0) {
                CharSequence charSequence0 = (String)object0;
                if(s1.contains(charSequence0)) {
                    return !TextUtils.isEmpty(charSequence0);
                }
                if(false) {
                    break;
                }
            }
        }
        return !TextUtils.isEmpty(null);
    }

    public static View MTH979(ViewGroup viewGroup0, String s) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0.getClass().getName().contains(s)) {
                return view0;
            }
            if(view0 instanceof ViewGroup) {
                return CLS1.MTH979(((ViewGroup)view0), s);
            }
        }
        return null;
    }

    public static Object MTH980(Object object0, Serializable serializable0) {
        if(object0 != null && serializable0 != null) {
            try {
                String s = serializable0 instanceof Class ? ((Class)serializable0).getName() : ((String)serializable0);
                if(TextUtils.isEmpty(s)) {
                    return null;
                }
                Field[] arr_field = object0.getClass().getDeclaredFields();
            label_6:
                for(int v = 0; v < arr_field.length; ++v) {
                    Field field0 = arr_field[v];
                    field0.setAccessible(true);
                    if(field0.getType().getName().contains(s)) {
                        Object object1 = field0.get(object0);
                        if(object1 != null) {
                            return object1;
                        }
                    }
                }
            }
            catch(Exception exception0) {
                CLS133.MTH2113(exception0);
                if(true) {
                    return null;
                }
                goto label_6;
            }
        }
        return null;
    }

    public static View MTH981(int v, View view0) {
        if(view0 instanceof ViewGroup) {
            try {
                return ((ViewGroup)view0).getChildAt(v);
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
        return null;
    }

    public static View MTH982(ViewGroup viewGroup0) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof TextView) {
                if(!TextUtils.isEmpty(((TextView)view0).getText())) {
                    return view0;
                }
            }
            else if(view0 instanceof ViewGroup) {
                return CLS1.MTH982(((ViewGroup)view0));
            }
        }
        return null;
    }

    public static View MTH983(View view0, int[] arr_v) {
        View view1 = null;
        int v = 0;
        while(v < arr_v.length) {
            view1 = CLS1.MTH981(arr_v[v], view0);
            if(view1 == null) {
                break;
            }
            ++v;
            view0 = view1;
        }
        return view1;
    }

    public static Object MTH984(Method method0, Object object0, Object[] arr_object) {
        if(method0 == null) {
            return null;
        }
        try {
            method0.setAccessible(true);
            return method0.invoke(object0, arr_object);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return null;
        }
    }

    public static Method MTH985(Class class0, String s, Serializable serializable0, Object[] arr_object) {
        String s4;
        String s2;
        String s1;
        if(class0 == null) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(class0.getName());
        stringBuilder1.append(".");
        stringBuilder1.append(s);
        if(serializable0 == null) {
            s1 = Void.TYPE.getName();
        }
        else {
            s1 = serializable0 instanceof Class ? ((Class)serializable0).getName() : ((String)serializable0);
        }
        stringBuilder1.append(".");
        stringBuilder1.append(s1);
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 == null) {
                s2 = ".null";
            }
            else {
                s2 = object0 instanceof Class ? ((Class)object0).getName() : ((String)object0);
                stringBuilder1.append(".");
            }
            stringBuilder1.append(s2);
        }
        stringBuilder0.append(stringBuilder1.toString());
        stringBuilder0.append(0);
        String s3 = stringBuilder0.toString();
        HashMap hashMap0 = CLS1.FLD76;
        if(hashMap0.containsKey(s3)) {
            return (Method)hashMap0.get(s3);
        }
        if(serializable0 == null) {
            s4 = Void.TYPE.getName();
        }
        else {
            s4 = serializable0 instanceof Class ? ((Class)serializable0).getName() : ((String)serializable0);
        }
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(Arrays.asList(class0.getDeclaredMethods()));
        for(Object object1: hashSet0) {
            Method method0 = (Method)object1;
            if((TextUtils.isEmpty(s) || method0.getName().equals(s)) && method0.getReturnType().getName().contains(s4)) {
                Class[] arr_class = method0.getParameterTypes();
                if(arr_object.length == arr_class.length) {
                    for(int v1 = 0; true; ++v1) {
                        boolean z = true;
                        if(v1 >= arr_object.length) {
                            break;
                        }
                        Object object2 = arr_object[v1];
                        if(object2 != null) {
                            String s5 = object2 instanceof Class ? ((Class)object2).getName() : ((String)object2);
                            if(!TextUtils.isEmpty(s5) && !arr_class[v1].getName().contains(s5)) {
                                z = false;
                                break;
                            }
                        }
                    }
                    if(z) {
                        method0.setAccessible(true);
                        hashMap0.put(s3, method0);
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

