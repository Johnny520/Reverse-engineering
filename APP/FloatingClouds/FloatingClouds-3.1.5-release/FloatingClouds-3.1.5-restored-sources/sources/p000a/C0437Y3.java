package p000a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.util.WeakHashMap;
import p000a.C0787qd;

/* JADX INFO: renamed from: a.Y3 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C0437Y3 {

    /* JADX INFO: renamed from: a.Y3$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static File m1092a(Context context) {
            return context.getCodeCacheDir();
        }

        /* JADX INFO: renamed from: b */
        public static Drawable m1093b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* JADX INFO: renamed from: c */
        public static File m1094c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: a.Y3$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static int m1095a(Context context, int i) {
            return context.getColor(i);
        }

        /* JADX INFO: renamed from: b */
        public static <T> T m1096b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* JADX INFO: renamed from: c */
        public static String m1097c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f3112c == r8.hashCode()) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m1091a(Context context, int i) {
        ColorStateList colorStateListM1977a;
        ColorStateList colorStateList;
        C0787qd.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C0787qd.d dVar = new C0787qd.d(resources, theme);
        synchronized (C0787qd.f3109c) {
            try {
                SparseArray<C0787qd.c> sparseArray = C0787qd.f3108b.get(dVar);
                colorStateListM1977a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (cVar = sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (cVar.f3111b.equals(resources.getConfiguration())) {
                        if (theme != null || cVar.f3112c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = cVar.f3110a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = C0787qd.f3107a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM1977a = C0853u3.m1977a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM1977a == null) {
            return C0787qd.b.m1842b(resources, i, theme);
        }
        synchronized (C0787qd.f3109c) {
            try {
                WeakHashMap<C0787qd.d, SparseArray<C0787qd.c>> weakHashMap = C0787qd.f3108b;
                SparseArray<C0787qd.c> sparseArray2 = weakHashMap.get(dVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(dVar, sparseArray2);
                }
                sparseArray2.append(i, new C0787qd.c(colorStateListM1977a, dVar.f3113a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateListM1977a;
    }
}
