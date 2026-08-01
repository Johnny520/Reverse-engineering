package p000;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kc1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f3078a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new WeakHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1788a(View view, gd1 gd1Var) {
        view.setWindowInsetsAnimationCallback(gd1Var != null ? new hd1(gd1Var) : null);
    }
}
