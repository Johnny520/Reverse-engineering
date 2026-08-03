package p380z8;

import de.robv.android.xposed.XC_MethodHook;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: z8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6127c extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24691a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6128d f24692b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C6127c(C6128d c6128d, int i9) {
        this.f24691a = i9;
        this.f24692b = c6128d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f24691a) {
            case 1:
                methodHookParam.getClass();
                C6128d c6128d = this.f24692b;
                Integer num = (Integer) c6128d.f24697d.get();
                int iIntValue = (num != null ? num.intValue() : 1) - 1;
                if (iIntValue > 0) {
                    c6128d.f24697d.set(Integer.valueOf(iIntValue));
                } else {
                    c6128d.f24697d.remove();
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i9 = this.f24691a;
        methodHookParam.getClass();
        switch (i9) {
            case 0:
                if (AbstractC4302b.m8640c(this.f24692b.f24694a.f12143a, "Hchat_call_media_limit_config").getBoolean("call_media_limit_enable", false)) {
                    methodHookParam.setResult(Boolean.FALSE);
                    break;
                }
                break;
            default:
                C6128d c6128d = this.f24692b;
                Integer num = (Integer) c6128d.f24697d.get();
                c6128d.f24697d.set(Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                break;
        }
    }
}
