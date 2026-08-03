package p065eb;

import de.robv.android.xposed.XC_MethodHook;
import java.util.function.Consumer;

/* JADX INFO: renamed from: eb.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0890r extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f2761b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0890r(Consumer consumer, int i9) {
        this.f2760a = i9;
        this.f2761b = consumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f2760a) {
            case 0:
                methodHookParam.getClass();
                this.f2761b.accept(methodHookParam);
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f2760a) {
            case 1:
                methodHookParam.getClass();
                this.f2761b.accept(methodHookParam);
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
