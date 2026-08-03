package Yue;

import Yue.C5053;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C1629;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥۡۦۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7130 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2692 = "ResourcesCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final ThreadLocal<TypedValue> f2693 = new ThreadLocal<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC5225("sColorStateCacheLock")
    public static final WeakHashMap<C7133, SparseArray<C7132>> f21502 = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Object f21503 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC3261
    public static final int f21504 = 0;

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ */
    @InterfaceC7113(21)
    public static class C1181 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Drawable m3415(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Drawable m3416(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟ */
    @InterfaceC7113(23)
    public static class C1182 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m3417(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @InterfaceC6391
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static ColorStateList m3418(@InterfaceC6391 Resources resources, @InterfaceC3906 int i, @InterfaceC6490 Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(29)
    public static class C7131 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static float m3419(@InterfaceC6391 Resources resources, @InterfaceC4398 int i) {
            return resources.getFloat(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C7132 {

        /* JADX INFO: renamed from: ۥ */
        public final ColorStateList f2694;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Configuration f2695;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f21505;

        public C7132(@InterfaceC6391 ColorStateList colorStateList, @InterfaceC6391 Configuration configuration, @InterfaceC6490 Resources.Theme theme) {
            this.f2694 = colorStateList;
            this.f2695 = configuration;
            this.f21505 = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7133 {

        /* JADX INFO: renamed from: ۥ */
        public final Resources f2696;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Resources.Theme f2697;

        public C7133(@InterfaceC6391 Resources resources, @InterfaceC6490 Resources.Theme theme) {
            this.f2696 = resources;
            this.f2697 = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7133.class != obj.getClass()) {
                return false;
            }
            C7133 c7133 = (C7133) obj;
            return this.f2696.equals(c7133.f2696) && C6499.m2995(this.f2697, c7133.f2697);
        }

        public int hashCode() {
            return C6499.m2996(this.f2696, this.f2697);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC7134 {
        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        public static Handler getHandler(@InterfaceC6490 Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(final int i, @InterfaceC6490 Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: Yue.ۥۡۦۦۥ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21509.m22286(i);
                }
            });
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@InterfaceC6391 final Typeface typeface, @InterfaceC6490 Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: Yue.ۥۡۦۦۤ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21507.m22287(typeface);
                }
            });
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(I)V */
        /* JADX INFO: renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
        public abstract void m22286(int i);

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟(Landroid/graphics/Typeface;)V */
        /* JADX INFO: renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
        public abstract void m22287(@InterfaceC6391 Typeface typeface);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C7135 {

        /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟ۡ$ۥ */
        @InterfaceC7113(23)
        public static class C1183 {

            /* JADX INFO: renamed from: ۥ */
            public static final Object f2698 = new Object();

            /* JADX INFO: renamed from: ۥ۟ */
            public static Method f2699;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static boolean f21506;

            /* JADX WARN: Removed duplicated region for block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @SuppressLint({"BanUncheckedReflection"})
            /* JADX INFO: renamed from: ۥ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static void m3423(@InterfaceC6391 Resources.Theme theme) {
                Method method;
                synchronized (f2698) {
                    if (f21506) {
                        method = f2699;
                        if (method != null) {
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f2699 = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i(C7130.f2692, "Failed to retrieve rebase() method", e);
                        }
                        f21506 = true;
                        method = f2699;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e2) {
                                Log.i(C7130.f2692, "Failed to invoke rebase() method via reflection", e2);
                                f2699 = null;
                            }
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟ۡ$ۥ۟ */
        @InterfaceC7113(29)
        public static class C1184 {
            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static void m3424(@InterfaceC6391 Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public static void m3422(@InterfaceC6391 Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C1184.m3424(theme);
            } else {
                C1183.m3423(theme);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m3413(@InterfaceC6391 C7133 c7133, @InterfaceC3906 int i, @InterfaceC6391 ColorStateList colorStateList, @InterfaceC6490 Resources.Theme theme) {
        synchronized (f21503) {
            try {
                WeakHashMap<C7133, SparseArray<C7132>> weakHashMap = f21502;
                SparseArray<C7132> sparseArray = weakHashMap.get(c7133);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(c7133, sparseArray);
                }
                sparseArray.append(i, new C7132(colorStateList, c7133.f2696.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3414(@InterfaceC6391 Resources.Theme theme) {
        synchronized (f21503) {
            try {
                Iterator<C7133> it = f21502.keySet().iterator();
                while (it.hasNext()) {
                    C7133 next = it.next();
                    if (next != null && theme.equals(next.f2697)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f21505 == r5.hashCode()) goto L22;
     */
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m22271(@InterfaceC6391 C7133 c7133, @InterfaceC3906 int i) {
        C7132 c7132;
        synchronized (f21503) {
            try {
                SparseArray<C7132> sparseArray = f21502.get(c7133);
                if (sparseArray != null && sparseArray.size() > 0 && (c7132 = sparseArray.get(i)) != null) {
                    if (c7132.f2695.equals(c7133.f2696.getConfiguration())) {
                        Resources.Theme theme = c7133.f2697;
                        if (theme != null || c7132.f21505 != 0) {
                            if (theme != null) {
                            }
                        }
                        return c7132.f2694;
                    }
                    sparseArray.remove(i);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Typeface m22272(@InterfaceC6391 Context context, @InterfaceC5052 int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m22284(context, i, new TypedValue(), 0, null, null, false, true);
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m22273(@InterfaceC6391 Resources resources, @InterfaceC3906 int i, @InterfaceC6490 Resources.Theme theme) throws Resources.NotFoundException {
        return C1182.m3417(resources, i, theme);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static ColorStateList m22274(@InterfaceC6391 Resources resources, @InterfaceC3906 int i, @InterfaceC6490 Resources.Theme theme) throws Resources.NotFoundException {
        C7133 c7133 = new C7133(resources, theme);
        ColorStateList colorStateListM22271 = m22271(c7133, i);
        if (colorStateListM22271 != null) {
            return colorStateListM22271;
        }
        ColorStateList colorStateListM22282 = m22282(resources, i, theme);
        if (colorStateListM22282 == null) {
            return C1182.m3418(resources, i, theme);
        }
        m3413(c7133, i, colorStateListM22282, theme);
        return colorStateListM22282;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Drawable m22275(@InterfaceC6391 Resources resources, @InterfaceC4525 int i, @InterfaceC6490 Resources.Theme theme) throws Resources.NotFoundException {
        return C1181.m3415(resources, i, theme);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Drawable m22276(@InterfaceC6391 Resources resources, @InterfaceC4525 int i, int i2, @InterfaceC6490 Resources.Theme theme) throws Resources.NotFoundException {
        return C1181.m3416(resources, i, i2, theme);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static float m22277(@InterfaceC6391 Resources resources, @InterfaceC4398 int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C7131.m3419(resources, i);
        }
        TypedValue typedValueM22281 = m22281();
        resources.getValue(i, typedValueM22281, true);
        if (typedValueM22281.type == 4) {
            return typedValueM22281.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValueM22281.type) + " is not valid");
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Typeface m22278(@InterfaceC6391 Context context, @InterfaceC5052 int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m22284(context, i, new TypedValue(), 0, null, null, false, false);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Typeface m22279(@InterfaceC6391 Context context, @InterfaceC5052 int i, @InterfaceC6391 TypedValue typedValue, int i2, @InterfaceC6490 AbstractC7134 abstractC7134) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m22284(context, i, typedValue, i2, abstractC7134, null, true, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m22280(@InterfaceC6391 Context context, @InterfaceC5052 int i, @InterfaceC6391 AbstractC7134 abstractC7134, @InterfaceC6490 Handler handler) throws Resources.NotFoundException {
        C6740.m21415(abstractC7134);
        if (context.isRestricted()) {
            abstractC7134.callbackFailAsync(-4, handler);
        } else {
            m22284(context, i, new TypedValue(), 0, abstractC7134, handler, false, false);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static TypedValue m22281() {
        ThreadLocal<TypedValue> threadLocal = f2693;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static ColorStateList m22282(Resources resources, int i, @InterfaceC6490 Resources.Theme theme) {
        if (m22283(resources, i)) {
            return null;
        }
        try {
            return C3912.m935(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w(f2692, "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m22283(@InterfaceC6391 Resources resources, @InterfaceC3906 int i) {
        TypedValue typedValueM22281 = m22281();
        resources.getValue(i, typedValueM22281, true);
        int i2 = typedValueM22281.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static Typeface m22284(@InterfaceC6391 Context context, int i, @InterfaceC6391 TypedValue typedValue, int i2, @InterfaceC6490 AbstractC7134 abstractC7134, @InterfaceC6490 Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceM22285 = m22285(context, resources, typedValue, i, i2, abstractC7134, handler, z, z2);
        if (typefaceM22285 != null || abstractC7134 != null || z2) {
            return typefaceM22285;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m22285(@InterfaceC6391 Context context, Resources resources, @InterfaceC6391 TypedValue typedValue, int i, int i2, @InterfaceC6490 AbstractC7134 abstractC7134, @InterfaceC6490 Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        int i3 = 0;
        if (!string.startsWith("res/")) {
            if (abstractC7134 != null) {
                abstractC7134.callbackFailAsync(-3, handler);
            }
            return null;
        }
        Typeface typefaceM25344 = C8023.m25344(resources, i, string, typedValue.assetCookie, i2);
        if (typefaceM25344 != null) {
            if (abstractC7134 != null) {
                abstractC7134.callbackSuccessAsync(typefaceM25344, handler);
            }
            return typefaceM25344;
        }
        if (z2) {
            return null;
        }
        try {
        } catch (IOException e) {
            e = e;
            i3 = -3;
        } catch (XmlPullParserException e2) {
            e = e2;
            i3 = -3;
        }
        try {
            if (!string.toLowerCase().endsWith(C1629.f26368)) {
                Typeface typefaceM25341 = C8023.m25341(context, resources, i, string, typedValue.assetCookie, i2);
                if (abstractC7134 != null) {
                    if (typefaceM25341 != null) {
                        abstractC7134.callbackSuccessAsync(typefaceM25341, handler);
                    } else {
                        abstractC7134.callbackFailAsync(-3, handler);
                    }
                }
                return typefaceM25341;
            }
            C5053.InterfaceC0626 interfaceC0626M1869 = C5053.m1869(resources.getXml(i), resources);
            if (interfaceC0626M1869 != null) {
                return C8023.m25339(context, interfaceC0626M1869, resources, i, string, typedValue.assetCookie, i2, abstractC7134, handler, z);
            }
            Log.e(f2692, "Failed to find font-family tag");
            if (abstractC7134 != null) {
                abstractC7134.callbackFailAsync(-3, handler);
            }
            return null;
        } catch (IOException e3) {
            e = e3;
            Log.e(f2692, "Failed to read xml resource " + string, e);
            if (abstractC7134 != null) {
                return null;
            }
            abstractC7134.callbackFailAsync(i3, handler);
            return null;
        } catch (XmlPullParserException e4) {
            e = e4;
            Log.e(f2692, "Failed to parse xml resource " + string, e);
            if (abstractC7134 != null) {
            }
        }
    }
}
