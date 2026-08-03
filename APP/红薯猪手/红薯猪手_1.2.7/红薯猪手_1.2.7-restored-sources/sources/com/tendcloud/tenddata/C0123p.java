package com.tendcloud.tenddata;

/* JADX INFO: renamed from: com.tendcloud.tenddata.p */
/* JADX INFO: loaded from: classes.dex */
public class C0123p {
    /* JADX INFO: renamed from: a */
    public static boolean m718a(Object obj) {
        Object objInvoke;
        try {
            objInvoke = obj.getClass().getMethod("getParentFragment", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            objInvoke = null;
        }
        try {
            if (objInvoke == null) {
                if (!m720c(obj) && m719b(obj) && m722e(obj)) {
                    return true;
                }
            } else if (!m720c(obj) && m719b(obj) && m722e(obj) && !m720c(objInvoke) && m719b(objInvoke) && m722e(objInvoke)) {
                return true;
            }
        } catch (Exception unused2) {
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m719b(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("getUserVisibleHint", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m720c(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("isHidden", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m721d(Object obj) {
        Class<?> cls;
        Class<?> cls2;
        if (obj == null) {
            return false;
        }
        Class<?> cls3 = null;
        try {
            cls = Class.forName("android.app.Fragment");
        } catch (Exception unused) {
            cls = null;
        }
        try {
            cls2 = Class.forName("android.support.v4.app.Fragment");
        } catch (Exception unused2) {
            cls2 = null;
        }
        try {
            cls3 = Class.forName("androidx.fragment.app.Fragment");
        } catch (Exception unused3) {
        }
        if (cls2 == null && cls3 == null && cls == null) {
            return false;
        }
        if (cls2 != null) {
            try {
                if (cls2.isInstance(obj)) {
                    return true;
                }
            } catch (Exception unused4) {
            }
        }
        if (cls3 != null && cls3.isInstance(obj)) {
            return true;
        }
        if (cls != null) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m722e(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("isResumed", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
