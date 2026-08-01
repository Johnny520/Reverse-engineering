package p000;

import android.app.Activity;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.util.HashMap;

/* JADX INFO: renamed from: d */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0174d {

    /* JADX INFO: renamed from: a */
    public static final HashMap f179a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static boolean f180b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static synchronized int m337a(int i, InterfaceC0032c interfaceC0032c) {
        if (i <= 0) {
            return -1;
        }
        f179a.put(Integer.valueOf(i), interfaceC0032c);
        if (f180b) {
            return 0;
        }
        try {
            XposedBridge.hookAllMethods(Activity.class, "onActivityResult", new C0016b(41));
            f180b = true;
            HookEntry.log("shared Activity.onActivityResult router installed");
            return 1;
        } catch (Throwable th) {
            AbstractC0198e7.m343a("activity-result", "install", th);
            return -1;
        }
    }
}
