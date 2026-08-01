package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.LinkedHashMap;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oe1 {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f4543a = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final x31 m2887a(Context context) {
        x31 x31Var;
        LinkedHashMap linkedHashMap = f4543a;
        synchronized (linkedHashMap) {
            try {
                Object objM3461T = linkedHashMap.get(context);
                if (objM3461T == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    C0834vb c0834vbM2765e = o30.m2765e(-1, 6, null);
                    C0910x1 c0910x1 = new C0910x1(23, new a31(contentResolver, uriFor, new ne1(c0834vbM2765e, Handler.createAsync(Looper.getMainLooper())), c0834vbM2765e, context, null));
                    d51 d51Var = new d51(null);
                    C0436lm c0436lm = AbstractC0326io.f2592a;
                    objM3461T = rd0.m3461T(c0910x1, new C0286hk(pf1.m3034J(d51Var, ad0.f110a)), new v31(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objM3461T);
                }
                x31Var = (x31) objM3461T;
            } catch (Throwable th) {
                throw th;
            }
        }
        return x31Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final AbstractC0727si m2888b(View view) {
        Object tag = view.getTag(C0587R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC0727si) {
            return (AbstractC0727si) tag;
        }
        return null;
    }
}
