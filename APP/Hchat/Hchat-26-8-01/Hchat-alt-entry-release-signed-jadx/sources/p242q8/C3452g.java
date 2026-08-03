package p242q8;

import de.robv.android.xposed.XC_MethodHook;
import java.util.HashSet;
import p080fb.AbstractC1184v0;

/* JADX INFO: renamed from: q8.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3452g extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f11190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f11191b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f11192c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3453h f11193d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3452g(C3453h c3453h, boolean z9, Class cls, Class cls2) {
        this.f11193d = c3453h;
        this.f11190a = z9;
        this.f11191b = cls;
        this.f11192c = cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Class cls;
        Class cls2 = this.f11192c;
        C3453h c3453h = this.f11193d;
        try {
            if (!this.f11190a || (cls = c3453h.f11196c.f2498t) == null || cls.isInstance(methodHookParam.thisObject)) {
                ((HashSet) methodHookParam.args[0]).add(this.f11191b);
                cls2.getClass();
            }
        } catch (Throwable th2) {
            AbstractC1184v0.m3204n("[Hchat:SettingsInjector] [Modern] superImportUIComponents 失败: " + cls2.getName() + ", " + th2.getMessage(), th2);
        }
    }
}
