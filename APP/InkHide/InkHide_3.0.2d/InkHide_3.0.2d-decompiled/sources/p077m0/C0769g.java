package p077m0;

import android.app.Activity;
import de.robv.android.xposed.XC_MethodHook;
import p003B0.AbstractC0056b;

/* JADX INFO: renamed from: m0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0769g extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2587a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.lu.wxmask.SelfHook.handleDebugHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, com.lu.wxmask.SelfHook.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void] */
    public /* synthetic */ C0769g(int i2) {
        this.f2587a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f2587a) {
            case 1:
                Activity activity = (Activity) methodHookParam.thisObject;
                activity.findViewById(AbstractC0056b.m103a("action_bar")).setOnClickListener(new ViewOnClickListenerC0770h(0, activity));
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f2587a) {
            case 0:
                methodHookParam.setResult(Boolean.TRUE);
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
