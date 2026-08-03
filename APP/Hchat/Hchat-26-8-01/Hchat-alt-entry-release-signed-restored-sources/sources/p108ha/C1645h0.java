package p108ha;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import p010aa.C0039g;
import p064ea.C0850b;
import p080fb.AbstractC1184v0;
import p099h.Hchat.utils.KavaReflector;
import p258r8.AbstractC3736a;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: ha.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1645h0 extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public static final HashSet f5407e = new HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "remove_moments_ads";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("remove_moments_ads", "去除朋友圈广告", "阻止朋友圈广告信息解析和展示", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        Object c3959f;
        c3742g.getClass();
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        if (classLoader == null) {
            return;
        }
        String str = classLoader.getClass().getName() + "@" + System.identityHashCode(classLoader);
        HashSet hashSet = f5407e;
        synchronized (hashSet) {
            if (hashSet.contains(str)) {
                return;
            }
            Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.sns.storage.ADInfo", classLoader);
            if (clsLoadClass == null) {
                AbstractC1184v0.m3203m("[Hchat:MomentsAds] 未找到朋友圈广告信息类: com.tencent.mm.plugin.sns.storage.ADInfo");
                return;
            }
            Constructor<?> constructorFindConstructor = KavaReflector.findConstructor(clsLoadClass, String.class);
            if (constructorFindConstructor == null) {
                AbstractC1184v0.m3203m("[Hchat:MomentsAds] 未找到朋友圈广告信息构造方法: com.tencent.mm.plugin.sns.storage.ADInfo(String)");
                return;
            }
            try {
                C3744i.f12154b.m7763b(constructorFindConstructor, new C0850b(context, 3));
                c3959f = Boolean.valueOf(hashSet.add(str));
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC1184v0.m3204n("[Hchat:MomentsAds] Hook 朋友圈广告信息失败: " + thM8182b.getMessage(), thM8182b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "去除朋友圈广告";
    }
}
