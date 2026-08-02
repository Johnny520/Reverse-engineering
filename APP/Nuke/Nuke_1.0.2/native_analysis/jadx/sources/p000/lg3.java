package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lg3 {
    /* JADX INFO: renamed from: a */
    public static final void m2909a(Context context) {
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        String str = up0.f11404l;
        if (str != null) {
            m2910b(resources, str);
        } else {
            t11.m5067S("moduleApkPath");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2910b(Resources resources, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls;
        Class cls2;
        cls = AssetManager.class;
        Class<AssetManager> clsM3691A = p40.m3691A(d72.m967a(cls));
        cls = clsM3691A != null ? clsM3691A : AssetManager.class;
        cls2 = String.class;
        Class<String> clsM3691A2 = p40.m3691A(d72.m967a(cls2));
        Method declaredMethod = cls.getDeclaredMethod("addAssetPath", clsM3691A2 != null ? clsM3691A2 : String.class);
        declaredMethod.getClass();
        ig1.m2344a(declaredMethod);
        declaredMethod.invoke(resources.getAssets(), str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m2911c(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = rs0.f9742a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2912d(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }
}
