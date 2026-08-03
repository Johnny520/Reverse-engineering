package p242q8;

import de.robv.android.xposed.XC_MethodHook;
import p025bc.AbstractC0255e;
import p099h.Hchat.utils.KavaReflector;

/* JADX INFO: renamed from: q8.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3450e extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Class f11179a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f11180b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f11181c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3453h f11182d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3450e(C3453h c3453h, Class cls, Class cls2, Class cls3) {
        super(10000);
        this.f11182d = c3453h;
        this.f11179a = cls;
        this.f11180b = cls2;
        this.f11181c = cls3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            Object result = methodHookParam.getResult();
            Class clsM7237g = C3453h.m7237g(this.f11182d, result, 0, this.f11179a);
            Class clsM7237g2 = C3453h.m7237g(this.f11182d, result, 1, this.f11180b);
            if (clsM7237g2 == this.f11181c) {
                return;
            }
            this.f11182d.f11201h = clsM7237g;
            this.f11182d.f11202i = clsM7237g2;
            clsM7237g2.getClass();
            methodHookParam.setResult(KavaReflector.newInstance(KavaReflector.findConstructor(this.f11182d.f11196c.f2491m, Class.class, Class.class), clsM7237g, this.f11181c));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:SettingsInjector] [Modern] SettingLocation 构造失败: "), th2);
        }
    }
}
