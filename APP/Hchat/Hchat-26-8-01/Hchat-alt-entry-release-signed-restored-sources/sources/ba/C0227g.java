package ba;

import de.robv.android.xposed.XposedBridge;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: ba.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0227g {

    /* JADX INFO: renamed from: a */
    public static final C0227g f563a = new C0227g();

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f564b = new AtomicInteger(27408);

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f565c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap.KeySetView f566d = ConcurrentHashMap.newKeySet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m921a(Class cls) {
        Object c3959f;
        if (f566d.add(cls)) {
            try {
                c3959f = XposedBridge.hookAllMethods(cls, "onActivityResult", new C0226f(this, 0));
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (C3960g.m8182b(c3959f) != null) {
                f566d.remove(cls);
            }
        }
    }
}
