package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: k9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0299k9 {

    /* JADX INFO: renamed from: a */
    public static final String[] f499a = {"com.tencent.mobileqq.troop.file.ui.TroopFileMainFragment", "com.tencent.mobileqq.troop.file.TroopFileMainFragment", "com.tencent.mobileqq.troop.filemanager.TroopFileMainFragment"};

    /* JADX INFO: renamed from: b */
    public static volatile boolean f500b;

    /* JADX INFO: renamed from: c */
    public static volatile long f501c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m737a(Class cls, String str, boolean z) {
        int i = 0;
        for (Method method : cls.getDeclaredMethods()) {
            if (str.equals(method.getName()) && method.getParameterTypes().length == 0) {
                try {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, new C0283j9(str, z));
                    i++;
                } catch (Throwable th) {
                    HookEntry.log("legacy group file page guard hook failed method=" + cls.getName() + "#" + str + ": " + th);
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static synchronized void m738b(ClassLoader classLoader) {
        try {
            if (!f500b && classLoader != null) {
                String[] strArr = f499a;
                int iM737a = 0;
                for (int i = 0; i < 3; i++) {
                    Class clsM1091j = AbstractC0497v4.m1091j(classLoader, strArr[i]);
                    if (clsM1091j != null) {
                        iM737a = iM737a + m737a(clsM1091j, "onResume", true) + m737a(clsM1091j, "onPause", false) + m737a(clsM1091j, "onDestroy", false);
                    }
                }
                if (iM737a > 0) {
                    f500b = true;
                    HookEntry.logAlways("legacy group file page guard installed count=" + iM737a);
                }
            }
        } finally {
        }
    }
}
