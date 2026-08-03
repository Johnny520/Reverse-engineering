package p316v9;

import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import p304uf.C4330d;

/* JADX INFO: renamed from: v9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4539a extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4330d f14981b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Method f14982c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4539a(C4330d c4330d, Method method, int i9) {
        this.f14980a = i9;
        this.f14981b = c4330d;
        this.f14982c = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i9 = this.f14980a;
        methodHookParam.getClass();
        switch (i9) {
            case 0:
                methodHookParam.setResult(C4330d.m8751a(this.f14981b, this.f14982c));
                break;
            case 1:
                methodHookParam.setResult(C4330d.m8751a(this.f14981b, this.f14982c));
                break;
            case 2:
                methodHookParam.setResult(C4330d.m8751a(this.f14981b, this.f14982c));
                break;
            default:
                methodHookParam.setResult(C4330d.m8751a(this.f14981b, this.f14982c));
                break;
        }
    }
}
