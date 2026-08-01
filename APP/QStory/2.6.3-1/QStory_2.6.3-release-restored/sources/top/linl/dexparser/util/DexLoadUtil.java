package top.linl.dexparser.util;

import android.content.Context;
import dalvik.system.DexClassLoader;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DexLoadUtil {
    public static DexClassLoader buildDexClassLoader(Context context, String str, String str2) {
        return new DexClassLoader(str, context.getDir(str2, 0).getPath(), null, ClassLoader.getSystemClassLoader());
    }
}
