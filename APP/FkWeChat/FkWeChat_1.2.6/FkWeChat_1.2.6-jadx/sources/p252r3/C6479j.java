package p252r3;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p292u3.AbstractC8503f;

/* JADX INFO: renamed from: r3.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C6479j extends AbstractC6478i {

    /* JADX INFO: renamed from: b */
    public final Class f20354b;

    /* JADX INFO: renamed from: c */
    public final Constructor f20355c;

    /* JADX INFO: renamed from: d */
    public final Method f20356d;

    /* JADX INFO: renamed from: e */
    public final Method f20357e;

    /* JADX INFO: renamed from: f */
    public final Method f20358f;

    /* JADX INFO: renamed from: g */
    public final Method f20359g;

    /* JADX INFO: renamed from: h */
    public final Method f20360h;

    public C6479j() {
        Class clsM25671o;
        Constructor constructorM25672p;
        Method methodM25668l;
        Method methodM25669m;
        Method methodM25673q;
        Method methodM25667k;
        Method methodMo25670n;
        try {
            clsM25671o = m25671o();
            constructorM25672p = m25672p(clsM25671o);
            methodM25668l = m25668l(clsM25671o);
            methodM25669m = m25669m(clsM25671o);
            methodM25673q = m25673q(clsM25671o);
            methodM25667k = m25667k(clsM25671o);
            methodMo25670n = mo25670n(clsM25671o);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            clsM25671o = null;
            constructorM25672p = null;
            methodM25668l = null;
            methodM25669m = null;
            methodM25673q = null;
            methodM25667k = null;
            methodMo25670n = null;
        }
        this.f20354b = clsM25671o;
        this.f20355c = constructorM25672p;
        this.f20356d = methodM25668l;
        this.f20357e = methodM25669m;
        this.f20358f = methodM25673q;
        this.f20359g = methodM25667k;
        this.f20360h = methodMo25670n;
    }

    @Override // p252r3.AbstractC6482m
    /* JADX INFO: renamed from: a */
    public Typeface mo25660a(Context context, CancellationSignal cancellationSignal, AbstractC8503f.b[] bVarArr, int i10) {
        Typeface typefaceMo25663g;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (m25665i()) {
            Map mapM25685b = AbstractC6483n.m25685b(context, bVarArr, cancellationSignal);
            Object objM25666j = m25666j();
            if (objM25666j == null) {
                return null;
            }
            int length = bVarArr.length;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < length) {
                AbstractC8503f.b bVar = bVarArr[i11];
                ByteBuffer byteBuffer = (ByteBuffer) mapM25685b.get(bVar.m32749d());
                if (byteBuffer == null) {
                    obj = objM25666j;
                } else {
                    boolean zM25662f = m25662f(objM25666j, byteBuffer, bVar.m32748c(), bVar.m32750e(), bVar.m32751f() ? 1 : 0);
                    obj = objM25666j;
                    if (!zM25662f) {
                        m25661e(obj);
                        return null;
                    }
                    z10 = true;
                }
                i11++;
                objM25666j = obj;
                z10 = z10;
            }
            Object obj2 = objM25666j;
            if (!z10) {
                m25661e(obj2);
                return null;
            }
            if (m25664h(obj2) && (typefaceMo25663g = mo25663g(obj2)) != null) {
                return Typeface.create(typefaceMo25663g, i10);
            }
            return null;
        }
        AbstractC8503f.b bVarM25679d = m25679d(bVarArr, i10);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarM25679d.m32749d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarM25679d.m32750e()).setItalic(bVarM25679d.m32751f()).build();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceBuild;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m25661e(Object obj) {
        try {
            this.f20359g.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m25662f(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f20357e.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public Typeface mo25663g(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f20354b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f20360h.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m25664h(Object obj) {
        try {
            return ((Boolean) this.f20358f.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m25665i() {
        if (this.f20356d == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f20356d != null;
    }

    /* JADX INFO: renamed from: j */
    public final Object m25666j() {
        try {
            return this.f20355c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public Method m25667k(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    /* JADX INFO: renamed from: l */
    public Method m25668l(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: m */
    public Method m25669m(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* JADX INFO: renamed from: n */
    public Method mo25670n(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: o */
    public Class m25671o() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* JADX INFO: renamed from: p */
    public Constructor m25672p(Class cls) {
        return cls.getConstructor(null);
    }

    /* JADX INFO: renamed from: q */
    public Method m25673q(Class cls) {
        return cls.getMethod("freeze", null);
    }
}
