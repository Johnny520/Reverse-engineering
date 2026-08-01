// Decompiled by JEB v5.42.0.202606242140

package b.יﹳ;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS502;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS164 {
    public static final HashMap FLD1580;

    static {
        CLS164.FLD1580 = new HashMap();
    }

    public static String MTH3170(ArrayList arrayList0) {
        StackTraceElement[] arr_stackTraceElement = Thread.currentThread().getStackTrace();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            String s = arr_stackTraceElement[v].getClassName();
            for(Object object0: arrayList0) {
                String s1 = (String)object0;
                if(s.contains(s1)) {
                    return s1;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static boolean MTH3171(View view0, String s, String s1) {
        if(view0 == null) {
            return false;
        }
        if(view0 instanceof TextView && CLS502.MTH6936(((TextView)view0).getText()).contains(s)) {
            ((TextView)view0).setText(s1);
            return true;
        }
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                if(CLS164.MTH3171(((ViewGroup)view0).getChildAt(v), s, s1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String MTH3172(Object object0) {
        try {
            String s = String.class.getName();
            HashSet hashSet0 = new HashSet();
            Class class0 = object0.getClass();
            Field[] arr_field = class0.getDeclaredFields();
            for(int v1 = 0; v1 < arr_field.length; ++v1) {
                Field field0 = arr_field[v1];
                if(field0 != null && !hashSet0.contains(field0)) {
                    hashSet0.add(field0);
                    field0.setAccessible(true);
                    if(field0.getType().getName().contains(s)) {
                        return field0.getName();
                    }
                }
            }
            Field[] arr_field1 = class0.getFields();
        label_16:
            for(int v = 0; v < arr_field1.length; ++v) {
                Field field1 = arr_field1[v];
                if(field1 != null && !hashSet0.contains(field1)) {
                    hashSet0.add(field1);
                    field1.setAccessible(true);
                    if(field1.getType().getName().contains(s)) {
                        return field1.getName();
                    }
                }
            }
        }
        catch(Exception exception0) {
            CLS27.MTH893(exception0);
            if(true) {
                return null;
            }
            goto label_16;
        }
        return null;
    }

    public static Method MTH3173(Class class0, String s, Class class1, Object[] arr_object) {
        String s1;
        if(class0 == null) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(class0.getName());
        stringBuilder1.append(".");
        stringBuilder1.append(s);
        Class class2 = class1 == null ? Void.TYPE : class1;
        stringBuilder1.append(".");
        stringBuilder1.append(class2.getName());
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 == null) {
                s1 = ".null";
            }
            else {
                s1 = object0 instanceof Class ? ((Class)object0).getName() : ((String)object0);
                stringBuilder1.append(".");
            }
            stringBuilder1.append(s1);
        }
        stringBuilder0.append(stringBuilder1.toString());
        stringBuilder0.append(0);
        String s2 = stringBuilder0.toString();
        HashMap hashMap0 = CLS164.FLD1580;
        if(hashMap0.containsKey(s2)) {
            return (Method)hashMap0.get(s2);
        }
        if(class1 == null) {
            class1 = Void.TYPE;
        }
        String s3 = class1.getName();
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(Arrays.asList(class0.getDeclaredMethods()));
        for(Object object1: hashSet0) {
            Method method0 = (Method)object1;
            if((TextUtils.isEmpty(s) || method0.getName().equals(s)) && method0.getReturnType().getName().contains(s3)) {
                Class[] arr_class = method0.getParameterTypes();
                if(arr_object.length == arr_class.length) {
                    for(int v1 = 0; true; ++v1) {
                        boolean z = true;
                        if(v1 >= arr_object.length) {
                            break;
                        }
                        Object object2 = arr_object[v1];
                        if(object2 != null) {
                            String s4 = object2 instanceof Class ? ((Class)object2).getName() : ((String)object2);
                            if(!TextUtils.isEmpty(s4) && !arr_class[v1].getName().contains(s4)) {
                                z = false;
                                break;
                            }
                        }
                    }
                    if(z) {
                        method0.setAccessible(true);
                        hashMap0.put(s2, method0);
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

    // 去混淆评级： 低(20)
    public static Method MTH3174(Object object0, String s, Class class0, Object[] arr_object) {
        return object0 instanceof Class ? CLS164.MTH3173(((Class)object0), s, class0, arr_object) : CLS164.MTH3173(object0.getClass(), s, class0, arr_object);
    }

    public static Object MTH3175(Object object0, Serializable serializable0) {
        if(object0 != null && serializable0 != null) {
            try {
                String s = serializable0 instanceof Class ? ((Class)serializable0).getName() : ((String)serializable0);
                HashSet hashSet0 = new HashSet();
                Class class0 = object0.getClass();
                Field[] arr_field = class0.getDeclaredFields();
                for(int v1 = 0; v1 < arr_field.length; ++v1) {
                    Field field0 = arr_field[v1];
                    if(field0 != null && !hashSet0.contains(field0)) {
                        hashSet0.add(field0);
                        field0.setAccessible(true);
                        if(field0.getType().getName().contains(s)) {
                            Object object1 = field0.get(object0);
                            if(object1 != null) {
                                return object1;
                            }
                        }
                    }
                }
                Field[] arr_field1 = class0.getFields();
            label_19:
                for(int v = 0; v < arr_field1.length; ++v) {
                    Field field1 = arr_field1[v];
                    if(field1 != null && !hashSet0.contains(field1)) {
                        hashSet0.add(field1);
                        field1.setAccessible(true);
                        if(field1.getType().getName().contains(s)) {
                            Object object2 = field1.get(object0);
                            if(object2 != null) {
                                return object2;
                            }
                        }
                    }
                }
            }
            catch(Exception exception0) {
                CLS27.MTH893(exception0);
                if(true) {
                    return null;
                }
                goto label_19;
            }
        }
        return null;
    }

    public static Object MTH3176(int v, Object object0) {
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
            CLS27.MTH893(exception0);
        }
        return null;
    }

    public static String MTH3177(String s) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s);
        return CLS164.MTH3170(arrayList0);
    }

    public static Object MTH3178(Object object0, Method method0, Object[] arr_object) {
        if(method0 == null) {
            return null;
        }
        try {
            method0.setAccessible(true);
            return method0.invoke(object0, arr_object);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }
}

