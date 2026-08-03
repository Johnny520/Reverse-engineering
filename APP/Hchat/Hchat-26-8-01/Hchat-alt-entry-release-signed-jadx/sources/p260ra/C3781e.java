package p260ra;

import android.app.Activity;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ra.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3781e extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12383a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3784h f12384b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3781e(C3784h c3784h, int i9) {
        this.f12383a = i9;
        this.f12384b = c3784h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f12383a) {
            case 0:
                C3784h.m7949a(this.f12384b, methodHookParam.thisObject, "initView", true);
                break;
            case 1:
                C3784h.m7949a(this.f12384b, methodHookParam.thisObject, "onCreate", false);
                break;
            case 2:
                C3784h.m7949a(this.f12384b, methodHookParam.thisObject, "onResume", true);
                break;
            case 3:
                C3784h.m7949a(this.f12384b, methodHookParam.thisObject, "onSceneEnd", true);
                break;
            case 4:
                Object obj = methodHookParam.thisObject;
                if (obj instanceof Activity) {
                    this.f12384b.f12404g.remove((Activity) obj);
                }
                break;
            case 5:
                Object obj2 = methodHookParam.thisObject;
                if (obj2 instanceof Activity) {
                    C3784h.m7950b(this.f12384b, (Activity) obj2);
                }
                break;
            default:
                Object obj3 = methodHookParam.thisObject;
                if (obj3 instanceof Activity) {
                    C3784h.m7950b(this.f12384b, (Activity) obj3);
                }
                break;
        }
    }
}
