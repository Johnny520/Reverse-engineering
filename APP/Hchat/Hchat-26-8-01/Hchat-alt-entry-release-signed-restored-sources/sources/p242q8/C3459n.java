package p242q8;

import android.app.Activity;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: q8.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3459n extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3460o f11224b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3459n(C3460o c3460o, int i9) {
        this.f11223a = i9;
        this.f11224b = c3460o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f11223a) {
            case 0:
                if (methodHookParam.thisObject instanceof Activity) {
                    this.f11224b.f11226b = new WeakReference((Activity) methodHookParam.thisObject);
                }
                break;
            default:
                Activity activityM7263a = this.f11224b.m7263a();
                if (activityM7263a != null && activityM7263a == methodHookParam.thisObject) {
                    this.f11224b.f11226b = new WeakReference(null);
                    break;
                }
                break;
        }
    }
}
