package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.C0332S6;

/* JADX INFO: renamed from: a.Nf */
/* JADX INFO: loaded from: classes.dex */
public class C0252Nf extends C0323Rf {

    /* JADX INFO: renamed from: a */
    public static Class<?> f863a = null;

    /* JADX INFO: renamed from: b */
    public static Constructor<?> f864b = null;

    /* JADX INFO: renamed from: c */
    public static Method f865c = null;

    /* JADX INFO: renamed from: d */
    public static Method f866d = null;

    /* JADX INFO: renamed from: e */
    public static boolean f867e = false;

    /* JADX INFO: renamed from: e */
    public static boolean m688e(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m689f();
        try {
            return ((Boolean) f865c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m689f() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f867e) {
            return;
        }
        f867e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f864b = constructor;
        f863a = cls;
        f865c = method2;
        f866d = method;
    }

    @Override // p000a.C0323Rf
    /* JADX INFO: renamed from: a */
    public Typeface mo690a(Context context, C0332S6.c cVar, Resources resources, int i) throws NoSuchMethodException {
        m689f();
        try {
            Object objNewInstance = f864b.newInstance(null);
            for (C0332S6.d dVar : cVar.f1186a) {
                File fileM932d = C0341Sf.m932d(context);
                if (fileM932d == null) {
                    return null;
                }
                try {
                    if (!C0341Sf.m930b(fileM932d, resources, dVar.f1192f)) {
                        return null;
                    }
                    if (!m688e(objNewInstance, fileM932d.getPath(), dVar.f1188b, dVar.f1189c)) {
                        return null;
                    }
                    fileM932d.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM932d.delete();
                }
            }
            m689f();
            try {
                Object objNewInstance2 = Array.newInstance(f863a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f866d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
