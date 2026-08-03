package p000a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000a.C0332S6;

/* JADX INFO: renamed from: a.Of */
/* JADX INFO: loaded from: classes.dex */
public class C0270Of extends C0252Nf {

    /* JADX INFO: renamed from: f */
    public final Class<?> f952f;

    /* JADX INFO: renamed from: g */
    public final Constructor<?> f953g;

    /* JADX INFO: renamed from: h */
    public final Method f954h;

    /* JADX INFO: renamed from: i */
    public final Method f955i;

    /* JADX INFO: renamed from: j */
    public final Method f956j;

    /* JADX INFO: renamed from: k */
    public final Method f957k;

    /* JADX INFO: renamed from: l */
    public final Method f958l;

    public C0270Of() {
        Method methodMo760m;
        Constructor<?> constructor;
        Method methodM752l;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM752l = m752l(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo760m = mo760m(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodMo760m = null;
            constructor = null;
            methodM752l = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f952f = cls;
        this.f953g = constructor;
        this.f954h = methodM752l;
        this.f955i = method;
        this.f956j = method2;
        this.f957k = method3;
        this.f958l = methodMo760m;
    }

    /* JADX INFO: renamed from: l */
    public static Method m752l(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // p000a.C0252Nf, p000a.C0323Rf
    /* JADX INFO: renamed from: a */
    public final Typeface mo690a(Context context, C0332S6.c cVar, Resources resources, int i) {
        Method method = this.f954h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo690a(context, cVar, resources, i);
        }
        Object objM759k = m759k();
        if (objM759k != null) {
            C0332S6.d[] dVarArr = cVar.f1186a;
            int length = dVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C0332S6.d dVar = dVarArr[i2];
                String str = dVar.f1187a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(dVar.f1190d);
                Context context2 = context;
                if (!m756h(context2, objM759k, str, dVar.f1191e, dVar.f1188b, dVar.f1189c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    m755g(objM759k);
                    return null;
                }
                i2++;
                context = context2;
            }
            if (m758j(objM759k)) {
                return mo757i(objM759k);
            }
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x0081 */
    @Override // p000a.C0323Rf
    /* JADX INFO: renamed from: b */
    public final Typeface mo753b(Context context, C0350T6[] c0350t6Arr, int i) {
        Typeface typefaceMo757i;
        boolean zBooleanValue;
        if (c0350t6Arr.length >= 1) {
            Method method = this.f954h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (C0350T6 c0350t6 : c0350t6Arr) {
                    if (c0350t6.f1248e == 0) {
                        Uri uri = c0350t6.f1244a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, C0341Sf.m933e(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objM759k = m759k();
                if (objM759k != null) {
                    int length = c0350t6Arr.length;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 < length) {
                        C0350T6 c0350t62 = c0350t6Arr[i2];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0350t62.f1244a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.f955i.invoke(objM759k, byteBuffer, Integer.valueOf(c0350t62.f1245b), null, Integer.valueOf(c0350t62.f1246c), Integer.valueOf(c0350t62.f1247d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                m755g(objM759k);
                                return null;
                            }
                            z = true;
                        }
                        i2++;
                        z = z;
                    }
                    if (!z) {
                        m755g(objM759k);
                        return null;
                    }
                    if (m758j(objM759k) && (typefaceMo757i = mo757i(objM759k)) != null) {
                        return Typeface.create(typefaceMo757i, i);
                    }
                }
            } else {
                C0350T6 c0350t6Mo853d = mo853d(i, c0350t6Arr);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0350t6Mo853d.f1244a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0350t6Mo853d.f1246c).setItalic(c0350t6Mo853d.f1247d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // p000a.C0323Rf
    /* JADX INFO: renamed from: c */
    public final Typeface mo754c(Context context, Resources resources, int i, String str, int i2) {
        Method method = this.f954h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo754c(context, resources, i, str, i2);
        }
        Object objM759k = m759k();
        if (objM759k != null) {
            if (!m756h(context, objM759k, str, 0, -1, -1, null)) {
                m755g(objM759k);
                return null;
            }
            if (m758j(objM759k)) {
                return mo757i(objM759k);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m755g(Object obj) {
        try {
            this.f957k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m756h(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f954h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public Typeface mo757i(Object obj) {
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m758j(Object obj) {
        try {
            return ((Boolean) this.f956j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final Object m759k() {
        try {
            return this.f953g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public Method mo760m(Class<?> cls) {
        throw null;
    }
}
