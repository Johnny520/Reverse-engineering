package p332wb;

import de.robv.android.xposed.XposedBridge;
import java.util.HashSet;
import java.util.Set;
import p080fb.AbstractC1184v0;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: wb.zo */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5545zo {

    /* JADX INFO: renamed from: a */
    public static final C5545zo f22524a = new C5545zo();

    /* JADX INFO: renamed from: b */
    public static final HashSet f22525b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static C5481xo f22526c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m9964a(Class cls) {
        Object c3959f;
        try {
            if (f22525b.contains(cls)) {
                return;
            }
            try {
                c3959f = XposedBridge.hookAllMethods(cls, "onActivityResult", new C5513yo(this, 0));
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (!(c3959f instanceof C3959f)) {
                Set set = (Set) c3959f;
                set.getClass();
                if (!set.isEmpty()) {
                    f22525b.add(cls);
                }
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC1184v0.m3204n("[Hchat:FakeLocation] 地图选点结果 Hook 安装失败: ".concat(cls.getName()), thM8182b);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
