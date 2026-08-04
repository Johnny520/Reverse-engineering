package yyds;

import android.content.Context;
import android.content.res.AssetManager;
import android.view.LayoutInflater;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛵᛶᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1115 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String f5132 = "";

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final WeakHashMap f5133 = new WeakHashMap();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static LayoutInflater m2309(Context context) {
        if (!f5132.isEmpty()) {
            try {
                AssetManager assets = context.getResources().getAssets();
                WeakHashMap weakHashMap = f5133;
                if (!weakHashMap.containsKey(assets)) {
                    Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(assets, f5132);
                    weakHashMap.put(assets, Boolean.TRUE);
                }
            } catch (Exception unused) {
            }
        }
        C0959 c0959 = new C0959(context);
        return LayoutInflater.from(c0959).cloneInContext(c0959);
    }
}
