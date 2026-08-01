package p315vd;

import android.app.Activity;
import java.util.Map;
import md.AbstractC5161p;

/* JADX INFO: renamed from: vd.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8921a {
    /* JADX INFO: renamed from: a */
    public static Activity m34259a() {
        try {
            Map map = (Map) AbstractC5161p.getObjectField(AbstractC5161p.callStaticMethod(AbstractC5161p.findClass("android.app.ActivityThread", AbstractC8921a.class.getClassLoader()), "currentActivityThread", new Object[0]), "mActivities");
            if (map == null) {
                return null;
            }
            for (Object obj : map.values()) {
                if (!AbstractC5161p.getBooleanField(obj, "paused")) {
                    return (Activity) AbstractC5161p.getObjectField(obj, "activity");
                }
            }
            return null;
        } catch (Exception e10) {
            AbstractC8924d.m34264d("ContextUtils", "getActivity error", e10);
            return null;
        }
    }
}
