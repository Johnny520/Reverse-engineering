package p048d8;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import p099h.Hchat.ModuleEntry;

/* JADX INFO: renamed from: d8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0738a implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2192g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ModuleEntry f2193h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f2194i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Context f2195j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ XC_LoadPackage.LoadPackageParam f2196k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0738a(ModuleEntry moduleEntry, XC_MethodHook.MethodHookParam methodHookParam, Context context, XC_LoadPackage.LoadPackageParam loadPackageParam, int i9) {
        this.f2192g = i9;
        this.f2193h = moduleEntry;
        this.f2194i = methodHookParam;
        this.f2195j = context;
        this.f2196k = loadPackageParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2192g) {
            case 0:
                this.f2193h.lambda$installHotUpdateForAttach$1(this.f2194i, this.f2195j, this.f2196k);
                break;
            default:
                this.f2193h.lambda$installHotUpdateForAttach$2(this.f2194i, this.f2195j, this.f2196k);
                break;
        }
    }
}
