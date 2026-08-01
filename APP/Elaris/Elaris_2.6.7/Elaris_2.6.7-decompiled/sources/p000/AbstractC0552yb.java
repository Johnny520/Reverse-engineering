package p000;

import android.view.View;
import android.widget.ImageView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yb */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0552yb {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f1106a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f1107b = new WeakHashMap();

    /* JADX INFO: renamed from: c */
    public static final WeakHashMap f1108c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public static final WeakHashMap f1109d = new WeakHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m1170a(View view) {
        Object obj;
        if (!(view instanceof ImageView)) {
            return null;
        }
        WeakHashMap weakHashMap = f1106a;
        synchronized (weakHashMap) {
            obj = weakHashMap.get((ImageView) view);
        }
        return obj;
    }
}
