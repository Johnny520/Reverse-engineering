package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lg3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(Context context) {
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        String str = up0.l;
        if (str != null) {
            b(resources, str);
        } else {
            t11.S("moduleApkPath");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(Resources resources, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls;
        Class cls2;
        cls = AssetManager.class;
        Class<AssetManager> clsA = p40.A(d72.a(cls));
        cls = clsA != null ? clsA : AssetManager.class;
        cls2 = String.class;
        Class<String> clsA2 = p40.A(d72.a(cls2));
        Method declaredMethod = cls.getDeclaredMethod("addAssetPath", clsA2 != null ? clsA2 : String.class);
        declaredMethod.getClass();
        ig1.a(declaredMethod);
        declaredMethod.invoke(resources.getAssets(), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = rs0.a[(int) ((j >> (i4 << 3)) & 255)];
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }
}
