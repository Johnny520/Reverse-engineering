package top.linl.dexparser.util;

import android.content.Context;
import dalvik.system.DexClassLoader;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class DexLoadUtil {
    public static DexClassLoader buildDexClassLoader(Context context, String str, String str2) {
        return new DexClassLoader(str, context.getDir(str2, 0).getPath(), null, ClassLoader.getSystemClassLoader());
    }
}
